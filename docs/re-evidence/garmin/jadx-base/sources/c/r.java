package c;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc/r;", "Lwc/g;", "", "owner", "", "compositeKey", "<init>", "(Ljava/lang/Object;J)V", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class r extends wc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22340b;

    public r(Object obj, long j8) {
        this.f22339a = obj;
        this.f22340b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f22339a, rVar.f22339a) && this.f22340b == rVar.f22340b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22340b) + (this.f22339a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb3.append(this.f22339a);
        sb3.append(", compositeKey=");
        return a0.l(sb3, this.f22340b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
