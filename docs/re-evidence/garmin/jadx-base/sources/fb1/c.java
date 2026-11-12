package fb1;

import android.graphics.Color;
import android.view.View;
import androidx.core.view.m1;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements mz.e.b, androidx.core.view.z, bb.r, u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70213a;

    public /* synthetic */ c(int i14) {
        this.f70213a = i14;
    }

    public static int d(int i14, int i15, int i16, int i17) {
        return (i14 * i15) + i16 + i17;
    }

    public static int e(fo2.p pVar, int i14, int i15) {
        return (pVar.hashCode() + i14) * i15;
    }

    public static int f(Map map, String str, cx2.b.a aVar) {
        String strValueOf = String.valueOf(map.get(str));
        aVar.getClass();
        return cx2.b.a.c(strValueOf);
    }

    public static long g(d92.b bVar, p3.m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).f().a();
    }

    public static long h(d92.b bVar, p3.o0 o0Var, boolean z14) {
        bVar.getClass();
        long jB = d92.b.a(o0Var).f().b();
        o0Var.g0(z14);
        return jB;
    }

    public static long i(gl.c cVar, p3.m mVar) {
        cVar.getClass();
        return gl.c.a(mVar).b();
    }

    public static Integer j(int i14, Integer num, String str, String str2, HashMap map) {
        map.put(num, str);
        Integer numValueOf = Integer.valueOf(i14);
        map.put(numValueOf, str2);
        return numValueOf;
    }

    public static Object k(p3.o0 o0Var, int i14, p3.m.a aVar) {
        o0Var.L(i14);
        Object objQ = o0Var.q();
        aVar.getClass();
        return objQ;
    }

    public static String l(int i14) {
        String string = GarminConnectMobileApp.a.a().getString(i14);
        string.getClass();
        return string;
    }

    public static String m(int i14, int i15, String str) {
        return str.substring(i15, str.length() - i14);
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3, List list, String str4) {
        return str + str2 + str3 + list + str4;
    }

    public static p3.o0 p(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        return mVar.E(i14);
    }

    public static void q(int i14, int i15, int i16, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i14, i15, i16)));
    }

    public static void r(int i14, String str) {
        fa.k.g(str + i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(int i14, String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i14));
    }

    public static void t(DBNameResolver dBNameResolver, ColumnName columnName, StringBuilder sb3, String str) {
        sb3.append(dBNameResolver.getColumnName(columnName));
        sb3.append(str);
    }

    public static void u(Integer num, String str, String str2, String str3, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(str2);
        sb3.append(num);
        sb3.append(str3);
    }

    public static /* synthetic */ void v(Object obj, int i14, int i15, String str) {
        throw new IllegalStateException(str + i14 + obj + i15);
    }

    public static void w(String str, String str2, String str3, StringBuilder sb3, boolean z14) {
        sb3.append(z14);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static void x(StringBuilder sb3, int i14, String str, boolean z14, String str2) {
        sb3.append(i14);
        sb3.append(str);
        sb3.append(z14);
        sb3.append(str2);
    }

    public static /* synthetic */ void y(StringBuilder sb3, Object obj) {
        sb3.append(obj);
        throw new IllegalStateException(sb3.toString());
    }

    public static long z(d92.b bVar, p3.m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).c().f();
    }

    @Override // mz.e.b
    public boolean c(Entry entry, ILineDataSet iLineDataSet) {
        switch (this.f70213a) {
            case 0:
                int i14 = d.f70216h;
                entry.getClass();
                iLineDataSet.getClass();
                return entry.getVal() <= 0.0f;
            case 1:
                int i15 = w.f70311i;
                entry.getClass();
                iLineDataSet.getClass();
                return entry.getVal() <= 0.0f;
            default:
                int i16 = y.f70317h;
                entry.getClass();
                iLineDataSet.getClass();
                return entry.getVal() <= 0.0f;
        }
    }

    @Override // bb.r
    public bb.n[] createExtractors() {
        return new bb.n[]{new gb.b()};
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f70213a) {
            case 13:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(519);
                eVarI.getClass();
                view2.setPadding(view2.getPaddingLeft(), eVarI.f25191b, view2.getPaddingRight(), view2.getPaddingBottom());
                return m1.f6507b;
            default:
                UserProfileActivity.a aVar2 = UserProfileActivity.f46494x;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(519);
                eVarI2.getClass();
                view2.setPadding(eVarI2.f25190a, eVarI2.f25191b, eVarI2.f25192c, 0);
                return m1Var;
        }
    }

    @Override // u03.a
    public void run() {
    }
}
