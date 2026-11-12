package com.huawei.haf.store;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesAdapter extends AbstrctSharedPreferences {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f6069c;

    public SharedPreferencesAdapter() {
        this(null, true);
    }

    public SharedPreferencesAdapter(SharedPreferences sharedPreferences, boolean z) {
        this.f6069c = sharedPreferences;
        this.f6068b = z;
    }

    @Override // com.huawei.haf.store.AbstrctSharedPreferences
    protected void updateContentObserver(boolean z) {
        SharedPreferences sharedPreferences = this.f6069c;
        if (sharedPreferences instanceof AbstrctSharedPreferences) {
            ((AbstrctSharedPreferences) sharedPreferences).updateContentObserver(z);
        }
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getAll() : Collections.EMPTY_MAP;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getStringSet(str, set) : set;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getInt(str, i) : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getLong(str, j) : j;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getFloat(str, f) : f;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        SharedPreferences sharedPreferences = this.f6069c;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z) : z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        SharedPreferences sharedPreferences = this.f6069c;
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        return false;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.f6069c;
        if (sharedPreferences != null && !this.f6068b) {
            return sharedPreferences.edit();
        }
        throw new UnsupportedOperationException("Modification not supported.");
    }
}
