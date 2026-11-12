package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.track.post.process.callback.CloudTrackCallback;
import com.huawei.health.track.post.process.callback.TrackProcessCallback;
import com.huawei.health.trackprocess.api.TrackPostProcessApi;
import com.huawei.health.trackprocess.callback.PluginCloudTrackCallback;
import com.huawei.health.trackprocess.callback.PluginTrackMapCallback;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.utils.NspClient;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackprocess.TrackProcess;
import com.huawei.hwfoundationmodel.trackprocess.TrajectoryPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.up.utils.NSPException;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
@ApiDefine(uri = TrackPostProcessApi.class)
@Singleton
public class iky implements TrackPostProcessApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f37758a = Build.VERSION.SDK_INT;
    private ilf e;

    @Override // com.huawei.health.trackprocess.api.TrackPostProcessApi
    public int getPostProcessingTrack(String str, String str2, boolean z, IBaseResponseCallback iBaseResponseCallback, String str3) {
        boolean zA = a();
        ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "getPostProcessingTrack");
        LogUtil.a("TrackPostProcessImpl", "isSupportGpsFile:", Boolean.valueOf(zA));
        return a(LogConfig.o() + "/tracktest/" + str, LogConfig.o() + "/tracktest/" + str2, zA, iBaseResponseCallback, z, str3);
    }

    private int a(String str, String str2, boolean z, IBaseResponseCallback iBaseResponseCallback, boolean z2, String str3) {
        ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "getOptimizedTrack enter");
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("BTSYNC_TrackPostProcessImpl", "getOptimizedTrack callback is null");
            return -1;
        }
        if (f37758a > 24 && Process.is64Bit()) {
            ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "sdk version is more than version N");
            ilf ilfVarB = ilf.b();
            this.e = ilfVarB;
            if (ilfVarB.isPluginAvaiable()) {
                ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "PluginLocationProxy is available");
                return c(str, str2, z, iBaseResponseCallback, z2, str3);
            }
            ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "mPluginLocationProxy is not available,load plugin");
            this.e.loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: ild
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return iky.e(context, intent);
                }
            });
        }
        return a(str, str2, z, iBaseResponseCallback, z2);
    }

    static /* synthetic */ boolean e(Context context, Intent intent) {
        ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "PluginLocationProxy loadPlugin success");
        return false;
    }

    private int c(String str, String str2, boolean z, final IBaseResponseCallback iBaseResponseCallback, boolean z2, String str3) {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainHealthCloudCommon");
        boolean zContains = str2.contains("mobile_phone");
        DeviceInfo deviceInfoD = !zContains ? d() : null;
        if (!TextUtils.isEmpty(url) && ((deviceInfoD != null && !TextUtils.isEmpty(deviceInfoD.getDeviceName())) || zContains)) {
            this.e.setExtraData(CompileParameterUtil.d("IS_DEBUG_VERSION"), CommonUtil.ap(), BaseApplication.getContext(), url + "/commonAbility/configCenter/getConfigInfo");
            PluginTrackMapCallback pluginTrackMapCallback = new PluginTrackMapCallback() { // from class: iky.4
                @Override // com.huawei.health.trackprocess.callback.PluginTrackMapCallback
                public void onResponse(int i, Map<Long, double[]> map, Map<Integer, Integer> map2) {
                    ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "runNewOptimizedTrack errorCode:", Integer.valueOf(i));
                    if (i == 0) {
                        iBaseResponseCallback.a(10000, new iln(map, map2));
                    } else {
                        LogUtil.j("TrackPostProcessImpl", "getWorkOutDetailFromDevice() callback error :", map);
                        iBaseResponseCallback.a(10001, "so calculate error");
                    }
                }
            };
            c(null, true);
            String deviceName = deviceInfoD != null ? deviceInfoD.getDeviceName() : Build.BRAND;
            LogUtil.a("TrackPostProcessImpl", "deviceName:", deviceName, " isFromPhone ", Boolean.valueOf(zContains));
            int optimizedTrack = this.e.getOptimizedTrack(str, str2, z, pluginTrackMapCallback, z2, deviceName, str3);
            LogUtil.a("TrackPostProcessImpl", "runNewOptimizedTrack result ", Integer.valueOf(optimizedTrack));
            if (optimizedTrack == 0) {
                ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "use new lib");
                return optimizedTrack;
            }
        }
        return a(str, str2, z, iBaseResponseCallback, z2);
    }

    private int a(String str, String str2, boolean z, IBaseResponseCallback iBaseResponseCallback, boolean z2) {
        ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "use old lib");
        TrackProcess trackProcess = new TrackProcess();
        c(trackProcess, false);
        int optimizedTrack = trackProcess.getOptimizedTrack(str, str2, e(str, str2, z, iBaseResponseCallback, z2));
        ReleaseLogUtil.d("BTSYNC_TrackPostProcessImpl", "old optimizedTrack: ", Integer.valueOf(optimizedTrack));
        return optimizedTrack;
    }

    private DeviceInfo d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "TrackPostProcessImpl");
        if (!njy.e(deviceList)) {
            return deviceList.get(0);
        }
        LogUtil.a("TrackPostProcessImpl", "deviceInfo is empty");
        return null;
    }

    private TrackProcessCallback e(final String str, final String str2, final boolean z, final IBaseResponseCallback iBaseResponseCallback, final boolean z2) {
        return new TrackProcessCallback() { // from class: ilc
            @Override // com.huawei.health.track.post.process.callback.TrackProcessCallback
            public final void onResponse(int i, ArrayList arrayList) {
                this.f37767c.b(z, str, str2, z2, iBaseResponseCallback, i, arrayList);
            }
        };
    }

    /* synthetic */ void b(boolean z, String str, String str2, boolean z2, IBaseResponseCallback iBaseResponseCallback, int i, ArrayList arrayList) {
        LogUtil.a(a.t, 0, "TrackPostProcessImpl", "errorCode :", Integer.valueOf(i), "is beta version :", Boolean.valueOf(CommonUtil.ap()), "isSupportGpsFileEnabled :", Boolean.valueOf(z));
        if (!CompileParameterUtil.d("IS_DEBUG_VERSION") && (!CommonUtil.ap() || !z)) {
            File file = new File(str);
            if (file.exists()) {
                LogUtil.a(a.t, 0, "TrackPostProcessImpl", "delete result :", Boolean.valueOf(file.delete()));
            } else {
                ReleaseLogUtil.e("BTSYNC_TrackPostProcessImpl", "gpsFile is not exists");
            }
            File file2 = new File(str2);
            if (file2.exists()) {
                LogUtil.a(a.t, 0, "TrackPostProcessImpl", "delete result :", Boolean.valueOf(file2.delete()));
            } else {
                ReleaseLogUtil.e("BTSYNC_TrackPostProcessImpl", "pdrFile is not exists");
            }
        }
        if (i == 0) {
            iBaseResponseCallback.a(10000, new iln(a(arrayList, z2), null));
        } else {
            LogUtil.j("TrackPostProcessImpl", "getWorkOutDetailFromDevice() callback error :", arrayList);
            iBaseResponseCallback.a(10001, "so calucate error");
        }
    }

    private void c(final TrackProcess trackProcess, final boolean z) {
        LogUtil.a("TrackPostProcessImpl", "getCloudTrack enter");
        if (z) {
            this.e.getCloudTrack(new PluginCloudTrackCallback() { // from class: ila
                @Override // com.huawei.health.trackprocess.callback.PluginCloudTrackCallback
                public final void onResponse(int i, Object obj) {
                    this.f37761a.c(trackProcess, z, i, obj);
                }
            });
        } else {
            trackProcess.getCloudTrack(new CloudTrackCallback() { // from class: ilb
                @Override // com.huawei.health.track.post.process.callback.CloudTrackCallback
                public final void onResponse(int i, Object obj) {
                    this.e.d(trackProcess, z, i, obj);
                }
            });
        }
    }

    /* synthetic */ void c(TrackProcess trackProcess, boolean z, int i, Object obj) {
        LogUtil.a("TrackPostProcessImpl", "new getCloudTrack onResponse");
        if (obj instanceof Map) {
            e(trackProcess, z, (Map) obj);
        } else {
            LogUtil.a("TrackPostProcessImpl", "objectData type is not correct");
        }
    }

    /* synthetic */ void d(TrackProcess trackProcess, boolean z, int i, Object obj) {
        LogUtil.a("TrackPostProcessImpl", "old getCloudTrack onResponse");
        if (obj instanceof Map) {
            e(trackProcess, z, (Map) obj);
        } else {
            LogUtil.a("TrackPostProcessImpl", "objectData type is not correct");
        }
    }

    private <T extends Map<String, Object>> void e(TrackProcess trackProcess, boolean z, T t) {
        if (t != null) {
            try {
                String strCall = new NspClient(BaseApplication.getContext()).call("/dataAnalyse/app/getMotionPathInGeoHash", t, 30, 30, 2);
                ilm ilmVar = (ilm) new Gson().fromJson(strCall, ilm.class);
                if (ilmVar == null || ilmVar.a() != 0) {
                    LogUtil.j("TrackPostProcessImpl", "getCloudTrack json:", strCall);
                    return;
                }
                List<ilg> listC = ilmVar.c();
                LogUtil.a("TrackPostProcessImpl", "getCloudTrack motionPathInfoList size:", !njy.e(listC) ? Integer.valueOf(listC.size()) : "0");
                if (z) {
                    this.e.postMotionPath(listC);
                } else {
                    trackProcess.postMotionPath(listC);
                }
            } catch (JsonSyntaxException | NSPException e) {
                LogUtil.e("TrackPostProcessImpl", "dealCloudData exception:", ExceptionUtils.c(e), ", json:", null);
            }
        }
    }

    private Map<Long, double[]> a(ArrayList<TrajectoryPoint> arrayList, boolean z) {
        HashMap map = new HashMap(16);
        LogUtil.a(a.t, 0, "TrackPostProcessImpl", "getWorkoutDetailFromDevice() size1 is :", Integer.valueOf(arrayList.size()));
        for (int i = 0; i < arrayList.size(); i++) {
            double[] dArr = new double[4];
            dArr[0] = arrayList.get(i).getLatitude();
            dArr[1] = arrayList.get(i).getLongitude();
            if (z) {
                dArr[2] = arrayList.get(i).getAltitude();
            } else {
                dArr[2] = 0.0d;
            }
            dArr[3] = arrayList.get(i).getUtc_time();
            map.put(Long.valueOf(i), dArr);
        }
        return map;
    }

    private boolean a() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("gps_files_switch_screen");
        if (userPreference == null) {
            LogUtil.a("TrackPostProcessImpl", "isSupportGpsFile preference is null");
            return d(HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.wear_common_setting"));
        }
        return "1".equals(userPreference.getValue());
    }

    private boolean d(HiUserPreference hiUserPreference) {
        if (hiUserPreference != null && !TextUtils.isEmpty(hiUserPreference.getValue())) {
            String value = hiUserPreference.getValue();
            LogUtil.a("TrackPostProcessImpl", "value:", value);
            String strSubstring = value.substring(1, value.length() - 1);
            for (String str : strSubstring.split(",")) {
                if ("gps_files_switch_screen".equals(str.split("=")[0].trim())) {
                    strSubstring = str.split("=")[1];
                }
            }
            LogUtil.a("TrackPostProcessImpl", "GPS file enabled :", strSubstring);
            return "1".equals(strSubstring);
        }
        e();
        return true;
    }

    private void e() {
        LogUtil.a("TrackPostProcessImpl", "setDefaultGpsFileValue enter");
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("gps_files_switch_screen", "1"), false);
    }
}
