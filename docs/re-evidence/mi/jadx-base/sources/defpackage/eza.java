package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class eza extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f17214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17215b;

    public eza(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f17214a = viewGroup;
        viewGroup.setTag(ypi.f40403b, this);
        utq.b(this.f17214a).c(this);
        this.f17215b = true;
    }

    public static eza b(ViewGroup viewGroup) {
        return (eza) viewGroup.getTag(ypi.f40403b);
    }

    public static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(utq.a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    public static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < iMin; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    public void a(gza gzaVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(gzaVar.c, arrayList);
        int iC = c(arrayList);
        if (iC < 0 || iC >= getChildCount()) {
            addView(gzaVar);
        } else {
            addView(gzaVar, iC);
        }
    }

    public final int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            d(((gza) getChildAt(i2)).c, arrayList2);
            if (f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    public void g() {
        if (!this.f17215b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        utq.b(this.f17214a).d(this);
        utq.b(this.f17214a).c(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f17215b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f17214a.setTag(ypi.f40403b, null);
            utq.b(this.f17214a).d(this);
            this.f17215b = false;
        }
    }
}
