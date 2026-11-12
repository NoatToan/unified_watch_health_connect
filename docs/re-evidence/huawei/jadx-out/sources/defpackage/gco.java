package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.trackprocess.model.GpsPoint;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class gco implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("rd")
    private GpsPoint f34902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TtmlNode.CENTER)
    private GpsPoint f34903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lu")
    private GpsPoint f34904c;

    @SerializedName("height")
    private double d;

    @SerializedName("ld")
    private GpsPoint e;

    @SerializedName("ru")
    private GpsPoint f;

    @SerializedName("width")
    private double g;

    @SerializedName("rotationAngle")
    private double j;

    public double e() {
        return this.g;
    }

    public double d() {
        return this.j;
    }

    public GpsPoint a() {
        return this.f34903b;
    }

    public String toString() {
        return "DrawBoard{width=" + this.g + ", height=" + this.d + ", rotationAngle=" + this.j + ", center=" + this.f34903b + ", leftUp=" + this.f34904c + ", leftBottom=" + this.e + ", rightUp=" + this.f + ", rightBottom=" + this.f34902a + '}';
    }
}
