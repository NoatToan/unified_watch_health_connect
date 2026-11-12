package defpackage;

import android.graphics.Paint;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class qoq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endY")
    private float f46573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("centerX")
    private float f46574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f46575c;

    @SerializedName("centerY")
    private float d;

    @SerializedName("endX")
    private float e;

    @SerializedName("startX")
    private float f;

    @SerializedName("pathData")
    private String i;

    @SerializedName("startY")
    private float j;

    public float b() {
        return this.f46574b;
    }

    public float d() {
        return this.d;
    }

    public String c() {
        return this.i;
    }

    public float h() {
        return this.f;
    }

    public float f() {
        return this.j;
    }

    public float a() {
        return this.f46573a;
    }

    public Paint e() {
        return this.f46575c;
    }

    public void e(Paint paint) {
        this.f46575c = paint;
    }
}
