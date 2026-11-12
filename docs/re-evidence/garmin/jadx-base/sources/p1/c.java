package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp1/c;", "", "", "minCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f134679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134682d;

    public c(int i14) {
        if (!(i14 >= 1)) {
            vb.h.s("capacity must be >= 1");
            throw null;
        }
        if (!(i14 <= 1073741824)) {
            vb.h.s("capacity must be <= 2^30");
            throw null;
        }
        i14 = Integer.bitCount(i14) != 1 ? Integer.highestOneBit(i14 - 1) << 1 : i14;
        this.f134682d = i14 - 1;
        this.f134679a = new int[i14];
    }

    public final void a(int i14) {
        int[] iArr = this.f134679a;
        int i15 = this.f134681c;
        iArr[i15] = i14;
        int i16 = this.f134682d & (i15 + 1);
        this.f134681c = i16;
        int i17 = this.f134680b;
        if (i16 == i17) {
            int length = iArr.length;
            int i18 = length - i17;
            int i19 = length << 1;
            if (i19 < 0) {
                kg.f.n("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i19];
            p13.s.d(0, i17, length, iArr, iArr2);
            p13.s.d(i18, 0, this.f134680b, this.f134679a, iArr2);
            this.f134679a = iArr2;
            this.f134680b = 0;
            this.f134681c = length;
            this.f134682d = i19 - 1;
        }
    }

    public c() {
        this(0, 1, null);
    }

    public /* synthetic */ c(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 8 : i14);
    }
}
