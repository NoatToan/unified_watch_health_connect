package sa;

import androidx.media3.common.e0;
import com.google.common.collect.ImmutableList;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f158151d = new r(new e0[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f158152e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<e0> f158154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158155c;

    static {
        int i14 = z.f70071a;
        f158152e = Integer.toString(0, 36);
    }

    public r(e0... e0VarArr) {
        ImmutableList<e0> immutableListCopyOf = ImmutableList.copyOf(e0VarArr);
        this.f158154b = immutableListCopyOf;
        this.f158153a = e0VarArr.length;
        int i14 = 0;
        while (i14 < immutableListCopyOf.size()) {
            int i15 = i14 + 1;
            for (int i16 = i15; i16 < immutableListCopyOf.size(); i16++) {
                if (immutableListCopyOf.get(i14).equals(immutableListCopyOf.get(i16))) {
                    fa.k.d("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i14 = i15;
        }
    }

    public final e0 a(int i14) {
        return this.f158154b.get(i14);
    }

    public final int b(e0 e0Var) {
        int iIndexOf = this.f158154b.indexOf(e0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f158153a == rVar.f158153a && this.f158154b.equals(rVar.f158154b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f158155c == 0) {
            this.f158155c = this.f158154b.hashCode();
        }
        return this.f158155c;
    }
}
