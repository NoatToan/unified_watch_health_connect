package com.huami.bluetooth.profile.channel.module.base;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "F", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ResponseCodec<F, T> extends Codec<F, T> {
    @NotNull
    ModuleResult<F> decode(@NotNull ModuleResult<T> originResponse);
}
