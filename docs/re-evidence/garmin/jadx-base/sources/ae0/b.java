package ae0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import e32.o;
import hs1.n;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae0/b;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    public static List a(String str, o oVar) {
        if (oVar == null) {
            List listB = b(str);
            return listB == null ? j0.f134944a : listB;
        }
        List listB2 = b(str);
        if (listB2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB2) {
                LocalDate localDateB = ((hs1.d) obj).b();
                if (localDateB != null ? localDateB.isAfter(LocalDate.now().minusDays(oVar.f62819a)) : false) {
                    arrayList.add(obj);
                }
            }
            List listN0 = h0.N0(arrayList, new a());
            if (listN0 == null) {
                listN0 = j0.f134944a;
            }
            if (listN0 != null) {
                return listN0;
            }
        }
        return j0.f134944a;
    }

    public static List b(String str) {
        if (str != null) {
            try {
                List<hs1.d> listA = ((n) new Gson().fromJson(str, n.class)).a();
                if (listA != null) {
                    return listA;
                }
            } catch (Exception e4) {
                a2 a2Var = a2.DASHBOARD;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[GetDailyUserSummariesUseCase] parseData -> Exception ");
                i2.f36769a.getClass();
                i2.a.e(a2Var, strD);
                return null;
            }
        }
        a2 a2Var2 = a2.DASHBOARD;
        i2.f36769a.getClass();
        i2.a.e(a2Var2, "[GetDailyUserSummariesUseCase] parseData -> null server data");
        return null;
    }
}
