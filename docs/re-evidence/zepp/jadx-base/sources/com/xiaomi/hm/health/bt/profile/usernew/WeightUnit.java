package com.xiaomi.hm.health.bt.profile.usernew;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/WeightUnit;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", ExpandedProductParsedResult.KILOGRAM, "SJ", "YB", HTTP.ST, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum WeightUnit {
    KG(0),
    SJ(1),
    YB(2),
    ST(3);

    private final int value;

    WeightUnit(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
