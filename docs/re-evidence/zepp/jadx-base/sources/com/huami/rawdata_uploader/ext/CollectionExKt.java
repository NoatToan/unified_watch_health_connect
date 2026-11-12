package com.huami.rawdata_uploader.ext;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\n"}, d2 = {"", "", "", "listToByteArray", "", "offset", "len", "", "byteToLong", "byteToInt", "rawdata-uploader_release"}, k = 2, mv = {1, 5, 1})
public final class CollectionExKt {
    public static final int byteToInt(@NotNull byte[] bArr, int i, int i2) {
        return (int) byteToLong(bArr, i, i2);
    }

    public static final long byteToLong(@NotNull byte[] bArr, int i, int i2) {
        long j = 0;
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return j;
    }

    @NotNull
    public static final byte[] listToByteArray(@NotNull List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Byte b = list.get(i);
                if (b != null) {
                    bArr[i] = b.byteValue();
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return bArr;
    }
}
