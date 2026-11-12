package xm2;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f191516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f191517b;

    public b(byte[] bArr) {
        if (bArr == null) {
            vb.h.s("buffer is null");
            throw null;
        }
        if (1 > bArr.length) {
            org.apache.commons.lang3.e.v(MapboxMap.QFE_OFFSET);
            throw null;
        }
        short s8 = (short) ((bArr[0] & UnsignedBytes.MAX_VALUE) + ((bArr[1] & Ascii.US) << 8));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = jCurrentTimeMillis - (jCurrentTimeMillis % 1000);
        this.f191517b = (byte) ((((byte) ((bArr[1] & 224) >> 5)) + 1) * 2);
        ArrayList arrayList = new ArrayList();
        this.f191516a = arrayList;
        byte b14 = (byte) (((byte) ((bArr[15] & 240) >> 4)) * Ascii.EM);
        arrayList.add(new a(b(2, bArr), a(3, bArr), b(5, bArr), (short) (s8 - ((1000 / b14) * 2)), j8));
        arrayList.add(new a(a(6, bArr), b(8, bArr), a(9, bArr), (short) (s8 - (1000 / b14)), j8));
        arrayList.add(new a(b(11, bArr), a(12, bArr), b(14, bArr), s8, j8));
    }

    public final int a(int i14, byte[] bArr) {
        int i15;
        if (i14 >= 0 && (i15 = i14 + 1) <= bArr.length) {
            return (short) (((short) ((((short) (((bArr[i14] & 240) >> 4) + (bArr[i15] << 4))) & 4095) << 4)) / (16 / (this.f191517b / 2)));
        }
        org.apache.commons.lang3.e.v(MapboxMap.QFE_OFFSET);
        return 0;
    }

    public final int b(int i14, byte[] bArr) {
        int i15;
        if (i14 >= 0 && (i15 = i14 + 1) <= bArr.length) {
            return (short) (((short) ((((short) ((bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i15] & Ascii.SI) << 8))) & 4095) << 4)) / (16 / (this.f191517b / 2)));
        }
        org.apache.commons.lang3.e.v("offset is out of bounds");
        return 0;
    }

    public final String toString() {
        return "RealTimeAccelerometer{mAccelerometerSamples=" + this.f191516a + CoreConstants.CURLY_RIGHT;
    }
}
