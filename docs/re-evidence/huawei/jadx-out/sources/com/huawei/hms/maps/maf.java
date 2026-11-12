package com.huawei.hms.maps;

import com.huawei.hms.maps.provider.inhuawei.IHuaweiMapDelegate;
import com.huawei.hms.maps.utils.LogM;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes10.dex */
public abstract class maf {
    protected HuaweiMap a(IHuaweiMapDelegate iHuaweiMapDelegate) {
        try {
            Constructor<?> declaredConstructor = Class.forName("com.huawei.hms.maps.HuaweiMapEx").getDeclaredConstructor(IHuaweiMapDelegate.class);
            declaredConstructor.setAccessible(true);
            return (HuaweiMap) declaredConstructor.newInstance(iHuaweiMapDelegate);
        } catch (Throwable unused) {
            LogM.w("BaseLifecycleDelegate", "load mapEx failed.");
            return new HuaweiMap(iHuaweiMapDelegate);
        }
    }
}
