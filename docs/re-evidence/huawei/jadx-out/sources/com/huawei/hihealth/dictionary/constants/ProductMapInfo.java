package com.huawei.hihealth.dictionary.constants;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class ProductMapInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12273c;
    private int d;
    private String e;
    private Map<String, String> g;
    private String h;
    private String i;
    private OptionalFileds j;

    public static class OptionalFileds {
        private String e;

        public void b(String str) {
            this.e = str;
        }

        public int hashCode() {
            return Objects.hash(this.e);
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof OptionalFileds) {
                return TextUtils.equals(this.e, ((OptionalFileds) obj).e);
            }
            return false;
        }

        public String toString() {
            return "OptionalFileds{deviceEnName='" + this.e + "'}";
        }
    }

    public ProductMapInfo(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f12272b = str;
        this.i = str2;
        this.h = str3;
        this.f12271a = str4;
        this.e = str5;
        this.f12273c = str6;
        this.d = i;
    }

    public String e() {
        return this.f12272b;
    }

    public String g() {
        return this.i;
    }

    public String f() {
        return this.h;
    }

    public String d() {
        return this.f12271a;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.f12273c;
    }

    public String c(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.g) == null) {
            return this.f12273c;
        }
        String str2 = map.get(str);
        return str2 != null ? str2 : this.f12273c;
    }

    public int c() {
        return this.d;
    }

    public void c(OptionalFileds optionalFileds) {
        this.j = optionalFileds;
    }

    public void b(Map<String, String> map) {
        this.g = map;
    }

    public int hashCode() {
        String str = this.f12272b;
        String str2 = this.i;
        String str3 = this.h;
        String str4 = this.f12271a;
        String str5 = this.e;
        String str6 = this.f12273c;
        int i = this.d;
        return Objects.hash(str, str2, str3, str4, str5, str6, Integer.valueOf(i), this.g);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductMapInfo) {
            ProductMapInfo productMapInfo = (ProductMapInfo) obj;
            if (TextUtils.equals(this.f12272b, productMapInfo.f12272b) && TextUtils.equals(this.i, productMapInfo.i) && TextUtils.equals(this.h, productMapInfo.h) && TextUtils.equals(this.f12271a, productMapInfo.f12271a) && TextUtils.equals(this.e, productMapInfo.e) && TextUtils.equals(this.f12273c, productMapInfo.f12273c) && this.d == productMapInfo.d && c(this.j, productMapInfo.j) && d(this.g, productMapInfo.g)) {
                return true;
            }
        }
        return false;
    }

    private boolean d(Map<String, String> map, final Map<String, String> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        return map.entrySet().stream().allMatch(new Predicate() { // from class: com.huawei.hihealth.dictionary.constants.ProductMapInfo$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ProductMapInfo.b(map2, (Map.Entry) obj);
            }
        });
    }

    static /* synthetic */ boolean b(Map map, Map.Entry entry) {
        if (entry.getKey() == null) {
            return false;
        }
        return Objects.equals(entry.getValue(), map.get(entry.getKey()));
    }

    private boolean c(OptionalFileds optionalFileds, OptionalFileds optionalFileds2) {
        if (optionalFileds == null && optionalFileds2 == null) {
            return true;
        }
        return optionalFileds != null && optionalFileds.equals(optionalFileds2);
    }

    public String toString() {
        return "ProductMapInfo{mDeviceType='" + this.f12272b + "', mSmartProductId='" + this.i + "', mProductId='" + this.h + "', mModelName='" + this.f12271a + "', mManufactorId='" + this.e + "', mMarketingName='" + this.f12273c + "', mDeviceId=" + this.d + ", optionalFileds=" + this.j + ", subIdMarketingNameMap=" + this.g + '}';
    }
}
