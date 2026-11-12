package com.xiaomi.hm.health.bodyfat.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState;", "", "<init>", "()V", "Failure", "Measuring", "Prepare", "Success", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Prepare;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Measuring;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Failure;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Success;", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public abstract class MeasureBalanceState {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Failure;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Failure extends MeasureBalanceState {

        @NotNull
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Measuring;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Measuring extends MeasureBalanceState {

        @NotNull
        public static final Measuring INSTANCE = new Measuring();

        private Measuring() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Prepare;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Prepare extends MeasureBalanceState {

        @NotNull
        public static final Prepare INSTANCE = new Prepare();

        private Prepare() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState$Success;", "Lcom/xiaomi/hm/health/bodyfat/model/MeasureBalanceState;", "", "a", "J", "getValue", "()J", "setValue", "(J)V", "value", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends MeasureBalanceState {

        @NotNull
        public static final Success INSTANCE = new Success();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private static long value;

        private Success() {
            super(null);
        }

        public final long getValue() {
            return value;
        }

        public final void setValue(long j) {
            value = j;
        }
    }

    private MeasureBalanceState() {
    }

    public /* synthetic */ MeasureBalanceState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
