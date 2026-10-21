// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class entity-ice_cube<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "entity-ice_cube"), "main");
	private final ModelPart cube;
	private final ModelPart inner_cube;
	private final ModelPart face;

	public entity-ice_cube(ModelPart root) {
		this.cube = root.getChild("cube");
		this.inner_cube = this.cube.getChild("inner_cube");
		this.face = this.cube.getChild("face");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cube = partdefinition.addOrReplaceChild("cube", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition inner_cube = cube.addOrReplaceChild("inner_cube", CubeListBuilder.create().texOffs(0, 32).addBox(-6.5F, -6.5F, -6.5F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition face = cube.addOrReplaceChild("face", CubeListBuilder.create().texOffs(48, 0).addBox(-8.0F, -8.0F, -0.01F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, -7.99F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}