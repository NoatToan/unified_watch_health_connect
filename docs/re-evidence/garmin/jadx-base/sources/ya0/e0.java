package ya0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p40.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.DevicePairingSuccessScreenKt$DevicePairingSuccessRoute$1$1", f = "DevicePairingSuccessScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f195425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<q90.g> f195426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<q90.c, q90.f, Boolean, Unit> f195427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f195428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p1<Boolean> p1Var, x3<q90.g> x3Var, e23.q<? super q90.c, ? super q90.f, ? super Boolean, Unit> qVar, p1<Boolean> p1Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f195425a = p1Var;
            this.f195426b = x3Var;
            this.f195427c = qVar;
            this.f195428d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f195425a, this.f195426b, this.f195427c, this.f195428d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            q90.g f182175a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f195425a.getF182175a().booleanValue() && (f182175a = this.f195426b.getF182175a()) != null) {
                q90.c cVar = f182175a.f143529a;
                q90.f fVar = f182175a.f143530b;
                Boolean f182175a2 = this.f195428d.getF182175a();
                f182175a2.getClass();
                this.f195427c.invoke(cVar, fVar, f182175a2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q90.c cVar, o1 o1Var, e23.q<? super q90.c, ? super q90.f, ? super Boolean, Unit> qVar, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        o1 o1Var2;
        p1 p1Var;
        p1 p1Var2;
        boolean z14;
        Object objQ;
        cVar.getClass();
        l90.b bVar = cVar.f143495c;
        o1Var.getClass();
        qVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(261553224);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.k(o1Var.ordinal()) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        boolean z15 = false;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(cVar);
            Object objQ2 = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ2 = new a90.d(cVar, 6);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a90.d(cVar, 6);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar2 = (e23.a) objQ2;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(i0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
            o0VarE.g0(false);
            p1 p1VarC = s9.c.c(((i0) u1VarResolveViewModel).f195455i, o0VarE);
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var4 = (p1) objQ4;
            Boolean bool = (Boolean) p1Var4.getF182175a();
            bool.booleanValue();
            q90.g gVar = (q90.g) p1VarC.getF182175a();
            boolean zB = ((i15 & 896) == 256) | o0VarE.B(p1VarC);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                p1Var = p1VarC;
                p1Var2 = p1Var4;
                a aVar3 = new a(p1Var2, p1Var, qVar, p1Var3, null);
                o0VarE.K(aVar3);
                objQ5 = aVar3;
            } else {
                p1Var = p1VarC;
                p1Var2 = p1Var4;
            }
            l0.f(bool, gVar, (e23.p) objQ5, o0VarE);
            String str = bVar.f111521f;
            o90.a aVar4 = bVar.f111526k;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new x91.d(p1Var2, 26);
                o0VarE.K(objQ6);
            }
            e23.a aVar5 = (e23.a) objQ6;
            if (bVar.f111531p.f58438d) {
                o1Var2 = o1Var;
                if (o1Var2 != o1.CREATE_ACCOUNT) {
                    z14 = true;
                }
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new q0(p1Var3, p1Var2, 14);
                    o0VarE.K(objQ);
                }
                e23.a aVar6 = (e23.a) objQ;
                if (((q90.g) p1Var.getF182175a()) == null && ((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    z15 = true;
                }
                b(str, aVar4, strQ, aVar5, z14, aVar6, z15, lVar, o0VarE, ((i15 << 12) & 29360128) | 199680);
            } else {
                o1Var2 = o1Var;
            }
            z14 = false;
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = new q0(p1Var3, p1Var2, 14);
                o0VarE.K(objQ);
            }
            e23.a aVar7 = (e23.a) objQ;
            if (((q90.g) p1Var.getF182175a()) == null) {
                z15 = true;
            }
            b(str, aVar4, strQ, aVar5, z14, aVar7, z15, lVar, o0VarE, ((i15 << 12) & 29360128) | 199680);
        } else {
            o1Var2 = o1Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(cVar, o1Var2, qVar, lVar, i14, 4);
        }
    }

    public static final void b(String str, o90.a aVar, String str2, e23.a<Unit> aVar2, boolean z14, e23.a<Unit> aVar3, boolean z15, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar4;
        o0 o0Var;
        String strJ;
        o0 o0VarE = mVar.E(1700448959);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar4 = aVar3;
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        } else {
            aVar4 = aVar3;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_device_connected_title);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2043898482, R.string.startup_edit_user_settings, o0VarE, false);
            } else {
                o0VarE.C(-1063601410);
                o0VarE.g0(false);
                strJ = null;
            }
            e23.a<Unit> aVar5 = z14 ? aVar4 : null;
            k.f195481a.getClass();
            int i16 = i15 << 3;
            int i17 = i15 << 18;
            o0Var = o0VarE;
            da0.p.c("device_pairing_success_screen", str, aVar, strQ, false, null, null, null, str2, aVar2, false, strJ, aVar5, false, null, null, false, z15, null, lVar, null, null, k.f195482b, o0Var, (i16 & 896) | (i16 & 112) | 6 | (i17 & 234881024) | (i17 & 1879048192), (29360128 & i16) | ((i15 << 6) & 1879048192), 3072, 7726320);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.i(str, aVar, str2, aVar2, z14, aVar3, z15, lVar, i14);
        }
    }
}
