package com.huawei.uikit.hwspinner.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import com.huawei.uikit.hwspinner.R;
import defpackage.xfs;
import defpackage.xft;

/* JADX INFO: loaded from: classes20.dex */
public class HwSpinner extends Spinner implements DialogInterface.OnClickListener {
    private static final int A = -1;
    private static final float B = -1.0f;
    private static final int C = -1;
    public static final int MODE_DIALOG = 0;
    public static final int MODE_DROPDOWN = 1;
    private static final int w = -1;
    private static final String x = "HwSpinner";
    private static final int y = 1;
    private static final int z = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AdapterView.OnItemClickListener f29722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f29723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29724c;
    private HwForwardingListener d;
    private SpinnerAdapter e;
    private akxao f;
    private int g;
    private int h;
    private boolean i;
    private Context j;
    private boolean k;
    private int l;
    private int m;
    private float n;
    private HwColumnSystem o;
    private boolean p;
    private Drawable q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;

    static class a implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SpinnerAdapter f29725b;
        private ListAdapter e;

        a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f29725b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.e = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f29725b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    interface akxao {
        CharSequence a();

        void a(int i, int i2);

        void a(CharSequence charSequence);

        void dismiss();

        Drawable getBackground();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i);

        void setVerticalOffset(int i);
    }

    class b extends HwListPopupWindow implements akxao {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f29726c;
        private ListAdapter d;

        /* JADX INFO: renamed from: com.huawei.uikit.hwspinner.widget.HwSpinner$b$b, reason: collision with other inner class name */
        class C0289b implements AdapterView.OnItemClickListener {
            final /* synthetic */ HwSpinner e;

            C0289b(HwSpinner hwSpinner) {
                this.e = hwSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                HwSpinner.this.setSelection(i);
                b bVar = b.this;
                HwSpinner hwSpinner = HwSpinner.this;
                if (hwSpinner.f29722a != null) {
                    hwSpinner.performItemClick(view, i, bVar.d.getItemId(i));
                }
                b.this.dismiss();
            }
        }

        b(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            b(HwSpinner.this);
            a(true);
            j(0);
            a(new C0289b(HwSpinner.this));
        }

        void g() {
            int i;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(HwSpinner.this.f29723b);
                i = HwSpinner.this.a() ? HwSpinner.this.f29723b.right : -HwSpinner.this.f29723b.left;
            } else {
                HwSpinner.this.f29723b.left = 0;
                HwSpinner.this.f29723b.right = 0;
                i = 0;
            }
            int paddingLeft = HwSpinner.this.getPaddingLeft();
            int paddingRight = HwSpinner.this.getPaddingRight();
            int width = HwSpinner.this.getWidth();
            if (HwSpinner.this.k) {
                d(HwSpinner.this.a(a(width, paddingLeft, paddingRight)));
            } else if (HwSpinner.this.g == -2) {
                d(a(width, paddingLeft, paddingRight));
            } else if (HwSpinner.this.g == -1) {
                d((width - paddingLeft) - paddingRight);
            } else {
                d(HwSpinner.this.g);
            }
            setHorizontalOffset(HwSpinner.this.a() ? i + ((width - paddingRight) - d()) : i + paddingLeft);
        }

        @Override // com.huawei.uikit.hwspinner.widget.HwListPopupWindow, com.huawei.uikit.hwspinner.widget.HwSpinner.akxao
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.d = listAdapter;
        }

        @Override // com.huawei.uikit.hwspinner.widget.HwSpinner.akxao
        public CharSequence a() {
            return this.f29726c;
        }

        @Override // com.huawei.uikit.hwspinner.widget.HwSpinner.akxao
        public void a(CharSequence charSequence) {
            this.f29726c = charSequence;
        }

        int a(int i, int i2, int i3) {
            int iA = 0;
            if (this.d instanceof SpinnerAdapter) {
                boolean z = HwSpinner.this.p;
                HwSpinner.this.p = false;
                iA = HwSpinner.this.a((SpinnerAdapter) this.d, getBackground());
                HwSpinner.this.p = z;
            }
            int i4 = (HwSpinner.this.j.getResources().getDisplayMetrics().widthPixels - HwSpinner.this.f29723b.left) - HwSpinner.this.f29723b.right;
            if (iA > i4) {
                iA = i4;
            }
            int i5 = (i - i2) - i3;
            return iA >= i5 ? iA : i5;
        }

        @Override // com.huawei.uikit.hwspinner.widget.HwSpinner.akxao
        public void a(int i, int i2) {
            g();
            c(2);
            super.show();
            HwDropDownListView listView = getListView();
            if (HwSpinner.this.h != 0) {
                listView.setTint(HwSpinner.this.h);
            }
            listView.setChoiceMode(1);
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            if (HwSpinner.this.q != null) {
                listView.setDivider(HwSpinner.this.q);
                listView.setDividerHeight(HwSpinner.this.j.getResources().getDimensionPixelSize(R.dimen.hwspinner_divider_horizontal_height));
            }
            g(HwSpinner.this.getSelectedItemPosition());
        }
    }

    /* JADX INFO: loaded from: classes44.dex */
    class e extends HwForwardingListener {
        b d;

        e(View view, b bVar) {
            super(view);
            this.d = bVar;
        }

        @Override // com.huawei.uikit.hwspinner.widget.HwForwardingListener
        public ShowableListMenu getPopup() {
            return this.d;
        }

        @Override // com.huawei.uikit.hwspinner.widget.HwForwardingListener
        public boolean onForwardingStarted() {
            if (HwSpinner.this.f.isShowing()) {
                return true;
            }
            HwSpinner.this.f.a(HwSpinner.this.getTextDirection(), HwSpinner.this.getTextAlignment());
            return true;
        }
    }

    public HwSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public static HwSpinner instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwSpinner.class, xft.d(context, 1, 1)), HwSpinner.class);
        if (objC instanceof HwSpinner) {
            return (HwSpinner) objC;
        }
        return null;
    }

    public void configureColumn(int i, int i2, float f) {
        this.l = i;
        this.m = i2;
        this.n = f;
        if (this.k) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (getBackground() != null) {
            getBackground().setState(getDrawableState());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Spinner.class.getName();
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        return this.f.getHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        return this.f.getVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.g;
    }

    public boolean getListShadowClip() {
        return this.s;
    }

    public int getListShadowColor() {
        return this.v;
    }

    public int getListShadowSize() {
        if (this.r) {
            return this.u;
        }
        return -1;
    }

    public int getListShadowStyle() {
        if (this.r) {
            return this.t;
        }
        return -1;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        return this.f.getBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f29724c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.f.a();
    }

    public boolean isColumnEnabled() {
        return this.k;
    }

    public boolean isDynamicWidthEnabled() {
        return this.p;
    }

    public boolean isListShadowEnabled() {
        return this.r;
    }

    public boolean isPopupShowing() {
        akxao akxaoVar = this.f;
        return akxaoVar != null && akxaoVar.isShowing();
    }

    @Override // android.widget.Spinner, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        setSelection(i);
        if (dialogInterface == null) {
            Log.w(x, "onClick: dialog is null");
        } else {
            dialogInterface.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int iA = a(getAdapter(), getBackground());
        int iMin = this.p ? Math.min(measuredWidth, iA) : Math.max(measuredWidth, iA);
        if (iMin > View.MeasureSpec.getSize(i)) {
            iMin = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(iMin, getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        HwForwardingListener hwForwardingListener = this.d;
        if (hwForwardingListener == null || !hwForwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        if (getAdapter() == null || getAdapter().getCount() < 1) {
            return false;
        }
        if (!this.f.isShowing()) {
            this.f.a(getTextDirection(), getTextAlignment());
        }
        return true;
    }

    public void setColumnEnabled(boolean z2) {
        this.k = z2;
        requestLayout();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        this.f.setHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        this.f.setVerticalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f instanceof b) {
            this.g = i;
        } else {
            Log.e(x, "Cannot set dropdown width for MODE_DIALOG, ignoring");
        }
    }

    public void setDynamicWidthEnabled(boolean z2) {
        this.p = z2;
    }

    @Override // android.widget.Spinner, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.i) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setEnabled(z2);
            }
        }
    }

    public void setListShadowClip(boolean z2) {
        this.s = z2;
        akxao akxaoVar = this.f;
        if (akxaoVar instanceof b) {
            ((b) akxaoVar).c(z2);
        }
    }

    public void setListShadowColor(int i) {
        this.v = i;
        akxao akxaoVar = this.f;
        if (akxaoVar instanceof b) {
            ((b) akxaoVar).a(i);
        }
    }

    public void setListShadowEnabled(boolean z2) {
        this.r = z2;
        akxao akxaoVar = this.f;
        if (akxaoVar instanceof b) {
            ((b) akxaoVar).d(z2);
        }
    }

    public void setListShadowSize(int i) {
        this.u = i;
        akxao akxaoVar = this.f;
        if (akxaoVar instanceof b) {
            ((b) akxaoVar).e(i);
        }
    }

    public void setListShadowStyle(int i) {
        this.t = i;
        akxao akxaoVar = this.f;
        if (akxaoVar instanceof b) {
            ((b) akxaoVar).b(i);
        }
    }

    public void setOnItemClickListenerInt(AdapterView.OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener(onItemClickListener);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        akxao akxaoVar = this.f;
        if (akxaoVar instanceof b) {
            akxaoVar.setBackgroundDrawable(drawable);
        } else {
            Log.e(x, "setPopupBackgroundDrawable: incompatible spinner mode, ignoring.");
        }
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        this.f.a(charSequence);
    }

    @Override // android.widget.Spinner
    public void setPromptId(int i) {
        setPrompt(getContext().getText(i));
    }

    public void setTint(int i) {
        this.h = i;
    }

    public HwSpinner(Context context, int i) {
        this(context, null, R.attr.hwSpinnerStyle, i);
    }

    @Override // android.widget.Spinner, android.view.ViewGroup, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getPointerIcon() == null && isClickable() && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f == null) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.j.getApplicationInfo().targetSdkVersion >= 21 && spinnerAdapter != null && spinnerAdapter.getViewTypeCount() != 1) {
            Log.w(x, "setAdapter: Spinner adapter view type count must be 1");
            return;
        }
        Context context = this.f29724c;
        if (context == null) {
            context = this.j;
        }
        this.f.setAdapter(new a(spinnerAdapter, context.getTheme()));
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(getPopupContext().getDrawable(i));
    }

    public HwSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSpinnerStyle);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwSpinner);
    }

    public HwSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        this.j = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSpinner, i, R.style.Widget_Emui_HwSpinner);
        a(typedArrayObtainStyledAttributes);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwSpinner_hwBackground);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(this.j, R.drawable.hwspinner_selector_background_emui);
        }
        setBackground(drawable);
        if (i2 == -1 || i2 == 0 || i2 == 1) {
            b bVar = new b(this.f29724c, attributeSet, i, R.style.Widget_Emui_HwSpinner);
            TypedArray typedArrayObtainStyledAttributes2 = this.f29724c.obtainStyledAttributes(attributeSet, R.styleable.HwSpinner, i, R.style.Widget_Emui_HwSpinner);
            this.g = typedArrayObtainStyledAttributes2.getLayoutDimension(R.styleable.HwSpinner_hwDropDownWidth, -2);
            a(context, bVar, typedArrayObtainStyledAttributes2);
            bVar.setBackgroundDrawable(typedArrayObtainStyledAttributes2.getDrawable(R.styleable.HwSpinner_hwPopupBackground));
            bVar.a(typedArrayObtainStyledAttributes.getString(R.styleable.HwSpinner_hwPrompt));
            typedArrayObtainStyledAttributes2.recycle();
            this.f = bVar;
            this.d = new e(this, bVar);
            setListShadowEnabled(this.r);
            setListShadowStyle(this.t);
            setListShadowSize(this.u);
            setListShadowColor(this.v);
            setListShadowClip(this.s);
        }
        this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwSpinner_hwDisableChildrenWhenDisabled, false);
        typedArrayObtainStyledAttributes.recycle();
        SpinnerAdapter spinnerAdapter = this.e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.e = null;
        }
    }

    public HwSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(a(context, i), attributeSet, i);
        this.f29723b = new Rect();
        this.i = false;
        this.k = false;
        this.l = -1;
        this.m = -1;
        this.n = -1.0f;
        a(super.getContext(), attributeSet, i, i2);
        this.o = new HwColumnSystem(this.f29724c);
    }

    private void a(TypedArray typedArray) {
        this.k = typedArray.getBoolean(R.styleable.HwSpinner_hwColumnEnabled, false);
        this.p = typedArray.getBoolean(R.styleable.HwSpinner_hwDynamicWidthEnabled, false);
        this.q = typedArray.getDrawable(R.styleable.HwSpinner_hwDropDownDivider);
        this.r = typedArray.getBoolean(R.styleable.HwSpinner_hwListShadowEnabled, false);
        this.u = typedArray.getInt(R.styleable.HwSpinner_hwListShadowSize, 2);
        this.t = typedArray.getInt(R.styleable.HwSpinner_hwWidgetStyle, 0);
        this.v = typedArray.getColor(R.styleable.HwSpinner_hwListShadowColor, -16777216);
        int resourceId = typedArray.getResourceId(R.styleable.HwSpinner_hwPopupTheme, R.style.Theme_Emui_HwSpinner);
        if (resourceId != 0) {
            this.f29724c = new ContextThemeWrapper(this.j, resourceId);
        } else {
            this.f29724c = this.j;
        }
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int selectedItemPosition = getSelectedItemPosition() <= 0 ? 0 : getSelectedItemPosition();
        int count = selectedItemPosition + 20;
        if (spinnerAdapter.getCount() <= count) {
            count = spinnerAdapter.getCount();
        }
        int i = selectedItemPosition - (20 - (count - selectedItemPosition));
        if (i <= 0) {
            i = 0;
        }
        int measuredWidth = 0;
        int i2 = 0;
        View view = null;
        while (i < count) {
            int itemViewType = spinnerAdapter.getItemViewType(i);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(i, view, this);
            if (view != null) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                if (this.p && i == getSelectedItemPosition()) {
                    measuredWidth = view.getMeasuredWidth();
                    break;
                }
                if (measuredWidth <= view.getMeasuredWidth()) {
                    measuredWidth = view.getMeasuredWidth();
                }
                i++;
            } else {
                return 0;
            }
        }
        if (drawable == null) {
            return measuredWidth;
        }
        drawable.getPadding(this.f29723b);
        Rect rect = this.f29723b;
        return measuredWidth + rect.left + rect.right;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    int a(int i) {
        int i2;
        this.o.d(10);
        int i3 = this.l;
        if (i3 <= 0 || (i2 = this.m) <= 0) {
            this.o.b(this.f29724c);
        } else {
            float f = this.n;
            if (f > 0.0f) {
                this.o.d(this.f29724c, i3, i2, f);
            } else {
                this.o.b(this.f29724c);
            }
        }
        int iE = this.o.e();
        int i4 = this.o.i();
        if (i > iE) {
            return iE;
        }
        return i < i4 ? i4 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return getLayoutDirection() == 1;
    }

    private void a(Context context, b bVar, TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(R.styleable.HwSpinner_hwDropDownSelector);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(context, R.drawable.hwspinner_list_selector_emui);
        }
        bVar.e(drawable);
    }
}
