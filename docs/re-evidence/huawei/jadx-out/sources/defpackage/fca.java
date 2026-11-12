package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.services.district.DistrictSearchQuery;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.datatypes.PromotionPolicyCacheInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.trade.datatype.SubscriptionPromotion;
import com.huawei.trade.datatype.TimeLimitedPromotion;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.fca;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fca {
    private static boolean d(int i, int i2, int i3) {
        return i2 >= i && i <= i3 && i2 <= i3 && i >= 0 && i2 >= 0;
    }

    public static void e(final Context context, Product product, final ProductInfo productInfo) {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null || activityJ.isFinishing() || activityJ.isDestroyed()) {
            LogUtil.e("MemberCommonUtil", "activity is wrong or destroyed");
            return;
        }
        if (product == null) {
            LogUtil.e("MemberCommonUtil", "showAgreementDialog selected product is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activityJ);
        if (product != null && product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            builder.a(qre.a(R.string.IDS_purchase_check_dialog_text, qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_window_agreement)), qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_renewal_agreement))));
        } else {
            builder.a(qre.f(R.string.IDS_vip_solid_agree_dialog));
        }
        builder.c(R.string.IDS_vip_continue_open, new View.OnClickListener() { // from class: fcb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fca.e(context, activityJ, productInfo, view);
            }
        });
        if (CommonUtil.j(LoginInit.getInstance(context).getAccountInfo(1009)) == 7) {
            builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.health.utils.vippage.MemberCommonUtil$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fca.c(context, view);
                }
            });
        } else {
            builder.e(R.string.IDS_settings_button_cancal, R.color.textColorSecondary, new View.OnClickListener() { // from class: com.huawei.health.health.utils.vippage.MemberCommonUtil$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fca.b(context, view);
                }
            });
        }
        builder.b(true);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.health.health.utils.vippage.MemberCommonUtil$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                fca.a(context, dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void e(Context context, Activity activity, ProductInfo productInfo, View view) {
        LogUtil.a("MemberCommonUtil", "agreed confirmed");
        fcn.c(context, 1);
        c(activity, productInfo);
    }

    public static /* synthetic */ void c(Context context, View view) {
        LogUtil.a("MemberCommonUtil", "agree canceled");
        fcn.c(context, 2);
    }

    public static /* synthetic */ void b(Context context, View view) {
        LogUtil.a("MemberCommonUtil", "agree canceled");
        fcn.c(context, 2);
    }

    public static /* synthetic */ void a(Context context, DialogInterface dialogInterface) {
        LogUtil.a("MemberCommonUtil", "dialog canceled");
        fcn.c(context, 3);
    }

    public static boolean a(Product product) {
        TimeLimitedPromotion promotion;
        if (product == null) {
            return false;
        }
        long nowTime = product.getNowTime();
        if (product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            SubscriptionPromotion subscriptionPromotion = product.getSubscriptionPromotion();
            if (subscriptionPromotion == null) {
                return false;
            }
            try {
                if (nowTime >= Long.parseLong(subscriptionPromotion.getStartTime()) && nowTime <= Long.parseLong(subscriptionPromotion.getEndTime())) {
                    return product.getMicroPrice() != subscriptionPromotion.getMicroOriginalPrice();
                }
                LogUtil.a("MemberCommonUtil", "expired subscription");
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        if (product.getPurchasePolicy() != Product.REPEAT_PURCHASE_FLAG || (promotion = product.getPromotion()) == null) {
            return false;
        }
        if (nowTime <= promotion.getPromotionEndTime()) {
            return product.getMicroPrice() != promotion.getMicroOriginPrice();
        }
        LogUtil.a("MemberCommonUtil", "expired promotion");
        return false;
    }

    public static String b(Product product) {
        return c(product.getMicroPrice(), "#.##");
    }

    public static String c(long j, String str) {
        return new DecimalFormat(str).format(new BigDecimal(j).divide(new BigDecimal(String.valueOf(1000000)), 2, RoundingMode.HALF_UP));
    }

    public static void d(Context context, int i) {
        AppRouter.c("/OperationBundle/MemberTypeSelectActivity").a("MEMBER_TYPE_SELECT_INDEX", i).a(R.anim.fade_in, R.anim.fade_out).b(context);
    }

    public static void b(Context context) {
        if (!(context instanceof Activity)) {
            LogUtil.a("MemberCommonUtil", "context is not Activity");
        } else {
            ((Activity) context).overridePendingTransition(com.huawei.ui.commonui.R.anim.fade_in, com.huawei.ui.commonui.R.anim.fade_out);
        }
    }

    public static String a() {
        if (TextUtils.isEmpty(fcn.c()) || TextUtils.isEmpty(fcn.a())) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DistrictSearchQuery.KEYWORDS_PROVINCE, fcn.c());
            jSONObject.put(DistrictSearchQuery.KEYWORDS_CITY, fcn.a());
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.e("MemberCommonUtil", "getAreaInoStr exception ", e.getMessage());
            return "";
        }
    }

    public static ProductInfo e(Product product) {
        ProductInfo productInfo = new ProductInfo();
        if (product == null) {
            return productInfo;
        }
        productInfo.setProductId(product.getProductId());
        productInfo.setPurchasePolicy(product.getPurchasePolicy());
        if (product.getSubscriptionPromotion() != null) {
            if (!TextUtils.isEmpty(product.getSubscriptionPromotion().getPromotionId())) {
                productInfo.setPromotionId(product.getSubscriptionPromotion().getPromotionId());
            }
            productInfo.setPromotionPolicyId(product.getSubscriptionPromotion().getPromotionPolicyId());
        }
        productInfo.setLinkType(product.getLinkType());
        productInfo.setLinkValue(product.getLinkValue());
        productInfo.setClientVersion(fod.e(BaseApplication.b()));
        return productInfo;
    }

    public static boolean e(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        if (repeatResourceBenefitInfo != null && repeatResourceBenefitInfo.getResourceType() == 9) {
            if (repeatResourceBenefitInfo.getCurrentBenefitMode() == 1) {
                return false;
            }
            long nowTime = repeatResourceBenefitInfo.getNowTime();
            long jLongValue = repeatResourceBenefitInfo.getExpireTime() != null ? repeatResourceBenefitInfo.getExpireTime().longValue() : 0L;
            if (repeatResourceBenefitInfo.getCurrentBenefitMode() == 2 && jLongValue > nowTime) {
                return false;
            }
        }
        return true;
    }

    public static void c(Activity activity, ProductInfo productInfo) {
        if (productInfo == null || activity == null) {
            return;
        }
        productInfo.setAreaInfo(a());
        productInfo.setBiParams(fcn.e());
        String strB = qqt.b(productInfo);
        LogUtil.a("MemberCommonUtil", "jumpOpenPage: ", strB);
        ((PayApi) Services.b("TradeService", PayApi.class)).buyByProductId(activity, 10000, strB);
    }

    public static CharSequence d(boolean z) {
        String strA = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_window_agreement));
        String strA2 = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_renewal_agreement));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.b(), R.color.vip_open_member_price_text));
        c cVar = new c(1);
        c cVar2 = new c(3);
        if (z) {
            String strA3 = qre.a(R.string.IDS_huawei_member_and_renew_protocol, strA, strA2);
            int iIndexOf = strA3.indexOf(strA);
            int length = strA.length() + iIndexOf;
            int iIndexOf2 = strA3.indexOf(strA2);
            int length2 = strA2.length() + iIndexOf2;
            LogUtil.a("MemberCommonUtil", "getAgreementText: ", Integer.valueOf(iIndexOf), " ", Integer.valueOf(length), " ", Integer.valueOf(iIndexOf2), " ", Integer.valueOf(length2));
            SpannableString spannableString = new SpannableString(strA3);
            if (d(iIndexOf, length, strA3.length()) && d(iIndexOf2, length2, strA3.length())) {
                spannableString.setSpan(cVar, iIndexOf, length, 33);
                spannableString.setSpan(cVar2, iIndexOf2, length2, 33);
                spannableString.setSpan(CharacterStyle.wrap(foregroundColorSpan), iIndexOf, length, 33);
                spannableString.setSpan(CharacterStyle.wrap(foregroundColorSpan), iIndexOf2, length2, 33);
            }
            return spannableString;
        }
        String strA4 = qre.a(R.string.IDS_huawei_member_agree_protocol, strA);
        int iIndexOf3 = strA4.indexOf(strA);
        int length3 = strA.length() + iIndexOf3;
        SpannableString spannableString2 = new SpannableString(strA4);
        spannableString2.setSpan(cVar, iIndexOf3, length3, 33);
        spannableString2.setSpan(CharacterStyle.wrap(foregroundColorSpan), iIndexOf3, length3, 33);
        return spannableString2;
    }

    public static CharSequence c(Product product) {
        String strA;
        if (product == null) {
            return "";
        }
        boolean zIsHealthMember = product.isHealthMember();
        String strA2 = qre.a(R.string.IDS_huawei_member_protocol, qre.f(R.string.IDS_vip_window_agreement));
        String strA3 = qre.a(R.string.IDS_huawei_member_protocol, qre.f(com.huawei.ui.commonui.R.string.IDS_benefit_safety_agreement));
        if (zIsHealthMember) {
            strA = qre.a(R.string.IDS_vip_active_protocol_tip_new_read, strA2, strA3);
        } else {
            strA = qre.a(R.string.IDS_vip_active_protocol_tip_vip_new_read, strA3);
        }
        SpannableString spannableString = new SpannableString(strA);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.b(), R.color.vip_open_member_price_text));
        if (zIsHealthMember) {
            e(spannableString, strA, strA2, new c(1), foregroundColorSpan);
        }
        e(spannableString, strA, strA3, new c(2), foregroundColorSpan);
        return spannableString;
    }

    private static void e(SpannableString spannableString, String str, String str2, ClickableSpan clickableSpan, ForegroundColorSpan foregroundColorSpan) {
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (d(iIndexOf, length, str.length())) {
            spannableString.setSpan(clickableSpan, iIndexOf, length, 33);
            spannableString.setSpan(CharacterStyle.wrap(foregroundColorSpan), iIndexOf, length, 33);
        }
    }

    public static String b() {
        return GRSManager.c(BaseApplication.b()).getUrl("userAgreementDomain") + e("/terms/scope/huawei/health/member-terms.htm?");
    }

    public static String e() {
        String[] stringArray = BaseApplication.b().getResources().getStringArray(R.array.safety_agreement_url);
        return (stringArray == null || stringArray.length != 1) ? "" : stringArray[0];
    }

    public static String c() {
        return GRSManager.c(BaseApplication.b()).getUrl("userAgreementDomain") + e("/terms/scope/huawei/health/monservice-terms.htm?");
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MemberCommonUtil", "input url is empty. return empty string.");
            return "";
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        String strB = iox.b();
        LogUtil.a("MemberCommonUtil", "getUrlWithLangAndCountry countryCode = ", accountInfo, "; language = ", strB);
        return str + "code=" + accountInfo + Constants.LANGUAGE + strB;
    }

    static class c extends ClickableSpan {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f33840c;

        public c(int i) {
            this.f33840c = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            lsy.a(new Runnable() { // from class: fca.c.1
                @Override // java.lang.Runnable
                public void run() {
                    String strE;
                    if (c.this.f33840c != 1) {
                        if (c.this.f33840c != 3) {
                            if (c.this.f33840c != 2) {
                                strE = "";
                            } else {
                                strE = fca.e();
                            }
                        } else {
                            strE = fca.c();
                        }
                    } else {
                        strE = fca.b();
                    }
                    c cVar = c.this;
                    cVar.e(cVar.f33840c, strE);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(final int i, final String str) {
            if (!HandlerExecutor.d()) {
                HandlerExecutor.c(new Runnable() { // from class: fca.c.4
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.e(i, str);
                    }
                });
                return;
            }
            LogUtil.a("MemberCommonUtil", "jump type: ", Integer.valueOf(i), " url: ", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 1) {
                fcn.i();
            } else if (i == 3) {
                fcn.f();
            }
            ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(str);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public static PromotionPolicyCacheInfo d() {
        PromotionPolicyCacheInfo promotionPolicyCacheInfo;
        String strB = SharedPreferenceManager.b(Integer.toString(10000), "SHOW_PROMOTION_DIALOG", "");
        LogUtil.a("MemberCommonUtil", "getPromotionPolicyInfoFromSp cacheInfoStr ： ", strB);
        try {
            promotionPolicyCacheInfo = (PromotionPolicyCacheInfo) new Gson().fromJson(strB, PromotionPolicyCacheInfo.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("MemberCommonUtil", "parse (JsonSyntaxException");
            promotionPolicyCacheInfo = null;
        }
        return promotionPolicyCacheInfo == null ? new PromotionPolicyCacheInfo() : promotionPolicyCacheInfo;
    }

    public static boolean f() {
        long lastShowTime = d().getLastShowTime();
        if (lastShowTime == 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = lsl.d(lsl.x(jCurrentTimeMillis), 14);
        long jD2 = lsl.d(lsl.p(jCurrentTimeMillis), 14);
        return (jCurrentTimeMillis >= jD2 && lastShowTime < jD2) || (jCurrentTimeMillis < jD2 && lastShowTime < jD);
    }
}
