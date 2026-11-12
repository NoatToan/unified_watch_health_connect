package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.basesport.wearengine.DataReceiver;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.wearengine.constant.TrackHiWearBusinessType;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes33.dex */
public class jxv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f39189a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static jxv f39190b;
    private e d = new e();
    private jya e = jya.b();

    private jxv() {
    }

    public static jxv c() {
        jxv jxvVar;
        synchronized (f39189a) {
            if (f39190b == null) {
                LogUtil.a("Track_HeartZoneDeliveryManager", "getInstance");
                f39190b = new jxv();
            }
            jxvVar = f39190b;
        }
        return jxvVar;
    }

    public static boolean b() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_HeartZoneDeliveryManager");
        if (deviceInfo == null) {
            LogUtil.j("Track_HeartZoneDeliveryManager", "device info null");
            return false;
        }
        return eey.d(deviceInfo, 54);
    }

    public boolean d() {
        boolean zB = b();
        LogUtil.a("Track_HeartZoneDeliveryManager", "sentWearEngine isSupport ", Boolean.valueOf(zB));
        if (!zB) {
            return false;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("userPreference_HeartRate_all_posture_data");
        if (userPreference != null && !TextUtils.isEmpty(userPreference.getValue())) {
            String value = userPreference.getValue();
            try {
                HeartRateZoneMgr heartRateZoneMgr = (HeartRateZoneMgr) new Gson().fromJson(value, HeartRateZoneMgr.class);
                LogUtil.a("Track_HeartZoneDeliveryManager", "getHeartRateZoneMgr = ", value);
                e(heartRateZoneMgr, new IBaseResponseCallback() { // from class: jxy
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        LogUtil.a("Track_HeartZoneDeliveryManager", "splicingMessages errorCode ", Integer.valueOf(i));
                    }
                });
            } catch (JsonSyntaxException | NumberFormatException unused) {
                LogUtil.e("Track_HeartZoneDeliveryManager", " updateAllPostureData parse value fail ");
                e();
                return true;
            }
        } else {
            HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
            if (healthDataMgrApi == null) {
                LogUtil.j("Track_HeartZoneDeliveryManager", "getHeartZoneConf : healthDataMgrApi is null.");
                return false;
            }
            e(healthDataMgrApi.getHeartRateZoneMgr(), new IBaseResponseCallback() { // from class: jxw
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("Track_HeartZoneDeliveryManager", "splicingMessages errorCode ", Integer.valueOf(i));
                }
            });
        }
        return true;
    }

    public void e() {
        LogUtil.a("Track_HeartZoneDeliveryManager", "set Default HeartData");
        HeartRateZoneMgr heartRateZoneMgr = new HeartRateZoneMgr(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getLocalUserInfo().getAgeOrDefaultValue());
        if (jxs.b(heartRateZoneMgr)) {
            ReleaseLogUtil.d("Track_HeartZoneDeliveryManager", "the default heart rate config is not valid");
        } else {
            e(heartRateZoneMgr, new IBaseResponseCallback() { // from class: jxz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("Track_HeartZoneDeliveryManager", "splicingMessages errorCode ", Integer.valueOf(i));
                }
            });
        }
    }

    public void e(HeartRateZoneMgr heartRateZoneMgr, IBaseResponseCallback iBaseResponseCallback) {
        int iC = this.d.c();
        int typeValue = TrackHiWearBusinessType.RUN_PLAN_INFO_FILE.getTypeValue();
        byte[] bArrC = jxs.c(heartRateZoneMgr);
        int length = bArrC.length;
        if (length == 0) {
            LogUtil.j("Track_HeartZoneDeliveryManager", "length == 0");
            return;
        }
        dey.c cVar = new dey.c();
        cVar.d(typeValue).c(length).b(1).e(iC);
        dey deyVarA = cVar.a();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deyVarA.h());
        byteBufferAllocate.put(deyVarA.b());
        byteBufferAllocate.put(bArrC);
        byteBufferAllocate.flip();
        xiu.c cVar2 = new xiu.c();
        cVar2.a(byteBufferAllocate.array());
        c("heart ", cVar2.c(), new b(this.e, typeValue, iC, iBaseResponseCallback), iBaseResponseCallback);
    }

    private void c(final String str, xiu xiuVar, final b bVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (bVar != null) {
            this.e.registerCallback(bVar, bVar.f39193b);
        }
        this.e.sendCommandToDevice(xiuVar, new SendCallback(this) { // from class: jxv.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                if (i != 500000 && i != 207) {
                    ReleaseLogUtil.a("Track_HeartZoneDeliveryManager", str, " send failed, resultCode is", Integer.valueOf(i));
                    iBaseResponseCallback.a(1, Integer.valueOf(i));
                } else {
                    if (i == 207) {
                        ReleaseLogUtil.e("Track_HeartZoneDeliveryManager", str, " send success, resultCode is", Integer.valueOf(i));
                        if (bVar == null) {
                            iBaseResponseCallback.a(0, Integer.valueOf(i));
                            return;
                        }
                        return;
                    }
                    LogUtil.a("Track_HeartZoneDeliveryManager", str, " send called success, resultCode is", Integer.valueOf(i));
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("Track_HeartZoneDeliveryManager", str, " send progress is", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a("Track_HeartZoneDeliveryManager", "mHiWearEngineFitnessManager.sendCommandToDevice onFileTransferReport transferWay: ", str2);
            }
        });
    }

    static class b implements DataReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39194c;
        private WeakReference<jya> d;
        private IBaseResponseCallback e;

        b(jya jyaVar, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
            this.d = new WeakReference<>(jyaVar);
            this.f39193b = i;
            this.f39194c = i2;
            this.e = iBaseResponseCallback;
        }

        @Override // com.huawei.health.basesport.wearengine.DataReceiver
        public void onDataReceived(dey deyVar, int i, byte[] bArr) {
            if (deyVar == null) {
                LogUtil.j("Track_HeartZoneDeliveryManager", "SendMsgDataReceiver onDataReceived msg head is null, pls check.");
                return;
            }
            if (deyVar.c() != this.f39193b || deyVar.a() != this.f39194c) {
                LogUtil.j("Track_HeartZoneDeliveryManager", "SendMsgDataReceiver onDataReceived msg not match, this type is : ", Integer.valueOf(this.f39193b), " received is: ", Integer.valueOf(deyVar.c()), " this msg id is:", Integer.valueOf(this.f39194c), " received msg id is: ", Integer.valueOf(deyVar.a()));
                return;
            }
            jya jyaVar = this.d.get();
            if (jyaVar == null) {
                LogUtil.j("Track_HeartZoneDeliveryManager", "SendMsgDataReceiver onDataReceived HiWearEngineFitnessManager is null, pls check");
                return;
            }
            if (bArr != null && bArr.length >= 4) {
                LogUtil.a("Track_HeartZoneDeliveryManager", "SendMsgDataReceiver onDataReceived type is : ", Integer.valueOf(this.f39193b), "session id is: ", Integer.valueOf(this.f39194c), " dataContents length is: ", Integer.valueOf(bArr.length));
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = byteBufferWrap.getInt();
                LogUtil.a("Track_HeartZoneDeliveryManager", "SendMsgDataReceiver onDataReceived type is: ", Integer.valueOf(this.f39193b), " session id is: ", Integer.valueOf(this.f39194c), " response code is: ", Integer.valueOf(i2));
                this.e.a(i2 != 1 ? 0 : 1, Integer.valueOf(i2));
            } else {
                LogUtil.j("Track_HeartZoneDeliveryManager", "SendMsgDataReceiver onDataReceived type is: ", Integer.valueOf(this.f39193b), " session id is: ", Integer.valueOf(this.f39194c), " dataContents length error");
            }
            jyaVar.unregisterCallback(this, this.f39193b);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39195a;

        private e() {
            this.f39195a = 0;
        }

        protected int c() {
            int i;
            synchronized (this) {
                int i2 = this.f39195a + 1;
                this.f39195a = i2;
                i = i2 % 10000;
                this.f39195a = i;
            }
            return i;
        }
    }
}
