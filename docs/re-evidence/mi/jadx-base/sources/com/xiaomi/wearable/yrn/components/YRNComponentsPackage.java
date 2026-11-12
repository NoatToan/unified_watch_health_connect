package com.xiaomi.wearable.yrn.components;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.xiaomi.wearable.yrn.components.amap.YRNAMapModule;
import com.xiaomi.wearable.yrn.components.amap.YRNAMapViewManager;
import com.xiaomi.wearable.yrn.components.calendar.YRNCalendarModule;
import com.xiaomi.wearable.yrn.components.permission.YRNPermissionModule;
import com.xiaomi.wearable.yrn.components.share.YRNShareModule;
import com.xiaomi.wearable.yrn.components.sport.YRNSportModule;
import defpackage.cej;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/YRNComponentsPackage;", "Lcej;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "", "Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapViewManager;", "createViewManagers", "<init>", "()V", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class YRNComponentsPackage implements cej {
    @Override // defpackage.cej
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt__CollectionsKt.mutableListOf(new YRNAMapModule(reactContext), new YRNPermissionModule(reactContext), new YRNShareModule(reactContext), new YRNSportModule(reactContext), new YRNCalendarModule(reactContext));
    }

    @Override // defpackage.cej
    @NotNull
    public List<YRNAMapViewManager> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt__CollectionsJVMKt.listOf(new YRNAMapViewManager());
    }
}
