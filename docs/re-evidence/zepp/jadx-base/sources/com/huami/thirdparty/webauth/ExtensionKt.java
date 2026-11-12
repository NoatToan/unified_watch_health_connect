package com.huami.thirdparty.webauth;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001aE\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"K", "V", "", "", "toJsonObject", "", "Lkotlin/Pair;", "pairs", "jsonObject", "([Lkotlin/Pair;)Ljava/lang/String;", "webauth_release"}, k = 2, mv = {1, 4, 1})
public final class ExtensionKt {
    @NotNull
    public static final <K, V> String jsonObject(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return toJsonObject(r.mapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    @NotNull
    public static final <K, V> String toJsonObject(@NotNull Map<K, ? extends V> map) {
        return new JSONObject(map).toString();
    }
}
