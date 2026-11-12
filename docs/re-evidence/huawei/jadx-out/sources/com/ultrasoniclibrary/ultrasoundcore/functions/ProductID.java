package com.ultrasoniclibrary.ultrasoundcore.functions;

import androidx.media3.extractor.AacUtil;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes46.dex */
public enum ProductID {
    HWTAG("RX12", 14000),
    PIANO("ZAAG", 18000),
    DOVE("ZAAI", 14000),
    PIANOP("ZAAM", 18000),
    HARPER("ZAAL", AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);

    private int initFreq;
    private String productID;

    ProductID(String str, int i) {
        this.productID = str;
        this.initFreq = i;
    }

    public String getProductID() {
        return this.productID;
    }

    public int getInitFreq() {
        return this.initFreq;
    }

    public static boolean isInvolveHeadsetProduct(String str) {
        Iterator it = EnumSet.of(PIANO, DOVE, PIANOP, HARPER).iterator();
        while (it.hasNext()) {
            if (((ProductID) it.next()).getProductID().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
