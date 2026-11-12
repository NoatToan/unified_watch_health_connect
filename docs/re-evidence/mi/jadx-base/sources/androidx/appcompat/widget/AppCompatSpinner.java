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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import defpackage.eyq;
import defpackage.f9p;
import defpackage.h9p;
import defpackage.hbm;
import defpackage.mwi;
import defpackage.of1;
import defpackage.q1a;
import defpackage.qii;
import defpackage.ui4;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    @SuppressLint({"ResourceType"})
    public static final int[] i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f1586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1587b;
    public q1a c;
    public SpinnerAdapter d;
    public final boolean e;
    public i f;
    public int g;
    public final Rect h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1588a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1588a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1588a = parcel.readByte() != 0;
        }
    }

    public class a extends q1a {
        public final /* synthetic */ h j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.j = hVar;
        }

        @Override // defpackage.q1a
        public hbm b() {
            return this.j;
        }

        @Override // defpackage.q1a
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    @RequiresApi(16)
    public static final class c {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @RequiresApi(17)
    public static final class d {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i) {
            view.setTextAlignment(i);
        }

        public static void d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    @RequiresApi(23)
    public static final class e {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @VisibleForTesting
    public class f implements i, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @VisibleForTesting
        public androidx.appcompat.app.a f1591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f1592b;
        public CharSequence c;

        public f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void b(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void c(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void d(int i, int i2) {
            if (this.f1592b == null) {
                return;
            }
            androidx.appcompat.app.a.C0006a c0006a = new androidx.appcompat.app.a.C0006a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                c0006a.setTitle(charSequence);
            }
            androidx.appcompat.app.a aVarCreate = c0006a.j(this.f1592b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f1591a = aVarCreate;
            ListView listViewF = aVarCreate.f();
            d.d(listViewF, i);
            d.c(listViewF, i2);
            this.f1591a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f1591a;
            if (aVar != null) {
                aVar.dismiss();
                this.f1591a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int f() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void g(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence h() {
            return this.c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void i(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public boolean isShowing() {
            androidx.appcompat.app.a aVar = this.f1591a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void j(ListAdapter listAdapter) {
            this.f1592b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f1592b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void setBackgroundDrawable(Drawable drawable) {
        }
    }

    public static class g implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f1593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f1594b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1593a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1594b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof h9p) {
                    h9p h9pVar = (h9p) spinnerAdapter;
                    if (h9pVar.getDropDownViewTheme() == null) {
                        h9pVar.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1594b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1593a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1593a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1593a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1593a;
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
            SpinnerAdapter spinnerAdapter = this.f1593a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1594b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1593a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1593a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    public class h extends ListPopupWindow implements i {
        public CharSequence I;
        public ListAdapter J;
        public final Rect K;
        public int L;

        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppCompatSpinner f1595a;

            public a(AppCompatSpinner appCompatSpinner) {
                this.f1595a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.J.getItemId(i));
                }
                h.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.P(AppCompatSpinner.this)) {
                    h.this.dismiss();
                } else {
                    h.this.N();
                    h.super.a();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1598a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1598a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1598a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.K = new Rect();
            A(AppCompatSpinner.this);
            G(true);
            J(0);
            setOnItemClickListener(new a(AppCompatSpinner.this));
        }

        public void N() {
            int i;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.h);
                i = eyq.b(AppCompatSpinner.this) ? AppCompatSpinner.this.h.right : -AppCompatSpinner.this.h.left;
            } else {
                Rect rect = AppCompatSpinner.this.h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.g;
            if (i2 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.J, getBackground());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iA > i4) {
                    iA = i4;
                }
                C(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                C((width - paddingLeft) - paddingRight);
            } else {
                C(i2);
            }
            g(eyq.b(AppCompatSpinner.this) ? i + (((width - paddingRight) - w()) - O()) : i + paddingLeft + O());
        }

        public int O() {
            return this.L;
        }

        public boolean P(View view) {
            return androidx.core.view.c.T(view) && view.getGlobalVisibleRect(this.K);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void c(int i) {
            this.L = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void d(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            N();
            F(2);
            super.a();
            ListView listViewM = m();
            listViewM.setChoiceMode(1);
            d.d(listViewM, i);
            d.c(listViewM, i2);
            K(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence h() {
            return this.I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void i(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.i
        public void j(ListAdapter listAdapter) {
            super.j(listAdapter);
            this.J = listAdapter;
        }
    }

    @VisibleForTesting
    public interface i {
        void b(int i);

        void c(int i);

        void d(int i, int i2);

        void dismiss();

        int e();

        int f();

        void g(int i);

        Drawable getBackground();

        CharSequence h();

        void i(CharSequence charSequence);

        boolean isShowing();

        void j(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.h);
        Rect rect = this.h;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f.d(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f;
        return iVar != null ? iVar.f() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f;
        return iVar != null ? iVar.e() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final i getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f;
        return iVar != null ? iVar.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1587b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f;
        return iVar != null ? iVar.h() : super.getPrompt();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f;
        if (iVar == null || !iVar.isShowing()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1588a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.f;
        savedState.f1588a = iVar != null && iVar.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q1a q1aVar = this.c;
        if (q1aVar == null || !q1aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        i iVar = this.f;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.isShowing()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        i iVar = this.f;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            iVar.c(i2);
            this.f.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.b(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(of1.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1586a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.j(mode);
        }
    }

    public AppCompatSpinner(Context context, int i2) {
        this(context, null, qii.N, i2);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context = this.f1587b;
            if (context == null) {
                context = getContext();
            }
            this.f.j(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.N);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i2);
        this.h = new Rect();
        f9p.a(this, getContext());
        xfp xfpVarV = xfp.v(context, attributeSet, z5j.H2, i2, 0);
        this.f1586a = new AppCompatBackgroundHelper(this);
        if (theme != null) {
            this.f1587b = new ui4(context, theme);
        } else {
            int iN = xfpVarV.n(z5j.M2, 0);
            if (iN != 0) {
                this.f1587b = new ui4(context, iN);
            } else {
                this.f1587b = context;
            }
        }
        TypedArray typedArray = null;
        if (i3 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, i2, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i3 != 0) {
                        f fVar = new f();
                        this.f = fVar;
                        fVar.i(xfpVarV.o(z5j.K2));
                    } else if (i3 == 1) {
                        h hVar = new h(this.f1587b, attributeSet, i2);
                        xfp xfpVarV2 = xfp.v(this.f1587b, attributeSet, z5j.H2, i2, 0);
                        this.g = xfpVarV2.m(z5j.L2, -2);
                        hVar.setBackgroundDrawable(xfpVarV2.g(z5j.J2));
                        hVar.i(xfpVarV.o(z5j.K2));
                        xfpVarV2.w();
                        this.f = hVar;
                        this.c = new a(this, hVar);
                    }
                    charSequenceArrQ = xfpVarV.q(z5j.I2);
                    if (charSequenceArrQ != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                        arrayAdapter.setDropDownViewResource(mwi.u);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    xfpVarV.w();
                    this.e = true;
                    spinnerAdapter = this.d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.d = null;
                    }
                    this.f1586a.e(attributeSet, i2);
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th2) {
                th = th2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i3 != 0) {
            f fVar2 = new f();
            this.f = fVar2;
            fVar2.i(xfpVarV.o(z5j.K2));
        } else if (i3 == 1) {
            h hVar2 = new h(this.f1587b, attributeSet, i2);
            xfp xfpVarV3 = xfp.v(this.f1587b, attributeSet, z5j.H2, i2, 0);
            this.g = xfpVarV3.m(z5j.L2, -2);
            hVar2.setBackgroundDrawable(xfpVarV3.g(z5j.J2));
            hVar2.i(xfpVarV.o(z5j.K2));
            xfpVarV3.w();
            this.f = hVar2;
            this.c = new a(this, hVar2);
        }
        charSequenceArrQ = xfpVarV.q(z5j.I2);
        if (charSequenceArrQ != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
            arrayAdapter2.setDropDownViewResource(mwi.u);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        xfpVarV.w();
        this.e = true;
        spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f1586a.e(attributeSet, i2);
    }
}
