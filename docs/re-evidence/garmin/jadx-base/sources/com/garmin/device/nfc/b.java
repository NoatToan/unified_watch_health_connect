package com.garmin.device.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class b implements Parcelable, Cloneable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f50847l = LoggerFactory.getLogger("PAY#NFC#DeviceWalletState");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f50848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f50849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f50850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f50851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f50852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f50853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f50854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f50855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f50856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f50857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f50858k;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX INFO: renamed from: com.garmin.device.nfc.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C1030b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50859a;

        static {
            int[] iArr = new int[h.c.values().length];
            f50859a = iArr;
            try {
                iArr[h.c.TAG_CARD_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50859a[h.c.TAG_ISSUER_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50859a[h.c.TAG_DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50859a[h.c.TAG_PAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50859a[h.c.TAG_EXP_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50859a[h.c.TAG_EXP_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50859a[h.c.TAG_TOP_OF_WALLET_APDU.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50859a[h.c.TAG_CARD_IMAGE_HASH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50859a[h.c.TAG_CREDIT_CARD_HASH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50859a[h.c.TAG_CREDIT_CARD_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50859a[h.c.TAG_CARD_ACTIVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(Parcel parcel) {
        int i14 = parcel.readInt();
        if (i14 != 0) {
            byte[] bArr = new byte[i14];
            this.f50848a = bArr;
            parcel.readByteArray(bArr);
        }
        int i15 = parcel.readInt();
        if (i15 != 0) {
            byte[] bArr2 = new byte[i15];
            this.f50849b = bArr2;
            parcel.readByteArray(bArr2);
        }
        int i16 = parcel.readInt();
        if (i16 != 0) {
            byte[] bArr3 = new byte[i16];
            this.f50850c = bArr3;
            parcel.readByteArray(bArr3);
        }
        int i17 = parcel.readInt();
        if (i17 != 0) {
            byte[] bArr4 = new byte[i17];
            this.f50851d = bArr4;
            parcel.readByteArray(bArr4);
        }
        int i18 = parcel.readInt();
        if (i18 != 0) {
            byte[] bArr5 = new byte[i18];
            this.f50852e = bArr5;
            parcel.readByteArray(bArr5);
        }
        int i19 = parcel.readInt();
        if (i19 != 0) {
            byte[] bArr6 = new byte[i19];
            this.f50853f = bArr6;
            parcel.readByteArray(bArr6);
        }
        int i24 = parcel.readInt();
        if (i24 != 0) {
            byte[] bArr7 = new byte[i24];
            this.f50854g = bArr7;
            parcel.readByteArray(bArr7);
        }
        int i25 = parcel.readInt();
        if (i25 != 0) {
            byte[] bArr8 = new byte[i25];
            this.f50855h = bArr8;
            parcel.readByteArray(bArr8);
        }
        int i26 = parcel.readInt();
        if (i26 != 0) {
            byte[] bArr9 = new byte[i26];
            this.f50856i = bArr9;
            parcel.readByteArray(bArr9);
        }
        int i27 = parcel.readInt();
        if (i27 != 0) {
            byte[] bArr10 = new byte[i27];
            this.f50857j = bArr10;
            parcel.readByteArray(bArr10);
        }
        int i28 = parcel.readInt();
        if (i28 != 0) {
            byte[] bArr11 = new byte[i28];
            this.f50858k = bArr11;
            parcel.readByteArray(bArr11);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        b bVar = (b) super.clone();
        byte[] bArr = this.f50848a;
        if (bArr != null) {
            bVar.getClass();
            bVar.f50848a = Arrays.copyOf(bArr, bArr.length);
        } else {
            bVar.f50848a = null;
        }
        byte[] bArr2 = this.f50849b;
        if (bArr2 != null) {
            bVar.f50849b = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bVar.f50849b = null;
        }
        byte[] bArr3 = this.f50850c;
        if (bArr3 != null) {
            bVar.f50850c = Arrays.copyOf(bArr3, bArr3.length);
        } else {
            bVar.f50850c = null;
        }
        byte[] bArr4 = this.f50851d;
        if (bArr4 != null) {
            bVar.f50851d = Arrays.copyOf(bArr4, bArr4.length);
        } else {
            bVar.f50851d = null;
        }
        byte[] bArr5 = this.f50852e;
        if (bArr5 != null) {
            bVar.f50852e = Arrays.copyOf(bArr5, bArr5.length);
        } else {
            bVar.f50852e = null;
        }
        byte[] bArr6 = this.f50853f;
        if (bArr6 != null) {
            bVar.f50853f = Arrays.copyOf(bArr6, bArr6.length);
        } else {
            bVar.f50853f = null;
        }
        byte[] bArr7 = this.f50854g;
        if (bArr7 != null) {
            bVar.f50854g = Arrays.copyOf(bArr7, bArr7.length);
        } else {
            bVar.f50854g = null;
        }
        byte[] bArr8 = this.f50855h;
        if (bArr8 != null) {
            bVar.f50855h = Arrays.copyOf(bArr8, bArr8.length);
        } else {
            bVar.f50855h = null;
        }
        byte[] bArr9 = this.f50856i;
        if (bArr9 != null) {
            bVar.f50856i = Arrays.copyOf(bArr9, bArr9.length);
        } else {
            bVar.f50856i = null;
        }
        byte[] bArr10 = this.f50857j;
        if (bArr10 != null) {
            bVar.f50857j = Arrays.copyOf(bArr10, bArr10.length);
        } else {
            bVar.f50857j = null;
        }
        byte[] bArr11 = this.f50858k;
        if (bArr11 != null) {
            bVar.f50858k = Arrays.copyOf(bArr11, bArr11.length);
            return bVar;
        }
        bVar.f50858k = null;
        return bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        byte[] bArr = this.f50848a;
        if (bArr == null || bArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f50848a);
        }
        byte[] bArr2 = this.f50849b;
        if (bArr2 == null || bArr2.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr2.length);
            parcel.writeByteArray(this.f50849b);
        }
        byte[] bArr3 = this.f50850c;
        if (bArr3 == null || bArr3.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f50850c);
        }
        byte[] bArr4 = this.f50851d;
        if (bArr4 == null || bArr4.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr4.length);
            parcel.writeByteArray(this.f50851d);
        }
        byte[] bArr5 = this.f50852e;
        if (bArr5 == null || bArr5.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr5.length);
            parcel.writeByteArray(this.f50852e);
        }
        byte[] bArr6 = this.f50853f;
        if (bArr6 == null || bArr6.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr6.length);
            parcel.writeByteArray(this.f50853f);
        }
        byte[] bArr7 = this.f50854g;
        if (bArr7 == null || bArr7.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr7.length);
            parcel.writeByteArray(this.f50854g);
        }
        byte[] bArr8 = this.f50855h;
        if (bArr8 == null || bArr8.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr8.length);
            parcel.writeByteArray(this.f50855h);
        }
        byte[] bArr9 = this.f50856i;
        if (bArr9 == null || bArr9.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr9.length);
            parcel.writeByteArray(this.f50856i);
        }
        byte[] bArr10 = this.f50857j;
        if (bArr10 == null || bArr10.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr10.length);
            parcel.writeByteArray(this.f50857j);
        }
        byte[] bArr11 = this.f50858k;
        if (bArr11 == null || bArr11.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr11.length);
            parcel.writeByteArray(this.f50858k);
        }
    }

    public b() {
    }
}
