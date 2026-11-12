package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.smarthome.library.file.FileUtil;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes5.dex */
public final class nam implements SharedPreferences {
    public static final Object n = new Object();
    public static HashMap<File, nam> o = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f27714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f27715b;
    public boolean h;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f27716k;
    public final Object c = new Object();
    public final Object d = new Object();
    public int g = 0;
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> i = new WeakHashMap<>();
    public final qj8 l = new qj8(16);
    public int m = 0;
    public Map<String, Object> e = null;
    public Throwable f = null;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            nam.this.s();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f27718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f27719b;
        public final /* synthetic */ Runnable c;

        public b(d dVar, boolean z, Runnable runnable) {
            this.f27718a = dVar;
            this.f27719b = z;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (nam.this.d) {
                nam.this.w(this.f27718a, this.f27719b);
            }
            synchronized (nam.this.c) {
                nam.g(nam.this);
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final class c implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f27720a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f27721b = new HashMap();
        public boolean c = false;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f27722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f27723b;

            public a(d dVar, long j) {
                this.f27722a = dVar;
                this.f27723b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f27722a.e.await();
                } catch (InterruptedException unused) {
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f27724a;

            public b(Runnable runnable) {
                this.f27724a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27724a.run();
                ggi.f(this.f27724a);
            }
        }

        /* JADX INFO: renamed from: nam$c$c, reason: collision with other inner class name */
        public class RunnableC1043c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f27726a;

            public RunnableC1043c(d dVar) {
                this.f27726a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.c(this.f27726a);
            }
        }

        public c() {
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            d dVarB = b();
            a aVar = new a(dVarB, jCurrentTimeMillis);
            ggi.b(aVar);
            nam.this.q(dVarB, new b(aVar));
            c(dVarB);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00bc A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:18:0x005e, B:20:0x0062, B:22:0x0068, B:26:0x0071, B:27:0x0074, B:28:0x007e, B:30:0x0084, B:34:0x0099, B:36:0x009f, B:38:0x00a5, B:41:0x00ac, B:47:0x00bc, B:42:0x00b0, B:45:0x00b7, B:49:0x00c1, B:51:0x00c8, B:52:0x00cd, B:53:0x00d3), top: B:62:0x005e, outer: #0 }] */
        public final d b() {
            Map map;
            ArrayList arrayList;
            HashSet hashSet;
            long j;
            Object obj;
            boolean z;
            synchronized (nam.this.c) {
                try {
                    if (nam.this.g > 0) {
                        nam.this.e = new HashMap(nam.this.e);
                    }
                    map = nam.this.e;
                    nam.f(nam.this);
                    boolean z2 = false;
                    boolean z3 = nam.this.i.size() > 0;
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        hashSet = new HashSet(nam.this.i.keySet());
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                        hashSet = null;
                    }
                    synchronized (this.f27720a) {
                        try {
                            if (this.c) {
                                if (map.isEmpty()) {
                                    z = false;
                                } else {
                                    map.clear();
                                    z = true;
                                }
                                this.c = false;
                                z2 = z;
                            }
                            for (Map.Entry<String, Object> entry : this.f27721b.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (map.containsKey(key)) {
                                        map.remove(key);
                                        if (z3) {
                                            arrayList.add(key);
                                        }
                                        z2 = true;
                                    }
                                } else if (!map.containsKey(key) || (obj = map.get(key)) == null || !obj.equals(value)) {
                                    map.put(key, value);
                                    if (z3) {
                                        arrayList.add(key);
                                    }
                                    z2 = true;
                                }
                            }
                            this.f27721b.clear();
                            if (z2) {
                                nam.l(nam.this);
                            }
                            j = nam.this.j;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new d(j, arrayList, hashSet, map, null);
        }

        public final void c(d dVar) {
            List<String> list;
            if (dVar.c == null || (list = dVar.f27729b) == null || list.size() == 0) {
                return;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                GlobalHandlerManager.getInstance().getGlobalHandler().post(new RunnableC1043c(dVar));
                return;
            }
            for (int size = dVar.f27729b.size() - 1; size >= 0; size--) {
                String str = dVar.f27729b.get(size);
                for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : dVar.c) {
                    if (onSharedPreferenceChangeListener != null) {
                        onSharedPreferenceChangeListener.onSharedPreferenceChanged(nam.this, str);
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            synchronized (this.f27720a) {
                this.c = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            d dVarB = b();
            nam.this.q(dVarB, null);
            try {
                dVarB.e.await();
                c(dVarB);
                return dVarB.f;
            } catch (InterruptedException unused) {
                return false;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            synchronized (this.f27720a) {
                this.f27721b.put(str, this);
            }
            return this;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f27728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f27729b;
        public final Set<SharedPreferences.OnSharedPreferenceChangeListener> c;
        public final Map<String, Object> d;
        public final CountDownLatch e;
        public volatile boolean f;
        public boolean g;

        public /* synthetic */ d(long j, List list, Set set, Map map, a aVar) {
            this(j, list, set, map);
        }

        public void a(boolean z, boolean z2) {
            this.g = z;
            this.f = z2;
            this.e.countDown();
        }

        public d(long j, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.e = new CountDownLatch(1);
            this.f = false;
            this.g = false;
            this.f27728a = j;
            this.f27729b = list;
            this.c = set;
            this.d = map;
        }
    }

    public nam(File file) {
        this.h = false;
        this.f27714a = file;
        this.f27715b = t(file);
        this.h = false;
        u();
    }

    public static /* synthetic */ int f(nam namVar) {
        int i = namVar.g;
        namVar.g = i + 1;
        return i;
    }

    public static /* synthetic */ int g(nam namVar) {
        int i = namVar.g;
        namVar.g = i - 1;
        return i;
    }

    public static /* synthetic */ long l(nam namVar) {
        long j = namVar.j;
        namVar.j = 1 + j;
        return j;
    }

    public static void o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ArrayList<File> arrayList = new ArrayList();
        arrayList.add(new File(str, str2));
        arrayList.add(new File(str + File.separator + "data", str2));
        for (File file : arrayList) {
            if (o.containsKey(file)) {
                o.get(file).edit().clear().commit();
                o.remove(file);
            }
        }
    }

    public static FileOutputStream p(File file) {
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't create directory for SharedPreferences file ");
                sb.append(file);
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't create SharedPreferences file ");
                sb2.append(file);
                return null;
            }
        }
    }

    public static SharedPreferences r(File file) {
        nam namVar = o.get(file);
        if (namVar != null) {
            return namVar;
        }
        nam namVar2 = new nam(file);
        o.put(file, namVar2);
        return namVar2;
    }

    public static File t(File file) {
        return new File(file.getPath() + ".bak");
    }

    public static boolean v(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return true;
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        boolean zContainsKey;
        synchronized (this.c) {
            n();
            zContainsKey = this.e.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        synchronized (this.c) {
            n();
        }
        return new c();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map;
        synchronized (this.c) {
            n();
            map = new HashMap(this.e);
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        synchronized (this.c) {
            try {
                n();
                Boolean bool = (Boolean) this.e.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        synchronized (this.c) {
            try {
                n();
                Float f2 = (Float) this.e.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        synchronized (this.c) {
            try {
                n();
                Integer num = (Integer) this.e.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        synchronized (this.c) {
            try {
                n();
                Long l = (Long) this.e.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        synchronized (this.c) {
            n();
            String str3 = (String) this.e.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        synchronized (this.c) {
            n();
            Set<String> set2 = (Set) this.e.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public final void n() {
        while (!this.h) {
            try {
                this.c.wait();
            } catch (InterruptedException unused) {
            }
        }
        if (this.f != null) {
            throw new IllegalStateException(this.f);
        }
    }

    public final void q(d dVar, Runnable runnable) {
        boolean z;
        boolean z2 = runnable == null;
        b bVar = new b(dVar, z2, runnable);
        if (z2) {
            synchronized (this.c) {
                z = this.g == 1;
            }
            if (z) {
                bVar.run();
                return;
            }
        }
        ggi.e(bVar, !z2);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.c) {
            this.i.put(onSharedPreferenceChangeListener, n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098 A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #9 {all -> 0x009b, blocks: (B:46:0x0098, B:49:0x009d), top: B:74:0x0096, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009d A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #9 {all -> 0x009b, blocks: (B:46:0x0098, B:49:0x009d), top: B:74:0x0096, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void s() {
        HashMap<String, ?> mapA;
        Object obj;
        BufferedInputStream bufferedInputStream;
        synchronized (this.c) {
            try {
                if (this.h) {
                    return;
                }
                if (this.f27715b.exists()) {
                    this.f27714a.delete();
                    this.f27715b.renameTo(this.f27714a);
                }
                if (this.f27714a.exists() && !this.f27714a.canRead()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt to read preferences file ");
                    sb.append(this.f27714a);
                    sb.append(" without permission");
                }
                Throwable th = null;
                try {
                    if (this.f27714a.canRead()) {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f27714a), 16384);
                            try {
                                try {
                                    mapA = msr.a(bufferedInputStream);
                                    try {
                                        FileUtil.closeSilently(bufferedInputStream);
                                    } catch (Exception unused) {
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Exception unused2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Cannot read ");
                                    sb2.append(this.f27714a.getAbsolutePath());
                                    FileUtil.closeSilently(bufferedInputStream);
                                    mapA = null;
                                    synchronized (this.c) {
                                        try {
                                            this.h = true;
                                            this.f = th;
                                            if (th == null) {
                                                try {
                                                    if (mapA != null) {
                                                        this.e = mapA;
                                                    } else {
                                                        this.e = new HashMap();
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        this.f = th3;
                                                        obj = this.c;
                                                    } catch (Throwable th4) {
                                                        this.c.notifyAll();
                                                        throw th4;
                                                    }
                                                }
                                            }
                                            obj = this.c;
                                            obj.notifyAll();
                                        } catch (Throwable th5) {
                                            throw th5;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                FileUtil.closeSilently(bufferedInputStream);
                                throw th;
                            }
                        } catch (Exception unused3) {
                            bufferedInputStream = null;
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedInputStream = null;
                            FileUtil.closeSilently(bufferedInputStream);
                            throw th;
                        }
                    } else {
                        mapA = null;
                    }
                } catch (Exception unused4) {
                } catch (Throwable th8) {
                    mapA = null;
                    th = th8;
                }
                synchronized (this.c) {
                    this.h = true;
                    this.f = th;
                    if (th == null) {
                        if (mapA != null) {
                            this.e = mapA;
                        } else {
                            this.e = new HashMap();
                        }
                    }
                    obj = this.c;
                    obj.notifyAll();
                }
            } catch (Throwable th9) {
                throw th9;
            }
        }
    }

    public final void u() {
        synchronized (this.c) {
            this.h = false;
        }
        new a("SharedPreferencesImpl-load").start();
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.c) {
            this.i.remove(onSharedPreferenceChangeListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r0 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(nam.d r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nam.w(nam$d, boolean):void");
    }
}
