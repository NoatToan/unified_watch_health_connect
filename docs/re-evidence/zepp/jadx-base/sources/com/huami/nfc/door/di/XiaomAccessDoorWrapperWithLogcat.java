package com.huami.nfc.door.di;

import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.api.IXiaomiDoorApi;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020\u0001¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J-\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J.\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010#\u001a\u00020\u0005H\u0016R\u0016\u0010'\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/nfc/door/di/XiaomAccessDoorWrapperWithLogcat;", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "", "type", "", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "query", "frontImage", "backImage", "verify", "realName", "cardNo", Constant.KEY_CARD_TYPE, PhoneBindActivity.EXTRA_BIND_TYPE, "bind", "tag", "install", "aid", "deleteApp", "a", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "api", "<init>", "(Lcom/huami/nfc/door/api/IXiaomiDoorApi;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomAccessDoorWrapperWithLogcat implements IXiaomiDoorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IXiaomiDoorApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米同意门禁协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米门禁删卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/DoorCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends DoorCardInfo>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<DoorCardInfo> payResponse) {
            return "小米门禁卡详情(seesionID)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends List<DoorCardInfo>>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<DoorCardInfo>> payResponse) {
            return "小米门禁卡列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends NfcTag>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<NfcTag> payResponse) {
            return "固件检测门禁卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends ProtocolEntity>, String> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<ProtocolEntity> payResponse) {
            return "小米获取门禁协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米门禁模拟";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米门禁白卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends Integer>, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Integer> payResponse) {
            return "小米查询是否实名";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米门禁更新门禁卡信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米校验身份信息";
        }
    }

    public XiaomAccessDoorWrapperWithLogcat(@NotNull IXiaomiDoorApi iXiaomiDoorApi) {
        this.api = iXiaomiDoorApi;
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return PayResponseExtensionsKt.logcat(this.api.agreeProtocol(id), ErrorCodeConstant.MI_DOOR_AGREE_PROTOCOL, a.a);
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> bind(@NotNull String realName, @NotNull String cardNo, @NotNull String cardType, int bindType) {
        return this.api.bind(realName, cardNo, cardType, bindType);
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.deleteApp(aid), ErrorCodeConstant.MI_DOOR_DELETE_APP, b.a);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId) {
        return PayResponseExtensionsKt.logcat(this.api.getCardInfo(sessionId), ErrorCodeConstant.MI_DOOR_GET_CARD_INFO, c.a);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType) {
        return PayResponseExtensionsKt.logcat(this.api.getCardList(type, bizType), ErrorCodeConstant.MI_DOOR_GET_CARD_LIST, d.a);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        return PayResponseExtensionsKt.logcat(this.api.getNfcTag(), ErrorCodeConstant.FW_DOOR_GET_NFC_TAG, e.a);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.getProtocol(actionType), ErrorCodeConstant.MI_DOOR_GET_PROTOCOL, f.a);
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag) {
        return tag != null ? PayResponseExtensionsKt.logcat(this.api.install(tag), ErrorCodeConstant.MI_DOOR_INSTALL, g.a) : PayResponseExtensionsKt.logcat(this.api.install(null), ErrorCodeConstant.MI_DOOR_INSTALL_EMPTY, h.a);
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Integer> query() {
        return PayResponseExtensionsKt.logcat(this.api.query(), ErrorCodeConstant.MI_DOOR_QUERY, i.a);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info) {
        return PayResponseExtensionsKt.logcat(this.api.updateCardInfo(info), ErrorCodeConstant.MI_DOOR_UPDATE_CARD_INFO, j.a);
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage) {
        return PayResponseExtensionsKt.logcat(this.api.verify(type, frontImage, backImage), ErrorCodeConstant.MI_DOOR_VERIFY_ID, k.a);
    }
}
