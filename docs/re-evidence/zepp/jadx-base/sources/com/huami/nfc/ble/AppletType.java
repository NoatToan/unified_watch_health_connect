package com.huami.nfc.ble;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.nfc.eid.ConsatntKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/ble/AppletType;", "", "", "btValue", LogUtil.I, "getBtValue", "()I", "bleValue", "getBleValue", "<init>", "(Ljava/lang/String;III)V", "BUS", "DOOR", "MASTERCARD", "UNIONPAY", ConsatntKt.EID_PRODUCT_TYPE, "XIAOPENG", "JAC", "WATCHUNIONPAY", "nfc-ble_release"}, k = 1, mv = {1, 5, 1})
public enum AppletType {
    BUS(0, 1),
    DOOR(1, 2),
    MASTERCARD(3, 3),
    UNIONPAY(4, 4),
    EID(5, 5),
    XIAOPENG(6, 6),
    JAC(7, 7),
    WATCHUNIONPAY(2, 4);

    private final int bleValue;
    private final int btValue;

    AppletType(int i, int i2) {
        this.btValue = i;
        this.bleValue = i2;
    }

    public final int getBleValue() {
        return this.bleValue;
    }

    public final int getBtValue() {
        return this.btValue;
    }
}
