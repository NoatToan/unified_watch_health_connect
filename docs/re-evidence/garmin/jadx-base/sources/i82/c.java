package i82;

import android.graphics.Rect;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li82/c;", "", "Landroid/graphics/Rect;", "hingePosition", "<init>", "(Landroid/graphics/Rect;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f92268a;

    public c(Rect rect) {
        rect.getClass();
        this.f92268a = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f92268a.equals(((c) obj).f92268a);
    }

    public final int hashCode() {
        return this.f92268a.hashCode();
    }

    public final String toString() {
        return "BookPosture(hingePosition=" + this.f92268a + ")";
    }
}
