package td;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tn.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f163854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f163855b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f163856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Aead f163857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DeterministicAead f163858e;

    /* JADX INFO: renamed from: td.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C3082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163859a;

        static {
            int[] iArr = new int[c.values().length];
            f163859a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f163859a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f163859a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f163859a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f163859a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f163859a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f163860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f163861b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f163863d = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f163862c = new CopyOnWriteArrayList();

        public b(a aVar, SharedPreferences.Editor editor) {
            this.f163860a = aVar;
            this.f163861b = editor;
        }

        public final void a() {
            if (this.f163863d.getAndSet(false)) {
                a aVar = this.f163860a;
                for (String str : ((HashMap) aVar.getAll()).keySet()) {
                    if (!this.f163862c.contains(str) && !a.d(str)) {
                        this.f163861b.remove(aVar.b(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.f163861b.apply();
            b();
            this.f163862c.clear();
        }

        public final void b() {
            a aVar = this.f163860a;
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : aVar.f163855b) {
                Iterator it = this.f163862c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(aVar, (String) it.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            a aVar = this.f163860a;
            aVar.getClass();
            if (a.d(str)) {
                com.garmin.proto.generated.a.h(k.g(str, " is a reserved key for the encryption keyset."));
                return;
            }
            this.f163862c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strB = aVar.b(str);
                Pair pair = new Pair(strB, Base64.encode(aVar.f163857d.encrypt(bArr, strB.getBytes(StandardCharsets.UTF_8))));
                this.f163861b.putString((String) pair.first, (String) pair.second);
            } catch (GeneralSecurityException e4) {
                sn.a.r("Could not encrypt data: ", e4.getMessage(), e4);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.f163863d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f163862c;
            a();
            try {
                return this.f163861b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z14) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.f163871a);
            byteBufferAllocate.put(z14 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f14) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.f163871a);
            byteBufferAllocate.putFloat(f14);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i14) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.f163871a);
            byteBufferAllocate.putInt(i14);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j8) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.f163871a);
            byteBufferAllocate.putLong(j8);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.f163871a);
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            Set set2 = set;
            if (set == null) {
                ArraySet arraySet = new ArraySet();
                arraySet.add("__NULL__");
                set2 = arraySet;
            }
            ArrayList<byte[]> arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.f163871a);
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            a aVar = this.f163860a;
            aVar.getClass();
            if (a.d(str)) {
                com.garmin.proto.generated.a.h(k.g(str, " is a reserved key for the encryption keyset."));
                return null;
            }
            this.f163861b.remove(aVar.b(str));
            this.f163862c.remove(str);
            return this;
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
        public final int f163871a;

        c(int i14) {
            this.f163871a = i14;
        }
    }

    public enum d {
        AES256_SIV(AesSivKeyManager.aes256SivTemplate());


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyTemplate f163874a;

        d(KeyTemplate keyTemplate) {
            this.f163874a = keyTemplate;
        }
    }

    public enum e {
        AES256_GCM(AesGcmKeyManager.aes256GcmTemplate());


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyTemplate f163877a;

        e(KeyTemplate keyTemplate) {
            this.f163877a = keyTemplate;
        }
    }

    public a(String str, String str2, SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.f163856c = str;
        this.f163854a = sharedPreferences;
        this.f163857d = aead;
        this.f163858e = deterministicAead;
    }

    public static a a(String str, String str2, Context context, d dVar, e eVar) {
        DeterministicAeadConfig.register();
        AeadConfig.register();
        KeysetHandle keysetHandle = new AndroidKeysetManager.Builder().withKeyTemplate(dVar.f163874a).withSharedPref(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        KeysetHandle keysetHandle2 = new AndroidKeysetManager.Builder().withKeyTemplate(eVar.f163877a).withSharedPref(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        return new a(str, str2, context.getSharedPreferences(str, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class));
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.encode(this.f163858e.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.f163856c.getBytes()));
        } catch (GeneralSecurityException e4) {
            sn.a.r("Could not encrypt key. ", e4.getMessage(), e4);
            return null;
        }
    }

    public final Object c(String str) {
        c cVar;
        if (d(str)) {
            com.garmin.proto.generated.a.h(k.g(str, " is a reserved key for the encryption keyset."));
            return null;
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.f163854a.getString(strB, null);
            if (string != null) {
                byte[] bArrDecode = Base64.decode(string, 0);
                Aead aead = this.f163857d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aead.decrypt(bArrDecode, strB.getBytes(charset)));
                byteBufferWrap.position(0);
                int i14 = byteBufferWrap.getInt();
                if (i14 == 0) {
                    cVar = c.STRING;
                } else if (i14 == 1) {
                    cVar = c.STRING_SET;
                } else if (i14 == 2) {
                    cVar = c.INT;
                } else if (i14 == 3) {
                    cVar = c.LONG;
                } else if (i14 == 4) {
                    cVar = c.FLOAT;
                } else if (i14 != 5) {
                    c cVar2 = c.STRING;
                    cVar = null;
                } else {
                    cVar = c.BOOLEAN;
                }
                switch (C3082a.f163859a[cVar.ordinal()]) {
                    case 1:
                        int i15 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                        byteBufferWrap.limit(i15);
                        String string2 = charset.decode(byteBufferSlice).toString();
                        if (!string2.equals("__NULL__")) {
                            return string2;
                        }
                        break;
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
                            int i16 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                            byteBufferSlice2.limit(i16);
                            byteBufferWrap.position(byteBufferWrap.position() + i16);
                            arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                        }
                        if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                            return arraySet;
                        }
                        break;
                        break;
                    default:
                        break;
                }
            }
            return null;
        } catch (GeneralSecurityException e4) {
            sn.a.r("Could not decrypt value. ", e4.getMessage(), e4);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            com.garmin.proto.generated.a.h(k.g(str, " is a reserved key for the encryption keyset."));
            return false;
        }
        return this.f163854a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new b(this, this.f163854a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f163854a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.f163858e.decryptDeterministically(Base64.decode(entry.getKey(), 0), this.f163856c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, c(str));
                } catch (GeneralSecurityException e4) {
                    sn.a.r("Could not decrypt key. ", e4.getMessage(), e4);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z14) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Boolean)) ? z14 : ((Boolean) objC).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f14) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Float)) ? f14 : ((Float) objC).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i14) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Integer)) ? i14 : ((Integer) objC).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j8) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof Long)) ? j8 : ((Long) objC).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return (objC == null || !(objC instanceof String)) ? str2 : (String) objC;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Object objC = c(str);
        Set<String> arraySet = objC instanceof Set ? (Set) objC : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f163855b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f163855b.remove(onSharedPreferenceChangeListener);
    }
}
