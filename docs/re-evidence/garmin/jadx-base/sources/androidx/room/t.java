package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {638}, m = "collect")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f10960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f10960b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10959a = obj;
        this.f10961c |= Integer.MIN_VALUE;
        return this.f10960b.a(null, this);
    }
}
