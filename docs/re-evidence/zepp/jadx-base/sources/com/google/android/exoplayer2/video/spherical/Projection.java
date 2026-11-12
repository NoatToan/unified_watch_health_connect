package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
final class Projection {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 2;
    public static final int i = 3;
    public final Mesh a;
    public final Mesh b;
    public final int c;
    public final boolean d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] a;

        public Mesh(SubMesh... subMeshes) {
            this.a = subMeshes;
        }

        public SubMesh getSubMesh(int index) {
            return this.a[index];
        }

        public int getSubMeshCount() {
            return this.a.length;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int textureId, float[] vertices, float[] textureCoords, int mode) {
            this.textureId = textureId;
            Assertions.checkArgument(((long) vertices.length) * 2 == ((long) textureCoords.length) * 3);
            this.vertices = vertices;
            this.textureCoords = textureCoords;
            this.mode = mode;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int stereoMode) {
        this(mesh, mesh, stereoMode);
    }

    public static Projection a(float radius, int latitudes, int longitudes, float verticalFovDegrees, float horizontalFovDegrees, int stereoMode) {
        int i2;
        int i3;
        int i4;
        float[] fArr;
        int i5 = latitudes;
        int i6 = longitudes;
        Assertions.checkArgument(radius > 0.0f);
        Assertions.checkArgument(i5 >= 1);
        Assertions.checkArgument(i6 >= 1);
        Assertions.checkArgument(verticalFovDegrees > 0.0f && verticalFovDegrees <= 180.0f);
        Assertions.checkArgument(horizontalFovDegrees > 0.0f && horizontalFovDegrees <= 360.0f);
        float radians = (float) Math.toRadians(verticalFovDegrees);
        float radians2 = (float) Math.toRadians(horizontalFovDegrees);
        float f2 = radians / i5;
        float f3 = radians2 / i6;
        int i7 = i6 + 1;
        int i8 = ((i7 * 2) + 2) * i5;
        float[] fArr2 = new float[i8 * 3];
        float[] fArr3 = new float[i8 * 2];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i5) {
            float f4 = radians / 2.0f;
            float f5 = (i9 * f2) - f4;
            int i12 = i9 + 1;
            float f6 = (i12 * f2) - f4;
            int i13 = 0;
            while (i13 < i7) {
                float f7 = f5;
                int i14 = i12;
                int i15 = 0;
                while (i15 < 2) {
                    float f8 = i13 * f3;
                    float f9 = f3;
                    int i16 = i10 + 1;
                    int i17 = i13;
                    double d = radius;
                    float f10 = f2;
                    int i18 = i15;
                    double d2 = (f8 + 3.1415927f) - (radians2 / 2.0f);
                    double d3 = i15 == 0 ? f7 : f6;
                    float[] fArr4 = fArr3;
                    float f11 = f6;
                    fArr2[i10] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i19 = i16 + 1;
                    int i20 = i9;
                    fArr2[i16] = (float) (d * Math.sin(d3));
                    int i21 = i19 + 1;
                    fArr2[i19] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i22 = i11 + 1;
                    fArr4[i11] = f8 / radians2;
                    int i23 = i22 + 1;
                    fArr4[i22] = ((i20 + i18) * f10) / radians;
                    if (i17 == 0 && i18 == 0) {
                        i2 = longitudes;
                        i3 = i17;
                        i4 = i18;
                    } else {
                        i2 = longitudes;
                        i3 = i17;
                        i4 = i18;
                        if (i3 != i2 || i4 != 1) {
                            fArr = fArr4;
                        }
                        i11 = i23;
                        i10 = i21;
                        i15 = i4 + 1;
                        i6 = i2;
                        i13 = i3;
                        fArr3 = fArr;
                        i9 = i20;
                        i7 = i7;
                        f3 = f9;
                        f2 = f10;
                        f6 = f11;
                    }
                    System.arraycopy(fArr2, i21 - 3, fArr2, i21, 3);
                    i21 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i23 - 2, fArr, i23, 2);
                    i23 += 2;
                    i11 = i23;
                    i10 = i21;
                    i15 = i4 + 1;
                    i6 = i2;
                    i13 = i3;
                    fArr3 = fArr;
                    i9 = i20;
                    i7 = i7;
                    f3 = f9;
                    f2 = f10;
                    f6 = f11;
                }
                float f12 = f2;
                int i24 = i13;
                int i25 = i6;
                int i26 = i24 + 1;
                f5 = f7;
                i12 = i14;
                i7 = i7;
                f3 = f3;
                f2 = f12;
                f6 = f6;
                i6 = i25;
                i13 = i26;
            }
            i5 = latitudes;
            i9 = i12;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr2, fArr3, 1)), stereoMode);
    }

    public static Projection b(int stereoMode) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, stereoMode);
    }

    public Projection(Mesh leftMesh, Mesh rightMesh, int stereoMode) {
        this.a = leftMesh;
        this.b = rightMesh;
        this.c = stereoMode;
        this.d = leftMesh == rightMesh;
    }
}
