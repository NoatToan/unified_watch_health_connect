package yc;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lyc/u2;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSize", "maxSize", "jumpThreshold", "<init>", "(IIZIII)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f196512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f196513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f196514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f196515f;

    static {
        new a(null);
    }

    public u2(int i14, int i15, boolean z14, int i16, int i17, int i18) {
        this.f196510a = i14;
        this.f196511b = i15;
        this.f196512c = z14;
        this.f196513d = i16;
        this.f196514e = i17;
        this.f196515f = i18;
        if (!z14 && i15 == 0) {
            vb.h.s("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
            throw null;
        }
        if (i17 != Integer.MAX_VALUE && i17 < (i15 * 2) + i14) {
            l2.r(i17, e5.j(i14, i15, "Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", ", prefetchDist=", ", maxSize="));
            throw null;
        }
        if (i18 == Integer.MIN_VALUE || i18 > 0) {
            return;
        }
        vb.h.s("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/u2$a;", "", "<init>", "()V", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public u2(int i14, int i15) {
        this(i14, i15, false, 0, 0, 0, 60, null);
    }

    public u2(int i14, int i15, boolean z14) {
        this(i14, i15, z14, 0, 0, 0, 56, null);
    }

    public u2(int i14, int i15, boolean z14, int i16) {
        this(i14, i15, z14, i16, 0, 0, 48, null);
    }

    public u2(int i14, int i15, boolean z14, int i16, int i17) {
        this(i14, i15, z14, i16, i17, 0, 32, null);
    }

    public u2(int i14) {
        this(i14, 0, false, 0, 0, 0, 62, null);
    }

    public /* synthetic */ u2(int i14, int i15, boolean z14, int i16, int i17, int i18, int i19, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i19 & 2) != 0 ? i14 : i15, (i19 & 4) != 0 ? true : z14, (i19 & 8) != 0 ? i14 * 3 : i16, (i19 & 16) != 0 ? Integer.MAX_VALUE : i17, (i19 & 32) != 0 ? Integer.MIN_VALUE : i18);
    }
}
