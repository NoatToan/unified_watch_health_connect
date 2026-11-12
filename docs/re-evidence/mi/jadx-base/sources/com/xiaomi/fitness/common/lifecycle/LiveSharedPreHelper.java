package com.xiaomi.fitness.common.lifecycle;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u0005¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u0005¢\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0012J(\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00050\u0014J+\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreHelper;", "", "<init>", "()V", "getPrefValue", "T", "pref", "Landroid/content/SharedPreferences;", "key", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "updatePrefValue", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)V", "getPrefLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "(Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "map", "", "doPutValue", "Landroid/content/SharedPreferences$Editor;", "editor", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveSharedPreHelper {

    @NotNull
    public static final LiveSharedPreHelper INSTANCE = new LiveSharedPreHelper();

    private LiveSharedPreHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> SharedPreferences.Editor doPutValue(SharedPreferences.Editor editor, String key, T t) {
        if (t instanceof String) {
            editor.putString(key, (String) t);
        } else if (t instanceof Integer) {
            editor.putInt(key, ((Integer) t).intValue());
        } else if (t instanceof Boolean) {
            editor.putBoolean(key, ((Boolean) t).booleanValue());
        } else if (t instanceof Long) {
            editor.putLong(key, ((Long) t).longValue());
        } else if (t instanceof Float) {
            editor.putFloat(key, ((Float) t).floatValue());
        } else {
            if (!(t instanceof Set)) {
                throw new IllegalArgumentException("update fail ! Value Type not supported");
            }
            editor.putStringSet(key, (Set) t);
        }
        return editor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> LiveData<T> getPrefLiveData(@NotNull LiveSharedPreferences pref, @NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(key, "key");
        Objects.requireNonNull(pref);
        Objects.requireNonNull(key);
        Objects.requireNonNull(t);
        if (t instanceof String) {
            LiveData<T> liveData = (LiveData<T>) pref.reqString(key, (String) t);
            Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<T of com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper.getPrefLiveData>");
            return liveData;
        }
        if (t instanceof Integer) {
            LiveData<T> liveData2 = (LiveData<T>) pref.reqInt(key, ((Integer) t).intValue());
            Intrinsics.checkNotNull(liveData2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<T of com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper.getPrefLiveData>");
            return liveData2;
        }
        if (t instanceof Long) {
            LiveData<T> liveData3 = (LiveData<T>) pref.reqLong(key, ((Long) t).longValue());
            Intrinsics.checkNotNull(liveData3, "null cannot be cast to non-null type androidx.lifecycle.LiveData<T of com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper.getPrefLiveData>");
            return liveData3;
        }
        if (t instanceof Float) {
            LiveData<T> liveData4 = (LiveData<T>) pref.reqFloat(key, ((Float) t).floatValue());
            Intrinsics.checkNotNull(liveData4, "null cannot be cast to non-null type androidx.lifecycle.LiveData<T of com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper.getPrefLiveData>");
            return liveData4;
        }
        if (t instanceof Boolean) {
            LiveData<T> liveData5 = (LiveData<T>) pref.reqBoolean(key, ((Boolean) t).booleanValue());
            Intrinsics.checkNotNull(liveData5, "null cannot be cast to non-null type androidx.lifecycle.LiveData<T of com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper.getPrefLiveData>");
            return liveData5;
        }
        if (!(t instanceof Set)) {
            throw new IllegalArgumentException("getPrefLiveData fail ! Value Type not supported");
        }
        LiveData<T> liveData6 = (LiveData<T>) pref.reqStringSet(key, (Set) t);
        Intrinsics.checkNotNull(liveData6, "null cannot be cast to non-null type androidx.lifecycle.LiveData<T of com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper.getPrefLiveData>");
        return liveData6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T getPrefValue(@NotNull SharedPreferences pref, @NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(key, "key");
        Objects.requireNonNull(pref);
        Objects.requireNonNull(key);
        Objects.requireNonNull(t);
        if (t instanceof String) {
            return (T) pref.getString(key, (String) t);
        }
        if (t instanceof Integer) {
            return (T) Integer.valueOf(pref.getInt(key, ((Integer) t).intValue()));
        }
        if (t instanceof Long) {
            return (T) Long.valueOf(pref.getLong(key, ((Long) t).longValue()));
        }
        if (t instanceof Float) {
            return (T) Float.valueOf(pref.getFloat(key, ((Float) t).floatValue()));
        }
        if (t instanceof Boolean) {
            return (T) Boolean.valueOf(pref.getBoolean(key, ((Boolean) t).booleanValue()));
        }
        if (t instanceof Set) {
            return (T) pref.getStringSet(key, (Set) t);
        }
        throw new IllegalArgumentException("getPrefValue fail ! Value Type not supported");
    }

    public final <T> void updatePrefValue(@NotNull SharedPreferences pref, @NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(key, "key");
        Objects.requireNonNull(pref);
        Objects.requireNonNull(key);
        Objects.requireNonNull(t);
        SharedPreferences.Editor editorEdit = pref.edit();
        Intrinsics.checkNotNull(editorEdit);
        doPutValue(editorEdit, key, t);
        editorEdit.apply();
    }

    public final <T> void updatePrefValue(@NotNull SharedPreferences pref, @NotNull Map<String, ? extends T> map) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        Intrinsics.checkNotNullParameter(map, "map");
        Objects.requireNonNull(pref);
        Objects.requireNonNull(map);
        SharedPreferences.Editor editorEdit = pref.edit();
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            String key = entry.getKey();
            T value = entry.getValue();
            Intrinsics.checkNotNull(editorEdit);
            doPutValue(editorEdit, key, value);
        }
        editorEdit.apply();
    }
}
