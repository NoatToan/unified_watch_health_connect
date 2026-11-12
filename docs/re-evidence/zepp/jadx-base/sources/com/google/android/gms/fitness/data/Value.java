package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.HexDumpUtils;
import com.google.android.gms.internal.fitness.zzko;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "ValueCreator")
@SafeParcelable.Reserved({1000})
public final class Value extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Value> CREATOR = new zzal();

    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private final int a;

    @SafeParcelable.Field(getter = "isSet", id = 2)
    private boolean b;

    @SafeParcelable.Field(getter = "getValue", id = 3)
    private float c;

    @Nullable
    @SafeParcelable.Field(getter = "getStringValue", id = 4)
    private String d;

    @Nullable
    @SafeParcelable.Field(getter = "getMapValue", id = 5, type = "android.os.Bundle")
    private Map<String, MapValue> e;

    @Nullable
    @SafeParcelable.Field(getter = "getIntArrayValue", id = 6)
    private int[] f;

    @Nullable
    @SafeParcelable.Field(getter = "getFloatArrayValue", id = 7)
    private float[] g;

    @Nullable
    @SafeParcelable.Field(getter = "getBlob", id = 8)
    private byte[] h;

    @ShowFirstParty
    public Value(int i) {
        this(i, false, 0.0f, null, null, null, null, null);
    }

    @RecentlyNonNull
    public final String asActivity() {
        return zzko.getName(asInt());
    }

    public final float asFloat() {
        Preconditions.checkState(this.a == 2, "Value is not in float format");
        return this.c;
    }

    public final int asInt() {
        Preconditions.checkState(this.a == 1, "Value is not in int format");
        return Float.floatToRawIntBits(this.c);
    }

    @RecentlyNonNull
    public final String asString() {
        Preconditions.checkState(this.a == 3, "Value is not in string format");
        String str = this.d;
        return str == null ? "" : str;
    }

    @Deprecated
    public final void clearKey(@RecentlyNonNull String str) {
        Preconditions.checkState(this.a == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        Map<String, MapValue> map = this.e;
        if (map != null) {
            map.remove(str);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        int i = this.a;
        if (i == value.a && this.b == value.b) {
            if (i != 1) {
                if (i == 3) {
                    return Objects.equal(this.d, value.d);
                }
                if (i == 4) {
                    return Objects.equal(this.e, value.e);
                }
                if (i == 5) {
                    return Arrays.equals(this.f, value.f);
                }
                if (i == 6) {
                    return Arrays.equals(this.g, value.g);
                }
                if (i != 7) {
                    return this.c == value.c;
                }
                return Arrays.equals(this.h, value.h);
            }
            if (asInt() == value.asInt()) {
                return true;
            }
        }
        return false;
    }

    public final int getFormat() {
        return this.a;
    }

    @RecentlyNullable
    public final Float getKeyValue(@RecentlyNonNull String str) {
        Preconditions.checkState(this.a == 4, "Value is not in float map format");
        Map<String, MapValue> map = this.e;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return Float.valueOf(this.e.get(str).asFloat());
    }

    public final int hashCode() {
        return Objects.hashCode(Float.valueOf(this.c), this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean isSet() {
        return this.b;
    }

    @Deprecated
    public final void setActivity(@RecentlyNonNull String str) {
        setInt(zzko.zzo(str));
    }

    @Deprecated
    public final void setFloat(float f) {
        Preconditions.checkState(this.a == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.b = true;
        this.c = f;
    }

    @Deprecated
    public final void setInt(int i) {
        Preconditions.checkState(this.a == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.b = true;
        this.c = Float.intBitsToFloat(i);
    }

    @Deprecated
    public final void setKeyValue(@RecentlyNonNull String str, float f) {
        Preconditions.checkState(this.a == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.b = true;
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, MapValue.zza(f));
    }

    @Deprecated
    public final void setString(@RecentlyNonNull String str) {
        Preconditions.checkState(this.a == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.b = true;
        this.d = str;
    }

    @RecentlyNonNull
    public final String toString() {
        String strDump;
        if (!this.b) {
            return "unset";
        }
        switch (this.a) {
            case 1:
                return Integer.toString(asInt());
            case 2:
                return Float.toString(this.c);
            case 3:
                String str = this.d;
                return str == null ? "" : str;
            case 4:
                return this.e == null ? "" : new TreeMap(this.e).toString();
            case 5:
                return Arrays.toString(this.f);
            case 6:
                return Arrays.toString(this.g);
            case 7:
                byte[] bArr = this.h;
                return (bArr == null || (strDump = HexDumpUtils.dump(bArr, 0, bArr.length, false)) == null) ? "" : strDump;
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Bundle bundle;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getFormat());
        SafeParcelWriter.writeBoolean(parcel, 2, isSet());
        SafeParcelWriter.writeFloat(parcel, 3, this.c);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        if (this.e == null) {
            bundle = null;
        } else {
            bundle = new Bundle(this.e.size());
            for (Map.Entry<String, MapValue> entry : this.e.entrySet()) {
                bundle.putParcelable(entry.getKey(), entry.getValue());
            }
        }
        SafeParcelWriter.writeBundle(parcel, 5, bundle, false);
        SafeParcelWriter.writeIntArray(parcel, 6, this.f, false);
        SafeParcelWriter.writeFloatArray(parcel, 7, this.g, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    @Deprecated
    public final void zza(@RecentlyNonNull Map<String, Float> map) {
        Preconditions.checkState(this.a == 4, "Attempting to set a float map value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.b = true;
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            map2.put(entry.getKey(), MapValue.zza(entry.getValue().floatValue()));
        }
        this.e = map2;
    }

    @SafeParcelable.Constructor
    public Value(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) float f, @Nullable @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) Bundle bundle, @Nullable @SafeParcelable.Param(id = 6) int[] iArr, @Nullable @SafeParcelable.Param(id = 7) float[] fArr, @Nullable @SafeParcelable.Param(id = 8) byte[] bArr) {
        ArrayMap arrayMap;
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = str;
        if (bundle == null) {
            arrayMap = null;
        } else {
            bundle.setClassLoader((ClassLoader) Preconditions.checkNotNull(MapValue.class.getClassLoader()));
            arrayMap = new ArrayMap(bundle.size());
            for (String str2 : bundle.keySet()) {
                arrayMap.put(str2, (MapValue) Preconditions.checkNotNull((MapValue) bundle.getParcelable(str2)));
            }
        }
        this.e = arrayMap;
        this.f = iArr;
        this.g = fArr;
        this.h = bArr;
    }
}
