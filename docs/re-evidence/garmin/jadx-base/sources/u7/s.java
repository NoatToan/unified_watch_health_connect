package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f169307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o53.r f169308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f169309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169311f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m<Object> mVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f169310e = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169309d = obj;
        this.f169311f |= Integer.MIN_VALUE;
        return m.c(this.f169310e, null, this);
    }
}
