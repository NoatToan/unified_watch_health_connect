package com.xiaomi.hm.health.device.watchskinstore;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.tools.pay.ali.AliPay;
import com.huami.android.tools.pay.ali.AliPayResponse;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.huami.android.tools.pay.wechat.WeChatResponse;
import com.huami.devicex.R;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.watch_skin.LocalWatchSkinEntity;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watchskinstore.api.WatchSkinApi;
import com.xiaomi.hm.health.device.watchskinstore.bean.PayOrder;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchResult;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinPage;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J*\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J \u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003H\u0007J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0!0\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0003H\u0007J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0!0\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0002J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0007H\u0007J\u0014\u0010,\u001a\u0004\u0018\u00010\n2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010-\u001a\u00020\nH\u0007J\u001e\u00102\u001a\u0004\u0018\u0001012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010/H\u0002J&\u00105\u001a\b\u0012\u0004\u0012\u0002010\u001d2\u0006\u0010&\u001a\u0002032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00104\u001a\u00020/H\u0007J(\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010&\u001a\u0002032\u0006\u00104\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u00010\u0007H\u0002J \u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010&\u001a\u0002032\b\u00106\u001a\u0004\u0018\u00010\u0007H\u0002J \u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010&\u001a\u0002032\b\u00106\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0007J>\u0010@\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020\u00032\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0007H\u0007J(\u0010B\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u0003H\u0007J\"\u0010E\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010A\u001a\u00020\u0003H\u0007R\u0016\u0010G\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u0010FR\u0016\u0010H\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010L\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010FR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010FR\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u0016\u0010P\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010IR\u0016\u0010Q\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010IR\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010F¨\u0006U"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/WatchSkinHelper;", "", "", "", "getColorArray", "()[Ljava/lang/Integer;", "getMoreColorArray", "", "id", "getLocalTransparentImg", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", LargeWatchSkinActivity.KEY_BEAN, "getTransImageRes", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "iv", "url", "", "skipCache", "", "loadImage", "imageView", GoogleApiAvailabilityLight.a, "c", "f", "e", "curPage", "perPage", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchResult;", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinPage;", "loadLocalWatchSkinPage", "count", "", "loadAllLocalWatchSkin", "match", "b", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "isFromOutside", "watchSkinFilePath", "loadSingleLocalWatchSkin", "Lcom/xiaomi/hm/health/device/watch_skin/LocalWatchSkinEntity;", "entity", z.j, "watchSkinBean", "deleteDownloadRecord", "Lcom/xiaomi/hm/health/device/watchskinstore/PayChannelBo;", "payChannelBo", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder;", "a", "Landroid/app/Activity;", "payChannel", "generateOrderAndPay", "prepaidData", "h", "i", "g", "checkWechatInstalled", DbUtils.Const.Columns.Event.EVENT_ID, "deviceValue", "", "extras", "value", "analyticCount", "selectColor", "setTintTransBg", "Landroid/graphics/drawable/Drawable;", "resource", "setTintDrawable", "Ljava/lang/String;", "TAG", "TYPE_EMPTY", LogUtil.I, "TYPE_NET_ERROR", "TYPE_404_ERROR", "BATTERY_LEVEL", "ID_58", "ID_59", "ID_60", "DEFAULT_PER_PAGE", "DEFAULT_SELECT_COLOR", "WX_PACKAGE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinHelper {
    public static final int BATTERY_LEVEL = 10;
    public static final int DEFAULT_SELECT_COLOR = 0;
    public static final int TYPE_404_ERROR = 2;
    public static final int TYPE_EMPTY = 0;
    public static final int TYPE_NET_ERROR = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String ID_58 = "60158";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String ID_59 = "60159";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String ID_60 = "60160";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int DEFAULT_PER_PAGE = 30;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String WX_PACKAGE = "com.tencent.mm";

    @NotNull
    public static final WatchSkinHelper INSTANCE = new WatchSkinHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WatchSkinHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "WatchSkin is null or PayChannel is null!!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "from:" + this.a + " toIndex:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ WatchResult<WatchSkinPage> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WatchResult<WatchSkinPage> watchResult) {
            super(0);
            this.a = watchResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadDownloadRecordPage:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ LocalWatchSkinEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LocalWatchSkinEntity localWatchSkinEntity) {
            super(0);
            this.a = localWatchSkinEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadSingleLocalWatchSkin:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "启动支付宝支付";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ AliPayResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AliPayResponse aliPayResponse) {
            super(0);
            this.a = aliPayResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            AliPayResponse aliPayResponse = this.a;
            String message = aliPayResponse == null ? null : aliPayResponse.getMessage();
            AliPayResponse aliPayResponse2 = this.a;
            return "支付宝支付结果" + message + ": code:" + (aliPayResponse2 != null ? aliPayResponse2.getCode() : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "启动微信支付";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "微信支付结果" + this.a + " code:" + this.b;
        }
    }

    private WatchSkinHelper() {
    }

    private final PayOrder a(WatchSkinBean bean, PayChannelBo payChannelBo) {
        if (bean == null || payChannelBo == null) {
            HMLog.info(TAG, a.a);
            return null;
        }
        PayOrder payOrder = new PayOrder(null, null, 3, null);
        PayOrder.Order order = new PayOrder.Order(null, null, null, 7, null);
        ArrayList arrayList = new ArrayList();
        PayOrder.Order.SkuBean skuBean = new PayOrder.Order.SkuBean(null, 0, 3, null);
        skuBean.setSkuId(bean.getSkuId());
        arrayList.add(skuBean);
        order.setItems(arrayList);
        order.setDescription(bean.getName());
        PayOrder.Payment payment = new PayOrder.Payment(null, null, 3, null);
        payment.setPayChannel(payChannelBo.getValue());
        payOrder.setOrder(order);
        payOrder.setPayment(payment);
        return payOrder;
    }

    @JvmStatic
    @JvmOverloads
    public static final void analyticCount(@NotNull String str) {
        analyticCount$default(str, 0, null, null, 14, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void analyticCount(@NotNull String str, int i) {
        analyticCount$default(str, i, null, null, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void analyticCount(@NotNull String str, int i, @Nullable Map<String, String> map) {
        analyticCount$default(str, i, map, null, 8, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void analyticCount(@NotNull String eventId, int deviceValue, @Nullable Map<String, String> extras, @Nullable String value) {
        CountEventBuilder countEventBuilderPutExtras = new CountEventBuilder(eventId).setIdentified(true).setAnonymous(false).addExtra("DeviceSource", String.valueOf(deviceValue)).putExtras(extras);
        if (!TextUtils.isEmpty(value)) {
            countEventBuilderPutExtras.setValue(value);
        }
        Analytics.recordEvent(countEventBuilderPutExtras);
    }

    public static /* synthetic */ void analyticCount$default(String str, int i, Map map, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = HMDeviceConfig.getSupportWatchStoreDevice().getValue();
        }
        if ((i2 & 4) != 0) {
            map = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        analyticCount(str, i, map, str2);
    }

    private final WatchResult<List<WatchSkinBean>> b(Context context, boolean match) {
        WatchResult<List<WatchSkinBean>> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        List<LocalWatchSkinEntity> listTraverseAllWatchSkin = WatchSkinManager.traverseAllWatchSkin(context, match);
        watchResult.setSuccessful(true);
        if (listTraverseAllWatchSkin != null && listTraverseAllWatchSkin.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<LocalWatchSkinEntity> it2 = listTraverseAllWatchSkin.iterator();
            while (it2.hasNext()) {
                WatchSkinBean watchSkinBeanJ = j(it2.next());
                if (watchSkinBeanJ != null) {
                    arrayList.add(watchSkinBeanJ);
                }
            }
            watchResult.setData(arrayList);
        }
        return watchResult;
    }

    private final void c(Context context, ImageView imageView, int url) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(context).load(Integer.valueOf(url));
        RequestOptions requestOptionsSkipMemoryCache = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true);
        int i = R.drawable.icon_cinco_dial_default_bg;
        requestBuilderLoad.apply(requestOptionsSkipMemoryCache.placeholder(i).error(i).optionalFitCenter()).into(imageView);
    }

    @JvmStatic
    public static final boolean checkWechatInstalled(@NotNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.tencent.mm", 0) != null;
        } catch (PackageManager.NameNotFoundException e2) {
            HMLog.e(TAG, "isWechatInstalled" + e2, new Object[0]);
            return false;
        }
    }

    private final void d(Context context, ImageView imageView, String url) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(context).load(url);
        RequestOptions requestOptionsSkipMemoryCache = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true);
        int i = R.drawable.icon_cinco_dial_default_bg;
        requestBuilderLoad.apply(requestOptionsSkipMemoryCache.placeholder(i).error(i).optionalFitCenter()).into(imageView);
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<Boolean> deleteDownloadRecord(@NotNull Context context, @NotNull WatchSkinBean watchSkinBean) {
        return new WatchResult<>(false, 0, false, null, null, 31, null);
    }

    private final void e(Context context, ImageView imageView, int url) {
        DisplayConfig.ConfigBuilder configBuilderDiskCacheStrategy = HMImageLoader.with(context).load(url).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.NONE);
        int i = R.drawable.icon_cinco_dial_default_bg;
        configBuilderDiskCacheStrategy.placeholder(i).error(i).crossFade().fitCenter().into(imageView);
    }

    private final void f(Context context, ImageView imageView, String url) {
        DisplayConfig.ConfigBuilder configBuilderDiskCacheStrategy = HMImageLoader.with(context).load(url).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.NONE);
        int i = R.drawable.icon_cinco_dial_default_bg;
        configBuilderDiskCacheStrategy.placeholder(i).error(i).crossFade().fitCenter().into(imageView);
    }

    private final WatchResult<Integer> g(Activity activity, String prepaidData) {
        WatchResult<Integer> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        if (TextUtils.isEmpty(prepaidData)) {
            watchResult.setMError(new Throwable("prepaidData为null 无法启动支付宝支付"));
            return watchResult;
        }
        String str = TAG;
        HMLog.debug(str, e.a);
        try {
            AliPayResponse aliPayResponsePay = new AliPay().pay(activity, new JSONObject(prepaidData).optString("data"));
            HMLog.info(str, new f(aliPayResponsePay));
            boolean zIsSuccessful = aliPayResponsePay.isSuccessful();
            String code = aliPayResponsePay.getCode();
            watchResult.setSuccessful(zIsSuccessful);
            if (!TextUtils.isEmpty(code)) {
                try {
                    watchResult.setCode(Integer.valueOf(code).intValue());
                    watchResult.setData(Integer.valueOf(code));
                } catch (NumberFormatException unused) {
                    HMLog.e(TAG, "payByALi: NumberFormatException:" + code, new Object[0]);
                }
            }
            return watchResult;
        } catch (JSONException e2) {
            e2.printStackTrace();
            HMLog.e(TAG, "解析支付宝支付信息失败!!!", new Object[0]);
            return watchResult;
        }
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<PayOrder> generateOrderAndPay(@NotNull Activity activity, @NotNull WatchSkinBean bean, @NotNull PayChannelBo payChannel) {
        WatchResult<PayOrder> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        WatchSkinHelper watchSkinHelper = INSTANCE;
        PayOrder payOrderA = watchSkinHelper.a(bean, payChannel);
        if (payOrderA == null) {
            return watchResult;
        }
        WatchResult<PayOrder> watchResultGeneratePayOrder = WatchSkinApi.INSTANCE.generatePayOrder(payOrderA);
        PayOrder data = watchResultGeneratePayOrder.getData();
        if (watchResultGeneratePayOrder.isSuccessful() && data != null) {
            PayOrder.Payment payment = data.getPayment();
            WatchResult<Integer> watchResultH = watchSkinHelper.h(activity, payChannel, payment == null ? null : payment.getPrepaidData());
            watchResultGeneratePayOrder.setCode(watchResultH.getCode());
            watchResultGeneratePayOrder.setSuccessful(watchResultH.isSuccessful());
            watchResultGeneratePayOrder.setMError(watchResultH.getMError());
        }
        return watchResultGeneratePayOrder;
    }

    @JvmStatic
    @NotNull
    public static final Integer[] getColorArray() {
        return new Integer[]{Integer.valueOf(Color.parseColor("#FFFFFF")), Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#00BCD4")), Integer.valueOf(Color.parseColor("#2196F3")), Integer.valueOf(Color.parseColor("#9575CD")), Integer.valueOf(Color.parseColor("#BA68C8")), Integer.valueOf(Color.parseColor("#EF5250")), Integer.valueOf(Color.parseColor("#FF9800")), Integer.valueOf(Color.parseColor("#FFC107")), Integer.valueOf(Color.parseColor("#C0CA33")), Integer.valueOf(Color.parseColor("#4CAF50")), Integer.valueOf(Color.parseColor("#FFFF00"))};
    }

    @JvmStatic
    public static final int getLocalTransparentImg(@NotNull String id) {
        if (Intrinsics.areEqual(id, "60158")) {
            int i = R.drawable.icon_60158;
            if (Language.isSimplifiedChinese()) {
                return R.drawable.icon_60158_simple;
            }
            return Language.isTraditionalChinese() ? R.drawable.icon_60158_traditional : i;
        }
        if (Intrinsics.areEqual(id, "60159")) {
            int i2 = R.drawable.icon_60159;
            if (Language.isSimplifiedChinese()) {
                return R.drawable.icon_60159_simple;
            }
            return Language.isTraditionalChinese() ? R.drawable.icon_60159_traditional : i2;
        }
        if (!Intrinsics.areEqual(id, "60160")) {
            return R.drawable.icon_60158;
        }
        int i3 = R.drawable.icon_60160;
        if (Language.isSimplifiedChinese()) {
            return R.drawable.icon_60160_simple;
        }
        return Language.isTraditionalChinese() ? R.drawable.icon_60160_traditional : i3;
    }

    @JvmStatic
    @NotNull
    public static final Integer[] getMoreColorArray() {
        return new Integer[]{Integer.valueOf(Color.parseColor("#B2EBF2")), Integer.valueOf(Color.parseColor("#BBDEFB")), Integer.valueOf(Color.parseColor("#D1C4E9")), Integer.valueOf(Color.parseColor("#E1BEE7")), Integer.valueOf(Color.parseColor("#F8BBD0")), Integer.valueOf(Color.parseColor("#FFCED2")), Integer.valueOf(Color.parseColor("#FFCCBC")), Integer.valueOf(Color.parseColor("#FFE0B2")), Integer.valueOf(Color.parseColor("#FFECB3")), Integer.valueOf(Color.parseColor("#FFF9C4")), Integer.valueOf(Color.parseColor("#F0F4C3")), Integer.valueOf(Color.parseColor("#C8E6C9")), Integer.valueOf(Color.parseColor("#FFFFFF")), Integer.valueOf(Color.parseColor("#80DEEA")), Integer.valueOf(Color.parseColor("#90CAF9")), Integer.valueOf(Color.parseColor("#B39DDB")), Integer.valueOf(Color.parseColor("#CE93D8")), Integer.valueOf(Color.parseColor("#F48FB1")), Integer.valueOf(Color.parseColor("#EF9A9A")), Integer.valueOf(Color.parseColor("#FFAB91")), Integer.valueOf(Color.parseColor("#FFCC80")), Integer.valueOf(Color.parseColor("#FFE082")), Integer.valueOf(Color.parseColor("#FFF59D")), Integer.valueOf(Color.parseColor("#E6EE9C")), Integer.valueOf(Color.parseColor("#A5D6A7")), Integer.valueOf(Color.parseColor("#EBEBEB")), Integer.valueOf(Color.parseColor("#4CD0E1")), Integer.valueOf(Color.parseColor("#64B5F6")), Integer.valueOf(Color.parseColor("#9575CD")), Integer.valueOf(Color.parseColor("#BA68C8")), Integer.valueOf(Color.parseColor("#F06292")), Integer.valueOf(Color.parseColor("#E57373")), Integer.valueOf(Color.parseColor("#FF8965")), Integer.valueOf(Color.parseColor("#FFB74D")), Integer.valueOf(Color.parseColor("#FFD54F")), Integer.valueOf(Color.parseColor("#FFF175")), Integer.valueOf(Color.parseColor("#DCE775")), Integer.valueOf(Color.parseColor("#81C784")), Integer.valueOf(Color.parseColor("#D6D6D6")), Integer.valueOf(Color.parseColor("#26C6DA")), Integer.valueOf(Color.parseColor("#42A5F5")), Integer.valueOf(Color.parseColor("#7E57C2")), Integer.valueOf(Color.parseColor("#AB47BC")), Integer.valueOf(Color.parseColor("#EC3F7A")), Integer.valueOf(Color.parseColor("#E44849")), Integer.valueOf(Color.parseColor("#FF7042")), Integer.valueOf(Color.parseColor("#FFA726")), Integer.valueOf(Color.parseColor("#FFCA28")), Integer.valueOf(Color.parseColor("#FFEE58")), Integer.valueOf(Color.parseColor("#D4E157")), Integer.valueOf(Color.parseColor("#66BB69")), Integer.valueOf(Color.parseColor("#C2C2C2")), Integer.valueOf(Color.parseColor("#00BCD4")), Integer.valueOf(Color.parseColor("#2196F3")), Integer.valueOf(Color.parseColor("#673AB7")), Integer.valueOf(Color.parseColor("#9C27B0")), Integer.valueOf(Color.parseColor("#E91E63")), Integer.valueOf(Color.parseColor("#F44336")), Integer.valueOf(Color.parseColor("#FF5721")), Integer.valueOf(Color.parseColor("#FF9800")), Integer.valueOf(Color.parseColor("#FFC107")), Integer.valueOf(Color.parseColor("#FFEB3A")), Integer.valueOf(Color.parseColor("#CDDC39")), Integer.valueOf(Color.parseColor("#4CAF50")), Integer.valueOf(Color.parseColor("#999999")), Integer.valueOf(Color.parseColor("#00ACC1")), Integer.valueOf(Color.parseColor("#1D88E5")), Integer.valueOf(Color.parseColor("#5E35B1")), Integer.valueOf(Color.parseColor("#8D24AA")), Integer.valueOf(Color.parseColor("#D81B60")), Integer.valueOf(Color.parseColor("#E53835")), Integer.valueOf(Color.parseColor("#F4511D")), Integer.valueOf(Color.parseColor("#FB8C00")), Integer.valueOf(Color.parseColor("#FFB301")), Integer.valueOf(Color.parseColor("#FDD835")), Integer.valueOf(Color.parseColor("#C0CA33")), Integer.valueOf(Color.parseColor("#43A046")), Integer.valueOf(Color.parseColor("#707070")), Integer.valueOf(Color.parseColor("#0097A7")), Integer.valueOf(Color.parseColor("#1876D2")), Integer.valueOf(Color.parseColor("#502DA8")), Integer.valueOf(Color.parseColor("#7B1FA2")), Integer.valueOf(Color.parseColor("#C2185B")), Integer.valueOf(Color.parseColor("#D32F2F")), Integer.valueOf(Color.parseColor("#E64A18")), Integer.valueOf(Color.parseColor("#F57C00")), Integer.valueOf(Color.parseColor("#FFA001")), Integer.valueOf(Color.parseColor("#FBC02D")), Integer.valueOf(Color.parseColor("#AFB42B")), Integer.valueOf(Color.parseColor("#388E3C")), Integer.valueOf(Color.parseColor("#474747")), Integer.valueOf(Color.parseColor("#00838F")), Integer.valueOf(Color.parseColor("#1565C0")), Integer.valueOf(Color.parseColor("#4426A0")), Integer.valueOf(Color.parseColor("#6A1A9A")), Integer.valueOf(Color.parseColor("#AD1457")), Integer.valueOf(Color.parseColor("#C62828")), Integer.valueOf(Color.parseColor("#D84315")), Integer.valueOf(Color.parseColor("#EF6C00")), Integer.valueOf(Color.parseColor("#FE8F00")), Integer.valueOf(Color.parseColor("#F9A825")), Integer.valueOf(Color.parseColor("#9E9D24")), Integer.valueOf(Color.parseColor("#2E7D32")), Integer.valueOf(Color.parseColor("#333333")), Integer.valueOf(Color.parseColor("#006064")), Integer.valueOf(Color.parseColor("#0C479F")), Integer.valueOf(Color.parseColor("#311A92")), Integer.valueOf(Color.parseColor("#4A138C")), Integer.valueOf(Color.parseColor("#880E4F")), Integer.valueOf(Color.parseColor("#B71B1D")), Integer.valueOf(Color.parseColor("#BF360C")), Integer.valueOf(Color.parseColor("#E65100")), Integer.valueOf(Color.parseColor("#FF6F00")), Integer.valueOf(Color.parseColor("#F57F17")), Integer.valueOf(Color.parseColor("#827717")), Integer.valueOf(Color.parseColor("#1B5E1F")), Integer.valueOf(Color.parseColor("#000000"))};
    }

    @JvmStatic
    @Nullable
    public static final Object getTransImageRes(@Nullable WatchSkinBean bean) {
        String transparentBackground;
        if (bean == null) {
            return null;
        }
        WatchSkinBean.MetasBean metas = bean.getMetas();
        return (metas == null || (transparentBackground = metas.getTransparentBackground()) == null) ? Integer.valueOf(getLocalTransparentImg(String.valueOf(bean.getId()))) : transparentBackground;
    }

    private final WatchResult<Integer> h(Activity activity, PayChannelBo payChannel, String prepaidData) {
        return payChannel == PayChannelBo.WECHAT ? i(activity, prepaidData) : g(activity, prepaidData);
    }

    private final WatchResult<Integer> i(Activity activity, String prepaidData) {
        WatchResult<Integer> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        if (TextUtils.isEmpty(prepaidData)) {
            watchResult.setMError(new Throwable("prepaidData为null 无法启动微信支付"));
            return watchResult;
        }
        String str = TAG;
        HMLog.debug(str, g.a);
        WeChatResponse weChatResponsePay = WeChatPay.pay(activity, prepaidData);
        int code = weChatResponsePay.getCode();
        HMLog.info(str, new h(weChatResponsePay.getMessage(), code));
        watchResult.setCode(code);
        watchResult.setData(Integer.valueOf(code));
        watchResult.setSuccessful(code == 0);
        return watchResult;
    }

    private final WatchSkinBean j(LocalWatchSkinEntity entity) {
        if (entity == null) {
            return null;
        }
        WatchSkinBean watchSkinBean = new WatchSkinBean();
        watchSkinBean.setId(entity.id);
        watchSkinBean.setDownloadUrl(entity.binPath);
        watchSkinBean.setName(entity.name);
        watchSkinBean.setImage(entity.thumbnailPath);
        watchSkinBean.setLocal(true);
        watchSkinBean.setFree(true);
        watchSkinBean.setSelectColor(entity.selectColor);
        watchSkinBean.setCustomizable(entity.customizable);
        if (entity.transBgPath != null) {
            WatchSkinBean.MetasBean metasBean = new WatchSkinBean.MetasBean();
            metasBean.setTransparentBackground(entity.transBgPath);
            watchSkinBean.setMetas(metasBean);
        }
        return watchSkinBean;
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<List<WatchSkinBean>> loadAllLocalWatchSkin(@NotNull Context context, int count) {
        WatchResult<List<WatchSkinBean>> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        WatchResult<List<WatchSkinBean>> watchResultB = INSTANCE.b(context, true);
        List<WatchSkinBean> data = watchResultB.getData();
        int size = data == null ? 0 : data.size();
        ArrayList arrayList = new ArrayList();
        if (size != 0) {
            if (count >= size) {
                count = size;
            }
            arrayList.addAll(data.subList(0, count));
        }
        watchResult.setSuccessful(watchResultB.isSuccessful());
        watchResult.setMError(watchResultB.getMError());
        watchResult.setData(arrayList);
        return watchResult;
    }

    @JvmStatic
    @JvmOverloads
    public static final void loadImage(@NotNull Context context, @NotNull ImageView imageView, @NotNull Object obj) {
        loadImage$default(context, imageView, obj, false, 8, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void loadImage(@NotNull Context context, @NotNull ImageView iv, @NotNull Object url, boolean skipCache) {
        if (url instanceof Integer) {
            if (skipCache) {
                INSTANCE.c(context, iv, ((Number) url).intValue());
                return;
            } else {
                if (skipCache) {
                    return;
                }
                INSTANCE.e(context, iv, ((Number) url).intValue());
                return;
            }
        }
        if (url instanceof String) {
            if (skipCache) {
                INSTANCE.d(context, iv, (String) url);
            } else {
                if (skipCache) {
                    return;
                }
                INSTANCE.f(context, iv, (String) url);
            }
        }
    }

    public static /* synthetic */ void loadImage$default(Context context, ImageView imageView, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        loadImage(context, imageView, obj, z);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final WatchResult<WatchSkinPage> loadLocalWatchSkinPage(@NotNull Context context, int i) {
        return loadLocalWatchSkinPage$default(context, i, 0, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final WatchResult<WatchSkinPage> loadLocalWatchSkinPage(@NotNull Context context, int curPage, int perPage) {
        WatchResult<WatchSkinPage> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        WatchResult<List<WatchSkinBean>> watchResultB = INSTANCE.b(context, true);
        List<WatchSkinBean> data = watchResultB.getData();
        WatchSkinPage watchSkinPage = new WatchSkinPage();
        int size = data == null ? 0 : data.size();
        int i = ((perPage - 1) + size) / perPage;
        ArrayList arrayList = new ArrayList();
        if (data != null && size > 0) {
            int i2 = (curPage - 1) * perPage;
            int i3 = curPage * perPage;
            if (i3 < size) {
                size = i3;
            }
            HMLog.info(TAG, new b(i2, size));
            if (i2 < size) {
                arrayList.addAll(data.subList(i2, size));
            }
        }
        watchResult.setMError(watchResultB.getMError());
        watchResult.setSuccessful(watchResultB.isSuccessful());
        watchSkinPage.setTotalPage(i);
        watchSkinPage.setPage(curPage);
        watchSkinPage.setPerPage(perPage);
        watchSkinPage.setData(arrayList);
        watchResult.setMoreEnd(curPage + 1 >= i);
        watchResult.setData(watchSkinPage);
        HMLog.info(TAG, new c(watchResult));
        return watchResult;
    }

    public static /* synthetic */ WatchResult loadLocalWatchSkinPage$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 30;
        }
        return loadLocalWatchSkinPage(context, i, i2);
    }

    @JvmStatic
    @NotNull
    public static final WatchResult<WatchSkinBean> loadSingleLocalWatchSkin(@NotNull AppCompatActivity activity, boolean isFromOutside, @NotNull String watchSkinFilePath) {
        WatchResult<WatchSkinBean> watchResult = new WatchResult<>(false, 0, false, null, null, 31, null);
        LocalWatchSkinEntity localWatchSkinEntityHandleWatchSkinFile = isFromOutside ? WatchSkinManager.handleWatchSkinFile(activity, watchSkinFilePath) : WatchSkinManager.loadWatchSkinFile(activity, watchSkinFilePath, true);
        HMLog.info(TAG, new d(localWatchSkinEntityHandleWatchSkinFile));
        if (localWatchSkinEntityHandleWatchSkinFile == null) {
            return watchResult;
        }
        watchResult.setSuccessful(true);
        watchResult.setData(INSTANCE.j(localWatchSkinEntityHandleWatchSkinFile));
        return watchResult;
    }

    @JvmStatic
    public static final void setTintDrawable(@NotNull ImageView imageView, @Nullable Drawable resource, int selectColor) {
        if (resource == null) {
            return;
        }
        if (selectColor != 0) {
            TintUtils.tintDrawable(resource, selectColor);
        }
        imageView.setImageDrawable(resource);
    }

    @JvmStatic
    public static final void setTintTransBg(@NotNull Context context, @NotNull final ImageView imageView, @NotNull Object url, final int selectColor) {
        if (url instanceof Integer) {
            HMImageLoader.with(context).load(((Number) url).intValue()).asDrawable().into(new HMLoadTarget<Drawable>() { // from class: com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper.setTintTransBg.1
                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFinish(@Nullable Drawable resource) {
                    WatchSkinHelper.setTintDrawable(imageView, resource, selectColor);
                }
            });
        } else {
            HMImageLoader.with(context).load(url instanceof String ? (String) url : null).asDrawable().into(new HMLoadTarget<Drawable>() { // from class: com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper.setTintTransBg.2
                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFinish(@Nullable Drawable resource) {
                    WatchSkinHelper.setTintDrawable(imageView, resource, selectColor);
                }
            });
        }
    }
}
