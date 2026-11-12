package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.devicelink.bean.ResponseMsgBody;
import com.huawei.basichealthmodel.devicelink.bean.TaskBean;
import com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelReportMessage;
import com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestBody;
import com.huawei.basichealthmodel.devicelink.pbjava.request.HealthModelRequestMessage;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bxp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bxp f1288c;
    private static final Object d = new Object();
    private static long e;
    private volatile int g;
    private boolean h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f1290b = new Handler(Looper.getMainLooper());
    private final Runnable i = new Runnable() { // from class: bxp.5
        @Override // java.lang.Runnable
        public void run() {
            bxp.this.g = 0;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f1289a = new Runnable() { // from class: bxv
        @Override // java.lang.Runnable
        public final void run() {
            bxi.d("");
        }
    };

    private bxp() {
    }

    public static bxp b() {
        if (f1288c == null) {
            synchronized (d) {
                if (f1288c == null) {
                    f1288c = new bxp();
                }
            }
        }
        return f1288c;
    }

    public void b(int i) {
        this.g = i;
    }

    public void e(int i, xiu xiuVar) {
        ByteString msgBody;
        HealthModelRequestBody.c cVarA;
        LogUtil.a("HL_PolicyControl", "receiveDataFromDevice code ", Integer.valueOf(i), " p2pMessage ", xiuVar);
        if (i != 530003 || xiuVar == null) {
            return;
        }
        byte[] bArrB = xiuVar.b();
        if (bArrB == null || bArrB.length <= 0) {
            ReleaseLogUtil.d("R_HL_PolicyControl", "receiveDataFromDevice messageData ", bArrB);
            return;
        }
        try {
            HealthModelRequestMessage.Request from = HealthModelRequestMessage.Request.parseFrom(bArrB);
            LogUtil.a("HL_PolicyControl", "receiveDataFromDevice request ", from);
            if (from != null && from.getMsgType() == 2001) {
                double msgVer = from.getMsgVer();
                ccy.c("health_model_device_link_version", String.valueOf(msgVer));
                if (!c(msgVer) && (msgBody = from.getMsgBody()) != null && (cVarA = HealthModelRequestBody.c.a(msgBody)) != null) {
                    int packageSize = msgVer >= 3.0d ? cVarA.getPackageSize() : 0;
                    int pageSize = cVarA.getPageSize();
                    int recordDay = cVarA.getRecordDay();
                    String requestTaskIds = cVarA.getRequestTaskIds();
                    ccy.c("health_model_device_link_package_size", String.valueOf(packageSize));
                    LogUtil.a("HL_PolicyControl", "receiveDataFromDevice packageSize ", Integer.valueOf(packageSize), " pageSize ", Integer.valueOf(pageSize), " recordDay ", Integer.valueOf(recordDay), " requestId ", requestTaskIds, " version ", Double.valueOf(msgVer));
                    d(recordDay, requestTaskIds, pageSize, msgVer, packageSize);
                    return;
                }
                return;
            }
            ReleaseLogUtil.d("R_HL_PolicyControl", "receiveDataFromDevice request is null or not 2001 type");
        } catch (InvalidProtocolBufferException e2) {
            ReleaseLogUtil.b("R_HL_PolicyControl", "receiveDataFromDevice exception ", ExceptionUtils.c(e2));
        }
    }

    private boolean c(double d2) throws Throwable {
        if (!cbg.ae() || d2 >= 3.0d) {
            return false;
        }
        ReleaseLogUtil.d("R_HL_PolicyControl", "sendLowVersionMessageToDevice version ", Double.valueOf(d2));
        e(1, cch.e(2001, 99999, qre.f(R.string.IDS_device_version_low_new)), null, 0);
        return true;
    }

    public void e(int i, ResponseMsgBody responseMsgBody) {
        ReleaseLogUtil.c("R_HL_PolicyControl", "activeSendMsgToDevice action ", Integer.valueOf(i), " mSyncStatus ", Integer.valueOf(this.g));
        if (i == 1 && this.g == 1) {
            return;
        }
        c(i, responseMsgBody, (ResponseCallback<ResponseMsgBody>) null);
    }

    public void c(final int i, final ResponseMsgBody responseMsgBody, final ResponseCallback<ResponseMsgBody> responseCallback) {
        bxb.a().pingComand(new PingCallback() { // from class: bxu
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public final void onPingResult(int i2) {
                this.f1303c.a(i, responseMsgBody, responseCallback, i2);
            }
        }, "com.huawei.health.healthyliving");
    }

    /* synthetic */ void a(final int i, final ResponseMsgBody responseMsgBody, final ResponseCallback responseCallback, int i2) {
        ReleaseLogUtil.c("R_HL_PolicyControl", "activeSendMsgToDevice code ", Integer.valueOf(i2));
        if (i2 == 202) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: bxs
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f1301c.e(i, responseMsgBody, responseCallback);
                }
            }, 1000L);
        } else if (responseCallback != null) {
            responseCallback.onResponse(-1, responseMsgBody);
        }
    }

    /* synthetic */ void e(int i, ResponseMsgBody responseMsgBody, ResponseCallback responseCallback) throws Throwable {
        e(i, responseMsgBody, responseCallback, 0);
    }

    private void e(int i, ResponseMsgBody responseMsgBody, ResponseCallback<ResponseMsgBody> responseCallback, int i2) throws Throwable {
        ReleaseLogUtil.c("R_HL_PolicyControl", "sendMsgToDevice action ", Integer.valueOf(i), " callback ", responseCallback, " packageSize ", Integer.valueOf(i2));
        if (responseMsgBody == null) {
            if (responseCallback != null) {
                responseCallback.onResponse(-1, null);
                return;
            }
            return;
        }
        LogUtil.a("HL_PolicyControl", "sendMsgToDevice msgBody ", responseMsgBody.toString());
        if (i == 1) {
            this.g = 1;
            this.f1290b.postDelayed(this.i, 9000L);
        }
        if (i2 > 0) {
            d(i, responseMsgBody, responseCallback, i2);
        } else {
            a(i, responseMsgBody, responseCallback);
        }
    }

    private void a(int i, ResponseMsgBody responseMsgBody, ResponseCallback<ResponseMsgBody> responseCallback) {
        HealthModelReportMessage.Report reportC = cch.c(responseMsgBody);
        xiu.c cVar = new xiu.c();
        byte[] byteArray = reportC.toByteArray();
        cVar.a(byteArray);
        ReleaseLogUtil.c("R_HL_PolicyControl", "packing action ", Integer.valueOf(i), " byteArraySize ", Integer.valueOf(cch.c(byteArray)));
        c(cVar, i, responseCallback, responseMsgBody);
    }

    private void d(int i, ResponseMsgBody responseMsgBody, ResponseCallback<ResponseMsgBody> responseCallback, int i2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        List<TaskBean> tasks = responseMsgBody.getTasks();
        LogUtil.a("HL_PolicyControl", "unPacking unPackingList ", tasks);
        if (njy.e(tasks)) {
            a(i, responseMsgBody, responseCallback);
            return;
        }
        byte[] byteArray = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    try {
                        Iterator<TaskBean> it = tasks.iterator();
                        while (it.hasNext()) {
                            dataOutputStream.writeUTF(it.next().toString());
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (IOException e2) {
                        e = e2;
                        ReleaseLogUtil.b("R_HL_PolicyControl", "unPacking exception ", ExceptionUtils.c(e));
                    }
                } catch (Throwable th) {
                    th = th;
                    cpm.d(byteArrayOutputStream);
                    cpm.d(dataOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                dataOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
                cpm.d(byteArrayOutputStream);
                cpm.d(dataOutputStream);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        }
        cpm.d(byteArrayOutputStream);
        cpm.d(dataOutputStream);
        LogUtil.a("HL_PolicyControl", "unPacking byteArray ", byteArray);
        if (byteArray == null) {
            a(i, responseMsgBody, responseCallback);
            return;
        }
        int iC = cch.c(byteArray) / i2;
        for (int i3 = 0; i3 < iC + 1; i3++) {
            if (njy.e(tasks)) {
                ReleaseLogUtil.d("R_HL_PolicyControl", "unPacking unPackingList ", tasks);
                break;
            }
            HealthModelReportMessage.Report reportA = cch.a(responseMsgBody, i2, tasks);
            xiu.c cVar = new xiu.c();
            byte[] byteArray2 = reportA.toByteArray();
            cVar.a(byteArray2);
            LogUtil.a("HL_PolicyControl", "unPacking index ", Integer.valueOf(i3), " reportByteArray ", Integer.valueOf(cch.c(byteArray2)));
            c(cVar, i, responseCallback, responseMsgBody);
        }
    }

    private void c(xiu.c cVar, final int i, final ResponseCallback<ResponseMsgBody> responseCallback, final ResponseMsgBody responseMsgBody) {
        bxb.a().sendComand(cVar.c(), new SendCallback() { // from class: bxp.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                ReleaseLogUtil.c("R_HL_PolicyControl", "sendCommanded onSendResult code ", Integer.valueOf(i2), " action ", Integer.valueOf(i), " mSyncStatus ", Integer.valueOf(bxp.this.g), " callback ", responseCallback);
                if (i == 1) {
                    bxp.this.g = 0;
                    bxp.this.f1290b.removeCallbacks(bxp.this.i);
                }
                if (i == 3) {
                    bxp.this.f1290b.removeCallbacks(bxp.this.f1289a);
                }
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 != null) {
                    responseCallback2.onResponse(i2 != 207 ? -1 : 0, responseMsgBody);
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("HL_PolicyControl", "sendCommanded onSendProgress progress ", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HL_PolicyControl", "sendCommanded onFileTransferReport transferWay ", str);
            }
        });
    }

    public void o() {
        j();
        i();
        l();
    }

    public void j() {
        if (!ffv.d("healthLifeThreeLeafSwitch", true)) {
            ReleaseLogUtil.d("R_HL_PolicyControl", "sendDeviceCelebratingMsg switch is closed");
            return;
        }
        if (jyc.c().f()) {
            return;
        }
        long jI = CommonUtil.i(ccy.g("health_model_device_celebrating"));
        if (jI > 0) {
            this.f1290b.postDelayed(this.f1289a, 9000L);
            ReleaseLogUtil.d("R_HL_PolicyControl", "sendDeviceCelebratingMsg lastResult ", Long.valueOf(jI));
        } else {
            bxi.d(String.valueOf(System.currentTimeMillis()));
            c();
            bxi.d();
        }
    }

    public void i() {
        c();
        bxi.a();
    }

    public void l() {
        c();
        bxi.c();
    }

    public void n() {
        c();
        if (!this.h) {
            LogUtil.a("HL_PolicyControl", "sendDeviceTaskDataCache not support");
            return;
        }
        String strG = ccy.g("health_model_device_link_version");
        LogUtil.a("HL_PolicyControl", "sendDeviceTaskDataCache version ", strG);
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        String strG2 = ccy.g("health_model_device_link_package_size");
        LogUtil.a("HL_PolicyControl", "sendDeviceTaskDataCache packageSize ", strG2);
        if (this.g == 1) {
            ReleaseLogUtil.d("R_HL_PolicyControl", "sendDeviceTaskDataCache last task is doing");
            return;
        }
        b bVar = new b();
        bVar.f1295b = DateFormatUtil.a(System.currentTimeMillis());
        bVar.d = null;
        bVar.f1294a = 0;
        bVar.f = CommonUtil.a(strG);
        bVar.f1296c = CommonUtil.j(strG2);
        bVar.e = true;
        b(bVar);
    }

    private void b(final b bVar) {
        if (!jyc.c().f()) {
            bxi.a(DateFormatUtil.a(System.currentTimeMillis()), bVar.d, 0, bVar.e, (ResponseCallback<ResponseMsgBody>) new ResponseCallback() { // from class: bxx
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) throws Throwable {
                    this.e.c(bVar, i, (ResponseMsgBody) obj);
                }
            });
        } else {
            bxi.d(bVar.d, 0, (ResponseCallback<ResponseMsgBody>) new ResponseCallback() { // from class: bxy
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) throws Throwable {
                    this.f1306c.e(bVar, i, (ResponseMsgBody) obj);
                }
            });
        }
    }

    /* synthetic */ void e(b bVar, int i, ResponseMsgBody responseMsgBody) throws Throwable {
        LogUtil.a("HL_PolicyControl", "requestTasksData version 1 resultCode ", Integer.valueOf(i), "jsonMessage", HiJsonUtil.d(responseMsgBody));
        if (responseMsgBody != null) {
            responseMsgBody.setMsgVer(4.0d);
        }
        e(1, responseMsgBody, null, bVar.f1296c);
    }

    /* synthetic */ void c(b bVar, int i, ResponseMsgBody responseMsgBody) throws Throwable {
        LogUtil.a("HL_PolicyControl", "requestTasksData version 0 resultCode ", Integer.valueOf(i));
        if (responseMsgBody != null) {
            responseMsgBody.setMsgVer(bVar.f);
        }
        e(1, responseMsgBody, null, bVar.f1296c);
    }

    public void h() {
        c();
        if (!this.h) {
            LogUtil.a("HL_PolicyControl", "sendDeviceTaskData not support");
            return;
        }
        String strG = ccy.g("health_model_device_link_version");
        LogUtil.a("HL_PolicyControl", "sendDeviceTaskData version ", strG);
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        String strG2 = ccy.g("health_model_device_link_package_size");
        LogUtil.a("HL_PolicyControl", "sendDeviceTaskData packageSize ", strG2);
        d(DateFormatUtil.a(System.currentTimeMillis()), null, 0, CommonUtil.a(strG), CommonUtil.j(strG2));
    }

    public void d(int i, String str, int i2, double d2, int i3) {
        if (this.g == 1) {
            ReleaseLogUtil.d("R_HL_PolicyControl", "sendDeviceTaskData last task is sync doing");
            return;
        }
        b bVar = new b();
        bVar.f1295b = i;
        bVar.d = str;
        bVar.f1294a = i2;
        bVar.f = d2;
        bVar.f1296c = i3;
        bVar.e = false;
        b(bVar);
    }

    public boolean f() {
        LogUtil.a("HL_PolicyControl", "isSupportHealthModel mIsSupportCapability ", Boolean.valueOf(this.h));
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public void c() {
        if (this.h) {
            return;
        }
        boolean zD = eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HL_PolicyControl"), 37);
        this.h = zD;
        if (zD) {
            bxb.a();
        }
        LogUtil.a("HL_PolicyControl", "initSupportCapability mIsSupportCapability ", Boolean.valueOf(this.h));
    }

    public boolean a() {
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HL_PolicyControl"), 303);
    }

    public void g() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HL_PolicyControl");
        LogUtil.a("HL_PolicyControl", "registerHealthLife deviceInfo ", deviceInfo);
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.a("HL_PolicyControl", "registerHealthLife device disconnected");
            return;
        }
        this.g = 0;
        boolean zD = eey.d(deviceInfo, 37);
        this.h = zD;
        LogUtil.a("HL_PolicyControl", "registerHealthLife mIsSupportCapability ", Boolean.valueOf(zD));
        if (this.h) {
            bxb.a();
            n();
        }
    }

    public void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("HL_PolicyControl", "deviceRequestRegister currentTimeMillis ", Long.valueOf(jCurrentTimeMillis), " sLastRequestTime ", Long.valueOf(e));
        if (jCurrentTimeMillis - e < 12000) {
            return;
        }
        e = jCurrentTimeMillis;
        bxb.a().a("HL_PolicyControl");
        this.h = true;
        bxb.a();
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1296c;
        private String d;
        private boolean e;
        private double f;

        private b() {
        }
    }
}
