package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.clockwork.companion.partnerapi.PartnerApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbtsdk.btdatatype.callback.IBindPartnerServiceCallback;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class ymq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static PartnerApi f53639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f53640c = new Object();
    private static ymq d;

    private ymq() {
    }

    public static ymq b() {
        ymq ymqVar;
        synchronized (f53640c) {
            LogUtil.b("CommunicationManager", "getInstance() ");
            if (d == null) {
                d = new ymq();
            }
            ymqVar = d;
        }
        return ymqVar;
    }

    public void d(IBindPartnerServiceCallback iBindPartnerServiceCallback) {
        if (iBindPartnerServiceCallback == null) {
            return;
        }
        if (f53639b != null) {
            LogUtil.b("CommunicationManager", "mApi is not null");
            iBindPartnerServiceCallback.onBinderResponse(f53639b);
            return;
        }
        Intent intent = new Intent();
        if (a()) {
            intent.setPackage("com.google.android.wearable.app.cn");
        } else {
            intent.setPackage("com.google.android.wearable.app");
        }
        intent.setAction("com.google.android.wearable.app.action.INVOKE_PARTNER_API");
        try {
            LogUtil.b("CommunicationManager", "getPartnerService bind begin");
            LogUtil.b("CommunicationManager", "bind flag : ", Boolean.valueOf(BaseApplication.b().bindService(intent, new e(iBindPartnerServiceCallback), 1)));
        } catch (SecurityException e2) {
            LogUtil.b("CommunicationManager", "bind partner service error, ", e2.getMessage());
        }
    }

    public static class e implements ServiceConnection {
        private IBindPartnerServiceCallback e;

        public e(IBindPartnerServiceCallback iBindPartnerServiceCallback) {
            this.e = iBindPartnerServiceCallback;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.b("CommunicationManager", "ServiceConnection callback");
            PartnerApi partnerApiAsInterface = PartnerApi.Stub.asInterface(iBinder);
            PartnerApi unused = ymq.f53639b = partnerApiAsInterface;
            IBindPartnerServiceCallback iBindPartnerServiceCallback = this.e;
            if (iBindPartnerServiceCallback != null) {
                iBindPartnerServiceCallback.onBinderResponse(partnerApiAsInterface);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.b("CommunicationManager", "onServiceDisconnected callback");
            PartnerApi unused = ymq.f53639b = null;
        }
    }

    private boolean a() {
        PackageInfo packageInfo;
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app.cn", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d("CommunicationManager", "isChinaApp() androidWearNameCn, error NameNotFoundException.");
            try {
                packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                LogUtil.d("CommunicationManager", "isChinaApp() androidWearName, error NameNotFoundException.");
                packageInfo = null;
            }
        }
        return (packageInfo == null || packageInfo.packageName == null || !packageInfo.packageName.equals("com.google.android.wearable.app.cn")) ? false : true;
    }
}
