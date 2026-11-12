package bb;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class e0 {
    private e0() {
    }

    public static ArrayList a(byte[] bArr) {
        long j8 = (((long) (((bArr[11] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[10] & UnsignedBytes.MAX_VALUE))) * C.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j8).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long b(byte b14, byte b15) {
        int i14;
        int i15;
        int i16 = b14 & UnsignedBytes.MAX_VALUE;
        int i17 = b14 & 3;
        if (i17 != 0) {
            i14 = 2;
            if (i17 != 1 && i17 != 2) {
                i14 = b15 & 63;
            }
        } else {
            i14 = 1;
        }
        int i18 = i16 >> 3;
        int i19 = i18 & 3;
        if (i18 >= 16) {
            i15 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i19;
        } else if (i18 >= 12) {
            i15 = 10000 << (i18 & 1);
        } else {
            i15 = i19 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i19;
        }
        return ((long) i14) * ((long) i15);
    }
}
