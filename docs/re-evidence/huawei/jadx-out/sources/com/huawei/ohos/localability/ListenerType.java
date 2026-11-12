package com.huawei.ohos.localability;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public enum ListenerType {
    VISIBLE(0),
    INVISIBLE(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, ListenerType> f18094b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18096a;

    public int getValue() {
        return this.f18096a;
    }

    public static ListenerType intToEnum(int i) {
        ListenerType listenerType = f18094b.get(Integer.valueOf(i));
        return listenerType == null ? VISIBLE : listenerType;
    }

    ListenerType(int i) {
        this.f18096a = i;
    }

    static {
        for (ListenerType listenerType : values()) {
            f18094b.put(Integer.valueOf(listenerType.getValue()), listenerType);
        }
    }
}
