package i43;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends b43.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList<t23.l> f91049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f91050b;

    public f(ArrayList<t23.l> arrayList, g gVar) {
        this.f91049a = arrayList;
        this.f91050b = gVar;
    }

    @Override // b43.m
    public final void a(t23.b bVar) {
        bVar.getClass();
        p005kotlin.reflect.jvm.internal.impl.resolve.b.t(bVar, null);
        this.f91049a.add(bVar);
    }

    @Override // b43.l
    public final void d(t23.b bVar, t23.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        throw new IllegalStateException(("Conflict in scope of " + this.f91050b.f91052b + ": " + bVar + " vs " + bVar2).toString());
    }
}
