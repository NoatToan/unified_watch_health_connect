package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vnw extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dataList")
    private List<vny> f51385a;

    public List<vny> a() {
        return this.f51385a;
    }
}
