package com.huami.bluetooth.profile.channel.module.base;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "F", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "encode", "(Ljava/lang/Object;)Ljava/lang/Object;", "decode", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface Codec<F, T> {
    F decode(T value);

    T encode(F value);
}
