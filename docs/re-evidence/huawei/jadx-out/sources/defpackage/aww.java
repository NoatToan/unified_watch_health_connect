package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.account.aidl.AccountAidlInfo;
import com.huawei.account.aidl.IAccountAidlInterface;
import com.huawei.account.aidl.IBinderInterceptor;
import com.huawei.common.Constant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class aww {
    private static aww d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAccountAidlInterface f723a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccountAidlInfo f725c;
    private Context e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f724b = null;
    private ServiceConnection g = new ServiceConnection() { // from class: aww.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.a("PLGLOGIN_AccountAidlClient", Constant.SERVICE_CONNECT_MESSAGE);
            if (iBinder == null) {
                try {
                    if (aww.this.f724b != null) {
                        LogUtil.a("PLGLOGIN_AccountAidlClient", "service null and bindCallBack not null ");
                        aww.this.f724b.onResponse(-1, Constant.SERVICE_CONNECT_MESSAGE);
                        aww.this.f724b = null;
                        return;
                    }
                } catch (RemoteException e) {
                    LogUtil.d("PLGLOGIN_AccountAidlClient", "Exception:" + e.getMessage());
                    LogUtil.a("PLGLOGIN_AccountAidlClient", "Exception: onServiceConnected error");
                    return;
                }
            }
            IBinder serviceBinder = IBinderInterceptor.Stub.asInterface(iBinder).getServiceBinder(Constant.HEALTH_SERVICE_NAME);
            if (serviceBinder != null || aww.this.f724b == null) {
                aww.this.f723a = IAccountAidlInterface.Stub.asInterface(serviceBinder);
                if (aww.this.f723a != null) {
                    if (aww.this.f724b != null) {
                        LogUtil.a("PLGLOGIN_AccountAidlClient", "accountAidlInterface not null");
                        aww.this.f724b.onResponse(0, Constant.SERVICE_CONNECT_MESSAGE);
                    }
                } else {
                    LogUtil.a("PLGLOGIN_AccountAidlClient", "accountAidlInterface null");
                    aww.this.f724b.onResponse(-1, Constant.SERVICE_CONNECT_MESSAGE);
                }
                aww.this.f724b = null;
                return;
            }
            LogUtil.a("PLGLOGIN_AccountAidlClient", "accountAidlInterface null and bindCallBack not null");
            aww.this.f724b.onResponse(-1, Constant.SERVICE_CONNECT_MESSAGE);
            aww.this.f724b = null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.a("PLGLOGIN_AccountAidlClient", "onServiceDisconnected");
            if (aww.this.f724b != null) {
                aww.this.f724b.onResponse(-1, Constant.SERVICE_CONNECT_MESSAGE);
                aww.this.f724b = null;
            }
        }
    };

    private aww(Context context) {
        this.e = context.getApplicationContext();
    }

    public static aww e(Context context) {
        if (d == null) {
            d = new aww(context);
        }
        return d;
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("PLGLOGIN_AccountAidlClient", "Enter bindRemoteService");
        Intent intent = new Intent(Constant.ACCOUNT_AIDL_SERVICE);
        intent.setClassName("com.huawei.bone", "com.huawei.account.aidl.AccountAidlService");
        this.f724b = iBaseResponseCallback;
        LogUtil.d("PLGLOGIN_AccountAidlClient", "intent = " + intent);
        boolean zBindService = this.e.getApplicationContext().bindService(intent, this.g, 1);
        if (!zBindService) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.onResponse(-1, Constant.BIND_SERVICE_ERROR_MESSAGE);
            } else {
                LogUtil.e("PLGLOGIN_AccountAidlClient", "callback id null");
            }
            this.f724b = null;
        }
        if (this.f723a != null) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.onResponse(0, Constant.AIDI_INTERFACE_NOT_NULL_MESSAGE);
            } else {
                LogUtil.e("PLGLOGIN_AccountAidlClient", "callback id null");
            }
            this.f724b = null;
        }
        LogUtil.a("PLGLOGIN_AccountAidlClient", "bindResult = " + zBindService);
    }

    public AccountAidlInfo e() {
        LogUtil.a("PLGLOGIN_AccountAidlClient", "Enter getRemoteInfo");
        try {
            IAccountAidlInterface iAccountAidlInterface = this.f723a;
            if (iAccountAidlInterface == null) {
                LogUtil.a("PLGLOGIN_AccountAidlClient", "getRemoteInfo accountAidlInterface == null");
                return null;
            }
            AccountAidlInfo remoteAccountInfo = iAccountAidlInterface.getRemoteAccountInfo();
            this.f725c = remoteAccountInfo;
            if (remoteAccountInfo != null) {
                LogUtil.a("PLGLOGIN_AccountAidlClient", "accountinfo get remote info success ");
                LogUtil.d("PLGLOGIN_AccountAidlClient", "accountinfo get remote info success accountAidlInfo:" + this.f725c.toString());
                return this.f725c;
            }
            LogUtil.a("PLGLOGIN_AccountAidlClient", "accountinfo = null,get remote info failed");
            return null;
        } catch (RemoteException e) {
            LogUtil.d("PLGLOGIN_AccountAidlClient", "RemoteException ERROR:" + e.getMessage());
            LogUtil.a("PLGLOGIN_AccountAidlClient", "RemoteException ERROR: getRemoteInfo error");
            return null;
        }
    }
}
