package com.huawei.health.suggestion.ui;

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
import com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar;
import com.huawei.health.suggestion.ui.view.FlowLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.ibn;
import defpackage.idy;
import defpackage.ifs;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public abstract class BaseRunSearchActivity extends BaseStateActivity implements SearchViewInterface {
    private static final String TAG = "Suggestion_BaseRunSearchActivity";
    protected int mCurrentWorkoutType;
    private FitnessSearchAllHelper mFitSearchAllHelper;
    private FitSearchFragmentFlowLayout mFitnessSearchFlowLayout;
    private FragmentManager mFragmentManager;
    private View mNormalModeContentLayout;
    private View mSearchContentLayout;
    private FitnessSearchFragmentBar mSearchFragmentBar;
    private View mSearchNoShow;
    private c mSearchOnClick;
    private FitSearchFragmentRecyclerView mSearchRunCourseFragment;
    protected SearchShowMode mShowModeStatus = SearchShowMode.NORMAL;

    protected abstract void initNormalViewController();

    protected abstract void initTitleBarSearchController();

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        initSearchLayout();
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
            this.mSearchRunCourseFragment = (FitSearchFragmentRecyclerView) this.mFragmentManager.findFragmentById(R.id.fragment_FitSearchFragmentRecyclerView);
        }
        this.mSearchNoShow = findViewById(R.id.search_no_show);
        this.mNormalModeContentLayout = findViewById(R.id.normal_content_layout);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        initTitleBarSearchController();
        initSearchViewController();
        initNormalViewController();
    }

    protected void initSearchViewController() {
        FitnessSearchFragmentBar fitnessSearchFragmentBar = this.mSearchFragmentBar;
        if (fitnessSearchFragmentBar == null) {
            return;
        }
        fitnessSearchFragmentBar.b(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.BaseRunSearchActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchShowMode.SEARCH.equals(BaseRunSearchActivity.this.mShowModeStatus)) {
                    Object systemService = BaseRunSearchActivity.this.mSearchFragmentBar.getActivity().getApplicationContext().getSystemService("input_method");
                    if (systemService instanceof InputMethodManager) {
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(BaseRunSearchActivity.this.mSearchFragmentBar.getActivity().getWindow().getDecorView().getWindowToken(), 0);
                    }
                    BaseRunSearchActivity.this.switchToNormalMode();
                }
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = this.mFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.hide(this.mSearchFragmentBar);
        fragmentTransactionBeginTransaction.commit();
        c cVar = new c(this);
        this.mSearchOnClick = cVar;
        this.mSearchFragmentBar.b(cVar);
        this.mFitnessSearchFlowLayout.a(this.mSearchOnClick);
        this.mSearchRunCourseFragment.b(this.mSearchOnClick);
        if (this.mCurrentWorkoutType == 3) {
            this.mFitSearchAllHelper = new FitnessSearchAllHelper(this, 3);
        } else {
            this.mFitSearchAllHelper = new FitnessSearchAllHelper(this, 1);
        }
        setOnQueryTextListener(this.mFitSearchAllHelper);
        setRunLoadMoreListener(this.mFitSearchAllHelper);
        if (this.mCurrentWorkoutType == 3) {
            setFlowAdapter(new FitnessSearchAllHelper.SearchAllFowAdapter(getApplicationContext(), 3));
        } else {
            setFlowAdapter(new FitnessSearchAllHelper.SearchAllFowAdapter(getApplicationContext(), 1));
        }
    }

    protected void switchToSearchMode() {
        this.mShowModeStatus = SearchShowMode.SEARCH;
        if (!isCheckLayoutValid()) {
            LogUtil.j(TAG, "layout view is invalid to switch to search mode.");
        }
        FragmentTransaction fragmentTransactionBeginTransaction = this.mFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setCustomAnimations(R.animator.search_show, R.animator.search_gone);
        fragmentTransactionBeginTransaction.show(this.mSearchFragmentBar);
        fragmentTransactionBeginTransaction.commit();
        this.mNormalModeContentLayout.startAnimation(ifs.g());
        this.mNormalModeContentLayout.setVisibility(4);
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.BaseRunSearchActivity.1
            @Override // java.lang.Runnable
            public void run() {
                BaseRunSearchActivity.this.mSearchContentLayout.startAnimation(ifs.b());
                BaseRunSearchActivity.this.mSearchContentLayout.setVisibility(0);
                Object systemService = BaseRunSearchActivity.this.getApplicationContext().getSystemService("input_method");
                if (systemService instanceof InputMethodManager) {
                    ((InputMethodManager) systemService).toggleSoftInput(0, 2);
                }
                BaseRunSearchActivity.this.mSearchFragmentBar.d();
            }
        }, 50L);
    }

    protected void switchToNormalMode() {
        this.mShowModeStatus = SearchShowMode.NORMAL;
        if (!isCheckLayoutValid()) {
            LogUtil.j(TAG, "layout view is invalid to switch to normal mode.");
        }
        FragmentTransaction fragmentTransactionBeginTransaction = this.mFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setCustomAnimations(ifs.c(), ifs.e());
        fragmentTransactionBeginTransaction.hide(this.mSearchFragmentBar);
        fragmentTransactionBeginTransaction.commit();
        this.mSearchContentLayout.setAnimation(ifs.d());
        this.mSearchContentLayout.setVisibility(4);
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.health.suggestion.ui.BaseRunSearchActivity.3
            @Override // java.lang.Runnable
            public void run() {
                BaseRunSearchActivity.this.mNormalModeContentLayout.setAnimation(ifs.a());
                BaseRunSearchActivity.this.mNormalModeContentLayout.setVisibility(0);
            }
        }, 50L);
    }

    public void showSearchKey() {
        clear();
        this.mFitnessSearchFlowLayout.b(this.mSearchRunCourseFragment);
        this.mSearchNoShow.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void clear() {
        this.mSearchRunCourseFragment.d();
    }

    static class c implements FlowLayout.OnTextClickListener, FitnessSearchFragmentBar.OnQueryTextListener, FitSearchFragmentRecyclerView.LoadMoreListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FitSearchFragmentRecyclerView.LoadMoreListener f8967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FitnessSearchFragmentBar.OnQueryTextListener f8968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private BaseRunSearchActivity f8969c;

        c(BaseRunSearchActivity baseRunSearchActivity) {
            this.f8969c = baseRunSearchActivity;
        }

        public void b(FitnessSearchFragmentBar.OnQueryTextListener onQueryTextListener) {
            this.f8968b = onQueryTextListener;
        }

        public void a(FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener) {
            this.f8967a = loadMoreListener;
        }

        @Override // com.huawei.health.suggestion.ui.view.FlowLayout.OnTextClickListener
        public void onClick(String str) {
            LogUtil.a(BaseRunSearchActivity.TAG, "onClick text=", str);
            this.f8969c.mSearchFragmentBar.c(str);
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            this.f8969c.mFitnessSearchFlowLayout.e(str);
            if (this.f8968b == null) {
                return false;
            }
            idy.c("1130037");
            this.f8968b.onQueryTextSubmit(str);
            return false;
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f8969c.showSearchKey();
            }
            if (this.f8968b == null) {
                return false;
            }
            idy.c("1130037");
            this.f8968b.onQueryTextChange(str);
            return false;
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView.LoadMoreListener
        public void loadMore() {
            FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener = this.f8967a;
            if (loadMoreListener != null) {
                loadMoreListener.loadMore();
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void hideLoadMore() {
        this.mSearchRunCourseFragment.c();
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void showLoadMore() {
        this.mSearchRunCourseFragment.a();
    }

    public void setOnQueryTextListener(FitnessSearchFragmentBar.OnQueryTextListener onQueryTextListener) {
        this.mSearchOnClick.b(onQueryTextListener);
    }

    public void setRunLoadMoreListener(FitSearchFragmentRecyclerView.LoadMoreListener loadMoreListener) {
        this.mSearchOnClick.a(loadMoreListener);
    }

    public void setFlowAdapter(FitSearchFragmentFlowLayout.FowAdapter fowAdapter) {
        this.mFitnessSearchFlowLayout.c(fowAdapter);
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void addData(List<FitWorkout> list) {
        if (njy.b(list)) {
            this.mFitnessSearchFlowLayout.c(this.mSearchRunCourseFragment);
            this.mSearchNoShow.setVisibility(8);
        } else if (this.mSearchRunCourseFragment.b() == 0) {
            this.mSearchNoShow.setVisibility(0);
        }
        this.mSearchRunCourseFragment.d(ibn.c(list));
    }

    @Override // com.huawei.health.suggestion.ui.SearchViewInterface
    public void showSearchNoShow() {
        View view = this.mSearchNoShow;
        if (view != null) {
            view.setVisibility(0);
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
