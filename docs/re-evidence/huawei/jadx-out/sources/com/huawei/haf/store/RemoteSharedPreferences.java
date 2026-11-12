package com.huawei.haf.store;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.braintreepayments.api.PayPalCheckoutRequest;
import com.huawei.haf.application.BaseApplication;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class RemoteSharedPreferences extends AbstrctSharedPreferences implements ExtendSharedPreferences {
    private final Uri d;
    private ContentObserver e;

    RemoteSharedPreferences(String str) {
        this.d = SharedStoreManager.e(str, null);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        Bundle bundleCall = b().call(this.d, "getAll", (String) null, (Bundle) null);
        if (bundleCall == null) {
            return new HashMap();
        }
        HashMap map = new HashMap(bundleCall.size());
        for (String str : bundleCall.keySet()) {
            Object obj = bundleCall.get(str);
            if (obj instanceof String[]) {
                map.put(str, new HashSet(Arrays.asList((String[]) obj)));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Bundle bundleCall = b().call(this.d, "getString", str, (Bundle) null);
        return bundleCall != null ? bundleCall.getString(str, str2) : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        String[] stringArray;
        Bundle bundleCall = b().call(this.d, "getStringSet", str, (Bundle) null);
        return (bundleCall == null || (stringArray = bundleCall.getStringArray(str)) == null) ? set : new HashSet(Arrays.asList(stringArray));
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Bundle bundleCall = b().call(this.d, "getInt", str, (Bundle) null);
        return bundleCall != null ? bundleCall.getInt(str, i) : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Bundle bundleCall = b().call(this.d, "getLong", str, (Bundle) null);
        return bundleCall != null ? bundleCall.getLong(str, j) : j;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Bundle bundleCall = b().call(this.d, "getFloat", str, (Bundle) null);
        return bundleCall != null ? bundleCall.getFloat(str, f) : f;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Bundle bundleCall = b().call(this.d, "getBoolean", str, (Bundle) null);
        return bundleCall != null ? bundleCall.getBoolean(str, z) : z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        Bundle bundleCall = b().call(this.d, "contains", str, (Bundle) null);
        if (bundleCall != null) {
            return bundleCall.getBoolean(str, false);
        }
        return false;
    }

    @Override // com.huawei.haf.store.ExtendSharedPreferences
    public void addStringSet(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        b().call(this.d, "addStringSet", str, bundle);
    }

    @Override // com.huawei.haf.store.ExtendSharedPreferences
    public void removeStringSet(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        b().call(this.d, "removeStringSet", str, bundle);
    }

    @Override // com.huawei.haf.store.ExtendSharedPreferences
    public boolean containsStringSet(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        Bundle bundleCall = b().call(this.d, "containsStringSet", str, bundle);
        if (bundleCall != null) {
            return bundleCall.getBoolean(str, false);
        }
        return false;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new EditorImpl();
    }

    @Override // com.huawei.haf.store.AbstrctSharedPreferences
    protected void updateContentObserver(boolean z) {
        if (!z) {
            if (this.e != null) {
                b().call(this.d, "unregister", (String) null, (Bundle) null);
                b().unregisterContentObserver(this.e);
                this.e = null;
                return;
            }
            return;
        }
        if (this.e == null) {
            this.e = new ContentObserverImpl();
            b().registerContentObserver(this.d, true, this.e);
            b().call(this.d, "register", (String) null, (Bundle) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContentResolver b() {
        return BaseApplication.b().getContentResolver();
    }

    /* JADX INFO: loaded from: classes2.dex */
    class ContentObserverImpl extends ContentObserver {
        ContentObserverImpl() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            if (uri == null) {
                return;
            }
            String strB = b(uri.toString());
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            RemoteSharedPreferences.this.onContentChange(strB);
        }

        private String b(String str) {
            String string = RemoteSharedPreferences.this.d.toString();
            String strSubstring = str.length() > string.length() ? str.substring(string.length() + 1) : null;
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            return strSubstring;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class EditorImpl extends AbstrctSharedPreferences.AbstractEditor {
        private EditorImpl() {
        }

        @Override // com.huawei.haf.store.AbstrctSharedPreferences.AbstractEditor
        protected boolean update(boolean z, boolean z2, Bundle bundle) {
            String str = z ? PayPalCheckoutRequest.USER_ACTION_COMMIT : "apply";
            Bundle bundleCall = RemoteSharedPreferences.this.b().call(RemoteSharedPreferences.this.d, str, z2 ? "CLEAR" : null, new Bundle(bundle));
            if (bundleCall == null) {
                return false;
            }
            return bundleCall.getBoolean(str, false);
        }
    }
}
