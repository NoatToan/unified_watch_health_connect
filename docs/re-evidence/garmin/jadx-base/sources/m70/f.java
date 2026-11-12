package m70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;
import p006l2.v0;
import r70.r;
import r70.s;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final r a(s sVar) {
        sVar.getClass();
        String strA = sVar.a();
        try {
            return (r) KoinJavaComponent.get(r.class, QualifierKt.named(strA), new v0(sVar, 23));
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.DASHBOARD;
            String strConcat = "Failed to get dashboard composable with qualifier: ".concat(strA);
            aVar.getClass();
            i2.a.o(a2Var, strConcat);
            return null;
        }
    }

    public static final s b(Object obj, String str) {
        str.getClass();
        try {
            return (s) KoinJavaComponent.get(s.class, QualifierKt.named(str), new c53.p(obj, 1));
        } catch (Exception unused) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.o(a2.DASHBOARD, "Failed to get dashboard item state holder with qualifier: " + str + " and params");
            return null;
        }
    }
}
