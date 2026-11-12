package l0;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public class i implements a<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.a f107809a;

    public i(p.a aVar) {
        this.f107809a = aVar;
    }

    @Override // l0.a
    public final ListenableFuture<Object> apply(Object obj) {
        return j.e(this.f107809a.mo330apply(obj));
    }
}
