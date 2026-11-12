package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class bd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4082b;

    public bd8(int i, String str) {
        this.f4081a = i;
        this.f4082b = str;
    }

    public String toString() {
        return "Error{mCode=" + this.f4081a + ", mDetail='" + this.f4082b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
