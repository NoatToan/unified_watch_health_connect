package p5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp5/d;", "", "", "rowCount", "columnCount", "<init>", "(II)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135958b;

    public d(int i14, int i15) {
        this.f135957a = i14;
        this.f135958b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f135957a == dVar.f135957a && this.f135958b == dVar.f135958b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135958b) + (Integer.hashCode(this.f135957a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollectionInfo(rowCount=");
        sb3.append(this.f135957a);
        sb3.append(", columnCount=");
        return ds.e0.j(sb3, this.f135958b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
