package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class inr extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("totalCount")
    private int f37874a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("userLabelConfig")
    private List<inz> f37875c;

    public List<inz> e() {
        return this.f37875c;
    }
}
