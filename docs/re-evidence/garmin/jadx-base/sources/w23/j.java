package w23;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j implements e23.a<i43.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.b f181630a;

    public j(i.b bVar) {
        this.f181630a = bVar;
    }

    @Override // e23.a
    public final i43.l invoke() {
        StringBuilder sb3 = new StringBuilder("Scope for type parameter ");
        i.b bVar = this.f181630a;
        sb3.append(bVar.f181617a.b());
        String string = sb3.toString();
        List<p43.n0> upperBounds = i.this.getUpperBounds();
        i43.y.f91078c.getClass();
        return i43.y.a.a(string, upperBounds);
    }
}
