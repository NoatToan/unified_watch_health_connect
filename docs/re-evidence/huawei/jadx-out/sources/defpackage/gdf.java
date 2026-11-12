package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes7.dex */
public class gdf extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("history")
    private gdq f34923b;

    public gdq b() {
        return this.f34923b;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "GetHotPathParticipateInfoRsp{" + super.toString() + ", HotPathParticipateHistory='" + this.f34923b + "'}";
    }
}
