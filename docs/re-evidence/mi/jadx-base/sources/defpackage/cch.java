package defpackage;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cch implements pzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap<wbh<?>, Object> f5184b = new l93();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(wbh<T> wbhVar, Object obj, MessageDigest messageDigest) {
        wbhVar.g(obj, messageDigest);
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f5184b.getSize(); i++) {
            f(this.f5184b.keyAt(i), this.f5184b.valueAt(i), messageDigest);
        }
    }

    public <T> T c(wbh<T> wbhVar) {
        return this.f5184b.containsKey(wbhVar) ? (T) this.f5184b.get(wbhVar) : wbhVar.c();
    }

    public void d(cch cchVar) {
        this.f5184b.putAll((SimpleArrayMap<? extends wbh<?>, ? extends Object>) cchVar.f5184b);
    }

    public <T> cch e(wbh<T> wbhVar, T t) {
        this.f5184b.put(wbhVar, t);
        return this;
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (obj instanceof cch) {
            return this.f5184b.equals(((cch) obj).f5184b);
        }
        return false;
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return this.f5184b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f5184b + AbstractJsonLexerKt.END_OBJ;
    }
}
