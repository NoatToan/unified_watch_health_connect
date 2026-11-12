package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.operation.jsoperation.JsUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lhr extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(JsUtil.DATA_LIST)
    private List<lhx> f40168c;

    @SerializedName("currentVersion")
    private long d;

    public List<lhx> a() {
        return this.f40168c;
    }

    public long c() {
        return this.d;
    }
}
