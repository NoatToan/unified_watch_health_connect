package com.garmin.android.apps.connectmobile.activities.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import c42.c0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import l72.y2;
import o13.h;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import qr.p6;
import qr.q6;
import s5.x0;
import w2.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0017\u0010\n\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/ui/ElectronicShiftingDataActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "Lto/m;", "gears", "", "Lkotlin/jvm/internal/EnhancedNullability;", "selectionOptions", "selectedOption", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ElectronicShiftingDataActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29955b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29956a = new w1(s0.f105811a.b(q6.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29957a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29957a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29958a;

        public c(l lVar) {
            lVar.getClass();
            this.f29958a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f29958a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29958a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29959a;

        public d(g gVar) {
            this.f29959a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29959a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29960a;

        public e(g gVar) {
            this.f29960a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29960a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f29962b;

        public f(e23.a aVar, g gVar) {
            this.f29961a = aVar;
            this.f29962b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29961a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29962b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void da(ArrayList arrayList, e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-545782987);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(arrayList);
                o0VarE.K(objQ);
            }
            z02.b.a(false, null, null, null, false, z3.f.c(1606730347, new a51.l(aVar, arrayList, this, (p1) objQ), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(this, arrayList, aVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:38:0x011d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:42:0x019a  */
    /* JADX WARN: Code duplicated, block: B:44:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x021d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0224  */
    /* JADX WARN: Code duplicated, block: B:50:0x0228  */
    /* JADX WARN: Code duplicated, block: B:55:0x0245  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0339  */
    /* JADX WARN: Code duplicated, block: B:64:0x033e  */
    public final void ea(to.m mVar, m mVar2, int i14) {
        o0 o0Var;
        to.m mVar3;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        j.C0343j c0343j;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        u2 u2Var;
        int i15;
        int i16;
        String strValueOf;
        j92.f fVar2;
        p3.c<?> cVar2;
        o0 o0Var2;
        int i17;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        String strB0;
        mVar.getClass();
        double d14 = mVar.f165821e;
        float f14 = mVar.f165820d;
        o0 o0VarE = mVar2.E(-1169143384);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.B(mVar) ? 4 : 2);
        if (o0VarE.n(i18 & 1, (i18 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC3 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = k.c(rVarC3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                b0 b0Var = b0.f22601a;
                h4.g.b bVar3 = h4.d.a.f81535m;
                bVar.getClass();
                r rVarC5 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                c0343j = j.f22692b;
                s2VarA = q2.a(c0343j, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                i15 = mVar.f165818b;
                i16 = mVar.f165817a;
                if (i15 > 0) {
                    strValueOf = androidx.core.view.j.d(i16, i15, "x");
                } else {
                    strValueOf = String.valueOf(i16);
                }
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97932i;
                bVar.getClass();
                cVar2 = cVar;
                mh.c(strValueOf, c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131068);
                o0Var2 = o0VarE;
                if (f14 > 0.0f) {
                    o0Var2.C(-1545066324);
                    l3.f23124b.getClass();
                    String strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{l3.a.L(f14, 2), gl1.y.Q(o0Var2, R.string.lbl_gear_ratio)}, o0Var2);
                    fVar2.getClass();
                    mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0Var2), o0Var2, 0, 0, 131070);
                    o0Var2 = o0Var2;
                    i17 = 0;
                    o0Var2.g0(false);
                } else {
                    i17 = 0;
                    o0Var2.C(-1544628108);
                    o0Var2.g0(false);
                }
                o0Var2.g0(true);
                r rVarF = x2.f(aVar, 1.0f);
                s2VarA2 = q2.a(c0343j, h4.d.a.f81534l, o0Var2, 48);
                iHashCode2 = Long.hashCode(o0Var2.U);
                i2VarA1 = o0Var2.a0();
                rVarC2 = k.c(rVarF, o0Var2);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar2);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar2, s2VarA2, o0Var2);
                b4.c(c1623g, i2VarA1, o0Var2);
                if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0Var2);
                o0 o0Var3 = o0Var2;
                y2 y2Var = y2.f111386a;
                long jE = d92.b.a(o0Var3).e().e();
                r rVarA = u2Var.a(aVar, 3.0f, true);
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                y2Var.a((float) (d14 / ((double) 100)), 0.0f, 0, 0, 116, jE, 0L, c2.l.C(rVarA, f15, 0.0f, eVar.f97921f, 0.0f, 10), o0Var3);
                l3.a aVar3 = l3.f23124b;
                mVar3 = mVar;
                long j8 = (long) (mVar3.f165819c * 1000);
                aVar3.getClass();
                String strL1 = l3.a.l1(j8);
                fVar2.getClass();
                mh.c(strL1, u2Var.a(aVar, 0.8f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, o0Var3, 0, 0, 131068);
                strB0 = l3.a.B0(a0.s(o0Var3), d14, i17, null);
                if (strB0 == null) {
                    strB0 = "";
                }
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97935l, o0Var3);
                d6.h.f57752b.getClass();
                int i19 = d6.h.f57758h;
                r rVarA2 = u2Var.a(aVar, 0.6f, true);
                bVar.getClass();
                mh.c(strB0, c2.l.C(rVarA2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, x0VarF, o0Var3, 0, 0, 130044);
                o0Var = o0Var3;
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            b0 b0Var2 = b0.f22601a;
            h4.g.b bVar4 = h4.d.a.f81535m;
            bVar.getClass();
            r rVarC6 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            c0343j = j.f22692b;
            s2VarA = q2.a(c0343j, bVar4, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            i15 = mVar.f165818b;
            i16 = mVar.f165817a;
            if (i15 > 0) {
                strValueOf = androidx.core.view.j.d(i16, i15, "x");
            } else {
                strValueOf = String.valueOf(i16);
            }
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97932i;
            bVar.getClass();
            cVar2 = cVar;
            mh.c(strValueOf, c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 131068);
            o0Var2 = o0VarE;
            if (f14 > 0.0f) {
                o0Var2.C(-1545066324);
                l3.f23124b.getClass();
                String strP2 = gl1.y.P(R.string.string_space_string_pattern, new Object[]{l3.a.L(f14, 2), gl1.y.Q(o0Var2, R.string.lbl_gear_ratio)}, o0Var2);
                fVar2.getClass();
                mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0Var2), o0Var2, 0, 0, 131070);
                o0Var2 = o0Var2;
                i17 = 0;
                o0Var2.g0(false);
            } else {
                i17 = 0;
                o0Var2.C(-1544628108);
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
            r rVarF2 = x2.f(aVar, 1.0f);
            s2VarA2 = q2.a(c0343j, h4.d.a.f81534l, o0Var2, 48);
            iHashCode2 = Long.hashCode(o0Var2.U);
            i2VarA1 = o0Var2.a0();
            rVarC2 = k.c(rVarF2, o0Var2);
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(eVar2, s2VarA2, o0Var2);
            b4.c(c1623g, i2VarA1, o0Var2);
            if (o0Var2.T) {
                v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0Var2);
            o0 o0Var4 = o0Var2;
            y2 y2Var2 = y2.f111386a;
            long jE2 = d92.b.a(o0Var4).e().e();
            r rVarA3 = u2Var.a(aVar, 3.0f, true);
            bVar.getClass();
            float f16 = eVar.f97920e;
            bVar.getClass();
            y2Var2.a((float) (d14 / ((double) 100)), 0.0f, 0, 0, 116, jE2, 0L, c2.l.C(rVarA3, f16, 0.0f, eVar.f97921f, 0.0f, 10), o0Var4);
            l3.a aVar4 = l3.f23124b;
            mVar3 = mVar;
            long j14 = (long) (mVar3.f165819c * 1000);
            aVar4.getClass();
            String strL2 = l3.a.l1(j14);
            fVar2.getClass();
            mh.c(strL2, u2Var.a(aVar, 0.8f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, o0Var4, 0, 0, 131068);
            strB0 = l3.a.B0(a0.s(o0Var4), d14, i17, null);
            if (strB0 == null) {
                strB0 = "";
            }
            fVar2.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97935l, o0Var4);
            d6.h.f57752b.getClass();
            int i110 = d6.h.f57758h;
            r rVarA4 = u2Var.a(aVar, 0.6f, true);
            bVar.getClass();
            mh.c(strB0, c2.l.C(rVarA4, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 0L, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, x0VarF2, o0Var4, 0, 0, 130044);
            o0Var = o0Var4;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            mVar3 = mVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(this, mVar3, i14, 22);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("activityId")) {
            f0.N(new p6((q6) this.f29956a.getValue(), getIntent().getLongExtra("activityId", -1L), null)).f(this, new c(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 8)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/ui/ElectronicShiftingDataActivity$a;", "", "<init>", "()V", "", "KEY_ACTIVITY_ID", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(androidx.fragment.app.m mVar, long j8) {
            Intent intent = new Intent(mVar, (Class<?>) ElectronicShiftingDataActivity.class);
            intent.putExtra("activityId", j8);
            mVar.startActivity(intent);
        }

        private a() {
        }
    }
}
