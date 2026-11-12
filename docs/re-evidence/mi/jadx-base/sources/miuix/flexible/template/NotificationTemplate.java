package miuix.flexible.template;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.wsi;
import miuix.flexible.view.HyperCellLayout;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationTemplate extends AbstractMarkTemplate {
    private static final SparseArray<HyperCellLayout.LayoutParams> LARGE_PARAMS;
    private static final SparseArray<HyperCellLayout.LayoutParams> NORMAL_PARAMS;

    static {
        SparseArray<HyperCellLayout.LayoutParams> sparseArray = new SparseArray<>();
        NORMAL_PARAMS = sparseArray;
        sparseArray.put(wsi.e, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 48, 0).q(0, 0, 16, 0));
        sparseArray.put(wsi.n, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 1.0f, 0, 1));
        sparseArray.put(wsi.l, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 16, 2).q(0, 0, 0, 0));
        sparseArray.put(wsi.m, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 16, 3).q(8, 0, 0, 0).t(1));
        sparseArray.put(wsi.o, AbstractMarkTemplate.generateLayoutParams(3, 1.0f, 0.0f, 0, 4));
        sparseArray.put(wsi.f38315a, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 16, 5).q(8, 0, 0, 0).t(1));
        sparseArray.put(wsi.f38316b, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 6).q(0, 10, 0, 0));
        sparseArray.put(wsi.c, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 17, 7).q(10, 0, 0, 0));
        SparseArray<HyperCellLayout.LayoutParams> sparseArray2 = new SparseArray<>();
        LARGE_PARAMS = sparseArray2;
        sparseArray2.put(wsi.n, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 1.0f, 0, 0));
        sparseArray2.put(wsi.e, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 16, 1).q(0, 0, 16, 0));
        sparseArray2.put(wsi.l, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 16, 2).q(0, 0, 0, 0));
        sparseArray2.put(wsi.m, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 16, 3).q(0, 4, 0, 0).t(1));
        sparseArray2.put(wsi.o, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 4));
        sparseArray2.put(wsi.f38316b, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 5).q(0, 10, 0, 0));
        sparseArray2.put(wsi.f38315a, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 6).q(0, 4, 0, 0).t(1));
        sparseArray2.put(wsi.c, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 17, 7).q(10, 0, 0, 0));
    }

    @Override // miuix.flexible.template.AbstractMarkTemplate
    public HyperCellLayout.LayoutParams getLayoutParams(View view) {
        HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(view);
        int iC = childViewLayoutParamsSafe.c();
        HyperCellLayout.LayoutParams layoutParams = getLevel() == 1 ? NORMAL_PARAMS.get(iC) : LARGE_PARAMS.get(iC);
        return layoutParams == null ? childViewLayoutParamsSafe : layoutParams;
    }

    @Override // miuix.flexible.template.AbstractMarkTemplate
    public void onAddAuxiliaryViews(ViewGroup viewGroup) {
        super.onAddAuxiliaryViews(viewGroup);
        AbstractMarkTemplate.addAuxiliaryView(viewGroup, this.mContext, wsi.n, -1, 0);
        AbstractMarkTemplate.addAuxiliaryView(viewGroup, this.mContext, wsi.o, -1, 0);
    }

    @Override // miuix.flexible.template.AbstractMarkTemplate
    public void onPreBuildViewTree(ViewGroup viewGroup) {
        super.onPreBuildViewTree(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(childAt);
            HyperCellLayout.LayoutParams layoutParams = getLayoutParams(childAt);
            setGravity(childViewLayoutParamsSafe, layoutParams);
            setMargin(childViewLayoutParamsSafe, layoutParams);
            setPriority(childViewLayoutParamsSafe, layoutParams);
        }
    }
}
