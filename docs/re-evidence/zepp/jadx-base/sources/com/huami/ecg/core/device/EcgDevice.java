package com.huami.ecg.core.device;

import com.huami.ecg.sync.health.model.UserProfile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/huami/ecg/core/device/EcgDevice;", "", "", "source", "", "isECGMiliFamily", "isJHSSeries", "isBioID", "Lcom/huami/ecg/sync/health/model/UserProfile;", "userProfile", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgDevice {
    boolean isBioID();

    boolean isECGMiliFamily(int source);

    boolean isJHSSeries(int source);

    @NotNull
    UserProfile userProfile();
}
