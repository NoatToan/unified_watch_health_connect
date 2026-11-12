package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ub1;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RecyclerView.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.i f3172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f3173b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public a g;
    public int h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3174k;
    public boolean l;
    public boolean m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f3176b;
        public int c;

        public void a() {
            this.f3175a = -1;
            this.f3176b = 0.0f;
            this.c = 0;
        }
    }

    public d(ViewPager2 viewPager2) {
        this.f3173b = viewPager2;
        RecyclerView recyclerView = viewPager2.j;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new a();
        l();
    }

    public final void a(int i, float f, int i2) {
        ViewPager2.i iVar = this.f3172a;
        if (iVar != null) {
            iVar.onPageScrolled(i, f, i2);
        }
    }

    public final void b(int i) {
        ViewPager2.i iVar = this.f3172a;
        if (iVar != null) {
            iVar.onPageSelected(i);
        }
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        ViewPager2.i iVar = this.f3172a;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i);
        }
    }

    public final int d() {
        return this.d.findFirstVisibleItemPosition();
    }

    public double e() {
        o();
        a aVar = this.g;
        return ((double) aVar.f3175a) + ((double) aVar.f3176b);
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.m;
    }

    public boolean h() {
        return this.f == 0;
    }

    public final boolean i() {
        int i = this.e;
        return i == 1 || i == 4;
    }

    public void j() {
        this.l = true;
    }

    public void k(int i, boolean z) {
        this.e = z ? 2 : 3;
        this.m = false;
        boolean z2 = this.i != i;
        this.i = i;
        c(2);
        if (z2) {
            b(i);
        }
    }

    public final void l() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f3174k = false;
        this.m = false;
        this.l = false;
    }

    public void m(ViewPager2.i iVar) {
        this.f3172a = iVar;
    }

    public final void n(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = d();
        }
        c(1);
    }

    public final void o() {
        int top;
        a aVar = this.g;
        int iFindFirstVisibleItemPosition = this.d.findFirstVisibleItemPosition();
        aVar.f3175a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View viewFindViewByPosition = this.d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.c.getPaddingLeft();
            if (this.f3173b.e()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.c.getPaddingTop();
        }
        int i = -top;
        aVar.c = i;
        if (i >= 0) {
            aVar.f3176b = height == 0 ? 0.0f : i / height;
        } else {
            if (!new ub1(this.d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (!(this.e == 1 && this.f == 1) && i == 1) {
            n(false);
            return;
        }
        if (i() && i == 2) {
            if (this.f3174k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i() && i == 0) {
            o();
            if (this.f3174k) {
                a aVar = this.g;
                if (aVar.c == 0) {
                    int i2 = this.h;
                    int i3 = aVar.f3175a;
                    if (i2 != i3) {
                        b(i3);
                    }
                }
            } else {
                int i4 = this.g.f3175a;
                if (i4 != -1) {
                    a(i4, 0.0f, 0);
                }
            }
            c(0);
            l();
        }
        if (this.e == 2 && i == 0 && this.l) {
            o();
            a aVar2 = this.g;
            if (aVar2.c == 0) {
                int i5 = this.i;
                int i6 = aVar2.f3175a;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    b(i6);
                }
                c(0);
                l();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        a aVar;
        int i3;
        this.f3174k = true;
        o();
        if (this.j) {
            this.j = false;
            if (i2 > 0) {
                aVar = this.g;
                if (aVar.c != 0) {
                    i3 = aVar.f3175a + 1;
                } else {
                    i3 = this.g.f3175a;
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.f3173b.e()) {
                        aVar = this.g;
                        if (aVar.c != 0) {
                            i3 = aVar.f3175a + 1;
                        }
                    }
                }
                i3 = this.g.f3175a;
            }
            this.i = i3;
            if (this.h != i3) {
                b(i3);
            }
        } else if (this.e == 0) {
            int i4 = this.g.f3175a;
            if (i4 == -1) {
                i4 = 0;
            }
            b(i4);
        }
        a aVar2 = this.g;
        int i5 = aVar2.f3175a;
        if (i5 == -1) {
            i5 = 0;
        }
        a(i5, aVar2.f3176b, aVar2.c);
        a aVar3 = this.g;
        int i6 = aVar3.f3175a;
        int i7 = this.i;
        if ((i6 == i7 || i7 == -1) && aVar3.c == 0 && this.f != 1) {
            c(0);
            l();
        }
    }
}
