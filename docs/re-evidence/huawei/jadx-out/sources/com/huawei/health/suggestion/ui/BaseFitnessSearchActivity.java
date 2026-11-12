package com.huawei.health.suggestion.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.common.SearchShowMode;
import com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper;
import com.huawei.health.suggestion.ui.fragment.FitSearchFragmentFlowLayout;
import com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView;
import com.huawei.health.suggestion.ui.fragment.FitnessActionSearchFragmentRecycleView;
import com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar;
import com.huawei.health.suggestion.ui.view.FlowLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.idy;
import defpackage.ifs;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class BaseFitnessSearchActivity extends BaseStateActivity implements SearchViewInterface {
    private static final String TAG = "Suggestion_BaseFitnessSearchActivity";
    protected int mCurrentWorkoutType;
    protected FitnessSearchAllHelper mFitSearchAllHelper;
    protected FitnessActionSearchFragmentRecycleView mFitnessActionSearchRecycleView;
    private FitSearchFragmentFlowLayout mFitnessSearchFlowLayout;
    private FitSearchFragmentRecyclerView mFitnessSearchRecyclerView;
    private FragmentManager mFragmentManager;
    private View mNormalModeContentLayout;
    private View mSearchContentLayout;
    private FitnessSearchFragmentBar mSearchFragmentBar;
    private View mSearchLoadingView;
    private View mSearchNoShow;
    private e mSearchOnClick;
    public SearchShowMode mShowModeStatus = SearchShowMode.NORMAL;
    protected String mCurrentPageSportType = "";

    protected abstract void initNormalModeLayout();

    protected abstract void initNormalViewController();

    protected abstract void initTitleBarSearchController();

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        initSearchLayout();
        initNormalModeLayout();
    }

    private void initSearchLayout() {
        this.mSearchContentLayout = findViewById(R.id.search_content_layout);
        FragmentManager fragmentManager = getFragmentManager();
        this.mFragmentManager = fragmentManager;
        if (fragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentBar) instanceof FitnessSearchFragmentBar) {
            this.mSearchFragmentBar = (FitnessSearchFragmentBar) this.mFragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentBar);
        }
        if (this.mFragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentFlowLayout) instanceof FitSearchFragmentFlowLayout) {
            this.mFitnessSearchFlowLayout = (FitSearchFragmentFlowLayout) this.mFragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentFlowLayout);
        }
        if (this.mFragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentRecyclerView) instanceof FitSearchFragmentRecyclerView) {
            this.mFitnessSearchRecyclerView = (FitSearchFragmentRecyclerView) this.mFragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentRecyclerView);
        }
        Fragment fragmentFindFragmentById = this.mFragmentManager.findFragmentById(R.id.fragment_FitnessActionSearchFragmentFlowLayout);
        if (fragmentFindFragmentById instanceof FitnessActionSearchFragmentRecycleView) {
            this.mFitnessActionSearchRecycleView = (FitnessActionSearchFragmentRecycleView) fragmentFindFragmentById;
        }
        this.mSearchNoShow = findViewById(R.id.search_no_show);
        View viewFindViewById = findViewById(R.id.sug_search_loading);
        this.mSearchLoadingView = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.mNormalModeContentLayout = findViewById(R.id.normal_content_layout);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        initTitleBarSearchController();
        initSearchViewController();
        initNormalViewController();
    }

    public void initSearchViewController() {
        FitnessSearchFragmentBar fitnessSearchFragmentBar = this.mSearchFragmentBar;
        if (fitnessSearchFragmentBar == null) {
            LogUtil.j(TAG, "mSearchFragmentBar == null");
            return;
        }
        fitnessSearchFragmentBar.b(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.BaseFitnessSearchActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseFitnessSearchActivity.this.handleSearchBarClick();
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = this.mFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.hide(this.mSearchFragmentBar);
        fragmentTransactionBeginTransaction.commit();
        e eVar = new e(this);
        this.mSearchOnClick = eVar;
        this.mSearchFragmentBar.b(eVar);
        FitSearchFragmentRecyclerView fitSearchFragmentRecyclerView = this.mFitnessSearchRecyclerView;
        if (fitSearchFragmentRecyclerView != null) {
            fitSearchFragmentRecyclerView.b(this.mSearchOnClick);
        } else {
            this.mFitnessActionSearchRecycleView.d(this.mSearchOnClick);
            this.mSearchFragmentBar.b(getResources().getString(R.string.IDS_FitnessAdvice_detail_action));
        }
        this.mFitnessSearchFlowLayout.a(this.mSearchOnClick);
        if (this.mCurrentWorkoutType == 3) {
            this.mFitSearchAllHelper = new FitnessSearchAllHelper(this, 3);
        } else {
            this.mFitSearchAllHelper = new FitnessSearchAllHelper(this, 2);
        }
        this.mFitSearchAllHelper.b(this.mCurrentPageSportType);
        setOnQueryTextListener(this.mFitSearchAllHelper);
        setOnQueryTextListener(this.mFitSearchAllHelper);
        setLoadMoreListener(this.mFitSearchAllHelper);
        createFlowAdapter();
    }

    private void createFlowAdapter() {
        if (this.mFitnessSearchRecyclerView != null) {
            setFlowAdapter(new FitnessSearchAllHelper.SearchAllFowAdapter(getApplicationContext()));
        } else if (this.mCurrentWorkoutType == 3) {
            setFlowAdapter(new FitnessSearchAllHelper.SearchAllFowAdapter(getApplicationContext(), 3));
        } else {
            setFlowAdapter(new FitnessSearchAllHelper.SearchAllFowAdapter(getApplicationContext(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSearchBarClick() {
        if (SearchShowMode.SEARCH.equals(this.mShowModeStatus)) {
            Object systemService = this.mSearchFragmentBar.getActivity().getApplicationContext().getSystemService("input_method");
            if (systemService instanceof InputMethodManager) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(this.mSearchFragmentBar.getActivity().getWindow().getDecorView().getWindowToken(), 0);
            }
            switchToNormalMode();
        }
    }

    public void switchToSearchMode() {
        this.mShowModeStatus = SearchShowMode.SEARCH;
        if (!isCheckLayoutValid()) {
            LogUtil.j(TAG, "layout view is invalid to switch to search mode.");
        }
        this.mTitleBar.setVisibility(4);
        FragmentTransaction fragmentTransactionBeginTransaction = this.mFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setCustomAnimations(R.animator.search_show, R.animator.search_gone);
        fragmentTransactionBeginTransaction.show(this.mSearchFragmentBar);
        fragmentTransactionBeginTransaction.commit();
        this.mNormalModeContentLayout.startAnimation(ifs.g());
        this.mNormalModeContentLayout.setVisibility(4);
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.BaseFitnessSearchActivity.3
            @Override // java.lang.Runnable
            public void run() {
                BaseFitnessSearchActivity.this.mSearchContentLayout.startAnimation(ifs.b());
                BaseFitnessSearchActivity.this.mSearchContentLayout.setVisibility(0);
                Object systemService = BaseFitnessSearchActivity.this.getApplicationContext().getSystemService("input_method");
                if (systemService instanceof InputMethodManager) {
                    ((InputMethodManager) systemService).toggleSoftInput(0, 2);
                }
                BaseFitnessSearchActivity.this.mSearchFragmentBar.d();
            }
        }, 50L);
    }

    protected void switchToNormalMode() {
        this.mShowModeStatus = SearchShowMode.NORMAL;
        if (!isCheckLayoutValid()) {
            LogUtil.j(TAG, "layout view is invalid to switch to normal mode.");
        }
        this.mTitleBar.setVisibility(0);
        FragmentTransaction fragmentTransactionBeginTransaction = this.mFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setCustomAnimations(ifs.c(), ifs.e());
        fragmentTransactionBeginTransaction.hide(this.mSearchFragmentBar);
        fragmentTransactionBeginTransaction.commit();
        this.mSearchContentLayout.setAnimation(ifs.d());
        this.mSearchContentLayout.setVisibility(4);
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.BaseFitnessSearchActivity.5
            @Override // java.lang.Runnable
            public void run() {
                BaseFitnessSearchActivity.this.mNormalModeContentLayout.setAnimation(ifs.a());
                BaseFitnessSearchActivity.this.mNormalModeContentLayout.setVisibility(0);
            }
        }, 50L);
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
    public void showSearchKey() {
        clear();
        FitSearchFragmentFlowLayout fitSearchFragmentFlowLayout = this.mFitnessSearchFlowLayout;
        fitSearchFragmentFlowLayout.b(fitSearchFragmentFlowLayout);
        this.mSearchNoShow.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void clear() {
        FitSearchFragmentRecyclerView fitSearchFragmentRecyclerView = this.mFitnessSearchRecyclerView;
        if (fitSearchFragmentRecyclerView != null) {
            fitSearchFragmentRecyclerView.d();
        } else {
            this.mFitnessActionSearchRecycleView.e();
        }
    }

    static class e implements FitSearchFragmentRecyclerView.LoadMoreListener, FlowLayout.OnTextClickListener, FitnessSearchFragmentBar.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FitSearchFragmentRecyclerView.LoadMoreListener f8963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FitnessSearchFragmentBar.OnQueryTextListener f8964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BaseFitnessSearchActivity f8965c;

        e(BaseFitnessSearchActivity baseFitnessSearchActivity) {
            this.f8965c = baseFitnessSearchActivity;
        }

        public void a(FitnessSearchFragmentBar.OnQueryTextListener onQueryTextListener) {
            this.f8964b = onQueryTextListener;
        }

        public void c(FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener) {
            this.f8963a = loadMoreListener;
        }

        @Override // com.huawei.health.suggestion.ui.view.FlowLayout.OnTextClickListener
        public void onClick(String str) {
            LogUtil.a(BaseFitnessSearchActivity.TAG, "onClick text=", str);
            this.f8965c.mSearchFragmentBar.c(str);
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            this.f8965c.mFitnessSearchFlowLayout.e(str);
            if (this.f8964b == null) {
                return false;
            }
            this.f8965c.showLoadView();
            this.f8965c.dismissSearchNoShowView();
            this.f8964b.onQueryTextSubmit(str);
            BaseFitnessSearchActivity baseFitnessSearchActivity = this.f8965c;
            if (baseFitnessSearchActivity == null || baseFitnessSearchActivity.mFitSearchAllHelper == null) {
                return false;
            }
            this.f8965c.mFitSearchAllHelper.b(this.f8965c.mCurrentPageSportType);
            return false;
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f8965c.showSearchKey();
            }
            if (this.f8964b == null) {
                return false;
            }
            idy.c("1130036");
            this.f8964b.onQueryTextChange(str);
            return false;
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView.LoadMoreListener
        public void loadMore() {
            FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener = this.f8963a;
            if (loadMoreListener != null) {
                loadMoreListener.loadMore();
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void hideLoadMore() {
        FitSearchFragmentRecyclerView fitSearchFragmentRecyclerView = this.mFitnessSearchRecyclerView;
        if (fitSearchFragmentRecyclerView != null) {
            fitSearchFragmentRecyclerView.c();
        } else {
            this.mFitnessActionSearchRecycleView.d();
        }
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void showLoadMore() {
        FitSearchFragmentRecyclerView fitSearchFragmentRecyclerView = this.mFitnessSearchRecyclerView;
        if (fitSearchFragmentRecyclerView != null) {
            fitSearchFragmentRecyclerView.a();
        } else {
            this.mFitnessActionSearchRecycleView.a();
        }
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void showSearchNoShow() {
        View view = this.mSearchNoShow;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void setOnQueryTextListener(FitnessSearchFragmentBar.OnQueryTextListener onQueryTextListener) {
        this.mSearchOnClick.a(onQueryTextListener);
    }

    public void setLoadMoreListener(FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener) {
        this.mSearchOnClick.c(loadMoreListener);
    }

    public void setFlowAdapter(FitSearchFragmentFlowLayout.FowAdapter fowAdapter) {
        this.mFitnessSearchFlowLayout.c(fowAdapter);
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
    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void addData(List<FitWorkout> list) {
        if (njy.b(list)) {
            FitSearchFragmentFlowLayout fitSearchFragmentFlowLayout = this.mFitnessSearchFlowLayout;
            fitSearchFragmentFlowLayout.c(fitSearchFragmentFlowLayout);
            this.mSearchNoShow.setVisibility(8);
        } else if (this.mFitnessSearchRecyclerView.b() == 0) {
            this.mSearchNoShow.setVisibility(0);
        }
        this.mFitnessSearchRecyclerView.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLoadView() {
        View view = this.mSearchLoadingView;
        if (view == null || view.getVisibility() != 8) {
            return;
        }
        this.mSearchLoadingView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSearchNoShowView() {
        View view = this.mSearchNoShow;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.mSearchNoShow.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void hideLoadView() {
        View view = this.mSearchLoadingView;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.mSearchLoadingView.setVisibility(8);
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
    public void resetData(List<AtomicAction> list) {
        hideLoadView();
        if (this.mFitnessActionSearchRecycleView == null) {
            LogUtil.j(TAG, "setData mFitnessActionSearchRecycleView can not null");
            return;
        }
        if (this.mFitnessSearchFlowLayout != null && njy.b(list)) {
            FitSearchFragmentFlowLayout fitSearchFragmentFlowLayout = this.mFitnessSearchFlowLayout;
            fitSearchFragmentFlowLayout.c(fitSearchFragmentFlowLayout);
            this.mSearchNoShow.setVisibility(8);
        } else if (this.mFitnessActionSearchRecycleView.b() == 0) {
            this.mSearchNoShow.setVisibility(0);
        }
        this.mFitnessActionSearchRecycleView.c(list);
    }

    public void updateViewState() {
        this.mSearchNoShow.setVisibility(8);
        FitnessActionSearchFragmentRecycleView fitnessActionSearchFragmentRecycleView = this.mFitnessActionSearchRecycleView;
        if (fitnessActionSearchFragmentRecycleView == null) {
            LogUtil.j(TAG, "updateViewState mFitnessActionSearchRecycleView can not null");
        } else {
            fitnessActionSearchFragmentRecycleView.c((List<AtomicAction>) null);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (SearchShowMode.SEARCH.equals(this.mShowModeStatus)) {
            switchToNormalMode();
        } else {
            super.onBackPressed();
        }
    }

    private boolean isCheckLayoutValid() {
        return (this.mSearchFragmentBar == null || (this.mNormalModeContentLayout == null || this.mSearchContentLayout == null)) ? false : true;
    }
}
