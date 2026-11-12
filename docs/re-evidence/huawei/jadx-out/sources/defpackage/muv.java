package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcrowdtestapi.HealthSendLogCallback;
import health.compact.a.util.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class muv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static muv f42458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42459b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendHandler f42460c;
    private c d = new c(this, null);
    private int e = 0;

    private muv() {
    }

    public static muv e() {
        muv muvVar;
        synchronized (f42459b) {
            if (f42458a == null) {
                f42458a = new muv();
            }
            muvVar = f42458a;
        }
        return muvVar;
    }

    private void b() {
        this.f42460c = HandlerCenter.b(this.d, "FileUploadLogBeta");
    }

    public void b(Context context) {
        LogUtil.a("FileUploadLogBeta", "uploadZip enter");
        if (context == null) {
            LogUtil.d("FileUploadLogBeta", "uploadZip context is null");
            return;
        }
        if (mjq.e(context)) {
            LogUtil.d("FileUploadLogBeta", "uploadZip:isAuto isBatteryControl not upload");
            return;
        }
        mve.a().c(muy.e);
        boolean zE = mjh.e(context);
        LogUtil.a("FileUploadLogBeta", "uploadZip isWifi: ", Boolean.valueOf(zE));
        if (zE) {
            LogUtil.a("FileUploadLogBeta", "uploadLog External conditions met");
            d(muy.e, context);
        }
    }

    private void d(String str, Context context) throws Throwable {
        LogUtil.a("FileUploadLogBeta", "startUploadZipFile path: ", str);
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.d("FileUploadLogBeta", "dir is not exists");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.a("FileUploadLogBeta", "uploadZip files is null.");
            return;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (name.contains("_WearableBeta")) {
                if (!muy.a(name)) {
                    LogUtil.d("FileUploadLogBeta", "isUpload is false");
                } else {
                    String str2 = str + "/" + name;
                    lwq lwqVarD = mux.b().d((DeviceInfo) null, name, str2, muy.a(str2, context));
                    lwqVarD.d(name);
                    mux.b().d(lwqVarD);
                }
            }
        }
    }

    /* JADX INFO: renamed from: muv$1, reason: invalid class name */
    class AnonymousClass1 implements HealthSendLogCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ muv f42461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IBaseCommonCallback f42462c;
        final /* synthetic */ boolean e;

        @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
        public void onSuccess(String str) {
            LogUtil.a("FileUploadLogBeta", "uploadLogFile onSuccess uploadFileName: ", str);
            muy.e(str);
            if (!this.e) {
                muy.c(this.f42462c, 0, str);
            }
            this.f42461b.a();
        }

        @Override // com.huawei.hwcrowdtestapi.HealthSendLogCallback
        public void onFailed(String str) {
            LogUtil.a("FileUploadLogBeta", "uploadLogFile onFailed uploadFileName: ", str);
            if (!this.e) {
                muy.c(this.f42462c, 1, str);
            }
            this.f42461b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f42460c == null) {
            b();
        }
        int i = this.e;
        if (i >= 1) {
            int i2 = i - 1;
            this.e = i2;
            if (i2 == 0) {
                LogUtil.a("FileUploadLogBeta", "unInitSdkDeal count is 0");
                this.f42460c.removeMessages(1070);
                muy.a();
                return;
            }
            return;
        }
        LogUtil.a("FileUploadLogBeta", "unInitSdkDeal else");
        this.f42460c.removeMessages(1070);
        muy.a();
        this.e = 0;
    }

    class c implements Handler.Callback {
        private c() {
        }

        /* synthetic */ c(muv muvVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("FileUploadLogBeta", "UnInitSdkHandler handleMessage msg: ", Integer.valueOf(message.what));
            if (message.what == 1070) {
                muy.a();
                muv.this.e = 0;
                return true;
            }
            LogUtil.d("FileUploadLogBeta", "UnInitSdkHandler default");
            return false;
        }
    }
}
