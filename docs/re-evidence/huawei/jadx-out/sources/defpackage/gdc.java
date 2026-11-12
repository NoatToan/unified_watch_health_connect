package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class gdc extends CloudCommonReponse {

    @SerializedName("cityInfo")
    private HotPathCityInfo d;

    @SerializedName("countryId")
    private String e;

    public HotPathCityInfo a() {
        return this.d;
    }

    public HotPathCityInfo e() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuilder sb = new StringBuilder("GetCityInfoWithGpsRsp{cityInfo=");
        HotPathCityInfo hotPathCityInfo = this.d;
        sb.append(hotPathCityInfo == null ? Constants.NULL : hotPathCityInfo.toString());
        sb.append('}');
        return sb.toString();
    }
}
