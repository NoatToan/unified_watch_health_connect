package z43;

import e23.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b.a<Object, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f202413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f202414b;

    public a(l lVar, boolean[] zArr) {
        this.f202413a = lVar;
        this.f202414b = zArr;
    }

    @Override // z43.b.c
    public final Object a() {
        return Boolean.valueOf(this.f202414b[0]);
    }

    @Override // z43.b.a, z43.b.c
    public final boolean b(Object obj) {
        boolean zBooleanValue = ((Boolean) this.f202413a.invoke(obj)).booleanValue();
        boolean[] zArr = this.f202414b;
        if (zBooleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }
}
