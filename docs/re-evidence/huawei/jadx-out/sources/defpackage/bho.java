package defpackage;

import android.os.Parcel;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes23.dex */
public final class bho {
    public static int a(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void c(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt(i | (i2 << 16));
        } else {
            parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i2);
        }
    }

    public static void b(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
