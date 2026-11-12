package lm2;

import java.io.Serializable;
import java.util.UUID;
import o13.m;
import o13.p;
import o13.r;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llm2/a;", "Lsk2/b;", "<init>", "()V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a implements sk2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f113609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sk2.g f113610c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f113611a = m.b(new ll0.b(1));

    static {
        new C2170a(null);
        f113609b = LoggerFactory.getLogger("PAIR#CachedDeviceXml");
        f113610c = new sk2.g();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r10 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(a aVar, rs2.c cVar, v13.c cVar2) {
        b bVar;
        p<byte[], UUID> pVarF;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i14 = bVar.f113614c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f113614c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar, cVar2);
            }
        } else {
            bVar = new b(aVar, cVar2);
        }
        Object objA = bVar.f113612a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f113614c;
        Logger logger = f113609b;
        if (i15 == 0) {
            r.b(objA);
            f fVar = (f) aVar.f113611a.getValue();
            if (fVar != null) {
                boolean zK = fVar.k(cVar.getF172494b());
                sk2.g gVar = f113610c;
                if (zK) {
                    pVarF = fVar.f(cVar);
                    if (pVarF.f128594a == null) {
                        bVar.f113614c = 1;
                        objA = gVar.a(cVar, bVar);
                    }
                    if (pVarF != null) {
                        return pVarF;
                    }
                } else {
                    logger.debug("getSavedGarminDeviceXML for unpaired device ".concat(cl2.c.p(cVar)));
                    bVar.f113614c = 2;
                    objA = gVar.a(cVar, bVar);
                }
                return aVar2;
            }
        } else if (i15 == 1) {
            r.b(objA);
            pVarF = (p) objA;
            if (pVarF != null) {
                return pVarF;
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
            pVarF = (p) objA;
            if (pVarF != null) {
                return pVarF;
            }
        }
        logger.warn("getSavedGarminDeviceXML no delegate");
        return new p(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r5.b(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r5.b(r8, r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(a aVar, rs2.c cVar, p pVar, v13.c cVar2) {
        c cVar3;
        if (cVar2 instanceof c) {
            cVar3 = (c) cVar2;
            int i14 = cVar3.f113617c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar3.f113617c = i14 - Integer.MIN_VALUE;
            } else {
                cVar3 = new c(aVar, cVar2);
            }
        } else {
            cVar3 = new c(aVar, cVar2);
        }
        Object obj = cVar3.f113615a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f113617c;
        if (i15 == 0) {
            r.b(obj);
            f fVar = (f) aVar.f113611a.getValue();
            Logger logger = f113609b;
            if (fVar != null) {
                boolean zK = fVar.k(cVar.getF172494b());
                sk2.g gVar = f113610c;
                if (zK) {
                    fVar.a(cVar, pVar);
                    cVar3.f113617c = 1;
                } else {
                    logger.debug("updateGarminDeviceXML for unpaired device ".concat(cl2.c.p(cVar)));
                    cVar3.f113617c = 2;
                }
            } else {
                logger.warn("updateGarminDeviceXML no delegate");
            }
        } else {
            if (i15 != 1 && i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // sk2.b
    public final Object a(rs2.c cVar, v13.c cVar2) {
        return c(this, cVar, cVar2);
    }

    @Override // sk2.b
    public final Object b(rs2.c cVar, p<byte[], UUID> pVar, t13.d<? super Unit> dVar) {
        return d(this, cVar, pVar, (v13.c) dVar);
    }

    /* JADX INFO: renamed from: lm2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llm2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "Lsk2/g;", "LOCAL_CACHE", "Lsk2/g;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2170a {
        public /* synthetic */ C2170a(j jVar) {
            this();
        }

        private C2170a() {
        }
    }
}
