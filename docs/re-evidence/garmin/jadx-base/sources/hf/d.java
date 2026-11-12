package hf;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhf/d;", "Lhf/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f83553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83554b;

    public interface a {
        long getSize();
    }

    public d(Drawable drawable, boolean z14) {
        this.f83553a = drawable;
        this.f83554b = z14;
    }

    @Override // hf.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF83538b() {
        return this.f83554b;
    }

    @Override // hf.h
    public final void draw(Canvas canvas) {
        this.f83553a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f83553a, dVar.f83553a) && this.f83554b == dVar.f83554b;
    }

    @Override // hf.h
    public final int getHeight() {
        return dg.u.a(this.f83553a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hf.h
    public final long getSize() {
        Drawable drawable = this.f83553a;
        long size = drawable instanceof a ? ((a) drawable).getSize() : ((long) dg.u.b(drawable)) * 4 * ((long) dg.u.a(drawable));
        if (size < 0) {
            return 0L;
        }
        return size;
    }

    @Override // hf.h
    public final int getWidth() {
        return dg.u.b(this.f83553a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83554b) + (this.f83553a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DrawableImage(drawable=");
        sb3.append(this.f83553a);
        sb3.append(", shareable=");
        return am.j.t(sb3, this.f83554b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
