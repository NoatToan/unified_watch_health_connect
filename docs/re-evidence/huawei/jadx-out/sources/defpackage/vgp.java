package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class vgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isAppEnabled")
    private boolean f51074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("currentFastingLiteMode")
    private vhc f51075b;

    @SerializedName("isNotifyEnabled")
    private boolean d;

    @SerializedName("isPrivacyAccepted")
    private boolean e;

    public boolean c() {
        return this.f51074a;
    }

    public void c(boolean z) {
        this.f51074a = z;
    }

    public vhc d() {
        return this.f51075b;
    }

    public boolean e() {
        return this.d;
    }

    public String toString() {
        return "FastingLiteAppSetting{isAppEnabled=" + this.f51074a + ", currentFastingLiteMode=" + this.f51075b + ", isPrivacyAccepted=" + this.e + ", isNotifyEnabled=" + this.d + '}';
    }
}
