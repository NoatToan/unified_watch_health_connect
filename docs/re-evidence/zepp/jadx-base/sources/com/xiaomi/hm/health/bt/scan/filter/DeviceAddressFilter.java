package com.xiaomi.hm.health.bt.scan.filter;

import com.facebook.appevents.integrity.IntegrityManager;
import com.xiaomi.hm.health.bt.scan.AdvData;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fB\u001d\b\u0016\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\r\"\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/scan/filter/DeviceAddressFilter;", "Lcom/xiaomi/hm/health/bt/scan/filter/DeviceFilter;", "Lcom/xiaomi/hm/health/bt/scan/AdvData;", "advData", "", "isMatch", "", "", "a", "Ljava/util/Collection;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "<init>", "(Ljava/util/Collection;)V", "", "([Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceAddressFilter implements DeviceFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Collection<String> address;

    public DeviceAddressFilter(@NotNull Collection<String> collection) {
        this.address = collection;
    }

    @Override // com.xiaomi.hm.health.bt.scan.filter.DeviceFilter
    public boolean isMatch(@NotNull AdvData advData) {
        Collection<String> collection = this.address;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual((String) it2.next(), advData.device.getAddress())) {
                return true;
            }
        }
        return false;
    }

    public DeviceAddressFilter(@NotNull String... strArr) {
        this(ArraysKt___ArraysJvmKt.asList(strArr));
    }
}
