package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mwt implements ParserInterface {
    private static final Object d = new Object();
    private static mwt e;
    private List<HiHealthData> j = new ArrayList(10);
    private int g = 0;
    private int i = 0;
    private int h = 0;
    private boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<HiHealthData> f42587a = new CopyOnWriteArrayList<>();
    private eet m = new eet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f42589c = new BroadcastReceiver() { // from class: mwt.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwMenstrualManager", "mConnectStateChangedReceiver intent is null");
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("HwMenstrualManager", "mConnectStateChangedReceiver, info is null");
                    return;
                }
                if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.a("HwMenstrualManager", "This device does not have the correspond capability.");
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "mConnectStateChangedReceiver, deviceConnectState:", Integer.valueOf(deviceConnectState));
                if (deviceConnectState == 3) {
                    mwt.this.m();
                }
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExtendHandler f42588b = HandlerCenter.b(new d(), "HwMenstrualManager");

    private int a(int i) {
        return 1 << i;
    }

    private boolean h() {
        return false;
    }

    private mwt() {
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f42589c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public static mwt c() {
        mwt mwtVar;
        synchronized (d) {
            if (e == null) {
                e = new mwt();
            }
            mwtVar = e;
        }
        return mwtVar;
    }

    private boolean n() {
        boolean zD = eey.d(mwv.d().a("HwMenstrualManager"), 174);
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "isSupportMenstrualSynchronize is :", Boolean.valueOf(zD));
        return zD;
    }

    public void b(String str) {
        if (h()) {
            LogUtil.j("HwMenstrualManager", "sendMenstrualUpdateNoticeFromKit, this app is gp version");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "sendMenstrualUpdateNoticeFromKit null");
            return;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "HwMenstrualManager");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        if (value != null && value.isSupportMenstrual()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                MenstrualSwitchStatus menstrualSwitchStatus = new MenstrualSwitchStatus();
                menstrualSwitchStatus.setMasterSwitch(jSONObject.optInt("masterSwitch"));
                menstrualSwitchStatus.setMenstruationStartRemindSwitch(jSONObject.optInt("menstrualStartSwitch"));
                menstrualSwitchStatus.setMenstruationEndRemindSwitch(jSONObject.optInt("menstrualEndSwitch"));
                menstrualSwitchStatus.setEasyPregnancyStartSwitch(jSONObject.optInt("easyPregnancyStartSwitch"));
                menstrualSwitchStatus.setEasyPregnancyEndSwitch(jSONObject.optInt("easyPregnancyEndSwitch"));
                menstrualSwitchStatus.setEasyPregnancySwitch(jSONObject.optInt("easyPregancySwitch"));
                a(menstrualSwitchStatus);
                return;
            } catch (JSONException unused) {
                LogUtil.e("HwMenstrualManager", "sendMenstrualStatusForKit JSONException");
                return;
            }
        }
        LogUtil.j("HwMenstrualManager", "sendMenstrualUpdateNoticeFromKit capability is error");
    }

    public void a(final MenstrualSwitchStatus menstrualSwitchStatus) {
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "sendMenstrualStatus start");
        SimpleChain.b("sendMenstrualSwitch").e(new SimpleChain.INext() { // from class: mwu
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.e.c(menstrualSwitchStatus, emitter, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: mwz
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                this.d.c(menstrualSwitchStatus, objArr);
            }
        }, new Object[0]);
    }

    /* synthetic */ void c(MenstrualSwitchStatus menstrualSwitchStatus, SimpleChain.Emitter emitter, Object[] objArr) {
        e(emitter, menstrualSwitchStatus);
    }

    /* synthetic */ void c(MenstrualSwitchStatus menstrualSwitchStatus, Object[] objArr) {
        e(menstrualSwitchStatus, ((Integer) objArr[0]).intValue());
    }

    public void e(MenstrualSwitchStatus menstrualSwitchStatus, int i) {
        int iA;
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handSendMenstrualSwitch start easyPregnancySwitch:", Integer.valueOf(i));
        if (h()) {
            LogUtil.j("HwMenstrualManager", "handSendMenstrualSwitch, this app is gp version");
            return;
        }
        if (menstrualSwitchStatus == null) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "handSendMenstrualSwitch menstrualSwitchStatus null");
            return;
        }
        int masterSwitch = menstrualSwitchStatus.getMasterSwitch();
        int menstruationStartRemindSwitch = menstrualSwitchStatus.getMenstruationStartRemindSwitch();
        int menstruationEndRemindSwitch = menstrualSwitchStatus.getMenstruationEndRemindSwitch();
        int easyPregnancyStartSwitch = menstrualSwitchStatus.getEasyPregnancyStartSwitch();
        int easyPregnancyEndSwitch = menstrualSwitchStatus.getEasyPregnancyEndSwitch();
        LogUtil.a("HwMenstrualManager", "masterSwitch=", Integer.valueOf(masterSwitch), "menstruationStartSwitch=", Integer.valueOf(menstruationStartRemindSwitch), " menstruationEndSwitch=", Integer.valueOf(menstruationEndRemindSwitch), " easyPregnancyStartSwitch=", Integer.valueOf(easyPregnancyStartSwitch), " easyPregnancyEndSwitch=", Integer.valueOf(easyPregnancyEndSwitch), " easyPregnancySwitch=", Integer.valueOf(i));
        LogUtil.a("HwMenstrualManager", "isSupportIssuedOveFerPerSwitch=", Boolean.valueOf(o()));
        if (o()) {
            iA = (masterSwitch * a(0)) + (menstruationStartRemindSwitch * a(1)) + (menstruationEndRemindSwitch * a(2)) + (easyPregnancyStartSwitch * a(3)) + (easyPregnancyEndSwitch * a(4)) + (a(5) * i);
        } else {
            iA = (masterSwitch * a(0)) + (menstruationStartRemindSwitch * a(1)) + (menstruationEndRemindSwitch * a(2)) + (easyPregnancyStartSwitch * a(3)) + (easyPregnancyEndSwitch * a(4));
        }
        String str = eeq.d(1) + eeq.d(1) + eeq.d(iA);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a("HwMenstrualManager", "sendMenstrualStatus, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void e(final SimpleChain.Emitter emitter, MenstrualSwitchStatus menstrualSwitchStatus) {
        int easyPregnancySwitch = menstrualSwitchStatus.getEasyPregnancySwitch();
        LogUtil.a("HwMenstrualManager", "checkMenstrualSwitchStatus easyPregnancySwitch:", Integer.valueOf(easyPregnancySwitch));
        if (easyPregnancySwitch != -1) {
            emitter.onSuccess(Integer.valueOf(easyPregnancySwitch));
        } else if (!o()) {
            LogUtil.a("HwMenstrualManager", "checkMenstrualSwitchStatus not SupportIssuedOveFerPerSwitch");
            emitter.onSuccess(Integer.valueOf(easyPregnancySwitch));
        } else {
            xkb.d("900300050", new HiDataReadResultListener() { // from class: mwt.3
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    LogUtil.a("HwMenstrualManager", "checkMenstrualSwitchStatus getSampleConfigForHealth object:", obj);
                    if (i != 0) {
                        emitter.onSuccess(1);
                    } else {
                        emitter.onSuccess(Integer.valueOf(miq.d(obj, new AtomicBoolean())));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj) {
        StringBuffer stringBuffer = new StringBuffer(16);
        if (i == 0 && (obj instanceof Long)) {
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "modifyTime is:", l);
            stringBuffer.append(eeq.d(1)).append(eeq.d(eeq.c(jLongValue).length() / 2)).append(eeq.c(jLongValue));
        } else {
            String strC = eeq.c(150001L);
            stringBuffer.append(eeq.d(127)).append(eeq.d(strC.length() / 2)).append(strC);
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        LogUtil.a("HwMenstrualManager", "sendModifyTime, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj, boolean[] zArr, Object obj2, boolean z) {
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "sendMenstrualStatusData");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(3);
        StringBuffer stringBuffer = new StringBuffer(16);
        if (i == 0 && (obj instanceof mxa)) {
            mxa mxaVar = (mxa) obj;
            List<mxb> listB = mxaVar.b();
            String strC = mwv.d().c(listB);
            stringBuffer.append(eeq.d(1)).append(eeq.d(strC.length() / 2)).append(strC);
            stringBuffer.append(eeq.d(130));
            StringBuffer stringBuffer2 = new StringBuffer(16);
            Iterator<mxb> it = listB.iterator();
            while (it.hasNext()) {
                c(stringBuffer2, it.next(), z);
            }
            stringBuffer.append(eeq.b(stringBuffer2.toString().length() / 2)).append(stringBuffer2.toString());
            long jC = mxaVar.c();
            stringBuffer.append(eeq.d(9)).append(eeq.d(eeq.c(jC).length() / 2)).append(eeq.c(jC));
            b(zArr, obj2, stringBuffer);
        } else {
            String strC2 = eeq.c(150001L);
            stringBuffer.append(eeq.d(127)).append(eeq.d(strC2.length() / 2)).append(strC2);
        }
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        LogUtil.a("HwMenstrualManager", "sendMenstrualStatusData, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void b(boolean[] zArr, Object obj, StringBuffer stringBuffer) {
        if ((obj instanceof int[]) && zArr != null && zArr.length == 2) {
            int[] iArr = (int[]) obj;
            if (zArr[0] && iArr.length > 0) {
                stringBuffer.append(eeq.d(10)).append(eeq.d(1)).append(eeq.d(iArr[0]));
            }
            if (!zArr[1] || iArr.length <= 1) {
                return;
            }
            stringBuffer.append(eeq.d(11)).append(eeq.d(1)).append(eeq.d(iArr[1]));
        }
    }

    private void c(StringBuffer stringBuffer, mxb mxbVar, boolean z) {
        StringBuffer stringBuffer2 = new StringBuffer(16);
        stringBuffer2.append(eeq.d(4)).append(eeq.d(eeq.c(mxbVar.h()).length() / 2)).append(eeq.c(mxbVar.h()));
        stringBuffer2.append(eeq.d(5)).append(eeq.d(eeq.c(mxbVar.d()).length() / 2)).append(eeq.c(mxbVar.d()));
        stringBuffer2.append(eeq.d(6)).append(eeq.d(eeq.c(mxbVar.c()).length() / 2)).append(eeq.c(mxbVar.c()));
        stringBuffer2.append(eeq.d(7)).append(eeq.d(eeq.c(mxbVar.e()).length() / 2)).append(eeq.c(mxbVar.e()));
        stringBuffer2.append(eeq.d(8)).append(eeq.d(1)).append(eeq.d(mxbVar.a()));
        if (z) {
            boolean zB = mxbVar.b();
            stringBuffer2.append(eeq.d(12)).append(eeq.d(eeq.d(zB ? 1 : 0).length() / 2)).append(eeq.d(zB ? 1 : 0));
        }
        stringBuffer.append(eeq.d(131)).append(eeq.d(stringBuffer2.toString().length() / 2)).append(stringBuffer2);
    }

    public void a() {
        if (h()) {
            LogUtil.j("HwMenstrualManager", "sendUpdateNotice, this app is gp version");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(4);
        LogUtil.a("HwMenstrualManager", "sendUpdateNotice, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        if (!n()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - 5184000000L;
        while (true) {
            long j = jCurrentTimeMillis;
            if (j >= System.currentTimeMillis()) {
                return;
            }
            mwx mwxVarE = mwx.e();
            jCurrentTimeMillis = HwExerciseConstants.TEN_DAY_SECOND + j;
            mwxVarE.c(j, jCurrentTimeMillis, 0L);
        }
    }

    public void e() {
        if (h()) {
            LogUtil.j("HwMenstrualManager", "sendMenstrualCapability, this app is gp version");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(5);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(1)).append(eeq.d(n() ? 3 : 2));
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        LogUtil.a("HwMenstrualManager", "sendMenstrualCapability, command:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(6);
        StringBuffer stringBuffer = new StringBuffer(16);
        if (i == 0) {
            String strC = eeq.c(150001L);
            stringBuffer.append(eeq.d(127)).append(eeq.d(strC.length() / 2)).append(strC);
        } else {
            stringBuffer.append(eeq.d(4)).append(eeq.d(eeq.d(i).length() / 2)).append(eeq.d(i));
        }
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLength(eeq.c(stringBuffer.toString()).length);
        LogUtil.a("HwMenstrualManager", "sendFrameNumResponse, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void c(int i) {
        List<HiHealthData> list = this.j;
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "sendBodyStatusDataResponse data null");
            return;
        }
        int size = this.j.size();
        int i2 = this.g;
        int i3 = i * i2;
        if (i3 < 0) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "sendBodyStatusDataResponse no data");
            return;
        }
        int i4 = (i + 1) * i2;
        if (i4 >= size) {
            i4 = size;
        }
        if (size <= i3) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "sendBodyStatusDataResponse no data");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(eeq.d(i).length() / 2)).append(eeq.d(i));
        int i5 = i4 - i3;
        stringBuffer.append(eeq.d(2)).append(eeq.d(eeq.d(i5).length() / 2)).append(eeq.d(i5));
        StringBuffer stringBuffer2 = new StringBuffer(16);
        while (i3 < i4) {
            c(stringBuffer2, i3);
            i3++;
        }
        stringBuffer.append(eeq.d(131)).append(eeq.b(stringBuffer2.toString().length() / 2)).append(stringBuffer2.toString());
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(7);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLength(eeq.c(stringBuffer.toString()).length);
        LogUtil.a("HwMenstrualManager", "sendBodyStatusDataResponse, deviceCommand:", deviceCommand.toString());
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "sendBodyStatusDataResponse, index", Integer.valueOf(i));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void c(StringBuffer stringBuffer, int i) {
        if (this.j.size() >= i) {
            HiHealthData hiHealthData = this.j.get(i);
            long startTime = hiHealthData.getStartTime() / 1000;
            int i2 = (int) hiHealthData.getDouble("menstrual_status");
            int i3 = (int) hiHealthData.getDouble("menstrual_physical");
            int iA = a(hiHealthData, startTime);
            StringBuffer stringBuffer2 = new StringBuffer(16);
            stringBuffer2.append(eeq.d(5)).append(eeq.d(eeq.c(startTime).length() / 2)).append(eeq.c(startTime));
            stringBuffer2.append(eeq.d(6)).append(eeq.d(eeq.e(i2).length() / 2)).append(eeq.e(i2));
            if (!n()) {
                int i4 = (int) hiHealthData.getDouble("menstrual_quantity");
                int i5 = (int) hiHealthData.getDouble("menstrual_dysmenorrhea");
                if (i4 > 3) {
                    xjt.ad("getDailyData quantity is" + i4);
                    i4 = 3;
                }
                if (i5 > 3) {
                    xjt.ad("getDailyData dysmenorrhea is" + i5);
                    i5 = 3;
                }
                stringBuffer2.append(eeq.d(7)).append(eeq.d(1)).append(eeq.d(i4 + (i5 * a(4))));
            }
            stringBuffer2.append(eeq.d(8)).append(eeq.d(eeq.e(i3).length() / 2)).append(eeq.e(i3));
            stringBuffer2.append(eeq.d(9)).append(eeq.d(eeq.e(iA).length() / 2)).append(eeq.e(iA));
            stringBuffer.append(eeq.d(UserInfomation.WEIGHT_DEFAULT_ENGLISH)).append(eeq.d(stringBuffer2.toString().length() / 2)).append(stringBuffer2.toString());
            return;
        }
        LogUtil.e("HwMenstrualManager", "getDailyDataFromHiHealthData ArrayIndexOutOfBoundsException.");
    }

    private int a(HiHealthData hiHealthData, long j) {
        int i = (int) hiHealthData.getDouble("menstrual_sub_status");
        if (((int) hiHealthData.getDouble("menstrual_manual_operation")) != 1) {
            return i;
        }
        LogUtil.a("HwMenstrualManager", "getSubStatus subStatus: 4, time: ", Long.valueOf(j));
        return 4;
    }

    private void l() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(127)).append(eeq.d(eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US).length() / 2)).append(eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(50);
        deviceCommand.setCommandID(8);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setDataLength(eeq.c(stringBuffer.toString()).length);
        LogUtil.a("HwMenstrualManager", "sendFrameNumReceived, deviceCommand:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i >= this.i) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "sendBodyStatusRequest frameIndex error");
            return;
        }
        if (this.h < 3) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            this.f42588b.sendMessage(messageObtain, 5000L);
            this.h++;
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append(eeq.d(1)).append(eeq.d(eeq.d(i).length() / 2)).append(eeq.d(i));
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(50);
            deviceCommand.setCommandID(9);
            deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
            deviceCommand.setDataLength(eeq.c(stringBuffer.toString()).length);
            LogUtil.a("HwMenstrualManager", "sendBodyStatusRequest, deviceCommand:", deviceCommand.toString());
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "sendBodyStatusRequest, frameIndex:", Integer.valueOf(i));
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
            return;
        }
        ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "Have Already tried three times!");
        m();
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwMenstrualManager", "getResult:", strE);
        if (h()) {
            LogUtil.j("HwMenstrualManager", "this app is gp version");
        }
        if (bArr == null || bArr.length <= 1) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "data illegal");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "getResult commandId is:", Byte.valueOf(bArr[1]));
        if ("7F04".equalsIgnoreCase(strE.length() >= 8 ? strE.substring(4, 8) : null)) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "getResult error 7F04");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 2) {
            g();
            return;
        }
        if (b2 == 3) {
            e(bArr);
            return;
        }
        switch (b2) {
            case 6:
                b(bArr);
                break;
            case 7:
                a(bArr);
                break;
            case 8:
                d(bArr);
                break;
            case 9:
                c(bArr);
                break;
            default:
                LogUtil.j("HwMenstrualManager", "getResult nothing to do");
                break;
        }
    }

    private void g() {
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleModifyTimeResult");
        mwv.d().e(new IBaseResponseCallback() { // from class: mwt.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                mwt.this.a(i, obj);
            }
        });
    }

    private void e(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwMenstrualManager", "handleSendMenstrualDataResult,", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "handleSendMenstrualDataResult data is error");
            return;
        }
        try {
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (eew eewVar : this.m.b(strE.substring(4)).e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 1) {
                    String strB = eewVar.b();
                    if (!TextUtils.isEmpty(strB) && strB.length() >= 4) {
                        int iV2 = CommonUtil.v(strB.substring(0, 2));
                        int iV3 = CommonUtil.v(strB.substring(2));
                        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "historyCycle:", Integer.valueOf(iV2), "futureCycle:", Integer.valueOf(iV3));
                        i = iV2;
                        i2 = iV3;
                    }
                } else {
                    switch (iV) {
                        case 10:
                            z2 = true;
                            break;
                        case 11:
                            z = true;
                            break;
                        case 12:
                            z3 = true;
                            break;
                        default:
                            Object[] objArr = new Object[1];
                            objArr[0] = "handleSendMenstrualDataResult default";
                            LogUtil.j("HwMenstrualManager", objArr);
                            break;
                    }
                }
            }
            e(i, i2, z, z2, z3);
        } catch (eeu unused) {
            LogUtil.e("HwMenstrualManager", "handleSendMenstrualDataResult TLVException");
        }
    }

    private void e(int i, int i2, final boolean z, final boolean z2, final boolean z3) {
        mwv.d().d(i, i2, new IBaseResponseCallback() { // from class: mwt.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(final int i3, final Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleSendMenstrualDataResult getData errorCode:", Integer.valueOf(i3));
                if (!z && !z2) {
                    mwt.this.b(i3, obj, null, null, z3);
                } else {
                    mwv.d().d(new IBaseResponseCallback() { // from class: mwt.4.2
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i4, Object obj2) {
                            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "prepareMenstrualData manualErrorCode:", Integer.valueOf(i4));
                            mwt.this.b(i3, obj, new boolean[]{z, z2}, obj2, z3);
                        }
                    });
                }
            }
        });
    }

    private void b(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwMenstrualManager", "handleFrameNumRequest,", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "handleFrameNumRequest data is error");
            return;
        }
        try {
            int iB = 0;
            int iB2 = 0;
            int iB3 = 0;
            for (eew eewVar : this.m.b(strE.substring(4)).e()) {
                int iB4 = CommonUtil.b(eewVar.e(), 16);
                if (iB4 == 1) {
                    iB = CommonUtil.b(eewVar.b(), 16);
                } else if (iB4 == 2) {
                    iB2 = CommonUtil.b(eewVar.b(), 16);
                } else if (iB4 == 3) {
                    iB3 = CommonUtil.b(eewVar.b(), 16);
                } else {
                    LogUtil.j("HwMenstrualManager", "handleFrameNumRequest default");
                }
            }
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleFrameNumRequest historyDay:", Integer.valueOf(iB), ",futureDay:", Integer.valueOf(iB2), ",frameSize:", Integer.valueOf(iB3));
            if (iB3 != 0) {
                e(iB, iB2, iB3);
            }
        } catch (eeu unused) {
            LogUtil.e("HwMenstrualManager", "handleFrameNumRequest TlvException");
        }
    }

    private void e(int i, int i2, int i3) {
        this.g = i3;
        mwv.d().e(i, i2, new IBaseResponseCallback() { // from class: mwt.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleFrameNumRequest getBodyStatus errorCode:", Integer.valueOf(i4));
                if (i4 != 0 || !(obj instanceof List)) {
                    mwt.this.e(0);
                    return;
                }
                List list = (List) obj;
                mwt.this.j = list;
                mwt.this.e((int) Math.ceil((((double) list.size()) * 1.0d) / ((double) mwt.this.g)));
            }
        });
    }

    private void a(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwMenstrualManager", "handleBodyStatusRequest,", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "handleBodyStatusRequest data is error");
            return;
        }
        try {
            List<eew> listE = this.m.b(strE.substring(4)).e();
            if (listE == null || listE.isEmpty()) {
                return;
            }
            int iB = CommonUtil.b(listE.get(0).b(), 16);
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleBodyStatusRequest frameIndex is,", Integer.valueOf(iB));
            c(iB);
        } catch (eeu unused) {
            LogUtil.e("HwMenstrualManager", "handleBodyStatusRequest TlvException");
        }
    }

    private void d(byte[] bArr) {
        String strE = eeq.e(bArr);
        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleFrameNumReceive,", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "handleFrameNumReceive data is error");
            return;
        }
        if (this.f) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "Processing, wait!");
            return;
        }
        try {
            List<eew> listE = this.m.b(strE.substring(4)).e();
            if (listE == null || listE.isEmpty()) {
                return;
            }
            this.i = CommonUtil.b(listE.get(0).b(), 16);
            l();
            if (this.i > 0) {
                this.f = true;
                d(0);
            }
        } catch (eeu unused) {
            LogUtil.e("HwMenstrualManager", "handleFrameNumReceive TlvException");
        }
    }

    private void c(byte[] bArr) {
        int iV;
        String strE = eeq.e(bArr);
        LogUtil.a("HwMenstrualManager", "handleFrameNumReceive,", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "handleFrameNumReceive data is error");
            return;
        }
        this.h = 0;
        try {
            ees eesVarB = this.m.b(strE.substring(4));
            Iterator<eew> it = eesVarB.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iV = 0;
                    break;
                }
                eew next = it.next();
                if (CommonUtil.v(next.e()) == 1) {
                    iV = CommonUtil.v(next.b());
                    ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "handleBodyStatusReceive device response frame:", Integer.valueOf(iV));
                    this.f42588b.removeMessages(iV);
                    d(iV + 1);
                    break;
                }
            }
            List<ees> listB = eesVarB.b();
            if (listB != null && !listB.isEmpty()) {
                ees eesVar = listB.get(0);
                ArrayList arrayList = new ArrayList(16);
                Iterator<ees> it2 = eesVar.b().iterator();
                while (it2.hasNext()) {
                    d(arrayList, it2.next());
                }
                this.f42587a.addAll(arrayList);
                int i = this.i;
                if (iV < i - 1 || i == 0) {
                    return;
                }
                k();
                mwv.d().a(this.f42587a, new IBaseResponseCallback() { // from class: mwt.8
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "insert finish, reset:", Integer.valueOf(i2));
                        mwt.this.m();
                    }
                });
                if (CommonUtil.ap()) {
                    f();
                    return;
                }
                return;
            }
            LogUtil.j("HwMenstrualManager", "handleBodyStatusReceive device response no daily data");
        } catch (eeu unused) {
            LogUtil.e("HwMenstrualManager", "handleBodyStatusReceive TlvException");
        }
    }

    private void f() {
        CopyOnWriteArrayList<HiHealthData> copyOnWriteArrayList = this.f42587a;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualManager", "insertMenstrualDirtyData healthDataList empty");
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.f42587a);
            mwv.d().e(((HiHealthData) copyOnWriteArrayList2.get(copyOnWriteArrayList2.size() - 1)).getEndTime(), new IBaseResponseCallback() { // from class: mwt.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "getMenstrualEndData finish, errorCode:", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof List)) {
                        mwv.d().a((List) obj, new IBaseResponseCallback() { // from class: mwt.7.3
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj2) {
                                ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "insertMenstrualDirtyData insert finish, errorCode:", Integer.valueOf(i2));
                                xjt.ad("insertMenstrual has end dirty data");
                            }
                        });
                    }
                }
            });
        }
    }

    private void k() {
        if (njy.e(this.f42587a)) {
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "dataInsertList is null");
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (HiHealthData hiHealthData : this.f42587a) {
            if (hiHealthData == null) {
                ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "hiHealthData is null, continue");
            } else {
                double d2 = hiHealthData.getDouble("menstrual_status");
                if (Double.compare(d2, 101.0d) == 0) {
                    i++;
                } else if (Double.compare(d2, 102.0d) == 0) {
                    i2++;
                } else if (Double.compare(d2, 301.0d) == 0) {
                    i3++;
                } else if (Double.compare(d2, 302.0d) == 0) {
                    i4++;
                } else if (Double.compare(d2, 401.0d) == 0) {
                    i5++;
                } else if (Double.compare(d2, 402.0d) == 0) {
                    i6++;
                }
            }
        }
        if (i != i2) {
            xjt.ad("periodSyncError device put 102 is " + i2 + "device put 101 is " + i);
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "periodSyncError, device put 102 is,", Integer.valueOf(i2), "device put 101 is,", Integer.valueOf(i));
        }
        if (i3 != i4) {
            xjt.ad("predictSyncError device put 302 is " + i4 + "device put 301 is" + i3);
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "periodSyncError, device put 302 is,", Integer.valueOf(i4), "device put 301 is,", Integer.valueOf(i3));
        }
        if (i5 != i6) {
            xjt.ad("pregnantSyncError device put 402 is " + i6 + "device put 401 is " + i5);
            ReleaseLogUtil.d("DEVMGR_HwMenstrualManager", "periodSyncError, device put 402 is,", Integer.valueOf(i6), "device put 401 is,", Integer.valueOf(i5));
        }
    }

    private void d(List<HiHealthData> list, ees eesVar) {
        HiHealthData hiHealthData = new HiHealthData(10010);
        hiHealthData.setDeviceUuid("-1");
        for (eew eewVar : eesVar.e()) {
            switch (CommonUtil.v(eewVar.e())) {
                case 5:
                    hiHealthData.setTimeInterval(CommonUtil.x(eewVar.b()) * 1000, CommonUtil.x(eewVar.b()) * 1000);
                    break;
                case 6:
                    hiHealthData.putDouble("menstrual_status", CommonUtil.v(eewVar.b()));
                    break;
                case 7:
                    if (!n()) {
                        int iV = CommonUtil.v(eewVar.b()) & 15;
                        int iV2 = CommonUtil.v(eewVar.b()) & 240;
                        LogUtil.a("HwMenstrualManager", "getHiHealthDataFromCommand quantity is,", Integer.valueOf(iV), "and dysmenorrhea is,", Integer.valueOf(iV2));
                        if (iV > 3) {
                            xjt.ad("quantity is" + iV);
                            iV = 3;
                        }
                        if (iV2 >= 16) {
                            iV2 /= a(4);
                        } else if (iV2 > 3) {
                            xjt.ad("dysmenorrhea is over 3" + iV2);
                            iV2 = 3;
                        } else if (iV2 != 0) {
                            xjt.ad("dysmenorrhea is" + iV2);
                        } else {
                            LogUtil.a("HwMenstrualManager", "dysmenorrhea is Correct");
                        }
                        hiHealthData.putDouble("menstrual_quantity", iV);
                        hiHealthData.putDouble("menstrual_dysmenorrhea", iV2);
                    } else {
                        LogUtil.a("HwMenstrualManager", "flow synchronization data dictionary.");
                    }
                    break;
                case 8:
                    hiHealthData.putDouble("menstrual_physical", 2.147483647E9d);
                    break;
                case 9:
                    hiHealthData.putDouble("menstrual_sub_status", CommonUtil.v(eewVar.b()));
                    break;
                default:
                    LogUtil.j("HwMenstrualManager", "handleBodyStatusReceive default");
                    break;
            }
        }
        list.add(hiHealthData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f = false;
        this.i = 0;
        this.h = 0;
        this.f42587a.clear();
    }

    public void b() {
        i();
        j();
        try {
            BaseApplication.getContext().unregisterReceiver(this.f42589c);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HwMenstrualManager", "receiver unregistered IllegalArgumentException");
        }
    }

    private static void i() {
        synchronized (d) {
            e = null;
        }
    }

    private void j() {
        ExtendHandler extendHandler = this.f42588b;
        if (extendHandler != null) {
            extendHandler.quit(false);
            this.f42588b = null;
        }
    }

    public static boolean d() {
        boolean z;
        synchronized (d) {
            z = e == null;
        }
        return z;
    }

    /* JADX INFO: loaded from: classes11.dex */
    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            mwt.this.d(message.what);
            return true;
        }
    }

    private boolean o() {
        DeviceInfo deviceInfoD = mgg.d("HwMenstrualManager");
        if (deviceInfoD == null) {
            LogUtil.j("HwMenstrualManager", "isSupportIssuedOveFerPerSwitch deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
    }
}
