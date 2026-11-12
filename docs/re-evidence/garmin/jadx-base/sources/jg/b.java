package jg;

import a03.i;
import a03.p;
import ak0.z;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.format.DateFormat;
import android.view.View;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.w;
import c2.k3;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.k1;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.maps.android.compose.u;
import f72.v1;
import fg2.b0;
import fg2.c0;
import g22.k;
import g4.d;
import gl1.y;
import h72.a0;
import h72.v;
import i3.bi;
import i3.si;
import j23.l;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ju0.q;
import k30.t;
import k30.x;
import kotlin.t1;
import l72.c1;
import l72.r1;
import nt2.e;
import nt2.f;
import o13.g;
import o13.r;
import o4.d0;
import o4.f0;
import o4.h1;
import o4.u1;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import s1.e0;
import s1.m0;
import s1.m1;
import s1.p0;
import s1.y0;
import vb.h;
import yg2.h0;
import yg2.i0;
import yg2.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f98721a;

    public static final LocalDate A(int i14, LocalDate localDate) {
        LocalDate localDatePlusDays;
        if (i14 < 1 || i14 > 7) {
            localDatePlusDays = localDate;
        } else {
            int dayOfWeek = i14 - localDate.getDayOfWeek();
            if (dayOfWeek < 0) {
                dayOfWeek = 7 - Math.abs(dayOfWeek);
            }
            localDatePlusDays = localDate.plusDays(dayOfWeek);
            localDatePlusDays.getClass();
        }
        if (localDate.isEqual(localDatePlusDays)) {
            LocalDate localDatePlusDays2 = localDate.plusDays(6);
            localDatePlusDays2.getClass();
            return localDatePlusDays2;
        }
        LocalDate localDateMinusDays = localDatePlusDays.minusDays(1);
        localDateMinusDays.getClass();
        return localDateMinusDays;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(f fVar, v13.c cVar) {
        c0 c0Var;
        f fVar2;
        String str;
        e eVar;
        String str2;
        Object objA;
        f fVar3;
        String str3;
        e eVar2;
        String str4;
        i53.f fVarJ;
        Object objA2;
        e eVar3;
        i53.f fVar4;
        String str5;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f71424h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f71424h = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(cVar);
            }
        } else {
            c0Var = new c0(cVar);
        }
        Object objB = c0Var.f71423g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f71424h;
        if (i15 == 0) {
            r.b(objB);
            c0Var.f71417a = fVar;
            c0Var.f71424h = 1;
            objB = f.b(fVar, fVar.f127849d.f127865a, false, c0Var, 6);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            fVar = c0Var.f71417a;
            r.b(objB);
        } else {
            if (i15 == 2) {
                str = c0Var.f71418b;
                fVar2 = c0Var.f71417a;
                r.b(objB);
                eVar = (e) objB;
                str2 = fVar2.f127848c.f114891c;
                c0Var.f71417a = fVar2;
                c0Var.f71418b = null;
                c0Var.f71419c = str2;
                c0Var.f71420d = str;
                c0Var.f71421e = eVar;
                c0Var.f71424h = 3;
                objA = fVar2.a(false, c0Var);
                if (objA != aVar) {
                    fVar3 = fVar2;
                    str3 = str;
                    eVar2 = eVar;
                    objB = objA;
                    str4 = str2;
                    fVarJ = i53.a.j((Iterable) objB);
                    c0Var.f71417a = null;
                    c0Var.f71418b = null;
                    c0Var.f71419c = str4;
                    c0Var.f71420d = str3;
                    c0Var.f71421e = eVar2;
                    c0Var.f71422f = fVarJ;
                    c0Var.f71424h = 4;
                    objA2 = fVar3.a(true, c0Var);
                    if (objA2 != aVar) {
                        eVar3 = eVar2;
                        fVar4 = fVarJ;
                        objB = objA2;
                        str5 = str4;
                    }
                }
                return aVar;
            }
            if (i15 == 3) {
                eVar2 = c0Var.f71421e;
                str3 = c0Var.f71420d;
                str4 = c0Var.f71419c;
                fVar3 = c0Var.f71417a;
                r.b(objB);
                fVarJ = i53.a.j((Iterable) objB);
                c0Var.f71417a = null;
                c0Var.f71418b = null;
                c0Var.f71419c = str4;
                c0Var.f71420d = str3;
                c0Var.f71421e = eVar2;
                c0Var.f71422f = fVarJ;
                c0Var.f71424h = 4;
                objA2 = fVar3.a(true, c0Var);
                if (objA2 != aVar) {
                    eVar3 = eVar2;
                    fVar4 = fVarJ;
                    objB = objA2;
                    str5 = str4;
                }
                return aVar;
            }
            if (i15 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i53.f fVar5 = c0Var.f71422f;
            e eVar4 = c0Var.f71421e;
            str3 = c0Var.f71420d;
            String str6 = c0Var.f71419c;
            r.b(objB);
            fVar4 = fVar5;
            str5 = str6;
            eVar3 = eVar4;
        }
        return new i0(str3, eVar3, fVar4, i53.a.j((Iterable) objB), str5);
        String str7 = (String) objB;
        c0Var.f71417a = fVar;
        c0Var.f71418b = str7;
        c0Var.f71424h = 2;
        Object objC = fVar.c(c0Var);
        if (objC != aVar) {
            fVar2 = fVar;
            str = str7;
            objB = objC;
            eVar = (e) objB;
            str2 = fVar2.f127848c.f114891c;
            c0Var.f71417a = fVar2;
            c0Var.f71418b = null;
            c0Var.f71419c = str2;
            c0Var.f71420d = str;
            c0Var.f71421e = eVar;
            c0Var.f71424h = 3;
            objA = fVar2.a(false, c0Var);
            if (objA != aVar) {
                fVar3 = fVar2;
                str3 = str;
                eVar2 = eVar;
                objB = objA;
                str4 = str2;
                fVarJ = i53.a.j((Iterable) objB);
                c0Var.f71417a = null;
                c0Var.f71418b = null;
                c0Var.f71419c = str4;
                c0Var.f71420d = str3;
                c0Var.f71421e = eVar2;
                c0Var.f71422f = fVarJ;
                c0Var.f71424h = 4;
                objA2 = fVar3.a(true, c0Var);
                if (objA2 != aVar) {
                    eVar3 = eVar2;
                    fVar4 = fVarJ;
                    objB = objA2;
                    str5 = str4;
                    return new i0(str3, eVar3, fVar4, i53.a.j((Iterable) objB), str5);
                }
            }
        }
        return aVar;
    }

    public static final int C(Integer num) {
        l lVar = new l(0, 25);
        if (num != null && lVar.d(num.intValue())) {
            return R.string.stress_level_rest;
        }
        l lVar2 = new l(26, 50);
        if (num != null && lVar2.d(num.intValue())) {
            return R.string.stress_level_low;
        }
        l lVar3 = new l(51, 75);
        if (num == null || !lVar3.d(num.intValue())) {
            return (num == null || !new l(76, 100).d(num.intValue())) ? R.string.allday_stress_unmeasurable : R.string.stress_level_high;
        }
        return R.string.stress_level_medium;
    }

    public static final boolean D(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, boolean z14) {
        return (localDate.isAfter(localDate2) || k.g(localDate, localDate2)) && localDate.isBefore(localDate3);
    }

    public static final boolean E(double d14) {
        if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
            return d14 > com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER.f32927f;
        }
        return d14 > com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE.f32927f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float F(m mVar) {
        x1 x1Var = n.f135158a;
        return ((Number) p0.a(p0.c("Loading", mVar, 0), 1.0f, 0.15f, new m0(s1.l.d(1000, 0, e0.f155563d, 2), y0.Reverse, m1.a(100), (j) null), "Alpha", mVar, 29112, 0).f155651d.getF182175a()).floatValue();
    }

    public static final LocalDate G(LocalDate localDate) {
        localDate.getClass();
        LocalDate localDatePlusDays = localDate.plusDays(1);
        localDatePlusDays.getClass();
        return localDatePlusDays;
    }

    public static final JsonElement H(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (s.g(jsonElement, JsonNull.INSTANCE) || jsonElement == null) {
            return null;
        }
        return jsonElement;
    }

    public static final long I(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        g6.k.a aVar = g6.k.f76003b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat + ((int) (j14 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) + ((int) (j14 & 4294967295L)))) & 4294967295L);
        n4.c.a aVar2 = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final LocalDate J(LocalDate localDate) {
        localDate.getClass();
        LocalDate localDateMinusDays = localDate.minusDays(1);
        localDateMinusDays.getClass();
        return localDateMinusDays;
    }

    public static final int K(int i14, byte[] bArr) {
        bArr.getClass();
        return ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i14] & UnsignedBytes.MAX_VALUE);
    }

    public static final long L(int i14, byte[] bArr) {
        bArr.getClass();
        return ((((long) bArr[i14 + 3]) << 24) & 4278190080L) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) << 8) & 65280) | ((((long) bArr[i14 + 2]) << 16) & 16711680);
    }

    public static final void M(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF = fVar.f();
        if (listF == null) {
            listF = j0.f134944a;
        }
        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.c0> it = listF.iterator();
        while (it.hasNext()) {
            List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF2 = it.next().f();
            if (listF2 != null) {
                for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar : listF2) {
                    eVar.c0();
                    eVar.f41117g = cVar != null ? cVar.G(eVar.f41115e, eVar.f41116f) : null;
                }
            }
        }
    }

    public static final long N(long j8) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j8 >> 32)));
        long jRound = (((long) Math.round(Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
        g6.k.a aVar = g6.k.f76003b;
        return jRound;
    }

    public static final h4.r O(h4.r rVar, float f14, m mVar) {
        rVar.getClass();
        x1 x1Var = n.f135158a;
        float f69051c = ((g6.c) mVar.A(t1.f91490h)).getF94882b();
        if (f69051c <= 1.0f) {
            return x2.q(rVar, f14);
        }
        if (f69051c > 1.5f) {
            g6.f.a aVar = g6.f.f75994b;
            return x2.q(rVar, f14 * 1.5f);
        }
        float f15 = f14 * f69051c;
        g6.f.a aVar2 = g6.f.f75994b;
        return x2.q(rVar, f15);
    }

    public static final LocalDate P(LocalDate localDate) {
        localDate.getClass();
        return new LocalDate(localDate.getYear(), localDate.getMonthOfYear(), 1);
    }

    public static final gu0.b Q(q qVar, long j8) {
        qVar.getClass();
        return new gu0.b(j8, qVar.getLiveEventSharingEnabled(), qVar.getLiveEventSharingEndTimestamp(), qVar.getLiveTrackEnabled(), qVar.f(), qVar.e(), qVar.getLiveEventSharingTargetDistance(), qVar.getLiveEventSharingTriggerDistance(), qVar.getLiveEventSharingTriggerTime());
    }

    public static final boolean R(Throwable th3, e23.a aVar) {
        DiagnosticComposeException diagnosticComposeException;
        th3.getClass();
        List<Throwable> listB = x13.b.f188452a.b(th3);
        int size = listB.size();
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            if (listB.get(i14) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            g4.a aVar2 = (g4.a) aVar.invoke();
            if (aVar2 != null) {
                boolean z15 = aVar2.f75731b;
                List<d> list = aVar2.f75730a;
                if (z15) {
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        if (list.get(i15).f75734b != null) {
                            z14 = true;
                            break;
                        }
                    }
                } else if (!list.isEmpty()) {
                    z14 = true;
                    break;
                }
            }
            if (z14) {
                aVar2.getClass();
                diagnosticComposeException = new DiagnosticComposeException(aVar2);
            } else {
                diagnosticComposeException = null;
            }
        } catch (Throwable th4) {
            diagnosticComposeException = th4;
        }
        if (diagnosticComposeException != null) {
            g.a(th3, diagnosticComposeException);
        }
        return z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void S(d92.a aVar, d92.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        e92.f fVarK = aVar.k();
        e92.f fVarK2 = aVar2.k();
        fVarK.getClass();
        fVarK2.getClass();
        fVarK.f63524a.setValue(d0.a(fVarK2.b()));
        fVarK.f63525b.setValue(d0.a(fVarK2.d()));
        fVarK.f63526c.setValue(d0.a(fVarK2.a()));
        fVarK.f63529f.setValue(d0.a(fVarK2.e()));
        fVarK.f63530g.setValue(d0.a(((d0) fVarK2.f63530g.getF182175a()).f128833a));
        fVarK.f63531h.setValue(d0.a(fVarK2.c()));
        e92.c cVarF = aVar.f();
        e92.c cVarF2 = aVar2.f();
        cVarF.getClass();
        cVarF2.getClass();
        cVarF.f63506a.setValue(d0.a(cVarF2.b()));
        cVarF.f63507b.setValue(d0.a(cVarF2.d()));
        cVarF.f63510e.setValue(d0.a(cVarF2.a()));
        cVarF.f63511f.setValue(d0.a(cVarF2.e()));
        cVarF.f63512g.setValue(d0.a(cVarF2.f()));
        cVarF.f63513h.setValue(d0.a(cVarF2.c()));
        e92.e eVarJ = aVar.j();
        e92.e eVarJ2 = aVar2.j();
        eVarJ.getClass();
        eVarJ2.getClass();
        eVarJ.f63517a.setValue(d0.a(eVarJ2.e()));
        eVarJ.f63518b.setValue(d0.a(eVarJ2.d()));
        eVarJ.f63519c.setValue(d0.a(eVarJ2.c()));
        eVarJ.f63520d.setValue(d0.a(eVarJ2.b()));
        eVarJ.f63521e.setValue(d0.a(eVarJ2.a()));
        eVarJ.f63522f.setValue(d0.a(eVarJ2.f()));
        eVarJ.f63523g.setValue(d0.a(eVarJ2.g()));
        e92.b bVarE = aVar.e();
        e92.b bVarE2 = aVar2.e();
        bVarE.getClass();
        bVarE2.getClass();
        bVarE.f63496a.setValue(d0.a(bVarE2.e()));
        bVarE.f63497b.setValue(d0.a(bVarE2.f()));
        bVarE.f63498c.setValue(d0.a(bVarE2.g()));
        bVarE.f63501f.setValue(d0.a(((d0) bVarE2.f63501f.getF182175a()).f128833a));
        bVarE.f63502g.setValue(d0.a(bVarE2.h()));
        bVarE.f63503h.setValue(d0.a(bVarE2.c()));
        bVarE.f63504i.setValue(d0.a(bVarE2.b()));
        bVarE.f63505j.setValue(d0.a(bVarE2.d()));
        e92.a aVarC = aVar.c();
        e92.a aVarC2 = aVar2.c();
        aVarC.getClass();
        aVarC2.getClass();
        aVarC.f63488a.setValue(d0.a(aVarC2.b()));
        aVarC.f63489b.setValue(d0.a(aVarC2.c()));
        aVarC.f63490c.setValue(d0.a(aVarC2.a()));
        aVarC.f63491d.setValue(d0.a(aVarC2.e()));
        aVarC.f63492e.setValue(d0.a(aVarC2.f()));
        aVarC.f63493f.setValue(d0.a(aVarC2.g()));
        aVarC.f63494g.setValue(d0.a(((d0) aVarC2.f63494g.getF182175a()).f128833a));
        aVarC.f63495h.setValue(d0.a(aVarC2.d()));
        g92.a aVarD = aVar.d();
        g92.a aVarD2 = aVar2.d();
        aVarD.getClass();
        aVarD2.getClass();
        g92.b bVarA = aVarD.a();
        g92.b bVarA2 = aVarD2.a();
        bVarA.getClass();
        bVarA2.getClass();
        bVarA.f76479a.setValue(d0.a(bVarA2.a()));
        bVarA.f76480b.setValue(d0.a(((d0) bVarA2.f76480b.getF182175a()).f128833a));
        bVarA.f76481c.setValue(d0.a(((d0) bVarA2.f76481c.getF182175a()).f128833a));
        bVarA.f76482d.setValue(d0.a(((d0) bVarA2.f76482d.getF182175a()).f128833a));
        bVarA.f76483e.setValue(d0.a(((d0) bVarA2.f76483e.getF182175a()).f128833a));
        bVarA.f76484f.setValue(d0.a(((d0) bVarA2.f76484f.getF182175a()).f128833a));
        bVarA.f76485g.setValue(d0.a(bVarA2.b()));
        bVarA.f76486h.setValue(d0.a(((d0) bVarA2.f76486h.getF182175a()).f128833a));
        bVarA.f76487i.setValue(d0.a(((d0) bVarA2.f76487i.getF182175a()).f128833a));
        bVarA.f76488j.setValue(d0.a(((d0) bVarA2.f76488j.getF182175a()).f128833a));
        bVarA.f76489k.setValue(d0.a(((d0) bVarA2.f76489k.getF182175a()).f128833a));
        bVarA.f76490l.setValue(d0.a(bVarA2.c()));
        bVarA.f76491m.setValue(d0.a(((d0) bVarA2.f76491m.getF182175a()).f128833a));
        bVarA.f76492n.setValue(d0.a(((d0) bVarA2.f76492n.getF182175a()).f128833a));
        bVarA.f76493o.setValue(d0.a(((d0) bVarA2.f76493o.getF182175a()).f128833a));
        bVarA.f76494p.setValue(d0.a(((d0) bVarA2.f76494p.getF182175a()).f128833a));
        bVarA.f76495q.setValue(d0.a(((d0) bVarA2.f76495q.getF182175a()).f128833a));
        bVarA.f76496r.setValue(d0.a(((d0) bVarA2.f76496r.getF182175a()).f128833a));
        g92.c cVarB = aVarD.b();
        g92.c cVarB2 = aVarD2.b();
        cVarB.getClass();
        cVarB2.getClass();
        cVarB.f76497a.setValue(d0.a(((d0) cVarB2.f76497a.getF182175a()).f128833a));
        cVarB.f76498b.setValue(d0.a(((d0) cVarB2.f76498b.getF182175a()).f128833a));
        cVarB.f76499c.setValue(d0.a(((d0) cVarB2.f76499c.getF182175a()).f128833a));
        f92.a aVarB = aVar.b();
        f92.a aVarB2 = aVar2.b();
        aVarB.getClass();
        aVarB2.getClass();
        f92.b bVarA3 = aVarB.a();
        f92.b bVarA4 = aVarB2.a();
        bVarA3.getClass();
        bVarA4.getClass();
        bVarA3.f70001a.setValue(d0.a(bVarA4.a()));
        bVarA3.f70002b.setValue(d0.a(((d0) bVarA4.f70002b.getF182175a()).f128833a));
        f92.c cVar = (f92.c) aVarB.f70000b.getF182175a();
        f92.c cVar2 = (f92.c) aVarB2.f70000b.getF182175a();
        cVar.getClass();
        cVar2.getClass();
        cVar.f70003a.setValue(d0.a(((d0) cVar2.f70003a.getF182175a()).f128833a));
        i92.a aVarI = aVar.i();
        i92.a aVarI2 = aVar2.i();
        aVarI.getClass();
        aVarI2.getClass();
        i92.b bVarA5 = aVarI.a();
        i92.b bVarA6 = aVarI2.a();
        bVarA5.getClass();
        bVarA6.getClass();
        bVarA5.f92363a.setValue(d0.a(bVarA6.b()));
        bVarA5.f92364b.setValue(d0.a(((d0) bVarA6.f92364b.getF182175a()).f128833a));
        bVarA5.f92365c.setValue(d0.a(((d0) bVarA6.f92365c.getF182175a()).f128833a));
        bVarA5.f92366d.setValue(d0.a(bVarA6.a()));
        bVarA5.f92367e.setValue(d0.a(((d0) bVarA6.f92367e.getF182175a()).f128833a));
        bVarA5.f92368f.setValue(d0.a(((d0) bVarA6.f92368f.getF182175a()).f128833a));
        bVarA5.f92369g.setValue(d0.a(((d0) bVarA6.f92369g.getF182175a()).f128833a));
        i92.c cVar3 = (i92.c) aVarI.f92362b.getF182175a();
        i92.c cVar4 = (i92.c) aVarI2.f92362b.getF182175a();
        cVar3.getClass();
        cVar4.getClass();
        cVar3.f92370a.setValue(d0.a(((d0) cVar4.f92370a.getF182175a()).f128833a));
        cVar3.f92371b.setValue(d0.a(((d0) cVar4.f92371b.getF182175a()).f128833a));
        h92.a aVarG = aVar.g();
        h92.a aVarG2 = aVar2.g();
        aVarG.getClass();
        aVarG2.getClass();
        h92.b bVarA7 = aVarG.a();
        h92.b bVarA8 = aVarG2.a();
        bVarA7.getClass();
        bVarA8.getClass();
        bVarA7.f82535a.setValue(d0.a(bVarA8.a()));
        bVarA7.f82536b.setValue(d0.a(((d0) bVarA8.f82536b.getF182175a()).f128833a));
        bVarA7.f82537c.setValue(d0.a(((d0) bVarA8.f82537c.getF182175a()).f128833a));
        h92.c cVarB3 = aVarG.b();
        h92.c cVarB4 = aVarG2.b();
        cVarB3.getClass();
        cVarB4.getClass();
        cVarB3.f82538a.setValue(d0.a(cVarB4.a()));
        cVarB3.f82539b.setValue(d0.a(((d0) cVarB4.f82539b.getF182175a()).f128833a));
        cVarB3.f82540c.setValue(d0.a(((d0) cVarB4.f82540c.getF182175a()).f128833a));
        e92.g gVarL = aVar.l();
        e92.g gVarL2 = aVar2.l();
        gVarL.getClass();
        gVarL2.getClass();
        gVarL.f63532a.setValue(d0.a(((d0) gVarL2.f63532a.getF182175a()).f128833a));
        gVarL.f63533b.setValue(d0.a(((d0) gVarL2.f63533b.getF182175a()).f128833a));
        gVarL.f63534c.setValue(d0.a(((d0) gVarL2.f63534c.getF182175a()).f128833a));
        gVarL.f63535d.setValue(d0.a(((d0) gVarL2.f63535d.getF182175a()).f128833a));
        gVarL.f63536e.setValue(d0.a(((d0) gVarL2.f63536e.getF182175a()).f128833a));
        gVarL.f63537f.setValue(d0.a(((d0) gVarL2.f63537f.getF182175a()).f128833a));
        gVarL.f63538g.setValue(d0.a(((d0) gVarL2.f63538g.getF182175a()).f128833a));
        gVarL.f63539h.setValue(d0.a(((d0) gVarL2.f63539h.getF182175a()).f128833a));
        gVarL.f63540i.setValue(d0.a(((d0) gVarL2.f63540i.getF182175a()).f128833a));
        gVarL.f63541j.setValue(d0.a(((d0) gVarL2.f63541j.getF182175a()).f128833a));
        e92.d dVarH = aVar.h();
        e92.d dVarH2 = aVar2.h();
        dVarH.getClass();
        dVarH2.getClass();
        dVarH.f63514a.setValue(d0.a(dVarH2.a()));
        dVarH.f63515b.setValue(d0.a(((d0) dVarH2.f63515b.getF182175a()).f128833a));
        dVarH.f63516c.setValue(d0.a(((d0) dVarH2.f63516c.getF182175a()).f128833a));
    }

    public static final void T(int i14, int i15, byte[] bArr) {
        bArr[i14] = (byte) (i15 & 255);
        bArr[i14 + 1] = (byte) ((i15 >> 8) & 255);
    }

    public static final void U(byte[] bArr, int i14, long j8) {
        bArr[i14] = (byte) (j8 & 255);
        bArr[i14 + 1] = (byte) ((j8 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((j8 >> 16) & 255);
        bArr[i14 + 3] = (byte) ((j8 >> 24) & 255);
    }

    public static final void a(i53.c cVar, e23.l lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(1256778983);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        byte b14 = 0;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                o0VarE.C(1473703739);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1472934939);
                r1.b(y.Q(o0VarE, R.string.lbl_upcoming_events), z3.f.c(-745986979, new b71.m(cVar, lVar, i16, b14), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.f(cVar, lVar, i14, b14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    public static final void b(int i14, e23.a aVar, h4.r rVar, m mVar) {
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(2078507859);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            bv.b.f21239a.getClass();
            bv.b.a();
            if (k1.f37122a.s()) {
                o0VarE.C(284326569);
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.lbl_course_points);
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new eu.a(aVar, 7);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new eu.a(aVar, 7);
                        o0VarE.K(objQ);
                    }
                }
                p2Var.g(strQ, rVar, null, null, null, false, false, (e23.a) objQ, o0VarE, (i15 << 3) & 112, 252);
                o0VarE.g0(false);
            } else {
                o0VarE.C(284522799);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(rVar, aVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc  */
    public static final void c(p1 p1Var, long j8, String str, e23.l lVar, m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-336955344);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(p1Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            obj = str;
            i15 |= o0VarE.B(obj) ? 256 : 128;
        } else {
            obj = str;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strP = y.P(R.string.delete_review_dialog_title, new Object[]{obj}, o0VarE);
            String strQ = y.Q(o0VarE, R.string.delete_review_dialog_message);
            String strQ2 = y.Q(o0VarE, R.string.lbl_delete);
            int i16 = i15 & 14;
            boolean z14 = ((i15 & 112) == 32) | (i16 == 4) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (z14) {
                objQ = new at1.g(p1Var, lVar, j8);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new at1.g(p1Var, lVar, j8);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar2 = (e23.a) objQ;
            String strQ3 = y.Q(o0VarE, R.string.lbl_cancel);
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new z(p1Var, 6);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new z(p1Var, 6);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(false, strP, strQ, null, null, strQ2, true, false, aVar2, strQ3, (e23.a) objQ2, o0Var, 1572870, 0, SyslogConstants.LOG_LOCAL3);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.h(j8, p1Var, str, lVar, i14, 0);
        }
    }

    public static final void d(e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1109342647);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarP, R.string.lbl_error_occurred), y.Q(o0VarP, R.string.technical_challenge_message), null, null, y.Q(o0VarP, R.string.lbl_try_again), false, false, aVar, y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, (i15 << 24) & 234881024, (i15 >> 3) & 14, 217);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 8);
        }
    }

    public static final void e(e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1965991218);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.pace_pro_saved), y.Q(o0VarE, R.string.pacepro_change_event_details_message), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.g(aVar, i14, 0);
        }
    }

    public static final void f(zz2.e eVar, k3 k3Var, p pVar, z3.e eVar2, m mVar, int i14) {
        int i15;
        k3Var.getClass();
        o0 o0VarE = mVar.E(99308350);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(k3Var) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i15 |= o0VarE.B(pVar) ? 256 : 128;
        }
        if ((i14 & 7168) == 0) {
            i15 |= o0VarE.r(eVar2) ? 2048 : 1024;
        }
        if ((i15 & 5851) == 1170 && o0VarE.b()) {
            o0VarE.e();
        } else {
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            int i16 = 0;
            UUID uuid = (UUID) d4.a.d(new Object[0], null, null, new a03.d(i16), o0VarE, 3080, 6);
            x1 x1Var = n.f135158a;
            o0.b bVarG = o0VarE.g();
            p1 p1VarQ = p3.p0.q(eVar2, o0VarE);
            o0VarE.L(1371703430);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            Object obj = objQ;
            if (objQ == c2565a) {
                uuid.getClass();
                a03.l lVar = new a03.l(eVar, view2, pVar, uuid);
                z3.e eVar3 = new z3.e(-501757589, true, new i(k3Var, p1VarQ));
                lVar.setParentCompositionContext(bVarG);
                lVar.f120e.setValue(eVar3);
                lVar.f121f = true;
                o0VarE.K(lVar);
                obj = lVar;
            }
            a03.l lVar2 = (a03.l) obj;
            o0VarE.g0(false);
            o0VarE.L(1371718949);
            if (!pVar.f150a) {
                o0VarE.L(1371720526);
                boolean z14 = (i15 & 14) == 4;
                Object objQ2 = o0VarE.q();
                if (z14 || objQ2 == c2565a) {
                    objQ2 = new a03.e(eVar, i16);
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                c.w.a(0, 1, (e23.a) objQ2, o0VarE, false);
            }
            o0VarE.g0(false);
            l0.a(lVar2, new a03.f(lVar2, i16), o0VarE);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(eVar, k3Var, pVar, eVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0224  */
    /* JADX WARN: Code duplicated, block: B:122:0x0273  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:152:0x0310  */
    /* JADX WARN: Code duplicated, block: B:167:0x0362  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:197:0x0407  */
    /* JADX WARN: Code duplicated, block: B:212:0x0458  */
    /* JADX WARN: Code duplicated, block: B:227:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:242:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    public static final void g(final c11.a aVar, v21.e eVar, final e23.l lVar, m mVar, int i14) {
        final int i15;
        final e23.l lVar2 = lVar;
        eVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-40438916);
        int i16 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.saturated_fat);
            String strQ2 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d14 = aVar.f22494a;
            int i18 = i16 & 896;
            int i19 = i16 & 14;
            boolean z14 = (i18 == 256) | (i19 == 4);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                lVar2.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar2.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar2.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar2.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar2.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i17) {
                                case 0:
                                    lVar2.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar2.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar2.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar2.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            int i24 = 100887552 | ((i16 << 18) & 29360128);
            c11.e.a(strQ, strQ2, d14, false, true, false, null, eVar, true, (e23.l) objQ, o0VarE, i24, 64);
            String strQ3 = y.Q(o0VarE, R.string.trans_fat);
            String strQ4 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d15 = aVar.f22495b;
            boolean z15 = (i18 == 256) | (i19 == 4);
            Object objQ2 = o0VarE.q();
            if (z15) {
                final int i25 = 12;
                objQ2 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i25) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    final int i26 = 12;
                    objQ2 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i26) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            c11.e.a(strQ3, strQ4, d15, false, true, false, null, eVar, true, (e23.l) objQ2, o0VarE, i24, 64);
            String strQ5 = y.Q(o0VarE, R.string.polyunsaturated_fat);
            String strQ6 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d16 = aVar.f22496c;
            boolean z16 = (i18 == 256) | (i19 == 4);
            Object objQ3 = o0VarE.q();
            if (z16) {
                final int i27 = 13;
                objQ3 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i27) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    final int i28 = 13;
                    objQ3 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i28) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            }
            c11.e.a(strQ5, strQ6, d16, false, true, false, null, eVar, true, (e23.l) objQ3, o0VarE, i24, 64);
            String strQ7 = y.Q(o0VarE, R.string.monounsaturated_fat);
            String strQ8 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d17 = aVar.f22497d;
            boolean z17 = (i18 == 256) | (i19 == 4);
            Object objQ4 = o0VarE.q();
            if (z17) {
                final int i29 = 14;
                objQ4 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i29) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == m.a.f135155b) {
                    final int i210 = 14;
                    objQ4 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i210) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                }
            }
            c11.e.a(strQ7, strQ8, d17, false, true, false, null, eVar, true, (e23.l) objQ4, o0VarE, i24, 64);
            String strQ9 = y.Q(o0VarE, R.string.cholesterol);
            String strQ10 = y.Q(o0VarE, R.string.milligrams_abbreviation);
            Double d18 = aVar.f22498e;
            boolean z18 = (i18 == 256) | (i19 == 4);
            Object objQ5 = o0VarE.q();
            if (z18) {
                i15 = 1;
                objQ5 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == m.a.f135155b) {
                    i15 = 1;
                    objQ5 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ5);
                } else {
                    i15 = 1;
                }
            }
            int i30 = i15;
            c11.e.a(strQ9, strQ10, d18, false, true, false, null, eVar, true, (e23.l) objQ5, o0VarE, i24, 64);
            String strQ11 = y.Q(o0VarE, R.string.fiber);
            String strQ12 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d19 = aVar.f22499f;
            int i34 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ6 = o0VarE.q();
            if (i34 == 0) {
                aVar2.getClass();
                if (objQ6 == m.a.f135155b) {
                    final int i35 = 2;
                    objQ6 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i35) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ6);
                }
            } else {
                final int i36 = 2;
                objQ6 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i36) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ6);
            }
            c11.e.a(strQ11, strQ12, d19, false, true, false, null, eVar, true, (e23.l) objQ6, o0VarE, i24, 64);
            String strQ13 = y.Q(o0VarE, R.string.sugar);
            String strQ14 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d24 = aVar.f22500g;
            int i37 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ7 = o0VarE.q();
            if (i37 == 0) {
                aVar2.getClass();
                if (objQ7 == m.a.f135155b) {
                    final int i38 = 3;
                    objQ7 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i38) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ7);
                }
            } else {
                final int i39 = 3;
                objQ7 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i39) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ7);
            }
            c11.e.a(strQ13, strQ14, d24, false, true, false, null, eVar, true, (e23.l) objQ7, o0VarE, i24, 64);
            String strQ15 = y.Q(o0VarE, R.string.added_sugar);
            String strQ16 = y.Q(o0VarE, R.string.lbl_grams_abr);
            Double d25 = aVar.f22501h;
            final int i44 = 4;
            int i45 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ8 = o0VarE.q();
            if (i45 == 0) {
                aVar2.getClass();
                if (objQ8 == m.a.f135155b) {
                    objQ8 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i44) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ8);
                }
            } else {
                objQ8 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i44) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ8);
            }
            c11.e.a(strQ15, strQ16, d25, false, true, false, null, eVar, true, (e23.l) objQ8, o0VarE, i24, 64);
            String strQ17 = y.Q(o0VarE, R.string.sodium);
            String strQ18 = y.Q(o0VarE, R.string.milligrams_abbreviation);
            Double d26 = aVar.f22502i;
            int i46 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ9 = o0VarE.q();
            if (i46 == 0) {
                aVar2.getClass();
                if (objQ9 == m.a.f135155b) {
                    final int i47 = 5;
                    objQ9 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i47) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ9);
                }
            } else {
                final int i48 = 5;
                objQ9 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i48) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ9);
            }
            c11.e.a(strQ17, strQ18, d26, false, true, false, null, eVar, true, (e23.l) objQ9, o0VarE, i24, 64);
            String strQ19 = y.Q(o0VarE, R.string.vitamin_a);
            String strQ20 = y.Q(o0VarE, R.string.micrograms_abbreviation);
            Double d27 = aVar.f22503j;
            int i49 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ10 = o0VarE.q();
            if (i49 == 0) {
                aVar2.getClass();
                if (objQ10 == m.a.f135155b) {
                    final int i54 = 6;
                    objQ10 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i54) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ10);
                }
            } else {
                final int i55 = 6;
                objQ10 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i55) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ10);
            }
            c11.e.a(strQ19, strQ20, d27, false, true, false, null, eVar, true, (e23.l) objQ10, o0VarE, i24, 64);
            String strQ21 = y.Q(o0VarE, R.string.vitamin_c);
            String strQ22 = y.Q(o0VarE, R.string.milligrams_abbreviation);
            Double d28 = aVar.f22504k;
            int i56 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ11 = o0VarE.q();
            if (i56 == 0) {
                aVar2.getClass();
                if (objQ11 == m.a.f135155b) {
                    final int i57 = 7;
                    objQ11 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i57) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ11);
                }
            } else {
                final int i58 = 7;
                objQ11 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i58) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ11);
            }
            c11.e.a(strQ21, strQ22, d28, false, true, false, null, eVar, true, (e23.l) objQ11, o0VarE, i24, 64);
            String strQ23 = y.Q(o0VarE, R.string.vitamin_d);
            String strQ24 = y.Q(o0VarE, R.string.micrograms_abbreviation);
            Double d29 = aVar.f22505l;
            int i59 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ12 = o0VarE.q();
            if (i59 == 0) {
                aVar2.getClass();
                if (objQ12 == m.a.f135155b) {
                    final int i64 = 8;
                    objQ12 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i64) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ12);
                }
            } else {
                final int i65 = 8;
                objQ12 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i65) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ12);
            }
            c11.e.a(strQ23, strQ24, d29, false, true, false, null, eVar, true, (e23.l) objQ12, o0VarE, i24, 64);
            String strQ25 = y.Q(o0VarE, R.string.calcium);
            String strQ26 = y.Q(o0VarE, R.string.milligrams_abbreviation);
            Double d34 = aVar.f22506m;
            int i66 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ13 = o0VarE.q();
            if (i66 == 0) {
                aVar2.getClass();
                if (objQ13 == m.a.f135155b) {
                    final int i67 = 9;
                    objQ13 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i67) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ13);
                }
            } else {
                final int i68 = 9;
                objQ13 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i68) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ13);
            }
            c11.e.a(strQ25, strQ26, d34, false, true, false, null, eVar, true, (e23.l) objQ13, o0VarE, i24, 64);
            String strQ27 = y.Q(o0VarE, R.string.iron);
            String strQ28 = y.Q(o0VarE, R.string.milligrams_abbreviation);
            Double d35 = aVar.f22507n;
            int i69 = (i18 == 256 ? i30 : 0) | (i19 == 4 ? i30 : 0);
            Object objQ14 = o0VarE.q();
            if (i69 == 0) {
                aVar2.getClass();
                if (objQ14 == m.a.f135155b) {
                    final int i74 = 10;
                    objQ14 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i74) {
                                case 0:
                                    lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ14);
                }
            } else {
                final int i75 = 10;
                objQ14 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i75) {
                            case 0:
                                lVar.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ14);
            }
            c11.e.a(strQ27, strQ28, d35, false, true, false, null, eVar, true, (e23.l) objQ14, o0VarE, i24, 64);
            String strQ29 = y.Q(o0VarE, R.string.potassium);
            String strQ30 = y.Q(o0VarE, R.string.milligrams_abbreviation);
            Double d36 = aVar.f22508o;
            int i76 = i18 == 256 ? i30 : 0;
            if (i19 != 4) {
                i30 = 0;
            }
            int i77 = i76 | i30;
            Object objQ15 = o0VarE.q();
            if (i77 == 0) {
                aVar2.getClass();
                if (objQ15 == m.a.f135155b) {
                    final int i78 = 11;
                    lVar2 = lVar;
                    objQ15 = new e23.l() { // from class: c11.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i78) {
                                case 0:
                                    lVar2.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                    break;
                                case 1:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                    break;
                                case 2:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                    break;
                                case 3:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                    break;
                                case 4:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                    break;
                                case 5:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                    break;
                                case 6:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                    break;
                                case 7:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                    break;
                                case 8:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                    break;
                                case 9:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                    break;
                                case 10:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                    break;
                                case 11:
                                    lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                    break;
                                case 12:
                                    lVar2.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                    break;
                                case 13:
                                    lVar2.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                    break;
                                default:
                                    lVar2.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ15);
                } else {
                    lVar2 = lVar;
                }
            } else {
                final int i79 = 11;
                lVar2 = lVar;
                objQ15 = new e23.l() { // from class: c11.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i79) {
                            case 0:
                                lVar2.invoke(a.a(aVar, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766));
                                break;
                            case 1:
                                lVar2.invoke(a.a(aVar, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, 32751));
                                break;
                            case 2:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, 32735));
                                break;
                            case 3:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, 32703));
                                break;
                            case 4:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, null, 32639));
                                break;
                            case 5:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, null, 32511));
                                break;
                            case 6:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, null, 32255));
                                break;
                            case 7:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, null, 31743));
                                break;
                            case 8:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, null, 30719));
                                break;
                            case 9:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, null, 28671));
                                break;
                            case 10:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, null, 24575));
                                break;
                            case 11:
                                lVar2.invoke(a.a(aVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Double) obj, 16383));
                                break;
                            case 12:
                                lVar2.invoke(a.a(aVar, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765));
                                break;
                            case 13:
                                lVar2.invoke(a.a(aVar, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, null, 32763));
                                break;
                            default:
                                lVar2.invoke(a.a(aVar, null, null, null, (Double) obj, null, null, null, null, null, null, null, null, null, null, null, 32759));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ15);
            }
            c11.e.a(strQ29, strQ30, d36, false, true, false, null, eVar, true, (e23.l) objQ15, o0VarE, i24, 64);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(aVar, eVar, lVar2, i14, 26);
        }
    }

    public static final void h(h4.r rVar, z42.g gVar, e23.a aVar, e23.l lVar, m mVar, int i14) {
        int i15;
        rVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1224096476);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                tz.a aVar2 = new tz.a(customLineChart, new f52.e(context, new yz.k(DateFormat.is24HourFormat(context)), new d52.e(context)), new f52.g(customLineChart), new f52.c(customLineChart, new e52.c(aVar, 2)), new f52.d(customLineChart), null, 32, null);
                o0VarE.K(aVar2);
                objQ2 = aVar2;
            }
            tz.a aVar3 = (tz.a) objQ2;
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarQ = x2.q(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 290);
            boolean zR = o0VarE.r(customLineChart) | ((i15 & 7168) == 2048);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new ci0.i(lVar, customLineChart, 1);
                o0VarE.K(objQ3);
            }
            h4.r rVarB = wz1.i.b(rVarQ, (e23.a) objQ3, o0VarE);
            boolean zR2 = o0VarE.r(customLineChart);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new b40.a(customLineChart, i16);
                o0VarE.K(objQ4);
            }
            e23.l lVar2 = (e23.l) objQ4;
            boolean zR3 = o0VarE.r(aVar3) | o0VarE.r(gVar) | o0VarE.r(context);
            Object objQ5 = o0VarE.q();
            if (zR3 || objQ5 == c2565a) {
                objQ5 = new ci0.b(aVar3, 14, gVar, context);
                o0VarE.K(objQ5);
            }
            p002j6.c.b(lVar2, rVarB, (e23.l) objQ5, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(rVar, gVar, aVar, lVar, i14, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(DateTime dateTime, DateTime dateTime2, String str, String str2, boolean z14, e23.l lVar, m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        e23.l lVar2;
        o0 o0Var;
        boolean z16;
        p1 p1Var;
        dateTime.getClass();
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1115284042);
        int i17 = 2;
        int i18 = i14 | (o0VarE.r(dateTime) ? 4 : 2) | (o0VarE.r(dateTime2) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024);
        int i19 = i15 & 16;
        if (i19 != 0) {
            i16 = i18 | 24576;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = i18 | (o0VarE.h(z15) ? 16384 : 8192);
        }
        int i24 = 0;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            boolean z17 = i19 != 0 ? false : z15;
            x1 x1Var = n.f135158a;
            boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(-578439959, new an1.i(z17, i24), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new z(p1Var2, i17);
                o0VarE.K(objQ2);
            }
            int i25 = i16 >> 6;
            boolean z18 = z17;
            o0Var = o0VarE;
            p2Var.h(str, str2, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, o0Var, (i25 & 14) | 100663296 | (i25 & 112), 6, 764);
            si siVarZ = bi.z(dateTime2 != null ? dateTime2.getHourOfDay() : dateTime.getHourOfDay(), dateTime2 != null ? dateTime2.getMinuteOfHour() : dateTime.getMinuteOfHour(), zIs24HourFormat, o0Var, 0, 0);
            String strQ = y.Q(o0Var, R.string.lbl_select_time);
            String strQ2 = y.Q(o0Var, R.string.lbl_ok);
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            String strQ3 = y.Q(o0Var, R.string.lbl_cancel);
            Object objQ3 = o0Var.q();
            if (objQ3 == c2565a) {
                p1Var = p1Var2;
                objQ3 = new z(p1Var, 3);
                o0Var.K(objQ3);
            } else {
                p1Var = p1Var2;
            }
            e23.a aVar = (e23.a) objQ3;
            boolean zR = o0Var.r(dateTime);
            Object objQ4 = o0Var.q();
            if (zR || objQ4 == c2565a) {
                lVar2 = lVar;
                objQ4 = new a3.e(lVar2, 9, dateTime, p1Var);
                o0Var.K(objQ4);
            } else {
                lVar2 = lVar;
            }
            g82.e.a(strQ, siVarZ, zBooleanValue, strQ3, aVar, strQ2, (e23.p) objQ4, o0Var, 24576);
            z16 = z18;
        } else {
            lVar2 = lVar;
            o0Var = o0VarE;
            o0Var.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(dateTime, dateTime2, str, str2, z16, lVar2, i14, i15);
        }
    }

    public static final void j(e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1950717687);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.lbl_feature_not_supported), y.Q(o0VarE, R.string.msg_trail_review_not_supported), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.g(aVar, i14, 7);
        }
    }

    public static synchronized void k(Context context, String str) {
        if (oi0.c.g(UmidSdkWrapper.UMIDTOKEN_FILE_NAME) || oi0.c.g(UmidSdkWrapper.UMIDTOKEN_KEY_NAME) || context == null) {
            return;
        }
        try {
            String strN = og.a.n(og.a.m(), str);
            HashMap map = new HashMap();
            map.put(UmidSdkWrapper.UMIDTOKEN_KEY_NAME, strN);
            c.a(context, UmidSdkWrapper.UMIDTOKEN_FILE_NAME, map);
        } catch (Throwable unused) {
        }
    }

    public static final void l(Closeable closeable, Throwable th3) {
        if (closeable != null) {
            if (th3 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th4) {
                g.a(th3, th4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [k30.q] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final n50.d m(w20.a aVar, r30.a aVar2) {
        double dDoubleValue;
        r30.a aVar3;
        Integer numValueOf;
        ?? qVar;
        ?? r14;
        boolean z14;
        List<k30.w> listD;
        r30.a aVar4 = aVar2;
        aVar.getClass();
        t tVar = aVar.f181480e;
        List<fn0.a> list = aVar.f181478c;
        x xVar = aVar.f181479d;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
        boolean z15 = (!eVar.m().c() || list == null || list.isEmpty()) ? false : true;
        i53.f fVarO = o(aVar);
        double dQ = eVar.q();
        Integer numF = xVar != null ? xVar.getUnpavedPercentage() : null;
        Double dB = xVar != null ? xVar.getTotalUnpavedDistance() : null;
        Integer numB = tVar != null ? tVar.getHighTrafficPercentage() : null;
        Double dF = tVar != null ? tVar.getTotalHighTrafficDistance() : null;
        double dR = eVar.r();
        double dS = eVar.s();
        List<GeoPointDTO> list2 = eVar.geoPoints;
        double dDoubleValue2 = Double.NaN;
        if (list2 == null || list2.isEmpty()) {
            dDoubleValue = Double.NaN;
        } else {
            dDoubleValue = 100000.0d;
            for (GeoPointDTO geoPointDTO : list2) {
                Double d14 = geoPointDTO.elevation;
                if (d14 != null && d14.doubleValue() < dDoubleValue) {
                    Double d15 = geoPointDTO.elevation;
                    dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                }
            }
        }
        List<GeoPointDTO> list3 = eVar.geoPoints;
        if (list3 != null && !list3.isEmpty()) {
            Iterator<GeoPointDTO> it = list3.iterator();
            loop1: while (true) {
                dDoubleValue2 = 0.0d;
                while (true) {
                    if (!it.hasNext()) {
                        break loop1;
                    }
                    GeoPointDTO next = it.next();
                    Double d16 = next.elevation;
                    if (d16 != null && d16.doubleValue() > dDoubleValue2) {
                        Double d17 = next.elevation;
                        if (d17 != null) {
                            dDoubleValue2 = d17.doubleValue();
                        }
                    }
                }
            }
        }
        double d18 = dDoubleValue2;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        if (z15) {
            aVar3 = null;
            numValueOf = Integer.valueOf(list.size());
        } else {
            aVar3 = null;
            numValueOf = null;
        }
        e50.i iVar = new e50.i(dQ, numF, dB, numB, dF, dR, dS, dDoubleValue, d18, zY, numValueOf);
        List<ClimbDTO> list4 = aVar.f181477b;
        List<GeoPointDTO> list5 = eVar.geoPoints;
        if (list5 == null || list5.isEmpty()) {
            qVar = aVar3;
        } else {
            boolean zC = eVar.m().c();
            boolean z16 = list4 == null || list4.isEmpty();
            if (xVar != null) {
                listD = xVar.d();
            } else {
                r14 = aVar3;
            }
            if (r14 == 0 || r14.isEmpty()) {
                r14 = listD;
                r14 = listD;
                z14 = true;
            } else {
                r14 = listD;
                z14 = false;
            }
            qVar = new k30.q(list5, (!zC || z16) ? aVar3 : list4, (!zC || z14) ? aVar3 : xVar.d(), eVar.q(), eVar.k());
        }
        if (aVar4 == null || (fVarO != null && fVarO.isEmpty())) {
            aVar4 = aVar3;
        } else {
            Iterator it3 = fVarO.iterator();
            while (it3.hasNext()) {
                if (((r30.b) it3.next()).f149981a == aVar4) {
                }
            }
            aVar4 = aVar3;
        }
        return new n50.d(iVar, new e50.f(qVar, fVarO, aVar4));
    }

    public static final n50.g n(w20.a aVar, boolean z14) {
        boolean z15;
        aVar.getClass();
        s20.h hVar = (s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null);
        com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
        String str = eVar.courseId;
        String str2 = eVar.courseName;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM2 = eVar.m();
        boolean zE0 = eVar.e0();
        boolean z16 = !eVar.Z();
        boolean Z = eVar.Z();
        boolean zE = iVarM.e();
        String str3 = eVar.userProfilePk;
        boolean z17 = hVar.i(str3 != null ? Long.parseLong(str3) : -1L) || eVar.userProfilePk == null;
        Boolean boolI = eVar.getHasTurnDetectionDisabled();
        if (boolI != null) {
            z15 = !boolI.booleanValue();
        } else {
            z15 = iVarM == com.garmin.android.apps.connectmobile.courses.model.i.RUNNING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.HIKING || iVarM == com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
        }
        n50.b bVar = new n50.b(str2, iVarM2, zE0, z16, Z, zE, z17, z15, iVarM.d() && com.garmin.android.apps.connectmobile.courses.model.e.a0(), eVar.G(), !eVar.M() && E(eVar.q()), eVar.M() && eVar.G(), z14, true);
        double dA = eVar.A();
        Double d14 = eVar.elapsedSeconds;
        List<ClimbDTO> list = aVar.f181477b;
        return new n50.g(str, bVar, dA, d14, list != null ? list.size() : 0, eVar.f0(), eVar.f0() ? eVar.getImageURL() : null);
    }

    public static final i53.f o(w20.a aVar) {
        aVar.getClass();
        com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
        boolean zC = eVar.m().c();
        ArrayList arrayList = new ArrayList();
        List<ClimbDTO> list = aVar.f181477b;
        boolean z14 = true;
        boolean z15 = list == null || list.isEmpty();
        if (zC && !z15) {
            arrayList.add(new r30.b(r30.a.CLIMBS, false));
        }
        x xVar = aVar.f181479d;
        List<k30.w> listD = xVar != null ? xVar.d() : null;
        if (listD != null && !listD.isEmpty()) {
            z14 = false;
        }
        if (zC && !z14) {
            arrayList.add(new r30.b(r30.a.ROAD_SURFACE, false));
        }
        ArrayList arrayListK = eVar.k();
        if (arrayListK != null && !arrayListK.isEmpty()) {
            arrayList.add(new r30.b(r30.a.COURSE_POINTS, false));
        }
        return i53.a.j(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x014e  */
    /* JADX WARN: Code duplicated, block: B:33:0x01be  */
    /* JADX WARN: Code duplicated, block: B:37:0x0233  */
    /* JADX WARN: Code duplicated, block: B:43:0x0248  */
    /* JADX WARN: Code duplicated, block: B:47:0x0256  */
    /* JADX WARN: Code duplicated, block: B:52:0x026a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:1: B:45:0x0250->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object p(lt2.h hVar, lt2.f fVar, boolean z14, v13.c cVar) {
        b0 b0Var;
        lt2.h hVar2;
        lt2.f fVar2;
        boolean z15;
        List list;
        lt2.a aVar;
        mt2.l lVar;
        List list2;
        List list3;
        mt2.l lVar2;
        lt2.a aVar2;
        Object objB;
        lt2.a aVar3;
        lt2.h hVar3;
        mt2.l lVar3;
        lt2.f fVar3;
        List list4;
        boolean z16;
        List list5;
        mt2.l lVar4;
        lt2.a aVar4;
        Object objB2;
        List list6;
        mt2.l lVar5;
        lt2.a aVar5;
        Iterator it;
        Object next;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f71416k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f71416k = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(cVar);
            }
        } else {
            b0Var = new b0(cVar);
        }
        Object obj = b0Var.f71415j;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f71416k;
        Object obj2 = null;
        if (i15 != 0) {
            if (i15 == 1) {
                z15 = b0Var.f71414i;
                list2 = (List) b0Var.f71411f;
                lt2.a aVar7 = b0Var.f71410e;
                mt2.l lVar6 = b0Var.f71409d;
                list3 = b0Var.f71408c;
                fVar2 = b0Var.f71407b;
                hVar2 = b0Var.f71406a;
                r.b(obj);
                aVar = aVar7;
                lVar = lVar6;
            } else {
                if (i15 == 2) {
                    boolean z17 = b0Var.f71414i;
                    List list7 = (List) b0Var.f71411f;
                    lt2.a aVar8 = b0Var.f71410e;
                    mt2.l lVar7 = b0Var.f71409d;
                    List list8 = b0Var.f71408c;
                    lt2.f fVar4 = b0Var.f71407b;
                    lt2.h hVar4 = b0Var.f71406a;
                    r.b(obj);
                    aVar3 = aVar8;
                    lVar3 = lVar7;
                    fVar3 = fVar4;
                    list4 = list7;
                    z16 = z17;
                    list5 = list8;
                    hVar3 = hVar4;
                    list4.add(new h0(1, lVar3, aVar3, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, null));
                    Object[] objArr = 0 == true ? 1 : 0;
                    lt2.g gVar = new lt2.g(mt2.l.REST, null, null, new lt2.a(mt2.c.LAP_BUTTON, 0.0d, null, objArr, 14, 0 == true ? 1 : 0), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 502, 0 == true ? 1 : 0);
                    f fVar5 = new f(hVar3, fVar3, gVar);
                    b0Var.f71406a = null;
                    b0Var.f71407b = null;
                    b0Var.f71408c = list5;
                    b0Var.f71409d = null;
                    b0Var.f71410e = null;
                    lVar4 = gVar.f114889a;
                    b0Var.f71411f = lVar4;
                    aVar4 = gVar.f114892d;
                    b0Var.f71412g = aVar4;
                    b0Var.f71413h = list5;
                    b0Var.f71414i = z16;
                    b0Var.f71416k = 3;
                    objB2 = B(fVar5, b0Var);
                    if (objB2 != aVar6) {
                        list6 = list5;
                        lVar5 = lVar4;
                        aVar5 = aVar4;
                        obj = objB2;
                    }
                    return aVar6;
                }
                if (i15 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list5 = b0Var.f71413h;
                lt2.a aVar9 = b0Var.f71412g;
                mt2.l lVar8 = (mt2.l) b0Var.f71411f;
                list6 = b0Var.f71408c;
                r.b(obj);
                aVar5 = aVar9;
                lVar5 = lVar8;
            }
            j jVar = null;
            list5.add(new h0(2, lVar5, aVar5, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, jVar));
            list6.add(new h0(3, mt2.l.OTHER, new lt2.a(mt2.c.REPS, 0.0d, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0), new lt2.b(mt2.i.NONE, Double.NaN, 0.0d, 0 == true ? 1 : 0, 0, 0, 0, 0 == true ? 1 : 0, 252, jVar), null, null, null, null, null, 0 == true ? 1 : 0, null, null, null, null, true, 12272, null));
            it = list6.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((h0) next).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != mt2.l.INTERVAL);
            h0 h0Var = (h0) next;
            int iF = h0Var != null ? h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() : 1;
            for (Object obj3 : list6) {
                if (((h0) obj3).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.OTHER) {
                    obj2 = obj3;
                    break;
                }
            }
            h0 h0Var2 = (h0) obj2;
            return new o(i53.a.j(list6), i53.a.j(p13.w.c(new yg2.a(0, iF, h0Var2 != null ? h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() : 3, 0))), j53.l.b(), null, 8, null);
        }
        ArrayList arrayListX = v.h.x(obj);
        if (z14) {
            lt2.g gVar2 = new lt2.g(mt2.l.WARM_UP, null, null, new lt2.a(mt2.c.LAP_BUTTON, 0.0d, null, null, 14, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 502, null);
            f fVar6 = new f(hVar, fVar, gVar2);
            b0Var.f71406a = hVar;
            b0Var.f71407b = fVar;
            b0Var.f71408c = arrayListX;
            mt2.l lVar9 = gVar2.f114889a;
            b0Var.f71409d = lVar9;
            lt2.a aVar10 = gVar2.f114892d;
            b0Var.f71410e = aVar10;
            b0Var.f71411f = arrayListX;
            b0Var.f71414i = z14;
            b0Var.f71416k = 1;
            Object objB3 = B(fVar6, b0Var);
            if (objB3 != aVar6) {
                hVar2 = hVar;
                z15 = z14;
                aVar = aVar10;
                lVar = lVar9;
                fVar2 = fVar;
                list2 = arrayListX;
                list3 = list2;
                obj = objB3;
            }
        } else {
            hVar2 = hVar;
            fVar2 = fVar;
            z15 = z14;
            list = arrayListX;
            lt2.g gVar3 = new lt2.g(mt2.l.INTERVAL, null, null, new lt2.a(mt2.c.LAP_BUTTON, 0.0d, null, null, 14, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 502, null);
            f fVar7 = new f(hVar2, fVar2, gVar3);
            b0Var.f71406a = hVar2;
            b0Var.f71407b = fVar2;
            b0Var.f71408c = list;
            lVar2 = gVar3.f114889a;
            b0Var.f71409d = lVar2;
            aVar2 = gVar3.f114892d;
            b0Var.f71410e = aVar2;
            b0Var.f71411f = list;
            b0Var.f71414i = z15;
            b0Var.f71416k = 2;
            objB = B(fVar7, b0Var);
            if (objB != aVar6) {
                aVar3 = aVar2;
                hVar3 = hVar2;
                obj = objB;
                lVar3 = lVar2;
                fVar3 = fVar2;
                list4 = list;
                z16 = z15;
                list5 = list4;
                list4.add(new h0(1, lVar3, aVar3, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, null));
                Object[] objArr2 = 0 == true ? 1 : 0;
                lt2.g gVar4 = new lt2.g(mt2.l.REST, null, null, new lt2.a(mt2.c.LAP_BUTTON, 0.0d, null, objArr2, 14, 0 == true ? 1 : 0), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 502, 0 == true ? 1 : 0);
                f fVar8 = new f(hVar3, fVar3, gVar4);
                b0Var.f71406a = null;
                b0Var.f71407b = null;
                b0Var.f71408c = list5;
                b0Var.f71409d = null;
                b0Var.f71410e = null;
                lVar4 = gVar4.f114889a;
                b0Var.f71411f = lVar4;
                aVar4 = gVar4.f114892d;
                b0Var.f71412g = aVar4;
                b0Var.f71413h = list5;
                b0Var.f71414i = z16;
                b0Var.f71416k = 3;
                objB2 = B(fVar8, b0Var);
                if (objB2 != aVar6) {
                    list6 = list5;
                    lVar5 = lVar4;
                    aVar5 = aVar4;
                    obj = objB2;
                    j jVar2 = null;
                    list5.add(new h0(2, lVar5, aVar5, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, jVar2));
                    list6.add(new h0(3, mt2.l.OTHER, new lt2.a(mt2.c.REPS, 0.0d, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0), new lt2.b(mt2.i.NONE, Double.NaN, 0.0d, 0 == true ? 1 : 0, 0, 0, 0, 0 == true ? 1 : 0, 252, jVar2), null, null, null, null, null, 0 == true ? 1 : 0, null, null, null, null, true, 12272, null));
                    it = list6.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((h0) next).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != mt2.l.INTERVAL);
                    h0 h0Var3 = (h0) next;
                    if (h0Var3 != null) {
                    }
                    while (r0.hasNext()) {
                        if (((h0) obj3).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.OTHER) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    h0 h0Var4 = (h0) obj2;
                    return new o(i53.a.j(list6), i53.a.j(p13.w.c(new yg2.a(0, iF, h0Var4 != null ? h0Var4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() : 3, 0))), j53.l.b(), null, 8, null);
                }
            }
        }
        return aVar6;
        list2.add(new h0(0, lVar, aVar, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, null));
        list = list3;
        lt2.g gVar5 = new lt2.g(mt2.l.INTERVAL, null, null, new lt2.a(mt2.c.LAP_BUTTON, 0.0d, null, null, 14, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 502, null);
        f fVar9 = new f(hVar2, fVar2, gVar5);
        b0Var.f71406a = hVar2;
        b0Var.f71407b = fVar2;
        b0Var.f71408c = list;
        lVar2 = gVar5.f114889a;
        b0Var.f71409d = lVar2;
        aVar2 = gVar5.f114892d;
        b0Var.f71410e = aVar2;
        b0Var.f71411f = list;
        b0Var.f71414i = z15;
        b0Var.f71416k = 2;
        objB = B(fVar9, b0Var);
        if (objB != aVar6) {
            aVar3 = aVar2;
            hVar3 = hVar2;
            obj = objB;
            lVar3 = lVar2;
            fVar3 = fVar2;
            list4 = list;
            z16 = z15;
            list5 = list4;
            list4.add(new h0(1, lVar3, aVar3, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, null));
            Object[] objArr3 = 0 == true ? 1 : 0;
            lt2.g gVar6 = new lt2.g(mt2.l.REST, null, null, new lt2.a(mt2.c.LAP_BUTTON, 0.0d, null, objArr3, 14, 0 == true ? 1 : 0), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 502, 0 == true ? 1 : 0);
            f fVar10 = new f(hVar3, fVar3, gVar6);
            b0Var.f71406a = null;
            b0Var.f71407b = null;
            b0Var.f71408c = list5;
            b0Var.f71409d = null;
            b0Var.f71410e = null;
            lVar4 = gVar6.f114889a;
            b0Var.f71411f = lVar4;
            aVar4 = gVar6.f114892d;
            b0Var.f71412g = aVar4;
            b0Var.f71413h = list5;
            b0Var.f71414i = z16;
            b0Var.f71416k = 3;
            objB2 = B(fVar10, b0Var);
            if (objB2 != aVar6) {
                list6 = list5;
                lVar5 = lVar4;
                aVar5 = aVar4;
                obj = objB2;
                j jVar3 = null;
                list5.add(new h0(2, lVar5, aVar5, null, null, null, (i0) obj, null, null, null, null, null, null, null, false, 12208, jVar3));
                list6.add(new h0(3, mt2.l.OTHER, new lt2.a(mt2.c.REPS, 0.0d, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0), new lt2.b(mt2.i.NONE, Double.NaN, 0.0d, 0 == true ? 1 : 0, 0, 0, 0, 0 == true ? 1 : 0, 252, jVar3), null, null, null, null, null, 0 == true ? 1 : 0, null, null, null, null, true, 12272, null));
                it = list6.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((h0) next).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != mt2.l.INTERVAL);
                h0 h0Var5 = (h0) next;
                if (h0Var5 != null) {
                }
                while (r0.hasNext()) {
                    if (((h0) obj3).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == mt2.l.OTHER) {
                        obj2 = obj3;
                        break;
                    }
                }
                h0 h0Var6 = (h0) obj2;
                return new o(i53.a.j(list6), i53.a.j(p13.w.c(new yg2.a(0, iF, h0Var6 != null ? h0Var6.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() : 3, 0))), j53.l.b(), null, 8, null);
            }
        }
        return aVar6;
    }

    public static final List q(LocalDate localDate, LocalDate localDate2) {
        if (!k.g(localDate, localDate2) && !localDate.isBefore(localDate2)) {
            return j0.f134944a;
        }
        ArrayList arrayListM = p13.x.m(localDate);
        int days = Days.daysBetween(localDate, localDate2).getDays();
        for (int i14 = 0; i14 < days; i14++) {
            localDate = localDate.plusDays(1);
            localDate.getClass();
            arrayListM.add(localDate);
        }
        return arrayListM;
    }

    public static final int r(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        return Days.daysBetween(localDate, localDate2).getDays() + 1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:98:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x005b: MOVE (r16 I:??[long, double]) = (r14 I:??[long, double]), block:B:20:0x005b */
    /* JADX WARN: Type inference failed for: r0v12, types: [long] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [e23.l] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object s(long r26, long r28, double r30, long r32, e23.l r34, e23.l r35, v13.c r36) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.b.s(long, long, double, long, e23.l, e23.l, v13.c):java.lang.Object");
    }

    public static final LocalDate t(LocalDate localDate) {
        localDate.getClass();
        LocalDate localDateMinusDays = P(localDate).plusMonths(1).minusDays(1);
        localDateMinusDays.getClass();
        return localDateMinusDays;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    public static final c22.p2 u(bc1.a aVar, Float f14) {
        if (f14 != null) {
            float fFloatValue = f14.floatValue();
            for (hc1.a aVar2 : hc1.a.values()) {
                if (aVar2.f83273a.contains(Float.valueOf(fFloatValue))) {
                    if (aVar2 != null) {
                        return aVar.a(aVar2);
                    }
                }
            }
            aVar2 = null;
            if (aVar2 != null) {
                return aVar.a(aVar2);
            }
        }
        return null;
    }

    public static final String v(Context context, String str) {
        str.getClass();
        context.getClass();
        String number = PhoneNumberUtils.formatNumber(str, hb2.h.a(context).getCountry());
        return number == null ? str : number;
    }

    public static final cf.m w(cf.t tVar) {
        tVar.getClass();
        return new cf.m(tVar.f26941a, tVar.f26960t);
    }

    public static final List x(v1 v1Var) {
        v1Var.getClass();
        List list = f98721a;
        if (list != null) {
            return list;
        }
        u4.d dVarC = h72.r.f82353a;
        j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("RoundSummary", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(3.0809f, 12.8478f);
            eVarL.d(3.5468f, 17.7829f, 7.9069f, 21.411f, 12.8326f, 20.9625f);
            eVarL.d(17.7583f, 20.514f, 21.3947f, 16.1577f, 20.9656f, 11.2193f);
            eVarL.d(20.5366f, 6.2809f, 16.2037f, 2.6201f, 11.2748f, 3.0316f);
            eVarL.d(6.3773f, 3.3724f, 2.6825f, 7.6274f, 3.0216f, 12.5359f);
            q2.y(eVarL, 3.0809f, 12.8478f, 17.913f, 12.328f);
            eVarL.g(19.291f);
            eVarL.d(19.1253f, 14.0809f, 18.253f, 15.6901f, 16.8758f, 16.7832f);
            eVarL.i(15.9867f, 15.6991f);
            eVarL.d(15.9867f, 15.6991f, 17.9722f, 14.0062f, 17.913f, 12.328f);
            hb.a.r(eVarL, 14.5494f, 12.328f, 15.8682f, 12.7884f);
            eVarL.d(15.3587f, 14.364f, 14.096f, 15.5793f, 12.5047f, 16.0258f);
            eVarL.i(12.2083f, 14.6596f);
            eVarL.d(13.3266f, 14.3238f, 14.208f, 13.4571f, 14.5643f, 12.3429f);
            q2.y(eVarL, 14.5494f, 12.328f, 11.2748f, 18.0307f);
            eVarL.d(12.6563f, 18.1618f, 14.0273f, 17.6911f, 15.0384f, 16.7387f);
            eVarL.i(16.046f, 17.704f);
            eVarL.d(15.0371f, 18.7365f, 13.6779f, 19.3513f, 12.2379f, 19.4266f);
            eVarL.d(11.854f, 19.4712f, 11.4662f, 19.4712f, 11.0822f, 19.4266f);
            q2.y(eVarL, 11.2748f, 18.0307f, 10.2876f, 16.6436f);
            v.e0.x(eVarL, 8.0654f, 10.5325f, 10.2876f, 16.6436f);
            u62.z.x(eVarL, 8.0654f, 6.6436f, 10.2876f, 8.8603f);
            sn.a.v(eVarL, 8.0654f, 6.6436f);
            u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            h72.r.f82353a = dVarC;
        }
        u4.d dVar = dVarC;
        u4.d dVarC2 = h72.i.f82344a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("GolferView", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var2 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(11.1097f, 5.68f);
            eVarL2.d(12.1578f, 5.68f, 13.0075f, 4.8562f, 13.0075f, 3.84f);
            eVarL2.d(13.0075f, 2.8238f, 12.1578f, 2.0f, 11.1097f, 2.0f);
            eVarL2.d(10.0616f, 2.0f, 9.212f, 2.8238f, 9.212f, 3.84f);
            eVarL2.d(9.212f, 4.8562f, 10.0616f, 5.68f, 11.1097f, 5.68f);
            hb.a.r(eVarL2, 10.7556f, 6.8056f, 9.2601f, 5.8056f);
            eVarL2.d(9.0384f, 5.6577f, 8.7621f, 5.6089f, 8.5009f, 5.6715f);
            eVarL2.d(8.2397f, 5.7341f, 8.0186f, 5.9021f, 7.8935f, 6.1331f);
            eVarL2.i(5.1764f, 11.1612f);
            eVarL2.d(4.9494f, 11.5791f, 4.941f, 12.0769f, 5.1539f, 12.5018f);
            eVarL2.i(7.5777f, 17.3024f);
            eVarL2.i(6.7313f, 21.9999f);
            eVarL2.g(8.4382f);
            eVarL2.i(9.8068f, 17.1493f);
            eVarL2.i(8.3628f, 12.4868f);
            eVarL2.i(9.8068f, 9.9568f);
            eVarL2.i(11.7935f, 14.2824f);
            eVarL2.g(12.6876f);
            eVarL2.i(11.4995f, 7.9243f);
            eVarL2.d(11.4147f, 7.4704f, 11.1471f, 7.0679f, 10.7556f, 6.8056f);
            u62.z.j(eVarL2, 12.0891f, 14.9076f, 12.8704f);
            eVarL2.i(17.3731f, 20.5807f);
            eVarL2.i(18.7532f, 20.0226f);
            eVarL2.i(18.9569f, 20.4926f);
            eVarL2.d(19.0236f, 20.658f, 19.0126f, 20.8434f, 18.9268f, 21.0003f);
            eVarL2.d(18.841f, 21.1572f, 18.6888f, 21.2701f, 18.5102f, 21.3094f);
            eVarL2.i(17.8275f, 21.4969f);
            eVarL2.d(17.5296f, 21.5861f, 17.2058f, 21.4888f, 17.0121f, 21.2519f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL2, 12.3289f, 15.2207f, 12.0891f, 14.9076f);
            u4.d.a.b(aVar4, eVarL2.f168407a, i15, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            h72.i.f82344a = dVarC2;
        }
        u4.d dVar2 = dVarC2;
        u4.d dVarC3 = h72.p.f82351a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("PinPointer", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var3 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 10.5677f, 8.4425f);
            eVarK.d(10.6639f, 8.5387f, 10.7179f, 8.6691f, 10.7179f, 8.8051f);
            eVarK.i(10.7077f, 8.8462f);
            eVarK.d(14.882f, 11.1898f, 16.5949f, 11.5846f, 16.5949f, 11.5846f);
            eVarK.d(15.7623f, 13.1198f, 15.1298f, 14.7554f, 14.7128f, 16.4513f);
            eVarK.d(14.5282f, 16.3898f, 12.0615f, 15.2051f, 11.5897f, 14.8513f);
            eVarK.d(11.499f, 14.7959f, 11.4329f, 14.7078f, 11.4051f, 14.6051f);
            eVarK.d(11.2923f, 14.5744f, 11.1949f, 13.8564f, 11.1641f, 13.6051f);
            eVarK.d(11.017f, 13.5775f, 10.8675f, 13.5655f, 10.7179f, 13.5692f);
            eVarK.o(18.359f);
            eVarK.d(11.1743f, 18.441f, 11.4872f, 18.5487f, 11.4872f, 18.8308f);
            eVarK.d(11.4872f, 19.1128f, 10.9128f, 19.3436f, 10.2051f, 19.3436f);
            eVarK.d(9.4974f, 19.3436f, 8.9231f, 19.041f, 8.9231f, 18.8308f);
            eVarK.d(8.9231f, 18.6205f, 9.241f, 18.441f, 9.6923f, 18.359f);
            eVarK.o(8.8051f);
            eVarK.d(9.6923f, 8.6691f, 9.7463f, 8.5387f, 9.8425f, 8.4425f);
            eVarK.d(9.9387f, 8.3463f, 10.0691f, 8.2923f, 10.2051f, 8.2923f);
            eVarK.d(10.3411f, 8.2923f, 10.4716f, 8.3463f, 10.5677f, 8.4425f);
            eVarK.c();
            u4.d.a.b(aVar6, eVarK.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var4 = new o4.t1(f0.d(4278190080L), jVar);
            int i16 = h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(12.0f, 2.0f, 14.3231f, 5.9282f);
            eVarM.d(16.0209f, 6.4294f, 17.5112f, 7.4663f, 18.5713f, 8.8841f);
            eVarM.d(19.6314f, 10.3019f, 20.2045f, 12.0246f, 20.2051f, 13.7949f);
            eVarM.d(20.2051f, 15.971f, 19.3407f, 18.058f, 17.8019f, 19.5968f);
            eVarM.d(16.2631f, 21.1355f, 14.1761f, 22.0f, 12.0f, 22.0f);
            eVarM.d(9.8238f, 22.0f, 7.7368f, 21.1355f, 6.1981f, 19.5968f);
            eVarM.d(4.6593f, 18.058f, 3.7949f, 15.971f, 3.7949f, 13.7949f);
            eVarM.d(3.7958f, 12.0239f, 4.3696f, 10.3008f, 5.4307f, 8.8829f);
            eVarM.d(6.4918f, 7.465f, 7.9832f, 6.4285f, 9.682f, 5.9282f);
            q2.y(eVarM, 12.0f, 2.0f, 9.3255f, 20.2634f);
            eVarM.d(10.1731f, 20.6163f, 11.0819f, 20.7987f, 12.0f, 20.8f);
            eVarM.o(20.7795f);
            eVarM.d(13.8506f, 20.7768f, 15.6246f, 20.0397f, 16.9322f, 18.7301f);
            eVarM.d(18.2399f, 17.4205f, 18.9744f, 15.6455f, 18.9743f, 13.7949f);
            eVarM.d(18.973f, 11.9456f, 18.2378f, 10.1724f, 16.9301f, 8.8648f);
            eVarM.d(15.6225f, 7.5571f, 13.8493f, 6.8219f, 12.0f, 6.8205f);
            eVarM.d(10.1507f, 6.8219f, 8.3775f, 7.5571f, 7.0699f, 8.8648f);
            eVarM.d(5.7622f, 10.1724f, 5.027f, 11.9456f, 5.0256f, 13.7949f);
            eVarM.d(5.0229f, 14.713f, 5.2013f, 15.6226f, 5.5504f, 16.4717f);
            eVarM.d(5.8996f, 17.3208f, 6.4127f, 18.0928f, 7.0605f, 18.7434f);
            eVarM.d(7.7083f, 19.394f, 8.4779f, 19.9105f, 9.3255f, 20.2634f);
            eVarM.c();
            u4.d.a.b(aVar6, eVarM.f168407a, i16, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            h72.p.f82351a = dVarC3;
        }
        u4.d dVarC4 = h72.a.f82334a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("BallImpact", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var5 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i17 = h1.f128864c;
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(17.0497f, 3.3669f, 14.984f, 2.8438f);
            eVarM2.i(14.035f, 5.6075f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 16.1691f, 6.2287f, 17.0497f, 3.3669f);
            eVarM2.k(15.8634f, 7.2221f);
            eVarM2.i(13.6972f, 6.5915f);
            eVarM2.i(12.7236f, 9.427f);
            eVarM2.d(12.5117f, 10.044f, 11.8637f, 10.4343f, 11.1769f, 10.3584f);
            eVarM2.i(5.528f, 9.7345f);
            eVarM2.i(7.2857f, 17.0172f);
            eVarM2.d(7.3702f, 16.9892f, 7.4538f, 16.9565f, 7.5361f, 16.919f);
            eVarM2.i(9.7724f, 15.9005f);
            eVarM2.d(9.9312f, 13.5522f, 11.8007f, 11.6217f, 14.2136f, 11.4504f);
            eVarM2.d(14.3322f, 11.4407f, 14.4501f, 11.4354f, 14.5672f, 11.4343f);
            q2.y(eVarM2, 15.8634f, 7.2221f, 4.3711f, 9.6261f);
            eVarM2.d(3.6173f, 9.6619f, 3.0f, 10.247f, 3.0f, 10.9806f);
            eVarM2.o(12.3302f);
            eVarM2.d(3.0f, 13.5711f, 3.4191f, 14.7801f, 4.1973f, 15.784f);
            eVarM2.i(4.531f, 16.2145f);
            eVarM2.d(4.9348f, 16.7356f, 5.5389f, 17.0529f, 6.1819f, 17.1288f);
            q2.y(eVarM2, 4.3711f, 9.6261f, 19.732f, 10.9286f);
            eVarM2.i(21.9512f, 11.4661f);
            eVarM2.i(21.3924f, 13.6944f);
            eVarM2.i(20.7988f, 12.7095f);
            eVarM2.i(18.5913f, 14.0746f);
            eVarM2.i(18.5537f, 14.0074f);
            eVarM2.d(18.4284f, 13.7833f, 18.2829f, 13.5711f, 18.119f, 13.3734f);
            eVarM2.i(18.0645f, 13.3076f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 20.3238f, 11.9372f, 19.732f, 10.9286f);
            eVarM2.k(10.9007f, 16.6135f);
            eVarM2.d(11.0939f, 18.6549f, 12.9015f, 20.1557f, 14.9437f, 19.9702f);
            eVarM2.d(16.9858f, 19.7846f, 18.4934f, 17.9826f, 18.3155f, 15.9398f);
            eVarM2.d(18.1376f, 13.897f, 16.3413f, 12.3827f, 14.2978f, 12.5529f);
            eVarM2.d(12.2674f, 12.6939f, 10.7356f, 14.454f, 10.8761f, 16.4844f);
            q2.y(eVarM2, 10.9007f, 16.6135f, 17.0499f, 16.3984f);
            eVarM2.g(17.6212f);
            eVarM2.d(17.5525f, 17.1235f, 17.1909f, 17.7892f, 16.6199f, 18.2414f);
            eVarM2.i(16.2513f, 17.7929f);
            eVarM2.d(16.2513f, 17.7929f, 17.0745f, 17.0926f, 17.0499f, 16.3984f);
            hb.a.r(eVarM2, 15.6554f, 16.3984f, 16.2022f, 16.5889f);
            eVarM2.d(15.9909f, 17.2406f, 15.4675f, 17.7434f, 14.8077f, 17.9281f);
            eVarM2.i(14.6848f, 17.3629f);
            eVarM2.d(15.1485f, 17.224f, 15.5139f, 16.8655f, 15.6616f, 16.4046f);
            q2.y(eVarM2, 15.6554f, 16.3984f, 14.2978f, 18.7574f);
            eVarM2.d(14.8706f, 18.8116f, 15.439f, 18.6169f, 15.8582f, 18.2229f);
            eVarM2.i(16.2759f, 18.6222f);
            eVarM2.d(15.8576f, 19.0493f, 15.2941f, 19.3037f, 14.6971f, 19.3348f);
            eVarM2.d(14.5379f, 19.3533f, 14.3772f, 19.3533f, 14.218f, 19.3348f);
            eVarM2.i(14.2978f, 18.7574f);
            eVarM2.c();
            u4.d.a.b(aVar8, eVarM2.f168407a, i17, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            h72.a.f82334a = dVarC4;
        }
        u4.d dVarC5 = h72.w.f82358a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("SwingVideo", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var6 = new o4.t1(f0.d(r2), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK2 = b71.i.k(h1.f128863b, 11.8209f, 4.6f);
            eVarK2.d(11.8209f, 5.4864f, 11.0716f, 6.2f, 10.1505f, 6.2f);
            eVarK2.d(9.2294f, 6.2f, 8.48f, 5.4818f, 8.48f, 4.6f);
            eVarK2.d(8.48f, 3.7136f, 9.2294f, 3.0f, 10.1505f, 3.0f);
            eVarK2.d(11.0716f, 3.0f, 11.8209f, 3.7182f, 11.8209f, 4.6f);
            eVarK2.c();
            u4.d.a.b(aVar10, eVarK2.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(4.9721f, 9.5909f);
            eVarL3.d(4.9721f, 9.5909f, 5.5974f, 10.2954f, 5.5974f, 10.2863f);
            eVarL3.d(5.7787f, 10.4909f, 5.7453f, 10.7363f, 5.3301f, 10.8863f);
            eVarL3.d(5.0247f, 10.9954f, 4.5235f, 10.9818f, 4.3851f, 10.6273f);
            eVarL3.d(4.3851f, 10.6409f, 4.1083f, 10.0409f, 4.051f, 9.8364f);
            eVarL3.d(3.9305f, 9.4027f, 4.0313f, 9.3309f, 4.2712f, 9.1598f);
            eVarL3.i(4.3231f, 9.1227f);
            eVarL3.d(4.4949f, 8.9954f, 8.3225f, 6.3818f, 8.3225f, 6.3818f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL3, 8.7998f, 6.9773f, 4.9721f, 9.5909f);
            u4.d.a.b(aVar10, eVarL3.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var8 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarM3 = com.nimbusds.jose.shaded.gson.internal.a.m(18.0444f, 6.0864f, 16.4026f, 7.3409f);
            eVarM3.d(17.0278f, 8.2091f, 17.3953f, 9.2545f, 17.3953f, 10.3773f);
            eVarM3.d(17.3953f, 11.0162f, 17.277f, 11.6294f, 17.0598f, 12.1994f);
            eVarM3.g(19.1798f);
            eVarM3.d(19.3297f, 11.6446f, 19.4094f, 11.0627f, 19.4094f, 10.4636f);
            eVarM3.d(19.4094f, 8.8227f, 19.061f, 7.2591f, 18.0444f, 6.0864f);
            eVarM3.c();
            u4.d.a.b(aVar10, eVarM3.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var9 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarD = u62.z.d(14.1655f, 12.1994f, 12.321f, 11.8291f, 11.1195f);
            eVarD.i(11.8226f, 11.1169f);
            eVarD.i(10.3891f, 8.3863f);
            eVarD.d(10.1982f, 8.0182f, 10.3127f, 7.5773f, 10.6611f, 7.3363f);
            eVarD.d(10.6635f, 7.3363f, 11.606f, 6.7091f, 12.5486f, 6.0819f);
            eVarD.d(13.4912f, 5.4546f, 14.4339f, 4.8273f, 14.4363f, 4.8273f);
            eVarD.i(12.5941f, 3.4591f);
            eVarD.i(13.31f, 3.0f);
            eVarD.i(16.4122f, 4.8273f);
            eVarD.i(13.3386f, 7.0455f);
            eVarD.d(13.3386f, 7.0455f, 14.6081f, 9.7045f, 14.6033f, 11.3591f);
            eVarD.d(14.6033f, 11.3863f, 14.5174f, 11.5818f, 14.5174f, 11.5818f);
            eVarD.i(14.1655f, 12.1994f);
            eVarD.c();
            u4.d.a.b(aVar10, eVarD.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var10 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarM4 = com.nimbusds.jose.shaded.gson.internal.a.m(9.8041f, 16.7659f, 9.7695f, 15.632f);
            eVarM4.d(7.8854f, 15.1132f, 6.3918f, 13.7511f, 5.8026f, 12.0182f);
            eVarM4.i(5.5544f, 12.0727f);
            eVarM4.d(6.0769f, 14.1854f, 7.6395f, 15.9109f, 9.6917f, 16.7383f);
            eVarM4.i(9.8041f, 16.7659f);
            eVarM4.c();
            u4.d.a.b(aVar10, eVarM4.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var11 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarM5 = com.nimbusds.jose.shaded.gson.internal.a.m(14.1339f, 19.2247f, 14.1369f, 15.2225f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM5, 17.7417f, 17.2092f, 14.1339f, 19.2247f);
            u4.d.a.b(aVar10, eVarM5.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var12 = new o4.t1(f0.d(4278190080L), jVar);
            int i18 = h1.f128864c;
            u4.e eVarQ = u62.z.q(10.8134f, 21.2546f, 13.1926f, 20.4906f, 21.2546f);
            v.e0.A(eVarQ, 10.8134f, 11.7236f, 20.3879f, 19.5773f);
            u62.z.v(eVarQ, 14.0593f, 11.7236f, 20.3879f);
            u4.d.a.b(aVar10, eVarQ.f168407a, i18, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            h72.w.f82358a = dVarC5;
        }
        v1Var.getClass();
        u4.d dVarC6 = h72.j.f82345a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("GraphFar", f19, f19, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var13 = new o4.t1(f0.d(r2), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarN = u62.z.n(h1.f128863b, 4.0f, 4.0f, 2.0f, 20.0f);
            tn.k.q(eVarN, 4.0f, 4.0f, 4.0f);
            u4.d.a.b(aVar12, eVarN.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var14 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarM6 = com.nimbusds.jose.shaded.gson.internal.a.m(8.5f, 8.0f, 4.5f, 12.0f);
            eVarM6.i(8.5f, 16.0f);
            eVarM6.i(9.9f, 14.6f);
            sn.a.A(eVarM6, 8.3f, 13.0f, 11.5f, 11.0f);
            eVarM6.g(8.3f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM6, 9.9f, 9.4f, 8.5f, 8.0f);
            u4.d.a.b(aVar12, eVarM6.f168407a, 0, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var15 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarL4 = u62.z.l(22.0f, 4.0f, 20.0f, 20.0f, 22.0f);
            eVarL4.o(4.0f);
            eVarL4.c();
            u4.d.a.b(aVar12, eVarL4.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var16 = new o4.t1(f0.d(r2), jVar);
            u4.e eVarM7 = com.nimbusds.jose.shaded.gson.internal.a.m(14.1f, 9.4f, 15.7f, 11.0f);
            tn.k.r(eVarM7, 12.5f, 11.0f, 13.0f, 15.65f);
            eVarM7.i(14.1f, 14.6f);
            eVarM7.i(15.5f, 16.0f);
            eVarM7.i(19.5f, 12.0f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM7, 15.5f, 8.0f, 14.1f, 9.4f);
            u4.d.a.b(aVar12, eVarM7.f168407a, 0, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            h72.j.f82345a = dVarC6;
        }
        u4.d dVar3 = dVarC6;
        u4.d dVarA = h72.l.a(v1Var);
        u4.d dVarC7 = h72.s.f82354a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("Scorecard", f22, f22, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var17 = new o4.t1(f0.d(r2), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL5 = b71.i.l(h1.f128863b, 2.0f, 22.0f, 4.3125f, 14.8875f);
            eVarL5.i(17.1981f, 2.0f);
            eVarL5.i(22.0f, 6.8019f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL5, 9.1144f, 19.6875f, 2.0f, 22.0f);
            eVarL5.k(5.2775f, 15.4806f);
            eVarL5.i(3.715f, 20.2825f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL5, 8.5175f, 18.72f, 5.2775f, 15.4806f);
            u4.d.a.b(aVar14, eVarL5.f168407a, 0, t1Var17, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            h72.s.f82354a = dVarC7;
        }
        u4.d dVar4 = dVarC7;
        v1Var.getClass();
        u4.d dVarC8 = h72.k.f82346a;
        if (dVarC8 == null) {
            float f24 = (float) 24.0d;
            g6.f.a aVar15 = g6.f.f75994b;
            u4.d.a aVar16 = new u4.d.a("GraphNear", f24, f24, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var18 = new o4.t1(f0.d(r2), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL6 = b71.i.l(h1.f128863b, 2.0f, 10.6667f, 5.0476f, 10.6667f);
            eVarL6.i(3.5238f, 9.1429f);
            eVarL6.i(4.8571f, 7.8095f);
            eVarL6.i(8.6667f, 11.619f);
            eVarL6.i(4.8571f, 15.4286f);
            eVarL6.i(3.5238f, 14.0952f);
            eVarL6.i(5.0f, 12.5714f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL6, 2.0f, 12.5714f, 2.0f, 10.6667f);
            eVarL6.k(9.6191f, 4.0f);
            eVarL6.i(11.5238f, 4.0f);
            eVarL6.i(11.5238f, 19.2381f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL6, 9.6191f, 19.2381f, 9.6191f, 4.0f);
            eVarL6.k(12.4762f, 4.0f);
            eVarL6.i(14.381f, 4.0f);
            eVarL6.i(14.381f, 19.2381f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL6, 12.4762f, 19.2381f, 12.4762f, 4.0f);
            eVarL6.k(15.3333f, 11.619f);
            eVarL6.i(19.1429f, 7.8095f);
            eVarL6.i(20.4762f, 9.1429f);
            eVarL6.i(18.9524f, 10.6667f);
            eVarL6.i(22.0f, 10.6667f);
            eVarL6.i(22.0f, 12.5714f);
            eVarL6.i(18.9524f, 12.5714f);
            eVarL6.i(20.4762f, 14.0952f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL6, 19.1429f, 15.4286f, 15.3333f, 11.619f);
            u4.d.a.b(aVar16, eVarL6.f168407a, 0, t1Var18, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC8 = aVar16.c();
            h72.k.f82346a = dVarC8;
        }
        List listK = p13.x.k(dVar, dVar2, dVarC3, dVarC4, dVarC5, dVar3, dVarA, dVar4, dVarC8, h72.d.a(v1Var), h72.u.a(v1Var), h72.h.a(v1Var), h72.z.a(v1Var), h72.b.a(v1Var), h72.t.a(v1Var), h72.g.a(v1Var), h72.y.a(v1Var), h72.x.a(v1Var), h72.e.a(v1Var), a0.a(v1Var), h72.o.a(v1Var), h72.m.a(v1Var), v.a(v1Var), h72.c.a(v1Var), h72.n.a(v1Var), h72.b0.a(v1Var), h72.f.a(v1Var), h72.q.a(v1Var));
        f98721a = listK;
        listK.getClass();
        return listK;
    }

    public static final ArrayList y(bc1.a aVar, Context context) {
        aVar.getClass();
        context.getClass();
        List listB1 = p13.h0.b1(aVar.b().values());
        ArrayList arrayList = new ArrayList();
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            Integer numU = zf.b.u((c22.p2) it.next(), context);
            if (numU != null) {
                arrayList.add(numU);
            }
        }
        return arrayList;
    }

    public static final ArrayList z(bc1.a aVar) {
        aVar.getClass();
        List listB1 = p13.h0.b1(aVar.b().values());
        ArrayList arrayList = new ArrayList();
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            Integer num = ((c22.p2) it.next()).f23193b;
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
