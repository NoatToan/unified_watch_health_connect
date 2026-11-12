package defpackage;

import android.util.SparseIntArray;
import com.xiaomi.fitness.sync.model.EventRecurrence;

/* JADX INFO: loaded from: classes4.dex */
public class gw5 {
    public static j3i a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(EventRecurrence.TH, 2);
        return new j3i(c(), b(), sparseIntArray);
    }

    public static int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin < 16777216 ? iMin / 2 : (iMin / 4) * 3;
    }

    public static int c() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 3145728;
        }
        return iMin < 33554432 ? 6291456 : 12582912;
    }
}
