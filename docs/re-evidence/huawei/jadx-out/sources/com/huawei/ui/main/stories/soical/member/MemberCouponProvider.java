package com.huawei.ui.main.stories.soical.member;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.operationbundle.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Coupon;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.ddv;
import defpackage.fcn;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class MemberCouponProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f28890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f28891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<OnClickSectionListener> f28892c;
    private List<String> d;
    private List<String> e;
    private Context h;
    private SectionBean j;
    private Map<String, Object> n = new HashMap();
    private Handler f = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.soical.member.MemberCouponProvider.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                ReleaseLogUtil.a("MemberCouponProvider", "msg is null!");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                ReleaseLogUtil.d("MemberCouponProvider", "UPDATE DATAS!");
                MemberCouponProvider.this.j.c(MemberCouponProvider.this.n);
            }
        }
    };
    private OnClickSectionListener g = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberCouponProvider.2
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
            if (str.equals("BOTTOM_TEXT_CLICK_EVENT")) {
                qpx.e(MemberCouponProvider.this.h, MemberCouponProvider.this.h.getResources().getString(R.string.IDS_vip_claim_successfully));
                if (njy.c(MemberCouponProvider.this.f28891b, i) && njy.c(MemberCouponProvider.this.f28892c, i)) {
                    MemberCouponProvider.this.f28891b.set(i, MemberCouponProvider.this.h.getResources().getString(R.string.IDS_vip_go_to_use));
                    MemberCouponProvider.this.f28892c.set(i, MemberCouponProvider.this.i);
                    MemberCouponProvider.this.n.put("ITEM_JOIN_NUMBER", MemberCouponProvider.this.f28891b);
                    MemberCouponProvider.this.n.put("CLICK_EVENT_LISTENER", MemberCouponProvider.this.f28892c);
                    MemberCouponProvider.this.f28890a.set(i, 1);
                    MemberCouponProvider.this.f.sendEmptyMessage(1);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) MemberCouponProvider.this.d.get(i));
                MemberCouponProvider.this.d(arrayList);
                MemberCouponProvider.this.b(i);
                return;
            }
            String str2 = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.assets?isImmerse&h5pro=true&pName=com.huawei.health&path=CouponDetail&urlType=4&couponId=" + ((String) MemberCouponProvider.this.d.get(i)) + "&status=" + MemberCouponProvider.this.f28890a.get(i);
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                MemberCouponProvider.this.b(i);
                marketRouterApi.router(str2);
            }
        }
    };
    private OnClickSectionListener i = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberCouponProvider.3
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
            String str2 = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.assets?isImmerse&h5pro=true&pName=com.huawei.health&path=CouponDetail&urlType=4&couponId=" + ((String) MemberCouponProvider.this.d.get(i)) + "&status=" + MemberCouponProvider.this.f28890a.get(i);
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                MemberCouponProvider.this.b(i);
                marketRouterApi.router(str2);
            }
        }
    };

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return super.isActive(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (njy.e(this.d, i) || njy.e(this.e, i)) {
            return;
        }
        fcn.c(this.d.get(i), this.e.get(i));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        this.h = context;
        this.j = sectionBean;
        d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("MemberCouponProvider", "parseParams");
        if (!(obj instanceof HashMap)) {
            LogUtil.a("MemberCouponProvider", "data is not map");
            return;
        }
        HashMap map2 = (HashMap) obj;
        if (map2.isEmpty()) {
            return;
        }
        Iterator it = map2.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                str.hashCode();
                switch (str) {
                    case "COMMON_CLICK_EVENT":
                        if (!(value instanceof View.OnClickListener)) {
                            break;
                        } else {
                            map.put("COMMON_CLICK_EVENT", value);
                            break;
                        }
                        break;
                    case "ITEM_STATUS_BACKGROUND":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("ITEM_STATUS_BACKGROUND", value);
                            break;
                        }
                        break;
                    case "ITEM_PAGE_ATTRIBUTE":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("ITEM_PAGE_ATTRIBUTE", value);
                            break;
                        }
                        break;
                    case "ITEM_JOIN_NUMBER":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("ITEM_JOIN_NUMBER", value);
                            break;
                        }
                        break;
                    case "ITEM_TITLE":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("ITEM_TITLE", value);
                            break;
                        }
                        break;
                    case "ITEM_DESCRIPTION":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("ITEM_DESCRIPTION", value);
                            break;
                        }
                        break;
                    case "CLICK_EVENT_LISTENER":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("CLICK_EVENT_LISTENER", value);
                            break;
                        }
                        break;
                    case "ITEM_VIEW_TYPE":
                        if (!(value instanceof List)) {
                            break;
                        } else {
                            map.put("ITEM_VIEW_TYPE", value);
                            break;
                        }
                        break;
                }
            } else {
                map.put("RECYCLERVIEW_STYLE", true);
                return;
            }
        }
    }

    private void d() {
        ((PayApi) Services.d("TradeService", PayApi.class)).couponListQuery(null, null, new a(this, 1));
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MemberCouponProvider> f28898b;
        private int d;

        a(MemberCouponProvider memberCouponProvider, int i) {
            this.f28898b = new WeakReference<>(memberCouponProvider);
            this.d = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MemberCouponProvider memberCouponProvider = this.f28898b.get();
            if (memberCouponProvider != null) {
                if (memberCouponProvider.f == null) {
                    LogUtil.j("MemberCouponProvider", "handler is null");
                    return;
                }
                LogUtil.a("MemberCouponProvider", "GetAssetInfoResponseCallback errorCode = ", Integer.valueOf(i), " mResultType = ", Integer.valueOf(this.d));
                if (this.d == 1) {
                    memberCouponProvider.b(i, obj);
                    return;
                } else {
                    LogUtil.j("MemberCouponProvider", "GetAssetInfoResponseCallback error type ");
                    return;
                }
            }
            LogUtil.j("MemberCouponProvider", "personalCenterFragment is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj) {
        LogUtil.a("MemberCouponProvider", "enter dealCouponInfo");
        List<Coupon> arrayList = new ArrayList();
        if (i == 0 && (obj instanceof List)) {
            LogUtil.a("MemberCouponProvider", "dealReceiveInfo errorCode:", Integer.valueOf(i), "objData:", obj);
            arrayList = (List) obj;
        }
        if (njy.e(arrayList)) {
            setIsActive(false);
            this.f.sendEmptyMessage(1);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        this.f28891b = new ArrayList();
        this.d = new ArrayList();
        this.f28890a = new ArrayList();
        this.f28892c = new ArrayList();
        Collections.sort(arrayList, new Comparator<Coupon>() { // from class: com.huawei.ui.main.stories.soical.member.MemberCouponProvider.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Coupon coupon, Coupon coupon2) {
                if (coupon.getStatus() != coupon2.getStatus()) {
                    return coupon.getStatus() - coupon2.getStatus();
                }
                return coupon2.getWeight() - coupon.getWeight();
            }
        });
        for (Coupon coupon : arrayList) {
            if (coupon != null && coupon.getStatus() != 2 && coupon.getStatus() != 3 && !coupon.isOutOfStockFlag() && coupon.isVipFlag()) {
                this.d.add(coupon.getCouponId());
                this.f28890a.add(Integer.valueOf(coupon.getStatus()));
                arrayList2.add(101);
                arrayList6.add("¥");
                int feeMode = coupon.getFeeMode();
                if (feeMode == 0) {
                    arrayList3.add(String.valueOf(Integer.valueOf(coupon.getFaceValue()).intValue() / 100));
                } else if (feeMode == 1) {
                    arrayList3.add(String.valueOf(Integer.valueOf(coupon.getSubFee()).intValue() / 100));
                } else if (feeMode == 2) {
                    arrayList3.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_discount_amount), String.valueOf(Integer.valueOf(coupon.getDiscount()).intValue() * 10)));
                }
                arrayList4.add(coupon.getCouponName());
                arrayList5.add(ContextCompat.getDrawable(this.h, R.drawable.pic_coupon_2_xxxhdpi));
                int status = coupon.getStatus();
                if (status == 0) {
                    this.f28891b.add(this.h.getResources().getString(R.string.IDS_vip_claim_now));
                    this.f28892c.add(this.g);
                } else if (status == 1) {
                    this.f28891b.add(this.h.getResources().getString(R.string.IDS_vip_go_to_use));
                    this.f28892c.add(this.i);
                }
            }
        }
        if (njy.e(this.d)) {
            setIsActive(false);
            this.f.sendEmptyMessage(1);
            return;
        }
        this.e = arrayList4;
        this.n.put("COMMON_CLICK_EVENT", new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.member.MemberCouponProvider.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addPath("#/Coupons");
                ddv.b().loadH5ProApp(com.huawei.haf.application.BaseApplication.b(), "com.huawei.health.h5.assets", builder);
            }
        });
        this.n.put("ITEM_VIEW_TYPE", arrayList2);
        this.n.put("ITEM_TITLE", arrayList3);
        this.n.put("ITEM_DESCRIPTION", arrayList4);
        this.n.put("ITEM_STATUS_BACKGROUND", arrayList5);
        this.n.put("ITEM_PAGE_ATTRIBUTE", arrayList6);
        this.n.put("ITEM_JOIN_NUMBER", this.f28891b);
        this.n.put("CLICK_EVENT_LISTENER", this.f28892c);
        this.f.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final List<String> list) {
        final a aVar = new a(this, 2);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.soical.member.MemberCouponProvider.6
            @Override // java.lang.Runnable
            public void run() {
                ((PayApi) Services.d("TradeService", PayApi.class)).receiveCouponList(list, aVar);
            }
        });
    }
}
