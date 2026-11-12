package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import defpackage.cqi;
import defpackage.epo;
import defpackage.eyq;
import defpackage.i2j;
import defpackage.mwi;
import defpackage.qii;
import defpackage.smi;
import defpackage.tip;
import defpackage.wc5;
import defpackage.xfp;
import defpackage.y34;
import defpackage.z5j;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements y34 {
    public static final o V;
    public boolean A;
    public CharSequence B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public int J;
    public SearchableInfo K;
    public Bundle L;
    public final Runnable M;
    public Runnable N;
    public final WeakHashMap<String, Drawable.ConstantState> O;
    public final View.OnClickListener P;
    public View.OnKeyListener Q;
    public final TextView.OnEditorActionListener R;
    public final AdapterView.OnItemClickListener S;
    public final AdapterView.OnItemSelectedListener T;
    public TextWatcher U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchAutoComplete f1640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1641b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final View i;
    public p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f1642k;
    public Rect l;
    public int[] m;
    public int[] n;
    public final ImageView o;
    public final Drawable p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1643r;
    public final Intent s;
    public final Intent t;
    public final CharSequence u;
    public View.OnFocusChangeListener v;
    public View.OnClickListener w;
    public boolean x;
    public boolean y;
    public wc5 z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1644b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1644b + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1644b));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1644b = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int e;
        public SearchView f;
        public boolean g;
        public final Runnable h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.V.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f.E();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
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
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.r(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, qii.q);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.D(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.K();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wc5 wc5Var = SearchView.this.z;
            if (wc5Var instanceof epo) {
                wc5Var.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.v;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.g();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.e) {
                searchView.A();
                return;
            }
            if (view == searchView.g) {
                searchView.w();
                return;
            }
            if (view == searchView.f) {
                searchView.B();
            } else if (view == searchView.h) {
                searchView.F();
            } else if (view == searchView.f1640a) {
                searchView.m();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.K == null) {
                return false;
            }
            if (searchView.f1640a.isPopupShowing() && SearchView.this.f1640a.getListSelection() != -1) {
                return SearchView.this.C(view, i, keyEvent);
            }
            if (SearchView.this.f1640a.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.u(0, null, searchView2.f1640a.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.B();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.x(i, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.y(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @RequiresApi(29)
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f1656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f1657b;
        public Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1656a = null;
            this.f1657b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1656a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1657b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1657b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1656a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f1658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f1659b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1659b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.f1658a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1659b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f;
                    this.f = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f1659b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.c.contains(x, y)) {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f1658a.getWidth() / 2, this.f1658a.getHeight() / 2);
            }
            return this.f1658a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        V = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(smi.g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(smi.h);
    }

    public static boolean r(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void setQuery(CharSequence charSequence) {
        this.f1640a.setText(charSequence);
        this.f1640a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void A() {
        P(false);
        this.f1640a.requestFocus();
        this.f1640a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void B() {
        Editable text = this.f1640a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.K != null) {
            u(0, null, text.toString());
        }
        this.f1640a.setImeVisibility(false);
        l();
    }

    public boolean C(View view, int i2, KeyEvent keyEvent) {
        if (this.K != null && this.z != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return x(this.f1640a.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f1640a.setSelection(i2 == 21 ? 0 : this.f1640a.length());
                this.f1640a.setListSelection(0);
                this.f1640a.clearListSelection();
                this.f1640a.b();
                return true;
            }
            if (i2 == 19) {
                this.f1640a.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void D(CharSequence charSequence) {
        Editable text = this.f1640a.getText();
        this.H = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        O(!zIsEmpty);
        Q(zIsEmpty);
        J();
        N();
        this.G = charSequence.toString();
    }

    public void E() {
        P(q());
        G();
        if (this.f1640a.hasFocus()) {
            m();
        }
    }

    public void F() {
        SearchableInfo searchableInfo = this.K;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(k(this.s, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(j(this.t, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void G() {
        post(this.M);
    }

    public final void H(int i2) {
        Editable text = this.f1640a.getText();
        Cursor cursorB = this.z.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceC = this.z.c(cursorB);
        if (charSequenceC != null) {
            setQuery(charSequenceC);
        } else {
            setQuery(text);
        }
    }

    public void I(CharSequence charSequence, boolean z) {
        this.f1640a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1640a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.H = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        B();
    }

    public final void J() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1640a.getText());
        if (!z2 && (!this.x || this.I)) {
            z = false;
        }
        this.g.setVisibility(z ? 0 : 8);
        Drawable drawable = this.g.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void K() {
        int[] iArr = this.f1640a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void L() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1640a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(o(queryHint));
    }

    public final void M() {
        this.f1640a.setThreshold(this.K.getSuggestThreshold());
        this.f1640a.setImeOptions(this.K.getImeOptions());
        int inputType = this.K.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.K.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f1640a.setInputType(inputType);
        wc5 wc5Var = this.z;
        if (wc5Var != null) {
            wc5Var.a(null);
        }
        if (this.K.getSuggestAuthority() != null) {
            epo epoVar = new epo(getContext(), this, this.K, this.O);
            this.z = epoVar;
            this.f1640a.setAdapter(epoVar);
            ((epo) this.z).x(this.C ? 2 : 1);
        }
    }

    public final void N() {
        this.d.setVisibility((s() && (this.f.getVisibility() == 0 || this.h.getVisibility() == 0)) ? 0 : 8);
    }

    public final void O(boolean z) {
        this.f.setVisibility((this.A && s() && hasFocus() && (z || !this.F)) ? 0 : 8);
    }

    public final void P(boolean z) {
        this.y = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1640a.getText());
        this.e.setVisibility(i3);
        O(!zIsEmpty);
        this.f1641b.setVisibility(z ? 8 : 0);
        if (this.o.getDrawable() != null && !this.x) {
            i2 = 0;
        }
        this.o.setVisibility(i2);
        J();
        Q(zIsEmpty);
        N();
    }

    public final void Q(boolean z) {
        int i2 = 8;
        if (this.F && !q() && z) {
            this.f.setVisibility(8);
            i2 = 0;
        }
        this.h.setVisibility(i2);
    }

    @Override // defpackage.y34
    public void c() {
        I("", false);
        clearFocus();
        P(true);
        this.f1640a.setImeOptions(this.J);
        this.I = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.D = true;
        super.clearFocus();
        this.f1640a.clearFocus();
        this.f1640a.setImeVisibility(false);
        this.D = false;
    }

    @Override // defpackage.y34
    public void d() {
        if (this.I) {
            return;
        }
        this.I = true;
        int imeOptions = this.f1640a.getImeOptions();
        this.J = imeOptions;
        this.f1640a.setImeOptions(imeOptions | 33554432);
        this.f1640a.setText("");
        setIconified(false);
    }

    public void g() {
        if (this.i.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.c.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = eyq.b(this);
            int dimensionPixelSize = this.x ? resources.getDimensionPixelSize(smi.e) + resources.getDimensionPixelSize(smi.f) : 0;
            this.f1640a.getDropDownBackground().getPadding(rect);
            this.f1640a.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1640a.setDropDownWidth((((this.i.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f1640a.getImeOptions();
    }

    public int getInputType() {
        return this.f1640a.getInputType();
    }

    public int getMaxWidth() {
        return this.E;
    }

    public CharSequence getQuery() {
        return this.f1640a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.B;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.K;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.u : getContext().getText(this.K.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1643r;
    }

    public int getSuggestionRowLayout() {
        return this.q;
    }

    public wc5 getSuggestionsAdapter() {
        return this.z;
    }

    public final Intent h(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.H);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.L;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.K.getSearchActivity());
        return intent;
    }

    public final Intent i(Cursor cursor, int i2, String str) {
        int position;
        String strO;
        try {
            try {
                String strO2 = epo.o(cursor, "suggest_intent_action");
                if (strO2 == null) {
                    strO2 = this.K.getSuggestIntentAction();
                }
                if (strO2 == null) {
                    strO2 = "android.intent.action.SEARCH";
                }
                String str2 = strO2;
                String strO3 = epo.o(cursor, "suggest_intent_data");
                if (strO3 == null) {
                    strO3 = this.K.getSuggestIntentData();
                }
                if (strO3 != null && (strO = epo.o(cursor, "suggest_intent_data_id")) != null) {
                    strO3 = strO3 + "/" + Uri.encode(strO);
                }
                return h(str2, strO3 == null ? null : Uri.parse(strO3), epo.o(cursor, "suggest_intent_extra_data"), epo.o(cursor, "suggest_intent_query"), i2, str);
            } catch (RuntimeException unused) {
                position = -1;
                StringBuilder sb = new StringBuilder();
                sb.append("Search suggestions cursor at row ");
                sb.append(position);
                sb.append(" returned exception.");
                return null;
            }
        } catch (RuntimeException unused2) {
            position = cursor.getPosition();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(position);
            sb2.append(" returned exception.");
            return null;
        }
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.L;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void l() {
        this.f1640a.dismissDropDown();
    }

    public void m() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1640a);
            return;
        }
        o oVar = V;
        oVar.b(this.f1640a);
        oVar.a(this.f1640a);
    }

    public final void n(View view, Rect rect) {
        view.getLocationInWindow(this.m);
        getLocationInWindow(this.n);
        int[] iArr = this.m;
        int i2 = iArr[1];
        int[] iArr2 = this.n;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    public final CharSequence o(CharSequence charSequence) {
        if (!this.x || this.p == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1640a.getTextSize()) * 1.25d);
        this.p.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.p), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.M);
        post(this.N);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            n(this.f1640a, this.f1642k);
            Rect rect = this.l;
            Rect rect2 = this.f1642k;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.j;
            if (pVar != null) {
                pVar.a(this.l, this.f1642k);
                return;
            }
            p pVar2 = new p(this.l, this.f1642k, this.f1640a);
            this.j = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (q()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.E;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.E;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.E) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        P(savedState.f1644b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1644b = q();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        G();
    }

    public final boolean p() {
        Intent intent;
        SearchableInfo searchableInfo = this.K;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.K.getVoiceSearchLaunchWebSearch()) {
            intent = this.s;
        } else {
            intent = this.K.getVoiceSearchLaunchRecognizer() ? this.t : null;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean q() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.D || !isFocusable()) {
            return false;
        }
        if (q()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f1640a.requestFocus(i2, rect);
        if (zRequestFocus) {
            P(false);
        }
        return zRequestFocus;
    }

    public final boolean s() {
        return (this.A || this.F) && !q();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.L = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            w();
        } else {
            A();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        P(z);
        L();
    }

    public void setImeOptions(int i2) {
        this.f1640a.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1640a.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.E = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.v = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.B = charSequence;
        L();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.C = z;
        wc5 wc5Var = this.z;
        if (wc5Var instanceof epo) {
            ((epo) wc5Var).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.K = searchableInfo;
        if (searchableInfo != null) {
            M();
            L();
        }
        boolean zP = p();
        this.F = zP;
        if (zP) {
            this.f1640a.setPrivateImeOptions("nm");
        }
        P(q());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A = z;
        P(q());
    }

    public void setSuggestionsAdapter(wc5 wc5Var) {
        this.z = wc5Var;
        this.f1640a.setAdapter(wc5Var);
    }

    public final void t(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(intent);
        }
    }

    public void u(int i2, String str, String str2) {
        getContext().startActivity(h("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public final boolean v(int i2, int i3, String str) {
        Cursor cursorB = this.z.b();
        if (cursorB == null || !cursorB.moveToPosition(i2)) {
            return false;
        }
        t(i(cursorB, i3, str));
        return true;
    }

    public void w() {
        if (!TextUtils.isEmpty(this.f1640a.getText())) {
            this.f1640a.setText("");
            this.f1640a.requestFocus();
            this.f1640a.setImeVisibility(true);
        } else if (this.x) {
            clearFocus();
            P(true);
        }
    }

    public boolean x(int i2, int i3, String str) {
        v(i2, 0, null);
        this.f1640a.setImeVisibility(false);
        l();
        return true;
    }

    public boolean y(int i2) {
        H(i2);
        return true;
    }

    public void z(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qii.L);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1642k = new Rect();
        this.l = new Rect();
        this.m = new int[2];
        this.n = new int[2];
        this.M = new b();
        this.N = new c();
        this.O = new WeakHashMap<>();
        f fVar = new f();
        this.P = fVar;
        this.Q = new g();
        h hVar = new h();
        this.R = hVar;
        i iVar = new i();
        this.S = iVar;
        j jVar = new j();
        this.T = jVar;
        this.U = new a();
        xfp xfpVarV = xfp.v(context, attributeSet, z5j.p2, i2, 0);
        androidx.core.view.c.p0(this, context, z5j.p2, attributeSet, xfpVarV.r(), i2, 0);
        LayoutInflater.from(context).inflate(xfpVarV.n(z5j.z2, mwi.t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(cqi.I);
        this.f1640a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1641b = findViewById(cqi.E);
        View viewFindViewById = findViewById(cqi.H);
        this.c = viewFindViewById;
        View viewFindViewById2 = findViewById(cqi.O);
        this.d = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(cqi.C);
        this.e = imageView;
        ImageView imageView2 = (ImageView) findViewById(cqi.F);
        this.f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(cqi.D);
        this.g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(cqi.J);
        this.h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(cqi.G);
        this.o = imageView5;
        androidx.core.view.c.v0(viewFindViewById, xfpVarV.g(z5j.A2));
        androidx.core.view.c.v0(viewFindViewById2, xfpVarV.g(z5j.E2));
        imageView.setImageDrawable(xfpVarV.g(z5j.D2));
        imageView2.setImageDrawable(xfpVarV.g(z5j.x2));
        imageView3.setImageDrawable(xfpVarV.g(z5j.u2));
        imageView4.setImageDrawable(xfpVarV.g(z5j.G2));
        imageView5.setImageDrawable(xfpVarV.g(z5j.D2));
        this.p = xfpVarV.g(z5j.C2);
        tip.a(imageView, getResources().getString(i2j.p));
        this.q = xfpVarV.n(z5j.F2, mwi.s);
        this.f1643r = xfpVarV.n(z5j.v2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.U);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.Q);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(xfpVarV.a(z5j.y2, true));
        int iF = xfpVarV.f(z5j.r2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.u = xfpVarV.p(z5j.w2);
        this.B = xfpVarV.p(z5j.B2);
        int iK = xfpVarV.k(z5j.t2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = xfpVarV.k(z5j.s2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(xfpVarV.a(z5j.q2, true));
        xfpVarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.s = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.t = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.i = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        P(this.x);
        L();
    }
}
