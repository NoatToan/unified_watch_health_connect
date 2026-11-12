package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.model.HealthTrendReport;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kyb extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("healthTrendReports")
    private List<HealthTrendReport> f39614c;

    public List<HealthTrendReport> c() {
        return this.f39614c;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "HealthTrendResponse{resultCode=" + getResultCode() + ", resultDesc='" + getResultDesc() + "', healthTrendReports=" + this.f39614c + "}";
    }
}
