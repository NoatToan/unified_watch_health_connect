package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls5/t;", "", "Ls5/u;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(Ls5/u;II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f157302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f157304c;

    public t(u uVar, int i14, int i15) {
        this.f157302a = uVar;
        this.f157303b = i14;
        this.f157304c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f157302a, tVar.f157302a) && this.f157303b == tVar.f157303b && this.f157304c == tVar.f157304c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157304c) + q2.d(this.f157303b, this.f157302a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb3.append(this.f157302a);
        sb3.append(", startIndex=");
        sb3.append(this.f157303b);
        sb3.append(", endIndex=");
        return ds.e0.j(sb3, this.f157304c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
