package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/q1;", "Lr22/x;", "<init>", "()V", "a", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q1 extends r22.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41066b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f41067a;

    public interface a {
        void g(boolean z14);
    }

    @Override // androidx.fragment.app.i
    public final void show(androidx.fragment.app.v vVar, String str) {
        vVar.getClass();
        v6(vVar, str);
    }

    @Override // r22.x
    public final void u6(p3.m mVar, int i14) {
        String strJ;
        p3.o0 o0VarE = mVar.E(1050307467);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            String string = arguments.getString("arg2");
            int i16 = arguments.getInt("arg1", 0);
            String string2 = arguments.getString("arg5");
            int i17 = arguments.getInt("arg3", 0);
            int i18 = arguments.getInt("arg4", 0);
            boolean z14 = arguments.getBoolean("arg6", true);
            if (i16 > 0) {
                string2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 28178693, i16, o0VarE, false);
            } else {
                o0VarE.C(28179702);
                o0VarE.g0(false);
            }
            String str = string2;
            String strJ2 = i17 > 0 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 28181798, i17, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 28182858, R.string.lbl_ok, o0VarE, false);
            if (i18 > 0) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 28185574, i18, o0VarE, false);
            } else {
                o0VarE.C(873784818);
                o0VarE.g0(false);
                strJ = null;
            }
            z02.b.a(false, null, null, null, false, z3.f.c(1282149909, new ck0.h(z14, str, string, strJ2, this, strJ, 1), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.m1(this, i14, 13);
        }
    }

    public final int v6(androidx.fragment.app.v vVar, String str) {
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(vVar, vVar);
        aVarB.j(0, this, str, 1);
        return aVarB.s(true, true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/q1$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q1 a(int i14, String str, int i15, int i16, a aVar) {
            str.getClass();
            q1 q1Var = new q1();
            Bundle bundle = new Bundle(4);
            if (i14 != 0) {
                bundle.putInt("arg1", i14);
            }
            bundle.putString("arg2", str);
            bundle.putInt("arg3", i15);
            bundle.putInt("arg4", i16);
            q1Var.setArguments(bundle);
            q1Var.f41067a = aVar;
            return q1Var;
        }

        public static q1 b(String str, String str2) {
            q1 q1Var = new q1();
            Bundle bundle = new Bundle(4);
            bundle.putString("arg5", str);
            bundle.putString("arg2", str2);
            bundle.putInt("arg3", R.string.lbl_ok);
            bundle.putBoolean("arg6", true);
            q1Var.setArguments(bundle);
            return q1Var;
        }

        public static q1 c(String str, String str2, int i14, int i15, a aVar) {
            str.getClass();
            str2.getClass();
            q1 q1Var = new q1();
            Bundle bundle = new Bundle(4);
            bundle.putString("arg5", str);
            bundle.putString("arg2", str2);
            bundle.putInt("arg3", i14);
            bundle.putInt("arg4", i15);
            q1Var.setArguments(bundle);
            q1Var.f41067a = aVar;
            return q1Var;
        }

        private b() {
        }
    }
}
