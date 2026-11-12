package p0;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import com.google.common.primitives.UnsignedBytes;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeJpegImageQuirk f134644a = (LargeJpegImageQuirk) o0.a.f128480a.b(LargeJpegImageQuirk.class);

    /* JADX WARN: Code duplicated, block: B:35:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    public final int a(byte[] bArr) {
        int i14;
        byte b14;
        if (this.f134644a == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f5920a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.f() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i15 = 2;
        while (i15 + 4 <= bArr.length && (b14 = bArr[i15]) == -1) {
            int i16 = i15 + 2;
            int i17 = ((bArr[i16] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i15 + 3] & UnsignedBytes.MAX_VALUE);
            if (b14 == -1 && bArr[i15 + 1] == -38) {
                while (true) {
                    i14 = i16 + 2;
                    if (i14 > bArr.length) {
                        break;
                    }
                    if (bArr[i16] != -1 || bArr[i16 + 1] != -39) {
                        i16++;
                    }
                    if (i14 != -1) {
                        return i14;
                    }
                    return bArr.length;
                }
            }
            i15 += i17 + 2;
        }
        i14 = -1;
        if (i14 != -1) {
            return i14;
        }
        return bArr.length;
    }
}
