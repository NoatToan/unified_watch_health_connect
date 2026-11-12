package jn2;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.nfc.NfcCommandHandler;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import zn2.s3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljn2/m;", "Lhs2/d;", "Ltl2/j;", "", "unitId", "", "macAddress", "Lsl2/f;", "nfcChipType", "Lhs2/g;", "payDeviceState", "<init>", "(JLjava/lang/String;Lsl2/f;Lhs2/g;)V", "Lhs2/a;", TtmlNode.TAG_METADATA, "(Lhs2/a;Lhs2/g;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements hs2.d, tl2.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ListeningScheduledExecutorService f99646l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f99647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f99648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sl2.f f99649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f99650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f99651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<hs2.g> f99652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<rl2.c> f99653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f99654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f99655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f99656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ListenableFuture<Collection<com.garmin.device.nfc.b>> f99657k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99658a;

        static {
            int[] iArr = new int[is2.b.values().length];
            try {
                iArr[is2.b.FITPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f99658a = iArr;
        }
    }

    static {
        new a(null);
        f99646l = MoreExecutors.listeningDecorator(Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setNameFormat("PAY#PayDevice-%d").build()));
    }

    public m(long j8, String str, sl2.f fVar, hs2.g gVar) {
        int i14;
        str.getClass();
        fVar.getClass();
        gVar.getClass();
        this.f99647a = j8;
        this.f99648b = str;
        this.f99649c = fVar;
        String strE = org.apache.commons.lang3.e.e(j8, "PAY#PayDevice:");
        int i15 = gt2.c.f79010a;
        this.f99650d = gt2.b.f79005a.h(strE);
        this.f99651e = new CopyOnWriteArraySet();
        AtomicReference<hs2.g> atomicReference = new AtomicReference<>(hs2.g.DISCONNECTED);
        this.f99652f = atomicReference;
        this.f99653g = new AtomicReference<>(null);
        this.f99654h = new Handler(Looper.getMainLooper());
        this.f99656j = new byte[0];
        atomicReference.set(gVar);
        Boolean bool = fVar.f160037a;
        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
            i14 = 2;
        } else {
            if (!p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
                if (bool == null) {
                    org.apache.commons.lang3.e.l("Can't determine whether ", fVar, " is production or eng sample");
                    throw null;
                }
                u0.r();
                throw null;
            }
            i14 = 1;
        }
        this.f99655i = i14;
    }

    @Override // hs2.d
    public final Object A(hs2.f fVar, bo2.e.c cVar) throws Throwable {
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new t(this, fVar, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // hs2.d
    public final ListenableFuture B(List list, boolean z14) {
        rl2.c cVarC = c("requestDeviceCards", false);
        if (cVarC == null) {
            return null;
        }
        synchronized (this.f99656j) {
            ListenableFuture<Collection<com.garmin.device.nfc.b>> listenableFuture = this.f99657k;
            if (listenableFuture != null && !listenableFuture.isDone()) {
                this.f99650d.debug("Reusing running requestDeviceCards call");
                return listenableFuture;
            }
            if (z14 && listenableFuture != null) {
                try {
                    if (listenableFuture.get() != null) {
                        this.f99650d.debug("Using already completed requestDeviceCards call");
                        return listenableFuture;
                    }
                } catch (Exception unused) {
                    this.f99650d.debug("Ignoring failed requestDeviceCards call");
                }
            }
            this.f99650d.debug("Making new requestDeviceCards call");
            ListenableFuture<Collection<com.garmin.device.nfc.b>> listenableFutureD = cVarC.d(list);
            this.f99657k = listenableFutureD;
            return listenableFutureD;
        }
    }

    @Override // hs2.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public final sl2.f getF99649c() {
        return this.f99649c;
    }

    @Override // hs2.d
    public final int D(ul2.d dVar) {
        rl2.c cVarC = c("requestApduTransfer", false);
        if (cVarC != null) {
            return cVarC.f50805f.b(dVar);
        }
        return -1;
    }

    @Override // hs2.d
    public final ListenableFuture E(Set set, boolean z14) {
        set.getClass();
        ListenableFuture listenableFutureB = B(w.c(com.garmin.device.nfc.h.b.f50886c), z14);
        if (listenableFutureB == null) {
            return null;
        }
        return Futures.transform(listenableFutureB, new androidx.media3.exoplayer.n(set, 4), f99646l);
    }

    @Override // hs2.d
    public final void F(final String str, final long j8, final zi2.a aVar, final ps2.h hVar) {
        aVar.getClass();
        J(j8, aVar, new cs2.a() { // from class: jn2.h
            @Override // cs2.a
            public final void accept(Object obj) {
                ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
                boolean zG = p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE);
                final m mVar = this.f99627a;
                final ps2.h hVar2 = hVar;
                if (!zG) {
                    mVar.f(hs2.g.CREATING_PASSCODE);
                    hVar2.accept(null);
                    return;
                }
                boolean zD = mVar.d();
                final long j14 = j8;
                final zi2.a aVar2 = aVar;
                if (!zD) {
                    mVar.f(hs2.g.CREATING_PASSCODE);
                    js2.d.a aVar3 = js2.d.f100659h;
                    js2.b bVar = new js2.b(j14, aVar2);
                    js2.c cVar = js2.c.OWNER_DATA_SET;
                    aVar3.getClass();
                    cVar.getClass();
                    hVar2.accept(new js2.d(js2.e.NOT_APPLICABLE, bVar, cVar, null, 8, null));
                    return;
                }
                cs2.a aVar4 = new cs2.a() { // from class: jn2.i
                    @Override // cs2.a
                    public final void accept(Object obj2) {
                        js2.d dVarA;
                        ListeningScheduledExecutorService listeningScheduledExecutorService2 = m.f99646l;
                        mVar.f(hs2.g.CREATING_PASSCODE);
                        if (((pl2.l) obj2).f138589b) {
                            js2.d.a aVar5 = js2.d.f100659h;
                            js2.b bVar2 = new js2.b(j14, aVar2);
                            js2.c cVar2 = js2.c.OWNER_DATA_SET;
                            aVar5.getClass();
                            dVarA = js2.d.a.a(bVar2, cVar2, 11, -1);
                        } else {
                            dVarA = null;
                        }
                        hVar2.accept(dVarA);
                    }
                };
                rl2.c cVarC = mVar.c("setPassCode", false);
                if (cVarC == null) {
                    aVar4.accept(new pl2.l());
                    return;
                }
                int i14 = mVar.f99655i;
                String str2 = str;
                cVarC.f(new pl2.k(str2, str2, i14, 5), mVar.f99649c, aVar4);
            }
        });
    }

    @Override // hs2.d
    public final void G(boolean z14) {
        this.f99650d.debug("updateDeviceConnectivity(" + z14 + ")");
        da2.f fVarA = da2.f.a();
        String str = this.f99648b;
        fVarA.getClass();
        da2.d dVarB = da2.d.b();
        da2.b bVar = dVarB != null ? dVarB.f58886a.f111646e : null;
        da2.l lVarF = bVar != null ? bVar.f(str) : null;
        rl2.c cVar = lVarF != null ? (rl2.c) lVarF.getCapability(rl2.c.class) : null;
        this.f99653g.set(cVar);
        synchronized (this.f99656j) {
            this.f99657k = null;
            Unit unit = Unit.INSTANCE;
        }
        if (!z14 || cVar == null) {
            g(hs2.g.DISCONNECTED);
            return;
        }
        tl2.i iVar = cVar.f50805f;
        iVar.getClass();
        iVar.f165338h.add(this);
        g(hs2.g.CONNECTING);
    }

    @Override // hs2.d
    public final void H(String str, ps2.m mVar) {
        rl2.c cVarC = c("verifyPasscode", false);
        if (cVarC == null) {
            mVar.accept(null);
            return;
        }
        f fVar = new f(mVar, 0);
        NfcCommandHandler.f50799g.trace("Verifying pass code");
        cVarC.f50805f.c(new sl2.k(str, fVar));
    }

    @Override // hs2.d
    public final ListenableFuture<Boolean> I() {
        rl2.c cVarC = c("removeExpressCard", true);
        if (cVarC == null) {
            return null;
        }
        com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE, com.garmin.device.nfc.h.f("", new byte[0], new byte[]{-1, -1, -1, -1}));
        tl2.i iVar2 = cVarC.f50805f;
        tl2.g gVar = tl2.i.f165328k;
        ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(iVar2.d(iVar, AbstractComponentTracker.LINGERING_TIMEOUT, 0), new pl2.g(2), cVarC.f50804e);
        listenableFutureTransformAsync.getClass();
        return Futures.transform(listenableFutureTransformAsync, new androidx.media3.common.p(5), f99646l);
    }

    @Override // hs2.d
    public final void J(long j8, zi2.a aVar, cs2.a<Boolean> aVar2) {
        aVar.getClass();
        rl2.c cVarC = c("createOwnerData", false);
        if (cVarC == null) {
            aVar2.accept(Boolean.FALSE);
        } else {
            cVarC.a(com.garmin.device.nfc.h.j(j8, aVar.name()), aVar2);
        }
    }

    @Override // tl2.j
    public final void a(boolean z14) {
        Handler handler = this.f99654h;
        handler.removeCallbacksAndMessages(null);
        if (!z14) {
            handler.postDelayed(new eh2.b(this, 28), 1000L);
        } else {
            this.f99650d.debug("onProcessingStateChange");
            b(hs2.g.IDLE, hs2.g.SENDING_NFC_MESSAGES);
        }
    }

    public final void b(hs2.g gVar, hs2.g gVar2) {
        AtomicReference<hs2.g> atomicReference;
        do {
            atomicReference = this.f99652f;
            if (atomicReference.compareAndSet(gVar, gVar2)) {
                this.f99650d.debug("State changed: " + gVar2);
                Iterator it = this.f99651e.iterator();
                while (it.hasNext()) {
                    ((ps2.s) it.next()).a();
                }
                return;
            }
        } while (atomicReference.get() == gVar);
    }

    public final rl2.c c(String str, boolean z14) {
        rl2.c cVar = this.f99653g.get();
        if (cVar == null) {
            return null;
        }
        hs2.g gVar = this.f99652f.get();
        boolean z15 = gVar.f85463a;
        Logger logger = this.f99650d;
        if (!z15 || z14) {
            logger.debug(str.concat("()"));
            return cVar;
        }
        logger.error("Failed " + str + " because device is " + gVar);
        return null;
    }

    public final boolean d() {
        hs2.a aVar;
        ps2.w.f140538a.getClass();
        ps2.n nVarI = ps2.w.i(this.f99647a);
        if (nVarI == null || (aVar = nVarI.f140498a) == null) {
            return true;
        }
        return aVar.getRequiresPasscode();
    }

    public final void e(pl2.j jVar) {
        rl2.c cVarC = c("readOwnerData", false);
        if (cVarC == null) {
            jVar.b();
            return;
        }
        NfcCommandHandler.b bVar = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        tl2.i.e(cVarC.f50805f, new com.garmin.device.nfc.i(bVar, (byte) NfcCommandHandler.e.READ_OWNER_DATA.f50841a), new com.garmin.device.nfc.d(jVar), 0L, 12);
    }

    public final void f(hs2.g gVar) {
        hs2.g gVar2;
        rl2.c cVar = this.f99653g.get();
        Boolean boolValueOf = cVar != null ? Boolean.valueOf(cVar.f50805f.f165339i.get()) : null;
        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
            gVar2 = hs2.g.SENDING_NFC_MESSAGES;
        } else if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.FALSE)) {
            gVar2 = hs2.g.IDLE;
        } else {
            if (boolValueOf != null) {
                u0.r();
                return;
            }
            gVar2 = hs2.g.DISCONNECTED;
        }
        b(gVar, gVar2);
    }

    public final void g(hs2.g gVar) {
        this.f99652f.set(gVar);
        this.f99650d.debug("State changed: " + gVar);
        Iterator it = this.f99651e.iterator();
        while (it.hasNext()) {
            ((ps2.s) it.next()).a();
        }
    }

    @Override // hs2.d
    /* JADX INFO: renamed from: getMacAddress, reason: from getter */
    public final String getF99648b() {
        return this.f99648b;
    }

    @Override // hs2.d
    /* JADX INFO: renamed from: getUnitId, reason: from getter */
    public final long getF99647a() {
        return this.f99647a;
    }

    @Override // hs2.d
    public final ListenableFuture<Optional<hs2.c>> o() {
        int i14 = 1;
        rl2.c cVarC = c("getExpressCard", true);
        if (cVarC == null) {
            return null;
        }
        NfcCommandHandler.b bVar = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(bVar, (byte) NfcCommandHandler.e.GET_EXPRESS_TRANSIT_CARD.f50841a);
        tl2.i iVar2 = cVarC.f50805f;
        tl2.g gVar = tl2.i.f165328k;
        ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(iVar2.d(iVar, AbstractComponentTracker.LINGERING_TIMEOUT, 0), new pl2.g(i14), cVarC.f50804e);
        listenableFutureTransformAsync.getClass();
        return Futures.transform(listenableFutureTransformAsync, new androidx.media3.common.p(6), f99646l);
    }

    @Override // hs2.d
    public final ListenableFuture<Boolean> p(byte[] bArr, String str, float f14) {
        str.getClass();
        int i14 = 0;
        rl2.c cVarC = c("setExpressCard", false);
        if (cVarC == null) {
            return null;
        }
        NfcCommandHandler.b bVar = NfcCommandHandler.b.WALLET_UPDATE_REQUEST_RESPONSE;
        Parcelable.Creator<com.garmin.device.nfc.h> creator = com.garmin.device.nfc.h.CREATOR;
        com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(bVar, com.garmin.device.nfc.h.f(str, bArr, ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f14).array()));
        tl2.i iVar2 = cVarC.f50805f;
        tl2.g gVar = tl2.i.f165328k;
        ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(iVar2.d(iVar, AbstractComponentTracker.LINGERING_TIMEOUT, 0), new pl2.g(i14), cVarC.f50804e);
        listenableFutureTransformAsync.getClass();
        return Futures.transform(listenableFutureTransformAsync, new androidx.media3.common.p(7), f99646l);
    }

    @Override // hs2.d
    public final hs2.g q() {
        hs2.g gVar = this.f99652f.get();
        gVar.getClass();
        return gVar;
    }

    @Override // hs2.d
    public final void r(g gVar) {
        rl2.c cVarC = c("checkPasscodeData", this.f99652f.get() == hs2.g.LOCKED_PASSCODE);
        if (cVarC == null) {
            gVar.accept(null);
        } else {
            g(hs2.g.CHECKING_PASSCODE_AND_OWNER_DATA);
            cVarC.c(new g(2, this, gVar));
        }
    }

    @Override // hs2.d
    public final boolean s() {
        return this.f99653g.get() != null;
    }

    @Override // hs2.d
    public final void t(String str, String str2, ps2.m mVar) {
        str.getClass();
        rl2.c cVarC = c("changePasscode", false);
        if (cVarC == null) {
            mVar.accept(null);
            return;
        }
        g(hs2.g.CHANGING_PASSCODE);
        pl2.k kVar = new pl2.k(str, str2, this.f99655i, 5);
        g gVar = new g(0, this, mVar);
        sl2.f fVar = this.f99649c;
        fVar.getClass();
        cVarC.f50805f.b(new sl2.c(kVar.f138584a, kVar.f138585b, kVar.f138587d, kVar.f138586c, fVar, gVar));
    }

    @Override // hs2.d
    public final int u(wl2.f fVar) {
        rl2.c cVarC = c("requestWalletMetadataTransfer", false);
        if (cVarC == null) {
            return -1;
        }
        tl2.i iVar = cVarC.f50805f;
        iVar.getClass();
        return iVar.f(new wl2.b(iVar.a(fVar)));
    }

    @Override // hs2.d
    public final void v(String str) {
        str.getClass();
        this.f99648b = str;
    }

    @Override // hs2.d
    public final FluentFuture w(is2.b bVar, Set set) {
        ListenableFuture listenableFutureE;
        bVar.getClass();
        set.getClass();
        rl2.c cVarC = c("deleteByProvider", false);
        if (cVarC != null) {
            NfcCommandHandler.d dVar = b.f99658a[bVar.ordinal()] == 1 ? NfcCommandHandler.d.FITPAY : null;
            boolean zIsEmpty = set.isEmpty();
            ListeningScheduledExecutorService listeningScheduledExecutorService = f99646l;
            FluentFuture fluentFutureTransformAsync = (zIsEmpty || (listenableFutureE = E(set, true)) == null) ? null : FluentFuture.from(listenableFutureE).transformAsync(new k(this, 0), listeningScheduledExecutorService);
            if (fluentFutureTransformAsync != null) {
                return fluentFutureTransformAsync.transformAsync(new j(this, 0, dVar, cVarC), listeningScheduledExecutorService);
            }
        }
        return null;
    }

    @Override // hs2.d
    public final void y(ps2.l lVar) {
        rl2.c cVar = this.f99653g.get();
        if (cVar == null || this.f99652f.get() == hs2.g.DISCONNECTED) {
            lVar.accept(Boolean.FALSE);
            return;
        }
        this.f99650d.debug("deleteWallet()");
        g(hs2.g.RESETTING_SECURE_ELEMENT);
        cVar.e(new l(this, 0, cVar, lVar));
    }

    @Override // hs2.d
    public final void z(s3 s3Var) {
        rl2.c cVarC = c("checkAvailableSpace", false);
        if (cVarC == null) {
            s3Var.accept(null);
            return;
        }
        f fVar = new f(s3Var, 1);
        NfcCommandHandler.f50799g.trace("Get available space");
        cVarC.f50805f.c(new pl2.b(fVar));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljn2/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DELAY_IDLE_TRANSITION_MILLIS", "J", "Lcom/google/common/util/concurrent/ListeningScheduledExecutorService;", "kotlin.jvm.PlatformType", "EXECUTOR_SERVICE", "Lcom/google/common/util/concurrent/ListeningScheduledExecutorService;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(hs2.a aVar, hs2.g gVar) {
        this(aVar.getUnitId(), aVar.getMacAddress(), aVar.getNfcInfo().getNfcChipType(), gVar);
        aVar.getClass();
        gVar.getClass();
    }
}
