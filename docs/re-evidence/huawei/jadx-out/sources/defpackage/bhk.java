package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhk implements c<List<String>> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, c(parcel, i));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, List<String> list, int i2, boolean z) {
        if (list == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeStringList(list);
            bho.b(parcel, iA);
        }
    }

    private ArrayList<String> c(Parcel parcel, int i) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        ArrayList<String> arrayListCreateStringArrayList = null;
        if (iA == 0) {
            return null;
        }
        try {
            arrayListCreateStringArrayList = parcel.createStringArrayList();
        } catch (Exception e) {
            bhj.d.c("StringListProcess", "error readStringList:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateStringArrayList;
    }
}
