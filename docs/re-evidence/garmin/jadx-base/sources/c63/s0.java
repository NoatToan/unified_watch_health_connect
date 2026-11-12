package c63;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc63/s0;", "Le63/x;", "Lc63/l1;", "", TtmlNode.RUBY_BASE, "", "isYearOfEra", "<init>", "(IZ)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 extends e63.x<l1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i14, boolean z14) {
        super(m1.f25020b, 2, i14);
        m1.f25019a.getClass();
        this.f25058d = i14;
        this.f25059e = z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f25058d == s0Var.f25058d && this.f25059e == s0Var.f25059e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25059e) + (Integer.hashCode(this.f25058d) * 31);
    }

    public /* synthetic */ s0(int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? false : z14);
    }
}
