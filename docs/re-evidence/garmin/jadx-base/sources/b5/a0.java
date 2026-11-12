package b5;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016Bq\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0017Be\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018B]\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0019BS\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u001cB\u0087\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010!¨\u0006\""}, d2 = {"Lb5/a0;", "", "Lb5/z;", TtmlNode.ATTR_ID, "", "uptimeMillis", "Ln4/c;", ModelSourceWrapper.POSITION, "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Lb5/m0;", NotificationConstants.KEY_DATA_MIME_TYPE, "scrollDelta", "scaleFactor", "panOffset", "<init>", "(JJJZFJJZZIJFJLkotlin/jvm/internal/j;)V", "(JJJZJJZZIJFJLkotlin/jvm/internal/j;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/j;)V", "(JJJZJJZZIJLkotlin/jvm/internal/j;)V", "Lb5/d;", "consumed", "(JJJZJJZLb5/d;ILkotlin/jvm/internal/j;)V", "", "Lb5/e;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JFJJLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f15758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<e> f15760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f15764q;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, float f15, long j19, int i15, p005kotlin.jvm.internal.j jVar) {
        int i16;
        long j24;
        long j25;
        if ((i15 & 512) != 0) {
            m0.f15849b.getClass();
            i16 = m0.f15850c;
        } else {
            i16 = i14;
        }
        if ((i15 & 1024) != 0) {
            n4.c.f123541b.getClass();
            j24 = 0;
        } else {
            j24 = j18;
        }
        float f16 = (i15 & 2048) != 0 ? 1.0f : f15;
        if ((i15 & 4096) != 0) {
            n4.c.f123541b.getClass();
            j25 = 0;
        } else {
            j25 = j19;
        }
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i16, j24, f16, j25, (p005kotlin.jvm.internal.j) null);
    }

    public final void a() {
        a0 a0Var = this.f15764q;
        if (a0Var == null) {
            this.f15762o = true;
            this.f15763p = true;
        } else if (a0Var != null) {
            a0Var.a();
        }
    }

    public final boolean b() {
        a0 a0Var = this.f15764q;
        if (a0Var != null) {
            return a0Var.b();
        }
        return this.f15762o || this.f15763p;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PointerInputChange(id=");
        sb3.append((Object) z.c(this.f15748a));
        sb3.append(", uptimeMillis=");
        sb3.append(this.f15749b);
        sb3.append(", position=");
        sb3.append((Object) n4.c.l(this.f15750c));
        sb3.append(", pressed=");
        sb3.append(this.f15751d);
        sb3.append(", pressure=");
        sb3.append(this.f15752e);
        sb3.append(", previousUptimeMillis=");
        sb3.append(this.f15753f);
        sb3.append(", previousPosition=");
        sb3.append((Object) n4.c.l(this.f15754g));
        sb3.append(", previousPressed=");
        sb3.append(this.f15755h);
        sb3.append(", isConsumed=");
        sb3.append(b());
        sb3.append(", type=");
        sb3.append((Object) m0.b(this.f15756i));
        sb3.append(", historical=");
        Object obj = this.f15760m;
        if (obj == null) {
            obj = p13.j0.f134944a;
        }
        sb3.append(obj);
        sb3.append(", scrollDelta=");
        sb3.append((Object) n4.c.l(this.f15757j));
        sb3.append(", scaleFactor=");
        sb3.append(this.f15758k);
        sb3.append(", panOffset=");
        sb3.append((Object) n4.c.l(this.f15759l));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @o13.e
    public /* synthetic */ a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i14, j18);
    }

    public /* synthetic */ a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, List list, long j18, float f15, long j19, long j24, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i14, (List<e>) list, j18, f15, j19, j24);
    }

    @o13.e
    public /* synthetic */ a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, j16, j17, z15, dVar, i14);
    }

    public /* synthetic */ a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, float f14, long j19, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, j16, j17, z15, z16, i14, j18, f14, j19);
    }

    @o13.e
    public /* synthetic */ a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, j16, j17, z15, z16, i14, j18);
    }

    private a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, float f15, long j19) {
        this.f15748a = j8;
        this.f15749b = j14;
        this.f15750c = j15;
        this.f15751d = z14;
        this.f15752e = f14;
        this.f15753f = j16;
        this.f15754g = j17;
        this.f15755h = z15;
        this.f15756i = i14;
        this.f15757j = j18;
        this.f15758k = f15;
        this.f15759l = j19;
        n4.c.f123541b.getClass();
        this.f15761n = 0L;
        this.f15762o = z16;
        this.f15763p = z16;
    }

    public /* synthetic */ a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, float f15, long j19, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i14, j18, f15, j19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, float f14, long j19, int i15, p005kotlin.jvm.internal.j jVar) {
        int i16;
        long j24;
        long j25;
        if ((i15 & 256) != 0) {
            m0.f15849b.getClass();
            i16 = m0.f15850c;
        } else {
            i16 = i14;
        }
        if ((i15 & 512) != 0) {
            n4.c.f123541b.getClass();
            j24 = 0;
        } else {
            j24 = j18;
        }
        float f15 = (i15 & 1024) != 0 ? 1.0f : f14;
        if ((i15 & 2048) != 0) {
            n4.c.f123541b.getClass();
            j25 = 0;
        } else {
            j25 = j19;
        }
        this(j8, j14, j15, z14, j16, j17, z15, z16, i16, j24, f15, j25, (p005kotlin.jvm.internal.j) null);
    }

    private a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, float f14, long j19) {
        this(j8, j14, j15, z14, 1.0f, j16, j17, z15, z16, i14, j18, f14, j19, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, int i15, p005kotlin.jvm.internal.j jVar) {
        int i16;
        long j19;
        if ((i15 & 512) != 0) {
            m0.f15849b.getClass();
            i16 = m0.f15850c;
        } else {
            i16 = i14;
        }
        if ((i15 & 1024) != 0) {
            n4.c.f123541b.getClass();
            j19 = 0;
        } else {
            j19 = j18;
        }
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i16, j19, (p005kotlin.jvm.internal.j) null);
    }

    private a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, long j18) {
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i14, j18, 0.0f, 0L, 6144, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, boolean z16, int i14, long j18, int i15, p005kotlin.jvm.internal.j jVar) {
        int i16;
        long j19;
        if ((i15 & 256) != 0) {
            m0.f15849b.getClass();
            i16 = m0.f15850c;
        } else {
            i16 = i14;
        }
        if ((i15 & 512) != 0) {
            n4.c.f123541b.getClass();
            j19 = 0;
        } else {
            j19 = j18;
        }
        this(j8, j14, j15, z14, j16, j17, z15, z16, i16, j19, (p005kotlin.jvm.internal.j) null);
    }

    private a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, boolean z16, int i14, long j18) {
        this(j8, j14, j15, z14, j16, j17, z15, z16, i14, j18, 0.0f, 0L, 3072, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, d dVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        int i16;
        if ((i15 & 256) != 0) {
            m0.f15849b.getClass();
            i16 = m0.f15850c;
        } else {
            i16 = i14;
        }
        this(j8, j14, j15, z14, j16, j17, z15, dVar, i16, (p005kotlin.jvm.internal.j) null);
    }

    private a0(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, boolean z16, int i14, List<e> list, long j18, float f15, long j19, long j24) {
        this(j8, j14, j15, z14, f14, j16, j17, z15, z16, i14, j18, f15, j19, (p005kotlin.jvm.internal.j) null);
        this.f15760m = list;
        this.f15761n = j24;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002c  */
    /* JADX WARN: Illegal instructions before constructor call */
    private a0(long j8, long j14, long j15, boolean z14, long j16, long j17, boolean z15, d dVar, int i14) {
        boolean z16;
        boolean z17;
        boolean z18;
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3 = dVar.f15772a;
        if (a0Var3 != null && (a0Var2 = a0Var3.f15764q) != null) {
            z16 = a0Var2.f15762o;
        } else {
            z16 = a0Var3 != null ? a0Var3.f15762o : dVar.f15774c;
        }
        if (z16) {
            z17 = true;
        } else {
            if (a0Var3 != null && (a0Var = a0Var3.f15764q) != null) {
                z18 = a0Var.f15763p;
            } else {
                z18 = a0Var3 != null ? a0Var3.f15763p : dVar.f15773b;
            }
            if (z18) {
                z17 = true;
            } else {
                z17 = false;
            }
        }
        boolean z19 = z17;
        n4.c.f123541b.getClass();
        this(j8, j14, j15, z14, 1.0f, j16, j17, z15, z19, i14, 0L, 0.0f, 0L, 6144, (p005kotlin.jvm.internal.j) null);
    }
}
