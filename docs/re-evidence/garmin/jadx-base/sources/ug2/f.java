package ug2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lug2/f;", "", "Lug2/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "Li53/c;", "Lug2/a;", "messages", "<init>", "(Lug2/d;Li53/c;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f170766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<a> f170767b;

    public f(d dVar, i53.c<a> cVar) {
        dVar.getClass();
        cVar.getClass();
        this.f170766a = dVar;
        this.f170767b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f170766a == fVar.f170766a && this.f170767b.equals(fVar.f170767b);
    }

    public final int hashCode() {
        return this.f170767b.hashCode() + (this.f170766a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceAlert(type=" + this.f170766a + ", messages=" + this.f170767b + ")";
    }
}
