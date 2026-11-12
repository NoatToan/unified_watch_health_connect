package com.huami.bluetooth.profile.channel.module.syncable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;", "K", "", "data", "", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "parser", "()Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface Serializer<K> {
    K parser();

    @NotNull
    String serialize(K data);
}
