package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
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

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public static Projection createEquirectangular(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5;
        float[] fArr;
        int i6;
        float f4 = f;
        int i7 = i;
        int i8 = i2;
        Assertions.checkArgument(f4 > 0.0f);
        Assertions.checkArgument(i7 >= 1);
        Assertions.checkArgument(i8 >= 1);
        Assertions.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        Assertions.checkArgument(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i7;
        float f6 = radians2 / i8;
        int i9 = i8 + 1;
        int i10 = ((i9 * 2) + 2) * i7;
        float[] fArr2 = new float[i10 * 3];
        float[] fArr3 = new float[i10 * 2];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i7) {
            float f7 = radians / 2.0f;
            float f8 = (i11 * f5) - f7;
            int i14 = i11 + 1;
            float f9 = i14;
            int i15 = 0;
            while (i15 < i9) {
                float f10 = f8;
                int i16 = i14;
                int i17 = 0;
                int i18 = 2;
                while (i17 < i18) {
                    float f11 = i17 == 0 ? f10 : (f9 * f5) - f7;
                    int i19 = i9;
                    float f12 = i15 * f6;
                    int i20 = i15;
                    double d = f4;
                    float f13 = f5;
                    float f14 = f6;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i21 = i17;
                    double d3 = f11;
                    float[] fArr4 = fArr3;
                    float f15 = f9;
                    fArr2[i13] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    int i22 = i11;
                    int i23 = i12;
                    fArr2[i13 + 1] = (float) (d * Math.sin(d3));
                    int i24 = i13 + 3;
                    fArr2[i13 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i23] = f12 / radians2;
                    i12 = i23 + 2;
                    fArr4[i23 + 1] = ((i22 + i21) * f13) / radians;
                    if (i20 == 0 && i21 == 0) {
                        i4 = i2;
                        i5 = i20;
                    } else {
                        i4 = i2;
                        i5 = i20;
                        if (i5 != i4 || i21 != 1) {
                            fArr = fArr4;
                            i6 = 2;
                            i13 = i24;
                        }
                        fArr3 = fArr;
                        i18 = i6;
                        i11 = i22;
                        i9 = i19;
                        f5 = f13;
                        f6 = f14;
                        f9 = f15;
                        i17 = i21 + 1;
                        f4 = f;
                        int i25 = i5;
                        i8 = i4;
                        i15 = i25;
                    }
                    System.arraycopy(fArr2, i13, fArr2, i24, 3);
                    i13 += 6;
                    fArr = fArr4;
                    i6 = 2;
                    System.arraycopy(fArr, i23, fArr, i12, 2);
                    i12 = i23 + 4;
                    fArr3 = fArr;
                    i18 = i6;
                    i11 = i22;
                    i9 = i19;
                    f5 = f13;
                    f6 = f14;
                    f9 = f15;
                    i17 = i21 + 1;
                    f4 = f;
                    int i26 = i5;
                    i8 = i4;
                    i15 = i26;
                }
                f8 = f10;
                i8 = i8;
                i14 = i16;
                f5 = f5;
                f6 = f6;
                f9 = f9;
                i15++;
                f4 = f;
            }
            f4 = f;
            i7 = i;
            i11 = i14;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr2, fArr3, 1)), i3);
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i2) {
            this.textureId = i;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i2;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }
    }
}
