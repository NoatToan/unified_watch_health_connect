package org.acra.util;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@Keep
public interface BundleWrapper {

    @Keep
    public interface Internal extends BundleWrapper {
        Bundle asBundle();

        @RequiresApi(22)
        PersistableBundle asPersistableBundle();
    }

    void clear();

    boolean containsKey(String str);

    @Nullable
    Object get(String str);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    @Nullable
    boolean[] getBooleanArray(@Nullable String str);

    double getDouble(String str);

    double getDouble(String str, double d);

    @Nullable
    double[] getDoubleArray(@Nullable String str);

    int getInt(String str);

    int getInt(String str, int i);

    @Nullable
    int[] getIntArray(@Nullable String str);

    long getLong(String str);

    long getLong(String str, long j);

    @Nullable
    long[] getLongArray(@Nullable String str);

    @Nullable
    String getString(@Nullable String str);

    String getString(@Nullable String str, String str2);

    @Nullable
    String[] getStringArray(@Nullable String str);

    boolean isEmpty();

    Set<String> keySet();

    @RequiresApi(api = 21)
    void putAll(PersistableBundle persistableBundle);

    void putBoolean(@Nullable String str, boolean z);

    void putBooleanArray(@Nullable String str, @Nullable boolean[] zArr);

    void putDouble(@Nullable String str, double d);

    void putDoubleArray(@Nullable String str, @Nullable double[] dArr);

    void putInt(@Nullable String str, int i);

    void putIntArray(@Nullable String str, @Nullable int[] iArr);

    void putLong(@Nullable String str, long j);

    void putLongArray(@Nullable String str, @Nullable long[] jArr);

    void putString(@Nullable String str, @Nullable String str2);

    void putStringArray(@Nullable String str, @Nullable String[] strArr);

    void remove(String str);

    int size();
}
