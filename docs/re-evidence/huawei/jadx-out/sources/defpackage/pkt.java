package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pkt extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("recommendedTpls")
    private List<gya> f45564a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("backgroundImages")
    private List<gyc> f45565c;

    @SerializedName("stickers")
    private List<gym> d;

    @SerializedName("dataWatermarks")
    private List<gyj> e;

    public List<gyc> b() {
        return this.f45565c;
    }

    public List<gya> a() {
        return this.f45564a;
    }

    public List<gyj> e() {
        return this.e;
    }

    public List<gym> d() {
        return this.d;
    }
}
