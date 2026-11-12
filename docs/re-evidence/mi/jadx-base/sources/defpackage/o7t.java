package defpackage;

import android.os.SystemClock;
import com.amap.api.col.p0003sl.ni;
import com.amap.api.col.p0003sl.nj;
import com.amap.api.col.p0003sl.nk;
import com.amap.api.col.p0003sl.nl;
import com.amap.api.col.p0003sl.nm;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ni f28835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ni f28836b;
    public bbt c;
    public a d = new a();
    public final List<ni> e = new ArrayList(3);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f28837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28838b;
        public ni c;
        public ni d;
        public ni e;
        public List<ni> f = new ArrayList();
        public List<ni> g = new ArrayList();

        public static boolean c(ni niVar, ni niVar2) {
            if (niVar == null || niVar2 == null) {
                return (niVar == null) == (niVar2 == null);
            }
            if ((niVar instanceof nk) && (niVar2 instanceof nk)) {
                nk nkVar = (nk) niVar;
                nk nkVar2 = (nk) niVar2;
                return nkVar.j == nkVar2.j && nkVar.f6218k == nkVar2.f6218k;
            }
            if ((niVar instanceof nj) && (niVar2 instanceof nj)) {
                nj njVar = (nj) niVar;
                nj njVar2 = (nj) niVar2;
                return njVar.l == njVar2.l && njVar.f6217k == njVar2.f6217k && njVar.j == njVar2.j;
            }
            if ((niVar instanceof nl) && (niVar2 instanceof nl)) {
                nl nlVar = (nl) niVar;
                nl nlVar2 = (nl) niVar2;
                return nlVar.j == nlVar2.j && nlVar.f6219k == nlVar2.f6219k;
            }
            if ((niVar instanceof nm) && (niVar2 instanceof nm)) {
                nm nmVar = (nm) niVar;
                nm nmVar2 = (nm) niVar2;
                if (nmVar.j == nmVar2.j && nmVar.f6220k == nmVar2.f6220k) {
                    return true;
                }
            }
            return false;
        }

        public final void a() {
            this.f28837a = (byte) 0;
            this.f28838b = "";
            this.c = null;
            this.d = null;
            this.e = null;
            this.f.clear();
            this.g.clear();
        }

        public final void b(byte b2, String str, List<ni> list) {
            a();
            this.f28837a = b2;
            this.f28838b = str;
            if (list != null) {
                this.f.addAll(list);
                for (ni niVar : this.f) {
                    boolean z = niVar.i;
                    if (!z && niVar.h) {
                        this.d = niVar;
                    } else if (z && niVar.h) {
                        this.e = niVar;
                    }
                }
            }
            ni niVar2 = this.d;
            if (niVar2 == null) {
                niVar2 = this.e;
            }
            this.c = niVar2;
        }

        public final String toString() {
            return "CellInfo{radio=" + ((int) this.f28837a) + ", operator='" + this.f28838b + "', mainCell=" + this.c + ", mainOldInterCell=" + this.d + ", mainNewInterCell=" + this.e + ", cells=" + this.f + ", historyMainCellList=" + this.g + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public final a a(bbt bbtVar, boolean z, byte b2, String str, List<ni> list) {
        if (z) {
            this.d.a();
            return null;
        }
        this.d.b(b2, str, list);
        if (this.d.c == null) {
            return null;
        }
        if (this.c != null && !d(bbtVar) && a.c(this.d.d, this.f28835a) && a.c(this.d.e, this.f28836b)) {
            return null;
        }
        a aVar = this.d;
        this.f28835a = aVar.d;
        this.f28836b = aVar.e;
        this.c = bbtVar;
        vat.c(aVar.f);
        c(this.d);
        return this.d;
    }

    public final void b(ni niVar) {
        if (niVar == null) {
            return;
        }
        int size = this.e.size();
        if (size == 0) {
            this.e.add(niVar);
            return;
        }
        int i = -1;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            ni niVar2 = this.e.get(i2);
            if (niVar.equals(niVar2)) {
                int i4 = niVar.c;
                if (i4 == niVar2.c) {
                    break;
                }
                niVar2.e = i4;
                niVar2.c = i4;
                break;
            }
            jMin = Math.min(jMin, niVar2.e);
            if (jMin == niVar2.e) {
                i3 = i2;
            }
            i2++;
        }
        if (i >= 0) {
            if (size < 3) {
                this.e.add(niVar);
            } else {
                if (niVar.e <= jMin || i >= size) {
                    return;
                }
                this.e.remove(i);
                this.e.add(niVar);
            }
        }
    }

    public final void c(a aVar) {
        synchronized (this.e) {
            try {
                for (ni niVar : aVar.f) {
                    if (niVar != null && niVar.h) {
                        ni niVarClone = niVar.clone();
                        niVarClone.e = SystemClock.elapsedRealtime();
                        b(niVarClone);
                    }
                }
                this.d.g.clear();
                this.d.g.addAll(this.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(bbt bbtVar) {
        float f;
        float f2 = bbtVar.g;
        if (f2 > 10.0f) {
            f = 2000.0f;
        } else {
            f = f2 > 2.0f ? 500.0f : 100.0f;
        }
        return bbtVar.a(this.c) > ((double) f);
    }
}
