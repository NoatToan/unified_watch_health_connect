package com.garmin.android.apps.connectmobile.developer;

import android.os.Bundle;
import c.j;
import c2.h2;
import c2.x2;
import com.garmin.android.apps.connectmobile.c;
import ew1.c2;
import f2.o;
import g12.f;
import g80.d;
import g80.e;
import h4.r;
import l72.f0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ro0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/HelpRegistryActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-developer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HelpRegistryActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33616a = 0;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33617a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.USER_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.CALORIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.TRAINING_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.INTENSITY_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.SAFETY_FEATURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.OVERNIGHT_HRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l.TRAINING_EFFECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[l.PRIMARY_TRAINING_DEVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[l.RUNNING_DYNAMICS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[l.LIVETRACK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f33617a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    public final void ca(h2 h2Var, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(61814858);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(h2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new f(this, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new f(this, 8);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(null, null, h2Var, null, null, null, false, null, (e23.l) objQ, o0VarE, (i15 << 6) & 896, 507);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, h2Var, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    public final void da(l lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-723721616);
        int i15 = (o0VarE.k(lVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(this) ? 256 : 128);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            f0 f0Var = f0.f110999a;
            String strName = lVar.name();
            g6.f.a aVar = g6.f.f75994b;
            r rVarZ = c2.l.z(x2.f(r.S, 1.0f), 16, 8);
            boolean zR = o0VarE.r(this) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new c2(26, this, lVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c2(26, this, lVar);
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(384, 9, (e23.a) objQ, rVarZ, strName, o0VarE, null, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, lVar, i14, i16);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this, new z3.e(1121487164, true, new d(this, 0)));
    }
}
