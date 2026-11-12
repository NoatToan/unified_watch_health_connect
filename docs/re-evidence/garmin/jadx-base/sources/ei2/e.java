package ei2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lei2/e;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f64385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        this.f64385c = new hi2.d("SelectionItemTransform", null, 2, null);
    }

    @Override // ei2.h
    public final boolean l(ii2.b bVar, Map<String, ? extends Object> map) {
        Object obj = map.get(mh2.i.VALUES.f118617a);
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<Map> list = (List) obj;
        if (list != null) {
            for (Map map2 : list) {
                if (!d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a))).equals(String.valueOf(map2.get(mh2.i.VALUE.f118617a)))) {
                    return false;
                }
            }
            return true;
        }
        String strE = h.e(bVar, map);
        String strI4 = ii2.b.I4(map);
        if (strI4 == null || strI4.length() == 0) {
            strI4 = "";
        }
        return strE.equals(strI4);
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        Unit unit;
        Unit unit2;
        String string;
        bVar.getClass();
        map.getClass();
        Object obj2 = map.get(mh2.i.VALUES.f118617a);
        Unit unit3 = null;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List<Map> list = (List) obj2;
        hi2.d dVar = this.f64385c;
        if (list != null) {
            for (Map map2 : list) {
                Object obj3 = map2.get(mh2.i.VALUE.f118617a);
                String string2 = obj3 != null ? obj3.toString() : null;
                Object obj4 = map2.get(mh2.i.VALUE_ID.f118617a);
                if (obj4 == null || (string = obj4.toString()) == null) {
                    unit2 = null;
                } else {
                    bVar.L4(string2, string);
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    Logger logger = hi2.d.f83889c;
                    dVar.getClass();
                }
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            String strI4 = ii2.b.I4(map);
            Object obj5 = map.get(mh2.i.VALUE_ID.f118617a);
            if (!(obj5 instanceof String)) {
                obj5 = null;
            }
            String str = (String) obj5;
            if (str != null) {
                bVar.L4(strI4, str);
                unit3 = Unit.INSTANCE;
            }
            if (unit3 == null) {
                dVar.getClass();
            }
        }
    }

    public void r(String str) {
    }
}
