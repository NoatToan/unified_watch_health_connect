package com.huawei.uikit.hwsearchview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.uikit.hwsearchview.R;
import defpackage.xeh;
import defpackage.xfs;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class HwSearchView extends SearchView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29694b = "HwSearchView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f29695a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwSearchAutoComplete f29696c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Drawable i;
    private int j;
    private int l;
    private Drawable m;

    public static class HwSearchAutoComplete extends SearchView.SearchAutoComplete {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f29698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f29699c;
        private View d;
        private bqmxo e;
        private int f;
        private int h;
        private TextContextMenuItemListener i;
        private final Drawable j;

        public HwSearchAutoComplete(Context context) {
            super(context);
            this.h = 0;
            this.j = ContextCompat.getDrawable(getContext(), R.drawable.hwsearchview_text_search_cursor_emui);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCancelButton(View view) {
            this.f29698b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFocusMode(int i) {
            this.h = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnDrawableStateChangedListener(bqmxo bqmxoVar) {
            this.e = bqmxoVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearchPlate(View view) {
            this.f29699c = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextCursorColor(int i) {
            this.f29697a = i;
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceButton(View view) {
            this.d = view;
            d(0);
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            bqmxo bqmxoVar = this.e;
            if (bqmxoVar != null) {
                bqmxoVar.a(getDrawableState());
            }
        }

        @Override // androidx.appcompat.widget.SearchView.SearchAutoComplete, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            if (!z && this.h == 1) {
                Object systemService = getContext().getSystemService("input_method");
                if (systemService instanceof InputMethodManager) {
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    if (inputMethodManager.isActive()) {
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    }
                }
            }
            super.onFocusChanged(z, i, rect);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (this.h == 1) {
                if (i == 21) {
                    if (c()) {
                        return d();
                    }
                    return false;
                }
                if (i == 22) {
                    if (c()) {
                        return false;
                    }
                    return d();
                }
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // androidx.appcompat.widget.SearchView.SearchAutoComplete, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            View view;
            if (this.h == 1) {
                if (i == 111 && (view = this.f29699c) != null) {
                    view.setFocusableInTouchMode(true);
                    this.f29699c.requestFocus();
                    return true;
                }
                if (i == 66) {
                    return true;
                }
            }
            if (i != 4 || keyEvent == null) {
                return false;
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    if (isPopupShowing()) {
                        dismissDropDown();
                    }
                    b();
                    InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        return inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    }
                }
            }
            return false;
        }

        @Override // android.widget.TextView
        protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            e(charSequence);
            d(TextUtils.isEmpty(charSequence) ? this.f : 0);
        }

        @Override // android.widget.EditText, android.widget.TextView
        public boolean onTextContextMenuItem(int i) {
            TextContextMenuItemListener textContextMenuItemListener = this.i;
            if (textContextMenuItemListener == null || !textContextMenuItemListener.onTextContextMenuItemChanged(i)) {
                return super.onTextContextMenuItem(i);
            }
            return true;
        }

        public void setTextContextMenuItemListener(TextContextMenuItemListener textContextMenuItemListener) {
            this.i = textContextMenuItemListener;
        }

        private void b() {
            try {
                TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]).invoke(this, new Object[0]);
            } catch (IllegalAccessException unused) {
                Log.e(HwSearchView.f29694b, "illegal access stopTextActionMode");
            } catch (NoSuchMethodException unused2) {
                Log.e(HwSearchView.f29694b, "method stopTextActionMode not found");
            } catch (InvocationTargetException unused3) {
                Log.e(HwSearchView.f29694b, "invocation stopTextActionMode error");
            }
        }

        private void a() {
            try {
                Object objC = xeh.c(this, "mEditor", (Class<?>) TextView.class);
                Class<?> cls = Class.forName("android.widget.Editor");
                if (Build.VERSION.SDK_INT >= 28) {
                    d(TextView.class, objC, cls);
                    return;
                }
                Object objC2 = xeh.c(objC, "mCursorDrawable", cls);
                if (objC2 instanceof Drawable[]) {
                    Drawable[] drawableArr = (Drawable[]) objC2;
                    for (int i = 0; i < drawableArr.length; i++) {
                        drawableArr[i] = b(drawableArr[i], this.f29697a);
                    }
                    xeh.d("mCursorDrawable", objC, drawableArr, cls);
                }
            } catch (ClassNotFoundException unused) {
                Log.e(HwSearchView.f29694b, "class not found");
            } catch (IllegalAccessException unused2) {
                Log.e(HwSearchView.f29694b, "illegal access");
            } catch (InvocationTargetException unused3) {
                Log.e(HwSearchView.f29694b, "invocation error");
            }
        }

        private boolean c() {
            return getLayoutDirection() == 1;
        }

        private boolean d() {
            View view = this.f29698b;
            if (view == null || view.getVisibility() != 0) {
                return false;
            }
            this.f29698b.setFocusableInTouchMode(true);
            this.f29698b.requestFocus();
            return true;
        }

        public HwSearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = 0;
            this.j = ContextCompat.getDrawable(getContext(), R.drawable.hwsearchview_text_search_cursor_emui);
        }

        private void d(int i) {
            View view = this.f29699c;
            if (view == null || i == view.getPaddingEnd()) {
                return;
            }
            View view2 = this.d;
            if (view2 != null && view2.getVisibility() == 0) {
                i = 0;
            }
            View view3 = this.f29699c;
            view3.setPaddingRelative(view3.getPaddingStart(), this.f29699c.getPaddingTop(), i, this.f29699c.getPaddingBottom());
        }

        public HwSearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = 0;
            this.j = ContextCompat.getDrawable(getContext(), R.drawable.hwsearchview_text_search_cursor_emui);
        }

        private void e(CharSequence charSequence) {
            View view = this.d;
            if (view == null) {
                return;
            }
            view.setVisibility(TextUtils.isEmpty(charSequence) ? 0 : 8);
        }

        private void d(Class<?> cls, Object obj, Class<?> cls2) throws IllegalAccessException, InvocationTargetException {
            xeh.b(obj, "updateCursorPosition", null, null, cls2);
            try {
                Object objInvoke = cls.getDeclaredMethod("getTextCursorDrawable", new Class[0]).invoke(this, new Object[0]);
                if (objInvoke instanceof Drawable) {
                    cls.getDeclaredMethod("setTextCursorDrawable", Drawable.class).invoke(this, b((Drawable) objInvoke, this.f29697a));
                }
            } catch (NoSuchMethodException unused) {
                Object objC = xeh.c(obj, "mDrawableForCursor", cls2);
                if (objC instanceof Drawable) {
                    xeh.d("mDrawableForCursor", obj, b((Drawable) objC, this.f29697a), cls2);
                }
            }
        }

        private Drawable b(Drawable drawable, int i) {
            Drawable drawable2;
            if (drawable == null) {
                if (this.f29697a == 0 || (drawable2 = this.j) == null) {
                    return null;
                }
                drawable = drawable2.mutate();
            }
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTint(drawableMutate, i);
            return drawableMutate;
        }
    }

    public interface TextContextMenuItemListener {
        boolean onTextContextMenuItemChanged(int i);
    }

    class a implements View.OnFocusChangeListener {
        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z || view == null || HwSearchView.this.f != 1) {
                return;
            }
            view.setFocusableInTouchMode(false);
        }
    }

    interface bqmxo {
        void a(int[] iArr);
    }

    class e implements bqmxo {
        e() {
        }

        @Override // com.huawei.uikit.hwsearchview.widget.HwSearchView.bqmxo
        public void a(int[] iArr) {
            Drawable background = HwSearchView.this.f29695a.getBackground();
            if (background != null) {
                background.setState(iArr);
            }
        }
    }

    public HwSearchView(Context context) {
        this(context, null);
    }

    private void setFocusChangeProc(View view) {
        if (view == null) {
            return;
        }
        view.setOnFocusChangeListener(new a());
    }

    private void setSearchButtonTextColorInternal(int i) {
        if (this.e == i) {
            return;
        }
        View viewFindViewById = findViewById(R.id.hwsearchview_search_text_button);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextColor(i);
            this.e = i;
        }
    }

    protected void b(int i, int i2) {
    }

    public Drawable getCancelButtonDrawable() {
        return this.m;
    }

    public int getFocusMode() {
        return this.f;
    }

    public int getFocusPathColor() {
        return this.g;
    }

    public Drawable getFocusedDrawable() {
        return this.i;
    }

    public int getHintTextColor() {
        return this.j;
    }

    public int getTextColor() {
        return this.h;
    }

    @Override // androidx.appcompat.widget.SearchView, androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (getOrientation() == 1) {
            e("measureVertical", i, i2);
        } else {
            b(i, i2);
            e("measureHorizontal", i, i2);
        }
    }

    public void setCancelButtonDrawable(Drawable drawable) {
        this.m = drawable;
    }

    public void setFocusMode(int i) {
        this.f = i;
        HwSearchAutoComplete hwSearchAutoComplete = this.f29696c;
        if (hwSearchAutoComplete != null) {
            hwSearchAutoComplete.setFocusMode(i);
        }
    }

    public void setFocusPathColor(int i) {
        this.g = i;
    }

    public void setFocusedDrawable(Drawable drawable) {
        this.i = drawable;
    }

    @Override // android.view.View
    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        HwSearchAutoComplete hwSearchAutoComplete = this.f29696c;
        if (hwSearchAutoComplete != null) {
            hwSearchAutoComplete.setHapticFeedbackEnabled(z);
        }
    }

    public void setHintTextColor(int i) {
        this.j = i;
    }

    public void setSearchButtonTextColor(int i) {
        setSearchButtonTextColorInternal(i);
    }

    public void setTextColor(int i) {
        this.h = i;
    }

    public void setTextCursorColor(int i) {
        if (this.f29696c.f29697a == i) {
            return;
        }
        this.f29696c.setTextCursorColor(i);
    }

    public HwSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSearchViewStyle);
    }

    private void a() {
        View viewFindViewById = findViewById(R.id.search_src_text);
        if (viewFindViewById instanceof HwSearchAutoComplete) {
            this.f29696c = (HwSearchAutoComplete) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.search_plate);
            this.f29695a = viewFindViewById2;
            setFocusChangeProc(viewFindViewById2);
            this.f29696c.setSearchPlate(this.f29695a);
            this.f29696c.setVoiceButton(findViewById(R.id.hwsearchview_voice_button));
            this.f29696c.f = this.l;
            View viewFindViewById3 = findViewById(R.id.search_close_btn);
            this.f29696c.setCancelButton(viewFindViewById3);
            setFocusChangeProc(viewFindViewById3);
            this.f29696c.setTextCursorColor(this.d);
            this.f29696c.setOnDrawableStateChangedListener(new e());
            HwSearchAutoComplete hwSearchAutoComplete = this.f29696c;
            hwSearchAutoComplete.setText(hwSearchAutoComplete.getText());
            this.f29696c.setHapticFeedbackEnabled(isHapticFeedbackEnabled());
            this.f29696c.setFocusMode(this.f);
        }
    }

    public HwSearchView(Context context, AttributeSet attributeSet, int i) {
        super(c(context, i), attributeSet, i);
        this.f = 0;
        b(super.getContext(), attributeSet, i);
        a();
    }

    private static Context c(Context context, int i) {
        context.getTheme().applyStyle(R.style.Theme_AppCompat_HwSearchView, false);
        return xfs.c(context, i, R.style.Theme_Emui_HwSearchView);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        int color = ContextCompat.getColor(context, R.color.hwsearchview_color_control_highlight);
        int color2 = ContextCompat.getColor(context, R.color.hwsearchview_focused_path_color);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwSearchView, i, R.style.Widget_Emui_HwSearchView);
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSearchView_hwTextCursorColor, color);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSearchView_hwFocusedPathColor, color2);
        setSearchButtonTextColorInternal(typedArrayObtainStyledAttributes.getColor(R.styleable.HwSearchView_hwSearchButtonTextColor, 0));
        this.i = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwSearchView_hwFocusedDrawable);
        this.m = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwSearchView_hwCancelButton);
        this.j = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSearchView_hwHintTextColor, color);
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.HwSearchView_hwTextColor, color);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwSearchView_hwSearchPlatePaddingEnd, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void e(String str, int i, int i2) {
        Class cls = Integer.TYPE;
        xeh.b(this, str, new Class[]{cls, cls}, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, LinearLayoutCompat.class);
    }
}
