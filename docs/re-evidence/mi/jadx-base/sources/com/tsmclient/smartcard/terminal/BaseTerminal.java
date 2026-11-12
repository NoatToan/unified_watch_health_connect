package com.tsmclient.smartcard.terminal;

import android.content.Context;
import com.miui.tsmclient.service.DKFRequestService;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.PrefUtils;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.handler.config.ResponseImpl;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.tsmclient.smartcard.tlv.ITLVObject;
import com.tsmclient.smartcard.tlv.ITLVValue;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.tsmclient.smartcard.util.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseTerminal implements IScTerminal {
    protected static final String TAG = "NfcEETerminal";
    protected static ExecutorService mExecutor = Executors.newSingleThreadExecutor();
    protected String mCIN;
    protected String mCPLC;
    protected Context mContext;
    protected boolean mInterruptible = true;
    protected boolean mNfcChannelOpen;
    protected String mSeid;
    protected String mTerminalCategory;
    protected TerminalManager.Priority mTerminalPriority;
    protected TerminalType mTerminalType;

    public BaseTerminal(Context context) {
        this.mContext = context;
    }

    public static byte[] appendResponse(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[bArr.length + i];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, i);
        return bArr3;
    }

    public void acquireLock() throws InterruptedException, IOException {
        IScTerminal iScTerminal;
        if (this.mTerminalPriority == null) {
            this.mTerminalPriority = TerminalManager.Priority.DEFAULT;
        }
        TerminalManager.TerminalExtra terminalExtra = TerminalManager.getInstance().getTerminalExtra(this.mTerminalCategory);
        if ((terminalExtra.mTerminalPriority == null || this.mTerminalPriority.ordinal() > terminalExtra.mTerminalPriority.ordinal()) && (iScTerminal = terminalExtra.mTerminal) != null) {
            iScTerminal.close();
        }
        if (this.mInterruptible) {
            terminalExtra.mTermSemaphore.acquire();
        } else {
            terminalExtra.mTermSemaphore.acquireUninterruptibly();
        }
        terminalExtra.mTerminal = this;
        terminalExtra.mTerminalPriority = this.mTerminalPriority;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public boolean activateCard(String str) {
        ITLVObject iTLVObjectFindTLV;
        int i = 2;
        LogUtils.d(TAG, "activateCard appAid:" + str);
        try {
            try {
                try {
                    try {
                        try {
                            open();
                            ByteArray status = transmit(APDUConstants.SELECT_CRS).getStatus();
                            ByteArray byteArray = ScResponse.STATUS_OK;
                            if (!ByteArray.equals(status, byteArray)) {
                                return false;
                            }
                            ScResponse scResponseTransmit = transmit(TerminalUtils.buildSetStatusApdu(str, true).toBytes());
                            if (!ByteArray.equals(scResponseTransmit.getStatus(), byteArray) && !ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_OPERATION_FAILED)) {
                                if (ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_ACTIVATION_CONFLICT)) {
                                    ByteArray data = scResponseTransmit.getData();
                                    if (data == null) {
                                        return false;
                                    }
                                    ITLVValue value = TLVParser.parseTLVValue(data).findTLV(APDUConstants.TAG_AEF_ENTRANCE).getValue();
                                    if (value == null) {
                                        return false;
                                    }
                                    byte[] bArr = {DKFRequestService.o, -94};
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= i) {
                                            iTLVObjectFindTLV = null;
                                            break;
                                        }
                                        try {
                                            iTLVObjectFindTLV = value.findTLV(ByteArray.wrap(bArr[i2]));
                                            break;
                                        } catch (TagNotFoundException e) {
                                            LogUtils.e(TAG, "resolveActivationConflict TagNotFoundException occurred.", e);
                                            i2++;
                                        }
                                    }
                                    if (iTLVObjectFindTLV != null && iTLVObjectFindTLV.getValue() != null) {
                                        String strBytesToHexString = Coder.bytesToHexString(iTLVObjectFindTLV.getValue().findTLV(APDUConstants.TAG_AID).getValue().toBytes().toBytes());
                                        ScResponse scResponseTransmit2 = transmit(TerminalUtils.buildSetStatusApdu(strBytesToHexString, false).toBytes());
                                        ByteArray status2 = scResponseTransmit2.getStatus();
                                        ByteArray byteArray2 = ScResponse.STATUS_OK;
                                        if (!ByteArray.equals(status2, byteArray2)) {
                                            LogUtils.d(TAG, "resolveActivationConflict deactivate: " + strBytesToHexString + ", response: " + (scResponseTransmit2.getStatus() == null ? AbstractJsonLexerKt.NULL : scResponseTransmit2.getStatus().toString()));
                                            return false;
                                        }
                                        if (ByteArray.equals(transmit(TerminalUtils.buildSetStatusApdu(str, true).toBytes()).getStatus(), byteArray2)) {
                                            close();
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                                return false;
                            }
                            LogUtils.d(TAG, "activateCard appAid:" + str + " success");
                            return true;
                        } catch (TagNotFoundException e2) {
                            LogUtils.e(TAG, "failed to active card, resolveActivationConflict TagNotFoundException occurred.", e2);
                        }
                    } catch (InvalidTLVException e3) {
                        LogUtils.e(TAG, "failed to active card", e3);
                    }
                } catch (InterruptedException e4) {
                    LogUtils.e(TAG, "active card is interrupted. aid: " + str, e4);
                    Thread.currentThread().interrupt();
                }
            } catch (IOException e5) {
                LogUtils.e(TAG, "failed to active card, aid = " + str, e5);
            }
        } finally {
            close();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public synchronized void close() {
        String str;
        String str2;
        try {
            internalClose();
            this.mNfcChannelOpen = false;
            releaseLock();
            str = TAG;
            str2 = "terminal closed";
        } catch (Throwable th) {
            try {
                LogUtils.e(TAG, "closing terminal failed", th);
                releaseLock();
                str = TAG;
                str2 = "terminal closed";
            } catch (Throwable th2) {
                releaseLock();
                LogUtils.d(TAG, "terminal closed");
                throw th2;
            }
        }
        LogUtils.d(str, str2);
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public boolean deactivateCard(String str) {
        try {
            try {
                open();
                ByteArray status = transmit(APDUConstants.SELECT_CRS).getStatus();
                ByteArray byteArray = ScResponse.STATUS_OK;
                if (!ByteArray.equals(status, byteArray)) {
                    return false;
                }
                ScResponse scResponseTransmit = transmit(TerminalUtils.buildSetStatusApdu(str, false).toBytes());
                if (ByteArray.equals(scResponseTransmit.getStatus(), byteArray) || ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_OPERATION_FAILED)) {
                    LogUtils.d(TAG, "deactivateCard appAid:" + str + " success");
                    return true;
                }
                return false;
            } catch (IOException e) {
                LogUtils.e(TAG, "failed to deactivate card, aid = " + str, e);
            } catch (InterruptedException e2) {
                LogUtils.e(TAG, "deactivate card is interrupted, aid: " + str, e2);
                Thread.currentThread().interrupt();
            }
        } finally {
            close();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public String getCIN() throws InterruptedException, IOException {
        String string = PrefUtils.getString(this.mContext, getPrefKey(PrefUtils.PREF_KEY_CIN), null);
        this.mCIN = string;
        if (string == null) {
            getSEInfo();
        }
        return this.mCIN;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public String getCPLC() throws InterruptedException, IOException {
        String string = PrefUtils.getString(this.mContext, getPrefKey(PrefUtils.PREF_KEY_CPLC), null);
        this.mCPLC = string;
        if (string == null) {
            getSEInfo();
        }
        return this.mCPLC;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public Map<String, ByteArray> getCardActivationState(String str) throws InterruptedException {
        HashMap map = new HashMap();
        try {
            open();
            ScResponse scResponseTransmit = transmit(APDUConstants.SELECT_CRS);
            if (!ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_OK)) {
                LogUtils.e(TAG, "failed to select CRS, status: " + Coder.bytesToHexString(scResponseTransmit.getStatus().toBytes()), null);
                return null;
            }
            byte[] bArrHexStringToBytes = Coder.hexStringToBytes(str);
            byte[] bArr = new byte[bArrHexStringToBytes.length + 7];
            bArr[0] = 79;
            bArr[1] = (byte) (bArrHexStringToBytes.length & 255);
            System.arraycopy(bArrHexStringToBytes, 0, bArr, 2, bArrHexStringToBytes.length);
            CommandApdu commandApdu = APDUConstants.COMM_TAG_GET_STATUS;
            System.arraycopy(commandApdu.toBytes(), 0, bArr, bArrHexStringToBytes.length + 2, commandApdu.toBytes().length);
            CommandApdu commandApduM212clone = APDUConstants.COMM_PREFIX_GET_STATUS.m212clone();
            commandApduM212clone.setData(bArr);
            ScResponse scResponseTransmit2 = transmit(commandApduM212clone.toBytes());
            if (ByteArray.equals(scResponseTransmit2.getStatus(), ScResponse.STATUS_REFERENCE_NOT_FOUND)) {
                return map;
            }
            while (true) {
                if (!ByteArray.equals(scResponseTransmit2.getStatus(), ScResponse.STATUS_MORE_DATA_AVAILABLE) && !ByteArray.equals(scResponseTransmit2.getStatus(), ScResponse.STATUS_OK)) {
                    return map;
                }
                if (commandApduM212clone.getP2() != 1) {
                    commandApduM212clone.setP2(1);
                }
                for (ITLVObject iTLVObject : TLVParser.parseTLVValue(scResponseTransmit2.getData()).findTLVList(APDUConstants.TAG_AEF_ENTRANCE)) {
                    map.put(Coder.bytesToHexString(iTLVObject.getValue().findTLV(APDUConstants.TAG_AID).getValue().toBytes().toBytes()), iTLVObject.getValue().findTLV(APDUConstants.TAG_LIFESTYLE_STATE).getValue().toBytes());
                }
                if (ByteArray.equals(scResponseTransmit2.getStatus(), ScResponse.STATUS_OK)) {
                    return map;
                }
                scResponseTransmit2 = transmit(commandApduM212clone.toBytes());
            }
        } catch (IOException e) {
            LogUtils.e(TAG, "getCardActivationState IOException occurred.", e);
        } catch (InvalidTLVException e2) {
            LogUtils.e(TAG, "getCardActivationState InvalidTLVException occurred.", e2);
        } catch (TagNotFoundException e3) {
            LogUtils.e(TAG, "getCardActivationState TagNotFoundException occurred.", e3);
        } finally {
            close();
        }
    }

    public String getPrefKey(String str) {
        return str;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public void getSEInfo() throws InterruptedException, IOException {
        try {
            open();
            readSEInfo();
        } finally {
            close();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public String getSeid() throws InterruptedException, IOException {
        String string = PrefUtils.getString(this.mContext, getPrefKey(PrefUtils.PREF_KEY_SEID), null);
        this.mSeid = string;
        if (string == null) {
            getSEInfo();
        }
        return this.mSeid;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public String getTerminalCategory() {
        return this.mTerminalCategory;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public TerminalType getTerminalType() {
        return this.mTerminalType;
    }

    public abstract void internalClose();

    public abstract void internalConnect() throws InterruptedException, IOException;

    public abstract byte[] internalTransmit(byte[] bArr) throws InterruptedException, IOException;

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public boolean isAppletExist(String str) throws InterruptedException, IOException {
        CommandApdu commandApdu = new CommandApdu(0, 164, 4, 0);
        try {
            open();
            commandApdu.setData(Coder.hexStringToBytes(str));
            return ByteArray.equals(transmit(commandApdu.toBytes()).getStatus(), ScResponse.STATUS_OK);
        } finally {
            close();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public boolean isInterruptible() {
        return this.mInterruptible;
    }

    public boolean isNfcChannelOpen() {
        return this.mNfcChannelOpen;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public void open() throws InterruptedException, IOException {
        acquireLock();
        LogUtils.d(TAG, "try to connect terminal");
        internalConnect();
        this.mNfcChannelOpen = true;
        LogUtils.d(TAG, "terminal opened");
    }

    public void readSEInfo() throws InterruptedException, IOException {
        transmit(APDUConstants.SELECT_ISD);
        byte[] bytes = transmit(APDUConstants.GET_SEID).getData().toBytes();
        if (bytes == null || bytes.length < 45) {
            throw new NfcEeIOException("data too small returned from se when getting cplc");
        }
        int i = bytes[2] & 255;
        byte[] bArr = new byte[i];
        System.arraycopy(bytes, 3, bArr, 0, i);
        this.mCPLC = Coder.bytesToHexString(bArr);
        PrefUtils.putString(this.mContext, getPrefKey(PrefUtils.PREF_KEY_CPLC), this.mCPLC);
        this.mSeid = Coder.encodeMD5(bArr) + this.mCPLC.substring(24, 36);
        PrefUtils.putString(this.mContext, getPrefKey(PrefUtils.PREF_KEY_SEID), this.mSeid);
        byte[] bArr2 = new byte[10];
        System.arraycopy(bArr, i - 4, bArr2, 0, 4);
        System.arraycopy(bytes, 15, bArr2, 4, 6);
        this.mCIN = Coder.bytesToHexString(bArr2);
        PrefUtils.putString(this.mContext, getPrefKey(PrefUtils.PREF_KEY_CIN), this.mCIN);
    }

    public void releaseLock() {
        TerminalManager.TerminalExtra terminalExtra = TerminalManager.getInstance().getTerminalExtra(this.mTerminalCategory);
        if (terminalExtra.mTerminal == this) {
            terminalExtra.mTerminal = null;
            terminalExtra.mTermSemaphore.drainPermits();
            terminalExtra.mTermSemaphore.release();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public void setInterruptible(boolean z) {
        this.mInterruptible = z;
    }

    @Override // com.tsmclient.smartcard.terminal.IScTerminal
    public synchronized ScResponse transmit(byte[] bArr) throws InterruptedException, IOException {
        byte[] bArrInternalTransmit;
        try {
            LogUtils.d(TAG, "send: " + Coder.bytesToHexString(bArr));
            bArrInternalTransmit = internalTransmit(bArr);
            LogUtils.d(TAG, "resp: " + Coder.bytesToHexString(bArrInternalTransmit));
            if (bArrInternalTransmit == null || bArrInternalTransmit.length < 2) {
                throw new IOException("response too small");
            }
            int i = bArrInternalTransmit[bArrInternalTransmit.length - 2] & 255;
            if (i == 108) {
                bArr[bArr.length - 1] = bArrInternalTransmit[bArrInternalTransmit.length - 1];
                bArrInternalTransmit = internalTransmit(bArr);
            } else if (i == 97) {
                byte[] bArr2 = {bArr[0], -64, 0, 0, 0};
                byte[] bArrAppendResponse = new byte[bArrInternalTransmit.length - 2];
                System.arraycopy(bArrInternalTransmit, 0, bArrAppendResponse, 0, bArrInternalTransmit.length - 2);
                while (true) {
                    bArr2[4] = bArrInternalTransmit[bArrInternalTransmit.length - 1];
                    bArrInternalTransmit = internalTransmit(bArr2);
                    if (bArrInternalTransmit.length < 2 || bArrInternalTransmit[bArrInternalTransmit.length - 2] != 97) {
                        break;
                    }
                    bArrAppendResponse = appendResponse(bArrAppendResponse, bArrInternalTransmit, bArrInternalTransmit.length - 2);
                }
                bArrInternalTransmit = appendResponse(bArrAppendResponse, bArrInternalTransmit, bArrInternalTransmit.length);
            }
        } catch (Throwable th) {
            throw th;
        }
        return new ResponseImpl(bArrInternalTransmit);
    }
}
