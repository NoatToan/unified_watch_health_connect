package com.huawei.health.tradeservice.activity;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.cloud.CardManager;
import com.huawei.health.tradeservice.cloud.OrderAudiosPackageRsq;
import com.huawei.health.tradeservice.cloud.OrderManager;
import com.huawei.health.tradeservice.cloud.ResourceManager;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.trade.datatype.OrderDetail;
import com.huawei.trade.datatype.ProductResourceInfo;
import com.huawei.trade.datatype.ResourceSkipAddr;
import com.huawei.trade.datatype.ResourceSummary;
import com.huawei.trade.datatype.ThirdCardInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ily;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TradeOrderDetailActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10245a;
    private int aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private ResourceSkipAddr ad;
    private LinearLayout ae;
    private String af;
    private ImageView ag;
    private HealthTextView ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10247c = false;
    private boolean d = false;
    private List<ThirdCardInfo> e;
    private HealthTextView f;
    private View g;
    private RelativeLayout h;
    private ImageView i;
    private Context j;
    private Handler k;
    private HealthTextView l;
    private CustomTitleBar m;
    private List<ProductResourceInfo> n;
    private ImageView o;
    private HealthTextView p;
    private HealthTextView q;
    private View r;
    private String s;
    private HealthTextView t;
    private HealthTextView u;
    private HealthTextView v;
    private ProductResourceInfo w;
    private HealthTextView x;
    private OrderDetail y;
    private HealthTextView z;

    /* JADX INFO: loaded from: classes9.dex */
    static class c extends BaseHandler<TradeOrderDetailActivity> {
        c(TradeOrderDetailActivity tradeOrderDetailActivity) {
            super(tradeOrderDetailActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TradeOrderDetailActivity tradeOrderDetailActivity, Message message) {
            int i = message.what;
            if (i == 1101) {
                tradeOrderDetailActivity.i();
                return;
            }
            if (i == 1102) {
                tradeOrderDetailActivity.m();
                return;
            }
            if (i == 1104) {
                tradeOrderDetailActivity.h();
            } else if (i == 1106) {
                tradeOrderDetailActivity.k();
            } else {
                LogUtil.j("TradeOrderDetailActivity", "handleMessageWhenReferenceNotNull not match ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ProductResourceInfo productResourceInfo) {
        ProductResourceInfo productResourceInfo2 = this.w;
        if (productResourceInfo2 == null) {
            LogUtil.j("TradeOrderDetailActivity", "TradeHandler activity.mProduct==null");
        } else {
            OrderManager.queryAudiosPackageBySeriesId(productResourceInfo2.getResourceId(), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("TradeOrderDetailActivity", "queryAudiosPackageBySeriesId onResponse");
                    if (obj == null) {
                        LogUtil.j("TradeOrderDetailActivity", "queryAudiosPackageBySeriesId objData == null");
                        return;
                    }
                    int enableNewUrl = 0;
                    if (obj instanceof OrderAudiosPackageRsq) {
                        ArrayList<OrderAudiosPackageRsq.SleepAudioSeries> packageList = ((OrderAudiosPackageRsq) obj).getPackageList();
                        if (njy.b(packageList) && packageList.get(0).getSleepAudioSeries() != null) {
                            enableNewUrl = packageList.get(0).getSleepAudioSeries().getEnableNewUrl();
                            LogUtil.a("TradeOrderDetailActivity", "enableNewUrl : ", Integer.valueOf(enableNewUrl));
                        }
                    }
                    ResourceSummary resourceSummary = new ResourceSummary();
                    resourceSummary.setResourceId(productResourceInfo.getResourceId());
                    resourceSummary.setResourceType(productResourceInfo.getResourceType());
                    if (enableNewUrl != 0) {
                        TradeOrderDetailActivity.this.ad = new ResourceSkipAddr();
                        TradeOrderDetailActivity.this.ad.setAddrType(1);
                        TradeOrderDetailActivity.this.ad.setAddr("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&showStatusBar&isImmerse&path=seriesCourse&type=" + resourceSummary.getResourceType() + "&id=" + resourceSummary.getResourceId());
                        TradeOrderDetailActivity.this.k.sendEmptyMessage(1106);
                        LogUtil.a("TradeOrderDetailActivity", "getSkipUrl is new enableNewUrl");
                        return;
                    }
                    ResourceManager.getResourceSkipAddr(resourceSummary, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.4.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj2) {
                            if (i2 == 0 && (obj2 instanceof ResourceSkipAddr)) {
                                TradeOrderDetailActivity.this.ad = (ResourceSkipAddr) obj2;
                                TradeOrderDetailActivity.this.k.sendEmptyMessage(1106);
                                return;
                            }
                            LogUtil.j("TradeOrderDetailActivity", "cardQueryInfo fail errorCode = ", Integer.valueOf(i2));
                        }
                    });
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CommonUtil.bg() && (isLargerThanEmui910(CommonUtil.p()) || CommonUtil.bc())) {
            getWindow().getDecorView().setSystemUiVisibility(9216);
            setStatusBarColor();
            setTranslucentStatus(getWindow());
        }
        if (qrs.u()) {
            setContentView(R.layout.activity_order_detail_large);
        } else {
            setContentView(R.layout.activity_order_detail);
        }
        clearBackgroundDrawable();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("TradeOrderDetailActivity", "intent = null");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("orderCode");
        this.s = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.a("TradeOrderDetailActivity", "mOrderCode is empty");
            finish();
            return;
        }
        LogUtil.a("TradeOrderDetailActivity", "mOrderCode:", this.s);
        this.f10246b = intent.getBooleanExtra("invoice", false);
        this.f10245a = intent.getBooleanExtra("pageFrom", false);
        this.k = new c(this);
        this.j = this;
        g();
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a();
    }

    private void d() {
        this.m.setTitleTextColor(this.j.getResources().getColor(R.color.emui_text_primary_inverse));
        if (LanguageUtil.ba(this.j)) {
            this.m.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
            this.i.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            LogUtil.a("TradeOrderDetailActivity", "setLeftButtonDrawable");
            this.m.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
        }
    }

    private void g() {
        this.ab = (HealthTextView) findViewById(R.id.tv_show_quantity);
        this.r = findViewById(R.id.rl_hint);
        this.p = (HealthTextView) findViewById(R.id.tv_hint);
        this.ae = (LinearLayout) findViewById(R.id.lin_content);
        f();
        this.ah = (HealthTextView) findViewById(R.id.tv_order_status);
        this.ac = (HealthTextView) findViewById(R.id.tv_order_detail);
        this.ag = (ImageView) findViewById(R.id.img_order_detail);
        View viewFindViewById = findViewById(R.id.lin_contact);
        this.g = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.o = (ImageView) findViewById(R.id.img_goods);
        this.z = (HealthTextView) findViewById(R.id.tv_show_price);
        this.f = (HealthTextView) findViewById(R.id.tv_class_name);
        this.x = (HealthTextView) findViewById(R.id.tv_order_number);
        this.v = (HealthTextView) findViewById(R.id.tv_order_time);
        this.u = (HealthTextView) findViewById(R.id.tv_pay_mode);
        this.m = (CustomTitleBar) findViewById(R.id.order_detail_title);
        this.h = (RelativeLayout) findViewById(R.id.rl_class_info);
        this.i = (ImageView) findViewById(R.id.img_contact);
        this.l = (HealthTextView) findViewById(R.id.tv_discount_amount);
        this.q = (HealthTextView) findViewById(R.id.tv_lin_price);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_apply_invoice);
        this.t = healthTextView;
        healthTextView.setOnClickListener(this);
    }

    private void a() {
        if (TextUtils.isEmpty(this.s)) {
            LogUtil.j("TradeOrderDetailActivity", "mOrderCode is empty");
            m();
        } else {
            OrderManager.orderQueryDetails(this.s, new d(this));
        }
    }

    private void c() {
        CardManager.cardQueryInfo(this.s, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.ab.setText(String.format(getString(R.string.IDS_quantity), 1));
        ProductResourceInfo productInfo = this.y.getProductInfo();
        this.w = productInfo;
        this.f.setText(productInfo.getProductName());
        qqf.a(this.w.getProductUrl(), this.o, (int) com.huawei.haf.application.BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusM));
        c(this.w.getResourceType());
        this.n = this.y.getGiveawaysInfo();
        e();
        double payPrice = this.y.getPayPrice() / 1000000.0f;
        String currency = this.y.getCurrency();
        double originPrice = this.y.getOriginPrice() / 1000000.0f;
        if (Math.abs(originPrice - payPrice) < 1.0E-6d) {
            this.q.setVisibility(8);
        } else {
            this.q.setText(ily.c(currency, originPrice));
            this.q.getPaint().setFlags(16);
        }
        double preference = this.y.getPreference() / 1000000.0f;
        if (preference < 1.0E-6d) {
            this.l.setVisibility(8);
        } else {
            this.l.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_discount_amount), ily.c(currency, preference)));
        }
        ily.a(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_order_number), this.y.getOrderId()), this.y.getOrderId(), this.x, R.color.textColorPrimary);
        String strB = b();
        ily.a(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_order_time), strB), strB, this.v, R.color.textColorPrimary);
        b(this.y.getState());
        a(currency, payPrice);
        if (this.f10246b) {
            o();
        } else {
            LogUtil.a("TradeOrderDetailActivity", "not need show invoice");
        }
        b("1");
    }

    private void o() {
        int invoiceStatus = this.y.getInvoiceStatus();
        this.aa = invoiceStatus;
        LogUtil.a("TradeOrderDetailActivity", "enter showInvoiceButton ", Integer.valueOf(invoiceStatus));
        switch (this.aa) {
            case 0:
                this.t.setText(BaseApplication.getContext().getString(R.string.IDS_apply_invoice));
                this.t.setVisibility(0);
                break;
            case 1:
            case 2:
            case 3:
                this.t.setText(BaseApplication.getContext().getString(R.string.IDS_view_invoice));
                this.t.setVisibility(0);
                break;
            case 4:
            case 5:
            case 6:
                this.t.setVisibility(8);
                break;
            default:
                this.t.setVisibility(8);
                LogUtil.a("TradeOrderDetailActivity", "status not support ", Integer.valueOf(this.aa));
                break;
        }
    }

    private String b() {
        if (LanguageUtil.bt(this.j) || LanguageUtil.br(this.j)) {
            return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Long.valueOf(this.y.getGenTime()));
        }
        if (LanguageUtil.aj(this.j)) {
            return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(Long.valueOf(this.y.getGenTime()));
        }
        return UnitUtil.d("yyyy/MM/dd HH:mm:ss", this.y.getGenTime());
    }

    private void a(String str, double d2) {
        String string;
        LogUtil.a("TradeOrderDetailActivity", "prefMode:", Integer.valueOf(this.y.getPrefMode()));
        if (this.y.getPrefMode() == 2 || this.y.getPrefMode() == 4) {
            string = BaseApplication.getContext().getString(R.string.IDS_redemption_code);
            this.z.setText(BaseApplication.getContext().getString(R.string.IDS_redeemed));
        } else if (this.y.getPrefMode() == 5) {
            string = BaseApplication.getContext().getString(R.string.IDS_portfolio_sales);
            this.z.setText(string);
        } else {
            String strC = ily.c(this.y.getPayType());
            this.z.setText(ily.c(str, d2));
            string = strC;
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("TradeOrderDetailActivity", "payType is empty");
            this.u.setVisibility(8);
        } else {
            this.u.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_pay_type), string));
        }
    }

    private void c(int i) {
        if (i == 3) {
            c();
            this.f10247c = true;
        } else {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (!TradeOrderDetailActivity.this.f10245a) {
                        TradeOrderDetailActivity.this.b("2");
                        TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
                        tradeOrderDetailActivity.d("", tradeOrderDetailActivity.w);
                        return;
                    }
                    TradeOrderDetailActivity.this.finish();
                }
            });
        }
    }

    private void e() {
        if (njy.b(this.n)) {
            Iterator<ProductResourceInfo> it = this.n.iterator();
            while (it.hasNext()) {
                if (it.next().getResourceType() == 3) {
                    if (!this.f10247c) {
                        c();
                    }
                    this.d = true;
                    break;
                }
            }
            LogUtil.a("TradeOrderDetailActivity", "isGiveawayHaveCard:", Boolean.valueOf(this.d));
            if (!this.d) {
                e(this.n);
            } else {
                LogUtil.a("TradeOrderDetailActivity", "giveaway have card");
            }
        }
    }

    private void b(int i) {
        if (i == 0) {
            this.ah.setText(this.j.getString(R.string.IDS_order_handle));
            this.ac.setText(this.j.getString(R.string.IDS_handle_describe));
            this.ac.setVisibility(0);
            this.ag.setImageResource(R.drawable.pay_finish);
            return;
        }
        if (i == 1) {
            this.ah.setText(this.j.getString(R.string.IDS_order_finish));
            this.ag.setImageResource(R.drawable.pay_finish);
        } else if (i == 2) {
            this.ah.setText(this.j.getString(R.string.IDS_order_returning));
            this.ag.setImageResource(R.drawable.pay_refunds);
        } else if (i == 3) {
            this.ah.setText(this.j.getString(R.string.IDS_order_returned));
            this.ag.setImageResource(R.drawable.pay_refunds);
        } else {
            LogUtil.j("TradeOrderDetailActivity", "state not match:", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.d) {
            e(this.n);
        }
        if (TextUtils.isEmpty(this.w.getResourceId())) {
            LogUtil.j("TradeOrderDetailActivity", "resourceId is empty");
            return;
        }
        for (ThirdCardInfo thirdCardInfo : this.e) {
            if (this.w.getResourceId().equals(thirdCardInfo.getCardPoolId())) {
                c(thirdCardInfo);
                return;
            }
        }
    }

    private void c(final ThirdCardInfo thirdCardInfo) {
        ViewStub viewStub = (ViewStub) findViewById(R.id.viewstub_card);
        if (viewStub == null) {
            LogUtil.j("TradeOrderDetailActivity", "showCartData viewStub = null");
            return;
        }
        viewStub.inflate();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_card_number);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.tv_card_password);
        ily.a(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_card_number), thirdCardInfo.getCardNum()), thirdCardInfo.getCardNum(), healthTextView, R.color.textColorPrimary);
        ily.a(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_card_password), thirdCardInfo.getCardPass()), thirdCardInfo.getCardPass(), healthTextView2, R.color.textColorPrimary);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TradeOrderDetailActivity.this.f10245a) {
                    TradeOrderDetailActivity.this.d(thirdCardInfo.getLinkValue(), TradeOrderDetailActivity.this.w);
                } else {
                    TradeOrderDetailActivity.this.finish();
                }
            }
        });
    }

    private void e(List<ProductResourceInfo> list) {
        LogUtil.a("TradeOrderDetailActivity", "enter addGiveawayView");
        if (njy.e(list)) {
            LogUtil.a("TradeOrderDetailActivity", "giveaways is empty");
            return;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.viewstub_giveaway);
        if (viewStub != null) {
            LogUtil.j("TradeOrderDetailActivity", "addGiveawayView viewStub = null");
            viewStub.inflate();
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lin_giveaway);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.lin_combine_product);
        linearLayout.removeAllViews();
        linearLayout2.removeAllViews();
        for (ProductResourceInfo productResourceInfo : list) {
            if (TextUtils.equals(productResourceInfo.getAttachType(), "giveaway")) {
                d(productResourceInfo, linearLayout);
            } else {
                d(productResourceInfo, linearLayout2);
            }
        }
    }

    private void d(ProductResourceInfo productResourceInfo, LinearLayout linearLayout) {
        b("0", productResourceInfo.getProductName());
        View viewInflate = View.inflate(this, R.layout.trade_affiliate_item, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.img_affiliate);
        ((HealthTextView) viewInflate.findViewById(R.id.tv_affiliate_name)).setText(productResourceInfo.getProductName());
        if (!TextUtils.isEmpty(productResourceInfo.getProductUrl())) {
            imageView.setVisibility(0);
            qqf.a(productResourceInfo.getProductUrl(), imageView, (int) BaseApplication.getContext().getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusS));
        }
        ((HealthTextView) viewInflate.findViewById(R.id.tv_affiliate_mark)).setVisibility((TextUtils.equals(productResourceInfo.getAttachType(), "giveaway") && productResourceInfo.getShowGiveawayFlag()) ? 0 : 8);
        String[] strArr = new String[1];
        if (productResourceInfo.getResourceType() == 3) {
            a(productResourceInfo, viewInflate, strArr);
        }
        if (!TextUtils.isEmpty(productResourceInfo.getButtonDescAsGiveaway()) && !TextUtils.isEmpty(productResourceInfo.getLinkValue())) {
            b(productResourceInfo, viewInflate, strArr[0]);
        }
        linearLayout.addView(viewInflate);
    }

    private void a(ProductResourceInfo productResourceInfo, View view, String[] strArr) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_affiliate_card_num);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.tv_affiliate_card_password);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.tv_affiliate_card_expirate_time);
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.btn_affiliate);
        for (ThirdCardInfo thirdCardInfo : this.e) {
            if (productResourceInfo.getResourceId().equals(thirdCardInfo.getCardPoolId())) {
                strArr[0] = thirdCardInfo.getCardPass();
                healthTextView.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_card_number), thirdCardInfo.getCardNum()));
                healthTextView2.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_card_password), thirdCardInfo.getCardPass()));
                healthTextView3.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_vip_valid_until), UnitUtil.d("yyyy/MM/dd", thirdCardInfo.getExpirateTime())));
                healthTextView3.setVisibility(0);
                LogUtil.a("TradeOrderDetailActivity", "isEnterprisePurchase", Boolean.valueOf(thirdCardInfo.isEnterprisePurchase()));
                if (thirdCardInfo.isEnterprisePurchase()) {
                    int cardStatus = thirdCardInfo.getCardStatus();
                    a(productResourceInfo, cardStatus);
                    if (cardStatus == 2) {
                        healthButton.setBackgroundResource(R.drawable.button_background_emphasize_disable);
                    }
                    healthTextView.setVisibility(8);
                    healthTextView2.setVisibility(8);
                    return;
                }
                healthTextView.setVisibility(0);
                healthTextView2.setVisibility(0);
                return;
            }
        }
    }

    private void a(ProductResourceInfo productResourceInfo, int i) {
        if (productResourceInfo == null) {
            LogUtil.j("TradeOrderDetailActivity", "product or thirdCardInfo is null");
            return;
        }
        if (i == 1) {
            productResourceInfo.setButtonDescAsGiveaway(getString(R.string.IDS_to_redeem));
            return;
        }
        if (i == 2) {
            productResourceInfo.setButtonDescAsGiveaway(getString(R.string.IDS_trade_exprid));
            return;
        }
        if (i == 3) {
            productResourceInfo.setButtonDescAsGiveaway(getString(R.string.IDS_redeemed));
        } else if (i != 4) {
            LogUtil.a("TradeOrderDetailActivity", "other status");
        } else {
            productResourceInfo.setButtonDescAsGiveaway(getString(R.string.IDS_trade_signed));
        }
    }

    private void b(final ProductResourceInfo productResourceInfo, View view, final String str) {
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.btn_affiliate);
        healthButton.setVisibility(0);
        healthButton.setText(productResourceInfo.getButtonDescAsGiveaway());
        int iC = c(productResourceInfo);
        LogUtil.a("TradeOrderDetailActivity", "cardStatus:", Integer.valueOf(iC));
        if (iC == 2) {
            return;
        }
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                TradeOrderDetailActivity.this.b("1", productResourceInfo.getProductName());
                if (!TextUtils.isEmpty(str)) {
                    TradeOrderDetailActivity.this.d(str);
                }
                TradeOrderDetailActivity.this.b(productResourceInfo.getLinkType(), productResourceInfo.getLinkValue());
            }
        });
    }

    private int c(ProductResourceInfo productResourceInfo) {
        if (njy.e(this.e)) {
            LogUtil.j("TradeOrderDetailActivity", "mCardInfoList isEmpty");
            return 0;
        }
        for (ThirdCardInfo thirdCardInfo : this.e) {
            if (productResourceInfo.getResourceId().equals(thirdCardInfo.getCardPoolId())) {
                if (!thirdCardInfo.isEnterprisePurchase()) {
                    break;
                }
                return thirdCardInfo.getCardStatus();
            }
        }
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.r()) {
            LogUtil.j("TradeOrderDetailActivity", "onClick view is null or isFaskClick");
            return;
        }
        int id = view.getId();
        if (id == R.id.lin_contact) {
            b("3");
            j();
        } else if (id != R.id.tv_apply_invoice) {
            LogUtil.a("TradeOrderDetailActivity", "onClick not match");
        } else {
            n();
        }
    }

    private void n() {
        Bundle bundle = new Bundle();
        bundle.putString("orderCode", this.s);
        bundle.putString("orderId", this.y.getOrderId());
        bundle.putDouble(ParsedFieldTag.PRICE, this.y.getPayPrice() / 1000000.0f);
        bundle.putString(HwPayConstant.KEY_CURRENCY, this.y.getCurrency());
        if (this.aa == 0) {
            bundle.putInt(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 0);
        } else {
            bundle.putInt(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 1);
        }
        AppRouter.c("/Main/InvoiceApplicationActivity").d(bundle).b(BaseApplication.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.ae.setVisibility(8);
        this.r.setVisibility(0);
        this.p.setText(BaseApplication.getContext().getString(R.string.IDS_update_network_error));
    }

    private void f() {
        LinearLayout linearLayout = this.ae;
        if (linearLayout == null) {
            LogUtil.j("TradeOrderDetailActivity", "setCenterCardLayout() mTradeContent is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        int iC = 0;
        if (qrs.af(this.j)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.j, 0);
            iC = (int) (healthColumnSystem.c() + healthColumnSystem.f() + healthColumnSystem.b());
        }
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            this.ae.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, final ProductResourceInfo productResourceInfo) {
        LogUtil.a("TradeOrderDetailActivity", "enter getSkipUrl");
        if (!TextUtils.isEmpty(str)) {
            ResourceSkipAddr resourceSkipAddr = new ResourceSkipAddr();
            this.ad = resourceSkipAddr;
            resourceSkipAddr.setAddrType(2);
            this.ad.setAddr(str);
            k();
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.2
            @Override // java.lang.Runnable
            public void run() {
                TradeOrderDetailActivity.this.a(productResourceInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MarketRouterApi marketRouterApi;
        ResourceSkipAddr resourceSkipAddr = this.ad;
        if (resourceSkipAddr == null) {
            LogUtil.e("TradeOrderDetailActivity", "mResourceSkipAddr is null");
            return;
        }
        if (TextUtils.isEmpty(resourceSkipAddr.getAddr())) {
            LogUtil.a("TradeOrderDetailActivity", "mResourceSkipAddr address is empty");
            return;
        }
        LogUtil.a("TradeOrderDetailActivity", "skipToUse:addr + " + this.ad.getAddr() + " type: " + this.ad.getAddrType());
        int addrType = this.ad.getAddrType();
        if (addrType != 1) {
            if (addrType == 2 && (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) != null) {
                marketRouterApi.router(this.ad.getAddr());
                return;
            }
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(this.ad.getAddr()));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("TradeOrderDetailActivity", "mResourceSkipAddr: " + this.ad.getAddr() + " maybe wrong");
        }
    }

    private void j() {
        GRSManager.c(this.j).d("helpCustomerUrl", new GrsQueryCallback() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.10
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    TradeOrderDetailActivity.this.af = str;
                    TradeOrderDetailActivity.this.k.post(new Runnable() { // from class: com.huawei.health.tradeservice.activity.TradeOrderDetailActivity.10.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TradeOrderDetailActivity.this.l();
                        }
                    });
                } else {
                    LogUtil.j("TradeOrderDetailActivity", "obtainTipsUrlDomain urlDomain is empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("TradeOrderDetailActivity", "obtainTipsUrlDomain onCallBackFail");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        OperationWebActivityIntentBuilderApi operationWebActivityIntentBuilderApi = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
        Context context = this.j;
        Intent intentBuild = operationWebActivityIntentBuilderApi.builder(context, c(LoginInit.getInstance(context).getAccountInfo(1010))).build();
        Context context2 = this.j;
        intentBuild.putExtra("title", context2.getString(qhu.a(context2) ? R.string.IDS_hw_personal_cetenr_help_customer_service : R.string.IDS_hwh_health_vo2max_help));
        this.j.startActivity(intentBuild);
    }

    private String c(String str) {
        LogUtil.a("TradeOrderDetailActivity", "getHelpUrl() countryCode:", str);
        boolean zEquals = MLAsrConstants.LAN_ZH.equals(BaseApplication.getContext().getResources().getConfiguration().locale.getLanguage());
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a("TradeOrderDetailActivity", "getHelpUrl() siteId:", Integer.valueOf(iN));
        if (iN == 1) {
            if (zEquals) {
                return this.af + "/hwtips/help/health_help_all/zh-CN/index.html#/help?cid=11069";
            }
            return this.af + "/hwtips/help/health_help_all/en-US/index.html#/help";
        }
        if (zEquals) {
            return this.af + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=zh-CN&devicetype=health_help_all";
        }
        return this.af + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=en-US&devicetype=health_help_all";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("target", str);
        ProductResourceInfo productResourceInfo = this.w;
        if (productResourceInfo != null) {
            map.put("name", productResourceInfo.getProductName());
            map.put("id", productResourceInfo.getProductId());
        } else {
            LogUtil.j("TradeOrderDetailActivity", "productResourceInfo = null");
        }
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.TRADE_ORDER_DETAIL.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("event", str);
        map.put("freebieName", str2);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.TRADE_ORDER_DETAIL_GIVEAWAY.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str) {
        Object systemService = this.j.getSystemService("clipboard");
        if (TextUtils.isEmpty(str) || !(systemService instanceof ClipboardManager)) {
            return false;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            ClipData clipDataNewPlainText = ClipData.newPlainText("Label", str);
            ClipDescription description = clipDataNewPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            if (Build.VERSION.SDK_INT >= 33) {
                persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            } else {
                persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
            }
            description.setExtras(persistableBundle);
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            return true;
        } catch (SecurityException unused) {
            LogUtil.e("TradeOrderDetailActivity", "copyToClipboard securityException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TradeOrderDetailActivity", "jumpByGiveawayLink linkValue is empty");
            return;
        }
        LogUtil.a("TradeOrderDetailActivity", "jumpByGiveawayLink linkType:", Integer.valueOf(i), " linkValue:", str);
        if (i == 1) {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(str);
                return;
            }
            return;
        }
        if (i == 2) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            lsx.c(intent, this.j);
            return;
        }
        LogUtil.j("TradeOrderDetailActivity", "jumpByGiveawayLink invalid linkType");
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<TradeOrderDetailActivity> f10258b;

        d(TradeOrderDetailActivity tradeOrderDetailActivity) {
            this.f10258b = new WeakReference<>(tradeOrderDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TradeOrderDetailActivity tradeOrderDetailActivity = this.f10258b.get();
            if (tradeOrderDetailActivity == null || tradeOrderDetailActivity.isFinishing() || tradeOrderDetailActivity.isDestroyed()) {
                LogUtil.j("TradeOrderDetailActivity", "orderQueryHistory activity is invalid");
                return;
            }
            if (i != 0 || !(obj instanceof OrderDetail)) {
                LogUtil.j("TradeOrderDetailActivity", "orderQueryHistory fail errorCode = ", Integer.valueOf(i));
                tradeOrderDetailActivity.k.sendEmptyMessage(1102);
            } else {
                LogUtil.a("TradeOrderDetailActivity", "orderQueryHistory success");
                tradeOrderDetailActivity.y = (OrderDetail) obj;
                tradeOrderDetailActivity.k.sendEmptyMessage(1101);
            }
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<TradeOrderDetailActivity> f10257a;

        a(TradeOrderDetailActivity tradeOrderDetailActivity) {
            this.f10257a = new WeakReference<>(tradeOrderDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            TradeOrderDetailActivity tradeOrderDetailActivity = this.f10257a.get();
            if (tradeOrderDetailActivity == null || tradeOrderDetailActivity.isFinishing() || tradeOrderDetailActivity.isDestroyed()) {
                LogUtil.j("TradeOrderDetailActivity", "cardQueryInfo activity is invalid");
                return;
            }
            if (i != 0 || !(obj instanceof List)) {
                LogUtil.j("TradeOrderDetailActivity", "cardQueryInfo fail errorCode = ", Integer.valueOf(i));
                return;
            }
            LogUtil.a("TradeOrderDetailActivity", "cardQueryInfo success");
            tradeOrderDetailActivity.e = (List) obj;
            if (!njy.e(tradeOrderDetailActivity.e)) {
                Iterator it = tradeOrderDetailActivity.e.iterator();
                while (it.hasNext()) {
                    LogUtil.a("TradeOrderDetailActivity", "thirdCardInfo:", ((ThirdCardInfo) it.next()).toString());
                }
                tradeOrderDetailActivity.k.sendEmptyMessage(ExceptionCode.CHECK_FILE_HASH_FAILED);
                return;
            }
            LogUtil.j("TradeOrderDetailActivity", "mCardInfoList is Empty");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
