package com.xiaomi.fitness.cache.sp.bindings;

import android.content.SharedPreferences;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.cache.sp.PreferenceReceiver;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.SpExtKt;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00032\u00020\u00052\u00020\u0006B'\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J$\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0096\u0002¢\u0006\u0002\u0010\"J#\u0010#\u001a\u0004\u0018\u00018\u00002\u0006\u0010$\u001a\u00020%2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0002\u0010&J,\u0010'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010)J+\u0010*\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010)J#\u0010+\u001a\u0004\u0018\u00018\u00002\u0006\u0010$\u001a\u00020%2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0002\u0010&J\n\u0010,\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/bindings/PreferenceFieldBinderNullable;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "Lcom/xiaomi/fitness/cache/sp/bindings/Clearable;", "Lcom/xiaomi/fitness/cache/sp/bindings/Keyable;", "clazz", "Lkotlin/reflect/KClass;", "type", "Ljava/lang/reflect/Type;", "key", "", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/String;)V", CervicalMucusRecord.Appearance.CLEAR, "", "thisRef", "property", "Lkotlin/reflect/KProperty;", "clearCache", "propertySet", "", "getPropertySet", "()Z", "setPropertySet", "(Z)V", "field", "getField", "()Ljava/lang/Object;", "setField", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getValue", "(Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "readAndSetValue", "pref", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "value", "(Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "saveNewValue", "readValue", "getKey", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreferenceFieldBinderNullable<T> implements ReadWriteProperty<PreferenceSupport, T>, Clearable, Keyable {

    @NotNull
    private final KClass<T> clazz;

    @Nullable
    private T field;

    @Nullable
    private final String key;
    private boolean propertySet;

    @NotNull
    private final Type type;

    public PreferenceFieldBinderNullable(@NotNull KClass<T> clazz, @NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        this.clazz = clazz;
        this.type = type;
        this.key = str;
    }

    private final T readAndSetValue(SharedPreferences pref, KProperty<?> property) {
        T value = readValue(pref, property);
        this.field = value;
        this.propertySet = true;
        return value;
    }

    private final T readValue(SharedPreferences pref, KProperty<?> property) {
        String key = SpExtKt.getKey(this.key, property);
        if (pref.contains(key)) {
            return (T) SpExtKt.getFromPreference(pref, this.clazz, this.type, key);
        }
        return null;
    }

    private final void saveNewValue(PreferenceSupport pref, KProperty<?> property, T value) {
        String key = SpExtKt.getKey(this.key, property);
        if (value != null) {
            SpExtKt.putValueInSP(pref, this.clazz, value, key);
        } else {
            pref.getPreferences().edit().remove(key).apply();
            PreferenceReceiver.Companion.sendBroadcast$default(PreferenceReceiver.INSTANCE, pref, key, null, 4, null);
        }
    }

    @Override // com.xiaomi.fitness.cache.sp.bindings.Clearable
    public void clear(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        setValue2(thisRef, property, (Object) null);
    }

    @Override // com.xiaomi.fitness.cache.sp.bindings.Clearable
    public void clearCache() {
        this.propertySet = false;
        this.field = null;
    }

    @Nullable
    public final T getField() {
        return this.field;
    }

    @Override // com.xiaomi.fitness.cache.sp.bindings.Keyable
    @Nullable
    public String getKey() {
        return this.key;
    }

    public final boolean getPropertySet() {
        return this.propertySet;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((PreferenceSupport) obj, (KProperty<?>) kProperty);
    }

    public final void setField(@Nullable T t) {
        this.field = t;
    }

    public final void setPropertySet(boolean z) {
        this.propertySet = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(PreferenceSupport preferenceSupport, KProperty kProperty, Object obj) {
        setValue2(preferenceSupport, (KProperty<?>) kProperty, obj);
    }

    @Nullable
    public T getValue(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return readAndSetValue(thisRef.getPreferences(), property);
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(@NotNull PreferenceSupport thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        saveNewValue(thisRef, property, value);
    }
}
