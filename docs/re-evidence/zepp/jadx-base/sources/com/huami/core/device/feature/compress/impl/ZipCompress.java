package com.huami.core.device.feature.compress.impl;

import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.core.device.feature.compress.CompressApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J#\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 J#\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/core/device/feature/compress/impl/ZipCompress;", "Lcom/huami/core/device/feature/compress/CompressApi;", "", "bufSize", "", "initCompress", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "data", "", "isLast", "decompressExternal", "compressExternal", "inputFinish", "decompress", "compress", "a", "J", "<init>", "(I)V", "Companion", "compress_release"}, k = 1, mv = {1, 4, 1})
public final class ZipCompress implements CompressApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long address;

    static {
        System.loadLibrary("device-compress");
    }

    public ZipCompress() {
        this(0, 1, null);
    }

    public ZipCompress(int i) {
        this.address = initCompress(i);
    }

    private final native byte[] compressExternal(long address, byte[] data, boolean isLast);

    private final native byte[] decompressExternal(long address, byte[] data, boolean isLast);

    private final native long initCompress(int bufSize);

    @Override // com.huami.core.device.feature.compress.CompressApi
    @NotNull
    public byte[] compress(@NotNull byte[] data, boolean isLast) throws Exception {
        byte[] bArrCompressExternal = compressExternal(this.address, data, isLast);
        if (bArrCompressExternal != null) {
            return bArrCompressExternal;
        }
        throw new Exception("");
    }

    @Override // com.huami.core.device.feature.compress.CompressApi
    @NotNull
    public byte[] decompress(@NotNull byte[] data, boolean inputFinish) throws Exception {
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
