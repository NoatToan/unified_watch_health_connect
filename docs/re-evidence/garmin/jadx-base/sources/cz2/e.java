package cz2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@v13.e(c = "com.garmin.util.coroutines.Monitor", f = "Monitor.kt", l = {40, 52, 60, 66}, m = "run")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f56891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f56892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g<Object> f56893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56894d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g<Object> gVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f56893c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f56892b = obj;
        this.f56894d |= Integer.MIN_VALUE;
        return this.f56893c.a(this);
    }
}
