package com.xiaomi.hm.health.bt.profile.nfc;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusBalanceResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusConsumerListResponse;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\bH&J$\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&J\u0010\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H&J\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&J \u0010%\u001a\u00020\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u0010$\u001a\u00020#H&J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H&J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H&J\b\u0010*\u001a\u00020\u000fH&J\b\u0010+\u001a\u00020\u000fH&J\b\u0010,\u001a\u00020\u000fH&J\b\u0010-\u001a\u00020\u000fH&J\u0014\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0014\u00101\u001a\u0004\u0018\u0001002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0014\u0010\u0018\u001a\u0004\u0018\u0001022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\n\u00104\u001a\u0004\u0018\u000103H&J\u0012\u00105\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\n\u00106\u001a\u0004\u0018\u000103H&J\u0010\u00107\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH&J\b\u00108\u001a\u00020\u000fH&J\u0010\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000203H&J\n\u0010<\u001a\u0004\u0018\u00010;H&J\u0014\u0010=\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010>\u001a\u00020\u000fH&J\b\u0010?\u001a\u00020\u000fH&J\u0012\u0010B\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010@H&J\b\u0010C\u001a\u00020\u000fH&J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0F2\u0006\u0010E\u001a\u00020DH&J$\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0 0F2\u0006\u0010H\u001a\u0002032\u0006\u0010I\u001a\u00020\rH&J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0F2\u0006\u0010E\u001a\u00020DH&¨\u0006L"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/NFCControllerApi;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/ITradeNotify;", "notify", "", "registerTradeNotify", "Lcom/xiaomi/hm/health/bt/profile/nfc/IHMNFCStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", WifiSetActivity.KEY_CONNECT, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "", "data", "", "dataLen", "", "encrypt", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "sendData", "sendMasterCardData", "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "aidInfo", "modifyCardState", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "getCardInfo", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCTradeInfo;", "getTradeInfo", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", "config", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "updateCardConfig", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardIdents", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;", "type", "updateCardList", "updateEmptyCardList", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "setCardName", "writeSeFlag", "readSeFlag", "queryPwd", "verifyPwd", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusBalanceResponse;", "getBalance", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusConsumerListResponse;", "getConsumeList", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusCardInfoResponse;", "", "getCplc", "isAlreadyPersonal", "getLNTCode", "isSupportCity", "setPasswordInteraction", "password", "updatePasswordInteraction", "Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", "passwordInteraction", "nfcLoadService", "getCRSCode", "readWristAndPinState", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCFeature;", Constants.JSON_FEATURE, "hasFeature", "isSupportCardTimeSwitch", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "setTimeSwitch", "aid", Constant.KEY_CARD_TYPE, "querySwitchTimes", "deleteSwitchTime", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface NFCControllerApi {
    @Nullable
    HMNFCStatus connect(@Nullable IHMNFCStatusListener listener);

    @NotNull
    HMCardTSResponse<Boolean> deleteSwitchTime(@NotNull HMCardSwitchTime hmCardSwitchTime);

    @Nullable
    HMNFCStatus disconnect();

    @Nullable
    BusBalanceResponse getBalance(@Nullable byte[] data);

    boolean getCRSCode();

    @Nullable
    HMNFCCardInfo getCardInfo();

    @Nullable
    BusCardInfoResponse getCardInfo(@Nullable byte[] data);

    @Nullable
    BusConsumerListResponse getConsumeList(@Nullable byte[] data);

    @Nullable
    String getCplc();

    @Nullable
    String getLNTCode();

    @Nullable
    ArrayList<HMNFCTradeInfo> getTradeInfo();

    boolean hasFeature(@Nullable NFCFeature feature) throws Exception;

    boolean isAlreadyPersonal(@Nullable byte[] data);

    boolean isSupportCardTimeSwitch();

    boolean isSupportCity(@NotNull byte[] data);

    boolean modifyCardState(@NotNull HMAidInfo aidInfo);

    @Nullable
    ApduResponse nfcLoadService(@Nullable byte[] data);

    @Nullable
    PasswordInteractionResponse passwordInteraction();

    boolean queryPwd();

    @NotNull
    HMCardTSResponse<List<HMCardSwitchTime>> querySwitchTimes(@NotNull String aid, int cardType);

    boolean readSeFlag();

    boolean readWristAndPinState();

    void registerTradeNotify(@NotNull ITradeNotify notify);

    @Nullable
    ApduResponse sendData(@Nullable byte[] data, int dataLen, boolean encrypt);

    @Nullable
    ApduResponse sendMasterCardData(@Nullable byte[] data, int dataLen);

    boolean setCardName(@NotNull HMAccessInfo info);

    boolean setPasswordInteraction();

    @NotNull
    HMCardTSResponse<Boolean> setTimeSwitch(@NotNull HMCardSwitchTime hmCardSwitchTime);

    @Nullable
    HMNFCCardStatus updateCardConfig(@Nullable HMNFCCardConfig config);

    boolean updateCardList(@Nullable List<? extends HMNFCCardIdent> cardIdents, @NotNull HMNFCCardType type);

    boolean updateEmptyCardList(@NotNull HMNFCCardType type);

    boolean updatePasswordInteraction(@NotNull String password);

    boolean verifyPwd();

    boolean writeSeFlag();
}
