package com.huawei.ui.homehealth.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.adapter.SearchSuggestAdapter;
import com.huawei.ui.homehealth.search.template.SearchResultConfig;
import com.huawei.ui.homehealth.search.template.SearchSubTabConfig;
import defpackage.ezi;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.lls;
import defpackage.lrd;
import defpackage.njy;
import defpackage.nlu;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.tan;
import defpackage.tat;
import defpackage.wpf;
import health.compact.a.IoUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class GlobalSearchActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InputBoxTemplate f25990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25991b = new Object();
    private static String d;
    private static int e;
    private Context g;
    private KnitFragment h;
    private wpf<tan> k;
    private SearchResultFragment l;
    private String m;
    private View n;
    private String o;
    private SearchSubTabConfig p;
    private SearchSuggestAdapter q;
    private HealthSearchView r;
    private SearchResultConfig s;
    private HealthRecycleView t;
    private String v;
    private View y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25992c = false;
    private boolean j = true;
    private boolean i = true;
    private boolean f = true;

    public static /* synthetic */ void d(int i, Object obj) {
    }

    public static String a() {
        InputBoxTemplate inputBoxTemplate = f25990a;
        if (inputBoxTemplate == null) {
            LogUtil.d("GlobalSearchActivity", "getLessonSubCategory mInputBoxTemplate is null");
            return "";
        }
        return inputBoxTemplate.getLessonSubCategory();
    }

    public static String b() {
        String str;
        synchronized (f25991b) {
            str = d;
        }
        return str;
    }

    public static void e(String str) {
        synchronized (f25991b) {
            d = str;
        }
    }

    private void d(boolean z) {
        if (z) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            List<Fragment> fragments = supportFragmentManager.getFragments();
            if (njy.e(fragments)) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Iterator<Fragment> it = fragments.iterator();
            while (it.hasNext()) {
                fragmentTransactionBeginTransaction.remove(it.next());
            }
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        CharSequence query = this.r.getQuery();
        if (!this.i && (str = d) != null && query != null && str.contentEquals(query)) {
            bundle.putString("lastSearchedQueryText", d);
        }
        bundle.putString("lastInputQueryText", query != null ? query.toString() : null);
        super.onSaveInstanceState(bundle);
    }

    private void c(Bundle bundle) {
        if (bundle != null) {
            this.o = bundle.getString("lastSearchedQueryText", null);
            this.m = bundle.getString("lastInputQueryText", null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        qrs.c(this, bundle);
        super.onCreate(bundle);
        LogUtil.a("GlobalSearchActivity", "onCreate");
        d(bundle != null);
        this.g = this;
        setContentView(R.layout.activity_global_search);
        p();
        gvi.d(BaseApplication.b());
        c(bundle);
    }

    private void p() {
        qrs.j(this, R.color.colorSubBackground);
        this.y = findViewById(R.id.statusbar_panel);
        r();
        k();
        l();
        q();
        i();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        LogUtil.a("GlobalSearchActivity", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        r();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c();
    }

    private void r() {
        RelativeLayout.LayoutParams layoutParamsU = qrs.u(this.g);
        View view = this.y;
        if (view == null || layoutParamsU == null) {
            return;
        }
        view.setLayoutParams(layoutParamsU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.n == null) {
            this.n = findViewById(R.id.superui_fragment_container);
        }
        lrd.c(this.n, i);
    }

    private void y() {
        KnitFragment knitFragment = this.h;
        if (knitFragment == null) {
            return;
        }
        d(this.l, knitFragment);
        this.i = true;
        LogUtil.a("GlobalSearchActivity", "switched to default page");
        d(1);
    }

    private void w() {
        SearchResultFragment searchResultFragment = this.l;
        if (searchResultFragment == null || this.h == null) {
            ReleaseLogUtil.d("GlobalSearchActivity", "switchToDefaultPage mResultFragment or mDefaultFragment is null");
            return;
        }
        if (!this.i) {
            searchResultFragment.b();
            return;
        }
        searchResultFragment.b();
        d(this.h, this.l);
        this.i = false;
        LogUtil.a("GlobalSearchActivity", "switched to result page");
        d(1);
    }

    private void i() {
        if (this.h == null) {
            return;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.superui_fragment_container, this.h).commit();
    }

    private void d(Fragment fragment, Fragment fragment2) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (!fragment2.isAdded()) {
            fragmentTransactionBeginTransaction.hide(fragment).add(R.id.superui_fragment_container, fragment2).commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.hide(fragment).show(fragment2).commitAllowingStateLoss();
        }
    }

    private void l() {
        this.r = (HealthSearchView) findViewById(R.id.global_search_view);
        if (qrs.ac()) {
            this.r.getLayoutParams().width = -2;
        }
        this.r.requestFocus();
        t();
        g();
        n();
        ezi.d(this.r, new TextView.OnEditorActionListener() { // from class: com.huawei.ui.homehealth.search.GlobalSearchActivity.3
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                CharSequence query = GlobalSearchActivity.this.r.getQuery();
                if (TextUtils.isEmpty(query)) {
                    GlobalSearchActivity.this.f();
                    return true;
                }
                gvi.a(BaseApplication.b(), query.toString());
                GlobalSearchActivity.this.b(query.toString());
                return true;
            }
        });
        this.r.setOnQueryTextListener(new c(this));
    }

    private void g() {
        ((ImageView) findViewById(R.id.global_search_back)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.search.GlobalSearchActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GlobalSearchActivity.this.h();
            }
        });
    }

    private void n() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.global_search_button);
        if (qrs.v()) {
            healthTextView.setTextSize(1, 28.0f);
        }
        qsp.b(healthTextView, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.search.GlobalSearchActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TextUtils.isEmpty(GlobalSearchActivity.this.r.getQuery())) {
                    gvi.a(BaseApplication.b(), GlobalSearchActivity.this.r.getQuery().toString());
                    GlobalSearchActivity globalSearchActivity = GlobalSearchActivity.this;
                    globalSearchActivity.b(globalSearchActivity.r.getQuery().toString());
                } else {
                    LogUtil.a("GlobalSearchActivity", "queryText is empty");
                    GlobalSearchActivity.this.f();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        InputBoxTemplate inputBoxTemplate = f25990a;
        if (inputBoxTemplate == null) {
            LogUtil.d("GlobalSearchActivity", "doDefaultSearch inputBoxTemplate is null");
            return;
        }
        int i = e;
        if (i == 4085 || i == 4036) {
            gvi.a(1, i, inputBoxTemplate);
        }
        String linkType = f25990a.getLinkType() != null ? f25990a.getLinkType() : "search";
        linkType.hashCode();
        if (!linkType.equals("normal")) {
            if (linkType.equals("search")) {
                gvi.b(BaseApplication.b(), f25990a);
                b(f25990a.getTheme());
                return;
            }
            return;
        }
        if (!LoginInit.getInstance(BaseApplication.b()).getIsLogined()) {
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: szx
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    GlobalSearchActivity.d(i2, obj);
                }
            }, "");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            gvi.b(BaseApplication.b(), f25990a);
            marketRouterApi.router(f25990a.getLinkValue());
        }
    }

    private void t() {
        ezi.c((Handler) null, 0);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        f25990a = (InputBoxTemplate) intent.getParcelableExtra("BUNDLE_KEY_INPUT_BOX");
        e = intent.getIntExtra("BUNDLE_INPUT_BOX_POSITION_ID", 0);
        InputBoxTemplate inputBoxTemplate = f25990a;
        if (inputBoxTemplate != null) {
            this.r.setQueryHint(inputBoxTemplate.getTheme());
            gvi.c(BaseApplication.b(), f25990a);
        }
    }

    private void k() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.search_suggest_recycler_view);
        this.t = healthRecycleView;
        healthRecycleView.b(false);
        this.t.setLayoutManager(new HealthLinearLayoutManager(this.g));
        SearchSuggestAdapter searchSuggestAdapter = new SearchSuggestAdapter(this.g, new ArrayList());
        this.q = searchSuggestAdapter;
        this.t.setAdapter(searchSuggestAdapter);
    }

    public void b(String str) {
        LogUtil.a("GlobalSearchActivity", "search text: ", str);
        c();
        j();
        if (TextUtils.isEmpty(str) || !str.equals(this.r.getQuery().toString())) {
            this.j = false;
            this.r.setQuery(str, false);
        }
        if (TextUtils.isEmpty(a(str))) {
            ReleaseLogUtil.d("GlobalSearchActivity", "doSearch validQuery is null");
            return;
        }
        e(str);
        tat.b(BaseApplication.b(), str);
        e();
        w();
    }

    private void q() {
        s();
        m();
        o();
    }

    private void s() {
        a(this.g, "GlobalSearchPageConstructor.json");
        wpf<tan> wpfVar = this.k;
        if (wpfVar == null) {
            return;
        }
        tan tanVar = (tan) wpfVar.b();
        this.p = tanVar.b();
        this.s = tanVar.c();
    }

    private void a(Context context, String str) {
        InputStream inputStreamOpen = null;
        AssetManager assets = context != null ? context.getAssets() : null;
        try {
            if (assets == null) {
                return;
            }
            inputStreamOpen = assets.open(str);
            this.k = (wpf) lls.e(inputStreamOpen, new TypeToken<wpf<tan>>() { // from class: com.huawei.ui.homehealth.search.GlobalSearchActivity.4
            });
        } catch (IOException e2) {
            LogUtil.c("GlobalSearchActivity", "search template assets load failed: ", LogAnonymous.b(e2));
        } finally {
            IoUtils.c(inputStreamOpen);
        }
    }

    private void m() {
        SearchSubTabConfig searchSubTabConfig = this.p;
        if (searchSubTabConfig == null) {
            return;
        }
        KnitFragment knitFragmentNewInstance = KnitFragment.newInstance(nlu.a(searchSubTabConfig), new BasePageResTrigger(this, 0, null));
        this.h = knitFragmentNewInstance;
        knitFragmentNewInstance.setIsAllowResumeRefresh(false);
    }

    private void o() {
        if (this.s == null) {
            return;
        }
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SEARCH_RESULT_CONFIG", this.s);
        searchResultFragment.setArguments(bundle);
        this.l = searchResultFragment;
    }

    public void e() {
        KnitFragment knitFragment = this.h;
        if (knitFragment != null) {
            knitFragment.refreshAllSections();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        HealthRecycleView healthRecycleView = this.t;
        if (healthRecycleView != null && this.f25992c && healthRecycleView.getVisibility() == 8) {
            this.t.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f25992c = false;
        HealthRecycleView healthRecycleView = this.t;
        if (healthRecycleView == null || healthRecycleView.getVisibility() != 0) {
            return;
        }
        this.t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        HealthRecycleView healthRecycleView = this.t;
        if (healthRecycleView != null && healthRecycleView.getVisibility() == 0) {
            j();
        } else if (!this.i) {
            y();
        } else {
            super.onBackPressed();
        }
    }

    public SearchResultFragment d() {
        return this.l;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        h();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f) {
            c();
        } else {
            this.f = false;
        }
        String str = this.o;
        if (str != null) {
            b(str);
            this.o = null;
        }
        this.m = null;
    }

    private void c() {
        HealthSearchView healthSearchView = this.r;
        if (healthSearchView == null || healthSearchView.getParent() == null) {
            return;
        }
        LogUtil.a("GlobalSearchActivity", "clearSearchViewFocus ");
        try {
            this.r.clearFocus();
        } catch (IllegalArgumentException e2) {
            LogUtil.c("GlobalSearchActivity", "clearSearchViewFocus exception", LogAnonymous.b(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split("[^\\w\\-+\\u4e00-\\u9fa5]+");
        if (strArrSplit.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(str2 + " ");
        }
        return sb.toString().trim();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.h = null;
        this.l = null;
    }

    static class e extends UiCallback<List<String>> {
        private final WeakReference<GlobalSearchActivity> d;

        e(GlobalSearchActivity globalSearchActivity) {
            this.d = new WeakReference<>(globalSearchActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.d("GlobalSearchActivity", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<String> list) {
            final GlobalSearchActivity globalSearchActivity = this.d.get();
            if (globalSearchActivity == null || globalSearchActivity.isFinishing()) {
                ReleaseLogUtil.d("GlobalSearchActivity", "SearchSuggestUiCallback onSuccess mWeakReference is null");
                return;
            }
            LogUtil.a("GlobalSearchActivity", "search suggest request result: ", list);
            if (globalSearchActivity.f25992c && TextUtils.equals(globalSearchActivity.v, globalSearchActivity.r.getQuery())) {
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.search.GlobalSearchActivity.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        globalSearchActivity.q.b(globalSearchActivity.v);
                        globalSearchActivity.q.c(list);
                        if (globalSearchActivity.f25992c && !njy.e(list)) {
                            gvi.c(BaseApplication.b(), list.size());
                        }
                        globalSearchActivity.v();
                        globalSearchActivity.d(4);
                    }
                });
            }
        }
    }

    static class c implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<GlobalSearchActivity> f25995b;

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return false;
        }

        c(GlobalSearchActivity globalSearchActivity) {
            this.f25995b = new WeakReference<>(globalSearchActivity);
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            GlobalSearchActivity globalSearchActivity = this.f25995b.get();
            ReleaseLogUtil.c("GlobalSearchActivity", "onQueryTextChange newText=", str);
            if (globalSearchActivity != null && !globalSearchActivity.isFinishing()) {
                if (str != null && str.equals(globalSearchActivity.m)) {
                    return false;
                }
                if (!globalSearchActivity.j) {
                    globalSearchActivity.j = true;
                    return false;
                }
                String strA = GlobalSearchActivity.a(str);
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strA)) {
                    globalSearchActivity.q.d();
                    globalSearchActivity.j();
                    return false;
                }
                if (strA.equals(globalSearchActivity.v)) {
                    return false;
                }
                globalSearchActivity.v = strA;
                gvi.b(BaseApplication.b(), globalSearchActivity.v);
                globalSearchActivity.f25992c = true;
                fyb.a(globalSearchActivity.v, new e(globalSearchActivity));
                return true;
            }
            ReleaseLogUtil.d("GlobalSearchActivity", "GlobalSearchQueryListener onQueryTextChange GlobalSearchActivity is null");
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            a(motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e2) {
            ReleaseLogUtil.d("R_GlobalSearchActivity", "dispatchTouchEvent ArrayIndexOutOfBoundsException", ExceptionUtils.c(e2));
            return true;
        }
    }

    private void a(MotionEvent motionEvent) {
        InputMethodManager inputMethodManager;
        int[] iArr = new int[2];
        HealthSearchView healthSearchView = this.r;
        if (healthSearchView != null) {
            healthSearchView.getLocationOnScreen(iArr);
            if (motionEvent.getY() <= iArr[1] + this.r.getHeight() || (inputMethodManager = (InputMethodManager) BaseApplication.b().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(this.r.getWindowToken(), 0);
        }
    }
}
