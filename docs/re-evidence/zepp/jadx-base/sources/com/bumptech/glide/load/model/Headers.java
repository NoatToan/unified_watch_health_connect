package com.bumptech.glide.load.model;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface Headers {

    @Deprecated
    public static final Headers NONE = new a();
    public static final Headers DEFAULT = new LazyHeaders.Builder().build();

    public class a implements Headers {
        @Override // com.bumptech.glide.load.model.Headers
        public Map<String, String> getHeaders() {
            return Collections.emptyMap();
        }
    }

    Map<String, String> getHeaders();
}
