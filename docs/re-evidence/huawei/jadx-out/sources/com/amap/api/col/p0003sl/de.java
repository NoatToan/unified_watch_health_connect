package com.amap.api.col.p0003sl;

import com.autonavi.base.ae.gmap.style.StyleItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, StyleItem> f2364a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f2365b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StyleItem[] f2366c;

    public final Map<Integer, StyleItem> a() {
        return this.f2364a;
    }

    public final StyleItem[] b() {
        Map<Integer, StyleItem> map = this.f2364a;
        if (map == null || map.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StyleItem styleItem : this.f2364a.values()) {
            if (styleItem.isValid()) {
                arrayList.add(styleItem);
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        StyleItem[] styleItemArr = (StyleItem[]) arrayList.toArray(new StyleItem[size]);
        this.f2366c = styleItemArr;
        return styleItemArr;
    }

    public final StyleItem[] c() {
        return this.f2366c;
    }

    public final Object d() {
        return this.f2365b;
    }
}
