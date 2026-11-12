package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("healthLifeConf")
    private List<qes> f46068a;

    public void c(List<qes> list) {
        this.f46068a = list;
    }

    public String toString() {
        return "MetaDataReq{healthLifeConf=" + this.f46068a + '}';
    }
}
