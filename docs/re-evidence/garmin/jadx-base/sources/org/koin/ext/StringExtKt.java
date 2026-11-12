package org.koin.ext;

import d53.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"clearQuotes", "", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringExtKt {
    public static final String clearQuotes(String str) {
        str.getClass();
        return (str.length() > 1 && y.p0(str) == '\"' && y.r0(str) == '\"') ? str.substring(1, str.length() - 1) : str;
    }
}
