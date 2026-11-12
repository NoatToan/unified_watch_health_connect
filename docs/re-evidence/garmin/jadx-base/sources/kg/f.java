package kg;

import a2.k;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import lc.p0;
import lc.y0;
import n23.w3;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.t0;
import p13.a1;
import p3.o0;
import ps2.n;
import ps2.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements u03.a, z, androidx.media3.exoplayer.drm.c.b, androidx.media3.exoplayer.drm.g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104678a;

    public /* synthetic */ f(int i14) {
        this.f104678a = i14;
    }

    public static int a(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i14, int i15) {
        arrayList.add(creator.createFromParcel(parcel));
        return i14 + i15;
    }

    public static k b(o0 o0Var) {
        k kVar = new k();
        o0Var.K(kVar);
        return kVar;
    }

    public static String c() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String d(hn2.a aVar, int i14) {
        String string = aVar.c().getString(i14);
        string.getClass();
        return string;
    }

    public static Iterator e(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Set f(String str) {
        return a1.b(new o73.d(str));
    }

    public static k23.j g(Class cls, String str, String str2, int i14, t0 t0Var) {
        return t0Var.f(new b0(cls, str, str2, i14));
    }

    public static NoWhenBranchMatchedException h(o0 o0Var, int i14, boolean z14) {
        o0Var.C(i14);
        o0Var.g0(z14);
        return new NoWhenBranchMatchedException();
    }

    public static y0 i(p0 p0Var, int i14) {
        p0Var.b(i14);
        return new y0();
    }

    public static m4.b0 j(o0 o0Var) {
        m4.b0 b0Var = new m4.b0();
        o0Var.K(b0Var);
        return b0Var;
    }

    public static void k(Parcel parcel, int i14, Integer num) {
        parcel.writeInt(i14);
        parcel.writeInt(num.intValue());
    }

    public static /* synthetic */ void l(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static void p(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void q(String str, String str2, StringBuilder sb3, boolean z14, boolean z15) {
        sb3.append(z14);
        sb3.append(str);
        sb3.append(z15);
        sb3.append(str2);
    }

    public static void r(StringBuilder sb3, Integer num, String str, Boolean bool, String str2) {
        sb3.append(num);
        sb3.append(str);
        sb3.append(bool);
        sb3.append(str2);
    }

    public static void s(StringBuilder sb3, Long l14, String str, Long l15, String str2) {
        sb3.append(l14);
        sb3.append(str);
        sb3.append(l15);
        sb3.append(str2);
    }

    public static /* synthetic */ void t(StringBuilder sb3, Object obj, Object obj2) {
        sb3.append(obj);
        sb3.append(obj2);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new w3(sb3.toString());
    }

    public static void u(kg1.b bVar, String str, boolean z14) {
        SharedPreferences.Editor editorEdit = bVar.U().edit();
        editorEdit.putBoolean(str, z14);
        editorEdit.apply();
    }

    public static boolean v(String str, String str2, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }

    public static /* synthetic */ void w(StringBuilder sb3, Object obj, Object obj2) {
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    @Override // androidx.media3.exoplayer.drm.g.b
    public androidx.media3.exoplayer.drm.g acquireExoMediaDrm(UUID uuid) {
        return androidx.media3.exoplayer.drm.h.c(uuid);
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f104678a) {
            case 11:
                EventTrainingPlanIntegrationActivity.a aVar = EventTrainingPlanIntegrationActivity.f46267e;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1.f6507b;
            case 18:
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(3);
                eVarI2.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = eVarI2.f25191b;
                marginLayoutParams.bottomMargin = eVarI2.f25193d;
                view2.setLayoutParams(marginLayoutParams);
                return m1.f6507b;
            default:
                MultipleCoursesActivity.a aVar3 = MultipleCoursesActivity.f33000c;
                view2.getClass();
                c7.e eVarI3 = m1Var.f6508a.i(3);
                eVarI3.getClass();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = eVarI3.f25191b;
                marginLayoutParams2.bottomMargin = eVarI3.f25193d;
                view2.setLayoutParams(marginLayoutParams2);
                return m1.f6507b;
        }
    }

    @Override // androidx.media3.exoplayer.drm.c.b
    public void release() {
    }

    @Override // u03.a
    public void run() {
        switch (this.f104678a) {
            case 8:
                kr2.h.a aVar = kr2.h.f106255y;
                w.f140538a.a(is2.b.FITPAY);
                break;
            default:
                kr2.h.a aVar2 = kr2.h.f106255y;
                zi2.a aVarValueOf = null;
                ps2.x xVar = new ps2.x(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c());
                t tVar = xVar.f140558c;
                long j8 = ((SharedPreferences) tVar.getValue()).getLong("KEY_USER_ID", 0L);
                Long lValueOf = j8 > 0 ? Long.valueOf(j8) : null;
                String string = ((SharedPreferences) tVar.getValue()).getString("KEY_ENVIRONMENT", "");
                if (string != null && !TextUtils.isEmpty(string)) {
                    aVarValueOf = zi2.a.valueOf(string);
                }
                for (hs2.a aVar3 : xVar.b()) {
                    w wVar = w.f140538a;
                    long unitId = aVar3.getUnitId();
                    wVar.getClass();
                    n nVarI = w.i(unitId);
                    if (nVarI != null) {
                        nVarI.d();
                    }
                }
                xVar.a();
                if (lValueOf != null && aVarValueOf != null) {
                    ((SharedPreferences) tVar.getValue()).edit().putLong("KEY_USER_ID", lValueOf.longValue()).putString("KEY_ENVIRONMENT", aVarValueOf.name()).apply();
                    break;
                }
                break;
        }
    }
}
