package androidx.health.connect.client.impl.converters.permission;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.impl.converters.datatype.DataTypeConverterKt;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.Record;
import androidx.health.platform.client.proto.PermissionProto$AccessType;
import androidx.health.platform.client.proto.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0007*\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "accessType", "Landroidx/health/platform/client/proto/PermissionProto$AccessType;", "toAccessTypeProto", "(I)Landroidx/health/platform/client/proto/PermissionProto$AccessType;", "toAccessType", "(Landroidx/health/platform/client/proto/PermissionProto$AccessType;)I", "Landroidx/health/connect/client/permission/HealthPermission;", "Landroidx/health/platform/client/proto/u0;", "toProtoPermission", "(Landroidx/health/connect/client/permission/HealthPermission;)Landroidx/health/platform/client/proto/u0;", "toJetpackPermission", "(Landroidx/health/platform/client/proto/u0;)Landroidx/health/connect/client/permission/HealthPermission;", "connect-client_release"}, k = 2, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class PermissionConverterKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionProto$AccessType.values().length];
            try {
                iArr[PermissionProto$AccessType.ACCESS_TYPE_WRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionProto$AccessType.ACCESS_TYPE_READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final int toAccessType(PermissionProto$AccessType permissionProto$AccessType) {
        int i = WhenMappings.$EnumSwitchMapping$0[permissionProto$AccessType.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalStateException("Unknown access type");
    }

    private static final PermissionProto$AccessType toAccessTypeProto(int i) {
        if (i != 1) {
            return i != 2 ? PermissionProto$AccessType.ACCESS_TYPE_UNKNOWN : PermissionProto$AccessType.ACCESS_TYPE_WRITE;
        }
        return PermissionProto$AccessType.ACCESS_TYPE_READ;
    }

    @NotNull
    public static final HealthPermission toJetpackPermission(@NotNull u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        String strR = u0Var.T().R();
        Intrinsics.checkNotNullExpressionValue(strR, "dataType.name");
        KClass<? extends Record> dataTypeKClass = DataTypeConverterKt.toDataTypeKClass(strR);
        PermissionProto$AccessType accessType = u0Var.S();
        Intrinsics.checkNotNullExpressionValue(accessType, "accessType");
        return new HealthPermission(dataTypeKClass, toAccessType(accessType));
    }

    @NotNull
    public static final u0 toProtoPermission(@NotNull HealthPermission healthPermission) {
        Intrinsics.checkNotNullParameter(healthPermission, "<this>");
        u0 u0VarBuild = u0.V().z(DataTypeConverterKt.toDataType(healthPermission.getRecordType$connect_client_release())).y(toAccessTypeProto(healthPermission.getAccessType())).build();
        Intrinsics.checkNotNullExpressionValue(u0VarBuild, "newBuilder()\n        .se…ssType))\n        .build()");
        return u0VarBuild;
    }
}
