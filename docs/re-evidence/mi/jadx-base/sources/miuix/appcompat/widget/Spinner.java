package miuix.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import defpackage.alb;
import defpackage.awi;
import defpackage.bb1;
import defpackage.dmi;
import defpackage.e6n;
import defpackage.g5j;
import defpackage.g6n;
import defpackage.h9p;
import defpackage.k4i;
import defpackage.n4i;
import defpackage.of1;
import defpackage.ui4;
import defpackage.vk9;
import defpackage.vsi;
import defpackage.wzo;
import defpackage.xoc;
import defpackage.y94;
import defpackage.zhi;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class Spinner extends android.widget.Spinner {
    public static Field m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SpinnerAdapter f26595b;
    public final boolean c;
    public j d;
    public float e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f26596k;
    public h l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26597a;

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
            parcel.writeByte(this.f26597a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26597a = parcel.readByte() != 0;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdapterView.OnItemSelectedListener f26598a;

        public a(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f26598a = onItemSelectedListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Spinner.this.f >= 0 && Spinner.this.getAdapter() != null && Spinner.this.f < Spinner.this.getAdapter().getCount()) {
                Spinner spinner = Spinner.this;
                spinner.setSelection(spinner.f);
            }
            if (Spinner.this.getOnItemSelectedListener() == null) {
                Spinner.this.setOnItemSelectedListener(this.f26598a);
            }
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!Spinner.this.d.isShowing()) {
                Spinner.this.m();
            }
            ViewTreeObserver viewTreeObserver = Spinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class c implements j, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public miuix.appcompat.app.c f26601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f26602b;
        public CharSequence c;

        public class a implements DialogInterface.OnDismissListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                Spinner.this.k();
            }
        }

        public c() {
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void b(int i) {
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void c(int i) {
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void d(int i, int i2) {
            if (this.f26602b == null) {
                return;
            }
            miuix.appcompat.app.c.a aVar = new miuix.appcompat.app.c.a(Spinner.this.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                aVar.z(charSequence);
            }
            miuix.appcompat.app.c cVarB = aVar.w(this.f26602b, Spinner.this.getSelectedItemPosition(), this).s(new a()).b();
            this.f26601a = cVarB;
            ListView listViewN = cVarB.n();
            listViewN.setTextDirection(i);
            listViewN.setTextAlignment(i2);
            this.f26601a.show();
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void dismiss() {
            miuix.appcompat.app.c cVar = this.f26601a;
            if (cVar != null) {
                cVar.dismiss();
                this.f26601a = null;
            }
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public int e() {
            return 0;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public int f() {
            return 0;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void g(int i) {
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public Drawable getBackground() {
            return null;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public CharSequence h() {
            return this.c;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void i(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public boolean isShowing() {
            miuix.appcompat.app.c cVar = this.f26601a;
            return cVar != null && cVar.isShowing();
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void j(ListAdapter listAdapter) {
            this.f26602b = listAdapter;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        @Deprecated
        public void l(int i, int i2, float f, float f2) {
            d(i, i2);
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void n(int i) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Spinner.this.setSelection(i);
            HapticCompat.performHapticFeedback(Spinner.this, alb.o);
            if (Spinner.this.getOnItemClickListener() != null) {
                Spinner.this.performItemClick(null, i, this.f26602b.getItemId(i));
            }
            dismiss();
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void setBackgroundDrawable(Drawable drawable) {
        }

        public /* synthetic */ c(Spinner spinner, a aVar) {
            this();
        }
    }

    public static class d extends e {
        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            super(spinnerAdapter, theme);
        }
    }

    public static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f26604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListAdapter f26605b;

        public class a extends View.AccessibilityDelegate {
            public a() {
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.text1);
                accessibilityNodeInfo.setClassName(Checkable.class.getName());
                accessibilityNodeInfo.setCheckable(true);
                if (checkedTextView != null) {
                    accessibilityNodeInfo.setChecked(checkedTextView.isChecked());
                    if (!checkedTextView.isChecked()) {
                        accessibilityNodeInfo.setClickable(true);
                    } else {
                        accessibilityNodeInfo.setClickable(false);
                        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                    }
                }
            }
        }

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f26604a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f26605b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof h9p) {
                    h9p h9pVar = (h9p) spinnerAdapter;
                    if (h9pVar.getDropDownViewTheme() == null) {
                        h9pVar.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        public void a(View view) {
            view.setAccessibilityDelegate(new a());
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f26605b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f26604a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f26604a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f26604a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f26604a;
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
            View dropDownView = getDropDownView(i, view, viewGroup);
            if (view == null) {
                bb1.b(dropDownView);
            }
            SpinnerAdapter spinnerAdapter = this.f26604a;
            if (spinnerAdapter instanceof e6n) {
                ((e6n) spinnerAdapter).b(dropDownView, i);
            } else if (spinnerAdapter instanceof ArrayAdapter) {
                a(dropDownView);
            }
            return dropDownView;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f26604a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f26605b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f26604a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f26604a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public static class f extends e {
        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            super(spinnerAdapter, theme);
        }

        @Override // miuix.appcompat.widget.Spinner.e, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            wzo.c(view2, i, getCount());
            return view2;
        }
    }

    public class g extends k4i implements j {
        public CharSequence H;
        public ListAdapter I;
        public final Rect J;
        public int K;
        public View L;

        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Spinner f26607a;

            public a(Spinner spinner) {
                this.f26607a = spinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Spinner.this.setSelection(i);
                Spinner.this.p();
                if (Spinner.this.getOnItemClickListener() != null) {
                    g gVar = g.this;
                    Spinner.this.performItemClick(view, i, gVar.I.getItemId(i));
                }
                g.this.dismiss();
            }
        }

        public class b implements PopupWindow.OnDismissListener {
            public b() {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                Spinner.this.k();
            }
        }

        public g(Context context) {
            super(context, null);
            this.J = new Rect();
            Resources resources = context.getResources();
            this.d.d = ((resources.getDimensionPixelSize(dmi.Z) * 2) + resources.getDimensionPixelSize(dmi.W)) * 2;
            n(8388691);
            setOnItemClickListener(new a(Spinner.this));
            this.D = true;
        }

        @Override // defpackage.k4i
        public int[][] J(ListAdapter listAdapter, ViewGroup viewGroup, Context context) {
            if (listAdapter == null) {
                this.f23424b.measure(View.MeasureSpec.makeMeasureSpec(this.d.f27537a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 1, 2);
                iArr[0][0] = this.f23424b.getMeasuredWidth();
                iArr[0][1] = this.f23424b.getMeasuredHeight();
                return iArr;
            }
            ListView listViewK = K();
            int count = listAdapter.getCount();
            int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, count, 2);
            for (int i = 0; i < count; i++) {
                View view = listAdapter.getView(i, null, listViewK);
                view.measure(View.MeasureSpec.makeMeasureSpec(this.d.f27537a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                iArr2[i][0] = view.getMeasuredWidth();
                iArr2[i][1] = view.getMeasuredHeight();
            }
            return iArr2;
        }

        @Override // defpackage.k4i
        public boolean R(View view) {
            if (!super.R(view)) {
                return false;
            }
            setInputMethodMode(2);
            return true;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void c(int i) {
            this.K = i;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void d(int i, int i2) {
            boolean zIsShowing = isShowing();
            m0();
            setInputMethodMode(2);
            if (R(Spinner.this)) {
                n0(Spinner.this);
                k0(i, i2);
            }
            if (zIsShowing) {
                return;
            }
            setOnDismissListener(new b());
        }

        @Override // defpackage.k4i
        public void g0(View view) {
            if (isShowing()) {
                B();
                int iA = this.e.a(this.d);
                int iD = this.e.d(this.d);
                n4i n4iVar = this.d;
                update(iA, iD, n4iVar.g, n4iVar.h);
            }
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public CharSequence h() {
            return this.H;
        }

        @Override // miuix.appcompat.widget.Spinner.j
        public void i(CharSequence charSequence) {
            this.H = charSequence;
        }

        @Override // defpackage.k4i
        public void j(ListAdapter listAdapter) {
            super.j(listAdapter);
            this.I = listAdapter;
        }

        public final void k0(int i, int i2) {
            ListView listViewK = K();
            listViewK.setChoiceMode(1);
            listViewK.setTextDirection(i);
            listViewK.setTextAlignment(i2);
            int selectedItemPosition = Spinner.this.getSelectedItemPosition();
            listViewK.setSelection(selectedItemPosition);
            listViewK.setItemChecked(selectedItemPosition, true);
        }

        @Override // miuix.appcompat.widget.Spinner.j
        @Deprecated
        public void l(int i, int i2, float f, float f2) {
            d(i, i2);
        }

        public void l0(View view) {
            this.L = view;
            super.W(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void m0() {
            if (this.L != null) {
                return;
            }
            Spinner spinner = Spinner.this;
            if ((spinner.getContext() instanceof xoc) && ((xoc) spinner.getContext()).isInFloatingWindowMode()) {
                l0(spinner.getRootView().findViewById(vsi.j));
                return;
            }
            for (ViewParent parent = spinner.getParent(); parent != 0; parent = parent.getParent()) {
                if ((parent instanceof vk9) && ((vk9) parent).a() && (parent instanceof View)) {
                    l0((View) parent);
                    return;
                }
            }
        }

        @Override // defpackage.k4i, miuix.appcompat.widget.Spinner.j
        public void n(int i) {
            super.n(i);
        }

        public final void n0(View view) {
            this.d.toString();
            if (F() != view) {
                T(view);
            }
            if (this.d.q.centerX() <= this.d.p.centerX()) {
                n(83);
            } else {
                n(85);
            }
            int iA = this.e.a(this.d);
            int iD = this.e.d(this.d);
            setWidth(this.d.g);
            setHeight(this.d.h);
            if (isShowing()) {
                update(iA, iD, getWidth(), getHeight());
            } else {
                showAtLocation(view, 0, iA, iD);
            }
        }
    }

    public interface h {
        void a();
    }

    public static class i implements e6n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Spinner f26610a;

        public i(Spinner spinner) {
            this.f26610a = spinner;
        }

        @Override // e6n.c
        public boolean a(int i) {
            return this.f26610a.getSelectedItemPosition() == i;
        }
    }

    public interface j {
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

        @Deprecated
        void l(int i, int i2, float f, float f2);

        void n(int i);

        void setBackgroundDrawable(Drawable drawable);
    }

    static {
        try {
            Field declaredField = android.widget.Spinner.class.getDeclaredField("mForwardingListener");
            m = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public Spinner(Context context) {
        this(context, null);
    }

    private void setChildEnabled(boolean z) {
        View viewFindViewById = findViewById(R.id.text1);
        View viewFindViewById2 = findViewById(R.id.icon1);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(z);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setEnabled(z);
        }
    }

    public final int f(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null || spinnerAdapter.getCount() == 0) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        View view = spinnerAdapter.getView(Math.max(0, Math.min(spinnerAdapter.getCount() - 1, getSelectedItemPosition())), null, this);
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMax = Math.max(0, view.getMeasuredWidth());
        if (drawable == null) {
            return iMax;
        }
        drawable.getPadding(this.f26596k);
        Rect rect = this.f26596k;
        return iMax + rect.left + rect.right;
    }

    public void g(boolean z) {
        if (z && isClickable()) {
            setActivated(true);
        } else {
            setActivated(false);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.d;
        return jVar != null ? jVar.f() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.d;
        return jVar != null ? jVar.e() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.d != null ? this.h : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.d;
        return jVar != null ? jVar.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f26594a;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.d;
        return jVar != null ? jVar.h() : super.getPrompt();
    }

    public int getWindowManagerFlag() {
        j jVar = this.d;
        if (jVar instanceof g) {
            return ((g) jVar).L();
        }
        return -1;
    }

    public final /* synthetic */ void h() {
        setChildEnabled(isEnabled());
    }

    public final void i() {
        Field field = m;
        if (field == null) {
            return;
        }
        try {
            field.set(this, null);
        } catch (IllegalAccessException unused) {
        }
        setLongClickable(false);
    }

    public final void j() {
        h hVar = this.l;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final void k() {
        g(false);
        j();
    }

    @Deprecated
    public boolean l(float f2, float f3) {
        if (isClickable() && o()) {
            return true;
        }
        j jVar = this.d;
        if (jVar == null) {
            return super.performClick();
        }
        if (!jVar.isShowing()) {
            if (!isActivated()) {
                g(true);
            }
            n(f2, f3);
            HapticCompat.e(this, alb.A, alb.o);
        }
        return true;
    }

    public void m() {
        this.d.d(getTextDirection(), getTextAlignment());
    }

    public void n(float f2, float f3) {
        this.d.l(getTextDirection(), getTextAlignment(), f2, f3);
    }

    public final boolean o() {
        sendAccessibilityEvent(1);
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        if (this.e != f2) {
            this.e = f2;
            AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
            setOnItemSelectedListener(null);
            setAdapter(getAdapter());
            post(new a(onItemSelectedListener));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.d;
        if (jVar == null || !jVar.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.d == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.min(getMeasuredWidth(), f(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f26597a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        j jVar = this.d;
        savedState.f26597a = jVar != null && jVar.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            g(true);
        }
        if (isActivated() && !this.d.isShowing() && ((motionEvent.getAction() == 1 && !isPressed()) || motionEvent.getAction() == 3)) {
            g(false);
        }
        return zOnTouchEvent;
    }

    public final void p() {
        HapticCompat.e(this, alb.A, alb.f1169k);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        return l(0.0f, 0.0f);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        if (isClickable()) {
            super.setActivated(z);
        }
    }

    public void setDimAmount(float f2) {
        j jVar = this.d;
        if (jVar instanceof g) {
            ((g) jVar).X(f2);
        }
    }

    public void setDoubleLineContentAdapter(g6n g6nVar) {
        setAdapter((SpinnerAdapter) new e6n(getContext(), awi.R, g6nVar, new i(this)));
    }

    public void setDropDownGravity(int i2) {
        j jVar = this.d;
        if (jVar != null) {
            jVar.n(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        j jVar = this.d;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            jVar.c(i2);
            this.d.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        j jVar = this.d;
        if (jVar != null) {
            jVar.b(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.d != null) {
            this.h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.g) {
            setChildEnabled(z);
        }
    }

    public void setFenceView(View view) {
        j jVar = this.d;
        if (jVar instanceof g) {
            ((g) jVar).l0(view);
        }
    }

    public void setOnSpinnerDismissListener(h hVar) {
        this.l = hVar;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.d;
        if (jVar != null) {
            jVar.setBackgroundDrawable(drawable);
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
        j jVar = this.d;
        if (jVar != null) {
            jVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int i2) {
        this.f = i2;
        super.setSelection(i2);
        g(false);
    }

    public void setWindowManagerFlags(int i2) {
        j jVar = this.d;
        if (jVar instanceof g) {
            ((g) jVar).b0(i2);
        }
    }

    public Spinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zhi.L);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.c) {
            this.f26595b = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        j jVar = this.d;
        if (jVar instanceof c) {
            jVar.j(new d(spinnerAdapter, getPopupContext().getTheme()));
        } else if (jVar instanceof g) {
            jVar.j(new f(spinnerAdapter, getPopupContext().getTheme()));
        }
        post(new Runnable() { // from class: d6n
            @Override // java.lang.Runnable
            public final void run() {
                this.f15147a.h();
            }
        });
    }

    public Spinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    public Spinner(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
        super(context, attributeSet, i2);
        this.f26596k = new Rect();
        this.e = context.getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.w2, i2, 0);
        if (theme != null) {
            this.f26594a = new ui4(context, theme);
        } else {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(g5j.E2, 0);
            if (resourceId != 0) {
                this.f26594a = new ui4(context, resourceId);
            } else {
                this.f26594a = context;
            }
        }
        i3 = i3 == -1 ? typedArrayObtainStyledAttributes.getInt(g5j.F2, 0) : i3;
        a aVar = null;
        if (i3 == 0) {
            c cVar = new c(this, aVar);
            this.d = cVar;
            cVar.i(typedArrayObtainStyledAttributes.getString(g5j.z2));
        } else if (i3 == 1) {
            g gVar = new g(this.f26594a);
            TypedArray typedArrayObtainStyledAttributes2 = this.f26594a.obtainStyledAttributes(attributeSet, g5j.w2, i2, 0);
            this.h = typedArrayObtainStyledAttributes2.getLayoutDimension(g5j.A2, -2);
            this.i = typedArrayObtainStyledAttributes2.getLayoutDimension(g5j.D2, -2);
            this.j = typedArrayObtainStyledAttributes2.getLayoutDimension(g5j.C2, -2);
            int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(g5j.y2, 0);
            if (resourceId2 != 0) {
                setPopupBackgroundResource(resourceId2);
            } else {
                gVar.setBackgroundDrawable(typedArrayObtainStyledAttributes2.getDrawable(g5j.y2));
            }
            gVar.i(typedArrayObtainStyledAttributes.getString(g5j.z2));
            typedArrayObtainStyledAttributes2.recycle();
            this.d = gVar;
        }
        i();
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(g5j.x2);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, awi.R, R.id.text1, textArray);
            arrayAdapter.setDropDownViewResource(awi.Q);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        this.g = typedArrayObtainStyledAttributes.getBoolean(g5j.B2, false);
        typedArrayObtainStyledAttributes.recycle();
        this.c = true;
        SpinnerAdapter spinnerAdapter = this.f26595b;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f26595b = null;
        }
        y94.b(this, false);
    }
}
