package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/k;", "Lei2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends ei2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f71798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        context.getClass();
        this.f71798d = new hi2.d("StepsGoalTransform", null, 2, null);
    }

    @Override // ei2.b, ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        int iH;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        int iH2 = 0;
        if (listC4 != null) {
            iH = 0;
            for (Map<String, Object> map2 : listC4) {
                mh2.i iVar = mh2.i.ID;
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.DEVICE_GOAL.f118678a)) {
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a.getClass();
                    iH = hi2.a.C1658a.h(strD);
                }
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.USER_GOAL.f118678a)) {
                    hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                    String strD2 = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a2.getClass();
                    iH2 = hi2.a.C1658a.h(strD2);
                }
            }
        } else {
            iH = 0;
        }
        return iH2 <= 0 ? String.valueOf(iH) : String.valueOf(iH2);
    }

    @Override // ei2.b, ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        int iH;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        int iH2 = 0;
        if (listC4 != null) {
            iH = 0;
            for (Map<String, Object> map2 : listC4) {
                mh2.i iVar = mh2.i.ID;
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.DEVICE_GOAL.f118678a)) {
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a.getClass();
                    iH = hi2.a.C1658a.h(strD);
                }
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.USER_GOAL.f118678a)) {
                    hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                    String strD2 = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a2.getClass();
                    iH2 = hi2.a.C1658a.h(strD2);
                }
            }
        } else {
            iH = 0;
        }
        if (iH2 <= 0) {
            iH2 = iH;
        }
        HashMap map3 = new HashMap();
        ds.e0.o(iH2, map3, mh2.i.DS_SELECTED_VALUE.f118617a);
        return map3;
    }

    @Override // ei2.b, ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        hi2.a.C1658a c1658a = hi2.a.f83879a;
        String strValueOf = String.valueOf(obj);
        c1658a.getClass();
        long jA = hi2.a.C1658a.a(strValueOf);
        Object obj2 = map.get(mh2.i.VALUE_ID.f118617a);
        if (obj2 != null) {
            bVar.L4(Long.valueOf(jA), obj2.toString());
        }
    }

    @Override // ei2.b
    /* JADX INFO: renamed from: r, reason: from getter */
    public final hi2.d getF71798d() {
        return this.f71798d;
    }
}
