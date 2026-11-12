package b5;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb5/b;", "Lb5/w;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15765b;

    public b(int i14) {
        this.f15765b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f15765b == ((b) obj).f15765b;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF15765b() {
        return this.f15765b;
    }

    public final String toString() {
        return ds.e0.j(new StringBuilder("AndroidPointerIcon(type="), this.f15765b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
