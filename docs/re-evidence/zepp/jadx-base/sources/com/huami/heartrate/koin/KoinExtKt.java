package com.huami.heartrate.koin;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.app.restheartrate.service.api.MaxHeartApi;
import com.huami.heartrate.Platform;
import com.huami.web.service.WebViewService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0001\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u000f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "withKoinGet", "()Ljava/lang/Object;", "Landroid/content/Context;", "getAppContext", "Lcom/huami/heartrate/koin/IHeartRateDataDelegate;", "getHeartRateDataDelegate", "", "isHollywood", "", "url", "", "launchUrl", "Lcom/app/restheartrate/service/api/MaxHeartApi;", "getTruthMaxHeartRate", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {
    @NotNull
    public static final Context getAppContext() {
        return (Context) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    @NotNull
    public static final IHeartRateDataDelegate getHeartRateDataDelegate() {
        return (IHeartRateDataDelegate) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IHeartRateDataDelegate.class), null, null);
    }

    @Nullable
    public static final MaxHeartApi getTruthMaxHeartRate() {
        return (MaxHeartApi) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(MaxHeartApi.class), null, null);
    }

    public static final boolean isHollywood() {
        return getHeartRateDataDelegate().getPlatform() == Platform.HOLLYWOOD;
    }

    public static final void launchUrl(@NotNull String str) {
        ((WebViewService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null)).launch(str);
    }

    public static final /* synthetic */ <T> T withKoinGet() {
        Scope rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }
}
