package defpackage;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import xcrash.XCrash;

/* JADX INFO: loaded from: classes3.dex */
public class tl9 {
    public static final tl9 m = new tl9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34813a = "placeholder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34814b = ".clean.xcrash";
    public String c = ".dirty.xcrash";
    public String d = null;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 1;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34815k = 0;
    public AtomicInteger l = new AtomicInteger();

    public class a implements FilenameFilter {
        public a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl9.this.f34813a);
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            return str.startsWith(sb.toString()) && str.endsWith(tl9.this.c);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tl9.this.h();
        }
    }

    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            tl9.this.h();
        }
    }

    public class d implements FilenameFilter {
        public d() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl9.this.f34813a);
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            return str.startsWith(sb.toString()) && str.endsWith(tl9.this.f34814b);
        }
    }

    public class e implements FilenameFilter {
        public e() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl9.this.f34813a);
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            return str.startsWith(sb.toString()) && str.endsWith(tl9.this.f34814b);
        }
    }

    public class f implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34821a;

        public f(String str) {
            this.f34821a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("tombstone_") && str.endsWith(this.f34821a);
        }
    }

    public class g implements Comparator<File> {
        public g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    public class h implements FilenameFilter {
        public h() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl9.this.f34813a);
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            return str.startsWith(sb.toString()) && str.endsWith(tl9.this.f34814b);
        }
    }

    public class i implements FilenameFilter {
        public i() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl9.this.f34813a);
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            return str.startsWith(sb.toString()) && str.endsWith(tl9.this.c);
        }
    }

    public class j implements FilenameFilter {
        public j() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(tl9.this.f34813a);
            sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            return str.startsWith(sb.toString()) && str.endsWith(tl9.this.f34814b);
        }
    }

    public static tl9 l() {
        return m;
    }

    public boolean e(String str, String str2) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rws");
                try {
                    long j2 = 0;
                    if (randomAccessFile2.length() > 0) {
                        MappedByteBuffer map = randomAccessFile2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile2.length());
                        long length = randomAccessFile2.length();
                        while (length > 0 && map.get(((int) length) - 1) == 0) {
                            length--;
                        }
                        j2 = length;
                    }
                    randomAccessFile2.seek(j2);
                    randomAccessFile2.write(str2.getBytes("UTF-8"));
                    try {
                        randomAccessFile2.close();
                    } catch (Exception unused) {
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    randomAccessFile = randomAccessFile2;
                    XCrash.f().e("xcrash", "FileManager appendText failed", e);
                    if (randomAccessFile == null) {
                        return false;
                    }
                    try {
                        randomAccessFile.close();
                        return false;
                    } catch (Exception unused2) {
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b4 A[Catch: Exception -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x00b7, blocks: (B:36:0x00b4, B:30:0x00a1), top: B:54:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean f(File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        boolean zRenameTo = false;
        try {
            try {
                try {
                    byte[] bArr = new byte[1024];
                    Arrays.fill(bArr, (byte) 0);
                    long j2 = this.j;
                    long length = file.length();
                    if (length > this.j * 1024) {
                        j2 = length / 1024;
                        if (length % 1024 != 0) {
                            j2++;
                        }
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsoluteFile(), false);
                    int i2 = 0;
                    while (i2 < j2) {
                        i2++;
                        if (i2 == j2) {
                            try {
                                try {
                                    if (length % 1024 != 0) {
                                        fileOutputStream2.write(bArr, 0, (int) (length % 1024));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStream2;
                                XCrash.f().e("xcrash", "FileManager cleanTheDirtyFile failed", e);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (!zRenameTo) {
                                    try {
                                        file.delete();
                                    } catch (Exception unused2) {
                                    }
                                }
                                return zRenameTo;
                            }
                        }
                        fileOutputStream2.write(bArr);
                    }
                    fileOutputStream2.flush();
                    try {
                        zRenameTo = file.renameTo(new File(String.format(Locale.US, "%s/%s_%020d%s", this.d, this.f34813a, Long.valueOf((new Date().getTime() * 1000) + ((long) m())), this.f34814b)));
                        fileOutputStream2.close();
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        XCrash.f().e("xcrash", "FileManager cleanTheDirtyFile failed", e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (!zRenameTo) {
                            file.delete();
                        }
                        return zRenameTo;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                if (!zRenameTo) {
                    file.delete();
                }
                return zRenameTo;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
        }
    }

    public File g(String str) {
        String str2 = this.d;
        if (str2 == null || !tlq.a(str2)) {
            return null;
        }
        File file = new File(str);
        File[] fileArrListFiles = new File(this.d).listFiles(new d());
        if (fileArrListFiles != null) {
            for (int length = fileArrListFiles.length; length > 0; length--) {
                File file2 = fileArrListFiles[length - 1];
                try {
                    if (file2.renameTo(file)) {
                        return file;
                    }
                    file2.delete();
                } catch (Exception e2) {
                    XCrash.f().e("xcrash", "FileManager createLogFile by renameTo failed", e2);
                }
            }
        }
        try {
            if (file.createNewFile()) {
                return file;
            }
            XCrash.f().e("xcrash", "FileManager createLogFile by createNewFile failed, file already exists");
            return null;
        } catch (Exception e3) {
            XCrash.f().e("xcrash", "FileManager createLogFile by createNewFile failed", e3);
            return null;
        }
    }

    public final void h() {
        if (tlq.a(this.d)) {
            File file = new File(this.d);
            try {
                j(file);
            } catch (Exception e2) {
                XCrash.f().e("xcrash", "FileManager doMaintainTombstone failed", e2);
            }
            try {
                i(file);
            } catch (Exception e3) {
                XCrash.f().e("xcrash", "FileManager doMaintainPlaceholder failed", e3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[LOOP:0: B:9:0x0020->B:28:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[EDGE_INSN: B:51:0x008a->B:30:0x008a BREAK  A[LOOP:0: B:9:0x0020->B:28:0x0086], SYNTHETIC] */
    public final void i(File file) {
        File[] fileArrListFiles;
        int i2;
        File[] fileArrListFiles2 = file.listFiles(new h());
        if (fileArrListFiles2 == null || (fileArrListFiles = file.listFiles(new i())) == null) {
            return;
        }
        int length = fileArrListFiles2.length;
        int length2 = fileArrListFiles.length;
        char c2 = 0;
        int i3 = 0;
        while (length < this.i) {
            if (length2 > 0) {
                if (f(fileArrListFiles[length2 - 1])) {
                    length++;
                }
                length2--;
            } else {
                try {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[4];
                    objArr[c2] = this.d;
                    objArr[1] = this.f34813a;
                    i2 = i3;
                    try {
                        objArr[2] = Long.valueOf((new Date().getTime() * 1000) + ((long) m()));
                        objArr[3] = this.c;
                        File file2 = new File(String.format(locale, "%s/%s_%020d%s", objArr));
                        if (file2.createNewFile() && f(file2)) {
                            length++;
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i2 = i3;
                }
                i3 = i2 + 1;
                if (i3 > this.i * 2) {
                    break;
                } else {
                    c2 = 0;
                }
            }
            i2 = i3;
            i3 = i2 + 1;
            if (i3 > this.i * 2) {
                break;
                break;
            }
            c2 = 0;
        }
        if (i3 > 0) {
            fileArrListFiles2 = file.listFiles(new j());
            fileArrListFiles = file.listFiles(new a());
        }
        if (fileArrListFiles2 != null && fileArrListFiles2.length > this.i) {
            for (int i4 = 0; i4 < fileArrListFiles2.length - this.i; i4++) {
                fileArrListFiles2[i4].delete();
            }
        }
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                file3.delete();
            }
        }
    }

    public final void j(File file) {
        k(file, ".native.xcrash", this.f);
        k(file, ".java.xcrash", this.e);
        k(file, ".anr.xcrash", this.g);
        k(file, ".trace.xcrash", this.h);
    }

    public final boolean k(File file, String str, int i2) {
        File[] fileArrListFiles = file.listFiles(new f(str));
        boolean z = true;
        if (fileArrListFiles != null && fileArrListFiles.length > i2) {
            if (i2 > 0) {
                Arrays.sort(fileArrListFiles, new g());
            }
            for (int i3 = 0; i3 < fileArrListFiles.length - i2; i3++) {
                if (!q(fileArrListFiles[i3])) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final int m() {
        int iIncrementAndGet = this.l.incrementAndGet();
        if (iIncrementAndGet >= 999) {
            this.l.set(0);
        }
        return iIncrementAndGet;
    }

    public void n(String str, int i2, int i3, int i4, int i5, int i6, int i7) {
        File[] fileArrListFiles;
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.i = i5;
        this.j = i6;
        this.f34815k = i7;
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        if (!name.startsWith("tombstone_")) {
                            if (name.startsWith(this.f34813a + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)) {
                                if (name.endsWith(this.f34814b)) {
                                    i12++;
                                } else if (name.endsWith(this.c)) {
                                    i13++;
                                }
                            }
                        } else if (name.endsWith(".java.xcrash")) {
                            i8++;
                        } else if (name.endsWith(".native.xcrash")) {
                            i9++;
                        } else if (name.endsWith(".anr.xcrash")) {
                            i10++;
                        } else if (name.endsWith(".trace.xcrash")) {
                            i11++;
                        }
                    }
                }
                int i14 = this.e;
                if (i8 <= i14 && i9 <= this.f && i10 <= this.g && i11 <= this.h && i12 == this.i && i13 == 0) {
                    this.f34815k = -1;
                    return;
                }
                if (i8 <= i14 + 10) {
                    int i15 = this.f;
                    if (i9 <= i15 + 10) {
                        int i16 = this.g;
                        if (i10 <= i16 + 10) {
                            int i17 = this.h;
                            if (i11 <= i17 + 10) {
                                int i18 = this.i;
                                if (i12 <= i18 + 10 && i13 <= 10) {
                                    if (i8 > i14 || i9 > i15 || i10 > i16 || i11 > i17 || i12 > i18 || i13 > 0) {
                                        this.f34815k = 0;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
                h();
                this.f34815k = -1;
            }
        } catch (Exception e2) {
            XCrash.f().e("xcrash", "FileManager init failed", e2);
        }
    }

    public void o() {
        int i2;
        if (this.d == null || (i2 = this.f34815k) < 0) {
            return;
        }
        try {
            if (i2 == 0) {
                new Thread(new b(), "xcrash_file_mgr").start();
            } else {
                new Timer("xcrash_file_mgr").schedule(new c(), this.f34815k);
            }
        } catch (Exception e2) {
            XCrash.f().e("xcrash", "FileManager maintain start failed", e2);
        }
    }

    public boolean p() {
        if (!tlq.a(this.d)) {
            return false;
        }
        try {
            return k(new File(this.d), ".anr.xcrash", this.g);
        } catch (Exception e2) {
            XCrash.f().e("xcrash", "FileManager maintainAnr failed", e2);
            return false;
        }
    }

    public boolean q(File file) {
        if (file == null) {
            return false;
        }
        if (this.d == null || this.i <= 0) {
            try {
                return file.delete();
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            File[] fileArrListFiles = new File(this.d).listFiles(new e());
            if (fileArrListFiles != null && fileArrListFiles.length >= this.i) {
                try {
                    return file.delete();
                } catch (Exception unused2) {
                    return false;
                }
            }
            File file2 = new File(String.format(Locale.US, "%s/%s_%020d%s", this.d, this.f34813a, Long.valueOf((new Date().getTime() * 1000) + ((long) m())), this.c));
            if (file.renameTo(file2)) {
                return f(file2);
            }
            try {
                return file.delete();
            } catch (Exception unused3) {
                return false;
            }
        } catch (Exception e2) {
            XCrash.f().e("xcrash", "FileManager recycleLogFile failed", e2);
            try {
                return file.delete();
            } catch (Exception unused4) {
                return false;
            }
        }
    }
}
