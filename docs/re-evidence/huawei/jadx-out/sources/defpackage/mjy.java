package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager;
import com.huawei.hwdevice.phoneprocess.util.DeviceSettingSubscription;
import com.huawei.hwdevicemgr.framework.INoitifyPhoneServiceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private INoitifyPhoneServiceCallback f41774a;

    private mjy() {
        this.f41774a = null;
        LogUtil.a("PhoneService_ProcessInfoRequest", "create ProcessInfoRequest");
    }

    public static mjy b() {
        return d.f41775a;
    }

    public boolean b(String str, DeviceInfo deviceInfo, int i, String str2, Context context) {
        LogUtil.a("PhoneService_ProcessInfoRequest", "enter notifyPhoneService. module: ", str, ", deviceInfo: ", deviceInfo, ", message: ", str2);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PhoneService_ProcessInfoRequest", "deviceInfo or module is invalid.");
            return false;
        }
        if ("syncBasicData".equals(str)) {
            mpg.d().a(true, deviceInfo, (IBaseResponseCallback) null);
        }
        if ("syncWorkOutData".equals(str)) {
            HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
        }
        if ("syncCalendarSwitch".equals(str)) {
            mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, i);
        }
        if ("seizeDevice".equals(str)) {
            mxr.e().e(deviceInfo, str2);
            return true;
        }
        if ("deleteDevice".equals(str)) {
            neo.b(context).c(str2, deviceInfo);
            return true;
        }
        if ("earphoneManager".equals(str)) {
            mvv.d().d(deviceInfo, str2);
        }
        if ("earphoneLogPre".equals(str)) {
            mnd.c().c(str2, deviceInfo);
            return true;
        }
        if ("privacySwitch".equals(str)) {
            ncx.e().b(deviceInfo, str2);
            return true;
        }
        if ("featureManager".equals(str)) {
            mru.e().d(str2);
            return true;
        }
        if ("stressRelaxManager".equals(str)) {
            mxz.d().e();
            return true;
        }
        if ("syncPeriodRri".equals(str)) {
            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
            return true;
        }
        if ("oobeCreated".equals(str)) {
            return a(deviceInfo);
        }
        if ("syncSpo2AlarmData".equals(str)) {
            ReleaseLogUtil.d("BTSYNC_PhoneService_ProcessInfoRequest", "startSyncLowSpo2Alarm");
            myt.e().b(deviceInfo);
            return true;
        }
        if ("syncHeartRateAlarmData".equals(str)) {
            ReleaseLogUtil.d("BTSYNC_PhoneService_ProcessInfoRequest", "startSyncHeartRateAlarm");
            myv.b().d(deviceInfo);
            return true;
        }
        if ("reverseLinkage".equals(str)) {
            ReleaseLogUtil.d("BTSYNC_PhoneService_ProcessInfoRequest", "sendSampleEventToDevice");
            nau.c().b(deviceInfo, i);
            return true;
        }
        if ("reverseLinkageReply".equals(str)) {
            ReleaseLogUtil.d("BTSYNC_PhoneService_ProcessInfoRequest", "replySampleEventToDevice");
            nau.c().b(deviceInfo, i, str2);
            return true;
        }
        if ("startAllReconnect".equals(str)) {
            cno.a().e(4);
            return true;
        }
        if ("notify_device_setting_changer".equals(str)) {
            DeviceSettingSubscription.d().f(deviceInfo, str2, mim.d(str2));
            return true;
        }
        if ("dic_sync".equals(str)) {
            return mvo.b().d(deviceInfo, str2);
        }
        if ("notify_account_verify_finish".equals(str)) {
            return e(deviceInfo, str2);
        }
        if (i == 230227) {
            try {
                Object objInvoke = HwDevicePeriodRriFileManager.getInstance().getClass().getDeclaredMethod(str, new Class[0]).invoke(HwDevicePeriodRriFileManager.getInstance(), new Object[0]);
                return (objInvoke instanceof Boolean) && ((Boolean) objInvoke).booleanValue();
            } catch (NoSuchMethodException e) {
                LogUtil.j("PhoneService_ProcessInfoRequest", "method exception = ", e.getMessage());
            } catch (Exception e2) {
                LogUtil.j("PhoneService_ProcessInfoRequest", "rri exception = ", e2.getMessage());
            }
        }
        return true;
    }

    private boolean e(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null) {
            LogUtil.j("PhoneService_ProcessInfoRequest", "accountVerify deviceInfo is null");
            return false;
        }
        VariableHandshakeGeneralCommandBase variableHandshakeGeneralCommandBaseE = mky.b().e(deviceInfo.getDeviceIdentify());
        if (!(variableHandshakeGeneralCommandBaseE instanceof mkw)) {
            LogUtil.j("PhoneService_ProcessInfoRequest", "accountVerify Command is not instanceof SendAccountToDeviceCommand");
            return false;
        }
        ((mkw) variableHandshakeGeneralCommandBaseE).c(str);
        return true;
    }

    private boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("PhoneService_ProcessInfoRequest", "notifyPhoneService deviceInfo is null");
            return false;
        }
        VariableHandshakeGeneralCommandBase variableHandshakeGeneralCommandBaseE = mky.b().e(deviceInfo.getDeviceIdentify());
        if (!(variableHandshakeGeneralCommandBaseE instanceof mkz)) {
            LogUtil.j("PhoneService_ProcessInfoRequest", "Command is not instanceof StartupGuideUserSettingCommand");
            return false;
        }
        mkz mkzVar = (mkz) variableHandshakeGeneralCommandBaseE;
        mkzVar.c(true);
        mkzVar.c();
        return true;
    }

    public INoitifyPhoneServiceCallback e(String str) {
        LogUtil.j("PhoneService_ProcessInfoRequest", "getCallback put: ", str);
        return this.f41774a;
    }

    public void c(String str, INoitifyPhoneServiceCallback iNoitifyPhoneServiceCallback) {
        LogUtil.j("PhoneService_ProcessInfoRequest", "registerCallback put: ", str);
        this.f41774a = iNoitifyPhoneServiceCallback;
    }

    public void c(String str) {
        LogUtil.j("PhoneService_ProcessInfoRequest", "unregisterCallback remove: ", str);
        this.f41774a = null;
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static mjy f41775a = new mjy();
    }
}
