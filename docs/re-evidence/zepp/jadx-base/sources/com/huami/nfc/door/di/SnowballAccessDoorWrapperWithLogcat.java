package com.huami.nfc.door.di;

import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.api.ISnowballAccessDoorApi;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020\u0001¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J5\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\u0006\u0010\u0010\u001a\u00020\u001bH\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\n0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010 \u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\bH\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010%\u001a\u00020\u0005H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010%\u001a\u00020\u0005H\u0016R\u0016\u0010+\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/huami/nfc/door/di/SnowballAccessDoorWrapperWithLogcat;", "Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "", "type", Constant.KEY_CARD_TYPE, "", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "Lcom/huami/nfc/door/entity/VerifyEntity;", "query", "Lcom/huami/nfc/door/entity/IdCardEntity;", "verifyByIdCard", "name", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "tag", "phoneNum", "districtName", "dataType", "install", "aid", "deleteApp", "installLoock", "deleteLoock", "a", "Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "api", "<init>", "(Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class SnowballAccessDoorWrapperWithLogcat implements ISnowballAccessDoorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISnowballAccessDoorApi api;

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
            return "华米门禁同意协议";
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
            return "雪球门禁删卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "删除鹿客门锁卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/DoorCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends DoorCardInfo>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<DoorCardInfo> payResponse) {
            return "雪球门禁卡详情(sessionID)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends List<DoorCardInfo>>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<DoorCardInfo>> payResponse) {
            return "雪球门禁卡列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends NfcTag>, String> {
        public static final f a = new f();

        public f() {
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
    public static final class g extends Lambda implements Function1<PayResponse<? extends ProtocolEntity>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<ProtocolEntity> payResponse) {
            return "华米门禁获取协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends List<CommunityNameEntity>>, String> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<CommunityNameEntity>> payResponse) {
            return "雪球获取小区信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "雪球门禁模拟";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "雪球门禁白卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "安装鹿客门锁卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/entity/VerifyEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends List<VerifyEntity>>, String> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<VerifyEntity>> payResponse) {
            return "雪球查询是否实名";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球门禁更新门禁卡信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/entity/VerifyEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<PayResponse<? extends VerifyEntity>, String> {
        public static final n a = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<VerifyEntity> payResponse) {
            return "雪球校验身份信息";
        }
    }

    public SnowballAccessDoorWrapperWithLogcat(@NotNull ISnowballAccessDoorApi iSnowballAccessDoorApi) {
        this.api = iSnowballAccessDoorApi;
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return PayResponseExtensionsKt.logcat(this.api.agreeProtocol(id), ErrorCodeConstant.SNB_DOOR_AGREE_PROTOCOL, a.a);
    }

    @Override // com.huami.nfc.door.api.AccessDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.deleteApp(aid), ErrorCodeConstant.SNB_DOOR_DELETE_APP, b.a);
    }

    @Override // com.huami.nfc.door.api.LoockAppletApi
    @NotNull
    public PayResponse<String> deleteLoock(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.deleteLoock(aid), ErrorCodeConstant.LOOCK_DELETEL_APP, c.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId, @NotNull String cardType) {
        return PayResponseExtensionsKt.logcat(this.api.getCardInfo(sessionId, cardType), ErrorCodeConstant.SNB_DOOR_GET_CARD_INFO, d.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @NotNull String cardType, @Nullable Integer bizType) {
        return PayResponseExtensionsKt.logcat(this.api.getCardList(type, cardType, bizType), ErrorCodeConstant.SNB_DOOR_GET_CARD_LIST, e.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        return PayResponseExtensionsKt.logcat(this.api.getNfcTag(), ErrorCodeConstant.FW_DOOR_GET_NFC_TAG, f.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.getProtocol(actionType), ErrorCodeConstant.SNB_DOOR_GET_PROTOCOL, g.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name) {
        return PayResponseExtensionsKt.logcat(this.api.getSupportCommunity(type, name), ErrorCodeConstant.SNB_GET_COMMUNITY, h.a);
    }

    @Override // com.huami.nfc.door.api.AccessDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag, @Nullable String phoneNum, @Nullable String districtName, int dataType) {
        return tag != null ? PayResponseExtensionsKt.logcat(this.api.install(tag, phoneNum, districtName, dataType), ErrorCodeConstant.SNB_DOOR_INSTALL, i.a) : PayResponseExtensionsKt.logcat(this.api.install(null, phoneNum, districtName, dataType), ErrorCodeConstant.SNB_DOOR_INSTALL_EMPTY, j.a);
    }

    @Override // com.huami.nfc.door.api.LoockAppletApi
    @NotNull
    public PayResponse<String> installLoock() {
        return PayResponseExtensionsKt.logcat(this.api.installLoock(), ErrorCodeConstant.LOOCK_INSTALL_APP, k.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<List<VerifyEntity>> query() {
        return PayResponseExtensionsKt.logcat(this.api.query(), ErrorCodeConstant.SNB_DOOR_QUERY, l.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info, @NotNull String cardType) {
        return PayResponseExtensionsKt.logcat(this.api.updateCardInfo(info, cardType), ErrorCodeConstant.SNB_DOOR_UPDATE_CARD_INFO, m.a);
    }

    @Override // com.huami.nfc.door.api.ISnowballAccessDoorApi
    @NotNull
    public PayResponse<VerifyEntity> verifyByIdCard(@NotNull IdCardEntity info) {
        return PayResponseExtensionsKt.logcat(this.api.verifyByIdCard(info), ErrorCodeConstant.SNB_DOOR_VERIFY_ID, n.a);
    }
}
