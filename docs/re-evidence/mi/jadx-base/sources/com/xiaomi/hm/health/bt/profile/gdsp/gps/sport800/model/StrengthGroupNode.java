package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.d3;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "timeDiff", "", "index", "", "avgHr", StepsInfo.KEY_CALORIES, "timeUsage", "type", "weight", "times", "unit", "lapType", "(JIIIIIIIII)V", "getAvgHr", "()I", "getCal", "getIndex", "getLapType", "getTimeUsage", "getTimes", "getType", "getUnit", "getWeight", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StrengthGroupNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int avgHr;
    private final int cal;
    private final int index;
    private final int lapType;
    private final int timeUsage;
    private final int times;
    private final int type;
    private final int unit;
    private final int weight;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode$Companion;", "", "()V", "parse", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/StrengthGroupNode;", "byteArray", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StrengthGroupNode parse(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            d3 d3Var = new d3(byteArray);
            long jC = d3.c(d3Var, 0, 1, null);
            int iC = d3.c(d3Var, 0, 1, null);
            int iD = d3.d(d3Var, 0, 1, null);
            int iC2 = d3.c(d3Var, 0, 1, null);
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(d3.a(d3Var, 0L, 1, (Object) null));
            int iC3 = d3.c(d3Var, 0, 1, null);
            int iC4 = d3.c(d3Var, 0, 1, null);
            int iC5 = d3.c(d3Var, 0, 1, null);
            int iD2 = d3.d(d3Var, 0, 1, null);
            d3.d(d3Var, 0, 1, null);
            d3.c(d3Var, 0, 1, null);
            d3.d(d3Var, 0, 1, null);
            return new StrengthGroupNode(jC, iC, iD, iC2, seconds, iC3, iC4, iC5, iD2, iC3);
        }
    }

    public /* synthetic */ StrengthGroupNode(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, i4, i5, i6, i7, i8, (i10 & 512) != 0 ? 0 : i9);
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLapType() {
        return this.lapType;
    }

    public final int getTimeUsage() {
        return this.timeUsage;
    }

    public final int getTimes() {
        return this.times;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final int getWeight() {
        return this.weight;
    }

    public StrengthGroupNode(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(j);
        this.index = i;
        this.avgHr = i2;
        this.cal = i3;
        this.timeUsage = i4;
        this.type = i5;
        this.weight = i6;
        this.times = i7;
        this.unit = i8;
        this.lapType = i9;
    }
}
