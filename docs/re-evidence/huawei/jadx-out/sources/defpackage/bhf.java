package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhf implements com.huawei.appgallery.coreservice.internal.support.parcelable.b.c<Parcelable[]> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, b(parcel, i, field));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr == null) {
            if (z) {
                bho.c(parcel, i, 0);
                return;
            }
            return;
        }
        int iA = bho.a(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                c(parcel, parcelable, i2);
            }
        }
        bho.b(parcel, iA);
    }

    private <T extends Parcelable> T[] b(Parcel parcel, int i, Field field) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        T[] tArr = null;
        if (iA == 0) {
            return null;
        }
        try {
            Parcelable.Creator creatorC = c(field, null);
            if (creatorC != null) {
                tArr = (T[]) ((Parcelable[]) parcel.createTypedArray(creatorC));
            }
        } catch (Exception e) {
            bhj.d.c("ParcelableArrayTypeProcess", "error readParcelableArray:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return tArr;
    }

    static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    static Parcelable.Creator c(Field field, Map<String, String> map) {
        String str;
        Class<?> type = field.getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        if (type == null || !Parcelable.class.isAssignableFrom(type)) {
            return null;
        }
        String name = field.getName();
        if (map != null && map.get(name) != null && (str = map.get(name)) != null) {
            try {
                type = Class.forName(str);
            } catch (ClassNotFoundException unused) {
                bhj.d.b("ParcelableArrayTypeProcess", "error clazz:" + str);
                return null;
            }
        }
        return d(type);
    }

    public static class c extends RuntimeException {
        public c(String str) {
            super(str);
        }
    }

    static Parcelable.Creator d(Class cls) {
        try {
            return (Parcelable.Creator) cls.getDeclaredField("CREATOR").get(null);
        } catch (IllegalAccessException unused) {
            throw new c(cls + " IllegalAccessException");
        } catch (IllegalArgumentException unused2) {
            throw new c(cls + " IllegalArgumentException");
        } catch (NoSuchFieldException unused3) {
            throw new c(cls + " is an Parcelable without CREATOR");
        }
    }
}
