package com.huawei.ohos.localability;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public enum FormState {
    UNKNOWN(0),
    VISIBLE(1),
    INVISIBLE(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, FormState> f18091b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18093a;

    public int getValue() {
        return this.f18093a;
    }

    public static FormState intToEnum(int i) {
        FormState formState = f18091b.get(Integer.valueOf(i));
        return formState == null ? UNKNOWN : formState;
    }

    FormState(int i) {
        this.f18093a = i;
    }

    static {
        for (FormState formState : values()) {
            f18091b.put(Integer.valueOf(formState.getValue()), formState);
        }
    }
}
