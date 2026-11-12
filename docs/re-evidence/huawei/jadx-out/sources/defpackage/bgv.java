package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgv implements c<IBinder> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, b(parcel, i));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, IBinder iBinder, int i2, boolean z) {
        if (iBinder == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            bho.b(parcel, iA);
        }
    }

    public static IBinder b(Parcel parcel, int i) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        IBinder strongBinder = null;
        if (iA == 0) {
            return null;
        }
        try {
            strongBinder = parcel.readStrongBinder();
        } catch (Exception e) {
            bhj.d.c("BinderTypeProcess", "error readBinder:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return strongBinder;
    }
}
