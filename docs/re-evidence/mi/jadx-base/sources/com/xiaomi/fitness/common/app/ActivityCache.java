package com.xiaomi.fitness.common.app;

import android.app.Activity;
import android.text.TextUtils;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u001b\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u0011H\u0086\u0002J\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014J\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/common/app/ActivityCache;", "", "<init>", "()V", AccountCertification.Source.SOURCE_TYPE_CACHE, "Ljava/util/LinkedHashMap;", "", "getCACHE", "()Ljava/util/LinkedHashMap;", LifecycleConstantKt.ACTION_PUT, "", "s", "life", "remove", "contains", "", "cls", "Ljava/lang/Class;", "Landroid/app/Activity;", "getLast", "", "get", "position", "", "getLifecycle", "key", MediaStoreUtil.MediaInfo.SIZE, "pid", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityCache {

    @NotNull
    public static final ActivityCache INSTANCE = new ActivityCache();

    @NotNull
    private static final LinkedHashMap<String, String> CACHE = new LinkedHashMap<>();

    private ActivityCache() {
    }

    public final boolean contains(@Nullable Class<? extends Activity> cls) {
        if (cls == null) {
            return false;
        }
        for (String str : CACHE.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            if (StringsKt__StringsJVMKt.startsWith$default(str, cls.getName() + ";", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Map.Entry<String, String> get(int position) {
        LinkedHashMap<String, String> linkedHashMap = CACHE;
        if (position > linkedHashMap.size() - 1) {
            return null;
        }
        int i = 0;
        for (Object obj : linkedHashMap.entrySet()) {
            int i2 = i + 1;
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            Map.Entry<String, String> entry = (Map.Entry) obj;
            if (i == position) {
                return entry;
            }
            i = i2;
        }
        return null;
    }

    @NotNull
    public final LinkedHashMap<String, String> getCACHE() {
        return CACHE;
    }

    @Nullable
    public final Map.Entry<String, String> getLast() {
        LinkedHashMap<String, String> linkedHashMap = CACHE;
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        try {
            Field declaredField = linkedHashMap.getClass().getDeclaredField("tail");
            declaredField.setAccessible(true);
            return (Map.Entry) declaredField.get(linkedHashMap);
        } catch (Exception unused) {
            return INSTANCE.get(CACHE.size() - 1);
        }
    }

    @Nullable
    public final String getLifecycle(@Nullable String key) {
        return CACHE.get(key);
    }

    public final synchronized void put(@NotNull String s, @NotNull String life) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(life, "life");
        if (TextUtils.isEmpty(s)) {
            return;
        }
        CACHE.put(s, life);
    }

    public final synchronized void remove(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (TextUtils.isEmpty(s)) {
            return;
        }
        CACHE.remove(s);
    }

    public final int size() {
        return CACHE.size();
    }

    public final int size(int pid) {
        if (pid == 0) {
            return 0;
        }
        int i = 0;
        for (String str : CACHE.keySet()) {
            Intrinsics.checkNotNullExpressionValue(str, "next(...)");
            if (StringsKt__StringsJVMKt.endsWith$default(str, ";" + pid, false, 2, null)) {
                i++;
            }
        }
        return i;
    }
}
