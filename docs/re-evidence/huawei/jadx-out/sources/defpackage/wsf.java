package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.AwardRecordsBean;
import com.huawei.trade.datatype.Coupon;
import com.huawei.trade.datatype.GiftCard;
import com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wsf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f52397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f52398c;
    private String d;
    private final PersonalCenterUiApi g;
    private boolean i = false;
    private boolean e = false;
    private boolean h = false;

    public wsf(PersonalCenterFragment personalCenterFragment, Handler handler) {
        this.g = personalCenterFragment;
        this.f52397b = handler;
    }

    public String b() {
        return this.f52396a;
    }

    public String d() {
        return this.d;
    }

    public String a() {
        return this.f52398c;
    }

    public boolean e() {
        return this.h;
    }

    static class d implements IBaseResponseCallback {
        private final int d;
        private final WeakReference<wsf> e;

        d(wsf wsfVar, int i) {
            this.e = new WeakReference<>(wsfVar);
            this.d = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            wsf wsfVar = this.e.get();
            if (wsfVar == null) {
                LogUtil.j("MyAssetItemManager", "personalCenterFragment is null");
            }
            LogUtil.a("MyAssetItemManager", "GetAssetInfoResponseCallback errorCode = ", Integer.valueOf(i), " mResultType = ", Integer.valueOf(this.d));
            switch (this.d) {
                case 11:
                    if (i != 0 || !(obj instanceof List)) {
                        LogUtil.j("MyAssetItemManager", "assetMsgListQuery fail:", Integer.valueOf(i));
                    } else {
                        wsfVar.g.dealAssetMessage((List) obj);
                    }
                    break;
                case 12:
                    if (i == 0 && (obj instanceof List)) {
                        wsfVar.e((List<Coupon>) obj);
                    } else {
                        LogUtil.j("MyAssetItemManager", "couponListQuery fail:", Integer.valueOf(i));
                    }
                    wsfVar.i = true;
                    wsfVar.f();
                    break;
                case 13:
                    if (i == 0 && (obj instanceof List)) {
                        wsfVar.c((List) obj);
                    } else {
                        LogUtil.j("MyAssetItemManager", "giftCardListQuery fail:", Integer.valueOf(i));
                    }
                    wsfVar.e = true;
                    wsfVar.f();
                    break;
                case 14:
                    wsf.a(i, obj, wsfVar);
                    break;
                default:
                    LogUtil.j("MyAssetItemManager", "GetAssetInfoResponseCallback error type ");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i, Object obj, wsf wsfVar) {
        if (i == 0 && (obj instanceof List)) {
            wsfVar.d((List<AwardRecordsBean>) obj);
        } else {
            LogUtil.j("MyAssetItemManager", "awardQuery fail:", Integer.valueOf(i));
        }
        wsfVar.e = true;
        wsfVar.f();
    }

    public void c() {
        LogUtil.a("MyAssetItemManager", "getAssetsInfo start");
        i();
        final d dVar = new d(this, 11);
        final d dVar2 = new d(this, 13);
        final d dVar3 = new d(this, 12);
        final d dVar4 = new d(this, 14);
        ThreadPoolManager.c().execute(new Runnable() { // from class: wsm
            @Override // java.lang.Runnable
            public final void run() {
                wsf.a(dVar, dVar2, dVar3, dVar4);
            }
        });
    }

    static /* synthetic */ void a(d dVar, d dVar2, d dVar3, d dVar4) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.a("MyAssetItemManager", "getAssetsInfo payApi is null");
            return;
        }
        payApi.assetMsgListQuery(50, System.currentTimeMillis(), dVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        payApi.giftCardListQuery(arrayList, dVar2);
        payApi.couponListQuery(arrayList, null, dVar3);
        payApi.awardListQuery(dVar4);
    }

    public void g() {
        if (ActiveTipStringUtils.c()) {
            ttn.d(new ResultCallback<tth>() { // from class: wsf.2
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(tth tthVar) {
                    ReleaseLogUtil.d("MyAssetItemManager", "queryPointsNewAdd with ", Integer.valueOf(tthVar.b()));
                    wsf.this.h = tthVar.b() == 1;
                    if (wsf.this.f52397b != null) {
                        if (wsf.this.h) {
                            wsf.this.f52397b.sendMessage(wsf.this.f52397b.obtainMessage(a.L, true));
                            return;
                        } else {
                            wsf.this.f();
                            return;
                        }
                    }
                    LogUtil.e("MyAssetItemManager", "mHandler is null in queryPointsNewAdd");
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.a("MyAssetItemManager", "queryPointsNewAdd failure ", th == null ? null : th.getMessage());
                }
            });
        }
    }

    private void i() {
        this.d = "";
        this.f52396a = "";
        this.f52398c = "";
        this.e = false;
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<Coupon> list) {
        if (njy.e(list)) {
            LogUtil.a("MyAssetItemManager", "coupons is empty");
            return;
        }
        LogUtil.a("MyAssetItemManager", "coupons size:", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        for (Coupon coupon : list) {
            if (coupon == null || coupon.isOutOfStockFlag() || !coupon.isShowToReceiveFlag()) {
                LogUtil.j("MyAssetItemManager", "coupon = null or coupon isOutOfStockFlag");
            } else if (TextUtils.isEmpty(coupon.getUserLabels())) {
                arrayList.add(coupon);
            } else if (marketingApi == null) {
                LogUtil.j("MyAssetItemManager", "marketingApi = null");
            } else if (marketingApi.isValidUserLabels(coupon.getUserLabels())) {
                arrayList.add(coupon);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("MyAssetItemManager", "myCoupon is empty");
            return;
        }
        LogUtil.a("MyAssetItemManager", "myCoupon size:", Integer.valueOf(arrayList.size()));
        List<Coupon> listB = b(arrayList);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        long jI = CommonUtil.i(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_coupon_time"));
        long createTime = listB.get(0).getCreateTime();
        LogUtil.a("MyAssetItemManager", "couponBeforeTime beforeTime:", Long.valueOf(jI), " createTime:", Long.valueOf(createTime));
        if (jI < createTime) {
            this.f52396a = Long.toString(createTime);
            Handler handler = this.f52397b;
            handler.sendMessage(handler.obtainMessage(a.L, true));
        } else {
            this.f52396a = "";
            LogUtil.a("MyAssetItemManager", "couponListQuery time equal");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<GiftCard> list) {
        if (njy.e(list)) {
            LogUtil.a("MyAssetItemManager", "giftCards is empty");
            return;
        }
        LogUtil.a("MyAssetItemManager", "giftCards size:", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        for (GiftCard giftCard : list) {
            if (giftCard == null || !giftCard.isShowToReceiveFlag()) {
                LogUtil.j("MyAssetItemManager", "giftCard not need show");
            } else if (TextUtils.isEmpty(giftCard.getUserLabels())) {
                arrayList.add(giftCard);
            } else if (marketingApi == null) {
                LogUtil.j("MyAssetItemManager", "dealCardCaseResult marketingApi = null");
            } else if (marketingApi.isValidUserLabels(giftCard.getUserLabels())) {
                arrayList.add(giftCard);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("MyAssetItemManager", "myGiftCards is empty");
            return;
        }
        LogUtil.a("MyAssetItemManager", "myGiftCards size:", Integer.valueOf(arrayList.size()));
        List<GiftCard> listF = f(arrayList);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        long jI = CommonUtil.i(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_card_time"));
        long createTime = listF.get(0).getCreateTime();
        LogUtil.a("MyAssetItemManager", "giftCardListQuery beforeTime:", Long.valueOf(jI), " createTime:", Long.valueOf(createTime));
        if (jI < createTime) {
            this.d = Long.toString(createTime);
            Handler handler = this.f52397b;
            handler.sendMessage(handler.obtainMessage(a.L, true));
        } else {
            this.d = "";
            LogUtil.a("MyAssetItemManager", "giftCardListQuery time equal");
        }
    }

    private void d(List<AwardRecordsBean> list) {
        if (njy.e(list)) {
            LogUtil.a("MyAssetItemManager", "giftCards is empty");
            return;
        }
        LogUtil.a("MyAssetItemManager", "awardRecordsBeans size:", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        for (AwardRecordsBean awardRecordsBean : list) {
            if (awardRecordsBean.getIsExpire() == 0) {
                arrayList.add(awardRecordsBean);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("MyAssetItemManager", "myAwardRecords is empty");
            return;
        }
        LogUtil.a("MyAssetItemManager", "myAwardRecords size:", Integer.valueOf(arrayList.size()));
        List<AwardRecordsBean> listA = a(arrayList);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        long jD = SharedPreferenceManager.d(Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_award_time", 0L);
        long wonTime = listA.get(0).getWonTime();
        LogUtil.a("MyAssetItemManager", "myAwardRecords beforeTime:", Long.valueOf(jD), " createTime:", Long.valueOf(wonTime));
        if (jD < wonTime) {
            this.f52398c = Long.toString(wonTime);
            Handler handler = this.f52397b;
            handler.sendMessage(handler.obtainMessage(a.L, true));
        } else {
            this.f52398c = "";
            LogUtil.a("MyAssetItemManager", "giftCardListQuery time equal");
        }
    }

    private static List<AwardRecordsBean> a(List<AwardRecordsBean> list) {
        Collections.sort(list, new Comparator() { // from class: wso
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((AwardRecordsBean) obj2).getWonTime(), ((AwardRecordsBean) obj).getWonTime());
            }
        });
        return list;
    }

    private static List<GiftCard> f(List<GiftCard> list) {
        Collections.sort(list, new Comparator() { // from class: wsj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((GiftCard) obj2).getCreateTime(), ((GiftCard) obj).getCreateTime());
            }
        });
        return list;
    }

    private static List<Coupon> b(List<Coupon> list) {
        Collections.sort(list, new Comparator() { // from class: wsh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((Coupon) obj2).getCreateTime(), ((Coupon) obj).getCreateTime());
            }
        });
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        boolean z = this.e;
        boolean z2 = this.i;
        LogUtil.a("MyAssetItemManager", "checkMyAssetRedPointGone:", "mIsHaveGetCardCartData:", Boolean.valueOf(z), " mIsHaveGetCouponData:", Boolean.valueOf(z2), " mCouponTime:", this.f52396a, " mCardCaseTime:", this.d, " mAwardTime:", this.f52398c, " mIsNewPoint:", Boolean.valueOf(this.h));
        if (this.e && this.i && TextUtils.isEmpty(this.f52396a) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.f52398c) && !this.h) {
            LogUtil.a("MyAssetItemManager", "set MyAsset red point gone");
            Handler handler = this.f52397b;
            handler.sendMessage(handler.obtainMessage(a.L, false));
        }
    }
}
