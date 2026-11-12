package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes20.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        if (tryOnMeasure(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    private boolean tryOnMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iResolveMinimumHeight;
        int measuredHeight;
        int measuredHeight2;
        int i3;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iResolveMinimumHeight = resolveMinimumHeight(view2);
            measuredHeight = view2.getMeasuredHeight() - iResolveMinimumHeight;
            paddingTop += iResolveMinimumHeight;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iResolveMinimumHeight = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingTop;
        if (view2 != null) {
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                i3 = iMin + iResolveMinimumHeight;
            } else {
                i3 = iResolveMinimumHeight;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            paddingTop = (paddingTop - iResolveMinimumHeight) + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + measuredHeight2, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        forceUniformWidth(childCount, i2);
        return true;
    }

    private void forceUniformWidth(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private static int resolveMinimumHeight(View view) {
        int minimumHeight = ViewCompat.getMinimumHeight(view);
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return resolveMinimumHeight(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int intrinsicHeight;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i10 = gravity & 112;
        if (i10 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i10 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
        } else {
            paddingTop = getPaddingTop();
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i5 = 0;
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
            i5 = 0;
        }
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i11 = layoutParams.gravity;
                if (i11 < 0) {
                    i11 = 8388615 & gravity;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity == 1) {
                    i6 = ((((i9 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i7 = layoutParams.rightMargin;
                } else {
                    if (absoluteGravity == 5) {
                        i6 = (i9 - paddingRight) - measuredWidth;
                        i7 = layoutParams.rightMargin;
                    } else {
                        i8 = layoutParams.leftMargin + paddingLeft;
                    }
                    if (hasDividerBeforeChildAt(i5)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + layoutParams.topMargin;
                    setChildFrame(childAt, i8, i12, measuredWidth, measuredHeight2);
                    paddingTop = i12 + measuredHeight2 + layoutParams.bottomMargin;
                }
                i8 = i6 - i7;
                if (hasDividerBeforeChildAt(i5)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + layoutParams.topMargin;
                setChildFrame(childAt, i8, i13, measuredWidth, measuredHeight2);
                paddingTop = i13 + measuredHeight2 + layoutParams.bottomMargin;
            }
            i5++;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
