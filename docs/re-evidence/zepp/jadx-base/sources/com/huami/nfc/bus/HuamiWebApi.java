package com.huami.nfc.bus;

import androidx.autofill.HintConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.api.IHuamiWebApi;
import com.huami.nfc.bus.entities.AlipayPostBody;
import com.huami.nfc.bus.entities.CardInfoEntity;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.OpenFeeStateEntity;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundOpenFeeEntity;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.nfc.bus.entities.TopRefundTicketPostBody;
import com.huami.nfc.bus.service.HuamiService;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.ProtocolType;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.nfc.web.server.ProtocolServer;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.infra.galaxy.fds.Common;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010O\u001a\u00020M\u0012\u0006\u0010R\u001a\u00020P¢\u0006\u0004\bS\u0010TJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\bH\u0002J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J,\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0013H\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0016J.\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010(\u001a\u00020\bH\u0016J<\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016JM\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00132\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010/2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u00101J\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00132\u0006\u0010(\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016J&\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010(\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0016JK\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001d0\u00132\u0006\u0010+\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010:\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u000f\u001a\u00020\bH\u0016J&\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001d0\u00132\u0006\u0010+\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00040\u0013H\u0016J\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0016J\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0016J\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010F\u001a\u00020/H\u0016J'\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u000f\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\bH\u0010IJ\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00132\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020JH\u0016R\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010NR\u0016\u0010R\u001a\u00020P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010Q¨\u0006U"}, d2 = {"Lcom/huami/nfc/bus/HuamiWebApi;", "Lcom/huami/nfc/bus/api/IHuamiWebApi;", "Lorg/json/JSONObject;", "json", "", "Lcom/huami/nfc/bus/entities/CardInfoEntity;", "a", "Lcom/huami/nfc/applet/TransEntity;", "", "e", "c", "Lcom/huami/nfc/applet/TransType;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/bus/CityInfoEntity;", "b", "appCode", "", "limit", "next", "Lcom/huami/nfc/base/PayResponse;", "getCardInfoList", "info", "", "postCardInfo", "cardNo", "Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "getOpenFeeStatus", "Lcom/huami/nfc/bus/entities/RefundOpenFeeEntity;", "applyRefundOpenFee", "", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "returnCardReason", "authChannelType", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", Common.AUTHORIZATION, "refundReasonCode", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "refundTicketPostBody", "Lcom/huami/nfc/bus/entities/RefundTicket;", "refundTicket", "userId", "getPhoneNumber", "cardNumber", "deviceId", "trans", "uploadTransactions", "type", "", "getTransactionsRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;I)Lcom/huami/nfc/base/PayResponse;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "Lcom/huami/nfc/bus/VerifyCodeEntity;", "sendCaptcha", Configs.Params.CAPTCHA, "verifyCaptcha", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "gpsCityCode", "getAvailableCitiesWithStatus", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "getCityInfo", "cityCode", "getInstalledBusCards", "Lcom/huami/nfc/bus/NoticesEntity;", "getNotices", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "getShiftProtocol", "id", "agreeProtocol", "agreeShiftProtocol", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "getFeeInvoice", "postFeeInvoice", "Lcom/huami/nfc/bus/service/HuamiService;", "Lcom/huami/nfc/bus/service/HuamiService;", "service", "Lcom/huami/nfc/web/server/ProtocolServer;", "Lcom/huami/nfc/web/server/ProtocolServer;", "protocolService", "<init>", "(Lcom/huami/nfc/bus/service/HuamiService;Lcom/huami/nfc/web/server/ProtocolServer;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiWebApi implements IHuamiWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HuamiService service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ProtocolServer protocolService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put(ConstantKt.KEY_APP_CODE, this.a);
            jSONObject.put("cardNo", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Boolean, String, List<? extends CityInfoEntity>> {
        public b() {
            super(2);
        }

        @Nullable
        public final List<CityInfoEntity> a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return HuamiWebApi.this.b(new JSONObject(str));
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends CityInfoEntity> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/bus/entities/CardInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Boolean, String, List<CardInfoEntity>> {
        public c() {
            super(2);
        }

        @Nullable
        public final List<CardInfoEntity> a(boolean z, @Nullable String str) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                return !(str == null || str.length() == 0) ? HuamiWebApi.this.a(new JSONObject(str)) : arrayList;
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<CardInfoEntity> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Boolean, String, List<? extends CityInfoEntity>> {
        public d() {
            super(2);
        }

        @Nullable
        public final List<CityInfoEntity> a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return HuamiWebApi.this.b(new JSONObject(str));
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends CityInfoEntity> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Boolean, String, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(2);
            this.a = str;
        }

        @Nullable
        public final String a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return new JSONObject(str).optString(this.a);
                }
            }
            return "";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/applet/TransEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Boolean, String, List<TransEntity>> {
        public f() {
            super(2);
        }

        @Nullable
        public final List<TransEntity> a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return HuamiWebApi.this.c(new JSONObject(str));
                }
            }
            return new ArrayList();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<TransEntity> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "Lcom/huami/nfc/bus/VerifyCodeEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<Boolean, String, VerifyCodeEntity> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        @Nullable
        public final VerifyCodeEntity a(boolean z, @Nullable String str) {
            if (z) {
                return null;
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new VerifyCodeEntity(jSONObject.optInt("code"), jSONObject.optString("message"));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ VerifyCodeEntity invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONArray;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<JSONArray, Unit> {
        public final /* synthetic */ List<TransEntity> a;
        public final /* synthetic */ HuamiWebApi b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<TransEntity> list, HuamiWebApi huamiWebApi) {
            super(1);
            this.a = list;
            this.b = huamiWebApi;
        }

        public final void a(@NotNull JSONArray jSONArray) throws JSONException {
            List<TransEntity> list = this.a;
            HuamiWebApi huamiWebApi = this.b;
            for (TransEntity transEntity : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", transEntity.getSource());
                jSONObject.put("aid", transEntity.getAid());
                jSONObject.put("transId", transEntity.getTransId());
                jSONObject.put("overdraftLimit", transEntity.getOverdraftLimit());
                jSONObject.put("transactionType", huamiWebApi.e(transEntity));
                jSONObject.put("transactionTime", transEntity.getTime());
                jSONObject.put("posId", transEntity.getPosId());
                jSONObject.put("state", com.alipay.sdk.m.f0.c.p);
                jSONObject.put("amount", transEntity.getAmount());
                jSONObject.put("site", "");
                jSONObject.put("serviceProvider", "");
                jSONArray.put(jSONObject);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONArray jSONArray) throws JSONException {
            a(jSONArray);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<Boolean, String, Unit> {
        public static final i a = new i();

        public i() {
            super(2);
        }

        public final void a(boolean z, @Nullable String str) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
            a(bool.booleanValue(), str);
            return Unit.INSTANCE;
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
            jSONObject.put("phone", this.a);
            jSONObject.put(Configs.Params.CAPTCHA, this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function2<Boolean, String, Unit> {
        public static final k a = new k();

        public k() {
            super(2);
        }

        public final void a(boolean z, @Nullable String str) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
            a(bool.booleanValue(), str);
            return Unit.INSTANCE;
        }
    }

    public HuamiWebApi(@NotNull HuamiService huamiService, @NotNull ProtocolServer protocolServer) {
        this.service = huamiService;
        this.protocolService = protocolServer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CardInfoEntity> a(JSONObject json) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("items");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayOptJSONArray.length());
        ArrayList<JSONObject> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList2.add(jSONArrayOptJSONArray.getJSONObject(((IntIterator) it2).nextInt()));
        }
        for (JSONObject jSONObject : arrayList2) {
            arrayList.add(new CardInfoEntity(jSONObject.optString(StatEvent.SPORT_TP_VALUE_BALANCE), jSONObject.optString("activationDate"), jSONObject.optString("cardNumber"), jSONObject.optString("expiredDate"), jSONObject.optLong(EcgData.TIMESTAMP_SERVER_UPDATED)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CityInfoEntity> b(JSONObject json) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (json == null || (jSONArrayOptJSONArray = json.optJSONArray("items")) == null) {
            return arrayList;
        }
        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList2.add(jSONArrayOptJSONArray.get(((IntIterator) it2).nextInt()));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList.add((CityInfoEntity) PayResponseKt.getGson().fromJson(it3.next().toString(), new TypeToken<CityInfoEntity>() { // from class: com.huami.nfc.bus.HuamiWebApi$getCityInfoList$lambda-5$$inlined$fromJson$1
            }.getType()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TransEntity> c(JSONObject json) {
        if (json == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("items");
        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayOptJSONArray.length());
        ArrayList<JSONObject> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            arrayList2.add(jSONArrayOptJSONArray.getJSONObject(((IntIterator) it2).nextInt()));
        }
        for (JSONObject jSONObject : arrayList2) {
            arrayList.add(new TransEntity(jSONObject.optString("source"), jSONObject.optString("aid"), jSONObject.optString("transId"), jSONObject.optLong("transactionTime"), jSONObject.optInt("amount"), d(jSONObject.optString("transactionType")), jSONObject.optString("posId"), jSONObject.optInt("overdraftLimit")));
        }
        return arrayList;
    }

    private final TransType d(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1881484424) {
            if (iHashCode != 67005413) {
                if (iHashCode == 80008848 && str.equals("TOPUP")) {
                    return TransType.Charge;
                }
            } else if (str.equals("OPEN_CARD")) {
                return TransType.IssueCard;
            }
        } else if (str.equals("REFUND")) {
            return TransType.Refund;
        }
        return TransType.Consume;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(TransEntity transEntity) {
        int value = transEntity.getType().getValue();
        if (value == -2) {
            return "OPEN_CARD";
        }
        if (value != 2) {
            return value != 6 ? "REFUND" : "CONSUME";
        }
        return "TOPUP";
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> agreeProtocol(@NotNull String appCode, long id) {
        return PayResponseKt.toPayResponse(this.protocolService.agreeProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.SnowballBusCard.getType()), TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("id", String.valueOf(id)))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> agreeShiftProtocol(@NotNull String appCode, @Nullable Long id) {
        return PayResponseKt.toPayResponse(this.protocolService.agreeProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.SnowballShiftBusCard.getType()), TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("id", String.valueOf(id)))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<RefundOpenFeeEntity> applyRefundOpenFee(@NotNull String appCode, @NotNull String cardNo) {
        return PayResponseKt.toPayResponse(this.service.applyRefundOpenFee(ExpansionsKt.requestBody$default(null, new a(appCode, cardNo), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<PayAuthorizationInfo> authorization(@NotNull String appCode, @NotNull String authChannelType) {
        return PayResponseKt.toPayResponse(this.service.authorization(ExpansionsKt.requestBody(new Gson().toJson(new AlipayPostBody(appCode, authChannelType)))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getAvailableCitiesWithStatus(@NotNull String deviceId, @Nullable Double longitude, @Nullable Double latitude, @Nullable String appCode, @Nullable String gpsCityCode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appCode != null && BusCardExtensions.getLNT_CITYS().contains(appCode)) {
            linkedHashMap.put(ConstantKt.KEY_APP_CODE, appCode);
        }
        if (longitude != null) {
            linkedHashMap.put(Constant.KEY_LONGITUDE, longitude.toString());
        }
        if (latitude != null) {
            linkedHashMap.put(Constant.KEY_LATITUDE, latitude.toString());
        }
        if (!(gpsCityCode == null || m.isBlank(gpsCityCode))) {
            linkedHashMap.put("cityCode", gpsCityCode);
        }
        return PayResponseKt.response(this.service.getAvailableCitiesWithStatus(deviceId, linkedHashMap).execute(), new b());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CardInfoEntity>> getCardInfoList(@NotNull String appCode, int limit, int next) {
        return PayResponseKt.response(this.service.getCardInfoList(r.mapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("limit", String.valueOf(limit)), TuplesKt.to("next", String.valueOf(next)))).execute(), new c());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<CityInfoEntity> getCityInfo(@NotNull String appCode) {
        return PayResponseKt.response(this.service.getCityInfo(appCode).execute(), new Function2<Boolean, String, CityInfoEntity>() { // from class: com.huami.nfc.bus.HuamiWebApi.getCityInfo.1
            @Nullable
            public final CityInfoEntity a(boolean z, @Nullable String str) {
                if (z) {
                    if (!(str == null || str.length() == 0)) {
                        return (CityInfoEntity) PayResponseKt.getGson().fromJson(str, new TypeToken<CityInfoEntity>() { // from class: com.huami.nfc.bus.HuamiWebApi$getCityInfo$1$invoke$$inlined$fromJson$1
                        }.getType());
                    }
                }
                return null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ CityInfoEntity invoke(Boolean bool, String str) {
                return a(bool.booleanValue(), str);
            }
        });
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<InvoiceEntity> getFeeInvoice(@NotNull String appCode) {
        return PayResponseKt.toPayResponse(this.service.getFeeInvoice(q.mapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getInstalledBusCards(@NotNull String deviceId, @Nullable String cityCode) {
        return PayResponseKt.response(this.service.getOpenedBusCardCities(deviceId, cityCode).execute(), new d());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<NoticesEntity>> getNotices() {
        return PayResponseKt.response(this.service.requestNotices().execute(), new Function2<Boolean, String, List<NoticesEntity>>() { // from class: com.huami.nfc.bus.HuamiWebApi.getNotices.1
            @Nullable
            public final List<NoticesEntity> a(boolean z, @Nullable String str) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    if (!(str == null || str.length() == 0)) {
                        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("items");
                        IntRange intRangeUntil = kotlin.ranges.e.until(0, jSONArrayOptJSONArray.length());
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
                        Iterator<Integer> it2 = intRangeUntil.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(jSONArrayOptJSONArray.get(((IntIterator) it2).nextInt()));
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add((NoticesEntity) PayResponseKt.getGson().fromJson(it3.next().toString(), new TypeToken<NoticesEntity>() { // from class: com.huami.nfc.bus.HuamiWebApi$getNotices$1$invoke$lambda-1$$inlined$fromJson$1
                            }.getType()));
                        }
                    }
                }
                return arrayList;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ List<NoticesEntity> invoke(Boolean bool, String str) {
                return a(bool.booleanValue(), str);
            }
        });
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<OpenFeeStateEntity> getOpenFeeStatus(@NotNull String appCode, @NotNull String cardNo) {
        return PayResponseKt.toPayResponse(this.service.getOpenFeeStatus(appCode, cardNo).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> getPhoneNumber(@NotNull String userId) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("propertyName", "huami.mifit.user.phone");
        linkedHashMap.put("mode", "SINGLE");
        return PayResponseKt.response(this.service.getUserProperties(userId, linkedHashMap).execute(), new e("huami.mifit.user.phone"));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String appCode, @NotNull String actionType) {
        return PayResponseKt.toPayResponse(this.protocolService.getProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.SnowballBusCard.getType()), TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getShiftProtocol(@NotNull String appCode, @NotNull String actionType) {
        return PayResponseKt.toPayResponse(this.protocolService.getProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.SnowballShiftBusCard.getType()), TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransactionsRecord(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, int type, @Nullable Long next, int limit) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queryType", String.valueOf(type));
        if (next != null) {
            linkedHashMap.put("next", next.toString());
        }
        linkedHashMap.put("limit", String.valueOf(limit));
        return PayResponseKt.response(this.service.getTransactionsRecord(userId, appCode, cardNumber, linkedHashMap).execute(), new f());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> postCardInfo(@NotNull CardInfoEntity info, @NotNull String appCode) {
        return PayResponseKt.toPayResponse(this.service.postCardInfo(q.mapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode)), ExpansionsKt.requestBody(new Gson().toJson(info))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> postFeeInvoice(@NotNull String appCode, @NotNull InvoiceEntity info) {
        return PayResponseKt.toPayResponse(this.service.postFeeInvoice(q.mapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode)), ExpansionsKt.requestBody(new Gson().toJson(info))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<RefundTicket> refundTicket(@NotNull String appCode, @NotNull String refundReasonCode, @NotNull String cardNo, @NotNull RefundTicketPostBody refundTicketPostBody) {
        return PayResponseKt.toPayResponse(this.service.refundTicket(r.mapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("refundReasonCode", refundReasonCode), TuplesKt.to("cardNo", cardNo)), ExpansionsKt.requestBody(new Gson().toJson(new TopRefundTicketPostBody(refundTicketPostBody, appCode, refundReasonCode, cardNo)))).execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<ReturnCardReason>> returnCardReason() {
        return PayResponseKt.toPayResponse(this.service.returnCardReason().execute());
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<VerifyCodeEntity> sendCaptcha(@NotNull String userId, @NotNull String phoneNumber) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("phone", phoneNumber);
        return PayResponseKt.response(this.service.sendCaptcha(userId, linkedHashMap).execute(), g.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> uploadTransactions(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, @NotNull String deviceId, @NotNull List<TransEntity> trans) {
        return PayResponseKt.response(this.service.uploadTransactions(userId, appCode, cardNumber, q.mapOf(TuplesKt.to("deviceId", deviceId)), ExpansionsKt.requestBodyWithArray$default(null, new h(trans, this), 1, null)).execute(), i.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> verifyCaptcha(@NotNull String userId, @NotNull String phoneNumber, @NotNull String captcha) {
        return PayResponseKt.response(this.service.verifyCaptcha(userId, ExpansionsKt.requestBody$default(null, new j(phoneNumber, captcha), 1, null)).execute(), k.a);
    }
}
