package com.huami.healthlabel.utils;

import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\r\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/healthlabel/utils/SpUtils;", ExifInterface.GPS_DIRECTION_TRUE, "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "Ljava/lang/Object;", "default", "Landroid/content/SharedPreferences;", "c", "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "prefs", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class SpUtils<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final T default;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy prefs = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SharedPreferences> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return UtilsKt.getGlobalContext().getSharedPreferences("HealthLabel", 0);
        }
    }

    public SpUtils(@NotNull String str, T t) {
        this.name = str;
        this.default = t;
    }

    private final SharedPreferences a() {
        return (SharedPreferences) this.prefs.getValue();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        SharedPreferences sharedPreferencesA = a();
        T t = this.default;
        if (t instanceof Long) {
            return (T) Long.valueOf(sharedPreferencesA.getLong(getName(), ((Number) this.default).longValue()));
        }
        if (t instanceof String) {
            return (T) sharedPreferencesA.getString(getName(), (String) this.default);
        }
        if (t instanceof Integer) {
            return (T) Integer.valueOf(sharedPreferencesA.getInt(getName(), ((Number) this.default).intValue()));
        }
        if (t instanceof Boolean) {
            return (T) Boolean.valueOf(sharedPreferencesA.getBoolean(getName(), ((Boolean) this.default).booleanValue()));
        }
        if (t instanceof Float) {
            return (T) Float.valueOf(sharedPreferencesA.getFloat(getName(), ((Number) this.default).floatValue()));
        }
        throw new IllegalArgumentException("This type of data cannot be saved!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, T value) {
        SharedPreferences.Editor editorPutFloat;
        SharedPreferences.Editor editorEdit = a().edit();
        if (value instanceof Long) {
            editorPutFloat = editorEdit.putLong(getName(), ((Number) value).longValue());
        } else if (value instanceof String) {
            editorPutFloat = editorEdit.putString(getName(), (String) value);
        } else if (value instanceof Integer) {
            editorPutFloat = editorEdit.putInt(getName(), ((Number) value).intValue());
        } else if (value instanceof Boolean) {
            editorPutFloat = editorEdit.putBoolean(getName(), ((Boolean) value).booleanValue());
        } else {
            if (!(value instanceof Float)) {
                throw new IllegalArgumentException("This type of data cannot be saved!");
            }
            editorPutFloat = editorEdit.putFloat(getName(), ((Number) value).floatValue());
        }
        editorPutFloat.apply();
    }
}
