package defpackage;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class h1s implements cei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f19589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19590b;
    public final ClassLoader c;
    public final Map<String, Object> d;
    public final Set<String> e;

    public class a implements PrivilegedAction<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19591a;

        public a(String str) {
            this.f19591a = str;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream run() {
            return h1s.this.c != null ? h1s.this.c.getResourceAsStream(this.f19591a) : ClassLoader.getSystemResourceAsStream(this.f19591a);
        }
    }

    public h1s(String str) throws IOException {
        this(str, null, false);
    }

    public static Map<String, Object> e(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            g(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static void g(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // defpackage.cei
    public DateTimeZone a(String str) {
        Object obj;
        if (str == null || (obj = this.d.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? d(str) : a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : d(str);
    }

    @Override // defpackage.cei
    public Set<String> b() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:9:0x001a */
    public final DateTimeZone d(String str) throws Throwable {
        InputStream inputStreamF;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                inputStreamF = f(str);
                try {
                    DateTimeZone dateTimeZoneB = xq5.b(inputStreamF, str);
                    this.d.put(str, new SoftReference(dateTimeZoneB));
                    if (inputStreamF != null) {
                        try {
                            inputStreamF.close();
                        } catch (IOException unused) {
                        }
                    }
                    return dateTimeZoneB;
                } catch (IOException e) {
                    e = e;
                    h(e);
                    this.d.remove(str);
                    if (inputStreamF != null) {
                        try {
                            inputStreamF.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamF = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final InputStream f(String str) throws IOException {
        if (this.f19589a != null) {
            return new FileInputStream(new File(this.f19589a, str));
        }
        String strConcat = this.f19590b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new a(strConcat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(strConcat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.c;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    public void h(Exception exc) {
        exc.printStackTrace();
    }

    public h1s(File file) throws IOException {
        if (file != null) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    this.f19589a = file;
                    this.f19590b = null;
                    this.c = null;
                    Map<String, Object> mapE = e(f("ZoneInfoMap"));
                    this.d = mapE;
                    this.e = Collections.unmodifiableSortedSet(new TreeSet(mapE.keySet()));
                    return;
                }
                throw new IOException("File doesn't refer to a directory: " + file);
            }
            throw new IOException("File directory doesn't exist: " + file);
        }
        throw new IllegalArgumentException("No file directory provided");
    }

    public h1s(String str, ClassLoader classLoader, boolean z) throws IOException {
        if (str != null) {
            if (!str.endsWith("/")) {
                str = str + '/';
            }
            this.f19589a = null;
            this.f19590b = str;
            if (classLoader == null && !z) {
                classLoader = getClass().getClassLoader();
            }
            this.c = classLoader;
            Map<String, Object> mapE = e(f("ZoneInfoMap"));
            this.d = mapE;
            this.e = Collections.unmodifiableSortedSet(new TreeSet(mapE.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }
}
