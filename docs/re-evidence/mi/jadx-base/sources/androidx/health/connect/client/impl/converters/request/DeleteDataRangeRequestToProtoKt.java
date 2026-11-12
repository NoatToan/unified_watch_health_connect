package androidx.health.connect.client.impl.converters.request;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.impl.converters.datatype.DataTypeConverterKt;
import androidx.health.connect.client.impl.converters.time.TimeRangeFilterConverterKt;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.proto.b1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "dataTypeKC", "Landroidx/health/connect/client/time/TimeRangeFilter;", "timeRangeFilter", "Landroidx/health/platform/client/proto/b1;", "toDeleteDataRangeRequestProto", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;)Landroidx/health/platform/client/proto/b1;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DeleteDataRangeRequestToProtoKt {
    @NotNull
    public static final b1 toDeleteDataRangeRequestProto(@NotNull KClass<? extends Record> dataTypeKC, @NotNull TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(dataTypeKC, "dataTypeKC");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "timeRangeFilter");
        b1 b1VarBuild = b1.T().y(DataTypeConverterKt.toDataType(dataTypeKC)).z(TimeRangeFilterConverterKt.toProto(timeRangeFilter)).build();
        Intrinsics.checkNotNullExpressionValue(b1VarBuild, "newBuilder()\n        .ad…Proto())\n        .build()");
        return b1VarBuild;
    }
}
