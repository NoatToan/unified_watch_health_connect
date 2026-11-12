package com.xiaomi.fit.fitness.sleep.algo.stage.data;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SleepRateArray {
    public long bedTimeSecond;
    public int count;
    public byte[] valueArray;

    public String toString() {
        return "SleepRateArray{count=" + this.count + ", bedTimeSecond=" + this.bedTimeSecond + ", valueArray=" + Arrays.toString(this.valueArray) + AbstractJsonLexerKt.END_OBJ;
    }
}
