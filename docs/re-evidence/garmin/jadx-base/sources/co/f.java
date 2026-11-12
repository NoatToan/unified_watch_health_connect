package co;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f28106a;

    public f(g gVar) {
        this.f28106a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        g gVar = this.f28106a;
        return r13.a.b(dh.b.A(gVar.f28107a, ((ho.b.C1677b) t7).f84585c.f4360c), dh.b.A(gVar.f28107a, ((ho.b.C1677b) t14).f84585c.f4360c));
    }
}
