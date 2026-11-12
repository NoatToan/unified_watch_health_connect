package ht2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper", f = "InAppUpdateCheckHelper.kt", l = {67, 77}, m = "initialize")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f85657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f85658b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85657a = obj;
        this.f85659c |= Integer.MIN_VALUE;
        return this.f85658b.d(null, this);
    }
}
