package com.huawei.ui.main.stories.member;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.datatypes.MemberTypeInfo;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.Product;
import defpackage.fcn;
import defpackage.irz;
import defpackage.lsr;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qom;
import defpackage.qqt;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class MemberProductProvider extends BaseKnitDataProvider<List<Product>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer f28600a;
    private List<Product> d;
    private SectionBean g;
    private int i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28602c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28601b = false;
    private boolean e = true;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, final List<Product> list) {
        map.put("PRODUCT", list);
        map.put(CommonConstant.RETKEY.STATUS, Integer.valueOf(this.i));
        map.put("IS_SHOW_TOAST", Boolean.valueOf(this.f28601b));
        map.put("CLICK_EVENT_LISTENER", new qom() { // from class: com.huawei.ui.main.stories.member.MemberProductProvider.3
            @Override // defpackage.qom, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.c(list, i)) {
                    fcn.a((Product) list.get(i));
                }
                MemberProductProvider.this.i = i;
                if (MemberProductProvider.this.g != null) {
                    MemberProductProvider.this.g.c(list);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(final Context context, final SectionBean sectionBean) {
        Bundle extra;
        boolean z;
        LogUtil.a("MemberProductProvider", "loadData: ", this);
        if (HandlerExecutor.c()) {
            LogUtil.a("MemberProductProvider", "loadData isMainTread: ", this);
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.member.MemberProductProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("MemberProductProvider", "loadData run: ", this);
                    MemberProductProvider.this.e(context, sectionBean);
                }
            });
            return;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("MemberProductProvider", "loadData isBrowseMode");
            return;
        }
        d(context);
        boolean z2 = this.e;
        if (!z2 && !(z = this.f28601b)) {
            LogUtil.a("MemberProductProvider", "mIsFirst: ", Boolean.valueOf(z2), " mIsInTypeSelectActivity ", Boolean.valueOf(z));
            return;
        }
        c();
        if (this.e && (extra = getExtra()) != null) {
            int i = extra.getInt("MEMBER_TYPE_SELECT_INDEX", 0);
            String string = extra.getString("DEFAULT_PRODUCT_ID");
            this.f28602c = string;
            LogUtil.a("MemberProductProvider", "extraSelectedIndex: ", Integer.valueOf(i), " mDefaultProductId", string);
            this.i = i;
        }
        this.g = sectionBean;
        List<Product> listD = d();
        if (this.f28601b) {
            listD = b(listD);
        }
        this.d = listD;
        d(listD);
        sectionBean.c(this.d);
        ((VipApi) Services.b("vip", VipApi.class)).getVipType(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.member.MemberProductProvider.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                List listE = MemberProductProvider.this.e(obj);
                MemberProductProvider memberProductProvider = MemberProductProvider.this;
                memberProductProvider.d = memberProductProvider.f28601b ? MemberProductProvider.this.b(listE) : listE;
                MemberProductProvider memberProductProvider2 = MemberProductProvider.this;
                memberProductProvider2.d((List<Product>) memberProductProvider2.d);
                LogUtil.a("MemberProductProvider", "products: ", qqt.b(listE));
                MemberProductProvider.this.e = false;
                sectionBean.c(njy.e(listE) ? null : MemberProductProvider.this.d);
            }
        });
    }

    private void d(Context context) {
        LogUtil.a("MemberProductProvider", "judgeIsInTypeSelectActivity: context ", context);
        if ((context instanceof Activity) && (((Activity) context) instanceof MemberTypeSelectActivity)) {
            this.f28601b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Product> b(List<Product> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA == null || userMemberInfoA.getAutoRenew() != 1 || userMemberInfoA.getNowTime() > userMemberInfoA.getExpireTime()) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            for (Product product : list) {
                if (product != null && product.getPurchasePolicy() != Product.SUBSCRIPTION_PURCHASE_FLAG) {
                    arrayList2.add(product);
                }
            }
        } catch (ClassCastException e) {
            LogUtil.e("MemberProductProvider", "filterSubScribeProduct Exception, ", ExceptionUtils.c(e), "\n after reconstruct class type is", list.get(0).getClass().getName());
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Product> list) {
        if (njy.e(list) || TextUtils.isEmpty(this.f28602c)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Product product = list.get(i);
            if (product != null && TextUtils.equals(this.f28602c, product.getProductId())) {
                this.i = i;
                LogUtil.a("MemberProductProvider", "findDefaultSelectIndex selectIndex ", Integer.valueOf(i));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Product> e(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d());
        if (!njy.b(obj, MemberTypeInfo.class)) {
            LogUtil.a("MemberProductProvider", "objData not list of MemberTypeInfo");
            return arrayList;
        }
        for (MemberTypeInfo memberTypeInfo : (List) obj) {
            if (memberTypeInfo != null && memberTypeInfo.getMemberType() == 1) {
                List<Product> products = memberTypeInfo.getProducts();
                if (!njy.e(products)) {
                    Collections.sort(products, new Comparator<Product>() { // from class: com.huawei.ui.main.stories.member.MemberProductProvider.5
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(Product product, Product product2) {
                            return product.getPriority() - product2.getPriority();
                        }
                    });
                    e(products);
                    return products;
                }
            }
        }
        return arrayList;
    }

    private void e(List<Product> list) {
        if (njy.e(list)) {
            LogUtil.a("MemberProductProvider", "products is Empty");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "VIP_PRODUCT_KEY", lsr.e(list, null), new StorageParams());
        LogUtil.a("MemberProductProvider", "setCacheProducts success");
    }

    private List<Product> d() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "VIP_PRODUCT_KEY");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strE)) {
            lsr.c(strE, MemberProductProvider.class.getClassLoader(), null, arrayList);
            LogUtil.a("MemberProductProvider", "getVipProductsFromSp success");
        }
        return arrayList;
    }

    private void c() {
        Bundle extra = getExtra();
        if (this.f28600a != null) {
            LogUtil.j("MemberProductProvider", "already registered");
        }
        if (extra == null) {
            LogUtil.e("MemberProductProvider", "registerObserver bundle == null");
            return;
        }
        String string = extra.getString("MEMBER_PRODUCT_TAG", null);
        if (string == null) {
            LogUtil.e("MemberProductProvider", "registerObserver observerTag == null");
            return;
        }
        LogUtil.a("MemberProductProvider", "registerObserver observerTag: ", string);
        c cVar = new c(this);
        this.f28600a = cVar;
        ObserverManagerUtil.d(cVar, string);
    }

    static class c implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MemberProductProvider> f28607c;

        public c(MemberProductProvider memberProductProvider) {
            this.f28607c = new WeakReference<>(memberProductProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            WeakReference<MemberProductProvider> weakReference;
            MemberProductProvider memberProductProvider;
            if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof Integer) || (weakReference = this.f28607c) == null || (memberProductProvider = weakReference.get()) == null) {
                return;
            }
            Integer num = (Integer) objArr[0];
            memberProductProvider.i = num.intValue();
            LogUtil.a("MemberProductProvider", "notify selectedIndex: ", num);
            memberProductProvider.g.c(memberProductProvider.d);
        }
    }
}
