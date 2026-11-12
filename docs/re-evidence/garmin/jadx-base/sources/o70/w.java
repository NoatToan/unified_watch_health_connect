package o70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo70/w;", "", "Lj70/r;", "autoSaveFocusType", "", "recommendedFocuses", "<init>", "(Lj70/r;Ljava/util/List;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.r f130108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j70.r> f130109b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(j70.r rVar, List<? extends j70.r> list) {
        this.f130108a = rVar;
        this.f130109b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f130108a == wVar.f130108a && p005kotlin.jvm.internal.s.g(this.f130109b, wVar.f130109b);
    }

    public final int hashCode() {
        j70.r rVar = this.f130108a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        List<j70.r> list = this.f130109b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SuggestedFocuses(autoSaveFocusType=" + this.f130108a + ", recommendedFocuses=" + this.f130109b + ")";
    }
}
