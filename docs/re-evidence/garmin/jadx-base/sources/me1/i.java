package me1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import g02.m0;
import g6.o;
import h4.r;
import h5.e0;
import ho.x;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import l30.y0;
import m92.c0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.t0;
import p13.u0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.s0;
import s5.x0;
import w2.a0;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:108:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d1 A[LOOP:1: B:119:0x02cb->B:121:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0324  */
    /* JADX WARN: Code duplicated, block: B:130:0x033a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0349  */
    /* JADX WARN: Code duplicated, block: B:136:0x035b  */
    /* JADX WARN: Code duplicated, block: B:137:0x035d  */
    /* JADX WARN: Code duplicated, block: B:140:0x036b A[LOOP:8: B:138:0x0365->B:140:0x036b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x037e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0385  */
    /* JADX WARN: Code duplicated, block: B:148:0x039a  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c5 A[LOOP:7: B:155:0x03bf->B:157:0x03c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03df  */
    /* JADX WARN: Code duplicated, block: B:166:0x0432  */
    /* JADX WARN: Code duplicated, block: B:170:0x0451  */
    /* JADX WARN: Code duplicated, block: B:172:0x045b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0464  */
    /* JADX WARN: Code duplicated, block: B:175:0x046c  */
    /* JADX WARN: Code duplicated, block: B:176:0x046f  */
    /* JADX WARN: Code duplicated, block: B:183:0x048e  */
    /* JADX WARN: Code duplicated, block: B:186:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:189:0x04af  */
    /* JADX WARN: Code duplicated, block: B:213:0x0516 A[LOOP:6: B:211:0x0510->B:213:0x0516, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0394 A[SYNTHETIC] */
    public static final void a(be1.a aVar, r rVar, p3.m mVar, int i14) {
        r rVar2;
        LocalDate localDateW;
        DateTime dateTimeQ;
        DateTime dateTimeQ2;
        DateTime dateTimeQ3;
        DateTime dateTimeQ4;
        DateTime dateTimeQ5;
        DateTime dateTimeQ6;
        DateTime dateTimeQ7;
        hz.f fVar;
        i53.f fVarB;
        hz.d dVar;
        DateTime dateTime;
        int iA;
        jz.a aVar2;
        long jN;
        LayerDrawable layerDrawableA;
        m92.m.d dVar2;
        ArrayList<hz.d> arrayList;
        ArrayList arrayList2;
        String strQ;
        m92.m.d dVar3;
        Float fValueOf;
        ArrayList arrayList3;
        Iterator it;
        float fMin;
        Float fValueOf2;
        float fFloatValue;
        ArrayList arrayList4;
        Iterator it3;
        float fMax;
        Float fValueOf3;
        float fFloatValue2;
        boolean zIs24HourFormat;
        ArrayList arrayList5;
        DateTime dateTimeWithTimeAtStartOfDay;
        DateTime dateTime2;
        MutableDateTime mutableDateTime;
        LinkedHashMap linkedHashMap;
        boolean z14;
        hz.f fVar2;
        LinkedHashMap linkedHashMap2;
        int i15;
        DateTime dateTime3;
        DateTime dateTime4;
        DateTime dateTime5;
        DateTime dateTime6;
        String strA;
        ArrayList<be1.d> arrayListD;
        o0 o0VarE = mVar.E(1598808025);
        int i16 = i14 | (o0VarE.r(aVar) ? 4 : 2) | 48;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            r.a aVar3 = r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g6.f.a aVar4 = g6.f.f75994b;
            final float f14 = (float) 1.5d;
            r rVarH = x2.h(x2.f(aVar3, 1.0f), 350);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarThen = c2.l.y(rVarH, j92.b.f97899b.f97920e).then(aVar3);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (aVar != null) {
                String str = aVar.f17715b;
                localDateW = str != null ? g22.k.w(str, "yyyy-MM-dd") : null;
            } else {
                localDateW = null;
            }
            if (aVar != null) {
                String str2 = aVar.f17716c;
                dateTimeQ = str2 != null ? g22.k.q(str2, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
            } else {
                dateTimeQ = null;
            }
            if (aVar != null) {
                String str3 = aVar.f17717d;
                dateTimeQ2 = str3 != null ? g22.k.q(str3, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
            } else {
                dateTimeQ2 = null;
            }
            if (aVar != null) {
                String str4 = aVar.f17719f;
                dateTimeQ3 = str4 != null ? g22.k.q(str4, "yyyy-MM-dd'T'HH:mm:ss.SSS", null) : null;
            } else {
                dateTimeQ3 = null;
            }
            hz.b bVarA = new hz.c(localDateW, dateTimeQ, dateTimeQ2, dateTimeQ3, 0, 16, null).a();
            DateTimeZone dateTimeZone = bVarA.f86381d;
            DateTime dateTimeWithTimeAtStartOfDay2 = bVarA.f86378a;
            DateTime dateTimePlusDays = bVarA.f86379b;
            if (aVar != null) {
                String str5 = aVar.f17720g;
                dateTimeQ4 = str5 != null ? g22.k.q(str5, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
            } else {
                dateTimeQ4 = null;
            }
            if (aVar != null) {
                String str6 = aVar.f17721h;
                dateTimeQ5 = str6 != null ? g22.k.q(str6, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
            } else {
                dateTimeQ5 = null;
            }
            if (aVar != null) {
                String str7 = aVar.f17724k;
                dateTimeQ6 = str7 != null ? g22.k.q(str7, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
            } else {
                dateTimeQ6 = null;
            }
            if (aVar != null) {
                String str8 = aVar.f17725l;
                dateTimeQ7 = str8 != null ? g22.k.q(str8, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
            } else {
                dateTimeQ7 = null;
            }
            hz.f fVar3 = new hz.f(dateTimeQ4, dateTimeQ5, dateTimeQ6, dateTimeQ7, bVarA.f86381d);
            if (aVar == null || (arrayListD = aVar.d()) == null) {
                fVar = fVar3;
            } else {
                if (arrayListD.isEmpty()) {
                    fVar = fVar3;
                    fVarB = j53.l.b();
                } else {
                    Iterator it4 = arrayListD.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            fVar = fVar3;
                            if (((be1.d) it4.next()).f17747b > 0.0d) {
                                ArrayList arrayList6 = new ArrayList(p13.y.r(arrayListD, 10));
                                for (be1.d dVar4 : arrayListD) {
                                    arrayList6.add(new hz.d(new DateTime(dVar4.f17746a, dateTimeZone), (float) dVar4.f17747b));
                                }
                                fVarB = i53.a.j(arrayList6);
                            } else {
                                fVar3 = fVar;
                            }
                        } else {
                            fVar = fVar3;
                            fVarB = j53.l.b();
                        }
                    }
                }
                if (fVarB == null) {
                }
                final i53.f fVar4 = fVarB;
                dVar = (hz.d) h0.d0(fVar4);
                if (dVar != null) {
                    dateTime = dVar.f86388a;
                } else {
                    dateTime = null;
                }
                iA = nz.a.a(dateTime, dateTimePlusDays, dateTimeZone, 2);
                s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
                final a10.a aVar7 = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar2 = new jz.a(a0.s(o0VarE));
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                final x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                f02.y.f67753a.getClass();
                x1 x1Var2 = p3.n.f135158a;
                gl.c.f77766a.getClass();
                jN = gl.c.a(o0VarE).n();
                context.getClass();
                layerDrawableA = ql1.d.a(R.drawable.sleep, context);
                LayerDrawable layerDrawableA2 = ql1.d.a(R.drawable.alarms, context);
                r rVarD = x2.d(r.S, 1.0f);
                dVar2 = new m92.m.d(jN, null);
                arrayList = new ArrayList();
                for (Object obj : fVar4) {
                    jz.a aVar8 = aVar2;
                    if (((hz.d) obj).f86389b > 0.0f) {
                        arrayList.add(obj);
                    }
                    aVar2 = aVar8;
                }
                jz.a aVar9 = aVar2;
                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                for (hz.d dVar5 : arrayList) {
                    arrayList2.add(new m92.h0.e.a(Minutes.minutesBetween(dateTimeWithTimeAtStartOfDay2, dVar5.f86388a).getMinutes() / 2, dVar5.f86389b));
                    aVar3 = aVar3;
                    jN = jN;
                }
                r.a aVar10 = aVar3;
                final long j8 = jN;
                i53.f fVarJ = i53.a.j(arrayList2);
                strQ = gl1.y.Q(o0VarE, R.string.lbl_no_respiration_data);
                if (dateTimeWithTimeAtStartOfDay2 != null || dateTimePlusDays == null) {
                    dVar3 = dVar2;
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(Minutes.minutesBetween(dateTimeWithTimeAtStartOfDay2, dateTimePlusDays).getMinutes() / 2);
                    dVar3 = dVar2;
                }
                d02.c cVar = new d02.c();
                arrayList3 = new ArrayList();
                for (Object obj2 : fVar4) {
                    String str9 = strQ;
                    if (((hz.d) obj2).f86389b > 0.0f) {
                        arrayList3.add(obj2);
                    }
                    strQ = str9;
                }
                String str10 = strQ;
                it = arrayList3.iterator();
                if (it.hasNext()) {
                    fMin = ((hz.d) it.next()).f86389b;
                    while (it.hasNext()) {
                        fMin = Math.min(fMin, ((hz.d) it.next()).f86389b);
                    }
                    fValueOf2 = Float.valueOf(fMin);
                } else {
                    fValueOf2 = null;
                }
                if (fValueOf2 != null) {
                    fFloatValue = fValueOf2.floatValue() - 1.0f;
                } else {
                    fFloatValue = 8.0f;
                }
                Float fValueOf4 = Float.valueOf(fFloatValue);
                arrayList4 = new ArrayList();
                for (Object obj3 : fVar4) {
                    if (((hz.d) obj3).f86389b > 0.0f) {
                        arrayList4.add(obj3);
                    }
                }
                it3 = arrayList4.iterator();
                if (it3.hasNext()) {
                    fMax = ((hz.d) it3.next()).f86389b;
                    while (it3.hasNext()) {
                        fMax = Math.max(fMax, ((hz.d) it3.next()).f86389b);
                    }
                    fValueOf3 = Float.valueOf(fMax);
                } else {
                    fValueOf3 = null;
                }
                if (fValueOf3 != null) {
                    fFloatValue2 = fValueOf3.floatValue() + 1.0f;
                } else {
                    fFloatValue2 = 24.0f;
                }
                n92.e eVar = new n92.e(cVar, fValueOf4, Float.valueOf(fFloatValue2), 0.0f, 0, 24, null);
                d92.b.f58623a.getClass();
                n92.g gVar = new n92.g(d92.b.a(o0VarE).j().c(), s0Var, x0VarF, null, 8, null);
                Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                new jz.a(new l22.a(context2));
                zIs24HourFormat = DateFormat.is24HourFormat(context2);
                arrayList5 = new ArrayList();
                if (dateTimeWithTimeAtStartOfDay2 != null || dateTimePlusDays == null) {
                    dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                    dateTimeWithTimeAtStartOfDay.getClass();
                    DateTime dateTimePlusDays2 = dateTimeWithTimeAtStartOfDay.plusDays(1);
                    dateTimePlusDays2.getClass();
                    dateTime2 = dateTimePlusDays2;
                } else {
                    dateTimeWithTimeAtStartOfDay = dateTimeWithTimeAtStartOfDay2;
                    dateTime2 = dateTimePlusDays;
                }
                mutableDateTime = dateTimeWithTimeAtStartOfDay.toMutableDateTime();
                while (mutableDateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
                    m92.m.d dVar6 = dVar3;
                    if (iA == mutableDateTime.getMinuteOfDay() % PsExtractor.VIDEO_STREAM_MASK) {
                        strA = jz.a.a(mutableDateTime.toDateTime(), zIs24HourFormat);
                    } else if (iA == mutableDateTime.getMinuteOfDay() % 60) {
                        strA = StringUtils.SPACE;
                    } else {
                        strA = "";
                    }
                    arrayList5.add(strA);
                    mutableDateTime.addMinutes(2);
                    dVar3 = dVar6;
                }
                m92.m.d dVar7 = dVar3;
                List listB1 = h0.b1(arrayList5);
                linkedHashMap = new LinkedHashMap();
                if (dateTimeWithTimeAtStartOfDay2 != null || dateTimePlusDays == null) {
                    dateTimeWithTimeAtStartOfDay2 = DateTime.now().withTimeAtStartOfDay();
                    dateTimeWithTimeAtStartOfDay2.getClass();
                    z14 = true;
                    dateTimePlusDays = dateTimeWithTimeAtStartOfDay2.plusDays(1);
                    dateTimePlusDays.getClass();
                } else {
                    z14 = true;
                }
                fVar2 = fVar;
                if (g8.i.N(fVar2, dateTimeWithTimeAtStartOfDay2, dateTimePlusDays)) {
                    i15 = 0;
                    while (dateTimeWithTimeAtStartOfDay2.compareTo((ReadableInstant) dateTimePlusDays) <= 0) {
                        DateTime dateTimePlusMinutes = dateTimeWithTimeAtStartOfDay2.plusMinutes(2);
                        dateTime3 = fVar2.f86396f;
                        if (((dateTime3 == null && g22.k.e(dateTime3, dateTimeWithTimeAtStartOfDay2, dateTimePlusMinutes)) || ((dateTime4 = fVar2.f86398h) != null && g22.k.e(dateTime4, dateTimeWithTimeAtStartOfDay2, dateTimePlusMinutes))) && layerDrawableA != null) {
                            linkedHashMap.put(Integer.valueOf(i15), layerDrawableA);
                        }
                        dateTime5 = fVar2.f86397g;
                        if (((dateTime5 == null && g22.k.e(dateTime5, dateTimeWithTimeAtStartOfDay2, dateTimePlusMinutes)) || ((dateTime6 = fVar2.f86399i) != null && g22.k.e(dateTime6, dateTimeWithTimeAtStartOfDay2, dateTimePlusMinutes))) && layerDrawableA2 != null) {
                            linkedHashMap.put(Integer.valueOf(i15), layerDrawableA2);
                        }
                        dateTimePlusMinutes.getClass();
                        i15++;
                        dateTimeWithTimeAtStartOfDay2 = dateTimePlusMinutes;
                    }
                }
                Map mapM = u0.m(linkedHashMap);
                linkedHashMap2 = new LinkedHashMap(t0.a(mapM.size()));
                for (Map.Entry entry : mapM.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), new o4.f(d7.b.b((Drawable) entry.getValue(), 0, 0, 7)));
                }
                rVar2 = aVar10;
                c0.a(rVarD, "", f14, dVar7, false, 0.0f, null, fVarJ, fValueOf, null, true, str10, new n92.a(eVar, null, gVar, new n92.b(listB1, new n92.k.a(linkedHashMap2), n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN, false, 0, null, s0Var, x0VarF, 48, null), 2, null), z3.f.c(-314772462, new p() { // from class: me1.g
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        p3.m mVar2 = (p3.m) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var3 = p3.n.f135158a;
                            if (fVar4.isEmpty()) {
                                mVar2.C(-1472448176);
                                mVar2.f();
                            } else {
                                mVar2.C(-1472750891);
                                i.c(aVar7, f14, x0VarF, j8, mVar2, 56);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), z3.f.c(-1461347253, new x(fVar4, aVar7, aVar9, j8, 2), o0VarE), o0VarE, 438, 1769478, 10864);
                o0VarE.g0(z14);
                x1 x1Var3 = p3.n.f135158a;
            }
            fVarB = j53.l.b();
            final i53.f fVar5 = fVarB;
            dVar = (hz.d) h0.d0(fVar5);
            if (dVar != null) {
                dateTime = dVar.f86388a;
            } else {
                dateTime = null;
            }
            iA = nz.a.a(dateTime, dateTimePlusDays, dateTimeZone, 2);
            s0 s0Var2 = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
            final a10.a aVar11 = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar2 = new jz.a(a0.s(o0VarE));
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            final x0 x0VarF2 = d92.c.f(j92.f.f97935l, o0VarE);
            f02.y.f67753a.getClass();
            x1 x1Var4 = p3.n.f135158a;
            gl.c.f77766a.getClass();
            jN = gl.c.a(o0VarE).n();
            context.getClass();
            layerDrawableA = ql1.d.a(R.drawable.sleep, context);
            LayerDrawable layerDrawableA3 = ql1.d.a(R.drawable.alarms, context);
            r rVarD2 = x2.d(r.S, 1.0f);
            dVar2 = new m92.m.d(jN, null);
            arrayList = new ArrayList();
            while (r19.hasNext()) {
                jz.a aVar12 = aVar2;
                if (((hz.d) obj).f86389b > 0.0f) {
                    arrayList.add(obj);
                }
                aVar2 = aVar12;
            }
            jz.a aVar13 = aVar2;
            arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            while (r7.hasNext()) {
                arrayList2.add(new m92.h0.e.a(Minutes.minutesBetween(dateTimeWithTimeAtStartOfDay2, dVar5.f86388a).getMinutes() / 2, dVar5.f86389b));
                aVar3 = aVar3;
                jN = jN;
            }
            r.a aVar14 = aVar3;
            final long j14 = jN;
            i53.f fVarJ2 = i53.a.j(arrayList2);
            strQ = gl1.y.Q(o0VarE, R.string.lbl_no_respiration_data);
            if (dateTimeWithTimeAtStartOfDay2 != null) {
                dVar3 = dVar2;
                fValueOf = null;
            } else {
                dVar3 = dVar2;
                fValueOf = null;
            }
            d02.c cVar2 = new d02.c();
            arrayList3 = new ArrayList();
            while (r5.hasNext()) {
                String str11 = strQ;
                if (((hz.d) obj2).f86389b > 0.0f) {
                    arrayList3.add(obj2);
                }
                strQ = str11;
            }
            String str12 = strQ;
            it = arrayList3.iterator();
            if (it.hasNext()) {
                fValueOf2 = null;
            } else {
                fMin = ((hz.d) it.next()).f86389b;
                while (it.hasNext()) {
                    fMin = Math.min(fMin, ((hz.d) it.next()).f86389b);
                }
                fValueOf2 = Float.valueOf(fMin);
            }
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue() - 1.0f;
            } else {
                fFloatValue = 8.0f;
            }
            Float fValueOf5 = Float.valueOf(fFloatValue);
            arrayList4 = new ArrayList();
            while (r4.hasNext()) {
                if (((hz.d) obj3).f86389b > 0.0f) {
                    arrayList4.add(obj3);
                }
            }
            it3 = arrayList4.iterator();
            if (it3.hasNext()) {
                fValueOf3 = null;
            } else {
                fMax = ((hz.d) it3.next()).f86389b;
                while (it3.hasNext()) {
                    fMax = Math.max(fMax, ((hz.d) it3.next()).f86389b);
                }
                fValueOf3 = Float.valueOf(fMax);
            }
            if (fValueOf3 != null) {
                fFloatValue2 = fValueOf3.floatValue() + 1.0f;
            } else {
                fFloatValue2 = 24.0f;
            }
            n92.e eVar2 = new n92.e(cVar2, fValueOf5, Float.valueOf(fFloatValue2), 0.0f, 0, 24, null);
            d92.b.f58623a.getClass();
            n92.g gVar2 = new n92.g(d92.b.a(o0VarE).j().c(), s0Var2, x0VarF2, null, 8, null);
            Context context3 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            new jz.a(new l22.a(context3));
            zIs24HourFormat = DateFormat.is24HourFormat(context3);
            arrayList5 = new ArrayList();
            if (dateTimeWithTimeAtStartOfDay2 != null) {
                dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                dateTimeWithTimeAtStartOfDay.getClass();
                DateTime dateTimePlusDays3 = dateTimeWithTimeAtStartOfDay.plusDays(1);
                dateTimePlusDays3.getClass();
                dateTime2 = dateTimePlusDays3;
            } else {
                dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                dateTimeWithTimeAtStartOfDay.getClass();
                DateTime dateTimePlusDays4 = dateTimeWithTimeAtStartOfDay.plusDays(1);
                dateTimePlusDays4.getClass();
                dateTime2 = dateTimePlusDays4;
            }
            mutableDateTime = dateTimeWithTimeAtStartOfDay.toMutableDateTime();
            while (mutableDateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
                m92.m.d dVar8 = dVar3;
                if (iA == mutableDateTime.getMinuteOfDay() % PsExtractor.VIDEO_STREAM_MASK) {
                    strA = jz.a.a(mutableDateTime.toDateTime(), zIs24HourFormat);
                } else if (iA == mutableDateTime.getMinuteOfDay() % 60) {
                    strA = StringUtils.SPACE;
                } else {
                    strA = "";
                }
                arrayList5.add(strA);
                mutableDateTime.addMinutes(2);
                dVar3 = dVar8;
            }
            m92.m.d dVar9 = dVar3;
            List listB2 = h0.b1(arrayList5);
            linkedHashMap = new LinkedHashMap();
            if (dateTimeWithTimeAtStartOfDay2 != null) {
                dateTimeWithTimeAtStartOfDay2 = DateTime.now().withTimeAtStartOfDay();
                dateTimeWithTimeAtStartOfDay2.getClass();
                z14 = true;
                dateTimePlusDays = dateTimeWithTimeAtStartOfDay2.plusDays(1);
                dateTimePlusDays.getClass();
            } else {
                dateTimeWithTimeAtStartOfDay2 = DateTime.now().withTimeAtStartOfDay();
                dateTimeWithTimeAtStartOfDay2.getClass();
                z14 = true;
                dateTimePlusDays = dateTimeWithTimeAtStartOfDay2.plusDays(1);
                dateTimePlusDays.getClass();
            }
            fVar2 = fVar;
            if (g8.i.N(fVar2, dateTimeWithTimeAtStartOfDay2, dateTimePlusDays)) {
                i15 = 0;
                while (dateTimeWithTimeAtStartOfDay2.compareTo((ReadableInstant) dateTimePlusDays) <= 0) {
                    DateTime dateTimePlusMinutes2 = dateTimeWithTimeAtStartOfDay2.plusMinutes(2);
                    dateTime3 = fVar2.f86396f;
                    if (dateTime3 == null) {
                        linkedHashMap.put(Integer.valueOf(i15), layerDrawableA);
                    } else {
                        linkedHashMap.put(Integer.valueOf(i15), layerDrawableA);
                    }
                    dateTime5 = fVar2.f86397g;
                    if (dateTime5 == null) {
                    }
                    dateTimePlusMinutes2.getClass();
                    i15++;
                    dateTimeWithTimeAtStartOfDay2 = dateTimePlusMinutes2;
                }
            }
            Map mapM2 = u0.m(linkedHashMap);
            linkedHashMap2 = new LinkedHashMap(t0.a(mapM2.size()));
            while (r0.hasNext()) {
                linkedHashMap2.put(entry.getKey(), new o4.f(d7.b.b((Drawable) entry.getValue(), 0, 0, 7)));
            }
            rVar2 = aVar14;
            c0.a(rVarD2, "", f14, dVar9, false, 0.0f, null, fVarJ2, fValueOf, null, true, str12, new n92.a(eVar2, null, gVar2, new n92.b(listB2, new n92.k.a(linkedHashMap2), n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN, false, 0, null, s0Var2, x0VarF2, 48, null), 2, null), z3.f.c(-314772462, new p() { // from class: me1.g
                @Override // e23.p
                public final Object invoke(Object obj4, Object obj5) {
                    p3.m mVar2 = (p3.m) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var5 = p3.n.f135158a;
                        if (fVar5.isEmpty()) {
                            mVar2.C(-1472448176);
                            mVar2.f();
                        } else {
                            mVar2.C(-1472750891);
                            i.c(aVar11, f14, x0VarF2, j14, mVar2, 56);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), z3.f.c(-1461347253, new x(fVar5, aVar11, aVar13, j14, 2), o0VarE), o0VarE, 438, 1769478, 10864);
            o0VarE.g0(z14);
            x1 x1Var5 = p3.n.f135158a;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(aVar, rVar2, i14, 21);
        }
    }

    public static final void b(hz.d dVar, a10.a aVar, jz.a aVar2, long j8, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-681108399);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            DateTime dateTime = dVar.f86388a;
            DateTime dateTimeMinusMinutes = dateTime.minusMinutes(2);
            dateTimeMinusMinutes.getClass();
            String strC = aVar2.c(dateTimeMinusMinutes, dateTime, DateFormat.is24HourFormat((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = aVar.f244c;
                o0VarE.K(objQ);
            }
            m92.y.a(strC, z3.f.c(157994912, new da0.d(j8, dVar, (String) objQ, aVar), o0VarE), o0VarE, 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.d(dVar, aVar, aVar2, j8, i14);
        }
    }

    public static final void c(final a10.a aVar, final float f14, final x0 x0Var, final long j8, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1527005492);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.B(x0Var) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.t0.a(c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1), cVar, null, null, 0, 0, z3.f.c(-1925531151, new e23.q() { // from class: me1.h
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c1) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        r.a aVar2 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        r rVarA = c2.l.A(aVar2, eVar.f97918c, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC = h4.k.c(rVarA, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar3);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        u2 u2Var = u2.f22900a;
                        r rVarR = x2.r(aVar2, eVar.f97920e, f14);
                        m1.a aVar4 = m1.f128891a;
                        c2.q.a(u1.n.e(l4.k.b(rVarR, aVar4), j8, aVar4), mVar2, 0);
                        mh.c(aVar.f242a.getString(R.string.activities_respiration_rate), c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131068);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 1572912, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(aVar, f14, x0Var, j8, i14);
        }
    }
}
