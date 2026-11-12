package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import defpackage.tet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FixedLapNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "timeDiff", "", "timeUsage", "", "distance", "unit", "(JIII)V", "getDistance", "()I", "getTimeUsage", "getUnit", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FixedLapNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int distance;
    private final int timeUsage;
    private final int unit;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FixedLapNode$Companion;", "", "()V", "parse", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FixedLapNode;", "byteArray", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FixedLapNode parse(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return new FixedLapNode(tet.v(byteArray, 0, 2), tet.d(byteArray, 2, 2), tet.d(byteArray, 4, 4), tet.d(byteArray, 8, 1));
        }
    }

    public FixedLapNode(long j, int i, int i2, int i3) {
        super(j);
        this.timeUsage = i;
        this.distance = i2;
        this.unit = i3;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }

    public final int getUnit() {
        return this.unit;
    }
}
