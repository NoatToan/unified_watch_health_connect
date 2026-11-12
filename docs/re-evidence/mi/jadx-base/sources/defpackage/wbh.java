package defpackage;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wbh<T> {
    public static final b<Object> e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f37808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f37809b;
    public final String c;
    public volatile byte[] d;

    public class a implements b<Object> {
        @Override // wbh.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public wbh(String str, T t, b<T> bVar) {
        this.c = a6i.b(str);
        this.f37808a = t;
        this.f37809b = (b) a6i.d(bVar);
    }

    public static <T> wbh<T> a(String str, T t, b<T> bVar) {
        return new wbh<>(str, t, bVar);
    }

    public static <T> b<T> b() {
        return (b<T>) e;
    }

    public static <T> wbh<T> e(String str) {
        return new wbh<>(str, null, b());
    }

    public static <T> wbh<T> f(String str, T t) {
        return new wbh<>(str, t, b());
    }

    public T c() {
        return this.f37808a;
    }

    public final byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(pzd.f30934a);
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wbh) {
            return this.c.equals(((wbh) obj).c);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.f37809b.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
