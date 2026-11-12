package androidx.health.connect.client.impl.converters.datatype;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.Record;
import androidx.health.platform.client.proto.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "dataTypeKC", "", "uid", "Landroidx/health/platform/client/proto/a1;", "toDataTypeIdPairProto", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/health/platform/client/proto/a1;", "", "uidsList", "toDataTypeIdPairProtoList", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/util/List;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DataTypeIdPairConverterKt {
    @NotNull
    public static final a1 toDataTypeIdPairProto(@NotNull KClass<? extends Record> dataTypeKC, @NotNull String uid) {
        Intrinsics.checkNotNullParameter(dataTypeKC, "dataTypeKC");
        Intrinsics.checkNotNullParameter(uid, "uid");
        a1 a1VarBuild = a1.R().y(DataTypeConverterKt.toDataType(dataTypeKC)).z(uid).build();
        Intrinsics.checkNotNullExpressionValue(a1VarBuild, "newBuilder().setDataType…ype()).setId(uid).build()");
        return a1VarBuild;
    }

    @NotNull
    public static final List<a1> toDataTypeIdPairProtoList(@NotNull KClass<? extends Record> dataTypeKC, @NotNull List<String> uidsList) {
        Intrinsics.checkNotNullParameter(dataTypeKC, "dataTypeKC");
        Intrinsics.checkNotNullParameter(uidsList, "uidsList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uidsList.iterator();
        while (it.hasNext()) {
            a1 a1VarBuild = a1.R().y(DataTypeConverterKt.toDataType(dataTypeKC)).z(it.next()).build();
            Intrinsics.checkNotNullExpressionValue(a1VarBuild, "newBuilder()\n           …\n                .build()");
            arrayList.add(a1VarBuild);
        }
        return arrayList;
    }
}
