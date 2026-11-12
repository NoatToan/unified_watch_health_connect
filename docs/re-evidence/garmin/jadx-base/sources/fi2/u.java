package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/u;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71807c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        context.getClass();
        this.f71807c = new hi2.d("PeriodCycleLengthTransform", hi2.e.MCT.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String strE = ei2.h.e(bVar, map);
        this.f71807c.getClass();
        if (strE.length() <= 0) {
            return "--";
        }
        hi2.a.f83879a.getClass();
        int iH = hi2.a.C1658a.h(hi2.a.C1658a.b(strE, hi2.a.f83881c));
        String quantityString = this.f64388a.getResources().getQuantityString(R.plurals.number_of_days_with_value, iH, Integer.valueOf(iH));
        quantityString.getClass();
        return quantityString;
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        Map map2;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        HashMap map3 = new HashMap();
        if (listC4 != null && (map2 = (Map) p13.h0.d0(listC4)) != null) {
            Object obj = map2.get(mh2.i.VALUE_ID.f118617a);
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                String strD = d(bVar, str);
                if (strD.length() > 0) {
                    hi2.a.f83879a.getClass();
                    int iH = hi2.a.C1658a.h(strD) + 1;
                    this.f71807c.getClass();
                    map3.put(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(iH));
                } else {
                    ds.e0.o(1, map3, mh2.i.DS_MINIMUM_VALUE.f118617a);
                }
                map3.put(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(365));
                String strE = ei2.h.e(bVar, map);
                if (strE.length() > 0) {
                    String str2 = mh2.i.DS_SELECTED_VALUE.f118617a;
                    hi2.a.f83879a.getClass();
                    ds.e0.o(hi2.a.C1658a.h(strE), map3, str2);
                }
            }
        }
        return map3;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        bVar.L4(String.valueOf(obj), String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lfi2/u$a;", "", "<init>", "()V", "", "PERIOD_CYCLE_MAX", "I", "PERIOD_CYCLE_MIN", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
