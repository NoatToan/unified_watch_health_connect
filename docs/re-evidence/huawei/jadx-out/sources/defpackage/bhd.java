package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhd implements c<Parcelable> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, d(parcel, i, field, map));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            bho.b(parcel, iA);
        }
    }

    private <T extends Parcelable> T d(Parcel parcel, int i, Field field, Map<String, String> map) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        T t = null;
        if (iA == 0) {
            return null;
        }
        try {
            Parcelable.Creator creatorC = bhf.c(field, map);
            if (creatorC != null) {
                t = (T) ((Parcelable) creatorC.createFromParcel(parcel));
            }
        } catch (Exception e) {
            bhj.d.b("ParcelableTypeProcess", "readParcelable failed: " + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return t;
    }
}
