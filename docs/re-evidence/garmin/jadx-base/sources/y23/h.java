package y23;

import java.util.ArrayList;
import l43.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f194353b = new h();

    private h() {
    }

    @Override // l43.w
    public final void a(t23.e eVar, ArrayList arrayList) {
        eVar.getClass();
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + arrayList);
    }

    @Override // l43.w
    public final void b(t23.b bVar) {
        bVar.getClass();
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }
}
