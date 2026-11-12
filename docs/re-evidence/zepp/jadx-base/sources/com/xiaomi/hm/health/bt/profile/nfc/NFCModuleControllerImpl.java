package com.xiaomi.hm.health.bt.profile.nfc;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.nfc.NFCApi;
import com.huami.bluetooth.profile.channel.module.nfc.impl.NFCNotifyListener;
import com.huami.bluetooth.profile.channel.module.nfc.model.Balance;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusBalanceResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusConsumerListResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardTransEntity;
import com.xiaomi.hm.health.bt.profile.nfc.entity.NfcTimeSwitchCode;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.market.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u000f\u0012\u0006\u0010Q\u001a\u00020O¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016J\u0014\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J \u0010)\u001a\u00020\u00122\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\u0012H\u0016J\b\u00101\u001a\u00020\u0012H\u0016J\u0014\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0014\u00105\u001a\u0004\u0018\u0001042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u00107\u001a\u0004\u0018\u000106H\u0016J\u0012\u00108\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u00109\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010:\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010;\u001a\u00020\u0012H\u0016J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u000206H\u0016J\b\u0010?\u001a\u00020>H\u0016J\u0014\u0010@\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010A\u001a\u00020\u0012H\u0016J\b\u0010B\u001a\u00020\u0012H\u0016J\u0012\u0010E\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010CH\u0016J\b\u0010F\u001a\u00020\u0012H\u0016J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120I2\u0006\u0010H\u001a\u00020GH\u0016J$\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0$0I2\u0006\u0010K\u001a\u0002062\u0006\u0010L\u001a\u00020\u0002H\u0016J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120I2\u0006\u0010H\u001a\u00020GH\u0016R\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/NFCModuleControllerImpl;", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCControllerApi;", "", "code", "a", "b", "Lcom/xiaomi/hm/health/bt/profile/nfc/ITradeNotify;", "notify", "", "registerTradeNotify", "Lcom/xiaomi/hm/health/bt/profile/nfc/IHMNFCStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", WifiSetActivity.KEY_CONNECT, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "", "data", "dataLen", "", "encrypt", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "sendData", "sendMasterCardData", "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "aidInfo", "modifyCardState", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "getCardInfo", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusCardInfoResponse;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCTradeInfo;", "getTradeInfo", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", "config", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "updateCardConfig", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardIdents", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;", "type", "updateCardList", "updateEmptyCardList", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "setCardName", "writeSeFlag", "readSeFlag", "queryPwd", "verifyPwd", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusBalanceResponse;", "getBalance", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusConsumerListResponse;", "getConsumeList", "", "getCplc", "isAlreadyPersonal", "getLNTCode", "isSupportCity", "setPasswordInteraction", "password", "updatePasswordInteraction", "Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", "passwordInteraction", "nfcLoadService", "getCRSCode", "readWristAndPinState", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCFeature;", Constants.JSON_FEATURE, "hasFeature", "isSupportCardTimeSwitch", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "setTimeSwitch", "aid", Constant.KEY_CARD_TYPE, "querySwitchTimes", "deleteSwitchTime", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", "nfcApi", "Lcom/xiaomi/hm/health/bt/profile/nfc/IHMNFCStatusListener;", "statusListener", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "tradeNotify", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NFCModuleControllerImpl implements NFCControllerApi {

    @NotNull
    public static final String tag = "NFCModuleControllerImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NFCApi nfcApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IHMNFCStatusListener statusListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private WeakReference<ITradeNotify> tradeNotify;

    public NFCModuleControllerImpl(@NotNull NFCApi nFCApi) {
        this.nfcApi = nFCApi;
        nFCApi.registerNotifyListener(new NFCNotifyListener() { // from class: com.xiaomi.hm.health.bt.profile.nfc.NFCModuleControllerImpl.1
            @Override // com.huami.bluetooth.profile.channel.module.nfc.impl.NFCNotifyListener
            public void onAPDUClosed(@NotNull ErrorCode errorCode) {
                IHMNFCStatusListener iHMNFCStatusListener = NFCModuleControllerImpl.this.statusListener;
                if (iHMNFCStatusListener == null) {
                    return;
                }
                iHMNFCStatusListener.onStatusChanged(new HMNFCStatus(errorCode.getCode()));
            }

            @Override // com.huami.bluetooth.profile.channel.module.nfc.impl.NFCNotifyListener
            public void onTradeNotify(int count) {
                ITradeNotify iTradeNotify;
                WeakReference weakReference = NFCModuleControllerImpl.this.tradeNotify;
                if (weakReference == null || (iTradeNotify = (ITradeNotify) weakReference.get()) == null) {
                    return;
                }
                iTradeNotify.onTrade(count);
            }
        });
    }

    private final int a(int code) {
        if (code == 0) {
            return 0;
        }
        if (code == 1) {
            return -100;
        }
        if (code == 2) {
            return -101;
        }
        if (code == 3) {
            return -102;
        }
        if (code != 4) {
            return code;
        }
        return -103;
    }

    private final int b(int code) {
        if (code == 0) {
            return 0;
        }
        if (code == 1) {
            return -100;
        }
        if (code != 2) {
            return code;
        }
        return -101;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized HMNFCStatus connect(@Nullable IHMNFCStatusListener listener) {
        Integer num;
        this.statusListener = listener;
        num = (Integer) ModuleResultKt.peel(this.nfcApi.openAPDU());
        return num == null ? null : new HMNFCStatus(num.intValue());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public HMCardTSResponse<Boolean> deleteSwitchTime(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        HMCardTSResponse<Boolean> hMCardTSResponse;
        ModuleResult<Boolean> moduleResultDeleteSwitchTime = this.nfcApi.deleteSwitchTime(hmCardSwitchTime);
        if (moduleResultDeleteSwitchTime instanceof Timeout) {
            return new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(NfcTimeSwitchCode.NFC_SET_TIMEOUT.getValue()));
        }
        if (moduleResultDeleteSwitchTime instanceof Failure) {
            hMCardTSResponse = new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(((Failure) moduleResultDeleteSwitchTime).getCode()));
        } else {
            if (!(moduleResultDeleteSwitchTime instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            hMCardTSResponse = new HMCardTSResponse<>(((Success) moduleResultDeleteSwitchTime).getData(), Integer.valueOf(NfcTimeSwitchCode.NFC_SUCCESS.getValue()));
        }
        return hMCardTSResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized HMNFCStatus disconnect() {
        Integer num;
        num = (Integer) ModuleResultKt.peel(this.nfcApi.closeAPDU());
        return num == null ? null : new HMNFCStatus(num.intValue());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized BusBalanceResponse getBalance(@Nullable byte[] data) {
        BusBalanceResponse busBalanceResponse;
        ModuleResult<Balance> balance = data == null ? null : this.nfcApi.getBalance(data);
        if (balance == null) {
            return new BusBalanceResponse(-100, 0L, 0L);
        }
        if (balance instanceof Timeout) {
            busBalanceResponse = new BusBalanceResponse(-100, 0L, 0L);
        } else if (balance instanceof Failure) {
            busBalanceResponse = new BusBalanceResponse(a(((Failure) balance).getCode()), 0L, 0L);
        } else {
            if (!(balance instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Balance balance2 = (Balance) ModuleResultKt.peel(balance);
            if (balance2 == null) {
                return new BusBalanceResponse(-100, 0L, 0L);
            }
            busBalanceResponse = new BusBalanceResponse(0, balance2.getCom.xiaomi.hm.health.device.event.StatEvent.SPORT_TP_VALUE_BALANCE java.lang.String(), balance2.getOverdraft());
        }
        return busBalanceResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean getCRSCode() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized HMNFCCardInfo getCardInfo() {
        return (HMNFCCardInfo) ModuleResultKt.peel(this.nfcApi.readCard());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized BusConsumerListResponse getConsumeList(@Nullable byte[] data) {
        BusConsumerListResponse busConsumerListResponse;
        BusConsumerListResponse busConsumerListResponse2;
        ModuleResult<List<CardTransEntity>> transactionList = data == null ? null : this.nfcApi.getTransactionList(data);
        if (transactionList == null) {
            return new BusConsumerListResponse(-100, new ArrayList());
        }
        if (transactionList instanceof Timeout) {
            busConsumerListResponse2 = new BusConsumerListResponse(-100, new ArrayList());
        } else {
            if (transactionList instanceof Failure) {
                busConsumerListResponse = new BusConsumerListResponse(b(((Failure) transactionList).getCode()), new ArrayList());
            } else {
                if (!(transactionList instanceof Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list = (List) ModuleResultKt.peel(transactionList);
                if (list == null) {
                    return new BusConsumerListResponse(-100, new ArrayList());
                }
                busConsumerListResponse = new BusConsumerListResponse(0, CollectionsKt___CollectionsKt.toMutableList((Collection) list));
            }
            busConsumerListResponse2 = busConsumerListResponse;
        }
        return busConsumerListResponse2;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized String getCplc() {
        return (String) ModuleResultKt.peel(this.nfcApi.getCPLC());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized String getLNTCode() {
        return (String) ModuleResultKt.peel(this.nfcApi.getAreaCode());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized ArrayList<HMNFCTradeInfo> getTradeInfo() {
        List list;
        list = (List) ModuleResultKt.peel(this.nfcApi.readTrades());
        return list == null ? null : new ArrayList<>(list);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean hasFeature(@Nullable NFCFeature feature) {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean isAlreadyPersonal(@Nullable byte[] data) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean isSupportCardTimeSwitch() {
        return this.nfcApi.isSupportCardTimeSwitch();
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean isSupportCity(@NotNull byte[] data) {
        return Intrinsics.areEqual(ModuleResultKt.peel(this.nfcApi.isApplicationSupported(data)), Boolean.TRUE);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean modifyCardState(@NotNull HMAidInfo aidInfo) {
        return Intrinsics.areEqual(ModuleResultKt.peel(this.nfcApi.modifyCardState(aidInfo)), Boolean.TRUE);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public ApduResponse nfcLoadService(@Nullable byte[] data) {
        if (data == null) {
            return null;
        }
        return (ApduResponse) ModuleResultKt.peel(this.nfcApi.nfcLoadService(data));
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public PasswordInteractionResponse passwordInteraction() {
        Integer num = (Integer) ModuleResultKt.peel(this.nfcApi.passwordInteraction());
        return new PasswordInteractionResponse(num == null ? -1 : num.intValue());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean queryPwd() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public HMCardTSResponse<List<HMCardSwitchTime>> querySwitchTimes(@NotNull String aid, int cardType) {
        HMCardTSResponse<List<HMCardSwitchTime>> hMCardTSResponse;
        ModuleResult<List<HMCardSwitchTime>> moduleResultQuerySwitchTimes = this.nfcApi.querySwitchTimes(aid, cardType);
        if (moduleResultQuerySwitchTimes instanceof Timeout) {
            return new HMCardTSResponse<>(null, Integer.valueOf(NfcTimeSwitchCode.NFC_SET_TIMEOUT.getValue()));
        }
        if (moduleResultQuerySwitchTimes instanceof Failure) {
            hMCardTSResponse = new HMCardTSResponse<>(null, Integer.valueOf(((Failure) moduleResultQuerySwitchTimes).getCode()));
        } else {
            if (!(moduleResultQuerySwitchTimes instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            hMCardTSResponse = new HMCardTSResponse<>(((Success) moduleResultQuerySwitchTimes).getData(), Integer.valueOf(NfcTimeSwitchCode.NFC_SUCCESS.getValue()));
        }
        return hMCardTSResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean readSeFlag() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean readWristAndPinState() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public void registerTradeNotify(@NotNull ITradeNotify notify) {
        this.tradeNotify = new WeakReference<>(notify);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized ApduResponse sendData(@Nullable byte[] data, int dataLen, boolean encrypt) {
        return data == null ? null : (ApduResponse) ModuleResultKt.peel(this.nfcApi.executeADPUCommand(data));
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized ApduResponse sendMasterCardData(@Nullable byte[] data, int dataLen) {
        return data == null ? null : (ApduResponse) ModuleResultKt.peel(this.nfcApi.executeMasterADPUCommand(data));
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean setCardName(@NotNull HMAccessInfo info) {
        return Intrinsics.areEqual(ModuleResultKt.peel(this.nfcApi.setCardName(info)), Boolean.TRUE);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean setPasswordInteraction() {
        Integer num = (Integer) ModuleResultKt.peel(this.nfcApi.setPasswordInteraction());
        return num != null && num.intValue() == 0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public HMCardTSResponse<Boolean> setTimeSwitch(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        HMCardTSResponse<Boolean> hMCardTSResponse;
        ModuleResult<Boolean> timeSwitch = this.nfcApi.setTimeSwitch(hmCardSwitchTime);
        if (timeSwitch instanceof Timeout) {
            return new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(NfcTimeSwitchCode.NFC_SET_TIMEOUT.getValue()));
        }
        if (timeSwitch instanceof Failure) {
            hMCardTSResponse = new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(((Failure) timeSwitch).getCode()));
        } else {
            if (!(timeSwitch instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            hMCardTSResponse = new HMCardTSResponse<>(((Success) timeSwitch).getData(), Integer.valueOf(NfcTimeSwitchCode.NFC_SUCCESS.getValue()));
        }
        return hMCardTSResponse;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized HMNFCCardStatus updateCardConfig(@Nullable HMNFCCardConfig config) {
        return config == null ? null : (HMNFCCardStatus) ModuleResultKt.peel(this.nfcApi.configCard(config));
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean updateCardList(@Nullable List<? extends HMNFCCardIdent> cardIdents, @NotNull HMNFCCardType type) {
        if (cardIdents != null) {
            if (!cardIdents.isEmpty()) {
                return this.nfcApi.freshCardList(cardIdents) instanceof Success;
            }
        }
        return updateEmptyCardList(type);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean updateEmptyCardList(@NotNull HMNFCCardType type) {
        return this.nfcApi.freshCardList(e.listOf(new HMNFCCardIdent(type, 0, ""))) instanceof Success;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean updatePasswordInteraction(@NotNull String password) {
        Integer num = (Integer) ModuleResultKt.peel(this.nfcApi.updatePasswordInteraction(password));
        return num != null && num.intValue() == 0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean verifyPwd() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean writeSeFlag() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @Nullable
    public synchronized BusCardInfoResponse getCardInfo(@Nullable byte[] data) {
        return data == null ? null : (BusCardInfoResponse) ModuleResultKt.peel(this.nfcApi.getCardDetail(data));
    }
}
