package defpackage;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class ewq implements wc0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f17138a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<View> f17139b = new ArrayList<>();
    public int c = -1;
    public boolean d = true;
    public int e = -1;
    public int f = -1;
    public ViewGroup g = null;
    public ViewPager h;
    public j77 i;

    public ewq(ViewPager viewPager, j77 j77Var) {
        this.h = viewPager;
        this.i = j77Var;
    }

    public void a(ViewGroup viewGroup) {
        d(viewGroup, this.f17139b);
        if (this.f17139b.isEmpty()) {
            return;
        }
        Iterator<View> it = this.f17139b.iterator();
        while (it.hasNext()) {
            it.next().setTranslationX(0.0f);
        }
    }

    public void b(ArrayList<View> arrayList, ViewGroup viewGroup) {
        for (View view : arrayList) {
            if (viewGroup.indexOfChild(view) == -1 && view.getTranslationX() != 0.0f) {
                view.setTranslationX(0.0f);
            }
        }
    }

    public int c(int i, int i2, int i3, float f) {
        float f2 = (i < i3 ? (i * i2) / i3 : i2) + ((0.1f - ((f * f) / 0.9f)) * i2);
        if (f2 > 0.0f) {
            return (int) f2;
        }
        return 0;
    }

    public void d(ViewGroup viewGroup, ArrayList<View> arrayList) {
        b(arrayList, viewGroup);
        arrayList.clear();
        dyq.c(viewGroup, this.f17138a);
        if (this.f17138a.isEmpty()) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() != 8 || childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
    }

    public void e(ViewGroup viewGroup, int i, int i2, float f, boolean z) {
        d(viewGroup, this.f17139b);
        if (this.f17139b.isEmpty()) {
            return;
        }
        int i3 = 0;
        int top = this.f17139b.get(0).getTop();
        int i4 = Integer.MAX_VALUE;
        for (View view : this.f17139b) {
            if (i4 != view.getTop()) {
                int top2 = view.getTop();
                int iC = c(top2 - top, i, i2, f);
                if (!z) {
                    iC = -iC;
                }
                int i5 = iC;
                i4 = top2;
                i3 = i5;
            }
            view.setTranslationX(i3);
        }
    }

    @Override // wc0.a
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.c = this.h.getCurrentItem();
            this.d = true;
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                a(viewGroup);
            }
        }
    }

    @Override // wc0.a
    public void onPageScrolled(int i, float f, boolean z, boolean z2) {
        if (f == 0.0f) {
            this.c = i;
            this.d = true;
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                a(viewGroup);
            }
        }
        if (this.e != i) {
            int i2 = this.c;
            if (i2 < i) {
                this.c = i;
            } else {
                int i3 = i + 1;
                if (i2 > i3) {
                    this.c = i3;
                }
            }
            this.e = i;
            this.d = true;
            ViewGroup viewGroup2 = this.g;
            if (viewGroup2 != null) {
                a(viewGroup2);
            }
        }
        if (f > 0.0f) {
            if (this.d) {
                this.d = false;
                if (this.c != i || i >= this.i.getCount() - 1) {
                    this.f = i;
                } else {
                    this.f = i + 1;
                }
                Fragment fragmentD = this.i.d(this.f, false);
                this.g = null;
                if (fragmentD != null && fragmentD.getView() != null) {
                    View viewFindViewById = fragmentD.getView().findViewById(R.id.list);
                    if (viewFindViewById instanceof ViewGroup) {
                        this.g = (ViewGroup) viewFindViewById;
                    }
                }
            }
            if (this.f == i) {
                f = 1.0f - f;
            }
            float f2 = f;
            ViewGroup viewGroup3 = this.g;
            if (viewGroup3 != null) {
                e(viewGroup3, viewGroup3.getWidth(), this.g.getHeight(), f2, this.f != i);
            }
        }
    }

    @Override // wc0.a
    public void onPageSelected(int i) {
    }
}
