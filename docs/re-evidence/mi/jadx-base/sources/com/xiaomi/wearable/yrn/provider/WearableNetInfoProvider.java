package com.xiaomi.wearable.yrn.provider;

import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.wearable.yrn.internal.Constants;
import defpackage.r1d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/yrn/provider/WearableNetInfoProvider;", "Lr1d;", "", "envType", "getBundleNetUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lokhttp3/Interceptor;", "getNetInterceptorList", "()Ljava/util/List;", "Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;", "getNetBeanProvider", "()Lcom/xiaomi/wearable/yrn/provider/WearableNetBeanProvider;", "mAppName", "Ljava/lang/String;", "appName", "<init>", "(Ljava/lang/String;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WearableNetInfoProvider implements r1d {

    @NotNull
    private final String mAppName;

    public WearableNetInfoProvider(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.mAppName = appName;
    }

    @Override // defpackage.r1d
    @NotNull
    public String getBundleNetUrl(@Nullable String envType) {
        return Constants.INSTANCE.getBundleRequestUrl(envType, RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion());
    }

    @Override // defpackage.r1d
    @NotNull
    public List<Interceptor> getNetInterceptorList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // defpackage.r1d
    @NotNull
    public WearableNetBeanProvider getNetBeanProvider() {
        return new WearableNetBeanProvider(this.mAppName);
    }
}
