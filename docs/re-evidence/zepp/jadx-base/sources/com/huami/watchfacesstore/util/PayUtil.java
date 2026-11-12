package com.huami.watchfacesstore.util;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.network.hmnetwork.webapi.HMWebParameter;
import com.huami.pay.service.GoodsSku;
import com.huami.pay.service.PayChannel;
import com.huami.pay.service.ProductCashierParam;
import com.huami.pay.service.SkuType;
import com.huami.privacy.moneyformat.MoneyFormatterFactory;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002JF\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/huami/watchfacesstore/util/PayUtil;", "", "", "", "channels", "Lcom/huami/pay/service/PayChannel;", "a", DeviceSettingApiImpl.META_KEY_PRODUCT_NAME, "currencyCode", TrainingWebConst.QueryParam.SKUID, "", FirebaseAnalytics.Param.PRICE, HMWebParameter.PARAM_THIRD_PARTY_ID, "Lcom/huami/pay/service/ProductCashierParam;", "generateProductParam", "Ljava/lang/String;", "tag", "b", "WECHAT", "c", PayUtil.ALIPAY, GoogleApiAvailabilityLight.a, "GOOGLE_PLAY", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PayUtil {

    @NotNull
    public static final PayUtil INSTANCE = new PayUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "PayUtil";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String WECHAT = "WECHAT";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String ALIPAY = "ALIPAY";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String GOOGLE_PLAY = "GOOGLEPLAY";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    private PayUtil() {
    }

    private final List<PayChannel> a(List<String> channels) {
        ArrayList arrayList = new ArrayList();
        if (channels.contains("WECHAT")) {
            arrayList.add(PayChannel.WECHAT_PAY);
        }
        if (channels.contains(ALIPAY)) {
            arrayList.add(PayChannel.ALI_PAY);
        }
        if (channels.contains("GOOGLEPLAY")) {
            arrayList.add(PayChannel.GOOGLE_PAY);
        }
        return arrayList;
    }

    @Nullable
    public final ProductCashierParam generateProductParam(@NotNull String productName, @Nullable String currencyCode, @Nullable String skuId, float price, @Nullable String thirdPartyId, @Nullable List<String> channels) {
        try {
            try {
                return new ProductCashierParam(KoinExtKt.getUserInfo().getUserId(), a(channels), productName, MoneyFormatterFactory.INSTANCE.getFormatter(currencyCode).getMoney(Float.valueOf(price)), e.listOf(new GoodsSku(skuId, thirdPartyId, 1, null, 8, null)), SkuType.INAPP, true);
            } catch (Exception e) {
                e = e;
                HMLog.error$default(tag, null, null, new a(e), 6, null);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
