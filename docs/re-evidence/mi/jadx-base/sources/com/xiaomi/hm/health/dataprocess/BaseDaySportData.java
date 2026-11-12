package com.xiaomi.hm.health.dataprocess;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/BaseDaySportData;", "", "()V", "sportDay", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "getSportDay", "()Lcom/xiaomi/hm/health/dataprocess/SportDay;", "setSportDay", "(Lcom/xiaomi/hm/health/dataprocess/SportDay;)V", "dataprocess_release"}, k = 1, mv = {1, 1, 13})
public abstract class BaseDaySportData {

    @NotNull
    public SportDay sportDay;

    @NotNull
    public final SportDay getSportDay() {
        SportDay sportDay = this.sportDay;
        if (sportDay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportDay");
        }
        return sportDay;
    }

    public final void setSportDay(@NotNull SportDay sportDay) {
        this.sportDay = sportDay;
    }
}
