package org.acra.config;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class BaseHttpConfigurationBuilder {
    private final Map<String, String> a = new HashMap();

    @NonNull
    public Map<String, String> a() {
        return this.a;
    }

    public void setHttpHeaders(@NonNull Map<String, String> map) {
        this.a.clear();
        this.a.putAll(map);
    }
}
