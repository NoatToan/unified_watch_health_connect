package com.huawei.ui.main.stories.exclusive;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.vip.api.VipApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.TimeLimitedPromotion;
import defpackage.irs;
import defpackage.iru;
import defpackage.irv;
import defpackage.lsr;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qom;
import defpackage.qqt;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ExclusiveProductProvider extends BaseKnitDataProvider<List<Product>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Product> f26472b;
    private SectionBean e;
    private int f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26473c = true;
    private String d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26471a = true;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, final List<Product> list) {
        map.put("PRODUCT", list);
        map.put(CommonConstant.RETKEY.STATUS, Integer.valueOf(this.f));
        map.put("IS_SHOW_TOAST", Boolean.valueOf(this.f26473c));
        map.put("CLICK_EVENT_LISTENER", new qom() { // from class: com.huawei.ui.main.stories.exclusive.ExclusiveProductProvider.2
            @Override // defpackage.qom, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                ExclusiveProductProvider.this.f = i;
                if (ExclusiveProductProvider.this.e != null) {
                    ExclusiveProductProvider.this.e.c(list);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, final SectionBean sectionBean) {
        Bundle extra;
        LogUtil.a("ExclusiveProductProvider", "loadData: ", this);
        if (HandlerExecutor.c()) {
            LogUtil.a("ExclusiveProductProvider", "loadData isMainTread: ", this);
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.exclusive.ExclusiveProductProvider.1
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("ExclusiveProductProvider", "loadData run: ", this);
                    ExclusiveProductProvider.this.loadData(context, sectionBean);
                }
            });
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("ExclusiveProductProvider", "loadData isBrowseMode");
            return;
        }
        boolean z = this.f26471a;
        if (!z) {
            LogUtil.a("ExclusiveProductProvider", "mIsFirst: ", false);
            return;
        }
        if (z && (extra = getExtra()) != null) {
            int i = extra.getInt("MEMBER_TYPE_SELECT_INDEX", 0);
            String string = extra.getString("DEFAULT_PRODUCT_ID");
            this.d = string;
            LogUtil.a("ExclusiveProductProvider", "extraSelectedIndex: ", Integer.valueOf(i), " mDefaultProductId", string);
            this.f = i;
        }
        this.e = sectionBean;
        List<Product> listC = c();
        this.f26472b = listC;
        c(listC);
        sectionBean.c(this.f26472b);
        ((VipApi) Services.b("vip", VipApi.class)).getVirtualResourceSummary(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.exclusive.ExclusiveProductProvider.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                List listE = ExclusiveProductProvider.this.e(obj);
                ExclusiveProductProvider.this.f26472b = listE;
                ExclusiveProductProvider exclusiveProductProvider = ExclusiveProductProvider.this;
                exclusiveProductProvider.c((List<Product>) exclusiveProductProvider.f26472b);
                LogUtil.a("ExclusiveProductProvider", "products: ", qqt.b(listE));
                ExclusiveProductProvider.this.f26471a = false;
                sectionBean.c(njy.e(listE) ? null : ExclusiveProductProvider.this.f26472b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<Product> list) {
        if (njy.e(list) || TextUtils.isEmpty(this.d)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            if (product != null && TextUtils.equals(this.d, product.getProductId())) {
                this.f = i;
                LogUtil.a("ExclusiveProductProvider", "findDefaultSelectIndex selectIndex ", Integer.valueOf(i));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Product> e(Object obj) {
        List<iru> listD;
        ArrayList arrayList = new ArrayList(c());
        if (obj instanceof irv) {
            listD = ((irv) obj).d();
        } else {
            if (obj instanceof List) {
                if (njy.b(obj, iru.class)) {
                    listD = (List) obj;
                } else {
                    LogUtil.a("ExclusiveProductProvider", "objData is List, but elements are not ProductSummaryInfo");
                }
            } else {
                StringBuilder sb = new StringBuilder("objData type mismatch: ");
                sb.append(obj != null ? obj.getClass().getName() : Constants.NULL);
                LogUtil.a("ExclusiveProductProvider", sb.toString());
            }
            listD = null;
        }
        if (njy.e(listD)) {
            LogUtil.j("ExclusiveProductProvider", "parseVipTypeResult failed: summaryList is empty or type mismatch");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (iru iruVar : listD) {
            if (iruVar != null && iruVar.m() == 1) {
                arrayList2.add(a(iruVar));
            }
        }
        return njy.e(arrayList2) ? arrayList : e((List<Product>) arrayList2);
    }

    private Product a(iru iruVar) {
        Product product = new Product();
        product.setProductId(iruVar.n());
        product.setProductName(iruVar.s());
        product.setPurchasePolicy(iruVar.r());
        product.setCurrency(iruVar.e());
        product.setMicroPrice(iruVar.k());
        product.setNowTime(iruVar.l());
        product.setSaleTime(iruVar.p());
        product.setPriority(iruVar.o());
        product.setDuration(iruVar.d());
        product.setMemberFlag(iruVar.w());
        product.setHealthMember(iruVar.v());
        product.setButtonDesc(iruVar.c());
        product.setTitle(iruVar.u());
        product.setTitleVisibility(iruVar.aa());
        product.setPromotionDesc(iruVar.q());
        product.setPromotionDescVisibility(iruVar.ab());
        product.setGiveawayDesc(iruVar.b());
        product.setGiveawayDescVisibility(iruVar.x());
        product.setMemberPriceRetentionDesc(iruVar.j());
        product.setMemberPriceRetentionVisibility(iruVar.y());
        product.setLinkType(iruVar.g());
        product.setLinkValue(iruVar.h());
        product.setMemberPackageImageUrl(iruVar.f());
        product.setMemberPackagePadImageUrl(iruVar.i());
        if (iruVar.t() != null) {
            TimeLimitedPromotion timeLimitedPromotion = new TimeLimitedPromotion();
            timeLimitedPromotion.setMicroOriginPrice(iruVar.t().c());
            timeLimitedPromotion.setPromotionEndTime(iruVar.t().a());
            product.setPromotion(timeLimitedPromotion);
        }
        if (iruVar.x() && !njy.e(iruVar.a())) {
            ArrayList arrayList = new ArrayList();
            for (irs irsVar : iruVar.a()) {
                if (irsVar != null) {
                    Product product2 = new Product();
                    product2.setProductName(irsVar.b());
                    product2.setShowGiveawayPicFlag(iruVar.x());
                    product2.setProductDesc(irsVar.a());
                    product2.setProductUrl(irsVar.d());
                    product2.setAttachType("1");
                    arrayList.add(product2);
                }
            }
            product.setGiveaways(arrayList);
        }
        return product;
    }

    private List<Product> e(List<Product> list) {
        Collections.sort(list, new Comparator<Product>() { // from class: com.huawei.ui.main.stories.exclusive.ExclusiveProductProvider.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Product product, Product product2) {
                return product2.getPriority() - product.getPriority();
            }
        });
        a(list);
        return list;
    }

    private void a(List<Product> list) {
        if (njy.e(list)) {
            LogUtil.a("ExclusiveProductProvider", "products is Empty");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "PREMIUM_PRODUCT_KEY", lsr.e(list, null), new StorageParams());
        LogUtil.a("ExclusiveProductProvider", "setCacheProducts success");
    }

    private List<Product> c() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "PREMIUM_PRODUCT_KEY");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strE)) {
            lsr.c(strE, ExclusiveProductProvider.class.getClassLoader(), null, arrayList);
            LogUtil.a("ExclusiveProductProvider", "getVipProductsFromSp success");
        }
        return arrayList;
    }
}
