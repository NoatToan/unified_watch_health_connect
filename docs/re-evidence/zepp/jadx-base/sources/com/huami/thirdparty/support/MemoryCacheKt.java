package com.huami.thirdparty.support;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.transport.httpsupport.model.DataItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001aH\u0010\r\u001a\u00020\f\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00022*\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t0\b\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function1;", "Lcom/huami/thirdparty/support/MemoryCache;", "Lkotlin/ExtensionFunctionType;", "body", "memory", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Pair;", "", "pairs", "", DataItem.HTTP_METHOD_PUT, "(Lcom/huami/thirdparty/support/MemoryCache;[Lkotlin/Pair;)V", "support_release"}, k = 2, mv = {1, 5, 1})
public final class MemoryCacheKt {
    public static final <R> R memory(@NotNull Function1<? super MemoryCache, ? extends R> function1) {
        return function1.invoke(MemoryCache.INSTANCE);
    }

    public static final /* synthetic */ <T> void put(MemoryCache memoryCache, Pair<String, ? extends T>... pairArr) {
        for (Pair<String, ? extends T> pair : pairArr) {
            MemoryCache.put(pair.getFirst(), pair.getSecond());
        }
    }
}
