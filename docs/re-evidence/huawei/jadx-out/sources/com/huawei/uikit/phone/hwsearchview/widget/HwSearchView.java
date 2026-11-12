package com.huawei.uikit.phone.hwsearchview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import com.huawei.uikit.hwsearchview.R;
import defpackage.xeh;

/* JADX INFO: loaded from: classes20.dex */
public class HwSearchView extends com.huawei.uikit.hwsearchview.widget.HwSearchView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f29844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View.OnClickListener f29846c;
    private HwPhoneSearchAutoComplete d;
    private int e;
    private AppCompatImageView f;
    private Drawable g;
    private Drawable h;
    private View i;
    private View j;

    /* JADX INFO: loaded from: classes45.dex */
    public static class HwPhoneSearchAutoComplete extends com.huawei.uikit.hwsearchview.widget.HwSearchView.HwSearchAutoComplete {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f29847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29849c;
        private boolean d;
        private boolean e;
        private View g;
        private View h;

        public HwPhoneSearchAutoComplete(Context context) {
            super(context);
            this.f29848b = false;
            this.f29849c = 0;
        }

        private boolean a(int i) {
            return i == 57 || i == 58;
        }

        private boolean b(int i) {
            return i == 59 || i == 60;
        }

        private boolean c(int i) {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                    return true;
                default:
                    return false;
            }
        }

        private boolean d(int i) {
            return i == 23 || i == 62 || i == 66 || i == 160;
        }

        private void e(int i) {
            View view = this.h;
            if (view == null || i == view.getPaddingEnd()) {
                return;
            }
            View view2 = this.g;
            if (view2 != null && view2.getVisibility() == 0) {
                i = 0;
            }
            View view3 = this.h;
            view3.setPaddingRelative(view3.getPaddingStart(), this.h.getPaddingTop(), i, this.h.getPaddingBottom());
        }

        private void e(CharSequence charSequence) {
            View view = this.g;
            if (view == null) {
                return;
            }
            view.setVisibility(TextUtils.isEmpty(charSequence) ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchPlate(View view) {
            this.h = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceButton(View view) {
            this.g = view;
            e(0);
        }

        @Override // android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (keyEvent == null) {
                return false;
            }
            if (this.f29849c == 1 && c(keyEvent.getKeyCode())) {
                return false;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.e = hasFocus();
            boolean zHasWindowFocus = hasWindowFocus();
            this.d = zHasWindowFocus;
            this.f29848b = this.e && zHasWindowFocus;
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            if (canvas == null) {
                return;
            }
            super.onDraw(canvas);
            if (this.f29849c == 1 && this.f29848b) {
                a(canvas);
            }
        }

        @Override // com.huawei.uikit.hwsearchview.widget.HwSearchView.HwSearchAutoComplete, androidx.appcompat.widget.SearchView.SearchAutoComplete, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (c(z, this.d)) {
                this.f29848b = z;
            }
            this.e = z;
            if (z && this.f29849c == 0) {
                if (isInTouchMode()) {
                    this.f29849c = 3;
                    setCursorVisible(true);
                } else {
                    this.f29849c = 1;
                    setCursorVisible(false);
                }
            }
            if (z) {
                return;
            }
            if (this.f29849c != 3) {
                d();
            }
            this.f29849c = 0;
        }

        @Override // com.huawei.uikit.hwsearchview.widget.HwSearchView.HwSearchAutoComplete, androidx.appcompat.widget.SearchView.SearchAutoComplete, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (keyEvent == null) {
                return false;
            }
            if (i == 4 || i == 3) {
                return super.onKeyPreIme(i, keyEvent);
            }
            if (this.f29849c == 3 && i != 746) {
                this.f29849c = 2;
                d();
            }
            if (this.f29849c != 1) {
                b(i, keyEvent);
                if (this.f29849c != 2 || i != 111) {
                    return super.onKeyPreIme(i, keyEvent);
                }
                this.f29849c = 1;
                setCursorVisible(false);
                return true;
            }
            if (c(i) || i == 111) {
                return false;
            }
            if (i == 61 && keyEvent.getAction() == 0) {
                b(keyEvent);
            }
            if (d(i) && keyEvent.getAction() == 1) {
                this.f29849c = 2;
                setCursorVisible(true);
            }
            return true;
        }

        @Override // android.widget.TextView, android.view.View
        public void onRestoreInstanceState(Parcelable parcelable) {
            Parcelable parcelable2;
            if (!(parcelable instanceof Bundle)) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            try {
                if (bundle.containsKey("ViewState")) {
                    this.f29849c = bundle.getInt("ViewState");
                }
                if (bundle.containsKey("CursorState")) {
                    setCursorVisible(bundle.getBoolean("CursorState"));
                }
                if (bundle.containsKey("InstanceState") && (parcelable2 = bundle.getParcelable("InstanceState")) != null) {
                    super.onRestoreInstanceState(parcelable2);
                }
            } catch (BadParcelableException unused) {
                Log.e("HwSearchView", "Parcelable, onRestoreInstanceState error");
            }
        }

        @Override // android.widget.TextView, android.view.View
        public Parcelable onSaveInstanceState() {
            Bundle bundle = new Bundle();
            try {
                bundle.putParcelable("InstanceState", super.onSaveInstanceState());
                bundle.putInt("ViewState", this.f29849c);
                bundle.putBoolean("CursorState", isCursorVisible());
                return bundle;
            } catch (BadParcelableException unused) {
                Log.e("HwSearchView", "Parcelable, HwSearchView onSaveInstanceState error");
                return bundle;
            }
        }

        @Override // com.huawei.uikit.hwsearchview.widget.HwSearchView.HwSearchAutoComplete, android.widget.TextView
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            e(charSequence);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                setCursorVisible(true);
                this.f29849c = 3;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.SearchView.SearchAutoComplete, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (c(this.e, z)) {
                this.f29848b = z;
                if (this.f29847a != null) {
                    invalidate();
                }
            }
            this.d = z;
        }

        private boolean c(boolean z, boolean z2) {
            return (this.e && this.d) != (z && z2);
        }

        public HwPhoneSearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f29848b = false;
            this.f29849c = 0;
        }

        private void a(Canvas canvas) {
            if (this.f29847a == null) {
                return;
            }
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                Rect rect = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                rect.offset(getScrollX() - getLeft(), getScrollY() - getTop());
                this.f29847a.setBounds(rect);
                this.f29847a.draw(canvas);
            }
        }

        public HwPhoneSearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f29848b = false;
            this.f29849c = 0;
        }

        private void b(int i, KeyEvent keyEvent) {
            if (this.f29849c == 4 && keyEvent.getAction() == 1 && a(i)) {
                this.f29849c = 3;
            } else {
                if (!b(i) || (keyEvent.getMetaState() & 2) == 0) {
                    return;
                }
                this.f29849c = 4;
            }
        }

        private void d() {
            if (Build.VERSION.SDK_INT > 29) {
                return;
            }
            Object systemService = getContext().getSystemService("input_method");
            if (systemService instanceof InputMethodManager) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                }
            }
        }

        private void b(KeyEvent keyEvent) {
            View viewFindNextFocus;
            boolean z = (keyEvent.getMetaState() & 1) != 0;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            if (!(rootView instanceof ViewGroup)) {
                viewFindNextFocus = null;
            } else if (z) {
                viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, this, 1);
            } else {
                viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, this, 2);
            }
            if (viewFindNextFocus != null) {
                viewFindNextFocus.requestFocus();
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(HwSearchView.this.d.getText())) {
                HwSearchView.this.d.setText("");
                HwSearchView.this.d.requestFocus();
            } else if (HwSearchView.this.f29846c != null) {
                HwSearchView.this.f29846c.onClick(view);
            }
        }
    }

    public HwSearchView(Context context) {
        this(context, null);
    }

    private void b() {
        this.h = getFocusedDrawable();
        this.g = getCancelButtonDrawable();
        this.e = getHintTextColor();
        this.f29845b = getTextColor();
        View viewFindViewById = findViewById(R.id.search_src_text);
        if (viewFindViewById instanceof HwPhoneSearchAutoComplete) {
            this.d = (HwPhoneSearchAutoComplete) viewFindViewById;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.search_close_btn);
        this.f = appCompatImageView;
        if (appCompatImageView != null) {
            appCompatImageView.setBackground(this.g);
            this.f.setOnClickListener(this.f29844a);
        }
        this.j = findViewById(R.id.search_plate);
        this.i = findViewById(R.id.hwsearchview_voice_button);
        HwPhoneSearchAutoComplete hwPhoneSearchAutoComplete = this.d;
        if (hwPhoneSearchAutoComplete != null) {
            hwPhoneSearchAutoComplete.f29847a = this.h;
            this.d.setHintTextColor(this.e);
            this.d.setTextColor(this.f29845b);
            this.d.setSearchPlate(this.j);
            this.d.setVoiceButton(this.i);
            if (Float.compare(getResources().getConfiguration().fontScale, 1.75f) >= 0) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwsearchview_font_scale_padding);
                HwPhoneSearchAutoComplete hwPhoneSearchAutoComplete2 = this.d;
                hwPhoneSearchAutoComplete2.setPaddingRelative(hwPhoneSearchAutoComplete2.getPaddingStart(), dimensionPixelSize, this.d.getPaddingEnd(), dimensionPixelSize);
            }
        }
    }

    private boolean b(View view) {
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    @Override // com.huawei.uikit.hwsearchview.widget.HwSearchView
    public void b(int i, int i2) {
        int iE;
        TextView textView = (TextView) findViewById(R.id.hwsearchview_start_title);
        if (b(textView)) {
            int size = View.MeasureSpec.getSize(i);
            View viewFindViewById = findViewById(R.id.search_plate);
            if (!b(viewFindViewById) || viewFindViewById.getLayoutParams() == null) {
                iE = 0;
            } else {
                int minimumWidth = viewFindViewById.getLayoutParams().width;
                if (minimumWidth <= 0) {
                    minimumWidth = viewFindViewById.getMinimumWidth();
                }
                iE = minimumWidth + e(viewFindViewById);
            }
            int iA = ((size - iE) - a(findViewById(R.id.hwsearchview_barcode_button))) - a(findViewById(R.id.hwsearchview_intelligent_button));
            View viewFindViewById2 = findViewById(R.id.hwsearchview_search_bar);
            if (b(viewFindViewById2)) {
                iA -= viewFindViewById2.getPaddingEnd() + viewFindViewById2.getPaddingStart();
            }
            int iE2 = iA - e(textView);
            if (textView.getMaxWidth() == iE2 || iE2 <= 0) {
                return;
            }
            textView.setMaxWidth(iE2);
        }
    }

    @Override // com.huawei.uikit.hwsearchview.widget.HwSearchView
    public void setFocusMode(int i) {
    }

    public HwSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSearchViewStyle);
    }

    private int a(View view) {
        ViewGroup.LayoutParams layoutParams;
        int iE;
        if (!b(view) || (layoutParams = view.getLayoutParams()) == null) {
            return 0;
        }
        int measuredWidth = layoutParams.width;
        if (measuredWidth < 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = view.getMeasuredWidth();
            iE = e(view);
        } else {
            iE = e(view);
        }
        return measuredWidth + iE;
    }

    private int e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public HwSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29846c = c(this, "mOnClickListener", SearchView.class);
        this.f29844a = new d();
        b();
    }

    private View.OnClickListener c(Object obj, String str, Class<?> cls) {
        Object objC = xeh.c(obj, str, cls);
        if (objC instanceof View.OnClickListener) {
            return (View.OnClickListener) objC;
        }
        return null;
    }
}
