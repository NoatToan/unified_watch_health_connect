package com.huami.wallet.accessdoor.helper;

import com.huami.nfc.door.DoorCardInfo;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huami/nfc/door/DoorCardInfo;", "", "isMiDoorCard", "", "MI_HOME_AID", "Ljava/lang/String;", "APPLY_CHANNEL_MI", "access-door_release"}, k = 2, mv = {1, 5, 1})
public final class DoorCardExtensionKt {

    @NotNull
    public static final String APPLY_CHANNEL_MI = "MI";

    @NotNull
    public static final String MI_HOME_AID = "A0000000006D696B65796361";

    public static final boolean isMiDoorCard(@NotNull DoorCardInfo doorCardInfo) {
        if (!Intrinsics.areEqual(APPLY_CHANNEL_MI, doorCardInfo.getApplyChannel())) {
            String aid = doorCardInfo.getAid();
            Objects.requireNonNull(aid, "null cannot be cast to non-null type java.lang.String");
            if (!m.startsWith$default(aid.toUpperCase(), MI_HOME_AID, false, 2, null)) {
                return false;
            }
        }
        return true;
    }
}
