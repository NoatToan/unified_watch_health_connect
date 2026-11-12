package com.huawei.wearengine;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.common.Constant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.p2p.IdentityInfo;
import defpackage.ykx;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class HwWearEngineNative implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f30728c;
    private CountDownLatch e;
    private HwWearEngineNativeBinder d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder.DeathRecipient f30727b = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.HwWearEngineNative.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            LogUtil.d("HwWearEngineNative", "binderDied enter");
            if (HwWearEngineNative.this.d != null) {
                HwWearEngineNative.this.d.asBinder().unlinkToDeath(HwWearEngineNative.this.f30727b, 0);
                HwWearEngineNative.this.d = null;
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f30726a = Executors.newSingleThreadExecutor();

    public HwWearEngineNative(Context context) {
        this.f30728c = context;
    }

    public void b(final String str, final IBinder iBinder) {
        LogUtil.a("HwWearEngineNative", "setBinder enter");
        if (TextUtils.isEmpty(str) || iBinder == null) {
            return;
        }
        if (this.d != null) {
            LogUtil.j("HwWearEngineNative", "mApiAidl is not null");
            return;
        }
        LogUtil.a("HwWearEngineNative", "setBinder start to bind HiWearService");
        this.e = new CountDownLatch(1);
        this.f30726a.execute(new Runnable() { // from class: com.huawei.wearengine.HwWearEngineNative.2
            @Override // java.lang.Runnable
            public void run() {
                HwWearEngineNative.this.b();
                try {
                    HwWearEngineNative.this.e.await(30000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    LogUtil.e("HwWearEngineNative", "setBinder await error");
                }
                if (HwWearEngineNative.this.d == null) {
                    LogUtil.e("HwWearEngineNative", "mApiAidl is null");
                    return;
                }
                try {
                    LogUtil.a("HwWearEngineNative", "setBinder mApiAidl = ", HwWearEngineNative.this.d);
                    HwWearEngineNative.this.d.setBinder(str, iBinder);
                } catch (Exception unused2) {
                    LogUtil.e("HwWearEngineNative", "setBinder Exception");
                }
            }
        });
    }

    public boolean d(final Device device, final IdentityInfo identityInfo, final IdentityInfo identityInfo2) {
        if (this.d == null) {
            LogUtil.e("HwWearEngineNative", "isP2pReceiverExist mApiAidl is null");
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = new boolean[1];
        this.f30726a.execute(new Runnable() { // from class: com.huawei.wearengine.HwWearEngineNative.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        LogUtil.a("HwWearEngineNative", "isP2pReceiverExist send");
                        zArr[0] = HwWearEngineNative.this.d.isP2pReceiverExist(device, identityInfo, identityInfo2);
                    } catch (RemoteException unused) {
                        zArr[0] = false;
                        LogUtil.e("HwWearEngineNative", "isP2pReceiverExist RemoteException");
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("HwWearEngineNative", "isP2pReceiverExist time out.");
                return false;
            }
            return zArr[0];
        } catch (InterruptedException unused) {
            LogUtil.e("HwWearEngineNative", "isP2pReceiverExist InterruptedException.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("HwWearEngineNative", "bindService enter");
        Intent intent = new Intent();
        intent.setClassName(this.f30728c.getPackageName(), "com.huawei.wearengine.service.WearEngineExtendService");
        intent.setPackage(this.f30728c.getPackageName());
        intent.setAction("com.huawei.wearengine.action.PHONE_SERVICE");
        Intent intentE = ykx.e(this.f30728c, intent);
        if (intentE == null) {
            LogUtil.j("HwWearEngineNative", "bindService() explicitIntent = null");
            if (this.e != null) {
                LogUtil.a("HwWearEngineNative", "bindService countDown");
                this.e.countDown();
                return;
            }
            return;
        }
        LogUtil.a("HwWearEngineNative", "bindService do bind");
        this.f30728c.bindService(intentE, this, 1);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        LogUtil.a("HwWearEngineNative", Constant.SERVICE_CONNECT_MESSAGE);
        HwWearEngineNativeBinder hwWearEngineNativeBinderAsInterface = HwWearEngineNativeBinder.Stub.asInterface(iBinder);
        this.d = hwWearEngineNativeBinderAsInterface;
        LogUtil.a("HwWearEngineNative", "onServiceConnected mApiAidl = ", hwWearEngineNativeBinderAsInterface);
        HwWearEngineNativeBinder hwWearEngineNativeBinder = this.d;
        if (hwWearEngineNativeBinder != null) {
            try {
                hwWearEngineNativeBinder.asBinder().linkToDeath(this.f30727b, 0);
            } catch (RemoteException unused) {
                LogUtil.j("HwWearEngineNative", "onServiceConnected exception");
            }
        }
        if (this.e != null) {
            LogUtil.a("HwWearEngineNative", "onServiceConnected countDown");
            this.e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        LogUtil.j("HwWearEngineNative", "onServiceDisconnected");
        this.d = null;
    }
}
