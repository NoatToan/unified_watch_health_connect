package u50;

import am.x0;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout;
import cw1.s0;
import cw1.t0;
import e23.p;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.qg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l72.v2;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchScreenKt$CourseSearchScreen$1$1", f = "CourseSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<x50.b, Unit> f168656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f168657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super x50.b, Unit> lVar, n1 n1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f168656a = lVar;
            this.f168657b = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f168656a, this.f168657b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f168656a.invoke(new x50.b.k(this.f168657b.getIntValue() == 0));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchScreenKt$CourseSearchScreen$2$1", f = "CourseSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x50.f f168658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<w50.d> f168659b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x50.f fVar, p1<w50.d> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f168658a = fVar;
            this.f168659b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f168658a, this.f168659b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w50.d f182175a;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<w50.d> p1Var = this.f168659b;
            w50.d f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                i53.c<com.garmin.android.apps.connectmobile.courses.model.d> cVarB = this.f168658a.b();
                LinkedHashMap linkedHashMap = f182175a.f182200o;
                LinkedHashMap linkedHashMap2 = f182175a.f182199n;
                ProgressBar progressBar = f182175a.f182195j;
                if (progressBar == null) {
                    s.m("progressBar");
                    throw null;
                }
                progressBar.setVisibility(8);
                f182175a.z6();
                qe2.h hVar = f182175a.f148294e;
                if (hVar != null) {
                    hVar.clear();
                    linkedHashMap2.clear();
                    linkedHashMap.clear();
                    if (cVarB != null) {
                        for (com.garmin.android.apps.connectmobile.courses.model.d dVar : cVarB) {
                            if (dVar != null && (str = dVar.courseId) != null) {
                                double d14 = dVar.startLatitude;
                                double d15 = dVar.startLongitude;
                                if (zf.b.D(Double.valueOf(d14)) && zf.b.D(Double.valueOf(d15))) {
                                    com.garmin.android.apps.connectmobile.courses.model.i.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                                    x0 x0VarC = dVar.C();
                                    aVar2.getClass();
                                    com.garmin.android.apps.connectmobile.courses.model.i iVarA = com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC);
                                    Context contextRequireContext = f182175a.requireContext();
                                    contextRequireContext.getClass();
                                    w50.b bVar = new w50.b(str, 0, iVarA.b(contextRequireContext, false), iVarA.f32982d, 2, null);
                                    com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                                    pVar.e("extra_marker_tag", bVar);
                                    pVar.f50327a.f50312d = s20.d.a(f182175a.requireContext(), dVar.courseName);
                                    Context contextRequireContext2 = f182175a.requireContext();
                                    contextRequireContext2.getClass();
                                    pVar.c(iVarA.b(contextRequireContext2, false));
                                    pVar.d(new com.garmin.android.library.mapsdkadapter.f(d14, d15, dVar.D()));
                                    qe2.h hVar2 = f182175a.f148294e;
                                    if (hVar2 != null) {
                                        ie2.j jVarX = hVar2.x(pVar);
                                        ((qe2.i) jVarX).h(0.5f, 0.4f);
                                        linkedHashMap.put(str, jVarX);
                                        linkedHashMap2.put(str, dVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchScreenKt$CourseSearchScreen$3$1", f = "CourseSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x50.f f168660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<w50.d> f168661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x50.f fVar, p1<w50.d> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f168660a = fVar;
            this.f168661b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f168660a, this.f168661b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w50.d f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<w50.d> p1Var = this.f168661b;
            w50.d f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                boolean z14 = this.f168660a.f189009d;
                ProgressBar progressBar = f182175a.f182195j;
                if (progressBar != null) {
                    if (z14) {
                        progressBar.setIndeterminate(true);
                        ProgressBar progressBar2 = f182175a.f182195j;
                        if (progressBar2 == null) {
                            s.m("progressBar");
                            throw null;
                        }
                        progressBar2.setVisibility(0);
                    } else {
                        progressBar.setVisibility(8);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchScreenKt$CourseSearchScreen$4$1", f = "CourseSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x50.f f168662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<w50.d> f168663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x50.f fVar, p1<w50.d> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f168662a = fVar;
            this.f168663b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f168662a, this.f168663b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w50.d f182175a;
            ie2.k uiSettings;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<w50.d> p1Var = this.f168663b;
            w50.d f182175a2 = p1Var.getF182175a();
            if (f182175a2 != null && f182175a2.isAdded() && (f182175a = p1Var.getF182175a()) != null) {
                boolean z14 = this.f168662a.f189010e;
                boolean z15 = !z14;
                if (z14) {
                    SlidingUpPanelLayout slidingUpPanelLayout = f182175a.f182197l;
                    if (slidingUpPanelLayout == null) {
                        s.m("slidingLayout");
                        throw null;
                    }
                    if (!slidingUpPanelLayout.f47539w) {
                        slidingUpPanelLayout.e(1.0f);
                    }
                }
                qe2.h hVar = f182175a.f148294e;
                if (hVar != null && (uiSettings = hVar.f144584a.getUiSettings()) != null) {
                    uiSettings.setZoomControlsEnabled(z15);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x032a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0350  */
    /* JADX WARN: Code duplicated, block: B:113:0x037a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0391  */
    /* JADX WARN: Code duplicated, block: B:117:0x0396  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0202  */
    /* JADX WARN: Code duplicated, block: B:66:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x0237  */
    /* JADX WARN: Code duplicated, block: B:73:0x0239  */
    /* JADX WARN: Code duplicated, block: B:76:0x024c  */
    /* JADX WARN: Code duplicated, block: B:77:0x024e  */
    /* JADX WARN: Code duplicated, block: B:80:0x026e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0275  */
    /* JADX WARN: Code duplicated, block: B:83:0x0279  */
    /* JADX WARN: Code duplicated, block: B:88:0x0294  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:99:0x031d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(x50.f fVar, e23.l<? super x50.b, Unit> lVar, p3.m mVar, int i14) {
        h4.r.a aVar;
        h5.g.a.f fVar2;
        h4.r.a aVar2;
        h4.g gVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.g.a.b bVar;
        boolean z14;
        boolean z15;
        z0 z0VarD2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        Object objQ;
        ArrayList arrayList;
        boolean z16;
        boolean z17;
        x50.f fVar3 = fVar;
        e23.l<? super x50.b, Unit> lVar2 = lVar;
        fVar3.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(889213355);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(fVar3) ? 4 : 2) | (o0VarE.r(lVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            i53.f fVarA = i53.a.a(y.Q(o0VarE, R.string.lbl_map), y.Q(o0VarE, R.string.lbl_list));
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            int i16 = i15 & 112;
            boolean z18 = i16 == 32;
            Object objQ4 = o0VarE.q();
            if (z18 || objQ4 == c2565a) {
                objQ4 = new a(lVar2, n1Var, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, numValueOf, o0VarE);
            w50.d dVar = (w50.d) p1Var.getF182175a();
            i53.c<com.garmin.android.apps.connectmobile.courses.model.d> cVarB = fVar3.b();
            boolean zR = o0VarE.r(fVar3);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new b(fVar3, p1Var, null);
                o0VarE.K(objQ5);
            }
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
            l0.f(dVar, cVarB, (p) objQ5, o0VarE);
            w50.d dVar2 = (w50.d) p1Var.getF182175a();
            Boolean boolValueOf = Boolean.valueOf(fVar3.f189009d);
            boolean zR2 = o0VarE.r(fVar3);
            Object objQ6 = o0VarE.q();
            if (zR2 || objQ6 == c2565a) {
                objQ6 = new c(fVar3, p1Var, null);
                o0VarE.K(objQ6);
            }
            l0.f(dVar2, boolValueOf, (p) objQ6, o0VarE);
            w50.d dVar3 = (w50.d) p1Var.getF182175a();
            Boolean boolValueOf2 = Boolean.valueOf(fVar3.f189010e);
            boolean zR3 = o0VarE.r(fVar3);
            Object objQ7 = o0VarE.q();
            if (zR3 || objQ7 == c2565a) {
                objQ7 = new d(fVar3, p1Var, null);
                o0VarE.K(objQ7);
            }
            l0.f(dVar3, boolValueOf2, (p) objQ7, o0VarE);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                aVar = aVar3;
            } else {
                aVar = aVar3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                int intValue = n1Var.getIntValue();
                long jB = tn.k.b(d92.b.f58623a, o0VarE);
                z3.e eVarC = z3.f.c(1145995997, new s0(n1Var, 1), o0VarE);
                u50.a.f168642a.getClass();
                aVar2 = aVar;
                qg.e(intValue, null, jB, 0L, eVarC, u50.a.f168643b, z3.f.c(720048349, new t0(fVarA, n1Var, 1), o0VarE), o0VarE, 1794048, 10);
                h4.r rVarD2 = x2.d(aVar2, 1.0f);
                gVar = h4.d.a.f81524b;
                z0VarD = q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T && s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar2, rVarC, o0VarE);
                u uVar = u.f22885a;
                if (n1Var.getIntValue() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                h4.r rVarA = v2.a(aVar2, z14, new t21.e(26), o0VarE, 6);
                if (n1Var.getIntValue() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                h4.r rVarA2 = v2.a(rVarA, z15, new t21.e(27), o0VarE, 0);
                z0VarD2 = q.d(gVar, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar2, rVarC2, o0VarE);
                h4.r rVarD3 = x2.d(aVar2, 1.0f);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new sk0.n(p1Var, 18);
                    o0VarE.K(objQ);
                }
                o0VarE.L(1765406104);
                g8.a.a(w50.d.class, rVarD3, g8.i.U(o0VarE), Bundle.EMPTY, (e23.l) objQ, o0VarE, 24624, 0);
                o0VarE.g0(false);
                o0VarE.g0(true);
                if (n1Var.getIntValue() == 1) {
                    o0VarE.C(1376784508);
                    i53.c<com.garmin.android.apps.connectmobile.courses.model.d> cVarB2 = fVar.b();
                    arrayList = new ArrayList(p13.y.r(cVarB2, 10));
                    for (com.garmin.android.apps.connectmobile.courses.model.d dVar4 : cVarB2) {
                        String str = dVar4.courseId;
                        String str2 = dVar4.courseName;
                        com.garmin.android.apps.connectmobile.courses.model.i.a aVar5 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                        x0 x0VarC = dVar4.C();
                        aVar5.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.i iVarA = com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC);
                        double d14 = dVar4.distanceInMeters;
                        double d15 = dVar4.elevationGainInMeters;
                        boolean z19 = dVar4.isFavorite;
                        if (dVar4.powerGuideId != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        arrayList.add(new x50.a(str, str2, iVarA, d14, d15, z19, z17));
                    }
                    i53.f fVarJ = i53.a.j(arrayList);
                    fVar3 = fVar;
                    x50.d dVar5 = fVar3.f189008c;
                    if (fVar3.f189012g || fVar3.f189013h || fVar3.f189006a.isEmpty()) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    lVar2 = lVar;
                    v50.j.a(new x50.e(fVarJ, dVar5, z16, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g()), lVar2, null, o0VarE, i16);
                    o0VarE.g0(false);
                } else {
                    fVar3 = fVar;
                    lVar2 = lVar;
                    o0VarE.C(1376960371);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            int intValue2 = n1Var.getIntValue();
            long jB2 = tn.k.b(d92.b.f58623a, o0VarE);
            z3.e eVarC2 = z3.f.c(1145995997, new s0(n1Var, 1), o0VarE);
            u50.a.f168642a.getClass();
            aVar2 = aVar;
            qg.e(intValue2, null, jB2, 0L, eVarC2, u50.a.f168643b, z3.f.c(720048349, new t0(fVarA, n1Var, 1), o0VarE), o0VarE, 1794048, 10);
            h4.r rVarD4 = x2.d(aVar2, 1.0f);
            gVar = h4.d.a.f81524b;
            z0VarD = q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                bVar = bVar2;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                bVar = bVar2;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar2, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            if (n1Var.getIntValue() == 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            h4.r rVarA3 = v2.a(aVar2, z14, new t21.e(26), o0VarE, 6);
            if (n1Var.getIntValue() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            h4.r rVarA4 = v2.a(rVarA3, z15, new t21.e(27), o0VarE, 0);
            z0VarD2 = q.d(gVar, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            h4.r rVarD5 = x2.d(aVar2, 1.0f);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = new sk0.n(p1Var, 18);
                o0VarE.K(objQ);
            }
            o0VarE.L(1765406104);
            g8.a.a(w50.d.class, rVarD5, g8.i.U(o0VarE), Bundle.EMPTY, (e23.l) objQ, o0VarE, 24624, 0);
            o0VarE.g0(false);
            o0VarE.g0(true);
            if (n1Var.getIntValue() == 1) {
                o0VarE.C(1376784508);
                i53.c<com.garmin.android.apps.connectmobile.courses.model.d> cVarB3 = fVar.b();
                arrayList = new ArrayList(p13.y.r(cVarB3, 10));
                while (r0.hasNext()) {
                    String str3 = dVar4.courseId;
                    String str4 = dVar4.courseName;
                    com.garmin.android.apps.connectmobile.courses.model.i.a aVar6 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                    x0 x0VarC2 = dVar4.C();
                    aVar6.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.i iVarA2 = com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC2);
                    double d16 = dVar4.distanceInMeters;
                    double d17 = dVar4.elevationGainInMeters;
                    boolean z110 = dVar4.isFavorite;
                    if (dVar4.powerGuideId != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    arrayList.add(new x50.a(str3, str4, iVarA2, d16, d17, z110, z17));
                }
                i53.f fVarJ2 = i53.a.j(arrayList);
                fVar3 = fVar;
                x50.d dVar6 = fVar3.f189008c;
                if (fVar3.f189012g) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                lVar2 = lVar;
                v50.j.a(new x50.e(fVarJ2, dVar6, z16, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g()), lVar2, null, o0VarE, i16);
                o0VarE.g0(false);
            } else {
                fVar3 = fVar;
                lVar2 = lVar;
                o0VarE.C(1376960371);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(fVar3, lVar2, i14, 28);
        }
    }
}
