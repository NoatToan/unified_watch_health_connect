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
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\rH&J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00050\u0004H&J@\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0002H&J\u0016\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\"\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00060\u00050\u00042\u0006\u0010\u001a\u001a\u00020\rH&J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u000bH&J\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u0007H&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u001f\u001a\u00020\u0007H&J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010\"\u001a\u00020\u000bH&J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010\"\u001a\u00020\u000bH&J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010\"\u001a\u00020\u000bH&J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\"\u001a\u00020\u000bH&J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00050\u00042\u0006\u0010'\u001a\u00020\u000bH&J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H&J,\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH&J\u001a\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00060\u00050\u0004H&J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00050\u00042\u0006\u00102\u001a\u000201H&J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\u00105\u001a\u0004\u0018\u000104H&¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH&J\b\u0010;\u001a\u00020\u0018H&J\b\u0010<\u001a\u00020\rH&J\b\u0010=\u001a\u00020\u0018H&J\u001c\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\u0006\u0010>\u001a\u00020\u000bH&J\b\u0010@\u001a\u00020\u0018H&J*\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0\u00050\u00042\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000bH&J,\u0010H\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020G\u0018\u00010\u00060\u00050\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010\"\u001a\u00020\u000bH&J\u001c\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010I\u001a\u00020GH&J\u001c\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\u0006\u0010I\u001a\u00020GH&J\b\u0010L\u001a\u00020\rH&¨\u0006M"}, d2 = {"Lcom/huami/wallet/accessdoor/api/service/AccessDoorDataSource;", "", "", "bizType", "Lorg/reactivestreams/Publisher;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/Integer;)Lorg/reactivestreams/Publisher;", "getCardListByCplc", "", "getDeviceModel", "", "isMiDevice", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "startDetection", "nfcTag", "phoneNum", "districtName", "nfcTagType", "startSimulation", "data", "", "updateNfcCardListSync", "isNeedRequest", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "getCardListAndIsDefaultCard", "sessionId", "getCardInfo", "doorCardInfo", "namedOrUpdateCardName", "getNamedOrUpdateCardNameResource", "aid", "deleteAccessDoorCard", "isDefaultCard", "setDefaultCard", "setDefaultCardByResource", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "query", "type", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/entity/VerifyEntity;", "snowQuery", "Lcom/huami/nfc/door/entity/IdCardEntity;", "info", "snowVerify", "", "id", "agreeProtocol", "(Ljava/lang/Long;)Lorg/reactivestreams/Publisher;", "errorCode", "errorMsg", "getToLogin", "clearData", "withBleApi", "closeWatchNfcTagReader", "key", "getDoorImageUrl", "bindDeviceDeleteCard", "name", "", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "Lcom/huami/nfc/ble/AppletType;", "appletType", "Lcom/huami/nfc/applet/CardScheduleTime;", "queryCardScheduleTime", "cardScheduleTime", "setCardScheduleTime", "deleteCardScheduleTime", "isSupportTimeSwitchCard", "access-door_release"}, k = 1, mv = {1, 5, 1})
public interface AccessDoorDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Publisher getCardList$default(AccessDoorDataSource accessDoorDataSource, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardList");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return accessDoorDataSource.getCardList(num);
        }

        public static /* synthetic */ Publisher startSimulation$default(AccessDoorDataSource accessDoorDataSource, NfcTag nfcTag, String str, String str2, int i, int i2, Object obj) {
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
            return accessDoorDataSource.startSimulation(nfcTag, str, str2, i);
        }
    }

    @NotNull
    Publisher<Resource<String>> agreeProtocol(@Nullable Long id);

    void bindDeviceDeleteCard();

    void clearData();

    void closeWatchNfcTagReader();

    @NotNull
    Publisher<Resource<Boolean>> deleteAccessDoorCard(@NotNull String aid);

    @NotNull
    Publisher<Resource<Boolean>> deleteCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    Publisher<Resource<DoorCardInfo>> getCardInfo(@NotNull String sessionId);

    @NotNull
    Publisher<Resource<List<DoorCardInfo>>> getCardList(@Nullable Integer bizType);

    @NotNull
    Publisher<Resource<List<DoorInfoAndDefaultCard>>> getCardListAndIsDefaultCard(boolean isNeedRequest);

    @NotNull
    Resource<List<DoorCardInfo>> getCardListByCplc();

    @NotNull
    String getDeviceModel();

    @NotNull
    Publisher<Resource<String>> getDoorImageUrl(@NotNull String key);

    @NotNull
    Resource<Boolean> getNamedOrUpdateCardNameResource(@NotNull DoorCardInfo doorCardInfo);

    @NotNull
    Publisher<Resource<ProtocolEntity>> getProtocol(@NotNull String actionType);

    @NotNull
    Publisher<Resource<List<CommunityNameEntity>>> getSupportCommunity(@NotNull String type, @NotNull String name);

    void getToLogin(@NotNull String errorCode, @NotNull String errorMsg);

    @NotNull
    Publisher<Resource<Boolean>> isDefaultCard(@NotNull String aid);

    boolean isMiDevice();

    boolean isSupportTimeSwitchCard();

    @NotNull
    Publisher<Resource<Boolean>> namedOrUpdateCardName(@NotNull DoorCardInfo doorCardInfo);

    @NotNull
    Publisher<Resource<Integer>> query();

    @NotNull
    Publisher<Resource<List<CardScheduleTime>>> queryCardScheduleTime(@NotNull AppletType appletType, @NotNull String aid);

    @NotNull
    Publisher<Resource<Boolean>> setCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    Publisher<Resource<Boolean>> setDefaultCard(@NotNull String aid);

    @NotNull
    Resource<Boolean> setDefaultCardByResource(@NotNull String aid);

    @NotNull
    Publisher<Resource<List<VerifyEntity>>> snowQuery();

    @NotNull
    Publisher<Resource<VerifyEntity>> snowVerify(@NotNull IdCardEntity info);

    @NotNull
    Publisher<Resource<PayResponse<NfcTag>>> startDetection();

    @NotNull
    Publisher<Resource<String>> startSimulation(@Nullable NfcTag nfcTag, @Nullable String phoneNum, @Nullable String districtName, int nfcTagType);

    void updateNfcCardListSync(@NotNull List<DoorCardInfo> data);

    @NotNull
    Publisher<Resource<Boolean>> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage);

    boolean withBleApi();
}
