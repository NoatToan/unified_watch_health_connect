package s3;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls3/g;", "Ls3/n;", "parent", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ls3/n;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f156332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156333b;

    public g(n nVar, int i14) {
        super(null);
        this.f156332a = nVar;
        this.f156333b = i14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(gVar.f156332a, this.f156332a) && gVar.f156333b == this.f156333b;
    }

    public final int hashCode() {
        return this.f156332a.hashCode() + (this.f156333b * 31);
    }
}
