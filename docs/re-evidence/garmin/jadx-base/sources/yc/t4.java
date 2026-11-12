package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\t\nB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lyc/t4;", "", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "a", "b", "Lyc/t4$a;", "Lyc/t4$b;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f196489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f196490d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/t4$a;", "Lyc/t4;", "", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends t4 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f196491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f196492f;

        public a(int i14, int i15, int i16, int i17, int i18, int i19) {
            super(i16, i17, i18, i19, null);
            this.f196491e = i14;
            this.f196492f = i15;
        }

        @Override // yc.t4
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f196491e == aVar.f196491e && this.f196492f == aVar.f196492f && this.f196487a == aVar.f196487a && this.f196488b == aVar.f196488b && this.f196489c == aVar.f196489c && this.f196490d == aVar.f196490d;
        }

        @Override // yc.t4
        public final int hashCode() {
            return Integer.hashCode(this.f196492f) + Integer.hashCode(this.f196491e) + super.hashCode();
        }

        public final String toString() {
            return d53.n.d("ViewportHint.Access(\n            |    pageOffset=" + this.f196491e + ",\n            |    indexInPage=" + this.f196492f + ",\n            |    presentedItemsBefore=" + this.f196487a + ",\n            |    presentedItemsAfter=" + this.f196488b + ",\n            |    originalPageOffsetFirst=" + this.f196489c + ",\n            |    originalPageOffsetLast=" + this.f196490d + ",\n            |)");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/t4$b;", "Lyc/t4;", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends t4 {
        public b(int i14, int i15, int i16, int i17) {
            super(i14, i15, i16, i17, null);
        }

        public final String toString() {
            return d53.n.d("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f196487a + ",\n            |    presentedItemsAfter=" + this.f196488b + ",\n            |    originalPageOffsetFirst=" + this.f196489c + ",\n            |    originalPageOffsetLast=" + this.f196490d + ",\n            |)");
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196493a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f196493a = iArr;
        }
    }

    private t4(int i14, int i15, int i16, int i17) {
        this.f196487a = i14;
        this.f196488b = i15;
        this.f196489c = i16;
        this.f196490d = i17;
    }

    public final int a(c1 c1Var) {
        c1Var.getClass();
        int i14 = c.f196493a[c1Var.ordinal()];
        if (i14 == 1) {
            vb.h.s("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (i14 == 2) {
            return this.f196487a;
        }
        if (i14 == 3) {
            return this.f196488b;
        }
        lc.u0.r();
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return this.f196487a == t4Var.f196487a && this.f196488b == t4Var.f196488b && this.f196489c == t4Var.f196489c && this.f196490d == t4Var.f196490d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f196490d) + Integer.hashCode(this.f196489c) + Integer.hashCode(this.f196488b) + Integer.hashCode(this.f196487a);
    }

    public /* synthetic */ t4(int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, i17);
    }
}
