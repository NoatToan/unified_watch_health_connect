package com.huawei.hms.health;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.operation.utils.Constants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class aabs {
    private static <T> T aab(Parcel parcel, Class cls) {
        if (parcel.readInt() == 0) {
            return null;
        }
        if (cls == null || !Parcelable.class.isAssignableFrom(cls)) {
            return (T) parcel.readValue((cls == null || cls.getClassLoader() == null) ? ClassLoader.getSystemClassLoader() : cls.getClassLoader());
        }
        if (aab(cls) != null) {
            return (T) aab(cls).createFromParcel(parcel);
        }
        return null;
    }

    private static Object aabb(Field field, Parcel parcel, int i) {
        switch (aabu.aab(field).ordinal()) {
            case 5:
                Parcelable.Creator<Parcelable> creatorAab = aab(field);
                int iAab = aab(parcel, i);
                int iDataPosition = parcel.dataPosition();
                if (iAab == 0) {
                    return creatorAab.newArray(0);
                }
                int i2 = parcel.readInt();
                Object[] objArrCreateTypedArray = parcel.createTypedArray(creatorAab);
                parcel.setDataPosition(iDataPosition + i2);
                return objArrCreateTypedArray;
            case 6:
                return SafeParcelReader.createStringArray(parcel, i);
            case 7:
                return SafeParcelReader.createByteArray(parcel, i);
            case 8:
            default:
                return null;
            case 9:
                return SafeParcelReader.createIntArray(parcel, i);
            case 10:
                return SafeParcelReader.createLongArray(parcel, i);
            case 11:
                return SafeParcelReader.createFloatArray(parcel, i);
            case 12:
                return SafeParcelReader.createDoubleArray(parcel, i);
            case 13:
                return SafeParcelReader.createCharArray(parcel, i);
            case 14:
                return SafeParcelReader.createBooleanArray(parcel, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Object[] aab(Map<Integer, Field> map, Annotation[][] annotationArr, Parcel parcel) {
        int i;
        String str;
        int iId;
        Object[] objArr = new Object[annotationArr.length];
        HashMap map2 = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < annotationArr.length; i3++) {
            Object objValueOf = null;
            objArr[i3] = null;
            Annotation[] annotationArr2 = annotationArr[i3];
            int length = annotationArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    Annotation annotation = annotationArr2[i4];
                    if (annotation instanceof aabv) {
                        iId = ((aabv) annotation).id();
                    } else {
                        i4++;
                    }
                } else {
                    iId = -1;
                }
            }
            if (iId > 0 && iId <= 10000 && map.get(Integer.valueOf(iId)) != null) {
                Field field = map.get(Integer.valueOf(iId));
                switch (aabu.aab(field).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 21:
                    case 22:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    case 15:
                        objValueOf = -1;
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    case 16:
                        objValueOf = -1L;
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    case 17:
                    case 23:
                    case 24:
                        objValueOf = 0;
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    case 18:
                        objValueOf = false;
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    case 19:
                        objValueOf = Float.valueOf(-1.0f);
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    case 20:
                        objValueOf = Double.valueOf(-1.0d);
                        objArr[i3] = objValueOf;
                        map2.put(Integer.valueOf(iId), Integer.valueOf(i3));
                        break;
                    default:
                        StringBuilder sbAab = aab.aab("Unexpected value : ");
                        sbAab.append(aabu.aab(field));
                        aabz.aab("SafeParcelUtil", sbAab.toString());
                        StringBuilder sbAab2 = aab.aab("Unexpected value : ");
                        sbAab2.append(aabu.aab(field));
                        throw new IllegalStateException(sbAab2.toString());
                }
            }
        }
        StringBuilder sbAab3 = aab.aab("idAndIndexMap size : ");
        sbAab3.append(map2.size());
        sbAab3.toString();
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (true) {
            i = i2 + 1;
            if (i2 <= iValidateObjectHeader && parcel.dataPosition() < iValidateObjectHeader) {
                int header = SafeParcelReader.readHeader(parcel);
                int fieldId = SafeParcelReader.getFieldId(header);
                Field field2 = map.get(Integer.valueOf(fieldId));
                if (field2 == null || fieldId <= 0 || fieldId > 10000 || !map2.containsKey(Integer.valueOf(fieldId))) {
                    str = "skip Unknown fieldId : " + fieldId;
                } else {
                    try {
                        objArr[((Integer) map2.get(Integer.valueOf(fieldId))).intValue()] = aab(parcel, field2, header);
                        field2.getName();
                    } catch (IllegalAccessException | IllegalStateException unused) {
                        str = "skip Error field : " + fieldId + Constants.LEFT_BRACKET_ONLY + field2.getName() + Constants.RIGHT_BRACKET_ONLY;
                        aabz.aab("SafeParcelUtil", str);
                        SafeParcelReader.skipUnknownField(parcel, header);
                    }
                    i2 = i;
                }
                aabz.aab("SafeParcelUtil", str);
                SafeParcelReader.skipUnknownField(parcel, header);
                i2 = i;
            }
        }
        if (i > iValidateObjectHeader) {
            aabz.aab("SafeParcelUtil", "Max loop reached, readParcelObject parcel failed");
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return objArr;
    }

    private static Object aab(Field field, Parcel parcel, int i) {
        int iOrdinal = aabu.aab(field).ordinal();
        if (iOrdinal == 2) {
            return SafeParcelReader.createStringList(parcel, i);
        }
        if (iOrdinal == 3) {
            Class clsAab = aab(field, 0);
            if (clsAab != null && Parcelable.class.isAssignableFrom(clsAab)) {
                return SafeParcelReader.createTypedList(parcel, i, aab(clsAab));
            }
            ArrayList arrayList = new ArrayList();
            SafeParcelReader.readList(parcel, i, arrayList, (clsAab == null || clsAab.getClassLoader() == null) ? ClassLoader.getSystemClassLoader() : clsAab.getClassLoader());
            return arrayList;
        }
        if (iOrdinal == 21) {
            return SafeParcelReader.createString(parcel, i);
        }
        if (iOrdinal != 22) {
            switch (iOrdinal) {
                case 25:
                    return SafeParcelReader.readIntegerObject(parcel, i);
                case 26:
                    return SafeParcelReader.readLongObject(parcel, i);
                case 27:
                    return SafeParcelReader.readFloatObject(parcel, i);
                case 28:
                    return SafeParcelReader.readDoubleObject(parcel, i);
                case 29:
                    return SafeParcelReader.readBooleanObject(parcel, i);
                default:
                    StringBuilder sbAab = aab.aab("Unexpected value（or value is null）: ");
                    sbAab.append(aabu.aab(field));
                    aabz.aabc("SafeParcelUtil", sbAab.toString());
                    return null;
            }
        }
        int iAab = aab(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iAab == 0) {
            return Collections.EMPTY_MAP;
        }
        int i2 = parcel.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < iAab; i3++) {
            map.put(aab(parcel, aab(field, 0)), aab(parcel, aab(field, 1)));
        }
        parcel.setDataPosition(iDataPosition + i2);
        return map;
    }

    private static boolean aab(Object obj, int i, boolean z, Parcel parcel, Field field, int i2) {
        int iOrdinal = aabu.aab(field).ordinal();
        if (iOrdinal == 8) {
            SafeParcelWriter.writeIBinder(parcel, i, obj == null ? null : ((IInterface) obj).asBinder(), z);
        } else if (iOrdinal == 22) {
            Map map = (Map) obj;
            if (map != null) {
                int iAab = aab(parcel, i, map.size());
                if (map.size() != 0) {
                    parcel.writeInt(iAab);
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        aab(parcel, key, i2);
                        if (value == null) {
                            parcel.writeInt(0);
                        } else {
                            aab(parcel, value, i2);
                        }
                    }
                    aaba(parcel, iAab);
                }
            }
        } else if (iOrdinal == 0) {
            SafeParcelWriter.writeParcelable(parcel, i, (Parcelable) obj, i2, z);
        } else if (iOrdinal == 1) {
            SafeParcelWriter.writeIBinder(parcel, i, (IBinder) obj, z);
        } else if (iOrdinal == 2) {
            SafeParcelWriter.writeStringList(parcel, i, (List) obj, z);
        } else if (iOrdinal == 3) {
            Class clsAab = aab(field, 0);
            if (clsAab == null || !Parcelable.class.isAssignableFrom(clsAab)) {
                SafeParcelWriter.writeList(parcel, i, (List) obj, z);
            } else {
                SafeParcelWriter.writeTypedList(parcel, i, (List) obj, z);
            }
        } else {
            if (iOrdinal != 4) {
                return false;
            }
            SafeParcelWriter.writeBundle(parcel, i, (Bundle) obj, z);
        }
        return true;
    }

    private static boolean aab(Object obj, int i, boolean z, Parcel parcel, aabu aabuVar, int i2) {
        switch (aabuVar.ordinal()) {
            case 5:
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                if (parcelableArr == null) {
                    return true;
                }
                int iAab = aab(parcel, i, parcelableArr.length);
                if (parcelableArr.length == 0) {
                    return true;
                }
                parcel.writeInt(iAab);
                parcel.writeInt(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if (parcelable == null) {
                        parcel.writeInt(0);
                    } else {
                        aab(parcel, parcelable, i2);
                    }
                }
                aaba(parcel, iAab);
                return true;
            case 6:
                SafeParcelWriter.writeStringArray(parcel, i, (String[]) obj, z);
                return true;
            case 7:
                SafeParcelWriter.writeByteArray(parcel, i, (byte[]) obj, z);
                return true;
            case 8:
            default:
                return false;
            case 9:
                SafeParcelWriter.writeIntArray(parcel, i, (int[]) obj, z);
                return true;
            case 10:
                SafeParcelWriter.writeLongArray(parcel, i, (long[]) obj, z);
                return true;
            case 11:
                SafeParcelWriter.writeFloatArray(parcel, i, (float[]) obj, z);
                return true;
            case 12:
                SafeParcelWriter.writeDoubleArray(parcel, i, (double[]) obj, z);
                return true;
            case 13:
                SafeParcelWriter.writeCharArray(parcel, i, (char[]) obj, z);
                return true;
            case 14:
                SafeParcelWriter.writeBooleanArray(parcel, i, (boolean[]) obj, z);
                return true;
        }
    }

    private static void aab(Parcelable parcelable, Parcel parcel, Field field, int i) throws IllegalAccessException {
        aaby aabyVar = (aaby) field.getAnnotation(aaby.class);
        if (aabyVar == null) {
            aabz.aab("SafeParcelUtil", "getFieldId IllegalStateException");
            throw new IllegalStateException();
        }
        int iId = aabyVar.id();
        if (iId <= 0 || iId > 10000) {
            aabz.aab("SafeParcelUtil", "fieldId Must be in the range of 1-10000, failed fieldId : " + iId);
            return;
        }
        boolean zIsAccessible = field.isAccessible();
        boolean zCanBeNull = field.getAnnotation(aaby.class) != null ? ((aaby) field.getAnnotation(aaby.class)).CanBeNull() : true;
        field.setAccessible(true);
        try {
            Object obj = field.get(parcelable);
            aabu aabuVarAab = aabu.aab(field);
            if (aab(obj, iId, zCanBeNull, parcel, field, i)) {
                return;
            }
            if (aab(obj, iId, zCanBeNull, parcel, aabuVarAab, i)) {
                return;
            }
            if (aab(obj, iId, parcel, aabuVarAab)) {
                return;
            }
            int iOrdinal = aabuVarAab.ordinal();
            if (iOrdinal != 21) {
                switch (iOrdinal) {
                    case 25:
                        SafeParcelWriter.writeIntegerObject(parcel, iId, (Integer) obj, zCanBeNull);
                        break;
                    case 26:
                        SafeParcelWriter.writeLongObject(parcel, iId, (Long) obj, zCanBeNull);
                        break;
                    case 27:
                        SafeParcelWriter.writeFloatObject(parcel, iId, (Float) obj, zCanBeNull);
                        break;
                    case 28:
                        SafeParcelWriter.writeDoubleObject(parcel, iId, (Double) obj, zCanBeNull);
                        break;
                    case 29:
                        SafeParcelWriter.writeBooleanObject(parcel, iId, (Boolean) obj, zCanBeNull);
                        break;
                    default:
                        aabz.aab("SafeParcelUtil", "[writeObjectField] cant find fit case");
                        break;
                }
            } else {
                SafeParcelWriter.writeString(parcel, iId, (String) obj, zCanBeNull);
            }
        } finally {
            field.setAccessible(zIsAccessible);
        }
    }

    private static void aaba(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    private static Object aaba(Field field, Parcel parcel, int i) {
        switch (aabu.aab(field).ordinal()) {
            case 15:
                return Integer.valueOf(SafeParcelReader.readInt(parcel, i));
            case 16:
                return Long.valueOf(SafeParcelReader.readLong(parcel, i));
            case 17:
                return Character.valueOf(SafeParcelReader.readChar(parcel, i));
            case 18:
                return Boolean.valueOf(SafeParcelReader.readBoolean(parcel, i));
            case 19:
                return Float.valueOf(SafeParcelReader.readFloat(parcel, i));
            case 20:
                return Double.valueOf(SafeParcelReader.readDouble(parcel, i));
            case 21:
            case 22:
            default:
                return null;
            case 23:
                return Byte.valueOf(SafeParcelReader.readByte(parcel, i));
            case 24:
                return Short.valueOf(SafeParcelReader.readShort(parcel, i));
        }
    }

    private static boolean aab(Object obj, int i, Parcel parcel, aabu aabuVar) {
        switch (aabuVar.ordinal()) {
            case 15:
                SafeParcelWriter.writeInt(parcel, i, ((Integer) obj).intValue());
                return true;
            case 16:
                SafeParcelWriter.writeLong(parcel, i, ((Long) obj).longValue());
                return true;
            case 17:
                SafeParcelWriter.writeChar(parcel, i, ((Character) obj).charValue());
                return true;
            case 18:
                SafeParcelWriter.writeBoolean(parcel, i, ((Boolean) obj).booleanValue());
                return true;
            case 19:
                SafeParcelWriter.writeFloat(parcel, i, ((Float) obj).floatValue());
                return true;
            case 20:
                SafeParcelWriter.writeDouble(parcel, i, ((Double) obj).doubleValue());
                return true;
            case 21:
            case 22:
            default:
                return false;
            case 23:
                SafeParcelWriter.writeByte(parcel, i, ((Byte) obj).byteValue());
                return true;
            case 24:
                SafeParcelWriter.writeShort(parcel, i, ((Short) obj).shortValue());
                return true;
        }
    }

    public static void aab(Parcelable parcelable, Parcel parcel, int i) {
        int i2;
        parcelable.getClass();
        HashMap map = new HashMap();
        Class<?> superclass = parcelable.getClass();
        while (true) {
            i2 = 0;
            if (superclass == null) {
                break;
            }
            Field[] declaredFields = superclass.getDeclaredFields();
            int length = declaredFields.length;
            while (i2 < length) {
                Field field = declaredFields[i2];
                if (field != null && field.isAnnotationPresent(aaby.class)) {
                    int iId = ((aaby) field.getAnnotation(aaby.class)).id();
                    if (map.get(Integer.valueOf(iId)) != null) {
                        StringBuilder sbAab = aab.aab("Field of ");
                        sbAab.append(field.getName());
                        sbAab.append(Constants.LEFT_BRACKET_ONLY);
                        sbAab.append(iId);
                        sbAab.append(") repeat with ");
                        sbAab.append(((Field) map.get(Integer.valueOf(iId))).getName());
                        sbAab.append(" in ");
                        sbAab.append(superclass.getName());
                        aabz.aab("SafeParcelUtil", sbAab.toString());
                    } else {
                        map.put(Integer.valueOf(iId), field);
                    }
                }
                i2++;
            }
            superclass = superclass.getSuperclass();
        }
        Object[] array = map.keySet().toArray();
        Arrays.sort(array);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        int length2 = array.length;
        while (i2 < length2) {
            try {
                aab(parcelable, parcel, (Field) map.get(array[i2]), i);
            } catch (Exception unused) {
                aabz.aab("SafeParcelUtil", "write Object Field Exception");
            }
            i2++;
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private static <T> void aab(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        if (t instanceof Parcelable) {
            ((Parcelable) t).writeToParcel(parcel, i);
        } else {
            parcel.writeValue(t);
        }
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static Object aab(Field field, Parcel parcel, int i, boolean z) throws IllegalAccessException {
        int iOrdinal = aabu.aab(field).ordinal();
        if (iOrdinal == 0) {
            return SafeParcelReader.createParcelable(parcel, i, aab(field));
        }
        boolean z2 = true;
        if (iOrdinal == 1) {
            return SafeParcelReader.readIBinder(parcel, i);
        }
        if (iOrdinal == 4) {
            return SafeParcelReader.createBundle(parcel, i);
        }
        Object objInvoke = null;
        if (iOrdinal != 8) {
            return null;
        }
        Class<?>[] declaredClasses = field.getType().getDeclaredClasses();
        int length = declaredClasses.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = false;
                break;
            }
            Class<?> cls = declaredClasses[i2];
            try {
                IBinder iBinder = SafeParcelReader.readIBinder(parcel, i);
                if (iBinder != null) {
                    objInvoke = cls.getDeclaredMethod("asInterface", IBinder.class).invoke(objInvoke, iBinder);
                    break;
                }
                break;
            } catch (NoSuchMethodException | InvocationTargetException unused) {
                aabz.aab("SafeParcelUtil", "[readObjectField] readIBinder Exception, ignore");
                i2++;
            }
        }
        if (z2 || z) {
            return objInvoke;
        }
        throw new IllegalStateException("[interface] Field illegal : " + field);
    }

    private static Object aab(Parcel parcel, Field field, int i) throws IllegalAccessException {
        boolean zIsAccessible = field.isAccessible();
        boolean zCanBeNull = field.getAnnotation(aaby.class) != null ? ((aaby) field.getAnnotation(aaby.class)).CanBeNull() : true;
        field.setAccessible(true);
        try {
            Object objAab = aab(field, parcel, i, zCanBeNull);
            if (objAab != null) {
                return objAab;
            }
            Object objAabb = aabb(field, parcel, i);
            if (objAabb != null) {
                return objAabb;
            }
            Object objAaba = aaba(field, parcel, i);
            return objAaba != null ? objAaba : aab(field, parcel, i);
        } finally {
            field.setAccessible(zIsAccessible);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    static Class aab(Field field, int i) {
        Type type;
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericType;
            if (parameterizedType.getActualTypeArguments().length < 1 || i >= parameterizedType.getActualTypeArguments().length || i < 0) {
                type = null;
            } else {
                type = parameterizedType.getActualTypeArguments()[i];
                if (type instanceof Class) {
                    return (Class) type;
                }
            }
        } else {
            type = null;
        }
        return (Class) type;
    }

    public static <T extends Parcelable> T aab(Class<T> cls, Parcel parcel) {
        String str;
        String str2;
        T t = null;
        try {
            HashMap map = new HashMap();
            Class<T> superclass = cls;
            loop0: while (true) {
                int i = 0;
                if (superclass == null) {
                    map.size();
                    cls.getName();
                    for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                        boolean zIsAccessible = constructor.isAccessible();
                        constructor.setAccessible(true);
                        if (constructor.isAnnotationPresent(aabw.class)) {
                            cls.getName();
                            t = (T) ((Parcelable) constructor.newInstance(aab(map, constructor.getParameterAnnotations(), parcel)));
                            i = 1;
                            break;
                        }
                        constructor.setAccessible(zIsAccessible);
                    }
                    if (i == 0) {
                        str2 = "[createObject] not find Constructor of " + cls.getName();
                        break;
                    }
                    return t;
                }
                Field[] declaredFields = superclass.getDeclaredFields();
                int length = declaredFields.length;
                while (i < length) {
                    Field field = declaredFields[i];
                    if (field.isAnnotationPresent(aaby.class)) {
                        int iId = ((aaby) field.getAnnotation(aaby.class)).id();
                        if (map.containsKey(Integer.valueOf(iId))) {
                            str2 = "Field of " + field.getName() + " (" + iId + ") in " + superclass.getName() + " is repeat of " + ((Field) map.get(Integer.valueOf(iId))).getName();
                            break loop0;
                        }
                        map.put(Integer.valueOf(iId), field);
                    }
                    i++;
                }
                superclass = superclass.getSuperclass();
            }
            aabz.aab("SafeParcelUtil", str2);
            return t;
        } catch (IllegalAccessException unused) {
            str = "Encountered an IllegalAccessException";
            aabz.aab("SafeParcelUtil", str);
            return t;
        } catch (InstantiationException unused2) {
            str = "Encountered an InstantiationException";
            aabz.aab("SafeParcelUtil", str);
            return t;
        } catch (InvocationTargetException unused3) {
            str = "Encountered an InvocationTargetException";
            aabz.aab("SafeParcelUtil", str);
            return t;
        }
    }

    static Parcelable.Creator<Parcelable> aab(Field field) {
        Class<?> type = field.getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        if (type != null && Parcelable.class.isAssignableFrom(type)) {
            return aab(type);
        }
        aabz.aab("SafeParcelUtil", type + " not have Parcelable Field");
        throw new IllegalStateException(type + " not have Parcelable Field");
    }

    static Parcelable.Creator<Parcelable> aab(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            AccessController.doPrivileged(new aabt(declaredField));
            return (Parcelable.Creator) declaredField.get(null);
        } catch (IllegalAccessException unused) {
            aabz.aab("SafeParcelUtil", cls + " CREATOR is not useable");
            throw new IllegalArgumentException(cls + " CREATOR is not useable");
        } catch (NoSuchFieldException unused2) {
            aabz.aab("SafeParcelUtil", "not CREATOR in " + cls);
            throw new IllegalArgumentException("not CREATOR in " + cls);
        }
    }

    private static int aab(Parcel parcel, int i, int i2) {
        if (i2 == 0 || i2 >= 65535) {
            parcel.writeInt(i & 65535);
            parcel.writeInt(i2);
        } else {
            parcel.writeInt(i | (i2 << 16));
        }
        return parcel.dataPosition();
    }

    private static int aab(Parcel parcel, int i) {
        return (i | 65535) != 65535 ? (i >> 16) & 65535 : parcel.readInt();
    }
}
