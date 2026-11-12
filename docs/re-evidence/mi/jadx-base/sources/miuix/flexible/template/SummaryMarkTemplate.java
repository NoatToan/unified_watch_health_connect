package miuix.flexible.template;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.wsi;
import miuix.flexible.view.HyperCellLayout;

/* JADX INFO: loaded from: classes3.dex */
public class SummaryMarkTemplate extends AbstractMarkTemplate {
    private static final SparseArray<HyperCellLayout.LayoutParams> LARGE_PARAMS;
    private static final SparseArray<HyperCellLayout.LayoutParams> NORMAL_PARAMS;

    static {
        SparseArray<HyperCellLayout.LayoutParams> sparseArray = new SparseArray<>();
        NORMAL_PARAMS = sparseArray;
        sparseArray.put(wsi.l, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 1.0f, 16, 0));
        sparseArray.put(wsi.f38316b, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 1, 0, 10, 0, 0));
        sparseArray.put(wsi.n, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 0, 2));
        sparseArray.put(wsi.f38315a, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 1.0f, 17, 3, 0, 10, 0, 0));
        sparseArray.put(wsi.j, AbstractMarkTemplate.generateLayoutParams(3, 0.0f, 0.0f, 16, 4, 10, 10, 0, 0));
        sparseArray.put(wsi.c, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 17, 5, 10, 0, 0, 0));
        SparseArray<HyperCellLayout.LayoutParams> sparseArray2 = new SparseArray<>();
        LARGE_PARAMS = sparseArray2;
        sparseArray2.put(wsi.l, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 1.0f, 16, 0));
        sparseArray2.put(wsi.f38316b, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 1, 0, 10, 0, 0));
        sparseArray2.put(wsi.n, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 2));
        sparseArray2.put(wsi.f38315a, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 3, 0, 10, 0, 0));
        sparseArray2.put(wsi.j, AbstractMarkTemplate.generateLayoutParams(2, 0.0f, 0.0f, 0, 4, 0, 10, 0, 0));
        sparseArray2.put(wsi.c, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 17, 5, 10, 0, 0, 0));
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
        AbstractMarkTemplate.addAuxiliaryView(viewGroup, this.mContext, wsi.n);
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
