package i13;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T[] f87115e;

    public g(int i14, float f14) {
        this.f87111a = f14;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i14 - 1));
        this.f87112b = iNumberOfLeadingZeros - 1;
        this.f87114d = (int) (f14 * iNumberOfLeadingZeros);
        this.f87115e = (T[]) new Object[iNumberOfLeadingZeros];
    }

    public final void a(s03.b bVar) {
        T t7;
        Object obj;
        Object[] objArr = this.f87115e;
        int i14 = this.f87112b;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i15 = (iHashCode ^ (iHashCode >>> 16)) & i14;
        Object obj2 = objArr[i15];
        if (obj2 != null) {
            if (obj2.equals(bVar)) {
                return;
            }
            do {
                i15 = (i15 + 1) & i14;
                obj = objArr[i15];
                if (obj == null) {
                }
            } while (!obj.equals(bVar));
            return;
        }
        objArr[i15] = bVar;
        int i16 = this.f87113c + 1;
        this.f87113c = i16;
        if (i16 < this.f87114d) {
            return;
        }
        T[] tArr = this.f87115e;
        int length = tArr.length;
        int i17 = length << 1;
        int i18 = i17 - 1;
        T[] tArr2 = (T[]) new Object[i17];
        while (true) {
            int i19 = i16 - 1;
            if (i16 == 0) {
                this.f87112b = i18;
                this.f87114d = (int) (i17 * this.f87111a);
                this.f87115e = tArr2;
                return;
            }
            do {
                length--;
                t7 = tArr[length];
            } while (t7 == null);
            int iHashCode2 = t7.hashCode() * (-1640531527);
            int i24 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i18;
            if (tArr2[i24] != null) {
                do {
                    i24 = (i24 + 1) & i18;
                } while (tArr2[i24] != null);
            }
            tArr2[i24] = tArr[length];
            i16 = i19;
        }
    }

    public final void b(int i14, int i15, Object[] objArr) {
        int i16;
        Object obj;
        this.f87113c--;
        while (true) {
            int i17 = i14 + 1;
            while (true) {
                i16 = i17 & i15;
                obj = objArr[i16];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i18 = (iHashCode ^ (iHashCode >>> 16)) & i15;
                    if (i14 > i16) {
                        if (i14 >= i18 && i18 > i16) {
                            break;
                        } else {
                            i17 = i16 + 1;
                        }
                    } else if (i14 >= i18 || i18 > i16) {
                        break;
                    } else {
                        i17 = i16 + 1;
                    }
                } else {
                    objArr[i14] = null;
                    return;
                }
            }
            objArr[i14] = obj;
            i14 = i16;
        }
    }

    public g(int i14) {
        this(i14, 0.75f);
    }

    public g() {
        this(16, 0.75f);
    }
}
