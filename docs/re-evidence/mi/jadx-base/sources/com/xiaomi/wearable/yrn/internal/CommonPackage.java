package com.xiaomi.wearable.yrn.internal;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;
import com.reactnativecommunity.viewpager.ReactViewPagerManager;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.modules.CommonBridgeModule;
import com.xiaomi.wearable.yrn.modules.MLogModule;
import com.xiaomi.wearable.yrn.modules.WearDeviceModule;
import defpackage.cej;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/wearable/yrn/internal/CommonPackage;", "Lcej;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CommonPackage implements cej {
    @Override // defpackage.cej
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ReactContextBaseJavaModule[]{new CommonBridgeModule(reactContext), new MLogModule(reactContext), new WearDeviceModule(reactContext), new AsyncStorageModule(reactContext), WearableRNManager.INSTANCE.providerNetInfoModule(reactContext)});
    }

    @Override // defpackage.cej
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt__CollectionsJVMKt.listOf(new ReactViewPagerManager());
    }
}
