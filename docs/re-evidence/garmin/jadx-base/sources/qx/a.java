package qx;

import android.graphics.drawable.Drawable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqx/a;", "", "", "title", "summary", "Landroid/graphics/drawable/Drawable;", "imageDrawable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f148389c;

    public a(String str, String str2, Drawable drawable) {
        str.getClass();
        this.f148387a = str;
        this.f148388b = str2;
        this.f148389c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f148387a, aVar.f148387a) && s.g(this.f148388b, aVar.f148388b) && s.g(this.f148389c, aVar.f148389c);
    }

    public final int hashCode() {
        int iHashCode = this.f148387a.hashCode() * 31;
        String str = this.f148388b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.f148389c;
        return iHashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ActivityItemDetails(title=", this.f148387a, ", summary=", this.f148388b, ", imageDrawable=");
        sbI.append(this.f148389c);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ a(String str, String str2, Drawable drawable, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, drawable);
    }
}
