package com.xiaomi.smarthome.core.server.internal.plugin.util;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;
import defpackage.fkh;
import defpackage.hkh;
import defpackage.ikh;
import defpackage.jkh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ParcelUtils {
    private static final String TAG = "ParcelUtils";
    private static final int VAL_BOOLEAN = 9;
    private static final int VAL_BOOLEANARRAY = 23;
    private static final int VAL_BUNDLE = 3;
    private static final int VAL_BYTE = 20;
    private static final int VAL_BYTEARRAY = 13;
    private static final int VAL_CHARSEQUENCE = 10;
    private static final int VAL_CHARSEQUENCEARRAY = 24;
    private static final int VAL_DOUBLE = 8;
    private static final int VAL_DOUBLEARRAY = 28;
    private static final int VAL_FLOAT = 7;
    private static final int VAL_IBINDER = 15;
    private static final int VAL_INTARRAY = 18;
    private static final int VAL_INTEGER = 1;
    private static final int VAL_JSONARRAY = 29;
    private static final int VAL_JSONOBJECT = 30;
    private static final int VAL_LIST = 11;
    private static final int VAL_LONG = 6;
    private static final int VAL_LONGARRAY = 19;
    private static final int VAL_MAP = 2;
    private static final int VAL_NULL = -1;
    private static final int VAL_OBJECTARRAY = 17;
    private static final int VAL_PARCELABLE = 4;
    private static final int VAL_PARCELABLEARRAY = 16;
    private static final int VAL_PERSISTABLEBUNDLE = 25;
    private static final int VAL_SERIALIZABLE = 21;
    private static final int VAL_SHORT = 5;
    private static final int VAL_SIZE = 26;
    private static final int VAL_SIZEF = 27;
    private static final int VAL_SPARSEARRAY = 12;
    private static final int VAL_SPARSEBOOLEANARRAY = 22;
    private static final int VAL_STRING = 0;
    private static final int VAL_STRINGARRAY = 14;
    private static final ValueWriter<String> WRITESTRING = new hkh();
    private static final ValueReader<String> READSTRING = new fkh();
    private static final ValueWriter<Integer> WRITEINT = new jkh();
    private static final ValueReader<Integer> READINT = new ikh();

    public interface MapReader<K, V> extends ValueReader<V> {
        Map<K, V> createMap(int i);

        K readKey(Parcel parcel);
    }

    public interface MapWriter<K, V> extends ValueWriter<V> {
        void writeKey(Parcel parcel, K k2);
    }

    public interface ValueReader<K> {
        K readValue(Parcel parcel);
    }

    public interface ValueWriter<V> {
        void writeValue(Parcel parcel, V v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$readObjectList$0(Parcel parcel) {
        return readValue(parcel, ParcelUtils.class.getClassLoader());
    }

    private static CharSequence readCharSequence(Parcel parcel) {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    private static Object readCharSequenceArray(Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            charSequenceArr[i2] = readCharSequence(parcel);
        }
        return charSequenceArr;
    }

    public static ArrayList<Integer> readIntList(Parcel parcel) {
        return readList(parcel, new ikh());
    }

    public static Map<String, Integer> readIntMap(Parcel parcel, Map<String, Integer> map) {
        return readStringMap(parcel, map, READINT);
    }

    public static <V> ArrayList<V> readList(Parcel parcel, ValueReader<V> valueReader) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        ArrayList<V> arrayList = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(valueReader.readValue(parcel));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> readMap(Parcel parcel, ClassLoader classLoader, MapReader<K, V> mapReader) throws RuntimeException {
        HashMap mapCreateMap;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        if (mapReader == null || (mapCreateMap = mapReader.createMap(i)) == null) {
            mapCreateMap = new HashMap();
        }
        while (i > 0) {
            if (mapReader == null) {
                mapCreateMap.put(readValue(parcel, classLoader), readValue(parcel, classLoader));
            } else {
                try {
                    mapCreateMap.put(mapReader.readKey(parcel), mapReader.readValue(parcel));
                } catch (Exception unused) {
                }
            }
            i--;
        }
        return (Map<K, V>) mapCreateMap;
    }

    public static ArrayList<Object> readObjectList(Parcel parcel) {
        return readList(parcel, new ValueReader() { // from class: kkh
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueReader
            public final Object readValue(Parcel parcel2) {
                return ParcelUtils.lambda$readObjectList$0(parcel2);
            }
        });
    }

    public static ArrayList<String> readStringList(Parcel parcel) {
        return readList(parcel, new fkh());
    }

    public static Map<String, String> readStringMap(Parcel parcel, Map<String, String> map) {
        return readStringMap(parcel, map, READSTRING);
    }

    public static Object readValue(Parcel parcel, ClassLoader classLoader) throws RuntimeException {
        int i = parcel.readInt();
        String[] strArr = null;
        switch (i) {
            case -1:
                return null;
            case 0:
                return parcel.readString();
            case 1:
                return Integer.valueOf(parcel.readInt());
            case 2:
                return readMap(parcel, classLoader, null);
            case 3:
                return parcel.readBundle(classLoader);
            case 4:
                return parcel.readParcelable(classLoader);
            case 5:
                return Short.valueOf((short) parcel.readInt());
            case 6:
                return Long.valueOf(parcel.readLong());
            case 7:
                return Float.valueOf(parcel.readFloat());
            case 8:
                return Double.valueOf(parcel.readDouble());
            case 9:
                return Boolean.valueOf(parcel.readInt() == 1);
            case 10:
                return readCharSequence(parcel);
            case 11:
                return parcel.readArrayList(classLoader);
            case 12:
                return parcel.readSparseArray(classLoader);
            case 13:
                return parcel.createByteArray();
            case 14:
                int i2 = parcel.readInt();
                if (i2 >= 0) {
                    strArr = new String[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        strArr[i3] = parcel.readString();
                    }
                }
                return strArr;
            case 15:
                return parcel.readStrongBinder();
            case 16:
                return parcel.readParcelableArray(classLoader);
            case 17:
                return parcel.readArray(classLoader);
            case 18:
                return parcel.createIntArray();
            case 19:
                return parcel.createLongArray();
            case 20:
                return Byte.valueOf(parcel.readByte());
            case 21:
                return parcel.readSerializable();
            case 22:
                return parcel.readSparseBooleanArray();
            case 23:
                return parcel.createBooleanArray();
            case 24:
                return readCharSequenceArray(parcel);
            case 25:
                return parcel.readPersistableBundle(classLoader);
            case 26:
                return parcel.readSize();
            case 27:
                return parcel.readSizeF();
            case 28:
                return parcel.createDoubleArray();
            case 29:
                try {
                    return new JSONArray(parcel.readString());
                } catch (JSONException unused) {
                    break;
                }
            case 30:
                try {
                    return new JSONObject(parcel.readString());
                } catch (JSONException unused2) {
                    break;
                }
            default:
                throw new RuntimeException("Parcel " + parcel + ": Unmarshalling unknown type code " + i + " at offset " + (parcel.dataPosition() - 4));
        }
    }

    public static <V> void writeArray(Parcel parcel, V[] vArr, ValueWriter<V> valueWriter) {
        if (vArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(vArr.length);
        for (V v : vArr) {
            valueWriter.writeValue(parcel, v);
        }
    }

    private static void writeCharSequence(Parcel parcel, CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, parcel, 0);
    }

    private static void writeCharSequenceArray(Parcel parcel, CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(charSequenceArr.length);
        for (CharSequence charSequence : charSequenceArr) {
            writeCharSequence(parcel, charSequence);
        }
    }

    public static void writeIntList(Parcel parcel, List<Integer> list) {
        writeList(parcel, list, new jkh());
    }

    public static final void writeIntMap(Parcel parcel, Map<String, Integer> map) {
        writeStringMap(parcel, map, WRITEINT);
    }

    public static <V> void writeList(Parcel parcel, List<V> list, ValueWriter<V> valueWriter) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            valueWriter.writeValue(parcel, list.get(i));
        }
    }

    public static final <K, V> void writeMap(Parcel parcel, Map<K, V> map, MapWriter<K, V> mapWriter) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        parcel.writeInt(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            if (mapWriter == null) {
                writeValue(parcel, entry.getKey());
                writeValue(parcel, entry.getValue());
            } else {
                mapWriter.writeKey(parcel, entry.getKey());
                mapWriter.writeValue(parcel, entry.getValue());
            }
        }
    }

    public static <V> void writeObjectArray(Parcel parcel, V[] vArr) {
        writeArray(parcel, vArr, new ValueWriter() { // from class: ekh
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueWriter
            public final void writeValue(Parcel parcel2, Object obj) {
                ParcelUtils.writeValue(parcel2, obj);
            }
        });
    }

    public static void writeObjectList(Parcel parcel, List<Object> list) {
        writeList(parcel, list, new ValueWriter() { // from class: gkh
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueWriter
            public final void writeValue(Parcel parcel2, Object obj) {
                ParcelUtils.writeValue(parcel2, obj);
            }
        });
    }

    public static void writeStringList(Parcel parcel, List<String> list) {
        writeList(parcel, list, new hkh());
    }

    public static final void writeStringMap(Parcel parcel, Map<String, String> map) {
        writeStringMap(parcel, map, WRITESTRING);
    }

    public static final void writeValue(Parcel parcel, Object obj) {
        if (obj == null) {
            parcel.writeInt(-1);
            return;
        }
        if (obj instanceof String) {
            parcel.writeInt(0);
            parcel.writeString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Map) {
            parcel.writeInt(2);
            writeMap(parcel, (Map) obj, null);
            return;
        }
        if (obj instanceof Bundle) {
            parcel.writeInt(3);
            parcel.writeBundle((Bundle) obj);
            return;
        }
        if (obj instanceof PersistableBundle) {
            parcel.writeInt(25);
            parcel.writePersistableBundle((PersistableBundle) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            parcel.writeInt(4);
            parcel.writeParcelable((Parcelable) obj, 0);
            return;
        }
        if (obj instanceof Short) {
            parcel.writeInt(5);
            parcel.writeInt(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            parcel.writeInt(6);
            parcel.writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            parcel.writeInt(7);
            parcel.writeFloat(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            parcel.writeInt(8);
            parcel.writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            parcel.writeInt(9);
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof CharSequence) {
            parcel.writeInt(10);
            writeCharSequence(parcel, (CharSequence) obj);
            return;
        }
        if (obj instanceof List) {
            parcel.writeInt(11);
            parcel.writeList((List) obj);
            return;
        }
        if (obj instanceof SparseArray) {
            parcel.writeInt(12);
            parcel.writeSparseArray((SparseArray) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            parcel.writeInt(23);
            parcel.writeBooleanArray((boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            parcel.writeInt(13);
            parcel.writeByteArray((byte[]) obj);
            return;
        }
        if (obj instanceof String[]) {
            parcel.writeInt(14);
            parcel.writeStringArray((String[]) obj);
            return;
        }
        if (obj instanceof CharSequence[]) {
            parcel.writeInt(24);
            writeCharSequenceArray(parcel, (CharSequence[]) obj);
            return;
        }
        if (obj instanceof IBinder) {
            parcel.writeInt(15);
            parcel.writeStrongBinder((IBinder) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            parcel.writeInt(16);
            parcel.writeParcelableArray((Parcelable[]) obj, 0);
            return;
        }
        if (obj instanceof int[]) {
            parcel.writeInt(18);
            parcel.writeIntArray((int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            parcel.writeInt(19);
            parcel.writeLongArray((long[]) obj);
            return;
        }
        if (obj instanceof Byte) {
            parcel.writeInt(20);
            parcel.writeInt(((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Size) {
            parcel.writeInt(26);
            parcel.writeSize((Size) obj);
            return;
        }
        if (obj instanceof SizeF) {
            parcel.writeInt(27);
            parcel.writeSizeF((SizeF) obj);
            return;
        }
        if (obj instanceof double[]) {
            parcel.writeInt(28);
            parcel.writeDoubleArray((double[]) obj);
            return;
        }
        if (obj instanceof JSONArray) {
            parcel.writeInt(29);
            parcel.writeString(((JSONArray) obj).toString());
            return;
        }
        if (obj instanceof JSONObject) {
            parcel.writeInt(30);
            parcel.writeString(((JSONObject) obj).toString());
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray() && cls.getComponentType() == Object.class) {
            parcel.writeInt(17);
            parcel.writeArray((Object[]) obj);
        } else {
            if (obj instanceof Serializable) {
                parcel.writeInt(21);
                parcel.writeSerializable((Serializable) obj);
                return;
            }
            new RuntimeException("Parcel: unable to marshal value " + obj + obj.getClass());
        }
    }

    public static <V> Map<String, V> readStringMap(Parcel parcel, final Map<String, V> map, final ValueReader<V> valueReader) {
        return readMap(parcel, null, new MapReader<String, V>() { // from class: com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.2
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.MapReader
            public Map<String, V> createMap(int i) {
                return map;
            }

            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueReader
            public V readValue(Parcel parcel2) {
                return (V) valueReader.readValue(parcel2);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.MapReader
            public String readKey(Parcel parcel2) {
                return parcel2.readString();
            }
        });
    }

    public static final <V> void writeStringMap(Parcel parcel, Map<String, V> map, final ValueWriter<V> valueWriter) {
        writeMap(parcel, map, new MapWriter<String, V>() { // from class: com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.1
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueWriter
            public void writeValue(Parcel parcel2, V v) {
                valueWriter.writeValue(parcel2, v);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.MapWriter
            public void writeKey(Parcel parcel2, String str) {
                parcel2.writeString(str);
            }
        });
    }
}
