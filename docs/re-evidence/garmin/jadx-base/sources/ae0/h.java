package ae0;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;
import yz1.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lae0/h;", "", "", "x", "backgroundColorRes", "Lu4/d;", "icon", "Lg6/f;", "iconSize", "<init>", "(IILu4/d;FLkotlin/jvm/internal/j;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f2801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2802d;

    public /* synthetic */ h(int i14, int i15, u4.d dVar, float f14, int i16, j jVar) {
        this(i14, i15, dVar, (i16 & 8) != 0 ? s.h() : f14, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2799a == hVar.f2799a && this.f2800b == hVar.f2800b && p005kotlin.jvm.internal.s.g(this.f2801c, hVar.f2801c) && g6.f.c(this.f2802d, hVar.f2802d);
    }

    public final int hashCode() {
        int iHashCode = (this.f2801c.hashCode() + q2.d(this.f2800b, Integer.hashCode(this.f2799a) * 31, 31)) * 31;
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f2802d) + iHashCode;
    }

    public final String toString() {
        String strD = g6.f.d(this.f2802d);
        StringBuilder sbJ = e5.j(this.f2799a, this.f2800b, "TimelineEntryItem(x=", ", backgroundColorRes=", ", icon=");
        sbJ.append(this.f2801c);
        sbJ.append(", iconSize=");
        sbJ.append(strD);
        sbJ.append(")");
        return sbJ.toString();
    }

    private h(int i14, int i15, u4.d dVar, float f14) {
        dVar.getClass();
        this.f2799a = i14;
        this.f2800b = i15;
        this.f2801c = dVar;
        this.f2802d = f14;
    }

    public /* synthetic */ h(int i14, int i15, u4.d dVar, float f14, j jVar) {
        this(i14, i15, dVar, f14);
    }
}
