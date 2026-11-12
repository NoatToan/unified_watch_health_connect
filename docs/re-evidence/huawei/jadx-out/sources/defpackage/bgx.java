package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgx implements c<HashMap> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, b(parcel, i, autoParcelable.getClass().getClassLoader()));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, HashMap map, int i2, boolean z) {
        if (map == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeMap(map);
            bho.b(parcel, iA);
        }
    }

    private HashMap b(Parcel parcel, int i, ClassLoader classLoader) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        HashMap hashMap = null;
        if (iA == 0) {
            return null;
        }
        try {
            hashMap = parcel.readHashMap(classLoader);
        } catch (Exception unused) {
            bhj.d.c("HashMapTypeProcess", "can not read map");
        }
        parcel.setDataPosition(iDataPosition + iA);
        return hashMap;
    }
}
