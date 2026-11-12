package aq1;

import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12404a;

    public k(List list) {
        this.f12404a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        q92.x xVar = ((q92.v) t7).f143783a;
        List list = this.f12404a;
        return r13.a.b(Integer.valueOf(list.indexOf(xVar)), Integer.valueOf(list.indexOf(((q92.v) t14).f143783a)));
    }
}
