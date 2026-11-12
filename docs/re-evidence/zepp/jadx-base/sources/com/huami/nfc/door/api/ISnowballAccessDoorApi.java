package com.huami.nfc.door.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.DoorCardType;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J;\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H&J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0006\u0010\u0014\u001a\u00020\u0006H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\u0003H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0011\u001a\u00020\u001cH&J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H&¨\u0006!"}, d2 = {"Lcom/huami/nfc/door/api/ISnowballAccessDoorApi;", "Lcom/huami/nfc/door/api/AccessDoorAppletApi;", "Lcom/huami/nfc/door/api/LoockAppletApi;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "", "type", Constant.KEY_CARD_TYPE, "", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "Lcom/huami/nfc/door/entity/VerifyEntity;", "query", "Lcom/huami/nfc/door/entity/IdCardEntity;", "verifyByIdCard", "name", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public interface ISnowballAccessDoorApi extends AccessDoorAppletApi, LoockAppletApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse getCardInfo$default(ISnowballAccessDoorApi iSnowballAccessDoorApi, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardInfo");
            }
            if ((i & 2) != 0) {
                str2 = DoorCardType.ACCESS_CARD.getType();
            }
            return iSnowballAccessDoorApi.getCardInfo(str, str2);
        }

        public static /* synthetic */ PayResponse getCardList$default(ISnowballAccessDoorApi iSnowballAccessDoorApi, String str, String str2, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardList");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = DoorCardType.ACCESS_CARD.getType();
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return iSnowballAccessDoorApi.getCardList(str, str2, num);
        }

        public static /* synthetic */ PayResponse updateCardInfo$default(ISnowballAccessDoorApi iSnowballAccessDoorApi, DoorCardInfo doorCardInfo, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCardInfo");
            }
            if ((i & 2) != 0) {
                str = DoorCardType.ACCESS_CARD.getType();
            }
            return iSnowballAccessDoorApi.updateCardInfo(doorCardInfo, str);
        }
    }

    @NotNull
    PayResponse<String> agreeProtocol(long id);

    @NotNull
    PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId, @NotNull String cardType);

    @NotNull
    PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @NotNull String cardType, @Nullable Integer bizType);

    @NotNull
    PayResponse<NfcTag> getNfcTag();

    @NotNull
    PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType);

    @NotNull
    PayResponse<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name);

    @NotNull
    PayResponse<List<VerifyEntity>> query();

    @NotNull
    PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info, @NotNull String cardType);

    @NotNull
    PayResponse<VerifyEntity> verifyByIdCard(@NotNull IdCardEntity info);
}
