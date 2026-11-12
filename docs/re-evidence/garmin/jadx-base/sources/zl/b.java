package zl;

import am.x0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.u;
import b63.z;
import c22.l3;
import c22.m3;
import c22.o;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import e53.j;
import f12.l;
import g22.k;
import gs1.q;
import gs1.t;
import gs1.y;
import i3.e5;
import i53.c;
import is1.e;
import j82.g;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m92.h0;
import o13.r;
import o4.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.t0;
import p13.w;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import tf0.i;
import vb.h;
import yl.d;
import yl.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzl/b;", "Landroidx/lifecycle/u1;", "Lf12/l;", "gcmUserSettings", "Lql/a;", "pulseOxAcclimationRepository", "Lil/b;", "pulseOxAcclimationDelegate", "Lc22/o;", "appUtilDelegate", "Lis1/e;", "timelineRepository", "Landroid/os/Bundle;", "intentExtra", "<init>", "(Lf12/l;Lql/a;Lil/b;Lc22/o;Lis1/e;Landroid/os/Bundle;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f205169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ql.a f205170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final il.b f205171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f205172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f205173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f205174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f205175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f205176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u82.a<o82.a, d> f205177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a<o82.a, f> f205178j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lyl/d;", "<anonymous>", "(Lo82/a;)Lyl/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.acclimation.reports.presentation.viewmodel.PulseOxAcclimationViewModel$dailyPulseOxAcclimationPageState$1", f = "PulseOxAcclimationViewModel.kt", l = {49}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o82.a, t13.d<? super d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f205180b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = b.this.new a(dVar);
            aVar.f205180b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super d> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:338:0x066a  */
        /* JADX WARN: Code duplicated, block: B:378:0x075c  */
        /* JADX WARN: Code duplicated, block: B:380:0x0772  */
        /* JADX WARN: Code duplicated, block: B:382:0x0778  */
        /* JADX WARN: Code duplicated, block: B:384:0x077d  */
        /* JADX WARN: Code duplicated, block: B:386:0x078d  */
        /* JADX WARN: Code duplicated, block: B:388:0x0793  */
        /* JADX WARN: Code duplicated, block: B:389:0x079e  */
        /* JADX WARN: Code duplicated, block: B:396:0x07d7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v47, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r1v48, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            String str;
            boolean z14;
            float f14;
            ?? arrayList;
            double d14;
            Object obj2;
            List list;
            String str2;
            Iterable iterableS;
            List listN0;
            Double averageSpo2Value;
            Integer numValueOf;
            Object next;
            Object next2;
            c cVar;
            Double dValueOf;
            g.a aVar;
            Iterator it;
            Object next3;
            String str3;
            String str4;
            String str5;
            String strC;
            String string;
            double dDoubleValue;
            String strValueOf;
            m3 m3Var;
            DateTime dateTime;
            DateTime dateTime2;
            h0.e.a aVar2;
            ArrayList<y> arrayListI;
            List<List<Long>> listK;
            List list2;
            ArrayList arrayList2;
            gs1.g autoDetectedEventDTO;
            List<gs1.f> listB;
            double d15;
            DateTime dateTime3;
            gs1.a activitiesForDayDTO;
            List<gs1.b> listB2;
            List<List<Double>> listJ;
            double dDoubleValue2;
            Double dValueOf2;
            double d16;
            gs1.g autoDetectedEventDTO2;
            List<gs1.f> listB3;
            DateTime dateTime4;
            gs1.a activitiesForDayDTO2;
            List<gs1.b> listB4;
            DateTime dateTime5;
            gs1.o sleepTimesDTO;
            DateTime dateTimeD;
            gs1.o sleepTimesDTO2;
            DateTime dateTimeF;
            gs1.o sleepTimesDTO3;
            DateTime dateTimeG;
            gs1.o sleepTimesDTO4;
            DateTime dateTimeH;
            q spo2DailyAcclimationDTO;
            q spo2DailyAcclimationDTO2;
            o82.a aVar3 = (o82.a) this.f205180b;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205179a;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                e eVar = bVar.f205173e;
                DateTime dateTimeK = h.k(aVar3.f130843a);
                this.f205180b = aVar3;
                this.f205179a = 1;
                objA = eVar.a(dateTimeK, this);
                if (objA == aVar4) {
                    return aVar4;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objA = obj;
            }
            v2 v2Var = (v2) objA;
            xl.d dVar = xl.d.f191303a;
            v2.b bVar2 = v2Var instanceof v2.b ? (v2.b) v2Var : null;
            t tVar = bVar2 != null ? (t) bVar2.f47386a : null;
            Context contextD = bVar.f205172d.d();
            il.b bVar3 = bVar.f205171c;
            boolean zY = bVar.f205169a.y();
            dVar.getClass();
            aVar3.getClass();
            bVar3.getClass();
            b63.o oVar = aVar3.f130843a;
            DateTime dateTimeAtStartOfDay = g22.l.h(oVar).toDateTimeAtStartOfDay();
            q.b payload = (tVar == null || (spo2DailyAcclimationDTO2 = tVar.getSpo2DailyAcclimationDTO()) == null) ? null : spo2DailyAcclimationDTO2.getPayload();
            String string2 = ((payload != null ? payload.getCalendarDate() : null) == null || !k.k(new DateTime(payload.getCalendarDate())) || payload.getLatestSpo2ValueReadingTimeGmt() == null) ? null : contextD.getString(R.string.pulse_ox_acclimation_last_read_lbl, bVar3.b(contextD, payload.getLatestSpo2ValueReadingTimeGmt()));
            dateTimeAtStartOfDay.getClass();
            q.b payload2 = (tVar == null || (spo2DailyAcclimationDTO = tVar.getSpo2DailyAcclimationDTO()) == null) ? null : spo2DailyAcclimationDTO.getPayload();
            String string3 = contextD.getString(R.string.no_value);
            string3.getClass();
            DateTime dateTimeWithZone = (tVar == null || (sleepTimesDTO4 = tVar.getSleepTimesDTO()) == null || (dateTimeH = sleepTimesDTO4.h()) == null) ? null : dateTimeH.withZone(DateTimeZone.getDefault());
            DateTime dateTimeWithZone2 = (tVar == null || (sleepTimesDTO3 = tVar.getSleepTimesDTO()) == null || (dateTimeG = sleepTimesDTO3.g()) == null) ? null : dateTimeG.withZone(DateTimeZone.getDefault());
            DateTime dateTimeWithZone3 = (tVar == null || (sleepTimesDTO2 = tVar.getSleepTimesDTO()) == null || (dateTimeF = sleepTimesDTO2.f()) == null) ? null : dateTimeF.withZone(DateTimeZone.getDefault());
            DateTime dateTimeWithZone4 = (tVar == null || (sleepTimesDTO = tVar.getSleepTimesDTO()) == null || (dateTimeD = sleepTimesDTO.d()) == null) ? null : dateTimeD.withZone(DateTimeZone.getDefault());
            Integer numValueOf2 = (dateTimeWithZone == null || !k.f(dateTimeWithZone, dateTimeAtStartOfDay)) ? null : Integer.valueOf(dateTimeWithZone.getMinuteOfDay());
            Integer numValueOf3 = (dateTimeWithZone2 == null || !k.f(dateTimeWithZone2, dateTimeAtStartOfDay)) ? null : Integer.valueOf(dateTimeWithZone2.getMinuteOfDay());
            Integer numValueOf4 = (dateTimeWithZone3 == null || !k.f(dateTimeWithZone3, dateTimeAtStartOfDay)) ? null : Integer.valueOf(dateTimeWithZone3.getMinuteOfDay());
            Integer numValueOf5 = (dateTimeWithZone4 == null || !k.f(dateTimeWithZone4, dateTimeAtStartOfDay)) ? null : Integer.valueOf(dateTimeWithZone4.getMinuteOfDay());
            q13.c cVar2 = new q13.c();
            LayerDrawable layerDrawableA = ql1.d.a(R.drawable.sleep, contextD);
            LayerDrawable layerDrawableA2 = ql1.d.a(R.drawable.alarms, contextD);
            t tVar2 = tVar;
            Bitmap bitmapB = layerDrawableA != null ? d7.b.b(layerDrawableA, 0, 0, 7) : null;
            Bitmap bitmapB2 = layerDrawableA2 != null ? d7.b.b(layerDrawableA2, 0, 0, 7) : null;
            if (bitmapB != null) {
                if (numValueOf2 != null) {
                }
                if (numValueOf4 != null) {
                }
            }
            if (bitmapB2 != null) {
                if (numValueOf3 != null) {
                }
                if (numValueOf5 != null) {
                }
            }
            if (tVar2 != null && (activitiesForDayDTO2 = tVar2.getActivitiesForDayDTO()) != null && (listB4 = activitiesForDayDTO2.b()) != null) {
                for (gs1.b bVar4 : listB4) {
                    LocalDateTime localDateTimeZ = bVar4.Z();
                    Integer numValueOf6 = (localDateTimeZ == null || (dateTime5 = localDateTimeZ.toDateTime()) == null) ? null : Integer.valueOf(dateTime5.getMinuteOfDay());
                    x0 x0VarA = fs1.b.a(bVar4);
                    if (numValueOf6 != null && x0VarA != null) {
                        LayerDrawable layerDrawableA3 = zx0.g.a(0, x0VarA, contextD);
                        layerDrawableA3.getClass();
                        cVar2.put(numValueOf6, d7.b.b(layerDrawableA3, 0, 0, 7));
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            if (tVar2 != null && (autoDetectedEventDTO2 = tVar2.getAutoDetectedEventDTO()) != null && (listB3 = autoDetectedEventDTO2.b()) != null) {
                for (gs1.f fVar : listB3) {
                    LocalDateTime localDateTimeK = fVar.k();
                    Integer numValueOf7 = (localDateTimeK == null || (dateTime4 = localDateTimeK.toDateTime()) == null) ? null : Integer.valueOf(dateTime4.getMinuteOfDay());
                    x0 x0VarB = fs1.b.b(fVar);
                    if (numValueOf7 != null && x0VarB != null) {
                        LayerDrawable layerDrawableA4 = zx0.g.a(1, x0VarB, contextD);
                        layerDrawableA4.getClass();
                        cVar2.put(numValueOf7, d7.b.b(layerDrawableA4, 0, 0, 7));
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
            i53.d dVarG = i53.a.g(cVar2.b());
            LocalDateTime localDateTime = dateTimeAtStartOfDay.toLocalDateTime();
            localDateTime.getClass();
            u uVarU = k.u(localDateTime);
            LocalDateTime localDateTime2 = dateTimeAtStartOfDay.plusDays(1).toLocalDateTime();
            localDateTime2.getClass();
            u uVarU2 = k.u(localDateTime2);
            z.INSTANCE.getClass();
            z zVarA = z.Companion.a();
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                java.time.LocalDateTime localDateTime3 = uVarU.f16216a;
                int iCompareTo = b63.b.c(uVarU, zVarA).compareTo(b63.b.c(uVarU2, zVarA));
                str = StringUtils.SPACE;
                if (iCompareTo > 0) {
                    break;
                }
                int minute = localDateTime3.getMinute() + (localDateTime3.getHour() * 60);
                if (minute % PsExtractor.VIDEO_STREAM_MASK == 0) {
                    str = DateTimeFormatter.ofPattern(DateFormat.is24HourFormat(contextD) ? "HH" : "ha").format(localDateTime3);
                    str.getClass();
                } else if (minute % 60 != 0) {
                    str = "";
                }
                arrayList3.add(str);
                j jVarC = b63.b.c(uVarU, zVarA);
                e53.c.a aVar5 = e53.c.f63094b;
                uVarU = b63.b.e(jVarC.b(e53.e.e(1, e53.f.MINUTES)), zVarA);
            }
            c cVarE = i53.a.e(p13.h0.b1(arrayList3));
            double d17 = 3.2808399d;
            if (payload2 == null || (listJ = payload2.j()) == null) {
                z14 = zY;
                f14 = 2505.0f;
            } else {
                Iterator it3 = listJ.iterator();
                if (it3.hasNext()) {
                    Double d18 = (Double) p13.h0.n0((List) it3.next());
                    if (d18 != null) {
                        dDoubleValue2 = d18.doubleValue();
                        if (!zY) {
                            l3.f23124b.getClass();
                            dDoubleValue2 *= 3.2808399d;
                        }
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    double dMax = dDoubleValue2;
                    float f15 = 2505.0f;
                    while (it3.hasNext()) {
                        Double d19 = (Double) p13.h0.n0((List) it3.next());
                        if (d19 != null) {
                            double dDoubleValue3 = d19.doubleValue();
                            if (!zY) {
                                l3.f23124b.getClass();
                                dDoubleValue3 *= 3.2808399d;
                            }
                            d16 = dDoubleValue3;
                        } else {
                            d16 = 0.0d;
                        }
                        dMax = Math.max(dMax, d16);
                        zY = zY;
                        f15 = f15;
                    }
                    f14 = f15;
                    z14 = zY;
                    dValueOf2 = Double.valueOf(dMax);
                } else {
                    z14 = zY;
                    dValueOf2 = null;
                    f14 = 2505.0f;
                }
                if (dValueOf2 != null) {
                    float fDoubleValue = (float) dValueOf2.doubleValue();
                    if (fDoubleValue < f14) {
                        fDoubleValue = f14;
                    }
                    f14 = fDoubleValue;
                }
            }
            if (tVar2 == null || (activitiesForDayDTO = tVar2.getActivitiesForDayDTO()) == null || (listB2 = activitiesForDayDTO.b()) == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList();
                for (gs1.b bVar5 : listB2) {
                    LocalDateTime localDateTimeZ2 = bVar5.Z();
                    DateTime dateTime6 = localDateTimeZ2 != null ? localDateTimeZ2.toDateTime() : null;
                    LocalDateTime localDateTimeU = bVar5.u();
                    DateTime dateTime7 = localDateTimeU != null ? localDateTimeU.toDateTime() : null;
                    o13.p pVar = (dateTime6 == null || dateTime7 == null) ? null : new o13.p(dateTime6, dateTime7);
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                }
            }
            if (arrayList == 0) {
                arrayList = j0.f134944a;
            }
            Collection collection = (Collection) arrayList;
            int i15 = 10;
            if (tVar2 == null || (autoDetectedEventDTO = tVar2.getAutoDetectedEventDTO()) == null || (listB = autoDetectedEventDTO.b()) == null) {
                d14 = 3.2808399d;
                obj2 = null;
            } else {
                ArrayList arrayList4 = new ArrayList(p13.y.r(listB, 10));
                for (gs1.f fVar2 : listB) {
                    LocalDateTime localDateTimeK2 = fVar2.k();
                    if (localDateTimeK2 != null) {
                        double d24 = d17;
                        dateTime3 = localDateTimeK2.toDateTime();
                        d15 = d24;
                    } else {
                        d15 = d17;
                        dateTime3 = null;
                    }
                    LocalDateTime localDateTimeH = fVar2.h();
                    DateTime dateTime8 = localDateTimeH != null ? localDateTimeH.toDateTime() : null;
                    arrayList4.add((dateTime3 == null || dateTime8 == null) ? null : new o13.p(dateTime3, dateTime8));
                    d17 = d15;
                }
                d14 = d17;
                obj2 = arrayList4;
            }
            if (obj2 == null) {
                obj2 = j0.f134944a;
            }
            List listN1 = p13.h0.N0(p13.h0.Z(p13.h0.C0(collection, (Iterable) obj2)), new xl.b());
            if (payload2 == null || (listK = payload2.k()) == null) {
                list = listN1;
                str2 = StringUtils.SPACE;
                iterableS = null;
            } else {
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = listK.iterator();
                while (it4.hasNext()) {
                    List list3 = (List) it4.next();
                    Long l14 = (Long) p13.h0.d0(list3);
                    Long l15 = (Long) p13.h0.n0(list3);
                    Iterator it5 = it4;
                    Double dValueOf3 = l15 != null ? Double.valueOf(l15.longValue()) : null;
                    if (l14 == null || dValueOf3 == null) {
                        list2 = listN1;
                        arrayList2 = null;
                    } else {
                        float fAbs = Math.abs(Hours.hoursBetween(dateTimeAtStartOfDay, new DateTime(l14.longValue())).getHours());
                        ArrayList arrayList6 = new ArrayList(60);
                        for (int iD = 0; iD < 60; iD = e5.d(iD, iD, arrayList6, 1)) {
                        }
                        arrayList2 = new ArrayList(p13.y.r(arrayList6, i15));
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            List list4 = listN1;
                            Double d25 = dValueOf3;
                            h0.e.a aVar6 = new h0.e.a((60 * fAbs) + ((Number) it6.next()).intValue(), (float) d25.doubleValue());
                            rl.a.C2902a c2902a = rl.a.f153389c;
                            double dDoubleValue4 = d25.doubleValue();
                            c2902a.getClass();
                            arrayList2.add(new h0.e.c(aVar6, f0.b(a7.b.getColor(contextD, rl.a.C2902a.a(dDoubleValue4).f153397b)), null, 4, null));
                            dValueOf3 = d25;
                            listN1 = list4;
                            fAbs = fAbs;
                        }
                        list2 = listN1;
                    }
                    if (arrayList2 != null) {
                        arrayList5.add(arrayList2);
                    }
                    str = str;
                    it4 = it5;
                    listN1 = list2;
                    i15 = 10;
                }
                list = listN1;
                str2 = str;
                iterableS = p13.y.s(arrayList5);
            }
            if (iterableS == null) {
                iterableS = j0.f134944a;
            }
            c cVarE2 = i53.a.e(iterableS);
            if (payload2 == null || (arrayListI = payload2.i()) == null) {
                listN0 = null;
            } else {
                ArrayList arrayList7 = new ArrayList(p13.y.r(arrayListI, 10));
                for (y yVar : arrayListI) {
                    long j8 = yVar.f78892a;
                    double d26 = yVar.f78893b;
                    float minuteOfDay = new DateTime(j8).getMinuteOfDay();
                    if (!z14) {
                        l3.f23124b.getClass();
                        d26 *= d14;
                    }
                    arrayList7.add(new h0.e.a(minuteOfDay, (float) d26));
                }
                listN0 = p13.h0.N0(arrayList7, new xl.c());
            }
            if (listN0 == null) {
                listN0 = j0.f134944a;
            }
            c cVarE3 = i53.a.e(listN0);
            ArrayList arrayList8 = new ArrayList(DateTimeConstants.MINUTES_PER_DAY);
            for (int iD2 = 0; iD2 < 1440; iD2 = e5.d(iD2, iD2, arrayList8, 1)) {
            }
            int iA = t0.a(p13.y.r(arrayList8, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                Object next4 = it7.next();
                int iIntValue = ((Number) next4).intValue();
                int i16 = iIntValue / 60;
                Iterator it8 = cVarE2.iterator();
                do {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                } while (((int) ((h0.e.c) next).f117350a.f117346a) != iIntValue);
                h0.e.c cVar3 = (h0.e.c) next;
                Double dValueOf4 = (cVar3 == null || (aVar2 = cVar3.f117350a) == null) ? null : Double.valueOf(aVar2.f117347b);
                Iterator it9 = cVarE3.iterator();
                if (it9.hasNext()) {
                    next2 = it9.next();
                    if (it9.hasNext()) {
                        int iAbs = Math.abs(((int) ((h0.e.a) next2).f117346a) - iIntValue);
                        while (true) {
                            Object next5 = it9.next();
                            cVar = cVarE3;
                            int iAbs2 = Math.abs(((int) ((h0.e.a) next5).f117346a) - iIntValue);
                            if (iAbs > iAbs2) {
                                iAbs = iAbs2;
                                next2 = next5;
                            }
                            if (!it9.hasNext()) {
                                break;
                            }
                            cVarE3 = cVar;
                        }
                    } else {
                        cVar = cVarE3;
                    }
                } else {
                    cVar = cVarE3;
                    next2 = null;
                }
                h0.e.a aVar7 = (h0.e.a) next2;
                if (aVar7 == null) {
                    dValueOf = null;
                } else {
                    h0.e.a aVar8 = (h0.e.a) p13.h0.d0(cVar);
                    int i17 = aVar8 != null ? (int) aVar8.f117346a : 0;
                    h0.e.a aVar9 = (h0.e.a) p13.h0.n0(cVar);
                    if (iIntValue > (aVar9 != null ? (int) aVar9.f117346a : 0) || i17 > iIntValue) {
                        aVar7 = null;
                    }
                    if (aVar7 != null) {
                        dValueOf = Double.valueOf(aVar7.f117347b);
                    } else {
                        dValueOf = null;
                    }
                }
                if (dValueOf4 != null) {
                    double dDoubleValue5 = dValueOf4.doubleValue();
                    rl.a.f153389c.getClass();
                    aVar = new g.a(f0.b(a7.b.getColor(contextD, rl.a.C2902a.a(dDoubleValue5).f153397b)), null);
                } else {
                    aVar = null;
                }
                String string4 = dateTimeAtStartOfDay.withTimeAtStartOfDay().plusHours(i16).toString(DateTimeFormat.shortTime());
                String string5 = dateTimeAtStartOfDay.withTimeAtStartOfDay().plusHours(i16 + 1).toString(DateTimeFormat.shortTime());
                Iterator it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        it = it7;
                        next3 = null;
                        break;
                    }
                    next3 = it10.next();
                    o13.p pVar2 = (o13.p) next3;
                    it = it7;
                    Object obj3 = pVar2.f128594a;
                    Object obj4 = pVar2.f128595b;
                    if (k.f((DateTime) obj3, dateTimeAtStartOfDay)) {
                        DateTime dateTime9 = (DateTime) obj4;
                        boolean zF = k.f(dateTime9, dateTimeAtStartOfDay);
                        Object obj5 = pVar2.f128594a;
                        if (!zF) {
                            if (iIntValue >= ((DateTime) obj5).getMinuteOfDay()) {
                                break;
                            }
                        } else {
                            int minuteOfDay2 = ((DateTime) obj5).getMinuteOfDay();
                            if (iIntValue <= dateTime9.getMinuteOfDay() && minuteOfDay2 <= iIntValue) {
                                break;
                            }
                        }
                    }
                    it7 = it;
                }
                o13.p pVar3 = (o13.p) next3;
                String string6 = (pVar3 == null || (dateTime2 = (DateTime) pVar3.f128594a) == null) ? null : dateTime2.toString(DateTimeFormat.shortTime());
                String string7 = (pVar3 == null || (dateTime = (DateTime) pVar3.f128595b) == null) ? null : dateTime.toString(DateTimeFormat.shortTime());
                if (dValueOf4 != null) {
                    l3.a aVar10 = l3.f23124b;
                    str3 = str2;
                    double dDoubleValue6 = dValueOf4.doubleValue();
                    aVar10.getClass();
                    String strA0 = l3.a.A0(contextD, dDoubleValue6, 0);
                    if (strA0 != null) {
                        str4 = strA0;
                    }
                    String string8 = contextD.getString(R.string.string_short_dash_line_string_pattern, string4, string5);
                    string8.getClass();
                    if (dValueOf != 0) {
                        dDoubleValue = dValueOf.doubleValue();
                        xl.d.f191303a.getClass();
                        l3.f23124b.getClass();
                        strValueOf = l3.f23131i.format(dDoubleValue);
                        if (strValueOf == null) {
                            strValueOf = String.valueOf(dDoubleValue);
                        }
                        if (z14) {
                            m3Var = m3.METER;
                        } else {
                            m3Var = m3.FOOT;
                        }
                        String string9 = contextD.getString(m3Var.f23164e);
                        str5 = str3;
                        strC = zl.a.c(string9, strValueOf, str5, string9);
                    } else {
                        str5 = str3;
                        strC = null;
                    }
                    if (pVar3 != null) {
                        string = contextD.getString(R.string.string_short_dash_line_string_pattern, string6, string7);
                    } else {
                        string = null;
                    }
                    linkedHashMap.put(next4, new yl.b(str4, aVar, string8, strC, string));
                    str2 = str5;
                    cVarE3 = cVar;
                    it7 = it;
                } else {
                    str3 = str2;
                }
                str4 = string3;
                String string10 = contextD.getString(R.string.string_short_dash_line_string_pattern, string4, string5);
                string10.getClass();
                if (dValueOf != 0) {
                    dDoubleValue = dValueOf.doubleValue();
                    xl.d.f191303a.getClass();
                    l3.f23124b.getClass();
                    strValueOf = l3.f23131i.format(dDoubleValue);
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(dDoubleValue);
                    }
                    if (z14) {
                        m3Var = m3.METER;
                    } else {
                        m3Var = m3.FOOT;
                    }
                    String string11 = contextD.getString(m3Var.f23164e);
                    str5 = str3;
                    strC = zl.a.c(string11, strValueOf, str5, string11);
                } else {
                    str5 = str3;
                    strC = null;
                }
                if (pVar3 != null) {
                    string = contextD.getString(R.string.string_short_dash_line_string_pattern, string6, string7);
                } else {
                    string = null;
                }
                linkedHashMap.put(next4, new yl.b(str4, aVar, string10, strC, string));
                str2 = str5;
                cVarE3 = cVar;
                it7 = it;
            }
            yl.c cVar4 = new yl.c(cVarE2, cVarE3, f14, cVarE, dVarG, i53.a.g(linkedHashMap));
            if (g22.l.a(oVar)) {
                if (payload != null) {
                    numValueOf = payload.getLatestSpo2Value();
                } else {
                    numValueOf = null;
                }
            } else if (payload == null || (averageSpo2Value = payload.getAverageSpo2Value()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf((int) averageSpo2Value.doubleValue());
            }
            return new d(numValueOf, string2, cVar4);
        }
    }

    /* JADX INFO: renamed from: zl.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lyl/f;", "<anonymous>", "(Lo82/a;)Lyl/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.acclimation.reports.presentation.viewmodel.PulseOxAcclimationViewModel$weeklyPulseOxAcclimationPageState$1", f = "PulseOxAcclimationViewModel.kt", l = {67, 77}, m = "invokeSuspend", v = 2)
    public static final class C3832b extends v13.i implements p<o82.a, t13.d<? super f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f205183b;

        public C3832b(t13.d<? super C3832b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C3832b c3832b = b.this.new C3832b(dVar);
            c3832b.f205183b = obj;
            return c3832b;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super f> dVar) {
            return ((C3832b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:143:0x0392  */
        /* JADX WARN: Code duplicated, block: B:59:0x0181  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
        
            if (r3 == r2) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x027c, code lost:
        
            if (r3 == r2) goto L96;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v26 */
        /* JADX WARN: Type inference failed for: r4v27 */
        /* JADX WARN: Type inference failed for: r4v28 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v30 */
        /* JADX WARN: Type inference failed for: r4v31 */
        /* JADX WARN: Type inference failed for: r4v32 */
        /* JADX WARN: Type inference failed for: r4v37, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r4v38, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v39, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v40, types: [java.util.ArrayList] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f14;
            Object objF0;
            Object objE2;
            float f15;
            ArrayList arrayList;
            ?? arrayList2;
            double dMax;
            Double dValueOf;
            double d14;
            Double overallSpo2Average;
            float f16;
            ?? arrayList3;
            ?? arrayList4;
            ArrayList arrayList5;
            ArrayList<gs1.h> arrayListA;
            ArrayList<gs1.h> arrayListA2;
            ArrayList<gs1.h> arrayListC;
            ArrayList arrayListA3;
            double dMax2;
            Double dValueOf2;
            double d15;
            o82.a aVar = (o82.a) this.f205183b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205182a;
            int i15 = 0;
            b bVar = b.this;
            if (i14 == 0) {
                r.b(obj);
                b63.o oVar = aVar.f130843a;
                b63.o oVar2 = aVar.f130844b;
                oVar.getClass();
                oVar2.getClass();
                f14 = 2505.0f;
                if (Math.abs(b63.p.a(oVar, oVar2)) + 1 == 7) {
                    ql.a aVar3 = bVar.f205170b;
                    fz0.c cVarA = fz0.d.a(oVar);
                    fz0.c cVarA2 = fz0.d.a(oVar2);
                    this.f205183b = aVar;
                    this.f205182a = 1;
                    objE2 = aVar3.E2(cVarA, cVarA2, this);
                } else {
                    ql.a aVar4 = bVar.f205170b;
                    fz0.c cVarA3 = fz0.d.a(oVar);
                    fz0.c cVarA4 = fz0.d.a(oVar2);
                    this.f205183b = aVar;
                    this.f205182a = 2;
                    objF0 = aVar4.F0(cVarA3, cVarA4, this);
                }
                return aVar2;
            }
            if (i14 == 1) {
                r.b(obj);
                objE2 = obj;
                f14 = 2505.0f;
                v2 v2Var = (v2) objE2;
                xl.d dVar = xl.d.f191303a;
                v2.b bVar2 = v2Var instanceof v2.b ? (v2.b) v2Var : null;
                nl.a aVar5 = bVar2 != null ? (nl.a) bVar2.f47386a : null;
                Context contextD = bVar.f205172d.d();
                boolean zY = bVar.f205169a.y();
                dVar.getClass();
                aVar.getClass();
                DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
                DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
                String string = contextD.getString(R.string.no_value);
                string.getClass();
                dateTimeAtStartOfDay2.getClass();
                String string2 = contextD.getString(R.string.string_line_string_pattern, contextD.getString(k.k(dateTimeAtStartOfDay2) ? R.string.lbl_last_7_days : R.string.lbl_7_days), contextD.getString(R.string.title_overall));
                string2.getClass();
                if (aVar5 != null && (overallSpo2Average = aVar5.getOverallSpo2Average()) != null) {
                    double dDoubleValue = overallSpo2Average.doubleValue();
                    l3.f23124b.getClass();
                    String strA0 = l3.a.A0(contextD, dDoubleValue, 0);
                    if (strA0 != null) {
                        string = strA0;
                    }
                }
                dateTimeAtStartOfDay.getClass();
                int iA = k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
                int i16 = iA + 1;
                q13.b bVarB = w.b();
                c22.j0.f23099a.getClass();
                bVarB.add(c22.j0.k(dateTimeAtStartOfDay, 'S'));
                while (i15 < iA) {
                    bVarB.add("");
                    i15++;
                }
                c22.j0.f23099a.getClass();
                bVarB.add(c22.j0.k(dateTimeAtStartOfDay2, 'S'));
                c cVarE = i53.a.e(w.a(bVarB));
                if (aVar5 != null) {
                    Iterator it = aVar5.a().iterator();
                    if (it.hasNext()) {
                        y yVar = (y) it.next();
                        if (zY) {
                            dMax = yVar.f78893b;
                        } else {
                            l3.a aVar6 = l3.f23124b;
                            double d16 = yVar.f78893b;
                            aVar6.getClass();
                            dMax = d16 * 3.2808399d;
                        }
                        while (it.hasNext()) {
                            y yVar2 = (y) it.next();
                            if (zY) {
                                d14 = yVar2.f78893b;
                            } else {
                                l3.a aVar7 = l3.f23124b;
                                double d17 = yVar2.f78893b;
                                aVar7.getClass();
                                d14 = d17 * 3.2808399d;
                            }
                            dMax = Math.max(dMax, d14);
                        }
                        dValueOf = Double.valueOf(dMax);
                    } else {
                        dValueOf = null;
                    }
                    if (dValueOf != null) {
                        float fDoubleValue = (float) dValueOf.doubleValue();
                        if (fDoubleValue < f14) {
                            fDoubleValue = f14;
                        }
                        f15 = fDoubleValue;
                    } else {
                        f15 = f14;
                    }
                } else {
                    f15 = f14;
                }
                float f17 = 3600000.0f;
                if (aVar5 != null) {
                    ArrayList<y> arrayListF = aVar5.f();
                    arrayList = new ArrayList(p13.y.r(arrayListF, 10));
                    for (y yVar3 : arrayListF) {
                        float millis = (yVar3.f78892a - dateTimeAtStartOfDay.getMillis()) / f17;
                        double d18 = yVar3.f78893b;
                        h0.e.a aVar8 = new h0.e.a(millis, (float) d18);
                        rl.a.f153389c.getClass();
                        arrayList.add(new h0.e.c(aVar8, f0.b(a7.b.getColor(contextD, rl.a.C2902a.a(d18).f153397b)), null, 4, null));
                        f17 = f17;
                    }
                } else {
                    arrayList = null;
                }
                float f18 = f17;
                Iterable iterable = arrayList;
                if (arrayList == null) {
                    iterable = j0.f134944a;
                }
                c cVarE2 = i53.a.e(iterable);
                if (aVar5 != null) {
                    ArrayList arrayListA4 = aVar5.a();
                    arrayList2 = new ArrayList(p13.y.r(arrayListA4, 10));
                    Iterator it3 = arrayListA4.iterator();
                    while (it3.hasNext()) {
                        y yVar4 = (y) it3.next();
                        long j8 = yVar4.f78892a;
                        Iterator it4 = it3;
                        DateTime dateTime = dateTimeAtStartOfDay;
                        double d19 = yVar4.f78893b;
                        float millis2 = (j8 - dateTime.getMillis()) / f18;
                        if (!zY) {
                            l3.f23124b.getClass();
                            d19 *= 3.2808399d;
                        }
                        arrayList2.add(new h0.e.a(millis2, (float) d19));
                        it3 = it4;
                        dateTimeAtStartOfDay = dateTime;
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = j0.f134944a;
                }
                yl.e eVar = new yl.e(cVarE2, i53.a.e((Iterable) arrayList2), i16 * 24.0f, f15, cVarE);
                List listD = aVar5 != null ? aVar5.d() : null;
                if (listD == null) {
                    listD = j0.f134944a;
                }
                return new f(string2, string, eVar, xl.d.a(contextD, listD, aVar5 != null ? aVar5.a() : null, zY));
            }
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objF0 = obj;
            f14 = 2505.0f;
            v2 v2Var2 = (v2) objF0;
            xl.d dVar2 = xl.d.f191303a;
            v2.b bVar3 = v2Var2 instanceof v2.b ? (v2.b) v2Var2 : null;
            pl.b bVar4 = bVar3 != null ? (pl.b) bVar3.f47386a : null;
            Context contextD2 = bVar.f205172d.d();
            boolean zY2 = bVar.f205169a.y();
            dVar2.getClass();
            aVar.getClass();
            DateTime dateTimeAtStartOfDay3 = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
            DateTime dateTimeAtStartOfDay4 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
            String string3 = contextD2.getString(R.string.no_value);
            string3.getClass();
            dateTimeAtStartOfDay4.getClass();
            String string4 = contextD2.getString(R.string.string_line_string_pattern, contextD2.getString(k.k(dateTimeAtStartOfDay4) ? R.string.lbl_last_4_weeks : R.string.lbl_4_weeks), contextD2.getString(R.string.title_overall));
            string4.getClass();
            if (bVar4 != null && bVar4.getOverallSpo2Average() != null) {
                l3.a aVar9 = l3.f23124b;
                double dDoubleValue2 = bVar4.getOverallSpo2Average().doubleValue();
                aVar9.getClass();
                String strA1 = l3.a.A0(contextD2, dDoubleValue2, 0);
                if (strA1 != null) {
                    string3 = strA1;
                }
            }
            dateTimeAtStartOfDay3.getClass();
            int iA2 = k.a(dateTimeAtStartOfDay3, dateTimeAtStartOfDay4);
            int i17 = iA2 + 1;
            q13.b bVarB2 = w.b();
            c22.j0.f23099a.getClass();
            bVarB2.add(c22.j0.k(dateTimeAtStartOfDay3, 'S'));
            int i18 = iA2 - 1;
            while (i15 < i18) {
                bVarB2.add("");
                i15++;
            }
            c22.j0.f23099a.getClass();
            bVarB2.add(c22.j0.k(dateTimeAtStartOfDay4, 'S'));
            c cVarE3 = i53.a.e(w.a(bVarB2));
            if (bVar4 == null || (arrayListA3 = bVar4.a()) == null) {
                f16 = f14;
            } else {
                Iterator it5 = arrayListA3.iterator();
                if (it5.hasNext()) {
                    gs1.h hVar = (gs1.h) it5.next();
                    if (zY2) {
                        dMax2 = hVar.f78765b;
                    } else {
                        l3.a aVar10 = l3.f23124b;
                        double d24 = hVar.f78765b;
                        aVar10.getClass();
                        dMax2 = d24 * 3.2808399d;
                    }
                    while (it5.hasNext()) {
                        gs1.h hVar2 = (gs1.h) it5.next();
                        if (zY2) {
                            d15 = hVar2.f78765b;
                        } else {
                            l3.a aVar11 = l3.f23124b;
                            double d25 = hVar2.f78765b;
                            aVar11.getClass();
                            d15 = d25 * 3.2808399d;
                        }
                        dMax2 = Math.max(dMax2, d15);
                    }
                    dValueOf2 = Double.valueOf(dMax2);
                } else {
                    dValueOf2 = null;
                }
                if (dValueOf2 != null) {
                    float fDoubleValue2 = (float) dValueOf2.doubleValue();
                    if (fDoubleValue2 < f14) {
                        fDoubleValue2 = f14;
                    }
                    f16 = fDoubleValue2;
                } else {
                    f16 = f14;
                }
            }
            if (bVar4 == null || (arrayListC = bVar4.c()) == null) {
                arrayList3 = 0;
            } else {
                arrayList3 = new ArrayList(p13.y.r(arrayListC, 10));
                for (gs1.h hVar3 : arrayListC) {
                    float fA = k.a(dateTimeAtStartOfDay3, hVar3.a());
                    double d26 = hVar3.f78765b;
                    h0.e.a aVar12 = new h0.e.a(fA, (float) d26);
                    rl.a.f153389c.getClass();
                    arrayList3.add(new h0.e.c(aVar12, f0.b(a7.b.getColor(contextD2, rl.a.C2902a.a(d26).f153397b)), null, 4, null));
                }
            }
            if (arrayList3 == 0) {
                arrayList3 = j0.f134944a;
            }
            c cVarE4 = i53.a.e((Iterable) arrayList3);
            if (bVar4 == null || (arrayListA2 = bVar4.a()) == null) {
                arrayList4 = 0;
            } else {
                arrayList4 = new ArrayList(p13.y.r(arrayListA2, 10));
                for (gs1.h hVar4 : arrayListA2) {
                    DateTime dateTimeA = hVar4.a();
                    double d27 = hVar4.f78765b;
                    float fA2 = k.a(dateTimeAtStartOfDay3, dateTimeA);
                    if (!zY2) {
                        l3.f23124b.getClass();
                        d27 *= 3.2808399d;
                    }
                    arrayList4.add(new h0.e.a(fA2, (float) d27));
                }
            }
            if (arrayList4 == 0) {
                arrayList4 = j0.f134944a;
            }
            yl.e eVar2 = new yl.e(cVarE4, i53.a.e((Iterable) arrayList4), i17, f16, cVarE3);
            List listC = bVar4 != null ? bVar4.c() : null;
            if (listC == null) {
                listC = j0.f134944a;
            }
            if (bVar4 == null || (arrayListA = bVar4.a()) == null) {
                arrayList5 = null;
            } else {
                arrayList5 = new ArrayList(p13.y.r(arrayListA, 10));
                for (gs1.h hVar5 : arrayListA) {
                    arrayList5.add(new y(hVar5.a().getMillis(), hVar5.f78765b));
                }
            }
            return new f(string4, string3, eVar2, xl.d.a(contextD2, listC, arrayList5, zY2));
        }
    }

    public b(l lVar, ql.a aVar, il.b bVar, o oVar, e eVar, Bundle bundle) {
        lVar.getClass();
        aVar.getClass();
        bVar.getClass();
        oVar.getClass();
        eVar.getClass();
        this.f205169a = lVar;
        this.f205170b = aVar;
        this.f205171c = bVar;
        this.f205172d = oVar;
        this.f205173e = eVar;
        Serializable serializable = bundle != null ? bundle.getSerializable("extra.date.time") : null;
        DateTime dateTime = serializable instanceof DateTime ? (DateTime) serializable : null;
        p2 p2VarA = q2.a(dateTime != null ? Long.valueOf(dateTime.getMillis()) : null);
        this.f205174f = p2VarA;
        this.f205175g = s.d(p2VarA);
        this.f205176h = new i(v1.a(this), null, 2, null);
        this.f205177i = new u82.a<>(v1.a(this), new y82.e(new y82.c(new a(null)), null, 2, null), false, 4, null);
        this.f205178j = new u82.a<>(v1.a(this), new y82.e(new y82.c(new C3832b(null)), null, 2, null), false, 4, null);
    }

    public /* synthetic */ b(l lVar, ql.a aVar, il.b bVar, o oVar, e eVar, Bundle bundle, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, aVar, bVar, oVar, eVar, (i14 & 32) != 0 ? null : bundle);
    }
}
