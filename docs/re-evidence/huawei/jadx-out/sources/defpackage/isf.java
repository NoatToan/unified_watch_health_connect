package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.vip.datatypes.TransferBenefitInfo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class isf extends CloudCommonReponse {

    @SerializedName("transferBenefitList")
    private List<TransferBenefitInfo> e;

    public List<TransferBenefitInfo> b() {
        return this.e;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "TransferBenefitsRsp{transferBenefitList=" + this.e + '}';
    }
}
