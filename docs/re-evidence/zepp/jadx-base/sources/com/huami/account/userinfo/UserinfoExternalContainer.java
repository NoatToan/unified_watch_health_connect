package com.huami.account.userinfo;

import android.content.Context;
import com.huami.account.service.proxy.KoinComponentAdapter;
import com.huami.account.userinfo.di.IUserinfoDelegate;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/account/userinfo/UserinfoExternalContainer;", "Lcom/huami/account/service/proxy/KoinComponentAdapter;", "Landroid/content/Context;", "a", "Lkotlin/Lazy;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lcom/huami/account/userinfo/di/IUserinfoDelegate;", "b", "getUserinfoDelegate", "()Lcom/huami/account/userinfo/di/IUserinfoDelegate;", "userinfoDelegate", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class UserinfoExternalContainer implements KoinComponentAdapter {

    @NotNull
    public static final UserinfoExternalContainer INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy appContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy userinfoDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final UserinfoExternalContainer userinfoExternalContainer = new UserinfoExternalContainer();
        INSTANCE = userinfoExternalContainer;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        appContext = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Context>() { // from class: com.huami.account.userinfo.UserinfoExternalContainer$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                KoinComponent koinComponent = userinfoExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        userinfoDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<IUserinfoDelegate>() { // from class: com.huami.account.userinfo.UserinfoExternalContainer$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.userinfo.di.IUserinfoDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IUserinfoDelegate invoke() {
                KoinComponent koinComponent = userinfoExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IUserinfoDelegate.class), objArr2, objArr3);
            }
        });
    }

    private UserinfoExternalContainer() {
    }

    @NotNull
    public final Context getAppContext() {
        return (Context) appContext.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final IUserinfoDelegate getUserinfoDelegate() {
        return (IUserinfoDelegate) userinfoDelegate.getValue();
    }
}
