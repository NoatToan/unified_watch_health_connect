package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.EnableAutoParcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhe implements c<List> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        Class clsSubClass = ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).subClass();
        field.set(autoParcelable, (clsSubClass == null || !Parcelable.class.isAssignableFrom(clsSubClass) || ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).useClassLoader()) ? b(parcel, i, bhi.e(clsSubClass)) : c(parcel, i, clsSubClass));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, List list, int i2, boolean z) {
        Class clsSubClass = ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).subClass();
        if (clsSubClass == null || !Parcelable.class.isAssignableFrom(clsSubClass) || ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).useClassLoader()) {
            a(parcel, i, list, z);
        } else {
            d(parcel, i, list, i2, z);
        }
    }

    private void a(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeList(list);
            bho.b(parcel, iA);
        }
    }

    private <T extends Parcelable> void d(Parcel parcel, int i, List<T> list, int i2, boolean z) {
        if (list == null) {
            if (z) {
                bho.c(parcel, i, 0);
                return;
            }
            return;
        }
        int iA = bho.a(parcel, i);
        parcel.writeInt(list.size());
        for (T t : list) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                bhf.c(parcel, t, i2);
            }
        }
        bho.b(parcel, iA);
    }

    private ArrayList b(Parcel parcel, int i, ClassLoader classLoader) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        ArrayList arrayList = null;
        if (iA == 0) {
            return null;
        }
        try {
            arrayList = parcel.readArrayList(classLoader);
        } catch (Exception e) {
            bhj.d.c("ListTypeProcess", "error readList:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return arrayList;
    }

    private <T extends Parcelable> ArrayList<T> c(Parcel parcel, int i, Class cls) {
        bhj bhjVar;
        StringBuilder sb;
        String message;
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        ArrayList<T> arrayListCreateTypedArrayList = null;
        if (iA == 0) {
            return null;
        }
        try {
            Parcelable.Creator creatorD = bhf.d(cls);
            if (creatorD != null) {
                arrayListCreateTypedArrayList = parcel.createTypedArrayList(creatorD);
            }
        } catch (bhf.c e) {
            bhjVar = bhj.d;
            sb = new StringBuilder("error getCreator:");
            message = e.getMessage();
            sb.append(message);
            bhjVar.c("ListTypeProcess", sb.toString());
        } catch (Exception e2) {
            bhjVar = bhj.d;
            sb = new StringBuilder("error readParcelableList:");
            message = e2.getMessage();
            sb.append(message);
            bhjVar.c("ListTypeProcess", sb.toString());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateTypedArrayList;
    }
}
