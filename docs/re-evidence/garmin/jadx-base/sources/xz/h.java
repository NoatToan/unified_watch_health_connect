package xz;

import am.j;
import android.graphics.drawable.Drawable;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxz/h;", "", "", "xIndex", "Landroid/graphics/drawable/Drawable;", "drawable", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f192755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192756c;

    public h(int i14, Drawable drawable, String str) {
        this.f192754a = i14;
        this.f192755b = drawable;
        this.f192756c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f192754a == hVar.f192754a && s.g(this.f192755b, hVar.f192755b) && s.g(this.f192756c, hVar.f192756c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f192754a) * 31;
        Drawable drawable = this.f192755b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str = this.f192756c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("XAxisEntry(xIndex=");
        sb3.append(this.f192754a);
        sb3.append(", drawable=");
        sb3.append(this.f192755b);
        sb3.append(", label=");
        return j.o(this.f192756c, ")", sb3);
    }

    public /* synthetic */ h(int i14, Drawable drawable, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, drawable, (i15 & 4) != 0 ? null : str);
    }
}
