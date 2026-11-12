package q6;

import java.util.ArrayList;
import java.util.Collections;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public class d extends a implements r6.e {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final g f143080k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final g.d f143081l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ArrayList<Object> f143082m0;

    public d(g gVar, g.d dVar) {
        super(gVar);
        this.f143082m0 = new ArrayList<>();
        this.f143080k0 = gVar;
        this.f143081l0 = dVar;
    }

    @Override // q6.a, q6.e
    public final t6.e a() {
        return s();
    }

    @Override // q6.a, q6.e
    public void apply() {
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.f143082m0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public i s() {
        return null;
    }
}
