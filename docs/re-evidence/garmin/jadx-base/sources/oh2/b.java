package oh2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loh2/b;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f132168a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f132169b = new hi2.d("DSL-ControlsMenuDataLoader", null, 2, null);

    private b() {
    }

    public static a a(List list) {
        rh2.a aVar;
        c cVar;
        int iH;
        List list2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                Object obj = map.get(TtmlNode.ATTR_ID);
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                rh2.a.f152755d.getClass();
                rh2.a[] aVarArrValues = rh2.a.values();
                int length = aVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i14];
                    if (s.g(aVar.f152757a, str2)) {
                        break;
                    }
                    i14++;
                }
                if (aVar != null) {
                    c.a aVar2 = c.f132170g;
                    Object obj2 = map.get(FirebaseAnalytics.Param.INDEX);
                    if (obj2 != null) {
                        hi2.a.C1658a c1658a = hi2.a.f83879a;
                        String string = obj2.toString();
                        c1658a.getClass();
                        iH = hi2.a.C1658a.h(string);
                    } else {
                        iH = 255;
                    }
                    Object obj3 = map.get("required");
                    if (!(obj3 instanceof Boolean)) {
                        obj3 = null;
                    }
                    Boolean bool = (Boolean) obj3;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    rh2.a aVar3 = aVar;
                    int i15 = aVar3.f152759c;
                    int i16 = aVar3.f152758b;
                    aVar2.getClass();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    int i17 = c.f132171h;
                    c.f132171h = i17 + 1;
                    cVar = new c(str2, iH, boolValueOf, i15, i16, i17);
                } else {
                    f132169b.b("Did not find control object for ".concat(str2));
                    cVar = null;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        return new a(list2, null, null, 6, null);
    }

    public static HashMap b(c cVar) {
        p pVar = new p(TtmlNode.ATTR_ID, cVar.f132172a);
        int i14 = cVar.f132173b;
        return u0.d(pVar, new p(FirebaseAnalytics.Param.INDEX, i14 != 255 ? Integer.valueOf(i14) : null), new p("required", cVar.f132174c));
    }
}
