package com.huami.userproperty;

import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.entity.FetchedRangeKey;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.Interceptor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012:\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0016RJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/userproperty/DbMigrationInterceptor;", "Lcom/huami/userproperty/service/interceptor/GetInterceptor;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;", "Lcom/huami/userproperty/service/interceptor/GetInterceptor$Param;", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "chain", "intercept", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "key", "api", "a", "Lkotlin/jvm/functions/Function2;", "propertyReader", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "b", "Lkotlin/Lazy;", "()Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "internalRepo", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class DbMigrationInterceptor implements GetInterceptor, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<String, String, String> propertyReader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy internalRepo;

    /* JADX WARN: Multi-variable type inference failed */
    public DbMigrationInterceptor(@NotNull Function2<? super String, ? super String, String> function2) {
        this.propertyReader = function2;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.internalRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<InternalLocalDataSource>() { // from class: com.huami.userproperty.DbMigrationInterceptor$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.datasource.InternalLocalDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InternalLocalDataSource invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), qualifier, objArr);
            }
        });
    }

    private final InternalLocalDataSource a() {
        return (InternalLocalDataSource) this.internalRepo.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.userproperty.service.interceptor.Interceptor
    @Nullable
    public LocalProperty intercept(@NotNull Interceptor.Chain<GetInterceptor.Param, LocalProperty> chain) {
        FetchedRangeKey fetchedRangeKey;
        LocalProperty localPropertyHandle = chain.handle(chain.params());
        if (localPropertyHandle != null) {
            return localPropertyHandle;
        }
        String registryApi = chain.params().getRegistryApi();
        String key = chain.params().getKey();
        List<FetchedRangeKey> allFetchedRangeKey = a().readAllFetchedRangeKey(registryApi);
        boolean z = true;
        if (!(allFetchedRangeKey instanceof Collection) || !allFetchedRangeKey.isEmpty()) {
            Iterator<T> it2 = allFetchedRangeKey.iterator();
            do {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                fetchedRangeKey = (FetchedRangeKey) it2.next();
            } while (!(Intrinsics.areEqual(registryApi, fetchedRangeKey.getApi()) && m.startsWith$default(key, fetchedRangeKey.getRangeKey(), false, 2, null)));
        } else {
            z = false;
            break;
        }
        if (z) {
            return localPropertyHandle;
        }
        a().saveLocal(key, registryApi, this.propertyReader.invoke(key, registryApi));
        return InternalLocalDataSource.DefaultImpls.readLocal$default(a(), key, null, 2, null);
    }
}
