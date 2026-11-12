package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import defpackage.yyu;
import defpackage.zcp;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BundleKt {
    public static final Bundle bundleOf(yyu<String, ? extends Object>... yyuVarArr) {
        Bundle bundle = new Bundle(yyuVarArr.length);
        for (yyu<String, ? extends Object> yyuVar : yyuVarArr) {
            String strA = yyuVar.a();
            Object objE = yyuVar.e();
            if (objE == null) {
                bundle.putString(strA, null);
            } else if (objE instanceof Boolean) {
                bundle.putBoolean(strA, ((Boolean) objE).booleanValue());
            } else if (objE instanceof Byte) {
                bundle.putByte(strA, ((Number) objE).byteValue());
            } else if (objE instanceof Character) {
                bundle.putChar(strA, ((Character) objE).charValue());
            } else if (objE instanceof Double) {
                bundle.putDouble(strA, ((Number) objE).doubleValue());
            } else if (objE instanceof Float) {
                bundle.putFloat(strA, ((Number) objE).floatValue());
            } else if (objE instanceof Integer) {
                bundle.putInt(strA, ((Number) objE).intValue());
            } else if (objE instanceof Long) {
                bundle.putLong(strA, ((Number) objE).longValue());
            } else if (objE instanceof Short) {
                bundle.putShort(strA, ((Number) objE).shortValue());
            } else if (objE instanceof Bundle) {
                bundle.putBundle(strA, (Bundle) objE);
            } else if (objE instanceof CharSequence) {
                bundle.putCharSequence(strA, (CharSequence) objE);
            } else if (objE instanceof Parcelable) {
                bundle.putParcelable(strA, (Parcelable) objE);
            } else if (objE instanceof boolean[]) {
                bundle.putBooleanArray(strA, (boolean[]) objE);
            } else if (objE instanceof byte[]) {
                bundle.putByteArray(strA, (byte[]) objE);
            } else if (objE instanceof char[]) {
                bundle.putCharArray(strA, (char[]) objE);
            } else if (objE instanceof double[]) {
                bundle.putDoubleArray(strA, (double[]) objE);
            } else if (objE instanceof float[]) {
                bundle.putFloatArray(strA, (float[]) objE);
            } else if (objE instanceof int[]) {
                bundle.putIntArray(strA, (int[]) objE);
            } else if (objE instanceof long[]) {
                bundle.putLongArray(strA, (long[]) objE);
            } else if (objE instanceof short[]) {
                bundle.putShortArray(strA, (short[]) objE);
            } else if (objE instanceof Object[]) {
                Class<?> componentType = objE.getClass().getComponentType();
                zcp.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    zcp.e(objE, "");
                    bundle.putParcelableArray(strA, (Parcelable[]) objE);
                } else if (String.class.isAssignableFrom(componentType)) {
                    zcp.e(objE, "");
                    bundle.putStringArray(strA, (String[]) objE);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    zcp.e(objE, "");
                    bundle.putCharSequenceArray(strA, (CharSequence[]) objE);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(strA, (Serializable) objE);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strA + '\"');
                }
            } else if (objE instanceof Serializable) {
                bundle.putSerializable(strA, (Serializable) objE);
            } else if (objE instanceof IBinder) {
                bundle.putBinder(strA, (IBinder) objE);
            } else if (objE instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, strA, (Size) objE);
            } else {
                if (!(objE instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objE.getClass().getCanonicalName() + " for key \"" + strA + '\"');
                }
                BundleApi21ImplKt.putSizeF(bundle, strA, (SizeF) objE);
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
