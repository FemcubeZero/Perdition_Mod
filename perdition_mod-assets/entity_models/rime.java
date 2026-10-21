// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class rime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "rime"), "main");
	private final ModelPart head;
	private final ModelPart rodgroup1;
	private final ModelPart rod1;
	private final ModelPart rod2;
	private final ModelPart rod3;
	private final ModelPart rodgroup2;
	private final ModelPart rod4;
	private final ModelPart rod5;
	private final ModelPart rod6;
	private final ModelPart rod7;
	private final ModelPart rodgroup3;
	private final ModelPart rod8;
	private final ModelPart rod9;

	public rime(ModelPart root) {
		this.head = root.getChild("head");
		this.rodgroup1 = root.getChild("rodgroup1");
		this.rod1 = this.rodgroup1.getChild("rod1");
		this.rod2 = this.rodgroup1.getChild("rod2");
		this.rod3 = this.rodgroup1.getChild("rod3");
		this.rodgroup2 = root.getChild("rodgroup2");
		this.rod4 = this.rodgroup2.getChild("rod4");
		this.rod5 = this.rodgroup2.getChild("rod5");
		this.rod6 = this.rodgroup2.getChild("rod6");
		this.rod7 = this.rodgroup2.getChild("rod7");
		this.rodgroup3 = root.getChild("rodgroup3");
		this.rod8 = this.rodgroup3.getChild("rod8");
		this.rod9 = this.rodgroup3.getChild("rod9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition rodgroup1 = partdefinition.addOrReplaceChild("rodgroup1", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition rod1 = rodgroup1.addOrReplaceChild("rod1", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 2.0F, 0.0873F, -0.6109F, 0.0F));

		PartDefinition rod2 = rodgroup1.addOrReplaceChild("rod2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.0F, 2.0F, 0.0873F, 0.6109F, 0.0F));

		PartDefinition rod3 = rodgroup1.addOrReplaceChild("rod3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rodgroup2 = partdefinition.addOrReplaceChild("rodgroup2", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition rod4 = rodgroup2.addOrReplaceChild("rod4", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition rod5 = rodgroup2.addOrReplaceChild("rod5", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition rod6 = rodgroup2.addOrReplaceChild("rod6", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rod7 = rodgroup2.addOrReplaceChild("rod7", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 6.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition rodgroup3 = partdefinition.addOrReplaceChild("rodgroup3", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition rod8 = rodgroup3.addOrReplaceChild("rod8", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -4.0F, 0.0F));

		PartDefinition rod9 = rodgroup3.addOrReplaceChild("rod9", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -4.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rodgroup1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rodgroup2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rodgroup3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}