package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.fitnessdatatype.ResultUtils;

/* JADX INFO: loaded from: classes27.dex */
public class dsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("heartRete")
    private int f32321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("offbodyValue")
    private int f32322c;
    private String d;
    private int e;
    private int h;

    public void c(String str) {
        this.d = (String) ResultUtils.commonFunc(str);
    }

    public void e(int i) {
        this.f32320a = ((Integer) ResultUtils.commonFunc(Integer.valueOf(i))).intValue();
    }

    public void c(int i) {
        this.f32322c = ((Integer) ResultUtils.commonFunc(Integer.valueOf(i))).intValue();
    }

    public void d(int i) {
        this.f32321b = ((Integer) ResultUtils.commonFunc(Integer.valueOf(i))).intValue();
    }

    public void a(int i) {
        this.e = ((Integer) ResultUtils.commonFunc(Integer.valueOf(i))).intValue();
    }

    public void b(int i) {
        this.h = ((Integer) ResultUtils.commonFunc(Integer.valueOf(i))).intValue();
    }

    public String toString() {
        return "PostureResult{postureId='" + this.d + "', completion=" + this.f32320a + ", offBodyValue=" + this.f32322c + ", heartRate=" + this.f32321b + ", calorie=" + this.e + ", userTime=" + this.h + '}';
    }
}
