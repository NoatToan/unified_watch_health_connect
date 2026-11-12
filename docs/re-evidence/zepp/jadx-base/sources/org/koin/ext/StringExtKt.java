package org.koin.ext;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"", "clearQuotes", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class StringExtKt {
    @NotNull
    public static final String clearQuotes(@NotNull String str) {
        return (str.length() > 1 && StringsKt___StringsKt.first(str) == '\"' && StringsKt___StringsKt.last(str) == '\"') ? str.substring(1, StringsKt__StringsKt.getLastIndex(str)) : str;
    }
}
