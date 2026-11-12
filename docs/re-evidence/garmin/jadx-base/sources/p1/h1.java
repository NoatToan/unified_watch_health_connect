package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lp1/h1;", "E", "", "<init>", "()V", "Lp1/u0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class h1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f134733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134735d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<E, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1<E> f134736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h1<E> h1Var) {
            super(1);
            this.f134736a = h1Var;
        }

        @Override // e23.l
        public final CharSequence invoke(Object obj) {
            return obj == this.f134736a ? "(this)" : String.valueOf(obj);
        }
    }

    private h1() {
        this.f134732a = g1.f134727a;
        this.f134733b = q1.a.f142056c;
    }

    public final boolean a(E e4) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e4 != null ? e4.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f134734c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f134732a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j8 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j14 = (((long) i15) * 72340172838076673L) ^ j8;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                if (p005kotlin.jvm.internal.s.g(this.f134733b[iNumberOfTrailingZeros], e4)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean b() {
        return this.f134735d == 0;
    }

    public final boolean c() {
        return this.f134735d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (h1Var.f134735d != this.f134735d) {
            return false;
        }
        Object[] objArr = this.f134733b;
        long[] jArr = this.f134732a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128 && !h1Var.a(objArr[(i14 << 3) + i16])) {
                            return false;
                        }
                        j8 >>= 8;
                    }
                    if (i15 == 8) {
                        if (i14 != length) {
                            i14++;
                        }
                    }
                } else if (i14 != length) {
                    i14++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.f134734c * 31) + this.f134735d;
        Object[] objArr = this.f134733b;
        long[] jArr = this.f134732a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128) {
                            Object obj = objArr[(i14 << 3) + i16];
                            if (!p005kotlin.jvm.internal.s.g(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        return iHashCode;
                    }
                }
                if (i14 != length) {
                    i14++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[DONT_INVERT, PHI: r8
      0x0068: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002b, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a A[LOOP:0: B:5:0x001d->B:20:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[SYNTHETIC] */
    public final String toString() {
        a aVar = new a(this);
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        Object[] objArr = this.f134733b;
        long[] jArr = this.f134732a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb3.append((CharSequence) "]");
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j8) < 128) {
                        Object obj = objArr[(i14 << 3) + i17];
                        if (i15 == -1) {
                            sb3.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i15 != 0) {
                            sb3.append((CharSequence) ", ");
                        }
                        sb3.append(aVar.invoke(obj));
                        i15++;
                    }
                    j8 >>= 8;
                }
                if (i16 == 8) {
                    if (i14 == length) {
                        i14++;
                    }
                }
                sb3.append((CharSequence) "]");
                break;
            }
            if (i14 == length) {
                sb3.append((CharSequence) "]");
                break;
            }
            i14++;
        }
        return sb3.toString();
    }

    public /* synthetic */ h1(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
