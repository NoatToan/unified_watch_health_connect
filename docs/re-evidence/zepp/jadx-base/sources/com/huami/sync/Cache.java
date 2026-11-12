package com.huami.sync;

import androidx.exifinterface.media.ExifInterface;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.huami.watch.transport.httpsupport.model.DataItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JA\u0010\u000e\u001a\u00020\u0005\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\n2*\u0010\r\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\f0\u000b\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\fH\u0082\b¨\u0006\u000f"}, d2 = {"Lcom/huami/sync/Cache;", "", "", "key", "value", "", "cache", "getCache", "removeCache", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "Lkotlin/Pair;", "pairs", DataItem.HTTP_METHOD_PUT, "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public interface Cache {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/MemoryCache;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<MemoryCache, Unit> {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super(1);
                this.a = str;
                this.b = str2;
            }

            public final void a(@NotNull MemoryCache memoryCache) {
                Pair[] pairArr = {TuplesKt.to(this.a, this.b)};
                for (int i = 0; i < 1; i++) {
                    Pair pair = pairArr[i];
                    MemoryCache.put((String) pair.getFirst(), pair.getSecond());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MemoryCache memoryCache) {
                a(memoryCache);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<KvPersistence, Unit> {
            public final /* synthetic */ Cache a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Cache cache, String str, String str2) {
                super(1);
                this.a = cache;
                this.b = str;
                this.c = str2;
            }

            public final void a(@NotNull KvPersistence kvPersistence) {
                Pair[] pairArr = {TuplesKt.to(this.b, this.c)};
                for (int i = 0; i < 1; i++) {
                    Pair pair = pairArr[i];
                    kvPersistence.setValue((String) pair.getFirst(), pair.getSecond());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KvPersistence kvPersistence) {
                a(kvPersistence);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<KvPersistence, String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(1);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@NotNull KvPersistence kvPersistence) {
                return (String) kvPersistence.getValue(this.a, "");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/MemoryCache;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<MemoryCache, Unit> {
            public final /* synthetic */ String a;
            public final /* synthetic */ Ref.ObjectRef<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, Ref.ObjectRef<String> objectRef) {
                super(1);
                this.a = str;
                this.b = objectRef;
            }

            public final void a(@NotNull MemoryCache memoryCache) {
                Pair[] pairArr = {TuplesKt.to(this.a, this.b.element)};
                for (int i = 0; i < 1; i++) {
                    Pair pair = pairArr[i];
                    MemoryCache.put((String) pair.getFirst(), pair.getSecond());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MemoryCache memoryCache) {
                a(memoryCache);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/MemoryCache;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function1<MemoryCache, String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(1);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@NotNull MemoryCache memoryCache) {
                String str = this.a;
                Object obj = MemoryCache.INSTANCE.getCacheOperator().get(str);
                if (obj != null) {
                    if (obj instanceof CacheData) {
                        CacheData cacheData = (CacheData) obj;
                        if (cacheData.isExpired()) {
                            MemoryCache.remove(str);
                        } else {
                            obj = cacheData.entry;
                            if (!(obj instanceof String)) {
                            }
                        }
                        obj = null;
                    } else {
                        obj = (String) obj;
                    }
                }
                return (String) obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/MemoryCache;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function1<MemoryCache, Unit> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super(1);
                this.a = str;
            }

            public final void a(@NotNull MemoryCache memoryCache) {
                MemoryCache.remove(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MemoryCache memoryCache) {
                a(memoryCache);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function1<KvPersistence, Unit> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super(1);
                this.a = str;
            }

            public final void a(@NotNull KvPersistence kvPersistence) {
                kvPersistence.removeValuesForKeys(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KvPersistence kvPersistence) {
                a(kvPersistence);
                return Unit.INSTANCE;
            }
        }

        private static <R> R a(Cache cache, Function1<? super KvPersistence, ? extends R> function1) {
            return function1.invoke(KvKit.getKvPersistence$default("mmkv_realtime_transmission", false, 2, null));
        }

        private static /* synthetic */ <T> void b(Cache cache, KvPersistence kvPersistence, Pair<String, ? extends T>... pairArr) {
            for (Pair<String, ? extends T> pair : pairArr) {
                kvPersistence.setValue(pair.getFirst(), pair.getSecond());
            }
        }

        public static void cache(@NotNull Cache cache, @NotNull String str, @NotNull String str2) {
            MemoryCacheKt.memory(new a(str, str2));
            a(cache, new b(cache, str, str2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        @NotNull
        public static String getCache(@NotNull Cache cache, @NotNull String str) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? Memory = MemoryCacheKt.memory(new e(str));
            objectRef.element = Memory;
            if (Memory == 0) {
                ?? A = a(cache, new c(str));
                objectRef.element = A;
                if (((CharSequence) A).length() > 0) {
                    MemoryCacheKt.memory(new d(str, objectRef));
                }
            }
            return (String) objectRef.element;
        }

        public static void removeCache(@NotNull Cache cache, @NotNull String str) {
            MemoryCacheKt.memory(new f(str));
            a(cache, new g(str));
        }
    }

    void cache(@NotNull String key, @NotNull String value);

    @NotNull
    String getCache(@NotNull String key);

    void removeCache(@NotNull String key);
}
