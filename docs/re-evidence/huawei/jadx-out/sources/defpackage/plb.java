package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class plb extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("stickerList")
    private List<gyi> f45581b;

    @SerializedName("totalCount")
    private int e;

    public List<gyi> d() {
        return this.f45581b;
    }

    public int a() {
        return this.e;
    }
}
