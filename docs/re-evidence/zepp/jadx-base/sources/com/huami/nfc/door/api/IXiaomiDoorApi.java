package com.huami.nfc.door.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.web.entity.ProtocolEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J1\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0017\u001a\u00020\u0016H&¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/door/api/IXiaomiDoorApi;", "Lcom/huami/nfc/door/api/IIdentityApi;", "Lcom/huami/nfc/door/api/XiaoMiDoorAppletApi;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "", "type", "", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public interface IXiaomiDoorApi extends IIdentityApi, XiaoMiDoorAppletApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse getCardList$default(IXiaomiDoorApi iXiaomiDoorApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardList");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return iXiaomiDoorApi.getCardList(str, num);
        }
    }

    @NotNull
    PayResponse<String> agreeProtocol(long id);

    @NotNull
    PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId);

    @NotNull
    PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType);

    @NotNull
    PayResponse<NfcTag> getNfcTag();

    @NotNull
    PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType);

    @NotNull
    PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info);
}
