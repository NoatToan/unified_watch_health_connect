package com.miui.tsmclient.hcievent;

import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes6.dex */
public class BankHciEventHandler implements IHciEventHandler {
    private IHciEventHandler mHciEventHandler;
    private static final ByteArray TAG_TRANSACTION_EVENT_NXP = ByteArray.wrap(new byte[]{-30, 1});
    private static final ByteArray TAG_TRANSACTION_EVENT_ST = ByteArray.wrap(new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 1});
    private static final ByteArray TAG_AMOUNT = ByteArray.wrap(new byte[]{-97, 2});
    private ByteArray TAG_TIME = ByteArray.wrap(new byte[]{-102, 3});
    private ByteArray TAG_CURRENCY = ByteArray.wrap(new byte[]{95, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY});

    public static class NXPBankHciEventHandler implements IHciEventHandler {
        private NXPBankHciEventHandler() {
        }

        @Override // com.miui.tsmclient.hcievent.IHciEventHandler
        public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
            if (bArr2.length >= 36) {
                try {
                    return new HciEventInfo(Coder.bytesToHexString(bArr), j, Integer.parseInt(Coder.bytesToHexString(TLVParser.parse(ByteArray.wrap(bArr2, bArr2.length - 36, 36)).getValue().findTLV(BankHciEventHandler.TAG_AMOUNT).getValue().toBytes().toBytes())), true);
                } catch (InvalidTLVException | TagNotFoundException e) {
                    LogUtils.e("failed to handle bank hci event data", e);
                }
            }
            return new HciEventInfo(Coder.bytesToHexString(bArr), j, true);
        }

        @Override // com.miui.tsmclient.hcievent.IHciEventHandler
        public boolean isSupport(byte[] bArr, byte[] bArr2) {
            return bArr2 != null && bArr2.length >= 2 && Coder.bytesToHexString(bArr).startsWith(Coder.bytesToHexString(APDUConstants.PBOC_CARD_AID_PREFFIX)) && ByteArray.equals(BankHciEventHandler.TAG_TRANSACTION_EVENT_NXP, ByteArray.wrap(bArr2, 0, 2));
        }
    }

    public static class STBankHciEventHandler implements IHciEventHandler {
        private STBankHciEventHandler() {
        }

        @Override // com.miui.tsmclient.hcievent.IHciEventHandler
        public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
            if (bArr2.length > 42) {
                try {
                    return new HciEventInfo(Coder.bytesToHexString(bArr), j, Integer.parseInt(Coder.bytesToHexString(TLVParser.parse(ByteArray.wrap(bArr2, 42, bArr2.length - 42)).getValue().findTLV(BankHciEventHandler.TAG_AMOUNT).getValue().toBytes().toBytes())), true);
                } catch (InvalidTLVException | TagNotFoundException e) {
                    LogUtils.e("failed to handle bank hci event data", e);
                }
            }
            return new HciEventInfo(Coder.bytesToHexString(bArr), j, true);
        }

        @Override // com.miui.tsmclient.hcievent.IHciEventHandler
        public boolean isSupport(byte[] bArr, byte[] bArr2) {
            return bArr2 != null && bArr2.length >= 4 && Coder.bytesToHexString(bArr).startsWith(Coder.bytesToHexString(APDUConstants.PBOC_CARD_AID_PREFFIX)) && ByteArray.equals(BankHciEventHandler.TAG_TRANSACTION_EVENT_ST, ByteArray.wrap(bArr2, 0, 2)) && "9000".equals(Coder.bytesToHexString(ByteArray.wrap(bArr2, 2, 2).toBytes()));
        }
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public HciEventInfo handleData(byte[] bArr, long j, byte[] bArr2) {
        IHciEventHandler iHciEventHandler = this.mHciEventHandler;
        if (iHciEventHandler == null) {
            return null;
        }
        return iHciEventHandler.handleData(bArr, j, bArr2);
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        IHciEventHandler[] iHciEventHandlerArr = {new NXPBankHciEventHandler(), new STBankHciEventHandler()};
        for (int i = 0; i < 2; i++) {
            IHciEventHandler iHciEventHandler = iHciEventHandlerArr[i];
            if (iHciEventHandler.isSupport(bArr, bArr2)) {
                this.mHciEventHandler = iHciEventHandler;
                return true;
            }
        }
        return false;
    }
}
