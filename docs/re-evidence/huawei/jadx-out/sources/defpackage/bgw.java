package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.appgallery.coreservice.internal.support.parcelable.AutoParcelable;
import com.huawei.appgallery.coreservice.internal.support.parcelable.b.c;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bgw implements c<IInterface> {
    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(AutoParcelable autoParcelable, Field field, Parcel parcel, int i, Map<String, String> map) {
        bhj bhjVar;
        StringBuilder sb;
        String message;
        for (Class<?> cls : field.getType().getDeclaredClasses()) {
            try {
                field.set(autoParcelable, cls.getDeclaredMethod("asInterface", IBinder.class).invoke(null, bgv.b(parcel, i)));
                return;
            } catch (NoSuchMethodException e) {
                bhjVar = bhj.d;
                sb = new StringBuilder("can not set the interface");
                message = e.getMessage();
                sb.append(message);
                bhjVar.c("InterfaceTypeProcess", sb.toString());
            } catch (Exception e2) {
                bhjVar = bhj.d;
                sb = new StringBuilder("can not set the interface");
                message = e2.getMessage();
                sb.append(message);
                bhjVar.c("InterfaceTypeProcess", sb.toString());
            }
        }
        throw new d("Field has broken interface: " + field);
    }

    public static class d extends RuntimeException {
        public d(String str) {
            super(str);
        }
    }

    @Override // com.huawei.appgallery.coreservice.internal.support.parcelable.b.c
    public void a(Parcel parcel, Field field, int i, IInterface iInterface, int i2, boolean z) {
        if (iInterface == null) {
            if (z) {
                bho.c(parcel, i, 0);
            }
        } else {
            int iA = bho.a(parcel, i);
            parcel.writeStrongBinder(iInterface.asBinder());
            bho.b(parcel, iA);
        }
    }
}
