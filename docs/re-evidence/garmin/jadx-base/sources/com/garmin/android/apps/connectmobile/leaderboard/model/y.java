package com.garmin.android.apps.connectmobile.leaderboard.model;

import f72.rb;
import lc.u0;
import p3.o0;
import p3.p2;
import p3.x1;
import u62.f3;
import u62.i3;
import u62.m1;
import u62.n5;
import u62.o5;
import u62.w4;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38378a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.f38307c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.f38308d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.f38309e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.f38310f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.f38311g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.f38312h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.f38313i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s.f38314j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s.f38315k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s.f38316l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s.f38317m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f38378a = iArr;
        }
    }

    public static final void a(s sVar, p3.m mVar, int i14) {
        u4.d dVarA;
        o0 o0VarE = mVar.E(1744829063);
        int i15 = (o0VarE.k(sVar == null ? -1 : sVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (sVar == null || (dVarA = b(sVar)) == null) {
                s62.a.f157643a.getClass();
                dVarA = u62.a.a(t62.a.f162797a);
            }
            u4.d dVar = dVarA;
            d92.b.f58623a.getClass();
            g02.i.a(null, dVar, d92.b.a(o0VarE).f().f63508c, d92.b.a(o0VarE).d().a().a(), w13.b.j(o0VarE), 0.0f, null, o0VarE, 0, 225);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x(sVar, i14);
        }
    }

    public static final u4.d b(s sVar) {
        sVar.getClass();
        switch (a.f38378a[sVar.ordinal()]) {
            case 1:
                s62.a.f157643a.getClass();
                return n5.a(t62.a.f162797a);
            case 2:
                s62.a.f157643a.getClass();
                return f3.a(t62.a.f162797a);
            case 3:
                s62.a.f157643a.getClass();
                return u62.t.a(t62.a.f162797a);
            case 4:
                s62.a.f157643a.getClass();
                return w4.a(t62.a.f162797a);
            case 5:
                s62.a.f157643a.getClass();
                return rb.a(t62.c.f162799a);
            case 6:
                s62.a.f157643a.getClass();
                return n5.a(t62.a.f162797a);
            case 7:
                s62.a.f157643a.getClass();
                return f72.m.a(t62.c.f162799a);
            case 8:
                return null;
            case 9:
                s62.a.f157643a.getClass();
                return o5.a(t62.a.f162797a);
            case 10:
                s62.a.f157643a.getClass();
                return i3.a(t62.a.f162797a);
            case 11:
                s62.a.f157643a.getClass();
                return m1.a(t62.a.f162797a);
            default:
                u0.r();
                return null;
        }
    }
}
