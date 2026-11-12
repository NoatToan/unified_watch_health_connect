package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.bil;
import defpackage.cdj;
import defpackage.cm8;
import defpackage.d8p;
import defpackage.ii4;
import defpackage.jfj;
import defpackage.msl;
import defpackage.n7p;
import defpackage.sk1;
import defpackage.ufj;
import defpackage.xej;
import defpackage.xfj;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ReactEditText extends EditText {
    public static final KeyListener y = QwertyKeyListener.getInstanceForFullKeyboard();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputMethodManager f7565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7566b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ArrayList<TextWatcher> h;
    public d i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7567k;
    public Boolean l;
    public boolean m;
    public String n;
    public msl o;
    public ii4 p;
    public bil q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f7568r;
    public boolean s;
    public boolean t;
    public n7p u;
    public boolean v;
    public boolean w;
    public xfj x;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return i == 16 ? ReactEditText.this.p() : super.performAccessibilityAction(view, i, bundle);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactEditText.this.v();
        }
    }

    public static class c implements KeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7571a = 0;

        public void a(int i) {
            this.f7571a = i;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i) {
            ReactEditText.y.clearMetaKeyState(view, editable, i);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f7571a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.y.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.y.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.y.onKeyUp(view, editable, i, keyEvent);
        }
    }

    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ReactEditText reactEditText = ReactEditText.this;
            if (reactEditText.f7566b || reactEditText.h == null) {
                return;
            }
            Iterator it = ReactEditText.this.h.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ReactEditText reactEditText = ReactEditText.this;
            if (reactEditText.f7566b || reactEditText.h == null) {
                return;
            }
            Iterator it = ReactEditText.this.h.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ReactEditText reactEditText = ReactEditText.this;
            if (!reactEditText.f7566b && reactEditText.h != null) {
                Iterator it = ReactEditText.this.h.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            ReactEditText.this.n();
        }

        public /* synthetic */ d(ReactEditText reactEditText, a aVar) {
            this();
        }
    }

    public ReactEditText(Context context) {
        super(context);
        this.s = false;
        this.t = false;
        this.v = false;
        this.w = false;
        setFocusableInTouchMode(false);
        this.x = new xfj(this);
        this.f7565a = (InputMethodManager) sk1.c(getContext().getSystemService("input_method"));
        this.d = getGravity() & 8388615;
        this.e = getGravity() & 112;
        this.f = 0;
        this.g = 0;
        this.f7566b = false;
        this.c = false;
        this.l = null;
        this.m = false;
        this.h = null;
        this.i = null;
        this.j = getInputType();
        this.f7568r = new c();
        this.q = null;
        this.u = new n7p();
        e();
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, null);
        }
        androidx.core.view.c.r0(this, new a());
    }

    private d getTextWatcherDelegator() {
        if (this.i == null) {
            this.i = new d(this, null);
        }
        return this.i;
    }

    public static boolean q(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.h == null) {
            this.h = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.h.add(textWatcher);
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        h();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        try {
            super.drawableStateChanged();
        } catch (Exception e) {
            cm8.j("ReactNative", "Error while ReactEditText drawableStateChanged", e);
        }
    }

    public void e() {
        setTextSize(0, this.u.c());
        float fD = this.u.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public void f() {
        clearFocus();
    }

    public void g() {
        if (getInputType() != this.j) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.j);
            setSelection(selectionStart, selectionEnd);
        }
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.l;
        return bool == null ? !j() : bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.m;
    }

    public String getReturnKeyType() {
        return this.n;
    }

    public int getStagedInputType() {
        return this.j;
    }

    public void h() {
        this.f7565a.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int i() {
        int i = this.f + 1;
        this.f = i;
        return i;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f7567k) {
            Editable text = getText();
            for (d8p d8pVar : (d8p[]) text.getSpans(0, text.length(), d8p.class)) {
                if (d8pVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public boolean j() {
        return (getInputType() & 131072) != 0;
    }

    public final boolean k() {
        return (getInputType() & 144) != 0;
    }

    public final void l(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (spans[i] instanceof xej) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (q(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    public void m(ufj ufjVar) {
        if (k() && TextUtils.equals(getText(), ufjVar.j())) {
            return;
        }
        int iB = ufjVar.b();
        this.g = iB;
        if (iB < this.f) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ufjVar.j());
        l(spannableStringBuilder);
        this.f7567k = ufjVar.a();
        this.f7566b = true;
        if (ufjVar.j().length() == 0) {
            setText((CharSequence) null);
        } else {
            getText().replace(0, length(), spannableStringBuilder);
        }
        this.f7566b = false;
        if (getBreakStrategy() != ufjVar.l()) {
            setBreakStrategy(ufjVar.l());
        }
    }

    public final void n() {
        ii4 ii4Var = this.p;
        if (ii4Var != null) {
            ii4Var.a();
        }
        u();
    }

    public void o() {
        p();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7567k) {
            Editable text = getText();
            for (d8p d8pVar : (d8p[]) text.getSpans(0, text.length(), d8p.class)) {
                d8pVar.c();
            }
        }
        if (this.v && !this.w) {
            p();
        }
        this.w = true;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = (ReactContext) getContext();
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.t) {
            inputConnectionOnCreateInputConnection = new cdj(inputConnectionOnCreateInputConnection, reactContext, this);
        }
        if (j() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7567k) {
            Editable text = getText();
            for (d8p d8pVar : (d8p[]) text.getSpans(0, text.length(), d8p.class)) {
                d8pVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f7567k) {
            Editable text = getText();
            for (d8p d8pVar : (d8p[]) text.getSpans(0, text.length(), d8p.class)) {
                d8pVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        msl mslVar;
        super.onFocusChanged(z, i, rect);
        if (!z || (mslVar = this.o) == null) {
            return;
        }
        mslVar.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || j()) {
            return super.onKeyUp(i, keyEvent);
        }
        h();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n();
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        bil bilVar = this.q;
        if (bilVar != null) {
            bilVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.o == null || !hasFocus()) {
            return;
        }
        this.o.a(i, i2);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f7567k) {
            Editable text = getText();
            for (d8p d8pVar : (d8p[]) text.getSpans(0, text.length(), d8p.class)) {
                d8pVar.f();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.s = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.s) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.s = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            post(new b());
        }
        return zRequestFocus;
    }

    public void r(int i, float f, float f2) {
        this.x.c(i, f, f2);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.h;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.h.isEmpty()) {
                this.h = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    public void s(float f, int i) {
        this.x.e(f, i);
    }

    public void setAllowFontScaling(boolean z) {
        if (this.u.b() != z) {
            this.u.m(z);
            e();
        }
    }

    public void setAutoFocus(boolean z) {
        this.v = z;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        try {
            super.setBackground(drawable);
        } catch (Exception e) {
            cm8.j("ReactNative", "Error while ReactEditText setBackground", e);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.x.b(i);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.l = bool;
    }

    public void setBorderRadius(float f) {
        this.x.d(f);
    }

    public void setBorderStyle(String str) {
        this.x.f(str);
    }

    public void setContentSizeWatcher(ii4 ii4Var) {
        this.p = ii4Var;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.m = z;
        w();
    }

    public void setFontSize(float f) {
        this.u.n(f);
        e();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.d;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.e;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.j = i;
        super.setTypeface(typeface);
        if (j()) {
            setSingleLine(false);
        }
        this.f7568r.a(i);
        setKeyListener(this.f7568r);
    }

    public void setLetterSpacingPt(float f) {
        this.u.p(f);
        e();
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.u.k()) {
            this.u.r(f);
            e();
        }
    }

    public void setMostRecentEventCount(int i) {
        this.g = i;
    }

    public void setOnKeyPress(boolean z) {
        this.t = z;
    }

    public void setReturnKeyType(String str) {
        this.n = str;
        w();
    }

    public void setScrollWatcher(bil bilVar) {
        this.q = bilVar;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        int length;
        if (this.g < this.f) {
            return;
        }
        if (getText() == null || ((length = length()) >= i && length >= i2)) {
            super.setSelection(i, i2);
        }
    }

    public void setSelectionWatcher(msl mslVar) {
        this.o = mslVar;
    }

    public void setStagedInputType(int i) {
        this.j = i;
    }

    public void t(int i, float f) {
        this.x.g(i, f);
    }

    public final void u() {
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new jfj(this));
    }

    public boolean v() {
        return this.f7565a.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f7567k) {
            Editable text = getText();
            for (d8p d8pVar : (d8p[]) text.getSpans(0, text.length(), d8p.class)) {
                if (d8pVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* JADX WARN: switch over string: strings are not added: [[done]] */
    public final void w() {
        String str = this.n;
        int i = 6;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "previous":
                    i = 7;
                    break;
                case "search":
                    i = 3;
                    break;
                case "go":
                    i = 2;
                    break;
                case "next":
                    i = 5;
                    break;
                case "none":
                    i = 1;
                    break;
                case "send":
                    i = 4;
                    break;
            }
        }
        if (this.m) {
            setImeOptions(33554432 | i);
        } else {
            setImeOptions(i);
        }
    }
}
