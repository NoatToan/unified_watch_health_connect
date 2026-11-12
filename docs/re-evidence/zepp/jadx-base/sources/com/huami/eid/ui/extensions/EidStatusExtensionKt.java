package com.huami.eid.ui.extensions;

import com.huami.nfc.eid.entities.EidStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\"\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/nfc/eid/entities/EidStatus;", "", "installedInCurrentDevice", "installedInOtherDevice", "", "INSTALLED_NONE", "Ljava/lang/String;", "INSTALLED_CURRENT_DEVICE", "INSTALLED_OTHER_DEVICE", "INSTALLED_SIM_EID", "eid_release"}, k = 2, mv = {1, 5, 1})
public final class EidStatusExtensionKt {

    @NotNull
    public static final String INSTALLED_CURRENT_DEVICE = "1";

    @NotNull
    public static final String INSTALLED_NONE = "0";

    @NotNull
    public static final String INSTALLED_OTHER_DEVICE = "2";

    @NotNull
    public static final String INSTALLED_SIM_EID = "3";

    public static final boolean installedInCurrentDevice(@NotNull EidStatus eidStatus) {
        return Intrinsics.areEqual(eidStatus.getStatus(), "1") || Intrinsics.areEqual(eidStatus.getStatus(), "3");
    }

    public static final boolean installedInOtherDevice(@NotNull EidStatus eidStatus) {
        return Intrinsics.areEqual(eidStatus.getStatus(), "2");
    }
}
