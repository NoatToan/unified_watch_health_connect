package com.huawei.haf.store;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.base.BaseContentProvider;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteStoreContentProvider extends BaseContentProvider {
    static final String CLEAR = "CLEAR";
    private final OnSharedPreferenceChangeListenerImpl mListener = new OnSharedPreferenceChangeListenerImpl();
    private volatile ExtendSharedPreferences mSharedPreferences;

    protected abstract String getName();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // com.huawei.haf.common.base.BaseContentProvider, android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        initContentProvider();
        str.hashCode();
        switch (str) {
            case "getAll":
                return fillRealAll();
            case "getInt":
                return fillRealInt(str2);
            case "contains":
                return fillRealContains(str2);
            case "getStringSet":
                return fillRealStringSet(str2);
            case "getLong":
                return fillRealLong(str2);
            case "getString":
                return fillRealString(str2);
            case "getBoolean":
                return fillRealBoolean(str2);
            case "getFloat":
                return fillRealFloat(str2);
            default:
                return callExtends(str, str2, bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    private Bundle callExtends(String str, String str2, Bundle bundle) {
        str.hashCode();
        switch (str) {
            case "containsStringSet":
                if (bundle != null) {
                    return fillRealContainsSet(str2, bundle.getString(str2));
                }
                return null;
            case "commit":
                return commit(str, str2, bundle);
            case "register":
                this.mListener.c(true);
                return null;
            case "addStringSet":
                if (bundle != null) {
                    this.mSharedPreferences.addStringSet(str2, bundle.getString(str2));
                    return null;
                }
                return null;
            case "apply":
                apply(str2, bundle);
                return null;
            case "unregister":
                this.mListener.c(false);
                return null;
            case "removeStringSet":
                if (bundle != null) {
                    this.mSharedPreferences.removeStringSet(str2, bundle.getString(str2));
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    private void initContentProvider() {
        if (this.mSharedPreferences != null) {
            return;
        }
        synchronized (this.mListener) {
            if (this.mSharedPreferences == null) {
                this.mSharedPreferences = new LocalSharedPreferences(getName(), 0);
            }
        }
    }

    private Bundle commit(String str, String str2, Bundle bundle) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        if (CLEAR.equals(str2)) {
            editorEdit.clear();
        }
        if (bundle != null) {
            AbstrctSharedPreferences.updateValues(editorEdit, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(str, editorEdit.commit());
        return bundle2;
    }

    private void apply(String str, Bundle bundle) {
        SharedPreferences.Editor editorEdit = this.mSharedPreferences.edit();
        if (CLEAR.equals(str)) {
            editorEdit.clear();
        }
        if (bundle != null) {
            AbstrctSharedPreferences.updateValues(editorEdit, bundle);
        }
        editorEdit.apply();
    }

    private Bundle fillRealAll() {
        Map<String, ?> all = this.mSharedPreferences.getAll();
        Bundle bundle = new Bundle(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Set) {
                Set set = (Set) value;
                bundle.putStringArray(key, (String[]) set.toArray(new String[set.size()]));
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                bundle.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        return bundle;
    }

    private Bundle fillRealString(String str) {
        String string;
        if (this.mSharedPreferences.contains(str)) {
            try {
                string = this.mSharedPreferences.getString(str, null);
            } catch (ClassCastException unused) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(str, string);
        return bundle;
    }

    private Bundle fillRealStringSet(String str) {
        Set<String> stringSet;
        if (this.mSharedPreferences.contains(str)) {
            try {
                stringSet = this.mSharedPreferences.getStringSet(str, null);
            } catch (ClassCastException unused) {
                stringSet = null;
            }
        } else {
            stringSet = null;
        }
        if (stringSet == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArray(str, (String[]) stringSet.toArray(new String[stringSet.size()]));
        return bundle;
    }

    private Bundle fillRealInt(String str) {
        Integer numValueOf;
        if (this.mSharedPreferences.contains(str)) {
            try {
                numValueOf = Integer.valueOf(this.mSharedPreferences.getInt(str, 0));
            } catch (ClassCastException unused) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(str, numValueOf.intValue());
        return bundle;
    }

    private Bundle fillRealLong(String str) {
        Long lValueOf;
        if (this.mSharedPreferences.contains(str)) {
            try {
                lValueOf = Long.valueOf(this.mSharedPreferences.getLong(str, 0L));
            } catch (ClassCastException unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(str, lValueOf.longValue());
        return bundle;
    }

    private Bundle fillRealFloat(String str) {
        Float fValueOf;
        if (this.mSharedPreferences.contains(str)) {
            try {
                fValueOf = Float.valueOf(this.mSharedPreferences.getFloat(str, 0.0f));
            } catch (ClassCastException unused) {
                fValueOf = null;
            }
        } else {
            fValueOf = null;
        }
        if (fValueOf == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat(str, fValueOf.floatValue());
        return bundle;
    }

    private Bundle fillRealBoolean(String str) {
        Boolean boolValueOf;
        if (this.mSharedPreferences.contains(str)) {
            try {
                boolValueOf = Boolean.valueOf(this.mSharedPreferences.getBoolean(str, false));
            } catch (ClassCastException unused) {
                boolValueOf = null;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, boolValueOf.booleanValue());
        return bundle;
    }

    private Bundle fillRealContains(String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, this.mSharedPreferences.contains(str));
        return bundle;
    }

    private Bundle fillRealContainsSet(String str, String str2) {
        Set<String> stringSet = TextUtils.isEmpty(str2) ? null : this.mSharedPreferences.getStringSet(str, null);
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, stringSet != null && stringSet.contains(str2));
        return bundle;
    }

    /* JADX INFO: loaded from: classes2.dex */
    class OnSharedPreferenceChangeListenerImpl implements SharedPreferences.OnSharedPreferenceChangeListener {
        private int d;

        private OnSharedPreferenceChangeListenerImpl() {
        }

        void c(boolean z) {
            synchronized (this) {
                try {
                    if (z) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i == 1) {
                            RemoteStoreContentProvider.this.mSharedPreferences.registerOnSharedPreferenceChangeListener(this);
                        }
                        return;
                    }
                    int i2 = this.d;
                    if (i2 == 1) {
                        this.d = 0;
                        RemoteStoreContentProvider.this.mSharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
                    } else if (i2 > 1) {
                        this.d = i2 - 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            RemoteStoreContentProvider.this.getContext().getContentResolver().notifyChange(SharedStoreManager.e(RemoteStoreContentProvider.this.getName(), str), null);
        }
    }
}
