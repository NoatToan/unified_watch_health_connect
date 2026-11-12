package androidx.viewpager2.widget;

import am.j;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends RecyclerView.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.viewpager2.widget.a f11375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f11376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager2.l f11377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f11378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f11381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11386l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f11388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11389c;
    }

    public c(ViewPager2 viewPager2) {
        this.f11376b = viewPager2;
        ViewPager2.l lVar = viewPager2.f11346j;
        this.f11377c = lVar;
        this.f11378d = (LinearLayoutManager) lVar.getLayoutManager();
        this.f11381g = new a();
        b();
    }

    public final void a(int i14) {
        if ((this.f11379e == 3 && this.f11380f == 0) || this.f11380f == i14) {
            return;
        }
        this.f11380f = i14;
        androidx.viewpager2.widget.a aVar = this.f11375a;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i14);
        }
    }

    public final void b() {
        this.f11379e = 0;
        this.f11380f = 0;
        a aVar = this.f11381g;
        aVar.f11387a = -1;
        aVar.f11388b = 0.0f;
        aVar.f11389c = 0;
        this.f11382h = -1;
        this.f11383i = -1;
        this.f11384j = false;
        this.f11385k = false;
        this.f11386l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136 A[LOOP:2: B:64:0x012a->B:67:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0139 A[SYNTHETIC] */
    public final void c() {
        int top;
        int childCount;
        int top2;
        int i14;
        int bottom;
        int i15;
        LinearLayoutManager linearLayoutManager = this.f11378d;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        a aVar = this.f11381g;
        aVar.f11387a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.f11387a = -1;
            aVar.f11388b = 0.0f;
            aVar.f11389c = 0;
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.f11387a = -1;
            aVar.f11388b = 0.0f;
            aVar.f11389c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
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
        int orientation = linearLayoutManager.getOrientation();
        ViewPager2.l lVar = this.f11377c;
        if (orientation == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - lVar.getPaddingLeft();
            if (this.f11376b.f11343g.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - lVar.getPaddingTop();
        }
        int i16 = -top;
        aVar.f11389c = i16;
        if (i16 >= 0) {
            aVar.f11388b = height != 0 ? i16 / height : 0.0f;
            return;
        }
        ie.b bVar = new ie.b(linearLayoutManager);
        LinearLayoutManager linearLayoutManager2 = bVar.f93068a;
        int childCount2 = linearLayoutManager2.getChildCount();
        if (childCount2 != 0) {
            boolean z14 = linearLayoutManager2.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount2, 2);
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt = linearLayoutManager2.getChildAt(i17);
                if (childAt == null) {
                    h.z("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : ie.b.f93067b;
                int[] iArr2 = iArr[i17];
                if (z14) {
                    top2 = childAt.getLeft();
                    i14 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i14 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i14;
                int[] iArr3 = iArr[i17];
                if (z14) {
                    bottom = childAt.getRight();
                    i15 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i15 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i15;
            }
            Arrays.sort(iArr, new ie.a(bVar));
            int i18 = 1;
            while (true) {
                if (i18 >= childCount2) {
                    int[] iArr4 = iArr[0];
                    int i19 = iArr4[1];
                    int i24 = iArr4[0];
                    int i25 = i19 - i24;
                    if (i24 <= 0 && iArr[childCount2 - 1][1] >= i25) {
                        if (linearLayoutManager2.getChildCount() <= 1) {
                        }
                    }
                } else if (iArr[i18 - 1][1] == iArr[i18][0]) {
                    i18++;
                }
                childCount = linearLayoutManager2.getChildCount();
                for (int i26 = 0; i26 < childCount; i26++) {
                    if (!ie.b.a(linearLayoutManager2.getChildAt(i26))) {
                        h.z("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager2.getChildCount() <= 1) {
            childCount = linearLayoutManager2.getChildCount();
            while (i26 < childCount) {
                if (!ie.b.a(linearLayoutManager2.getChildAt(i26))) {
                    h.z("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        h.z(j.h(aVar.f11389c, "Page can only be offset by a positive amount, not by "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i14) {
        androidx.viewpager2.widget.a aVar;
        androidx.viewpager2.widget.a aVar2;
        int i15 = this.f11379e;
        if (!(i15 == 1 && this.f11380f == 1) && i14 == 1) {
            this.f11379e = 1;
            int i16 = this.f11383i;
            if (i16 != -1) {
                this.f11382h = i16;
                this.f11383i = -1;
            } else if (this.f11382h == -1) {
                this.f11382h = this.f11378d.findFirstVisibleItemPosition();
            }
            a(1);
            return;
        }
        if ((i15 == 1 || i15 == 4) && i14 == 2) {
            if (this.f11385k) {
                a(2);
                this.f11384j = true;
                return;
            }
            return;
        }
        a aVar3 = this.f11381g;
        if ((i15 == 1 || i15 == 4) && i14 == 0) {
            c();
            if (!this.f11385k) {
                int i17 = aVar3.f11387a;
                if (i17 != -1 && (aVar2 = this.f11375a) != null) {
                    aVar2.onPageScrolled(i17, 0.0f, 0);
                }
            } else if (aVar3.f11389c == 0) {
                int i18 = this.f11382h;
                int i19 = aVar3.f11387a;
                if (i18 != i19 && (aVar = this.f11375a) != null) {
                    aVar.onPageSelected(i19);
                }
            }
            a(0);
            b();
        }
        if (this.f11379e == 2 && i14 == 0 && this.f11386l) {
            c();
            if (aVar3.f11389c == 0) {
                int i24 = this.f11383i;
                int i25 = aVar3.f11387a;
                if (i24 != i25) {
                    if (i25 == -1) {
                        i25 = 0;
                    }
                    androidx.viewpager2.widget.a aVar4 = this.f11375a;
                    if (aVar4 != null) {
                        aVar4.onPageSelected(i25);
                    }
                }
                a(0);
                b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
        int i16;
        androidx.viewpager2.widget.a aVar;
        this.f11385k = true;
        c();
        boolean z14 = this.f11384j;
        a aVar2 = this.f11381g;
        if (z14) {
            this.f11384j = false;
            if (i15 <= 0) {
                if (i15 == 0) {
                    if ((i14 < 0) == (this.f11376b.f11343g.getLayoutDirection() == 1)) {
                        if (aVar2.f11389c != 0) {
                            i16 = aVar2.f11387a + 1;
                        }
                    }
                }
                i16 = aVar2.f11387a;
            } else if (aVar2.f11389c != 0) {
                i16 = aVar2.f11387a + 1;
            } else {
                i16 = aVar2.f11387a;
            }
            this.f11383i = i16;
            if (this.f11382h != i16 && (aVar = this.f11375a) != null) {
                aVar.onPageSelected(i16);
            }
        } else if (this.f11379e == 0) {
            int i17 = aVar2.f11387a;
            if (i17 == -1) {
                i17 = 0;
            }
            androidx.viewpager2.widget.a aVar3 = this.f11375a;
            if (aVar3 != null) {
                aVar3.onPageSelected(i17);
            }
        }
        int i18 = aVar2.f11387a;
        if (i18 == -1) {
            i18 = 0;
        }
        float f14 = aVar2.f11388b;
        int i19 = aVar2.f11389c;
        androidx.viewpager2.widget.a aVar4 = this.f11375a;
        if (aVar4 != null) {
            aVar4.onPageScrolled(i18, f14, i19);
        }
        int i24 = aVar2.f11387a;
        int i25 = this.f11383i;
        if ((i24 == i25 || i25 == -1) && aVar2.f11389c == 0 && this.f11380f != 1) {
            a(0);
            b();
        }
    }
}
