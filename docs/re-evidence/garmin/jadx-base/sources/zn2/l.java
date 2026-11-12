package zn2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import okhttp3.Response;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzn2/l;", "", "Lfo2/s;", "device", "<init>", "(Lfo2/s;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f205628b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo2.s f205629a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205630a;

        static {
            int[] iArr = new int[vo2.y.values().length];
            try {
                iArr[vo2.y.APDU_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f205630a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f205628b = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewDeviceDataManager");
    }

    public l(fo2.s sVar) {
        sVar.getClass();
        this.f205629a = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r12 == r3) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xo2.g gVar, Object obj, v13.c cVar) {
        m mVar;
        boolean zIsSuccessful;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f205660d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f205660d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objC = mVar.f205658b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f205660d;
        Logger logger = f205628b;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                logger.debug("ackCommit");
                vo2.y yVar = gVar.f191808b;
                String str = gVar.f191807a;
                if ((yVar == null ? -1 : b.f205630a[yVar.ordinal()]) == 1) {
                    String str2 = gVar.f191809c;
                    if (str2 == null) {
                        logger.error("ackCommit: ack link is null, can not ack commit " + str);
                        return Boolean.FALSE;
                    }
                    u0 u0Var = u0.f205864a;
                    mVar.f205657a = gVar;
                    mVar.f205660d = 1;
                    u0Var.getClass();
                    objC = u0.g().C(str2, obj, mVar);
                    if (objC == aVar) {
                    }
                    zIsSuccessful = ((c83.a0) objC).f25745a.isSuccessful();
                } else {
                    String str3 = gVar.f191810d;
                    if (str3 == null) {
                        logger.error("ackCommit: confirm link is null, can not ack commit " + str);
                        return Boolean.FALSE;
                    }
                    u0 u0Var2 = u0.f205864a;
                    mVar.f205657a = gVar;
                    mVar.f205660d = 2;
                    u0Var2.getClass();
                    objC = u0.g().C(str3, obj, mVar);
                }
                return aVar;
            }
            if (i15 == 1) {
                xo2.g gVar2 = mVar.f205657a;
                o13.r.b(objC);
                zIsSuccessful = ((c83.a0) objC).f25745a.isSuccessful();
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xo2.g gVar3 = mVar.f205657a;
                o13.r.b(objC);
                zIsSuccessful = ((c83.a0) objC).f25745a.isSuccessful();
            }
            return Boolean.valueOf(zIsSuccessful);
        } catch (Exception unused) {
            com.airbnb.lottie.animation.keyframe.a.z("failed to ack commit request for ", gVar.f191807a, "...", logger);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(v13.c cVar, wo2.e eVar, wo2.f fVar) {
        n nVar;
        boolean zIsSuccessful;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f205682d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f205682d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objC = nVar.f205680b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f205682d;
        Logger logger = f205628b;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                logger.debug("completeSync");
                if (fVar.getF186518d() == null) {
                    logger.error("completeSync: can not complete sync for " + fVar.getF186515a() + ", complete link is null");
                    return Boolean.FALSE;
                }
                u0 u0Var = u0.f205864a;
                String f186518d = fVar.getF186518d();
                f186518d.getClass();
                String string = f186518d.toString();
                nVar.f205679a = fVar;
                nVar.f205682d = 1;
                u0Var.getClass();
                objC = u0.g().C(string, eVar, nVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo2.f fVar2 = nVar.f205679a;
                o13.r.b(objC);
            }
            zIsSuccessful = ((c83.a0) objC).f25745a.isSuccessful();
        } catch (Exception unused) {
            com.airbnb.lottie.animation.keyframe.a.z("failed to complete sync request for ", fVar.getF186515a(), "...", logger);
            zIsSuccessful = false;
        }
        return Boolean.valueOf(zIsSuccessful);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r1 == r7) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c4 -> B:42:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i14, String str, v13.c cVar) throws NewFitPayException {
        o oVar;
        int i15;
        xo2.e eVar;
        c83.a0 a0Var;
        String link;
        fo2.p pVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i16 = oVar.f205707f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                oVar.f205707f = i16 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        o oVar2 = oVar;
        Object objM = oVar2.f205705d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = oVar2.f205707f;
        if (i17 == 0) {
            o13.r.b(objM);
            f205628b.debug("getCommits");
            String link2 = this.f205629a.f73109i.getLink();
            if (link2 == null) {
                throw new NewFitPayException("getCommits: commitLink is null, can not get commits", z.UNABLE_TO_LOAD_COMMITS, null, 4, null);
            }
            u0 u0Var = u0.f205864a;
            oVar2.f205704c = i14;
            oVar2.f205707f = 1;
            u0Var.getClass();
            if (str != null) {
                u0Var.getClass();
                objM = u0.g().V(link2, str, 0, i14, oVar2);
            } else {
                objM = u0.g().m(link2, 0, i14, oVar2);
            }
            if (objM != aVar) {
                i15 = i14;
            }
            return aVar;
        }
        if (i17 == 1) {
            i15 = oVar2.f205704c;
            o13.r.b(objM);
        } else {
            if (i17 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = oVar2.f205704c;
            eVar = oVar2.f205703b;
            a0Var = oVar2.f205702a;
            o13.r.b(objM);
        }
        c83.a0 a0Var2 = (c83.a0) objM;
        if (!a0Var2.f25745a.isSuccessful()) {
            throw new NewFitPayException("getCommits: failed to get commits, code: " + a0Var.f25745a.code() + " message: " + a0Var.f25746b, z.UNABLE_TO_LOAD_COMMITS, null, 4, null);
        }
        xo2.e eVar2 = (xo2.e) a0Var2.f25746b;
        if (eVar2 != null) {
            eVar.d(eVar2.getLimit());
            eVar.e(eVar2.getOffset());
            eVar.f191801c = eVar2.f191801c;
            eVar.a().addAll(eVar2.a());
        }
        if (eVar != null || (pVar = eVar.f191801c) == null) {
            link = null;
        } else {
            link = pVar.getLink();
        }
        if (link != null) {
            return eVar;
        }
        u0 u0Var2 = u0.f205864a;
        fo2.p pVar2 = eVar.f191801c;
        String link3 = pVar2 != null ? pVar2.getLink() : null;
        link3.getClass();
        oVar2.f205702a = a0Var;
        oVar2.f205703b = eVar;
        oVar2.f205704c = i15;
        oVar2.f205707f = 2;
        u0Var2.getClass();
        objM = u0.g().m(link3, 0, i15, oVar2);
        c83.a0 a0Var3 = (c83.a0) objM;
        Response response = a0Var3.f25745a;
        Object obj = a0Var3.f25746b;
        if (!response.isSuccessful()) {
            throw new NewFitPayException("getCommits: failed to get commits, code: " + a0Var3.f25745a.code() + " message: " + obj, z.UNABLE_TO_LOAD_COMMITS, null, 4, null);
        }
        eVar = (xo2.e) obj;
        a0Var = a0Var3;
        if (eVar != null) {
            link = null;
        } else {
            link = null;
        }
        if (link != null) {
            return eVar;
        }
        u0 u0Var3 = u0.f205864a;
        fo2.p pVar3 = eVar.f191801c;
        if (pVar3 != null) {
        }
        link3.getClass();
        oVar2.f205702a = a0Var;
        oVar2.f205703b = eVar;
        oVar2.f205704c = i15;
        oVar2.f205707f = 2;
        u0Var3.getClass();
        objM = u0.g().m(link3, 0, i15, oVar2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fo2.s getF205629a() {
        return this.f205629a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(v13.c cVar) {
        p pVar;
        Long unprocessedCommitsCount;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f205723c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f205723c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objA = pVar.f205721a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f205723c;
        Logger logger = f205628b;
        boolean z14 = true;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                String link = this.f205629a.f73108h.getLink();
                if (link == null || link.length() == 0) {
                    logger.error("getUnProcessedCommitsCount: deviceStatisticsLink is null or empty");
                    return Boolean.FALSE;
                }
                u0 u0Var = u0.f205864a;
                pVar.f205723c = 1;
                u0Var.getClass();
                objA = u0.f205870g.getValue().a(link, pVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            c83.a0 a0Var = (c83.a0) objA;
            if (!a0Var.f25745a.isSuccessful()) {
                return Boolean.FALSE;
            }
            wo2.d dVar = (wo2.d) a0Var.f25746b;
            if (dVar == null || (unprocessedCommitsCount = dVar.getUnprocessedCommitsCount()) == null) {
                return Boolean.FALSE;
            }
            long jLongValue = unprocessedCommitsCount.longValue();
            logger.debug("hasUnprocessedCommits: unprocessedCommit counts: " + jLongValue);
            if (jLongValue <= 0) {
                z14 = false;
            }
            return Boolean.valueOf(z14);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzn2/l$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
