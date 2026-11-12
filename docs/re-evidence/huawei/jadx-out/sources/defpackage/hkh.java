package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.trade.datatype.ProductSummary;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.Services;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hkh implements PreViewStatusContract, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f36836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f36837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f36838c;
    private Context d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private LinearLayout h;
    private FrameLayout i;
    private FrameLayout j;
    private LinearLayout n;
    private hhv o;

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void normalStarPlayView() {
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void payCourseHasVipPrice() {
    }

    public hkh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, hhv hhvVar) {
        LogUtil.a("Suggestion_PreviewHelper", "PreviewStatusHelper init");
        if (frameLayout == null || frameLayout2 == null || context == null) {
            LogUtil.j("Suggestion_PreviewHelper", "PreviewStatusHelper view is null or context == null");
            return;
        }
        this.i = frameLayout;
        this.j = frameLayout2;
        this.d = context;
        this.o = hhvVar;
        b();
        e();
    }

    private void e() {
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f36837b.setOnClickListener(this);
        this.f36838c.setOnClickListener(this);
        this.f36836a.setOnClickListener(this);
    }

    public void b() {
        this.f36838c = (HealthButton) this.i.findViewById(R.id.enable_member_preview_end);
        this.n = (LinearLayout) this.i.findViewById(R.id.has_vip_price_layout);
        this.f = (HealthTextView) this.i.findViewById(R.id.pay_course_original);
        this.g = (HealthTextView) this.i.findViewById(R.id.enable_member_vip_end);
        this.h = (LinearLayout) this.j.findViewById(R.id.full_has_vip_price_layout);
        this.e = (HealthTextView) this.j.findViewById(R.id.full_pay_course_original);
        this.f36837b = (HealthTextView) this.j.findViewById(R.id.full_enable_member_vip_end);
        this.f36836a = (HealthButton) this.j.findViewById(R.id.full_enable_member_preview_end);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void hideOpenView(View... viewArr) {
        if (viewArr == null || viewArr.length <= 0) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void openVipView() {
        if (a()) {
            return;
        }
        this.n.setVisibility(8);
        this.h.setVisibility(8);
        this.f36838c.setVisibility(0);
        this.f36838c.setText(gzx.c(this.d, R.string.IDS_sug_immediately_open, new Object[0]));
        this.f36836a.setVisibility(0);
        this.f36836a.setText(gzx.c(this.d, R.string.IDS_sug_immediately_open, new Object[0]));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void payCourseNotVipPriceView() {
        if (a()) {
            return;
        }
        this.n.setVisibility(8);
        this.h.setVisibility(8);
        this.f36838c.setVisibility(0);
        this.f36838c.setText(gzx.c(this.d, R.string.IDS_watchface_watch_pay_sure_content, new Object[0]));
        this.f36836a.setVisibility(0);
        this.f36836a.setText(gzx.c(this.d, R.string.IDS_watchface_watch_pay_sure_content, new Object[0]));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void payCourseHasVipPriceNotOpenVip() {
        if (a()) {
            return;
        }
        this.n.setVisibility(0);
        this.h.setVisibility(0);
        this.f36838c.setVisibility(8);
        this.f36836a.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.mvp.PreViewStatusContract
    public void payCourseHasVipPriceByOpenVip() {
        if (a()) {
            return;
        }
        this.n.setVisibility(8);
        this.h.setVisibility(8);
        this.f36838c.setVisibility(0);
        this.f36838c.setText(gzx.c(this.d, R.string.IDS_watchface_watch_pay_sure_content, new Object[0]));
        this.f36836a.setVisibility(0);
        this.f36836a.setText(gzx.c(this.d, R.string.IDS_watchface_watch_pay_sure_content, new Object[0]));
    }

    private boolean a() {
        if (this.n != null && this.h != null && this.f36838c != null && this.f36836a != null) {
            return false;
        }
        LogUtil.j("Suggestion_PreviewHelper", "openVipView view null");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    public void c(String str, HealthTextView healthTextView, LinearLayout linearLayout) {
        String str2;
        String str3;
        String string;
        String strC;
        int iIndexOf;
        if (healthTextView == null || linearLayout == null) {
            LogUtil.j("Suggestion_PreviewHelper", "initPlayingTips watchingGoToVipTips == null");
            return;
        }
        hld hldVarE = this.o.e();
        if (hldVarE.n()) {
            string = this.d.getString(R.string.IDS_vip_open_vip);
            strC = gzx.c(this.d, R.string.IDS_sug_try_watch_vip_buy, str, string);
        } else {
            if (hldVarE.o()) {
                string = this.d.getString(R.string.IDS_watchface_watch_pay_sure_content);
                strC = gzx.c(this.d, R.string.IDS_sug_try_watch_vip_buy, str, string);
            } else if (hldVarE.j()) {
                healthTextView.setText(gzx.c(this.d, R.string.IDS_sug_try_watch_buy_tips, str));
                return;
            } else if (!hldVarE.g()) {
                str2 = "";
                str3 = "";
            } else {
                hideOpenView(linearLayout);
                return;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            LogUtil.a("Suggestion_PreviewHelper", "initPlayingTips auditionCourseData:", hldVarE, "tips:", str3, "targetStr:", str2);
            iIndexOf = str3.indexOf(str2);
            if (iIndexOf <= -1) {
                LogUtil.j("Suggestion_PreviewHelper", "setPreviewTime index ", Integer.valueOf(iIndexOf));
            } else {
                e(healthTextView, str2, str3, hldVarE, iIndexOf);
            }
        }
        String str4 = string;
        str3 = strC;
        str2 = str4;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        LogUtil.a("Suggestion_PreviewHelper", "initPlayingTips auditionCourseData:", hldVarE, "tips:", str3, "targetStr:", str2);
        iIndexOf = str3.indexOf(str2);
        if (iIndexOf <= -1) {
            LogUtil.j("Suggestion_PreviewHelper", "setPreviewTime index ", Integer.valueOf(iIndexOf));
        } else {
            e(healthTextView, str2, str3, hldVarE, iIndexOf);
        }
    }

    private void e(HealthTextView healthTextView, String str, String str2, final hld hldVar, int i) {
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ClickableSpan() { // from class: hkh.4
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LogUtil.a("Suggestion_PreviewHelper", "initPlayingTips click");
                if (qrs.r()) {
                    return;
                }
                hkh.this.o.b(2);
                if (hldVar.n()) {
                    hkh.this.d();
                }
                if (hldVar.o()) {
                    hkh.this.b(hldVar.e());
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(hkh.this.d, R.color.vip_product_card_border_color_2));
            }
        }, i, str.length() + i, 33);
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ProductSummary productSummary) {
        if (productSummary == null) {
            LogUtil.j("Suggestion_PreviewHelper", "jumpPay productSummary = null");
            return;
        }
        hld hldVarE = this.o.e();
        iei.b(hldVarE);
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(productSummary.getProductId());
        productInfo.setProductName(productSummary.getProductName());
        productInfo.setPurchasePolicy(productSummary.getPurchasePolicy());
        TradeViewInfo tradeViewInfoA = hldVarE.a();
        if (tradeViewInfoA != null) {
            productInfo.setResourceType(tradeViewInfoA.getResType());
            Map<String, String> biParams = tradeViewInfoA.getBiParams();
            if (biParams != null) {
                biParams.put("buyStage", "1");
                productInfo.setBiParams(biParams);
            }
        }
        productInfo.setLinkType(productSummary.getLinkType());
        productInfo.setLinkValue(productSummary.getLinkValue());
        String json = new Gson().toJson(productInfo);
        LogUtil.a("Suggestion_PreviewHelper", "jumpPay productInfoString = ", json, "giveaway:", Integer.valueOf(productSummary.getGiveawaysExist()));
        e(json, productSummary.getGiveawaysExist() == 1, productSummary.getProductId());
    }

    private void e(String str, boolean z, String str2) {
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j("Suggestion_PreviewHelper", "pullPayByResourceId activity = null");
            return;
        }
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("Suggestion_PreviewHelper", "pullPayByResourceId payApi = null");
        } else if (z) {
            payApi.startTradeSureOrderActivity(this.d, str, str2);
        } else {
            payApi.buyByProductId(activity, 100001, str);
        }
    }

    public void d() {
        Map<String, String> biParams;
        int resType;
        String trigResName;
        hld hldVarE = this.o.e();
        TradeViewInfo tradeViewInfoA = hldVarE.a();
        String str = "";
        if (tradeViewInfoA == null) {
            biParams = null;
            resType = 1;
            trigResName = "";
        } else {
            biParams = tradeViewInfoA.getBiParams();
            if (!TextUtils.isEmpty(tradeViewInfoA.getTrigResName())) {
                trigResName = "";
            } else {
                trigResName = tradeViewInfoA.getTrigResName();
            }
            resType = tradeViewInfoA.getResType();
        }
        if (isa.d()) {
            c(biParams, trigResName, resType, hldVarE);
            return;
        }
        if (biParams != null) {
            str = biParams.get("payResourceType");
        }
        H5ProLaunchOption.Builder builderAddPath = new H5ProLaunchOption.Builder().addPath(irz.e("from=1&trigResMemberPrice=1&trigResType=" + resType + "&trigResName=" + trigResName + "&payResourceType=" + str));
        if (biParams != null) {
            builderAddPath.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, biParams.get(WebViewHelp.BI_KEY_PULL_FROM)).addGlobalBiParam("resourceId", biParams.get("resourceId")).addGlobalBiParam("resourceName", biParams.get("resourceName")).addGlobalBiParam("pullOrder", biParams.get("pullOrder"));
        }
        ddv.b().loadH5ProApp(this.d, "com.huawei.health.h5.vip", builderAddPath);
    }

    private void c(Map<String, String> map, String str, int i, hld hldVar) {
        String str2;
        String str3;
        if (map == null) {
            str2 = "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&path=MemberCenter&currentBenefit=1&benefitList=%5B1%5D";
        } else {
            str2 = "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.vip?h5pro=true&urlType=4&pName=com.huawei.health&path=MemberCenter&currentBenefit=1&benefitList=%5B1%5D&pullfrom=" + map.get(WebViewHelp.BI_KEY_PULL_FROM) + "&resourceId=" + map.get("resourceId") + "&resourceName=" + map.get("resourceName") + "&pullOrder=" + map.get("pullOrder") + "&payResourceType=" + map.get("payResourceType");
        }
        if (hldVar != null && hldVar.h()) {
            str3 = "VipRatePreview";
        } else {
            str3 = "VipPreview";
        }
        AppRouter.e(Uri.parse((str2 + "&popUpTypeSelect=true") + "&trigResMemberPrice=1&trigResType=" + i + "&trigResName=" + str + "&vipOpenFrom=" + str3)).b(this.d);
    }

    private void c() {
        hld hldVarE = this.o.e();
        if (hldVarE.n()) {
            d();
        } else if (hldVarE.h()) {
            b(hldVarE.c());
        } else {
            b(hldVarE.e());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        hhv hhvVar = this.o;
        if (hhvVar == null) {
            LogUtil.j("Suggestion_PreviewHelper", "onClick mVipView == null");
            return;
        }
        if (view == this.f36838c || view == this.f36836a) {
            hhvVar.b(3);
            c();
        } else if (view == this.f || view == this.e) {
            hhvVar.b(3);
            b(this.o.e().e());
        } else if (view == this.g || view == this.f36837b) {
            hhvVar.b(3);
            d();
        }
    }
}
