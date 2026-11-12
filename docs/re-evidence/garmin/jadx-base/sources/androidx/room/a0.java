package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import java.util.ArrayList;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements androidx.transition.m.i, u03.a, androidx.core.view.z, p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10717a;

    public /* synthetic */ a0(int i14) {
        this.f10717a = i14;
    }

    public static int b(Integer num, r1.l lVar, lc.v vVar) {
        int iIntValue = num.intValue();
        lVar.getClass();
        vVar.getClass();
        return iIntValue;
    }

    public static long c(p3.m mVar) {
        return d92.b.a(mVar).f().a();
    }

    public static View d(ViewGroup viewGroup, int i14, ViewGroup viewGroup2, boolean z14) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i14, viewGroup2, z14);
    }

    public static String e(int i14, Context context) {
        context.getClass();
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    public static String f(long j8, String str, String str2) {
        return str + j8 + str2;
    }

    public static String g(Integer num, String str) {
        return str + num;
    }

    public static String h(String str, v2 v2Var, String str2) {
        return str + v2Var + str2;
    }

    public static String i(String str, Integer num, String str2) {
        return str + num + str2;
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String k(String str, ArrayList arrayList) {
        return str + arrayList;
    }

    public static String l(StringBuilder sb3, long j8, char c14) {
        sb3.append(j8);
        sb3.append(c14);
        return sb3.toString();
    }

    public static String m(StringBuilder sb3, String str, char c14) {
        sb3.append(str);
        sb3.append(c14);
        return sb3.toString();
    }

    public static Scope n(KoinComponent koinComponent) {
        return koinComponent.getKoin().getScopeRegistry().getRootScope();
    }

    public static p3.o0 o(e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        aVar.getClass();
        lVar.getClass();
        return mVar.E(i14);
    }

    public static p3.o0 p(e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        lVar.getClass();
        aVar.getClass();
        return mVar.E(i14);
    }

    public static p3.o0 q(lc.v vVar, lc.m0 m0Var, p3.m mVar, int i14) {
        vVar.getClass();
        m0Var.getClass();
        return mVar.E(i14);
    }

    public static void r(Context context, Class cls) {
        context.startActivity(new Intent(context, (Class<?>) cls));
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3, Object obj4, Throwable th3) {
        throw new RuntimeException(str + obj + obj2 + obj3 + obj4, th3);
    }

    public static void u(k22.a aVar, int i14, ArrayList arrayList, int i15, int i16) {
        arrayList.add(aVar.getString(i14));
        arrayList.add(aVar.getString(i15));
        arrayList.add(aVar.getString(i16));
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new MaintenanceException(str + obj);
    }

    @Override // androidx.transition.m.i
    public void a(androidx.transition.m.h hVar, androidx.transition.m mVar, boolean z14) {
        switch (this.f10717a) {
            case 2:
                hVar.onTransitionStart(mVar, z14);
                break;
            case 3:
                hVar.onTransitionEnd(mVar, z14);
                break;
            case 4:
                hVar.onTransitionCancel(mVar);
                break;
            case 5:
                hVar.onTransitionPause(mVar);
                break;
            default:
                hVar.onTransitionResume(mVar);
                break;
        }
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        b0.l0.c cVar = b0.l0.C;
        return null;
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f10717a) {
            case 18:
                az1.h.a aVar = az1.h.f13755m;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1Var;
            default:
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(3);
                eVarI2.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = eVarI2.f25191b;
                marginLayoutParams.bottomMargin = eVarI2.f25193d;
                view2.setLayoutParams(marginLayoutParams);
                return m1.f6507b;
        }
    }

    @Override // u03.a
    public void run() {
        Logger logger = as2.f.f12699e;
    }
}
