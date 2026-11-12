package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ContentMetadata {
    public static final String KEY_CONTENT_LENGTH = "exo_len";
    public static final String KEY_CUSTOM_PREFIX = "custom_";
    public static final String KEY_REDIRECTED_URI = "exo_redir";

    boolean contains(String key);

    long get(String key, long defaultValue);

    @Nullable
    String get(String key, @Nullable String defaultValue);

    @Nullable
    byte[] get(String key, @Nullable byte[] defaultValue);
}
