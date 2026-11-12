package pc0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g0<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f137213a;

    public g0(j jVar) {
        this.f137213a = jVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        sd2.f fVar = (sd2.f) t14;
        j jVar = this.f137213a;
        l80.b bVar = jVar.f137230g;
        fVar.getClass();
        Boolean boolValueOf = Boolean.valueOf(bVar.e(fVar));
        sd2.f fVar2 = (sd2.f) t7;
        l80.b bVar2 = jVar.f137230g;
        fVar2.getClass();
        return r13.a.b(boolValueOf, Boolean.valueOf(bVar2.e(fVar2)));
    }
}
