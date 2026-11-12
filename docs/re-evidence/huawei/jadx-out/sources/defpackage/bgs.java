package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgs implements c<Double> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, Double.valueOf(d(parcel, i)));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, Double d, int i2, boolean z) {
        if (d == null) {
            return;
        }
        bho.c(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    private double d(Parcel parcel, int i) {
        bhg.e(parcel, i, 8);
        return parcel.readDouble();
    }
}
