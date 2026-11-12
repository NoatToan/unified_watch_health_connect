package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.DeviceCalendarSyncInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class mqy extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile mqy f42209a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42210c = new Object();
    protected static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f42211b;
    private String d;

    private mqy(Context context) {
        super(context);
        this.d = "";
        this.f42211b = new AtomicInteger(0);
    }

    public static mqy d() {
        mqy mqyVar;
        synchronized (f42210c) {
            LogUtil.a("HiWearEngineCalendarManager", "getInstance()");
            if (f42209a == null) {
                f42209a = new mqy(BaseApplication.getContext());
            }
            mqyVar = f42209a;
        }
        return mqyVar;
    }

    public void e(PingCallback pingCallback) {
        LogUtil.a("HiWearEngineCalendarManager", "pingDevice");
        pingComand(pingCallback, getWearPkgName());
    }

    public void c(String str, int i) {
        ReleaseLogUtil.d("R_HiWearEngineCalendarManager", "sendDataToDeviceByHiWear: ", str, " , type: ", Integer.valueOf(i));
        final xiu.c cVar = new xiu.c();
        try {
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append(str);
            String strB = cph.b(i);
            String strC = cph.c(strB.length() / 2);
            stringBuffer.append(cph.b(1));
            stringBuffer.append(strC);
            stringBuffer.append(strB);
            cVar.a(cph.d(stringBuffer.toString()));
        } catch (yib unused) {
            LogUtil.e("HiWearEngineCalendarManager", "sendMessage WearEngineException");
            xjt.i("sendMessage WearEngineException");
        }
        e(new PingCallback() { // from class: mqy.5
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i2) {
                if (i2 == 202) {
                    mqy.this.b(cVar.c());
                } else {
                    LogUtil.e("HiWearEngineCalendarManager", "ping device calendar fail");
                }
            }
        });
    }

    public void d(String str, final boolean z) {
        LogUtil.a("HiWearEngineCalendarManager", "sendCalendarFileToDevice");
        xiu.c cVar = new xiu.c();
        cVar.a(new File(str));
        sendComand(cVar.c(), new SendCallback() { // from class: mqy.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d("R_HiWearEngineCalendarManager", "sendCalendarFileToDevice errorCode:", Integer.valueOf(i));
                mqy.this.c(i, z);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("HiWearEngineCalendarManager", "sendCalendarFileToDevice progress:", Long.valueOf(j));
            }
        });
    }

    public void c(String str, String str2, String str3) {
        LogUtil.a("HiWearEngineCalendarManager", "responseToDeviceByHiWear: 04, eventId", str + "event_uuid", str2, "deviceUuid", str3);
        if (mtz.b(str2) || mtz.b(str3)) {
            LogUtil.e("HiWearEngineCalendarManager", "invalid params");
            return;
        }
        xiu.c cVar = new xiu.c();
        try {
            byte[] bArrD = cph.d("04");
            cqj cqjVar = new cqj();
            cqjVar.b(1, str).b(2, str2).b(3, str3);
            byte[] bArrE = cqjVar.e();
            byte[] bArrCopyOf = Arrays.copyOf(bArrD, bArrD.length + bArrE.length);
            System.arraycopy(bArrE, 0, bArrCopyOf, bArrD.length, bArrE.length);
            cVar.a(bArrCopyOf);
        } catch (yib unused) {
            LogUtil.e("HiWearEngineCalendarManager", "sendMessage WearEngineException");
        }
        b(cVar.c());
    }

    private void b() {
        LogUtil.a("HiWearEngineCalendarManager", "tryAgainUpdated: try again SYNC UPDATE failed count:", Integer.valueOf(this.f42211b.get()));
        if (this.f42211b.incrementAndGet() > 3) {
            this.f42211b.set(0);
            mrf.d().c();
        } else {
            c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1);
        }
    }

    public void b(xiu xiuVar) {
        LogUtil.a("HiWearEngineCalendarManager", "sendCommandToDevice");
        sendComand(xiuVar, new SendCallback() { // from class: mqy.2
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d("R_HiWearEngineCalendarManager", "sendCommandToDevice errorCode:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.d("HiWearEngineCalendarManager", "sendCommandToDevice progress:", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HiWearEngineCalendarManager", "sendCommandToDevice onFileTransferReport transferWay: ", str);
            }
        });
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        ReleaseLogUtil.d("R_HiWearEngineCalendarManager", "onReceiveDeviceCommand errorCode:", Integer.valueOf(i), Integer.valueOf(xiuVar.c()));
        if (xiuVar.c() == 2) {
            LogUtil.a("HiWearEngineCalendarManager", "onReceiveDeviceCommand MESSAGE_TYPE_FILE SUCCESS.");
            a(deviceInfo, xiuVar);
            return;
        }
        byte[] bArrB = xiuVar.b();
        cpl.d("HiWearEngineCalendarManager", bArrB, "onReceiveDeviceCommand: ");
        if (bArrB == null) {
            return;
        }
        byte b2 = bArrB[0];
        int length = bArrB.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrB, 1, bArr, 0, length);
        if (b2 == 1) {
            c(bArr, deviceInfo);
        } else if (b2 == 3) {
            e(bArr);
        } else {
            LogUtil.e("HiWearEngineCalendarManager", "wrong commandId in payload");
            xjt.i("wrong commandId in payload");
        }
    }

    private void a(final DeviceInfo deviceInfo, final xiu xiuVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mqy.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    DeviceCalendarSyncInfo deviceCalendarSyncInfo = (DeviceCalendarSyncInfo) new Gson().fromJson(mrh.a(xiuVar.e()), DeviceCalendarSyncInfo.class);
                    LogUtil.a("HiWearEngineCalendarManager", "receive event count = ", Integer.valueOf(deviceCalendarSyncInfo.getCount()));
                    LogUtil.a("HiWearEngineCalendarManager", "insert device's event to phone succeed?", Boolean.valueOf(mrf.d().a(deviceInfo, deviceCalendarSyncInfo, BaseApplication.getContext())));
                } catch (Exception e2) {
                    LogUtil.e("HiWearEngineCalendarManager", "receive json and parse, catch exception", ExceptionUtils.c(e2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, boolean z) {
        LogUtil.a("HiWearEngineCalendarManager", "onTransferredSucceed:");
        mrf mrfVarD = mrf.d();
        String strB = mra.b(z);
        if (i == 207) {
            mrfVarD.a(this.d, strB, z);
            mri.e(true);
            mrfVarD.c();
            mrf.d().a().remove(strB);
            return;
        }
        mrf.d().a().remove(strB);
        mrf.d().f();
        b();
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        boolean zH = mri.h();
        try {
            int iE = -1;
            int iE2 = -1;
            int iE3 = -1;
            int iE4 = 0;
            for (cqi cqiVar : new cql().b(bArr).d()) {
                byte bC = cqiVar.c();
                if (bC == 1) {
                    iE2 = cph.e(cqiVar.d(), -1);
                    LogUtil.a("HiWearEngineCalendarManager", "operate value is: ", Integer.valueOf(iE2));
                } else if (bC == 2) {
                    this.d = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                    LogUtil.a("HiWearEngineCalendarManager", "major version");
                } else if (bC == 3) {
                    iE3 = cph.e(cqiVar.d(), -1);
                    LogUtil.a("HiWearEngineCalendarManager", "minor version is: ", Integer.valueOf(iE3));
                } else if (bC == 4) {
                    iE = cph.e(cqiVar.d(), -1);
                    LogUtil.a("HiWearEngineCalendarManager", "schedule_count value is: ", Integer.valueOf(iE));
                } else if (bC == 5) {
                    iE4 = cph.e(cqiVar.d(), 0);
                    LogUtil.a("HiWearEngineCalendarManager", "syncDay value is: ", Integer.valueOf(iE4));
                }
            }
            if (iE2 != -1 && this.d != null && iE3 != -1 && iE != -1) {
                if (deviceInfo == null) {
                    return;
                }
                if (iE2 == 3) {
                    c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 3);
                }
                if (iE2 == 2 || iE2 == 3) {
                    c(deviceIdentify, iE, iE4, zH, deviceInfo);
                    return;
                }
                return;
            }
            LogUtil.e("HiWearEngineCalendarManager", "payload data lake parameters ");
        } catch (cpy e2) {
            LogUtil.e("HiWearEngineCalendarManager", "calendarVersionRequest Exception ", ExceptionUtils.c(e2));
            xjt.i("calendarVersionRequest Exception");
        }
    }

    private void c(String str, final int i, final int i2, final boolean z, final DeviceInfo deviceInfo) {
        final String strD = mri.d(str, z);
        Boolean bool = mrf.d().a().get(strD);
        if (bool != null && bool.booleanValue()) {
            ReleaseLogUtil.d("R_HiWearEngineCalendarManager", "SyncCalendarData data syncing");
        } else {
            mrf.d().a().put(strD, true);
            ThreadPoolManager.c().execute(new Runnable() { // from class: mqy.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("HiWearEngineCalendarManager", "calendarVersionRequest getSingleFrameDevice: ", Integer.valueOf(deviceInfo.getSingleFrameDevice()));
                    if (!z || !CommonUtil.bg() || deviceInfo.getSingleFrameDevice() != 0) {
                        mqy.this.b(strD, i, i2, z);
                        return;
                    }
                    mqs.b(BaseApplication.getContext());
                    mrf.d().a().remove(strD);
                    ReleaseLogUtil.e("R_HiWearEngineCalendarManager", "onDeviceDisconnected: do not support calendar synchronization.");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final int i, final int i2, final boolean z) {
        synchronized (e) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("900100019");
            qhq.b("9001", arrayList, new HiDataReadResultListener() { // from class: mqy.6
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i3, Object obj, int i4, int i5) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i3, int i4) {
                    LogUtil.a("HiWearEngineCalendarManager", "onResult errorCode: ", Integer.valueOf(i3), ", data: ", obj);
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (!njy.e(list) && njy.b(obj, HiSampleConfig.class)) {
                            boolean zEquals = "1".equals(ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "calendarToDeviceSwitch"));
                            ReleaseLogUtil.d("R_HiWearEngineCalendarManager", "getSampleConfig  CalendarSwitch: ", Boolean.valueOf(zEquals));
                            if (zEquals) {
                                mrf.d().a(str, mqy.this.d, i, i2, z);
                                mrf.d().b(BaseApplication.getContext());
                                return;
                            }
                        }
                    }
                    mqy.d().c(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 7);
                    mrf.d().a().remove(str);
                }
            });
        }
    }

    private void e(byte[] bArr) {
        cpl.d("HiWearEngineCalendarManager", bArr, "calendarVersionRequest: ");
        try {
            String strTrim = "";
            String strTrim2 = "";
            String strTrim3 = strTrim2;
            String strTrim4 = strTrim3;
            int iE = -1;
            for (cqi cqiVar : new cql().b(bArr).d()) {
                switch (cqiVar.c()) {
                    case 1:
                        strTrim = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                        LogUtil.a("HiWearEngineCalendarManager", "eventId value is: ", strTrim);
                        break;
                    case 2:
                        strTrim2 = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                        LogUtil.a("HiWearEngineCalendarManager", "calendarId version is: ", strTrim2);
                        break;
                    case 3:
                        strTrim4 = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                        LogUtil.a("HiWearEngineCalendarManager", "account_name version is: ", strTrim4);
                        break;
                    case 4:
                        strTrim3 = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                        LogUtil.a("HiWearEngineCalendarManager", "account_type value is: ", strTrim3);
                        break;
                    case 5:
                        iE = cph.e(cqiVar.d(), -1);
                        LogUtil.a("HiWearEngineCalendarManager", "state value is: ", Integer.valueOf(iE));
                        break;
                    case 6:
                        LogUtil.a("HiWearEngineCalendarManager", "eventUuid value is: ", new String(cqiVar.d(), StandardCharsets.UTF_8).trim());
                        break;
                }
            }
            if (!mtz.b(strTrim) && !mtz.b(strTrim2) && iE != -1 && !mtz.b(strTrim3) && !mtz.b(strTrim4)) {
                return;
            }
            LogUtil.e("HiWearEngineCalendarManager", "payload data lake parameters ");
        } catch (cpy unused) {
            LogUtil.e("HiWearEngineCalendarManager", "catch TlvException");
            xjt.i("catch TlvException");
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.CALENDAR_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return mri.h() ? "com.huawei.ohos.calendar" : "in.huawei.calendar";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return mri.h() ? "com.huawei.ohos.calendar_BCgpfcWNSKWgvxsSILxooQZyAmKYsFQnMTibnfrKQqK9M0ABtXH+GbsOscsnVvVc5qIDiFEyEOYMSF7gJ7Vb5Mc=" : OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HiWearEngineCalendarManager", "onDeviceConnectionChange");
    }
}
