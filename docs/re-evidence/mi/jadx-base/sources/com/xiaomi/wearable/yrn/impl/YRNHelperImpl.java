package com.xiaomi.wearable.yrn.impl;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.wearable.yrn.WearableRNManager;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.helper.WearableRouterManager;
import com.xiaomi.wearable.yrn.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J:\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/wearable/yrn/impl/YRNHelperImpl;", "Lcom/xiaomi/wearable/yrn/export/YRNHelper;", "<init>", "()V", "appName", "", "pageUrl", "pageName", "openPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "params", "", "", "url", "sendJSEvent", "", i.d, "param", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YRNHelperImpl implements YRNHelper {
    @Override // com.xiaomi.wearable.yrn.export.YRNHelper
    @NotNull
    public String appName() {
        return WearableRNManager.INSTANCE.appName();
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNHelper
    public void openPage(@Nullable Activity activity, @NotNull String appName, @NotNull String pageName, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        WearableRouterManager.INSTANCE.openPage(activity, appName, pageName, params);
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNHelper
    @NotNull
    public String pageUrl(@NotNull String appName, @NotNull String pageName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return Constants.PAGE_ROUTER_DOMAIN + appName + "/" + pageName;
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNHelper
    public boolean sendJSEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> param) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return WearableRNManager.INSTANCE.sendJSEvent(eventName, param);
    }

    @Override // com.xiaomi.wearable.yrn.export.YRNHelper
    public void openPage(@Nullable Activity activity, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WearableRouterManager.INSTANCE.openPage(activity, url);
    }
}
