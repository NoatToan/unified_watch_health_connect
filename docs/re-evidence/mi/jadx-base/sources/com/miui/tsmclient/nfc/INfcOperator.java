package com.miui.tsmclient.nfc;

import com.miui.tsmclientsdk.UnSupportedException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface INfcOperator {
    String getChipName();

    default int getCustomRFConfig() throws UnSupportedException {
        throw new UnSupportedException();
    }

    int getDiscoveryTech(int i) throws UnSupportedException;

    int getEseRouting();

    default int getFeatureVersion(String str) {
        return 0;
    }

    byte[] getFwVersion();

    byte[] getNfccDieid();

    String getSignedSpiPk();

    int getVersion();

    boolean isRoutingESE();

    default void saveCustomRFConfigResult(String str, int i) throws UnSupportedException {
        throw new UnSupportedException();
    }

    int setConfig(String str);

    default boolean setCustomRFConfig(String str, int i) throws UnSupportedException {
        throw new UnSupportedException();
    }

    void setEseRouting(int i);

    void setListenTechMask(int i, int i2) throws IOException;

    default boolean setCustomRFConfig(String str) throws UnSupportedException {
        throw new UnSupportedException();
    }
}
