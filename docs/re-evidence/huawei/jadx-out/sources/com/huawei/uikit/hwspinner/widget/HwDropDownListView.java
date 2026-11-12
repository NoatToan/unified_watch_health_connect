package com.huawei.uikit.hwspinner.widget;

import android.R;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.ListViewAutoScrollHelper;
import defpackage.xeh;

/* JADX INFO: loaded from: classes20.dex */
public class HwDropDownListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListViewAutoScrollHelper f29710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29711c;
    private boolean d;
    private boolean e;
    private int i;

    public HwDropDownListView(Context context, boolean z) {
        this(context, z, R.attr.dropDownListViewStyle);
    }

    private void b() {
        setPressed(false);
        xeh.b(this, "updateSelectorState", null, null, AbsListView.class);
        Object objC = xeh.c(this, "mMotionPosition", (Class<?>) AbsListView.class);
        if (objC instanceof Integer) {
            this.f29709a = ((Integer) objC).intValue();
        }
        View childAt = getChildAt(this.f29709a - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    private void d() {
        xeh.b(this, "setShowHoverEnabled", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE}, AbsListView.class);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    public boolean c(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        ListViewAutoScrollHelper listViewAutoScrollHelper;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    b();
                }
                if (z) {
                    if (this.f29710b == null) {
                        this.f29710b = new ListViewAutoScrollHelper(this);
                    }
                    this.f29710b.setEnabled(true);
                    this.f29710b.onTouch(this, motionEvent);
                }
                listViewAutoScrollHelper = this.f29710b;
                if (listViewAutoScrollHelper != null) {
                    listViewAutoScrollHelper.setEnabled(false);
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z2 = false;
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                e(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    performItemClick(childAt, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            b();
        } else {
            b();
        }
        if (z) {
            if (this.f29710b == null) {
                this.f29710b = new ListViewAutoScrollHelper(this);
            }
            this.f29710b.setEnabled(true);
            this.f29710b.onTouch(this, motionEvent);
        }
        listViewAutoScrollHelper = this.f29710b;
        if (listViewAutoScrollHelper != null) {
            listViewAutoScrollHelper.setEnabled(false);
        }
        return z;
    }

    protected int e(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i5 = layoutParams.height;
                view.measure(i, i5 <= 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                view.forceLayout();
                int dividerHeight = (getDividerHeight() <= 0 || getDivider() == null) ? 0 : getDividerHeight();
                if (i4 > 0) {
                    measuredHeight += dividerHeight;
                }
                measuredHeight += view.getMeasuredHeight();
                if (measuredHeight >= i2) {
                    return i2;
                }
            }
        }
        return measuredHeight;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.d || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.d || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.d || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if (isHovered() && isFocused()) {
            return false;
        }
        return (this.d && this.f29711c) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    protected void layoutChildren() {
        super.layoutChildren();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        return true;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setListSelectionHidden(boolean z) {
        this.f29711c = z;
    }

    public void setTint(int i) {
        if (i != 0) {
            this.i = i;
        }
    }

    public HwDropDownListView(Context context, boolean z, int i) {
        super(context, null, i);
        this.f29711c = false;
        this.f29709a = 0;
        this.d = z;
        setDefaultFocusHighlightEnabled(false);
        d();
        setCacheColorHint(0);
    }

    private void e(View view, int i, float f, float f2) {
        drawableHotspotChanged(f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        Object objC = xeh.c(this, "mDataChanged", (Class<?>) AdapterView.class);
        if (objC instanceof Boolean) {
            this.e = ((Boolean) objC).booleanValue();
        }
        if (this.e) {
            layoutChildren();
        }
        Object objC2 = xeh.c(this, "mMotionPosition", (Class<?>) AbsListView.class);
        if (objC2 instanceof Integer) {
            this.f29709a = ((Integer) objC2).intValue();
        }
        View childAt = getChildAt(this.f29709a - getFirstVisiblePosition());
        if (childAt != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f29709a = i;
        view.drawableHotspotChanged(f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        Class cls = Integer.TYPE;
        xeh.b(this, "setSelectedPositionInt", new Class[]{cls}, new Object[]{Integer.valueOf(i)}, AdapterView.class);
        Class cls2 = Float.TYPE;
        xeh.b(this, "positionSelectorLikeTouch", new Class[]{cls, View.class, cls2, cls2}, new Object[]{Integer.valueOf(i), view, Float.valueOf(f), Float.valueOf(f2)}, AbsListView.class);
        refreshDrawableState();
    }
}
