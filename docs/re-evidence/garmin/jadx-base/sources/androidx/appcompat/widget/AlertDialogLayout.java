package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public static int b(View view2) {
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        int minimumHeight = view2.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            if (viewGroup.getChildCount() == 1) {
                return b(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int iA;
        int i18;
        int i19;
        int paddingLeft = getPaddingLeft();
        int i24 = i16 - i14;
        int paddingRight = i24 - getPaddingRight();
        int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i25 = gravity & 112;
        int i26 = gravity & 8388615;
        int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i17) - i15) - measuredHeight : (((i17 - i15) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                int i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i28 < 0) {
                    i28 = i26;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        iA = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(i27)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i29 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i19, i29, measuredWidth + i19, i29 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i29;
                } else {
                    iA = am.j.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i18 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i19 = iA - i18;
                if (hasDividerBeforeChildAt(i27)) {
                    paddingTop += intrinsicHeight;
                }
                int i210 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                childAt.layout(i19, i210, measuredWidth + i19, i210 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i210;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i14, int i15) {
        int iCombineMeasuredStates;
        int iB;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view2 = null;
        View view3 = null;
        View view4 = null;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = alertDialogLayout.getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int id3 = childAt.getId();
                if (id3 == R.id.topPanel) {
                    view2 = childAt;
                } else if (id3 == R.id.buttonPanel) {
                    view3 = childAt;
                } else {
                    if ((id3 != R.id.contentPanel && id3 != R.id.customPanel) || view4 != null) {
                        super.onMeasure(i14, i15);
                        return;
                    }
                    view4 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i14);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view2 != null) {
            view2.measure(i14, 0);
            paddingBottom += view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view2.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view3 != null) {
            view3.measure(i14, 0);
            iB = b(view3);
            measuredHeight = view3.getMeasuredHeight() - iB;
            paddingBottom += iB;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            iB = 0;
            measuredHeight = 0;
        }
        if (view4 != null) {
            view4.measure(i14, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view4.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view4.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i17 = size - paddingBottom;
        if (view3 != null) {
            int i18 = paddingBottom - iB;
            int iMin = Math.min(i17, measuredHeight);
            if (iMin > 0) {
                i17 -= iMin;
                iB += iMin;
            }
            view3.measure(i14, View.MeasureSpec.makeMeasureSpec(iB, 1073741824));
            paddingBottom = i18 + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        if (view4 != null && i17 > 0) {
            view4.measure(i14, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i17, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view4.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view4.getMeasuredState());
        }
        int iMax = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = alertDialogLayout.getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i24 = i15;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i14, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i24, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i25 = 0;
            while (i25 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i25);
                if (childAt3.getVisibility() != 8) {
                    LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).width == -1) {
                        int i26 = ((LinearLayout.LayoutParams) aVar).height;
                        ((LinearLayout.LayoutParams) aVar).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i24, 0);
                        ((LinearLayout.LayoutParams) aVar).height = i26;
                    }
                }
                i25++;
                alertDialogLayout = this;
                i24 = i15;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
