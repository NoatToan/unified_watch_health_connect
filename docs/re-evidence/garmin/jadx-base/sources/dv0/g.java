package dv0;

import a42.z;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.v;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import cw1.g0;
import gl1.y;
import i3.fe;
import l72.c1;
import l72.d3;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileAndPrivacyScreenKt$LiveTrackProfileAndPrivacyScreen$1$1", f = "LiveTrackProfileAndPrivacyScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f61375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f61376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f61377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<g3<ev0.c>> f61378d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z14, e23.a<Unit> aVar, x3<g3<ev0.c>> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f61375a = str;
            this.f61376b = z14;
            this.f61377c = aVar;
            this.f61378d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f61375a, this.f61376b, this.f61377c, this.f61378d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if ((this.f61378d.getF182175a().f35301b != null && ((str = this.f61375a) == null || str.length() == 0)) || !this.f61376b) {
                this.f61377c.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileAndPrivacyScreenKt$LiveTrackProfileAndPrivacyScreen$2$1", f = "LiveTrackProfileAndPrivacyScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f61379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f61380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f61379a = vVar;
            this.f61380b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f61379a, this.f61380b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<Boolean> p1Var = this.f61380b;
            if (p1Var.getF182175a().booleanValue()) {
                j.f61394i.getClass();
                new j().show(this.f61379a, (String) null);
                p1Var.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileAndPrivacyScreenKt$LiveTrackProfileAndPrivacyScreen$4$2$1", f = "LiveTrackProfileAndPrivacyScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f61381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yu0.f f61382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<g3<ev0.c>> f61383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fe f61384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f61385e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileAndPrivacyScreenKt$LiveTrackProfileAndPrivacyScreen$4$2$1$1", f = "LiveTrackProfileAndPrivacyScreen.kt", l = {199}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f61386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fe f61387b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f61388c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fe feVar, String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f61387b = feVar;
                this.f61388c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f61387b, this.f61388c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f61386a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f61386a = 1;
                    if (d3.c(this.f61387b, this.f61388c, null, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var, yu0.f fVar, x3<g3<ev0.c>> x3Var, fe feVar, String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f61381a = b0Var;
            this.f61382b = fVar;
            this.f61383c = x3Var;
            this.f61384d = feVar;
            this.f61385e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f61381a, this.f61382b, this.f61383c, this.f61384d, this.f61385e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            ev0.c cVarA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ev0.c cVar = this.f61383c.getF182175a().f35301b;
            if (cVar != null ? p005kotlin.jvm.internal.s.g(cVar.f66157f, Boolean.TRUE) : false) {
                ge1.b.T(this.f61381a, null, null, new a(this.f61384d, this.f61385e, null), 3);
                p2 p2Var = this.f61382b.f199711i;
                do {
                    value = p2Var.getValue();
                    g3.a aVar2 = g3.f35298f;
                    ev0.c cVar2 = (ev0.c) ((g3) value).f35301b;
                    cVarA = cVar2 != null ? ev0.c.a(cVar2, null, null, null, null, 95) : null;
                    aVar2.getClass();
                } while (!p2Var.b(value, g3.a.d(cVarA)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61389a;

        static {
            int[] iArr = new int[ev0.a.values().length];
            try {
                iArr[ev0.a.SAVED_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ev0.a.SAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ev0.a.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61389a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yu0.f fVar, gv0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        String strQ;
        boolean z15;
        String strQ2;
        int i15;
        p1 p1Var;
        ev0.a aVar4;
        int i16;
        o0 o0Var2;
        boolean z16;
        fVar.getClass();
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(307972207);
        int i17 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            p1 p1VarC = s9.c.c(fVar.f199712j, o0VarE);
            p1 p1VarC2 = s9.c.c(dVar.f79204w, o0VarE);
            r53.i<az0.c.a> iVar = fVar.f199709g;
            az0.c.a aVar5 = az0.c.a.Available;
            p1 p1VarB = s9.c.b(iVar, aVar5, o0VarE, 48);
            ou0.f fVar2 = (ou0.f) ((g3) p1VarC2.getF182175a()).f35301b;
            ge2.d dVar2 = fVar2 != null ? fVar2.f133988f : null;
            o0VarE.C(-391427038);
            ge2.b.a aVar6 = ge2.b.f77011b;
            String str = dVar2 != null ? dVar2.f77020a : null;
            aVar6.getClass();
            ge2.b bVarA = ge2.b.a.a(str);
            if (bVarA == null) {
                bVarA = ge2.b.OnlyMe;
            }
            ge2.b bVar = ge2.b.Everyone;
            if (bVarA != bVar) {
                z14 = false;
                o0VarE.C(-2138248120);
                strQ = y.Q(o0VarE, lv0.c.a(bVarA));
                o0VarE.g0(false);
            } else {
                ev0.c cVar = (ev0.c) ((g3) p1VarC.getF182175a()).f35301b;
                if (g22.n.d(cVar != null ? cVar.f66156e : null)) {
                    z14 = false;
                    strQ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2138249955, R.string.lbl_anyone_with_access_code, o0VarE, false);
                } else {
                    z14 = false;
                    o0VarE.C(-2138248120);
                    strQ = y.Q(o0VarE, lv0.c.a(bVarA));
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(z14);
            o0VarE.C(-391416890);
            ge2.b bVarA2 = ge2.b.a.a(dVar2 != null ? dVar2.f77021b : null);
            if (bVarA2 == null) {
                bVarA2 = ge2.b.OnlyMe;
            }
            if (bVarA2 != bVar) {
                z15 = false;
                o0VarE.C(-1267426521);
                strQ2 = y.Q(o0VarE, lv0.c.a(bVarA2));
                o0VarE.g0(false);
            } else {
                ev0.c cVar2 = (ev0.c) ((g3) p1VarC.getF182175a()).f35301b;
                if (g22.n.d(cVar2 != null ? cVar2.f66156e : null)) {
                    z15 = false;
                    strQ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1267428356, R.string.lbl_anyone_with_access_code, o0VarE, false);
                } else {
                    z15 = false;
                    o0VarE.C(-1267426521);
                    strQ2 = y.Q(o0VarE, lv0.c.a(bVarA2));
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(z15);
            ev0.e eVar = new ev0.e(strQ, strQ2);
            boolean z17 = ((az0.c.a) p1VarB.getF182175a()) == aVar5;
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(fVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                i15 = 0;
                objQ2 = new dv0.d(fVar, 0);
                o0VarE.K(objQ2);
            } else {
                i15 = 0;
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ2, o0VarE, i15);
            ev0.c cVar3 = (ev0.c) ((g3) p1VarC.getF182175a()).f35301b;
            String str2 = cVar3 != null ? cVar3.f66155d : null;
            ev0.c cVar4 = (ev0.c) ((g3) p1VarC.getF182175a()).f35301b;
            boolean zG = cVar4 != null ? p005kotlin.jvm.internal.s.g(cVar4.f66152a, Boolean.TRUE) : false;
            Boolean boolValueOf = Boolean.valueOf(zG);
            boolean z18 = z17;
            boolean zB = ((i17 & 57344) == 16384) | o0VarE.B(p1VarC) | o0VarE.B(str2) | o0VarE.h(zG);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                a aVar7 = new a(str2, zG, aVar3, p1VarC, null);
                p1Var = p1VarC;
                o0VarE.K(aVar7);
                objQ3 = aVar7;
            } else {
                p1Var = p1VarC;
            }
            l0.f(str2, boolValueOf, (e23.p) objQ3, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            context.getClass();
            v supportFragmentManager = ((androidx.fragment.app.m) context).getSupportFragmentManager();
            supportFragmentManager.getClass();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.getClass();
            boolean zR2 = o0VarE.r(supportFragmentManager);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                aVar4 = null;
                objQ5 = new b(supportFragmentManager, p1Var2, null);
                o0VarE.K(objQ5);
            } else {
                aVar4 = null;
            }
            l0.e((e23.p) objQ5, bool, o0VarE);
            ev0.c cVar5 = (ev0.c) ((g3) p1Var.getF182175a()).f35301b;
            if (cVar5 != null) {
                aVar4 = cVar5.f66158g;
            }
            if (aVar4 == null) {
                o0VarE.C(752371594);
                o0VarE.g0(false);
                z16 = false;
                o0Var2 = o0VarE;
            } else {
                o0VarE.C(752371595);
                c1 c1Var = c1.f110940a;
                String strQ3 = y.Q(o0VarE, R.string.lbl_change_session_privacy);
                int i18 = ev0.d.f66159a[aVar4.ordinal()];
                if (i18 == 1) {
                    i16 = R.string.lbl_change_saved_and_past_session_to_access_code;
                } else if (i18 == 2) {
                    i16 = R.string.lbl_change_saved_session_to_access_code;
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return;
                    }
                    i16 = R.string.lbl_change_active_session_to_access_code;
                }
                String strQ4 = y.Q(o0VarE, i16);
                String strQ5 = y.Q(o0VarE, R.string.lbl_change);
                String strQ6 = y.Q(o0VarE, R.string.feedback_no_thanks_btn);
                boolean zK = o0VarE.k(aVar4.ordinal()) | o0VarE.r(dVar) | o0VarE.r(fVar);
                Object objQ6 = o0VarE.q();
                if (zK || objQ6 == c2565a) {
                    objQ6 = new g0(aVar4, 5, dVar, fVar);
                    o0VarE.K(objQ6);
                }
                e23.a<Unit> aVar8 = (e23.a) objQ6;
                boolean zR3 = o0VarE.r(fVar);
                Object objQ7 = o0VarE.q();
                if (zR3 || objQ7 == c2565a) {
                    objQ7 = new cq0.g(fVar, 26);
                    o0VarE.K(objQ7);
                }
                c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, aVar8, strQ6, (e23.a) objQ7, o0VarE, 6, 0, 216);
                o0Var2 = o0VarE;
                Unit unit = Unit.INSTANCE;
                z16 = false;
                o0Var2.g0(false);
            }
            String strQ7 = y.Q(o0Var2, R.string.livetrack_profile_and_privacy);
            fw.p pVar = ((g3) p1Var.getF182175a()).f35300a;
            fw.p pVar2 = fw.p.LOADING;
            o0 o0Var3 = o0Var2;
            gl1.d.b(strQ7, aVar3, (pVar == pVar2 || ((g3) p1VarC2.getF182175a()).f35300a == pVar2) ? true : z16, null, null, null, z3.f.c(1721240481, new e(p1Var, b0Var, fVar, z18, str2, context, eVar, aVar, aVar2, qVarC, p1Var2), o0Var2), o0Var3, ((i17 >> 9) & 112) | 1572864, 56);
            o0Var = o0Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) fVar, (Object) dVar, (e23.a) aVar, (e23.a) aVar2, (Object) aVar3, i14, 25);
        }
    }
}
