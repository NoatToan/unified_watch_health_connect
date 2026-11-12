package c2;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/w0;", "", "Lc2/u0$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Lc2/u0$a;II)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0.a f22907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f5.y0 f22910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f5.v1 f22911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f5.y0 f22912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f5.v1 f22913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1.k f22914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p1.k f22915i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22916a;

        static {
            int[] iArr = new int[u0.a.values().length];
            try {
                iArr[u0.a.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.a.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.a.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.a.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22916a = iArr;
        }
    }

    public w0(u0.a aVar, int i14, int i15) {
        this.f22907a = aVar;
        this.f22908b = i14;
        this.f22909c = i15;
    }

    public final p1.k a(int i14, int i15, boolean z14) {
        int i16 = a.f22916a[this.f22907a.ordinal()];
        if (i16 != 1 && i16 != 2) {
            if (i16 != 3) {
                if (i16 != 4) {
                    lc.u0.r();
                    return null;
                }
                if (z14) {
                    return this.f22914h;
                }
                if (i14 + 1 < this.f22908b || i15 < this.f22909c) {
                    return null;
                }
                return this.f22915i;
            }
            if (z14) {
                return this.f22914h;
            }
        }
        return null;
    }

    public final void b(f5.w wVar, f5.w wVar2, boolean z14, long j8) {
        long jA = d2.a(j8, z14 ? u1.Horizontal : u1.Vertical);
        if (wVar != null) {
            int i14 = g6.a.i(jA);
            int i15 = t0.f22879a;
            int iO = z14 ? wVar.O(i14) : wVar.e0(i14);
            this.f22914h = p1.k.a(p1.k.b(iO, z14 ? wVar.e0(iO) : wVar.O(iO)));
            this.f22910d = wVar instanceof f5.y0 ? (f5.y0) wVar : null;
            this.f22911e = null;
        }
        if (wVar2 != null) {
            int i16 = g6.a.i(jA);
            int i17 = t0.f22879a;
            int iO2 = z14 ? wVar2.O(i16) : wVar2.e0(i16);
            this.f22915i = p1.k.a(p1.k.b(iO2, z14 ? wVar2.e0(iO2) : wVar2.O(iO2)));
            this.f22912f = wVar2 instanceof f5.y0 ? (f5.y0) wVar2 : null;
            this.f22913g = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f22907a == w0Var.f22907a && this.f22908b == w0Var.f22908b && this.f22909c == w0Var.f22909c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22909c) + r1.q2.d(this.f22908b, this.f22907a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FlowLayoutOverflowState(type=");
        sb3.append(this.f22907a);
        sb3.append(", minLinesToShowCollapse=");
        sb3.append(this.f22908b);
        sb3.append(", minCrossAxisSizeToShowCollapse=");
        return ds.e0.j(sb3, this.f22909c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
