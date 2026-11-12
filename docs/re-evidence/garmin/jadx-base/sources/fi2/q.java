package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/q;", "Lei2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q extends ei2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f71803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context);
        context.getClass();
        this.f71803d = new hi2.d("HydrationDailyGoalTransform", hi2.e.HYDRATION.f83902a);
    }

    @Override // ei2.b, ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        List<Map> listG4 = ii2.b.G4(map);
        if (listG4 == null) {
            throw new NoSuchElementException("This transform does not have the required unit dependency. attributeMap=[" + map + "]");
        }
        String strD = "";
        for (Map map2 : listG4) {
            if (p005kotlin.jvm.internal.s.g(map2.get(mh2.i.ID.f118617a), mh2.m.UNIT.f118678a)) {
                Object obj = map2.get(mh2.i.VALUE_ID.f118617a);
                obj.getClass();
                strD = d(bVar, (String) obj);
            }
        }
        String strE = ei2.h.e(bVar, map);
        hi2.a.f83879a.getClass();
        String strValueOf = String.valueOf(hi2.a.C1658a.h(strE));
        x0 x0Var = x0.f105818a;
        String string = this.f64388a.getString(R.string.generic_value_with_unit_string);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{strValueOf, strD}, 2));
    }

    @Override // ei2.b, ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        Map map2;
        mh2.i iVar = mh2.i.VALUE_ID;
        String strD = d(bVar, String.valueOf(map.get(iVar.f118617a)));
        hi2.a.f83879a.getClass();
        int iH = hi2.a.C1658a.h(strD);
        List listG4 = ii2.b.G4(map);
        if (listG4 != null && (map2 = (Map) p13.h0.d0(listG4)) != null && p005kotlin.jvm.internal.s.g(map2.get(mh2.i.ID.f118617a), mh2.m.UNIT.f118678a)) {
            Object obj = map2.get(iVar.f118617a);
            obj.getClass();
            return u0.d(new o13.p(mh2.i.DS_SELECTED_UNIT.f118617a, d(bVar, (String) obj)), new o13.p(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer(iH)));
        }
        throw new NoSuchElementException("This transform does not have the required unit dependency. attributeMap=[" + map + "]");
    }

    @Override // ei2.b
    /* JADX INFO: renamed from: r, reason: from getter */
    public final hi2.d getF71803d() {
        return this.f71803d;
    }
}
