package y31;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.f0;
import com.garmin.android.apps.connectmobile.R;
import f5.p;
import g6.f;
import g6.o;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import m92.c0;
import m92.h0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import v.h;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f194368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f194369b;

    static {
        f.a aVar = f.f75994b;
        f194368a = 315;
        f194369b = 2;
    }

    public static final void a(long j8, String str, String str2, String str3, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str3, mVar, -637522472);
        c<?> cVar = o0VarK.f135177b;
        int i15 = i14 | (o0VarK.l(j8) ? 4 : 2) | (o0VarK.B(str) ? 32 : 16) | (o0VarK.B(str2) ? 256 : 128) | (o0VarK.B(str3) ? 2048 : 1024);
        if (o0VarK.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            d.f81522a.getClass();
            g.b bVar = d.a.f81533k;
            s2 s2VarA = q2.a(c0343j, bVar, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = k.c(aVar, o0VarK);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarK, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            u2 u2Var = u2.f22900a;
            o0VarK.C(-861137242);
            o0VarK.g0(false);
            z zVarA = y.a(j.f22694d, d.a.f81536n, o0VarK, 0);
            int iHashCode2 = Long.hashCode(o0VarK.U);
            i2 i2VarA1 = o0VarK.a0();
            r rVarC2 = k.c(aVar, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, zVarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarK, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarK);
            b0 b0Var = b0.f22601a;
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarK, 0);
            int iHashCode3 = Long.hashCode(o0VarK.U);
            i2 i2VarA2 = o0VarK.a0();
            r rVarC3 = k.c(aVar, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA2, o0VarK);
            b4.c(c1623g, i2VarA2, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0VarK, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarK);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarK);
            u2Var.getClass();
            p pVar = f5.b.f68892a;
            mh.c(str, u2Var.d(aVar, pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarK, (i15 >> 3) & 14, 0, 131068);
            o0 o0Var2 = o0VarK;
            if (str2 != null) {
                o0Var2.C(-626347510);
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97935l, o0Var2);
                d92.b.f58625c.getClass();
                mh.c(str2, u2Var.d(l.C(aVar, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), pVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var2, (i15 >> 6) & 14, 0, 131068);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            } else {
                o0Var2.C(-626050964);
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
            fVar2.getClass();
            o0 o0Var3 = o0Var2;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0Var2), o0Var3, (i15 >> 9) & 14, 0, 131070);
            o0Var = o0Var3;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.d(j8, str, str2, str3, i14, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Integer num, z31.a aVar, m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        o0 o0Var2;
        int i15;
        List<i41.c> list = aVar.f202138g;
        o0 o0VarE = mVar.E(-665053750);
        int i16 = (o0VarE.B(num) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar2 = r.S;
            r rVarH = x2.h(x2.f(aVar2, 1.0f), f194368a);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            r rVarY = l.y(rVarH, f14);
            d.f81522a.getClass();
            g.a aVar3 = d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (num == null || list == null || list.isEmpty()) {
                o0VarE.C(1283935559);
                bVar.getClass();
                l.f(x2.h(aVar2, f15), o0VarE);
                String strQ = gl1.y.Q(o0VarE, R.string.ohrv_no_nightly_status);
                bVar.getClass();
                r rVarA = l.A(aVar2, f15, 0.0f, 2);
                d6.h.f57752b.getClass();
                int i17 = d6.h.f57755e;
                d6.h hVarA = d6.h.a(i17);
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 130044);
                f.a aVar5 = f.f75994b;
                l.f(x2.h(aVar2, 12), o0VarE);
                String strQ2 = gl1.y.Q(o0VarE, R.string.ohrv_no_nightly_status_desc_wear_device);
                bVar.getClass();
                r rVarA2 = l.A(aVar2, f15, 0.0f, 2);
                d6.h hVarA2 = d6.h.a(i17);
                fVar.getClass();
                mh.c(strQ2, rVarA2, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(j92.f.f97935l), o0VarE), o0VarE, 0, 0, 130044);
                o0 o0Var3 = o0VarE;
                o0Var3.g0(false);
                z14 = true;
                o0Var2 = o0Var3;
            } else {
                o0VarE.C(1277862783);
                LocalDateTime localDateTime = aVar.f202136e;
                LocalDateTime localDateTime2 = aVar.f202137f;
                int minutes = Minutes.minutesBetween(localDateTime, localDateTime2).getMinutes() / 5;
                ArrayList arrayList = new ArrayList(minutes);
                for (int i18 = 0; i18 < minutes; i18++) {
                    arrayList.add("");
                }
                if (minutes > 0) {
                    String string = localDateTime.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                    string.getClass();
                    DateTime dateTimeA = t31.b.a(string);
                    arrayList.set(0, String.valueOf(dateTimeA != null ? t31.b.b(dateTimeA) : null));
                    LocalDateTime localDateTimePlusMinutes = localDateTime.plusMinutes(5);
                    localDateTimePlusMinutes.getClass();
                    int i19 = 1;
                    while (true) {
                        if ((!localDateTimePlusMinutes.isBefore(localDateTime2) && !localDateTimePlusMinutes.isEqual(localDateTime2)) || i19 >= minutes) {
                            break;
                        }
                        int i24 = 60 - new LocalDateTime(localDateTimePlusMinutes).minuteOfHour().get();
                        int i25 = i24 / 5;
                        if (i24 % 5 != 0) {
                            i25++;
                        }
                        i19 += i25;
                        if (i19 < minutes) {
                            arrayList.set(i19, StringUtils.SPACE);
                        }
                        localDateTimePlusMinutes = localDateTimePlusMinutes.plusMinutes(i25 * 5);
                        localDateTimePlusMinutes.getClass();
                    }
                    int size = arrayList.size() - 1;
                    String string2 = localDateTime2.toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                    string2.getClass();
                    DateTime dateTimeA2 = t31.b.a(string2);
                    arrayList.set(size, String.valueOf(dateTimeA2 != null ? t31.b.b(dateTimeA2) : null));
                }
                long jA = n5.a.a(o0VarE, R.color.gcm_chart_hrv_status_data_set);
                ArrayList arrayList2 = new ArrayList();
                int i26 = 0;
                for (i41.c cVar : list) {
                    if (cVar.getHrvValue() > 0) {
                        arrayList2.add(new h0.e.a(i26, cVar.getHrvValue()));
                    }
                    i26++;
                }
                context.getClass();
                LayerDrawable layerDrawableA = ql1.d.a(R.drawable.sleep, context);
                LayerDrawable layerDrawableA2 = ql1.d.a(R.drawable.alarms, context);
                r rVarD = x2.d(r.S, 1.0f);
                String strQ3 = gl1.y.Q(o0VarE, R.string.nightly_timeline);
                m92.m.d dVar = new m92.m.d(jA, null);
                i53.f fVarJ = i53.a.j(arrayList2);
                String strP = gl1.y.P(R.string.common_no_certain_data, new Object[]{gl1.y.Q(o0VarE, R.string.ohrv_status)}, o0VarE);
                n92.j jVar = new n92.j(new d02.c(), Float.valueOf(aVar.f202135d), Float.valueOf(aVar.f202134c), 4);
                y3 y3Var = t1.f91493k;
                q.b bVar3 = (q.b) o0VarE.A(y3Var);
                y3 y3Var2 = t1.f91490h;
                g6.d dVar2 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
                y3 y3Var3 = t1.f91496n;
                s0 s0Var = new s0(bVar3, dVar2, (o) o0VarE.A(y3Var3), 0, 8, null);
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97935l;
                n92.g gVar = new n92.g(sn.a.c(o0VarE), s0Var, d92.c.f(x0Var, o0VarE), null, 8, null);
                q13.c cVar2 = new q13.c();
                if (layerDrawableA != null) {
                    i15 = 0;
                } else {
                    i15 = 0;
                }
                if (layerDrawableA2 != null) {
                    cVar2.put(Integer.valueOf(arrayList.size() - 1), new o4.f(d7.b.b(layerDrawableA2, i15, i15, 7)));
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
                n92.k.a aVar6 = new n92.k.a(cVar2.b());
                s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
                fVar2.getClass();
                z14 = true;
                c0.a(rVarD, strQ3, f194369b, dVar, false, 0.0f, null, fVarJ, null, null, true, strP, new n92.a(jVar, null, gVar, new n92.b(arrayList, aVar6, null, false, 0, null, s0Var2, d92.c.f(x0Var, o0VarE), 60, null), 2, null), z3.f.c(-1980008138, new d70.n(jA, 4), o0VarE), z3.f.c(-1565988771, new f0(aVar, jA, 2), o0VarE), o0VarE, 390, 1769478, 11120);
                o0 o0Var4 = o0VarE;
                o0Var4.g0(i15);
                o0Var2 = o0Var4;
            }
            o0Var2.g0(z14);
            x1 x1Var2 = n.f135158a;
            o0Var = o0Var2;
        } else {
            o0 o0Var5 = o0VarE;
            o0Var5.e();
            o0Var = o0Var5;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(num, aVar, i14, 14);
        }
    }
}
