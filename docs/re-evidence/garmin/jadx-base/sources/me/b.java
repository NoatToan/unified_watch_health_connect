package me;

import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lme/b;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "a", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f117952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f117953d;

    static {
        new a(null);
        new b(0, 0, 0, 0);
    }

    public b(int i14, int i15, int i16, int i17) {
        this.f117950a = i14;
        this.f117951b = i15;
        this.f117952c = i16;
        this.f117953d = i17;
        if (i14 > i16) {
            vb.h.x(tn.k.e(i14, i16, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i15 <= i17) {
            return;
        }
        vb.h.x(tn.k.e(i15, i17, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.f117953d - this.f117951b;
    }

    public final int b() {
        return this.f117952c - this.f117950a;
    }

    public final Rect c() {
        return new Rect(this.f117950a, this.f117951b, this.f117952c, this.f117953d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        return this.f117950a == bVar.f117950a && this.f117951b == bVar.f117951b && this.f117952c == bVar.f117952c && this.f117953d == bVar.f117953d;
    }

    public final int hashCode() {
        return (((((this.f117950a * 31) + this.f117951b) * 31) + this.f117952c) * 31) + this.f117953d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b.class.getSimpleName());
        sb3.append(" { [");
        sb3.append(this.f117950a);
        sb3.append(CoreConstants.COMMA_CHAR);
        sb3.append(this.f117951b);
        sb3.append(CoreConstants.COMMA_CHAR);
        sb3.append(this.f117952c);
        sb3.append(CoreConstants.COMMA_CHAR);
        return am.j.q(sb3, this.f117953d, "] }");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme/b$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
