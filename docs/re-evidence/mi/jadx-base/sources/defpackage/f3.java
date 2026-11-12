package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"", "path", "", PluginDeviceInfo.FMODEL, "", MediaStoreUtil.MediaInfo.SIZE, "Ljava/io/InputStream;", "inputStream", "", "data", "len", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class f3 {
    public static final long a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
        return a(bufferedInputStream, bufferedInputStream.available());
    }

    public static final long a(@NotNull String path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        return a(new BufferedInputStream(new FileInputStream(path)), i);
    }

    public static final long a(InputStream inputStream, int i) {
        CRC32 crc32 = new CRC32();
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        try {
            checkedInputStream.skip(i);
            CloseableKt.closeFinally(checkedInputStream, null);
            return crc32.getValue();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(checkedInputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ long a(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = bArr.length;
        }
        return a(bArr, i);
    }

    public static final long a(@NotNull byte[] data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        CRC32 crc32 = new CRC32();
        crc32.update(data, 0, i);
        return crc32.getValue();
    }
}
