package com.miui.tsmclient.nfc;

import android.content.Context;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import com.miui.tsmclientsdk.UnSupportedException;
import com.tsmclient.smartcard.Coder;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public class NfcOperatorApi31Impl implements INfcOperator {
    private static final int DISABLE_CE_S = 0;
    private static final int DISABLE_POLL_S = 0;
    private static final String DISCOVERY_PARAMS = "DiscoveryParams";
    private static final int ENABLE_CE_S = 1;
    private static final int ENABLE_POLL_S = 768;
    private static final String METHOD_GET_CHIP_NAME = "getChipName";
    private static final String METHOD_GET_CUSTOM_RF_CONFIG = "getCustomRFConfig";
    private static final String METHOD_GET_DISCOVERY_TECH = "getDiscoveryTech";
    private static final String METHOD_GET_FEATURE_VERSION = "getFeatureVersion";
    private static final String METHOD_GET_SPI_SIGNED_PK = "getSpiSignedPK";
    private static final String METHOD_GET_TECH_MASK = "getTechMask";
    private static final String METHOD_GET_VERSION = "getVersion";
    private static final String METHOD_SAVE_CUSTOM_RF_CONFIG_RESULT = "saveCustomRFConfigResult";
    private static final String METHOD_SET_CUSTOM_RF_CONFIG = "setCustomRFConfig";
    private static final String METHOD_SET_DISCOVERY_TECH = "setDiscoveryTech";
    private static final String MI_NFC_ADAPTER = "com.xiaomi.nfc.MiNfcAdapter";

    private Object getNfcAdapter() {
        return ReflectUtil.newInstance(ReflectUtil.getClassFromName(MI_NFC_ADAPTER), (Class<?>[]) new Class[]{Context.class}, EnvironmentConfig.getContext());
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public String getChipName() {
        try {
            return (String) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_GET_CHIP_NAME, null, new Object[0]);
        } catch (Exception e) {
            LogUtils.e("NfcOperatorApi31Impl getChipName", e);
            return "";
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getCustomRFConfig() {
        try {
            return ((Integer) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_GET_CUSTOM_RF_CONFIG, null, new Object[0])).intValue();
        } catch (Throwable th) {
            LogUtils.e(METHOD_GET_CUSTOM_RF_CONFIG, th);
            return 0;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getDiscoveryTech(int i) throws UnSupportedException {
        try {
            if ((i & 16) == 16 || (i & 32) == 32) {
                throw new UnSupportedException("the mode is not supported");
            }
            if (getVersion() < 1) {
                throw new UnSupportedException("getDiscoveryTech is not supported is current version");
            }
            Integer num = (Integer) ReflectUtil.callObjectMethod(ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_GET_DISCOVERY_TECH, new Class[]{Integer.TYPE}, Integer.valueOf(i)), METHOD_GET_TECH_MASK, null, new Object[0]);
            int iIntValue = num.intValue();
            int i2 = ((i & 2) == 2 && (iIntValue & ENABLE_POLL_S) == ENABLE_POLL_S) ? 256 : 0;
            if ((i & 1) == 1) {
                i2 |= iIntValue;
            }
            LogUtils.d(String.format("getDiscoveryTech(mode: %s) techMask from nfc is %s, converted mask is %s", Integer.valueOf(i), num, Integer.valueOf(i2)));
            return i2;
        } catch (Throwable th) {
            LogUtils.e("getOriginalDiscoveryTech failed", th);
            throw new UnSupportedException(th);
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getEseRouting() {
        try {
            return ((Integer) ReflectUtil.callObjectMethod(getNfcAdapter(), NfcConstants.METHOD_GET_SE_ROUTING, null, new Object[0])).intValue();
        } catch (Exception e) {
            LogUtils.e("getEseRouting", e);
            return -1;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getFeatureVersion(String str) {
        try {
            return ((Integer) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_GET_FEATURE_VERSION, new Class[]{String.class}, str)).intValue();
        } catch (Throwable th) {
            LogUtils.e(METHOD_GET_FEATURE_VERSION, th);
            return 0;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public byte[] getFwVersion() {
        try {
            if (getChipName().startsWith("NXP")) {
                Object nfcAdapter = getNfcAdapter();
                Object objCallObjectMethod = ReflectUtil.callObjectMethod(nfcAdapter, NfcConstants.METHOD_EXT_SMART_CARD_API, new Class[]{Integer.TYPE}, 1);
                if (objCallObjectMethod != null && ((Integer) objCallObjectMethod).intValue() == 1) {
                    String str = (String) ReflectUtil.callObjectMethod(nfcAdapter, NfcConstants.METHOD_GET_FW_VERSION, null, new Object[0]);
                    if (str != null && str.length() >= 6) {
                        String strReplace = str.replace(".", "");
                        return Coder.hexStringToBytes(strReplace.substring(2, 4) + strReplace.substring(4, 6) + strReplace.substring(0, 2));
                    }
                    return NfcConstants.DEFAULT_FW_VERSION;
                }
                return NfcConstants.DEFAULT_FW_VERSION;
            }
        } catch (Exception e) {
            LogUtils.e(NfcConstants.METHOD_GET_FW_VERSION, e);
        }
        return NfcConstants.DEFAULT_FW_VERSION;
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public byte[] getNfccDieid() {
        try {
            return (byte[]) ReflectUtil.callObjectMethod(getNfcAdapter(), NfcConstants.METHOD_GET_NFCC_DIEID, null, new Object[0]);
        } catch (Exception e) {
            LogUtils.e(NfcConstants.METHOD_GET_NFCC_DIEID, e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public String getSignedSpiPk() {
        try {
            return (String) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_GET_SPI_SIGNED_PK, null, new Object[0]);
        } catch (Exception e) {
            LogUtils.e("getSignedSpiPk", e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int getVersion() {
        try {
            int iIntValue = ((Integer) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_GET_VERSION, null, new Object[0])).intValue();
            LogUtils.d("NfcAdapter.version = " + iIntValue);
            return iIntValue;
        } catch (Throwable th) {
            LogUtils.e(METHOD_GET_VERSION, th);
            return 0;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public boolean isRoutingESE() {
        return getEseRouting() == 1;
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public void saveCustomRFConfigResult(String str, int i) {
        try {
            ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_SAVE_CUSTOM_RF_CONFIG_RESULT, new Class[]{byte[].class, Integer.TYPE}, Coder.hexStringToBytes(str), Integer.valueOf(i));
        } catch (Throwable th) {
            LogUtils.e(METHOD_SAVE_CUSTOM_RF_CONFIG_RESULT, th);
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public int setConfig(String str) {
        try {
            return ((Integer) ReflectUtil.callObjectMethod(getNfcAdapter(), NfcConstants.METHOD_SET_CONFIG, new Class[]{String.class}, str)).intValue();
        } catch (Exception e) {
            LogUtils.e(NfcConstants.METHOD_SET_CONFIG, e);
            return -1;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public boolean setCustomRFConfig(String str, int i) {
        try {
            return ((Boolean) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_SET_CUSTOM_RF_CONFIG, new Class[]{byte[].class, Integer.TYPE}, Coder.hexStringToBytes(str), Integer.valueOf(i))).booleanValue();
        } catch (Throwable th) {
            LogUtils.e(METHOD_SET_CUSTOM_RF_CONFIG, th);
            return false;
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public void setEseRouting(int i) {
        try {
            ReflectUtil.callObjectMethod(getNfcAdapter(), NfcConstants.METHOD_SET_SE_ROUTING, new Class[]{Integer.TYPE}, Integer.valueOf(i));
        } catch (Exception e) {
            LogUtils.e("setEseRouting", e);
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public void setListenTechMask(int i, int i2) throws IOException {
        Object nfcAdapter = getNfcAdapter();
        if (nfcAdapter == null || (i & 16) == 16 || (i & 32) == 32) {
            return;
        }
        int i3 = (i & 1) == 1 ? i2 & 15 : 0;
        if ((i & 2) == 2 && (i2 & 256) == 256) {
            i3 |= ENABLE_POLL_S;
        }
        try {
            int discoveryTech = getDiscoveryTech(i);
            LogUtils.d(String.format("techMask is set from %s to %s", Integer.valueOf(discoveryTech), Integer.valueOf(i2)));
            if (discoveryTech == i2) {
                return;
            }
        } catch (UnSupportedException e) {
            LogUtils.e("getDiscoveryTech failed", e);
        }
        try {
            Class<?> classFromName = ReflectUtil.getClassFromName("com.xiaomi.nfc.MiNfcAdapter$DiscoveryParams");
            Class cls = Integer.TYPE;
            ReflectUtil.callObjectMethod(nfcAdapter, METHOD_SET_DISCOVERY_TECH, new Class[]{classFromName}, ReflectUtil.newInstance(classFromName, (Class<?>[]) new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i3)));
        } catch (IllegalAccessException e2) {
            e = e2;
            LogUtils.e("NfcOperatorApi31Impl setListenTechMask", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            LogUtils.e("NfcOperatorApi31Impl setListenTechMask", e);
        } catch (InvocationTargetException e4) {
            LogUtils.e("NfcOperatorApi31Impl setListenTechMask", e4);
            if (e4.getCause() instanceof IOException) {
                throw new IOException(e4.getCause());
            }
        }
    }

    @Override // com.miui.tsmclient.nfc.INfcOperator
    public boolean setCustomRFConfig(String str) {
        try {
            return ((Boolean) ReflectUtil.callObjectMethod(getNfcAdapter(), METHOD_SET_CUSTOM_RF_CONFIG, new Class[]{byte[].class}, Coder.hexStringToBytes(str))).booleanValue();
        } catch (Throwable th) {
            LogUtils.e(METHOD_SET_CUSTOM_RF_CONFIG, th);
            return false;
        }
    }
}
