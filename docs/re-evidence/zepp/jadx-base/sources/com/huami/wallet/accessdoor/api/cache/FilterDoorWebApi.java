package com.huami.wallet.accessdoor.api.cache;

import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.api.IXiaomiDoorApi;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020\u0001¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J-\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00042\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010 \u001a\u00020\u0011H\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0016R\u0016\u0010'\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/wallet/accessdoor/api/cache/FilterDoorWebApi;", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "", "id", "Lcom/huami/nfc/base/PayResponse;", "", "agreeProtocol", "realName", "cardNo", Constant.KEY_CARD_TYPE, "", PhoneBindActivity.EXTRA_BIND_TYPE, "", "bind", "aid", "deleteApp", "sessionId", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardInfo", "type", "bizType", "", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "tag", "install", "query", "info", "updateCardInfo", "frontImage", "backImage", "verify", "a", "Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "iXiaoMiDoorApi", "<init>", "(Lcom/huami/nfc/door/api/IXiaomiDoorApi;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public class FilterDoorWebApi implements IXiaomiDoorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IXiaomiDoorApi iXiaoMiDoorApi;

    public FilterDoorWebApi(@NotNull IXiaomiDoorApi iXiaomiDoorApi) {
        this.iXiaoMiDoorApi = iXiaomiDoorApi;
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return this.iXiaoMiDoorApi.agreeProtocol(id);
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> bind(@NotNull String realName, @NotNull String cardNo, @NotNull String cardType, int bindType) {
        return this.iXiaoMiDoorApi.bind(realName, cardNo, cardType, bindType);
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return this.iXiaoMiDoorApi.deleteApp(aid);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId) {
        return this.iXiaoMiDoorApi.getCardInfo(sessionId);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType) {
        return this.iXiaoMiDoorApi.getCardList(type, bizType);
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<NfcTag> getNfcTag() {
        return this.iXiaoMiDoorApi.getNfcTag();
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType) {
        return this.iXiaoMiDoorApi.getProtocol(actionType);
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag) {
        return this.iXiaoMiDoorApi.install(tag);
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Integer> query() {
        return this.iXiaoMiDoorApi.query();
    }

    @Override // com.huami.nfc.door.api.IXiaomiDoorApi
    @NotNull
    public PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info) {
        return this.iXiaoMiDoorApi.updateCardInfo(info);
    }

    @Override // com.huami.nfc.door.api.IIdentityApi
    @NotNull
    public PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage) {
        return this.iXiaoMiDoorApi.verify(type, frontImage, backImage);
    }
}
