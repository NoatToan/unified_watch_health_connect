package f63;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf63/d;", "T", "Lf63/e;", "Lkotlin/Function1;", "Ld63/a;", "number", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Le23/l;IILjava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, d63.a> f69378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f69381d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super T, d63.a> lVar, int i14, int i15, List<Integer> list) {
        lVar.getClass();
        list.getClass();
        this.f69378a = lVar;
        this.f69379b = i14;
        this.f69380c = i15;
        this.f69381d = list;
        if (1 > i14 || i14 >= 10) {
            vb.h.x(e0.f(i14, "The minimum number of digits (", ") is not in range 1..9"));
            throw null;
        }
        if (i14 > i15 || i15 >= 10) {
            vb.h.x(am.j.g(i15, i14, "The maximum number of digits (", ") is not in range ", "..9"));
            throw null;
        }
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        int[] iArr;
        d63.a aVarInvoke = this.f69378a.invoke(obj);
        int i14 = this.f69380c;
        int iA = aVarInvoke.a(i14);
        int i15 = 0;
        while (true) {
            int i16 = this.f69379b + i15;
            iArr = d63.c.f58079a;
            if (i14 <= i16) {
                break;
            }
            int i17 = i15 + 1;
            if (iA % iArr[i17] != 0) {
                break;
            } else {
                i15 = i17;
            }
        }
        int iIntValue = this.f69381d.get((i14 - i15) - 1).intValue();
        if (i15 >= iIntValue) {
            i15 -= iIntValue;
        }
        sb3.append((CharSequence) String.valueOf((iA / iArr[i15]) + iArr[i14 - i15]).substring(1));
    }
}
