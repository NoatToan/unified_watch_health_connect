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
import android.content.res.TypedArray;
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
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements m.c {
    public static final o Q0;
    public View.OnClickListener A;
    public boolean B;
    public boolean C;
    public q7.a D;
    public boolean E;
    public CharSequence F;
    public String H0;
    public boolean I;
    public CharSequence I0;
    public boolean J0;
    public int K0;
    public SearchableInfo L0;
    public Bundle M0;
    public final b N0;
    public final c O0;
    public boolean P;
    public final WeakHashMap<String, Drawable.ConstantState> P0;
    public int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchAutoComplete f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f4963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f4964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f4965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f4966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f4967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f4968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f4969k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f4970k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f4971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f4972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f4973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f4974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Drawable f4975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4977r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Intent f4978t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Intent f4979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f4980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f4981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l f4982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View.OnFocusChangeListener f4983z;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f4959a.getText();
            searchView.I0 = text;
            boolean zIsEmpty = TextUtils.isEmpty(text);
            searchView.o(!zIsEmpty);
            int i17 = 8;
            if (searchView.f4970k0 && !searchView.C && zIsEmpty) {
                searchView.f4964f.setVisibility(8);
                i17 = 0;
            }
            searchView.f4966h.setVisibility(i17);
            searchView.k();
            searchView.n();
            if (searchView.f4981x != null && !TextUtils.equals(charSequence, searchView.H0)) {
                searchView.f4981x.l5(charSequence.toString());
            }
            searchView.H0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.l();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q7.a aVar = SearchView.this.D;
            if (aVar instanceof q0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f4983z;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z14);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            SearchView searchView = SearchView.this;
            SearchAutoComplete searchAutoComplete = searchView.f4959a;
            View view3 = searchView.f4967i;
            if (view3.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f4961c.getPaddingLeft();
                Rect rect = new Rect();
                boolean z14 = searchView.getLayoutDirection() == 1;
                int dimensionPixelSize = searchView.B ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                int i26 = rect.left;
                searchAutoComplete.setDropDownHorizontalOffset(z14 ? -i26 : paddingLeft - (i26 + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view3.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f4963e;
            SearchAutoComplete searchAutoComplete = searchView.f4959a;
            if (view2 == imageView) {
                searchView.p(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.A;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view2 == searchView.f4965g) {
                searchView.e();
                return;
            }
            if (view2 == searchView.f4964f) {
                searchView.i();
                return;
            }
            if (view2 != searchView.f4966h) {
                if (view2 == searchAutoComplete) {
                    searchView.d();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.L0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.c(searchView.f4979v, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f4978t);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view2, int i14, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            SearchableInfo searchableInfo = searchView.L0;
            SearchAutoComplete searchAutoComplete = searchView.f4959a;
            if (searchableInfo != null) {
                if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                    if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i14 == 66) {
                        view2.cancelLongPress();
                        searchView.getContext().startActivity(searchView.b(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                        return true;
                    }
                } else if (searchView.L0 != null && searchView.D != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i14 == 66 || i14 == 84 || i14 == 61) {
                        searchView.f(searchAutoComplete.getListSelection());
                        return true;
                    }
                    if (i14 == 21 || i14 == 22) {
                        searchAutoComplete.setSelection(i14 == 21 ? 0 : searchAutoComplete.length());
                        searchAutoComplete.setListSelection(0);
                        searchAutoComplete.clearListSelection();
                        searchAutoComplete.a();
                        return true;
                    }
                    if (i14 == 19) {
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
            SearchView.this.i();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
            SearchView.this.f(i14);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
            SearchView.this.g(i14);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        private k() {
        }

        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i14) {
            searchAutoComplete.setInputMethodMode(i14);
        }
    }

    public interface l {
        void onClose();
    }

    public interface m {
        boolean E0(String str);

        boolean l5(String str);
    }

    public interface n {
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f4999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f5000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f5001c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f4999a = null;
            this.f5000b = null;
            this.f5001c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f4999a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f5000b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f5001c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f5003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f5004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f5005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f5006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5008f;

        public q(Rect rect, Rect rect2, View view2) {
            super(rect, view2);
            int scaledTouchSlop = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
            this.f5007e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f5004b = rect3;
            Rect rect4 = new Rect();
            this.f5006d = rect4;
            Rect rect5 = new Rect();
            this.f5005c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i14 = -scaledTouchSlop;
            rect4.inset(i14, i14);
            rect5.set(rect2);
            this.f5003a = view2;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z14;
            boolean z15;
            int x14 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z16 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z15 = this.f5008f;
                    if (z15 && !this.f5006d.contains(x14, y14)) {
                        z16 = z15;
                        z14 = false;
                    }
                } else if (action != 3) {
                    z14 = true;
                    z16 = false;
                } else {
                    z15 = this.f5008f;
                    this.f5008f = false;
                }
                z16 = z15;
                z14 = true;
            } else if (this.f5004b.contains(x14, y14)) {
                this.f5008f = true;
                z14 = true;
            } else {
                z14 = true;
                z16 = false;
            }
            if (!z16) {
                return false;
            }
            Rect rect = this.f5005c;
            View view2 = this.f5003a;
            if (!z14 || rect.contains(x14, y14)) {
                motionEvent.setLocation(x14 - rect.left, y14 - rect.top);
            } else {
                motionEvent.setLocation(view2.getWidth() / 2, view2.getHeight() / 2);
            }
            return view2.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        Q0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f4969k = new Rect();
        this.f4971l = new Rect();
        this.f4972m = new int[2];
        this.f4973n = new int[2];
        this.N0 = new b();
        this.O0 = new c();
        this.P0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = h.a.f80442v;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        androidx.core.view.s0.q(this, context, iArr, attributeSet, w0VarG.f5271b, i14, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = w0VarG.f5271b;
        layoutInflaterFrom.inflate(typedArray.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f4959a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4960b = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f4961c = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f4962d = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f4963e = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f4964f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f4965g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f4966h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f4974o = imageView5;
        viewFindViewById.setBackground(w0VarG.b(20));
        viewFindViewById2.setBackground(w0VarG.b(25));
        imageView.setImageDrawable(w0VarG.b(23));
        imageView2.setImageDrawable(w0VarG.b(15));
        imageView3.setImageDrawable(w0VarG.b(12));
        imageView4.setImageDrawable(w0VarG.b(28));
        imageView5.setImageDrawable(w0VarG.b(23));
        this.f4975p = w0VarG.b(22);
        a1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f4976q = typedArray.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f4977r = typedArray.getResourceId(13, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(typedArray.getBoolean(18, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4980w = typedArray.getText(14);
        this.F = typedArray.getText(21);
        int i15 = typedArray.getInt(6, -1);
        if (i15 != -1) {
            setImeOptions(i15);
        }
        int i16 = typedArray.getInt(5, -1);
        if (i16 != -1) {
            setInputType(i16);
        }
        setFocusable(typedArray.getBoolean(1, true));
        w0VarG.h();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4978t = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4979v = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4967i = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        p(this.B);
        m();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f4959a;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent b(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.I0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.M0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.L0.getSearchActivity());
        return intent;
    }

    public final Intent c(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.M0;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.P = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f4959a;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.P = false;
    }

    public final void d() {
        int i14 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f4959a;
        if (i14 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = Q0;
        oVar.getClass();
        o.a();
        Method method = oVar.f4999a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f5000b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f4959a;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.B) {
            l lVar = this.f4982y;
            if (lVar != null) {
                lVar.onClose();
            }
            clearFocus();
            p(true);
        }
    }

    public final void f(int i14) {
        String strK;
        Cursor cursor = this.D.f143203c;
        if (cursor != null && cursor.moveToPosition(i14)) {
            Intent intentB = null;
            try {
                try {
                    int i15 = q0.A;
                    String strK2 = q0.k(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strK2 == null) {
                        strK2 = this.L0.getSuggestIntentAction();
                    }
                    if (strK2 == null) {
                        strK2 = "android.intent.action.SEARCH";
                    }
                    String strK3 = q0.k(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strK3 == null) {
                        strK3 = this.L0.getSuggestIntentData();
                    }
                    if (strK3 != null && (strK = q0.k(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strK3 = strK3 + "/" + Uri.encode(strK);
                    }
                    intentB = b(strK3 == null ? null : Uri.parse(strK3), strK2, q0.k(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), q0.k(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentB != null) {
                try {
                    getContext().startActivity(intentB);
                } catch (RuntimeException unused3) {
                    intentB.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f4959a;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void g(int i14) {
        Editable text = this.f4959a.getText();
        Cursor cursor = this.D.f143203c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i14)) {
            setQuery(text);
            return;
        }
        String strConvertToString = this.D.convertToString(cursor);
        if (strConvertToString != null) {
            setQuery(strConvertToString);
        } else {
            setQuery(text);
        }
    }

    public int getImeOptions() {
        return this.f4959a.getImeOptions();
    }

    public int getInputType() {
        return this.f4959a.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f4959a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.F;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.L0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4980w : getContext().getText(this.L0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4977r;
    }

    public int getSuggestionRowLayout() {
        return this.f4976q;
    }

    public q7.a getSuggestionsAdapter() {
        return this.D;
    }

    public final void h(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void i() {
        SearchAutoComplete searchAutoComplete = this.f4959a;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f4981x;
        if (mVar == null || !mVar.E0(text.toString())) {
            if (this.L0 != null) {
                getContext().startActivity(b(null, "android.intent.action.SEARCH", null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void j(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f4959a;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.I0 = charSequence;
        }
    }

    public final void k() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f4959a.getText());
        int i14 = (!zIsEmpty || (this.B && !this.J0)) ? 0 : 8;
        ImageView imageView = this.f4965g;
        imageView.setVisibility(i14);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void l() {
        int[] iArr = this.f4959a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4961c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4962d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z14 = this.B;
        SearchAutoComplete searchAutoComplete = this.f4959a;
        CharSequence charSequence2 = charSequence;
        if (z14 && (drawable = this.f4975p) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void n() {
        this.f4962d.setVisibility(((this.E || this.f4970k0) && !this.C && (this.f4964f.getVisibility() == 0 || this.f4966h.getVisibility() == 0)) ? 0 : 8);
    }

    public final void o(boolean z14) {
        boolean z15 = this.E;
        this.f4964f.setVisibility((!z15 || !(z15 || this.f4970k0) || this.C || !hasFocus() || (!z14 && this.f4970k0)) ? 8 : 0);
    }

    @Override // m.c
    public final void onActionViewCollapsed() {
        j("");
        clearFocus();
        p(true);
        this.f4959a.setImeOptions(this.K0);
        this.J0 = false;
    }

    @Override // m.c
    public final void onActionViewExpanded() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        SearchAutoComplete searchAutoComplete = this.f4959a;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.K0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.N0);
        post(this.O0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        if (z14) {
            SearchAutoComplete searchAutoComplete = this.f4959a;
            int[] iArr = this.f4972m;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f4973n;
            getLocationInWindow(iArr2);
            int i18 = iArr[1] - iArr2[1];
            int i19 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i19;
            int height = searchAutoComplete.getHeight() + i18;
            Rect rect = this.f4969k;
            rect.set(i19, i18, width, height);
            int i24 = rect.left;
            int i25 = rect.right;
            int i26 = i17 - i15;
            Rect rect2 = this.f4971l;
            rect2.set(i24, 0, i25, i26);
            q qVar = this.f4968j;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.f4968j = qVar2;
                setTouchDelegate(qVar2);
            } else {
                qVar.f5004b.set(rect2);
                Rect rect3 = qVar.f5006d;
                rect3.set(rect2);
                int i27 = -qVar.f5007e;
                rect3.inset(i27, i27);
                qVar.f5005c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i14, int i15) {
        int i16;
        if (this.C) {
            super.onMeasure(i14, i15);
            return;
        }
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode == Integer.MIN_VALUE) {
            int i17 = this.T;
            size = i17 > 0 ? Math.min(i17, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i16 = this.T) > 0) {
            size = Math.min(i16, size);
        }
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        p(pVar.f5002a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f5002a = this.C;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z14) {
        super.onWindowFocusChanged(z14);
        post(this.N0);
    }

    public final void p(boolean z14) {
        this.C = z14;
        int i14 = 8;
        int i15 = z14 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f4959a.getText());
        this.f4963e.setVisibility(i15);
        o(!zIsEmpty);
        this.f4960b.setVisibility(z14 ? 8 : 0);
        ImageView imageView = this.f4974o;
        imageView.setVisibility((imageView.getDrawable() == null || this.B) ? 8 : 0);
        k();
        if (this.f4970k0 && !this.C && zIsEmpty) {
            this.f4964f.setVisibility(8);
            i14 = 0;
        }
        this.f4966h.setVisibility(i14);
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i14, Rect rect) {
        if (this.P || !isFocusable()) {
            return false;
        }
        if (this.C) {
            return super.requestFocus(i14, rect);
        }
        boolean zRequestFocus = this.f4959a.requestFocus(i14, rect);
        if (zRequestFocus) {
            p(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.M0 = bundle;
    }

    public void setIconified(boolean z14) {
        if (z14) {
            e();
            return;
        }
        p(false);
        SearchAutoComplete searchAutoComplete = this.f4959a;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z14) {
        if (this.B == z14) {
            return;
        }
        this.B = z14;
        p(z14);
        m();
    }

    public void setImeOptions(int i14) {
        this.f4959a.setImeOptions(i14);
    }

    public void setInputType(int i14) {
        this.f4959a.setInputType(i14);
    }

    public void setMaxWidth(int i14) {
        this.T = i14;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f4982y = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4983z = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f4981x = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.F = charSequence;
        m();
    }

    public void setQueryRefinementEnabled(boolean z14) {
        this.I = z14;
        q7.a aVar = this.D;
        if (aVar instanceof q0) {
            ((q0) aVar).f5218q = z14 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z14;
        this.L0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f4959a;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.L0.getImeOptions());
            int inputType = this.L0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.L0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            q7.a aVar = this.D;
            if (aVar != null) {
                aVar.a(null);
            }
            if (this.L0.getSuggestAuthority() != null) {
                q0 q0Var = new q0(getContext(), this, this.L0, this.P0);
                this.D = q0Var;
                searchAutoComplete.setAdapter(q0Var);
                ((q0) this.D).f5218q = this.I ? 2 : 1;
            }
            m();
        }
        SearchableInfo searchableInfo2 = this.L0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.L0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4978t;
            } else if (this.L0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4979v;
            }
            z14 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f4970k0 = z14;
        if (z14) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        p(this.C);
    }

    public void setSubmitButtonEnabled(boolean z14) {
        this.E = z14;
        p(this.C);
    }

    public void setSuggestionsAdapter(q7.a aVar) {
        this.D = aVar;
        this.f4959a.setAdapter(aVar);
    }

    public static class p extends s7.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5002a;

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5002a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SearchView.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" isIconified=");
            return hb.a.k(sb3, this.f5002a, StringSubstitutor.DEFAULT_VAR_END);
        }

        @Override // s7.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeValue(Boolean.valueOf(this.f5002a));
        }

        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new p[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SearchView f4985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f4987d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f4986c) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f4986c = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i14) {
            super(context, attributeSet, i14);
            this.f4987d = new a();
            this.f4984a = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i14 = configuration.screenWidthDp;
            int i15 = configuration.screenHeightDp;
            if (i14 >= 960 && i15 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i14 >= 600) {
                return 192;
            }
            if (i14 < 640 || i15 < 480) {
                return SyslogConstants.LOG_LOCAL4;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.Q0;
            oVar.getClass();
            o.a();
            Method method = oVar.f5001c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f4984a <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4986c) {
                a aVar = this.f4987d;
                removeCallbacks(aVar);
                post(aVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z14, int i14, Rect rect) {
            super.onFocusChanged(z14, i14, rect);
            SearchView searchView = this.f4985b;
            searchView.p(searchView.C);
            searchView.post(searchView.N0);
            if (searchView.f4959a.hasFocus()) {
                searchView.d();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i14, KeyEvent keyEvent) {
            if (i14 == 4) {
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
                        this.f4985b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i14, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z14) {
            super.onWindowFocusChanged(z14);
            if (z14 && this.f4985b.hasFocus() && getVisibility() == 0) {
                this.f4986c = true;
                Context context = getContext();
                o oVar = SearchView.Q0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z14) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f4987d;
            if (!z14) {
                this.f4986c = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4986c = true;
                    return;
                }
                this.f4986c = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4985b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i14) {
            super.setThreshold(i14);
            this.f4984a = i14;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
