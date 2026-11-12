package b5;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb5/d0;", "", "Lb5/z;", TtmlNode.ATTR_ID, "", "uptime", "Ln4/c;", "positionOnScreen", ModelSourceWrapper.POSITION, "", "down", "", "pressure", "Lb5/m0;", NotificationConstants.KEY_DATA_MIME_TYPE, "activeHover", "", "Lb5/e;", "historical", "scrollDelta", "scaleGestureFactor", "panGestureOffset", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JFJJLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<e> f15783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f15785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f15787m;

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(long j8, long j14, long j15, long j16, boolean z14, float f14, int i14, boolean z15, List list, long j17, float f15, long j18, long j19, int i15, p005kotlin.jvm.internal.j jVar) {
        long j24;
        long j25;
        boolean z16 = (i15 & 128) != 0 ? false : z15;
        List arrayList = (i15 & 256) != 0 ? new ArrayList() : list;
        if ((i15 & 512) != 0) {
            n4.c.f123541b.getClass();
            j24 = 0;
        } else {
            j24 = j17;
        }
        if ((i15 & 4096) != 0) {
            n4.c.f123541b.getClass();
            j25 = 0;
        } else {
            j25 = j19;
        }
        this(j8, j14, j15, j16, z14, f14, i14, z16, arrayList, j24, f15, j18, j25, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!z.b(this.f15775a, d0Var.f15775a) || this.f15776b != d0Var.f15776b || !n4.c.d(this.f15777c, d0Var.f15777c) || !n4.c.d(this.f15778d, d0Var.f15778d) || this.f15779e != d0Var.f15779e || Float.compare(this.f15780f, d0Var.f15780f) != 0) {
            return false;
        }
        int i14 = d0Var.f15781g;
        m0.a aVar = m0.f15849b;
        return this.f15781g == i14 && this.f15782h == d0Var.f15782h && p005kotlin.jvm.internal.s.g(this.f15783i, d0Var.f15783i) && n4.c.d(this.f15784j, d0Var.f15784j) && Float.compare(this.f15785k, d0Var.f15785k) == 0 && n4.c.d(this.f15786l, d0Var.f15786l) && n4.c.d(this.f15787m, d0Var.f15787m);
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.f15775a) * 31, 31, this.f15776b);
        n4.c.a aVar = n4.c.f123541b;
        int iD = q6.f.d(this.f15780f, q6.f.g(q6.f.e(q6.f.e(iE, 31, this.f15777c), 31, this.f15778d), 31, this.f15779e), 31);
        m0.a aVar2 = m0.f15849b;
        return Long.hashCode(this.f15787m) + q6.f.e(q6.f.d(this.f15785k, q6.f.e(lc.u0.b(q6.f.g(q2.d(this.f15781g, iD, 31), 31, this.f15782h), 31, this.f15783i), 31, this.f15784j), 31), 31, this.f15786l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) z.c(this.f15775a)) + ", uptime=" + this.f15776b + ", positionOnScreen=" + ((Object) n4.c.l(this.f15777c)) + ", position=" + ((Object) n4.c.l(this.f15778d)) + ", down=" + this.f15779e + ", pressure=" + this.f15780f + ", type=" + ((Object) m0.b(this.f15781g)) + ", activeHover=" + this.f15782h + ", historical=" + this.f15783i + ", scrollDelta=" + ((Object) n4.c.l(this.f15784j)) + ", scaleGestureFactor=" + this.f15785k + ", panGestureOffset=" + ((Object) n4.c.l(this.f15786l)) + ", originalEventPosition=" + ((Object) n4.c.l(this.f15787m)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private d0(long j8, long j14, long j15, long j16, boolean z14, float f14, int i14, boolean z15, List<e> list, long j17, float f15, long j18, long j19) {
        this.f15775a = j8;
        this.f15776b = j14;
        this.f15777c = j15;
        this.f15778d = j16;
        this.f15779e = z14;
        this.f15780f = f14;
        this.f15781g = i14;
        this.f15782h = z15;
        this.f15783i = list;
        this.f15784j = j17;
        this.f15785k = f15;
        this.f15786l = j18;
        this.f15787m = j19;
    }

    public /* synthetic */ d0(long j8, long j14, long j15, long j16, boolean z14, float f14, int i14, boolean z15, List list, long j17, float f15, long j18, long j19, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, z14, f14, i14, z15, list, j17, f15, j18, j19);
    }
}
