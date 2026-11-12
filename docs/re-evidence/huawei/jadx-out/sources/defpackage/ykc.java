package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.wearengine.P2pManager;
import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.ReceiverCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes46.dex */
public class ykc implements P2pManager, WearEngineBinderClient {
    private static volatile ykc e;
    private final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f53569a = new IBinder.DeathRecipient() { // from class: ykc.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yis.b("P2pServiceProxy", "binderDied enter");
            if (ykc.this.f53570b != null) {
                ykc.this.f53570b.asBinder().unlinkToDeath(ykc.this.f53569a, 0);
                ykc.this.f53570b = null;
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P2pManager f53570b = null;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    private ykc() {
        a();
    }

    private void b() throws RemoteException {
        synchronized (this.d) {
            if (this.f53570b == null) {
                WearEngineClientInner.c().e();
                IBinder iBinderB = WearEngineClientInner.c().b(2);
                if (iBinderB == null) {
                    throw new yib(2);
                }
                P2pManager p2pManagerAsInterface = P2pManager.Stub.asInterface(iBinderB);
                this.f53570b = p2pManagerAsInterface;
                p2pManagerAsInterface.asBinder().linkToDeath(this.f53569a, 0);
            }
        }
    }

    public static ykc e() {
        if (e == null) {
            synchronized (ykc.class) {
                if (e == null) {
                    e = new ykc();
                }
            }
        }
        return e;
    }

    @Override // com.huawei.wearengine.P2pManager
    public int ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) {
        try {
            b();
            if (this.f53570b == null) {
                return 6;
            }
            yis.b("P2pServiceProxy", "Start ping");
            return this.f53570b.ping(device, str, str2, p2pPingCallback);
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "ping RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int send(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        try {
            b();
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.send(device, messageParcel, identityInfo, identityInfo2, p2pSendCallback);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "send RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int sendExtra(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        try {
            b();
            if (!ylk.d("p2p_send_extra")) {
                yis.d("P2pServiceProxy", "sendExtra health not support");
                return 14;
            }
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.sendExtra(device, messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "send RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int sendInternal(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        try {
            b();
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.sendInternal(device, messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "sendInternal RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int getDeviceAppVersionCode(Device device, String str, String str2) {
        yis.c("P2pServiceProxy", "getDeviceAppVersionCode");
        try {
            b();
            if (this.f53570b != null) {
                if (!ylk.d("p2p_get_device_app_version_code")) {
                    yis.c("P2pServiceProxy", "getDeviceAppVersionCode Health version is low");
                    throw new yib(14);
                }
                return this.f53570b.getDeviceAppVersionCode(device, str, str2);
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "getDeviceAppVersionCode RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int registerReceiver(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) {
        try {
            b();
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.registerReceiver(device, identityInfo, identityInfo2, receiverCallback, i);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "registerReceiver RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int registerReceiverInternal(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiverCallback receiverCallback, int i) {
        try {
            b();
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.registerReceiverInternal(device, identityInfo, identityInfo2, receiverCallback, i);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "registerReceiverInternal RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        try {
            b();
            if (!ylk.d("p2p_cancel_file_transfer")) {
                yis.d("P2pServiceProxy", "cancelFileTransfer health not support");
                return 14;
            }
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.cancelFileTransfer(device, fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "cancelFileTransfer RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            yis.c("P2pServiceProxy", "cancelFileTransfer IllegalStateException");
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.P2pManager
    public int unregisterReceiver(ReceiverCallback receiverCallback, int i) {
        try {
            b();
            P2pManager p2pManager = this.f53570b;
            if (p2pManager != null) {
                return p2pManager.unregisterReceiver(receiverCallback, i);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("P2pServiceProxy", "unregisterReceiver RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.WearEngineBinderClient
    public void clearBinderProxy() {
        this.f53570b = null;
        yis.b("P2pServiceProxy", "clearBinderProxy");
    }

    private void a() {
        WearEngineClientInner.c().a(new yhv(new WeakReference(this)));
    }
}
