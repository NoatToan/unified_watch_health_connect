package com.huawei.health.tradeservice.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.activity.TradeSureOrderActivity;
import com.huawei.health.tradeservice.cloud.ProductManager;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.trade.datatype.ProductSummary;
import com.huawei.trade.datatype.TimeLimitedPromotion;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ddv;
import defpackage.ilx;
import defpackage.ily;
import defpackage.imb;
import defpackage.irz;
import defpackage.isa;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qjs;
import defpackage.qqp;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes32.dex */
public class TradeInformationLayout extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10286a;
    private ProductSummary aa;
    private HealthButton ab;
    private View ac;
    private View ad;
    private HealthTextView ae;
    private RelativeLayout af;
    private HealthTextView ag;
    private HealthTextView ah;
    private String ai;
    private String aj;
    private String ak;
    private ProductSummary al;
    private String am;
    private HealthTextView an;
    private View ao;
    private int ap;
    private String aq;
    private ilx ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f10287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f10288c;
    private HealthTextView d;
    private Map<String, String> e;
    private HealthButton f;
    private Context g;
    private HealthTextView h;
    private String i;
    private View j;
    private CountDownLatch k;
    private String l;
    private LinearLayout m;
    private HealthDivider n;
    private HealthTextView o;
    private boolean p;
    private boolean q;
    private boolean r;
    private HealthTextView s;
    private Handler t;
    private HealthTextView u;
    private boolean v;
    private TextView w;
    private HealthTextView x;
    private View y;
    private HealthTextView z;

    static class c extends BaseHandler<TradeInformationLayout> {
        c(TradeInformationLayout tradeInformationLayout) {
            super(tradeInformationLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TradeInformationLayout tradeInformationLayout, Message message) {
            int i = message.what;
            if (i == 1107) {
                tradeInformationLayout.i();
                tradeInformationLayout.f();
                tradeInformationLayout.ac.setVisibility(8);
                tradeInformationLayout.y.setVisibility(0);
                return;
            }
            if (i != 1108) {
                switch (i) {
                    case 1101:
                        tradeInformationLayout.h();
                        tradeInformationLayout.ad.setVisibility(0);
                        break;
                    case 1102:
                        tradeInformationLayout.ao.setVisibility(8);
                        break;
                    case 1103:
                        if (tradeInformationLayout.q) {
                            tradeInformationLayout.b(tradeInformationLayout.ak, tradeInformationLayout.ap);
                        } else {
                            tradeInformationLayout.d(tradeInformationLayout.am);
                        }
                        break;
                    default:
                        LogUtil.j("TradeInformationLayout", "handleMessageWhenReferenceNotNull not match ");
                        break;
                }
                return;
            }
            tradeInformationLayout.g();
            tradeInformationLayout.y.setVisibility(8);
            tradeInformationLayout.ac.setVisibility(0);
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TradeInformationLayout> f10290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10291c;

        e(TradeInformationLayout tradeInformationLayout, int i) {
            this.f10290b = new WeakReference<>(tradeInformationLayout);
            this.f10291c = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TradeInformationLayout tradeInformationLayout = this.f10290b.get();
            if (tradeInformationLayout != null) {
                Handler handler = tradeInformationLayout.t;
                if (handler == null) {
                    LogUtil.j("TradeInformationLayout", "handler is null");
                    return;
                }
                int i2 = this.f10291c;
                if (i2 == 1) {
                    tradeInformationLayout.b(i, obj);
                    return;
                }
                if (i2 != 2) {
                    return;
                }
                if (i != 0 || !(obj instanceof List)) {
                    LogUtil.j("TradeInformationLayout", "getProductSummaryInfo fail errorCode = ", Integer.valueOf(i));
                    handler.sendEmptyMessage(1102);
                    return;
                } else {
                    LogUtil.a("TradeInformationLayout", "getProductSummaryInfo success");
                    tradeInformationLayout.c((List<ProductSummary>) obj);
                    return;
                }
            }
            LogUtil.j("TradeInformationLayout", "TradeInformationLayout is null");
        }
    }

    public TradeInformationLayout(Context context, String str, int i) {
        super(context);
        this.p = false;
        this.r = false;
        this.q = true;
        this.v = false;
        LogUtil.a("TradeInformationLayout", "TradeInformationLayout enter by resId");
        this.q = true;
        this.g = context;
        this.ak = str;
        this.ap = i;
        if (context == null) {
            this.g = BaseApplication.getContext();
        }
        this.t = new c(this);
        d();
        if (e()) {
            LogUtil.a("TradeInformationLayout", "is kid account resource");
        } else {
            b(str, i);
        }
    }

    public TradeInformationLayout(Context context, TradeViewInfo tradeViewInfo) {
        super(context);
        this.p = false;
        this.r = false;
        this.q = true;
        this.v = false;
        LogUtil.a("TradeInformationLayout", "TradeInformationLayout enter by tradeViweInfoString");
        if (tradeViewInfo == null) {
            LogUtil.j("TradeInformationLayout", "mTradeViewInfo is null");
            return;
        }
        this.g = context;
        if (context == null) {
            this.g = BaseApplication.getContext();
        }
        this.t = new c(this);
        d();
        if (e()) {
            LogUtil.a("TradeInformationLayout", "is kid account produce");
            return;
        }
        this.e = tradeViewInfo.getBiParams();
        if (!TextUtils.isEmpty(tradeViewInfo.getResId())) {
            this.q = true;
            this.ak = tradeViewInfo.getResId();
            this.ap = tradeViewInfo.getResType();
            this.i = tradeViewInfo.getButtonName();
            this.aq = tradeViewInfo.getTrigResName();
            b(this.ak, this.ap);
            return;
        }
        if (!TextUtils.isEmpty(tradeViewInfo.getProductId())) {
            this.q = false;
            this.am = tradeViewInfo.getProductId();
            this.ai = tradeViewInfo.getPositionId();
            this.l = tradeViewInfo.getFromPageTitle();
            d(this.am);
            return;
        }
        LogUtil.j("TradeInformationLayout", "resId or productId is empty");
    }

    private boolean e() {
        boolean z = false;
        if (!VersionControlUtil.isSupportOperationAccount()) {
            this.ad.setVisibility(0);
            this.j.setVisibility(8);
            this.h.setVisibility(0);
            z = true;
        } else {
            this.j.setVisibility(0);
            this.h.setVisibility(8);
        }
        LogUtil.a("TradeInformationLayout", "isKidAccount:", Boolean.valueOf(z));
        return z;
    }

    private void d() {
        if (qrs.u() || qrs.a(BaseApplication.getContext(), 3.5f)) {
            this.ao = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.trade_info_all_large, this);
        } else {
            this.ao = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.trade_info_all, this);
        }
        this.s = (HealthTextView) this.ao.findViewById(R.id.tv_hava_giveaway);
        this.an = (HealthTextView) this.ao.findViewById(R.id.tv_pay_price);
        this.o = (HealthTextView) this.ao.findViewById(R.id.tv_end_time);
        this.x = (HealthTextView) this.ao.findViewById(R.id.tv_lin_price);
        this.o.setMovementMethod(ScrollingMovementMethod.getInstance());
        HealthButton healthButton = (HealthButton) this.ao.findViewById(R.id.btn_submit);
        this.f = healthButton;
        healthButton.setOnClickListener(this);
        this.j = this.ao.findViewById(R.id.content_layout);
        this.h = (HealthTextView) this.ao.findViewById(R.id.tv_child);
        this.m = (LinearLayout) this.ao.findViewById(R.id.lin_countdown);
        this.n = (HealthDivider) this.ao.findViewById(R.id.divider);
        this.ad = this.ao.findViewById(R.id.layout_normal);
        this.ac = this.ao.findViewById(R.id.layout_member);
        this.y = this.ao.findViewById(R.id.layout_member_and_not);
        this.ag = (HealthTextView) this.ao.findViewById(R.id.tv_not_member_price);
        this.ah = (HealthTextView) this.ao.findViewById(R.id.tv_not_member_lin_price);
        this.ae = (HealthTextView) this.ao.findViewById(R.id.tv_not_member_describe);
        RelativeLayout relativeLayout = (RelativeLayout) this.ao.findViewById(R.id.rl_not_memeber);
        this.af = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.d = (HealthTextView) this.ao.findViewById(R.id.tv_be_member_price);
        this.f10286a = (HealthTextView) this.ao.findViewById(R.id.tv_be_member_lin_price);
        this.f10288c = (HealthTextView) this.ao.findViewById(R.id.tv_be_member_describe);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.ao.findViewById(R.id.rl_be_memeber);
        this.f10287b = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        this.z = (HealthTextView) this.ao.findViewById(R.id.tv_member_price);
        this.w = (TextView) this.ao.findViewById(R.id.tv_member_line_price);
        this.u = (HealthTextView) this.ao.findViewById(R.id.tv_member_description);
        HealthButton healthButton2 = (HealthButton) this.ao.findViewById(R.id.btn_member_submit);
        this.ab = healthButton2;
        healthButton2.setOnClickListener(this);
        k();
        n();
    }

    private void k() {
        if (qrs.af(this.g)) {
            ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
            layoutParams.width = qjs.e(3, 5);
            this.y.setLayoutParams(layoutParams);
            this.ac.setPadding(qqp.a(this.g, 110.0f), qqp.a(this.g, 8.0f), qqp.a(this.g, 110.0f), qqp.a(this.g, 8.0f));
        }
    }

    private void n() {
        if (LanguageUtil.ba(com.huawei.haf.application.BaseApplication.b())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{d(22.0f), d(22.0f), 0.0f, 0.0f, 0.0f, 0.0f, d(22.0f), d(22.0f)});
            gradientDrawable.setColor(ContextCompat.getColor(this.g, R.color.color_4a4640));
            this.f10287b.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, d(22.0f), d(22.0f), d(22.0f), d(22.0f), 0.0f, 0.0f});
            gradientDrawable2.setColor(ContextCompat.getColor(this.g, R.color.not_member_background));
            this.af.setBackground(gradientDrawable2);
            return;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadii(new float[]{0.0f, 0.0f, d(22.0f), d(22.0f), d(22.0f), d(22.0f), 0.0f, 0.0f});
        gradientDrawable3.setColor(ContextCompat.getColor(this.g, R.color.color_4a4640));
        this.f10287b.setBackground(gradientDrawable3);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadii(new float[]{d(22.0f), d(22.0f), 0.0f, 0.0f, 0.0f, 0.0f, d(22.0f), d(22.0f)});
        gradientDrawable4.setColor(ContextCompat.getColor(this.g, R.color.not_member_background));
        this.af.setBackground(gradientDrawable4);
    }

    private void setAlignment(boolean z) {
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10287b.getLayoutParams();
            layoutParams.addRule(8, R.id.rl_not_memeber);
            layoutParams.addRule(6, R.id.rl_not_memeber);
            this.f10287b.setLayoutParams(layoutParams);
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
        layoutParams2.addRule(8, R.id.rl_be_memeber);
        layoutParams2.addRule(6, R.id.rl_be_memeber);
        this.af.setLayoutParams(layoutParams2);
    }

    private static int d(float f) {
        return qrs.d(BaseApplication.getContext(), f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("TradeInformationLayout", "onClick view is null");
            return;
        }
        int id = view.getId();
        if (id == R.id.btn_submit) {
            e(this.al);
            this.aj = "-1";
            b(AnalyticsValue.TRADE_BUY.value(), this.al.getMicroPrice());
            return;
        }
        if (id == R.id.rl_not_memeber) {
            e(this.al);
            this.aj = "-1";
            b(AnalyticsValue.TRADE_BUY.value(), this.al.getMicroPrice());
        } else if (id == R.id.rl_be_memeber) {
            a();
            this.aj = "1";
            b(AnalyticsValue.TRADE_BUY.value(), this.aa.getMicroPrice());
        } else {
            if (id != R.id.btn_member_submit) {
                LogUtil.j("TradeInformationLayout", "onClick not match");
                return;
            }
            e(this.aa);
            this.aj = "1";
            b(AnalyticsValue.TRADE_BUY.value(), this.aa.getMicroPrice());
        }
    }

    public void a() {
        String str;
        if (isa.d()) {
            if (this.e == null) {
                str = "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&path=MemberCenter&currentBenefit=1&benefitList=%5B1%5D";
            } else {
                str = "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&path=MemberCenter&currentBenefit=1&benefitList=%5B1%5D&pullfrom=" + this.e.get(WebViewHelp.BI_KEY_PULL_FROM) + "&resourceId=" + this.e.get("resourceId") + "&resourceName=" + this.e.get("resourceName") + "&pullOrder=" + this.e.get("pullOrder");
            }
            AppRouter.e(Uri.parse((str + "&popUpTypeSelect=true") + "&trigResMemberPrice=1&trigResType=" + this.ap + "&trigResName=" + this.aq)).b(this.g);
            return;
        }
        H5ProLaunchOption.Builder builderAddPath = new H5ProLaunchOption.Builder().addPath(irz.e("from=9&trigResMemberPrice=1&trigResType=" + this.ap + "&trigResName=" + this.aq));
        Map<String, String> map = this.e;
        if (map != null) {
            builderAddPath.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, map.get(WebViewHelp.BI_KEY_PULL_FROM)).addGlobalBiParam("resourceId", this.e.get("resourceId")).addGlobalBiParam("resourceName", this.e.get("resourceName")).addGlobalBiParam("pullOrder", this.e.get("pullOrder"));
        }
        ddv.b().loadH5ProApp(this.g, "com.huawei.health.h5.vip", builderAddPath);
    }

    private void e(ProductSummary productSummary) {
        if (productSummary == null) {
            LogUtil.j("TradeInformationLayout", "onClick productSummary = null");
            return;
        }
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(productSummary.getProductId());
        productInfo.setProductName(productSummary.getProductName());
        productInfo.setPurchasePolicy(productSummary.getPurchasePolicy());
        productInfo.setResourceType(this.ap);
        productInfo.setLinkType(productSummary.getLinkType());
        productInfo.setLinkValue(productSummary.getLinkValue());
        Map<String, String> map = this.e;
        if (map != null) {
            productInfo.setBiParams(map);
        }
        String json = new Gson().toJson(productInfo);
        LogUtil.a("TradeInformationLayout", "skipByResourceId productInfoString = ", json);
        if (this.r) {
            Intent intent = new Intent(this.g, (Class<?>) TradeSureOrderActivity.class);
            intent.putExtra("productId", productSummary.getProductId());
            intent.putExtra("productInfo", json);
            intent.setFlags(268435456);
            BaseApplication.getContext().startActivity(intent);
            return;
        }
        e(json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        ProductManager.getProductDetails(str, new e(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj) {
        if (i != 0 || !(obj instanceof Product)) {
            LogUtil.j("TradeInformationLayout", "getProductSummaryInfo fail errorCode = ", Integer.valueOf(i));
            this.t.sendEmptyMessage(1102);
            return;
        }
        LogUtil.a("TradeInformationLayout", "getProductSummaryInfo success");
        Product product = (Product) obj;
        LogUtil.a("TradeInformationLayout", product.toString());
        this.al = d(product);
        b(AnalyticsValue.TRADE_OFFERING_DETAIL.value(), this.al.getMicroPrice());
        this.ap = product.getResourceType();
        LogUtil.a("TradeInformationLayout", this.al.toString());
        this.t.sendEmptyMessage(1101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i) {
        this.k = new CountDownLatch(1);
        c(false);
        ProductManager.getProductSummaryInfo(str, i, new e(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ProductSummary> list) {
        if (njy.e(list)) {
            LogUtil.j("TradeInformationLayout", "productSummaries is empty");
            this.ao.setVisibility(8);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ProductSummary productSummary : list) {
            if (productSummary.isMemberFlag()) {
                arrayList.add(productSummary);
            } else {
                arrayList2.add(productSummary);
            }
        }
        if (njy.e(arrayList2)) {
            this.t.sendEmptyMessage(1102);
            LogUtil.j("TradeInformationLayout", "normalProductSummaries is empty");
            return;
        }
        e(arrayList2);
        this.al = (ProductSummary) arrayList2.get(0);
        b(AnalyticsValue.TRADE_OFFERING_DETAIL.value(), this.al.getMicroPrice());
        if (njy.e(arrayList)) {
            this.t.sendEmptyMessage(1101);
            LogUtil.a("TradeInformationLayout", "not have memberPrice");
            return;
        }
        e(arrayList);
        try {
            LogUtil.a("TradeInformationLayout", "wait:", Boolean.valueOf(this.k.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("TradeInformationLayout", "await InterruptedException");
        }
        if (this.v) {
            this.aa = (ProductSummary) arrayList.get(0);
            this.t.sendEmptyMessage(1108);
        } else {
            this.aa = (ProductSummary) arrayList.get(0);
            this.t.sendEmptyMessage(ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED);
        }
    }

    private static List<ProductSummary> e(List<ProductSummary> list) {
        Collections.sort(list, new Comparator() { // from class: ilz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((ProductSummary) obj2).getPriority(), ((ProductSummary) obj).getPriority());
            }
        });
        return list;
    }

    private void c(boolean z) {
        LogUtil.a("TradeInformationLayout", "getVipInfo start");
        ThreadPoolManager.c().execute(new b(this, z));
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<TradeInformationLayout> f10289c;
        boolean e;

        b(TradeInformationLayout tradeInformationLayout, boolean z) {
            this.f10289c = new WeakReference<>(tradeInformationLayout);
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: com.huawei.health.tradeservice.view.TradeInformationLayout.b.3
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    if (b.this.f10289c.get() == null) {
                        LogUtil.j("TradeInformationLayout", "trade layout is destroyed");
                        return;
                    }
                    TradeInformationLayout tradeInformationLayout = b.this.f10289c.get();
                    if (obj == null) {
                        LogUtil.j("TradeInformationLayout", "getVipInfo onSuccess result is null");
                        tradeInformationLayout.k.countDown();
                        return;
                    }
                    if (obj instanceof UserMemberInfo) {
                        UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
                        LogUtil.d("TradeInformationLayout", "getVipInfo mUserMemberInfo = ", userMemberInfo.toString());
                        boolean z = false;
                        if (b.this.e) {
                            LogUtil.a("TradeInformationLayout", "do refresh");
                            if (userMemberInfo.getMemberFlag() == 1 && !irz.d(userMemberInfo)) {
                                z = true;
                            }
                            if (tradeInformationLayout.v == z) {
                                LogUtil.a("TradeInformationLayout", "memberStatus not change");
                                return;
                            } else if (z) {
                                tradeInformationLayout.t.sendEmptyMessage(1108);
                                return;
                            } else {
                                tradeInformationLayout.t.sendEmptyMessage(ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED);
                                return;
                            }
                        }
                        if (userMemberInfo.getMemberFlag() == 1 && !irz.d(userMemberInfo)) {
                            z = true;
                        }
                        tradeInformationLayout.v = z;
                    }
                    tradeInformationLayout.k.countDown();
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                    if (b.this.f10289c.get() != null) {
                        b.this.f10289c.get().k.countDown();
                    }
                    LogUtil.j("TradeInformationLayout", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                }
            });
        }
    }

    private ProductSummary d(Product product) {
        LogUtil.a("TradeInformationLayout", "setProductSummaryData");
        ProductSummary productSummary = new ProductSummary();
        productSummary.setCurrency(product.getCurrency());
        productSummary.setMicroPrice(product.getMicroPrice());
        productSummary.setNowTime(product.getNowTime());
        productSummary.setSaleTime(product.getSaleTime());
        productSummary.setPromotion(product.getPromotion());
        productSummary.setProductName(product.getProductName());
        productSummary.setProductId(this.am);
        productSummary.setPurchasePolicy(product.getPurchasePolicy());
        productSummary.setMemberPriceRetentionVisibility(product.isMemberPriceRetentionVisibility());
        productSummary.setMemberPriceRetentionDesc(product.getMemberPriceRetentionDesc());
        productSummary.setLinkType(product.getLinkType());
        productSummary.setLinkValue(product.getLinkValue());
        List<Product> giveaways = product.getGiveaways();
        if (njy.b(giveaways)) {
            Iterator<Product> it = giveaways.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().getAttachType(), "giveaway")) {
                    productSummary.setGiveawaysExist(1);
                    break;
                }
            }
        }
        return productSummary;
    }

    private void e(String str) {
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j("TradeInformationLayout", "activity = null");
        } else {
            ((PayApi) Services.d("TradeService", PayApi.class)).buyByProductId(activity, 0, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ProductSummary productSummary = this.aa;
        if (productSummary == null) {
            LogUtil.j("TradeInformationLayout", "mMemberProductSummary = null");
            this.ao.setVisibility(8);
            return;
        }
        String currency = productSummary.getCurrency();
        this.d.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_member_price), ily.c(currency, this.aa.getMicroPrice() / 1000000.0f)));
        String priceDesc = this.aa.getPriceDesc();
        if (!TextUtils.isEmpty(priceDesc)) {
            this.f10288c.setText(priceDesc);
            this.f10288c.setVisibility(0);
        }
        TimeLimitedPromotion promotion = this.aa.getPromotion();
        if (promotion == null) {
            LogUtil.a("TradeInformationLayout", "timeLimitedPromotion is null , not need show");
            return;
        }
        this.f10286a.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_original_price), ily.c(currency, promotion.getMicroOriginPrice() / 1000000.0f)));
        this.f10286a.getPaint().setFlags(16);
        this.f10286a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        long microPrice;
        if (this.aa == null) {
            LogUtil.j("TradeInformationLayout", "mMemberProductSummary = null");
            this.ao.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.ab.setText(this.i);
        }
        String currency = this.aa.getCurrency();
        this.z.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_member_price), ily.c(currency, this.aa.getMicroPrice() / 1000000.0f)));
        TimeLimitedPromotion promotion = this.al.getPromotion();
        if (promotion != null && promotion.getMicroOriginPrice() > 0) {
            microPrice = promotion.getMicroOriginPrice();
        } else {
            microPrice = this.al.getMicroPrice();
        }
        this.w.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_original_price), ily.c(currency, microPrice / 1000000.0f)));
        this.w.getPaint().setFlags(16);
        this.w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ProductSummary productSummary = this.al;
        if (productSummary == null) {
            LogUtil.j("TradeInformationLayout", "refreshNotMemberUiByResource mProductSummary = null");
            this.ao.setVisibility(8);
            return;
        }
        String currency = productSummary.getCurrency();
        this.ag.setText(ily.c(currency, this.al.getMicroPrice() / 1000000.0f));
        String priceDesc = this.al.getPriceDesc();
        if (!TextUtils.isEmpty(priceDesc)) {
            this.ae.setText(priceDesc);
            this.ae.setVisibility(0);
            setAlignment(true);
        } else {
            setAlignment(false);
        }
        TimeLimitedPromotion promotion = this.al.getPromotion();
        if (promotion == null) {
            LogUtil.a("TradeInformationLayout", "timeLimitedPromotion is null , not need show");
            return;
        }
        this.ah.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(com.huawei.health.servicesapi.R.string.IDS_original_price), ily.c(currency, promotion.getMicroOriginPrice() / 1000000.0f)));
        this.ah.getPaint().setFlags(16);
        this.ah.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.al == null) {
            LogUtil.j("TradeInformationLayout", "mProductSummary = null");
            this.ao.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.f.setText(this.i);
        }
        String currency = this.al.getCurrency();
        ily.b(ily.c(currency, this.al.getMicroPrice() / 1000000.0f), ily.e(currency), this.an);
        if (this.al.getGiveawaysExist() == 1) {
            this.r = true;
            this.s.setVisibility(0);
        } else {
            this.r = false;
            this.s.setVisibility(8);
        }
        c(currency);
    }

    private void c(String str) {
        this.m.setVisibility(8);
        this.n.setVisibility(0);
        TimeLimitedPromotion promotion = this.al.getPromotion();
        if (promotion != null && promotion.getMicroOriginPrice() > 0) {
            this.x.setText(ily.c(str, promotion.getMicroOriginPrice() / 1000000.0f));
            this.x.getPaint().setFlags(16);
        }
        if (this.al.getSaleTime() - this.al.getNowTime() > 0) {
            this.m.setVisibility(0);
            this.n.setVisibility(8);
            this.p = false;
            String strD = UnitUtil.d("yyyy/MM/dd HH:mm:ss", this.al.getSaleTime());
            ily.a(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_expected_sale), strD), strD, this.o, R.color.emui_accent);
        } else {
            this.p = true;
            if (promotion == null) {
                this.f.setVisibility(0);
                LogUtil.a("TradeInformationLayout", "timeLimitedPromotion = null");
                return;
            }
            long promotionEndTime = promotion.getPromotionEndTime() - this.al.getNowTime();
            if (promotionEndTime > 0) {
                this.m.setVisibility(0);
                this.n.setVisibility(8);
                ilx ilxVar = new ilx(this.t, this.o, promotionEndTime);
                this.ar = ilxVar;
                ilxVar.d();
            }
        }
        j();
        this.f.setVisibility(0);
    }

    private void j() {
        if (this.p) {
            this.f.setClickable(true);
            LogUtil.a("TradeInformationLayout", "isCanPay is true");
        } else {
            this.f.setClickable(false);
            this.f.setBackgroundResource(R.drawable.trade_not_able_button);
            this.f.setTextColor(this.g.getResources().getColor(R.color.emui_color_fg_inverse_disable));
        }
    }

    private void b(String str, long j) {
        if (this.al == null) {
            LogUtil.j("TradeInformationLayout", "mProductSummary = null");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", String.valueOf(this.ap));
        map.put("name", this.al.getProductName());
        map.put(ParsedFieldTag.PRICE, String.valueOf(j / 1000000.0f));
        map.put("id", this.al.getProductId());
        MarketingBiUtils.d(map, this.e);
        if (!TextUtils.isEmpty(this.ai)) {
            map.put("resourcePositionId", this.ai);
        }
        if (!TextUtils.isEmpty(this.l)) {
            map.put("fromPageTitle", this.l);
        }
        if (!TextUtils.isEmpty(this.aj)) {
            map.put("priceType", this.aj);
        }
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), str, map, 0);
    }

    public void b() {
        ilx ilxVar = this.ar;
        if (ilxVar != null) {
            ilxVar.a();
        }
    }

    public void c() {
        if (this.al != null) {
            c(true);
        } else {
            LogUtil.a("TradeInformationLayout", "not need refresh");
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        ProductSummary productSummary;
        String accountInfo = LoginInit.getInstance(this.g).getAccountInfo(1011);
        long jD = SharedPreferenceManager.d(String.valueOf(101010), accountInfo + "back_intercept", 0L);
        if (!this.v && (productSummary = this.aa) != null && productSummary.isMemberPriceRetentionVisibility() && !qrk.b(jD, System.currentTimeMillis())) {
            new imb(this.g, this, iBaseResponseCallback, this.aa, this.al).show();
            ily.d(1, this.g);
            SharedPreferenceManager.c(String.valueOf(101010), accountInfo + "back_intercept", System.currentTimeMillis());
            return;
        }
        iBaseResponseCallback.a(0, null);
    }
}
