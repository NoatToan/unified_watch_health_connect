package i82;

import android.graphics.Rect;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li82/e;", "", "Landroid/graphics/Rect;", "hingePosition", "Loe/c$b;", ModelSourceWrapper.ORIENTATION, "<init>", "(Landroid/graphics/Rect;Loe/c$b;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f92270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe.c.b f92271b;

    public e(Rect rect, oe.c.b bVar) {
        rect.getClass();
        bVar.getClass();
        this.f92270a = rect;
        this.f92271b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f92270a.equals(eVar.f92270a) && this.f92271b.equals(eVar.f92271b);
    }

    public final int hashCode() {
        return this.f92271b.hashCode() + (this.f92270a.hashCode() * 31);
    }

    public final String toString() {
        return "Separating(hingePosition=" + this.f92270a + ", orientation=" + this.f92271b + ")";
    }
}
