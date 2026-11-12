package com.huami.nfc.bus;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.nfc.applet.City;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.api.IXiaomiAppletWebApi;
import com.huami.nfc.bus.api.IXiaomiWebApi;
import com.huami.nfc.bus.entities.CardNo;
import com.huami.nfc.bus.entities.CarouselEntity;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.PayAccountInfoPostBody;
import com.huami.nfc.bus.entities.PayAccountInfoPostBodyKt;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.nfc.bus.service.XiaomiService;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.nfc.web.server.ProtocolServer;
import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB'\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010b\u001a\u00020`\u0012\u0006\u0010f\u001a\u00020c\u0012\u0006\u0010j\u001a\u00020g¢\u0006\u0004\bk\u0010lJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016JY\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b(\u0010)J*\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0/0\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000f2\u0006\u00104\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u00108\u001a\u000207H\u0016J\u0014\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000fH\u0016J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;H\u0016J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016JB\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J&\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J>\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J.\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u000f2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000bH\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u000f2\u0006\u0010*\u001a\u00020\u000bH\u0016J0\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u000f2\u0006\u0010N\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0016J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u000f2\u0006\u0010O\u001a\u00020\u000bH\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010O\u001a\u00020\u000bH\u0016J2\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u000f2\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u000b2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016J&\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000bH\u0016J&\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010^R\u0016\u0010b\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/huami/nfc/bus/XiaomiWebApi;", "Lcom/huami/nfc/bus/api/IXiaomiWebApi;", "Lorg/json/JSONObject;", "json", "", "Lcom/huami/nfc/bus/XiaomiNoticesEntity;", "b", "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "a", "Lcom/huami/nfc/applet/City;", "city", "", "deviceId", "orderToken", "actionType", "Lcom/huami/nfc/base/PayResponse;", "", "returnCard", "miCardName", "getChargeInvoiceDescription", "getCardInstructions", "Lcom/huami/nfc/bus/entities/CarouselEntity;", "getCarouselList", "", "feeId", "Lcom/huami/nfc/bus/CouponEntity;", "getCoupon", "Lcom/huami/nfc/bus/PayType;", "type", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "couponId", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "Lcom/huami/nfc/bus/MiPayChannelInfo;", "payChannelInfo", "phone", Configs.Params.CAPTCHA, "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/huami/nfc/bus/MiPayChannelInfo;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "orderId", "aid", "cardName", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "getOrderInfo", "", "getOrders", FirebaseAnalytics.Event.REFUND, "seNumber", "getCardNumber", "xiaomiBusCardName", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "getNotices", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "info", "postInvoiceInfo", "Lcom/huami/nfc/bus/XiaomiInVoiceEntity;", "getInvoiceAddress", "appCode", "userProtocolId", "cityId", "issueCard", "charge", "deleteApp", "shiftCard", "checkShiftCard", "claimedBalance", "Lcom/huami/nfc/bus/PrepareTransferOut;", "prepareTransferOut", "confirmTransferOut", "Lcom/huami/nfc/bus/TransferIn;", "startTransferIn", "tag", "xmCardName", "bulletins", "Lcom/huami/nfc/bus/MiRefundStatus;", "queryRefundStatus", "applyRefund", "reasonCode", "Lcom/huami/nfc/bus/entities/PayAccountInfoPostBody;", "payAccountInfo", "Lcom/huami/nfc/bus/XiaomiPrepareReturn;", "prepareReturn", Configs.Params.AUTHCODE, "authChannel", "authorizationBind", "sendCaptcha", "Lcom/huami/nfc/bus/service/XiaomiService;", "Lcom/huami/nfc/bus/service/XiaomiService;", "service", "Lcom/huami/nfc/web/server/ProtocolServer;", "Lcom/huami/nfc/web/server/ProtocolServer;", "protocolService", "Lcom/huami/nfc/bus/api/IXiaomiAppletWebApi;", "c", "Lcom/huami/nfc/bus/api/IXiaomiAppletWebApi;", "appletApi", "Lcom/huami/nfc/base/INfcChannel;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/base/INfcChannel;", com.tekartik.sqflite.Constant.h, "<init>", "(Lcom/huami/nfc/bus/service/XiaomiService;Lcom/huami/nfc/web/server/ProtocolServer;Lcom/huami/nfc/bus/api/IXiaomiAppletWebApi;Lcom/huami/nfc/base/INfcChannel;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiWebApi implements IXiaomiWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final XiaomiService service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ProtocolServer protocolService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IXiaomiAppletWebApi appletApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel cmd;

    /* JADX INFO: renamed from: com.huami.nfc.bus.XiaomiWebApi$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"com/huami/nfc/bus/XiaomiWebApi$a", "", "", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "a", "orders", "Lcom/huami/nfc/bus/XiaomiWebApi$a;", "b", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", GoogleApiAvailabilityLight.a, "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ListXiaomiOrderInfoEntity {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("orders")
        @NotNull
        private final List<XiaomiOrderInfoEntity> orders;

        public ListXiaomiOrderInfoEntity(@NotNull List<XiaomiOrderInfoEntity> list) {
            this.orders = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListXiaomiOrderInfoEntity c(ListXiaomiOrderInfoEntity listXiaomiOrderInfoEntity, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = listXiaomiOrderInfoEntity.orders;
            }
            return listXiaomiOrderInfoEntity.b(list);
        }

        @NotNull
        public final List<XiaomiOrderInfoEntity> a() {
            return this.orders;
        }

        @NotNull
        public final ListXiaomiOrderInfoEntity b(@NotNull List<XiaomiOrderInfoEntity> orders) {
            return new ListXiaomiOrderInfoEntity(orders);
        }

        @NotNull
        public final List<XiaomiOrderInfoEntity> d() {
            return this.orders;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ListXiaomiOrderInfoEntity) && Intrinsics.areEqual(this.orders, ((ListXiaomiOrderInfoEntity) other).orders);
        }

        public int hashCode() {
            return this.orders.hashCode();
        }

        @NotNull
        public String toString() {
            return "ListXiaomiOrderInfoEntity(orders=" + this.orders + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("cardName", this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("cardName", this.a);
            jSONObject.put(Configs.Params.AUTHCODE, this.b);
            jSONObject.put("authChannel", this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Boolean, String, List<XiaomiBulletin>> {
        public d() {
            super(2);
        }

        @Nullable
        public final List<XiaomiBulletin> a(boolean z, @Nullable String str) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                return !(str == null || str.length() == 0) ? XiaomiWebApi.this.a(new JSONObject(str)) : arrayList;
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<XiaomiBulletin> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, String str4) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> getA() {
            return XiaomiWebApi.this.appletApi.charge(this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, String str3, String str4) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> getA() {
            return XiaomiWebApi.this.appletApi.checkShiftCard(this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> getA() {
            return XiaomiWebApi.this.appletApi.deleteApp(this.b, this.c, this.d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Double b;
        public final /* synthetic */ Double c;
        public final /* synthetic */ Integer d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ MiPayChannelInfo g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, Double d, Double d2, Integer num, String str, String str2, MiPayChannelInfo miPayChannelInfo) {
            super(1);
            this.a = i;
            this.b = d;
            this.c = d2;
            this.d = num;
            this.e = str;
            this.f = str2;
            this.g = miPayChannelInfo;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("feeId", this.a);
            Double d = this.b;
            if (d != null) {
                jSONObject.put(Constant.KEY_LONGITUDE, String.valueOf(d.doubleValue()));
            }
            Double d2 = this.c;
            if (d2 != null) {
                jSONObject.put(Constant.KEY_LATITUDE, String.valueOf(d2.doubleValue()));
            }
            JSONObject jSONObject2 = new JSONObject();
            Integer num = this.d;
            if (num != null) {
                jSONObject2.put("couponId", num.intValue());
            }
            String str = this.e;
            if (str != null) {
                jSONObject2.put("phone", str);
            }
            String str2 = this.f;
            if (str2 != null) {
                jSONObject2.put(Configs.Params.CAPTCHA, str2);
            }
            MiPayChannelInfo miPayChannelInfo = this.g;
            if (miPayChannelInfo != null) {
                jSONObject2.put("payChannel", miPayChannelInfo.getPayChannel().getValue());
                jSONObject2.put("packageName", miPayChannelInfo.getPackageName());
            }
            jSONObject.put("extra", jSONObject2.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<Boolean, String, String> {
        public static final i a = new i();

        public i() {
            super(2);
        }

        @Nullable
        public final String a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return new JSONObject(str).optString("resp_data");
                }
            }
            return "";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("aid", this.a);
            jSONObject.put("cardNo", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/CardNo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends CardNo>, String> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<CardNo> payResponse) {
            CardNo data = payResponse.getData();
            if (data == null) {
                return null;
            }
            return data.getNumber();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/bus/XiaomiNoticesEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function2<Boolean, String, List<XiaomiNoticesEntity>> {
        public l() {
            super(2);
        }

        @Nullable
        public final List<XiaomiNoticesEntity> a(boolean z, @Nullable String str) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                return !(str == null || str.length() == 0) ? XiaomiWebApi.this.b(new JSONObject(str)) : arrayList;
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<XiaomiNoticesEntity> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, String str3, String str4, String str5, String str6) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> getA() {
            return XiaomiWebApi.this.appletApi.issueCard(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ PayAccountInfoPostBody d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, String str3, PayAccountInfoPostBody payAccountInfoPostBody) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = payAccountInfoPostBody;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("cardName", this.a);
            jSONObject.put("claimedBalance", this.b);
            jSONObject.put("reasonCode", this.c);
            PayAccountInfoPostBody payAccountInfoPostBody = this.d;
            jSONObject.put("payAccountInfo", payAccountInfoPostBody == null ? null : PayAccountInfoPostBodyKt.jsonBody(payAccountInfoPostBody));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("cardName", this.a);
            jSONObject.put("claimedBalance", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("cardName", this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("snb_order_no", this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ City b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(City city, String str, String str2, String str3) {
            super(0);
            this.b = city;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> getA() {
            return XiaomiWebApi.this.appletApi.returnCard(this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, String str2, String str3, String str4, String str5, String str6) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> getA() {
            return XiaomiWebApi.this.appletApi.shiftCard(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    public XiaomiWebApi(@NotNull XiaomiService xiaomiService, @NotNull ProtocolServer protocolServer, @NotNull IXiaomiAppletWebApi iXiaomiAppletWebApi, @NotNull INfcChannel iNfcChannel) {
        this.service = xiaomiService;
        this.protocolService = protocolServer;
        this.appletApi = iXiaomiAppletWebApi;
        this.cmd = iNfcChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<XiaomiBulletin> a(JSONObject json) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("items");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList2.add(jSONArrayOptJSONArray.getJSONObject(((IntIterator) it2).nextInt()).toString());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList.add((XiaomiBulletin) new Gson().fromJson((String) it3.next(), XiaomiBulletin.class));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<XiaomiNoticesEntity> b(JSONObject json) {
        int length;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = json.optJSONArray("items");
        if (jSONArrayOptJSONArray2 != null && (length = jSONArrayOptJSONArray2.length()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("itemList")) == null) {
                    return arrayList;
                }
                int length2 = jSONArrayOptJSONArray.length();
                if (length2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i4);
                        if (jSONObjectOptJSONObject2 == null) {
                            return arrayList;
                        }
                        arrayList.add(new XiaomiNoticesEntity(City.INSTANCE.fromXiaomiName(jSONObjectOptJSONObject.optString("cardName")).getAppCode(), jSONObjectOptJSONObject.optString("cardName"), jSONObjectOptJSONObject2.optString("type"), jSONObjectOptJSONObject2.optInt("status"), jSONObjectOptJSONObject2.optString("desc")));
                        if (i5 >= length2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i3 < length) {
                    i2 = i3;
                }
            }
        }
        return arrayList;
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return PayResponseKt.toPayResponse(this.protocolService.agreeProtocol(kotlin.collections.q.mapOf(TuplesKt.to("id", String.valueOf(id)))).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> applyRefund(@NotNull String xmCardName) {
        return PayResponseKt.toPayResponse(this.service.applyRefund(ExpansionsKt.requestBody$default(null, new b(xmCardName), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> authorizationBind(@NotNull String xmCardName, @NotNull String authCode, @NotNull String authChannel) {
        return PayResponseKt.toPayResponse(this.service.authorizationBind(ExpansionsKt.requestBody$default(null, new c(xmCardName, authCode, authChannel), 1, null)).execute());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<XiaomiBulletin>> bulletins(@NotNull String tag, @Nullable String xmCardName, @Nullable String aid) throws JSONException {
        String string;
        if (xmCardName == null || xmCardName.length() == 0) {
            string = new JSONObject().toString();
        } else {
            if (aid == null || aid.length() == 0) {
                string = new JSONObject().toString();
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cardName", xmCardName);
                jSONObject.put("aid", aid);
                string = jSONObject.toString();
            }
        }
        return PayResponseKt.response(this.service.bulletins(tag, string).execute(), new d());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> charge(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new e(appCode, aid, deviceId, orderToken));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> checkShiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new f(appCode, aid, miCardName, deviceId));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> confirmTransferOut(@NotNull String orderId) {
        return PayResponseKt.toPayResponse(this.service.confirmTransferOut(orderId).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new g(appCode, aid, deviceId));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<OrderEntity> generateOrder(int feeId, @Nullable Integer couponId, @Nullable Double longitude, @Nullable Double latitude, @Nullable MiPayChannelInfo payChannelInfo, @Nullable String phone, @Nullable String captcha) {
        return PayResponseKt.toPayResponse(this.service.generateOrder(ExpansionsKt.requestBody$default(null, new h(feeId, longitude, latitude, couponId, phone, captcha, payChannelInfo), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> getCardInstructions(@NotNull String miCardName) {
        return PayResponseKt.response(this.service.getCardInstructions(miCardName).execute(), i.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> getCardNumber(@NotNull String aid, @NotNull String seNumber) {
        if (Intrinsics.areEqual(aid, com.huami.nfc.applet.ConstantKt.AID_SHANG_HAI) ? true : Intrinsics.areEqual(aid, com.huami.nfc.applet.ConstantKt.AID_JJJ)) {
            return PayResponseKt.map(PayResponseKt.toPayResponse(this.service.getCardNum(ExpansionsKt.requestBody$default(null, new j(aid, seNumber), 1, null)).execute()), k.a);
        }
        return PayResponse.INSTANCE.error(PayResponse.CODE_PARAMETER_ERROR, "参数错误。city:" + aid + "，city仅支持京津冀、上海}");
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<CarouselEntity>> getCarouselList(@NotNull String miCardName) {
        return PayResponseKt.toPayResponse(this.service.getCarouselList(miCardName).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> getChargeInvoiceDescription(@NotNull String miCardName) {
        return PayResponseKt.toPayResponse(this.service.getChargeInvoiceDescription(miCardName).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<CouponEntity>> getCoupon(int feeId) {
        return PayResponseKt.toPayResponse(this.service.getCoupon(feeId).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<XiaomiInVoiceEntity> getInvoiceAddress(@NotNull String miCardName) {
        return PayResponseKt.toPayResponse(this.service.getInvoiceAddress(kotlin.collections.q.mapOf(TuplesKt.to("xm_card_name", miCardName))).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<XiaomiNoticesEntity>> getNotices() {
        return PayResponseKt.response(this.service.getMaintainNotices().execute(), new l());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<XiaomiOrderInfoEntity> getOrderInfo(@NotNull String orderId, @Nullable String aid, @Nullable String cardName) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aid != null) {
        }
        if (cardName != null) {
        }
        return PayResponseKt.toPayResponse(this.service.getXiaomiOrderInfo(orderId, linkedHashMap).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<XiaomiOrderInfoEntity>> getOrders(@NotNull String miCardName) {
        return PayResponseKt.response(this.service.getXiaomiOrders(kotlin.collections.r.mutableMapOf(TuplesKt.to("xm_card_name", miCardName))).execute(), new Function2<Boolean, String, List<? extends XiaomiOrderInfoEntity>>() { // from class: com.huami.nfc.bus.XiaomiWebApi.getOrders.1
            @Nullable
            public final List<XiaomiOrderInfoEntity> a(boolean z, @Nullable String str) {
                if (z) {
                    if (!(str == null || str.length() == 0)) {
                        return ((ListXiaomiOrderInfoEntity) ((PayResponse) PayResponseKt.getGson().fromJson(str, new TypeToken<PayResponse<? extends ListXiaomiOrderInfoEntity>>() { // from class: com.huami.nfc.bus.XiaomiWebApi$getOrders$1$invoke$$inlined$fromJson$1
                        }.getType())).getData()).d();
                    }
                }
                return CollectionsKt___CollectionsKt.toList(new ArrayList());
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ List<? extends XiaomiOrderInfoEntity> invoke(Boolean bool, String str) {
                return a(bool.booleanValue(), str);
            }
        });
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String xiaomiBusCardName, @NotNull String actionType) {
        return PayResponseKt.toPayResponse(this.protocolService.getProtocol(kotlin.collections.r.mapOf(TuplesKt.to("xm_card_name", xiaomiBusCardName), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType))).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<TransAmountEntity>> getTransactionAmount(@NotNull String miCardName, @NotNull PayType type) {
        return PayResponseKt.toPayResponse(this.service.getTransactionAmount(kotlin.collections.r.mutableMapOf(TuplesKt.to("xm_card_name", miCardName), TuplesKt.to("type", String.valueOf(type.getValue())))).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken, @Nullable String userProtocolId, @Nullable String cityId) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new m(appCode, aid, deviceId, orderToken, userProtocolId, cityId));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> postInvoiceInfo(@NotNull String miCardName, @NotNull InvoiceEntity info) {
        return PayResponseKt.toPayResponse(this.service.postFeeInvoice(kotlin.collections.q.mapOf(TuplesKt.to("xm_card_name", miCardName)), ExpansionsKt.requestBody(new Gson().toJson(info))).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<XiaomiPrepareReturn> prepareReturn(@NotNull String xmCardName, @NotNull String claimedBalance, @Nullable String reasonCode, @Nullable PayAccountInfoPostBody payAccountInfo) {
        return PayResponseKt.toPayResponse(this.service.prepareReturn(ExpansionsKt.requestBody$default(null, new n(xmCardName, claimedBalance, reasonCode, payAccountInfo), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<PrepareTransferOut> prepareTransferOut(@NotNull String cardName, @NotNull String claimedBalance) {
        return PayResponseKt.toPayResponse(this.service.prepareTransferOut(ExpansionsKt.requestBody$default(null, new o(cardName, claimedBalance), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<MiRefundStatus> queryRefundStatus(@NotNull String xmCardName) {
        return PayResponseKt.toPayResponse(this.service.queryRefundStatus(ExpansionsKt.requestBody$default(null, new p(xmCardName), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> refund(@NotNull String orderId) {
        return PayResponseKt.toPayResponse(this.service.refund(ExpansionsKt.requestBody$default(null, new q(orderId), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> returnCard(@NotNull City city, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new r(city, deviceId, orderToken, actionType));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> sendCaptcha(@NotNull String phone, @NotNull String cardName, @NotNull String actionType) {
        return PayResponseKt.toPayResponse(this.service.sendCaptcha(phone, cardName, actionType).execute());
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new s(appCode, aid, miCardName, deviceId, orderToken, actionType));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<TransferIn> startTransferIn(@NotNull String orderId) {
        return PayResponseKt.toPayResponse(this.service.startTransferIn(orderId).execute());
    }
}
