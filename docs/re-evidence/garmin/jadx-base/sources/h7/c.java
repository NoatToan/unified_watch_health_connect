package h7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import o13.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @o13.e
    public static final Bundle a(p<String, ? extends Object>... pVarArr) {
        Bundle bundle = new Bundle(pVarArr.length);
        for (p<String, ? extends Object> pVar : pVarArr) {
            String str = pVar.f128594a;
            B b14 = pVar.f128595b;
            if (b14 == 0) {
                bundle.putString(str, null);
            } else if (b14 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b14).booleanValue());
            } else if (b14 instanceof Byte) {
                bundle.putByte(str, ((Number) b14).byteValue());
            } else if (b14 instanceof Character) {
                bundle.putChar(str, ((Character) b14).charValue());
            } else if (b14 instanceof Double) {
                bundle.putDouble(str, ((Number) b14).doubleValue());
            } else if (b14 instanceof Float) {
                bundle.putFloat(str, ((Number) b14).floatValue());
            } else if (b14 instanceof Integer) {
                bundle.putInt(str, ((Number) b14).intValue());
            } else if (b14 instanceof Long) {
                bundle.putLong(str, ((Number) b14).longValue());
            } else if (b14 instanceof Short) {
                bundle.putShort(str, ((Number) b14).shortValue());
            } else if (b14 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b14);
            } else if (b14 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b14);
            } else if (b14 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b14);
            } else if (b14 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b14);
            } else if (b14 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b14);
            } else if (b14 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b14);
            } else if (b14 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b14);
            } else if (b14 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b14);
            } else if (b14 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b14);
            } else if (b14 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b14);
            } else if (b14 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b14);
            } else if (b14 instanceof Object[]) {
                Class<?> componentType = b14.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b14);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b14);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b14);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        fb1.c.s(34, "Illegal value array type ", componentType.getCanonicalName(), " for key \"", str);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) b14);
                }
            } else if (b14 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b14);
            } else if (b14 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b14);
            } else if (b14 instanceof Size) {
                bundle.putSize(str, (Size) b14);
            } else {
                if (!(b14 instanceof SizeF)) {
                    fb1.c.s(34, "Illegal value type ", b14.getClass().getCanonicalName(), " for key \"", str);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) b14);
            }
        }
        return bundle;
    }
}
