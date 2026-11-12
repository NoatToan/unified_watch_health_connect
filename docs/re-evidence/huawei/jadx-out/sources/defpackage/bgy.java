package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgy implements c<Integer> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, Integer.valueOf(b(parcel, i)));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, Integer num, int i2, boolean z) {
        if (num == null) {
            return;
        }
        bho.c(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    private int b(Parcel parcel, int i) {
        bhg.e(parcel, i, 4);
        return parcel.readInt();
    }
}
