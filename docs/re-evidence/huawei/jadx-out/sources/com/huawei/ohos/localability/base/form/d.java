package com.huawei.ohos.localability.base.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes40.dex */
public class d implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Parcelable.Creator<d> f18100b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f18101a;

    public d(Parcel parcel) {
        int i;
        Object objValueOf;
        HashMap map = new HashMap();
        this.f18101a = map;
        map.clear();
        if (parcel != null && (i = parcel.readInt()) <= 512000) {
            for (int i2 = 0; i2 < i; i2++) {
                String string = parcel.readString();
                int i3 = parcel.readInt();
                switch (i3) {
                    case -1:
                        objValueOf = null;
                        break;
                    case 0:
                    default:
                        throw new IllegalArgumentException("read IntentParams: unsupported value type " + i3);
                    case 1:
                        objValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    case 2:
                        objValueOf = Byte.valueOf(parcel.readByte());
                        break;
                    case 3:
                        objValueOf = Character.valueOf((char) parcel.readInt());
                        break;
                    case 4:
                        objValueOf = Short.valueOf((short) parcel.readInt());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(parcel.readInt());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(parcel.readLong());
                        break;
                    case 7:
                        objValueOf = Float.valueOf(parcel.readFloat());
                        break;
                    case 8:
                        objValueOf = Double.valueOf(parcel.readDouble());
                        break;
                    case 9:
                        objValueOf = parcel.readString();
                        break;
                }
                this.f18101a.put(string, objValueOf);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <E> void a(Parcel parcel, E e) {
        if (e == 0) {
            parcel.writeInt(-1);
            return;
        }
        if (e instanceof Boolean) {
            parcel.writeInt(1);
            parcel.writeInt(((Boolean) e).booleanValue() ? 1 : 0);
            return;
        }
        if (e instanceof Byte) {
            parcel.writeInt(2);
            parcel.writeByte(((Byte) e).byteValue());
            return;
        }
        if (e instanceof Character) {
            parcel.writeInt(3);
            parcel.writeInt(((Character) e).charValue());
            return;
        }
        if (e instanceof Short) {
            parcel.writeInt(4);
            parcel.writeInt(((Short) e).shortValue());
            return;
        }
        if (e instanceof Integer) {
            parcel.writeInt(5);
            parcel.writeInt(((Integer) e).intValue());
            return;
        }
        if (e instanceof Long) {
            parcel.writeInt(6);
            parcel.writeLong(((Long) e).longValue());
            return;
        }
        if (e instanceof Float) {
            parcel.writeInt(7);
            parcel.writeFloat(((Float) e).floatValue());
            return;
        }
        if (e instanceof Double) {
            parcel.writeInt(8);
            parcel.writeDouble(((Double) e).doubleValue());
            return;
        }
        if (e instanceof String) {
            parcel.writeInt(9);
            parcel.writeString((String) e);
            return;
        }
        if (e instanceof CharSequence) {
            parcel.writeInt(10);
            parcel.writeString(e.toString());
            return;
        }
        boolean z = e instanceof List;
        if (z) {
            parcel.writeInt(50);
            Parcel parcelObtain = Parcel.obtain();
            if (!z) {
                throw new IllegalArgumentException("write IntentParams: unsupported type " + e.getClass());
            }
            List list = (List) e;
            parcelObtain.writeInt(list.size());
            Iterator<E> it = list.iterator();
            while (it.hasNext()) {
                a(parcelObtain, it.next());
            }
            byte[] bArrMarshall = parcelObtain.marshall();
            parcel.writeInt(bArrMarshall.length);
            parcel.writeByteArray(bArrMarshall);
            return;
        }
        if (e instanceof boolean[]) {
            parcel.writeInt(11);
            parcel.writeBooleanArray((boolean[]) e);
            return;
        }
        if (e instanceof byte[]) {
            parcel.writeInt(12);
            parcel.writeByteArray((byte[]) e);
            return;
        }
        if (e instanceof char[]) {
            parcel.writeInt(13);
            parcel.writeCharArray((char[]) e);
            return;
        }
        int i = 0;
        if (e instanceof short[]) {
            parcel.writeInt(14);
            short[] sArr = (short[]) e;
            int[] iArr = new int[sArr.length];
            while (i < sArr.length) {
                iArr[i] = sArr[i];
                i++;
            }
            parcel.writeIntArray(iArr);
            return;
        }
        if (e instanceof int[]) {
            parcel.writeInt(15);
            parcel.writeIntArray((int[]) e);
            return;
        }
        if (e instanceof long[]) {
            parcel.writeInt(16);
            parcel.writeLongArray((long[]) e);
            return;
        }
        if (e instanceof float[]) {
            parcel.writeInt(17);
            parcel.writeFloatArray((float[]) e);
            return;
        }
        if (e instanceof double[]) {
            parcel.writeInt(18);
            parcel.writeDoubleArray((double[]) e);
            return;
        }
        if (e instanceof String[]) {
            parcel.writeInt(19);
            parcel.writeStringArray((String[]) e);
            return;
        }
        if (!(e instanceof CharSequence[])) {
            throw new IllegalArgumentException("the type or contained type is not support to transport when acquireForm : " + e.getClass());
        }
        parcel.writeInt(20);
        CharSequence[] charSequenceArr = (CharSequence[]) e;
        String[] strArr = new String[charSequenceArr.length];
        while (i < charSequenceArr.length) {
            strArr[i] = charSequenceArr[i].toString();
            i++;
        }
        parcel.writeStringArray(strArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInt(this.f18101a.size());
        for (Map.Entry<String, Object> entry : this.f18101a.entrySet()) {
            parcelObtain.writeString(entry.getKey());
            a(parcelObtain, entry.getValue());
        }
        byte[] bArrMarshall = parcelObtain.marshall();
        parcel.writeInt(bArrMarshall.length);
        parcel.writeByteArray(bArrMarshall);
    }

    public <T> void a(String str, T t) {
        this.f18101a.put(str, t);
    }

    static final class b implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            if (i >= 0) {
                return new d[i];
            }
            return null;
        }

        b() {
        }
    }

    public d() {
        this(null);
    }
}
