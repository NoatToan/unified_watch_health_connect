package ia0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f92416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f92417b;

    public d(Comparator comparator, g gVar) {
        this.f92416a = comparator;
        this.f92417b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iCompare = this.f92416a.compare(t7, t14);
        if (iCompare != 0) {
            return iCompare;
        }
        j90.a.f97780d.getClass();
        j90.a aVarA = j90.a.C1867a.a((z80.g) t14);
        g gVar = this.f92417b;
        boolean z14 = false;
        Boolean boolValueOf = Boolean.valueOf(aVarA != null && gVar.f92424b.f82511a.contains(aVarA));
        j90.a aVarA2 = j90.a.C1867a.a((z80.g) t7);
        if (aVarA2 != null && gVar.f92424b.f82511a.contains(aVarA2)) {
            z14 = true;
        }
        return r13.a.b(boolValueOf, Boolean.valueOf(z14));
    }
}
