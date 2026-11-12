package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.ArticleImage;
import com.huawei.health.marketing.datatype.ArticleInfo;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.datatypes.MemberTypeInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fxc;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes29.dex */
public class ArticleMemberBenefitsProvider extends BaseKnitDataProvider<HashMap<Integer, List<Drawable>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer f8194a = 1;
    private SectionBean g;
    private HashMap<Integer, List<Drawable>> d = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Integer, Integer> f8195b = new HashMap<>();
    private List<Integer> i = new ArrayList(10);
    private List<ArticleImage> e = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReentrantReadWriteLock f8196c = new ReentrantReadWriteLock();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HashMap<Integer, List<Drawable>> map2) {
        this.d = map2;
        map.put("CARD_TITLE_INDEX", this.i);
        map.put("GRID_ORIENTATION", this.f8195b);
        map.put("CARD_COMBIN_IMAGES", this.d);
        map.put("ARTICLE_IMAGE_LIST", this.e);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, final SectionBean sectionBean) {
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: com.huawei.health.marketing.views.ArticleMemberBenefitsProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    ArticleMemberBenefitsProvider.this.loadData(context, sectionBean);
                }
            });
        } else {
            this.g = sectionBean;
            a(context);
        }
    }

    private void a(final Context context) {
        ((VipApi) Services.b("vip", VipApi.class)).getVipType(new IBaseResponseCallback() { // from class: com.huawei.health.marketing.views.ArticleMemberBenefitsProvider.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int iD = ArticleMemberBenefitsProvider.this.d(context, obj);
                LogUtil.a("ArticleMemberBenefitsProvider", "articleId: ", Integer.valueOf(iD));
                ArticleMemberBenefitsProvider.this.c(context, iD);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context, int i) {
        fxc.a().e(i, new IBaseResponseCallback() { // from class: com.huawei.health.marketing.views.ArticleMemberBenefitsProvider.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                List listC = ArticleMemberBenefitsProvider.this.c(obj);
                try {
                    ArticleMemberBenefitsProvider.this.f8196c.writeLock().lock();
                    if (ArticleMemberBenefitsProvider.this.e.isEmpty() && !listC.isEmpty()) {
                        ArticleMemberBenefitsProvider.this.e.addAll(listC);
                    }
                    ArticleMemberBenefitsProvider.this.f8196c.writeLock().unlock();
                    ArticleMemberBenefitsProvider.this.b(context);
                    LogUtil.a("ArticleMemberBenefitsProvider", "articleImages: ", qqt.b(listC));
                } catch (Throwable th) {
                    ArticleMemberBenefitsProvider.this.f8196c.writeLock().unlock();
                    throw th;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (this.e.isEmpty()) {
            return;
        }
        try {
            this.f8196c.writeLock().lock();
            ArrayList arrayList = new ArrayList();
            for (ArticleImage articleImage : this.e) {
                if (articleImage.getCombinStatus() == f8194a.intValue()) {
                    arrayList.add(Integer.valueOf(this.e.indexOf(articleImage)));
                    this.f8195b.put(Integer.valueOf(this.e.indexOf(articleImage)), Integer.valueOf(articleImage.getCombinStyle()));
                }
            }
            this.i = arrayList;
            this.f8196c.writeLock().unlock();
            d(context);
        } catch (Throwable th) {
            this.f8196c.writeLock().unlock();
            throw th;
        }
    }

    private void d(final Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ArticleMemberBenefitsProvider.2
            @Override // java.lang.Runnable
            public void run() {
                ArticleMemberBenefitsProvider.this.c(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        if (this.i.isEmpty() || this.e.isEmpty()) {
            return;
        }
        try {
            this.f8196c.writeLock().lock();
            for (Integer num : this.i) {
                int iIntValue = num.intValue();
                ArticleImage articleImage = this.e.get(iIntValue);
                int combinNums = articleImage.getCombinNums();
                this.f8195b.put(num, Integer.valueOf(articleImage.getCombinStyle()));
                a(context, iIntValue, combinNums);
            }
            this.f8196c.writeLock().unlock();
        } catch (Throwable th) {
            this.f8196c.writeLock().unlock();
            throw th;
        }
    }

    private void a(Context context, final int i, final int i2) {
        final ArrayList arrayList = new ArrayList();
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ArticleMemberBenefitsProvider.1
            @Override // java.lang.Runnable
            public void run() {
                CountDownLatch countDownLatch = new CountDownLatch(i2);
                int i3 = i;
                while (true) {
                    try {
                        if (i3 >= i + i2) {
                            break;
                        }
                        if (njy.c(ArticleMemberBenefitsProvider.this.e, i3)) {
                            String imgName = ((ArticleImage) ArticleMemberBenefitsProvider.this.e.get(i3)).getImgName();
                            Drawable drawableB = null;
                            for (int i4 = 0; drawableB == null && i4 < 3; i4++) {
                                drawableB = qqf.b(BaseApplication.b(), imgName);
                            }
                            arrayList.add(drawableB);
                            countDownLatch.countDown();
                        }
                        i3++;
                    } catch (InterruptedException unused) {
                        LogUtil.e("ArticleMemberBenefitsProvider", "load tab img async is interrupted!");
                        return;
                    } finally {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Drawable) it.next()) == null) {
                                LogUtil.e("ArticleMemberBenefitsProvider", "load tab img async failed");
                            }
                        }
                    }
                }
                countDownLatch.await();
                ArticleMemberBenefitsProvider.this.d.put(Integer.valueOf(i), arrayList);
                if (ArticleMemberBenefitsProvider.this.g != null) {
                    ArticleMemberBenefitsProvider.this.g.c((Object) ArticleMemberBenefitsProvider.this.d);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(Context context, Object obj) {
        Integer numValueOf;
        if (!njy.b(obj, MemberTypeInfo.class)) {
            LogUtil.a("ArticleMemberBenefitsProvider", "objData not list of MemberTypeInfo");
            return 0;
        }
        List<MemberTypeInfo> list = (List) obj;
        LogUtil.a("ArticleMemberBenefitsProvider", "memberTypeInfos ", list);
        for (MemberTypeInfo memberTypeInfo : list) {
            if (memberTypeInfo != null && memberTypeInfo.getMemberType() == 1) {
                String marketingArticleId = memberTypeInfo.getMarketingArticleId() == null ? "0" : memberTypeInfo.getMarketingArticleId();
                String darkMarketingArticleId = memberTypeInfo.getDarkMarketingArticleId() == null ? "0" : memberTypeInfo.getDarkMarketingArticleId();
                LogUtil.a("ArticleMemberBenefitsProvider", "darkArticleId = ", darkMarketingArticleId);
                int iIntValue = Integer.valueOf(marketingArticleId).intValue();
                if (!qrs.x(context)) {
                    return iIntValue;
                }
                if (darkMarketingArticleId != "0") {
                    numValueOf = Integer.valueOf(darkMarketingArticleId);
                } else {
                    numValueOf = Integer.valueOf(marketingArticleId);
                }
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ArticleImage> c(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (!(obj instanceof ArticleInfo)) {
            LogUtil.a("ArticleMemberBenefitsProvider", "objData not instanceof ArticleInfo");
            return arrayList;
        }
        ArticleInfo articleInfo = (ArticleInfo) obj;
        if (articleInfo == null) {
            LogUtil.a("ArticleMemberBenefitsProvider", "articleInfo is null");
            return arrayList;
        }
        return articleInfo.getArticleImgList();
    }
}
