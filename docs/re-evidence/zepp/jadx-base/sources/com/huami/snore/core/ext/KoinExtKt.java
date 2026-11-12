package com.huami.snore.core.ext;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.snore.ui.koin.ScopesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0001\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u0006\u0010\f\u001a\u00020\u000b¨\u0006\r"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "withKoinGet", "()Ljava/lang/Object;", "Landroid/content/Context;", "getAppContext", "Lcom/huami/snore/core/ext/UserInfo;", "getUserInfo", "Lcom/huami/snore/core/ext/IPageJumpManager;", "getPageJumpManager", "Lcom/huami/snore/core/ext/IPageStatusAnalyticsManager;", "getPageStatusAnalyticsManagerImpl", "Lcom/huami/snore/core/ext/IAppResource;", "getAppResource", "snore_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {
    @NotNull
    public static final Context getAppContext() {
        return (Context) ScopesKt.snoreDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    @NotNull
    public static final IAppResource getAppResource() {
        return (IAppResource) ScopesKt.snoreDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IAppResource.class), null, null);
    }

    @NotNull
    public static final IPageJumpManager getPageJumpManager() {
        return (IPageJumpManager) ScopesKt.snoreDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IPageJumpManager.class), null, null);
    }

    @NotNull
    public static final IPageStatusAnalyticsManager getPageStatusAnalyticsManagerImpl() {
        return (IPageStatusAnalyticsManager) ScopesKt.snoreDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IPageStatusAnalyticsManager.class), null, null);
    }

    @NotNull
    public static final UserInfo getUserInfo() {
        return (UserInfo) ScopesKt.snoreDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(UserInfo.class), null, null);
    }

    public static final /* synthetic */ <T> T withKoinGet() {
        Scope scopeSnoreDataScope = ScopesKt.snoreDataScope(GlobalContext.INSTANCE.get());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeSnoreDataScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }
}
