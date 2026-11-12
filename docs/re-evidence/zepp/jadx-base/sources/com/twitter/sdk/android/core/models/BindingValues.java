package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class BindingValues {
    private final Map<String, Object> a;

    public BindingValues() {
        this(Collections.EMPTY_MAP);
    }

    public boolean containsKey(String str) {
        return this.a.containsKey(str);
    }

    public <T> T get(String str) {
        try {
            return (T) this.a.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public BindingValues(Map<String, Object> map) {
        this.a = Collections.unmodifiableMap(map);
    }
}
