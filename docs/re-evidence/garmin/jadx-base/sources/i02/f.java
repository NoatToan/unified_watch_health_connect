package i02;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li02/f;", "", "", FirebaseAnalytics.Param.INDEX, Action.KEY_ATTRIBUTE, "<init>", "(ILjava/lang/Object;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f86852b;

    public f(int i14, Object obj) {
        this.f86851a = i14;
        this.f86852b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f86851a == fVar.f86851a && p005kotlin.jvm.internal.s.g(this.f86852b, fVar.f86852b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f86851a) * 31;
        Object obj = this.f86852b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ItemPosition(index=" + this.f86851a + ", key=" + this.f86852b + ")";
    }
}
