package com.huami.sync;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.alipay.sdk.m.n.a;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J%\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0007J\b\u0010\u0011\u001a\u00020\u0006H\u0007J(\u0010\u0013\u001a\u00020\u0012\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007R\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR)\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010!8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/huami/sync/MemoryCache;", "", "V", "", "key", "value", "", DataItem.HTTP_METHOD_PUT, "(Ljava/lang/String;Ljava/lang/Object;)V", "", SDKConstants.PARAM_EXPIRATION_TIME, "(Ljava/lang/String;Ljava/lang/Object;J)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "remove", "fuzzyKey", "removeFuzzy", "clear", "", "safeSizeOf", "(Ljava/lang/String;Ljava/lang/Object;)I", "sizeOf", "Ljava/io/Serializable;", "serial", "Landroid/graphics/Bitmap;", "bitmap", "a", LogUtil.I, "MAX_NORMAL_CACHE_SIZE_IN_MB", "b", "SIZE_UNIT_MB", "c", "MAX_NORMAL_CACHE_SIZE", "Landroid/util/LruCache;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getCacheOperator", "()Landroid/util/LruCache;", "cacheOperator", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class MemoryCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MAX_NORMAL_CACHE_SIZE_IN_MB = 16;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int SIZE_UNIT_MB = 1048576;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int MAX_NORMAL_CACHE_SIZE = 16777216;

    @NotNull
    public static final MemoryCache INSTANCE = new MemoryCache();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy cacheOperator = LazyKt__LazyJVMKt.lazy(new Function0<MemoryCache$cacheOperator$2.AnonymousClass1>() { // from class: com.huami.sync.MemoryCache$cacheOperator$2
        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.sync.MemoryCache$cacheOperator$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            return new LruCache<String, Object>() { // from class: com.huami.sync.MemoryCache$cacheOperator$2.1
                @Override // android.util.LruCache
                public int sizeOf(@NotNull String key, @NotNull Object value) throws Throwable {
                    MemoryCache memoryCache = MemoryCache.INSTANCE;
                    int iSizeOf = MemoryCache.sizeOf(key, value);
                    if (iSizeOf >= 0) {
                        return iSizeOf;
                    }
                    throw new IllegalStateException(("Negative size: " + key + a.h + value).toString());
                }
            };
        }
    });

    private MemoryCache() {
    }

    @JvmStatic
    public static final void clear() {
        INSTANCE.getCacheOperator().evictAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final /* synthetic */ <V> V get(String key) {
        V v = (V) INSTANCE.getCacheOperator().get(key);
        if (v == 0) {
            return v;
        }
        if (!(v instanceof CacheData)) {
            Intrinsics.reifiedOperationMarker(1, "V");
            return v;
        }
        CacheData cacheData = (CacheData) v;
        if (cacheData.isExpired()) {
            remove(key);
            return null;
        }
        V v2 = (V) cacheData.entry;
        Intrinsics.reifiedOperationMarker(3, "V");
        if (v2 instanceof Object) {
            return v2;
        }
        return null;
    }

    @JvmStatic
    public static final <V> void put(@NotNull String key, V value) {
        INSTANCE.getCacheOperator().put(key, value);
    }

    @JvmStatic
    public static final void remove(@NotNull String key) {
        INSTANCE.getCacheOperator().remove(key);
    }

    @JvmStatic
    public static final void removeFuzzy(@NotNull String fuzzyKey) {
        Map<String, Object> mapSnapshot = INSTANCE.getCacheOperator().snapshot();
        ArrayList arrayList = new ArrayList();
        for (String str : mapSnapshot.keySet()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) fuzzyKey, false, 2, (Object) null)) {
                arrayList.add(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            INSTANCE.getCacheOperator().remove((String) it2.next());
        }
    }

    @JvmStatic
    public static final /* synthetic */ <V> int safeSizeOf(String key, V value) throws Throwable {
        int iSizeOf = sizeOf(key, value);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + key + a.h + value).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <V> int sizeOf(@NotNull String key, V value) throws Throwable {
        long jSizeOf;
        int iSizeOf = 1;
        if (value instanceof String) {
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
            return ((String) value).getBytes(Charsets.UTF_8).length;
        }
        if (value instanceof Bitmap) {
            Objects.requireNonNull(value, "null cannot be cast to non-null type android.graphics.Bitmap");
            jSizeOf = sizeOf((Bitmap) value);
        } else {
            if (!(value instanceof Serializable)) {
                if (!(value instanceof Iterable)) {
                    return 1;
                }
                Iterator it2 = ((Iterable) value).iterator();
                while (it2.hasNext()) {
                    iSizeOf += sizeOf(key, it2.next());
                }
                return iSizeOf;
            }
            Objects.requireNonNull(value, "null cannot be cast to non-null type java.io.Serializable");
            jSizeOf = sizeOf((Serializable) value);
        }
        return (int) jSizeOf;
    }

    @NotNull
    public final LruCache<String, Object> getCacheOperator() {
        return (LruCache) cacheOperator.getValue();
    }

    @JvmStatic
    public static final <V> void put(@NotNull String key, V value, long expirationTime) {
        INSTANCE.getCacheOperator().put(key, new CacheData(value, expirationTime, System.currentTimeMillis(), expirationTime < 0));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0025 -> B:58:0x004a). Please report as a decompilation issue!!! */
    @JvmStatic
    public static final long sizeOf(@Nullable Serializable serial) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (serial == null) {
            return 0L;
        }
        long size = -1;
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream2.writeObject(serial);
                            objectOutputStream2.flush();
                            size = byteArrayOutputStream.size();
                            objectOutputStream2.close();
                            byteArrayOutputStream.close();
                        } catch (FileNotFoundException e) {
                            e = e;
                            e.printStackTrace();
                            throw new RuntimeException(e.getMessage());
                        } catch (NotSerializableException e2) {
                            e = e2;
                            e.printStackTrace();
                            throw new RuntimeException("Cache object does not implement serializable interface");
                        } catch (IOException e3) {
                            e = e3;
                            objectOutputStream = objectOutputStream2;
                            e.printStackTrace();
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            objectOutputStream = objectOutputStream2;
                            try {
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e5) {
                        e = e5;
                    } catch (NotSerializableException e6) {
                        e = e6;
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        } catch (FileNotFoundException e9) {
            e = e9;
        } catch (NotSerializableException e10) {
            e = e10;
        } catch (IOException e11) {
            e = e11;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            objectOutputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
        return size;
    }

    @JvmStatic
    public static final long sizeOf(@Nullable Bitmap bitmap) throws Throwable {
        if (bitmap == null) {
            return 0L;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                long size = byteArrayOutputStream2.size();
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return size;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
