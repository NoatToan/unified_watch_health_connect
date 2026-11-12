package ie2;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lie2/p;", "", "", "Lcom/garmin/android/library/mapsdkadapter/f;", "points", "Lie2/r;", "spans", "", "width", "", TtmlNode.ATTR_TTS_COLOR, "", "Lie2/o;", "pattern", "zIndex", "", "isClickable", "isVisible", "isGeodesic", "Lie2/d;", "startCap", "endCap", HeaderParameterNames.AUTHENTICATION_TAG, "spansForAllCoordinates", "drawBorder", "shouldBlendColors", "<init>", "(Ljava/util/List;Ljava/util/List;FILjava/util/List;FZZZLie2/d;Lie2/d;Ljava/lang/Object;Ljava/util/List;ZZ)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.library.mapsdkadapter.f> f93153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<r> f93154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f93155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<? extends o> f93157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f93158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f93159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f93160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f93161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f93162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f93163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f93164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<r> f93165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f93166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f93167o;

    public /* synthetic */ p(List list, List list2, float f14, int i14, List list3, float f15, boolean z14, boolean z15, boolean z16, d dVar, d dVar2, Object obj, List list4, boolean z17, boolean z18, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? new ArrayList() : list, (i15 & 2) != 0 ? new ArrayList() : list2, (i15 & 4) != 0 ? 10.0f : f14, (i15 & 8) != 0 ? -16777216 : i14, (i15 & 16) != 0 ? new ArrayList() : list3, (i15 & 32) != 0 ? 0.0f : f15, (i15 & 64) != 0 ? true : z14, (i15 & 128) == 0 ? z15 : true, (i15 & 256) != 0 ? false : z16, (i15 & 512) != 0 ? d.c.f93118a : dVar, (i15 & 1024) != 0 ? d.c.f93118a : dVar2, (i15 & 2048) != 0 ? null : obj, (i15 & 4096) != 0 ? new ArrayList() : list4, (i15 & 8192) != 0 ? false : z17, (i15 & 16384) != 0 ? false : z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f93153a, pVar.f93153a) && p005kotlin.jvm.internal.s.g(this.f93154b, pVar.f93154b) && Float.compare(this.f93155c, pVar.f93155c) == 0 && this.f93156d == pVar.f93156d && p005kotlin.jvm.internal.s.g(this.f93157e, pVar.f93157e) && Float.compare(this.f93158f, pVar.f93158f) == 0 && this.f93159g == pVar.f93159g && this.f93160h == pVar.f93160h && this.f93161i == pVar.f93161i && p005kotlin.jvm.internal.s.g(this.f93162j, pVar.f93162j) && p005kotlin.jvm.internal.s.g(this.f93163k, pVar.f93163k) && p005kotlin.jvm.internal.s.g(this.f93164l, pVar.f93164l) && p005kotlin.jvm.internal.s.g(this.f93165m, pVar.f93165m) && this.f93166n == pVar.f93166n && this.f93167o == pVar.f93167o;
    }

    public final int hashCode() {
        int iHashCode = (this.f93163k.hashCode() + ((this.f93162j.hashCode() + q6.f.g(q6.f.g(q6.f.g(q6.f.d(this.f93158f, u0.b(q2.d(this.f93156d, q6.f.d(this.f93155c, u0.b(this.f93153a.hashCode() * 31, 31, this.f93154b), 31), 31), 31, this.f93157e), 31), 31, this.f93159g), 31, this.f93160h), 31, this.f93161i)) * 31)) * 31;
        Object obj = this.f93164l;
        return Boolean.hashCode(this.f93167o) + q6.f.g(u0.b((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.f93165m), 31, this.f93166n);
    }

    public final String toString() {
        float f14 = this.f93155c;
        int i14 = this.f93156d;
        List<? extends o> list = this.f93157e;
        float f15 = this.f93158f;
        boolean z14 = this.f93159g;
        boolean z15 = this.f93160h;
        boolean z16 = this.f93161i;
        d dVar = this.f93162j;
        d dVar2 = this.f93163k;
        Object obj = this.f93164l;
        boolean z17 = this.f93166n;
        StringBuilder sbK = f3.k("PolylineData(points=", ", spans=", ", width=", this.f93153a, this.f93154b);
        sbK.append(f14);
        sbK.append(", color=");
        sbK.append(i14);
        sbK.append(", pattern=");
        sbK.append(list);
        sbK.append(", zIndex=");
        sbK.append(f15);
        sbK.append(", isClickable=");
        kg.f.q(", isVisible=", ", isGeodesic=", sbK, z14, z15);
        sbK.append(z16);
        sbK.append(", startCap=");
        sbK.append(dVar);
        sbK.append(", endCap=");
        sbK.append(dVar2);
        sbK.append(", tag=");
        sbK.append(obj);
        sbK.append(", spansForAllCoordinates=");
        sbK.append(this.f93165m);
        sbK.append(", drawBorder=");
        sbK.append(z17);
        sbK.append(", shouldBlendColors=");
        return hb.a.k(sbK, this.f93167o, ")");
    }

    public p(List<com.garmin.android.library.mapsdkadapter.f> list, List<r> list2, float f14, int i14, List<? extends o> list3, float f15, boolean z14, boolean z15, boolean z16, d dVar, d dVar2, Object obj, List<r> list4, boolean z17, boolean z18) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        dVar.getClass();
        dVar2.getClass();
        list4.getClass();
        this.f93153a = list;
        this.f93154b = list2;
        this.f93155c = f14;
        this.f93156d = i14;
        this.f93157e = list3;
        this.f93158f = f15;
        this.f93159g = z14;
        this.f93160h = z15;
        this.f93161i = z16;
        this.f93162j = dVar;
        this.f93163k = dVar2;
        this.f93164l = obj;
        this.f93165m = list4;
        this.f93166n = z17;
        this.f93167o = z18;
    }

    public p() {
        this(null, null, 0.0f, 0, null, 0.0f, false, false, false, null, null, null, null, false, false, 32767, null);
    }
}
