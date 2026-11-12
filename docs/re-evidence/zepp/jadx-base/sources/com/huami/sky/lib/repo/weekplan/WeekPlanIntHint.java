package com.huami.sky.lib.repo.weekplan;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/WeekPlanIntHint;", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "", "strId", LogUtil.I, "getStrId", "()I", "value", "getValue", "<init>", "(II)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanIntHint extends WeekPlanHint {
    private final int strId;
    private final int value;

    public WeekPlanIntHint(int i, int i2) {
        super(null);
        this.strId = i;
        this.value = i2;
    }

    public final int getStrId() {
        return this.strId;
    }

    public final int getValue() {
        return this.value;
    }
}
