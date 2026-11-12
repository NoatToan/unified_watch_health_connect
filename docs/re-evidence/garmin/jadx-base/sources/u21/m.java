package u21;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu21/m;", "", "", "Ls21/i;", "meals", "", "showLastMealDialog", "navigateBackWithData", "<init>", "(Ljava/util/List;ZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s21.i> f168038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168040c;

    public m(List list, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
    }

    public static m a(m mVar, ArrayList arrayList, boolean z14, boolean z15, int i14) {
        List<s21.i> list = arrayList;
        if ((i14 & 1) != 0) {
            list = mVar.f168038a;
        }
        if ((i14 & 2) != 0) {
            z14 = mVar.f168039b;
        }
        if ((i14 & 4) != 0) {
            z15 = mVar.f168040c;
        }
        mVar.getClass();
        list.getClass();
        return new m(list, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.f168038a, mVar.f168038a) && this.f168039b == mVar.f168039b && this.f168040c == mVar.f168040c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168040c) + q6.f.g(this.f168038a.hashCode() * 31, 31, this.f168039b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ManageMealsUIState(meals=");
        sb3.append(this.f168038a);
        sb3.append(", showLastMealDialog=");
        sb3.append(this.f168039b);
        sb3.append(", navigateBackWithData=");
        return hb.a.k(sb3, this.f168040c, ")");
    }

    public m(List<s21.i> list, boolean z14, boolean z15) {
        list.getClass();
        this.f168038a = list;
        this.f168039b = z14;
        this.f168040c = z15;
    }

    public m() {
        this(null, false, false, 7, null);
    }
}
