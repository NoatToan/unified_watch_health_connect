package androidx.health.connect.client.impl.converters.datatype;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.Record;
import androidx.health.platform.client.proto.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u0005¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "", "toDataTypeName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "Landroidx/health/platform/client/proto/q;", "toDataType", "(Lkotlin/reflect/KClass;)Landroidx/health/platform/client/proto/q;", "toDataTypeKClass", "(Ljava/lang/String;)Lkotlin/reflect/KClass;", "(Landroidx/health/platform/client/proto/q;)Lkotlin/reflect/KClass;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DataTypeConverterKt {
    @NotNull
    public static final q toDataType(@NotNull KClass<? extends Record> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        q qVarBuild = q.S().y(toDataTypeName(kClass)).build();
        Intrinsics.checkNotNullExpressionValue(qVarBuild, "newBuilder().setName(toDataTypeName()).build()");
        return qVarBuild;
    }

    @NotNull
    public static final KClass<? extends Record> toDataTypeKClass(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        KClass<? extends Record> kClass = RecordsTypeNameMapKt.getRECORDS_TYPE_NAME_MAP().get(str);
        if (kClass != null) {
            return kClass;
        }
        throw new UnsupportedOperationException("Not supported yet: " + str);
    }

    @NotNull
    public static final String toDataTypeName(@NotNull KClass<? extends Record> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String str = RecordsTypeNameMapKt.getRECORDS_CLASS_NAME_MAP().get(kClass);
        if (str != null) {
            return str;
        }
        throw new UnsupportedOperationException("Not supported yet: " + kClass);
    }

    @NotNull
    public static final KClass<? extends Record> toDataTypeKClass(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String name = qVar.R();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return toDataTypeKClass(name);
    }
}
