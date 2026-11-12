package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.featuregroup.constants.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cuo implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("onlineDevices")
    private List<DeviceInfo> f31312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("groupId")
    private String f31313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    private double f31314c;

    @SerializedName("activityId")
    private String d;

    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    private double e;

    @SerializedName("syncDevice")
    private DeviceInfo g;

    @SerializedName("status")
    private int h;

    public void b(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f31313b = str;
    }

    public void e(int i) {
        this.h = i;
    }

    public void e(List<DeviceInfo> list) {
        this.f31312a = list;
    }

    public void c(double d) {
        this.e = d;
    }

    public void e(double d) {
        this.f31314c = d;
    }

    public void e(DeviceInfo deviceInfo) {
        this.g = deviceInfo;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("activityUrl") + "/activity/v2/group/uploadUserLocShareInfo";
    }
}
