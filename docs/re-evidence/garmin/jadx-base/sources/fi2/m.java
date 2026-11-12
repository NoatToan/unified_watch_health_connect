package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/m;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends ei2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        List<Map> list;
        String strE = ei2.h.e(bVar, map);
        Object obj = map.get(mh2.i.CHILD.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            Object obj2 = map2.get(mh2.i.SETTINGS.f118617a);
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            list = (List) obj2;
            hi2.d dVar = bVar.f93792b;
            Objects.toString(list);
            dVar.getClass();
        } else {
            list = null;
        }
        if (list != null) {
            for (Map map3 : list) {
                hi2.a.C1658a c1658a = hi2.a.f83879a;
                Object obj3 = map3.get(mh2.i.VALUE.f118617a);
                String string = obj3 != null ? obj3.toString() : null;
                c1658a.getClass();
                String strI = hi2.a.C1658a.i(string);
                if (strI == null || strI.length() == 0) {
                    strI = "";
                }
                if (strE.equals(strI)) {
                    String strValueOf = String.valueOf(map3.get(mh2.i.DISPLAY.f118617a));
                    ArrayList arrayListY4 = ii2.b.y4(map);
                    hi2.i.f83907a.getClass();
                    return hi2.i.a.c(this.f64388a, strValueOf, arrayListY4);
                }
            }
        }
        return strE.length() > 0 ? strE : "--";
    }
}
