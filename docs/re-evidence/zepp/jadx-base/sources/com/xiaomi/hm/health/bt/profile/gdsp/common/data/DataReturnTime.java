package com.xiaomi.hm.health.bt.profile.gdsp.common.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "", "<init>", "()V", "ON_FINISH", "ON_LOOP", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime$ON_LOOP;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime$ON_FINISH;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class DataReturnTime {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime$ON_FINISH;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ON_FINISH extends DataReturnTime {

        @NotNull
        public static final ON_FINISH INSTANCE = new ON_FINISH();

        private ON_FINISH() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime$ON_LOOP;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ON_LOOP extends DataReturnTime {

        @NotNull
        public static final ON_LOOP INSTANCE = new ON_LOOP();

        private ON_LOOP() {
            super(null);
        }
    }

    private DataReturnTime() {
    }

    public /* synthetic */ DataReturnTime(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
