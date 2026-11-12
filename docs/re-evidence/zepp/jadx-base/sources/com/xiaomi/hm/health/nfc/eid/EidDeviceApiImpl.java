package com.xiaomi.hm.health.nfc.eid;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.eid.api.EidDeviceApi;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.nfc.channel.TransportChannel;
import com.xiaomi.hm.health.nfc.channel.TransportChannelImpl;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016R\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/nfc/eid/EidDeviceApiImpl;", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "", Constant.h, "Lcom/huami/nfc/base/PayResponse;", "writeCert", "sign", "getRequestId", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "getEidInfo", "", "checkPwdStatus", "unlock", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "transporter", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EidDeviceApiImpl implements EidDeviceApi {

    @NotNull
    private static final String b = "com.huami.watch.companion.bankcard.EXISTENCELOCK";

    @NotNull
    private static final String c = "com.huami.watch.companion.bankcard.EXISTENCELOCK.RESPONSE";

    @NotNull
    private static final String d = "com.huami.watch.companion.bankcard.CONFIRMLOCK";

    @NotNull
    private static final String e = "com.huami.watch.companion.bankcard.CONFIRMLOCK.RESPONSE";

    @NotNull
    private static final String f = "com.huami.watch.eid.reqid";

    @NotNull
    private static final String g = "com.huami.watch.eid.reqid.response";

    @NotNull
    private static final String h = "com.huami.watch.eid.packet";

    @NotNull
    private static final String i = "com.huami.watch.eid.packet.response";

    @NotNull
    private static final String j = "com.huami.watch.eid.cert";

    @NotNull
    private static final String k = "com.huami.watch.eid.cert.response";

    @NotNull
    private static final String l = "com.huami.watch.eid.sign";

    @NotNull
    private static final String m = "com.huami.watch.eid.sign.response";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy transporter = LazyKt__LazyJVMKt.lazy(e.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "checkPwdStatus result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "getEidInfo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "getRequestId:" + this.a + ":" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "sign: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/channel/TransportChannelImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<TransportChannelImpl> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TransportChannelImpl getA() {
            return new TransportChannelImpl(BraceletApp.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Object> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "unlock result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Object> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return "writeCert: " + this.a;
        }
    }

    private final TransportChannel a() {
        return (TransportChannel) this.transporter.getValue();
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<Boolean> checkPwdStatus() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(a(), b, c, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            return PayResponse.INSTANCE.error(ErrorCodeConstant.NFC_EID_UNSET_PWD, "检测是否设置锁屏密码超时(ROM)");
        }
        boolean z = transportDataItemSendAction$default.getData().getBoolean("lockscreen_existence");
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(z), 1, null);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(z), 1, null);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<EidInfoEntity> getEidInfo() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(a(), h, i, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            return PayResponse.INSTANCE.error(ErrorCodeConstant.NFC_EID_GET_INFO, "穿戴设备读取EID卡信息失败(ROM)");
        }
        JSONObject jSONObject = new JSONObject(transportDataItemSendAction$default.getData().getString("info", ""));
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(jSONObject), 1, null);
        PayResponse.Companion companion = PayResponse.INSTANCE;
        String strOptString = jSONObject.optString("idCarrier");
        String strOptString2 = jSONObject.optString("eidType");
        String strOptString3 = jSONObject.optString("eidSign");
        return companion.success("success", new EidInfoEntity(strOptString, strOptString2, jSONObject.optString("publicKey"), strOptString3, jSONObject.optString("carrierPubKey"), jSONObject.optString("version"), jSONObject.optString("eidInfoCarrierType")));
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<String> getRequestId() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(a(), f, g, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            return PayResponse.INSTANCE.error(ErrorCodeConstant.NFC_EID_GET_REQID, "穿戴设备读取requestid失败(ROM)");
        }
        String string = transportDataItemSendAction$default.getData().getString("info");
        int i2 = transportDataItemSendAction$default.getData().getInt("failed");
        LogcatKt.info$default(Logcat.INSTANCE, null, new c(string, i2), 1, null);
        return string == null || m.isBlank(string) ? PayResponse.INSTANCE.error(String.valueOf(i2), "Reqid不能为空") : PayResponse.Companion.success$default(PayResponse.INSTANCE, null, string, 1, null);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<String> sign(@NotNull String cmd) {
        TransportChannel transportChannelA = a();
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("info", cmd);
        Unit unit = Unit.INSTANCE;
        TransportDataItem transportDataItemSendAction = transportChannelA.sendAction(l, m, dataBundle);
        if (transportDataItemSendAction == null) {
            return PayResponse.INSTANCE.error(ErrorCodeConstant.NFC_EID_SIGN, "在线认证sign失败");
        }
        JSONObject jSONObject = new JSONObject(transportDataItemSendAction.getData().getString("info", ""));
        LogcatKt.info$default(Logcat.INSTANCE, null, new d(jSONObject), 1, null);
        int iOptInt = jSONObject.optInt("signedResultCode", -1);
        String strOptString = jSONObject.optString("signedData", "");
        return iOptInt == 1 ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, strOptString, 1, null) : PayResponse.INSTANCE.error("sign error", strOptString);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<Boolean> unlock() {
        TransportDataItem transportDataItemSendAction$default = TransportChannel.DefaultImpls.sendAction$default(a(), d, e, null, 4, null);
        if (transportDataItemSendAction$default == null) {
            return PayResponse.INSTANCE.error(ErrorCodeConstant.NFC_EID_UNLOCK, "解锁密码超时");
        }
        boolean z = transportDataItemSendAction$default.getData().getBoolean("lockscreen_confirm");
        LogcatKt.info$default(Logcat.INSTANCE, null, new f(z), 1, null);
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(z), 1, null);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<String> writeCert(@NotNull String cmd) {
        TransportChannel transportChannelA = a();
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("info", cmd);
        Unit unit = Unit.INSTANCE;
        TransportDataItem transportDataItemSendAction = transportChannelA.sendAction(j, k, dataBundle);
        if (transportDataItemSendAction == null) {
            return PayResponse.INSTANCE.error(ErrorCodeConstant.NFC_EID_WRITE_CERT, "穿戴设备写证书超时(ROM)");
        }
        JSONObject jSONObject = new JSONObject(transportDataItemSendAction.getData().getString("info", ""));
        LogcatKt.info$default(Logcat.INSTANCE, null, new g(jSONObject), 1, null);
        String strOptString = jSONObject.optString("errorCode");
        return Intrinsics.areEqual(strOptString, "FF") ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, strOptString, 1, null) : new PayResponse<>(ErrorCodeConstant.NFC_EID_WRITE_CERT, "穿戴设备写证书失败(ROM)", strOptString);
    }
}
