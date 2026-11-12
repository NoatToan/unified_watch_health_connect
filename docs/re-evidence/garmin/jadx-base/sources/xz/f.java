package xz;

import android.graphics.drawable.Drawable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxz/f;", "", "", "name", "Landroid/graphics/drawable/Drawable;", "drawable", "", TtmlNode.ATTR_TTS_COLOR, "", "gradientColors", "Lxz/g;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "size", "contentDescription", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/util/List;Lxz/g;Ljava/lang/Float;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f192739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f192740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f192741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f192742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f192743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f192744g;

    public /* synthetic */ f(String str, Drawable drawable, Integer num, List list, g gVar, Float f14, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : drawable, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : gVar, (i14 & 32) != 0 ? null : f14, (i14 & 64) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f192738a, fVar.f192738a) && s.g(this.f192739b, fVar.f192739b) && s.g(this.f192740c, fVar.f192740c) && s.g(this.f192741d, fVar.f192741d) && s.g(this.f192742e, fVar.f192742e) && s.g(this.f192743f, fVar.f192743f) && s.g(this.f192744g, fVar.f192744g);
    }

    public final int hashCode() {
        int iHashCode = this.f192738a.hashCode() * 31;
        Drawable drawable = this.f192739b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.f192740c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.f192741d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.f192742e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Float f14 = this.f192743f;
        int iHashCode6 = (iHashCode5 + (f14 == null ? 0 : f14.hashCode())) * 31;
        String str = this.f192744g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegendItem(name=");
        sb3.append(this.f192738a);
        sb3.append(", drawable=");
        sb3.append(this.f192739b);
        sb3.append(", color=");
        sb3.append(this.f192740c);
        sb3.append(", gradientColors=");
        sb3.append(this.f192741d);
        sb3.append(", type=");
        sb3.append(this.f192742e);
        sb3.append(", size=");
        sb3.append(this.f192743f);
        sb3.append(", contentDescription=");
        return am.j.o(this.f192744g, ")", sb3);
    }

    public f(String str, Drawable drawable, Integer num, List<Integer> list, g gVar, Float f14, String str2) {
        str.getClass();
        this.f192738a = str;
        this.f192739b = drawable;
        this.f192740c = num;
        this.f192741d = list;
        this.f192742e = gVar;
        this.f192743f = f14;
        this.f192744g = str2;
    }

    public f() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
