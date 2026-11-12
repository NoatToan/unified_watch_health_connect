package com.huami.sleep.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/sleep/util/SleepDataSource;", "", "", "type", "getSleepDataSourceEnum", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "BAND", "EAR", "sleep_release"}, k = 1, mv = {1, 5, 1})
public enum SleepDataSource {
    BAND(0),
    EAR(1);

    private final int value;

    SleepDataSource(int i) {
        this.value = i;
    }

    @NotNull
    public final SleepDataSource getSleepDataSourceEnum(int type) {
        for (SleepDataSource sleepDataSource : values()) {
            if (type == sleepDataSource.getValue()) {
                return sleepDataSource;
            }
        }
        return BAND;
    }

    public final int getValue() {
        return this.value;
    }
}
