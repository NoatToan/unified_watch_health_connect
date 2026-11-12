package ui;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public final class g<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f171168e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f171169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f171170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f171172d;

    public class a implements b<Object> {
        @Override // ui.g.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t7, MessageDigest messageDigest);
    }

    private g(String str, T t7, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            vb.h.s("Must not be null or empty");
            throw null;
        }
        this.f171171c = str;
        this.f171169a = t7;
        qj.l.c(bVar, "Argument must not be null");
        this.f171170b = bVar;
    }

    public static g a(String str, Number number, b bVar) {
        return new g(str, number, bVar);
    }

    public static g b(Object obj, String str) {
        return new g(str, obj, f171168e);
    }

    public static <T> g<T> c(String str) {
        return new g<>(str, null, f171168e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f171171c.equals(((g) obj).f171171c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f171171c.hashCode();
    }

    public final String toString() {
        return am.j.o(this.f171171c, "'}", new StringBuilder("Option{key='"));
    }
}
