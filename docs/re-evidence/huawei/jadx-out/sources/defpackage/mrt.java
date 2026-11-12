package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes11.dex */
public class mrt extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile mrt f42297c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42298a;
    public int d;
    private ExtendHandler f;
    private d g;
    private volatile boolean h;
    private String j;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Object f42296b = new Object();

    private mrt(Context context) {
        super(context);
        this.j = "";
        d dVar = new d();
        this.g = dVar;
        this.f = HandlerCenter.b(dVar, "HiWearEngineSportContactManager");
    }

    public static mrt a() {
        mrt mrtVar;
        synchronized (e) {
            if (f42297c == null) {
                f42297c = new mrt(BaseApplication.getContext());
            }
            mrtVar = f42297c;
        }
        return mrtVar;
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("HiWearEngineSportContactManager", "message is null");
                return false;
            }
            LogUtil.a("HiWearEngineSportContactManager", "handleMessage message is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 100) {
                mrt.this.n();
                return true;
            }
            if (i == 200) {
                mrt.this.f();
                return true;
            }
            LogUtil.j("HiWearEngineSportContactManager", "handleMessage default");
            return false;
        }
    }

    public void h() {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(100, 720000L);
        }
    }

    public void b() {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeMessages(100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        String strE = mtn.e();
        if ("00:00:00:00:00:00".equals(strE)) {
            c();
            return;
        }
        mub.e().b().remove(strE);
        mub.b(strE, 0L);
        try {
            mtg.a(BaseApplication.getContext()).d(strE + "_sport");
        } catch (Exception unused) {
            mub.e().c("HiWearEngineSportContactManagertrigger off handleSyncTimeout deleteDb fail, reason: unknow");
            String strOrElse = mub.e().b().keySet().stream().findFirst().orElse(null);
            if (strOrElse != null && !strOrElse.equals(strE)) {
                mub.e().c("HiWearEngineSportContactManagertrigger off handleSyncTimeout deleteDb fail, reason: deviceId changed");
            }
        }
        this.h = false;
    }

    public void c() {
        mub.e().b().clear();
        this.h = false;
    }

    public void i() {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(200, 60000L);
        }
    }

    public void d() {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeMessages(200);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        mub.e().b().remove(mtn.e());
    }

    public void c(int i) {
        ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "send operate=2 result is : ", Integer.valueOf(i));
        xiu.c cVar = new xiu.c();
        try {
            StringBuffer stringBuffer = new StringBuffer(16);
            String strB = cph.b(1);
            String strB2 = cph.b(2);
            String strC = cph.c(strB2.length() / 2);
            stringBuffer.append(strB);
            stringBuffer.append(strC);
            stringBuffer.append(strB2);
            String strB3 = cph.b(8);
            String strB4 = cph.b(i);
            String strC2 = cph.c(strB4.length() / 2);
            stringBuffer.append(strB3);
            stringBuffer.append(strC2);
            stringBuffer.append(strB4);
            ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "send operate=2 message is : ", stringBuffer.toString());
            cVar.a(cph.d(stringBuffer.toString()));
        } catch (yib unused) {
            ReleaseLogUtil.a("R_HiWearEngineSportContactManager", "sync sport contact sendMessage WearEngineException");
            mub.e().c("HiWearEngineSportContactManager sync contact sendMessage WearEngineException");
        }
        c(cVar.c());
    }

    public void j() {
        ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "send operate=1 ");
        xiu.c cVar = new xiu.c();
        try {
            StringBuffer stringBuffer = new StringBuffer(16);
            String strB = cph.b(1);
            String strB2 = cph.b(1);
            String strC = cph.c(strB2.length() / 2);
            stringBuffer.append(strB);
            stringBuffer.append(strC);
            stringBuffer.append(strB2);
            String strB3 = cph.b(5);
            String strB4 = cph.b(2);
            String strC2 = cph.c(strB2.length() / 2);
            stringBuffer.append(strB3);
            stringBuffer.append(strC2);
            stringBuffer.append(strB4);
            String strB5 = cph.b(6);
            String strB6 = cph.b(1);
            String strC3 = cph.c(strB2.length() / 2);
            stringBuffer.append(strB5);
            stringBuffer.append(strC3);
            stringBuffer.append(strB6);
            ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "send operate=1 message is : ", stringBuffer.toString());
            cVar.a(cph.d(stringBuffer.toString()));
        } catch (yib unused) {
            ReleaseLogUtil.a("R_HiWearEngineSportContactManager", "sync sport change contact sendMessage WearEngineException");
            mub.e().c("HiWearEngineSportContactManager sync change contact sendMessage WearEngineException");
        }
        c(cVar.c());
    }

    public void g() {
        ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "send operate=4 ");
        xiu.c cVar = new xiu.c();
        try {
            StringBuffer stringBuffer = new StringBuffer(16);
            String strB = cph.b(1);
            String strB2 = cph.b(4);
            String strC = cph.c(strB2.length() / 2);
            stringBuffer.append(strB);
            stringBuffer.append(strC);
            stringBuffer.append(strB2);
            ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "send operate=4 message is : ", stringBuffer.toString());
            cVar.a(cph.d(stringBuffer.toString()));
        } catch (yib unused) {
            ReleaseLogUtil.a("R_HiWearEngineSportContactManager", "sync sport delete all contact sendMessage WearEngineException");
            mub.e().c("HiWearEngineSportContactManager sync delete all contact sendMessage WearEngineException");
        }
        i();
        c(cVar.c());
    }

    public void e(String str) {
        LogUtil.a("HiWearEngineSportContactManager", "sendContactFileToDevice begin");
        h();
        xiu.c cVar = new xiu.c();
        cVar.a(new File(str));
        sendComand(cVar.c(), new SendCallback() { // from class: mrt.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "sendContactFileToDevice errorCode:", Integer.valueOf(i));
                mub.e().b(i);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a("HiWearEngineSportContactManager", "sendContactFileToDevice progress:", Long.valueOf(j));
            }
        });
        LogUtil.a("HiWearEngineSportContactManager", "sendContactFileToDevice end");
    }

    public void c(xiu xiuVar) {
        LogUtil.a("HiWearEngineSportContactManager", "sendCommandToDevice");
        sendComand(xiuVar, new SendCallback() { // from class: mrt.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "sendCommandToDevice errorCode:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.d("HiWearEngineSportContactManager", "sendCommandToDevice progress:", Long.valueOf(j));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HiWearEngineSportContactManager", "sendCommandToDevice onFileTransferReport transferWay: ", str);
            }
        });
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "onReceiveDeviceCommand errorCode:", Integer.valueOf(i), Integer.valueOf(xiuVar.c()));
        byte[] bArrB = xiuVar.b();
        LogUtil.a("HiWearEngineSportContactManager", bArrB, "onReceiveDeviceCommand is : ");
        if (bArrB == null) {
            return;
        }
        int length = bArrB.length;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrB, 0, bArr, 0, length);
        try {
            cqk cqkVarB = new cql().b(bArr);
            int iE = -1;
            for (cqi cqiVar : cqkVarB.d()) {
                if (cqiVar.c() == 1) {
                    iE = cph.e(cqiVar.d(), -1);
                    ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "receive device send operate value is: ", Integer.valueOf(iE));
                }
            }
            if (iE == -1) {
                LogUtil.e("HiWearEngineSportContactManager", "payload data is invalid ");
                return;
            }
            if (deviceInfo == null) {
                LogUtil.e("HiWearEngineSportContactManager", "deviceInfo is null ");
                return;
            }
            if (iE == 1) {
                a(cqkVarB);
                return;
            }
            if (iE == 2) {
                d(cqkVarB);
                return;
            }
            if (iE == 3) {
                b();
                b(cqkVarB);
            } else if (iE == 4) {
                d();
                c(cqkVarB);
            } else {
                LogUtil.j("HiWearEngineSportContactManager", "unknown operate : ");
            }
        } catch (cpy e2) {
            ReleaseLogUtil.a("R_HiWearEngineSportContactManager", "onReceiveDeviceCommand Exception ", ExceptionUtils.c(e2));
            mub.e().c("HiWearEngineSportContactManager onReceiveDeviceCommand Exception");
        }
    }

    private void c(cqk cqkVar) {
        int iE = -1;
        for (cqi cqiVar : cqkVar.d()) {
            if (cqiVar.c() == 8) {
                iE = cph.e(cqiVar.d(), -1);
                ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "deleteAllResult result value is: ", Integer.valueOf(iE));
            }
        }
        String strE = mtn.e();
        if (iE == 0) {
            mtg.a(BaseApplication.getContext()).d(strE + "_sport");
            mub.b(strE, System.currentTimeMillis());
            mti.b(strE, 16);
        } else {
            mub.e().c("HiWearEngineSportContactManager receive device send delete all fail result is " + iE);
        }
        mub.e().b().remove(strE);
    }

    private void d(cqk cqkVar) {
        int iE = -1;
        for (cqi cqiVar : cqkVar.d()) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                iE = cph.e(cqiVar.d(), -1);
                LogUtil.a("HiWearEngineSportContactManager", "operate value is: ", Integer.valueOf(iE));
            } else if (bC == 2) {
                String strTrim = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                this.j = strTrim;
                LogUtil.a("HiWearEngineSportContactManager", "major version is: ", strTrim);
            } else if (bC == 3) {
                int iE2 = cph.e(cqiVar.d(), -1);
                this.d = iE2;
                LogUtil.a("HiWearEngineSportContactManager", "minor version is: ", Integer.valueOf(iE2));
            } else if (bC == 4) {
                int iE3 = cph.e(cqiVar.d(), -1);
                this.f42298a = iE3;
                LogUtil.a("HiWearEngineSportContactManager", "count value is: ", Integer.valueOf(iE3));
            }
        }
        String strE = mtn.e();
        if (iE == -1) {
            LogUtil.e("HiWearEngineSportContactManager", "operate value is invalid ");
            return;
        }
        int iC = mub.e().c(strE, true);
        LogUtil.a("HiWearEngineSportContactManager", "syncAllContacts check precondition code is : ", Integer.valueOf(iC));
        c(iC);
        if (iC != 0) {
            ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "syncAllContacts check precondition is fail : ", Integer.valueOf(iC));
            mub.e().c("HiWearEngineSportContactManager syncAllContacts check precondition is fail,code is " + iC);
            return;
        }
        mub.e().c(true);
    }

    private void b(cqk cqkVar) {
        int iE = -1;
        for (cqi cqiVar : cqkVar.d()) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                LogUtil.a("HiWearEngineSportContactManager", "operate value is: ", Integer.valueOf(cph.e(cqiVar.d(), -1)));
            } else if (bC == 8) {
                iE = cph.e(cqiVar.d(), -1);
                ReleaseLogUtil.d("R_HiWearEngineSportContactManager", "onCompleteAllFiles result value is: ", Integer.valueOf(iE));
            }
        }
        String strE = mtn.e();
        if (iE == 0) {
            mub.e().a(strE);
            mti.b(strE, 16);
            if (this.h) {
                this.h = false;
                mub.e().b(strE);
                return;
            }
            return;
        }
        mub.e().c("HiWearEngineSportContactManager receive device send sync fail result is " + iE);
        n();
    }

    public void e() {
        int iC = mub.e().c(mtn.e(), false);
        LogUtil.a("HiWearEngineSportContactManager", "syncChangeContacts precondition code is : ", Integer.valueOf(iC));
        if (iC == 2) {
            this.h = true;
            return;
        }
        if (iC == 0) {
            mub.e().c(false);
            return;
        }
        mub.e().c("HiWearEngineSportContactManager syncChangeContacts fail precondition code is " + iC);
    }

    private void a(cqk cqkVar) {
        for (cqi cqiVar : cqkVar.d()) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                LogUtil.a("HiWearEngineSportContactManager", "operate value is: ", Integer.valueOf(cph.e(cqiVar.d(), -1)));
            } else if (bC == 2) {
                String strTrim = new String(cqiVar.d(), StandardCharsets.UTF_8).trim();
                this.j = strTrim;
                LogUtil.a("HiWearEngineSportContactManager", "major version is: ", strTrim);
            } else if (bC == 3) {
                int iE = cph.e(cqiVar.d(), -1);
                this.d = iE;
                LogUtil.a("HiWearEngineSportContactManager", "minor version is: ", Integer.valueOf(iE));
            } else if (bC == 4) {
                int iE2 = cph.e(cqiVar.d(), -1);
                this.f42298a = iE2;
                LogUtil.a("HiWearEngineSportContactManager", "count value is: ", Integer.valueOf(iE2));
            }
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: mrt.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HiWearEngineSportContactManager", "begin do syncChangeContacts ");
                String strE = mtn.e();
                String strA = mue.a(CommonUtil.k(BaseApplication.getContext()), 32);
                if (TextUtils.isEmpty(mrt.this.j) || !mrt.this.j.equals(strA)) {
                    Boolean bool = mub.e().b().get(strE);
                    if (bool == null || !bool.booleanValue()) {
                        mub.e().b().put(strE, true);
                        mub.e().d(strE, mrt.this.d, mrt.this.f42298a);
                        return;
                    }
                    return;
                }
                mub.e().b(strE);
            }
        });
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.CONTACT_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "in.huawei.contacts";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.j("HiWearEngineSportContactManager", "onDeviceConnectionChange");
    }
}
