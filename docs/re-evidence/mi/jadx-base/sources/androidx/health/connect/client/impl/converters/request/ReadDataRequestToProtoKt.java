package androidx.health.connect.client.impl.converters.request;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.impl.converters.datatype.DataTypeIdPairConverterKt;
import androidx.health.connect.client.records.Record;
import androidx.health.platform.client.proto.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "dataTypeKC", "", "uid", "Landroidx/health/platform/client/proto/g1;", "toReadDataRequestProto", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/health/platform/client/proto/g1;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ReadDataRequestToProtoKt {
    @NotNull
    public static final g1 toReadDataRequestProto(@NotNull KClass<? extends Record> dataTypeKC, @NotNull String uid) {
        Intrinsics.checkNotNullParameter(dataTypeKC, "dataTypeKC");
        Intrinsics.checkNotNullParameter(uid, "uid");
        g1 g1VarBuild = g1.Q().y(DataTypeIdPairConverterKt.toDataTypeIdPairProto(dataTypeKC, uid)).build();
        Intrinsics.checkNotNullExpressionValue(g1VarBuild, "newBuilder()\n        .se…C, uid))\n        .build()");
        return g1VarBuild;
    }
}
