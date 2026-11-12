package androidx.health.connect.client.impl.converters.time;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.proto.a2;
import java.time.Instant;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/health/connect/client/time/TimeRangeFilter;", "Landroidx/health/platform/client/proto/a2;", "toProto", "(Landroidx/health/connect/client/time/TimeRangeFilter;)Landroidx/health/platform/client/proto/a2;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nTimeRangeFilterConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeRangeFilterConverter.kt\nandroidx/health/connect/client/impl/converters/time/TimeRangeFilterConverterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class TimeRangeFilterConverterKt {
    @NotNull
    public static final a2 toProto(@NotNull TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(timeRangeFilter, "<this>");
        a2.a aVarT = a2.T();
        Instant startTime = timeRangeFilter.getStartTime();
        if (startTime != null) {
            aVarT.B(startTime.toEpochMilli());
        }
        Instant endTime = timeRangeFilter.getEndTime();
        if (endTime != null) {
            aVarT.z(endTime.toEpochMilli());
        }
        LocalDateTime localStartTime = timeRangeFilter.getLocalStartTime();
        if (localStartTime != null) {
            aVarT.A(localStartTime.toString());
        }
        LocalDateTime localEndTime = timeRangeFilter.getLocalEndTime();
        if (localEndTime != null) {
            aVarT.y(localEndTime.toString());
        }
        a2 a2VarBuild = aVarT.build();
        Intrinsics.checkNotNullExpressionValue(a2VarBuild, "newBuilder()\n        .ap…       }\n        .build()");
        return a2VarBuild;
    }
}
