package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"", "cmd", "Lbu;", PluginDeviceInfo.FMODEL, "Ljava/nio/ByteBuffer;", "buffer", "", "count", "", "Ldu;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class cu {
    @NotNull
    public static final StorageResult a(@Nullable byte[] bArr) {
        List<StorageType> listA;
        int iD = tet.d(bArr, 1, 1);
        t5t.d("StorageResult", "code=" + iD);
        au auVarA = au.u.a(iD);
        if (auVarA != au.SUCCESS) {
            return new StorageResult(auVarA, null, null, null, 14, null);
        }
        long jV = tet.v(bArr, 2, 4);
        int iD2 = tet.d(bArr, 6, 2);
        if (iD2 <= 0 || bArr == null) {
            listA = null;
        } else {
            ByteBuffer buffer = ByteBuffer.wrap(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 8, bArr.length));
            Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
            listA = a(buffer, iD2);
        }
        return new StorageResult(auVarA, Long.valueOf(jV), Integer.valueOf(iD2), listA);
    }

    @NotNull
    public static final List<StorageType> a(@NotNull ByteBuffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt___RangesKt.until(0, i).iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            String strQ = z2.q(buffer);
            long jU = z2.u(buffer);
            t5t.d("StorageResult", "key:" + strQ + "; size:" + jU);
            StorageType storageTypeA = StorageType.c.a(strQ);
            if (storageTypeA == null) {
                t5t.d("StorageResult", "StorageType is null!");
            } else if (jU < 0) {
                t5t.d("StorageResult", "size error!");
            } else {
                storageTypeA.a(jU);
                arrayList.add(storageTypeA);
            }
        }
        return arrayList;
    }
}
