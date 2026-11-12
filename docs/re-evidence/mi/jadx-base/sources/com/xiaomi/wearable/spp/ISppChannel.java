package com.xiaomi.wearable.spp;

import defpackage.j7o;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/wearable/spp/ISppChannel;", "", "", "data", "Lj7o;", "callBack", "", "sendData", "([BLj7o;)V", "onDataReceive", "([B)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public interface ISppChannel {
    void onDataReceive(@NotNull byte[] data);

    void sendData(@NotNull byte[] data, @NotNull j7o callBack);
}
