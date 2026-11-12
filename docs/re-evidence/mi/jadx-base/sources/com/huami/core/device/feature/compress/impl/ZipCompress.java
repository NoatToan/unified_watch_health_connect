package com.huami.core.device.feature.compress.impl;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import defpackage.c5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J#\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/core/device/feature/compress/impl/ZipCompress;", "Lc5;", "", "bufSize", "", "initCompress", Home.JSON_KEY_ADDRESS, "", "data", "", "isLast", "decompressExternal", "inputFinish", PluginDeviceInfo.FMODEL, "J", "<init>", "(I)V", PluginDeviceInfo.FDESC, "compress_release"}, k = 1, mv = {1, 4, 1})
public final class ZipCompress implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long address;

    static {
        System.loadLibrary("device-compress");
    }

    public ZipCompress(int i) {
        this.address = initCompress(i);
    }

    private final native byte[] decompressExternal(long address, byte[] data, boolean isLast);

    private final native long initCompress(int bufSize);

    @Override // defpackage.c5
    @NotNull
    public byte[] a(@NotNull byte[] data, boolean inputFinish) throws Exception {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrDecompressExternal = decompressExternal(this.address, data, inputFinish);
        if (bArrDecompressExternal != null) {
            return bArrDecompressExternal;
        }
        throw new Exception("解压数据异常");
    }

    public /* synthetic */ ZipCompress(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 4096 : i);
    }
}
