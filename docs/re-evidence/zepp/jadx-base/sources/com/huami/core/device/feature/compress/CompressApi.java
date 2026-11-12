package com.huami.core.device.feature.compress;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/core/device/feature/compress/CompressApi;", "", "", "data", "", "inputFinish", "decompress", "isLast", "compress", "Companion", "compress_release"}, k = 1, mv = {1, 4, 1})
public interface CompressApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int DEFAULT_BUF_SIZE = 4096;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/core/device/feature/compress/CompressApi$Companion;", "", "", "DEFAULT_BUF_SIZE", LogUtil.I, "<init>", "()V", "compress_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public static final int DEFAULT_BUF_SIZE = 4096;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ byte[] compress$default(CompressApi compressApi, byte[] bArr, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: compress");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return compressApi.compress(bArr, z);
        }

        public static /* synthetic */ byte[] decompress$default(CompressApi compressApi, byte[] bArr, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decompress");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return compressApi.decompress(bArr, z);
        }
    }

    @NotNull
    byte[] compress(@NotNull byte[] data, boolean isLast);

    @NotNull
    byte[] decompress(@NotNull byte[] data, boolean inputFinish);
}
