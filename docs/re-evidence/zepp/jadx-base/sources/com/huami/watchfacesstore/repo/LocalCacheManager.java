package com.huami.watchfacesstore.repo;

import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.room.WatchFaceInfo;
import com.huami.watchfacesstore.ui.repo.WatchFaceRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\n\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/watchfacesstore/repo/LocalCacheManager;", "", "", "", "", "getLocalVersions", "", "observerLocalData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "maps", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "b", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", CommonLanguageSettingFragment.KEY_REPO, "c", "()Ljava/lang/String;", "deviceId", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class LocalCacheManager {

    @NotNull
    public static final LocalCacheManager INSTANCE = new LocalCacheManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<Integer, String> maps = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return KoinExtKt.getDeviceInfo().getDeviceId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return CollectionsKt___CollectionsKt.joinToString$default(LocalCacheManager.maps.entrySet(), ",", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        repo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchFaceRepo>() { // from class: com.huami.watchfacesstore.repo.LocalCacheManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.ui.repo.WatchFaceRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WatchFaceRepo invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WatchFaceRepo.class), qualifier, objArr);
            }
        });
        deviceId = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private LocalCacheManager() {
    }

    private final String a() {
        return (String) deviceId.getValue();
    }

    private final WatchFaceRepo b() {
        return (WatchFaceRepo) repo.getValue();
    }

    @NotNull
    public final Map<Integer, String> getLocalVersions() {
        return maps;
    }

    @Nullable
    public final Object observerLocalData(@NotNull Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.flowOn(b().getLocalDataFlow(a()), Dispatchers.getIO()).collect(new FlowCollector<List<? extends WatchFaceInfo>>() { // from class: com.huami.watchfacesstore.repo.LocalCacheManager$observerLocalData$$inlined$collect$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public Object emit(List<? extends WatchFaceInfo> list, @NotNull Continuation<? super Unit> continuation2) {
                LocalCacheManager.maps.clear();
                for (WatchFaceInfo watchFaceInfo : list) {
                    LocalCacheManager.maps.put(Boxing.boxInt(watchFaceInfo.getId()), watchFaceInfo.getVersion());
                }
                HMLog.info("LocalCacheManager", LocalCacheManager.b.a);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
