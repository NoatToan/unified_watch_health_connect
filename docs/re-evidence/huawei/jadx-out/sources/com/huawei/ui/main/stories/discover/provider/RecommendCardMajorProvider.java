package com.huawei.ui.main.stories.discover.provider;

import android.content.Context;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.QueryRecommendResources;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.marketing.datatype.RecommendResourceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fxy;
import defpackage.lsy;
import defpackage.njy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class RecommendCardMajorProvider extends BaseKnitDataProvider<Hashtable<Integer, RecommendCardBean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MemberCardManager f26461a;
    private MemberCardListener d;
    private SectionBean j;
    private List<RecommendResourceInfo> e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f26462b = new ArrayList<String>() { // from class: com.huawei.ui.main.stories.discover.provider.RecommendCardMajorProvider.1
        {
            add("vipPageFitness");
            add("vipPageBMI");
            add("vipPageSleep");
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Hashtable<Integer, RecommendCardBean> f26463c = new Hashtable<>();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return false;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("RecommendCardMajorProvider", "loadDefaultData");
        this.j = sectionBean;
        super.loadDefaultData(sectionBean);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, final SectionBean sectionBean) {
        LogUtil.a("RecommendCardMajorProvider", "loadData");
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.discover.provider.RecommendCardMajorProvider.3
                @Override // java.lang.Runnable
                public void run() {
                    RecommendCardMajorProvider.this.loadData(context, sectionBean);
                }
            });
            return;
        }
        if (this.f26461a == null) {
            this.f26461a = new MemberCardManager(context);
        }
        this.f26461a.a();
        this.j = sectionBean;
        b(context, this.f26462b);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, Hashtable<Integer, RecommendCardBean> hashtable) {
        LogUtil.a("RecommendCardMajorProvider", "parseParams");
        map.put("TOP_CARD_BEAN", hashtable);
    }

    private void b(final Context context, List<String> list) {
        new fxy().e(list, 1, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.discover.provider.RecommendCardMajorProvider.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List listE = RecommendCardMajorProvider.this.e(obj);
                if (RecommendCardMajorProvider.this.e != null && RecommendCardMajorProvider.this.e.isEmpty() && !njy.e(listE)) {
                    RecommendCardMajorProvider.this.e.clear();
                    RecommendCardMajorProvider.this.e.addAll(listE);
                }
                RecommendCardMajorProvider recommendCardMajorProvider = RecommendCardMajorProvider.this;
                recommendCardMajorProvider.e(context, recommendCardMajorProvider.e);
                LogUtil.a("RecommendCardMajorProvider", "mResourceInfoList: ", RecommendCardMajorProvider.this.e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, List<RecommendResourceInfo> list) {
        LogUtil.a("RecommendCardMajorProvider", "sendRecommendResource");
        d dVar = new d(this);
        this.d = dVar;
        this.f26461a.b(this.e, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<RecommendResourceInfo> e(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (!(obj instanceof QueryRecommendResources)) {
            LogUtil.a("RecommendCardMajorProvider", "objData not instanceof QueryRecommendResources");
            return arrayList;
        }
        QueryRecommendResources queryRecommendResources = (QueryRecommendResources) obj;
        if (queryRecommendResources.getTotalNum() == 0) {
            LogUtil.a("RecommendCardMajorProvider", "resources is null");
            return arrayList;
        }
        return queryRecommendResources.getRecommendResourceInfos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, RecommendCardBean recommendCardBean) {
        if (this.f26463c == null || this.j == null) {
            LogUtil.e("RecommendCardMajorProvider", "mRecommendCardBeansMap or mSectionBean is null");
            return;
        }
        LogUtil.a("RecommendCardMajorProvider", "index = ", Integer.valueOf(i), " recommendCardBean = ", recommendCardBean);
        this.f26463c.put(Integer.valueOf(i), recommendCardBean);
        this.j.c(this.f26463c);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        MemberCardManager memberCardManager = this.f26461a;
        if (memberCardManager != null) {
            memberCardManager.d();
        }
    }

    static class d implements MemberCardListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<RecommendCardMajorProvider> f26467a;

        d(RecommendCardMajorProvider recommendCardMajorProvider) {
            this.f26467a = new WeakReference<>(recommendCardMajorProvider);
        }

        @Override // com.huawei.ui.main.stories.discover.provider.MemberCardListener
        public void onResponse(final int i, final RecommendCardBean recommendCardBean) {
            WeakReference<RecommendCardMajorProvider> weakReference = this.f26467a;
            if (weakReference == null) {
                LogUtil.a("RecommendCardMajorProvider", "onResponse mCardProviderReference == null");
                return;
            }
            final RecommendCardMajorProvider recommendCardMajorProvider = weakReference.get();
            if (recommendCardMajorProvider == null) {
                LogUtil.a("RecommendCardMajorProvider", "onResponse mCardProvider == null");
            } else {
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.discover.provider.RecommendCardMajorProvider.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        recommendCardMajorProvider.a(i, recommendCardBean);
                    }
                });
            }
        }
    }
}
