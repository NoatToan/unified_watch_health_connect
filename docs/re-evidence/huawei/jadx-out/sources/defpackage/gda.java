package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gda extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cityInfos")
    private List<HotPathCityInfo> f34916b = new ArrayList();

    public List<HotPathCityInfo> e() {
        return this.f34916b;
    }
}
