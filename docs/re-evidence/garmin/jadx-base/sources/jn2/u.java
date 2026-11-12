package jn2;

import androidx.room.a0;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p1.z;
import ps2.w;
import ps2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljn2/u;", "", "Ljn2/d;", "Ljn2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends jn2.a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f99680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f99681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f99682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f99683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z<hs2.a> f99684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f99685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f99686g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99688b;

        static {
            int[] iArr = new int[pl2.c.values().length];
            try {
                iArr[pl2.c.f138556c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pl2.c.f138557d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pl2.c.f138567n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pl2.c.f138568o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pl2.c.f138566m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pl2.c.f138565l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pl2.c.f138569p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pl2.c.f138571r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[pl2.c.f138570q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[pl2.c.f138572t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[pl2.c.f138558e.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[pl2.c.f138559f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[pl2.c.f138560g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[pl2.c.f138561h.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[pl2.c.f138562i.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[pl2.c.f138563j.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[pl2.c.f138564k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f99687a = iArr;
            int[] iArr2 = new int[rl2.a.values().length];
            try {
                iArr2[rl2.a.CAPABILITIES_PAYLOAD_SIZE_MISMATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[rl2.a.CAPABILITIES_REQUEST_TIMED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[rl2.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[rl2.a.DEVICE_MISSING_NFC_CAPABILITIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            f99688b = iArr2;
        }
    }

    static {
        u uVar = new u();
        f99680a = uVar;
        int i14 = gt2.c.f79010a;
        Logger loggerH = gt2.b.f79005a.h("PAY#PayDeviceFactory");
        f99681b = loggerH;
        f99682c = new HashSet();
        f99683d = Executors.newSingleThreadExecutor();
        f99684e = new z<>(1);
        f99685f = new x(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c());
        f99686g = new c(uVar);
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(uVar);
        loggerH.debug("now listening for 'nfc started', 'device disconnected', 'new device added or removed'");
    }

    private u() {
    }

    public static hs2.a b(long j8, String str, pl2.f fVar) {
        DeviceProfile profile;
        is2.b bVar;
        String str2;
        da2.f.a().getClass();
        da2.d dVarB = da2.d.b();
        da2.b bVar2 = dVarB != null ? dVarB.f58886a.f111646e : null;
        da2.l lVarF = bVar2 != null ? bVar2.f(str) : null;
        if (lVarF == null || (profile = lVarF.getProfile()) == null) {
            return null;
        }
        String f172496d = profile.getF92742f();
        f172496d.getClass();
        int f172495c = profile.getF92744h();
        int f172497e = profile.getF92745i();
        Logger logger = f99681b;
        if (fVar == null) {
            w.f140538a.getClass();
            if (w.i(j8) == null) {
                logger.error("createWalletMetadata(" + j8 + "): intent missing NFC capabilities message");
                return null;
            }
            logger.warn("createWalletMetadata(" + j8 + "): intent missing NFC capabilities message, using previously known data");
            ps2.n nVarI = w.i(j8);
            nVarI.getClass();
            hs2.a aVar = nVarI.f140498a;
            if (str.length() > 0) {
                aVar.j(str);
            }
            return aVar;
        }
        pl2.c[] cVarArrValues = pl2.c.values();
        ArrayList arrayList = new ArrayList();
        int length = cVarArrValues.length;
        int i14 = 0;
        while (i14 < length) {
            pl2.c cVar = cVarArrValues[i14];
            byte[] bArr = fVar.f138580d;
            if (bArr == null) {
                str2 = f172496d;
            } else {
                int i15 = cVar.f138574a;
                int i16 = (i15 / 8) + 1;
                byte b14 = (byte) ((1 << (i15 % 8)) & 255);
                str2 = f172496d;
                if (((bArr.length <= i16 ? (byte) 0 : bArr[i16]) & b14) == b14) {
                    arrayList.add(cVar);
                }
            }
            i14++;
            f172496d = str2;
        }
        String str3 = f172496d;
        int i17 = fVar.f138578b & UnsignedBytes.MAX_VALUE;
        sl2.f[] fVarArrValues = sl2.f.values();
        is2.a aVar2 = new is2.a(i17 < fVarArrValues.length ? fVarArrValues[i17] : sl2.f.f160022b, new HashSet(arrayList));
        logger.debug(v.h.u(j8, "createWalletMetadata(", "): NFC Capabilities chip type: ", aVar2.getNfcChipType().name()));
        if (aVar2.getNfcChipType() == sl2.f.f160022b || aVar2.getNfcChipType() == sl2.f.f160023c) {
            logger.error("handleNFCReady(" + j8 + "): NFC chip is INVALID or UNKNOWN, NFC stack is failed to initialize...");
            Iterator it = f99682c.iterator();
            while (it.hasNext()) {
                ((hs2.e) it.next()).d(j8, hs2.e.a.NFC_STACK_FAILED);
            }
        }
        logger.debug("createWalletMetadata(" + j8 + ")");
        Set<pl2.c> setB = aVar2.b();
        HashSet hashSet = new HashSet();
        Iterator<T> it3 = setB.iterator();
        while (it3.hasNext()) {
            switch (a.f99687a[((pl2.c) it3.next()).ordinal()]) {
                case 1:
                    bVar = is2.b.FITPAY;
                    break;
                case 2:
                    bVar = is2.b.UNION_PAY;
                    break;
                case 3:
                    bVar = is2.b.PRELOAD_EASYCARD;
                    break;
                case 4:
                    bVar = is2.b.PRELOAD_IPASS;
                    break;
                case 5:
                    bVar = is2.b.FELICA;
                    break;
                case 6:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    bVar = null;
                    break;
                case 7:
                    bVar = is2.b.FITPAY;
                    break;
                case 8:
                    bVar = is2.b.RABBIT;
                    break;
                default:
                    u0.r();
                    return null;
            }
            if (bVar != null) {
                hashSet.add(bVar);
            }
        }
        return new hs2.a(j8, str, str3, f172497e, f172495c, aVar2, hashSet);
    }

    public static void c(hs2.a aVar, long j8) {
        sl2.f nfcChipType = aVar.getNfcInfo().getNfcChipType();
        sl2.f fVar = sl2.f.f160023c;
        Logger logger = f99681b;
        if (nfcChipType == fVar || nfcChipType == sl2.f.f160022b) {
            logger.error("handleNFCReady(" + j8 + "): NFC chip is UNKNOWN/INVALID, NFC stack is failed to initialize...");
            return;
        }
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null) {
            logger.warn("handleNFCReady(" + j8 + "): connected to device that isn't saved to database, possible user is in bluetooth pairing flow");
            return;
        }
        if (fVarI.isPaired()) {
            m mVar = new m(aVar, hs2.g.IDLE);
            wr.g.v("handleNFCReady(", j8, "): notifying user wallet device is available for use", logger);
            Iterator it = f99682c.iterator();
            while (it.hasNext()) {
                ((hs2.e) it.next()).b(aVar, mVar);
            }
            return;
        }
        f99684e.f(aVar.getUnitId(), aVar);
        logger.warn("handleNFCReady(" + j8 + "): connected to device that is saved to database, but not yet paired, possible user is in bluetooth pairing flow");
    }

    @Override // jn2.d
    public final void a(ql2.a aVar) {
        aVar.getClass();
        boolean z14 = aVar instanceof ql2.a.d;
        z<hs2.a> zVar = f99684e;
        Logger logger = f99681b;
        if (z14) {
            ql2.a.d dVar = (ql2.a.d) aVar;
            long j8 = dVar.f145243b;
            hs2.a aVarB = b(j8, dVar.f145242a, dVar.f145245d);
            hs2.a aVarC = f99685f.c(j8);
            if (aVarB != null) {
                zVar.f(aVarB.getUnitId(), aVarB);
                c(aVarB, j8);
                return;
            }
            if (aVarC == null) {
                logger.error("handleNfcStarted(" + j8 + "): both device metadata and cached metadata are null, cannot handle NFC started.");
                return;
            }
            logger.warn("handleNfcStarted(" + j8 + "): device metadata is null, but have previously cached metadata, using cache...");
            c(aVarC, j8);
            return;
        }
        boolean z15 = aVar instanceof ql2.a.c;
        ExecutorService executorService = f99683d;
        if (z15) {
            ql2.a.c cVar = (ql2.a.c) aVar;
            executorService.execute(new com.google.android.exoplayer2.audio.d(cVar.f145240a, cVar.f145241b));
            return;
        }
        if (aVar instanceof ql2.a.C2739a) {
            executorService.execute(new com.mapbox.common.experimental.a(((ql2.a.C2739a) aVar).f145237a, 2));
            return;
        }
        if (!(aVar instanceof ql2.a.b)) {
            u0.r();
            return;
        }
        ql2.a.b bVar = (ql2.a.b) aVar;
        long j14 = bVar.f145238a;
        try {
            if (bVar.f145239b) {
                executorService.execute(new com.mapbox.common.experimental.a(j14, 1));
                return;
            }
            w wVar = w.f140538a;
            w.a aVar2 = w.a.REMOVED_GC_DEVICE;
            wVar.getClass();
            w.f(j14, aVar2);
            zVar.g(j14);
        } catch (Throwable th3) {
            logger.error(a0.f(j14, "handleDeviceAddedOrRemoved(", ")"), th3);
        }
    }

    @Override // jn2.a
    public final void deviceActionEventReceived(ql2.a aVar) {
        aVar.getClass();
        com.airbnb.lottie.animation.keyframe.a.w("deviceActionEventReceived: ", aVar.getEventName(), f99681b);
        f99683d.execute(new eh2.b(aVar, 29));
    }
}
