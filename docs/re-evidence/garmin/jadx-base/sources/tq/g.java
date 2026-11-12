package tq;

import java.util.Comparator;
import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f166026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f166027b;

    public g(f fVar, double d14) {
        this.f166026a = fVar;
        this.f166027b = d14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        f fVar = this.f166026a;
        double d14 = this.f166027b;
        return r13.a.b(Double.valueOf(f.a(fVar, (x1) t7, d14)), Double.valueOf(f.a(fVar, (x1) t14, d14)));
    }
}
