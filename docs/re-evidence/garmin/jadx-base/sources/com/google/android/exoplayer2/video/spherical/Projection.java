package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;
import i3.e5;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i14) {
            return this.subMeshes[i14];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i14, float[] fArr, float[] fArr2, int i15) {
            this.textureId = i14;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i15;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i14) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i14;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f14, int i14, int i15, float f15, float f16, int i16) {
        int i17;
        int i18 = i14;
        Assertions.checkArgument(f14 > 0.0f);
        Assertions.checkArgument(i18 >= 1);
        Assertions.checkArgument(i15 >= 1);
        Assertions.checkArgument(f15 > 0.0f && f15 <= 180.0f);
        Assertions.checkArgument(f16 > 0.0f && f16 <= 360.0f);
        float radians = (float) Math.toRadians(f15);
        float radians2 = (float) Math.toRadians(f16);
        float f17 = radians / i18;
        float f18 = radians2 / i15;
        int i19 = i15 + 1;
        int iC = e5.c(i19, 2, 2, i18);
        float[] fArr = new float[iC * 3];
        float[] fArr2 = new float[iC * 2];
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i24 < i18) {
            float f19 = radians / 2.0f;
            float f22 = (i24 * f17) - f19;
            int i27 = i24 + 1;
            float f24 = (i27 * f17) - f19;
            int i28 = 0;
            while (i28 < i19) {
                float f25 = radians;
                float f26 = radians2;
                int i29 = 0;
                int i30 = 2;
                while (i29 < i30) {
                    float f27 = f17;
                    float f28 = i28 * f18;
                    float f29 = f18;
                    float f34 = f22;
                    double d14 = f14;
                    double d15 = (f28 + 3.1415927f) - (f26 / 2.0f);
                    double d16 = i29 == 0 ? f22 : f24;
                    fArr[i25] = -((float) (Math.cos(d16) * Math.sin(d15) * d14));
                    fArr[i25 + 1] = (float) (Math.sin(d16) * d14);
                    int i34 = i25 + 3;
                    fArr[i25 + 2] = (float) (Math.cos(d16) * Math.cos(d15) * d14);
                    fArr2[i26] = f28 / f26;
                    int i35 = i26 + 2;
                    fArr2[i26 + 1] = ((i24 + i29) * f27) / f25;
                    if ((i28 == 0 && i29 == 0) || (i28 == i15 && i29 == 1)) {
                        System.arraycopy(fArr, i25, fArr, i34, 3);
                        i25 += 6;
                        i17 = 2;
                        System.arraycopy(fArr2, i26, fArr2, i35, 2);
                        i26 += 4;
                    } else {
                        i17 = 2;
                        i25 = i34;
                        i26 = i35;
                    }
                    i29++;
                    i30 = i17;
                    f17 = f27;
                    f18 = f29;
                    f22 = f34;
                }
                i28++;
                radians2 = f26;
                radians = f25;
                f17 = f17;
            }
            i18 = i14;
            i24 = i27;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i16);
    }

    public Projection(Mesh mesh, int i14) {
        this(mesh, mesh, i14);
    }

    public static Projection createEquirectangular(int i14) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i14);
    }
}
