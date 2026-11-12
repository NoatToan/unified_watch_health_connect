package i3;

import android.content.Context;
import android.content.res.Configuration;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f87631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f87632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f87633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f87634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f87635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f87636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f87637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f87638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f87639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p1.h0 f87640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p1.h0 f87641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p1.h0 f87642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f87643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f87644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f87645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f87646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f87647q;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ri f87648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ph f87649b;

        public a(ri riVar, ph phVar) {
            this.f87648a = riVar;
            this.f87649b = phVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(aVar, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u2 u2Var = c2.u2.f22900a;
                n3.f1.f122826a.getClass();
                float f14 = n3.f1.f122849x;
                float f15 = n3.f1.f122847v;
                h4.r rVarR = c2.x2.r(aVar, f14, f15);
                ri riVar = this.f87648a;
                int iU = bi.u(riVar);
                qi.f89469b.getClass();
                ph phVar = this.f87649b;
                bi.n(rVarR, iU, riVar, 0, phVar, mVar2, 3078);
                bi.e(c2.x2.r(aVar, bi.f87635e, n3.f1.f122845t), mVar2, 6);
                bi.n(c2.x2.r(aVar, f14, f15), riVar.a(), riVar, qi.f89470c, phVar, mVar2, 3078);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<p1.l, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ph f87650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f87651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f87652c;

        public b(ph phVar, p pVar, boolean z14) {
            this.f87650a = phVar;
            this.f87651b = pVar;
            this.f87652c = z14;
        }

        @Override // e23.q
        public final Unit invoke(p1.l lVar, p3.m mVar, Integer num) {
            p1.l lVar2 = lVar;
            p3.m mVar2 = mVar;
            num.intValue();
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            n3.f1.f122826a.getClass();
            h4.r rVarQ = c2.x2.q(aVar, n3.f1.f122828c);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new bf(7);
                mVar2.K(objQ);
            }
            bi.a(p5.v.c((e23.l) objQ, rVarQ, false), bi.f87631a, z3.f.c(-99063847, new ei(this.f87650a, lVar2, this.f87651b, this.f87652c), mVar2), mVar2, 432);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f87654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f87655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f87656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p3.p1<n4.c> f87657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p3.p1<g6.k> f87658f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p pVar, float f14, boolean z14, p3.p1<n4.c> p1Var, p3.p1<g6.k> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f87654b = pVar;
            this.f87655c = f14;
            this.f87656d = z14;
            this.f87657e = p1Var;
            this.f87658f = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f87654b, this.f87655c, this.f87656d, this.f87657e, this.f87658f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87653a;
            if (i14 == 0) {
                o13.r.b(obj);
                float f14 = bi.f87631a;
                p3.p1<n4.c> p1Var = this.f87657e;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (p1Var.getF182175a().f123544a >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p1Var.getF182175a().f123544a & 4294967295L));
                long j8 = this.f87658f.getF182175a().f76005a;
                s1.h1 h1Var = new s1.h1(0, 1, null);
                this.f87653a = 1;
                if (bi.s(this.f87654b, fIntBitsToFloat, fIntBitsToFloat2, this.f87655c, this.f87656d, j8, h1Var, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f87659a = new d();

        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                f5.y0 y0Var = list.get(i14);
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "Spacer")) {
                    n3.f1.f122826a.getClass();
                    f5.v1 v1VarQ = y0Var.Q(g6.a.c(0, b1Var.f0(n3.f1.f122841p), 0, 0, 12, j8));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        f5.y0 y0Var2 = list.get(i15);
                        if (!p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "Spacer")) {
                            arrayList.add(y0Var2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        arrayList2.add(((f5.y0) arrayList.get(i16)).Q(g6.a.c(0, g6.a.j(j8) / 2, 0, 0, 12, j8)));
                    }
                    return f5.b1.h0(b1Var, g6.a.j(j8), g6.a.i(j8), new fi(arrayList2, v1VarQ, 0));
                }
            }
            throw hb.a.m("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h5.v1<Boolean> f87660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ri f87661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3.p1<x5.l0> f87662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p3.p1<x5.l0> f87663d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h5.v1<Boolean> v1Var, ri riVar, p3.p1<x5.l0> p1Var, p3.p1<x5.l0> p1Var2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f87660a = v1Var;
            this.f87661b = riVar;
            this.f87662c = p1Var;
            this.f87663d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f87660a, this.f87661b, this.f87662c, this.f87663d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            h5.v1<Boolean> v1Var = this.f87660a;
            Boolean bool = v1Var.f82011a;
            Boolean bool2 = Boolean.TRUE;
            if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                float f14 = bi.f87631a;
                ri riVar = this.f87661b;
                this.f87662c.setValue(new x5.l0(j1.a(bi.u(riVar), 14, null), 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                this.f87663d.setValue(new x5.l0(j1.a(riVar.a(), 14, null), 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
            }
            v1Var.f82011a = bool2;
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class f implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.p1<x5.l0> f87664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ri f87665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h5.v1<Boolean> f87666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ph f87667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p3.p1<x5.l0> f87668e;

        public f(p3.p1<x5.l0> p1Var, ri riVar, h5.v1<Boolean> v1Var, ph phVar, p3.p1<x5.l0> p1Var2) {
            this.f87664a = p1Var;
            this.f87665b = riVar;
            this.f87666c = v1Var;
            this.f87667d = phVar;
            this.f87668e = p1Var2;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:33:0x0118  */
        /* JADX WARN: Code duplicated, block: B:38:0x016f  */
        /* JADX WARN: Code duplicated, block: B:43:0x019e  */
        /* JADX WARN: Code duplicated, block: B:48:0x01d2  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            final int i14 = 0;
            final int i15 = 1;
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(aVar, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u2 u2Var = c2.u2.f22900a;
                final p3.p1<x5.l0> p1Var = this.f87664a;
                boolean zB = mVar2.B(p1Var);
                final ri riVar = this.f87665b;
                boolean zR = zB | mVar2.r(riVar);
                Object objQ = mVar2.q();
                p3.m.a aVar3 = p3.m.f135153a;
                if (zR) {
                    objQ = new ii(riVar, p1Var);
                    mVar2.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ii(riVar, p1Var);
                        mVar2.K(objQ);
                    }
                }
                h4.r rVarB = z4.f.b(aVar, (e23.l) objQ);
                float f14 = bi.f87631a;
                x5.l0 f182175a = p1Var.getF182175a();
                boolean zR2 = mVar2.r(riVar) | mVar2.B(p1Var);
                final h5.v1<Boolean> v1Var = this.f87666c;
                boolean zR3 = zR2 | mVar2.r(v1Var);
                Object objQ2 = mVar2.q();
                if (zR3) {
                    objQ2 = new e23.l() { // from class: i3.gi
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i16 = i14;
                            p3.p1 p1Var2 = p1Var;
                            switch (i16) {
                                case 0:
                                    x5.l0 l0Var = (x5.l0) obj;
                                    qi.f89469b.getClass();
                                    float f15 = bi.f87631a;
                                    x5.l0 l0Var2 = (x5.l0) p1Var2.getF182175a();
                                    ri riVar2 = riVar;
                                    bi.t(0, riVar2, l0Var, l0Var2, riVar2.getF89707a() ? 23 : 12, v1Var, new v2(p1Var2, 1));
                                    break;
                                default:
                                    x5.l0 l0Var3 = (x5.l0) obj;
                                    qi.f89469b.getClass();
                                    int i17 = qi.f89470c;
                                    float f16 = bi.f87631a;
                                    bi.t(i17, riVar, l0Var3, (x5.l0) p1Var2.getF182175a(), 59, v1Var, new v2(p1Var2, 2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e23.l() { // from class: i3.gi
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i16 = i14;
                                p3.p1 p1Var2 = p1Var;
                                switch (i16) {
                                    case 0:
                                        x5.l0 l0Var = (x5.l0) obj;
                                        qi.f89469b.getClass();
                                        float f15 = bi.f87631a;
                                        x5.l0 l0Var2 = (x5.l0) p1Var2.getF182175a();
                                        ri riVar2 = riVar;
                                        bi.t(0, riVar2, l0Var, l0Var2, riVar2.getF89707a() ? 23 : 12, v1Var, new v2(p1Var2, 1));
                                        break;
                                    default:
                                        x5.l0 l0Var3 = (x5.l0) obj;
                                        qi.f89469b.getClass();
                                        int i17 = qi.f89470c;
                                        float f16 = bi.f87631a;
                                        bi.t(i17, riVar, l0Var3, (x5.l0) p1Var2.getF182175a(), 59, v1Var, new v2(p1Var2, 2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    }
                }
                e23.l lVar = (e23.l) objQ2;
                qi.f89469b.getClass();
                x5.p.f188918b.getClass();
                int i16 = x5.p.f188925i;
                x5.v.f188954b.getClass();
                int i17 = x5.v.f188957e;
                p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i17, i16, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                boolean zR4 = mVar2.r(riVar);
                Object objQ3 = mVar2.q();
                if (zR4) {
                    objQ3 = new e23.l() { // from class: i3.hi
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    qi.f89469b.getClass();
                                    riVar.d(qi.f89470c);
                                    break;
                                default:
                                    qi.f89469b.getClass();
                                    riVar.d(qi.f89470c);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.l() { // from class: i3.hi
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                switch (i14) {
                                    case 0:
                                        qi.f89469b.getClass();
                                        riVar.d(qi.f89470c);
                                        break;
                                    default:
                                        qi.f89469b.getClass();
                                        riVar.d(qi.f89470c);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    }
                }
                p006l2.z1 z1Var = new p006l2.z1(null, null, (e23.l) objQ3, null, null, null, 59, null);
                ph phVar = this.f87667d;
                bi.m(rVarB, f182175a, lVar, riVar, 0, a2Var, z1Var, phVar, mVar2, 24576);
                float f15 = bi.f87635e;
                n3.e1.f122797a.getClass();
                bi.e(c2.x2.r(aVar, f15, n3.e1.f122798b), mVar2, 6);
                final p3.p1<x5.l0> p1Var2 = this.f87668e;
                boolean zB2 = mVar2.B(p1Var2) | mVar2.r(riVar);
                Object objQ4 = mVar2.q();
                if (zB2) {
                    objQ4 = new ji(riVar, p1Var2);
                    mVar2.K(objQ4);
                } else {
                    aVar3.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new ji(riVar, p1Var2);
                        mVar2.K(objQ4);
                    }
                }
                h4.r rVarC2 = z4.f.c(aVar, (e23.l) objQ4);
                x5.l0 f182175a2 = p1Var2.getF182175a();
                boolean zR5 = mVar2.r(riVar) | mVar2.B(p1Var2) | mVar2.r(v1Var);
                Object objQ5 = mVar2.q();
                if (zR5) {
                    objQ5 = new e23.l() { // from class: i3.gi
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i18 = i15;
                            p3.p1 p1Var3 = p1Var2;
                            switch (i18) {
                                case 0:
                                    x5.l0 l0Var = (x5.l0) obj;
                                    qi.f89469b.getClass();
                                    float f16 = bi.f87631a;
                                    x5.l0 l0Var2 = (x5.l0) p1Var3.getF182175a();
                                    ri riVar2 = riVar;
                                    bi.t(0, riVar2, l0Var, l0Var2, riVar2.getF89707a() ? 23 : 12, v1Var, new v2(p1Var3, 1));
                                    break;
                                default:
                                    x5.l0 l0Var3 = (x5.l0) obj;
                                    qi.f89469b.getClass();
                                    int i19 = qi.f89470c;
                                    float f17 = bi.f87631a;
                                    bi.t(i19, riVar, l0Var3, (x5.l0) p1Var3.getF182175a(), 59, v1Var, new v2(p1Var3, 2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ5);
                } else {
                    aVar3.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new e23.l() { // from class: i3.gi
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i18 = i15;
                                p3.p1 p1Var3 = p1Var2;
                                switch (i18) {
                                    case 0:
                                        x5.l0 l0Var = (x5.l0) obj;
                                        qi.f89469b.getClass();
                                        float f16 = bi.f87631a;
                                        x5.l0 l0Var2 = (x5.l0) p1Var3.getF182175a();
                                        ri riVar2 = riVar;
                                        bi.t(0, riVar2, l0Var, l0Var2, riVar2.getF89707a() ? 23 : 12, v1Var, new v2(p1Var3, 1));
                                        break;
                                    default:
                                        x5.l0 l0Var3 = (x5.l0) obj;
                                        qi.f89469b.getClass();
                                        int i19 = qi.f89470c;
                                        float f17 = bi.f87631a;
                                        bi.t(i19, riVar, l0Var3, (x5.l0) p1Var3.getF182175a(), 59, v1Var, new v2(p1Var3, 2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ5);
                    }
                }
                e23.l lVar2 = (e23.l) objQ5;
                int i18 = qi.f89470c;
                p006l2.a2 a2Var2 = new p006l2.a2(0, (Boolean) null, i17, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                boolean zR6 = mVar2.r(riVar);
                Object objQ6 = mVar2.q();
                if (zR6) {
                    objQ6 = new e23.l() { // from class: i3.hi
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    qi.f89469b.getClass();
                                    riVar.d(qi.f89470c);
                                    break;
                                default:
                                    qi.f89469b.getClass();
                                    riVar.d(qi.f89470c);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ6);
                } else {
                    aVar3.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new e23.l() { // from class: i3.hi
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                switch (i15) {
                                    case 0:
                                        qi.f89469b.getClass();
                                        riVar.d(qi.f89470c);
                                        break;
                                    default:
                                        qi.f89469b.getClass();
                                        riVar.d(qi.f89470c);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ6);
                    }
                }
                bi.m(rVarC2, f182175a2, lVar2, riVar, i18, a2Var2, new p006l2.z1(null, null, (e23.l) objQ6, null, null, null, 59, null), phVar, mVar2, 24576);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class g implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f87669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ri f87670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f87671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f87672d;

        public g(int i14, ri riVar, int i15, long j8) {
            this.f87669a = i14;
            this.f87670b = riVar;
            this.f87671c = i15;
            this.f87672d = j8;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                boolean f89707a = this.f87670b.getF89707a();
                int i14 = this.f87669a;
                int i15 = this.f87671c;
                String strY = bi.y(i14, i15, mVar2, f89707a);
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81528f;
                h4.r.a aVar = h4.r.S;
                f5.z0 z0VarD = c2.q.d(gVar, false);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(aVar, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u uVar = c2.u.f22885a;
                boolean zB = mVar2.B(strY);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new i11.g(strY, 16);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i11.g(strY, 16);
                        mVar2.K(objQ);
                    }
                }
                mh.c(j1.a(i15, 14, null), p5.v.c((e23.l) objQ, aVar, false), this.f87672d, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262136);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class h implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f87673a = new h();

        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                f5.y0 y0Var = list.get(i14);
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "Spacer")) {
                    n3.f1.f122826a.getClass();
                    f5.v1 v1VarQ = y0Var.Q(g6.a.c(0, 0, 0, b1Var.f0(n3.f1.f122841p), 3, j8));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        f5.y0 y0Var2 = list.get(i15);
                        if (!p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "Spacer")) {
                            arrayList.add(y0Var2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        arrayList2.add(((f5.y0) arrayList.get(i16)).Q(g6.a.c(0, 0, 0, g6.a.i(j8) / 2, 3, j8)));
                    }
                    return f5.b1.h0(b1Var, g6.a.j(j8), g6.a.i(j8), new fi(arrayList2, v1VarQ, 1));
                }
            }
            throw hb.a.m("Collection contains no element matching the predicate.");
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        n3.f1.f122826a.getClass();
        float f14 = n3.f1.f122828c;
        f87631a = 101 / f14;
        f87632b = 69 / f14;
        f87633c = 36;
        float f15 = 24;
        f87634d = f15;
        f87635e = f15;
        f87636f = 7;
        f87637g = f15;
        f87638h = 74;
        f87639i = 48;
        f87640j = p1.m.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        p1.h0 h0VarA = p1.m.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f87641k = h0VarA;
        p1.h0 h0Var = new p1.h0(h0VarA.f134763b);
        int[] iArr = h0VarA.f134762a;
        int i14 = h0VarA.f134763b;
        for (int i15 = 0; i15 < i14; i15++) {
            h0Var.d((iArr[i15] % 12) + 12);
        }
        f87642l = h0Var;
        f87643m = 12;
        f87644n = 384;
        f87645o = 330;
        f87646p = 238;
        f87647q = 200;
    }

    public static final void a(h4.r rVar, float f14, z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1041042571);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ai(f14);
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b71.i.n(6, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rb(rVar, f14, eVar, i14, 1);
        }
    }

    public static final void b(ri riVar, ph phVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-934561141);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(phVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.j0 j0Var = mh.f89022a;
            n3.f1.f122826a.getClass();
            p3.v.b(new p3.n2[]{j0Var.c(sj.a(n3.f1.f122850y, o0VarE)), kotlin.t1.f91496n.c(g6.o.Ltr)}, z3.f.c(-477913269, new a(riVar, phVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rh(riVar, phVar, i14, 1);
        }
    }

    public static final void c(int i14, h4.r rVar, p pVar, ph phVar, p3.m mVar, boolean z14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-478841003);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(phVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = l4.k.f(u1.n.e(rVar, phVar.f89331a, k2.i.f102406a).then(new e2(pVar, z14, pVar.f89247a.c(), k9.b(n3.h0.DefaultSpatial, o0VarE), null)), new hy.h(8, pVar, phVar));
            int iC = pVar.f89247a.c();
            qi.f89469b.getClass();
            o0Var = o0VarE;
            r1.m0.a(iC == qi.f89470c ? f87640j : f87641k, rVarF, k9.b(n3.h0.DefaultEffects, o0VarE), null, z3.f.c(747010833, new b(phVar, pVar, z14), o0VarE), o0Var, 24576, 8);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yh(rVar, pVar, phVar, z14, i14);
        }
    }

    public static final void d(h4.r rVar, final p pVar, int i14, final boolean z14, p3.m mVar, int i15) {
        p3.o0 o0Var;
        Throwable th3;
        p3.o0 o0VarE = mVar.E(-206784607);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.f1.f122826a.getClass();
            s5.x0 x0VarA = sj.a(n3.f1.f122829d, o0VarE);
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            final float fS0 = cVar.s0(f87638h);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                n4.c.f123541b.getClass();
                objQ = p3.p0.n(n4.c.a(0L));
                o0VarE.K(objQ);
            }
            final p3.p1 p1Var = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                g6.k.f76003b.getClass();
                objQ2 = p3.p0.n(g6.k.a(0L));
                o0VarE.K(objQ2);
            }
            final p3.p1 p1Var2 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                n4.d.f123545e.getClass();
                objQ3 = p3.p0.n(n4.d.f123546f);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            final o53.b0 b0Var = (o53.b0) objQ4;
            String strY = y(pVar.f89247a.c(), i14, o0VarE, pVar.f89247a.getF89707a());
            String strA = j1.a(i14, 15, null);
            boolean zB = o0VarE.B(pVar);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = p3.p0.f(new d6(pVar, 2, cVar, p1Var3));
                o0VarE.K(objQ5);
            }
            final p3.x3 x3Var = (p3.x3) objQ5;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new uh(p1Var2, p1Var3, p1Var, 0);
                o0VarE.K(objQ6);
            }
            h4.r rVarF = f5.g0.f(rVar, (e23.l) objQ6);
            f5.p pVar2 = p7.f89279a;
            h4.r rVarA = u1.m0.a(c2.x2.q(rVarF.then(d8.f87832a), f87639i), true, null);
            boolean zR = ((i16 & 7168) == 2048) | o0VarE.r(b0Var) | o0VarE.r(pVar) | o0VarE.i(fS0) | o0VarE.B(x3Var);
            Object objQ7 = o0VarE.q();
            if (zR || objQ7 == c2565a) {
                th3 = null;
                e23.l lVar = new e23.l() { // from class: i3.vh
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        p5.k0 k0Var = (p5.k0) obj;
                        final o53.b0 b0Var2 = b0Var;
                        final p pVar3 = pVar;
                        final float f14 = fS0;
                        final boolean z15 = z14;
                        final p3.p1 p1Var4 = p1Var;
                        final p3.p1 p1Var5 = p1Var2;
                        p5.h0.i(k0Var, null, new e23.a() { // from class: i3.wh
                            @Override // e23.a
                            public final Object invoke() {
                                ge1.b.T(b0Var2, null, null, new bi.c(pVar3, f14, z15, p1Var4, p1Var5, null), 3);
                                return Boolean.TRUE;
                            }
                        });
                        p5.h0.x(k0Var, ((Boolean) x3Var.getF182175a()).booleanValue());
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(lVar);
                objQ7 = lVar;
            } else {
                th3 = null;
            }
            h4.r rVarC = p5.v.c((e23.l) objQ7, rVarA, true);
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar2 = h4.r.S;
            boolean zB2 = o0VarE.B(strY);
            Object objQ8 = o0VarE.q();
            if (zB2 || objQ8 == c2565a) {
                objQ8 = new i11.g(strY, 15);
                o0VarE.K(objQ8);
            }
            mh.c(strA, p5.v.b(aVar2, (e23.l) objQ8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(rVar, pVar, i14, z14, i15, 8);
        }
    }

    public static final void e(h4.r rVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(2100674302);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            s5.x0 x0Var = (s5.x0) o0VarE.A(mh.f89022a);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            d6.f.a.f57735b.getClass();
            float f14 = d6.f.a.f57736c;
            d6.f.d.f57744b.getClass();
            s5.x0 x0VarA = s5.x0.a(x0Var, 0L, 0L, null, null, 0L, null, null, i15, 0L, null, new d6.f(f14, d6.f.d.f57747e, (p005kotlin.jvm.internal.j) null), 15695871);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new bf(4);
                o0VarE.K(objQ);
            }
            h4.r rVarB = p5.v.b(rVar, (e23.l) objQ);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            n3.e1.f122797a.getClass();
            mh.c(":", null, k2.e(n3.e1.f122804h, o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 6, 0, 131066);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 9);
        }
    }

    public static final void f(ri riVar, ph phVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        p3.o0 o0VarE = mVar.E(755539561);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(phVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(cVar2, h4.d.a.f81536n, o0VarE, 6);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b(riVar, phVar, o0VarE, i15 & 126);
            if (riVar.getF89707a()) {
                z14 = true;
                o0VarE.C(999020143);
                o0VarE.g0(false);
            } else {
                o0VarE.C(998576161);
                h4.r rVarC2 = c2.l.C(aVar, 0.0f, f87643m, 0.0f, 0.0f, 13);
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iP2 = o0VarE.P();
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar, z0VarD, o0VarE);
                p3.b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar);
                }
                p3.b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                n3.f1.f122826a.getClass();
                int i16 = i15 << 3;
                g((i16 & 896) | (i16 & 112) | 6, c2.x2.r(aVar, n3.f1.f122839n, n3.f1.f122838m), phVar, riVar, o0VarE);
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rh(riVar, phVar, i14, 0);
        }
    }

    public static final void g(int i14, h4.r rVar, ph phVar, ri riVar, p3.m mVar) {
        int i15;
        p3.o0 o0VarE = mVar.E(1261215927);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(phVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = d.f87659a;
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            n3.f1.f122826a.getClass();
            o4.r1 r1VarC = fc.c(n3.f1.f122837l, o0VarE);
            r1VarC.getClass();
            k2.a aVar = (k2.a) r1VarC;
            i(rVar, riVar, phVar, z0Var, fc.d(aVar), fc.a(aVar), o0VarE, (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sh(rVar, riVar, phVar, i14, 1);
        }
    }

    public static final void h(int i14, h4.r rVar, p pVar, ph phVar, p3.m mVar, boolean z14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1432307537);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(phVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new bf(6);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVar, false);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar2);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            f(pVar, phVar, o0VarE, (i15 & 14) | ((i15 >> 3) & 112));
            c2.l.f(c2.x2.u(h4.r.S, f87633c), o0VarE);
            c((i15 & 7168) | ((i15 << 3) & 112) | (i15 & 896), new i2(), pVar, phVar, o0VarE, z14);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yh(pVar, rVar, phVar, z14, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    public static final void i(h4.r rVar, ri riVar, ph phVar, f5.z0 z0Var, o4.r1 r1Var, o4.r1 r1Var2, p3.m mVar, int i14) {
        int i15;
        o4.r1 r1Var3;
        long j8 = phVar.f89334d;
        p3.o0 o0VarE = mVar.E(1374241901);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(phVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(z0Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            r1Var3 = r1Var;
            i15 |= o0VarE.B(r1Var3) ? 16384 : 8192;
        } else {
            r1Var3 = r1Var;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(r1Var2) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.f1.f122826a.getClass();
            u1.u uVarA = u1.n.a(n3.f1.f122841p, j8);
            o4.r1 r1VarC = fc.c(n3.f1.f122837l, o0VarE);
            r1VarC.getClass();
            k2.a aVar = (k2.a) r1VarC;
            int i17 = l3.n1.f109367b;
            String strH = l3.k.h(o0VarE, R.string.m3c_time_picker_period_toggle_description);
            boolean zB = o0VarE.B(strH);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new i11.g(strH, 13);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.g(strH, 13);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = u1.q.c(uVarA.f167683a, g8.i.Z(p5.v.c((e23.l) objQ, rVar, false)), uVarA.f167684b, aVar);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            p3.b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            boolean z14 = !w(riVar);
            int i18 = i16 & 112;
            boolean z15 = i18 == 32 || ((i16 & 64) != 0 && o0VarE.r(riVar));
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new th(riVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new th(riVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            r2.f89476a.getClass();
            int i19 = (i16 << 3) & 7168;
            o(z14, r1Var3, (e23.a) objQ2, phVar, r2.f89477b, o0VarE, ((i16 >> 9) & 112) | 24576 | i19);
            c2.l.f(u1.n.e(c2.x2.d(h4.p.b(f5.g0.e(h4.r.S, "Spacer"), 2.0f), 1.0f), j8, o4.m1.f128891a), o0VarE);
            boolean zW = w(riVar);
            boolean z16 = i18 == 32 || ((i16 & 64) != 0 && o0VarE.r(riVar));
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new th(riVar, 2);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new th(riVar, 2);
                    o0VarE.K(objQ3);
                }
            }
            o(zW, r1Var2, (e23.a) objQ3, phVar, r2.f89478c, o0VarE, ((i16 >> 12) & 112) | 24576 | i19);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(rVar, riVar, phVar, z0Var, r1Var, r1Var2, i14, 20);
        }
    }

    public static final void j(int i14, h4.r rVar, ph phVar, ri riVar, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(-760850373);
        int i15 = (o0VarE.B(riVar) ? 4 : 2) | i14 | 48 | (o0VarE.B(phVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar = h4.r.S;
            } else {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            k(((i15 << 6) & 896) | ((i15 >> 3) & 126), rVar, phVar, riVar, o0VarE);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(riVar, rVar2, phVar, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    public static final void k(int i14, h4.r rVar, ph phVar, ri riVar, p3.m mVar) {
        int i15;
        ph phVar2;
        h4.r rVar2;
        h5.v1 v1Var;
        boolean z14;
        boolean z15;
        boolean z16;
        ri riVar2 = riVar;
        p3.o0 o0VarE = mVar.E(-475657989);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(phVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(riVar2) : o0VarE.r(riVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            x5.l0.f188876d.getClass();
            d4.l lVar = x5.l0.f188877e;
            int i16 = i15 & 896;
            boolean z17 = i16 == 256 || ((i15 & 512) != 0 && o0VarE.r(riVar2));
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z17) {
                objQ = new th(riVar2, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new th(riVar2, 0);
                    o0VarE.K(objQ);
                }
            }
            p3.p1 p1VarF = d4.a.f(objArr, lVar, (e23.a) objQ, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            boolean z18 = i16 == 256 || ((i15 & 512) != 0 && o0VarE.r(riVar2));
            Object objQ2 = o0VarE.q();
            if (z18) {
                objQ2 = new th(riVar2, 3);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new th(riVar2, 3);
                    o0VarE.K(objQ2);
                }
            }
            p3.p1 p1VarF2 = d4.a.f(objArr2, lVar, (e23.a) objQ2, o0VarE, 0);
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new h5.v1();
                o0VarE.K(objQ3);
            }
            h5.v1 v1Var2 = (h5.v1) objQ3;
            Integer numValueOf = Integer.valueOf(riVar2.b());
            Integer numValueOf2 = Integer.valueOf(riVar2.a());
            boolean zR = o0VarE.r(v1Var2) | o0VarE.B(p1VarF) | (i16 == 256 || ((i15 & 512) != 0 && o0VarE.r(riVar2))) | o0VarE.B(p1VarF2);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                v1Var = v1Var2;
                z14 = false;
                z15 = true;
                e eVar = new e(v1Var, riVar2, p1VarF, p1VarF2, null);
                o0VarE.K(eVar);
                objQ4 = eVar;
            } else {
                v1Var = v1Var2;
                z14 = false;
                z15 = true;
            }
            p3.l0.f(numValueOf, numValueOf2, (e23.p) objQ4, o0VarE);
            int i17 = i15;
            h4.r rVarC = c2.l.C(rVar, 0.0f, 0.0f, 0.0f, f87637g, 7);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81533k;
            c2.j.f22691a.getClass();
            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            p3.b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            n3.e1.f122797a.getClass();
            s5.x0 x0VarA = sj.a(n3.e1.f122803g, o0VarE);
            d6.h.f57752b.getClass();
            riVar2 = riVar;
            phVar2 = phVar;
            rVar2 = rVar;
            p3.v.b(new p3.n2[]{mh.f89022a.c(s5.x0.a(x0VarA, phVar.f89343m, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744446)), kotlin.t1.f91496n.c(g6.o.Ltr)}, z3.f.c(1306700887, new f(p1VarF, riVar2, v1Var, phVar2, p1VarF2), o0VarE), o0VarE, 56);
            if (riVar2.getF89707a()) {
                z16 = true;
                o0VarE.C(-1381607893);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1381942321);
                h4.r.a aVar3 = h4.r.S;
                h4.r rVarC3 = c2.l.C(aVar3, f87643m, 0.0f, 0.0f, 0.0f, 14);
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iP2 = o0VarE.P();
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar2, z0VarD, o0VarE);
                p3.b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar2);
                }
                p3.b4.c(fVar, rVarC4, o0VarE);
                c2.u uVar = c2.u.f22885a;
                q(((i17 >> 3) & 112) | 6 | ((i17 << 3) & 896), c2.x2.r(aVar3, n3.e1.f122799c, n3.e1.f122798b), phVar2, riVar2, o0VarE);
                z16 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            o0VarE.g0(z16);
        } else {
            phVar2 = phVar;
            rVar2 = rVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sh(rVar2, phVar2, riVar2, i14);
        }
    }

    public static final void l(ri riVar, h4.r rVar, ph phVar, int i14, p3.m mVar, int i15) {
        h4.r rVar2;
        int i16;
        h4.r rVar3;
        int i17;
        int i18;
        int i19;
        p3.o0 o0VarE = mVar.E(-619286452);
        int i24 = i15 | (o0VarE.B(riVar) ? 4 : 2) | 48 | (o0VarE.B(phVar) ? 256 : 128) | 1024;
        if (o0VarE.n(i24 & 1, (i24 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
                qh.f89468a.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
                if (configuration.screenHeightDp < configuration.screenWidthDp) {
                    pi.f89345b.getClass();
                    i17 = 0;
                } else {
                    pi.f89345b.getClass();
                    i17 = pi.f89346c;
                }
                int i25 = i17;
                i18 = i24 & (-7169);
                i19 = i25;
            } else {
                o0VarE.e();
                rVar3 = rVar;
                i18 = i24 & (-7169);
                i19 = i14;
            }
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            l3.d1 d1VarB = l3.b.b(0, o0VarE, 7);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new h5.v1();
                o0VarE.K(objQ);
            }
            h5.v1 v1Var = (h5.v1) objQ;
            int i26 = i18 & 14;
            boolean z14 = i26 == 4;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new p(riVar, v1Var);
                o0VarE.K(objQ2);
            }
            p pVar = (p) objQ2;
            Integer numValueOf = Integer.valueOf(riVar.b());
            Integer numValueOf2 = Integer.valueOf(riVar.a());
            boolean zR = o0VarE.r(v1Var) | o0VarE.r(pVar) | (i26 == 4);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new ki(v1Var, pVar, riVar, null);
                o0VarE.K(objQ3);
            }
            p3.l0.f(numValueOf, numValueOf2, (e23.p) objQ3, o0VarE);
            pi.f89345b.getClass();
            if (i19 == pi.f89346c) {
                o0VarE.C(2017551219);
                r(i18 & 1008, rVar3, pVar, phVar, o0VarE, true ^ ((Boolean) d1VarB.getF182175a()).booleanValue());
                o0VarE.g0(false);
            } else {
                o0VarE.C(2017750673);
                h(i18 & 1008, rVar3, pVar, phVar, o0VarE, true ^ ((Boolean) d1VarB.getF182175a()).booleanValue());
                o0VarE.g0(false);
            }
            i16 = i19;
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            i16 = i14;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sh(riVar, rVar2, phVar, i16, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:104:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x019d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216  */
    /* JADX WARN: Code duplicated, block: B:75:0x021d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x023c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0261  */
    /* JADX WARN: Code duplicated, block: B:88:0x034e  */
    /* JADX WARN: Code duplicated, block: B:91:0x035f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0363  */
    /* JADX WARN: Code duplicated, block: B:95:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ac  */
    public static final void m(h4.r rVar, x5.l0 l0Var, e23.l lVar, ri riVar, int i14, p006l2.a2 a2Var, p006l2.z1 z1Var, ph phVar, p3.m mVar, int i15) {
        int i16;
        h5.g.a.f fVar;
        p3.o0 o0Var;
        int i17;
        String strH;
        h4.r.a aVar;
        f5.z0 z0VarD;
        int iP;
        p3.i2 i2VarA0;
        h4.r rVarC;
        boolean zB;
        Object objQ;
        int i18;
        Object objQ2;
        int i19;
        boolean z14;
        Object objQ3;
        int iA;
        ri riVar2 = riVar;
        int i24 = i14;
        Float fValueOf = Float.valueOf(0.9f);
        Float fValueOf2 = Float.valueOf(0.1f);
        p3.o0 o0VarE = mVar.E(1299172990);
        p3.c<?> cVar = o0VarE.f135177b;
        int i25 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(l0Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.B(riVar2) ? 2048 : 1024) | (o0VarE.B(a2Var) ? 131072 : 65536) | (o0VarE.B(z1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(phVar) ? 8388608 : 4194304);
        if (o0VarE.n(i25 & 1, (4793491 & i25) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ4 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ5;
            ba baVar = ba.f87580a;
            long j8 = phVar.f89341k;
            long j14 = phVar.f89343m;
            baVar.getClass();
            sg sgVarC = ba.c(j14, j8, j8, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, o0VarE, 2147483598);
            int iC = riVar2.c();
            qi.a aVar2 = qi.f89469b;
            boolean z15 = i24 == iC;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iP2 = o0VarE.P();
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i25;
            } else {
                i16 = i25;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                }
                fVar = h5.g.a.f81807d;
                p3.b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                if (z15) {
                    o0Var = o0VarE;
                    o0Var.C(2023879982);
                    o0Var.g0(false);
                } else {
                    o0VarE.C(2023424468);
                    h4.r.a aVar4 = h4.r.S;
                    n3.e1.f122797a.getClass();
                    h4.r rVarR = c2.x2.r(aVar4, n3.e1.f122802f, n3.e1.f122800d);
                    qi.f89469b.getClass();
                    if (i24 == 0) {
                        iA = u(riVar);
                    } else {
                        iA = riVar.a();
                    }
                    o0Var = o0VarE;
                    n(rVarR, iA, riVar, i24, phVar, o0Var, ((i16 >> 3) & 896) | 3078 | ((i16 >> 9) & 57344));
                    o0Var.g0(false);
                }
                qi.f89469b.getClass();
                if (i24 == qi.f89470c) {
                    int i26 = l3.n1.f109367b;
                    i17 = R.string.m3c_time_picker_minute_text_field;
                } else {
                    int i27 = l3.n1.f109367b;
                    i17 = R.string.m3c_time_picker_hour_text_field;
                }
                strH = l3.k.h(o0Var, i17);
                aVar = h4.r.S;
                tj tjVar = new tj(z15, kotlin.k2.f91249a);
                aVar.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iP = o0Var.P();
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(tjVar, o0Var);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar3);
                } else {
                    o0Var.c();
                }
                p3.b4.c(eVar, z0VarD, o0Var);
                p3.b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iP))) {
                    v.h.A(iP, o0Var, iP, bVar);
                }
                p3.b4.c(fVar, rVarC, o0Var);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarA = m4.e.a(aVar, b0Var);
                n3.e1.f122797a.getClass();
                h4.r rVarR2 = c2.x2.r(rVarA, n3.e1.f122802f, n3.e1.f122800d);
                zB = o0Var.B(strH);
                objQ = o0Var.q();
                if (zB || objQ == c2565a) {
                    objQ = new i11.g(strH, 12);
                    o0Var.K(objQ);
                }
                h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarR2, false);
                s5.x0 x0Var = (s5.x0) o0Var.A(mh.f89022a);
                o4.w.a aVar5 = o4.w.f129023a;
                Float fValueOf3 = Float.valueOf(0.0f);
                o4.d0.f128823b.getClass();
                long j15 = o4.d0.f128831j;
                o13.p pVar = new o13.p(fValueOf3, o4.d0.a(j15));
                o13.p pVar2 = new o13.p(fValueOf2, o4.d0.a(j15));
                s7.f89624a.getClass();
                int i28 = i16 >> 3;
                int i29 = i16 << 3;
                int i30 = (i28 & 112) | (i28 & 14) | 100666368 | (3670016 & i29) | (i29 & 29360128);
                i18 = i16;
                p3.o0 o0Var2 = o0Var;
                p006l2.r.c(l0Var, lVar, rVarC3, true, false, x0Var, a2Var, z1Var, true, 0, 0, null, null, jVar, o4.w.a.j(aVar5, new o13.p[]{pVar, pVar2, new o13.p(fValueOf2, o4.d0.a(s7.a(o0Var).f88471a)), new o13.p(fValueOf, o4.d0.a(s7.a(o0Var).f88471a)), new o13.p(fValueOf, o4.d0.a(j15)), new o13.p(Float.valueOf(1.0f), o4.d0.a(j15))}), z3.f.c(1007938103, new mi(l0Var, jVar, sgVarC), o0Var), o0Var2, i30, 199680, 7696);
                o0VarE = o0Var2;
                o0VarE.g0(true);
                h4.r rVarV = c2.l.v(aVar, 0.0f, f87636f, 1);
                objQ2 = o0VarE.q();
                if (objQ2 == r46) {
                    objQ2 = new bf(3);
                    o0VarE.K(objQ2);
                }
                h4.r rVarB = p5.v.b(rVarV, (e23.l) objQ2);
                if (i14 == 0) {
                    i19 = R.string.m3c_time_picker_hour;
                } else {
                    i19 = R.string.m3c_time_picker_minute;
                }
                mh.c(l3.k.h(o0VarE, i19), rVarB, k2.e(n3.e1.f122805i, o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sj.a(n3.e1.f122806j, o0VarE), o0VarE, 0, 0, 131064);
                o0VarE.g0(true);
                qi qiVarA = qi.a(riVar.c());
                if ((i18 & 7168) != 2048) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                objQ3 = o0VarE.q();
                if (!z14 || objQ3 == r46) {
                    riVar2 = riVar;
                    i24 = i14;
                    objQ3 = new ni(riVar2, i24, b0Var, null);
                    o0VarE.K(objQ3);
                } else {
                    riVar2 = riVar;
                    i24 = i14;
                }
                p3.l0.e((e23.p) objQ3, qiVarA, o0VarE);
            }
            v.h.A(iP2, o0VarE, iP2, bVar);
            fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            if (z15) {
                o0VarE.C(2023424468);
                h4.r.a aVar6 = h4.r.S;
                n3.e1.f122797a.getClass();
                h4.r rVarR3 = c2.x2.r(aVar6, n3.e1.f122802f, n3.e1.f122800d);
                qi.f89469b.getClass();
                if (i24 == 0) {
                    iA = u(riVar);
                } else {
                    iA = riVar.a();
                }
                o0Var = o0VarE;
                n(rVarR3, iA, riVar, i24, phVar, o0Var, ((i16 >> 3) & 896) | 3078 | ((i16 >> 9) & 57344));
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(2023879982);
                o0Var.g0(false);
            }
            qi.f89469b.getClass();
            if (i24 == qi.f89470c) {
                int i210 = l3.n1.f109367b;
                i17 = R.string.m3c_time_picker_minute_text_field;
            } else {
                int i211 = l3.n1.f109367b;
                i17 = R.string.m3c_time_picker_hour_text_field;
            }
            strH = l3.k.h(o0Var, i17);
            aVar = h4.r.S;
            tj tjVar2 = new tj(z15, kotlin.k2.f91249a);
            aVar.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iP = o0Var.P();
            i2VarA0 = o0Var.a0();
            rVarC = h4.k.c(tjVar2, o0Var);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            p3.b4.c(eVar, z0VarD, o0Var);
            p3.b4.c(c1623g, i2VarA0, o0Var);
            if (o0Var.T) {
                v.h.A(iP, o0Var, iP, bVar);
            } else {
                v.h.A(iP, o0Var, iP, bVar);
            }
            p3.b4.c(fVar, rVarC, o0Var);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarA2 = m4.e.a(aVar, b0Var);
            n3.e1.f122797a.getClass();
            h4.r rVarR4 = c2.x2.r(rVarA2, n3.e1.f122802f, n3.e1.f122800d);
            zB = o0Var.B(strH);
            objQ = o0Var.q();
            if (zB) {
                objQ = new i11.g(strH, 12);
                o0Var.K(objQ);
            } else {
                objQ = new i11.g(strH, 12);
                o0Var.K(objQ);
            }
            h4.r rVarC4 = p5.v.c((e23.l) objQ, rVarR4, false);
            s5.x0 x0Var2 = (s5.x0) o0Var.A(mh.f89022a);
            o4.w.a aVar7 = o4.w.f129023a;
            Float fValueOf4 = Float.valueOf(0.0f);
            o4.d0.f128823b.getClass();
            long j16 = o4.d0.f128831j;
            o13.p pVar3 = new o13.p(fValueOf4, o4.d0.a(j16));
            o13.p pVar4 = new o13.p(fValueOf2, o4.d0.a(j16));
            s7.f89624a.getClass();
            int i212 = i16 >> 3;
            int i213 = i16 << 3;
            int i34 = (i212 & 112) | (i212 & 14) | 100666368 | (3670016 & i213) | (i213 & 29360128);
            i18 = i16;
            p3.o0 o0Var3 = o0Var;
            p006l2.r.c(l0Var, lVar, rVarC4, true, false, x0Var2, a2Var, z1Var, true, 0, 0, null, null, jVar, o4.w.a.j(aVar7, new o13.p[]{pVar3, pVar4, new o13.p(fValueOf2, o4.d0.a(s7.a(o0Var).f88471a)), new o13.p(fValueOf, o4.d0.a(s7.a(o0Var).f88471a)), new o13.p(fValueOf, o4.d0.a(j16)), new o13.p(Float.valueOf(1.0f), o4.d0.a(j16))}), z3.f.c(1007938103, new mi(l0Var, jVar, sgVarC), o0Var), o0Var3, i34, 199680, 7696);
            o0VarE = o0Var3;
            o0VarE.g0(true);
            h4.r rVarV2 = c2.l.v(aVar, 0.0f, f87636f, 1);
            objQ2 = o0VarE.q();
            if (objQ2 == r46) {
                objQ2 = new bf(3);
                o0VarE.K(objQ2);
            }
            h4.r rVarB2 = p5.v.b(rVarV2, (e23.l) objQ2);
            if (i14 == 0) {
                i19 = R.string.m3c_time_picker_hour;
            } else {
                i19 = R.string.m3c_time_picker_minute;
            }
            mh.c(l3.k.h(o0VarE, i19), rVarB2, k2.e(n3.e1.f122805i, o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sj.a(n3.e1.f122806j, o0VarE), o0VarE, 0, 0, 131064);
            o0VarE.g0(true);
            qi qiVarA2 = qi.a(riVar.c());
            if ((i18 & 7168) != 2048) {
                z14 = false;
            } else {
                z14 = true;
            }
            objQ3 = o0VarE.q();
            if (z14) {
                riVar2 = riVar;
                i24 = i14;
                objQ3 = new ni(riVar2, i24, b0Var, null);
                o0VarE.K(objQ3);
            } else {
                riVar2 = riVar;
                i24 = i14;
                objQ3 = new ni(riVar2, i24, b0Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, qiVarA2, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(rVar, l0Var, lVar, riVar2, i24, a2Var, z1Var, phVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    public static final void n(h4.r rVar, int i14, ri riVar, int i15, ph phVar, p3.m mVar, int i16) {
        int i17;
        int i18;
        p3.o0 o0Var;
        int i19;
        p3.o0 o0VarE = mVar.E(-1148055889);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 = i14;
            i17 |= o0VarE.k(i18) ? 32 : 16;
        } else {
            i18 = i14;
        }
        if ((i16 & 384) == 0) {
            i17 |= (i16 & 512) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.k(i15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.B(phVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            int iC = riVar.c();
            qi.a aVar = qi.f89469b;
            boolean z14 = iC == i15;
            qi.f89469b.getClass();
            if (i15 == 0) {
                int i24 = l3.n1.f109367b;
                i19 = R.string.m3c_time_picker_hour_selection;
            } else {
                int i25 = l3.n1.f109367b;
                i19 = R.string.m3c_time_picker_minute_selection;
            }
            String strH = l3.k.h(o0VarE, i19);
            long j8 = z14 ? phVar.f89341k : phVar.f89342l;
            long j14 = z14 ? phVar.f89343m : phVar.f89344n;
            boolean zB = o0VarE.B(strH);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new i11.g(strH, 14);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.g(strH, 14);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVar, true);
            n3.f1.f122826a.getClass();
            o4.r1 r1VarC = fc.c(n3.f1.f122848w, o0VarE);
            boolean z15 = ((i17 & 7168) == 2048) | ((i17 & 896) == 256 || ((i17 & 512) != 0 && o0VarE.r(riVar)));
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new ag0.a(i15, riVar, 6);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ag0.a(i15, riVar, 6);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            ve.b(z14, (e23.a) objQ2, rVarC, false, r1VarC, j8, 0L, 0.0f, null, null, z3.f.c(-1477282471, new g(i15, riVar, i18, j14), o0VarE), o0Var, 0, 1992);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.b2(rVar, i14, riVar, i15, phVar, i16, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    public static final void o(boolean z14, o4.r1 r1Var, e23.a<Unit> aVar, ph phVar, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14) {
        int i15;
        o4.r1 r1Var2;
        e23.a<Unit> aVar2;
        p3.o0 o0VarE = mVar.E(1523811083);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            r1Var2 = r1Var;
            i15 |= o0VarE.B(r1Var2) ? 32 : 16;
        } else {
            r1Var2 = r1Var;
        }
        if ((i14 & 384) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(phVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            long j8 = z14 ? phVar.f89339i : phVar.f89340j;
            long j14 = z14 ? phVar.f89337g : phVar.f89338h;
            h4.r rVarD = c2.x2.d(h4.p.b(h4.r.S, z14 ? 0.0f : 1.0f), 1.0f);
            boolean z15 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new a81.j(z14, 12);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a81.j(z14, 12);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarD, false);
            g6.f.a aVar3 = g6.f.f75994b;
            c2.l2 l2VarA = c2.l.a(0);
            c1.f87691a.getClass();
            h1.c(aVar2, rVarC, false, r1Var2, c1.c(j14, j8, 0L, o0VarE, 12), null, l2VarA, null, qVar, o0VarE, ((i15 >> 6) & 14) | 12582912 | ((i15 << 6) & 7168) | ((i15 << 15) & 1879048192), 356);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, r1Var, aVar, phVar, qVar, i14);
        }
    }

    public static final void p(ri riVar, ph phVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        p3.o0 o0VarE = mVar.E(2054675515);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(phVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(cVar2, h4.d.a.f81533k, o0VarE, 6);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            b(riVar, phVar, o0VarE, i15 & 126);
            if (riVar.getF89707a()) {
                z14 = true;
                o0VarE.C(1364727499);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1364287361);
                h4.r rVarC2 = c2.l.C(aVar, f87643m, 0.0f, 0.0f, 0.0f, 14);
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iP2 = o0VarE.P();
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar, z0VarD, o0VarE);
                p3.b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar);
                }
                p3.b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                n3.f1.f122826a.getClass();
                int i16 = i15 << 3;
                q((i16 & 896) | (i16 & 112) | 6, c2.x2.r(aVar, n3.f1.f122846u, n3.f1.f122845t), phVar, riVar, o0VarE);
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rh(riVar, phVar, i14, 2);
        }
    }

    public static final void q(int i14, h4.r rVar, ph phVar, ri riVar, p3.m mVar) {
        int i15;
        ph phVar2;
        p3.o0 o0VarE = mVar.E(-1898918107);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(riVar) : o0VarE.r(riVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            phVar2 = phVar;
            i15 |= o0VarE.B(phVar2) ? 256 : 128;
        } else {
            phVar2 = phVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = h.f87673a;
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            n3.f1.f122826a.getClass();
            o4.r1 r1VarC = fc.c(n3.f1.f122837l, o0VarE);
            r1VarC.getClass();
            k2.a aVar = (k2.a) r1VarC;
            k2.a aVarE = fc.e(aVar);
            dc.f87864a.getClass();
            k2.e eVar = dc.f87873j;
            i(rVar, riVar, phVar2, z0Var, aVarE, k2.a.c(aVar, eVar, eVar, null, null, 12), o0VarE, (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sh(rVar, riVar, phVar, i14, 0);
        }
    }

    public static final void r(int i14, h4.r rVar, p pVar, ph phVar, p3.m mVar, boolean z14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1249591487);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(phVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new bf(5);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVar, false);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            p3.b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            p(pVar, phVar, o0VarE, (i15 & 14) | ((i15 >> 3) & 112));
            h4.r.a aVar3 = h4.r.S;
            c2.l.f(c2.x2.h(aVar3, f87633c), o0VarE);
            n3.f1.f122826a.getClass();
            c((i15 & 7168) | ((i15 << 3) & 112) | 6 | (i15 & 896), c2.x2.q(aVar3, n3.f1.f122828c), pVar, phVar, o0VarE, z14);
            e5.t(aVar3, f87634d, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yh(pVar, rVar, phVar, z14, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object s(p pVar, float f14, float f15, float f16, boolean z14, long j8, s1.k kVar, v13.c cVar) {
        oi oiVar;
        float f17;
        float fRint;
        boolean z15;
        p pVar2;
        boolean z16;
        if (cVar instanceof oi) {
            oiVar = (oi) cVar;
            int i14 = oiVar.f89237d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oiVar.f89237d = i14 - Integer.MIN_VALUE;
            } else {
                oiVar = new oi(cVar);
            }
        } else {
            oiVar = new oi(cVar);
        }
        oi oiVar2 = oiVar;
        Object obj = oiVar2.f89236c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oiVar2.f89237d;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z17 = oiVar2.f89235b;
                pVar2 = oiVar2.f89234a;
                o13.r.b(obj);
                z15 = z17;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z16 = oiVar2.f89235b;
                pVar2 = oiVar2.f89234a;
                o13.r.b(obj);
            }
            z15 = z16;
            if (z15) {
                qi.f89469b.getClass();
                pVar2.d(qi.f89470c);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        g6.k.a aVar2 = g6.k.f76003b;
        float fAtan2 = ((float) Math.atan2(f15 - ((int) (j8 & 4294967295L)), f14 - ((int) (j8 >> 32)))) - 1.5707964f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 6.2831855f;
        }
        int iC = pVar.f89247a.c();
        qi.f89469b.getClass();
        if (iC == qi.f89470c) {
            f17 = 0.10471976f;
            fRint = ((float) Math.rint((fAtan2 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f17 = 0.5235988f;
            fRint = (float) Math.rint(fAtan2 / 0.5235988f);
        }
        float f18 = fRint * f17;
        x(pVar, f14, f15, f16, j8);
        oiVar2.f89234a = pVar;
        z15 = z14;
        oiVar2.f89235b = z15;
        oiVar2.f89237d = 1;
        pVar.f89248b.f82011a = Boolean.FALSE;
        Object objB = pVar.f89253g.b(u1.k1.UserInput, new o(pVar, f18, true, kVar, null), oiVar2);
        if (objB != aVar) {
            objB = Unit.INSTANCE;
        }
        if (objB != aVar) {
            pVar2 = pVar;
        }
        return aVar;
        int iC2 = pVar2.f89247a.c();
        qi.f89469b.getClass();
        if (iC2 == 0 && z15) {
            oiVar2.f89234a = pVar2;
            oiVar2.f89235b = z15;
            oiVar2.f89237d = 2;
            if (o53.m0.b(100L, oiVar2) != aVar) {
                z16 = z15;
                z15 = z16;
            }
            return aVar;
        }
        if (z15) {
            qi.f89469b.getClass();
            pVar2.d(qi.f89470c);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[Catch: NumberFormatException | IllegalArgumentException -> 0x00d2, TryCatch #0 {NumberFormatException | IllegalArgumentException -> 0x00d2, blocks: (B:20:0x004a, B:22:0x0052, B:24:0x005c, B:30:0x0078, B:33:0x0081, B:49:0x00a7, B:51:0x00ac, B:53:0x00b2, B:55:0x00bb, B:59:0x00cf, B:58:0x00c3, B:37:0x008a, B:39:0x0090, B:42:0x0098, B:44:0x009e, B:48:0x00a6, B:54:0x00b8, B:27:0x0069, B:28:0x0072), top: B:62:0x004a }] */
    public static final void t(int i14, ri riVar, x5.l0 l0Var, x5.l0 l0Var2, int i15, h5.v1 v1Var, e23.l lVar) {
        int iDigit;
        v1Var.f82011a = Boolean.FALSE;
        s5.c cVar = l0Var.f188878a;
        if (p005kotlin.jvm.internal.s.g(cVar.f157138b, l0Var2.f188878a.f157138b)) {
            lVar.invoke(l0Var);
            return;
        }
        String str = cVar.f157138b;
        int i16 = 12;
        if (str.length() == 0) {
            qi.f89469b.getClass();
            if (i14 == 0) {
                riVar.e((!w(riVar) || riVar.getF89707a()) ? 0 : 12);
            } else {
                riVar.f(0);
            }
            lVar.invoke(x5.l0.a(l0Var, "", 0L, 6));
            return;
        }
        try {
            if (str.length() == 3) {
                long j8 = l0Var.f188879b;
                s5.w0.a aVar = s5.w0.f157315b;
                if (((int) (j8 >> 32)) == 1) {
                    char cCharAt = str.charAt(0);
                    iDigit = Character.digit((int) cCharAt, 10);
                    if (iDigit < 0) {
                        com.nimbusds.jose.shaded.gson.internal.a.n(cCharAt, "Char ", " is not a decimal digit");
                        iDigit = 0;
                    }
                } else {
                    iDigit = Integer.parseInt(str);
                }
            } else {
                iDigit = Integer.parseInt(str);
            }
            if (iDigit <= i15) {
                qi.f89469b.getClass();
                if (i14 == 0) {
                    if (iDigit != 12 || !w(riVar)) {
                        if (iDigit != 12 || w(riVar) || riVar.getF89707a()) {
                            if (!w(riVar) || riVar.getF89707a()) {
                                i16 = 0;
                            }
                            i16 += iDigit;
                        } else {
                            i16 = 0;
                        }
                    }
                    riVar.e(i16);
                    if (iDigit > 1 && !riVar.getF89707a()) {
                        riVar.d(qi.f89470c);
                    }
                } else {
                    riVar.f(iDigit);
                }
                if (str.length() > 2) {
                    l0Var = x5.l0.a(l0Var, String.valueOf(str.charAt(0)), 0L, 6);
                }
                lVar.invoke(l0Var);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    public static final int u(ri riVar) {
        if (riVar.getF89707a()) {
            return riVar.b() % 24;
        }
        if (riVar.b() % 12 == 0) {
            return 12;
        }
        return w(riVar) ? riVar.b() - 12 : riVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    public static final long v(p pVar) {
        float fI;
        float f14;
        float fI2 = pVar.i();
        n3.f1.f122826a.getClass();
        float f15 = (n3.f1.f122833h / 2.0f) * (fI2 / n3.f1.f122828c);
        ri riVar = pVar.f89247a;
        if (riVar.getF89707a() && w(pVar)) {
            int iC = riVar.c();
            qi.f89469b.getClass();
            if (iC == 0) {
                fI = pVar.i();
                f14 = f87632b;
            } else {
                fI = pVar.i();
                f14 = f87631a;
            }
        } else {
            fI = pVar.i();
            f14 = f87631a;
        }
        float f16 = ((g6.f) j23.t.b(g6.f.a((fI * f14) - f15), g6.f.a(0))).f75997a + f15;
        float f17 = 2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((pVar.i() / f17) + (((float) Math.cos(pVar.f89252f.e().floatValue())) * f16))) << 32) | (((long) Float.floatToRawIntBits((pVar.i() / f17) + (f16 * ((float) Math.sin(pVar.f89252f.e().floatValue()))))) & 4294967295L);
        int i14 = g6.g.f75998b;
        return jFloatToRawIntBits;
    }

    public static final boolean w(ri riVar) {
        return riVar.b() >= 12;
    }

    public static final void x(ri riVar, float f14, float f15, float f16, long j8) {
        int iC = riVar.c();
        qi.f89469b.getClass();
        if (iC == 0 && riVar.getF89707a()) {
            g6.k.a aVar = g6.k.f76003b;
            float fHypot = (float) Math.hypot(((int) (j8 >> 32)) - f14, ((int) (j8 & 4294967295L)) - f15);
            if (w(riVar)) {
                riVar.e(riVar.b() - (fHypot >= f16 ? 12 : 0));
            } else {
                riVar.e(riVar.b() + (fHypot < f16 ? 12 : 0));
            }
        }
    }

    public static final String y(int i14, int i15, p3.m mVar, boolean z14) {
        int i16;
        p3.x1 x1Var = p3.n.f135158a;
        qi.f89469b.getClass();
        if (i14 == qi.f89470c) {
            int i17 = l3.n1.f109367b;
            i16 = R.string.m3c_time_picker_minute_suffix;
        } else if (z14) {
            int i18 = l3.n1.f109367b;
            i16 = R.string.m3c_time_picker_hour_24h_suffix;
        } else {
            int i19 = l3.n1.f109367b;
            i16 = R.string.m3c_time_picker_hour_suffix;
        }
        Object[] objArr = {Integer.valueOf(i15)};
        String strH = l3.k.h(mVar, i16);
        Locale locale = h7.e.a((Configuration) mVar.A(AndroidCompositionLocals_androidKt.f6041a)).f82328a.get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strH, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    public static final si z(final int i14, final int i15, final boolean z14, p3.m mVar, int i16, int i17) {
        if ((i17 & 4) != 0) {
            p3.x1 x1Var = p3.n.f135158a;
            z14 = DateFormat.is24HourFormat((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        }
        p3.x1 x1Var2 = p3.n.f135158a;
        Object[] objArr = new Object[0];
        si.f89706e.getClass();
        ho2.o oVar = new ho2.o(26);
        bf bfVar = new bf(8);
        d4.l lVar = d4.m.f57455a;
        d4.l lVar2 = new d4.l(oVar, bfVar);
        boolean z15 = true;
        boolean z16 = ((((i16 & 14) ^ 6) > 4 && mVar.k(i14)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && mVar.k(i15)) || (i16 & 48) == 32);
        if ((((i16 & 896) ^ 384) <= 256 || !mVar.h(z14)) && (i16 & 384) != 256) {
            z15 = false;
        }
        boolean z17 = z16 | z15;
        Object objQ = mVar.q();
        if (z17) {
            objQ = new e23.a() { // from class: i3.xh
                @Override // e23.a
                public final Object invoke() {
                    return new si(i14, i15, z14);
                }
            };
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new e23.a() { // from class: i3.xh
                    @Override // e23.a
                    public final Object invoke() {
                        return new si(i14, i15, z14);
                    }
                };
                mVar.K(objQ);
            }
        }
        return (si) d4.a.c(objArr, lVar2, (e23.a) objQ, mVar, 0);
    }
}
