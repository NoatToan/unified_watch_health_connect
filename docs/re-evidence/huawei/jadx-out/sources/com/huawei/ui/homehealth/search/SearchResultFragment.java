package com.huawei.ui.homehealth.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.model.KnitSectionConfig;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import com.huawei.ui.homehealth.search.template.SearchResultConfig;
import com.huawei.ui.homehealth.search.template.SearchSubTabConfig;
import com.huawei.ui.homehealth.search.utils.SearchResultPageResTrigger;
import com.huawei.ui.main.R;
import defpackage.gvi;
import defpackage.gvk;
import defpackage.iov;
import defpackage.lls;
import defpackage.njy;
import defpackage.nlu;
import defpackage.qpn;
import defpackage.qsp;
import defpackage.rba;
import defpackage.tal;
import defpackage.tam;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class SearchResultFragment extends BaseFragment {
    private static final Map<Integer, String> e = new HashMap<Integer, String>() { // from class: com.huawei.ui.homehealth.search.SearchResultFragment.3
        {
            put(200, BaseApplication.getContext().getResources().getString(R.string.IDS_overall_search));
            put(201, BaseApplication.getContext().getResources().getString(R.string.IDS_configured_page_attribute_course));
            put(Integer.valueOf(com.huawei.hms.kit.awareness.barrier.internal.e.a.C), BaseApplication.getContext().getResources().getString(R.string.IDS_action_lib));
            put(Integer.valueOf(com.huawei.hms.kit.awareness.barrier.internal.e.a.z), BaseApplication.getContext().getResources().getString(R.string.IDS_decompression));
            put(Integer.valueOf(com.huawei.hms.kit.awareness.barrier.internal.e.a.A), BaseApplication.getContext().getResources().getString(R.string.IDS_health_headlines_title));
            put(203, BaseApplication.getContext().getResources().getString(R.string.IDS_device_title_use));
            put(204, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_take_part_in_activities));
            put(205, BaseApplication.getContext().getResources().getString(R.string.IDS_attribute_merchandise));
            put(206, BaseApplication.getContext().getResources().getString(R.string.IDS_function_search));
            put(Integer.valueOf(com.huawei.hms.kit.awareness.barrier.internal.e.a.w), BaseApplication.getContext().getResources().getString(R.string.IDS_search_material));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f26001c;
    private List<KnitSectionConfig> d;
    private RelativeLayout f;
    private LinearLayout g;
    private SearchResultConfig k;
    private View l;
    private qpn n;
    private View o;
    private HealthSubTabWidget q;
    private HealthViewPager r;
    private Map<Integer, Integer> m = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, Fragment> f26000b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, List<KnitSectionConfig>> f25999a = new HashMap();
    private Set<Integer> p = new HashSet();
    private d j = new d(this);
    private boolean i = false;
    private boolean h = false;
    private tam t = new tam(this);

    public static SearchResultFragment e() {
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof GlobalSearchActivity) {
            return ((GlobalSearchActivity) activity).d();
        }
        return null;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.k = (SearchResultConfig) arguments.getParcelable("SEARCH_RESULT_CONFIG");
        }
        LogUtil.a("SearchResultFragment", "onCreate");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("SearchResultFragment", "onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search_result, viewGroup, false);
        this.o = viewInflate;
        this.q = (HealthSubTabWidget) viewInflate.findViewById(R.id.search_category_tab);
        this.r = (HealthViewPager) this.o.findViewById(R.id.search_result_vp);
        this.g = (LinearLayout) this.o.findViewById(R.id.search_result_main_layout);
        this.f = (RelativeLayout) this.o.findViewById(R.id.search_result_loading_layout);
        this.l = this.o.findViewById(R.id.search_result_empty_layout);
        this.n = new qpn(getChildFragmentManager(), this.r, this.q);
        this.h = true;
        this.r.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.homehealth.search.SearchResultFragment.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (SearchResultFragment.this.i) {
                    return;
                }
                for (Integer num : SearchResultFragment.this.m.keySet()) {
                    int iIntValue = num.intValue();
                    if (((Integer) SearchResultFragment.this.m.get(num)).intValue() == i) {
                        gvi.a(com.huawei.haf.application.BaseApplication.b(), GlobalSearchActivity.b(), iIntValue);
                        return;
                    }
                }
            }
        });
        b(this.k);
        return this.o;
    }

    public void b(SearchResultConfig searchResultConfig) {
        if (searchResultConfig == null) {
            LogUtil.a("SearchResultFragment", "SearchResultConfig is null");
            return;
        }
        List<SearchSubTabConfig> tabConfigList = searchResultConfig.getTabConfigList();
        if (njy.e(tabConfigList)) {
            LogUtil.a("SearchResultFragment", "subTabConfigs is empty");
            return;
        }
        for (SearchSubTabConfig searchSubTabConfig : tabConfigList) {
            if (searchSubTabConfig != null) {
                int pageType = searchSubTabConfig.getPageType();
                String str = e.get(Integer.valueOf(pageType));
                LogUtil.a("SearchResultFragment", "pageType: ", Integer.valueOf(pageType), " str: ", str);
                if (!TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("IS_OVERALL", pageType == 200);
                    KnitFragment knitFragmentNewInstance = KnitFragment.newInstance(nlu.a(searchSubTabConfig), new SearchResultPageResTrigger(getContext(), pageType).setExtra(bundle));
                    knitFragmentNewInstance.setIsAllowResumeRefresh(false);
                    d(knitFragmentNewInstance, pageType, searchSubTabConfig);
                }
            }
        }
        b();
    }

    private void d(final KnitFragment knitFragment, final int i, SearchSubTabConfig searchSubTabConfig) {
        knitFragment.setScrollViewTopBoundaryListener(new HealthScrollView.ScrollChangeToBoundaryListener() { // from class: com.huawei.ui.homehealth.search.SearchResultFragment.5
            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrollToChangeAlpha(float f) {
            }

            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrolledToBottom() {
            }

            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrolledTop() {
            }

            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrollStateChange(int i2) {
                if (knitFragment.getUserVisibleHint()) {
                    if (i2 == 1 || i2 == 2) {
                        ObserverManagerUtil.e(gvi.b(i), "");
                    }
                }
            }
        });
        this.f26000b.put(Integer.valueOf(i), knitFragment);
        this.r.setOffscreenPageLimit(this.f26000b.size() - 1);
        if (i == 200) {
            d(searchSubTabConfig);
        }
    }

    private void d(SearchSubTabConfig searchSubTabConfig) {
        ArrayList<KnitSectionConfig> sectionConfigList = searchSubTabConfig.getSectionConfigList();
        this.d = sectionConfigList;
        if (sectionConfigList == null) {
            LogUtil.e("SearchResultFragment", "mDefaultOverallSectionConfigs is null");
            return;
        }
        for (KnitSectionConfig knitSectionConfig : sectionConfigList) {
            try {
                Integer numValueOf = Integer.valueOf(knitSectionConfig.getExtra());
                if (this.f25999a.get(numValueOf) == null) {
                    this.f25999a.put(numValueOf, new ArrayList());
                }
                this.f25999a.get(numValueOf).add(knitSectionConfig);
            } catch (NumberFormatException unused) {
                LogUtil.a("SearchResultFragment", "String to Integer Exception: ", knitSectionConfig.getExtra());
            }
        }
    }

    public void b() {
        LogUtil.a("SearchResultFragment", "refreshChildFragments");
        boolean z = this.i;
        if (z || !this.h) {
            LogUtil.a("SearchResultFragment", "mIsLoading: ", Boolean.valueOf(z), " mIsCreated: ", Boolean.valueOf(this.h));
            return;
        }
        i();
        h();
        this.p.clear();
        this.t.a();
        this.f26001c = new CountDownLatch(tam.e() ? 1 : 2);
        this.t.b(GlobalSearchActivity.b());
        if (!tam.e()) {
            LogUtil.a("SearchResultFragment", "isLessonAggregateSearch is false");
            this.t.e(GlobalSearchActivity.b());
        }
        ThreadPoolManager.c().execute(new c(this.j, this.f26001c));
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Handler> f26006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CountDownLatch> f26007b;

        c(Handler handler, CountDownLatch countDownLatch) {
            this.f26006a = new WeakReference<>(handler);
            this.f26007b = new WeakReference<>(countDownLatch);
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler = this.f26006a.get();
            CountDownLatch countDownLatch = this.f26007b.get();
            if (handler == null || countDownLatch == null) {
                LogUtil.j("SearchResultFragment", "mHandler or mCountDownLatch = null");
                return;
            }
            try {
                if (!countDownLatch.await(tam.e() ? 10000L : 20000L, TimeUnit.MILLISECONDS)) {
                    LogUtil.e("SearchResultFragment", "loading search result timeout");
                }
            } catch (InterruptedException e) {
                LogUtil.e("SearchResultFragment", "loadData failed, cause InterruptedException happened: " + e.getCause());
            }
            handler.sendMessage(handler.obtainMessage(102));
        }
    }

    public void d(int i) {
        Integer num = this.m.get(Integer.valueOf(i));
        if (num == null || num.intValue() < 0 || num.intValue() >= this.n.getCount()) {
            return;
        }
        this.r.setCurrentItem(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        d();
        this.m.clear();
        if (njy.e(this.p)) {
            l();
            return;
        }
        j();
        LogUtil.a("SearchResultFragment", "mShowTabSet after parse overall search result: ", this.p);
        if (g()) {
            this.p.remove(200);
        }
        if (!VersionControlUtil.isSupportOperationAccount()) {
            this.p.remove(204);
        }
        gvi.e(getContext(), GlobalSearchActivity.b(), this.p);
        int[] iArrC = c();
        LogUtil.a("SearchResultFragment", "reorderedType: ", Arrays.toString(iArrC));
        ArrayList<KnitSectionConfig> arrayListD = d(iArrC);
        if (arrayListD != null) {
            d(arrayListD);
        }
        int length = iArrC.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i3 = iArrC[i];
            if (this.p.contains(Integer.valueOf(i3))) {
                String str = e.get(Integer.valueOf(i3));
                Fragment fragment = this.f26000b.get(Integer.valueOf(i3));
                if (str != null && fragment != null) {
                    if (fragment instanceof KnitFragment) {
                        KnitFragment knitFragment = (KnitFragment) fragment;
                        if (!knitFragment.getIsAllowResumeRefresh()) {
                            knitFragment.refreshAllSections();
                        }
                        if (i3 == 203) {
                            a(knitFragment);
                        }
                    }
                    if (!EnvironmentInfo.m() || !str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_device_title_use))) {
                        this.n.b(this.q.b(str), fragment, i2 == 0);
                        this.m.put(Integer.valueOf(i3), Integer.valueOf(i2));
                        if (i2 == 0) {
                            LogUtil.a("SearchResultFragment", "first tab send delayed bi message, pageType: ", Integer.valueOf(i3));
                            this.j.postDelayed(new a(i3), 500L);
                        }
                        i2++;
                    }
                }
            }
            i++;
        }
        if (i2 == 0) {
            l();
        } else {
            qsp.c((View) this.q, i2 <= 1 ? 8 : 0);
        }
    }

    private void a(final KnitFragment knitFragment) {
        HandlerExecutor.c(new Runnable() { // from class: szw
            @Override // java.lang.Runnable
            public final void run() {
                this.f48846a.e(knitFragment);
            }
        }, 500L);
    }

    public /* synthetic */ void e(KnitFragment knitFragment) {
        if (!iov.d(getActivity()) || !isAdded()) {
            LogUtil.j("SearchResultFragment", "preLoadDeviceTab activity is destroyed or being finishing");
        } else if (knitFragment.getFirstTimeVisible()) {
            LogUtil.a("SearchResultFragment", "showResultTabs initData  ", 203);
            knitFragment.initData();
            knitFragment.setFirstTimeVisible(false);
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26005c;

        a(int i) {
            this.f26005c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObserverManagerUtil.e(gvi.b(this.f26005c), "");
        }
    }

    private void j() {
        Integer num;
        Object objD = this.t.d(200);
        if (njy.b(objD, GlobalSearchResult.class)) {
            for (GlobalSearchResult globalSearchResult : new ArrayList((List) objD)) {
                if (globalSearchResult != null && globalSearchResult.getCategoryId() != null && !njy.e(globalSearchResult.getContent()) && (num = gvk.f36089b.get(globalSearchResult.getCategoryId())) != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == 206) {
                        List<GlobalSearchContent> listC = tal.c(globalSearchResult.getContent(), true);
                        List<GlobalSearchContent> listC2 = tal.c(globalSearchResult.getContent(), false);
                        if (!njy.e(listC)) {
                            this.p.add(206);
                        }
                        if (!njy.e(listC2)) {
                            this.p.add(201);
                        }
                    } else if (iIntValue != 301) {
                        this.p.add(num);
                    }
                }
            }
        }
    }

    private boolean g() {
        return this.p.contains(200) && this.p.size() <= 2 && !a(301);
    }

    private boolean a(int i) {
        Integer num;
        Object objD = this.t.d(200);
        if (!njy.b(objD, GlobalSearchResult.class)) {
            return false;
        }
        for (GlobalSearchResult globalSearchResult : (List) objD) {
            if (globalSearchResult != null && globalSearchResult.getCategoryId() != null && !njy.e(globalSearchResult.getContent()) && (num = gvk.f36089b.get(globalSearchResult.getCategoryId())) != null && num.intValue() == i) {
                return !njy.e(globalSearchResult.getContent());
            }
        }
        return false;
    }

    private void d() {
        while (this.n.getCount() > 0) {
            qpn qpnVar = this.n;
            qpnVar.b(qpnVar.getCount() - 1);
        }
    }

    private void d(ArrayList<KnitSectionConfig> arrayList) {
        Map<Integer, Fragment> map = this.f26000b;
        if (map == null || !(map.get(200) instanceof KnitFragment)) {
            LogUtil.e("SearchResultFragment", "mFragmentMap is null or overall page is not knit fragment");
            return;
        }
        KnitFragment knitFragment = (KnitFragment) this.f26000b.get(200);
        String pageData = knitFragment.getPageData();
        if (pageData == null && knitFragment.getArguments() != null) {
            pageData = knitFragment.getArguments().getString(KnitFragment.KEY_PAGE_DATA);
        }
        SearchSubTabConfig searchSubTabConfig = (SearchSubTabConfig) lls.b(pageData, new TypeToken<SearchSubTabConfig>() { // from class: com.huawei.ui.homehealth.search.SearchResultFragment.4
        });
        ArrayList<KnitSectionConfig> sectionConfigList = searchSubTabConfig != null ? searchSubTabConfig.getSectionConfigList() : null;
        if (sectionConfigList == null || sectionConfigList.toString().equals(arrayList.toString())) {
            LogUtil.a("SearchResultFragment", "original section configs is null or is equal to reordered section configs");
            return;
        }
        LogUtil.a("SearchResultFragment", "section configs changed, original section configs: ", sectionConfigList, " ,reordered section configs: ", arrayList);
        searchSubTabConfig.setSectionConfigList(arrayList);
        String strA = nlu.a(searchSubTabConfig);
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_OVERALL", true);
        this.f26000b.put(200, KnitFragment.newInstance(strA, new SearchResultPageResTrigger(getContext(), 200).setExtra(bundle)));
    }

    private ArrayList<KnitSectionConfig> d(int[] iArr) {
        if (this.f25999a == null || this.d == null) {
            return null;
        }
        ArrayList<KnitSectionConfig> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            if (this.f25999a.containsKey(Integer.valueOf(i))) {
                arrayList.addAll(this.f25999a.get(Integer.valueOf(i)));
                hashSet.addAll(this.f25999a.get(Integer.valueOf(i)));
            }
        }
        for (KnitSectionConfig knitSectionConfig : this.d) {
            if (!hashSet.contains(knitSectionConfig)) {
                arrayList.add(knitSectionConfig);
                hashSet.add(knitSectionConfig);
            }
        }
        return arrayList;
    }

    private int[] c() {
        int[] iArrE = gvk.e();
        LogUtil.a("SearchResultFragment", "isFromHint, should reorder page type");
        String strB = GlobalSearchActivity.b();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i : iArrE) {
            if (a(i, strB)) {
                arrayList.add(Integer.valueOf(i));
                hashSet.add(Integer.valueOf(i));
            }
        }
        for (int i2 : iArrE) {
            if (!hashSet.contains(Integer.valueOf(i2))) {
                arrayList.add(Integer.valueOf(i2));
                hashSet.add(Integer.valueOf(i2));
            }
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }

    private boolean a(int i, String str) {
        if (i == 200) {
            return true;
        }
        List<GlobalSearchContent> listB = this.t.b(i);
        if (i == 206) {
            listB = tal.c(listB, true);
        }
        LogUtil.a("SearchResultFragment", "isPriorityPageType resultList= ", HiJsonUtil.d(listB));
        LogUtil.a("SearchResultFragment", "isPriorityPageType resultSize= ", Integer.valueOf(listB.size()), " pageType= ", Integer.valueOf(i));
        if (njy.e(listB)) {
            return false;
        }
        int iMin = Math.min(listB.size(), 3);
        for (int i2 = 0; i2 < iMin; i2++) {
            GlobalSearchContent globalSearchContent = listB.get(i2);
            if (globalSearchContent != null && TextUtils.equals(str, tal.d(globalSearchContent, i))) {
                LogUtil.a("SearchResultFragment", "isPriorityPageType is true ");
                return true;
            }
        }
        return false;
    }

    public Object b(int i) {
        return this.t.d(i);
    }

    public List<GlobalSearchContent> e(int i) {
        return this.t.b(i);
    }

    public void a(int i, boolean z) {
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = z ? 101 : 100;
        messageObtainMessage.obj = Integer.valueOf(i);
        this.j.sendMessage(messageObtainMessage);
    }

    public void a(rba rbaVar) {
        if (rbaVar == null) {
            return;
        }
        Intent intent = new Intent(getContext(), (Class<?>) OneKeyScanActivity.class);
        List<String> listR = rbaVar.r();
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        startActivity(intent);
    }

    private void l() {
        LogUtil.a("SearchResultFragment", "showNoDataLayout");
        qsp.c(this.l, 0);
    }

    private void i() {
        LogUtil.a("SearchResultFragment", "hideNoDataLayout");
        qsp.c(this.l, 8);
    }

    private void h() {
        if (this.i) {
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(0);
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.i) {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            this.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CountDownLatch countDownLatch = this.f26001c;
        if (countDownLatch == null || !this.i) {
            return;
        }
        countDownLatch.countDown();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("SearchResultFragment", "onDestroy");
        Map<Integer, Fragment> map = this.f26000b;
        if (map != null) {
            for (Map.Entry<Integer, Fragment> entry : map.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                Fragment value = entry.getValue();
                ObserverManagerUtil.a(gvi.b(iIntValue));
                if (value instanceof KnitFragment) {
                    ((KnitFragment) value).setScrollViewTopBoundaryListener(null);
                }
            }
            this.f26000b.clear();
        }
        HealthViewPager healthViewPager = this.r;
        if (healthViewPager != null) {
            healthViewPager.clearOnPageChangeListeners();
        }
        d dVar = this.j;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
    }

    static class d extends BaseHandler<SearchResultFragment> {
        d(SearchResultFragment searchResultFragment) {
            super(searchResultFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SearchResultFragment searchResultFragment, Message message) {
            if (searchResultFragment == null || message == null) {
                LogUtil.a("SearchResultFragment", "obj or message is null");
                return;
            }
            if (searchResultFragment.getActivity() != null && !searchResultFragment.getActivity().isFinishing() && !searchResultFragment.getActivity().isDestroyed()) {
                switch (message.what) {
                    case 100:
                        searchResultFragment.a();
                        break;
                    case 101:
                        Object obj = message.obj;
                        if (obj instanceof Integer) {
                            searchResultFragment.p.add((Integer) obj);
                            searchResultFragment.a();
                        }
                        break;
                    case 102:
                        searchResultFragment.k();
                        searchResultFragment.f();
                        break;
                }
                return;
            }
            LogUtil.a("SearchResultFragment", "activity is destroyed or being finishing");
        }
    }
}
