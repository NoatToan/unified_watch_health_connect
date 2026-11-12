package com.xiaomi.fitness.cache.sp.bindings;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/bindings/Clearable;", "", CervicalMucusRecord.Appearance.CLEAR, "", "thisRef", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "property", "Lkotlin/reflect/KProperty;", "clearCache", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Clearable {
    void clear(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property);

    void clearCache();
}
