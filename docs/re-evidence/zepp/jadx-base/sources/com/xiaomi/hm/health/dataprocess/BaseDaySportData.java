package com.xiaomi.hm.health.dataprocess;

import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/BaseDaySportData;", "", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "sportDay", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "getSportDay", "()Lcom/xiaomi/hm/health/dataprocess/SportDay;", "setSportDay", "(Lcom/xiaomi/hm/health/dataprocess/SportDay;)V", "<init>", "()V", "dataprocess_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseDaySportData {
    public SportDay sportDay;

    @NotNull
    public final SportDay getSportDay() {
        SportDay sportDay = this.sportDay;
        Objects.requireNonNull(sportDay);
        return sportDay;
    }

    public final void setSportDay(@NotNull SportDay sportDay) {
        this.sportDay = sportDay;
    }
}
