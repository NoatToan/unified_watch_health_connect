package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f6392a = versionedParcel.j(iconCompat.f6392a, 1);
        byte[] bArrF = iconCompat.f6394c;
        if (versionedParcel.h(2)) {
            bArrF = versionedParcel.f();
        }
        iconCompat.f6394c = bArrF;
        Parcelable parcelableK = iconCompat.f6395d;
        if (versionedParcel.h(3)) {
            parcelableK = versionedParcel.k();
        }
        iconCompat.f6395d = parcelableK;
        iconCompat.f6396e = versionedParcel.j(iconCompat.f6396e, 4);
        iconCompat.f6397f = versionedParcel.j(iconCompat.f6397f, 5);
        Parcelable parcelableK2 = iconCompat.f6398g;
        if (versionedParcel.h(6)) {
            parcelableK2 = versionedParcel.k();
        }
        iconCompat.f6398g = (ColorStateList) parcelableK2;
        String strL = iconCompat.f6400i;
        if (versionedParcel.h(7)) {
            strL = versionedParcel.l();
        }
        iconCompat.f6400i = strL;
        String strL2 = iconCompat.f6401j;
        if (versionedParcel.h(8)) {
            strL2 = versionedParcel.l();
        }
        iconCompat.f6401j = strL2;
        iconCompat.f6399h = PorterDuff.Mode.valueOf(iconCompat.f6400i);
        switch (iconCompat.f6392a) {
            case -1:
                Parcelable parcelable = iconCompat.f6395d;
                if (parcelable != null) {
                    iconCompat.f6393b = parcelable;
                    return iconCompat;
                }
                h.s("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6395d;
                if (parcelable2 != null) {
                    iconCompat.f6393b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f6394c;
                iconCompat.f6393b = bArr;
                iconCompat.f6392a = 3;
                iconCompat.f6396e = 0;
                iconCompat.f6397f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6394c, Charset.forName("UTF-16"));
                iconCompat.f6393b = str;
                if (iconCompat.f6392a == 2 && iconCompat.f6401j == null) {
                    iconCompat.f6401j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6393b = iconCompat.f6394c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f6400i = iconCompat.f6399h.name();
        switch (iconCompat.f6392a) {
            case -1:
                iconCompat.f6395d = (Parcelable) iconCompat.f6393b;
                break;
            case 1:
            case 5:
                iconCompat.f6395d = (Parcelable) iconCompat.f6393b;
                break;
            case 2:
                iconCompat.f6394c = ((String) iconCompat.f6393b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6394c = (byte[]) iconCompat.f6393b;
                break;
            case 4:
            case 6:
                iconCompat.f6394c = iconCompat.f6393b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i14 = iconCompat.f6392a;
        if (-1 != i14) {
            versionedParcel.s(i14, 1);
        }
        byte[] bArr = iconCompat.f6394c;
        if (bArr != null) {
            versionedParcel.n(2);
            versionedParcel.p(bArr);
        }
        Parcelable parcelable = iconCompat.f6395d;
        if (parcelable != null) {
            versionedParcel.n(3);
            versionedParcel.t(parcelable);
        }
        int i15 = iconCompat.f6396e;
        if (i15 != 0) {
            versionedParcel.s(i15, 4);
        }
        int i16 = iconCompat.f6397f;
        if (i16 != 0) {
            versionedParcel.s(i16, 5);
        }
        ColorStateList colorStateList = iconCompat.f6398g;
        if (colorStateList != null) {
            versionedParcel.n(6);
            versionedParcel.t(colorStateList);
        }
        String str = iconCompat.f6400i;
        if (str != null) {
            versionedParcel.n(7);
            versionedParcel.u(str);
        }
        String str2 = iconCompat.f6401j;
        if (str2 != null) {
            versionedParcel.n(8);
            versionedParcel.u(str2);
        }
    }
}
