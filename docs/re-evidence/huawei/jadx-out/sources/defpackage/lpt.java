package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lpt extends lpr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("healthScopes")
    private String f40611b;

    @Override // defpackage.lpr
    public String toString() {
        return "getScopeRsp{healthScopes='" + this.f40611b + "'}";
    }

    public String d() {
        return this.f40611b;
    }
}
