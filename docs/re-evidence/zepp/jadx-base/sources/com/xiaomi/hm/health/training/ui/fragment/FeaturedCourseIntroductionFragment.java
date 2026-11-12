package com.xiaomi.hm.health.training.ui.fragment;

import android.content.Context;
import android.graphics.Picture;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.WebLoadCallback;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.web.container.WebActivity;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseIntroductionInfo;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.helper.DataConverter;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.eventbus.EventWebViewLoadFinish;
import com.xiaomi.hm.health.training.navigation.NavigationController;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseIntroductionFragment;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseDetailViewModel;
import com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import de.greenrobot.event.EventBus;
import defpackage.yp8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseIntroductionFragment extends Fragment implements WebLoadCallback {

    @Inject
    public ViewModelProvider.Factory b;

    @Inject
    public NavigationController c;
    private FeaturedCourseDetailViewModel d;
    private WebFragment e;
    private LinearLayout f;
    private TextView g;
    private FeaturedCourseListView h;
    private TextView i;
    private String j;
    private int l;
    public int m;
    private final String a = "Train-FeaturedCourseIntroductionFragment";
    private ArrayList<FeaturedCourseItem> k = new ArrayList<>();

    public class a implements FeaturedCourseListView.OnItemShowListener {
        private Set<String> a = new HashSet();

        public a() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView.OnItemShowListener
        public void OnItemShow(@NotNull FeaturedCourseItem featuredCourseItem, int i) {
            if (this.a.contains(featuredCourseItem.id)) {
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATUREDRECOMMENDCOURSE_VN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, featuredCourseItem.id).addExtra("Position", String.valueOf(i)));
            this.a.add(featuredCourseItem.id);
        }
    }

    private void A() {
        if (this.k.isEmpty()) {
            if (this.f.getVisibility() != 8) {
                this.f.setVisibility(8);
                this.l = 0;
            }
        } else if (this.f.getVisibility() != 0) {
            this.f.setVisibility(0);
            this.l = getResources().getDimensionPixelSize(R.dimen.tr_training_recommended_courses_height);
            this.h.setCourseItems(DataConverter.getLimitFeaturedCourses(this.k, 6));
            Analytics.recordEvent(new CountEventBuilder("FeaturedRecommend_VN").addExtra(TrainingAnalytics.ParamKey.PAGE_SOURCE, TrainingAnalytics.ParamValue.PageSource.FEATURED_COURSE_DETAIL));
        }
        Loggers.getLogger().v("Train-FeaturedCourseIntroductionFragment", new Supplier() { // from class: n12
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return this.a.v();
            }
        });
        EventBus.getDefault().post(new EventWebViewLoadFinish(this.l));
    }

    private void B(FeaturedCourseIntroductionInfo featuredCourseIntroductionInfo) {
        if (isAdded() && featuredCourseIntroductionInfo != null) {
            z(featuredCourseIntroductionInfo);
            w(featuredCourseIntroductionInfo.url);
            y(featuredCourseIntroductionInfo.url);
        }
    }

    private void initView(View view) {
        this.i = (TextView) view.findViewById(R.id.tv_limit_free_tips);
        this.g = (TextView) view.findViewById(R.id.tv_more_courses);
        this.h = (FeaturedCourseListView) view.findViewById(R.id.recommended_courses);
        this.f = (LinearLayout) view.findViewById(R.id.recommended_layout);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: j12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.m(view2);
            }
        });
        this.h.setOnItemClickListener(new FeaturedCourseListView.OnItemClickListener() { // from class: r12
            @Override // com.xiaomi.hm.health.training.ui.widget.FeaturedCourseListView.OnItemClickListener
            public final void onItemClick(FeaturedCourseItem featuredCourseItem, int i) {
                this.a.n(featuredCourseItem, i);
            }
        });
        this.h.setOnItemShowListener(new a());
    }

    private void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        FeaturedCourseDetailViewModel featuredCourseDetailViewModel = (FeaturedCourseDetailViewModel) ViewModelProviders.of(getActivity(), this.b).get(FeaturedCourseDetailViewModel.class);
        this.d = featuredCourseDetailViewModel;
        featuredCourseDetailViewModel.getIntroduceInfoResultLiveData().observe(this, new Observer() { // from class: m12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.p((Resource) obj);
            }
        });
        this.d.getRecommendedCoursesLiveData().observe(this, new Observer() { // from class: l12
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.q((Resource) obj);
            }
        });
    }

    private void k() {
        this.b = TrainingInjection.get().getViewModelFactory();
        this.c = TrainingInjection.get().getNavigationController();
    }

    private boolean l(String str) {
        if (!TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(str) && TextUtils.equals(this.j, str)) {
            return true;
        }
        this.j = str;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        if (getActivity() != null) {
            this.c.navigateToFeaturedCourseRecommendedList(getActivity(), this.k);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATUREDRECOMMENDMORE_CN).addExtra(TrainingAnalytics.ParamKey.PAGE_SOURCE, TrainingAnalytics.ParamValue.PageSource.FEATURED_COURSE_DETAIL));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(FeaturedCourseItem featuredCourseItem, int i) {
        if (getActivity() != null) {
            this.d.setCourseId(featuredCourseItem.id);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATUREDRECOMMENDCOURSE_CN).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.d.getCourseId())).addExtra("Position", String.valueOf(i)));
        }
    }

    public static FeaturedCourseIntroductionFragment newInstance() {
        return new FeaturedCourseIntroductionFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o() {
        return "相同externalLink,不重新加载";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Resource resource) {
        if (resource == null || resource.getStatus() != Status.SUCCESS || resource.getData() == null) {
            return;
        }
        FeaturedCourseIntroductionInfo featuredCourseIntroductionInfo = (FeaturedCourseIntroductionInfo) resource.getData();
        if (l(featuredCourseIntroductionInfo.url)) {
            Loggers.getLogger().v("Train-FeaturedCourseIntroductionFragment", new Supplier() { // from class: p12
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCourseIntroductionFragment.o();
                }
            });
        } else {
            B(featuredCourseIntroductionInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Resource resource) {
        if (resource == null || resource.getStatus() != Status.SUCCESS || resource.getData() == null) {
            return;
        }
        this.k.clear();
        this.k.addAll((Collection) resource.getData());
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r() {
        return "url is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s() {
        return "webview页面渲染重新更新页面高度";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(WebView webView, Picture picture) {
        int contentHeight = webView.getContentHeight();
        if (this.m != contentHeight) {
            this.m = contentHeight;
            A();
            Loggers.getLogger().v("Train-FeaturedCourseIntroductionFragment", new Supplier() { // from class: q12
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCourseIntroductionFragment.s();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str) {
        if (getWebView() != null) {
            getWebView().setWebViewClient(new b(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object v() {
        return "updateRecommendedLayout()...extraHeight=" + this.l;
    }

    private void w(String str) {
        if (TextUtils.isEmpty(str)) {
            Loggers.getLogger().w("Train-FeaturedCourseIntroductionFragment", new Supplier() { // from class: o12
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCourseIntroductionFragment.r();
                }
            });
            return;
        }
        WebItem webItem = new WebItem();
        webItem.url = str;
        webItem.isShowLoadingTip = true;
        webItem.isUseCache = true;
        WebFragment webFragmentNewInstance = WebFragment.newInstance(webItem);
        this.e = webFragmentNewInstance;
        webFragmentNewInstance.setLoadingCallback(this);
        getChildFragmentManager().beginTransaction().replace(R.id.container, this.e).commit();
    }

    private void x() {
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_INTRODUCTION_VIEWNUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.d.getCourseId())));
    }

    private void y(final String str) {
        this.i.postDelayed(new Runnable() { // from class: s12
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u(str);
            }
        }, 1000L);
    }

    private void z(FeaturedCourseIntroductionInfo featuredCourseIntroductionInfo) {
        if (featuredCourseIntroductionInfo == null) {
            return;
        }
        if (TextUtils.isEmpty(featuredCourseIntroductionInfo.freePeriodStart) || TextUtils.isEmpty(featuredCourseIntroductionInfo.freePeriodEnd)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.i.setText(getString(R.string.tr_limit_free_tips, featuredCourseIntroductionInfo.freePeriodStart, featuredCourseIntroductionInfo.freePeriodEnd));
        }
    }

    public int getExtraHeight() {
        return this.l;
    }

    @Nullable
    public WebView getWebView() {
        WebFragment webFragment = this.e;
        if (webFragment != null) {
            return webFragment.getWebView();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getUserVisibleHint()) {
            x();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        k();
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_featured_course_introduction, viewGroup, false);
    }

    @Override // com.huami.discovery.bridge.WebLoadCallback
    public void onError(int i) {
    }

    @Override // com.huami.discovery.bridge.WebLoadCallback
    public void onPageFinish() {
    }

    @Override // com.huami.discovery.bridge.WebLoadCallback
    public void onPageStart() {
        getWebView().setPictureListener(new WebView.PictureListener() { // from class: k12
            @Override // android.webkit.WebView.PictureListener
            public final void onNewPicture(WebView webView, Picture picture) {
                this.a.t(webView, picture);
            }
        });
    }

    @Override // com.huami.discovery.bridge.WebLoadCallback
    public void onProgressChanged(int i) {
    }

    @Override // com.huami.discovery.bridge.WebLoadCallback
    public void onReceivedTitle(String str) {
    }

    @Override // com.huami.discovery.bridge.WebLoadCallback
    public /* synthetic */ void onSslError(SslError sslError) {
        yp8.a(this, sslError);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z || getView() == null) {
            return;
        }
        x();
    }

    public class b extends WebViewClient {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (this.a.equals(string) || TextUtils.isEmpty(string)) {
                return false;
            }
            WebActivity.launch(FeaturedCourseIntroductionFragment.this.getActivity(), new WebItem(string));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.a.equals(str) || TextUtils.isEmpty(str)) {
                return false;
            }
            WebActivity.launch(FeaturedCourseIntroductionFragment.this.getActivity(), new WebItem(str));
            return true;
        }
    }
}
