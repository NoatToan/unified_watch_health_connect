package f1;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf1/b;", "", "", "captureRate", "encodeRate", "<init>", "(II)V", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67786b;

    public b(int i14, int i15) {
        this.f67785a = i14;
        this.f67786b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f67785a == bVar.f67785a && this.f67786b == bVar.f67786b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67786b) + (Integer.hashCode(this.f67785a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb3.append(this.f67785a);
        sb3.append(", encodeRate=");
        return e0.j(sb3, this.f67786b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
