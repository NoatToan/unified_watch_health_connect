package cz2;

import java.util.concurrent.atomic.AtomicReference;
import o53.c0;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcz2/c;", "T", "", "<init>", "()V", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<i0<T>> f56890a = new AtomicReference<>(null);

    public final Object a(e23.l lVar, v13.i iVar) {
        i0<T> i0Var = this.f56890a.get();
        return i0Var != null ? i0Var.await(iVar) : c0.e(new b(this, lVar, null), iVar);
    }
}
