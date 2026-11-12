package ht2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper", f = "InAppUpdateCheckHelper.kt", l = {112}, m = "removePersistentDataStoreEntry$in_app_update_release")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f85661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f85662b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85661a = obj;
        this.f85663c |= Integer.MIN_VALUE;
        return this.f85662b.e(this);
    }
}
