package ml0;

import android.content.Intent;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.room.a0;
import c.w;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.fe;
import i3.gf;
import i3.mh;
import i3.se;
import i3.ve;
import i3.yd;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import l72.c1;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p006l2.y0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesKt$GolfCoursesSearchBar$1$1", f = "SearchGolfCourses.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f119219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.q f119220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, m4.q qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f119219a = str;
            this.f119220b = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f119219a, this.f119220b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f119219a.length() == 0) {
                this.f119220b.y(false);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesKt$SearchGolfCourses$checkLocationServices$1", f = "SearchGolfCourses.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f119222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f119223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f119224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f119225e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe feVar, String str, String str2, c.q<Intent, f.a> qVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f119222b = feVar;
            this.f119223c = str;
            this.f119224d = str2;
            this.f119225e = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f119222b, this.f119223c, this.f119224d, this.f119225e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119221a;
            if (i14 == 0) {
                o13.r.b(obj);
                yd ydVar = yd.Long;
                this.f119221a = 1;
                bVar = this;
                obj = fe.b(this.f119222b, this.f119223c, this.f119224d, ydVar, bVar, 4);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                bVar = this;
            }
            if (((se) obj) == se.ActionPerformed) {
                bVar.f119225e.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119226a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f119226a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1766811776);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.golf_downloaded_courses_component_title);
            String strP = y.P(R.string.golf_downloaded_courses_maximum_reached_message, new Object[]{100}, o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new ll0.a(aVar, 18);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ll0.a(aVar, 18);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new ll0.a(aVar, 19);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ll0.a(aVar, 19);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strP, null, null, strQ2, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll1.g(aVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    public static final void b(List<il0.a> list, boolean z14, boolean z15, e23.a<Unit> aVar, e23.l<? super il0.a, Unit> lVar, e23.l<? super il0.a, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        boolean z16;
        boolean z17;
        e23.a<Unit> aVar2;
        e23.l<? super il0.a, Unit> lVar3;
        e23.l<? super il0.a, Unit> lVar4;
        o0 o0Var;
        list.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-2031006594);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z16 = z14;
            i15 |= o0VarE.h(z16) ? 32 : 16;
        } else {
            z16 = z14;
        }
        if ((i14 & 384) == 0) {
            z17 = z15;
            i15 |= o0VarE.h(z17) ? 256 : 128;
        } else {
            z17 = z15;
        }
        if ((i14 & 3072) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 24576) == 0) {
            lVar3 = lVar;
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        } else {
            lVar3 = lVar;
        }
        if ((196608 & i14) == 0) {
            lVar4 = lVar2;
            i15 |= o0VarE.r(lVar4) ? 131072 : 65536;
        } else {
            lVar4 = lVar2;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = ((i15 & 112) == 32) | ((i15 & 896) == 256) | o0VarE.r(list) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384) | ((i15 & 458752) == 131072);
            Object objQ = o0VarE.q();
            if (zR) {
                y0 y0Var = new y0(list, z17, z16, aVar2, lVar3, lVar4);
                o0VarE.K(y0Var);
                objQ = y0Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    y0 y0Var2 = new y0(list, z17, z16, aVar2, lVar3, lVar4);
                    o0VarE.K(y0Var2);
                    objQ = y0Var2;
                }
            }
            o0Var = o0VarE;
            e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, o0Var, 0, 511);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(list, z14, z15, aVar, lVar, lVar2, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    public static final void c(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(261672739);
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            boolean zR = o0VarE.r(qVar) | ((i16 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(str, qVar, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(str, qVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, str, o0VarE);
            i15 = 4;
            ve.a(x2.f(h4.r.S, 1.0f), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-253759362, new f(str, qVar, lVar, i17), o0VarE), o0VarE, 12582918, 122);
        } else {
            i15 = 4;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.b(str, lVar, i14, i15);
        }
    }

    public static final void d(k kVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        String strJ;
        o0 o0VarE = mVar.E(-461473665);
        int i16 = (o0VarE.k(kVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = c.f119226a[kVar.ordinal()];
            if (i17 == 1) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1094554197, R.string.search_results, o0VarE, false);
            } else {
                if (i17 != 2) {
                    throw kg.f.h(o0VarE, -1094556639, false);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1094551100, R.string.golf_course_search_nearby_courses_label, o0VarE, false);
            }
            String upperCase = strJ.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            org.apache.commons.lang3.e.j(bVar);
            h4.r rVarB = c2.l.B(aVar, f14, f15, f15, eVar.f97918c);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            o0Var = o0VarE;
            i15 = 4;
            mh.c(upperCase, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            i15 = 4;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m92.f(kVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    public static final void e(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1953975613);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        char c14 = 14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            j22.b bVar = j22.b.f96736a;
            j22.a aVar2 = j22.a.f96719h;
            bVar.getClass();
            String strF = j22.b.f(aVar2);
            String strQ = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ll0.a(aVar, 20);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ll0.a(aVar, 20);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, null, strF, null, null, strQ, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1754);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll1.g(aVar, i14, c14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(p pVar, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        p pVar2;
        p pVar3;
        Object pVar4;
        c.q qVar;
        String str;
        p3.m.a.C2565a c2565a;
        p pVar5;
        p1 p1Var;
        p pVar6;
        fe feVar;
        o0 o0VarP = a0.p(lVar, aVar, mVar, -1489206121);
        int i15 = i14 | 2 | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        int i16 = 0;
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarP.G0();
            if ((i14 & 1) == 0 || o0VarP.o0()) {
                o0VarP.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarP);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), null);
                    o0VarP.g0(false);
                    pVar3 = (p) u1VarResolveViewModel;
                }
            } else {
                o0VarP.e();
                pVar3 = pVar;
            }
            o0VarP.h0();
            x1 x1Var = p3.n.f135158a;
            PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.ACCESS_FINE_LOCATION", null, o0VarP, 6, 2);
            Object[] objArr = new Object[0];
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new mh1.q(6);
                o0VarP.K(objQ);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarP, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a2) {
                objQ2 = new mh1.q(7);
                o0VarP.K(objQ2);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarP, 48);
            p1 p1VarC = s9.c.c(pVar3.f119267h, o0VarP);
            Object objQ3 = o0VarP.q();
            if (objQ3 == c2565a2) {
                objQ3 = l0.j(t13.h.f161748a, o0VarP);
                o0VarP.K(objQ3);
            }
            b0 b0Var = (b0) objQ3;
            Object objQ4 = o0VarP.q();
            if (objQ4 == c2565a2) {
                objQ4 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarP);
            }
            fe feVar2 = (fe) objQ4;
            String strQ = y.Q(o0VarP, R.string.lbl_settings);
            String strQ2 = y.Q(o0VarP, R.string.golf_course_search_location_services_instructions);
            g.h hVar = new g.h();
            boolean zR = o0VarP.r(pVar3);
            Object objQ5 = o0VarP.q();
            if (zR || objQ5 == c2565a2) {
                objQ5 = new ml0.c(pVar3, i16);
                o0VarP.K(objQ5);
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ5, o0VarP, 0);
            g.h hVar2 = new g.h();
            boolean zR2 = o0VarP.r(pVar3) | o0VarP.r(b0Var) | o0VarP.B(strQ2) | o0VarP.B(strQ) | o0VarP.r(qVarC);
            Object objQ6 = o0VarP.q();
            if (zR2 || objQ6 == c2565a2) {
                qVar = qVarC;
                pVar4 = new aa2.p(pVar3, b0Var, feVar2, strQ2, strQ, qVar, 17);
                str = strQ2;
                o0VarP.K(pVar4);
            } else {
                pVar4 = objQ6;
                str = strQ2;
                qVar = qVarC;
            }
            c.q qVarC2 = w.c(hVar2, (e23.l) pVar4, o0VarP, 0);
            g.g gVar = new g.g();
            boolean zR3 = o0VarP.r(pVar3) | o0VarP.r(b0Var) | o0VarP.B(strQ) | o0VarP.r(qVarC2);
            Object objQ7 = o0VarP.q();
            if (zR3 || objQ7 == c2565a2) {
                p pVar7 = pVar3;
                c2565a = c2565a2;
                pVar5 = pVar7;
                jv0.c cVar = new jv0.c(pVar5, b0Var, feVar2, strQ, qVarC2);
                o0VarP.K(cVar);
                objQ7 = cVar;
            } else {
                pVar5 = pVar3;
                c2565a = c2565a2;
            }
            c.q qVarC3 = w.c(gVar, (e23.l) objQ7, o0VarP, 0);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarP.C(2075768059);
                boolean zB = o0VarP.B(p1Var2) | o0VarP.r(qVarC3);
                Object objQ8 = o0VarP.q();
                if (zB || objQ8 == c2565a) {
                    objQ8 = new c42.g(qVarC3, p1Var2, 3);
                    o0VarP.K(objQ8);
                }
                e((e23.a) objQ8, o0VarP, 0);
                o0VarP.g0(false);
            } else if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarP.C(2076026568);
                boolean zB2 = o0VarP.B(p1Var3);
                Object objQ9 = o0VarP.q();
                if (zB2 || objQ9 == c2565a) {
                    objQ9 = new ly0.f(p1Var3, 27);
                    o0VarP.K(objQ9);
                }
                a((e23.a) objQ9, o0VarP, 0);
                o0VarP.g0(false);
            } else {
                o0VarP.C(2076152459);
                o0VarP.g0(false);
            }
            boolean zB3 = o0VarP.B(permissionStateRememberPermissionState) | o0VarP.B(p1VarC) | o0VarP.r(pVar5) | o0VarP.r(b0Var) | o0VarP.B(str) | o0VarP.B(strQ) | o0VarP.r(qVar) | o0VarP.B(p1Var2) | o0VarP.r(qVarC3);
            Object objQ10 = o0VarP.q();
            if (zB3 || objQ10 == c2565a) {
                p pVar8 = pVar5;
                p1Var = p1VarC;
                i iVar = new i(permissionStateRememberPermissionState, qVarC3, p1Var, pVar8, b0Var, feVar2, str, strQ, qVar, p1Var2, null);
                pVar6 = pVar8;
                feVar = feVar2;
                o0VarP.K(iVar);
                objQ10 = iVar;
            } else {
                pVar6 = pVar5;
                feVar = feVar2;
                p1Var = p1VarC;
            }
            l0.e((e23.p) objQ10, permissionStateRememberPermissionState, o0VarP);
            pVar2 = pVar6;
            z02.d.a(false, z3.f.c(1418549276, new ll1.g(aVar, 12), o0VarP), z3.f.c(378257437, new ak0.o(feVar, 29), o0VarP), null, null, z3.f.c(1552349216, new jj2.c(pVar2, lVar, p1Var3, p1Var, 26), o0VarP), o0VarP, 197040, 25);
        } else {
            o0VarP.e();
            pVar2 = pVar;
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) pVar2, (Object) lVar, (o13.h) aVar, i14, 24);
        }
    }

    public static final void g(p pVar, b0 b0Var, fe feVar, String str, String str2, c.q<Intent, f.a> qVar) {
        if (pVar.f119262c.a("SearchGolfCoursesViewModel")) {
            pVar.z4();
        } else {
            pVar.y4();
            ge1.b.T(b0Var, null, null, new b(feVar, str, str2, qVar, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    public static final void h(l lVar, e23.l<? super String, Unit> lVar2, e23.a<Unit> aVar, e23.l<? super il0.a, Unit> lVar3, e23.l<? super il0.a, Unit> lVar4, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        p3.c<?> cVar;
        boolean z14;
        Object objQ;
        boolean z15;
        o0 o0VarE = mVar.E(-676558543);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar4) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
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
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                String str = lVar.f119245b;
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14) {
                    objQ = new k11.n(lVar2, 26);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k11.n(lVar2, 26);
                        o0VarE.K(objQ);
                    }
                }
                c(str, (e23.l) objQ, o0VarE, 0);
                d(lVar.f119250g, o0VarE, 0);
                if (lVar.f119244a && lVar.f119246c.isEmpty()) {
                    o0VarE.C(1838375758);
                    h4.r rVarD2 = x2.d(aVar3, 1.0f);
                    z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarD2, o0VarE);
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
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar = u.f22885a;
                    String strQ = y.Q(o0VarE, R.string.lbl_no_results);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
                    d6.h hVarA = d6.h.a(i16);
                    z15 = true;
                    mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    z15 = true;
                    o0VarE.C(1838836263);
                    b(lVar.f119246c, lVar.f119244a, lVar.f119248e, aVar2, lVar3, lVar4, o0VarE, (i15 << 3) & 523264);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            String str2 = lVar.f119245b;
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            if (z14) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k11.n(lVar2, 26);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new k11.n(lVar2, 26);
                o0VarE.K(objQ);
            }
            c(str2, (e23.l) objQ, o0VarE, 0);
            d(lVar.f119250g, o0VarE, 0);
            if (lVar.f119244a) {
                z15 = true;
                o0VarE.C(1838836263);
                b(lVar.f119246c, lVar.f119244a, lVar.f119248e, aVar2, lVar3, lVar4, o0VarE, (i15 << 3) & 523264);
                o0VarE.g0(false);
            } else {
                z15 = true;
                o0VarE.C(1838836263);
                b(lVar.f119246c, lVar.f119244a, lVar.f119248e, aVar2, lVar3, lVar4, o0VarE, (i15 << 3) & 523264);
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(lVar, lVar2, aVar, lVar3, lVar4, i14);
        }
    }
}
