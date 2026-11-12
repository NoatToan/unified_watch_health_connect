package pj1;

import java.util.Comparator;
import p005kotlin.Metadata;
import p13.m0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f137881a;

    public a0(Comparator comparator) {
        this.f137881a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f137881a.compare(t7, t14);
        return iCompare != 0 ? iCompare : r13.a.b(Integer.valueOf(((m0) t14).f134951a), Integer.valueOf(((m0) t7).f134951a));
    }
}
