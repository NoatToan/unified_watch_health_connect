package com.huami.bluetooth.profile.channel.module.phone;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "status", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "parsePairStatus", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class PairStatusKt {
    @NotNull
    public static final PairStatus parsePairStatus(int i) {
        if (i == 0) {
            return new UnPair();
        }
        if (i == 1) {
            return new Paired();
        }
        if (i == 2) {
            return new Pairing();
        }
        if (i != 3) {
            return i != 4 ? new PairFail() : new PairDisConnected();
        }
        return new PairFail();
    }
}
