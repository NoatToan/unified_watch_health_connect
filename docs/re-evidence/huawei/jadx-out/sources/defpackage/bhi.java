package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.EnableAutoParcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.a;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class bhi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<a, c> f1105a;

    private static void d(AutoParcelable autoParcelable, Parcel parcel, Field field, int i, Map<String, String> map) {
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        try {
            c cVar = f1105a.get(a.a(field));
            if (cVar == null) {
                bhj.d.b("SafeParcel", "can not find process to read:" + field.getName());
            } else {
                cVar.a(autoParcelable, field, parcel, i, map);
            }
        } catch (IllegalAccessException unused) {
            bhj.d.c("SafeParcel", "can not set field value");
        } finally {
            field.setAccessible(zIsAccessible);
        }
    }

    private static void c(AutoParcelable autoParcelable, Parcel parcel, Field field, int i) throws IllegalAccessException {
        int iValue = ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).value();
        boolean zMayNull = ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).mayNull();
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        c cVar = f1105a.get(a.a(field));
        if (cVar == null) {
            bhj.d.b("SafeParcel", "can not find process to write:" + field.getName());
        } else {
            cVar.a(parcel, field, iValue, field.get(autoParcelable), i, zMayNull);
        }
        field.setAccessible(zIsAccessible);
    }

    private static void c(AutoParcelable autoParcelable, Parcel parcel, Class cls) {
        TypeVariable<Class<?>>[] typeParameters = autoParcelable.getClass().getTypeParameters();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            if (!TextUtils.isEmpty(typeVariable.getName())) {
                arrayList2.add(typeVariable.getName());
            }
        }
        if (!arrayList2.isEmpty()) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(EnableAutoParcel.class) && arrayList2.contains(field.getGenericType().toString())) {
                    boolean zIsAccessible = field.isAccessible();
                    field.setAccessible(true);
                    String name = field.getName();
                    try {
                        try {
                            Object obj = field.get(autoParcelable);
                            if (obj != null) {
                                arrayList.add(name + "|" + obj.getClass().getCanonicalName());
                            }
                        } catch (IllegalAccessException unused) {
                            bhj.d.b("SafeParcel", "can not get the value of the field:" + name);
                        }
                        field.setAccessible(zIsAccessible);
                    } catch (Throwable th) {
                        field.setAccessible(zIsAccessible);
                        throw th;
                    }
                }
            }
        }
        new bhc().a(parcel, null, 0, (String[]) arrayList.toArray(new String[typeParameters.length]), 0, false);
    }

    public static void e(AutoParcelable autoParcelable, Parcel parcel, int i) {
        Class<?> superclass = autoParcelable.getClass();
        int iA = bho.a(parcel, 20293);
        c(autoParcelable, parcel, superclass);
        while (superclass != null) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(EnableAutoParcel.class)) {
                    try {
                        c(autoParcelable, parcel, field, i);
                    } catch (Exception e) {
                        bhj.d.c("SafeParcel", "Error writing field: " + e);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        bho.b(parcel, iA);
    }

    private static void c(AutoParcelable autoParcelable, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Class<?> superclass = autoParcelable.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(EnableAutoParcel.class)) {
                    int iValue = ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).value();
                    if (sparseArray.get(iValue) != null) {
                        throw new d("Field number " + iValue + " is used twice in " + superclass.getName() + " for fields " + field.getName() + " and " + ((Field) sparseArray.get(iValue)).getName());
                    }
                    sparseArray.put(iValue, field);
                }
            }
        }
        Class<?> cls = autoParcelable.getClass();
        int iC = bhg.c(parcel);
        Map<String, String> mapD = d(parcel);
        while (parcel.dataPosition() < iC) {
            int i = parcel.readInt();
            int iB = bhg.b(i);
            Field field2 = (Field) sparseArray.get(iB);
            if (field2 == null) {
                bhj.d.e("SafeParcel", "Unknown field num " + iB + " in " + cls.getName() + ", skipping.");
            } else {
                try {
                    d(autoParcelable, parcel, field2, i, mapD);
                } catch (bhg.e e) {
                    bhg.e(parcel, i);
                    bhj.d.c("SafeParcel", "Error reading field: " + iB + " in " + cls.getName() + ", skipping." + e.getMessage());
                    bhg.b(parcel, i);
                }
            }
            bhg.b(parcel, i);
        }
        if (parcel.dataPosition() <= iC) {
            return;
        }
        throw new d("Overread allowed size end=" + iC + Constants.LINK + parcel.dataPosition());
    }

    private static Map<String, String> d(Parcel parcel) {
        HashMap map = new HashMap();
        String[] strArrA = bhc.a(parcel, parcel.readInt());
        if (strArrA != null) {
            for (String str : strArrA) {
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split("\\|");
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }
        return map;
    }

    static final class d extends RuntimeException {
        public d(String str, Throwable th) {
            super(str, th);
        }

        public d(String str) {
            super(str);
        }
    }

    public static ClassLoader e(Class cls) {
        return cls == null ? ClassLoader.getSystemClassLoader() : cls.getClassLoader();
    }

    public static <T extends AutoParcelable> T c(Class<T> cls, Parcel parcel) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            boolean zIsAccessible = declaredConstructor.isAccessible();
            declaredConstructor.setAccessible(true);
            try {
                try {
                    T tNewInstance = declaredConstructor.newInstance(new Object[0]);
                    try {
                        c(tNewInstance, parcel);
                    } catch (Exception e) {
                        bhj.d.a("SafeParcel", "can not readObject", e);
                    }
                    declaredConstructor.setAccessible(zIsAccessible);
                    return tNewInstance;
                } catch (Throwable th) {
                    declaredConstructor.setAccessible(zIsAccessible);
                    throw th;
                }
            } catch (IllegalAccessException e2) {
                throw new d("newInstance failed", e2);
            } catch (InstantiationException e3) {
                throw new d("newInstance failed", e3);
            } catch (InvocationTargetException e4) {
                throw new d("newInstance failed", e4);
            }
        } catch (NoSuchMethodException e5) {
            throw new d("createObject() requires a default constructor", e5);
        } catch (SecurityException e6) {
            throw new d("createObject() requires a public constructor", e6);
        }
    }

    static {
        HashMap map = new HashMap();
        f1105a = map;
        map.put(a.BINDER, new bgv());
        map.put(a.BOOLEAN, new bgu());
        map.put(a.BUNDLE, new bgt());
        map.put(a.BYTE_ARRAY, new bgr());
        map.put(a.DOUBLE, new bgs());
        map.put(a.FLOAT, new bha());
        map.put(a.HASH_MAP, new bgx());
        map.put(a.INT_ARRAY, new bgz());
        map.put(a.INTEGER, new bgy());
        map.put(a.INTERFACE, new bgw());
        map.put(a.LIST, new bhe());
        map.put(a.LONG, new bhb());
        map.put(a.PARCELABLE_ARRAY, new bhf());
        map.put(a.PARCELABLE, new bhd());
        map.put(a.STRING_ARRAY, new bhc());
        map.put(a.STRING_LIST, new bhk());
        map.put(a.STRING, new bhh());
    }
}
