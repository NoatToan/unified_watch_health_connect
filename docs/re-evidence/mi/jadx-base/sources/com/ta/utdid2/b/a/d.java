package com.ta.utdid2.b.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f10694b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f10695a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Object f17a = new Object();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private HashMap<File, a> f18a = new HashMap<>();

    public static final class a implements b {
        private static final Object c = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f10696a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private WeakHashMap<b.InterfaceC0338b, Object> f19a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f10697b;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private final int f20c;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        private final File f21c;
        private boolean j = false;

        public a(File file, int i, Map map) {
            this.f10697b = file;
            this.f21c = d.a(file);
            this.f20c = i;
            this.f10696a = map == null ? new HashMap() : map;
            this.f19a = new WeakHashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            if (this.f10697b.exists()) {
                if (this.f21c.exists()) {
                    this.f10697b.delete();
                } else if (!this.f10697b.renameTo(this.f21c)) {
                    return false;
                }
            }
            try {
                FileOutputStream fileOutputStreamA = a(this.f10697b);
                if (fileOutputStreamA == null) {
                    return false;
                }
                e.a(this.f10696a, fileOutputStreamA);
                fileOutputStreamA.close();
                this.f21c.delete();
                return true;
            } catch (Exception unused) {
                if (this.f10697b.exists()) {
                    this.f10697b.delete();
                }
                return false;
            }
        }

        @Override // com.ta.utdid2.b.a.b
        public boolean b() {
            return this.f10697b != null && new File(this.f10697b.getAbsolutePath()).exists();
        }

        public boolean d() {
            boolean z;
            synchronized (this) {
                z = this.j;
            }
            return z;
        }

        @Override // com.ta.utdid2.b.a.b
        public Map<String, ?> getAll() {
            HashMap map;
            synchronized (this) {
                map = new HashMap(this.f10696a);
            }
            return map;
        }

        @Override // com.ta.utdid2.b.a.b
        public long getLong(String str, long j) {
            synchronized (this) {
                try {
                    Long l = (Long) this.f10696a.get(str);
                    if (l != null) {
                        j = l.longValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j;
        }

        @Override // com.ta.utdid2.b.a.b
        public String getString(String str, String str2) {
            synchronized (this) {
                String str3 = (String) this.f10696a.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: com.ta.utdid2.b.a.d$a$a, reason: collision with other inner class name */
        public final class C0339a implements b.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map<String, Object> f10699b = new HashMap();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f10700k = false;

            public C0339a() {
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a a(String str, String str2) {
                synchronized (this) {
                    this.f10699b.put(str, str2);
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a b() {
                synchronized (this) {
                    this.f10700k = true;
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<b.InterfaceC0338b> hashSet;
                boolean zE;
                synchronized (d.f10694b) {
                    try {
                        z = a.this.f19a.size() > 0;
                        if (z) {
                            arrayList = new ArrayList();
                            hashSet = new HashSet(a.this.f19a.keySet());
                        } else {
                            arrayList = null;
                            hashSet = null;
                        }
                        synchronized (this) {
                            try {
                                if (this.f10700k) {
                                    a.this.f10696a.clear();
                                    this.f10700k = false;
                                }
                                for (Map.Entry<String, Object> entry : this.f10699b.entrySet()) {
                                    String key = entry.getKey();
                                    Object value = entry.getValue();
                                    if (value == this) {
                                        a.this.f10696a.remove(key);
                                    } else {
                                        a.this.f10696a.put(key, value);
                                    }
                                    if (z) {
                                        arrayList.add(key);
                                    }
                                }
                                this.f10699b.clear();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        zE = a.this.e();
                        if (zE) {
                            a.this.a(true);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        for (b.InterfaceC0338b interfaceC0338b : hashSet) {
                            if (interfaceC0338b != null) {
                                interfaceC0338b.a(a.this, str);
                            }
                        }
                    }
                }
                return zE;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a a(String str, int i) {
                synchronized (this) {
                    this.f10699b.put(str, Integer.valueOf(i));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a a(String str, long j) {
                synchronized (this) {
                    this.f10699b.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a a(String str, float f) {
                synchronized (this) {
                    this.f10699b.put(str, Float.valueOf(f));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a a(String str, boolean z) {
                synchronized (this) {
                    this.f10699b.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.ta.utdid2.b.a.b.a
            public b.a a(String str) {
                synchronized (this) {
                    this.f10699b.put(str, this);
                }
                return this;
            }
        }

        public void a(boolean z) {
            synchronized (this) {
                this.j = z;
            }
        }

        public void a(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.f10696a = map;
                }
            }
        }

        @Override // com.ta.utdid2.b.a.b
        public b.a a() {
            return new C0339a();
        }

        private FileOutputStream a(File file) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
        }
    }

    public d(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.f10695a = new File(str);
    }

    private File a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    private File b(String str) {
        return a(a(), str + ".xml");
    }

    private File a() {
        File file;
        synchronized (this.f17a) {
            file = this.f10695a;
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x008f A[Catch: all -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:33:0x005e, B:53:0x008f), top: B:80:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0098 A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #17 {all -> 0x009c, blocks: (B:58:0x0098, B:64:0x00b3, B:61:0x009e, B:63:0x00a9), top: B:91:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[Catch: all -> 0x009c, TryCatch #17 {all -> 0x009c, blocks: (B:58:0x0098, B:64:0x00b3, B:61:0x009e, B:63:0x00a9), top: B:91:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9 A[Catch: all -> 0x009c, TryCatch #17 {all -> 0x009c, blocks: (B:58:0x0098, B:64:0x00b3, B:61:0x009e, B:63:0x00a9), top: B:91:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ta.utdid2.b.a.b, com.ta.utdid2.b.a.d$a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.ta.utdid2.b.a.b] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    public b a(String str, int i) throws Throwable {
        a aVar;
        ?? r1;
        FileInputStream fileInputStream;
        File fileB = b(str);
        synchronized (f10694b) {
            try {
                a aVar2 = this.f18a.get(fileB);
                if (aVar2 != 0 && !aVar2.d()) {
                    return aVar2;
                }
                File fileA = a(fileB);
                if (fileA.exists()) {
                    fileB.delete();
                    fileA.renameTo(fileB);
                }
                ?? A = 0;
                A = 0;
                A = 0;
                FileInputStream fileInputStream2 = null;
                FileInputStream fileInputStream3 = null;
                A = 0;
                FileInputStream fileInputStream4 = null;
                if (fileB.exists()) {
                    ?? CanRead = fileB.canRead();
                    try {
                        try {
                            if (CanRead != 0) {
                                try {
                                    FileInputStream fileInputStream5 = new FileInputStream(fileB);
                                    try {
                                        A = e.a(fileInputStream5);
                                        fileInputStream5.close();
                                        try {
                                            fileInputStream5.close();
                                        } catch (Throwable unused) {
                                        }
                                    } catch (XmlPullParserException unused2) {
                                        ?? r4 = A;
                                        fileInputStream2 = fileInputStream5;
                                        CanRead = r4;
                                        try {
                                            fileInputStream = new FileInputStream(fileB);
                                            try {
                                                fileInputStream.read(new byte[fileInputStream.available()]);
                                                try {
                                                    fileInputStream.close();
                                                } catch (Throwable unused3) {
                                                }
                                            } catch (Exception unused4) {
                                                fileInputStream2 = fileInputStream;
                                                if (fileInputStream2 != null) {
                                                    try {
                                                        fileInputStream2.close();
                                                    } catch (Throwable unused5) {
                                                    }
                                                }
                                                fileInputStream = fileInputStream2;
                                                if (fileInputStream != null) {
                                                    fileInputStream.close();
                                                    CanRead = CanRead;
                                                }
                                                A = CanRead;
                                                synchronized (f10694b) {
                                                    try {
                                                        if (aVar2 != 0) {
                                                            aVar2.a((Map) A);
                                                            r1 = aVar2;
                                                        } else {
                                                            aVar = this.f18a.get(fileB);
                                                            if (aVar == null) {
                                                                r1 = aVar;
                                                                a aVar3 = new a(fileB, i, A);
                                                                this.f18a.put(fileB, aVar3);
                                                                r1 = aVar3;
                                                            }
                                                        }
                                                        return r1;
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileInputStream2 = fileInputStream;
                                                if (fileInputStream2 != null) {
                                                    try {
                                                        fileInputStream2.close();
                                                    } catch (Throwable unused6) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Exception unused7) {
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                            CanRead = CanRead;
                                        }
                                        A = CanRead;
                                    } catch (Exception unused8) {
                                        ?? r5 = A;
                                        fileInputStream3 = fileInputStream5;
                                        CanRead = r5;
                                        if (fileInputStream3 != null) {
                                            fileInputStream3.close();
                                            CanRead = CanRead;
                                        }
                                        A = CanRead;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileInputStream4 = fileInputStream5;
                                        if (fileInputStream4 != null) {
                                            try {
                                                fileInputStream4.close();
                                            } catch (Throwable unused9) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (XmlPullParserException unused10) {
                                    CanRead = 0;
                                } catch (Exception unused11) {
                                    CanRead = 0;
                                }
                            }
                        } catch (Throwable unused12) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                synchronized (f10694b) {
                    if (aVar2 != 0) {
                        aVar2.a((Map) A);
                        r1 = aVar2;
                    } else {
                        aVar = this.f18a.get(fileB);
                        if (aVar == null) {
                            r1 = aVar;
                            a aVar4 = new a(fileB, i, A);
                            this.f18a.put(fileB, aVar4);
                            r1 = aVar4;
                        }
                    }
                }
                return r1;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File a(File file) {
        return new File(file.getPath() + ".bak");
    }
}
