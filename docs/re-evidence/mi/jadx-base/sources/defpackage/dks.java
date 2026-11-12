package defpackage;

import com.autonavi.base.ae.gmap.style.StyleItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class dks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, StyleItem> f15639a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15640b = null;
    public StyleItem[] c;

    public final Map<Integer, StyleItem> a() {
        return this.f15639a;
    }

    public final StyleItem[] b() {
        Map<Integer, StyleItem> map = this.f15639a;
        if (map != null && map.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (StyleItem styleItem : this.f15639a.values()) {
                if (styleItem.isValid()) {
                    arrayList.add(styleItem);
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                StyleItem[] styleItemArr = (StyleItem[]) arrayList.toArray(new StyleItem[size]);
                this.c = styleItemArr;
                return styleItemArr;
            }
        }
        return null;
    }

    public final StyleItem[] c() {
        return this.c;
    }

    public final Object d() {
        return this.f15640b;
    }
}
