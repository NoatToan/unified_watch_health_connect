package ek1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f64489a;

    public s(Comparator comparator) {
        this.f64489a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return this.f64489a.compare(((hk1.p) t7).f84181a, ((hk1.p) t14).f84181a);
    }
}
