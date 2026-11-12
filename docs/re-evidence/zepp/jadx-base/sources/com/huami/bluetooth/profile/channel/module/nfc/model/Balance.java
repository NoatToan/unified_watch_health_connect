package com.huami.bluetooth.profile.channel.module.nfc.model;

import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/model/Balance;", "", "", "a", "J", "getBalance", "()J", StatEvent.SPORT_TP_VALUE_BALANCE, "b", "getOverdraft", "overdraft", "", "aid", "<init>", "(JJLjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Balance {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long balance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long overdraft;

    public Balance(long j, long j2, @NotNull String str) {
        this.balance = j;
        this.overdraft = j2;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final long getOverdraft() {
        return this.overdraft;
    }
}
