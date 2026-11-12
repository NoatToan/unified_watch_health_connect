package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.LapInfo;
import defpackage.d3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "timeDiff", "", "lapInfo", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "(JLcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;)V", "getLapInfo", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LapNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LapInfo lapInfo;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode$Companion;", "", "()V", "parse", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/LapNode;", "byteArray", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LapNode parse(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            d3 d3Var = new d3(byteArray);
            long jC = d3.c(d3Var, 0, 1, null);
            int iC = d3.c(d3Var, 0, 1, null);
            int iD = d3.d(d3Var, 0, 1, null);
            int iD2 = d3.d(d3Var, 0, 1, null);
            int iC2 = d3.c(d3Var, 0, 1, null);
            int iC3 = d3.c(d3Var, 0, 1, null);
            int iC4 = d3.c(d3Var, 0, 1, null);
            d3.a(d3Var, 0L, 1, (Object) null);
            long jA = d3.a(d3Var, 0L, 1, (Object) null);
            int iC5 = d3.c(d3Var, 0, 1, null);
            int iC6 = d3.c(d3Var, 0, 1, null);
            int iC7 = d3.c(d3Var, 0, 1, null);
            int iC8 = d3.c(d3Var, 0, 1, null);
            int iC9 = d3.c(d3Var, 0, 1, null);
            int iC10 = d3.c(d3Var, 0, 1, null);
            int iC11 = d3.c(d3Var, 0, 1, null);
            int iC12 = d3.c(d3Var, 0, 1, null);
            int iC13 = d3.c(d3Var, 0, 1, null);
            int iC14 = d3.c(d3Var, 0, 1, null);
            int iC15 = d3.c(d3Var, 0, 1, null);
            int iC16 = d3.c(d3Var, 0, 1, null);
            int iD3 = d3.d(d3Var, 0, 1, null);
            int iC17 = d3.c(d3Var, 0, 1, null);
            float fIntBitsToFloat = Float.intBitsToFloat(d3.a(d3Var, 0, 1, (Object) null));
            int iD4 = d3Var.d(-1);
            LapInfo lapInfo = new LapInfo(iD);
            lapInfo.setIndex(iC);
            lapInfo.setAvgHr(iD2);
            lapInfo.setMaxPace(iC9 / 1000.0f);
            lapInfo.setLapCalorie(iC3);
            lapInfo.setLapDistance(iC4);
            lapInfo.setTimeUsage(jA / ((long) 1000));
            lapInfo.setLapSwolf(iC6);
            lapInfo.setAscend(iC10);
            lapInfo.setStairFloor(iC17);
            lapInfo.setFloorPerMinute(fIntBitsToFloat);
            lapInfo.setCount(iC16);
            lapInfo.setWeight(iC15);
            lapInfo.setUnit(iD3);
            lapInfo.setAvgPace(iC2 / 1000.0f);
            lapInfo.setStrokes(iC5 > 0 ? iC5 : iC13);
            lapInfo.setStrokeSpeed(iC7);
            lapInfo.setSkipCount(iC11);
            lapInfo.setSwimStyle(iC8);
            lapInfo.setTrainType(iD4);
            lapInfo.setCadence(iC12 > 0 ? iC12 : iC14);
            return new LapNode(jC, lapInfo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LapNode(long j, @NotNull LapInfo lapInfo) {
        super(j);
        Intrinsics.checkNotNullParameter(lapInfo, "lapInfo");
        this.lapInfo = lapInfo;
    }

    @NotNull
    public final LapInfo getLapInfo() {
        return this.lapInfo;
    }
}
