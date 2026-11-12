package r22;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr22/t1;", "", "", Action.KEY_ATTRIBUTE, "", "iconResId", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "labelTop", "labelBottom", "", "enabled", "checked", "contentDescriptionTop", "scaleIcon", "iconSizePixels", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/Integer;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f149892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f149893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f149895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f149896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f149897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f149898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f149899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f149900j;

    public /* synthetic */ t1(String str, Integer num, Drawable drawable, String str2, String str3, boolean z14, boolean z15, String str4, boolean z16, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : drawable, str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? false : z16, (i14 & 512) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return p005kotlin.jvm.internal.s.g(this.f149891a, t1Var.f149891a) && p005kotlin.jvm.internal.s.g(this.f149892b, t1Var.f149892b) && p005kotlin.jvm.internal.s.g(this.f149893c, t1Var.f149893c) && p005kotlin.jvm.internal.s.g(this.f149894d, t1Var.f149894d) && p005kotlin.jvm.internal.s.g(this.f149895e, t1Var.f149895e) && this.f149896f == t1Var.f149896f && this.f149897g == t1Var.f149897g && p005kotlin.jvm.internal.s.g(this.f149898h, t1Var.f149898h) && this.f149899i == t1Var.f149899i && p005kotlin.jvm.internal.s.g(this.f149900j, t1Var.f149900j);
    }

    public final int hashCode() {
        int iHashCode = this.f149891a.hashCode() * 31;
        Integer num = this.f149892b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Drawable drawable = this.f149893c;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str = this.f149894d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149895e;
        int iG = q6.f.g(q6.f.g((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f149896f), 31, this.f149897g);
        String str3 = this.f149898h;
        int iG2 = q6.f.g((iG + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f149899i);
        Integer num2 = this.f149900j;
        return iG2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        boolean z14 = this.f149897g;
        StringBuilder sbN = lc.u0.n("SelectableItem(key=", this.f149892b, this.f149891a, ", iconResId=", ", iconDrawable=");
        sbN.append(this.f149893c);
        sbN.append(", labelTop=");
        sbN.append(this.f149894d);
        sbN.append(", labelBottom=");
        v.h.C(this.f149895e, ", enabled=", ", checked=", sbN, this.f149896f);
        fb1.c.w(", contentDescriptionTop=", this.f149898h, ", scaleIcon=", sbN, z14);
        sbN.append(this.f149899i);
        sbN.append(", iconSizePixels=");
        sbN.append(this.f149900j);
        sbN.append(")");
        return sbN.toString();
    }

    public t1(String str, Integer num, Drawable drawable, String str2, String str3, boolean z14, boolean z15, String str4, boolean z16, Integer num2) {
        str.getClass();
        this.f149891a = str;
        this.f149892b = num;
        this.f149893c = drawable;
        this.f149894d = str2;
        this.f149895e = str3;
        this.f149896f = z14;
        this.f149897g = z15;
        this.f149898h = str4;
        this.f149899i = z16;
        this.f149900j = num2;
    }
}
