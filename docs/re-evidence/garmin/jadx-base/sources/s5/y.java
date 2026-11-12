package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls5/y;", "", "Lg6/q;", "width", "height", "Ls5/z;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f157325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f157326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f157327c;

    private y(long j8, long j14, int i14) {
        this.f157325a = j8;
        this.f157326b = j14;
        this.f157327c = i14;
        g6.q.a aVar = g6.q.f76018b;
        if ((j8 & 1095216660480L) == 0) {
            y5.a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j14 & 1095216660480L) == 0) {
            y5.a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!g6.q.b(this.f157325a, yVar.f157325a) || !g6.q.b(this.f157326b, yVar.f157326b)) {
            return false;
        }
        int i14 = yVar.f157327c;
        z.a aVar = z.f157329b;
        return this.f157327c == i14;
    }

    public final int hashCode() {
        g6.q.a aVar = g6.q.f76018b;
        int iE = q6.f.e(Long.hashCode(this.f157325a) * 31, 31, this.f157326b);
        z.a aVar2 = z.f157329b;
        return Integer.hashCode(this.f157327c) + iE;
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) g6.q.f(this.f157325a)) + ", height=" + ((Object) g6.q.f(this.f157326b)) + ", placeholderVerticalAlign=" + ((Object) z.a(this.f157327c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ y(long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, i14);
    }
}
