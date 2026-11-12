package vy0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c2.c3;
import c2.j0;
import i3.fe;
import i3.hb;
import kotlin.m3;
import kotlin.t1;
import l72.d3;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p008y1.h1;
import p008y1.k3;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import ty1.g2;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreContentKt$MoreContent$1$1", f = "MoreContent.kt", l = {52}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f180739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f180740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<String> f180741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, a0 a0Var, x3<String> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180739b = feVar;
            this.f180740c = a0Var;
            this.f180741d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180739b, this.f180740c, this.f180741d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180738a;
            if (i14 == 0) {
                o13.r.b(obj);
                x3<String> x3Var = this.f180741d;
                if (x3Var.getF182175a() != null) {
                    String f182175a = x3Var.getF182175a();
                    f182175a.getClass();
                    this.f180738a = 1;
                    if (d3.c(this.f180739b, f182175a, null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f180740c.f180678f.f204261a.E4("FEEDBACK_SNACKBAR_MESSAGE");
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<String, Unit> {
        public b(Object obj) {
            super(1, obj, a0.class, "updateSearchQuery", "updateSearchQuery(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            a0 a0Var = (a0) this.receiver;
            a0Var.getClass();
            ge1.b.T(v1.a(a0Var), null, null, new c0(a0Var, str2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
        public c(Object obj) {
            super(1, obj, a0.class, "updateSearching", "updateSearching(Z)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a0 a0Var = (a0) this.receiver;
            a0Var.getClass();
            ge1.b.T(v1.a(a0Var), null, null, new d0(a0Var, zBooleanValue, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.q f180742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f180743b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreContentKt$MoreContent$4$1$1$1", f = "MoreContent.kt", l = {84}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f180744a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f180745b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m4.q f180746c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m3 f180747d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m4.q qVar, m3 m3Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f180746c = qVar;
                this.f180747d = m3Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f180746c, this.f180747d, dVar);
                aVar.f180745b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b5.c cVar = (b5.c) this.f180745b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f180744a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b5.s sVar = b5.s.Initial;
                    this.f180745b = null;
                    this.f180744a = 1;
                    if (k3.c(cVar, sVar, this, 1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                this.f180746c.y(false);
                m3 m3Var = this.f180747d;
                if (m3Var != null) {
                    m3Var.hide();
                }
                return Unit.INSTANCE;
            }
        }

        public d(m4.q qVar, m3 m3Var) {
            this.f180742a = qVar;
            this.f180743b = m3Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = h1.c(h0Var, new a(this.f180742a, this.f180743b, null), dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, ty0.b bVar, t tVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        bVar.getClass();
        tVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1762465735);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(tVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(a0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            a0 a0Var = (a0) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(a0Var.f180681i, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            boolean zR = o0VarE.r(a0Var) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new g2(25, tVar, a0Var);
                o0VarE.K(objQ2);
            }
            e23.l lVar = (e23.l) objQ2;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            p1 p1VarC2 = p0.c(a0Var.f180680h, o0VarE, 0);
            String str = (String) p1VarC2.getF182175a();
            boolean zB = o0VarE.B(p1VarC2) | o0VarE.r(a0Var);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new a(feVar, a0Var, p1VarC2, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, str, o0VarE);
            boolean z15 = ((x) p1VarC.getF182175a()).f180777b;
            z3.e eVarC = z3.f.c(613948244, new ug2.p(a0Var, z14, bVar, aVar, p1VarC, 5), o0VarE);
            z3.e eVarC2 = z3.f.c(-369045133, new p21.b(feVar, 22), o0VarE);
            hb.f88319a.getClass();
            c3 c3VarA = hb.a(o0VarE);
            i3.d0.f87812a.getClass();
            z02.d.a(z15, eVarC, eVarC2, null, new j0(c3VarA, i3.d0.a(o0VarE)), z3.f.c(976942032, new sg2.g(qVar, m3Var, p1VarC, lVar, a0Var, 19), o0VarE), o0VarE, 197040, 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(z14, bVar, tVar, aVar, i14, 19);
        }
    }
}
