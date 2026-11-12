package com.huami.bluetooth.profile.channel.module.base;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"", "Lcom/huami/bluetooth/profile/channel/module/base/ToBytes;", "", "toBytes", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ToBytesKt {
    @NotNull
    public static final byte[] toBytes(@NotNull List<? extends ToBytes> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(((ToBytes) it2.next()).toBytes());
        }
        return byteArrayOutputStream.toByteArray();
    }
}
