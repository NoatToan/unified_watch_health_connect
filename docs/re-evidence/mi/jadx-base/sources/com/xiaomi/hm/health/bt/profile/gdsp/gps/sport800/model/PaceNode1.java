package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import defpackage.tet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "timeDiff", "", "freq", "", FitnessRecordKey.stride, "pace", "(JIII)V", "getFreq", "()I", "getPace", "getStride", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PaceNode1 extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int freq;
    private final int pace;
    private final int stride;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1$Companion;", "", "()V", "parse", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PaceNode1;", "byteArray", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PaceNode1 parse(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return new PaceNode1(tet.v(byteArray, 0, 2), tet.d(byteArray, 2, 2), tet.d(byteArray, 4, 2), tet.d(byteArray, 6, 2));
        }
    }

    public PaceNode1(long j, int i, int i2, int i3) {
        super(j);
        this.freq = i;
        this.stride = i2;
        this.pace = i3;
    }

    public final int getFreq() {
        return this.freq;
    }

    public final int getPace() {
        return this.pace;
    }

    public final int getStride() {
        return this.stride;
    }
}
