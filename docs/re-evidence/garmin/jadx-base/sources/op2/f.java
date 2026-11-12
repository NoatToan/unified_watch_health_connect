package op2;

import android.content.Context;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import fo2.s;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import ps2.w;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayRemoveCardOperation$removeCard$1", f = "NewFitPayRemoveCardOperation.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f133188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f133191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f133192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<wr2.q.b, Unit> f133193f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayRemoveCardOperation$removeCard$1$1", f = "NewFitPayRemoveCardOperation.kt", l = {57, 58, 59}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m0 f133194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f133195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f133196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f133197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m0 f133198e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, long j8, m0 m0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133196c = eVar;
            this.f133197d = j8;
            this.f133198e = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133196c, this.f133197d, this.f133198e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008d  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
        
            if (zn2.g1.g0(r13, null, r12, 7) == r0) goto L36;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            long j8;
            Object next;
            ms2.d dVarG;
            m0 m0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133195b;
            m0 m0Var2 = this.f133198e;
            e eVar = this.f133196c;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else if (i14 == 2) {
                    m0Var = this.f133194a;
                    r.b(obj);
                    m0Var.f105804a = ((Boolean) obj).booleanValue();
                    if (m0Var2.f105804a) {
                        g1 g1Var = eVar.f133187e.f205979a;
                        this.f133194a = null;
                        this.f133195b = 3;
                    }
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar.getClass();
            es2.a aVarE = GarminPayCoreDatabase.b.a(contextC).e();
            Logger logger = e.f133186f;
            List<fs2.a> listK = aVarE.k(eVar.f186873a.f73426a);
            listK.getClass();
            Iterator<T> it = listK.iterator();
            do {
                boolean zHasNext = it.hasNext();
                j8 = this.f133197d;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((fs2.a) next).f73431f != j8);
            next.getClass();
            String str = ((fs2.a) next).f73434i;
            w wVar = w.f140538a;
            is2.b bVar2 = is2.b.FITPAY;
            wVar.getClass();
            ps2.n nVarI = w.i(j8);
            if (nVarI != null) {
                dVarG = nVarI.g(bVar2);
                if (!(dVarG instanceof t)) {
                    dVarG = null;
                }
            } else {
                dVarG = null;
            }
            dVarG.getClass();
            s sVar = ((t) dVarG).f205819e.f205629a;
            z0 z0Var = eVar.f133187e;
            z0Var.getClass();
            g1 g1Var2 = z0Var.f205979a;
            this.f133195b = 1;
            ch.qos.logback.classic.Logger logger2 = g1.f205525n;
            obj = g1Var2.A(str, sVar, false, this);
            if (obj != aVar) {
            }
            return aVar;
            g1 g1Var3 = eVar.f133187e.f205979a;
            String link = ((yo2.b) obj).getCreditCardLink().getLink();
            this.f133194a = m0Var2;
            this.f133195b = 2;
            obj = g1Var3.p(link, this);
            if (obj != aVar) {
                m0Var = m0Var2;
                m0Var.f105804a = ((Boolean) obj).booleanValue();
                if (m0Var2.f105804a) {
                    g1 g1Var4 = eVar.f133187e.f205979a;
                    this.f133194a = null;
                    this.f133195b = 3;
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(long j8, e eVar, e23.l<? super wr2.q.b, Unit> lVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f133191d = j8;
        this.f133192e = eVar;
        this.f133193f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f133191d, this.f133192e, this.f133193f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hs2.b bVarH;
        int i14;
        m0 m0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f133190c;
        e23.l<wr2.q.b, Unit> lVar = this.f133193f;
        try {
            if (i15 == 0) {
                r.b(obj);
                w.f140538a.getClass();
                ps2.n nVarI = w.i(this.f133191d);
                if (nVarI == null || (bVarH = nVarI.h()) == null) {
                    bVarH = hs2.b.DISCONNECTED;
                }
                int i16 = bVarH == hs2.b.READY ? 1 : 0;
                m0 m0Var2 = new m0();
                x53.c cVar = s0.f129406a;
                a aVar2 = new a(this.f133192e, this.f133191d, m0Var2, null);
                this.f133188a = m0Var2;
                this.f133189b = i16;
                this.f133190c = 1;
                if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
                i14 = i16;
                m0Var = m0Var2;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = this.f133189b;
                m0Var = this.f133188a;
                r.b(obj);
            }
            boolean z14 = m0Var.f105804a;
            e eVar = this.f133192e;
            if (!z14) {
                e.f133186f.error("removeCard: Card removal failed (itemId: " + eVar.f186873a.f73426a + ")");
                lVar.invoke(wr2.q.b.REMOVE_FAILED);
            } else if (i14 == 0) {
                Logger logger = e.f133186f;
                fs2.a aVar3 = eVar.f186873a;
                logger.info("removeCard: Card removal partially successful (itemId: " + aVar3.f73426a + "). Card will be removed from device on the next sync (unitId: " + aVar3.f73431f + ")");
                lVar.invoke(wr2.q.b.REMOVED_PARTIALLY);
            } else {
                e.f133186f.info("removeCard: Card removal successful (itemId: " + eVar.f186873a.f73426a + ")");
                lVar.invoke(wr2.q.b.REMOVED_COMPLETELY);
            }
        } catch (Exception e4) {
            lVar.invoke(wr2.q.b.REMOVE_FAILED);
            e.f133186f.error("removeCard", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
