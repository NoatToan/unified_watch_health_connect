package op2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayRemoveCardOperation$removeCards$1", f = "NewFitPayRemoveCardOperation.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f133200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f133202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f133203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<wr2.q.b, Unit> f133204f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayRemoveCardOperation$removeCards$1$1", f = "NewFitPayRemoveCardOperation.kt", l = {109, 111}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f133205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0 f133206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f133207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f133208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f133209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f133210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f133211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f133212h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e f133213i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Set<Long> f133214j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r0<List<Boolean>> f133215k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Set<Long> set, r0<List<Boolean>> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133213i = eVar;
            this.f133214j = set;
            this.f133215k = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f133213i, this.f133214j, this.f133215k, dVar);
            aVar.f133212h = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:37:0x0120  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0120 -> B:38:0x0124). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: op2.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Set<Long> set, e eVar, e23.l<? super wr2.q.b, Unit> lVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f133202d = set;
        this.f133203e = eVar;
        this.f133204f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f133202d, this.f133203e, this.f133204f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hs2.b bVarH;
        int i14;
        int i15;
        r0 r0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f133201c;
        e23.l<wr2.q.b, Unit> lVar = this.f133204f;
        e eVar = this.f133203e;
        try {
            if (i16 == 0) {
                r.b(obj);
                Set<Long> set = this.f133202d;
                Set<Long> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it = set2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i14 = 1;
                            break;
                        }
                        long jLongValue = ((Number) it.next()).longValue();
                        w.f140538a.getClass();
                        ps2.n nVarI = w.i(jLongValue);
                        if (nVarI == null || (bVarH = nVarI.h()) == null) {
                            bVarH = hs2.b.DISCONNECTED;
                        }
                        if (bVarH != hs2.b.READY) {
                            i14 = 0;
                            break;
                        }
                    }
                } else {
                    i14 = 1;
                    break;
                }
                if (i14 == 0) {
                    e.f133186f.info("Not all devices associated to the card are currently connected => removal will be partial for some devices");
                }
                r0 r0Var2 = new r0();
                r0Var2.f105810a = new ArrayList();
                x53.c cVar = s0.f129406a;
                a aVar2 = new a(eVar, set, r0Var2, null);
                this.f133200b = r0Var2;
                this.f133199a = i14;
                this.f133201c = 1;
                if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
                i15 = i14;
                r0Var = r0Var2;
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i15 = this.f133199a;
                r0Var = this.f133200b;
                r.b(obj);
            }
            if (((List) r0Var.f105810a).contains(Boolean.FALSE)) {
                e.f133186f.error("removeCards: Card removal failed (itemId: " + eVar.f186873a.f73426a + ")");
                lVar.invoke(wr2.q.b.REMOVE_FAILED);
            } else if (i15 == 0) {
                Logger logger = e.f133186f;
                fs2.a aVar3 = eVar.f186873a;
                logger.info("removeCards: Card removal partially successful (itemId: " + aVar3.f73426a + "). Card will be removed from device on the next sync (unitId: " + aVar3.f73431f + ")");
                lVar.invoke(wr2.q.b.REMOVED_PARTIALLY);
            } else {
                e.f133186f.info("removeCards: Card removal successful (itemId: " + eVar.f186873a.f73426a + ")");
                lVar.invoke(wr2.q.b.REMOVED_COMPLETELY);
            }
        } catch (Exception e4) {
            lVar.invoke(wr2.q.b.REMOVE_FAILED);
            e.f133186f.error("removeCard", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
