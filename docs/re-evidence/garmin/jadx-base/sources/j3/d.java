package j3;

import am.j;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj3/d;", "", "Ln4/d;", "bounds", "", "isFlat", "isVertical", "isSeparating", "isOccluding", "<init>", "(Ln4/d;ZZZZ)V", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4.d f96827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f96828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f96831e;

    public d(n4.d dVar, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f96827a = dVar;
        this.f96828b = z14;
        this.f96829c = z15;
        this.f96830d = z16;
        this.f96831e = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f96827a, dVar.f96827a) && this.f96828b == dVar.f96828b && this.f96829c == dVar.f96829c && this.f96830d == dVar.f96830d && this.f96831e == dVar.f96831e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96831e) + q6.f.g(q6.f.g(q6.f.g(this.f96827a.hashCode() * 31, 31, this.f96828b), 31, this.f96829c), 31, this.f96830d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HingeInfo(bounds=");
        sb3.append(this.f96827a);
        sb3.append(", isFlat=");
        sb3.append(this.f96828b);
        sb3.append(", isVertical=");
        sb3.append(this.f96829c);
        sb3.append(", isSeparating=");
        sb3.append(this.f96830d);
        sb3.append(", isOccluding=");
        return j.t(sb3, this.f96831e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
