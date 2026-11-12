package oe;

import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Loe/m;", "", "Lme/b;", "_bounds", "", "density", "<init>", "(Lme/b;F)V", "Landroid/graphics/Rect;", "bounds", "(Landroid/graphics/Rect;F)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me.b f131240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f131241b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Rect rect, float f14) {
        this(new me.b(rect), f14);
        rect.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m mVar = (m) obj;
        return s.g(this.f131240a, mVar.f131240a) && this.f131241b == mVar.f131241b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f131241b) + (this.f131240a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WindowMetrics(_bounds=");
        sb3.append(this.f131240a);
        sb3.append(", density=");
        return q6.f.p(sb3, this.f131241b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public m(me.b bVar, float f14) {
        bVar.getClass();
        this.f131240a = bVar;
        this.f131241b = f14;
    }
}
