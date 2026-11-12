package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class n implements Iterable<String> {
    public final /* synthetic */ CharSequence a;
    public final /* synthetic */ zzx b;

    public n(zzx zzxVar, CharSequence charSequence) {
        this.b = zzxVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.d(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        Iterator<String> it2 = iterator();
        try {
            if (it2.hasNext()) {
                sb.append(zzq.a(it2.next(), ", "));
                while (it2.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zzq.a(it2.next(), ", "));
                }
            }
            sb.append(JsonLexerKt.END_LIST);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
