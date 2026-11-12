package com.huami.utils.persistence.kvkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J%\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062*\u0010\u000f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H&¢\u0006\u0004\b\u0018\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J#\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\r\"\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0004H&J\u0017\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\rH&¢\u0006\u0004\b \u0010!J\b\u0010#\u001a\u00020\"H&¨\u0006$"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "initialize", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "setValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "", "Lkotlin/Pair;", "kvs", "setValues", "([Lkotlin/Pair;)V", "defValue", "getValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/os/Parcelable;", "Ljava/lang/Class;", "tClass", "getParcelableValue", "(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "(Ljava/lang/String;Ljava/lang/Class;)Landroid/os/Parcelable;", "isContainKey", "keys", "removeValuesForKeys", "([Ljava/lang/String;)V", "clear", "getAllKeys", "()[Ljava/lang/String;", "Landroid/content/SharedPreferences;", "getSharedPreferences", "library_release"}, k = 1, mv = {1, 5, 1})
public interface KvPersistence {
    void clear();

    @NotNull
    String[] getAllKeys();

    @Nullable
    <T extends Parcelable> T getParcelableValue(@NotNull String key, @NotNull Class<T> tClass);

    @NotNull
    <T extends Parcelable> T getParcelableValue(@NotNull String key, @NotNull Class<T> tClass, @NotNull T defValue);

    @NotNull
    SharedPreferences getSharedPreferences();

    <T> T getValue(@NotNull String key, T defValue);

    void initialize(@NotNull Context context);

    boolean isContainKey(@NotNull String key);

    void removeValuesForKeys(@NotNull String... keys);

    <T> boolean setValue(@NotNull String key, T value);

    <T> void setValues(@NotNull Pair<String, ? extends T>... kvs);
}
