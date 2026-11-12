package rg0;

import ei0.u0;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f152595a;

    public n0(Comparator comparator) {
        this.f152595a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return this.f152595a.compare(((u0.a) t7).f64332c, ((u0.a) t14).f64332c);
    }
}
