package com.huawei.wallet.proxy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;

/* JADX INFO: loaded from: classes45.dex */
public class InitWalletProxy implements InitWalletApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile InitWalletProxy f30029b;
    private InitWalletApi d = d();

    private InitWalletProxy() throws ClassNotFoundException {
    }

    private InitWalletApi b() {
        try {
            if (this.d == null) {
                this.d = d();
            }
        } catch (ClassNotFoundException unused) {
            this.d = null;
        }
        return this.d;
    }

    private InitWalletApi d() throws ClassNotFoundException {
        return (InitWalletApi) b("com.huawei.nfc.carrera.wear.InitWalletApiImpl");
    }

    private static Object b(String str) throws ClassNotFoundException {
        try {
            return c(str).newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    private static Class<?> c(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public static InitWalletProxy e() throws ClassNotFoundException {
        InitWalletProxy initWalletProxy;
        if (f30029b == null) {
            synchronized (InitWalletProxy.class) {
                if (f30029b == null) {
                    f30029b = new InitWalletProxy();
                }
                initWalletProxy = f30029b;
            }
            return initWalletProxy;
        }
        return f30029b;
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void initBaseConfig(Context context) {
        if (b() != null) {
            this.d.initBaseConfig(context);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public boolean isInitBaseCommonContext() {
        if (b() != null) {
            return this.d.isInitBaseCommonContext();
        }
        return true;
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void receiverData(String str, String str2) {
        if (b() != null) {
            this.d.receiverData(str, str2);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void initWearWallet(Context context) {
        if (b() != null) {
            this.d.initWearWallet(context);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void reverseWalletStartDeepLink(String str) {
        if (b() != null) {
            this.d.reverseWalletStartDeepLink(str);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void walletAccountRemove(Context context, Intent intent) {
        if (b() != null) {
            this.d.walletAccountRemove(context, intent);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public IBinder getServiceBinder(Context context, String str, Intent intent) {
        if (b() != null) {
            return this.d.getServiceBinder(context, str, intent);
        }
        return null;
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void serviceOnCreate(Context context, String str) {
        if (b() != null) {
            this.d.serviceOnCreate(context, str);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public void serviceOnDestroy(Context context, String str) {
        if (b() != null) {
            this.d.serviceOnDestroy(context, str);
        }
    }

    @Override // com.huawei.wallet.proxy.InitWalletApi
    public Object getContentProvider(Context context, String str, Uri uri) {
        if (b() != null) {
            return this.d.getContentProvider(context, str, uri);
        }
        return new Object();
    }
}
