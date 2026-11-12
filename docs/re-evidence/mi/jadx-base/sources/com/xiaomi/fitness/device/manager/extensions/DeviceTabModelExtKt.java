package com.xiaomi.fitness.device.manager.extensions;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"buildHuamiV4FeatureIds", "", "", "cardType", "buildBleV4FeatureIds", "buildWearOSV4FeatureIds", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceTabModelExtKt {
    @NotNull
    public static final List<Integer> buildBleV4FeatureIds(int i) {
        if (i == 18) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{142, 172, 147});
        }
        switch (i) {
            case 6:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{110, 111});
            case 7:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{113, 114, 115, 116, 182, 181, 117, 165, 118, 171, 162, 173, 179, 212, 217});
            case 8:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{154, 103, 213, 216, 201, 120, 121, 161, 204, 205, 122, 123, 124, 164, 126, 125});
            case 9:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{112, 210, 169, 155, 127, 128, 129, 153, 130, 131, 132, 156, 166, 134});
            case 10:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{157, 138, 139});
            case 11:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{144, 152, 145, 143, 211, 8});
            case 12:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{158, 159, 160, 170});
            default:
                return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final List<Integer> buildHuamiV4FeatureIds(int i) {
        if (i == 18) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{142, 147});
        }
        switch (i) {
            case 6:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{110, 111});
            case 7:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{113, 114, 115, 116, 117, 165, 118});
            case 8:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{154, 103, 120, 121, 161, 122, 124, 126, 125});
            case 9:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{112, 127, 128, 130, 131, 132, 133, 137, 134, 135, 136});
            case 10:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{138, 139, 140, 141});
            case 11:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{144, 152, 143, 145, 8});
            default:
                return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final List<Integer> buildWearOSV4FeatureIds(int i) {
        if (i == 18) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{208, 147});
        }
        if (i == 19) {
            return CollectionsKt__CollectionsJVMKt.listOf(180);
        }
        switch (i) {
            case 6:
                return CollectionsKt__CollectionsJVMKt.listOf(110);
            case 7:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{113, 114, 115, 116, 117, 165, 162, 171});
            case 8:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{154, 103, 206, 120, 121, 161, 122, 123, 124, 164, 126, 178});
            case 9:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{149, 155, 127, 128, 129, 130, 177, 131, 156, 166, 134, 214, 218, 215});
            case 10:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{157, 138, 139});
            case 11:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{144, 207, 152, 145, 8});
            case 12:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{175, 176, 160});
            default:
                return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
