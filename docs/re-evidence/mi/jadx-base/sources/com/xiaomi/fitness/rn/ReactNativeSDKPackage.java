package com.xiaomi.fitness.rn;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.xiaomi.fitness.rn.modules.AccountModule;
import com.xiaomi.fitness.rn.modules.HostModule;
import com.xiaomi.fitness.rn.modules.MiWearDBModule;
import com.xiaomi.fitness.rn.modules.ServiceModule;
import defpackage.oej;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/rn/ReactNativeSDKPackage;", "Lcom/xiaomi/fitness/rn/BaseReactPackage;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Loej;", "createViewManagers", "<init>", "()V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ReactNativeSDKPackage extends BaseReactPackage {
    @Override // com.xiaomi.fitness.rn.BaseReactPackage, defpackage.cej
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HostModule(reactContext));
        arrayList.add(new AccountModule(reactContext));
        arrayList.add(new ServiceModule(reactContext));
        arrayList.add(new MiWearDBModule(reactContext));
        return arrayList;
    }

    @Override // com.xiaomi.fitness.rn.BaseReactPackage, defpackage.cej
    @NotNull
    public List<ViewManager<View, oej<?>>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ArrayList();
    }
}
