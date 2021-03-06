package fluxedCrystals.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * LightCollector - Drullkus Created using Tabula 4.1.1
 */
public class LightRedirectionCube extends ModelBase {
	public ModelRenderer Frame1;
	public ModelRenderer Frame2;
	public ModelRenderer Frame3;
	public ModelRenderer Frame4;
	public ModelRenderer Frame1_1;
	public ModelRenderer Frame2_1;
	public ModelRenderer Frame3_1;
	public ModelRenderer Frame4_1;
	public ModelRenderer Frame1_2;
	public ModelRenderer Frame2_2;
	public ModelRenderer Frame3_2;
	public ModelRenderer Frame4_2;
	public ModelRenderer Vert1;
	public ModelRenderer Vert2;
	public ModelRenderer Vert1_1;
	public ModelRenderer Vert2_1;
	public ModelRenderer Vert1_2;
	public ModelRenderer Vert2_2;
	public ModelRenderer Vert1_3;
	public ModelRenderer Vert2_3;
	public ModelRenderer Vert1_4;
	public ModelRenderer Vert2_4;
	public ModelRenderer Vert1_5;
	public ModelRenderer Vert2_5;
	public ModelRenderer Hort1;
	public ModelRenderer Hort2;
	public ModelRenderer Hort1_1;
	public ModelRenderer Hort2_1;
	public ModelRenderer Hort1_2;
	public ModelRenderer Hort2_2;
	public ModelRenderer Hort1_3;
	public ModelRenderer Hort2_3;
	public ModelRenderer Hort1_4;
	public ModelRenderer Hort2_4;
	public ModelRenderer Hort1_5;
	public ModelRenderer Hort2_5;
	public ModelRenderer Beam1;
	public ModelRenderer Beam2;
	public ModelRenderer Beam3;
	public ModelRenderer Beam4;
	public ModelRenderer Lens1;
	public ModelRenderer Lens2;
	public ModelRenderer Lens3;
	public ModelRenderer Lens4;
	public ModelRenderer Lens5;
	public ModelRenderer Lens6;

	public LightRedirectionCube() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Vert1_1 = new ModelRenderer(this, 0, 27);
		this.Vert1_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert1_1.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert1_1, 0.0F, 1.5707963267948966F, 0.0F);
		this.Vert2_2 = new ModelRenderer(this, 0, 27);
		this.Vert2_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert2_2.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert2_2, 0.0F, 3.141592653589793F, 0.0F);
		this.Frame3_1 = new ModelRenderer(this, 0, 11);
		this.Frame3_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame3_1.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame3_1, 0.0F, 3.141592653589793F, 1.5707963267948966F);
		this.Frame1_2 = new ModelRenderer(this, 0, 11);
		this.Frame1_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame1_2.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame1_2, 1.5707963267948966F, 0.0F, 0.0F);
		this.Vert1 = new ModelRenderer(this, 0, 27);
		this.Vert1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert1.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.Lens4 = new ModelRenderer(this, 0, 46);
		this.Lens4.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Lens4.addBox(-8.0F, 11.0F, -8.0F, 16, 2, 16, 0.0F);
		this.setRotateAngle(Lens4, 1.5707963267948966F, 3.141592653589793F, -1.5707963267948966F);
		this.Beam3 = new ModelRenderer(this, 25, 0);
		this.Beam3.setRotationPoint(0.0F, 4.6F, 0.0F);
		this.Beam3.addBox(-0.5F, 0.0F, 6.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Beam3, -0.4118977034706618F, 2.356194490192345F, 0.0F);
		this.Frame4 = new ModelRenderer(this, 0, 9);
		this.Frame4.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame4.addBox(6.0F, -8.0F, 6.0F, 2, 16, 2, 0.0F);
		this.setRotateAngle(Frame4, 0.0F, -1.5707963267948966F, 0.0F);
		this.Vert2_5 = new ModelRenderer(this, 0, 27);
		this.Vert2_5.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert2_5.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert2_5, 1.5707963267948966F, 0.0F, 0.0F);
		this.Hort1_3 = new ModelRenderer(this, 0, 27);
		this.Hort1_3.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort1_3.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort1_3, 1.5707963267948966F, 0.0F, 1.5707963267948966F);
		this.Lens1 = new ModelRenderer(this, 0, 46);
		this.Lens1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Lens1.addBox(-8.0F, 11.0F, -8.0F, 16, 2, 16, 0.0F);
		this.setRotateAngle(Lens1, 0.0F, -1.5707963267948966F, 0.0F);
		this.Vert1_3 = new ModelRenderer(this, 0, 27);
		this.Vert1_3.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert1_3.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert1_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.Hort1_2 = new ModelRenderer(this, 0, 27);
		this.Hort1_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort1_2.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort1_2, 0.0F, -1.5707963267948966F, 1.5707963267948966F);
		this.Frame1_1 = new ModelRenderer(this, 0, 11);
		this.Frame1_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame1_1.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame1_1, 0.0F, 0.0F, 1.5707963267948966F);
		this.Vert1_2 = new ModelRenderer(this, 0, 27);
		this.Vert1_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert1_2.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert1_2, 0.0F, 3.141592653589793F, 0.0F);
		this.Beam2 = new ModelRenderer(this, 25, 0);
		this.Beam2.setRotationPoint(0.0F, 4.6F, 0.0F);
		this.Beam2.addBox(-0.5F, 0.0F, -11.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Beam2, 0.4118977034706618F, 0.7853981633974483F, 0.0F);
		this.Frame2_2 = new ModelRenderer(this, 0, 11);
		this.Frame2_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame2_2.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame2_2, 1.5707963267948966F, 3.141592653589793F, 0.0F);
		this.Hort2_1 = new ModelRenderer(this, 6, 27);
		this.Hort2_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort2_1.addBox(-4.5F, -4.0F, -9.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(Hort2_1, 0.0F, 1.5707963267948966F, 1.5707963267948966F);
		this.Hort2_5 = new ModelRenderer(this, 0, 27);
		this.Hort2_5.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort2_5.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort2_5, -1.5707963267948966F, 0.0F, 1.5707963267948966F);
		this.Hort2 = new ModelRenderer(this, 0, 27);
		this.Hort2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort2.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort2, 0.0F, 0.0F, 1.5707963267948966F);
		this.Vert2_4 = new ModelRenderer(this, 6, 27);
		this.Vert2_4.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert2_4.addBox(-4.5F, -4.0F, -9.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(Vert2_4, -1.5707963267948966F, 0.0F, 0.0F);
		this.Beam4 = new ModelRenderer(this, 25, 0);
		this.Beam4.setRotationPoint(0.0F, 4.6F, 0.0F);
		this.Beam4.addBox(-0.5F, 0.0F, 6.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Beam4, -0.4118977034706618F, -0.7853981633974483F, 0.0F);
		this.Frame3_2 = new ModelRenderer(this, 0, 11);
		this.Frame3_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame3_2.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame3_2, -1.5707963267948966F, 0.0F, 0.0F);
		this.Hort1_1 = new ModelRenderer(this, 6, 27);
		this.Hort1_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort1_1.addBox(3.5F, -4.0F, -9.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(Hort1_1, 0.0F, 1.5707963267948966F, 1.5707963267948966F);
		this.Frame2 = new ModelRenderer(this, 0, 9);
		this.Frame2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame2.addBox(6.0F, -8.0F, 6.0F, 2, 16, 2, 0.0F);
		this.setRotateAngle(Frame2, 0.0F, 1.5707963267948966F, 0.0F);
		this.Vert1_4 = new ModelRenderer(this, 6, 27);
		this.Vert1_4.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert1_4.addBox(3.5F, -4.0F, -9.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(Vert1_4, -1.5707963267948966F, 0.0F, 0.0F);
		this.Vert1_5 = new ModelRenderer(this, 0, 27);
		this.Vert1_5.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert1_5.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert1_5, 1.5707963267948966F, 0.0F, 0.0F);
		this.Frame2_1 = new ModelRenderer(this, 0, 11);
		this.Frame2_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame2_1.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame2_1, 0.0F, 1.5707963267948966F, 1.5707963267948966F);
		this.Lens3 = new ModelRenderer(this, 0, 46);
		this.Lens3.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Lens3.addBox(-8.0F, 11.0F, -8.0F, 16, 2, 16, 0.0F);
		this.setRotateAngle(Lens3, -1.5707963267948966F, 3.141592653589793F, -1.5707963267948966F);
		this.Hort1_4 = new ModelRenderer(this, 0, 27);
		this.Hort1_4.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort1_4.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort1_4, 3.141592653589793F, 0.0F, 1.5707963267948966F);
		this.Frame4_2 = new ModelRenderer(this, 0, 11);
		this.Frame4_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame4_2.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame4_2, -1.5707963267948966F, 3.141592653589793F, 0.0F);
		this.Lens5 = new ModelRenderer(this, 0, 46);
		this.Lens5.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Lens5.addBox(-8.0F, 11.0F, -8.0F, 16, 2, 16, 0.0F);
		this.setRotateAngle(Lens5, 0.0F, 3.141592653589793F, -1.5707963267948966F);
		this.Frame4_1 = new ModelRenderer(this, 0, 11);
		this.Frame4_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame4_1.addBox(6.0F, -6.0F, 6.0F, 2, 12, 2, 0.0F);
		this.setRotateAngle(Frame4_1, 0.0F, -1.5707963267948966F, 1.5707963267948966F);
		this.Frame3 = new ModelRenderer(this, 0, 9);
		this.Frame3.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame3.addBox(6.0F, -8.0F, 6.0F, 2, 16, 2, 0.0F);
		this.setRotateAngle(Frame3, 0.0F, 3.141592653589793F, 0.0F);
		this.Hort2_3 = new ModelRenderer(this, 0, 27);
		this.Hort2_3.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort2_3.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort2_3, 1.5707963267948966F, 0.0F, 1.5707963267948966F);
		this.Beam1 = new ModelRenderer(this, 25, 0);
		this.Beam1.setRotationPoint(0.0F, 4.6F, 0.0F);
		this.Beam1.addBox(-0.5F, 0.0F, 6.0F, 1, 2, 5, 0.0F);
		this.setRotateAngle(Beam1, -0.4118977034706618F, 0.7853981633974483F, 0.0F);
		this.Frame1 = new ModelRenderer(this, 0, 9);
		this.Frame1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Frame1.addBox(6.0F, -8.0F, 6.0F, 2, 16, 2, 0.0F);
		this.Hort2_4 = new ModelRenderer(this, 0, 27);
		this.Hort2_4.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort2_4.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort2_4, 3.141592653589793F, 0.0F, 1.5707963267948966F);
		this.Vert2 = new ModelRenderer(this, 0, 27);
		this.Vert2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert2.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.Hort1_5 = new ModelRenderer(this, 0, 27);
		this.Hort1_5.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort1_5.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort1_5, -1.5707963267948966F, 0.0F, 1.5707963267948966F);
		this.Lens6 = new ModelRenderer(this, 0, 46);
		this.Lens6.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Lens6.addBox(-8.0F, 11.0F, -8.0F, 16, 2, 16, 0.0F);
		this.setRotateAngle(Lens6, 0.0F, 0.0F, 1.5707963267948966F);
		this.Hort1 = new ModelRenderer(this, 0, 27);
		this.Hort1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort1.addBox(3.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort1, 0.0F, 0.0F, 1.5707963267948966F);
		this.Vert2_1 = new ModelRenderer(this, 0, 27);
		this.Vert2_1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert2_1.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert2_1, 0.0F, 1.5707963267948966F, 0.0F);
		this.Vert2_3 = new ModelRenderer(this, 0, 27);
		this.Vert2_3.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Vert2_3.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Vert2_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.Lens2 = new ModelRenderer(this, 0, 46);
		this.Lens2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Lens2.addBox(-8.0F, 15.0F, -8.0F, 16, 2, 16, 0.0F);
		this.setRotateAngle(Lens2, 0.0F, 1.5707963267948966F, 3.141592653589793F);
		this.Hort2_2 = new ModelRenderer(this, 0, 27);
		this.Hort2_2.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.Hort2_2.addBox(-4.5F, -6.0F, -7.0F, 1, 12, 2, 0.0F);
		this.setRotateAngle(Hort2_2, 0.0F, -1.5707963267948966F, 1.5707963267948966F);
	}

	public void render(float f5) {
		render(null, 0, 0, 0, 0, 0, f5);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.Vert1_1.render(f5);
		this.Vert2_2.render(f5);
		this.Frame3_1.render(f5);
		this.Frame1_2.render(f5);
		this.Vert1.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Lens4.offsetX, this.Lens4.offsetY, this.Lens4.offsetZ);
		GL11.glTranslatef(this.Lens4.rotationPointX * f5, this.Lens4.rotationPointY * f5, this.Lens4.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Lens4.offsetX, -this.Lens4.offsetY, -this.Lens4.offsetZ);
		GL11.glTranslatef(-this.Lens4.rotationPointX * f5, -this.Lens4.rotationPointY * f5, -this.Lens4.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		this.Lens4.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		this.Beam3.render(f5);
		this.Frame4.render(f5);
		this.Vert2_5.render(f5);
		this.Hort1_3.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Lens1.offsetX, this.Lens1.offsetY, this.Lens1.offsetZ);
		GL11.glTranslatef(this.Lens1.rotationPointX * f5, this.Lens1.rotationPointY * f5, this.Lens1.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Lens1.offsetX, -this.Lens1.offsetY, -this.Lens1.offsetZ);
		GL11.glTranslatef(-this.Lens1.rotationPointX * f5, -this.Lens1.rotationPointY * f5, -this.Lens1.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		this.Lens1.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		this.Vert1_3.render(f5);
		this.Hort1_2.render(f5);
		this.Frame1_1.render(f5);
		this.Vert1_2.render(f5);
		this.Beam2.render(f5);
		this.Frame2_2.render(f5);
		this.Hort2_1.render(f5);
		this.Hort2_5.render(f5);
		this.Hort2.render(f5);
		this.Vert2_4.render(f5);
		this.Beam4.render(f5);
		this.Frame3_2.render(f5);
		this.Hort1_1.render(f5);
		this.Frame2.render(f5);
		this.Vert1_4.render(f5);
		this.Vert1_5.render(f5);
		this.Frame2_1.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Lens3.offsetX, this.Lens3.offsetY, this.Lens3.offsetZ);
		GL11.glTranslatef(this.Lens3.rotationPointX * f5, this.Lens3.rotationPointY * f5, this.Lens3.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Lens3.offsetX, -this.Lens3.offsetY, -this.Lens3.offsetZ);
		GL11.glTranslatef(-this.Lens3.rotationPointX * f5, -this.Lens3.rotationPointY * f5, -this.Lens3.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		this.Lens3.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		this.Hort1_4.render(f5);
		this.Frame4_2.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Lens5.offsetX, this.Lens5.offsetY, this.Lens5.offsetZ);
		GL11.glTranslatef(this.Lens5.rotationPointX * f5, this.Lens5.rotationPointY * f5, this.Lens5.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Lens5.offsetX, -this.Lens5.offsetY, -this.Lens5.offsetZ);
		GL11.glTranslatef(-this.Lens5.rotationPointX * f5, -this.Lens5.rotationPointY * f5, -this.Lens5.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		this.Lens5.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		this.Frame4_1.render(f5);
		this.Frame3.render(f5);
		this.Hort2_3.render(f5);
		this.Beam1.render(f5);
		this.Frame1.render(f5);
		this.Hort2_4.render(f5);
		this.Vert2.render(f5);
		this.Hort1_5.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Lens6.offsetX, this.Lens6.offsetY, this.Lens6.offsetZ);
		GL11.glTranslatef(this.Lens6.rotationPointX * f5, this.Lens6.rotationPointY * f5, this.Lens6.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Lens6.offsetX, -this.Lens6.offsetY, -this.Lens6.offsetZ);
		GL11.glTranslatef(-this.Lens6.rotationPointX * f5, -this.Lens6.rotationPointY * f5, -this.Lens6.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		this.Lens6.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		this.Hort1.render(f5);
		this.Vert2_1.render(f5);
		this.Vert2_3.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.Lens2.offsetX, this.Lens2.offsetY, this.Lens2.offsetZ);
		GL11.glTranslatef(this.Lens2.rotationPointX * f5, this.Lens2.rotationPointY * f5, this.Lens2.rotationPointZ * f5);
		GL11.glScaled(0.5D, 0.5D, 0.5D);
		GL11.glTranslatef(-this.Lens2.offsetX, -this.Lens2.offsetY, -this.Lens2.offsetZ);
		GL11.glTranslatef(-this.Lens2.rotationPointX * f5, -this.Lens2.rotationPointY * f5, -this.Lens2.rotationPointZ * f5);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		this.Lens2.render(f5);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		this.Hort2_2.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}