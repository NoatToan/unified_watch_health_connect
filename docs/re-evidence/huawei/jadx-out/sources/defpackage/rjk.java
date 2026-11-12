package defpackage;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import health.compact.a.Services;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes17.dex */
public class rjk {
    static /* synthetic */ Map a(Map map) {
        return map;
    }

    public static CompletableFuture<Optional<ResourceResultInfo>> d(final int i, long j) {
        final CompletableFuture<Map<Integer, ResourceResultInfo>> completableFutureC = c(i);
        final CompletableFuture completableFutureThenComposeAsync = lqw.c(Integer.valueOf(i), j, TimeUnit.MILLISECONDS, new CompletableFuture()).thenComposeAsync(new Function() { // from class: rjn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rjk.d(((Integer) obj).intValue());
            }
        }, (Executor) ThreadPoolManager.c());
        return completableFutureC.applyToEither((CompletionStage<? extends Map<Integer, ResourceResultInfo>>) completableFutureThenComposeAsync, (Function<? super Map<Integer, ResourceResultInfo>, U>) new Function() { // from class: rjo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rjk.a((Map) obj);
            }
        }).thenApply((Function) new Function<Map<Integer, ResourceResultInfo>, Optional<ResourceResultInfo>>() { // from class: rjk.3
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Optional<ResourceResultInfo> apply(Map<Integer, ResourceResultInfo> map) {
                if (completableFutureC.isDone()) {
                    completableFutureThenComposeAsync.cancel(false);
                }
                if (CollectionUtils.c(map)) {
                    return Optional.empty();
                }
                return Optional.ofNullable(map.get(Integer.valueOf(i)));
            }
        }).exceptionally(new Function() { // from class: rjp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return rjk.d((Throwable) obj);
            }
        });
    }

    static /* synthetic */ Optional d(Throwable th) {
        lqw.e("MarketResourceUtils", "getResourceResultInfo applyToEither", th);
        return Optional.empty();
    }

    public static CompletableFuture<Map<Integer, ResourceResultInfo>> c(final int i) {
        return CompletableFuture.completedFuture(Integer.valueOf(i)).thenComposeAsync((Function) new Function<Integer, CompletionStage<Map<Integer, ResourceResultInfo>>>() { // from class: rjk.5
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public CompletionStage<Map<Integer, ResourceResultInfo>> apply(Integer num) {
                final CompletableFuture completableFuture = new CompletableFuture();
                Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).getResourceResultInfo(i);
                resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: rju
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        completableFuture.complete((Map) obj);
                    }
                });
                resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: rjv
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        completableFuture.completeExceptionally(exc);
                    }
                });
                return completableFuture;
            }
        }, (Executor) ThreadPoolManager.c()).whenComplete(new BiConsumer() { // from class: rjq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                rjk.d((Map) obj, (Throwable) obj2);
            }
        });
    }

    static /* synthetic */ void d(Map map, Throwable th) {
        if (th != null) {
            lqw.e("MarketResourceUtils", "getInCloudFuture whenComplete", th);
        }
    }

    public static CompletableFuture<Map<Integer, ResourceResultInfo>> d(final int i) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: rjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).acquireResourceInfoFromDb(i);
            }
        }, ThreadPoolManager.c()).whenComplete(new BiConsumer() { // from class: rjs
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                rjk.b((Map) obj, (Throwable) obj2);
            }
        });
    }

    static /* synthetic */ void b(Map map, Throwable th) {
        if (th != null) {
            lqw.e("MarketResourceUtils", "getInLocalFuture whenComplete", th);
        }
    }
}
