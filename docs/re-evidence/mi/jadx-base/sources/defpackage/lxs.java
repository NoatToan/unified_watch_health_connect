package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class lxs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25541b;
    public int c;
    public int d;

    public lxs() {
        this.f25540a = -1;
        this.f25541b = -1;
        this.c = -1;
        this.d = -1;
    }

    public int a() {
        return this.c;
    }

    public void b(int i) {
        this.f25541b = i;
    }

    public int c() {
        return this.d;
    }

    public void d(int i) {
        this.f25540a = i;
    }

    public String toString() {
        return "BaseResourceInfo{version=" + this.f25540a + ", flag=" + this.f25541b + ", resFlag=" + this.c + ", resVersion=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public lxs(int i, int i2, int i3, int i4) {
        this.f25540a = i;
        this.f25541b = i2;
        this.c = i3;
        this.d = i4;
    }
}
