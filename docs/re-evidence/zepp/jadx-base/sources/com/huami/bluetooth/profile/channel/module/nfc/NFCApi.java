package com.huami.bluetooth.profile.channel.module.nfc;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.nfc.impl.NFCNotifyListener;
import com.huami.bluetooth.profile.channel.module.nfc.model.Balance;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardTransEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 36)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 A2\u00020\u0001:\u0001AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\f\u001a\u00020\u000bH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0007H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0015\u001a\u00020\u0014H&J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\f\u001a\u00020\u000bH&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u0006\u0010!\u001a\u00020\u000bH&J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00110\u00072\u0006\u0010!\u001a\u00020\u000bH&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0006\u0010!\u001a\u00020\u000bH&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0007H&J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u0007H&J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010,\u001a\u00020+H&J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010.\u001a\u00020\u000bH&J\b\u00100\u001a\u00020\u001fH&J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u00102\u001a\u000201H&J$\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00110\u00072\u0006\u0010.\u001a\u00020(2\u0006\u00104\u001a\u00020\bH&J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u00102\u001a\u000201H&J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u00107\u001a\u00020\u000bH&J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010;\u001a\u00020(H&R\u0016\u0010@\u001a\u00020=8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", "", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCNotifyListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerNotifyListener", "unregisterNotifyListener", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", "openAPDU", "closeAPDU", "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "executeADPUCommand", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "readCard", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCTradeInfo;", "readTrades", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", "cardConfig", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "configCard", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardList", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "freshCardList", "executeMasterADPUCommand", "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "state", "", "modifyCardState", "aidBytes", "Lcom/huami/bluetooth/profile/channel/module/nfc/model/Balance;", "getBalance", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardTransEntity;", "getTransactionList", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusCardInfoResponse;", "getCardDetail", "", "getCPLC", "getAreaCode", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "setCardName", "aid", "isApplicationSupported", "isSupportCardTimeSwitch", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "setTimeSwitch", Constant.KEY_CARD_TYPE, "querySwitchTimes", "deleteSwitchTime", "data", "nfcLoadService", "passwordInteraction", "setPasswordInteraction", "password", "updatePasswordInteraction", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "version", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface NFCApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_4 = 4;
    public static final int VERSION_5 = 5;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi$Companion;", "", "", "VERSION_4", LogUtil.I, "VERSION_5", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_4 = 4;
        public static final int VERSION_5 = 5;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    ModuleResult<Integer> closeAPDU();

    @NotNull
    ModuleResult<HMNFCCardStatus> configCard(@NotNull HMNFCCardConfig cardConfig);

    @NotNull
    ModuleResult<Boolean> deleteSwitchTime(@NotNull HMCardSwitchTime hmCardSwitchTime);

    @NotNull
    ModuleResult<ApduResponse> executeADPUCommand(@NotNull byte[] byteArray);

    @NotNull
    ModuleResult<ApduResponse> executeMasterADPUCommand(@NotNull byte[] byteArray);

    @NotNull
    ModuleResult<ErrorCode> freshCardList(@NotNull List<? extends HMNFCCardIdent> cardList);

    @NotNull
    ModuleResult<String> getAreaCode();

    @NotNull
    ModuleResult<Balance> getBalance(@NotNull byte[] aidBytes);

    @NotNull
    ModuleResult<String> getCPLC();

    @NotNull
    ModuleResult<BusCardInfoResponse> getCardDetail(@NotNull byte[] aidBytes);

    @NotNull
    ModuleResult<List<CardTransEntity>> getTransactionList(@NotNull byte[] aidBytes);

    @NotNull
    NFCVersion getVersion();

    @NotNull
    ModuleResult<Boolean> isApplicationSupported(@NotNull byte[] aid);

    boolean isSupportCardTimeSwitch();

    @NotNull
    ModuleResult<Boolean> modifyCardState(@NotNull HMAidInfo state);

    @NotNull
    ModuleResult<ApduResponse> nfcLoadService(@NotNull byte[] data);

    @NotNull
    ModuleResult<Integer> openAPDU();

    @NotNull
    ModuleResult<Integer> passwordInteraction();

    @NotNull
    ModuleResult<List<HMCardSwitchTime>> querySwitchTimes(@NotNull String aid, int cardType);

    @NotNull
    ModuleResult<HMNFCCardInfo> readCard();

    @NotNull
    ModuleResult<List<HMNFCTradeInfo>> readTrades();

    void registerNotifyListener(@NotNull NFCNotifyListener listener);

    @NotNull
    ModuleResult<Boolean> setCardName(@NotNull HMAccessInfo info);

    @NotNull
    ModuleResult<Integer> setPasswordInteraction();

    @NotNull
    ModuleResult<Boolean> setTimeSwitch(@NotNull HMCardSwitchTime hmCardSwitchTime);

    void unregisterNotifyListener(@NotNull NFCNotifyListener listener);

    @NotNull
    ModuleResult<Integer> updatePasswordInteraction(@NotNull String password);
}
