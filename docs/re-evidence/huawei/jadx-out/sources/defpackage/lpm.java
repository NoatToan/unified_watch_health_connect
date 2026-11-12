package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("passedScopes")
    private String f40600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("betaScopes")
    private String f40601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("latestAuditStatus")
    private int f40602c;

    public String toString() {
        return "AppAuditInfo{latestAuditStatus=" + this.f40602c + ", passedScopes='" + this.f40600a + "', betaScopes='" + this.f40601b + "'}";
    }
}
