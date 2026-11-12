package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.PointerEvents;

/* JADX INFO: loaded from: classes4.dex */
public class yjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f40253a = new float[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PointF f40254b = new PointF();
    public static final float[] c = new float[2];
    public static final Matrix d = new Matrix();

    public static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static int b(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View viewA;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View viewD = d(fArr, viewGroup);
        if (viewD == null || (viewA = a(viewD)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = viewA.getId();
        }
        return f(viewA, fArr[0], fArr[1]);
    }

    public static int c(float f, float f2, ViewGroup viewGroup) {
        return b(f, f2, viewGroup, f40253a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View d(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        agj agjVar = viewGroup instanceof agj ? (agj) viewGroup : null;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(agjVar != null ? agjVar.getZIndexMappedChildIndex(i) : i);
            PointF pointF = f40254b;
            if (g(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewE = e(fArr, childAt);
                if (viewE != null) {
                    return viewE;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View e(float[] fArr, View view) {
        PointerEvents pointerEvents = view instanceof hej ? ((hej) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (pointerEvents == PointerEvents.BOX_ONLY) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        if (pointerEvents == PointerEvents.NONE) {
            return null;
        }
        if (pointerEvents == PointerEvents.BOX_ONLY) {
            return view;
        }
        if (pointerEvents != PointerEvents.BOX_NONE) {
            if (pointerEvents == PointerEvents.AUTO) {
                return (!((view instanceof tcj) && ((tcj) view).interceptsTouchEvent(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? d(fArr, (ViewGroup) view) : view;
            }
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + pointerEvents.toString());
        }
        if (view instanceof ViewGroup) {
            View viewD = d(fArr, (ViewGroup) view);
            if (viewD != view) {
                return viewD;
            }
            if ((view instanceof scj) && ((scj) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                return view;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(View view, float f, float f2) {
        return view instanceof scj ? ((scj) view).reactTagForTouch(f, f2) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof idj) {
            idj idjVar = (idj) view;
            if (idjVar.getHitSlopRect() != null) {
                Rect hitSlopRect = idjVar.getHitSlopRect();
                if (scrollX < (-hitSlopRect.left) || scrollX >= (view.getRight() - view.getLeft()) + hitSlopRect.right || scrollY < (-hitSlopRect.top) || scrollY >= (view.getBottom() - view.getTop()) + hitSlopRect.bottom) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= view.getRight() - view.getLeft() || scrollY < 0.0f || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
