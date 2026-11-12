package in1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import e2.i0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import o4.d0;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.l1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepTimelineChartWithChipsKt$SleepTimelineChartWithChips$2$2$1", f = "SleepTimelineChartWithChips.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<rl1.i> f94522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f94523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<rl1.i> f94524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f94525d;

        /* JADX INFO: renamed from: in1.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepTimelineChartWithChipsKt$SleepTimelineChartWithChips$2$2$1$1", f = "SleepTimelineChartWithChips.kt", l = {117}, m = "invokeSuspend", v = 2)
        public static final class C1805a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f94526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f94527b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f94528c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1805a(i0 i0Var, int i14, t13.d<? super C1805a> dVar) {
                super(2, dVar);
                this.f94527b = i0Var;
                this.f94528c = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1805a(this.f94527b, this.f94528c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1805a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f94526a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f94526a = 1;
                    if (i0.f(this.f94527b, this.f94528c, this) == aVar) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends rl1.i> list, b0 b0Var, p1<rl1.i> p1Var, i0 i0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94522a = list;
            this.f94523b = b0Var;
            this.f94524c = p1Var;
            this.f94525d = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94522a, this.f94523b, this.f94524c, this.f94525d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int iG0 = h0.g0(this.f94524c.getF182175a(), this.f94522a);
            if (iG0 != -1) {
                ge1.b.T(this.f94523b, null, null, new C1805a(this.f94525d, iG0, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94529a;

        static {
            int[] iArr = new int[rl1.i.values().length];
            try {
                iArr[rl1.i.BREATHING_VARIATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl1.i.AWAKE_RESTLESSNESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rl1.i.RESTING_HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rl1.i.BODY_BATTERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rl1.i.PULSE_OX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rl1.i.RESPIRATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rl1.i.RESPIRATION_AVERAGES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rl1.i.OVERNIGHT_HRV.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f94529a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(km1.c cVar, int i14, rl1.i iVar, e23.l<? super rl1.i, Unit> lVar, p3.m mVar, int i15) {
        rl1.i iVar2;
        String str;
        String string;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1547594371);
        int i16 = i15 | ((i15 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        boolean zA = false;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            sn1.b.f160414a.getClass();
            ArrayList<rl1.i> arrayListA = sn1.b.a(cVar, i14);
            rl1.i iVar3 = rl1.i.SKIN_TEMP;
            if (arrayListA.contains(iVar3)) {
                arrayListA.remove(iVar3);
            }
            boolean z14 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                if (h0.R(arrayListA, iVar)) {
                    iVar2 = iVar;
                } else {
                    iVar2 = null;
                }
                objQ = p0.n(iVar2);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (h0.R(arrayListA, iVar)) {
                        iVar2 = iVar;
                    } else {
                        iVar2 = null;
                    }
                    objQ = p0.n(iVar2);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new CustomCombinedChart(context);
                o0VarE.K(objQ2);
            }
            CustomCombinedChart customCombinedChart = (CustomCombinedChart) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sl1.h(customCombinedChart, rl1.j.STAGES, null, null, 12, null);
                o0VarE.K(objQ3);
            }
            sl1.h hVar = (sl1.h) objQ3;
            o0VarE.C(-1179481463);
            ArrayList arrayList = new ArrayList(y.r(arrayListA, 10));
            for (rl1.i iVar4 : arrayListA) {
                arrayList.add(new j0(gl1.y.Q(o0VarE, iVar4.f153436b), null, null, false, iVar4 == ((rl1.i) p1Var.getF182175a()), 14, null));
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            rl1.i iVar5 = (rl1.i) p1Var.getF182175a();
            if (iVar5 != null) {
                if (cVar != null) {
                    tm1.a.f165439a.getClass();
                    zA = em1.e.a(tm1.a.C3110a.a(cVar), iVar5);
                }
                if (!zA) {
                    switch (b.f94529a[iVar5.ordinal()]) {
                        case 1:
                            string = context.getString(R.string.lbl_no_breathing_variations_data);
                            break;
                        case 2:
                            string = context.getString(R.string.msg_no_restless_moments_data);
                            break;
                        case 3:
                            string = context.getString(R.string.msg_no_resting_heart_rate_data);
                            break;
                        case 4:
                            String string2 = context.getString(R.string.gcm_body_battery_lbl_body_battery);
                            string2.getClass();
                            string = context.getString(R.string.common_no_certain_data, string2);
                            break;
                        case 5:
                            String string3 = context.getString(R.string.device_settings_pulse_ox);
                            string3.getClass();
                            string = context.getString(R.string.common_no_certain_data, string3);
                            break;
                        case 6:
                        case 7:
                            String string4 = context.getString(R.string.lbl_no_respiration_data);
                            string4.getClass();
                            string = g22.n.a(string4);
                            break;
                        case 8:
                            string = context.getString(R.string.msg_no_overnight_hrv_data);
                            break;
                        default:
                            string = context.getString(R.string.common_no_data);
                            break;
                    }
                } else {
                    string = null;
                }
                str = string;
            } else {
                str = null;
            }
            tm1.a.C3110a c3110a = tm1.a.f165439a;
            km1.c cVar2 = str != null ? new km1.c(cVar != null ? cVar.getDailySleep() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 33554430, null) : cVar == null ? new km1.c(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 33554431, null) : cVar;
            c3110a.getClass();
            rm1.j jVarA = tm1.a.C3110a.a(cVar2);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            d0.f128823b.getClass();
            m92.o.a(u1.n.e(rVarC, d0.f128831j, m1.f128891a), null, null, null, z3.f.c(1608564989, new et.p(jVarA, customCombinedChart, hVar, p1Var, str, 27), o0VarE), z3.f.c(-1133314946, new g52.d(cVarE, arrayListA, p1Var, lVar, 26), o0VarE), null, o0VarE, 221184, 78);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(cVar, i14, iVar, lVar, i15, 11);
        }
    }

    public static final void b(h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1229084982);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            u4.d dVarA = l1.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).f().d();
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            i7.b(dVarA, null, x2.q(aVar2, 16), jD, o0VarE, 432, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_time_change);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d92.b.f58625c.getClass();
            mh.c(strQ, c2.l.C(aVar2, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 10);
        }
    }
}
