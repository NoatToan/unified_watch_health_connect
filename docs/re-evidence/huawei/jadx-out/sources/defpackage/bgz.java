package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgz implements c<int[]> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, d(parcel, i));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, int[] iArr, int i2, boolean z) {
        if (iArr == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeIntArray(iArr);
            bho.b(parcel, iA);
        }
    }

    private int[] d(Parcel parcel, int i) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        int[] iArrCreateIntArray = new int[0];
        if (iA == 0) {
            return iArrCreateIntArray;
        }
        try {
            iArrCreateIntArray = parcel.createIntArray();
        } catch (Exception e) {
            bhj.d.c("IntegerArrayTypeProcess", "error readIntArray:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return iArrCreateIntArray;
    }
}
