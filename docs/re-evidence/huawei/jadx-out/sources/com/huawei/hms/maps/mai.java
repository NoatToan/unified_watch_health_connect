package com.huawei.hms.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.maps.model.CoordinateLatLng;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mai {
    public static boolean a(IInterface iInterface, IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeStrongBinder(iInterface != null ? iInterface.asBinder() : null);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static float b(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readFloat();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static int c(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static LatLng d(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static LatLngBounds e(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static List f(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(LatLng.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static List g(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(PatternItem.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static String h(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static IBinder i(IBinder iBinder, String str, int i) {
        return a(iBinder, str, i, null, null, 0);
    }

    public static void j(IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static boolean a(IBinder iBinder, String str, int i) {
        return c(iBinder, str, i) != 0;
    }

    public static void b(List list, IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeTypedList(list);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static IBinder a(IBinder iBinder, String str, int i, IBinder iBinder2, Parcelable parcelable) {
        return a(iBinder, str, i, iBinder2, parcelable, 2);
    }

    public static IBinder a(IBinder iBinder, String str, int i, Parcelable parcelable) {
        return a(iBinder, str, i, null, parcelable, 3);
    }

    private static IBinder a(IBinder iBinder, String str, int i, IBinder iBinder2, Parcelable parcelable, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            if (i2 == 1 || i2 == 2) {
                parcelObtain.writeStrongBinder(iBinder2);
            }
            if (i2 == 2 || i2 == 3) {
                if (parcelable != null) {
                    parcelObtain.writeInt(1);
                    parcelable.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static IBinder a(IBinder iBinder, String str, int i, IBinder iBinder2) {
        return a(iBinder, str, i, iBinder2, null, 1);
    }

    public static Number a(IBinder iBinder, String str, int i, int i2, Parcelable... parcelableArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    parcelObtain.writeInt(1);
                    parcelable.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (i2 == 0) {
                return Integer.valueOf(parcelObtain2.readInt());
            }
            if (i2 == 1) {
                return Float.valueOf(parcelObtain2.readFloat());
            }
            if (i2 == 2) {
                return Double.valueOf(parcelObtain2.readDouble());
            }
            if (i2 == 3) {
                return Byte.valueOf(parcelObtain2.readByte());
            }
            Log.e("DelegateUtil", "read number from parcel error , with not support type." + i2);
            return null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static CoordinateLatLng[] a(CoordinateLatLng[] coordinateLatLngArr, IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeTypedArray(coordinateLatLngArr, 0);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (CoordinateLatLng[]) parcelObtain2.createTypedArray(CoordinateLatLng.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(boolean z, IBinder iBinder, String str, int i) {
        a(iBinder, str, i, Integer.valueOf(z ? 1 : 0));
    }

    public static boolean a(IBinder iBinder, String str, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeInt(z ? 1 : 0);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, Float... fArr) {
        a(iBinder, str, i, (Number[]) fArr);
    }

    public static void a(IBinder iBinder, String str, int i, Integer... numArr) {
        a(iBinder, str, i, (Number[]) numArr);
    }

    public static void a(List list, IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeTypedList(list);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(Map map, IBinder iBinder, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeMap(map);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, Number... numberArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            for (Number number : numberArr) {
                a(parcelObtain, number);
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, IBinder iBinder2, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            parcelObtain.writeStrongBinder(iBinder);
            iBinder2.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, IBinder... iBinderArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            for (IBinder iBinder2 : iBinderArr) {
                parcelObtain.writeStrongBinder(iBinder2);
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, Number number, Parcelable... parcelableArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    parcelObtain.writeInt(1);
                    parcelable.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
            }
            if (number != null) {
                a(parcelObtain, number);
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, Parcelable... parcelableArr) {
        a(iBinder, str, i, (Number) null, parcelableArr);
    }

    public static void a(String str, IBinder iBinder, String str2, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str2);
            parcelObtain.writeString(str);
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public static void a(IBinder iBinder, String str, int i, String... strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(str);
            for (String str2 : strArr) {
                parcelObtain.writeString(str2);
            }
            iBinder.transact(i, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    private static void a(Parcel parcel, Number number) {
        if (number instanceof Integer) {
            parcel.writeInt(number.intValue());
            return;
        }
        if (number instanceof Float) {
            parcel.writeFloat(number.floatValue());
            return;
        }
        if (number instanceof Double) {
            parcel.writeDouble(number.doubleValue());
        } else {
            if (number instanceof Byte) {
                parcel.writeByte(number.byteValue());
                return;
            }
            Log.e("DelegateUtil", "setNumber with not support type." + number.toString());
        }
    }
}
