package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.datatype.FitnessUserInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataResponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.ActivityReminder;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lxg f41066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f41067c;
    private int d = 0;
    private UserProfileMgrApi e = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);

    private void c() {
    }

    public lxh(Context context, lxg lxgVar) {
        this.f41067c = context;
        this.f41066a = lxgVar;
    }

    public void c(Message message) {
        if (message == null) {
            LogUtil.j("HwFitnessManager", "handleMessage() message is null");
            return;
        }
        int i = message.what;
        if (i == 1) {
            LogUtil.a("HwFitnessManager", "handleMessage() FitnessCommandId.COMMAND_FITNESS_SET_MOTION_GOAL");
            a(message);
            return;
        }
        if (i == 10001) {
            LogUtil.a("HwFitnessManager", "handleMessage() FitnessCommandId.GET_FITNESS_GET_ACTIVITY_REMINDER");
            e(message);
            return;
        }
        if (i == 10010) {
            LogUtil.a("HwFitnessManager", "handleMessage() FitnessCommandId.INTELLIGENT_HOME_SLEEP");
            f();
            return;
        }
        if (i != 10011) {
            LogUtil.j("HwFitnessManager", "processReportData default");
            return;
        }
        LogUtil.a("HwFitnessManager", "handleMessage() FitnessCommandId.INTELLIGENT_HOME_SLEEP_THREE");
        if (this.f41066a.r != null) {
            this.f41066a.r.removeMessages(10011);
        }
        this.f41066a.g++;
        LogUtil.a("HwFitnessManager", "connectedThree :", Integer.valueOf(this.f41066a.g));
        if (this.f41066a.g == 3) {
            this.f41066a.f41041b++;
            LogUtil.a("HwFitnessManager", "connected :", Integer.valueOf(this.f41066a.f41041b));
            Message messageObtainMessage = this.f41066a.r.obtainMessage();
            messageObtainMessage.what = 10010;
            this.f41066a.r.sendMessageDelayed(messageObtainMessage, 600000L);
        }
        if (this.f41066a.g < 3) {
            d();
        }
    }

    private void c(final MotionGoal motionGoal) {
        LogUtil.a("FitnessManagerHelper", "handleGetUserInfo enter");
        this.e.getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: lxh.2
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                if (i != 0 || userInfomation == null) {
                    LogUtil.a("FitnessManagerHelper", "handleGetUserInfo userInfo is null");
                } else {
                    LogUtil.a("FitnessManagerHelper", "handleGetUserInfo getUserInfo onResponse userInfomation");
                    lxw.e(1, userInfomation, motionGoal.getStepGoal());
                }
            }
        });
    }

    private void a(Message message) {
        MotionGoal motionGoal = message.obj instanceof MotionGoal ? (MotionGoal) message.obj : null;
        if (motionGoal != null) {
            c(motionGoal);
        }
    }

    private void f() {
        if (this.f41066a.r != null) {
            this.f41066a.r.removeMessages(10010);
        }
        this.f41066a.g = 0;
        if (this.f41066a.f41041b < 3) {
            d();
        } else {
            this.f41066a.f41041b = 0;
        }
    }

    private void e(Message message) {
        JsonSyntaxException e;
        if (mgg.d("FitnessManagerHelper") != null) {
            ActivityReminder activityReminder = new ActivityReminder();
            if (message.obj != null && (message.obj instanceof String)) {
                try {
                    String strReplaceAll = (String) message.obj;
                    if (strReplaceAll.contains(k.g)) {
                        LogUtil.a("FitnessManagerHelper", "processActivityRemind info contains enable");
                        strReplaceAll = strReplaceAll.replaceAll(k.g, "isEnable");
                    }
                    ActivityReminder activityReminder2 = (ActivityReminder) new Gson().fromJson(strReplaceAll, ActivityReminder.class);
                    try {
                        if (activityReminder2.getEndTime() == 5120) {
                            LogUtil.a("FitnessManagerHelper", "processActivityRemind set new end time");
                            activityReminder2.setEndTime(5376);
                        }
                        activityReminder = activityReminder2;
                    } catch (JsonSyntaxException e2) {
                        e = e2;
                        activityReminder = activityReminder2;
                        LogUtil.e("FitnessManagerHelper", "processActivityRemind Exception ", ExceptionUtils.c(e));
                    }
                } catch (JsonSyntaxException e3) {
                    e = e3;
                }
            }
            LogUtil.a("03", 1, "FitnessManagerHelper", "processActivityRemind activityReminder = ", activityReminder);
            mhs.a().sendSetSwitchSettingCmd(lxp.c(activityReminder), "", 7, 7);
        } else {
            LogUtil.j("FitnessManagerHelper", "sendSetSwitchSettingCmd getConnectDeviceInfo is null");
        }
        h();
    }

    private void h() {
        mit.b("FitnessManagerHelper", new lxl.b());
        if (b()) {
            c(6);
            this.d = 6;
        } else {
            c(1);
            this.d = 1;
        }
        l();
    }

    private void d() {
        DeviceInfo deviceInfoC = mgg.c("FitnessManagerHelper");
        if (deviceInfoC == null) {
            LogUtil.a("HwFitnessManager", "activeTransportDeviceData deviceInfo is null");
            return;
        }
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessManagerHelper", "activeTransportDeviceData switchSettingManager is null");
        } else {
            mhsVarA.getSwitchSetting("intelligent_home_linkage", deviceInfoC.getDeviceIdentify(), new IBaseResponseCallback() { // from class: lxh.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0 || obj == null) {
                        return;
                    }
                    LogUtil.a("HwFitnessManager", "activeTransportDeviceData getSwitchSetting success");
                    if (obj instanceof String) {
                        lxh.this.e((String) obj);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str.contains(Constants.PARAM_SERVER_SPLIT)) {
            String[] strArrSplit = str.split(Constants.PARAM_SERVER_SPLIT);
            LogUtil.a("HwFitnessManager", "INTELLIGENT_HOME_LINKAGE new split :", Integer.valueOf(strArrSplit.length));
            if (strArrSplit.length == 5) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = strArrSplit[2];
                String str5 = strArrSplit[3];
                String str6 = strArrSplit[4];
                LogUtil.a("HwFitnessManager", "checkDeviceIdIsPermanent deviceId :", CommonUtil.n(str2), "expires :", str3, "productId :", str4, "enable :", str5, "isClick :", str6);
                if (Boolean.parseBoolean(str5) && Boolean.parseBoolean(str6)) {
                    c(str2);
                }
            }
        }
    }

    private void c(String str) {
        Message messageObtainMessage = this.f41066a.r.obtainMessage();
        messageObtainMessage.what = 10011;
        this.f41066a.r.sendMessageDelayed(messageObtainMessage, 60000L);
        lxe.a(this.f41067c).d("sleep", "1", str, new FitnessCloudCallBack() { // from class: lxh.4
            @Override // com.huawei.callback.FitnessCloudCallBack
            public void onResponce(Object obj) {
                if (obj != null) {
                    if (!(obj instanceof TransferDeviceDataResponse)) {
                        LogUtil.j("HwFitnessManager", "transportDeviceData is success");
                        return;
                    }
                    if (((TransferDeviceDataResponse) obj).getResultCode().intValue() == 0) {
                        lxh.this.f41066a.f41041b = 0;
                        lxh.this.f41066a.g = 0;
                        lxh.this.f41066a.r.removeMessages(10011);
                        LogUtil.a("HwFitnessManager", "transportDeviceData is success");
                        return;
                    }
                    LogUtil.j("HwFitnessManager", "transportDeviceData is fail");
                }
            }
        });
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090018.value(), new HashMap(16), 0);
    }

    public void b(int i, long j, DeviceInfo deviceInfo) {
        if (this.f41066a.p != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.obj = deviceInfo;
            this.f41066a.p.sendMessageDelayed(messageObtain, j);
            return;
        }
        LogUtil.j("05", 1, "HwFitnessManager", "fitnessManagerSendMessageDelay mHwFitnessManagerHandler is null");
    }

    private void e(int i) {
        if (this.f41066a.p != null) {
            if (this.f41066a.p.hasMessages(i)) {
                this.f41066a.p.removeMessages(i);
                return;
            }
            return;
        }
        LogUtil.j("05", 1, "HwFitnessManager", "fitnessManagerRemoveMessage mHwFitnessManagerHandler is null");
    }

    public void a(Object obj, DeviceInfo deviceInfo) {
        if (obj == null) {
            LogUtil.j("HwFitnessManager", "onResponse receive bluetooth data is null");
            return;
        }
        byte[] bArr = (byte[]) obj;
        if (bArr.length >= 3) {
            LogUtil.a("HwFitnessManager", "onResponse receive bluetooth data", eeq.e(bArr));
            e(bArr, deviceInfo);
            n(bArr, deviceInfo);
            m(bArr, deviceInfo);
            c(bArr, deviceInfo);
            return;
        }
        LogUtil.j("FitnessManagerHelper", "dataInfos length is less than 3.");
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        DeviceInfo deviceInfoD;
        byte b2 = bArr[1];
        switch (b2) {
            case 1:
                d(bArr, 1);
                break;
            case 2:
                if (lxc.c() && (deviceInfoD = mgg.d("FitnessManagerHelper")) != null && lxc.a(deviceInfoD.getDeviceIdentify())) {
                    b(bArr);
                } else {
                    d(bArr, 10002);
                }
                break;
            case 3:
                mik.b("FitnessManagerHelper", bArr[0], b2);
                k(bArr, deviceInfo);
                break;
            case 4:
                g(bArr, deviceInfo);
                break;
            case 5:
                a(bArr, deviceInfo);
                break;
            case 6:
                g();
                break;
            case 7:
                d(bArr, 7);
                break;
            case 9:
                d(bArr, 10002);
                break;
            case 10:
                f(bArr, deviceInfo);
                break;
            case 11:
                i(bArr, deviceInfo);
                break;
        }
    }

    private void n(byte[] bArr, DeviceInfo deviceInfo) {
        switch (bArr[1]) {
            case 12:
                h(bArr, deviceInfo);
                break;
            case 13:
                j(bArr, deviceInfo);
                break;
            case 14:
                d(bArr, 14);
                break;
            case 16:
                d(bArr, 16);
                break;
            case 18:
                c();
                break;
            case 19:
                d(bArr, 19);
                break;
            case 21:
                d(bArr);
                break;
            case 22:
                b(bArr, 22);
                break;
            case 23:
                LogUtil.a("HwFitnessManager", "5.7.23 response : ", eeq.e(bArr));
                e(bArr, 23);
                break;
        }
    }

    private void m(byte[] bArr, DeviceInfo deviceInfo) {
        DeviceInfo deviceInfoD;
        switch (bArr[1]) {
            case 26:
                if (bArr.length > 3) {
                    byte b2 = bArr[2];
                    if (b2 == 127) {
                        LogUtil.e("HwFitnessManager", "5.7.26 return errorCode");
                    } else if (b2 == 1) {
                        LogUtil.a("HwFitnessManager", "get command is 5.7.26");
                        lxw.i(0, deviceInfo);
                        lxw.j(0, deviceInfo);
                    } else {
                        LogUtil.j("HwFitnessManager", "processOtherReplyData unknown");
                    }
                }
                break;
            case 28:
                LogUtil.a("HwFitnessManager", "5.7.28 response : ", eeq.e(bArr));
                e(bArr, 28);
                break;
            case 29:
                LogUtil.a("HwFitnessManager", "5.7.29 response : ", eeq.e(bArr));
                e(bArr, 29);
                break;
            case 31:
                d(bArr, deviceInfo);
                break;
            case 32:
                b(bArr, deviceInfo);
                break;
            case 33:
                if (lxc.e() && (deviceInfoD = mgg.d("FitnessManagerHelper")) != null && lxc.a(deviceInfoD.getDeviceIdentify())) {
                    a(bArr);
                } else {
                    d(bArr, 33);
                }
                break;
        }
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        byte b2 = bArr[1];
        if (b2 == 34) {
            LogUtil.a("HwFitnessManager", "5.7.34 response :", eeq.e(bArr));
            e(bArr, 34);
            return;
        }
        if (b2 == 41) {
            LogUtil.a("HwFitnessManager", "5.7.41 response :", eeq.e(bArr));
            return;
        }
        if (b2 == 36) {
            LogUtil.a("HwFitnessManager", "5.7.36 response :", eeq.e(bArr));
            e(bArr, 36);
        } else if (b2 == 37) {
            LogUtil.a("HwFitnessManager", "5.7.37 response :", eeq.e(bArr));
            e(bArr, 37);
        } else {
            LogUtil.j("HwFitnessManager", "processOtherReplyData default");
        }
    }

    private void d(byte[] bArr, int i) {
        LogUtil.a("05", 1, "HwFitnessManager", "processSetCmdResult Complete command :", Integer.valueOf(i));
        int iD = 201000;
        try {
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                LogUtil.e("HwFitnessManager", "processSetCmdResult return errorCode:", Integer.valueOf(iD));
            }
        } catch (eeu e) {
            LogUtil.e("FitnessManagerHelper", "processSetCmdResult Exception ", ExceptionUtils.c(e));
        }
        b(i, iD, (Object) null);
    }

    private void b(int i, int i2, Object obj) {
        LogUtil.a("05", 1, "HwFitnessManager", "processCallback callback command:", Integer.valueOf(i), "errorCode:", Integer.valueOf(i2));
        synchronized (lxg.d) {
            List<IBaseResponseCallback> list = this.f41066a.f41042c.get(Integer.valueOf(i));
            if (list != null) {
                int i3 = 0;
                while (list.size() > 0) {
                    IBaseResponseCallback iBaseResponseCallback = list.get(i3);
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(i2, obj);
                        list.remove(i3);
                        break;
                    } else {
                        list.remove(i3);
                        i3++;
                    }
                }
            }
        }
    }

    private void k(byte[] bArr, DeviceInfo deviceInfo) {
        int i;
        ReleaseLogUtil.d("Step_HwFitnessManager", "processGetTodayFitnessData Complete");
        e(4);
        int iD = 201000;
        try {
            i = 0;
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                lng.c(iD);
                ReleaseLogUtil.e("Step_HwFitnessManager", "processGetTodayFitnessData return errorCode:", Integer.valueOf(iD));
                this.f41066a.b(iD, deviceInfo);
                i = iD;
            } else {
                this.f41066a.m.e(this.f41066a, lxx.d(bArr), deviceInfo);
            }
        } catch (eeu unused) {
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            ReleaseLogUtil.a("Step_HwFitnessManager", "processGetTodayFitnessData Exception.");
            this.f41066a.b(-1, deviceInfo);
        }
        b(i, deviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    private void g(byte[] bArr, DeviceInfo deviceInfo) {
        eeu e;
        LogUtil.a("05", 1, "HwFitnessManager", "processGetRealTimeFrameCount");
        int i = 201000;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                try {
                    LogUtil.e("HwFitnessManager", "procGetRealTimeFrameCount return errorCode:", Integer.valueOf(iD));
                    this.f41066a.d(300007, deviceInfo);
                    this.f41066a.b(iD, deviceInfo);
                    return;
                } catch (eeu e2) {
                    e = e2;
                    i = iD;
                    LogUtil.e("FitnessManagerHelper", "processGetRealTimeFrameCount Exception ", ExceptionUtils.c(e));
                    this.f41066a.b(-1, deviceInfo);
                    if (this.f41066a.ab != null) {
                        LogUtil.a("HwFitnessManager", "processGetRealTimeFrameCount RealTimeFramePageList is not null");
                        lxg lxgVar = this.f41066a;
                        lxgVar.c(lxgVar.ab, deviceInfo);
                        return;
                    }
                    this.f41066a.e(i, deviceInfo);
                }
            }
            this.f41066a.ab = lxx.h(bArr);
            if (this.f41066a.ab != null) {
                LogUtil.a("HwFitnessManager", "processGetRealTimeFrameCount RealTimeFramePageList is not null");
                lxg lxgVar2 = this.f41066a;
                lxgVar2.c(lxgVar2.ab, deviceInfo);
                return;
            }
            this.f41066a.e(i, deviceInfo);
        } catch (eeu e3) {
            e = e3;
        }
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "processGetRealTimeCompressedData");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.e("HwFitnessManager", "processGetRealTimeCompressedData return errorCode:", Integer.valueOf(iD));
                this.f41066a.d(300007, deviceInfo);
                this.f41066a.b(iD, deviceInfo);
            } else {
                this.f41066a.d(lxx.e(bArr));
            }
        } catch (eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetRealTimeCompressedData Exception ", ExceptionUtils.c(e));
            this.f41066a.b(-1, deviceInfo);
        }
        this.f41066a.q++;
        if (this.f41066a.q < this.f41066a.k) {
            lxw.a(this.f41066a.u.get(this.f41066a.q).intValue(), deviceInfo);
        } else {
            this.f41066a.e(0, deviceInfo);
        }
    }

    private void g() {
        LogUtil.a("05", 1, "HwFitnessManager", "processGetActivityReminder do not process");
    }

    private void f(byte[] bArr, DeviceInfo deviceInfo) {
        this.f41066a.z = 0;
        this.f41066a.f = 0;
        LogUtil.a("05", 1, "HwFitnessManager", "processGetSamplePointFrameCount");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.e("HwFitnessManager", "processGetSamplePointFrameCount return errorCode:", Integer.valueOf(iD));
                lng.c(iD);
                this.f41066a.d(300007, deviceInfo);
                this.f41066a.b(iD, deviceInfo);
                return;
            }
            this.f41066a.z = lxx.g(bArr);
            ReleaseLogUtil.d("Step_HwFitnessManager", "7-10 count : ", Integer.valueOf(this.f41066a.z));
            if (this.f41066a.z > 0) {
                LogUtil.a("05", 1, "HwFitnessManager", "processGetSamplePointFrameCount get sample frame index :", Integer.valueOf(this.f41066a.f));
                lxw.c(this.f41066a.f, deviceInfo);
                this.f41066a.f++;
                return;
            }
            b(deviceInfo);
        } catch (cpy | eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetSamplePointFrameCount Exception ", ExceptionUtils.c(e));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            this.f41066a.b(-1, deviceInfo);
        }
    }

    private void i(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "processGetSamplePointFrame");
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.e("HwFitnessManager", "processGetSamplePointFrame return errorCode:", Integer.valueOf(iD));
                this.f41066a.d(300007, deviceInfo);
                this.f41066a.b(iD, deviceInfo);
                return;
            }
            this.f41066a.aa.add(lxx.j(bArr));
            if (this.f41066a.f < this.f41066a.z) {
                lxw.c(this.f41066a.f, deviceInfo);
                this.f41066a.f++;
                return;
            }
            if (this.f41066a.ag.c() == 2) {
                synchronized (lxg.e) {
                    lyu lyuVar = this.f41066a.ag;
                    lxg lxgVar = this.f41066a;
                    lyuVar.d(lxgVar, lxgVar.ad);
                }
            }
            b(deviceInfo);
        } catch (cpy | eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetSamplePointFrame Exception ", ExceptionUtils.c(e));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            this.f41066a.b(-1, deviceInfo);
        }
    }

    private void h(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "processGetSamplePointFrameCount");
        this.f41066a.ae = 0;
        this.f41066a.i = 0;
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.e("HwFitnessManager", "processGetStatusFrameCount return errorCode:", Integer.valueOf(iD));
                this.f41066a.d(300007, deviceInfo);
                this.f41066a.b(iD, deviceInfo);
                return;
            }
            this.f41066a.ae = lxx.k(bArr);
            ReleaseLogUtil.d("DEVMGR_FitnessManagerHelper", "7-12 count : ", Integer.valueOf(this.f41066a.ae));
            if (this.f41066a.ae > 0) {
                lxw.e(this.f41066a.i, deviceInfo);
                this.f41066a.i++;
                return;
            }
            this.f41066a.e(0, deviceInfo);
        } catch (cpy | eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetStatusFrameCount Exception ", ExceptionUtils.c(e));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            this.f41066a.b(-1, deviceInfo);
        }
    }

    private void j(byte[] bArr, DeviceInfo deviceInfo) {
        int i;
        LogUtil.a("05", 1, "HwFitnessManager", "processGetStatusFrame Complete");
        try {
            i = 0;
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                lng.c(iD);
                LogUtil.e("HwFitnessManager", "processGetStatusFrame return errorCode:", Integer.valueOf(iD));
                this.f41066a.d(300007, deviceInfo);
                this.f41066a.b(iD, deviceInfo);
                return;
            }
            this.f41066a.ah.add(lxx.i(bArr));
            if (this.f41066a.i < this.f41066a.ae) {
                lxw.e(this.f41066a.i, deviceInfo);
                this.f41066a.i++;
            } else {
                this.f41066a.e(i, deviceInfo);
                if (this.f41066a.ag.c() == 2) {
                    this.f41066a.ag.a(this.f41066a, lxl.d(System.currentTimeMillis() / 1000));
                }
            }
        } catch (cpy | eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetStatusFrame Exception ", ExceptionUtils.c(e));
            lng.c(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
            this.f41066a.b(-1, deviceInfo);
            i = 201000;
        }
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        this.f41066a.o = 0;
        this.f41066a.h = 0;
        LogUtil.a("05", 1, "HwFitnessManager", "processGetDesFrameCount enter processGetDesFrameCount");
        try {
            if (bArr[2] == 127) {
                LogUtil.e("HwFitnessManager", "processGetDesFrameCount return errorCode:", Integer.valueOf(mix.d(bArr)));
                this.f41066a.a(300007, deviceInfo);
                return;
            }
            this.f41066a.o = lxx.a(bArr);
            LogUtil.a("HwFitnessManager", "processGetDesFrameCount get sample frame count :", Integer.valueOf(this.f41066a.o));
            if (this.f41066a.o > 0) {
                LogUtil.a("05", 1, "HwFitnessManager", "processGetDesFrameCount get sample frame index :", Integer.valueOf(this.f41066a.f), "desFrameCount Greater than zero :", Integer.valueOf(this.f41066a.o));
                lxw.b(this.f41066a.h, deviceInfo);
                this.f41066a.h++;
                return;
            }
            LogUtil.j("HwFitnessManager", "desFrameCount Less than zero :", Integer.valueOf(this.f41066a.o));
            this.f41066a.a(0, deviceInfo);
        } catch (eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetDesFrameCount Exception ", ExceptionUtils.c(e));
        }
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        try {
            if (bArr[2] == 127) {
                this.f41066a.a(300007, deviceInfo);
                return;
            }
            this.f41066a.n.add(lxx.b(bArr));
            if (this.f41066a.h < this.f41066a.o) {
                lxw.b(this.f41066a.h, deviceInfo);
                this.f41066a.h++;
            } else {
                this.f41066a.x = true;
                this.f41066a.m.b(this.f41066a.n, deviceInfo);
            }
        } catch (eeu e) {
            LogUtil.e("FitnessManagerHelper", "processGetDesFrame Exception ", ExceptionUtils.c(e));
        }
    }

    private void d(byte[] bArr) {
        int i;
        LogUtil.a("05", 1, "HwFitnessManager", "processGetUserInfoData Complete command:", 21);
        int iD = 201000;
        FitnessUserInfo fitnessUserInfoO = null;
        try {
            i = 0;
            if (bArr[2] == 127) {
                iD = mix.d(bArr);
                LogUtil.e("HwFitnessManager", "processSetCmdResult return errorCode:", Integer.valueOf(iD));
                i = iD;
            } else {
                try {
                    fitnessUserInfoO = lxx.o(bArr);
                } catch (eeu e) {
                    e = e;
                    iD = 0;
                    LogUtil.e("FitnessManagerHelper", "processGetUserInfoData Exception ", ExceptionUtils.c(e));
                    i = iD;
                }
            }
        } catch (eeu e2) {
            e = e2;
        }
        b(21, i, fitnessUserInfoO);
    }

    private void b(byte[] bArr, int i) {
        e(100);
        ReleaseLogUtil.d("DEVMGR_FitnessManagerHelper", "processSetCoreCmdResult Complete command :", Integer.valueOf(i));
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                ReleaseLogUtil.d("DEVMGR_FitnessManagerHelper", "processSetCoreCmdResult return errorCode:", Integer.valueOf(iD));
                if (iD == 0) {
                    this.f41066a.j = 1;
                    LogUtil.d("HwFitnessManager", "processSetCoreCmdResult button state:", Integer.valueOf(this.f41066a.j));
                } else {
                    this.f41066a.j = 0;
                    LogUtil.j("HwFitnessManager", "processSetCoreCmdResult button state:", Integer.valueOf(this.f41066a.j));
                }
            }
        } catch (eeu e) {
            LogUtil.e("FitnessManagerHelper", "processSetCoreCmdResult Exception ", ExceptionUtils.c(e));
        }
    }

    private void e(byte[] bArr, int i) {
        ReleaseLogUtil.d("DEVMGR_FitnessManagerHelper", "printSwitchResult command :", Integer.valueOf(i));
        try {
            if (bArr[2] == 127) {
                ReleaseLogUtil.d("DEVMGR_FitnessManagerHelper", "printSwitchResult return errorCode:", Integer.valueOf(mix.d(bArr)));
            }
        } catch (eeu e) {
            ReleaseLogUtil.a("DEVMGR_FitnessManagerHelper", "printSwitchResult Exception ", ExceptionUtils.c(e));
        }
    }

    private boolean b() {
        int iE = CommonUtil.e(new SimpleDateFormat("HH").format(new Date()), -1);
        return iE >= 0 && iE < 6;
    }

    public void b(IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
        synchronized (lxg.e) {
            LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailDataRun enter thread isNeedSyncWork:", Boolean.valueOf(z));
            if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                Boolean bool = false;
                if (this.f41066a.v.containsKey(deviceInfo.getDeviceIdentify())) {
                    bool = this.f41066a.v.get(deviceInfo.getDeviceIdentify());
                }
                if (bool != null && bool.booleanValue()) {
                    LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailData data syncing");
                    iBaseResponseCallback.a(300002, null);
                    this.f41066a.c(10009, iBaseResponseCallback);
                    if (this.f41066a.g()) {
                        lxl.c(this.f41067c);
                    }
                    return;
                }
                this.f41066a.v.put(deviceInfo.getDeviceIdentify(), true);
                this.f41066a.ag.d(1);
                this.f41066a.a(z, "syncFitnessDetailDataRun");
                b(0, 240000L, deviceInfo);
                this.f41066a.c(10009, iBaseResponseCallback);
                this.f41066a.a();
                lxg lxgVar = this.f41066a;
                lxgVar.ac = lxl.a(lxgVar);
                this.f41066a.l = (int) (System.currentTimeMillis() / 1000);
                long jD = lxl.d(this.f41066a.l);
                if (this.f41066a.ag.a(this.f41066a) == -1) {
                    lyu lyuVar = this.f41066a.ag;
                    lxg lxgVar2 = this.f41066a;
                    lyuVar.d(lxgVar2, lxl.d(lxgVar2.ac));
                }
                if (lxl.e() != 3) {
                    c(deviceInfo);
                } else {
                    b(jD);
                }
                return;
            }
            LogUtil.j("05", 1, "HwFitnessManager", "syncFitnessDetailDataRun get device info error");
            iBaseResponseCallback.a(300004, null);
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (this.f41066a.l - this.f41066a.ac > k.b.l || this.f41066a.ac == 0) {
            lxg lxgVar = this.f41066a;
            lxgVar.ac = lxl.d(lxgVar.l - k.b.l);
            lxl.a(this.f41066a.ac, this.f41066a);
        } else if (this.f41066a.ac >= this.f41066a.l && this.f41066a.ac - this.f41066a.l <= 300) {
            LogUtil.a("05", 1, "HwFitnessManager", "processFitnessDetailSpecialDataFormat lastSync time is not correct.");
            lxg lxgVar2 = this.f41066a;
            lxgVar2.ac = lxgVar2.l - 61;
        } else if (this.f41066a.ac - this.f41066a.l > 300) {
            LogUtil.a("05", 1, "HwFitnessManager", "processFitnessDetailSpecialDataFormat lastSync time is not correct and need write back.");
            lxg lxgVar3 = this.f41066a;
            lxgVar3.ac = lxgVar3.l - 61;
            lxl.a(this.f41066a.ac, this.f41066a);
        } else {
            LogUtil.j("05", 1, "HwFitnessManager", "processFitnessDetailSpecialDataFormat unknown");
        }
        lxw.e(this.f41066a.ac, this.f41066a.l, deviceInfo);
    }

    private void b(long j) {
        if (this.f41066a.ac < this.f41066a.l) {
            if (this.f41066a.ac < j) {
                this.f41066a.ac = j;
            }
        } else if (this.f41066a.ac >= this.f41066a.l && this.f41066a.ac - this.f41066a.l <= 300) {
            LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailData lastSync time is not correct.");
            lxg lxgVar = this.f41066a;
            lxgVar.ac = lxgVar.l - 61;
        } else if (this.f41066a.ac - this.f41066a.l > 300) {
            LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailData lastSync time is not correct and need write back.");
            lxg lxgVar2 = this.f41066a;
            lxgVar2.ac = lxgVar2.l - 61;
            lxl.a(this.f41066a.ac, this.f41066a);
        } else {
            LogUtil.j("05", 1, "HwFitnessManager", "processFitnessDetailOtherDataFormat unknown");
        }
        lxw.b(this.f41066a.ac, this.f41066a.l);
    }

    public void d(Message message) {
        if (this.f41066a == null) {
            return;
        }
        if (message == null) {
            LogUtil.j("FitnessManagerHelper", "processFitnessManagerHandler message is null");
            return;
        }
        DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
        LogUtil.a("05", 1, "HwFitnessManager", "handleMessage message ", Integer.valueOf(message.what));
        c(message.what, deviceInfo);
    }

    private void c(int i, DeviceInfo deviceInfo) {
        if (i == 100) {
            this.f41066a.j = 0;
            return;
        }
        if (i != 1003) {
            switch (i) {
                case 0:
                    LogUtil.e("HwFitnessManager", "sync detail timeout");
                    this.f41066a.e(300001, deviceInfo);
                    this.f41066a.b(0, deviceInfo);
                    break;
                case 1:
                    LogUtil.e("HwFitnessManager", "get frame count timeout");
                    break;
                case 2:
                    LogUtil.e("HwFitnessManager", "get frame timeout");
                    break;
                case 3:
                    LogUtil.a("HwFitnessManager", "Sync Complete message");
                    this.f41066a.d(0, deviceInfo);
                    break;
                case 4:
                    LogUtil.a("HwFitnessManager", "Sync today timeout message");
                    b(300001, deviceInfo);
                    this.f41066a.b(4, deviceInfo);
                    break;
                case 5:
                    LogUtil.a("HwFitnessManager", "Save fitness data timeout message");
                    this.f41066a.d(300001, deviceInfo);
                    break;
                case 6:
                    this.f41066a.f();
                    break;
                default:
                    LogUtil.j("HwFitnessManager", "unknown message type");
                    break;
            }
            return;
        }
        this.f41066a.a(false, deviceInfo, (IBaseResponseCallback) null);
    }

    public void d(int i, DeviceInfo deviceInfo) {
        if (i == 1) {
            synchronized (lxg.e) {
                this.f41066a.t = 1;
                this.f41066a.ag.d(1);
                if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                    if (this.f41066a.y) {
                        LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailData data syncing");
                        this.f41066a.s.a(this.f41066a.f41040a);
                        return;
                    } else {
                        this.f41066a.y = true;
                        b(0, 240000L, deviceInfo);
                        e();
                        n();
                        return;
                    }
                }
                LogUtil.j("FitnessManagerHelper", "syncIntensiveData deviceInfo is null or device disconnect");
                this.f41066a.s.a(this.f41066a.f41040a);
                return;
            }
        }
        o();
    }

    private void n() {
        long jB = lxf.b(this.f41066a);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        long j = iCurrentTimeMillis;
        long jD = lxl.d(j);
        if (lxf.c(this.f41066a) == -1) {
            lxf.e(this.f41066a, lxl.d(jB));
        }
        if (jB < j) {
            if (jB < jD) {
                jB = jD;
            }
        } else if (jB >= j && jB - j <= 300) {
            LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailData lastSync time is not correct.");
            jB = iCurrentTimeMillis - 61;
        } else if (jB - j > 300) {
            LogUtil.a("05", 1, "HwFitnessManager", "syncFitnessDetailData lastSync time is not correct and need write back.");
            jB = iCurrentTimeMillis - 61;
            lxf.a(this.f41066a, jB);
        } else {
            LogUtil.j("05", 1, "HwFitnessManager", "syncIntensiveOneDayOldSolutionData unknown");
        }
        LogUtil.a("05", 1, "HwFitnessManager", "mIntensiveStartTime2:", Long.valueOf(jB), ",mIntensiveEndTime", Integer.valueOf(iCurrentTimeMillis));
        lxw.d(jB, j, 0);
    }

    private void o() {
        synchronized (lxg.e) {
            this.f41066a.t = 7;
            this.f41066a.ag.d(2);
            long jC = lxf.c(this.f41066a);
            long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (jC > lxl.d(jCurrentTimeMillis) - 14400) {
                LogUtil.a("HwFitnessManager", "status stage two already ok");
                this.f41066a.y = false;
                return;
            }
            if (jCurrentTimeMillis - jC > k.b.l) {
                jC = lxl.d(jCurrentTimeMillis - k.b.l);
            }
            this.f41066a.ad = jCurrentTimeMillis;
            LogUtil.a("05", 1, "HwFitnessManager", "syncIntensiveData2 enter lastStatusTime:", Long.valueOf(jC), "endTime", Long.valueOf(jCurrentTimeMillis));
            lxw.d(jC, jCurrentTimeMillis, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("FitnessManagerHelper", "handleSetUserInfo enter");
        this.e.getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: lxh.1
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                if (i != 0 || userInfomation == null) {
                    LogUtil.a("FitnessManagerHelper", "handleSetUserInfo userInfo is null");
                } else {
                    LogUtil.a("FitnessManagerHelper", "handleSetUserInfo getUserInfo onResponse userInfomation");
                    lxl.a(userInfomation);
                }
            }
        });
    }

    public void b(DeviceInfo deviceInfo, UserInfomation userInfomation) {
        boolean zD = eey.d(deviceInfo, 154);
        ReleaseLogUtil.d("Step_HwFitnessManager", "doHandleConnection isSupportCircleReminderSwitch :", Boolean.valueOf(zD));
        if (!zD) {
            if (d("custom.activity_reminder")) {
                LogUtil.a("FitnessManagerHelper", "connected device is family mode");
            } else {
                mhs.a().getSwitchSetting("custom.activity_reminder", new IBaseResponseCallback() { // from class: lxh.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        Message messageObtainMessage = lxh.this.f41066a.r.obtainMessage();
                        messageObtainMessage.obj = obj;
                        messageObtainMessage.what = 10001;
                        lxh.this.f41066a.r.sendMessage(messageObtainMessage);
                    }
                });
            }
        } else {
            h();
        }
        c(deviceInfo, userInfomation, new IBaseResponseCallback() { // from class: lxh.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    lxh.this.a();
                } else if (obj instanceof FitnessUserInfo) {
                    lxh.this.c((FitnessUserInfo) obj);
                }
            }
        });
        this.f41066a.h();
    }

    private boolean d(String str) {
        DeviceInfo deviceInfoD = mgg.d("FitnessManagerHelper");
        if (deviceInfoD == null) {
            LogUtil.j("FitnessManagerHelper", "setLocaleStatus deviceInfo is null");
            return false;
        }
        if (!lxc.a(deviceInfoD.getDeviceIdentify())) {
            return false;
        }
        String strE = SharedPreferenceManager.e(this.f41067c, String.valueOf(10008), str);
        boolean z = TextUtils.isEmpty(strE) ? true : Boolean.parseBoolean(strE);
        ActivityReminder activityReminder = new ActivityReminder();
        activityReminder.setEnabled(z);
        String json = new Gson().toJson(activityReminder);
        Message messageObtainMessage = this.f41066a.r.obtainMessage();
        messageObtainMessage.obj = json;
        messageObtainMessage.what = 10001;
        this.f41066a.r.sendMessage(messageObtainMessage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FitnessUserInfo fitnessUserInfo) {
        long time = fitnessUserInfo.getTime();
        LogUtil.a("FitnessManagerHelper", "processGetUserInfoSuccess enter");
        final long j = time * 1000;
        this.e.getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: lxh.6
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                if (i != 0 || userInfomation == null) {
                    LogUtil.a("FitnessManagerHelper", "processGetUserInfoSuccess userInfo is null");
                    return;
                }
                LogUtil.a("HwFitnessManager", "time :", Long.valueOf(userInfomation.getSetTime()), "watch time :", Long.valueOf(j));
                if (userInfomation.getSetTime() <= j) {
                    LogUtil.a("FitnessManagerHelper", "processGetUserInfoSuccess others");
                } else {
                    lxl.a(userInfomation);
                }
            }
        });
    }

    private void b(int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("FitnessManagerHelper", "doSyncTodayComplete deviceInfo is null");
            return;
        }
        LogUtil.a("05", 1, "HwFitnessManager", "doSyncTodayComplete errorCode", Integer.valueOf(i));
        this.f41066a.v.remove(deviceInfo.getDeviceIdentify());
        b(10008, i, (Object) null);
        j();
    }

    private void j() {
        LogUtil.a("05", 1, "HwFitnessManager", "sendTodaySyncSuccessBroadcast.");
        Intent intent = new Intent("com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        this.f41067c.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManager", "syncStatusPoint current stage is ", Integer.valueOf(this.f41066a.ag.c()));
        if (deviceInfo != null && this.f41066a.ag.c() == 2) {
            d(deviceInfo);
            return;
        }
        long jA = lxf.a(this.f41066a);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        LogUtil.a("05", 1, "syncStatusPoint");
        long jD = lxl.d(jCurrentTimeMillis) - 14400;
        if (this.f41066a.ag.e(this.f41066a) == -1) {
            this.f41066a.ag.a(this.f41066a, lxl.d(jA));
        }
        if (jA < jCurrentTimeMillis) {
            if (jA < jD) {
                jA = jD;
            }
        } else if (jA >= jCurrentTimeMillis && jA - jCurrentTimeMillis <= 300) {
            LogUtil.e("HwFitnessManager", "syncStatusPoint lastStatusTime is not correct.");
            jA = jCurrentTimeMillis - 61;
        } else if (jA - jCurrentTimeMillis > 300) {
            LogUtil.e("HwFitnessManager", "syncStatusPoint lastStatusTime is not correct and need write back.");
            jA = jCurrentTimeMillis - 61;
            lxf.c(this.f41066a, jA);
        } else {
            LogUtil.j("HwFitnessManager", "syncStatusPoint unknown");
        }
        lxw.a(jA, jCurrentTimeMillis);
    }

    private void d(DeviceInfo deviceInfo) {
        this.f41066a.ag.d(2);
        long jE = this.f41066a.ag.e(this.f41066a);
        long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (jE > lxl.d(jCurrentTimeMillis) - 14400) {
            LogUtil.a("HwFitnessManager", "status stage two already ok");
            this.f41066a.v.remove(deviceInfo.getDeviceIdentify());
        } else {
            if (jCurrentTimeMillis - jE > k.b.l) {
                jE = lxl.d(jCurrentTimeMillis - k.b.l);
            }
            lxw.a(jE, jCurrentTimeMillis);
        }
    }

    private void e() {
        this.f41066a.n.clear();
    }

    public void c(DeviceInfo deviceInfo, UserInfomation userInfomation, IBaseResponseCallback iBaseResponseCallback) {
        if (deviceInfo == null) {
            LogUtil.j("FitnessManagerHelper", "getUserInfo deviceInfo is null.");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null) {
            LogUtil.j("05", 1, "HwFitnessManager", "getUserInfo deviceCapability is null");
            return;
        }
        if (deviceCapabilityA.isSupportGetUserInfo()) {
            LogUtil.j("05", 1, "HwFitnessManager", "getUserInfo support get user info");
            this.f41066a.c(21, iBaseResponseCallback);
            lxw.a(deviceInfo);
        } else {
            LogUtil.j("05", 1, "HwFitnessManager", "getUserInfo not support get user info");
            lxl.a(userInfomation);
        }
    }

    private void c(int i) {
        LogUtil.a("05", 1, "HwFitnessManager", "setDefaultDeviceReportThreshold.");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwFitnessManager", "setDefaultDeviceReportThreshold deviceCapability is null");
        } else if (!deviceCapabilityC.isSupportThreshold()) {
            LogUtil.j("HwFitnessManager", "setDefaultDeviceReportThreshold is not support");
        } else {
            lxw.e(lyg.e(i));
        }
    }

    private void l() {
        LogUtil.a("05", 1, "HwFitnessManager", "setDeviceReversDataSync enter");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwFitnessManager", "setDeviceReversDataSync deviceCapability is null");
        } else if (!deviceCapabilityC.isReserveSync()) {
            LogUtil.j("HwFitnessManager", "setDeviceReversDataSync is not support");
        } else {
            lxw.d(lxf.d(this.f41066a));
        }
    }

    private void b(byte[] bArr) {
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.a("FitnessManagerHelper", "processStudentInfoFromDevice errorCode:", Integer.valueOf(iD));
                if (iD == 107003) {
                    LogUtil.a("FitnessManagerHelper", "processStudentInfoFromDevice no student info.");
                    lxc.c(new UserInfomation(0));
                    i();
                }
            }
            if (bArr[2] == 1) {
                lxc.c(lxx.c(bArr));
                i();
            }
        } catch (eeu e) {
            i();
            LogUtil.e("FitnessManagerHelper", "processStudentInfoFromDevice Exception ", ExceptionUtils.c(e));
        }
    }

    private void i() {
        DeviceInfo deviceInfoC;
        if (lxc.e() && (deviceInfoC = mgg.c("FitnessManagerHelper")) != null && lxc.a(deviceInfoC.getDeviceIdentify())) {
            lxw.d(deviceInfoC);
        }
    }

    private void a(byte[] bArr) {
        try {
            if (bArr[2] == 127) {
                int iD = mix.d(bArr);
                LogUtil.a("FitnessManagerHelper", "processHeartDatasFromDevice errorCode:", Integer.valueOf(iD));
                if (iD == 107003) {
                    lxc.a();
                    return;
                }
                return;
            }
            HeartRateThresholdConfig heartRateThresholdConfigF = lxx.f(bArr);
            if (heartRateThresholdConfigF == null) {
                LogUtil.a("FitnessManagerHelper", "heartZoneConf is null");
                lxc.a();
            } else {
                lxc.d();
                LogUtil.a("FitnessManagerHelper", "processHeartDatasFromDevice heartZoneConf:", heartRateThresholdConfigF.toString());
            }
        } catch (eeu unused) {
            LogUtil.e("FitnessManagerHelper", "processHeartDatasFromDevice Exception");
        }
    }
}
