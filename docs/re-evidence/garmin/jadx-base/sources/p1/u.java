package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lp1/u;", "", "", "initialCapacity", "<init>", "(I)V", "Lp1/l0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f134837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134838b;

    private u(int i14) {
        this.f134837a = i14 == 0 ? y.f134872a : new long[i14];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            int i14 = uVar.f134838b;
            int i15 = this.f134838b;
            if (i14 == i15) {
                long[] jArr = this.f134837a;
                long[] jArr2 = uVar.f134837a;
                j23.l lVarO = j23.t.o(0, i15);
                int i16 = lVarO.f96796a;
                int i17 = lVarO.f96797b;
                if (i16 > i17) {
                    return true;
                }
                while (jArr[i16] == jArr2[i16]) {
                    if (i16 == i17) {
                        return true;
                    }
                    i16++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f134837a;
        int i14 = this.f134838b;
        int iHashCode = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode += Long.hashCode(jArr[i15]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        long[] jArr = this.f134837a;
        int i14 = this.f134838b;
        for (int i15 = 0; i15 < i14; i15++) {
            long j8 = jArr[i15];
            if (i15 == -1) {
                sb3.append((CharSequence) "...");
                return sb3.toString();
            }
            if (i15 != 0) {
                sb3.append((CharSequence) ", ");
            }
            sb3.append(j8);
        }
        sb3.append((CharSequence) "]");
        return sb3.toString();
    }

    public /* synthetic */ u(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }
}
