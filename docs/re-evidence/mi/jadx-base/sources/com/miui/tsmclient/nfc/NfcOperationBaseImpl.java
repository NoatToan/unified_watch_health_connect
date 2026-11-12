package com.miui.tsmclient.nfc;

import android.nfc.NfcAdapter;
import com.miui.tsmclient.common.util.Coder;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import com.miui.tsmclientsdk.UnSupportedException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class NfcOperationBaseImpl implements INfcOperator {
    private static final int DISABLE_CE = 201326592;
    private static final int DISABLE_CE_Q = 2;
    private static final int ENABLE_CE = 202637312;
    private static final int ENABLE_CE_FOR_LIN_NAN_TONG = 262144;
    private static final int ENABLE_CE_Q = 1;
    private static final String METHOD_GET_NXP_NFC_ADAPTER = "getNxpNfcAdapter";
    private static final String METHOD_SET_LISTEN_TECH_MASK = "setListenTechMask";
    private static final String NXP_NFC_ADAPTER = "com.nxp.nfc.NxpNfcAdapter";

    private NfcAdapter getNfcAdapter() {
        return NfcAdapter.getDefaultAdapter(EnvironmentConfig.getContext());
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public String getChipName() {
        return "";
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getDiscoveryTech(int i) throws UnSupportedException {
        throw new UnSupportedException("getDiscoveryTech is not supported in current version");
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getEseRouting() {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter == null) {
            return -1;
        }
        try {
            return ((Integer) ReflectUtil.callObjectMethod(nfcAdapter, NfcConstants.METHOD_GET_SE_ROUTING, null, new Object[0])).intValue();
        } catch (Exception e) {
            LogUtils.e("getEseRouting", e);
            return -1;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public byte[] getFwVersion() {
        Method method;
        Object objInvoke;
        Object objCallObjectMethod;
        byte[] bArr = NfcConstants.DEFAULT_FW_VERSION;
        try {
            Class<?> classFromName = ReflectUtil.getClassFromName(NXP_NFC_ADAPTER);
            if (classFromName != null && (method = ReflectUtil.getMethod(classFromName, METHOD_GET_NXP_NFC_ADAPTER, NfcAdapter.class)) != null && (objInvoke = ReflectUtil.invoke(method, null, NfcAdapter.getDefaultAdapter(EnvironmentConfig.getContext()))) != null && (objCallObjectMethod = ReflectUtil.callObjectMethod(objInvoke, NfcConstants.METHOD_EXT_SMART_CARD_API, new Class[]{Integer.TYPE}, 1)) != null && ((Integer) objCallObjectMethod).intValue() == 1) {
                byte[] bArr2 = (byte[]) ReflectUtil.callObjectMethod(objInvoke, NfcConstants.METHOD_GET_FW_VERSION, null, new Object[0]);
                LogUtils.d("current fw version: " + Coder.byteArrayToString(bArr2));
                return bArr2.length > 2 ? bArr2 : bArr;
            }
            return bArr;
        } catch (Exception e) {
            LogUtils.e("getting fw version fails: " + e);
            return bArr;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public byte[] getNfccDieid() {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter != null) {
            try {
                return (byte[]) ReflectUtil.callObjectMethod(nfcAdapter, NfcConstants.METHOD_GET_NFCC_DIEID, null, new Object[0]);
            } catch (Exception e) {
                LogUtils.e(NfcConstants.METHOD_GET_NFCC_DIEID, e);
            }
        }
        return null;
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public String getSignedSpiPk() {
        try {
            return CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_BANKCARD, null).getTerminal().getSignedSpiPK();
        } catch (IOException e) {
            LogUtils.e("getSignedSpiPk error", e);
            return null;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            LogUtils.e("getSignedSpiPk is interrupted.", e2);
            return null;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getVersion() {
        return 0;
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public boolean isRoutingESE() {
        return getEseRouting() == 1;
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int setConfig(String str) {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter == null) {
            return -1;
        }
        try {
            return ((Integer) ReflectUtil.callObjectMethod(nfcAdapter, NfcConstants.METHOD_SET_CONFIG, new Class[]{String.class}, str)).intValue();
        } catch (Exception e) {
            LogUtils.e(NfcConstants.METHOD_SET_CONFIG, e);
            return -1;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public void setEseRouting(int i) {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter != null) {
            try {
                ReflectUtil.callObjectMethod(nfcAdapter, NfcConstants.METHOD_SET_SE_ROUTING, new Class[]{Integer.TYPE}, Integer.valueOf(i));
            } catch (Exception e) {
                LogUtils.e("setEseRouting", e);
            }
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public void setListenTechMask(int i, int i2) throws IOException {
        int i3;
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter != null) {
            if ((i & 16) == 16) {
                i3 = (i2 & 16) == 16 ? ENABLE_CE : DISABLE_CE;
            } else if ((i & 1) == 1) {
                i3 = (i2 & 15) > 0 ? 1 : 2;
            } else {
                i3 = 0;
            }
            try {
                LogUtils.d("NfcOperationBaseImpl setListenTechMask:" + i3);
                ReflectUtil.callObjectMethod(nfcAdapter, METHOD_SET_LISTEN_TECH_MASK, new Class[]{Integer.TYPE}, Integer.valueOf(i3));
            } catch (IllegalAccessException e) {
                e = e;
                LogUtils.e("NfcOperationBaseImpl setListenTechMask", e);
            } catch (NoSuchMethodException e2) {
                e = e2;
                LogUtils.e("NfcOperationBaseImpl setListenTechMask", e);
            } catch (InvocationTargetException e3) {
                LogUtils.e("NfcOperationBaseImpl setListenTechMask", e3);
                if (e3.getCause() instanceof IOException) {
                    throw new IOException(e3.getCause());
                }
            }
        }
    }
}
