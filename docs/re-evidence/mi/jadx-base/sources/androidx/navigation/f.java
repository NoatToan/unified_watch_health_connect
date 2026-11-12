package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
@i.b("navigation")
public class f extends i<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f2683a;

    public f(j jVar) {
        this.f2683a = jVar;
    }

    @Override // androidx.navigation.i
    public boolean e() {
        return true;
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this);
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d b(e eVar, Bundle bundle, h hVar, i.a aVar) {
        int I = eVar.I();
        if (I == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + eVar.k());
        }
        d dVarG = eVar.G(I, false);
        if (dVarG != null) {
            return this.f2683a.e(dVarG.q()).b(dVarG, dVarG.g(bundle), hVar, aVar);
        }
        throw new IllegalArgumentException("navigation destination " + eVar.H() + " is not a direct child of this NavGraph");
    }
}
