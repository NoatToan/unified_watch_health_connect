package defpackage;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;

/* JADX INFO: loaded from: classes20.dex */
public class xgn extends HwPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HwPagerAdapter f52886c;
    private boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52884a = 4;
    private int d = 2;
    private SparseArray<e> e = new SparseArray<>();

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f52887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f52888b;
        int e;

        e(ViewGroup viewGroup, int i, Object obj) {
            this.f52888b = viewGroup;
            this.e = i;
            this.f52887a = obj;
        }
    }

    public xgn(HwPagerAdapter hwPagerAdapter, boolean z) {
        this.f52886c = hwPagerAdapter;
        this.f52885b = z;
    }

    private int b() {
        return (c() + e()) - 1;
    }

    private int c() {
        return this.d;
    }

    public int a(int i) {
        int iE = e();
        if (iE == 0) {
            return 0;
        }
        int i2 = (i - this.d) % iE;
        return i2 < 0 ? i2 + iE : i2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void a(DataSetObserver dataSetObserver) {
        this.f52886c.a(dataSetObserver);
    }

    public int c(int i) {
        return i + this.d;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        int iC = c();
        int iB = b();
        int iA = this.f52885b ? a(i) : i;
        if (this.i && (i == iC || i == iB)) {
            this.e.put(i, new e(viewGroup, iA, obj));
        } else {
            this.f52886c.destroyItem(viewGroup, iA, obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f52886c.finishUpdate(viewGroup);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return this.f52885b ? this.f52886c.getCount() + this.f52884a : this.f52886c.getCount();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return this.f52886c.getItemPosition(obj);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public CharSequence getPageTitle(int i) {
        if (this.f52885b) {
            i = a(i);
        }
        return this.f52886c.getPageTitle(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public float getPageWidth(int i) {
        if (this.f52885b) {
            i = a(i);
        }
        return this.f52886c.getPageWidth(i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        e eVar;
        int iA = this.f52885b ? a(i) : i;
        if (!this.i || (eVar = this.e.get(i)) == null) {
            return this.f52886c.instantiateItem(viewGroup, iA);
        }
        this.e.remove(i);
        return eVar.f52887a;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f52886c.isViewFromObject(view, obj);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void notifyDataSetChanged() {
        this.e = new SparseArray<>();
        this.f52886c.notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f52886c.registerDataSetObserver(dataSetObserver);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f52886c.restoreState(parcelable, classLoader);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Parcelable saveState() {
        return this.f52886c.saveState();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f52885b) {
            i = a(i);
        }
        this.f52886c.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f52886c.startUpdate(viewGroup);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f52886c.unregisterDataSetObserver(dataSetObserver);
    }

    public void b(boolean z) {
        this.i = z;
    }

    public HwPagerAdapter d() {
        return this.f52886c;
    }

    public void d(int i) {
        int i2 = i - 1;
        this.d = i2;
        this.f52884a = i + i2;
    }

    public int a() {
        return this.f52884a;
    }

    public int e() {
        return this.f52886c.getCount();
    }
}
