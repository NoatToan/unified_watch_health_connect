package defpackage;

import android.os.RemoteException;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.p2p.CancelFileTransferCallBack;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.PingCallback;
import com.huawei.wearengine.p2p.Receiver;
import com.huawei.wearengine.p2p.ReceiverCallback;
import com.huawei.wearengine.p2p.SendCallback;
import com.huawei.wearengine.p2p.SendExtraCallback;
import defpackage.yis;
import defpackage.ykf;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes46.dex */
public final class ykb {
    private static volatile ykb e;
    private String d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53552a = "";
    private Timer g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExecutorService f53554c = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ykc f53553b = ykc.e();

    private ykb() {
    }

    public static ykb d() {
        if (e == null) {
            synchronized (ykb.class) {
                if (e == null) {
                    e = new ykb();
                }
            }
        }
        return e;
    }

    public Task<Void> d(final Device device, final PingCallback pingCallback) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: ykb.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                yir.d(device, "Device can not be null!");
                yir.d(pingCallback, "PingCallback can not be null!");
                P2pPingCallback p2pPingCallbackC = ykb.this.c(pingCallback);
                int iPing = ykb.this.f53553b.ping(device, ylx.e().getPackageName(), ykb.this.d, p2pPingCallbackC);
                if (iPing == 0) {
                    return null;
                }
                throw new yib(iPing);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public P2pPingCallback c(final PingCallback pingCallback) {
        return new P2pPingCallback.Stub() { // from class: com.huawei.wearengine.p2p.P2pClient$2
            @Override // com.huawei.wearengine.p2p.P2pPingCallback
            public void onResult(int i) {
                pingCallback.onPingResult(i);
            }
        };
    }

    public Task<Void> a(final Device device, final ykf ykfVar, final SendCallback sendCallback) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: ykb.8
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() throws Throwable {
                String packageName = ylx.e().getPackageName();
                String strB = ylx.b(ylx.e(), packageName);
                yir.d(packageName, "srcPkgName can not be null!");
                yir.d(strB, "srcFingerPrint can not be null!");
                yir.d(device, "Device can not be null!");
                yir.d(ykfVar, "Message can not be null!");
                yir.d(sendCallback, "SendCallback can not be null!");
                yis.b("P2pClient", "doSend srcPkgName: " + packageName + " srcFingerPrint:" + strB);
                int iC = ykb.this.c(device, new IdentityInfo(packageName, strB), new IdentityInfo(ykb.this.d, ykb.this.f53552a), ykfVar, sendCallback);
                if (iC == 0) {
                    return null;
                }
                throw new yib(iC);
            }
        });
    }

    public Task<Void> b(final ykj ykjVar, final ykf ykfVar, final SendCallback sendCallback) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: ykb.10
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() throws Throwable {
                yir.d(ykjVar, "Peer can not be null!");
                Device deviceB = ykjVar.b();
                String packageName = ylx.e().getPackageName();
                String strB = ylx.b(ylx.e(), packageName);
                yir.d(deviceB, "Device can not be null!");
                yir.d(packageName, "srcPkgName can not be null!");
                yir.d(strB, "srcFingerPrint can not be null!");
                yir.d(ykfVar, "Message can not be null!");
                yir.d(sendCallback, "SendCallback can not be null!");
                yis.b("P2pClient", "doSend srcPkgName: " + packageName + " srcFingerPrint:" + strB);
                int iC = ykb.this.c(deviceB, new IdentityInfo(packageName, strB), new IdentityInfo(ykjVar.a(), ykjVar.e()), ykfVar, sendCallback);
                if (iC == 0) {
                    return null;
                }
                throw new yib(iC);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ykf ykfVar, final SendCallback sendCallback) {
        if ((sendCallback instanceof SendExtraCallback) && !ylk.d("p2p_send_file_transfer_way_report")) {
            yis.c("P2pClient", "query Health version is low");
            throw new yib(14);
        }
        MessageParcel messageParcelC = ylp.c(ykfVar);
        MessageParcelExtra messageParcelExtraE = ylp.e(ykfVar, messageParcelC);
        P2pSendCallback.Stub stub = new P2pSendCallback.Stub() { // from class: com.huawei.wearengine.p2p.P2pClient$6
            @Override // com.huawei.wearengine.p2p.P2pSendCallback
            public void onSendResult(int i) {
                sendCallback.onSendResult(i);
            }

            @Override // com.huawei.wearengine.p2p.P2pSendCallback
            public void onSendProgress(long j) {
                sendCallback.onSendProgress(j);
            }

            @Override // com.huawei.wearengine.p2p.P2pSendCallback
            public void onFileTransferReport(String str) {
                SendCallback sendCallback2 = sendCallback;
                if (sendCallback2 instanceof SendExtraCallback) {
                    ((SendExtraCallback) sendCallback2).onFileTransferReport(str);
                }
            }
        };
        int iSendExtra = this.f53553b.sendExtra(device, messageParcelExtraE, identityInfo, identityInfo2, stub);
        return iSendExtra == 14 ? this.f53553b.send(device, messageParcelC, identityInfo, identityInfo2, stub) : iSendExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, ykg ykgVar, SendCallback sendCallback) {
        if (ykgVar.a()) {
            return;
        }
        ykgVar.cancel();
        sendCallback.onSendResult(i);
    }

    public Task<Void> d(final ykj ykjVar, final ykd ykdVar, final CancelFileTransferCallBack cancelFileTransferCallBack) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: ykb.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() throws Throwable {
                yir.d(ykjVar, "Peer can not be null!");
                Device deviceB = ykjVar.b();
                String packageName = ylx.e().getPackageName();
                String strB = ylx.b(ylx.e(), packageName);
                yir.d(packageName, "srcPkgName can not be null!");
                yir.d(strB, "srcFingerPrint can not be null!");
                yir.d(deviceB, "Device can not be null!");
                yir.d(ykdVar, "fileIdentification can not be null!");
                yir.d(cancelFileTransferCallBack, "CancelFileTransferCallBack can not be null!");
                int iB = ykb.this.b(deviceB, new IdentityInfo(packageName, strB), new IdentityInfo(ykjVar.a(), ykjVar.e()), ykdVar, cancelFileTransferCallBack);
                if (iB == 0) {
                    return null;
                }
                throw new yib(iB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ykd ykdVar, final CancelFileTransferCallBack cancelFileTransferCallBack) {
        return this.f53553b.cancelFileTransfer(device, ylp.e(ykdVar), identityInfo, identityInfo2, new P2pCancelFileTransferCallBack.Stub() { // from class: com.huawei.wearengine.p2p.P2pClient$11
            @Override // com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack
            public void onCancelFileTransferResult(int i, String str) throws RemoteException {
                yis.a("P2pClient", "cancelFileTransfer onCancelFileTransferResult, errCode: " + i);
                cancelFileTransferCallBack.onCancelFileTransferResult(i);
            }
        });
    }

    public ykb c(String str) {
        this.d = str;
        return this;
    }

    public ykb d(String str) {
        this.f53552a = str;
        return this;
    }

    public Task<Void> c(final Device device, final Receiver receiver) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: ykb.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() throws Throwable {
                String packageName = ylx.e().getPackageName();
                String strB = ylx.b(ylx.e(), packageName);
                yir.d(device, "Device can not be null!");
                yir.d(packageName, "srcPkgName can not be null!");
                yir.d(strB, "srcFingerPrint can not be null!");
                yir.d(receiver, "Receiver can not be null!");
                int iE = ykb.this.e(device, receiver, new IdentityInfo(packageName, strB), new IdentityInfo(ykb.this.d, ykb.this.f53552a));
                if (iE == 0) {
                    return null;
                }
                throw new yib(iE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(Device device, final Receiver receiver, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        return this.f53553b.registerReceiver(device, identityInfo, identityInfo2, new ReceiverCallback.Stub() { // from class: com.huawei.wearengine.p2p.P2pClient$15
            @Override // com.huawei.wearengine.p2p.ReceiverCallback
            public void onReceiveMessage(byte[] bArr) throws RemoteException {
                ykf.d dVar = new ykf.d();
                dVar.d(bArr);
                receiver.onReceiveMessage(dVar.b());
            }

            @Override // com.huawei.wearengine.p2p.ReceiverCallback
            public void onReceiveFileMessage(MessageParcel messageParcel) throws RemoteException {
                yis.b("P2pClient", "onReceiveFileMessage enter");
                this.this$0.b(receiver, messageParcel);
            }
        }, System.identityHashCode(receiver));
    }

    public Task<Void> d(final Receiver receiver) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: ykb.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                yir.d(receiver, "Receiver can not be null!");
                int iIdentityHashCode = System.identityHashCode(receiver);
                int iUnregisterReceiver = ykb.this.f53553b.unregisterReceiver(ykb.this.c(), iIdentityHashCode);
                if (iUnregisterReceiver == 0) {
                    return null;
                }
                throw new yib(iUnregisterReceiver);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReceiverCallback c() {
        return new ReceiverCallback.Stub() { // from class: com.huawei.wearengine.p2p.P2pClient$17
            @Override // com.huawei.wearengine.p2p.ReceiverCallback
            public void onReceiveMessage(byte[] bArr) {
                yis.b("P2pClient", "getReceiverCallback onReceiveMessage");
            }

            @Override // com.huawei.wearengine.p2p.ReceiverCallback
            public void onReceiveFileMessage(MessageParcel messageParcel) {
                yis.b("P2pClient", "getReceiverCallback onReceiveFileMessage");
            }
        };
    }

    public Task<Boolean> e(final Device device, final String str) {
        return Tasks.callInBackground(new Callable<Boolean>() { // from class: ykb.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                yir.d(device, "Device can not be null!");
                yir.c(str, "targetPkgName can not be null!");
                return Boolean.valueOf(ykb.this.f53553b.getDeviceAppVersionCode(device, ylx.e().getPackageName(), str) != -1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Receiver receiver, MessageParcel messageParcel) {
        yis.b("P2pClient", "enter handleReceiveFile");
        if (messageParcel == null) {
            yis.c("P2pClient", "handleReceiveFile messageParcel is null");
            receiver.onReceiveMessage(new ykf.d().b());
            return;
        }
        ykf.d dVar = new ykf.d();
        int type = messageParcel.getType();
        yis.b("P2pClient", "handleReceiveFile type:" + type);
        if (type == 2) {
            dVar.d(ymh.d(messageParcel.getFileName(), messageParcel.getParcelFileDescriptor()));
            receiver.onReceiveMessage(dVar.b());
        } else {
            yis.d("P2pClient", "handleReceiveFile type is not file");
        }
    }
}
