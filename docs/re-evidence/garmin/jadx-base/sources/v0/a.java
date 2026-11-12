package v0;

import android.graphics.Rect;
import android.util.Size;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv0/a;", "", "Landroid/graphics/Rect;", "cropRectBeforeScaling", "Landroid/util/Size;", "childSizeToScale", "originalSelectedChildSize", "<init>", "(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f174142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f174143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f174144c;

    public a(Rect rect, Size size, Size size2) {
        rect.getClass();
        size.getClass();
        size2.getClass();
        this.f174142a = rect;
        this.f174143b = size;
        this.f174144c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f174142a.equals(aVar.f174142a) && this.f174143b.equals(aVar.f174143b) && this.f174144c.equals(aVar.f174144c);
    }

    public final int hashCode() {
        return this.f174144c.hashCode() + ((this.f174143b.hashCode() + (this.f174142a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f174142a + ", childSizeToScale=" + this.f174143b + ", originalSelectedChildSize=" + this.f174144c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
