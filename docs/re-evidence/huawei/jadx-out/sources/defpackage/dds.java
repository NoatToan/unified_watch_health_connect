package defpackage;

import com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.medal.model.TrackData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class dds implements AchieveDeviceApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveDeviceApi f31677a;

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final dds f31678c = new dds();
    }

    private dds() {
        try {
            Object objNewInstance = Class.forName("prd").newInstance();
            if (!(objNewInstance instanceof AchieveDeviceApi)) {
                LogUtil.j("PLGACHIEVE_AchieveDeviceProxy", "init AchieveDeviceProxy no");
            } else {
                this.f31677a = (AchieveDeviceApi) objNewInstance;
                LogUtil.a("PLGACHIEVE_AchieveDeviceProxy", "init AchieveDeviceProxy ok");
            }
        } catch (ClassNotFoundException unused) {
            LogUtil.e("PLGACHIEVE_AchieveDeviceProxy", "ClassNotFoundException");
        } catch (Exception unused2) {
            LogUtil.e("PLGACHIEVE_AchieveDeviceProxy", "Exception");
        }
    }

    public static dds e() {
        return d.f31678c;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void pingDevice(String str) {
        AchieveDeviceApi achieveDeviceApi = this.f31677a;
        if (achieveDeviceApi != null) {
            achieveDeviceApi.pingDevice(str);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void syncInit() {
        AchieveDeviceApi achieveDeviceApi = this.f31677a;
        if (achieveDeviceApi != null) {
            achieveDeviceApi.syncInit();
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void sendMessageToDevice(int i) {
        AchieveDeviceApi achieveDeviceApi = this.f31677a;
        if (achieveDeviceApi != null) {
            achieveDeviceApi.sendMessageToDevice(i);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void sendMessageToDevice(int i, String str, String str2, BaseResponseCallback<Boolean> baseResponseCallback) {
        AchieveDeviceApi achieveDeviceApi = this.f31677a;
        if (achieveDeviceApi != null) {
            achieveDeviceApi.sendMessageToDevice(i, str, str2, baseResponseCallback);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void sendMessageToDeviceForPackage(int i) {
        AchieveDeviceApi achieveDeviceApi = this.f31677a;
        if (achieveDeviceApi != null) {
            achieveDeviceApi.sendMessageToDeviceForPackage(i);
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void dealAchieveTrackData(ArrayList<TrackData> arrayList) {
        AchieveDeviceApi achieveDeviceApi = this.f31677a;
        if (achieveDeviceApi != null) {
            achieveDeviceApi.dealAchieveTrackData(arrayList);
        }
    }
}
