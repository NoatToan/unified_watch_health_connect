package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class jbf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cycleAutoSuspendSwitch")
    private String f38338b;

    public boolean a() {
        return "1".equals(this.f38338b);
    }

    public void d(boolean z) {
        if (z) {
            this.f38338b = "1";
        } else {
            this.f38338b = "0";
        }
    }
}
