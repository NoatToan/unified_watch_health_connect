package d10;

import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends e {
    public f(boolean[] zArr) {
        super(ArrayUtils.add(zArr, 0, x(zArr, 0) != 0));
    }

    public static int x(boolean[] zArr, int i14) {
        boolean z14 = true;
        boolean z15 = true;
        while (i14 < zArr.length) {
            if (zArr[i14]) {
                z14 = false;
                if (!z15) {
                    break;
                }
                i14++;
            } else {
                z15 = false;
                if (!z14) {
                    break;
                }
                i14++;
            }
        }
        if (z15) {
            return 1;
        }
        return z14 ? -1 : 0;
    }

    public abstract void A(boolean[] zArr);

    @Override // d10.e
    public final void t(h.a aVar, int i14) {
        if (i14 == 0) {
            aVar.f57035a.setDefaultText(R.string.common_all);
        } else {
            z(aVar, i14 - 1);
        }
    }

    @Override // d10.e
    public final void u(boolean[] zArr, int i14) {
        boolean[] zArrCopyOfRange;
        if (i14 > 0) {
            zArr[0] = false;
            if (x(zArr, 1) < 0) {
                zArr[i14] = true;
            }
        } else {
            zArr[0] = true;
            Arrays.fill(zArr, 1, zArr.length, false);
        }
        if (x(zArr, 1) > 0) {
            zArrCopyOfRange = new boolean[zArr.length - 1];
            Arrays.fill(zArrCopyOfRange, false);
        } else {
            zArrCopyOfRange = Arrays.copyOfRange(zArr, 1, zArr.length);
        }
        A(zArrCopyOfRange);
    }

    public abstract void z(h.a aVar, int i14);
}
