package ak;

import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f3531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f3532c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3533a;

        static {
            int[] iArr = new int[bk.l.values().length];
            f3533a = iArr;
            try {
                iArr[bk.l.BROADCAST_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3533a[bk.l.ACKNOWLEDGED_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3533a[bk.l.BURST_TRANSFER_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(bk.k kVar) {
        this.f3530a = null;
        this.f3531b = null;
        this.f3532c = null;
        if (a(kVar)) {
            byte[] bArr = kVar.f18402a;
            int iE = (int) k.e(9, 1, bArr);
            int i14 = 10;
            if (k.d(128, iE)) {
                this.f3530a = new b(bArr, 10);
                i14 = 14;
            }
            if (k.d(64, iE)) {
                this.f3531b = new m(bArr, i14);
                i14 += 3;
            }
            if (k.d(32, iE)) {
                this.f3532c = new n(bArr, i14);
            }
        }
    }

    public static boolean a(bk.k kVar) {
        int i14 = a.f3533a[kVar.h().ordinal()];
        return (i14 == 1 || i14 == 2 || i14 == 3) && kVar.f18402a.length > 9;
    }

    public final boolean b() {
        return this.f3531b != null;
    }

    public final boolean equals(Object obj) {
        b bVar;
        n nVar;
        if (this != obj) {
            if (obj != null && (obj instanceof g)) {
                g gVar = (g) obj;
                if ((gVar.f3530a != null) == (this.f3530a != null) && gVar.b() == b()) {
                    if ((gVar.f3532c != null) == (this.f3532c != null) && (((bVar = this.f3530a) == null || bVar.equals(gVar.f3530a)) && ((!b() || this.f3531b.equals(gVar.f3531b)) && ((nVar = this.f3532c) == null || nVar.equals(gVar.f3532c))))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f3530a;
        int iHashCode = bVar != null ? bVar.hashCode() + 217 : 7;
        if (b()) {
            iHashCode = (iHashCode * 31) + this.f3531b.hashCode();
        }
        n nVar = this.f3532c;
        if (nVar != null) {
            return nVar.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Extended data:");
        if (this.f3530a != null) {
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f3530a.toString());
        }
        if (b()) {
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f3531b.toString());
        }
        if (this.f3532c != null) {
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f3532c.toString());
        }
        return sb3.toString();
    }
}
