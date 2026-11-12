package com.xiaomi.wearable.yrn.exception;

import android.app.Activity;
import com.facebook.react.bridge.ReadableArray;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&Ja\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00112.\u0010\u0013\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015j\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0014H&¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/yrn/exception/IRNErrorHandler;", "", "handleRNFatalException", "", "title", "", "details", "Lcom/facebook/react/bridge/ReadableArray;", "exceptionId", "", "handleRNSoftException", "handleRNNativeCrash", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "bundleInfo", "Lcom/xiaomi/yrn/env/entity/YRNBundleInfo;", "exception", "Lkotlin/Exception;", "Ljava/lang/Exception;", "map", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Landroid/app/Activity;Lcom/xiaomi/yrn/env/entity/YRNBundleInfo;Ljava/lang/Exception;Ljava/util/HashMap;)Z", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRNErrorHandler {
    boolean handleRNFatalException(@Nullable String title, @Nullable ReadableArray details, int exceptionId);

    boolean handleRNNativeCrash(@Nullable Activity activity, @Nullable YRNBundleInfo bundleInfo, @Nullable Exception exception, @Nullable HashMap<String, Object> map);

    boolean handleRNSoftException(@Nullable String title, @Nullable ReadableArray details, int exceptionId);
}
