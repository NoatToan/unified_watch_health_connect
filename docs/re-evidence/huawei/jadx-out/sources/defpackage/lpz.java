package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lpz extends lpr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("appInfos")
    private List<lpq> f40619b;

    public List<lpq> b() {
        return this.f40619b;
    }

    @Override // defpackage.lpr
    public String toString() {
        return "ThirdAuthPermissionRsp{appInfos=" + this.f40619b + '}';
    }
}
