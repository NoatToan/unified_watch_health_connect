package com.huawei.agconnect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class AGCRoutePolicy {
    private final int route;
    public static final AGCRoutePolicy UNKNOWN = new AGCRoutePolicy(0);
    public static final AGCRoutePolicy CHINA = new AGCRoutePolicy(1);
    public static final AGCRoutePolicy GERMANY = new AGCRoutePolicy(2);
    public static final AGCRoutePolicy RUSSIA = new AGCRoutePolicy(3);
    public static final AGCRoutePolicy SINGAPORE = new AGCRoutePolicy(4);

    public int hashCode() {
        return hash(Integer.valueOf(this.route));
    }

    public String getRouteName() {
        int i = this.route;
        if (i == 1) {
            return "CN";
        }
        if (i == 2) {
            return "DE";
        }
        if (i != 3) {
            return i != 4 ? "UNKNOWN" : "SG";
        }
        return "RU";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AGCRoutePolicy.class == obj.getClass() && this.route == ((AGCRoutePolicy) obj).route;
    }

    private int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    private AGCRoutePolicy(int i) {
        this.route = i;
    }
}
