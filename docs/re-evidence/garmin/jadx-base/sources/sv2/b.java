package sv2;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsv2/b;", "", "", FirebaseAnalytics.Param.INDEX, "", "isSelected", "<init>", "(IZ)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161034b;

    public b(int i14, boolean z14) {
        this.f161033a = i14;
        this.f161034b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f161033a == bVar.f161033a && this.f161034b == bVar.f161034b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161034b) + (Integer.hashCode(this.f161033a) * 31);
    }

    public final String toString() {
        return "WatchFaceGridItemSettings(index=" + this.f161033a + ", isSelected=" + this.f161034b + ")";
    }
}
