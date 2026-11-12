package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lp1/l;", "", "", "initialCapacity", "<init>", "(I)V", "Lp1/h0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f134762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f134763b;

    private l(int i14) {
        this.f134762a = i14 == 0 ? q.f134798a : new int[i14];
    }

    public final int a(int i14) {
        if (i14 >= 0 && i14 < this.f134763b) {
            return this.f134762a[i14];
        }
        org.apache.commons.lang3.e.v("Index must be between 0 and size");
        return 0;
    }

    public final int b() {
        int i14 = this.f134763b;
        if (i14 != 0) {
            return this.f134762a[i14 - 1];
        }
        n23.j.s("IntList is empty.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            int i14 = lVar.f134763b;
            int i15 = this.f134763b;
            if (i14 == i15) {
                int[] iArr = this.f134762a;
                int[] iArr2 = lVar.f134762a;
                j23.l lVarO = j23.t.o(0, i15);
                int i16 = lVarO.f96796a;
                int i17 = lVarO.f96797b;
                if (i16 > i17) {
                    return true;
                }
                while (iArr[i16] == iArr2[i16]) {
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
        int[] iArr = this.f134762a;
        int i14 = this.f134763b;
        int iHashCode = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode += Integer.hashCode(iArr[i15]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        int[] iArr = this.f134762a;
        int i14 = this.f134763b;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = iArr[i15];
            if (i15 == -1) {
                sb3.append((CharSequence) "...");
                return sb3.toString();
            }
            if (i15 != 0) {
                sb3.append((CharSequence) ", ");
            }
            sb3.append(i16);
        }
        sb3.append((CharSequence) "]");
        return sb3.toString();
    }

    public /* synthetic */ l(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }
}
