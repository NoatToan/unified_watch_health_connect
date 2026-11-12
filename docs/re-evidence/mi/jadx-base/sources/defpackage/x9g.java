package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class x9g implements c93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c93> f38888a;

    public x9g(List<c93> list) {
        this.f38888a = (List) b6i.g(list);
    }

    @Override // defpackage.c93
    public String a() {
        return this.f38888a.get(0).a();
    }

    @Override // defpackage.c93
    public boolean b(Uri uri) {
        for (int i = 0; i < this.f38888a.size(); i++) {
            if (this.f38888a.get(i).b(uri)) {
                return true;
            }
        }
        return false;
    }

    public List<c93> c() {
        return this.f38888a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x9g) {
            return this.f38888a.equals(((x9g) obj).f38888a);
        }
        return false;
    }

    public int hashCode() {
        return this.f38888a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f38888a.toString();
    }
}
