package com.huami.wallet.accessdoor.api.service;

import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.Resource;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H&J:\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0002H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0017\u001a\u00020\u000eH&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0019\u001a\u00020\u0006H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u001b\u001a\u00020\u000eH&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u001b\u001a\u00020\u000eH&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u001b\u001a\u00020\u000eH&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001f\u001a\u00020\u000eH&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH&J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u0004H&J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\u00042\u0006\u0010*\u001a\u00020)H&J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\u0010-\u001a\u0004\u0018\u00010,H&¢\u0006\u0004\b.\u0010/J\b\u00101\u001a\u000200H&J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u00102\u001a\u00020\u000eH&J\b\u00104\u001a\u000200H&J$\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000207060\u00042\u0006\u0010#\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH&J\b\u00109\u001a\u00020\u0013H&J&\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020<\u0018\u00010\u00050\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u000eH&J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010>\u001a\u00020<H&J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010>\u001a\u00020<H&¨\u0006A"}, d2 = {"Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource2;", "", "", "bizType", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/Integer;)Lcom/huami/wallet/accessdoor/helper/Resource;", "getCardListByCplc", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "startDetection", "nfcTag", "", "phoneNum", "districtName", "nfcTagType", "startSimulation", "", "isNeedRequest", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "getCardListAndIsDefaultCard", "sessionId", "getCardInfo", "doorCardInfo", "namedOrUpdateCardName", "aid", "deleteAccessDoorCard", "isDefaultCard", "setDefaultCard", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "query", "type", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/entity/VerifyEntity;", "snowQuery", "Lcom/huami/nfc/door/entity/IdCardEntity;", "info", "snowVerify", "", "id", "agreeProtocol", "(Ljava/lang/Long;)Lcom/huami/wallet/accessdoor/helper/Resource;", "", "closeWatchNfcTagReader", "key", "getDoorImageUrl", "bindDeviceDeleteCard", "name", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "isSupportCardScheduleTime", "Lcom/huami/nfc/ble/AppletType;", "appletType", "Lcom/huami/nfc/applet/CardScheduleTime;", "queryCardScheduleTime", "cardScheduleTime", "setCardScheduleTime", "deleteCardScheduleTime", "access-door_release"}, k = 1, mv = {1, 5, 1})
public interface AccessDoorDataSource2 {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Resource getCardList$default(AccessDoorDataSource2 accessDoorDataSource2, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return accessDoorDataSource2.getCardList(num);
        }

        public static /* synthetic */ Resource startSimulation$default(AccessDoorDataSource2 accessDoorDataSource2, NfcTag nfcTag, String str, String str2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSimulation");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return accessDoorDataSource2.startSimulation(nfcTag, str, str2, i);
        }
    }

    @NotNull
    Resource<String> agreeProtocol(@Nullable Long id);

    void bindDeviceDeleteCard();

    void closeWatchNfcTagReader();

    @NotNull
    Resource<Boolean> deleteAccessDoorCard(@NotNull String aid);

    @NotNull
    Resource<Boolean> deleteCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    Resource<DoorCardInfo> getCardInfo(@NotNull String sessionId);

    @NotNull
    Resource<List<DoorCardInfo>> getCardList(@Nullable Integer bizType);

    @NotNull
    Resource<List<DoorInfoAndDefaultCard>> getCardListAndIsDefaultCard(boolean isNeedRequest);

    @NotNull
    Resource<List<DoorCardInfo>> getCardListByCplc();

    @NotNull
    Resource<String> getDoorImageUrl(@NotNull String key);

    @NotNull
    Resource<ProtocolEntity> getProtocol(@NotNull String actionType);

    @NotNull
    Resource<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name);

    @NotNull
    Resource<Boolean> isDefaultCard(@NotNull String aid);

    boolean isSupportCardScheduleTime();

    @NotNull
    Resource<Boolean> namedOrUpdateCardName(@NotNull DoorCardInfo doorCardInfo);

    @NotNull
    Resource<Integer> query();

    @NotNull
    Resource<List<CardScheduleTime>> queryCardScheduleTime(@NotNull AppletType appletType, @NotNull String aid);

    @NotNull
    Resource<Boolean> setCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    Resource<Boolean> setDefaultCard(@NotNull String aid);

    @NotNull
    Resource<List<VerifyEntity>> snowQuery();

    @NotNull
    Resource<VerifyEntity> snowVerify(@NotNull IdCardEntity info);

    @NotNull
    Resource<PayResponse<NfcTag>> startDetection();

    @NotNull
    Resource<String> startSimulation(@Nullable NfcTag nfcTag, @Nullable String phoneNum, @Nullable String districtName, int nfcTagType);

    @NotNull
    Resource<Boolean> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage);
}
