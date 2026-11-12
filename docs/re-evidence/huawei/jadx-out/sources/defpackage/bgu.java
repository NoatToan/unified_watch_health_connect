package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgu implements c<Boolean> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, Boolean.valueOf(c(parcel, i)));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, Boolean bool, int i2, boolean z) {
        if (bool == null) {
            return;
        }
        bho.c(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    private boolean c(Parcel parcel, int i) {
        bhg.e(parcel, i, 4);
        return parcel.readInt() != 0;
    }
}
