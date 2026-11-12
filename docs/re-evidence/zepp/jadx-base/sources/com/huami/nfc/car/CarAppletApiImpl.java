package com.huami.nfc.car;

import com.facebook.share.internal.ShareConstants;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.car.api.CarAppletApi;
import com.huami.nfc.web.InitRequestTask;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0002J>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/nfc/car/CarAppletApiImpl;", "Lcom/huami/nfc/car/api/CarAppletApi;", "", "token", "keyToken", "productSubType", "watchId", "vin", "Lcom/huami/nfc/base/PayResponse;", "", "installVCardAndKeyCard", "getAppCode", "installKeyCard", "deleteVCardAndKeyCard", "Lcom/huami/nfc/web/InitRequestTask;", "a", "Lcom/huami/nfc/web/InitRequestTask;", "appletTask", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "Companion", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final class CarAppletApiImpl implements CarAppletApi {

    @NotNull
    public static final String PRODUCT_SUB_TYPE_CAR = "7";

    @NotNull
    public static final String PRODUCT_SUB_TYPE_CAR_JAC = "9";

    @NotNull
    private static final String b = "1";

    @NotNull
    private static final String c = "2";

    @NotNull
    private static final String d = "011768";

    @NotNull
    private static final String e = "011769";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestTask appletTask;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    public CarAppletApiImpl(@NotNull InitRequestTask initRequestTask) {
        this.appletTask = initRequestTask;
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> deleteVCardAndKeyCard(@NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to("car_card_type", "1"));
        if (!(watchId == null || watchId.length() == 0)) {
            mapMutableMapOf.put("watch_id", watchId);
        }
        if (!(vin == null || vin.length() == 0)) {
            mapMutableMapOf.put("vin", vin);
        }
        return PayResponseKt.map(this.appletTask.apply(r.mutableMapOf(TuplesKt.to(com.huami.nfc.bus.ConstantKt.KEY_APP_CODE, getAppCode(productSubType)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "delete"), TuplesKt.to("biz_serial_no", ""), TuplesKt.to("product_sub_type", productSubType), TuplesKt.to("extra_info", CarAppletApiImplKt.asExtraInfo(mapMutableMapOf)))), a.a);
    }

    @NotNull
    public final String getAppCode(@NotNull String str) {
        return Intrinsics.areEqual(str, "7") ? d : e;
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> installKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to("car_card_type", "2"));
        if (!(token == null || token.length() == 0)) {
            mapMutableMapOf.put("token", token);
        }
        if (!(keyToken == null || keyToken.length() == 0)) {
            mapMutableMapOf.put("key_token", keyToken);
        }
        if (!(watchId == null || watchId.length() == 0)) {
            mapMutableMapOf.put("watch_id", watchId);
        }
        if (!(vin == null || vin.length() == 0)) {
            mapMutableMapOf.put("vin", vin);
        }
        return PayResponseKt.map(this.appletTask.apply(r.mutableMapOf(TuplesKt.to(com.huami.nfc.bus.ConstantKt.KEY_APP_CODE, getAppCode(productSubType)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "issue"), TuplesKt.to("biz_serial_no", ""), TuplesKt.to("product_sub_type", productSubType), TuplesKt.to("extra_info", CarAppletApiImplKt.asExtraInfo(mapMutableMapOf)))), b.a);
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> installVCardAndKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to("car_card_type", "1"));
        if (!(token == null || token.length() == 0)) {
            mapMutableMapOf.put("token", token);
        }
        if (!(keyToken == null || keyToken.length() == 0)) {
            mapMutableMapOf.put("key_token", keyToken);
        }
        if (!(watchId == null || watchId.length() == 0)) {
            mapMutableMapOf.put("watch_id", watchId);
        }
        if (!(vin == null || vin.length() == 0)) {
            mapMutableMapOf.put("vin", vin);
        }
        return PayResponseKt.map(this.appletTask.apply(r.mutableMapOf(TuplesKt.to(com.huami.nfc.bus.ConstantKt.KEY_APP_CODE, getAppCode(productSubType)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "issue"), TuplesKt.to("biz_serial_no", ""), TuplesKt.to("product_sub_type", productSubType), TuplesKt.to("extra_info", CarAppletApiImplKt.asExtraInfo(mapMutableMapOf)))), c.a);
    }
}
