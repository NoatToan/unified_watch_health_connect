package f63;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.u;
import e23.l;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf63/f;", "T", "Lf63/e;", "Lkotlin/Function1;", "", "number", "digits", TtmlNode.RUBY_BASE, "<init>", "(Le23/l;II)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Integer> f69382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69384c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(l<? super T, Integer> lVar, int i14, int i15) {
        lVar.getClass();
        this.f69382a = lVar;
        this.f69383b = i14;
        this.f69384c = i15;
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        int iIntValue = this.f69382a.invoke(obj).intValue();
        int[] iArr = d63.c.f58079a;
        int i14 = this.f69383b;
        int i15 = iArr[i14];
        int i16 = iIntValue - this.f69384c;
        if (i16 < 0 || i16 >= i15) {
            if (iIntValue >= 0) {
                sb3.append(Marker.ANY_NON_NULL_MARKER);
            }
            sb3.append(String.valueOf(iIntValue));
        } else {
            String strValueOf = String.valueOf(iIntValue % i15);
            CharSequence[] charSequenceArr = {u.u("0", Math.max(0, i14 - strValueOf.length())), strValueOf};
            for (int i17 = 0; i17 < 2; i17++) {
                sb3.append(charSequenceArr[i17]);
            }
        }
    }
}
