package com.huawei.hihealth.dictionary.constants;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ProductMap {
    private static final Map<String, Set<ProductMapInfo>> d;
    private static final Map<String, ProductMapInfo> f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Set<ProductMapInfo>> f12268a = new ConcurrentHashMap();
    private static final Map<String, Set<ProductMapInfo>> j = new ConcurrentHashMap();
    private static final Map<String, Set<ProductMapInfo>> h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Set<ProductMapInfo>> f12269b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Set<ProductMapInfo>> f12270c = new ConcurrentHashMap();
    private static final Map<String, Set<ProductMapInfo>> e = new ConcurrentHashMap();

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        d = concurrentHashMap;
        ProductMapInfo productMapInfo = new ProductMapInfo("001", null, null, null, null, null, 1);
        HashSet hashSet = new HashSet(1);
        hashSet.add(productMapInfo);
        concurrentHashMap.put(String.valueOf(1), hashSet);
        concurrentHashMap.put(String.valueOf(10001), hashSet);
    }

    private ProductMap() {
    }

    public static void b(ProductMapInfo productMapInfo) {
        synchronized (ProductMap.class) {
            if (productMapInfo == null) {
                return;
            }
            String strG = productMapInfo.g();
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            f.put(strG, productMapInfo);
            e(f12268a, "deviceType", productMapInfo);
            e(j, "smartProductId", productMapInfo);
            e(h, "productId", productMapInfo);
            e(f12269b, "modelName", productMapInfo);
            e(f12270c, "manufacturerId", productMapInfo);
            e(e, "marketingName", productMapInfo);
            e(d, "deviceId", productMapInfo);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    private static void e(Map<String, Set<ProductMapInfo>> map, String str, ProductMapInfo productMapInfo) {
        String strD;
        str.hashCode();
        switch (str) {
            case "modelName":
                strD = productMapInfo.d();
                break;
            case "productId":
                strD = productMapInfo.f();
                break;
            case "marketingName":
                strD = productMapInfo.b();
                break;
            case "smartProductId":
                strD = productMapInfo.g();
                break;
            case "deviceType":
                strD = productMapInfo.e();
                break;
            case "deviceId":
                strD = String.valueOf(productMapInfo.c());
                break;
            case "manufacturerId":
                strD = productMapInfo.a();
                break;
            default:
                return;
        }
        Set<ProductMapInfo> hashSet = (TextUtils.isEmpty(strD) || !map.containsKey(strD)) ? null : map.get(strD);
        if (hashSet == null) {
            hashSet = new HashSet<>(10);
        }
        hashSet.add(productMapInfo);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        map.put(strD, hashSet);
    }

    public static ArrayList<ProductMapInfo> e() {
        ArrayList<ProductMapInfo> arrayList = new ArrayList<>();
        arrayList.addAll(f.values());
        return arrayList;
    }

    public static ProductMapInfo d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, ProductMapInfo> map = f;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    public static List<ProductMapInfo> c(String str, String str2) {
        str.hashCode();
        switch (str) {
            case "modelName":
                return b(f12269b, str2);
            case "productId":
                return b(h, str2);
            case "marketingName":
                return b(e, str2);
            case "smartProductId":
                return b(j, str2);
            case "deviceType":
                return b(f12268a, str2);
            case "deviceId":
                return b(d, str2);
            case "manufacturerId":
                return b(f12270c, str2);
            default:
                return new ArrayList();
        }
    }

    private static List<ProductMapInfo> b(Map<String, Set<ProductMapInfo>> map, String str) {
        ArrayList arrayList;
        synchronized (ProductMap.class) {
            arrayList = new ArrayList();
            if (map.containsKey(str) && map.get(str) != null) {
                arrayList = new ArrayList(map.get(str));
            }
        }
        return arrayList;
    }
}
