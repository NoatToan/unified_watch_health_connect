package hr;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhr/b;", "", "", "activityRating", "", "isSelected", "<init>", "(DZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f85284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85285b;

    public /* synthetic */ b(double d14, boolean z14, int i14, j jVar) {
        this(d14, (i14 & 2) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f85284a, bVar.f85284a) == 0 && this.f85285b == bVar.f85285b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85285b) + (Double.hashCode(this.f85284a) * 31);
    }

    public final String toString() {
        return "SelectableRating(activityRating=" + this.f85284a + ", isSelected=" + this.f85285b + ")";
    }

    public b(double d14, boolean z14) {
        this.f85284a = d14;
        this.f85285b = z14;
    }
}
