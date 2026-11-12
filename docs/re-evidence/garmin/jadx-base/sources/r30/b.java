package r30;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr30/b;", "", "Lr30/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "isLoading", "<init>", "(Lr30/a;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f149981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149982b;

    public b(a aVar, boolean z14) {
        aVar.getClass();
        this.f149981a = aVar;
        this.f149982b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f149981a == bVar.f149981a && this.f149982b == bVar.f149982b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149982b) + (this.f149981a.hashCode() * 31);
    }

    public final String toString() {
        return "ElevationChipData(type=" + this.f149981a + ", isLoading=" + this.f149982b + ")";
    }
}
