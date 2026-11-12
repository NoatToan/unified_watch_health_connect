package na0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gg1.o0;
import java.util.ArrayList;
import java.util.List;
import l72.c1;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import p13.y;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;
import u62.t;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f125147a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceScreenKt$BikeWheelCircumferenceScreenRoute$1$1", f = "BikeWheelCircumferenceScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f125148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f125149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, q qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125148a = pVar;
            this.f125149b = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125148a, this.f125149b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f125148a.y4(this.f125149b.f125173e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceScreenKt$BikeWheelCircumferenceScreenRoute$2$1", f = "BikeWheelCircumferenceScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f125150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f125151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f125150a = qVar;
            this.f125151b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f125150a, this.f125151b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f125150a.f125170b) {
                this.f125151b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceScreenKt$BikeWheelCircumferenceScreenRoute$3$1", f = "BikeWheelCircumferenceScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f125152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f125153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f125154c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, Context context, e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f125152a = qVar;
            this.f125153b = context;
            this.f125154c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f125152a, this.f125153b, this.f125154c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Integer num = this.f125152a.f125171c;
            if (num != null) {
                Toast.makeText(this.f125153b, num.intValue(), 0).show();
                this.f125154c.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<o0, Unit> {
        public d(Object obj) {
            super(1, obj, p.class, "updateMeasurementSystem", "updateMeasurementSystem(Lcom/garmin/android/apps/connectmobile/settings/MeasurementSystemEnum;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(o0 o0Var) {
            Object value;
            o0 o0Var2 = o0Var;
            o0Var2.getClass();
            p pVar = (p) this.receiver;
            pVar.getClass();
            p2 p2Var = pVar.f125162a;
            if (o0Var2 != p2Var.getValue()) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, o0Var2));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f125147a = 230;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(o0 o0Var, String str, List<fb0.f> list, boolean z14, e23.l<? super o0, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        boolean z15;
        Object obj;
        e23.a<Unit> aVar4;
        e23.a<Unit> aVar5;
        p3.o0 o0Var2;
        p3.o0 o0Var3;
        p3.o0 o0VarE = mVar.E(-1745010798);
        int i15 = (i14 & 6) == 0 ? (o0VarE.k(o0Var.ordinal()) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        } else {
            z15 = z14;
        }
        if ((i14 & 24576) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = lVar;
        }
        if ((196608 & i14) == 0) {
            aVar4 = aVar;
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        } else {
            aVar4 = aVar;
        }
        if ((1572864 & i14) == 0) {
            aVar5 = aVar2;
            i15 |= o0VarE.r(aVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar5 = aVar2;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strJ = o0Var == o0.METRIC ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 667975937, R.string.lbl_mm, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 668028575, R.string.lbl_inch, o0VarE, false);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (fb0.f fVar : list) {
                int i16 = i15;
                int i17 = fVar.f70197a;
                i53.c<Integer> cVar = fVar.f70198b;
                Integer num = fVar.f70199c;
                arrayList.add(new r82.q(i17, cVar, num != null ? context.getString(num.intValue()) : null, fVar.f70200d));
                i15 = i16;
            }
            int i18 = i15;
            i53.f fVarJ = i53.a.j(arrayList);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(668493730);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_tire_circumference);
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_button_ok);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                z3.e eVarC = z3.f.c(-906238669, new fb0.c(fVarJ, 1), o0VarE);
                Object objQ2 = o0VarE.q();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = new n02.c(p1Var, 3);
                    o0VarE.K(objQ2);
                }
                e23.a<Unit> aVar6 = (e23.a) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new n02.c(p1Var, 4);
                    o0VarE.K(objQ3);
                }
                c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar6, strQ3, (e23.a) objQ3, o0VarE, 100666374, 6, 212);
                o0Var3 = o0VarE;
                o0Var3.g0(false);
            } else {
                o0Var3 = o0VarE;
                o0Var3.C(669158928);
                o0Var3.g0(false);
            }
            String strQ4 = gl1.y.Q(o0Var3, R.string.lbl_startup_wheel_circumference_question);
            String strQ5 = gl1.y.Q(o0Var3, R.string.msg_wheel_circumference_info);
            s62.a.f157643a.getClass();
            u4.d dVarA = t.a(t62.a.f162797a);
            String strQ6 = gl1.y.Q(o0Var3, R.string.lbl_next);
            String strQ7 = gl1.y.Q(o0Var3, R.string.lbl_estimate_circumference);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            int i19 = i18 << 3;
            p3.o0 o0Var4 = o0Var3;
            e23.a<Unit> aVar7 = aVar4;
            e23.a<Unit> aVar8 = aVar5;
            da0.p.b("bike_wheel_circumference_screen", strQ4, dVarA, strQ5, null, strQ6, aVar7, false, null, null, false, strQ7, aVar8, false, z15, aVar3, null, null, null, gVar, h4.d.a.f81537o, z3.f.c(1330903698, new ku1.l((Object) o0Var, obj, (Object) p1Var, (Object) str, (Object) strJ, 6), o0Var3), o0Var4, (3670016 & i19) | 6, (i19 & 57344) | ((i18 >> 12) & 896) | (458752 & (i18 >> 6)), 438, 993168);
            o0Var2 = o0Var4;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
        }
        p3.p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(o0Var, str, list, z14, lVar, aVar, aVar2, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(q qVar, e23.p<? super Integer, ? super o0, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        qVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        p3.o0 o0VarE = mVar.E(-410419268);
        int i15 = i14 | (o0VarE.r(qVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(qVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new n82.i(qVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n82.i(qVar, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar6 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar6);
            o0VarE.g0(false);
            p pVar2 = (p) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(pVar2.f125164c, o0VarE);
            Integer numValueOf = Integer.valueOf(qVar.f125173e);
            boolean zR2 = o0VarE.r(pVar2) | o0VarE.r(qVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new a(pVar2, qVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(pVar2, qVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, numValueOf, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(qVar.f125170b);
            boolean zR3 = ((i15 & 7168) == 2048) | o0VarE.r(qVar);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new b(qVar, aVar2, null);
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new b(qVar, aVar2, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, boolValueOf, o0VarE);
            Integer num = qVar.f125171c;
            boolean zR4 = o0VarE.r(qVar) | o0VarE.r(context) | ((i15 & 896) == 256);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                objQ4 = new c(qVar, context, aVar, null);
                o0VarE.K(objQ4);
            } else {
                aVar5.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new c(qVar, context, aVar, null);
                    o0VarE.K(objQ4);
                }
            }
            l0.e((e23.p) objQ4, num, o0VarE);
            o0 o0Var = ((n) p1VarC.getF182175a()).f125155a;
            n nVar = (n) p1VarC.getF182175a();
            o0 o0Var2 = nVar.f125155a;
            o0 o0Var3 = o0.METRIC;
            int iB = nVar.f125156b;
            if (o0Var2 != o0Var3) {
                if (iB == 2111) {
                    iB = 83;
                } else {
                    l3.a aVar7 = l3.f23124b;
                    double d14 = iB;
                    m3 m3Var = m3.MILLIMETER;
                    m3 m3Var2 = m3.INCH;
                    aVar7.getClass();
                    iB = MathKt.b(l3.a.g(d14, m3Var, m3Var2));
                }
            }
            l3.f23124b.getClass();
            String str = l3.f23131i.format(Integer.valueOf(iB));
            str.getClass();
            List<fb0.f> list = ((n) p1VarC.getF182175a()).f125157c;
            boolean z14 = qVar.f125169a;
            boolean zR5 = o0VarE.r(pVar2);
            Object objQ5 = o0VarE.q();
            if (zR5) {
                objQ5 = new d(pVar2);
                o0VarE.K(objQ5);
            } else {
                aVar5.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new d(pVar2);
                    o0VarE.K(objQ5);
                }
            }
            e23.l lVar = (e23.l) ((k23.g) objQ5);
            boolean zB = o0VarE.B(p1VarC) | ((i15 & 112) == 32);
            Object objQ6 = o0VarE.q();
            if (zB) {
                objQ6 = new hl1.s(pVar, p1VarC, 2);
                o0VarE.K(objQ6);
            } else {
                aVar5.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new hl1.s(pVar, p1VarC, 2);
                    o0VarE.K(objQ6);
                }
            }
            a(o0Var, str, list, z14, lVar, (e23.a) objQ6, aVar3, aVar4, o0VarE, (i15 << 6) & 33030144);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j((Object) qVar, (o13.h) pVar, (e23.a) aVar, (e23.a) aVar2, (e23.a) aVar3, (e23.a) aVar4, i14, 25);
        }
    }
}
