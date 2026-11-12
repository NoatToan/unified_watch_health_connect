package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f169337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1 f169338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f169339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f169340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f169341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(m<Object> mVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f169341e = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169340d = obj;
        this.f169342f |= Integer.MIN_VALUE;
        return m.e(this.f169341e, false, this);
    }
}
