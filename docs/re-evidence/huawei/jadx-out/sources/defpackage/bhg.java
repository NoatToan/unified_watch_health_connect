package defpackage;

import android.os.Parcel;
import androidx.core.internal.view.SupportMenu;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes23.dex */
public final class bhg {
    static int b(int i) {
        return i & 65535;
    }

    static void b(Parcel parcel, int i) {
        int iA = a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        int i2 = iDataPosition + iA;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            parcel.setDataPosition(i2);
            return;
        }
        throw new c("error length:" + iDataPosition + Constants.LINK + iA);
    }

    static void e(Parcel parcel, int i) {
        if ((i & SupportMenu.CATEGORY_MASK) == -65536) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
        }
    }

    public static void e(Parcel parcel, int i, int i2) {
        int iA = a(parcel, i);
        if (iA == i2) {
            return;
        }
        throw new e("Expected size " + i2 + " got " + iA + " (0x" + Integer.toHexString(iA) + com.huawei.operation.utils.Constants.RIGHT_BRACKET_ONLY, parcel);
    }

    public static int a(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    static class c extends RuntimeException {
        c(String str) {
            super(str);
        }
    }

    static class e extends RuntimeException {
        e(String str, Parcel parcel) {
            super(str);
        }
    }

    static int c(Parcel parcel) {
        int i = parcel.readInt();
        int iA = a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (b(i) != 20293) {
            throw new e("Expected object header. Got 0x" + Integer.toHexString(i), parcel);
        }
        int i2 = iA + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new e("Size read is invalid start=" + iDataPosition + " end=" + i2, parcel);
    }
}
