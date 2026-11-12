package com.huawei.health.manager.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MotionType {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f8144c;

    public static int c(int i, int i2) {
        if (i == 2) {
            return 20005;
        }
        if (i == 3) {
            return 20003;
        }
        if (i == 4) {
            return 20002;
        }
        if (i != 6) {
            return i2;
        }
        return 20004;
    }

    public static int d(int i) {
        switch (i) {
            case 20002:
                return 4;
            case 20003:
                return 3;
            case 20004:
                return 6;
            case 20005:
                return 2;
            default:
                return 0;
        }
    }

    static {
        HashMap map = new HashMap(16);
        f8144c = map;
        map.put(2, 1);
        map.put(6, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(0, 6);
        map.put(1, 7);
    }

    private MotionType() {
    }

    public static int b(int i, int i2) {
        Map<Integer, Integer> map = f8144c;
        Integer num = map.get(Integer.valueOf(i));
        Integer num2 = map.get(Integer.valueOf(i2));
        if (num == null) {
            if (num2 == null) {
                return 0;
            }
        } else if (num2 == null || num.intValue() <= num2.intValue()) {
            return i;
        }
        return i2;
    }

    public static int e(int i) {
        return c(i, 20002);
    }
}
