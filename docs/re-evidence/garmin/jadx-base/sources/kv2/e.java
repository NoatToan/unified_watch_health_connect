package kv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import cx2.g;
import gw2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkv2/e;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends ev2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        Map map2;
        Map map3;
        ArrayList arrayList;
        Map map4;
        Map map5;
        d dVarN4 = cVar.N4(map);
        if (dVarN4 != null) {
            List<Integer> list = dVarN4.f106815a;
            String strB = b(dVarN4.f106816b);
            if (strB.length() > 0) {
                return strB;
            }
            Object obj = map.get(i.LINK_OPTIONS.f79975a);
            try {
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                map2 = (Map) obj;
            } catch (ClassCastException unused) {
                map2 = null;
            }
            Object obj2 = map2 != null ? map2.get(i.SELECTION_OPTIONS.f79975a) : null;
            try {
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                map3 = (Map) obj2;
            } catch (ClassCastException unused2) {
                map3 = null;
            }
            if (map3 != null) {
                Object obj3 = map3.get(i.ROWS.f79975a);
                try {
                    if (!(obj3 instanceof ArrayList)) {
                        obj3 = null;
                    }
                    arrayList = (ArrayList) obj3;
                } catch (ClassCastException unused3) {
                    arrayList = null;
                }
                if (arrayList != null && !list.isEmpty()) {
                    Iterator it = h0.M0(list).iterator();
                    String string = "";
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (iIntValue < arrayList.size() && iIntValue >= 0) {
                            Object obj4 = arrayList.get(iIntValue);
                            try {
                                if (!(obj4 instanceof Map)) {
                                    obj4 = null;
                                }
                                map4 = (Map) obj4;
                            } catch (ClassCastException unused4) {
                                map4 = null;
                            }
                            if (map4 != null) {
                                Object obj5 = map4.get(i.TITLE.f79975a);
                                try {
                                    if (!(obj5 instanceof Map)) {
                                        obj5 = null;
                                    }
                                    map5 = (Map) obj5;
                                } catch (ClassCastException unused5) {
                                    map5 = null;
                                }
                                String strB2 = b(g.b(map5));
                                if (string.length() == 0) {
                                    string = strB2;
                                } else {
                                    string = this.f207282a.getString(R.string.generic_values_separated_by_comma, string, strB2);
                                    string.getClass();
                                }
                            }
                        }
                    }
                    if (string.length() > 0) {
                        return string;
                    }
                }
            }
        }
        return "";
    }
}
