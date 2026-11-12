package com.xiaomi.fitness.cache.sp;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.tencent.mmkv.MMKV;
import com.xiaomi.fitness.cache.sp.bindings.Keyable;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.KCallablesJvm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001aG\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0005*\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\t0\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u0001H\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000e\u001a;\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0005*\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0005*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\t*\u0002H\tH\u0002¢\u0006\u0002\u0010\u0013\u001a\b\u0010\u0014\u001a\u00020\u0015H\u0002\u001a'\u0010\u0016\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003H\u0002¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000\u001a\u000e\u0010\u0018\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u001c\u001a=\u0010\u001d\u001a\u00020\u001e\"\b\b\u0000\u0010\t*\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\u0006\u0010\u0004\u001a\u0002H\t2\u0006\u0010!\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\"\u001ac\u0010#\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u0005*\u00020\n2\u0006\u0010$\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u0002H\t2\b\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\u0010(\u001aa\u0010)\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0005*\u00020\n2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"putValue", "Landroid/content/SharedPreferences$Editor;", "clazz", "Lkotlin/reflect/KClass;", "value", "", "key", "", "getFromPreference", "T", "Landroid/content/SharedPreferences;", "type", "Ljava/lang/reflect/Type;", "default", "(Landroid/content/SharedPreferences;Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/content/SharedPreferences;Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;", "deserialize", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "getSerializer", "Lcom/xiaomi/fitness/cache/sp/GsonSerializer;", "getDefault", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getKey", "keySet", "property", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/KProperty0;", "putValueInSP", "", "thisRef", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "keyName", "(Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;Lkotlin/reflect/KClass;Ljava/lang/Object;Ljava/lang/String;)V", "getAndMigrateValue", "dstKey", "dstId", "srcId", "srcKey", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getAndMigrateNullableValue", "(Landroid/content/SharedPreferences;Lkotlin/reflect/KProperty;Lkotlin/reflect/KClass;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "cache_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpExtKt {
    private static final <T> T deserialize(String str, Type type) {
        T t = (T) getSerializer().deserialize(str, type);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Nullable
    public static final <T> T getAndMigrateNullableValue(@NotNull SharedPreferences sharedPreferences, @NotNull KProperty<?> property, @NotNull KClass<T> clazz, @NotNull Type type, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Object fromPreference;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        String key = getKey(str, property);
        if (sharedPreferences.contains(key)) {
            return (T) getFromPreference(sharedPreferences, clazz, type, key);
        }
        if ((str2 != null && str2.length() != 0) || (str3 != null && str3.length() != 0)) {
            if ((str2 != null && str2.length() != 0) || str3 == null || str3.length() == 0) {
                MMKV mmkvG = MMKV.G(str2, 2);
                if (str3 == null || str3.length() == 0) {
                    str3 = key;
                }
                if (mmkvG.contains(str3)) {
                    Intrinsics.checkNotNull(mmkvG);
                    fromPreference = getFromPreference(mmkvG, clazz, type, str3);
                    Intrinsics.checkNotNull(fromPreference, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateNullableValue");
                    mmkvG.remove(str3);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
                    putValue(editorEdit, clazz, fromPreference, key).apply();
                    return (T) fromPreference;
                }
            } else if (sharedPreferences.contains(str3)) {
                fromPreference = getFromPreference(sharedPreferences, clazz, type, str3);
                Intrinsics.checkNotNull(fromPreference, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateNullableValue");
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.remove(str3);
                Intrinsics.checkNotNull(editorEdit2);
                putValue(editorEdit2, clazz, fromPreference, key);
                editorEdit2.apply();
                return (T) fromPreference;
            }
        }
        return null;
    }

    @NotNull
    public static final <T> T getAndMigrateValue(@NotNull SharedPreferences sharedPreferences, @NotNull String dstKey, @NotNull KClass<T> clazz, @NotNull Type type, @NotNull T t, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Object fromPreference;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(dstKey, "dstKey");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(t, "default");
        if (sharedPreferences.contains(dstKey) || (((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0 || Intrinsics.areEqual(str3, dstKey))) || (Intrinsics.areEqual(str2, str) && Intrinsics.areEqual(str3, dstKey)))) {
            T t2 = (T) getFromPreference(sharedPreferences, clazz, type, t, dstKey);
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateValue");
            return t2;
        }
        if ((str2 != null && str2.length() != 0) || str3 == null || str3.length() == 0) {
            MMKV mmkvG = MMKV.G(str2, 2);
            if (str3 == null || str3.length() == 0) {
                str3 = dstKey;
            }
            if (!mmkvG.contains(str3)) {
                T t3 = (T) getFromPreference(sharedPreferences, clazz, type, t, dstKey);
                Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateValue");
                return t3;
            }
            Intrinsics.checkNotNull(mmkvG);
            fromPreference = getFromPreference(mmkvG, clazz, type, str3);
            Intrinsics.checkNotNull(fromPreference, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateValue");
            mmkvG.remove(str3);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
            putValue(editorEdit, clazz, fromPreference, dstKey).apply();
        } else {
            if (!sharedPreferences.contains(str3)) {
                T t4 = (T) getFromPreference(sharedPreferences, clazz, type, t, dstKey);
                Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateValue");
                return t4;
            }
            fromPreference = getFromPreference(sharedPreferences, clazz, type, str3);
            Intrinsics.checkNotNull(fromPreference, "null cannot be cast to non-null type T of com.xiaomi.fitness.cache.sp.SpExtKt.getAndMigrateValue");
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.remove(str3);
            Intrinsics.checkNotNull(editorEdit2);
            putValue(editorEdit2, clazz, fromPreference, dstKey);
            editorEdit2.apply();
        }
        return (T) fromPreference;
    }

    private static final <T> T getDefault(KClass<T> kClass) {
        Object objValueOf;
        String simpleName = kClass.getSimpleName();
        if (simpleName != null) {
            switch (simpleName) {
                case "Int":
                    objValueOf = -1;
                    break;
                case "Long":
                    objValueOf = -1L;
                    break;
                case "Float":
                    objValueOf = Float.valueOf(-1.0f);
                    break;
                case "Boolean":
                    objValueOf = Boolean.FALSE;
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            objValueOf = null;
        }
        if (objValueOf == null) {
            return null;
        }
        return (T) objValueOf;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T getFromPreference(@NotNull SharedPreferences sharedPreferences, @NotNull KClass<? extends T> clazz, @NotNull Type type, @Nullable T t, @NotNull String key) {
        T t2;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        String simpleName = clazz.getSimpleName();
        if (simpleName != null) {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals("String")) {
                        T t3 = (T) sharedPreferences.getString(key, t instanceof String ? (String) t : null);
                        if (t3 == null) {
                            return null;
                        }
                        return t3;
                    }
                    break;
                case 73679:
                    if (simpleName.equals("Int")) {
                        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Int");
                        return (T) Integer.valueOf(sharedPreferences.getInt(key, ((Integer) t).intValue()));
                    }
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Long");
                        return (T) Long.valueOf(sharedPreferences.getLong(key, ((Long) t).longValue()));
                    }
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Float");
                        return (T) Float.valueOf(sharedPreferences.getFloat(key, ((Float) t).floatValue()));
                    }
                    break;
                case 1729365000:
                    if (simpleName.equals("Boolean")) {
                        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlin.Boolean");
                        return (T) Boolean.valueOf(sharedPreferences.getBoolean(key, ((Boolean) t).booleanValue()));
                    }
                    break;
            }
        }
        String string = sharedPreferences.getString(key, null);
        return (string == null || (t2 = (T) deserialize(string, type)) == null) ? t : t2;
    }

    @NotNull
    public static final String getKey(@Nullable String str, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (str != null) {
            return str;
        }
        String name = property.getName();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return "key_" + lowerCase;
    }

    private static final GsonSerializer getSerializer() {
        return new GsonSerializer(new Gson());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    @NotNull
    public static final SharedPreferences.Editor putValue(@NotNull SharedPreferences.Editor editor, @NotNull KClass<?> clazz, @NotNull Object value, @NotNull String key) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        String simpleName = clazz.getSimpleName();
        if (simpleName != null) {
            switch (simpleName) {
                case "String":
                    editor.putString(key, (String) value);
                    break;
                case "Int":
                    editor.putInt(key, ((Integer) value).intValue());
                    break;
                case "Long":
                    editor.putLong(key, ((Long) value).longValue());
                    break;
                case "Float":
                    editor.putFloat(key, ((Float) value).floatValue());
                    break;
                case "Boolean":
                    editor.putBoolean(key, ((Boolean) value).booleanValue());
                    break;
                default:
                    editor.putString(key, serialize(value));
                    break;
            }
        } else {
            editor.putString(key, serialize(value));
        }
        return editor;
    }

    public static final <T> void putValueInSP(@NotNull PreferenceSupport thisRef, @NotNull KClass<T> clazz, @NotNull T value, @NotNull String keyName) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        SharedPreferences.Editor editorEdit = thisRef.getPreferences().edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        putValue(editorEdit, clazz, value, keyName).apply();
        PreferenceReceiver.Companion.sendBroadcast$default(PreferenceReceiver.INSTANCE, thisRef, keyName, null, 4, null);
    }

    private static final <T> String serialize(T t) {
        return getSerializer().serialize(t);
    }

    @NotNull
    public static final String getKey(@NotNull KProperty0<?> kProperty0) {
        Intrinsics.checkNotNullParameter(kProperty0, "<this>");
        KCallablesJvm.setAccessible(kProperty0, true);
        if (kProperty0.getDelegate() instanceof Keyable) {
            Object delegate = kProperty0.getDelegate();
            Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type com.xiaomi.fitness.cache.sp.bindings.Keyable");
            return getKey(((Keyable) delegate).getKey(), kProperty0);
        }
        return getKey(null, kProperty0);
    }

    @Nullable
    public static final <T> T getFromPreference(@NotNull SharedPreferences sharedPreferences, @NotNull KClass<T> clazz, @NotNull Type type, @NotNull String key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) getFromPreference(sharedPreferences, clazz, type, getDefault(clazz), key);
    }
}
