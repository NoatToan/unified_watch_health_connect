package com.xiaomi.fitness.sport_manager.receiver;

import defpackage.s7r;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/PacketReceiver;", "", "", "type", "Ls7r;", "packet", "", "onReceive", "(ILs7r;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface PacketReceiver {
    void onReceive(int type, @Nullable s7r packet);
}
