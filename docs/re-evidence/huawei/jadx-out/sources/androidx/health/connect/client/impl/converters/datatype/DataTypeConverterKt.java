package androidx.health.connect.client.impl.converters.datatype;

import androidx.health.connect.client.records.Record;
import androidx.health.platform.client.proto.DataProto;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u001a\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002*\u00020\u0001\u001a\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002*\u00020\u0005¨\u0006\u0007"}, d2 = {"toDataTypeName", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "toDataType", "Landroidx/health/platform/client/proto/DataProto$DataType;", "toDataTypeKClass", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DataTypeConverterKt {
    public static final String toDataTypeName(KClass<? extends Record> kClass) {
        zcp.c(kClass, "");
        String str = RecordsTypeNameMapKt.getRECORDS_CLASS_NAME_MAP().get(kClass);
        if (str != null) {
            return str;
        }
        throw new UnsupportedOperationException("Not supported yet: " + kClass);
    }

    public static final DataProto.DataType toDataType(KClass<? extends Record> kClass) {
        zcp.c(kClass, "");
        DataProto.DataType dataTypeBuild = DataProto.DataType.newBuilder().setName(toDataTypeName(kClass)).build();
        zcp.b((Object) dataTypeBuild, "");
        return dataTypeBuild;
    }

    public static final KClass<? extends Record> toDataTypeKClass(String str) {
        zcp.c(str, "");
        KClass<? extends Record> kClass = RecordsTypeNameMapKt.getRECORDS_TYPE_NAME_MAP().get(str);
        if (kClass != null) {
            return kClass;
        }
        throw new UnsupportedOperationException("Not supported yet: " + str);
    }

    public static final KClass<? extends Record> toDataTypeKClass(DataProto.DataType dataType) {
        zcp.c(dataType, "");
        String name = dataType.getName();
        zcp.b((Object) name, "");
        return toDataTypeKClass(name);
    }
}
