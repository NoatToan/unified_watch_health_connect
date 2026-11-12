package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes14.dex */
public final class az implements ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53443a;

    private az(Object obj) {
        this.f53443a = obj;
    }

    public static ay b(Object obj) {
        if (obj != null) {
            return new az(obj);
        }
        j20.x.l("instance cannot be null");
        return null;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        return this.f53443a;
    }
}
