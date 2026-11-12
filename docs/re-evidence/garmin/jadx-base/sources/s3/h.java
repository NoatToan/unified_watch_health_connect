package s3;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p3.j2;
import p3.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls3/h;", "", "Ls3/i;", "table", "<init>", "(Ls3/i;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f156334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f156335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f156337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f156338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f156339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f156340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u0 f156343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f156344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f156345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f156346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f156347n;

    public h(i iVar) {
        this.f156334a = iVar;
        this.f156335b = iVar.f156348a;
        int i14 = iVar.f156349b;
        this.f156336c = i14;
        this.f156337d = iVar.f156350c;
        this.f156338e = iVar.f156351d;
        this.f156341h = i14;
        this.f156342i = -1;
        this.f156343j = new u0();
    }

    public final b a(int i14) {
        ArrayList<b> arrayList = this.f156334a.f156356i;
        int iF = k.f(arrayList, i14, this.f156336c);
        if (iF >= 0) {
            return arrayList.get(iF);
        }
        b bVar = new b(i14);
        arrayList.add(-(iF + 1), bVar);
        return bVar;
    }

    public final Object b(int i14, int[] iArr) {
        int i15 = i14 * 5;
        int i16 = iArr[i15 + 1];
        if ((268435456 & i16) != 0) {
            return this.f156337d[i15 >= iArr.length ? iArr.length : iArr[i15 + 4] + Integer.bitCount(i16 >> 29)];
        }
        p3.m.f135153a.getClass();
        return p3.m.a.f135155b;
    }

    public final void c() {
        this.f156339f = true;
        i iVar = this.f156334a;
        iVar.getClass();
        if (this.f156334a != iVar || iVar.f156352e <= 0) {
            p3.n.a("Unexpected reader close()");
        }
        iVar.f156352e--;
        this.f156337d = new Object[0];
    }

    public final boolean d(int i14) {
        return (this.f156335b[(i14 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f156344k == 0) {
            if (!(this.f156340g == this.f156341h)) {
                p3.n.a("endGroup() not called at the end of a group");
            }
            int i14 = (this.f156342i * 5) + 2;
            int[] iArr = this.f156335b;
            int i15 = iArr[i14];
            this.f156342i = i15;
            int i16 = this.f156336c;
            this.f156341h = i15 < 0 ? i16 : k.a(i15, iArr) + i15;
            int iB = this.f156343j.b();
            if (iB < 0) {
                this.f156345l = 0;
                this.f156346m = 0;
            } else {
                this.f156345l = iB;
                this.f156346m = i15 >= i16 - 1 ? this.f156338e : iArr[((i15 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i14 = this.f156340g;
        if (i14 < this.f156341h) {
            return b(i14, this.f156335b);
        }
        return 0;
    }

    public final int g() {
        int i14 = this.f156340g;
        if (i14 >= this.f156341h) {
            return 0;
        }
        return this.f156335b[i14 * 5];
    }

    public final Object h(int i14, int i15) {
        int[] iArr = this.f156335b;
        int iC = k.c(i14, iArr);
        int i16 = i14 + 1;
        int i17 = iC + i15;
        if (i17 < (i16 < this.f156336c ? iArr[(i16 * 5) + 4] : this.f156338e)) {
            return this.f156337d[i17];
        }
        p3.m.f135153a.getClass();
        return p3.m.a.f135155b;
    }

    public final int i(int i14) {
        return this.f156335b[i14 * 5];
    }

    public final boolean j(int i14) {
        return (this.f156335b[(i14 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i14) {
        return (this.f156335b[(i14 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i14) {
        return (this.f156335b[(i14 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i14;
        if (this.f156344k > 0 || (i14 = this.f156345l) >= this.f156346m) {
            this.f156347n = false;
            p3.m.f135153a.getClass();
            return p3.m.a.f135155b;
        }
        this.f156347n = true;
        Object[] objArr = this.f156337d;
        this.f156345l = i14 + 1;
        return objArr[i14];
    }

    public final Object n(int i14) {
        int i15 = i14 * 5;
        int[] iArr = this.f156335b;
        int i16 = iArr[i15 + 1] & 1073741824;
        if (i16 == 0) {
            return null;
        }
        if (i16 != 0) {
            return this.f156337d[iArr[i15 + 4]];
        }
        p3.m.f135153a.getClass();
        return p3.m.a.f135155b;
    }

    public final int o(int i14) {
        return this.f156335b[(i14 * 5) + 1] & 67108863;
    }

    public final Object p(int i14, int[] iArr) {
        int i15 = i14 * 5;
        int i16 = iArr[i15 + 1];
        if ((536870912 & i16) == 0) {
            return null;
        }
        return this.f156337d[Integer.bitCount(i16 >> 30) + iArr[i15 + 4]];
    }

    public final int q(int i14) {
        return this.f156335b[(i14 * 5) + 2];
    }

    public final void r(int i14) {
        if (!(this.f156344k == 0)) {
            p3.n.a("Cannot reposition while in an empty region");
        }
        this.f156340g = i14;
        int[] iArr = this.f156335b;
        int i15 = this.f156336c;
        int i16 = i14 < i15 ? iArr[(i14 * 5) + 2] : -1;
        if (i16 != this.f156342i) {
            this.f156342i = i16;
            if (i16 < 0) {
                this.f156341h = i15;
            } else {
                this.f156341h = k.a(i16, iArr) + i16;
            }
            this.f156345l = 0;
            this.f156346m = 0;
        }
    }

    public final int s() {
        if (!(this.f156344k == 0)) {
            p3.n.a("Cannot skip while in an empty region");
        }
        int i14 = this.f156340g;
        int[] iArr = this.f156335b;
        int i15 = (iArr[(i14 * 5) + 1] & 1073741824) == 0 ? iArr[(i14 * 5) + 1] & 67108863 : 1;
        this.f156340g = k.a(i14, iArr) + i14;
        return i15;
    }

    public final void t() {
        if (!(this.f156344k == 0)) {
            p3.n.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f156340g = this.f156341h;
        this.f156345l = 0;
        this.f156346m = 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SlotReader(current=");
        sb3.append(this.f156340g);
        sb3.append(", key=");
        sb3.append(g());
        sb3.append(", parent=");
        sb3.append(this.f156342i);
        sb3.append(", end=");
        return e0.j(sb3, this.f156341h, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final void u() {
        if (this.f156344k <= 0) {
            int i14 = this.f156342i;
            int i15 = this.f156340g;
            int[] iArr = this.f156335b;
            if (!(iArr[(i15 * 5) + 2] == i14)) {
                j2.a("Invalid slot table detected");
            }
            int i16 = this.f156345l;
            int i17 = this.f156346m;
            u0 u0Var = this.f156343j;
            if (i16 == 0 && i17 == 0) {
                u0Var.c(-1);
            } else {
                u0Var.c(i16);
            }
            this.f156342i = i15;
            this.f156341h = k.a(i15, iArr) + i15;
            int i18 = i15 + 1;
            this.f156340g = i18;
            this.f156345l = k.c(i15, iArr);
            this.f156346m = i15 >= this.f156336c - 1 ? this.f156338e : iArr[(i18 * 5) + 4];
        }
    }
}
