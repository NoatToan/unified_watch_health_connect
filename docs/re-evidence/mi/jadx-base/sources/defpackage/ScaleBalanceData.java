package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ar, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\f\u0015B;\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lar;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lar$b;", "status", "Lar$b;", PluginDeviceInfo.FMODEL, "()Lar$b;", "", "timestamp", "score", "duration", BroadcastsKt.SILENT_PUSHING_PROGRESS, "<init>", "(Lar$b;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ScaleBalanceData {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final b status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Integer score;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Integer duration;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Integer progress;

    /* JADX INFO: renamed from: ar$a */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lar$a;", "", "", "bytes", "La1;", "Lar;", PluginDeviceInfo.FMODEL, "", "SUCCESS", "I", "TIME_STAMP_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a1<ScaleBalanceData> a(@NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            try {
                Result.Companion companion = Result.Companion;
                byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bytes, new IntRange(2, bytes.length - 1));
                w2 w2Var = new w2(null, 0, 3, null);
                w2Var.a(bArrSliceArray);
                int iC = w2Var.c();
                if (iC != 0) {
                    return a1.f504a.a("Error", iC);
                }
                b bVarA = b.u.a(w2Var.c());
                b bVar = b.STATUS_MEASURING;
                return a1.f504a.a(new ScaleBalanceData(bVarA, (bVarA == bVar || bVarA == b.STATUS_MEASURE_FINISH) ? w2Var.d(4) : -1L, bVarA == b.STATUS_MEASURE_FINISH ? Integer.valueOf(w2Var.c()) : null, bVarA == bVar ? Integer.valueOf(w2Var.c()) : null, bVarA == bVar ? Integer.valueOf(w2Var.c()) : null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
                    objM886constructorimpl = a1.a.a(a1.f504a, "Parse balance response error", 0, 2, null);
                }
                return (a1) objM886constructorimpl;
            }
        }
    }

    /* JADX INFO: renamed from: ar$b */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lar$b;", "", "", "value", "I", PluginDeviceInfo.FDESC, "()I", "<init>", "(Ljava/lang/String;II)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public enum b {
        STATUS_UNKNOWN(-1),
        STATUS_MEASURING(0),
        STATUS_MEASURE_FINISH(1),
        STATUS_MEASURE_EXIT(2);


        @NotNull
        public static final a u = new a(null);
        public final int t;

        /* JADX INFO: renamed from: ar$b$a */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lar$b$a;", "", "", "value", "Lar$b;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final b a(int value) {
                for (b bVar : b.values()) {
                    if (bVar.getT() == value) {
                        if (bVar == null) {
                            return b.STATUS_UNKNOWN;
                        }
                        return bVar;
                    }
                }
                bVar = null;
                if (bVar == null) {
                    return b.STATUS_UNKNOWN;
                }
                return bVar;
            }
        }

        b(int i) {
            this.t = i;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getT() {
            return this.t;
        }
    }

    public ScaleBalanceData(@NotNull b status, long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.timestamp = j;
        this.score = num;
        this.duration = num2;
        this.progress = num3;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleBalanceData)) {
            return false;
        }
        ScaleBalanceData scaleBalanceData = (ScaleBalanceData) other;
        return this.status == scaleBalanceData.status && this.timestamp == scaleBalanceData.timestamp && Intrinsics.areEqual(this.score, scaleBalanceData.score) && Intrinsics.areEqual(this.duration, scaleBalanceData.duration) && Intrinsics.areEqual(this.progress, scaleBalanceData.progress);
    }

    public int hashCode() {
        int iHashCode = ((this.status.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31;
        Integer num = this.score;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.duration;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.progress;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScaleBalanceData(status=" + this.status + ", timestamp=" + this.timestamp + ", score=" + this.score + ", duration=" + this.duration + ", progress=" + this.progress + ')';
    }
}
