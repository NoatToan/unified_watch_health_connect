package com.huami.bluetooth.profile.channel.module.nfc.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.nfc.NFCApi;
import com.huami.bluetooth.profile.channel.module.nfc.NFCErrorCodeKt;
import com.huami.bluetooth.profile.channel.module.nfc.NFCVersion;
import com.huami.bluetooth.profile.channel.module.nfc.codec.APDUResponseCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.ApplicationSupportCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.AreaCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.BalanceCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CPLCCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardDetailCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardListCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardNameCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardQueryTimeSwitchCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardSetTimeSwitchCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardStateCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CardStatusCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CodeCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.CommandCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.LoadServiceCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.PasswordCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.SimpleCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.TradesCodec;
import com.huami.bluetooth.profile.channel.module.nfc.codec.TransactionListCodec;
import com.huami.bluetooth.profile.channel.module.nfc.model.Balance;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardTransEntity;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0017\u0012\u0006\u0010L\u001a\u00020H\u0012\u0006\u0010Y\u001a\u00020Q¢\u0006\u0004\bZ\u0010[J0\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\bH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\bH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010!\u001a\u00020 H\u0016J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001dH\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\b2\u0006\u0010)\u001a\u00020(H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\b2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001d0\b2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002010\b2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002030\bH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002030\bH\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020*0\b2\u0006\u00107\u001a\u000206H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020*0\b2\u0006\u00109\u001a\u00020\u0006H\u0016J\b\u0010;\u001a\u00020*H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020*0\b2\u0006\u0010=\u001a\u00020<H\u0016J$\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001d0\b2\u0006\u00109\u001a\u0002032\u0006\u0010?\u001a\u00020\rH\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020*0\b2\u0006\u0010=\u001a\u00020<H\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010B\u001a\u00020\u0006H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010F\u001a\u000203H\u0016R\u0019\u0010L\u001a\u00020H8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010P\u001a\u0002038\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010U\u001a\u00020Q8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00130V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010W¨\u0006]"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCApi;", "F", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "codec", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "a", "byteArray", "", "c", "", "count", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "errorCode", "b", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCNotifyListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerNotifyListener", "unregisterNotifyListener", "openAPDU", "closeAPDU", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "executeADPUCommand", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "readCard", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCTradeInfo;", "readTrades", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", "cardConfig", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "configCard", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardList", "freshCardList", "executeMasterADPUCommand", "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "state", "", "modifyCardState", "aidBytes", "Lcom/huami/bluetooth/profile/channel/module/nfc/model/Balance;", "getBalance", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardTransEntity;", "getTransactionList", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusCardInfoResponse;", "getCardDetail", "", "getCPLC", "getAreaCode", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "setCardName", "aid", "isApplicationSupported", "isSupportCardTimeSwitch", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "setTimeSwitch", Constant.KEY_CARD_TYPE, "querySwitchTimes", "deleteSwitchTime", "data", "nfcLoadService", "passwordInteraction", "setPasswordInteraction", "password", "updatePasswordInteraction", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "getModule", "()Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "version", "", "Ljava/util/List;", "listeners", BehaviorTaggingWebApi.g.g, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NFCApiImpl implements NFCApi {
    private static final int e = 16;
    private static final long f = 10000;
    private static final long g = 60000;
    private static final long h = 30000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = "NFCApiImpl";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final NFCVersion version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<NFCNotifyListener> listeners;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(NFCApiImpl nFCApiImpl) {
            super(1, nFCApiImpl, NFCApiImpl.class, "onCommand", "onCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((NFCApiImpl) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public NFCApiImpl(@NotNull BaseModule baseModule, @NotNull NFCVersion nFCVersion) {
        this.module = baseModule;
        baseModule.registerDeviceRequestHandler(new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.nfc.impl.NFCApiImpl.2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray)) != 16;
            }
        }));
        this.version = nFCVersion;
        this.listeners = new ArrayList();
    }

    private final <F> ModuleResult<F> a(ModuleRequest request, ResponseCodec<F, byte[]> codec) {
        return codec.decode(this.module.sendRequest(request));
    }

    private final void b(ErrorCode errorCode) {
        Iterator<T> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            ((NFCNotifyListener) it2.next()).onAPDUClosed(errorCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] byteArray) {
        Object objM3845constructorimpl;
        Request.Command commandDecode = new CommandCodec().decode(byteArray);
        try {
            Result.Companion companion = Result.Companion;
            int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(commandDecode.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String()));
            Unit unit = null;
            if (unSignInt == NFCCommand.TradeChangedCommand.INSTANCE.getCmd()) {
                Integer numSecond = AuthModuleKt.second(commandDecode.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
                if (numSecond != null) {
                    d(numSecond.intValue());
                    unit = Unit.INSTANCE;
                }
            } else if (unSignInt == NFCCommand.APDUStateChangedCommand.INSTANCE.getCmd()) {
                Integer numSecond2 = AuthModuleKt.second(commandDecode.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
                if (numSecond2 != null) {
                    b(NFCErrorCodeKt.toNFCErrorCode(numSecond2.intValue()));
                    unit = Unit.INSTANCE;
                }
            } else {
                Debug.fi(MenstruationHelperKt.TAG, Intrinsics.stringPlus("无法识别的NFC命令:", commandDecode));
                unit = Unit.INSTANCE;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(MenstruationHelperKt.TAG, Intrinsics.stringPlus("处理NFC命令异常:", thM3848exceptionOrNullimpl));
        }
    }

    private final void d(int count) {
        Iterator<T> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            ((NFCNotifyListener) it2.next()).onTradeNotify(count);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Integer> closeAPDU() {
        return a(new ModuleRequest(NFCCommand.CloseAPDUCommand.INSTANCE, null, 10000L, null, false, 26, null), new CodeCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<HMNFCCardStatus> configCard(@NotNull HMNFCCardConfig cardConfig) {
        return a(new ModuleRequest(NFCCommand.CardConfigCommand.INSTANCE.withBytes(cardConfig.getBytes()), null, 30000L, null, false, 26, null), new CardStatusCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Boolean> deleteSwitchTime(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(hmCardSwitchTime.getAid());
        return a(new ModuleRequest(NFCCommand.DeleteTimeSwitchCard.INSTANCE.withByte(bArrHexStringToBytes.length).withBytes(bArrHexStringToBytes).withByte(hmCardSwitchTime.getCardType()).withByte(hmCardSwitchTime.getHour()).withByte(hmCardSwitchTime.getMinute()).withBytes(GattUtils.numberToBytes(hmCardSwitchTime.getRepeatMode(), 4)), null, 60000L, null, false, 26, null), new CardSetTimeSwitchCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<ApduResponse> executeADPUCommand(@NotNull byte[] byteArray) {
        return a(new ModuleRequest(NFCCommand.APDUCommand.INSTANCE.withShort(byteArray.length).withBytes(byteArray), null, 60000L, null, false, 26, null), new APDUResponseCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<ApduResponse> executeMasterADPUCommand(@NotNull byte[] byteArray) {
        return a(new ModuleRequest(NFCCommand.MasterAPDUCommand.INSTANCE.withShort(byteArray.length).withBytes(byteArray), null, 60000L, null, false, 26, null), new APDUResponseCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<ErrorCode> freshCardList(@NotNull List<? extends HMNFCCardIdent> cardList) {
        return a(new ModuleRequest(NFCCommand.RefreshCardListCommand.INSTANCE.withBytes(new CardListCodec().encode(cardList)), null, 10000L, null, false, 26, null), new SimpleCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<String> getAreaCode() {
        return a(new ModuleRequest(NFCCommand.GetAreaCodeCommand.INSTANCE, null, 60000L, null, false, 26, null), new AreaCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Balance> getBalance(@NotNull byte[] aidBytes) {
        return a(new ModuleRequest(NFCCommand.QueryBalanceCommand.INSTANCE.withByte(aidBytes.length).withBytes(aidBytes), null, 60000L, null, false, 26, null), new BalanceCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<String> getCPLC() {
        return a(new ModuleRequest(NFCCommand.GetCPLCCommand.INSTANCE, null, 60000L, null, false, 26, null), new CPLCCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<BusCardInfoResponse> getCardDetail(@NotNull byte[] aidBytes) {
        return a(new ModuleRequest(NFCCommand.GetCardDetailCommand.INSTANCE.withByte(aidBytes.length).withBytes(aidBytes), null, 60000L, null, false, 26, null), new CardDetailCodec());
    }

    @NotNull
    public final BaseModule getModule() {
        return this.module;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<List<CardTransEntity>> getTransactionList(@NotNull byte[] aidBytes) {
        return a(new ModuleRequest(NFCCommand.GetTransactionCommand.INSTANCE.withByte(aidBytes.length).withBytes(aidBytes), null, 60000L, null, false, 26, null), new TransactionListCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public NFCVersion getVersion() {
        return this.version;
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Boolean> isApplicationSupported(@NotNull byte[] aid) {
        return a(new ModuleRequest(NFCCommand.CheckApplicationSupportCommand.INSTANCE.withByte(aid.length).withBytes(aid), null, 60000L, null, false, 26, null), new ApplicationSupportCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    public boolean isSupportCardTimeSwitch() {
        return getVersion().getVersion() > 4;
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Boolean> modifyCardState(@NotNull HMAidInfo state) {
        return a(new ModuleRequest(NFCCommand.IndicateCardStateCommand.INSTANCE.withByte(state.getOp()).withByte(state.getType()).withByte(state.getAidLen()).withBytes(state.getAid()), null, 10000L, null, false, 26, null), new CardStateCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<ApduResponse> nfcLoadService(@NotNull byte[] data) {
        return a(new ModuleRequest(NFCCommand.LoadServiceCommand.INSTANCE.withBytes(data), null, 60000L, null, false, 26, null), new LoadServiceCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Integer> openAPDU() {
        return a(new ModuleRequest(NFCCommand.OpenAPDUCommand.INSTANCE, null, 10000L, null, false, 26, null), new CodeCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Integer> passwordInteraction() {
        return a(new ModuleRequest(NFCCommand.PasswordCommand.INSTANCE.withByte(1), null, 60000L, null, false, 26, null), new PasswordCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<List<HMCardSwitchTime>> querySwitchTimes(@NotNull String aid, int cardType) {
        byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(aid);
        return a(new ModuleRequest(NFCCommand.RequestTimeSwitchCardList.INSTANCE.withByte(bArrHexStringToBytes.length).withBytes(bArrHexStringToBytes).withByte(cardType), null, 60000L, null, false, 26, null), new CardQueryTimeSwitchCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<HMNFCCardInfo> readCard() {
        ModuleResult<HMNFCCardInfo> moduleResultA = a(new ModuleRequest(NFCCommand.ReadCardCommand.INSTANCE, null, 30000L, null, false, 26, null), new CardCodec());
        if (moduleResultA instanceof Success) {
            ((HMNFCCardInfo) ((Success) moduleResultA).getData()).setVersion(getVersion().getVersion());
        }
        return moduleResultA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<List<HMNFCTradeInfo>> readTrades() {
        return a(new ModuleRequest(NFCCommand.ReadTradesCommand.INSTANCE, null, 30000L, null, false, 26, null), new TradesCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    public void registerNotifyListener(@NotNull NFCNotifyListener listener) {
        this.listeners.add(listener);
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Boolean> setCardName(@NotNull HMAccessInfo info) {
        if (info.getName() != null) {
            if (!(info.getName().length() == 0)) {
                byte[] bytes = info.getName().getBytes(Charsets.UTF_8);
                return bytes.length > 255 ? new Failure("名称过长", 0, 2, null) : a(new ModuleRequest(NFCCommand.SetCardNameCommand.INSTANCE.withByte(info.getCardType()).withByte(info.getAidLen()).withBytes(info.getAid()).withByte(bytes.length + 1).withBytes(bytes).withByte(0), null, 10000L, null, false, 26, null), new CardNameCodec());
            }
        }
        return new Failure("名称参数错误", 0, 2, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Integer> setPasswordInteraction() {
        return a(new ModuleRequest(NFCCommand.PasswordCommand.INSTANCE.withByte(4), null, 60000L, null, false, 26, null), new PasswordCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Boolean> setTimeSwitch(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        byte[] bArrHexStringToBytes = GattUtils.hexStringToBytes(hmCardSwitchTime.getAid());
        return a(new ModuleRequest(NFCCommand.SetTimeSwitchCard.INSTANCE.withByte(bArrHexStringToBytes.length).withBytes(bArrHexStringToBytes).withByte(hmCardSwitchTime.getCardType()).withByte(hmCardSwitchTime.getHour()).withByte(hmCardSwitchTime.getMinute()).withBytes(GattUtils.numberToBytes(hmCardSwitchTime.getRepeatMode(), 4)), null, 60000L, null, false, 26, null), new CardSetTimeSwitchCodec());
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    public void unregisterNotifyListener(@NotNull NFCNotifyListener listener) {
        this.listeners.remove(listener);
    }

    @Override // com.huami.bluetooth.profile.channel.module.nfc.NFCApi
    @NotNull
    public ModuleResult<Integer> updatePasswordInteraction(@NotNull String password) {
        return ModuleResult.INSTANCE.success(-1);
    }
}
