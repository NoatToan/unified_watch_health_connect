package com.xiaomi.wearable.yrn.components;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001aF\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u0001H\b2\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000e\u001a \u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u001a\u001a\u0010\u0011\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0016\u001a%\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"safeGetMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "safeGetArray", "Lcom/facebook/react/bridge/ReadableArray;", "safePutMap", "", "T", "Lcom/facebook/react/bridge/WritableMap;", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "safeGetString", "default", "safeGetInt", "", "safeGetDouble", "", "safeGetBoolean", "", "safeGetLong", "", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "components_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class YRNComponentsExtKt {
    @Nullable
    public static final ReadableArray safeGetArray(@NotNull ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!readableMap.hasKey(key)) {
            return null;
        }
        ReadableArray array = readableMap.getArray(key);
        Intrinsics.checkNotNull(array);
        return array;
    }

    public static final boolean safeGetBoolean(@NotNull ReadableMap readableMap, @NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return readableMap.hasKey(key) ? readableMap.getBoolean(key) : z;
    }

    public static /* synthetic */ boolean safeGetBoolean$default(ReadableMap readableMap, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return safeGetBoolean(readableMap, str, z);
    }

    public static final double safeGetDouble(@NotNull ReadableMap readableMap, @NotNull String key, double d) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return readableMap.hasKey(key) ? readableMap.getDouble(key) : d;
    }

    public static final int safeGetInt(@NotNull ReadableMap readableMap, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return readableMap.hasKey(key) ? readableMap.getInt(key) : i;
    }

    @Nullable
    public static final Long safeGetLong(@NotNull ReadableMap readableMap, @NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!readableMap.hasKey(key)) {
            return l;
        }
        String string = readableMap.getString(key);
        if (string != null) {
            return StringsKt__StringNumberConversionsKt.toLongOrNull(string);
        }
        return null;
    }

    public static /* synthetic */ Long safeGetLong$default(ReadableMap readableMap, String str, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return safeGetLong(readableMap, str, l);
    }

    @Nullable
    public static final ReadableMap safeGetMap(@NotNull ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!readableMap.hasKey(key)) {
            return null;
        }
        ReadableMap map = readableMap.getMap(key);
        Intrinsics.checkNotNull(map);
        return map;
    }

    @Nullable
    public static final String safeGetString(@NotNull ReadableMap readableMap, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(readableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!readableMap.hasKey(key)) {
            return str;
        }
        String string = readableMap.getString(key);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static /* synthetic */ String safeGetString$default(ReadableMap readableMap, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return safeGetString(readableMap, str, str2);
    }

    public static final <T> void safePutMap(@NotNull WritableMap writableMap, @NotNull String key, @Nullable T t, @NotNull Function2<? super WritableMap, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        if (t != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNull(writableMapCreateMap);
            block.invoke(writableMapCreateMap, t);
            writableMap.putMap(key, writableMapCreateMap);
        }
    }
}
