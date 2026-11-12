package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class y9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f39957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f39958b;
    public Class<?> c;

    public y9g() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f39957a = cls;
        this.f39958b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y9g y9gVar = (y9g) obj;
        return this.f39957a.equals(y9gVar.f39957a) && this.f39958b.equals(y9gVar.f39958b) && ulq.e(this.c, y9gVar.c);
    }

    public int hashCode() {
        int iHashCode = ((this.f39957a.hashCode() * 31) + this.f39958b.hashCode()) * 31;
        Class<?> cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f39957a + ", second=" + this.f39958b + AbstractJsonLexerKt.END_OBJ;
    }

    public y9g(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
