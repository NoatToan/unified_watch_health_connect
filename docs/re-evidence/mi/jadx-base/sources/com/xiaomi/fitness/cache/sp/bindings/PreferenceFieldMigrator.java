package com.xiaomi.fitness.cache.sp.bindings;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00052\u00020\u0006BG\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\"\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0096\u0002¢\u0006\u0002\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001dJ\n\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/bindings/PreferenceFieldMigrator;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "Lcom/xiaomi/fitness/cache/sp/bindings/Clearable;", "Lcom/xiaomi/fitness/cache/sp/bindings/Keyable;", "clazz", "Lkotlin/reflect/KClass;", "type", "Ljava/lang/reflect/Type;", "default", "key", "", "srcId", "srcKey", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "", "thisRef", "property", "Lkotlin/reflect/KProperty;", "clearCache", "getValue", "(Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "value", "(Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "getKey", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreferenceFieldMigrator<T> implements ReadWriteProperty<PreferenceSupport, T>, Clearable, Keyable {

    @NotNull
    private final KClass<T> clazz;

    @NotNull
    private final T default;

    @Nullable
    private final String key;

    @Nullable
    private final String srcId;

    @Nullable
    private final String srcKey;

    @NotNull
    private final Type type;

    public PreferenceFieldMigrator(@NotNull KClass<T> clazz, @NotNull Type type, @NotNull T t, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(t, "default");
        this.clazz = clazz;
        this.type = type;
        this.default = t;
        this.key = str;
        this.srcId = str2;
        this.srcKey = str3;
    }

    @Override // com.xiaomi.fitness.cache.sp.bindings.Clearable
    public void clear(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        setValue2(thisRef, property, (Object) this.default);
    }

    @Override // com.xiaomi.fitness.cache.sp.bindings.Clearable
    public void clearCache() {
    }

    @Override // com.xiaomi.fitness.cache.sp.bindings.Keyable
    @Nullable
    public String getKey() {
        return this.key;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((PreferenceSupport) obj, (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(PreferenceSupport preferenceSupport, KProperty kProperty, Object obj) {
        setValue2(preferenceSupport, (KProperty<?>) kProperty, obj);
    }

    @NotNull
    public T getValue(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return (T) SpExtKt.getAndMigrateValue(thisRef.getPreferences(), SpExtKt.getKey(this.key, property), this.clazz, this.type, this.default, thisRef.getSpName(), this.srcId, this.srcKey);
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        SpExtKt.putValueInSP(thisRef, this.clazz, value, SpExtKt.getKey(this.key, property));
    }

    public /* synthetic */ PreferenceFieldMigrator(KClass kClass, Type type, Object obj, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, type, obj, str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
