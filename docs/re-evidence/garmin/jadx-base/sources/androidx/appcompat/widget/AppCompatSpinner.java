package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    public static final int[] f4922i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.e f4923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f4926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f4928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f4930h;

    public class a extends f0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f4931j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2, f fVar) {
            super(view2);
            this.f4931j = fVar;
        }

        @Override // androidx.appcompat.widget.f0
        public final androidx.appcompat.view.menu.q b() {
            return this.f4931j;
        }

        @Override // androidx.appcompat.widget.f0
        public final boolean c() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (appCompatSpinner.getInternalPopup().a()) {
                return true;
            }
            appCompatSpinner.f4928f.c(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().a()) {
                appCompatSpinner.f4928f.c(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class c {
        private c() {
        }

        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.e f4934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f4935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f4936c;

        public d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final boolean a() {
            androidx.appcompat.app.e eVar = this.f4934a;
            if (eVar != null) {
                return eVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final Drawable b() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void c(int i14, int i15) {
            if (this.f4935b == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f4936c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.e eVarCreate = aVar.setSingleChoiceItems(this.f4935b, appCompatSpinner.getSelectedItemPosition(), this).create();
            this.f4934a = eVarCreate;
            AlertController.RecycleListView recycleListView = eVarCreate.f4658a.f4596g;
            recycleListView.setTextDirection(i14);
            recycleListView.setTextAlignment(i15);
            this.f4934a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void dismiss() {
            androidx.appcompat.app.e eVar = this.f4934a;
            if (eVar != null) {
                eVar.dismiss();
                this.f4934a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void g(int i14) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void h(int i14) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final int i() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final int j() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void k(int i14) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final CharSequence l() {
            return this.f4936c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void m(CharSequence charSequence) {
            this.f4936c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void n(ListAdapter listAdapter) {
            this.f4935b = (e) listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i14);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i14, this.f4935b.getItemId(i14));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void setBackgroundDrawable(Drawable drawable) {
        }
    }

    public static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpinnerAdapter f4938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListAdapter f4939b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f4938a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f4939b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof s0) {
                    s0 s0Var = (s0) spinnerAdapter;
                    if (s0Var.getDropDownViewTheme() == null) {
                        s0Var.b();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f4939b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i14, View view2, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i14, view2, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i14) {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i14);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i14) {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i14);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i14) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i14, View view2, ViewGroup viewGroup) {
            return getDropDownView(i14, view2, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i14) {
            ListAdapter listAdapter = this.f4939b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i14);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4938a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class f extends i0 implements h {
        public CharSequence E;
        public ListAdapter F;
        public final Rect I;
        public int P;

        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
                f fVar = f.this;
                AppCompatSpinner.this.setSelection(i14);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view2, i14, fVar.F.getItemId(i14));
                }
                fVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f fVar = f.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                fVar.getClass();
                if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(fVar.I)) {
                    fVar.dismiss();
                } else {
                    fVar.q();
                    fVar.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f4942a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f4942a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f4942a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i14) {
            super(context, attributeSet, i14);
            this.I = new Rect();
            this.f5146o = AppCompatSpinner.this;
            this.A = true;
            this.B.setFocusable(true);
            this.f5147p = new a(AppCompatSpinner.this);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void c(int i14, int i15) {
            ViewTreeObserver viewTreeObserver;
            p pVar = this.B;
            boolean zIsShowing = pVar.isShowing();
            q();
            pVar.setInputMethodMode(2);
            show();
            d0 d0Var = this.f5134c;
            d0Var.setChoiceMode(1);
            d0Var.setTextDirection(i14);
            d0Var.setTextAlignment(i15);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            d0 d0Var2 = this.f5134c;
            if (pVar.isShowing() && d0Var2 != null) {
                d0Var2.setListSelectionHidden(false);
                d0Var2.setSelection(selectedItemPosition);
                if (d0Var2.getChoiceMode() != 0) {
                    d0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            pVar.setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void h(int i14) {
            this.P = i14;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final CharSequence l() {
            return this.E;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void m(CharSequence charSequence) {
            this.E = charSequence;
        }

        @Override // androidx.appcompat.widget.i0, androidx.appcompat.widget.AppCompatSpinner.h
        public final void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.F = listAdapter;
        }

        public final void q() {
            int i14;
            p pVar = this.B;
            Drawable background = pVar.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f4930h);
                int layoutDirection = appCompatSpinner.getLayoutDirection();
                Rect rect = appCompatSpinner.f4930h;
                i14 = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = appCompatSpinner.f4930h;
                rect2.right = 0;
                rect2.left = 0;
                i14 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i15 = appCompatSpinner.f4929g;
            if (i15 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.F, pVar.getBackground());
                int i16 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = appCompatSpinner.f4930h;
                int i17 = (i16 - rect3.left) - rect3.right;
                if (iA > i17) {
                    iA = i17;
                }
                p(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i15 == -1) {
                p((width - paddingLeft) - paddingRight);
            } else {
                p(i15);
            }
            this.f5137f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f5136e) - this.P) + i14 : paddingLeft + this.P + i14;
        }
    }

    public interface h {
        boolean a();

        Drawable b();

        void c(int i14, int i15);

        void dismiss();

        void g(int i14);

        void h(int i14);

        int i();

        int j();

        void k(int i14);

        CharSequence l();

        void m(CharSequence charSequence);

        void n(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i14, int i15, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i14);
        this.f4930h = new Rect();
        r0.a(getContext(), this);
        int[] iArr = h.a.f80443w;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        this.f4923a = new androidx.appcompat.widget.e(this);
        if (theme != null) {
            this.f4924b = new m.d(context, theme);
        } else {
            int resourceId = typedArray.getResourceId(4, 0);
            if (resourceId != 0) {
                this.f4924b = new m.d(context, resourceId);
            } else {
                this.f4924b = context;
            }
        }
        TypedArray typedArray2 = null;
        if (i15 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4922i, i14, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i15 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i15 != 0) {
                        d dVar = new d();
                        this.f4928f = dVar;
                        dVar.f4936c = typedArray.getString(2);
                    } else if (i15 == 1) {
                        f fVar = new f(this.f4924b, attributeSet, i14);
                        w0 w0VarG2 = w0.g(this.f4924b, attributeSet, iArr, i14, 0);
                        this.f4929g = w0VarG2.f5271b.getLayoutDimension(3, -2);
                        fVar.setBackgroundDrawable(w0VarG2.b(1));
                        fVar.E = typedArray.getString(2);
                        w0VarG2.h();
                        this.f4928f = fVar;
                        this.f4925c = new a(this, fVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.garmin.android.apps.connectmobile.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    w0VarG.h();
                    this.f4927e = true;
                    spinnerAdapter = this.f4926d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f4926d = null;
                    }
                    this.f4923a.d(attributeSet, i14);
                } catch (Throwable th3) {
                    th = th3;
                    typedArray2 = typedArrayObtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th4) {
                th = th4;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i15 != 0) {
            d dVar2 = new d();
            this.f4928f = dVar2;
            dVar2.f4936c = typedArray.getString(2);
        } else if (i15 == 1) {
            f fVar2 = new f(this.f4924b, attributeSet, i14);
            w0 w0VarG3 = w0.g(this.f4924b, attributeSet, iArr, i14, 0);
            this.f4929g = w0VarG3.f5271b.getLayoutDimension(3, -2);
            fVar2.setBackgroundDrawable(w0VarG3.b(1));
            fVar2.E = typedArray.getString(2);
            w0VarG3.h();
            this.f4928f = fVar2;
            this.f4925c = new a(this, fVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.garmin.android.apps.connectmobile.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        w0VarG.h();
        this.f4927e = true;
        spinnerAdapter = this.f4926d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f4926d = null;
        }
        this.f4923a.d(attributeSet, i14);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i14 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view2 = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i14) {
                view2 = null;
                i14 = itemViewType;
            }
            view2 = spinnerAdapter.getView(iMax3, view2, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view2.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f4930h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f4928f;
        return hVar != null ? hVar.j() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f4928f;
        return hVar != null ? hVar.i() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4928f != null ? this.f4929g : super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.f4928f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f4928f;
        return hVar != null ? hVar.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4924b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f4928f;
        return hVar != null ? hVar.l() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f4928f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        hVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        if (this.f4928f == null || View.MeasureSpec.getMode(i14) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i14)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f4944a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f4928f;
        gVar.f4944a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f4925c;
        if (aVar == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        h hVar = this.f4928f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        hVar.c(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4927e) {
            this.f4926d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        h hVar = this.f4928f;
        if (hVar != null) {
            Context context = this.f4924b;
            if (context == null) {
                context = getContext();
            }
            hVar.n(new e(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i14) {
        super.setBackgroundResource(i14);
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            eVar.f(i14);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i14) {
        h hVar = this.f4928f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i14);
        } else {
            hVar.h(i14);
            hVar.k(i14);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i14) {
        h hVar = this.f4928f;
        if (hVar != null) {
            hVar.g(i14);
        } else {
            super.setDropDownVerticalOffset(i14);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i14) {
        if (this.f4928f != null) {
            this.f4929g = i14;
        } else {
            super.setDropDownWidth(i14);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f4928f;
        if (hVar != null) {
            hVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i14) {
        setPopupBackgroundDrawable(j.a.a(getPopupContext(), i14));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f4928f;
        if (hVar != null) {
            hVar.m(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f4923a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4944a;

        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f4944a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeByte(this.f4944a ? (byte) 1 : (byte) 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context, int i14) {
        this(context, null, com.garmin.android.apps.connectmobile.R.attr.spinnerStyle, i14);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i14, int i15) {
        this(context, attributeSet, i14, i15, null);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }
}
