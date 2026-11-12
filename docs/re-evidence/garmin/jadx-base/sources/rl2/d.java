package rl2;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.exoplayer.n;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.nfc.NfcCommandHandler;
import com.garmin.device.nfc.g;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import e23.p;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;
import jn2.k;
import la2.h;
import ml2.l;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrl2/d;", "Leh2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lml2/l;", "communicator", "", "lockId", "Lcom/garmin/device/nfc/f;", "requestCallbackProvider", "", "Lrl2/c$a;", "appCapabilities", "<init>", "(Landroid/content/Context;Lml2/l;BLcom/garmin/device/nfc/f;Ljava/util/List;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements eh2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f153463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f153464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.device.nfc.f f153465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c.a> f153466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f153467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DeviceManager f153468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f153469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f153470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u53.d f153471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f153472k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rl2/d$a", "Lla2/a;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements la2.a {
        public a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            d dVar = d.this;
            String macAddress = dVar.f153463b.f119377d.getMacAddress();
            DeviceProfile deviceProfile = bVar.f111632a;
            String f92737a = deviceProfile.getF92737a();
            if (macAddress.equals(f92737a)) {
                Bundle bundle = new Bundle();
                bundle.putLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", deviceProfile.getF92746j());
                bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", f92737a);
                dVar.f153470i.g0(bundle);
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            String macAddress = d.this.f153463b.f119377d.getMacAddress();
            DeviceProfile deviceProfile = hVar.f111673a;
            String f92737a = deviceProfile.getF92737a();
            long f92746j = deviceProfile.getF92746j();
            if (f92737a == null || !macAddress.equals(f92737a)) {
                return;
            }
            ql2.a.C2739a c2739a = new ql2.a.C2739a(f92746j, f92737a);
            oi2.a.f132270a.getClass();
            l73.c.b().e(c2739a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.device.nfc.gdi.NfcServiceHandler$startService$2", f = "NfcServiceHandler.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153474a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153474a;
            if (i14 == 0) {
                r.b(obj);
                this.f153474a = 1;
                if (d.a(d.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, l lVar, byte b14, com.garmin.device.nfc.f fVar, List<? extends c.a> list) {
        context.getClass();
        lVar.getClass();
        fVar.getClass();
        list.getClass();
        this.f153462a = context;
        this.f153463b = lVar;
        this.f153464c = b14;
        this.f153465d = fVar;
        this.f153466e = list;
        this.f153470i = gl.b.b();
        String strB = oa2.d.b("PAY#NFC#", "NfcServiceHandler", lVar.f119377d.getMacAddress(), -1L, this);
        int i14 = gt2.c.f79010a;
        this.f153467f = gt2.b.f79005a.i(strB);
        x53.c cVar = s0.f129406a;
        this.f153471j = c0.a(x53.b.f189152a.plus(new a0(strB)));
        this.f153472k = new a();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009d A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:52:0x0109, B:54:0x010f, B:48:0x00d0, B:31:0x006f, B:43:0x0099, B:45:0x009d, B:62:0x017c, B:63:0x0183, B:40:0x008d), top: B:75:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0 A[Catch: all -> 0x0073, PHI: r0 r4
      0x00d0: PHI (r0v23 rl2.c) = (r0v26 rl2.c), (r0v29 rl2.c) binds: [B:46:0x00cc, B:29:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r4v6 android.os.Bundle) = (r4v7 android.os.Bundle), (r4v9 android.os.Bundle) binds: [B:46:0x00cc, B:29:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0073, blocks: (B:52:0x0109, B:54:0x010f, B:48:0x00d0, B:31:0x006f, B:43:0x0099, B:45:0x009d, B:62:0x017c, B:63:0x0183, B:40:0x008d), top: B:75:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:52:0x0109, B:54:0x010f, B:48:0x00d0, B:31:0x006f, B:43:0x0099, B:45:0x009d, B:62:0x017c, B:63:0x0183, B:40:0x008d), top: B:75:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #0 {all -> 0x0073, blocks: (B:52:0x0109, B:54:0x010f, B:48:0x00d0, B:31:0x006f, B:43:0x0099, B:45:0x009d, B:62:0x017c, B:63:0x0183, B:40:0x008d), top: B:75:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x005e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:26:0x005e */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, rl2.d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    public static final Object a(d dVar, v13.c cVar) {
        f fVar;
        ?? r14;
        rl2.a failureReason;
        Bundle bundle;
        pl2.f fVar2;
        c cVar2;
        c cVar3;
        pl2.f fVar3;
        ?? r15;
        pl2.f fVar4;
        ListenableFuture listenableFutureTransform;
        c cVar4;
        Object objB;
        ListenableFuture listenableFutureCatching;
        Object obj;
        dVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f153486f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f153486f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar, cVar);
            }
        } else {
            fVar = new f(dVar, cVar);
        }
        Object objC = fVar.f153484d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r16 = fVar.f153486f;
        int i15 = 5;
        byte b14 = 1;
        try {
            if (r16 == 0) {
                r.b(objC);
                s sVar = dVar.f153470i;
                fVar.f153486f = 1;
                objC = sVar.C(fVar);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (r16 == 1) {
                r.b(objC);
            } else {
                if (r16 == 2) {
                    bundle = fVar.f153481a;
                    r.b(objC);
                    cVar4 = (c) objC;
                    if (cVar4 != null) {
                        throw new Exception("Failed to open NFC socket");
                    }
                    SettableFuture settableFutureD = cVar4.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.NFC_ACCESS_GET_STATE), 500L, 0);
                    k kVar = new k(cVar4, i15);
                    ListeningScheduledExecutorService listeningScheduledExecutorService = cVar4.f50804e;
                    listenableFutureCatching = Futures.catching(Futures.transformAsync(settableFutureD, kVar, listeningScheduledExecutorService), TimeoutException.class, pl2.i.f138583a, listeningScheduledExecutorService);
                    listenableFutureCatching.getClass();
                    fVar.f153481a = bundle;
                    fVar.f153482b = cVar4;
                    fVar.f153486f = 3;
                    if (t53.c.b(listenableFutureCatching, fVar) == aVar) {
                        cVar4.getClass();
                        SettableFuture settableFutureD2 = cVar4.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.GET_CAPABILITIES), 5000L, 0);
                        n nVar = new n(cVar4, 7);
                        ListeningScheduledExecutorService listeningScheduledExecutorService2 = cVar4.f50804e;
                        ListenableFuture listenableFutureCatching2 = Futures.catching(Futures.transform(settableFutureD2, nVar, listeningScheduledExecutorService2), TimeoutException.class, pl2.h.f138582a, listeningScheduledExecutorService2);
                        listenableFutureCatching2.getClass();
                        fVar.f153481a = bundle;
                        fVar.f153482b = cVar4;
                        fVar.f153486f = 4;
                        objB = t53.c.b(listenableFutureCatching2, fVar);
                        if (objB != aVar) {
                            cVar2 = cVar4;
                            objC = objB;
                            fVar4 = (pl2.f) objC;
                            if (fVar4.f138579c > 0) {
                                List<c.a> list = dVar.f153466e;
                                cVar2.getClass();
                                byte bContains = list.contains(c.a.DEVICE_DRIVEN_SOCKET);
                                byte[] bArr = new byte[2];
                                bArr[0] = b14;
                                bArr[b14] = bContains;
                                listenableFutureTransform = Futures.transform(cVar2.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.APP_CAPABILITIES, bArr), 5000L, 0), new androidx.media3.common.p(9), cVar2.f50804e);
                                listenableFutureTransform.getClass();
                                fVar.f153481a = bundle;
                                fVar.f153482b = cVar2;
                                fVar.f153483c = fVar4;
                                fVar.f153486f = 5;
                                if (t53.c.b(listenableFutureTransform, fVar) != aVar) {
                                    fVar3 = fVar4;
                                    r15 = bundle;
                                    cVar3 = cVar2;
                                    fVar2 = fVar3;
                                    cVar2 = cVar3;
                                    r14 = r15;
                                }
                            } else {
                                fVar2 = fVar4;
                                r14 = bundle;
                            }
                            cVar2.f153459h = fVar2;
                            String string = r14.getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", "");
                            long j8 = r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
                            string.getClass();
                            ql2.a.d dVar2 = new ql2.a.d(string, j8, false, fVar2);
                            oi2.a.f132270a.getClass();
                            l73.c.b().e(dVar2);
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar;
                }
                try {
                    if (r16 == 3) {
                        c cVar5 = fVar.f153482b;
                        Bundle bundle2 = fVar.f153481a;
                        r.b(objC);
                        cVar4 = cVar5;
                        bundle = bundle2;
                        cVar4.getClass();
                        SettableFuture settableFutureD3 = cVar4.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.GET_CAPABILITIES), 5000L, 0);
                        n nVar2 = new n(cVar4, 7);
                        ListeningScheduledExecutorService listeningScheduledExecutorService3 = cVar4.f50804e;
                        ListenableFuture listenableFutureCatching3 = Futures.catching(Futures.transform(settableFutureD3, nVar2, listeningScheduledExecutorService3), TimeoutException.class, pl2.h.f138582a, listeningScheduledExecutorService3);
                        listenableFutureCatching3.getClass();
                        fVar.f153481a = bundle;
                        fVar.f153482b = cVar4;
                        fVar.f153486f = 4;
                        objB = t53.c.b(listenableFutureCatching3, fVar);
                        if (objB != aVar) {
                            cVar2 = cVar4;
                            objC = objB;
                            fVar4 = (pl2.f) objC;
                            if (fVar4.f138579c > 0) {
                                List<c.a> list2 = dVar.f153466e;
                                cVar2.getClass();
                                byte bContains2 = list2.contains(c.a.DEVICE_DRIVEN_SOCKET);
                                byte[] bArr2 = new byte[2];
                                bArr2[0] = b14;
                                bArr2[b14] = bContains2;
                                listenableFutureTransform = Futures.transform(cVar2.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.APP_CAPABILITIES, bArr2), 5000L, 0), new androidx.media3.common.p(9), cVar2.f50804e);
                                listenableFutureTransform.getClass();
                                fVar.f153481a = bundle;
                                fVar.f153482b = cVar2;
                                fVar.f153483c = fVar4;
                                fVar.f153486f = 5;
                                if (t53.c.b(listenableFutureTransform, fVar) != aVar) {
                                    fVar3 = fVar4;
                                    r15 = bundle;
                                    cVar3 = cVar2;
                                    fVar2 = fVar3;
                                    cVar2 = cVar3;
                                    r14 = r15;
                                }
                            } else {
                                fVar2 = fVar4;
                                r14 = bundle;
                            }
                            cVar2.f153459h = fVar2;
                            String string2 = r14.getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", "");
                            long j14 = r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
                            string2.getClass();
                            ql2.a.d dVar3 = new ql2.a.d(string2, j14, false, fVar2);
                            oi2.a.f132270a.getClass();
                            l73.c.b().e(dVar3);
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                    if (r16 != 4) {
                        if (r16 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fVar3 = fVar.f153483c;
                        cVar3 = fVar.f153482b;
                        r14 = fVar.f153481a;
                        try {
                            r.b(objC);
                            r15 = r14;
                            fVar2 = fVar3;
                            cVar2 = cVar3;
                            r14 = r15;
                            cVar2.f153459h = fVar2;
                            String string3 = r14.getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", "");
                            long j15 = r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
                            string3.getClass();
                            ql2.a.d dVar4 = new ql2.a.d(string3, j15, false, fVar2);
                            oi2.a.f132270a.getClass();
                            l73.c.b().e(dVar4);
                        } catch (Throwable th3) {
                            th = th3;
                            dVar.f153467f.error("Unable to setup NFC service. Cannot send NFC_STARTED", (Throwable) th);
                            if (th instanceof NfcCommandHandler.NfcCapabilityException) {
                                failureReason = th.getFailureReason();
                            } else if (th instanceof TimeoutException) {
                                failureReason = rl2.a.CAPABILITIES_REQUEST_TIMED_OUT;
                            } else {
                                failureReason = rl2.a.UNKNOWN;
                            }
                            ql2.a.c cVar6 = new ql2.a.c(r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L), failureReason);
                            oi2.a.f132270a.getClass();
                            l73.c.b().e(cVar6);
                        }
                        return Unit.INSTANCE;
                    }
                    c cVar7 = fVar.f153482b;
                    Bundle bundle3 = fVar.f153481a;
                    r.b(objC);
                    cVar2 = cVar7;
                    bundle = bundle3;
                    b14 = 1;
                    fVar4 = (pl2.f) objC;
                    if (fVar4.f138579c > 0) {
                        List<c.a> list3 = dVar.f153466e;
                        cVar2.getClass();
                        byte bContains3 = list3.contains(c.a.DEVICE_DRIVEN_SOCKET);
                        byte[] bArr3 = new byte[2];
                        bArr3[0] = b14;
                        bArr3[b14] = bContains3;
                        listenableFutureTransform = Futures.transform(cVar2.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.APP_CAPABILITIES, bArr3), 5000L, 0), new androidx.media3.common.p(9), cVar2.f50804e);
                        listenableFutureTransform.getClass();
                        fVar.f153481a = bundle;
                        fVar.f153482b = cVar2;
                        fVar.f153483c = fVar4;
                        fVar.f153486f = 5;
                        if (t53.c.b(listenableFutureTransform, fVar) != aVar) {
                            fVar3 = fVar4;
                            r15 = bundle;
                            cVar3 = cVar2;
                            fVar2 = fVar3;
                            cVar2 = cVar3;
                            r14 = r15;
                        }
                        return aVar;
                    }
                    fVar2 = fVar4;
                    r14 = bundle;
                    cVar2.f153459h = fVar2;
                    String string4 = r14.getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", "");
                    long j16 = r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
                    string4.getClass();
                    ql2.a.d dVar5 = new ql2.a.d(string4, j16, false, fVar2);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(dVar5);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    r14 = obj;
                    dVar.f153467f.error("Unable to setup NFC service. Cannot send NFC_STARTED", (Throwable) th);
                    if (th instanceof NfcCommandHandler.NfcCapabilityException) {
                        failureReason = th.getFailureReason();
                    } else if (th instanceof TimeoutException) {
                        failureReason = rl2.a.CAPABILITIES_REQUEST_TIMED_OUT;
                    } else {
                        failureReason = rl2.a.UNKNOWN;
                    }
                    ql2.a.c cVar8 = new ql2.a.c(r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L), failureReason);
                    oi2.a.f132270a.getClass();
                    l73.c.b().e(cVar8);
                }
            }
            bundle = (Bundle) objC;
            fVar.f153481a = bundle;
            fVar.f153486f = 2;
            objC = dVar.c(2, fVar);
            if (objC != aVar) {
                cVar4 = (c) objC;
                if (cVar4 != null) {
                    throw new Exception("Failed to open NFC socket");
                }
                SettableFuture settableFutureD4 = cVar4.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.NFC_ACCESS_GET_STATE), 500L, 0);
                k kVar2 = new k(cVar4, i15);
                ListeningScheduledExecutorService listeningScheduledExecutorService4 = cVar4.f50804e;
                listenableFutureCatching = Futures.catching(Futures.transformAsync(settableFutureD4, kVar2, listeningScheduledExecutorService4), TimeoutException.class, pl2.i.f138583a, listeningScheduledExecutorService4);
                listenableFutureCatching.getClass();
                fVar.f153481a = bundle;
                fVar.f153482b = cVar4;
                fVar.f153486f = 3;
                if (t53.c.b(listenableFutureCatching, fVar) == aVar) {
                    cVar4.getClass();
                    SettableFuture settableFutureD5 = cVar4.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.GET_CAPABILITIES), 5000L, 0);
                    n nVar3 = new n(cVar4, 7);
                    ListeningScheduledExecutorService listeningScheduledExecutorService5 = cVar4.f50804e;
                    ListenableFuture listenableFutureCatching4 = Futures.catching(Futures.transform(settableFutureD5, nVar3, listeningScheduledExecutorService5), TimeoutException.class, pl2.h.f138582a, listeningScheduledExecutorService5);
                    listenableFutureCatching4.getClass();
                    fVar.f153481a = bundle;
                    fVar.f153482b = cVar4;
                    fVar.f153486f = 4;
                    objB = t53.c.b(listenableFutureCatching4, fVar);
                    if (objB != aVar) {
                        cVar2 = cVar4;
                        objC = objB;
                        fVar4 = (pl2.f) objC;
                        if (fVar4.f138579c > 0) {
                            List<c.a> list4 = dVar.f153466e;
                            cVar2.getClass();
                            byte bContains4 = list4.contains(c.a.DEVICE_DRIVEN_SOCKET);
                            byte[] bArr4 = new byte[2];
                            bArr4[0] = b14;
                            bArr4[b14] = bContains4;
                            listenableFutureTransform = Futures.transform(cVar2.f50805f.d(new com.garmin.device.nfc.i(NfcCommandHandler.b.APP_CAPABILITIES, bArr4), 5000L, 0), new androidx.media3.common.p(9), cVar2.f50804e);
                            listenableFutureTransform.getClass();
                            fVar.f153481a = bundle;
                            fVar.f153482b = cVar2;
                            fVar.f153483c = fVar4;
                            fVar.f153486f = 5;
                            if (t53.c.b(listenableFutureTransform, fVar) != aVar) {
                                fVar3 = fVar4;
                                r15 = bundle;
                                cVar3 = cVar2;
                                fVar2 = fVar3;
                                cVar2 = cVar3;
                                r14 = r15;
                            }
                        } else {
                            fVar2 = fVar4;
                            r14 = bundle;
                        }
                        cVar2.f153459h = fVar2;
                        String string5 = r14.getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", "");
                        long j17 = r14.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
                        string5.getClass();
                        ql2.a.d dVar6 = new ql2.a.d(string5, j17, false, fVar2);
                        oi2.a.f132270a.getClass();
                        l73.c.b().e(dVar6);
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        } catch (Throwable th5) {
            th = th5;
            r14 = r16;
        }
    }

    @Override // eh2.e
    public final void b(int i14) {
        String macAddress = this.f153463b.f119377d.getMacAddress();
        Context context = this.f153462a;
        DeviceManager deviceManagerRegister = DeviceManager.register(context, macAddress, 1);
        if (deviceManagerRegister == null) {
            this.f153467f.warn("Failed to create DeviceManager for NFC");
            return;
        }
        this.f153468g = deviceManagerRegister;
        da2.d.c(context).f58886a.b(this.f153472k);
        DeviceProfile deviceProfileA = da2.d.c(context).a(macAddress);
        if (deviceProfileA != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", deviceProfileA);
            bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", macAddress);
            bundle.putLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", deviceProfileA.getF92746j());
            this.f153470i.g0(bundle);
        }
        ge1.b.T(this.f153471j, null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:13:0x002e, B:18:0x003c, B:40:0x00d0, B:42:0x00d4, B:44:0x00d7, B:36:0x00a8), top: B:52:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: Exception -> 0x00e7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e7, blocks: (B:13:0x002e, B:18:0x003c, B:40:0x00d0, B:42:0x00d4, B:44:0x00d7, B:36:0x00a8), top: B:52:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i14, v13.c cVar) throws Exception {
        e eVar;
        ListenableFuture listenableFutureImmediateFailedFuture;
        c cVar2;
        Object objC;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i15 = eVar.f153480e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f153480e = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objB = eVar.f153478c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f153480e;
        Logger logger = this.f153467f;
        l lVar = this.f153463b;
        try {
            if (i16 == 0) {
                r.b(objB);
                c cVar3 = this.f153469h;
                if (cVar3 != null) {
                    cVar3.g();
                    this.f153469h = null;
                }
                if (i14 <= 0) {
                    q2.u("Unable to establish NFC communication, no tries remaining");
                    return null;
                }
                try {
                    listenableFutureImmediateFailedFuture = Futures.transform(lVar.l(2, true), new n(new ol2.a(2), 6), MoreExecutors.directExecutor());
                } catch (IOException e4) {
                    listenableFutureImmediateFailedFuture = Futures.immediateFailedFuture(e4);
                }
                listenableFutureImmediateFailedFuture.getClass();
                eVar.f153476a = i14;
                eVar.f153480e = 1;
                objB = t53.c.b(listenableFutureImmediateFailedFuture, eVar);
                if (objB != obj) {
                }
                return obj;
            }
            if (i16 == 1) {
                i14 = eVar.f153476a;
                r.b(objB);
            } else {
                if (i16 != 2) {
                    if (i16 == 3) {
                        r.b(objB);
                        return objB;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = eVar.f153476a;
                cVar2 = eVar.f153477b;
                r.b(objB);
            }
            if (((com.garmin.device.nfc.i) objB) != null) {
                this.f153469h = cVar2;
                return cVar2;
            }
            eVar.f153477b = null;
            eVar.f153476a = i14;
            eVar.f153480e = 3;
            objC = c(i14 - 1, eVar);
            if (objC != obj) {
                return obj;
            }
            return objC;
            ol2.c cVar4 = (ol2.c) objB;
            c cVar5 = new c(new g(lVar.f119377d.getMacAddress(), cVar4.f132876a, cVar4.f132877b, this.f153465d), this.f153464c);
            DeviceManager deviceManager = this.f153468g;
            if (deviceManager != null) {
                deviceManager.setGenericCapability(c.class, cVar5);
            }
            logger.debug("Verifying NFC communication");
            NfcCommandHandler.b bVar = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
            Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
            SettableFuture settableFutureD = cVar5.f50805f.d(new com.garmin.device.nfc.i(bVar, (byte) NfcCommandHandler.e.READ_OWNER_DATA.f50841a), 500L, 10);
            eVar.f153477b = cVar5;
            eVar.f153476a = i14;
            eVar.f153480e = 2;
            Object objB2 = t53.c.b(settableFutureD, eVar);
            if (objB2 != obj) {
                cVar2 = cVar5;
                objB = objB2;
                if (((com.garmin.device.nfc.i) objB) != null) {
                    this.f153469h = cVar2;
                    return cVar2;
                }
                eVar.f153477b = null;
                eVar.f153476a = i14;
                eVar.f153480e = 3;
                objC = c(i14 - 1, eVar);
                if (objC != obj) {
                    return objC;
                }
            }
            return obj;
        } catch (Exception unused) {
            logger.error("Failed NFC communication (response timeout)");
            return null;
        }
    }

    @Override // eh2.e
    public final void onDeviceDisconnect() {
        c0.c(this.f153471j, null);
        this.f153470i.c(null);
        DeviceManager deviceManager = this.f153468g;
        if (deviceManager != null) {
            deviceManager.setGenericCapability(c.class, null);
            deviceManager.terminate();
            this.f153468g = null;
        }
        c cVar = this.f153469h;
        if (cVar != null) {
            cVar.g();
            this.f153469h = null;
        }
        da2.d.c(this.f153462a).f58886a.i(this.f153472k);
    }
}
