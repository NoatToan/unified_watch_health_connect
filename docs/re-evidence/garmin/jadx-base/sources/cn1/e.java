package cn1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq1.d0;
import c2.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import java.util.List;
import m92.h0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f28008a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f28009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3.e f28010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z3.e f28011d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28012a;

        static {
            int[] iArr = new int[qm1.o.values().length];
            try {
                iArr[qm1.o.MANUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qm1.o.SLEEP_SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qm1.o.SLEEP_LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28012a = iArr;
        }
    }

    static {
        final int i14 = 0;
        f28009b = new z3.e(-154283848, false, new e23.t() { // from class: cn1.c
            /* JADX WARN: Code duplicated, block: B:41:0x026f  */
            /* JADX WARN: Code duplicated, block: B:54:0x02a1  */
            @Override // e23.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                String strC;
                DateTimeZone dateTimeZoneForID;
                Iterable iterableK;
                switch (i14) {
                    case 0:
                        a0 a0Var = (a0) obj;
                        b10.c cVar = (b10.c) obj3;
                        qm1.k kVar = (qm1.k) obj4;
                        p3.m mVar = (p3.m) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        e eVar = e.f28008a;
                        a0Var.getClass();
                        ((Context) obj2).getClass();
                        cVar.getClass();
                        u00.a aVar = cVar.f14213c;
                        kVar.getClass();
                        Integer num = kVar.f145621b;
                        Integer num2 = kVar.f145622c;
                        x1 x1Var = p3.n.f135158a;
                        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                        mn1.d dVar = new mn1.d(new l22.a(context));
                        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
                        o13.p<Long, Long> pVar = kVar.f145624e;
                        String strA = b10.c.a(new DateTime(pVar != null ? pVar.f128594a : null), zIs24HourFormat);
                        String strA2 = b10.c.a(new DateTime(pVar != null ? pVar.f128595b : null), zIs24HourFormat);
                        int i15 = e.a.f28012a[qm1.l.b(kVar).ordinal()];
                        if (i15 == 1) {
                            mVar.C(-654599127);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057101726, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057096425);
                                mVar.f();
                            }
                            r.b(a0Var, strC, y.Q(mVar, R.string.lbl_duration), strA, y.Q(mVar, R.string.sleep_lbl_bedtime), strA2, y.Q(mVar, R.string.sleep_lbl_wake_time), mVar, iIntValue & 14);
                            mVar.f();
                        } else if (i15 == 2) {
                            mVar.C(-653916755);
                            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
                            if (strValueOf == null) {
                                strValueOf = sn.a.h(mVar, 2057116990, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057116029);
                                mVar.f();
                            }
                            String strF = num != null ? dVar.f(num) : null;
                            if (strF == null) {
                                strF = sn.a.h(mVar, 2057123006, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057119658);
                                mVar.f();
                            }
                            String strQ = y.Q(mVar, R.string.lbl_quality);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057132926, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057127873);
                                mVar.f();
                            }
                            h02.d.a(a0Var, strValueOf, null, strF, null, strQ, strC, null, y.Q(mVar, R.string.lbl_duration), mVar, iIntValue & 14, 74);
                            mVar.f();
                        } else {
                            if (i15 != 3) {
                                throw n23.j.m(mVar, 2057093460);
                            }
                            mVar.C(-653004611);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057151582, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057146529);
                                mVar.f();
                            }
                            r.a(a0Var, strC, y.Q(mVar, R.string.lbl_duration), mVar, iIntValue & 14);
                            mVar.f();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        a0 a0Var2 = (a0) obj;
                        Context context2 = (Context) obj2;
                        qm1.k kVar2 = (qm1.k) obj4;
                        p3.m mVar2 = (p3.m) obj5;
                        int iIntValue2 = ((Integer) obj6).intValue();
                        e eVar2 = e.f28008a;
                        a0Var2.getClass();
                        context2.getClass();
                        ((b10.c) obj3).getClass();
                        kVar2.getClass();
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar2 = h4.r.S;
                        h4.r rVarA = a0Var2.a(x2.f(aVar2, 1.0f), 1.0f, true);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        z3.e eVar4 = n.f28029a;
                        long jI = fb1.c.i(gl.c.f77766a, mVar2);
                        long jA = d92.b.a(mVar2).c().a();
                        long j8 = d92.b.a(mVar2).f().f63508c;
                        o92.e eVar5 = o92.e.CIRCLE;
                        float f14 = yz1.s.f200414a;
                        o92.b bVar2 = new o92.b(eVar5, jI, new o92.a(jA, 5.0f, null), null);
                        List listK = x.k(new h0.e.C2226e(new h0.e.a(0.0f, 0.0f), bVar2, n5.c.a(R.drawable.sleep, mVar2, 0), j8, yz1.s.h(), null), new h0.e.C2226e(new h0.e.a(1.0f, 0.0f), bVar2, n5.c.a(R.drawable.clock, mVar2, 0), j8, yz1.s.h(), null));
                        boolean zR = mVar2.r(listK);
                        Object objQ = mVar2.q();
                        p3.m.a aVar4 = p3.m.f135153a;
                        if (zR) {
                            objQ = new d0(listK, 1);
                            mVar2.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new d0(listK, 1);
                                mVar2.K(objQ);
                            }
                        }
                        e23.l lVar = (e23.l) objQ;
                        boolean zR2 = ((((iIntValue2 & 7168) ^ 3072) > 2048 && mVar2.r(kVar2)) || (iIntValue2 & 3072) == 2048) | mVar2.r(context2);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new d(0, kVar2, context2);
                            mVar2.K(objQ2);
                        } else {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new d(0, kVar2, context2);
                                mVar2.K(objQ2);
                            }
                        }
                        m92.r.b(c2.l.C(x2.d(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, eVar3.f97917b, 7), i53.a.a((e23.l) objQ2, lVar), null, null, false, y.Q(mVar2, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar2, 0, 0, 2012);
                        mVar2.y();
                        return Unit.INSTANCE;
                    default:
                        Context context3 = (Context) obj2;
                        qm1.k kVar3 = (qm1.k) obj4;
                        p3.m mVar3 = (p3.m) obj5;
                        ((Integer) obj6).getClass();
                        e eVar6 = e.f28008a;
                        ((a0) obj).getClass();
                        context3.getClass();
                        ((b10.c) obj3).getClass();
                        kVar3.getClass();
                        x1 x1Var3 = p3.n.f135158a;
                        o13.p<Long, Long> pVar2 = kVar3.f145624e;
                        if (pVar2 != null) {
                            mVar3.C(-1517581916);
                            try {
                                dateTimeZoneForID = DateTimeZone.forID(kVar3.f145625f);
                                dateTimeZoneForID.getClass();
                            } catch (IllegalArgumentException unused) {
                                dateTimeZoneForID = DateTimeZone.getDefault();
                                dateTimeZoneForID.getClass();
                            }
                            Long l14 = pVar2.f128594a;
                            DateTime dateTimeWithMillisOfSecond = l14 != null ? new DateTime(l14.longValue(), dateTimeZoneForID).withSecondOfMinute(0).withMillisOfSecond(0) : null;
                            Long l15 = pVar2.f128595b;
                            DateTime dateTimeWithMillisOfSecond2 = l15 != null ? new DateTime(l15.longValue(), dateTimeZoneForID).withSecondOfMinute(0).withMillisOfSecond(0) : null;
                            if (dateTimeWithMillisOfSecond == null || dateTimeWithMillisOfSecond2 == null) {
                                mVar3.C(297419903);
                                iterableK = x.k(y.Q(mVar3, R.string.no_value), y.Q(mVar3, R.string.no_value));
                                mVar3.f();
                            } else {
                                mVar3.C(297015074);
                                mVar3.f();
                                iterableK = gl1.d.a0(j00.f.a(j00.f.f95974a, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, 0, 28), context3, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, null, 56);
                            }
                            h4.r rVarX = x2.x(x2.f(h4.r.S, 1.0f), null, 3);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            b.a(c2.l.C(rVarX, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), i53.a.j(iterableK), false, mVar3, 0, 4);
                            mVar3.f();
                            break;
                        } else {
                            mVar3.C(-1517581917);
                            mVar3.f();
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        return Unit.INSTANCE;
                }
            }
        });
        final int i15 = 1;
        f28010c = new z3.e(-1167262153, false, new e23.t() { // from class: cn1.c
            /* JADX WARN: Code duplicated, block: B:41:0x026f  */
            /* JADX WARN: Code duplicated, block: B:54:0x02a1  */
            @Override // e23.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                String strC;
                DateTimeZone dateTimeZoneForID;
                Iterable iterableK;
                switch (i15) {
                    case 0:
                        a0 a0Var = (a0) obj;
                        b10.c cVar = (b10.c) obj3;
                        qm1.k kVar = (qm1.k) obj4;
                        p3.m mVar = (p3.m) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        e eVar = e.f28008a;
                        a0Var.getClass();
                        ((Context) obj2).getClass();
                        cVar.getClass();
                        u00.a aVar = cVar.f14213c;
                        kVar.getClass();
                        Integer num = kVar.f145621b;
                        Integer num2 = kVar.f145622c;
                        x1 x1Var = p3.n.f135158a;
                        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                        mn1.d dVar = new mn1.d(new l22.a(context));
                        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
                        o13.p<Long, Long> pVar = kVar.f145624e;
                        String strA = b10.c.a(new DateTime(pVar != null ? pVar.f128594a : null), zIs24HourFormat);
                        String strA2 = b10.c.a(new DateTime(pVar != null ? pVar.f128595b : null), zIs24HourFormat);
                        int i16 = e.a.f28012a[qm1.l.b(kVar).ordinal()];
                        if (i16 == 1) {
                            mVar.C(-654599127);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057101726, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057096425);
                                mVar.f();
                            }
                            r.b(a0Var, strC, y.Q(mVar, R.string.lbl_duration), strA, y.Q(mVar, R.string.sleep_lbl_bedtime), strA2, y.Q(mVar, R.string.sleep_lbl_wake_time), mVar, iIntValue & 14);
                            mVar.f();
                        } else if (i16 == 2) {
                            mVar.C(-653916755);
                            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
                            if (strValueOf == null) {
                                strValueOf = sn.a.h(mVar, 2057116990, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057116029);
                                mVar.f();
                            }
                            String strF = num != null ? dVar.f(num) : null;
                            if (strF == null) {
                                strF = sn.a.h(mVar, 2057123006, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057119658);
                                mVar.f();
                            }
                            String strQ = y.Q(mVar, R.string.lbl_quality);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057132926, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057127873);
                                mVar.f();
                            }
                            h02.d.a(a0Var, strValueOf, null, strF, null, strQ, strC, null, y.Q(mVar, R.string.lbl_duration), mVar, iIntValue & 14, 74);
                            mVar.f();
                        } else {
                            if (i16 != 3) {
                                throw n23.j.m(mVar, 2057093460);
                            }
                            mVar.C(-653004611);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057151582, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057146529);
                                mVar.f();
                            }
                            r.a(a0Var, strC, y.Q(mVar, R.string.lbl_duration), mVar, iIntValue & 14);
                            mVar.f();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        a0 a0Var2 = (a0) obj;
                        Context context2 = (Context) obj2;
                        qm1.k kVar2 = (qm1.k) obj4;
                        p3.m mVar2 = (p3.m) obj5;
                        int iIntValue2 = ((Integer) obj6).intValue();
                        e eVar2 = e.f28008a;
                        a0Var2.getClass();
                        context2.getClass();
                        ((b10.c) obj3).getClass();
                        kVar2.getClass();
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar2 = h4.r.S;
                        h4.r rVarA = a0Var2.a(x2.f(aVar2, 1.0f), 1.0f, true);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        z3.e eVar4 = n.f28029a;
                        long jI = fb1.c.i(gl.c.f77766a, mVar2);
                        long jA = d92.b.a(mVar2).c().a();
                        long j8 = d92.b.a(mVar2).f().f63508c;
                        o92.e eVar5 = o92.e.CIRCLE;
                        float f14 = yz1.s.f200414a;
                        o92.b bVar2 = new o92.b(eVar5, jI, new o92.a(jA, 5.0f, null), null);
                        List listK = x.k(new h0.e.C2226e(new h0.e.a(0.0f, 0.0f), bVar2, n5.c.a(R.drawable.sleep, mVar2, 0), j8, yz1.s.h(), null), new h0.e.C2226e(new h0.e.a(1.0f, 0.0f), bVar2, n5.c.a(R.drawable.clock, mVar2, 0), j8, yz1.s.h(), null));
                        boolean zR = mVar2.r(listK);
                        Object objQ = mVar2.q();
                        p3.m.a aVar4 = p3.m.f135153a;
                        if (zR) {
                            objQ = new d0(listK, 1);
                            mVar2.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new d0(listK, 1);
                                mVar2.K(objQ);
                            }
                        }
                        e23.l lVar = (e23.l) objQ;
                        boolean zR2 = ((((iIntValue2 & 7168) ^ 3072) > 2048 && mVar2.r(kVar2)) || (iIntValue2 & 3072) == 2048) | mVar2.r(context2);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new d(0, kVar2, context2);
                            mVar2.K(objQ2);
                        } else {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new d(0, kVar2, context2);
                                mVar2.K(objQ2);
                            }
                        }
                        m92.r.b(c2.l.C(x2.d(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, eVar3.f97917b, 7), i53.a.a((e23.l) objQ2, lVar), null, null, false, y.Q(mVar2, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar2, 0, 0, 2012);
                        mVar2.y();
                        return Unit.INSTANCE;
                    default:
                        Context context3 = (Context) obj2;
                        qm1.k kVar3 = (qm1.k) obj4;
                        p3.m mVar3 = (p3.m) obj5;
                        ((Integer) obj6).getClass();
                        e eVar6 = e.f28008a;
                        ((a0) obj).getClass();
                        context3.getClass();
                        ((b10.c) obj3).getClass();
                        kVar3.getClass();
                        x1 x1Var3 = p3.n.f135158a;
                        o13.p<Long, Long> pVar2 = kVar3.f145624e;
                        if (pVar2 != null) {
                            mVar3.C(-1517581916);
                            try {
                                dateTimeZoneForID = DateTimeZone.forID(kVar3.f145625f);
                                dateTimeZoneForID.getClass();
                            } catch (IllegalArgumentException unused) {
                                dateTimeZoneForID = DateTimeZone.getDefault();
                                dateTimeZoneForID.getClass();
                            }
                            Long l14 = pVar2.f128594a;
                            DateTime dateTimeWithMillisOfSecond = l14 != null ? new DateTime(l14.longValue(), dateTimeZoneForID).withSecondOfMinute(0).withMillisOfSecond(0) : null;
                            Long l15 = pVar2.f128595b;
                            DateTime dateTimeWithMillisOfSecond2 = l15 != null ? new DateTime(l15.longValue(), dateTimeZoneForID).withSecondOfMinute(0).withMillisOfSecond(0) : null;
                            if (dateTimeWithMillisOfSecond == null || dateTimeWithMillisOfSecond2 == null) {
                                mVar3.C(297419903);
                                iterableK = x.k(y.Q(mVar3, R.string.no_value), y.Q(mVar3, R.string.no_value));
                                mVar3.f();
                            } else {
                                mVar3.C(297015074);
                                mVar3.f();
                                iterableK = gl1.d.a0(j00.f.a(j00.f.f95974a, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, 0, 28), context3, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, null, 56);
                            }
                            h4.r rVarX = x2.x(x2.f(h4.r.S, 1.0f), null, 3);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            b.a(c2.l.C(rVarX, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), i53.a.j(iterableK), false, mVar3, 0, 4);
                            mVar3.f();
                            break;
                        } else {
                            mVar3.C(-1517581917);
                            mVar3.f();
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        return Unit.INSTANCE;
                }
            }
        });
        final int i16 = 2;
        f28011d = new z3.e(2128906864, false, new e23.t() { // from class: cn1.c
            /* JADX WARN: Code duplicated, block: B:41:0x026f  */
            /* JADX WARN: Code duplicated, block: B:54:0x02a1  */
            @Override // e23.t
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                String strC;
                DateTimeZone dateTimeZoneForID;
                Iterable iterableK;
                switch (i16) {
                    case 0:
                        a0 a0Var = (a0) obj;
                        b10.c cVar = (b10.c) obj3;
                        qm1.k kVar = (qm1.k) obj4;
                        p3.m mVar = (p3.m) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        e eVar = e.f28008a;
                        a0Var.getClass();
                        ((Context) obj2).getClass();
                        cVar.getClass();
                        u00.a aVar = cVar.f14213c;
                        kVar.getClass();
                        Integer num = kVar.f145621b;
                        Integer num2 = kVar.f145622c;
                        x1 x1Var = p3.n.f135158a;
                        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                        mn1.d dVar = new mn1.d(new l22.a(context));
                        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
                        o13.p<Long, Long> pVar = kVar.f145624e;
                        String strA = b10.c.a(new DateTime(pVar != null ? pVar.f128594a : null), zIs24HourFormat);
                        String strA2 = b10.c.a(new DateTime(pVar != null ? pVar.f128595b : null), zIs24HourFormat);
                        int i17 = e.a.f28012a[qm1.l.b(kVar).ordinal()];
                        if (i17 == 1) {
                            mVar.C(-654599127);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057101726, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057096425);
                                mVar.f();
                            }
                            r.b(a0Var, strC, y.Q(mVar, R.string.lbl_duration), strA, y.Q(mVar, R.string.sleep_lbl_bedtime), strA2, y.Q(mVar, R.string.sleep_lbl_wake_time), mVar, iIntValue & 14);
                            mVar.f();
                        } else if (i17 == 2) {
                            mVar.C(-653916755);
                            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
                            if (strValueOf == null) {
                                strValueOf = sn.a.h(mVar, 2057116990, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057116029);
                                mVar.f();
                            }
                            String strF = num != null ? dVar.f(num) : null;
                            if (strF == null) {
                                strF = sn.a.h(mVar, 2057123006, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057119658);
                                mVar.f();
                            }
                            String strQ = y.Q(mVar, R.string.lbl_quality);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057132926, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057127873);
                                mVar.f();
                            }
                            h02.d.a(a0Var, strValueOf, null, strF, null, strQ, strC, null, y.Q(mVar, R.string.lbl_duration), mVar, iIntValue & 14, 74);
                            mVar.f();
                        } else {
                            if (i17 != 3) {
                                throw n23.j.m(mVar, 2057093460);
                            }
                            mVar.C(-653004611);
                            strC = num2 != null ? aVar.c(num2.intValue()) : null;
                            if (strC == null) {
                                strC = sn.a.h(mVar, 2057151582, R.string.no_value, mVar);
                            } else {
                                mVar.C(2057146529);
                                mVar.f();
                            }
                            r.a(a0Var, strC, y.Q(mVar, R.string.lbl_duration), mVar, iIntValue & 14);
                            mVar.f();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        a0 a0Var2 = (a0) obj;
                        Context context2 = (Context) obj2;
                        qm1.k kVar2 = (qm1.k) obj4;
                        p3.m mVar2 = (p3.m) obj5;
                        int iIntValue2 = ((Integer) obj6).intValue();
                        e eVar2 = e.f28008a;
                        a0Var2.getClass();
                        context2.getClass();
                        ((b10.c) obj3).getClass();
                        kVar2.getClass();
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar2 = h4.r.S;
                        h4.r rVarA = a0Var2.a(x2.f(aVar2, 1.0f), 1.0f, true);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                        c2.u uVar = c2.u.f22885a;
                        z3.e eVar4 = n.f28029a;
                        long jI = fb1.c.i(gl.c.f77766a, mVar2);
                        long jA = d92.b.a(mVar2).c().a();
                        long j8 = d92.b.a(mVar2).f().f63508c;
                        o92.e eVar5 = o92.e.CIRCLE;
                        float f14 = yz1.s.f200414a;
                        o92.b bVar2 = new o92.b(eVar5, jI, new o92.a(jA, 5.0f, null), null);
                        List listK = x.k(new h0.e.C2226e(new h0.e.a(0.0f, 0.0f), bVar2, n5.c.a(R.drawable.sleep, mVar2, 0), j8, yz1.s.h(), null), new h0.e.C2226e(new h0.e.a(1.0f, 0.0f), bVar2, n5.c.a(R.drawable.clock, mVar2, 0), j8, yz1.s.h(), null));
                        boolean zR = mVar2.r(listK);
                        Object objQ = mVar2.q();
                        p3.m.a aVar4 = p3.m.f135153a;
                        if (zR) {
                            objQ = new d0(listK, 1);
                            mVar2.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new d0(listK, 1);
                                mVar2.K(objQ);
                            }
                        }
                        e23.l lVar = (e23.l) objQ;
                        boolean zR2 = ((((iIntValue2 & 7168) ^ 3072) > 2048 && mVar2.r(kVar2)) || (iIntValue2 & 3072) == 2048) | mVar2.r(context2);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new d(0, kVar2, context2);
                            mVar2.K(objQ2);
                        } else {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new d(0, kVar2, context2);
                                mVar2.K(objQ2);
                            }
                        }
                        m92.r.b(c2.l.C(x2.d(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, eVar3.f97917b, 7), i53.a.a((e23.l) objQ2, lVar), null, null, false, y.Q(mVar2, R.string.common_no_data), 0.0f, 0.0f, null, null, null, mVar2, 0, 0, 2012);
                        mVar2.y();
                        return Unit.INSTANCE;
                    default:
                        Context context3 = (Context) obj2;
                        qm1.k kVar3 = (qm1.k) obj4;
                        p3.m mVar3 = (p3.m) obj5;
                        ((Integer) obj6).getClass();
                        e eVar6 = e.f28008a;
                        ((a0) obj).getClass();
                        context3.getClass();
                        ((b10.c) obj3).getClass();
                        kVar3.getClass();
                        x1 x1Var3 = p3.n.f135158a;
                        o13.p<Long, Long> pVar2 = kVar3.f145624e;
                        if (pVar2 != null) {
                            mVar3.C(-1517581916);
                            try {
                                dateTimeZoneForID = DateTimeZone.forID(kVar3.f145625f);
                                dateTimeZoneForID.getClass();
                            } catch (IllegalArgumentException unused) {
                                dateTimeZoneForID = DateTimeZone.getDefault();
                                dateTimeZoneForID.getClass();
                            }
                            Long l14 = pVar2.f128594a;
                            DateTime dateTimeWithMillisOfSecond = l14 != null ? new DateTime(l14.longValue(), dateTimeZoneForID).withSecondOfMinute(0).withMillisOfSecond(0) : null;
                            Long l15 = pVar2.f128595b;
                            DateTime dateTimeWithMillisOfSecond2 = l15 != null ? new DateTime(l15.longValue(), dateTimeZoneForID).withSecondOfMinute(0).withMillisOfSecond(0) : null;
                            if (dateTimeWithMillisOfSecond == null || dateTimeWithMillisOfSecond2 == null) {
                                mVar3.C(297419903);
                                iterableK = x.k(y.Q(mVar3, R.string.no_value), y.Q(mVar3, R.string.no_value));
                                mVar3.f();
                            } else {
                                mVar3.C(297015074);
                                mVar3.f();
                                iterableK = gl1.d.a0(j00.f.a(j00.f.f95974a, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, 0, 28), context3, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, null, 56);
                            }
                            h4.r rVarX = x2.x(x2.f(h4.r.S, 1.0f), null, 3);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            b.a(c2.l.C(rVarX, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), i53.a.j(iterableK), false, mVar3, 0, 4);
                            mVar3.f();
                            break;
                        } else {
                            mVar3.C(-1517581917);
                            mVar3.f();
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        return Unit.INSTANCE;
                }
            }
        });
        new z3.e(1532371422, false, new c50.a(24));
        new z3.e(442540233, false, new c50.a(25));
        new z3.e(613187008, false, new c50.a(26));
    }
}
