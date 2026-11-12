package defpackage;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class mse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mse f27157b = new mse();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache<String, lse> f27158a = new LruCache<>(20);

    @VisibleForTesting
    public mse() {
    }

    public static mse b() {
        return f27157b;
    }

    public lse a(String str) {
        if (str == null) {
            return null;
        }
        return this.f27158a.get(str);
    }

    public void c(String str, lse lseVar) {
        if (str == null) {
            return;
        }
        this.f27158a.put(str, lseVar);
    }
}
