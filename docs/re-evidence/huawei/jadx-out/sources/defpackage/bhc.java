package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhc implements c<String[]> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, a(parcel, i));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, String[] strArr, int i2, boolean z) {
        if (strArr == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeStringArray(strArr);
            bho.b(parcel, iA);
        }
    }

    public static String[] a(Parcel parcel, int i) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        String[] strArrCreateStringArray = new String[0];
        if (iA == 0) {
            return strArrCreateStringArray;
        }
        try {
            strArrCreateStringArray = parcel.createStringArray();
        } catch (Exception e) {
            bhj.d.c("StringArrayTypeProcess", "error readStringArray:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return strArrCreateStringArray;
    }
}
