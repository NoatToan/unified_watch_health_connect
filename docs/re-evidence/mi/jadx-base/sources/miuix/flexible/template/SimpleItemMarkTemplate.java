package miuix.flexible.template;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.wsi;
import miuix.flexible.view.HyperCellLayout;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleItemMarkTemplate extends AbstractMarkTemplate {
    private static final SparseArray<HyperCellLayout.LayoutParams> LARGE_PARAMS;
    private static final SparseArray<HyperCellLayout.LayoutParams> NORMAL_PARAMS;

    static {
        SparseArray<HyperCellLayout.LayoutParams> sparseArray = new SparseArray<>();
        NORMAL_PARAMS = sparseArray;
        sparseArray.put(wsi.e, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 17, 0, 0, 0, 10, 0));
        sparseArray.put(wsi.f38316b, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 0, 1));
        SparseArray<HyperCellLayout.LayoutParams> sparseArray2 = new SparseArray<>();
        LARGE_PARAMS = sparseArray2;
        sparseArray2.put(wsi.e, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 17, 0, 0, 0, 10, 0));
        sparseArray2.put(wsi.f38316b, AbstractMarkTemplate.generateLayoutParams(1, 0.0f, 0.0f, 0, 1));
    }

    @Override // miuix.flexible.template.AbstractMarkTemplate
    public HyperCellLayout.LayoutParams getLayoutParams(View view) {
        HyperCellLayout.LayoutParams childViewLayoutParamsSafe = getChildViewLayoutParamsSafe(view);
        int iC = childViewLayoutParamsSafe.c();
        HyperCellLayout.LayoutParams layoutParams = getLevel() == 1 ? NORMAL_PARAMS.get(iC) : LARGE_PARAMS.get(iC);
        return layoutParams == null ? childViewLayoutParamsSafe : layoutParams;
    }

    @Override // miuix.flexible.template.AbstractMarkTemplate, miuix.flexible.template.IHyperCellTemplate
    public void onFinishInflate(ViewGroup viewGroup) {
        super.onFinishInflate(viewGroup);
        final View viewFindViewByAreaId = findViewByAreaId(viewGroup, wsi.e);
        View viewFindViewByAreaId2 = findViewByAreaId(viewGroup, wsi.f38316b);
        if (viewFindViewByAreaId2 == null || viewFindViewByAreaId2.hasOnClickListeners()) {
            return;
        }
        viewFindViewByAreaId2.setOnClickListener(new View.OnClickListener() { // from class: miuix.flexible.template.SimpleItemMarkTemplate.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View view2 = viewFindViewByAreaId;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
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
