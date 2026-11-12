package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class muh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42421a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("compressionAlgorithm")
    private int f42422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bezierCurvePoint")
    private d f42423c;

    @SerializedName("cutout")
    private int d;

    @SerializedName("photoHeight")
    private int e;

    @SerializedName("startPointY")
    private int f;

    @SerializedName("roundedCutType")
    private int g;

    @SerializedName("photoWidth")
    private int h;

    @SerializedName("startPointX")
    private int i;

    @SerializedName("radius")
    private float[] j;

    @SerializedName("watchType")
    private int k;

    public int d() {
        return 1;
    }

    public int b() {
        return this.f42422b;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        return this.f;
    }

    public int j() {
        return this.h - (d() * 2);
    }

    public int e() {
        return this.e - (d() * 2);
    }

    public float[] i() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public int a() {
        return this.d;
    }

    public d c() {
        return this.f42423c;
    }

    public int f() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageProcessParameters{compressionAlgorithm=");
        sb.append(this.f42422b);
        sb.append(", startPointX=");
        sb.append(this.i);
        sb.append(", startPointY=");
        sb.append(this.f);
        sb.append(", photoWidth=");
        sb.append(this.h);
        sb.append(", photoHeight=");
        sb.append(this.e);
        sb.append(", radian=");
        float[] fArr = this.j;
        sb.append(fArr != null ? Arrays.toString(fArr) : "[]");
        sb.append(", watchType=");
        sb.append(this.k);
        sb.append(", cutout=");
        sb.append(this.d);
        sb.append(", roundedCutType=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("inPoint")
        private float[][] f42424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("outPoint")
        private float[][] f42425b;

        public float[][] a() {
            return this.f42424a;
        }

        public float[][] d() {
            return this.f42425b;
        }
    }
}
