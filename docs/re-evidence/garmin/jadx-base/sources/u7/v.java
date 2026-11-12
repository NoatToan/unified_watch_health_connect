package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f169326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m<Object> mVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f169329d = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169328c = obj;
        this.f169330e |= Integer.MIN_VALUE;
        int i14 = m.f169187m;
        return this.f169329d.h(this);
    }
}
