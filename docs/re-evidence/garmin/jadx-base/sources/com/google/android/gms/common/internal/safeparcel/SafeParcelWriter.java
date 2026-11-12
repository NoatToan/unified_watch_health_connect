package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zzb(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i14) {
        zzc(parcel, i14);
    }

    public static void writeBigDecimal(Parcel parcel, int i14, BigDecimal bigDecimal, boolean z14) {
        if (bigDecimal == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzc(parcel, iZzb);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i14, BigDecimal[] bigDecimalArr, boolean z14) {
        if (bigDecimalArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i15 = 0; i15 < length; i15++) {
            parcel.writeByteArray(bigDecimalArr[i15].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i15].scale());
        }
        zzc(parcel, iZzb);
    }

    public static void writeBigInteger(Parcel parcel, int i14, BigInteger bigInteger, boolean z14) {
        if (bigInteger == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzc(parcel, iZzb);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i14, BigInteger[] bigIntegerArr, boolean z14) {
        if (bigIntegerArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzc(parcel, iZzb);
    }

    public static void writeBoolean(Parcel parcel, int i14, boolean z14) {
        zza(parcel, i14, 4);
        parcel.writeInt(z14 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i14, boolean[] zArr, boolean z14) {
        if (zArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeBooleanArray(zArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i14, List<Boolean> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(list.get(i15).booleanValue() ? 1 : 0);
        }
        zzc(parcel, iZzb);
    }

    public static void writeBooleanObject(Parcel parcel, int i14, Boolean bool, boolean z14) {
        if (bool != null) {
            zza(parcel, i14, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z14) {
            zza(parcel, i14, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i14, Bundle bundle, boolean z14) {
        if (bundle == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeBundle(bundle);
            zzc(parcel, iZzb);
        }
    }

    public static void writeByte(Parcel parcel, int i14, byte b14) {
        zza(parcel, i14, 4);
        parcel.writeInt(b14);
    }

    public static void writeByteArray(Parcel parcel, int i14, byte[] bArr, boolean z14) {
        if (bArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeByteArray(bArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i14, byte[][] bArr, boolean z14) {
        if (bArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzc(parcel, iZzb);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i14, SparseArray<byte[]> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            parcel.writeByteArray(sparseArray.valueAt(i15));
        }
        zzc(parcel, iZzb);
    }

    public static void writeChar(Parcel parcel, int i14, char c14) {
        zza(parcel, i14, 4);
        parcel.writeInt(c14);
    }

    public static void writeCharArray(Parcel parcel, int i14, char[] cArr, boolean z14) {
        if (cArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeCharArray(cArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeDouble(Parcel parcel, int i14, double d14) {
        zza(parcel, i14, 8);
        parcel.writeDouble(d14);
    }

    public static void writeDoubleArray(Parcel parcel, int i14, double[] dArr, boolean z14) {
        if (dArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeDoubleArray(dArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i14, List<Double> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeDouble(list.get(i15).doubleValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeDoubleObject(Parcel parcel, int i14, Double d14, boolean z14) {
        if (d14 != null) {
            zza(parcel, i14, 8);
            parcel.writeDouble(d14.doubleValue());
        } else if (z14) {
            zza(parcel, i14, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i14, SparseArray<Double> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            parcel.writeDouble(sparseArray.valueAt(i15).doubleValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeFloat(Parcel parcel, int i14, float f14) {
        zza(parcel, i14, 4);
        parcel.writeFloat(f14);
    }

    public static void writeFloatArray(Parcel parcel, int i14, float[] fArr, boolean z14) {
        if (fArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeFloatArray(fArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeFloatList(Parcel parcel, int i14, List<Float> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeFloat(list.get(i15).floatValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeFloatObject(Parcel parcel, int i14, Float f14, boolean z14) {
        if (f14 != null) {
            zza(parcel, i14, 4);
            parcel.writeFloat(f14.floatValue());
        } else if (z14) {
            zza(parcel, i14, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i14, SparseArray<Float> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            parcel.writeFloat(sparseArray.valueAt(i15).floatValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeIBinder(Parcel parcel, int i14, IBinder iBinder, boolean z14) {
        if (iBinder == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeStrongBinder(iBinder);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i14, IBinder[] iBinderArr, boolean z14) {
        if (iBinderArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeBinderArray(iBinderArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i14, List<IBinder> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeBinderList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i14, SparseArray<IBinder> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            parcel.writeStrongBinder(sparseArray.valueAt(i15));
        }
        zzc(parcel, iZzb);
    }

    public static void writeInt(Parcel parcel, int i14, int i15) {
        zza(parcel, i14, 4);
        parcel.writeInt(i15);
    }

    public static void writeIntArray(Parcel parcel, int i14, int[] iArr, boolean z14) {
        if (iArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeIntArray(iArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i14, List<Integer> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(list.get(i15).intValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeIntegerObject(Parcel parcel, int i14, Integer num, boolean z14) {
        if (num != null) {
            zza(parcel, i14, 4);
            parcel.writeInt(num.intValue());
        } else if (z14) {
            zza(parcel, i14, 0);
        }
    }

    public static void writeList(Parcel parcel, int i14, List list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeLong(Parcel parcel, int i14, long j8) {
        zza(parcel, i14, 8);
        parcel.writeLong(j8);
    }

    public static void writeLongArray(Parcel parcel, int i14, long[] jArr, boolean z14) {
        if (jArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeLongArray(jArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeLongList(Parcel parcel, int i14, List<Long> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeLong(list.get(i15).longValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeLongObject(Parcel parcel, int i14, Long l14, boolean z14) {
        if (l14 != null) {
            zza(parcel, i14, 8);
            parcel.writeLong(l14.longValue());
        } else if (z14) {
            zza(parcel, i14, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i14, Parcel parcel2, boolean z14) {
        if (parcel2 == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzc(parcel, iZzb);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i14, Parcel[] parcelArr, boolean z14) {
        if (parcelArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelList(Parcel parcel, int i14, List<Parcel> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            Parcel parcel2 = list.get(i15);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i14, SparseArray<Parcel> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            Parcel parcelValueAt = sparseArray.valueAt(i15);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelable(Parcel parcel, int i14, Parcelable parcelable, int i15, boolean z14) {
        if (parcelable == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcelable.writeToParcel(parcel, i15);
            zzc(parcel, iZzb);
        }
    }

    public static void writePendingIntent(Parcel parcel, int i14, PendingIntent pendingIntent, boolean z14) {
        if (pendingIntent == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzc(parcel, iZzb);
        }
    }

    public static void writeShort(Parcel parcel, int i14, short s8) {
        zza(parcel, i14, 4);
        parcel.writeInt(s8);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i14, SparseBooleanArray sparseBooleanArray, boolean z14) {
        if (sparseBooleanArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzc(parcel, iZzb);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i14, SparseIntArray sparseIntArray, boolean z14) {
        if (sparseIntArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseIntArray.keyAt(i15));
            parcel.writeInt(sparseIntArray.valueAt(i15));
        }
        zzc(parcel, iZzb);
    }

    public static void writeSparseLongArray(Parcel parcel, int i14, SparseLongArray sparseLongArray, boolean z14) {
        if (sparseLongArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseLongArray.keyAt(i15));
            parcel.writeLong(sparseLongArray.valueAt(i15));
        }
        zzc(parcel, iZzb);
    }

    public static void writeString(Parcel parcel, int i14, String str, boolean z14) {
        if (str == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeString(str);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringArray(Parcel parcel, int i14, String[] strArr, boolean z14) {
        if (strArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeStringArray(strArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringList(Parcel parcel, int i14, List<String> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
            }
        } else {
            int iZzb = zzb(parcel, i14);
            parcel.writeStringList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i14, SparseArray<String> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            parcel.writeString(sparseArray.valueAt(i15));
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i14, T[] tArr, int i15, boolean z14) {
        if (tArr == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        parcel.writeInt(tArr.length);
        for (T t7 : tArr) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t7, i15);
            }
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i14, List<T> list, boolean z14) {
        if (list == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            T t7 = list.get(i15);
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t7, 0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i14, SparseArray<T> sparseArray, boolean z14) {
        if (sparseArray == null) {
            if (z14) {
                zza(parcel, i14, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i14);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeInt(sparseArray.keyAt(i15));
            T tValueAt = sparseArray.valueAt(i15);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzc(parcel, iZzb);
    }

    private static void zza(Parcel parcel, int i14, int i15) {
        parcel.writeInt(i14 | (i15 << 16));
    }

    private static int zzb(Parcel parcel, int i14) {
        parcel.writeInt(i14 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzc(Parcel parcel, int i14) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i14 - 4);
        parcel.writeInt(iDataPosition - i14);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i14) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i14);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
