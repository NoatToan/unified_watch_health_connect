package d5;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld5/b;", "", "", "verticalScrollPixels", "horizontalScrollPixels", "", "uptimeMillis", "", "inputDeviceId", "<init>", "(FFJI)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57508d;

    public b(float f14, float f15, long j8, int i14) {
        this.f57505a = f14;
        this.f57506b = f15;
        this.f57507c = j8;
        this.f57508d = i14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f57505a == this.f57505a && bVar.f57506b == this.f57506b && bVar.f57507c == this.f57507c && bVar.f57508d == this.f57508d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57508d) + f.e(f.d(this.f57506b, Float.hashCode(this.f57505a) * 31, 31), 31, this.f57507c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb3.append(this.f57505a);
        sb3.append(",horizontalScrollPixels=");
        sb3.append(this.f57506b);
        sb3.append(",uptimeMillis=");
        sb3.append(this.f57507c);
        sb3.append(",deviceId=");
        return e0.j(sb3, this.f57508d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
