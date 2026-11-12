package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import com.google.crypto.tink.KeyTemplate;
import defpackage.aw0;
import defpackage.h06;
import defpackage.i06;
import defpackage.i1e;
import defpackage.iw0;
import defpackage.j12;
import defpackage.ja1;
import defpackage.xu0;
import defpackage.yu0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<SharedPreferences.OnSharedPreferenceChangeListener> f2986b = new ArrayList();
    public final String c;
    public final String d;
    public final xu0 e;
    public final h06 f;

    public enum PrefKeyEncryptionScheme {
        AES256_SIV(iw0.j());

        private final KeyTemplate mDeterministicAeadKeyTemplate;

        PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        public KeyTemplate getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM(aw0.j());

        private final KeyTemplate mAeadKeyTemplate;

        PrefValueEncryptionScheme(KeyTemplate keyTemplate) {
            this.mAeadKeyTemplate = keyTemplate;
        }

        public KeyTemplate getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2987a;

        static {
            int[] iArr = new int[c.values().length];
            f2987a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2987a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2987a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2987a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2987a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2987a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EncryptedSharedPreferences f2988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f2989b;
        public AtomicBoolean d = new AtomicBoolean(false);
        public final List<String> c = new CopyOnWriteArrayList();

        public b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f2988a = encryptedSharedPreferences;
            this.f2989b = editor;
        }

        public final void a() {
            if (this.d.getAndSet(false)) {
                for (String str : this.f2988a.getAll().keySet()) {
                    if (!this.c.contains(str) && !this.f2988a.f(str)) {
                        this.f2989b.remove(this.f2988a.c(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f2989b.apply();
            b();
            this.c.clear();
        }

        public final void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f2988a.f2986b) {
                Iterator<String> it = this.c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f2988a, it.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.f2988a.f(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> pairD = this.f2988a.d(str, bArr);
                this.f2989b.putString((String) pairD.first, (String) pairD.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f2989b.commit();
            } finally {
                b();
                this.c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.b());
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.b());
            byteBufferAllocate.putFloat(f);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.b());
            byteBufferAllocate.putInt(i);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.b());
            byteBufferAllocate.putLong(j);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.b());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.b());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f2988a.f(str)) {
                this.f2989b.remove(this.f2988a.c(str));
                this.c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2991a;

        c(int i) {
            this.f2991a = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int b() {
            return this.f2991a;
        }
    }

    public EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, xu0 xu0Var, h06 h06Var) {
        this.c = str;
        this.f2985a = sharedPreferences;
        this.d = str2;
        this.e = xu0Var;
        this.f = h06Var;
    }

    public static SharedPreferences a(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        i06.b();
        yu0.b();
        i1e i1eVarC = new ja1.b().h(prefKeyEncryptionScheme.getKeyTemplate()).j(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).i("android-keystore://" + str2).d().c();
        i1e i1eVarC2 = new ja1.b().h(prefValueEncryptionScheme.getKeyTemplate()).j(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).i("android-keystore://" + str2).d().c();
        return new EncryptedSharedPreferences(str, str2, context.getSharedPreferences(str, 0), (xu0) i1eVarC2.h(xu0.class), (h06) i1eVarC.h(h06.class));
    }

    public String b(String str) {
        try {
            String str2 = new String(this.f.a(j12.a(str, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    public String c(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return j12.d(this.f.b(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!f(str)) {
            return this.f2985a.contains(c(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public Pair<String, String> d(String str, byte[] bArr) throws GeneralSecurityException {
        String strC = c(str);
        return new Pair<>(strC, j12.d(this.e.a(bArr, strC.getBytes(StandardCharsets.UTF_8))));
    }

    public final Object e(String str) {
        if (f(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strC = c(str);
            String string = this.f2985a.getString(strC, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = j12.a(string, 0);
            xu0 xu0Var = this.e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(xu0Var.b(bArrA, strC.getBytes(charset)));
            byteBufferWrap.position(0);
            switch (a.f2987a[c.a(byteBufferWrap.getInt()).ordinal()]) {
                case 1:
                    int i = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
                case 2:
                    return Integer.valueOf(byteBufferWrap.getInt());
                case 3:
                    return Long.valueOf(byteBufferWrap.getLong());
                case 4:
                    return Float.valueOf(byteBufferWrap.getFloat());
                case 5:
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                case 6:
                    ArraySet arraySet = new ArraySet();
                    while (byteBufferWrap.hasRemaining()) {
                        int i2 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i2);
                        byteBufferWrap.position(byteBufferWrap.position() + i2);
                        arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                        return null;
                    }
                    return arraySet;
                default:
                    return null;
            }
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f2985a.edit());
    }

    public boolean f(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f2985a.getAll().entrySet()) {
            if (!f(entry.getKey())) {
                String strB = b(entry.getKey());
                map.put(strB, e(strB));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object objE = e(str);
        return (objE == null || !(objE instanceof Boolean)) ? z : ((Boolean) objE).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object objE = e(str);
        return (objE == null || !(objE instanceof Float)) ? f : ((Float) objE).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object objE = e(str);
        return (objE == null || !(objE instanceof Integer)) ? i : ((Integer) objE).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object objE = e(str);
        return (objE == null || !(objE instanceof Long)) ? j : ((Long) objE).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objE = e(str);
        return (objE == null || !(objE instanceof String)) ? str2 : (String) objE;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object objE = e(str);
        Set<String> arraySet = objE instanceof Set ? (Set) objE : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2986b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2986b.remove(onSharedPreferenceChangeListener);
    }
}
