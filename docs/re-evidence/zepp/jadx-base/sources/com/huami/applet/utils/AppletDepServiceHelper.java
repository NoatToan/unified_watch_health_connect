package com.huami.applet.utils;

import com.huami.applet.applet_dependent_service.AppletDepService;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/applet/utils/AppletDepServiceHelper;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/applet/applet_dependent_service/AppletDepService;", "getDepService", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppletDepServiceHelper implements KoinComponent {

    @NotNull
    public static final AppletDepServiceHelper INSTANCE = new AppletDepServiceHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AppletDepServiceHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Get applet dependent service.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Get applet dependent service exception: ", this.a);
        }
    }

    private AppletDepServiceHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final AppletDepService getDepService() {
        Scope rootScope;
        KClass<?> orCreateKotlinClass;
        try {
            HMLog.debug(TAG, a.a);
            if (this instanceof KoinScopeComponent) {
                rootScope = ((KoinScopeComponent) this).getScope();
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppletDepService.class);
            } else {
                rootScope = getKoin().getScopeRegistry().getRootScope();
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppletDepService.class);
            }
            return (AppletDepService) rootScope.get(orCreateKotlinClass, null, null);
        } catch (Exception e) {
            HMLog.error$default(TAG, null, null, new b(e), 6, null);
            return null;
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
