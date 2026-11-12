package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m.b f169238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f169239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object>.b f169240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f169241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m<Object>.b bVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f169240c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169239b = obj;
        this.f169241d |= Integer.MIN_VALUE;
        return this.f169240c.a(this);
    }
}
