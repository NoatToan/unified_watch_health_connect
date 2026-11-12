package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.EnableAutoParcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgt implements c<Bundle> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        Class clsSubClass = ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).subClass();
        if (clsSubClass == null || !Parcelable.class.isAssignableFrom(clsSubClass) || ((EnableAutoParcel) field.getAnnotation(EnableAutoParcel.class)).useClassLoader()) {
            clsSubClass = field.getDeclaringClass();
        }
        field.set(autoParcelable, b(parcel, i, bhi.e(clsSubClass)));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, Bundle bundle, int i2, boolean z) {
        if (bundle == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeBundle(bundle);
            bho.b(parcel, iA);
        }
    }

    private Bundle b(Parcel parcel, int i, ClassLoader classLoader) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        Bundle bundle = null;
        if (iA == 0) {
            return null;
        }
        try {
            bundle = parcel.readBundle(classLoader);
        } catch (Exception e) {
            bhj.d.c("BundleTypeProcess", "error readBundle:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return bundle;
    }
}
