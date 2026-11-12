package sk0;

import c2.c3;
import c2.k3;
import c2.n3;
import c2.q3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e9;
import i3.mc;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import p3.x3;
import u1.a2;
import v62.fa;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.GearListScreenKt$GearListScreenImpl$1$1", f = "GearListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map<b1.b, zc.d<uk0.e>> f159910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h1 f159911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<z0> f159912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<b1.b, zc.d<uk0.e>> map, h1 h1Var, x3<z0> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159910a = map;
            this.f159911b = h1Var;
            this.f159912c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159910a, this.f159911b, this.f159912c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x3<z0> x3Var = this.f159912c;
            if (p13.h0.L(x3Var.getF182175a().f159926d)) {
                Iterator<b1.b> it = x3Var.getF182175a().f159926d.iterator();
                while (it.hasNext()) {
                    zc.d<uk0.e> dVar = this.f159910a.get(it.next());
                    if (dVar != null) {
                        dVar.e();
                    }
                }
                this.f159911b.j2();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.GearListScreenKt$GearListScreenImpl$2$1", f = "GearListScreen.kt", l = {158, 159}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f159914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<z0> f159915c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, x3<z0> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f159914b = mcVar;
            this.f159915c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f159914b, this.f159915c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r5.f159914b.g(r5) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159913a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (this.f159915c.getF182175a().f159930h) {
                    this.f159913a = 1;
                    if (o53.m0.b(100L, this) != aVar) {
                        this.f159913a = 2;
                    }
                    return aVar;
                }
                return Unit.INSTANCE;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                this.f159913a = 2;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.GearListScreenKt$GearListScreenImpl$5$1$1", f = "GearListScreen.kt", l = {474}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f159917b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f159917b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f159917b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159916a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f159916a = 1;
                if (this.f159917b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159918a;

        static {
            int[] iArr = new int[b1.b.values().length];
            try {
                iArr[b1.b.Gear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b1.b.Collections.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b1.b.Retired.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159918a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x038b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0237  */
    /* JADX WARN: Code duplicated, block: B:95:0x029c  */
    public static final void a(h4.r rVar, b1.b bVar, z0 z0Var, final h1 h1Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        p3.o0 o0VarE = mVar.E(-489134710);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 32 : 16);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(z0Var) ? 256 : 128) | (o0VarE.B(h1Var) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(rVar, a2.a(o0VarE), true);
            int i17 = k3.f22728a;
            c3 c3VarB = q3.b(o0VarE);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar2.getClass();
            h4.r rVarX = c2.l.x(rVarB, n3.c(new c2.a(c3VarB, n3.b(0.0f, f14, 0.0f, eVar.f97921f, 5)), o0VarE));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarX, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            int i18 = bVar == null ? -1 : d.f159918a[bVar.ordinal()];
            p3.m.a aVar4 = p3.m.f135153a;
            if (i18 != -1) {
                final int i19 = 1;
                if (i18 != 1) {
                    if (i18 == 2) {
                        z16 = true;
                        o0VarE.C(-1487499962);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = f72.l1.a(t62.c.f162799a);
                        String strQ = gl1.y.Q(o0VarE, R.string.create_a_collection);
                        String strQ2 = gl1.y.Q(o0VarE, R.string.build_gear_collection_to_track);
                        String strQ3 = gl1.y.Q(o0VarE, R.string.add_a_collection);
                        boolean z18 = (i16 & 458752) == 131072;
                        Object objQ = o0VarE.q();
                        if (z18) {
                            objQ = new sg0.q0(aVar2, 14);
                            o0VarE.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new sg0.q0(aVar2, 14);
                                o0VarE.K(objQ);
                            }
                        }
                        b82.n.d(dVarA, strQ, strQ2, rVarF, strQ3, (e23.a) objQ, null, null, o0VarE, 3072, 192);
                        o0VarE.g0(false);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (i18 != 3) {
                            throw kg.f.h(o0VarE, 1891638701, false);
                        }
                        o0VarE.C(-1486916480);
                        if (z0Var.f159929g == null) {
                            o0VarE.C(-1486856557);
                            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                            s62.a.f157643a.getClass();
                            b82.n.c(f72.n1.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.no_retired_gear), gl1.y.Q(o0VarE, R.string.done_using_gear_retire), rVarF2, null, o0VarE, 3072, 16);
                            o0VarE.g0(false);
                            z17 = false;
                            z16 = true;
                            o0VarE = o0VarE;
                        } else {
                            o0VarE.C(-1486460036);
                            h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                            s62.a.f157643a.getClass();
                            u4.d dVarA2 = v62.n3.a(t62.b.f162798a);
                            String strQ4 = gl1.y.Q(o0VarE, R.string.common_no_results_lbl);
                            String strQ5 = gl1.y.Q(o0VarE, R.string.no_gear_matched_clear_filters);
                            String strQ6 = gl1.y.Q(o0VarE, R.string.clear_filter);
                            boolean z19 = (i16 & 7168) == 2048;
                            Object objQ2 = o0VarE.q();
                            if (z19) {
                                objQ2 = new e23.a() { // from class: sk0.x0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                h1Var.q2(null);
                                                break;
                                            default:
                                                h1Var.F2(null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ2);
                            } else {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new e23.a() { // from class: sk0.x0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    h1Var.q2(null);
                                                    break;
                                                default:
                                                    h1Var.F2(null);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(objQ2);
                                }
                            }
                            e23.a aVar5 = (e23.a) objQ2;
                            z16 = true;
                            o0VarE = o0VarE;
                            z17 = false;
                            b82.n.d(dVarA2, strQ4, strQ5, rVarF3, strQ6, aVar5, null, null, o0VarE, 3072, 192);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z17);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    z14 = z16;
                } else {
                    z14 = true;
                    final int i24 = 0;
                    o0VarE.C(-1488778743);
                    if (z0Var.f159928f == null) {
                        o0VarE.C(-1488725330);
                        h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                        s62.a.f157643a.getClass();
                        u4.d dVarA3 = v62.x3.a(t62.b.f162798a);
                        String strQ7 = gl1.y.Q(o0VarE, R.string.start_tracking_your_gear);
                        String strQ8 = gl1.y.Q(o0VarE, R.string.add_gear_monitor_replace_more);
                        String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_gear_add);
                        boolean z24 = (i16 & 57344) == 16384;
                        Object objQ3 = o0VarE.q();
                        if (z24) {
                            objQ3 = new sg0.q0(aVar, 13);
                            o0VarE.K(objQ3);
                        } else {
                            aVar4.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new sg0.q0(aVar, 13);
                                o0VarE.K(objQ3);
                            }
                        }
                        z15 = false;
                        b82.n.d(dVarA3, strQ7, strQ8, rVarF4, strQ9, (e23.a) objQ3, null, null, o0VarE, 3072, 192);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1488139709);
                        h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                        s62.a.f157643a.getClass();
                        u4.d dVarA4 = v62.n3.a(t62.b.f162798a);
                        String strQ10 = gl1.y.Q(o0VarE, R.string.common_no_results_lbl);
                        String strQ11 = gl1.y.Q(o0VarE, R.string.no_gear_matched_clear_filters);
                        String strQ12 = gl1.y.Q(o0VarE, R.string.clear_filter);
                        boolean z25 = (i16 & 7168) == 2048;
                        Object objQ4 = o0VarE.q();
                        if (z25) {
                            objQ4 = new e23.a() { // from class: sk0.x0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            h1Var.q2(null);
                                            break;
                                        default:
                                            h1Var.F2(null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ4);
                        } else {
                            aVar4.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e23.a() { // from class: sk0.x0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i24) {
                                            case 0:
                                                h1Var.q2(null);
                                                break;
                                            default:
                                                h1Var.F2(null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ4);
                            }
                        }
                        z15 = false;
                        b82.n.d(dVarA4, strQ10, strQ11, rVarF5, strQ12, (e23.a) objQ4, null, null, o0VarE, 3072, 192);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z15);
                    Unit unit3 = Unit.INSTANCE;
                }
            } else {
                z14 = true;
                o0VarE.C(-1485840501);
                h4.r.a aVar6 = h4.r.S;
                h4.r rVarF6 = x2.f(aVar6, 1.0f);
                s62.a.f157643a.getClass();
                b82.n.c(v62.x3.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.start_tracking_your_gear), gl1.y.Q(o0VarE, R.string.add_gear_monitor_replace_more), rVarF6, null, o0VarE, 3072, 16);
                c2.l.f(b0Var.a(aVar6, 1.0f, true), o0VarE);
                l72.f0 f0Var = l72.f0.f110999a;
                bVar2.getClass();
                h4.r rVarF7 = x2.f(c2.l.y(aVar6, eVar.f97920e), 1.0f);
                String strQ13 = gl1.y.Q(o0VarE, R.string.lbl_gear_add);
                boolean z26 = (i16 & 57344) == 16384;
                Object objQ5 = o0VarE.q();
                if (z26) {
                    objQ5 = new sg0.q0(aVar, 15);
                    o0VarE.K(objQ5);
                } else {
                    aVar4.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new sg0.q0(aVar, 15);
                        o0VarE.K(objQ5);
                    }
                }
                f0Var.d(0, 9, (e23.a) objQ5, rVarF7, strQ13, o0VarE, null, false);
                o0VarE = o0VarE;
                o0VarE.g0(false);
                Unit unit4 = Unit.INSTANCE;
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, bVar, z0Var, h1Var, aVar, aVar2, i14, 9);
        }
    }

    public static final void b(h4.r rVar, String str, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-933818844);
        int i15 = i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s62.a.f157643a.getClass();
            b82.n.d(fa.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_error_occurred), str, null, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, ((i15 << 3) & 896) | ((i15 << 9) & 458752), 200);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.g(rVar, str, aVar, i14, 2);
        }
    }

    public static final void c(b1 b1Var, bv.d dVar, GearActivity.w wVar, e23.l lVar, e23.l lVar2, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        b1Var.getClass();
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1107233437);
        int i15 = i14 | (o0VarE.r(b1Var) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(wVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            d(b1Var, dVar.g(), wVar, lVar, lVar2, aVar, aVar2, o0VarE, i15 & 4194190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(b1Var, dVar, wVar, lVar, lVar2, aVar, aVar2, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(h1 h1Var, gg1.o0 o0Var, e23.a<Unit> aVar, e23.l<? super rk0.f0, Unit> lVar, e23.l<? super String, Unit> lVar2, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        p3.o0 o0Var2;
        p3.n1 n1Var;
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-1256884576);
        int i15 = (o0VarE.B(h1Var) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(o0Var.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            p3.p1 p1VarC = s9.c.c(h1Var.getUiState(), o0VarE);
            p3.p1 p1VarC2 = s9.c.c(h1Var.getF159702a(), o0VarE);
            o0VarE.C(-980249407);
            i53.d dVar = (i53.d) p1VarC2.getF182175a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(dVar.size()));
            for (Map.Entry entry : dVar.entrySet()) {
                Object key = entry.getKey();
                int i16 = i15;
                o0VarE.N(2117966998, entry.getKey());
                zc.d dVarA = zc.g.a((r53.i) entry.getValue(), o0VarE);
                o0VarE.g0(false);
                linkedHashMap.put(key, dVarA);
                i15 = i16;
            }
            int i17 = i15;
            o0VarE.g0(false);
            i53.e<b1.b> eVar = ((z0) p1VarC.getF182175a()).f159926d;
            int i18 = i17 & 14;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(linkedHashMap) | (i18 == 4);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == p3.m.a.f135155b) {
                objQ2 = new a(linkedHashMap, h1Var, p1VarC, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, eVar, o0VarE);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Boolean boolValueOf = Boolean.valueOf(((z0) p1VarC.getF182175a()).f159930h);
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.B(mcVarF);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == p3.m.a.f135155b) {
                objQ3 = new b(mcVarF, p1VarC, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, boolValueOf, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ4 = o0VarE.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = new i0(6);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ4, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new i0(7);
                o0VarE.K(objQ5);
            }
            p3.n1 n1Var2 = (p3.n1) d4.a.e(objArr2, (e23.a) objQ5, o0VarE, 48);
            Collection collectionValues = linkedHashMap.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                n1Var = n1Var2;
                z15 = false;
                z14 = true;
            } else {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        n1Var = n1Var2;
                        z14 = true;
                        z15 = false;
                        break;
                    }
                    zc.d dVar2 = (zc.d) it.next();
                    n1Var = n1Var2;
                    z14 = true;
                    if (dVar2.b() < 1 && p005kotlin.jvm.internal.s.g(dVar2.d().f196385a, yc.z0.b.f196664b)) {
                        z15 = true;
                        break;
                    }
                    n1Var2 = n1Var;
                }
            }
            boolean z16 = (((z0) p1VarC.getF182175a()).f159923a || z15) ? z14 : false;
            c2.n0 n0Var = n3.f22788a;
            int i19 = 6;
            o0Var2 = o0VarE;
            z02.d.a(z16, z3.f.c(1399780901, new d52.l(aVar, p1Var, aVar2, aVar3), o0VarE), null, null, new c2.n0(0, 0, 0, 0), z3.f.c(71796265, new ci0.g(z16, linkedHashMap, h1Var, aVar2, aVar3, p1VarC, n1Var, o0Var, lVar, lVar2), o0VarE), o0Var2, 196656, 12);
            if (((z0) p1VarC.getF182175a()).f159930h) {
                o0Var2.C(-306002489);
                boolean zR = o0Var2.r(b0Var) | o0Var2.B(mcVarF) | (i18 == 4);
                Object objQ6 = o0Var2.q();
                if (zR || objQ6 == p3.m.a.f135155b) {
                    objQ6 = new sg0.j(b0Var, i19, mcVarF, h1Var);
                    o0Var2.K(objQ6);
                }
                e1.a((e23.a) objQ6, mcVarF, o0Var2, 0);
                o0Var2.g0(false);
            } else {
                o0Var2.C(-305730526);
                o0Var2.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(h1Var, o0Var, aVar, lVar, lVar2, aVar2, aVar3, i14, 19);
        }
    }

    public static final uk0.e e(String str, b1.b bVar) {
        int i14 = d.f159918a[bVar.ordinal()];
        if (i14 == 1) {
            return uk0.v.a(str, (c80.u) p13.h0.E0(c80.u.f25612w, h23.c.f81216a), false);
        }
        if (i14 == 2) {
            return new uk0.b(str, "Collection - ".concat(str), 5L, g22.l.d(b63.o.INSTANCE));
        }
        if (i14 == 3) {
            return uk0.v.a(str, (c80.u) p13.h0.E0(c80.u.f25612w, h23.c.f81216a), true);
        }
        lc.u0.r();
        return null;
    }
}
