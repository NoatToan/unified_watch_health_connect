package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class urs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36068b;
    public int c;

    public urs(int i, int i2, int i3) {
        this.f36067a = i;
        this.f36068b = i2;
        this.c = i3;
    }

    public int a() {
        return this.f36068b;
    }

    public String toString() {
        return "AsyncPieceEvent{appId=" + this.f36067a + ", protocol=" + this.f36068b + ", result=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
