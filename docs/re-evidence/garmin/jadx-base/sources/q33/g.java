package q33;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements x.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f<Object, f.a<Object>> f142466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList<Object> f142467b;

    public g(f<Object, f.a<Object>> fVar, ArrayList<Object> arrayList) {
        this.f142466a = fVar;
        this.f142467b = arrayList;
    }

    @Override // q33.x.c
    public final void a() {
    }

    @Override // q33.x.c
    public final x.a b(x33.b bVar, y23.b bVar2) {
        return this.f142466a.t(bVar, bVar2, this.f142467b);
    }
}
