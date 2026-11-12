package defpackage;

import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgr implements c<byte[]> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) throws IllegalAccessException {
        field.set(autoParcelable, d(parcel, i));
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Parcel parcel, Field field, int i, byte[] bArr, int i2, boolean z) {
        if (bArr == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeByteArray(bArr);
            bho.b(parcel, iA);
        }
    }

    private byte[] d(Parcel parcel, int i) {
        int iA = bhg.a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        byte[] bArrCreateByteArray = new byte[0];
        if (iA == 0) {
            return bArrCreateByteArray;
        }
        try {
            bArrCreateByteArray = parcel.createByteArray();
        } catch (Exception e) {
            bhj.d.c("ByteArrayTypeProcess", "error readByteArray:" + e.getMessage());
        }
        parcel.setDataPosition(iDataPosition + iA);
        return bArrCreateByteArray;
    }
}
