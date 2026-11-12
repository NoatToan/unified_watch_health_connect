package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.watchface.mvp.model.webview.JsNetwork;

/* JADX INFO: loaded from: classes42.dex */
public class pft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("headPictureURL")
    private String f45292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(JsNetwork.NetworkType.MOBILE)
    private String f45293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("huid")
    private long f45294c;

    @SerializedName(HealthZonePushReceiver.MEMBER_HUID)
    private Long d;

    @SerializedName("email")
    private String e;

    @SerializedName("nickname")
    private String g;

    @SerializedName("pushSubType")
    private int i;

    public void e(String str) {
        this.f45292a = str;
    }

    public void c(Long l) {
        this.d = l;
    }

    public void c(String str) {
        this.f45293b = str;
    }

    public void d(String str) {
        this.e = str;
    }

    public void b(int i) {
        this.i = i;
    }

    public void b(long j) {
        this.f45294c = j;
    }

    public void a(String str) {
        this.g = str;
    }
}
