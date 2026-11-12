package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JK\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u000eH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "T", "", "()V", "serializers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "computeIfAbsent", "types", "Lkotlin/reflect/KType;", "producer", "Lkotlin/Function0;", "computeIfAbsent-gIAlu-s", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n72#3,2:211\n1#4:213\n1#4:214\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n*L\n199#1:207\n199#1:208,3\n200#1:211,2\n200#1:214\n*E\n"})
final class ParametrizedCacheEntry<T> {

    @NotNull
    private final ConcurrentHashMap<List<KTypeWrapper>, Result<KSerializer<T>>> serializers = new ConcurrentHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m2458computeIfAbsentgIAlus(@NotNull List<? extends KType> types, @NotNull Function0<? extends KSerializer<T>> producer) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(producer, "producer");
        List<? extends KType> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.serializers;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(producer.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM885boximpl = Result.m885boximpl(objM886constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultM885boximpl);
            obj = objPutIfAbsent == null ? resultM885boximpl : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).m895unboximpl();
    }
}
