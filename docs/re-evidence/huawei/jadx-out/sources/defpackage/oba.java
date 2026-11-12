package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes12.dex */
public class oba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.MEDAL_ID)
    private String f44027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("gainTime")
    private long f44028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("action")
    private int f44029c;

    @SerializedName(ParsedFieldTag.LIGHT_DESC)
    private String d;

    @SerializedName("deepLinkUrl")
    private String e;

    @SerializedName("state")
    private int f;

    @SerializedName("support3D")
    private int g;

    @SerializedName("medalName")
    private String h;

    @SerializedName("session")
    private String i;

    @SerializedName("message")
    private String j;

    @SerializedName(HwPayConstant.KEY_USER_NAME)
    private String l;

    @SerializedName("supportDeeplinkUrl")
    private int m;

    public void g(String str) {
        this.i = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(long j) {
        this.f44028b = j;
    }

    public void c(String str) {
        this.f44027a = str;
    }

    public void b(String str) {
        this.h = str;
    }

    public void e(String str) {
        this.j = str;
    }

    public void d(int i) {
        this.m = i;
    }

    public void d(String str) {
        this.e = str;
    }

    public void b(int i) {
        this.g = i;
    }

    public void c(int i) {
        this.f = i;
    }

    public void e(int i) {
        this.f44029c = i;
    }

    public void f(String str) {
        this.l = str;
    }
}
