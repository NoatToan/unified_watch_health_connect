package com.huami.bloodpressure_ui.ext;

import androidx.annotation.Keep;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u001d\u001a\u00020\t8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/bloodpressure_ui/ext/BloodPressureWrap;", "", "", "getLow", "getHeight", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "component1", "bp", "copy", "", "toString", "hashCode", "other", "", "equals", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "getBp", "()Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "hour$delegate", "Lkotlin/Lazy;", "getHour", "()I", "hour", "minute$delegate", "getMinute", "minute", "dateStr$delegate", "getDateStr", "()Ljava/lang/String;", "dateStr", "<init>", "(Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureWrap {

    @NotNull
    private final BloodPressureDbVo bp;

    /* JADX INFO: renamed from: hour$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hour = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: minute$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy minute = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: dateStr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateStr = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return BloodPressureWrap.this.getBp().getDateStr();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return TimeEx.INSTANCE.getHour(Long.valueOf(BloodPressureWrap.this.getBp().getMeasureTime()));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return TimeEx.INSTANCE.getMinuteOfDay(Long.valueOf(BloodPressureWrap.this.getBp().getMeasureTime()), 5);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    public BloodPressureWrap(@NotNull BloodPressureDbVo bloodPressureDbVo) {
        this.bp = bloodPressureDbVo;
    }

    public static /* synthetic */ BloodPressureWrap copy$default(BloodPressureWrap bloodPressureWrap, BloodPressureDbVo bloodPressureDbVo, int i, Object obj) {
        if ((i & 1) != 0) {
            bloodPressureDbVo = bloodPressureWrap.bp;
        }
        return bloodPressureWrap.copy(bloodPressureDbVo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BloodPressureDbVo getBp() {
        return this.bp;
    }

    @NotNull
    public final BloodPressureWrap copy(@NotNull BloodPressureDbVo bp) {
        return new BloodPressureWrap(bp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BloodPressureWrap) && Intrinsics.areEqual(this.bp, ((BloodPressureWrap) other).bp);
    }

    @NotNull
    public final BloodPressureDbVo getBp() {
        return this.bp;
    }

    @NotNull
    public final String getDateStr() {
        return (String) this.dateStr.getValue();
    }

    public final int getHeight() {
        return this.bp.getSbp();
    }

    public final int getHour() {
        return ((Number) this.hour.getValue()).intValue();
    }

    public final int getLow() {
        return this.bp.getDbp();
    }

    public final int getMinute() {
        return ((Number) this.minute.getValue()).intValue();
    }

    public int hashCode() {
        return this.bp.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureWrap(bp=" + this.bp + ")";
    }
}
