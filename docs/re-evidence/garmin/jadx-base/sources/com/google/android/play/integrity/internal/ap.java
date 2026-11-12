package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes14.dex */
final class ap extends an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ar f53427a;

    public ap(ar arVar, int i14) {
        super(arVar.size(), i14);
        this.f53427a = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a(int i14) {
        return this.f53427a.get(i14);
    }
}
