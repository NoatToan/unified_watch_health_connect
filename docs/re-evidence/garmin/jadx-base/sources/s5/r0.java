package s5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls5/r0;", "", "Ls5/i0;", TtmlNode.TAG_STYLE, "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Ls5/i0;Ls5/i0;Ls5/i0;Ls5/i0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f157286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f157287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f157288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f157289d;

    public /* synthetic */ r0(i0 i0Var, i0 i0Var2, i0 i0Var3, i0 i0Var4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : i0Var, (i14 & 2) != 0 ? null : i0Var2, (i14 & 4) != 0 ? null : i0Var3, (i14 & 8) != 0 ? null : i0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p005kotlin.jvm.internal.s.g(this.f157286a, r0Var.f157286a) && p005kotlin.jvm.internal.s.g(this.f157287b, r0Var.f157287b) && p005kotlin.jvm.internal.s.g(this.f157288c, r0Var.f157288c) && p005kotlin.jvm.internal.s.g(this.f157289d, r0Var.f157289d);
    }

    public final int hashCode() {
        i0 i0Var = this.f157286a;
        int iHashCode = (i0Var != null ? i0Var.hashCode() : 0) * 31;
        i0 i0Var2 = this.f157287b;
        int iHashCode2 = (iHashCode + (i0Var2 != null ? i0Var2.hashCode() : 0)) * 31;
        i0 i0Var3 = this.f157288c;
        int iHashCode3 = (iHashCode2 + (i0Var3 != null ? i0Var3.hashCode() : 0)) * 31;
        i0 i0Var4 = this.f157289d;
        return iHashCode3 + (i0Var4 != null ? i0Var4.hashCode() : 0);
    }

    public r0(i0 i0Var, i0 i0Var2, i0 i0Var3, i0 i0Var4) {
        this.f157286a = i0Var;
        this.f157287b = i0Var2;
        this.f157288c = i0Var3;
        this.f157289d = i0Var4;
    }

    public r0() {
        this(null, null, null, null, 15, null);
    }
}
