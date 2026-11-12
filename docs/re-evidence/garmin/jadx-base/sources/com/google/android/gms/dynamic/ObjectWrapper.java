package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import j20.x;
import java.lang.reflect.Field;
import n23.j;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@RetainForClient
@KeepForSdk
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object zza;

    private ObjectWrapper(Object obj) {
        this.zza = obj;
    }

    @KeepForSdk
    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i14 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i14++;
                field = field2;
            }
        }
        if (i14 != 1) {
            int length = declaredFields.length;
            h.s(x.e(new StringBuilder(String.valueOf(length).length() + 53), length, "Unexpected number of IObjectWrapper declared fields: "));
            return null;
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            h.s("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e4) {
            j.w("Could not access the field in remoteBinder.", e4);
            return null;
        } catch (NullPointerException e14) {
            j.w("Binder object is null.", e14);
            return null;
        }
    }

    @KeepForSdk
    public static <T> IObjectWrapper wrap(T t7) {
        return new ObjectWrapper(t7);
    }
}
