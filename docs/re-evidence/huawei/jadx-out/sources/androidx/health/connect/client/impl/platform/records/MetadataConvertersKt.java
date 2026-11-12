package androidx.health.connect.client.impl.platform.records;

import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import defpackage.zcp;
import java.time.Instant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00060\u0006j\u0002`\u0007H\u0000\u001a\u0010\u0010\b\u001a\u00020\t*\u00060\nj\u0002`\u000bH\u0000\u001a\u0010\u0010\f\u001a\u00060\u0002j\u0002`\u0003*\u00020\u0001H\u0000\u001a\u0010\u0010\r\u001a\u00060\nj\u0002`\u000b*\u00020\tH\u0000\u001a\u0010\u0010\u000e\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0005H\u0000¨\u0006\u000f"}, d2 = {"toSdkMetadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "Landroid/health/connect/datatypes/Metadata;", "Landroidx/health/connect/client/impl/platform/records/PlatformMetadata;", "toSdkDevice", "Landroidx/health/connect/client/records/metadata/Device;", "Landroid/health/connect/datatypes/Device;", "Landroidx/health/connect/client/impl/platform/records/PlatformDevice;", "toSdkDataOrigin", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "Landroid/health/connect/datatypes/DataOrigin;", "Landroidx/health/connect/client/impl/platform/records/PlatformDataOrigin;", "toPlatformMetadata", "toPlatformDataOrigin", "toPlatformDevice", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetadataConvertersKt {
    public static final androidx.health.connect.client.records.metadata.Metadata toSdkMetadata(android.health.connect.datatypes.Metadata metadata) {
        zcp.c(metadata, "");
        String id = metadata.getId();
        zcp.b((Object) id, "");
        DataOrigin dataOrigin = metadata.getDataOrigin();
        zcp.b((Object) dataOrigin, "");
        androidx.health.connect.client.records.metadata.DataOrigin sdkDataOrigin = toSdkDataOrigin(dataOrigin);
        Instant lastModifiedTime = metadata.getLastModifiedTime();
        zcp.b((Object) lastModifiedTime, "");
        String clientRecordId = metadata.getClientRecordId();
        long clientRecordVersion = metadata.getClientRecordVersion();
        int sdkRecordingMethod = IntDefMappingsKt.toSdkRecordingMethod(metadata.getRecordingMethod());
        Device device = metadata.getDevice();
        zcp.b((Object) device, "");
        return new androidx.health.connect.client.records.metadata.Metadata(sdkRecordingMethod, id, sdkDataOrigin, lastModifiedTime, clientRecordId, clientRecordVersion, toSdkDevice(device));
    }

    public static final androidx.health.connect.client.records.metadata.Device toSdkDevice(Device device) {
        zcp.c(device, "");
        if (zcp.b(device, RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m130m().build())) {
            return null;
        }
        return new androidx.health.connect.client.records.metadata.Device(IntDefMappingsKt.toSdkDevice(device.getType()), device.getManufacturer(), device.getModel());
    }

    public static final androidx.health.connect.client.records.metadata.DataOrigin toSdkDataOrigin(DataOrigin dataOrigin) {
        zcp.c(dataOrigin, "");
        String packageName = dataOrigin.getPackageName();
        zcp.b((Object) packageName, "");
        return new androidx.health.connect.client.records.metadata.DataOrigin(packageName);
    }

    public static final android.health.connect.datatypes.Metadata toPlatformMetadata(androidx.health.connect.client.records.metadata.Metadata metadata) {
        Device platformDevice;
        zcp.c(metadata, "");
        android.health.connect.datatypes.Metadata.Builder builderM135m = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m135m();
        androidx.health.connect.client.records.metadata.Device device = metadata.getDevice();
        if (device != null && (platformDevice = toPlatformDevice(device)) != null) {
            builderM135m.setDevice(platformDevice);
        }
        builderM135m.setLastModifiedTime(metadata.getLastModifiedTime());
        builderM135m.setId(metadata.getId());
        builderM135m.setDataOrigin(toPlatformDataOrigin(metadata.getDataOrigin()));
        builderM135m.setClientRecordId(metadata.getClientRecordId());
        builderM135m.setClientRecordVersion(metadata.getClientRecordVersion());
        builderM135m.setRecordingMethod(IntDefMappingsKt.toPlatformRecordingMethod(metadata.getRecordingMethod()));
        android.health.connect.datatypes.Metadata metadataBuild = builderM135m.build();
        zcp.b((Object) metadataBuild, "");
        return metadataBuild;
    }

    public static final DataOrigin toPlatformDataOrigin(androidx.health.connect.client.records.metadata.DataOrigin dataOrigin) {
        zcp.c(dataOrigin, "");
        DataOrigin.Builder builderM128m = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m128m();
        builderM128m.setPackageName(dataOrigin.getPackageName());
        DataOrigin dataOriginBuild = builderM128m.build();
        zcp.b((Object) dataOriginBuild, "");
        return dataOriginBuild;
    }

    public static final Device toPlatformDevice(androidx.health.connect.client.records.metadata.Device device) {
        zcp.c(device, "");
        Device.Builder builderM130m = RecordConvertersKt$$ExternalSyntheticApiModelOutline0.m130m();
        builderM130m.setType(device.getType());
        String manufacturer = device.getManufacturer();
        if (manufacturer != null) {
            builderM130m.setManufacturer(manufacturer);
        }
        String model = device.getModel();
        if (model != null) {
            builderM130m.setModel(model);
        }
        Device deviceBuild = builderM130m.build();
        zcp.b((Object) deviceBuild, "");
        return deviceBuild;
    }
}
