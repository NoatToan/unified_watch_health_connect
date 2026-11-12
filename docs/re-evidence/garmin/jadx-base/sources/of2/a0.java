package of2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$startListening$1", f = "LSVSession.kt", l = {83, 92}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131716b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f131717a;

        public a(b bVar) {
            this.f131717a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ?? r15;
            sf2.c cVar = (sf2.c) obj;
            zg2.c cVar2 = zg2.c.f204692a;
            String str = "updateListener collect " + (cVar != null ? cVar.getClass().getName() : null);
            cVar2.getClass();
            zg2.c.a("LSVSession", str);
            boolean z14 = cVar instanceof sf2.c.b;
            b bVar = this.f131717a;
            if (z14) {
                List<rf2.b> list = ((sf2.c.b) cVar).f158898a;
                pf2.a aVar = bVar.f131727f;
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (rf2.b bVar2 : list) {
                    List listK = p13.x.k(rf2.a.TIME, rf2.a.TIME_ELAPSED, rf2.a.TIME_ACTIVE, rf2.a.TIME_LAP, rf2.a.ESTIMATED_FINISH_TIME, rf2.a.WORKOUT_INTERVAL_TIMER, rf2.a.WORKOUT_CURRENT_REPEAT_TIME_TO_GO);
                    rf2.a aVar2 = bVar2.f152455a;
                    ?? r14 = bVar2.f152460f;
                    if (listK.contains(aVar2)) {
                        Float fValueOf = r14 != 0 ? Float.valueOf(r14.floatValue() / 1000) : null;
                        if (fValueOf == null) {
                            if (r14 == 0) {
                                r14 = bVar2.f152461g;
                            }
                            r15 = r14;
                        } else {
                            r15 = fValueOf;
                        }
                        rf2.a aVar3 = bVar2.f152455a;
                        int i14 = bVar2.f152456b;
                        rf2.k kVar = bVar2.f152457c;
                        String str2 = bVar2.f152459e;
                        aVar3.getClass();
                        str2.getClass();
                        bVar2 = new rf2.b(aVar3, i14, kVar, r15, str2);
                    }
                    arrayList.add(bVar2);
                }
                aVar.getClass();
                AtomicReference<List<rf2.b>> atomicReference = aVar.f137574a;
                List<rf2.b> list2 = atomicReference.get();
                list2.getClass();
                ArrayList arrayList2 = new ArrayList(list2);
                arrayList2.addAll(arrayList);
                atomicReference.set(arrayList2);
                if (!bVar.f131735n.get().booleanValue()) {
                    AtomicReference<List<rf2.b>> atomicReference2 = aVar.f137575b;
                    List<rf2.b> list3 = atomicReference2.get();
                    list3.getClass();
                    ArrayList arrayList3 = new ArrayList(list3);
                    arrayList3.addAll(arrayList);
                    atomicReference2.set(arrayList3);
                }
                ge1.b.T(bVar.f131732k, null, null, new e(bVar, arrayList, null), 3);
            } else if (cVar instanceof sf2.c.i) {
                sf2.c.i iVar = (sf2.c.i) cVar;
                int i15 = iVar.f158915a;
                rf2.b bVar3 = iVar.f158916b;
                rf2.b bVar4 = iVar.f158917c;
                pf2.a aVar4 = bVar.f131727f;
                aVar4.a(bVar3);
                aVar4.a(bVar4);
                ge1.b.T(bVar.f131732k, null, null, new l(bVar, i15, bVar3, bVar4, null), 3);
            } else if (cVar instanceof sf2.c.t) {
                sf2.c.t tVar = (sf2.c.t) cVar;
                String str3 = tVar.f158928a;
                rf2.b bVar5 = tVar.f158929b;
                int i16 = tVar.f158930c;
                int i17 = tVar.f158931d;
                bVar.f131727f.a(bVar5);
                ge1.b.T(bVar.f131732k, null, null, new w(bVar, str3, i16, i17, bVar5, null), 3);
            } else if (cVar instanceof sf2.c.v) {
                sf2.c.v vVar = (sf2.c.v) cVar;
                String str4 = vVar.f158935a;
                rf2.b bVar6 = vVar.f158936b;
                bVar.f131727f.a(bVar6);
                ge1.b.T(bVar.f131732k, null, null, new y(bVar, str4, bVar6, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.C3003c.f158899a)) {
                int i18 = b.f131721p;
                bVar.d();
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.d.f158900a)) {
                int i19 = b.f131721p;
                bVar.getClass();
                zg2.c.a("LSVSession", "notifyDeviceDisconnected timer Start");
                zg2.g gVar = bVar.f131730i;
                zg2.g.b[] bVarArr = {zg2.g.b.TIME_ALERT_5S, zg2.g.b.TIME_ALERT_30M};
                of2.a aVar5 = new of2.a(bVar, 0);
                gVar.getClass();
                if (gVar.f204702b != null) {
                    gVar.a();
                }
                x53.c cVar3 = o53.s0.f129406a;
                gVar.f204703c = ge1.b.T(o53.c0.a(u53.o.f168762a.plus(g8.i.c())), null, null, new zg2.h(bVarArr, gVar, aVar5, null), 3);
            } else if (cVar instanceof sf2.c.l) {
                ge1.b.T(bVar.f131732k, null, null, new p(bVar, ((sf2.c.l) cVar).f158920a, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.o.f158923a)) {
                bVar.f131735n.set(Boolean.FALSE);
                ge1.b.T(bVar.f131732k, null, null, new s(bVar, null), 3);
            } else if (cVar instanceof sf2.c.m) {
                Integer num = ((sf2.c.m) cVar).f158921a;
                bVar.f131735n.set(Boolean.TRUE);
                ge1.b.T(bVar.f131732k, null, null, new q(bVar, num, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.g.f158908a)) {
                ge1.b.T(bVar.f131732k, null, null, new j(bVar, null), 3);
            } else if (cVar instanceof sf2.c.e) {
                ge1.b.T(bVar.f131732k, null, null, new h(bVar, (sf2.c.e) cVar, null), 3);
            } else if (cVar instanceof sf2.c.f) {
                ge1.b.T(bVar.f131732k, null, null, new i(bVar, (sf2.c.f) cVar, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.j.f158918a)) {
                ge1.b.T(bVar.f131732k, null, null, new m(bVar, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.k.f158919a)) {
                ge1.b.T(bVar.f131732k, null, null, new n(bVar, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.n.f158922a)) {
                ge1.b.T(bVar.f131732k, null, null, new r(bVar, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.p.f158924a)) {
                ge1.b.T(bVar.f131732k, null, null, new t(bVar, null), 3);
            } else if (cVar instanceof sf2.c.h) {
                ge1.b.T(bVar.f131732k, null, null, new k(bVar, (sf2.c.h) cVar, null), 3);
            } else if (cVar instanceof sf2.c.u) {
                ge1.b.T(bVar.f131732k, null, null, new x(bVar, (sf2.c.u) cVar, null), 3);
            } else if (cVar instanceof sf2.c.a) {
                bVar.getClass();
                ge1.b.T(bVar.f131732k, null, null, new d(bVar, (sf2.c.a) cVar, null), 3);
            } else if (p005kotlin.jvm.internal.s.g(cVar, sf2.c.q.f158925a) || p005kotlin.jvm.internal.s.g(cVar, sf2.c.r.f158926a) || p005kotlin.jvm.internal.s.g(cVar, sf2.c.s.f158927a) || p005kotlin.jvm.internal.s.g(cVar, sf2.c.w.f158937a)) {
                ge1.b.T(bVar.f131732k, null, null, new u(bVar, cVar, null), 3);
            } else if (cVar != null) {
                lc.u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b bVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f131716b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f131716b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r53.e2.m(r10, r1, r9) == r0) goto L16;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131715a;
        b bVar = this.f131716b;
        if (i14 == 0) {
            o13.r.b(obj);
            b0 b0Var = (b0) bVar.f131736o.getValue();
            sf2.a.d dVar = new sf2.a.d(b0Var.f131744a, b0Var.f131748e, b0Var.f131757n, b0Var.f131753j);
            this.f131715a = 1;
            if (b0Var.b(dVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
        e2 e2Var = bVar.f131723b.f170500a;
        a aVar2 = new a(bVar);
        this.f131715a = 2;
        e2Var.getClass();
    }
}
