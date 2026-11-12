package rc;

import android.os.Bundle;
import androidx.lifecycle.j1;
import java.util.Map;
import lc.q0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lrc/j;", "Ll63/a;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "", "Llc/q0;", "typeMap", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "Landroidx/lifecycle/j1;", "handle", "(Landroidx/lifecycle/j1;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends l63.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f151845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f151847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p63.c f151848e;

    public j(Bundle bundle, Map<String, ? extends q0<?>> map) {
        bundle.getClass();
        map.getClass();
        this.f151846c = -1;
        this.f151847d = "";
        this.f151848e = p63.h.f136264a;
        this.f151845b = new m(bundle, map);
    }

    @Override // l63.a, l63.e
    public final boolean D() {
        return this.f151845b.b(this.f151847d) != null;
    }

    @Override // l63.a
    public final Object E() {
        return F();
    }

    public final Object F() {
        Object objB = this.f151845b.b(this.f151847d);
        if (objB != null) {
            return objB;
        }
        o2.c.s(this.f151847d, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // l63.e, l63.c
    /* JADX INFO: renamed from: a */
    public final p63.e getF129870c() {
        return this.f151848e;
    }

    @Override // l63.c
    public final int e(k63.e eVar) {
        String strD;
        eVar.getClass();
        int i14 = this.f151846c;
        do {
            i14++;
            if (i14 >= eVar.getF103235c()) {
                return -1;
            }
            strD = eVar.d(i14);
        } while (!this.f151845b.a(strD));
        this.f151846c = i14;
        this.f151847d = strD;
        return i14;
    }

    @Override // l63.e
    public final <T> T h(i63.b<? extends T> bVar) {
        bVar.getClass();
        return (T) F();
    }

    @Override // l63.a, l63.e
    public final l63.e k(k63.e eVar) {
        eVar.getClass();
        if (l.f(eVar)) {
            this.f151847d = eVar.d(0);
            this.f151846c = 0;
        }
        return this;
    }

    public j(j1 j1Var, Map<String, ? extends q0<?>> map) {
        j1Var.getClass();
        map.getClass();
        this.f151846c = -1;
        this.f151847d = "";
        this.f151848e = p63.h.f136264a;
        this.f151845b = new n(j1Var, map);
    }
}
