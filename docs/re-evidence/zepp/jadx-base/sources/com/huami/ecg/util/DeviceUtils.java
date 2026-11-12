package com.huami.ecg.util;

import com.huami.ecg.core.EcgCore;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/ecg/util/DeviceUtils;", "", "", "source", "", "isECGMiliFamily", "isJHSSeries", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();

    private DeviceUtils() {
    }

    public final boolean isECGMiliFamily(int source) {
        return EcgCore.INSTANCE.getEcgDevice().isECGMiliFamily(source);
    }

    public final boolean isJHSSeries(int source) {
        return EcgCore.INSTANCE.getEcgDevice().isJHSSeries(source);
    }
}
