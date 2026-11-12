package com.garmin.feature.garminpay.providers.gpay.sync;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import fo2.i0;
import fo2.l0;
import mn2.k;
import mn2.o;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;
import vo2.x;
import vo2.y;
import xo2.g;
import zn2.g1;
import zn2.i;
import zn2.t;
import zn2.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewFitPayTransitCardSync;", "", "Lhs2/d;", "device", "Lhs2/a;", TtmlNode.TAG_METADATA, "Lzn2/g1;", "userDataManager", "Lzn2/t;", "deviceServiceProvider", "Lmn2/k;", "nfcApi", "Lmn2/o;", "ciqImageApi", "<init>", "(Lhs2/d;Lhs2/a;Lzn2/g1;Lzn2/t;Lmn2/k;Lmn2/o;)V", "SyncException", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewFitPayTransitCardSync {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f51347g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.d f51348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.a f51349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f51350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f51351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f51352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f51353f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51354a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.CREDENTIAL_METADATA_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.CREDENTIAL_ACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.CREDENTIAL_DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51354a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NewFitPayTransitCardSync(hs2.d dVar, hs2.a aVar, g1 g1Var, t tVar, k kVar, o oVar, int i14, j jVar) {
        if ((i14 & 16) != 0) {
            ln2.e.f113687a.getClass();
            Object objB = ln2.e.a().b(k.class);
            objB.getClass();
            kVar = (k) objB;
        }
        k kVar2 = kVar;
        if ((i14 & 32) != 0) {
            ln2.e.f113687a.getClass();
            Object objB2 = ln2.e.c().b(o.class);
            objB2.getClass();
            oVar = (o) objB2;
        }
        this(dVar, aVar, g1Var, tVar, kVar2, oVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:81:0x015b, B:21:0x0045, B:91:0x0176, B:95:0x017c, B:98:0x0184, B:99:0x018b, B:100:0x018c, B:101:0x0193, B:64:0x00fa, B:67:0x0100, B:74:0x013f, B:75:0x0142, B:78:0x0147, B:82:0x015e, B:86:0x0165, B:88:0x0169, B:70:0x0131, B:63:0x00f2, B:46:0x00c6, B:28:0x0057, B:31:0x005e, B:33:0x0062, B:35:0x0068, B:39:0x008c, B:40:0x009f, B:24:0x0050, B:44:0x00b9, B:41:0x00a0, B:48:0x00d2, B:52:0x00d9, B:54:0x00dd, B:56:0x00e3, B:58:0x00e9), top: B:107:0x002b, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0035, B:81:0x015b, B:21:0x0045, B:91:0x0176, B:95:0x017c, B:98:0x0184, B:99:0x018b, B:100:0x018c, B:101:0x0193, B:64:0x00fa, B:67:0x0100, B:74:0x013f, B:75:0x0142, B:78:0x0147, B:82:0x015e, B:86:0x0165, B:88:0x0169, B:70:0x0131, B:63:0x00f2, B:46:0x00c6, B:28:0x0057, B:31:0x005e, B:33:0x0062, B:35:0x0068, B:39:0x008c, B:40:0x009f, B:24:0x0050, B:44:0x00b9, B:41:0x00a0, B:48:0x00d2, B:52:0x00d9, B:54:0x00dd, B:56:0x00e3, B:58:0x00e9), top: B:107:0x002b, inners: #0, #2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0173, code lost:
    
        if (r0 == r5) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g gVar, v13.c cVar) {
        x xVar;
        g gVar2;
        Object bVar;
        Object bVar2;
        i0<String, fo2.d> i0VarH;
        String strH;
        Throwable thB;
        g gVar3 = gVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f179222e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f179222e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objC = xVar.f179220c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f179222e;
        try {
            try {
                try {
                    if (i15 == 0) {
                        r.b(objC);
                        String str = gVar3.f191811e;
                        if (str != null) {
                            int i16 = q.f128596b;
                            u0 u0Var = u0.f205864a;
                            xVar.f179218a = gVar3;
                            xVar.f179219b = null;
                            xVar.f179222e = 2;
                            u0Var.getClass();
                            objC = u0.g().N(str, xVar);
                            if (objC == aVar) {
                            }
                        } else {
                            if (gVar3.f191808b != y.CREDENTIAL_DELETED) {
                                throw new SyncException("Unable to get credential link from " + gVar3, wo2.e.b.INVALID_COMMIT_PAYLOAD);
                            }
                            com.garmin.feature.garminpay.providers.gpay.sync.a aVar2 = new com.garmin.feature.garminpay.providers.gpay.sync.a(this.f51348a, this.f51349b, this.f51350c, this.f51351d, this.f51352e, this.f51353f);
                            xVar.f179218a = null;
                            xVar.f179222e = 1;
                            Enum enumA = com.garmin.feature.garminpay.providers.gpay.sync.a.a(aVar2, gVar3, xVar);
                            if (enumA != aVar) {
                                return enumA;
                            }
                        }
                        return aVar;
                    }
                    if (i15 == 1) {
                        r.b(objC);
                        return objC;
                    }
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                r.b(objC);
                                return (yo2.a.EnumC3717a) objC;
                            }
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = xVar.f179219b;
                        r.b(objC);
                        yo2.a.EnumC3717a enumC3717a = (yo2.a.EnumC3717a) objC;
                        if (enumC3717a != null) {
                            return enumC3717a;
                        }
                        thB = q.b(bVar);
                        if (thB != null) {
                            throw new SyncException("Failed to get credential", thB, wo2.e.b.INVALID_COMMIT_PAYLOAD);
                        }
                        throw new SyncException("Failed to get credential", wo2.e.b.INVALID_COMMIT_PAYLOAD);
                    }
                    gVar3 = xVar.f179218a;
                    r.b(objC);
                    l0 l0Var = (l0) (bVar instanceof q.b ? null : bVar);
                    bVar2 = (l0Var == null || (i0VarH = l0Var.h()) == null || (strH = i0VarH.h()) == null) ? null : aq2.k.b(strH);
                } catch (Throwable th3) {
                    int i17 = q.f128596b;
                    bVar2 = new q.b(th3);
                }
                l0 l0Var2 = (l0) ao2.b.b((a0) objC);
                int i18 = q.f128596b;
                gVar2 = gVar3;
                bVar = l0Var2;
            } catch (Throwable th4) {
                int i19 = q.f128596b;
                gVar2 = gVar3;
                bVar = new q.b(th4);
            }
            if (bVar2 instanceof q.b) {
                bVar2 = null;
            }
            hs2.d dVar = this.f51348a;
            hs2.a aVar3 = this.f51349b;
            g1 g1Var = this.f51350c;
            t tVar = this.f51351d;
            k kVar = this.f51352e;
            o oVar = this.f51353f;
            dVar.getClass();
            aVar3.getClass();
            g1Var.getClass();
            tVar.getClass();
            kVar.getClass();
            oVar.getClass();
            oo2.a aVar4 = new oo2.a(dVar, aVar3, g1Var, tVar, kVar, oVar);
            y yVar = gVar2.f191808b;
            int i24 = yVar == null ? -1 : b.f51354a[yVar.ordinal()];
            if (i24 == 1 || i24 == 2) {
                l0 l0Var3 = (l0) (bVar instanceof q.b ? null : bVar);
                if (l0Var3 != null) {
                    xVar.f179218a = null;
                    xVar.f179219b = bVar;
                    xVar.f179222e = 3;
                    objC = aVar4.c(l0Var3, xVar);
                }
                thB = q.b(bVar);
                if (thB != null) {
                    throw new SyncException("Failed to get credential", thB, wo2.e.b.INVALID_COMMIT_PAYLOAD);
                }
                throw new SyncException("Failed to get credential", wo2.e.b.INVALID_COMMIT_PAYLOAD);
            }
            if (i24 != 3) {
                return yo2.a.EnumC3717a.SKIPPED;
            }
            if (bVar instanceof q.b) {
                bVar = null;
            }
            xVar.f179218a = null;
            xVar.f179219b = null;
            xVar.f179222e = 4;
            com.garmin.feature.garminpay.providers.gpay.sync.a aVar5 = aVar4.f133133a;
            aVar5.getClass();
            objC = com.garmin.feature.garminpay.providers.gpay.sync.a.a(aVar5, gVar2, xVar);
            if (objC == aVar) {
            }
            return (yo2.a.EnumC3717a) objC;
            return aVar;
        } catch (Throwable th5) {
            if (th5 instanceof SyncException) {
                throw th5;
            }
            throw new SyncException(fb1.c.n("Transit sync fails: ", th5.getMessage()), th5, yo2.a.b.DEVICE_WALLET_TRANSFER_FAILED);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewFitPayTransitCardSync$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/NewFitPayTransitCardSync$SyncException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Lzn2/i;", "resultFlag", "<init>", "(Ljava/lang/String;Lzn2/i;)V", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;Lzn2/i;)V", "Lzn2/i;", "getResultFlag", "()Lzn2/i;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SyncException extends RuntimeException {
        public static final int $stable = 8;
        private final i resultFlag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SyncException(String str, Throwable th3, i iVar) {
            super(str, th3);
            str.getClass();
            th3.getClass();
            iVar.getClass();
            this.resultFlag = iVar;
        }

        public final i getResultFlag() {
            return this.resultFlag;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SyncException(String str, i iVar) {
            super(str);
            str.getClass();
            iVar.getClass();
            this.resultFlag = iVar;
        }
    }

    public NewFitPayTransitCardSync(hs2.d dVar, hs2.a aVar, g1 g1Var, t tVar, k kVar, o oVar) {
        dVar.getClass();
        aVar.getClass();
        g1Var.getClass();
        tVar.getClass();
        kVar.getClass();
        oVar.getClass();
        this.f51348a = dVar;
        this.f51349b = aVar;
        this.f51350c = g1Var;
        this.f51351d = tVar;
        this.f51352e = kVar;
        this.f51353f = oVar;
    }
}
