package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ews {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17142b;
    public int c;
    public int d;

    public ews() {
        this.f17142b = 0;
        this.d = 255;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.f17142b;
    }

    public int c() {
        return this.f17141a;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "PageItem{index=" + this.f17141a + ", flag=" + this.f17142b + ", currentType=" + this.c + ", parentType=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public ews(int i, int i2, int i3, boolean z) {
        this.f17142b = 0;
        this.f17141a = i;
        this.c = i2;
        this.d = i3;
        this.f17142b = z ? 1 : 0;
    }
}
