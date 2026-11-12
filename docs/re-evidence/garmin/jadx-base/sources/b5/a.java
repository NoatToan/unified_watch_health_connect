package b5;

import android.view.PointerIcon;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb5/a;", "Lb5/w;", "Landroid/view/PointerIcon;", "pointerIcon", "<init>", "(Landroid/view/PointerIcon;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointerIcon f15747b;

    public a(PointerIcon pointerIcon) {
        this.f15747b = pointerIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return p005kotlin.jvm.internal.s.g(this.f15747b, ((a) obj).f15747b);
    }

    public final int hashCode() {
        return this.f15747b.hashCode();
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f15747b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
