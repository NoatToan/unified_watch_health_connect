package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.xiaomi.common.crypt.security.keystore.CipherException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class hql implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20348a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f20349b;
    public final String c;
    public final boolean d;
    public volatile boolean e;
    public String f;

    public class a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharedPreferences.Editor f20350a;

        public a(SharedPreferences.Editor editor) {
            this.f20350a = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.f20350a.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f20350a.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.f20350a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f20350a.putString(str, hql.this.j(str, Boolean.valueOf(z)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f20350a.putString(str, hql.this.j(str, Float.valueOf(f)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.f20350a.putString(str, hql.this.j(str, Integer.valueOf(i)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.f20350a.putString(str, hql.this.j(str, Long.valueOf(j)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.f20350a.putString(str, hql.this.j(str, str2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f20350a.putString(str, hql.this.j(str, set));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f20350a.remove(str);
            return this;
        }
    }

    public hql(Context context, String str, boolean z) {
        Objects.requireNonNull(str);
        this.c = str;
        this.f20349b = i(context, str);
        this.d = z;
    }

    public static String g(String str) {
        return "." + str + ".sec";
    }

    public final void c(Context context, final String str, final SharedPreferences sharedPreferences, final SharedPreferences sharedPreferences2) {
        final WeakReference weakReference = new WeakReference(context.getApplicationContext());
        Thread thread = new Thread(new Runnable() { // from class: gql
            @Override // java.lang.Runnable
            public final void run() {
                this.f19243a.h(sharedPreferences, sharedPreferences2, weakReference, str);
            }
        });
        thread.setName("sec:" + str);
        thread.start();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        k();
        return this.f20349b.contains(str);
    }

    public final String d(String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(f(str).b(Base64.decode(bArr, 8)));
        } catch (CipherException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String e(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Base64.encodeToString(f(str).a(String.valueOf(obj).getBytes()), 8);
        } catch (CipherException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        k();
        return new a(this.f20349b.edit());
    }

    public final jw3 f(String str) {
        byte[] bytes = String.valueOf(Objects.hash("SecuritySharedPreferences", this.c, str)).getBytes();
        ow3 ow3VarG = ow3.g("SecuritySharedPreferences");
        return this.d ? ow3VarG.b(bytes) : ow3VarG.a(bytes);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("getAll is not support.");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        String strD;
        k();
        String string = this.f20349b.getString(str, null);
        if (string == null || (strD = d(str, string.getBytes())) == null) {
            return z;
        }
        try {
            return Boolean.valueOf(strD).booleanValue();
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        String strD;
        k();
        String string = this.f20349b.getString(str, null);
        if (string == null || (strD = d(str, string.getBytes())) == null) {
            return f;
        }
        try {
            return Float.valueOf(strD).floatValue();
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        String strD;
        k();
        String string = this.f20349b.getString(str, null);
        if (string == null || (strD = d(str, string.getBytes())) == null) {
            return i;
        }
        try {
            return Integer.valueOf(strD).intValue();
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        String strD;
        k();
        String string = this.f20349b.getString(str, null);
        if (string == null || (strD = d(str, string.getBytes())) == null) {
            return j;
        }
        try {
            return Long.valueOf(strD).longValue();
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String strD;
        k();
        String string = this.f20349b.getString(str, null);
        return (string == null || (strD = d(str, string.getBytes())) == null) ? str2 : strD;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        k();
        String string = this.f20349b.getString(str, null);
        if (string == null) {
            return set;
        }
        String strD = d(str, string.getBytes());
        try {
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = new JSONArray(strD);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            return hashSet.isEmpty() ? set : hashSet;
        } catch (JSONException unused) {
            return set;
        }
    }

    public final /* synthetic */ void h(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, WeakReference weakReference, String str) {
        synchronized (this.f20348a) {
            try {
                Map<String, ?> all = sharedPreferences.getAll();
                if (!all.isEmpty()) {
                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        Object value = entry.getValue();
                        String key = entry.getKey();
                        editorEdit.putString(key, j(key, value));
                    }
                    editorEdit.apply();
                }
                Context context = (Context) weakReference.get();
                if (context != null) {
                    context.deleteSharedPreferences(str);
                } else {
                    sharedPreferences.edit().clear().apply();
                }
                this.e = true;
                this.f20348a.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SharedPreferences i(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        String strG = g(str);
        this.f = strG;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(strG, 0);
        c(context, str, sharedPreferences, sharedPreferences2);
        return sharedPreferences2;
    }

    public final String j(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Set)) {
            return e(str, obj);
        }
        String[] strArr = (String[]) ((Set) obj).toArray(new String[0]);
        JSONArray jSONArray = new JSONArray();
        for (String str2 : strArr) {
            jSONArray.put(str2);
        }
        return e(str, jSONArray.toString());
    }

    public final void k() {
        if (this.e) {
            return;
        }
        synchronized (this.f20348a) {
            while (!this.e) {
                try {
                    this.f20348a.wait();
                } catch (InterruptedException unused) {
                }
            }
            this.f20348a.notifyAll();
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        k();
        this.f20349b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        k();
        this.f20349b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
