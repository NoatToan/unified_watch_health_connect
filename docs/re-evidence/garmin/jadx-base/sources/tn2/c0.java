package tn2;

import java.util.concurrent.Callable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c0<V> implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w.f f165532a;

    public c0(w.f fVar) {
        this.f165532a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        w.f fVar = this.f165532a;
        fVar.f165728j = null;
        return q03.r.f(fVar);
    }
}
