package c5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc5/a;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24446b;

    public a(long j8, float f14) {
        this.f24445a = j8;
        this.f24446b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24445a == aVar.f24445a && Float.compare(this.f24446b, aVar.f24446b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24446b) + (Long.hashCode(this.f24445a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DataPointAtTime(time=");
        sb3.append(this.f24445a);
        sb3.append(", dataPoint=");
        return q6.f.p(sb3, this.f24446b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
