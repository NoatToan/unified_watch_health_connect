package com.xiaomi.fitness.electronic.scale;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/BalanceWeightViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "TAG", "", "calculateResult", "", "time", "", "getTimeRange", "Lcom/xiaomi/fitness/electronic/scale/BalanceWeightViewModel$TimeRange;", "TimeRange", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceWeightViewModel extends ElectronicScaleBaseViewModel {

    @NotNull
    private final String TAG = "BalanceWeightViewModel";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/BalanceWeightViewModel$TimeRange;", "", "min", "", "mac", "<init>", "(II)V", "getMin", "()I", "setMin", "(I)V", "getMac", "setMac", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeRange {
        private int mac;
        private int min;

        public TimeRange(int i, int i2) {
            this.min = i;
            this.mac = i2;
        }

        public static /* synthetic */ TimeRange copy$default(TimeRange timeRange, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = timeRange.min;
            }
            if ((i3 & 2) != 0) {
                i2 = timeRange.mac;
            }
            return timeRange.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMac() {
            return this.mac;
        }

        @NotNull
        public final TimeRange copy(int min, int mac) {
            return new TimeRange(min, mac);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) other;
            return this.min == timeRange.min && this.mac == timeRange.mac;
        }

        public final int getMac() {
            return this.mac;
        }

        public final int getMin() {
            return this.min;
        }

        public int hashCode() {
            return (Integer.hashCode(this.min) * 31) + Integer.hashCode(this.mac);
        }

        public final void setMac(int i) {
            this.mac = i;
        }

        public final void setMin(int i) {
            this.min = i;
        }

        @NotNull
        public String toString() {
            return "TimeRange(min=" + this.min + ", mac=" + this.mac + ")";
        }
    }

    public final int calculateResult(float time) {
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        int age = companion.getInstance().getAge();
        int sex = companion.getInstance().getSex();
        Logger.i(this.TAG, "age " + age);
        Logger.i(this.TAG, "sex " + sex);
        Logger.i(this.TAG, "time " + time);
        if (sex == 0) {
            if (age <= 24) {
                if (time < 16.0f) {
                    return 1;
                }
                return time < 37.0f ? 2 : 3;
            }
            if (age <= 29) {
                if (time < 15.0f) {
                    return 1;
                }
                return time < 33.0f ? 2 : 3;
            }
            if (age <= 34) {
                if (time < 13.0f) {
                    return 1;
                }
                return time < 29.0f ? 2 : 3;
            }
            if (age <= 39) {
                if (time < 10.0f) {
                    return 1;
                }
                return time < 24.0f ? 2 : 3;
            }
            if (age <= 44) {
                if (time < 8.0f) {
                    return 1;
                }
                return time < 19.0f ? 2 : 3;
            }
            if (age <= 49) {
                if (time < 7.0f) {
                    return 1;
                }
                return time < 16.0f ? 2 : 3;
            }
            if (age <= 54) {
                if (time < 6.0f) {
                    return 1;
                }
                return time < 14.0f ? 2 : 3;
            }
            if (time < 6.0f) {
                return 1;
            }
            return time < 11.0f ? 2 : 3;
        }
        if (sex != 1) {
            return 1;
        }
        if (age <= 24) {
            if (time < 18.0f) {
                return 1;
            }
            return time < 42.0f ? 2 : 3;
        }
        if (age <= 29) {
            if (time < 15.0f) {
                return 1;
            }
            return time < 36.0f ? 2 : 3;
        }
        if (age <= 34) {
            if (time < 13.0f) {
                return 1;
            }
            return time < 30.0f ? 2 : 3;
        }
        if (age <= 39) {
            if (time < 12.0f) {
                return 1;
            }
            return time < 28.0f ? 2 : 3;
        }
        if (age <= 44) {
            if (time < 10.0f) {
                return 1;
            }
            return time < 22.0f ? 2 : 3;
        }
        if (age <= 49) {
            if (time < 9.0f) {
                return 1;
            }
            return time < 20.0f ? 2 : 3;
        }
        if (age <= 54) {
            if (time < 8.0f) {
                return 1;
            }
            return time < 17.0f ? 2 : 3;
        }
        if (time < 7.0f) {
            return 1;
        }
        return time < 14.0f ? 2 : 3;
    }

    @NotNull
    public final TimeRange getTimeRange(float time) {
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        int age = companion.getInstance().getAge();
        int sex = companion.getInstance().getSex();
        Logger.i(this.TAG, "age " + age);
        Logger.i(this.TAG, "sex " + sex);
        Logger.i(this.TAG, "time " + time);
        if (sex == 0) {
            if (age <= 24) {
                return new TimeRange(16, 37);
            }
            if (age <= 29) {
                return new TimeRange(15, 33);
            }
            if (age <= 34) {
                return new TimeRange(13, 29);
            }
            if (age <= 39) {
                return new TimeRange(10, 24);
            }
            if (age <= 44) {
                return new TimeRange(8, 19);
            }
            if (age <= 49) {
                return new TimeRange(7, 16);
            }
            return age <= 54 ? new TimeRange(6, 14) : new TimeRange(6, 11);
        }
        if (sex != 1) {
            return new TimeRange(15, 33);
        }
        if (age <= 24) {
            return new TimeRange(18, 42);
        }
        if (age <= 29) {
            return new TimeRange(15, 36);
        }
        if (age <= 34) {
            return new TimeRange(13, 30);
        }
        if (age <= 39) {
            return new TimeRange(12, 28);
        }
        if (age <= 44) {
            return new TimeRange(10, 22);
        }
        if (age <= 49) {
            return new TimeRange(9, 20);
        }
        return age <= 54 ? new TimeRange(8, 17) : new TimeRange(7, 14);
    }
}
