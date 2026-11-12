package com.xiaomi.hm.health.bt.profile.nfc;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusBalanceResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusConsumerListResponse;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCController implements NFCControllerApi {
    private HMNFCProfile a;
    private boolean b = false;
    private DeviceInfo c;

    public HMNFCController(GattPeripheral gattPeripheral) {
        this.a = null;
        this.a = new HMNFCProfile(gattPeripheral);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized HMNFCStatus connect(IHMNFCStatusListener listener) {
        if (!this.a.init()) {
            return null;
        }
        this.b = true;
        this.a.setListener(listener);
        return new HMNFCStatus(this.a.connectNfc());
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public HMCardTSResponse<Boolean> deleteSwitchTime(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        return new HMCardTSResponse<>(Boolean.FALSE, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized HMNFCStatus disconnect() {
        int iDisconnectNfc;
        iDisconnectNfc = this.a.disconnectNfc();
        this.a.deInit();
        this.a.setListener(null);
        this.b = false;
        return new HMNFCStatus(iDisconnectNfc);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized BusBalanceResponse getBalance(byte[] data) {
        BusBalanceResponse balance;
        if (this.b) {
            balance = this.a.getBalance(data);
        } else {
            if (!this.a.init()) {
                return null;
            }
            balance = this.a.getBalance(data);
            this.a.deInit();
        }
        return balance;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean getCRSCode() {
        boolean zS;
        if (this.b) {
            zS = this.a.s();
        } else {
            if (!this.a.init()) {
                return true;
            }
            zS = this.a.s();
            this.a.deInit();
        }
        return zS;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized HMNFCCardInfo getCardInfo() {
        HMNFCCardInfo hMNFCCardInfoT;
        if (this.b) {
            hMNFCCardInfoT = this.a.t();
        } else {
            if (!this.a.init()) {
                return null;
            }
            hMNFCCardInfoT = this.a.t();
            this.a.deInit();
        }
        return hMNFCCardInfoT;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized BusConsumerListResponse getConsumeList(byte[] data) {
        BusConsumerListResponse consumeList;
        if (this.b) {
            consumeList = this.a.getConsumeList(data);
        } else {
            if (!this.a.init()) {
                return null;
            }
            consumeList = this.a.getConsumeList(data);
            this.a.deInit();
        }
        return consumeList;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized String getCplc() {
        String cplc;
        if (this.b) {
            cplc = this.a.getCplc();
        } else {
            if (!this.a.init()) {
                return null;
            }
            cplc = this.a.getCplc();
            this.a.deInit();
        }
        return cplc;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized String getLNTCode() {
        String lNTCode;
        if (this.b) {
            lNTCode = this.a.getLNTCode();
        } else {
            if (!this.a.init()) {
                return null;
            }
            lNTCode = this.a.getLNTCode();
            this.a.deInit();
        }
        return lNTCode;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized ArrayList<HMNFCTradeInfo> getTradeInfo() {
        ArrayList<HMNFCTradeInfo> arrayListV;
        if (this.b) {
            arrayListV = this.a.v();
        } else {
            if (!this.a.init()) {
                return null;
            }
            arrayListV = this.a.v();
            this.a.deInit();
        }
        return arrayListV;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean hasFeature(@Nullable NFCFeature feature) throws Exception {
        if (feature == NFCFeature.XIAOPENG) {
            DeviceInfo deviceInfo = this.c;
            return deviceInfo != null && deviceInfo.getDeviceFeature().hasSw(24);
        }
        NFCVersion nfcVersion = this.a.getNfcVersion();
        if (nfcVersion == null) {
            if (!this.a.init()) {
                throw new Exception("Read nfc feature failed");
            }
            nfcVersion = this.a.getNfcVersion();
            this.a.deInit();
        }
        if (nfcVersion != null) {
            return nfcVersion.getVersion() > 4 && nfcVersion.hasFeature(feature);
        }
        throw new Exception("Nfc feature is null");
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean isAlreadyPersonal(byte[] data) {
        boolean zIsAlreadyPersonal;
        if (this.b) {
            zIsAlreadyPersonal = this.a.isAlreadyPersonal(data);
        } else {
            if (!this.a.init()) {
                return false;
            }
            zIsAlreadyPersonal = this.a.isAlreadyPersonal(data);
            this.a.deInit();
        }
        return zIsAlreadyPersonal;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean isSupportCardTimeSwitch() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean isSupportCity(@NotNull byte[] data) {
        boolean zIsSupportCity;
        if (this.b) {
            zIsSupportCity = this.a.isSupportCity(data);
        } else {
            if (!this.a.init()) {
                return false;
            }
            zIsSupportCity = this.a.isSupportCity(data);
            this.a.deInit();
        }
        return zIsSupportCity;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean modifyCardState(@NotNull HMAidInfo aidInfo) {
        return this.a.setAidInfo(aidInfo);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized ApduResponse nfcLoadService(byte[] data) {
        ApduResponse apduResponseNfcLoadService;
        if (this.b) {
            apduResponseNfcLoadService = this.a.nfcLoadService(data);
        } else {
            if (!this.a.init()) {
                return null;
            }
            apduResponseNfcLoadService = this.a.nfcLoadService(data);
            this.a.deInit();
        }
        return apduResponseNfcLoadService;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized PasswordInteractionResponse passwordInteraction() {
        PasswordInteractionResponse passwordInteractionResponseP;
        if (this.b) {
            passwordInteractionResponseP = this.a.P();
        } else {
            if (!this.a.init()) {
                return null;
            }
            passwordInteractionResponseP = this.a.P();
            this.a.deInit();
        }
        return passwordInteractionResponseP;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean queryPwd() {
        if (this.b) {
            return this.a.Q();
        }
        if (!this.a.init()) {
            return false;
        }
        boolean zQ = this.a.Q();
        this.a.deInit();
        return zQ;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public HMCardTSResponse<List<HMCardSwitchTime>> querySwitchTimes(@NotNull String aid, int cardType) {
        return new HMCardTSResponse<>(null, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean readSeFlag() {
        if (this.b) {
            return this.a.R();
        }
        if (!this.a.init()) {
            return false;
        }
        boolean zR = this.a.R();
        this.a.deInit();
        return zR;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean readWristAndPinState() {
        if (this.b) {
            return this.a.readWristAndPinState();
        }
        if (!this.a.init()) {
            return false;
        }
        boolean wristAndPinState = this.a.readWristAndPinState();
        this.a.deInit();
        return wristAndPinState;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public void registerTradeNotify(@NotNull ITradeNotify notify) {
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized ApduResponse sendData(byte[] data, int dataLen, final boolean encrypt) {
        if (data != null) {
            if (data.length != 0) {
                return this.a.sendData(data, dataLen, encrypt);
            }
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized ApduResponse sendMasterCardData(byte[] data, int dataLen) {
        if (data != null) {
            if (data.length != 0) {
                return this.a.sendMasterCardData(data, dataLen);
            }
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public boolean setCardName(@NotNull HMAccessInfo info) {
        return this.a.setAccessInfo(info);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean setPasswordInteraction() {
        boolean zW;
        if (this.b) {
            zW = this.a.W();
        } else {
            if (!this.a.init()) {
                return false;
            }
            zW = this.a.W();
            this.a.deInit();
        }
        return zW;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    @NotNull
    public HMCardTSResponse<Boolean> setTimeSwitch(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        return new HMCardTSResponse<>(Boolean.FALSE, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized HMNFCCardStatus updateCardConfig(HMNFCCardConfig config) {
        if (this.b) {
            return this.a.X(config);
        }
        if (!this.a.init()) {
            return null;
        }
        HMNFCCardStatus hMNFCCardStatusX = this.a.X(config);
        this.a.deInit();
        return hMNFCCardStatusX;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean updateCardList(List<? extends HMNFCCardIdent> cardIdents, @NotNull HMNFCCardType type) {
        if (this.b) {
            return this.a.Y(cardIdents, type);
        }
        if (!this.a.init()) {
            return false;
        }
        boolean zY = this.a.Y(cardIdents, type);
        this.a.deInit();
        return zY;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean updateEmptyCardList(@NotNull HMNFCCardType type) {
        if (this.b) {
            return this.a.Z(type);
        }
        if (!this.a.init()) {
            return false;
        }
        boolean Z = this.a.Z(type);
        this.a.deInit();
        return Z;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean updatePasswordInteraction(@NonNull String password) {
        boolean zA0;
        if (this.b) {
            zA0 = this.a.a0(password);
        } else {
            if (!this.a.init()) {
                return false;
            }
            zA0 = this.a.a0(password);
            this.a.deInit();
        }
        return zA0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean verifyPwd() {
        if (this.b) {
            return this.a.b0();
        }
        if (!this.a.init()) {
            return false;
        }
        boolean zB0 = this.a.b0();
        this.a.deInit();
        return zB0;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized boolean writeSeFlag() {
        if (this.b) {
            return this.a.d0();
        }
        if (!this.a.init()) {
            return false;
        }
        boolean zD0 = this.a.d0();
        this.a.deInit();
        return zD0;
    }

    public HMNFCController(GattPeripheral gattPeripheral, DeviceInfo deviceInfo) {
        this.a = null;
        this.a = new HMNFCProfile(gattPeripheral);
        this.c = deviceInfo;
    }

    @Override // com.xiaomi.hm.health.bt.profile.nfc.NFCControllerApi
    public synchronized BusCardInfoResponse getCardInfo(byte[] data) {
        BusCardInfoResponse cardInfo;
        if (this.b) {
            cardInfo = this.a.getCardInfo(data);
        } else {
            if (!this.a.init()) {
                return null;
            }
            cardInfo = this.a.getCardInfo(data);
            this.a.deInit();
        }
        return cardInfo;
    }
}
