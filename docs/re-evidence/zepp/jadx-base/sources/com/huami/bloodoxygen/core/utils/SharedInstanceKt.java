package com.huami.bloodoxygen.core.utils;

import com.google.gson.Gson;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001c\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/google/gson/Gson;", "a", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson", "core_release"}, k = 2, mv = {1, 5, 1})
public final class SharedInstanceKt {

    @NotNull
    private static final Gson a = new Gson();

    @NotNull
    public static final Gson getGson() {
        return a;
    }
}
