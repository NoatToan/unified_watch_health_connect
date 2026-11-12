package t61;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.text.NumberFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class i extends h32.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<Fragment> f162760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f162761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f162762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f162763d;

    public i(androidx.fragment.app.m mVar, int i14) {
        super(mVar.getSupportFragmentManager());
        this.f162760a = null;
        this.f162763d = i14;
        this.f162760a = new SparseArray<>();
        if (i14 == 3 || i14 == 4) {
            ArrayList arrayList = new ArrayList(2);
            this.f162761b = arrayList;
            f fVar = f.SEVEN_DAYS;
            arrayList.add(mVar.getString(fVar.f162747a));
            f fVar2 = f.FOUR_WEEKS;
            arrayList.add(mVar.getString(fVar2.f162747a));
            ArrayList arrayList2 = new ArrayList(2);
            this.f162762c = arrayList2;
            arrayList2.add(c(fVar, mVar));
            arrayList2.add(c(fVar2, mVar));
            return;
        }
        ArrayList arrayList3 = new ArrayList(3);
        this.f162761b = arrayList3;
        f fVar3 = f.FOUR_WEEKS;
        arrayList3.add(mVar.getString(fVar3.f162747a));
        f fVar4 = f.SIX_MONTHS;
        arrayList3.add(String.format(mVar.getString(fVar4.f162747a), NumberFormat.getInstance().format(6L)));
        f fVar5 = f.TWELVE_MONTHS;
        arrayList3.add(mVar.getString(fVar5.f162747a));
        ArrayList arrayList4 = new ArrayList(3);
        this.f162762c = arrayList4;
        arrayList4.add(c(fVar3, mVar));
        arrayList4.add(c(fVar4, mVar));
        arrayList4.add(c(fVar5, mVar));
    }

    public static String c(f fVar, androidx.fragment.app.m mVar) {
        String str = fVar.f162750d;
        int i14 = fVar.f162749c;
        return str != null ? mVar.getString(i14, str) : mVar.getString(i14);
    }

    @Override // androidx.fragment.app.a0, fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        super.destroyItem(viewGroup, i14, obj);
        this.f162760a.remove(i14);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44034e() {
        return this.f162761b.size();
    }

    @Override // androidx.fragment.app.a0
    public final Fragment getItem(int i14) {
        int i15 = this.f162763d;
        if (i15 == 3 || i15 == 4) {
            return i14 != 0 ? g.y6(f.FOUR_WEEKS, i15) : g.y6(f.SEVEN_DAYS, i15);
        }
        if (i14 != 0) {
            return i14 != 1 ? g.y6(f.TWELVE_MONTHS, i15) : g.y6(f.SIX_MONTHS, i15);
        }
        return g.y6(f.FOUR_WEEKS, i15);
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        return (CharSequence) this.f162761b.get(i14);
    }

    @Override // androidx.fragment.app.a0, fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i14);
        this.f162760a.put(i14, fragment);
        return fragment;
    }
}
