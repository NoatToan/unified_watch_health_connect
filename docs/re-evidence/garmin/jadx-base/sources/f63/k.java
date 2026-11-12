package f63;

import e23.l;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf63/k;", "T", "Lf63/e;", "Lkotlin/Function1;", "", "number", "zeroPadding", "<init>", "(Le23/l;I)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Integer> f69394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69395b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(l<? super T, Integer> lVar, int i14) {
        lVar.getClass();
        this.f69394a = lVar;
        this.f69395b = i14;
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i14 <= 9) {
            return;
        }
        vb.h.x(e0.f(i14, "The minimum number of digits (", ") exceeds the length of an Int"));
        throw null;
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        String strValueOf = String.valueOf(this.f69394a.invoke(obj).intValue());
        int length = this.f69395b - strValueOf.length();
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append('0');
        }
        sb3.append((CharSequence) strValueOf);
    }
}
