package defpackage;

import android.os.Build;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwidauth.datatype.DeviceInfo;

/* JADX INFO: loaded from: classes43.dex */
public class vok {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("appID")
    private String f51411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("channel")
    private String f51412c;

    @SerializedName(DeviceInfo.TAG_DEVICE_ID)
    private String d;

    @SerializedName("accessToken")
    private String e;

    @SerializedName("fromPkg")
    private String g;

    @SerializedName(CommonUtil.PARAM_PUSH_TOKEN)
    private String j;

    @SerializedName("serviceToken")
    private String m;

    @SerializedName(HwPayConstant.KEY_USER_ID)
    private long n;

    @SerializedName("deviceType")
    private int f = 0;

    @SerializedName("phoneType")
    private String i = vov.b();

    @SerializedName("romVersion")
    private String h = Build.DISPLAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("appVersion")
    private String f51410a = String.valueOf(vos.a());

    public vok(String str, String str2, String str3, String str4) {
        this.f51411b = str;
        this.f51412c = str3;
        this.j = str2;
        this.g = str4;
    }

    public long g() {
        return this.n;
    }

    public void e(long j) {
        this.n = j;
    }

    public String i() {
        return this.i;
    }

    public String h() {
        return this.h;
    }

    public String f() {
        return this.g;
    }

    public String e() {
        return this.f51410a;
    }

    public int c() {
        return this.f;
    }

    public String a() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String b() {
        return this.f51411b;
    }

    public final void b(String str) {
        this.e = str;
    }

    public String d() {
        return this.f51412c;
    }

    public String toString() {
        return "{deviceType=" + c() + ", userID=" + g() + ", deviceID=" + a() + ", appID=" + b() + ", channel=" + d() + ", phoneType=" + i() + ", romVersion=" + h() + ", appVersion='" + e() + ", fromPkg=" + f() + '}';
    }
}
