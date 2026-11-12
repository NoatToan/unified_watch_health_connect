package com.xiaomi.wearable.yrn.impl;

import android.app.Activity;
import android.content.Intent;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.env.RNEnvironmentPreference;
import com.xiaomi.wearable.yrn.export.data.YRNBundleData;
import com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper;
import com.xiaomi.yrn.channel.debugui.YRNDevModeActivity;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import defpackage.tur;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/wearable/yrn/impl/YRNDebugHelperImpl;", "Lcom/xiaomi/wearable/yrn/export/debug/YRNDebugHelper;", "<init>", "()V", "switchEnv", "", "env", "", "rnDebugEntry", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "getLoadedBundleInfoMap", "", "Lcom/xiaomi/wearable/yrn/export/data/YRNBundleData;", "appName", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNDebugHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNDebugHelperImpl.kt\ncom/xiaomi/wearable/yrn/impl/YRNDebugHelperImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n216#2,2:48\n*S KotlinDebug\n*F\n+ 1 YRNDebugHelperImpl.kt\ncom/xiaomi/wearable/yrn/impl/YRNDebugHelperImpl\n*L\n30#1:48,2\n*E\n"})
public final class YRNDebugHelperImpl implements YRNDebugHelper {
    @Override // com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper
    @Nullable
    public Map<String, YRNBundleData> getLoadedBundleInfoMap(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        HashMap<String, YRNBundleInfo> mapB = tur.a().b(WearableRNManager.INSTANCE.appName());
        if (mapB == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, YRNBundleInfo> entry : mapB.entrySet()) {
            String key = entry.getKey();
            YRNBundleInfo value = entry.getValue();
            linkedHashMap.put(key, new YRNBundleData(value.getVersion(), value.getModule(), value.getMaketime(), value.getMd5(), value.getBundlePath(), Integer.valueOf(value.getMaxNativeApiLevel()), Integer.valueOf(value.getMaxCommonJSApiLevel()), value.getModuleIdMapVersion(), Integer.valueOf(value.getUpdateStrategy()), Boolean.valueOf(value.isResidentMemory())));
        }
        return linkedHashMap;
    }

    @Override // com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper
    public void rnDebugEntry(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) YRNDevModeActivity.class));
    }

    @Override // com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper
    public void switchEnv(@NotNull String env) {
        Intrinsics.checkNotNullParameter(env, "env");
        RNEnvironmentPreference.INSTANCE.setRN_ENVIRONMENT(env);
    }
}
