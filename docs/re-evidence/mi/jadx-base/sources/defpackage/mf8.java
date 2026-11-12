package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class mf8 {
    public static String a(Throwable th) {
        return th == null ? AbstractJsonLexerKt.NULL : tt3.y("{}: {}", th.getClass().getSimpleName(), th.getMessage());
    }
}
