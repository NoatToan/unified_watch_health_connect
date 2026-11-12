package f63;

import e23.l;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf63/h;", "T", "Lf63/e;", "Lkotlin/Function1;", "", "number", "zeroPadding", "outputPlusOnExceededWidth", "<init>", "(Le23/l;ILjava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Integer> f69388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f69390c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(l<? super T, Integer> lVar, int i14, Integer num) {
        lVar.getClass();
        this.f69388a = lVar;
        this.f69389b = i14;
        this.f69390c = num;
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
        StringBuilder sb4 = new StringBuilder();
        int iIntValue = this.f69388a.invoke(obj).intValue();
        if (z14 && iIntValue < 0) {
            iIntValue = -iIntValue;
        }
        int[] iArr = d63.c.f58079a;
        Integer num = this.f69390c;
        if (num != null && iIntValue >= iArr[num.intValue()]) {
            sb4.append('+');
        }
        int iAbs = Math.abs(iIntValue);
        int i14 = this.f69389b;
        if (iAbs >= iArr[i14 - 1]) {
            sb4.append(iIntValue);
        } else if (iIntValue >= 0) {
            sb4.append(iIntValue + iArr[i14]);
            sb4.deleteCharAt(0).getClass();
        } else {
            sb4.append(iIntValue - iArr[i14]);
            sb4.deleteCharAt(1).getClass();
        }
        sb3.append((CharSequence) sb4);
    }
}
