package rn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.i0;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import m92.o;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import p3.o0;
import p3.p2;
import p3.x1;
import zm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.summary.components.SleepScoreDailySummaryChartKt$SleepScoreDailySummaryChart$2$2$1", f = "SleepScoreDailySummaryChart.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<rl1.i> f153658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rl1.i f153659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f153660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f153661d;

        /* JADX INFO: renamed from: rn1.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.summary.components.SleepScoreDailySummaryChartKt$SleepScoreDailySummaryChart$2$2$1$1", f = "SleepScoreDailySummaryChart.kt", l = {120}, m = "invokeSuspend", v = 2)
        public static final class C2910a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f153662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f153663b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f153664c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2910a(i0 i0Var, int i14, t13.d<? super C2910a> dVar) {
                super(2, dVar);
                this.f153663b = i0Var;
                this.f153664c = i14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2910a(this.f153663b, this.f153664c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2910a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f153662a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f153662a = 1;
                    if (i0.f(this.f153663b, this.f153664c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends rl1.i> list, rl1.i iVar, b0 b0Var, i0 i0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f153658a = list;
            this.f153659b = iVar;
            this.f153660c = b0Var;
            this.f153661d = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f153658a, this.f153659b, this.f153660c, this.f153661d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int iG0 = h0.g0(this.f153659b, this.f153658a);
            if (iG0 != -1) {
                ge1.b.T(this.f153660c, null, null, new C2910a(this.f153661d, iG0, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153665a;

        static {
            int[] iArr = new int[rl1.i.values().length];
            try {
                iArr[rl1.i.RESTING_HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl1.i.OVERNIGHT_HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rl1.i.BODY_BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rl1.i.SKIN_TEMP.ordinal()] = 4;
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
            f153665a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    public static final void a(mm1.b bVar, DateTime dateTime, DateTime dateTime2, rl1.i iVar, List<? extends rl1.i> list, e23.l<? super rl1.i, Unit> lVar, p3.m mVar, int i14) {
        Object obj;
        Object obj2;
        o0 o0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        String string;
        zm1.b bVar2;
        zm1.d dVar;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-111678341);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            obj = dateTime;
            i15 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = dateTime;
        }
        if ((i14 & 384) == 0) {
            obj2 = dateTime2;
            i15 |= o0VarE.r(obj2) ? 256 : 128;
        } else {
            obj2 = dateTime2;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(list) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            List<mm1.c> listB = bVar != null ? bVar.b() : null;
            ArrayList arrayListI = listB != null ? vm1.a.i(listB) : null;
            ArrayList arrayListD = listB != null ? vm1.a.d(listB) : null;
            if (listB != null) {
                ArrayList arrayList3 = new ArrayList();
                for (mm1.c cVar : listB) {
                    if (cVar.getCalendarDate() == null) {
                        cVar = null;
                    } else {
                        mm1.c.a values = cVar.getValues();
                        if ((values != null ? values.getAvgHeartRate() : null) == null) {
                            cVar = null;
                        }
                    }
                    if (cVar != null) {
                        LocalDate localDateA = mm1.d.a(cVar);
                        mm1.c.a values2 = cVar.getValues();
                        dVar = new zm1.d(localDateA, values2 != null ? values2.getAvgHeartRate() : null);
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        arrayList3.add(dVar);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3 = null;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            ArrayList arrayListA = listB != null ? vm1.a.a(listB) : null;
            ArrayList arrayListE = listB != null ? vm1.a.e(listB) : null;
            ArrayList arrayListB = listB != null ? vm1.a.b(listB) : null;
            ArrayList arrayListC = listB != null ? vm1.a.c(listB) : null;
            if (listB != null) {
                ArrayList arrayList4 = new ArrayList();
                for (mm1.c cVar2 : listB) {
                    if (cVar2.getCalendarDate() == null) {
                        cVar2 = null;
                    } else {
                        mm1.c.a values3 = cVar2.getValues();
                        if ((values3 != null ? values3.getHrvStatus() : null) == null || cVar2.getValues().getAvgOvernightHrv() == null) {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        LocalDate localDateA2 = mm1.d.a(cVar2);
                        mm1.c.a values4 = cVar2.getValues();
                        Double avgOvernightHrv = values4 != null ? values4.getAvgOvernightHrv() : null;
                        mm1.c.a values5 = cVar2.getValues();
                        bVar2 = new zm1.b(localDateA2, avgOvernightHrv, values5 != null ? values5.getHrvStatus() : null);
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        arrayList4.add(bVar2);
                    }
                }
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            s sVar = new s(arrayListI, arrayListD, arrayList, arrayListA, arrayListE, arrayListB, arrayListC, arrayList2);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ArrayList arrayList5 = new ArrayList(y.r(list, 10));
            for (rl1.i iVar2 : list) {
                switch (b.f153665a[iVar2.ordinal()]) {
                    case 1:
                        string = context.getString(R.string.resting_heart_rate);
                        break;
                    case 2:
                        string = context.getString(R.string.lbl_overnight_heart_rate);
                        break;
                    case 3:
                        string = context.getString(R.string.gcm_body_battery_lbl_body_battery);
                        break;
                    case 4:
                        string = context.getString(R.string.lbl_skin_temp_change);
                        break;
                    case 5:
                        string = context.getString(R.string.device_settings_pulse_ox);
                        break;
                    case 6:
                    case 7:
                        string = context.getString(R.string.activities_respiration_title);
                        break;
                    case 8:
                        string = context.getString(R.string.ohrv_status);
                        break;
                    default:
                        string = "";
                        break;
                }
                String str = string;
                str.getClass();
                arrayList5.add(new j0(str, null, null, false, iVar2 == iVar, 14, null));
            }
            i53.c cVarE = i53.a.e(arrayList5);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
            o0Var = o0VarE;
            o.a(null, gl1.y.Q(o0VarE, R.string.lbl_sleep_score), null, null, z3.f.c(647598331, new qy0.d(obj, obj2, sVar, iVar, 10), o0VarE), z3.f.c(80686298, new qy0.d((Object) cVarE, (e23.l) lVar, (Object) list, (Object) iVar, 11), o0VarE), null, o0Var, 221184, 77);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(bVar, dateTime, dateTime2, iVar, list, lVar, i14, 5);
        }
    }
}
