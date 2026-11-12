package z2;

import java.util.ArrayList;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lz2/z0;", "", "Ln4/c;", "currentPosition", "previousHandlePosition", "Lf5/c0;", "containerCoordinates", "", "isStartHandle", "Lz2/b0;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLf5/c0;ZLz2/b0;Ljava/util/Comparator;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f201854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f201855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5.c0 f201856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f201857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f201858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Comparator<Long> f201859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1.k0 f201860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f201861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f201862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f201863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f201864k;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201865a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f201865a = iArr;
        }
    }

    private z0(long j8, long j14, f5.c0 c0Var, boolean z14, b0 b0Var, Comparator<Long> comparator) {
        this.f201854a = j8;
        this.f201855b = j14;
        this.f201856c = c0Var;
        this.f201857d = z14;
        this.f201858e = b0Var;
        this.f201859f = comparator;
        int i14 = p1.t.f134835a;
        this.f201860g = new p1.k0(0, 1, null);
        this.f201861h = new ArrayList();
        this.f201862i = -1;
        this.f201863j = -1;
        this.f201864k = -1;
    }

    public final int a(int i14, h hVar, h hVar2) {
        if (i14 == -1) {
            int i15 = a.f201865a[a1.b(hVar, hVar2).ordinal()];
            if (i15 == 1) {
                return this.f201864k - 1;
            }
            if (i15 == 2) {
                return this.f201864k;
            }
            if (i15 != 3) {
                lc.u0.r();
                return 0;
            }
        }
        return i14;
    }

    public /* synthetic */ z0(long j8, long j14, f5.c0 c0Var, boolean z14, b0 b0Var, Comparator comparator, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, c0Var, z14, b0Var, comparator);
    }
}
