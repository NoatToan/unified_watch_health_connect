package com.huami.nfc.door;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.door.api.IXiaomiDoorApi;
import com.huami.nfc.door.api.XiaoMiDoorAppletApi;
import com.huami.nfc.door.entity.RealNameTpye;
import com.huami.nfc.door.service.AccessDoorServer;
import com.huami.nfc.web.ProtocolType;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.nfc.web.server.ProtocolServer;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0012\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\b8\u00109J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J-\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\b2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016R\u0016\u0010\u0012\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/huami/nfc/door/XiaomiDoorApi;", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "", "realName", "cardNo", Constant.KEY_CARD_TYPE, "", PhoneBindActivity.EXTRA_BIND_TYPE, "Lcom/huami/nfc/base/PayResponse;", "", "bind", "query", "type", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "tag", "install", "aid", "deleteApp", "sessionId", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardInfo", "info", "updateCardInfo", "bizType", "", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "Lcom/huami/nfc/door/INfcTag;", "a", "Lcom/huami/nfc/door/INfcTag;", "Lcom/huami/nfc/base/INfcChannel;", "b", "Lcom/huami/nfc/base/INfcChannel;", com.tekartik.sqflite.Constant.h, "Lcom/huami/nfc/door/service/AccessDoorServer;", "c", "Lcom/huami/nfc/door/service/AccessDoorServer;", "server", "Lcom/huami/nfc/web/server/ProtocolServer;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/web/server/ProtocolServer;", "protocolService", "Lcom/huami/nfc/door/api/XiaoMiDoorAppletApi;", "e", "Lcom/huami/nfc/door/api/XiaoMiDoorAppletApi;", "appletApi", "<init>", "(Lcom/huami/nfc/door/INfcTag;Lcom/huami/nfc/base/INfcChannel;Lcom/huami/nfc/door/service/AccessDoorServer;Lcom/huami/nfc/web/server/ProtocolServer;Lcom/huami/nfc/door/api/XiaoMiDoorAppletApi;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiDoorApi implements IXiaomiDoorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcTag tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel cmd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AccessDoorServer server;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ProtocolServer protocolService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final XiaoMiDoorAppletApi appletApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return XiaomiDoorApi.this.appletApi.deleteApp(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse<? extends String>> {
        public final /* synthetic */ NfcTag b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NfcTag nfcTag) {
            super(0);
            this.b = nfcTag;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<String> invoke() {
            return XiaomiDoorApi.this.appletApi.install(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Boolean, String, Integer> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Nullable
        public final Integer a(boolean z, @Nullable String str) {
            int iOptInt = 0;
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    iOptInt = new JSONObject(str).optJSONObject("resp_data").optInt("verifyResult");
                }
            }
            return Integer.valueOf(iOptInt);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<JSONObject, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull JSONObject jSONObject) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    public XiaomiDoorApi(@NotNull INfcTag iNfcTag, @NotNull INfcChannel iNfcChannel, @NotNull AccessDoorServer accessDoorServer, @NotNull ProtocolServer protocolServer, @NotNull XiaoMiDoorAppletApi xiaoMiDoorAppletApi) {
        this.tag = iNfcTag;
        this.cmd = iNfcChannel;
        this.server = accessDoorServer;
        this.protocolService = protocolServer;
        this.appletApi = xiaoMiDoorAppletApi;
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return PayResponseKt.toPayResponse(this.protocolService.agreeProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.XiaomiAccessDoor.getType()), TuplesKt.to("id", String.valueOf(id)))).execute());
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> bind(@NotNull String realName, @NotNull String cardNo, @NotNull String cardType, int bindType) {
        return PayResponseKt.toPayResponse(this.server.bind(r.mapOf(TuplesKt.to("realName", realName), TuplesKt.to("cardNo", cardNo), TuplesKt.to(Constant.KEY_CARD_TYPE, "1"), TuplesKt.to(PhoneBindActivity.EXTRA_BIND_TYPE, String.valueOf(bindType)))).execute());
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new a(aid));
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId) {
        PayResponse payResponse = PayResponseKt.toPayResponse(AccessDoorServer.DefaultImpls.getCardInfo$default(this.server, sessionId, null, 2, null).execute());
        if (!payResponse.isSuccessful()) {
            return new PayResponse<>(payResponse.getCode(), payResponse.getMessage(), null);
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        String message = payResponse.getMessage();
        List list = (List) payResponse.getData();
        return companion.success(message, list != null ? (DoorCardInfo) list.get(0) : null);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType) {
        Map<String, Object> mapMutableMapOf = r.mutableMapOf(TuplesKt.to("queryType", type), TuplesKt.to("userNFCCardType", DoorCardType.ACCESS_CARD.getType()));
        if (bizType != null) {
            mapMutableMapOf.put("bizType", Integer.valueOf(bizType.intValue()));
        }
        return PayResponseKt.toPayResponse(this.server.getCardList(mapMutableMapOf).execute());
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        return INfcTagKt.getNfcTagWithResponse(this.tag);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return PayResponseKt.toPayResponse(this.protocolService.getProtocol(r.mapOf(TuplesKt.to("protocol_type", ProtocolType.XiaomiAccessDoor.getType()), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType))).execute());
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new b(tag));
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Integer> query() {
        return PayResponseKt.response(this.server.query(q.mapOf(TuplesKt.to("realNameMode", "XIAO_MI"))).execute(), c.a);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info) {
        return PayResponseKt.toPayResponse(AccessDoorServer.DefaultImpls.updateCardInfo$default(this.server, com.huami.nfc.web.Constant.requestBody(new JSONObject(new Gson().toJson(info)), d.a), null, 2, null).execute());
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage) {
        return PayResponseKt.toPayResponse(this.server.verify(q.mapOf(TuplesKt.to("realNameMode", RealNameTpye.Xiaomi.getType())), r.mapOf(TuplesKt.to(Constant.KEY_CARD_TYPE, type), TuplesKt.to("frontImage", frontImage), TuplesKt.to("backImage", backImage))).execute());
    }
}
