package ei2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lei2/b;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f64384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.f64384c = new hi2.d("BaseNumberInputTransform", null, 2, null);
    }

    @Override // ei2.h
    public String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String strE = h.e(bVar, map);
        getF71797d().getClass();
        if (strE.length() <= 0) {
            return "--";
        }
        hi2.a.f83879a.getClass();
        return String.valueOf(hi2.a.C1658a.h(strE));
    }

    @Override // ei2.h
    public HashMap i(ii2.b bVar, Map map, int i14) {
        String strE = h.e(bVar, map);
        HashMap map2 = new HashMap();
        if (strE.length() > 0) {
            String str = mh2.i.DS_SELECTED_VALUE.f118617a;
            hi2.a.f83879a.getClass();
            e0.o(hi2.a.C1658a.h(strE), map2, str);
        }
        return map2;
    }

    @Override // ei2.h
    public void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        hi2.a.C1658a c1658a = hi2.a.f83879a;
        String strValueOf = String.valueOf(obj);
        c1658a.getClass();
        long jA = hi2.a.C1658a.a(strValueOf);
        Object obj2 = map.get(mh2.i.VALUE_ID.f118617a);
        obj2.getClass();
        bVar.L4(Long.valueOf(jA), (String) obj2);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public hi2.d getF71797d() {
        return this.f64384c;
    }
}
