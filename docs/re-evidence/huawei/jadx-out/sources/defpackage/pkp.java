package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes42.dex */
public class pkp extends CloudCommonReponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(BleConstants.SPORT_TYPE)
    private int f45555a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("continueDay")
    private int f45556c;

    public int d() {
        return this.f45556c;
    }

    public int e() {
        return this.f45555a;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "GetContinuesSportDayRsp{continueDay=" + this.f45556c + ", sportType=" + this.f45555a + "} " + super.toString();
    }
}
