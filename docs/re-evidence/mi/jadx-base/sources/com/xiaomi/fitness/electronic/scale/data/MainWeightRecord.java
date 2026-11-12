package com.xiaomi.fitness.electronic.scale.data;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/MainWeightRecord;", "", "<init>", "()V", "weight", "", "Lcom/xiaomi/fitness/electronic/scale/data/MainWeightRecord$MainWeightItem;", "getWeight", "()Ljava/util/List;", "setWeight", "(Ljava/util/List;)V", "MainWeightItem", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainWeightRecord {

    @Nullable
    private List<MainWeightItem> weight;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/MainWeightRecord$MainWeightItem;", "", "<init>", "()V", "time", "", "getTime", "()J", "setTime", "(J)V", "weight", "", "getWeight", "()F", "setWeight", "(F)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MainWeightItem {
        private long time;
        private float weight;

        public final long getTime() {
            return this.time;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public final void setWeight(float f) {
            this.weight = f;
        }
    }

    @Nullable
    public final List<MainWeightItem> getWeight() {
        return this.weight;
    }

    public final void setWeight(@Nullable List<MainWeightItem> list) {
        this.weight = list;
    }
}
