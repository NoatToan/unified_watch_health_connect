package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class gcx extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cityInfoMap")
    private Map<String, List<HotPathCityInfo>> f34912c = new HashMap();

    public Map<String, List<HotPathCityInfo>> d() {
        return this.f34912c;
    }
}
