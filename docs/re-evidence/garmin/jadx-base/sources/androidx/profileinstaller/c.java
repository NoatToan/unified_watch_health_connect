package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10232a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10233b = new b();

    public class a implements InterfaceC0142c {
        @Override // androidx.profileinstaller.c.InterfaceC0142c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0142c
        public final void b(int i14, Object obj) {
        }
    }

    public class b implements InterfaceC0142c {
        @Override // androidx.profileinstaller.c.InterfaceC0142c
        public final void a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0142c
        public final void b(int i14, Object obj) {
            if (i14 == 6 || i14 == 7 || i14 == 8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0142c {
        void a();

        void b(int i14, Object obj);
    }

    private c() {
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th3) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015f A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #12 {all -> 0x0175, blocks: (B:98:0x0153, B:100:0x015f, B:111:0x0178, B:112:0x017d), top: B:256:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0178 A[Catch: all -> 0x0175, TRY_ENTER, TryCatch #12 {all -> 0x0175, blocks: (B:98:0x0153, B:100:0x015f, B:111:0x0178, B:112:0x017d), top: B:256:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0189 A[Catch: IllegalStateException -> 0x016e, IOException -> 0x0170, FileNotFoundException -> 0x0173, TRY_LEAVE, TryCatch #31 {FileNotFoundException -> 0x0173, IOException -> 0x0170, IllegalStateException -> 0x016e, blocks: (B:96:0x014b, B:101:0x0169, B:119:0x0189, B:117:0x0186, B:116:0x0183), top: B:283:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:126:0x019f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01c2 A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #30 {all -> 0x01d1, blocks: (B:134:0x01b6, B:136:0x01c2, B:145:0x01d4), top: B:274:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01d4 A[Catch: all -> 0x01d1, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x01d1, blocks: (B:134:0x01b6, B:136:0x01c2, B:145:0x01d4), top: B:274:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x021c A[Catch: all -> 0x0251, TryCatch #29 {all -> 0x0251, blocks: (B:168:0x0216, B:170:0x021c, B:171:0x0220, B:173:0x0226, B:174:0x022b, B:194:0x0254, B:195:0x025b), top: B:273:0x0216, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0226 A[Catch: all -> 0x0251, LOOP:0: B:171:0x0220->B:173:0x0226, LOOP_END, TryCatch #29 {all -> 0x0251, blocks: (B:168:0x0216, B:170:0x021c, B:171:0x0220, B:173:0x0226, B:174:0x022b, B:194:0x0254, B:195:0x025b), top: B:273:0x0216, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0293  */
    /* JADX WARN: Code duplicated, block: B:226:0x029c  */
    /* JADX WARN: Code duplicated, block: B:231:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:256:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x022b A[EDGE_INSN: B:285:0x022b->B:174:0x022b BREAK  A[LOOP:0: B:171:0x0220->B:173:0x0226], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2 A[Catch: all -> 0x0108, IllegalStateException -> 0x010c, IOException -> 0x010e, TRY_LEAVE, TryCatch #30 {IOException -> 0x010e, IllegalStateException -> 0x010c, all -> 0x0108, blocks: (B:53:0x00e8, B:55:0x00f2, B:67:0x0111, B:68:0x0116), top: B:284:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0111 A[Catch: all -> 0x0108, IllegalStateException -> 0x010c, IOException -> 0x010e, TRY_ENTER, TryCatch #30 {IOException -> 0x010e, IllegalStateException -> 0x010c, all -> 0x0108, blocks: (B:53:0x00e8, B:55:0x00f2, B:67:0x0111, B:68:0x0116), top: B:284:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0145  */
    public static void b(Context context, Executor executor, InterfaceC0142c interfaceC0142c, boolean z14) {
        AssetManager assetManager;
        FileInputStream fileInputStreamA;
        byte[] bArr;
        Throwable th3;
        int i14;
        gd.a[] aVarArr;
        gd.a[] aVarArr2;
        InterfaceC0142c interfaceC0142c2;
        gd.a[] aVarArr3;
        byte[] bArr2;
        byte[] bArr3;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i15;
        boolean z15;
        ByteArrayOutputStream byteArrayOutputStream;
        androidx.profileinstaller.b bVar;
        FileInputStream fileInputStreamA2;
        boolean z16;
        boolean z17;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z14) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j8 = dataInputStream.readLong();
                            dataInputStream.close();
                            z17 = j8 == packageInfo.lastUpdateTime;
                            if (z17) {
                                interfaceC0142c.b(2, null);
                            }
                        } catch (Throwable th4) {
                            try {
                                dataInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException unused) {
                        z17 = false;
                    }
                } else {
                    z17 = false;
                }
                if (z17) {
                    context.getPackageName();
                    d.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, interfaceC0142c, name, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            byte[] bArr5 = bVar2.f10224d;
            if (bArr5 != null) {
                File file2 = bVar2.f10225e;
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            bVar2.f10229i = true;
                            assetManager = bVar2.f10221a;
                            InterfaceC0142c interfaceC0142c3 = bVar2.f10223c;
                            fileInputStreamA = bVar2.a(assetManager, bVar2.f10227g);
                            bArr = gd.d.f76942a;
                            if (fileInputStreamA != null) {
                                if (Arrays.equals(bArr, gd.b.b(fileInputStreamA, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                gd.a[] aVarArrG = gd.d.g(fileInputStreamA, gd.b.b(fileInputStreamA, 4), bVar2.f10226f);
                                fileInputStreamA.close();
                                aVarArr = aVarArrG;
                                bVar2.f10230j = aVarArr;
                            }
                            aVarArr2 = bVar2.f10230j;
                            if (aVarArr2 != null) {
                                fileInputStreamA2 = bVar2.a(assetManager, bVar2.f10228h);
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                } else {
                                    if (Arrays.equals(gd.d.f76943b, gd.b.b(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f10230j = gd.d.d(fileInputStreamA2, gd.b.b(fileInputStreamA2, 4), bArr5, aVarArr2);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                }
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            }
                            interfaceC0142c2 = bVar2.f10223c;
                            aVarArr3 = bVar2.f10230j;
                            bArr2 = bVar2.f10224d;
                            if (aVarArr3 != null) {
                                if (bVar2.f10229i) {
                                    h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (gd.d.i(byteArrayOutputStream, bArr2, aVarArr3)) {
                                    bVar2.f10231k = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bVar2.f10230j = null;
                                } else {
                                    interfaceC0142c2.b(5, null);
                                    bVar2.f10230j = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr3 = bVar2.f10231k;
                            if (bArr3 != null) {
                                if (bVar2.f10229i) {
                                    h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream(bVar2.f10225e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i15 = byteArrayInputStream.read(bArr4);
                                            if (i15 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i15);
                                        }
                                        bVar2.b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        bVar2.f10231k = null;
                                        bVar2.f10230j = null;
                                        z15 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z15 = false;
                            if (z15) {
                                a(packageInfo, filesDir);
                            }
                        } else {
                            bVar2.b(4, null);
                        }
                    } catch (IOException unused2) {
                        bVar2.b(4, null);
                    }
                } else if (file2.canWrite()) {
                    bVar2.f10229i = true;
                    assetManager = bVar2.f10221a;
                    InterfaceC0142c interfaceC0142c4 = bVar2.f10223c;
                    try {
                        fileInputStreamA = bVar2.a(assetManager, bVar2.f10227g);
                    } catch (FileNotFoundException e4) {
                        interfaceC0142c4.b(6, e4);
                        fileInputStreamA = null;
                    } catch (IOException e14) {
                        interfaceC0142c4.b(7, e14);
                        fileInputStreamA = null;
                    }
                    bArr = gd.d.f76942a;
                    if (fileInputStreamA != null) {
                        try {
                            if (Arrays.equals(bArr, gd.b.b(fileInputStreamA, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            gd.a[] aVarArrG2 = gd.d.g(fileInputStreamA, gd.b.b(fileInputStreamA, 4), bVar2.f10226f);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e15) {
                                interfaceC0142c4.b(7, e15);
                            }
                            aVarArr = aVarArrG2;
                            bVar2.f10230j = aVarArr;
                        } catch (IOException e16) {
                            i14 = 7;
                            try {
                                interfaceC0142c4.b(7, e16);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e17) {
                                    e = e17;
                                    interfaceC0142c4.b(i14, e);
                                    aVarArr = null;
                                    bVar2.f10230j = aVarArr;
                                    aVarArr2 = bVar2.f10230j;
                                    if (aVarArr2 != null) {
                                        try {
                                            fileInputStreamA2 = bVar2.a(assetManager, bVar2.f10228h);
                                            if (fileInputStreamA2 == null) {
                                                try {
                                                    if (Arrays.equals(gd.d.f76943b, gd.b.b(fileInputStreamA2, 4))) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    bVar2.f10230j = gd.d.d(fileInputStreamA2, gd.b.b(fileInputStreamA2, 4), bArr5, aVarArr2);
                                                    fileInputStreamA2.close();
                                                    bVar = bVar2;
                                                } catch (Throwable th6) {
                                                    try {
                                                        fileInputStreamA2.close();
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th6.addSuppressed(th7);
                                                        throw th6;
                                                    }
                                                }
                                            } else {
                                                if (fileInputStreamA2 != null) {
                                                    fileInputStreamA2.close();
                                                }
                                                bVar = null;
                                            }
                                        } catch (FileNotFoundException e18) {
                                            interfaceC0142c4.b(9, e18);
                                        } catch (IOException e19) {
                                            interfaceC0142c4.b(7, e19);
                                        } catch (IllegalStateException e24) {
                                            bVar2.f10230j = null;
                                            interfaceC0142c4.b(8, e24);
                                        }
                                        if (bVar != null) {
                                            bVar2 = bVar;
                                        }
                                    }
                                    interfaceC0142c2 = bVar2.f10223c;
                                    aVarArr3 = bVar2.f10230j;
                                    bArr2 = bVar2.f10224d;
                                    if (aVarArr3 != null) {
                                        if (bVar2.f10229i) {
                                            h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            return;
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr);
                                                byteArrayOutputStream.write(bArr2);
                                                if (gd.d.i(byteArrayOutputStream, bArr2, aVarArr3)) {
                                                    interfaceC0142c2.b(5, null);
                                                    bVar2.f10230j = null;
                                                    byteArrayOutputStream.close();
                                                } else {
                                                    bVar2.f10231k = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    bVar2.f10230j = null;
                                                }
                                            } catch (Throwable th8) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th8;
                                                } catch (Throwable th9) {
                                                    th8.addSuppressed(th9);
                                                    throw th8;
                                                }
                                            }
                                        } catch (IOException e25) {
                                            interfaceC0142c2.b(7, e25);
                                        } catch (IllegalStateException e26) {
                                            interfaceC0142c2.b(8, e26);
                                        }
                                    }
                                    bArr3 = bVar2.f10231k;
                                    if (bArr3 != null) {
                                        z15 = false;
                                    } else {
                                        try {
                                            if (bVar2.f10229i) {
                                                h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                return;
                                            }
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                                try {
                                                    fileOutputStream = new FileOutputStream(bVar2.f10225e);
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            if (fileLockTryLock != null) {
                                                                try {
                                                                    if (fileLockTryLock.isValid()) {
                                                                        bArr4 = new byte[512];
                                                                        while (true) {
                                                                            i15 = byteArrayInputStream.read(bArr4);
                                                                            if (i15 > 0) {
                                                                                break;
                                                                            } else {
                                                                                fileOutputStream.write(bArr4, 0, i15);
                                                                            }
                                                                        }
                                                                        bVar2.b(1, null);
                                                                        fileLockTryLock.close();
                                                                        channel.close();
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        bVar2.f10231k = null;
                                                                        bVar2.f10230j = null;
                                                                        z15 = true;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    if (fileLockTryLock == null) {
                                                                        throw th10;
                                                                    }
                                                                    try {
                                                                        fileLockTryLock.close();
                                                                        throw th10;
                                                                    } catch (Throwable th11) {
                                                                        th10.addSuppressed(th11);
                                                                        throw th10;
                                                                    }
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th;
                                                                    } catch (Throwable th12) {
                                                                        th.addSuppressed(th12);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                        } catch (Throwable th13) {
                                                            if (channel == null) {
                                                                throw th13;
                                                            }
                                                            try {
                                                                channel.close();
                                                                throw th13;
                                                            } catch (Throwable th14) {
                                                                th13.addSuppressed(th14);
                                                                throw th13;
                                                            }
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th;
                                                            } catch (Throwable th15) {
                                                                th.addSuppressed(th15);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th16) {
                                                        fileOutputStream.close();
                                                        throw th16;
                                                    }
                                                } catch (Throwable th17) {
                                                    byteArrayInputStream.close();
                                                    throw th17;
                                                }
                                            } catch (FileNotFoundException e27) {
                                                bVar2.b(6, e27);
                                                bVar2.f10231k = null;
                                                bVar2.f10230j = null;
                                                z15 = false;
                                            } catch (IOException e28) {
                                                bVar2.b(7, e28);
                                                bVar2.f10231k = null;
                                                bVar2.f10230j = null;
                                                z15 = false;
                                            }
                                        } catch (Throwable th18) {
                                            bVar2.f10231k = null;
                                            bVar2.f10230j = null;
                                            throw th18;
                                        }
                                    }
                                    if (z15) {
                                        a(packageInfo, filesDir);
                                    }
                                    if (z15) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    d.c(context, z16);
                                }
                                aVarArr = null;
                            } catch (Throwable th19) {
                                th = th19;
                                th3 = th;
                                try {
                                    fileInputStreamA.close();
                                    throw th3;
                                } catch (IOException e29) {
                                    interfaceC0142c4.b(i14, e29);
                                    throw th3;
                                }
                            }
                        } catch (IllegalStateException e34) {
                            try {
                                interfaceC0142c4.b(8, e34);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e35) {
                                    e = e35;
                                    i14 = 7;
                                    interfaceC0142c4.b(i14, e);
                                    aVarArr = null;
                                    bVar2.f10230j = aVarArr;
                                    aVarArr2 = bVar2.f10230j;
                                    if (aVarArr2 != null) {
                                        fileInputStreamA2 = bVar2.a(assetManager, bVar2.f10228h);
                                        if (fileInputStreamA2 == null) {
                                            if (fileInputStreamA2 != null) {
                                                fileInputStreamA2.close();
                                            }
                                            bVar = null;
                                        } else {
                                            if (Arrays.equals(gd.d.f76943b, gd.b.b(fileInputStreamA2, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            bVar2.f10230j = gd.d.d(fileInputStreamA2, gd.b.b(fileInputStreamA2, 4), bArr5, aVarArr2);
                                            fileInputStreamA2.close();
                                            bVar = bVar2;
                                        }
                                        if (bVar != null) {
                                            bVar2 = bVar;
                                        }
                                    }
                                    interfaceC0142c2 = bVar2.f10223c;
                                    aVarArr3 = bVar2.f10230j;
                                    bArr2 = bVar2.f10224d;
                                    if (aVarArr3 != null) {
                                        if (bVar2.f10229i) {
                                            h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            return;
                                        }
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr);
                                        byteArrayOutputStream.write(bArr2);
                                        if (gd.d.i(byteArrayOutputStream, bArr2, aVarArr3)) {
                                            interfaceC0142c2.b(5, null);
                                            bVar2.f10230j = null;
                                            byteArrayOutputStream.close();
                                        } else {
                                            bVar2.f10231k = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bVar2.f10230j = null;
                                        }
                                    }
                                    bArr3 = bVar2.f10231k;
                                    if (bArr3 != null) {
                                        if (bVar2.f10229i) {
                                            h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            return;
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        fileOutputStream = new FileOutputStream(bVar2.f10225e);
                                        channel = fileOutputStream.getChannel();
                                        fileLockTryLock = channel.tryLock();
                                        if (fileLockTryLock != null) {
                                            if (fileLockTryLock.isValid()) {
                                                bArr4 = new byte[512];
                                                while (true) {
                                                    i15 = byteArrayInputStream.read(bArr4);
                                                    if (i15 > 0) {
                                                        break;
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr4, 0, i15);
                                                }
                                                bVar2.b(1, null);
                                                fileLockTryLock.close();
                                                channel.close();
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                bVar2.f10231k = null;
                                                bVar2.f10230j = null;
                                                z15 = true;
                                            }
                                        }
                                        throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                    }
                                    z15 = false;
                                    if (z15) {
                                        a(packageInfo, filesDir);
                                    }
                                    if (z15) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    d.c(context, z16);
                                }
                                aVarArr = null;
                            } catch (Throwable th20) {
                                th = th20;
                                i14 = 7;
                                th3 = th;
                                fileInputStreamA.close();
                                throw th3;
                            }
                        } catch (Throwable th21) {
                            th3 = th21;
                            i14 = 7;
                            fileInputStreamA.close();
                            throw th3;
                        }
                    }
                    aVarArr2 = bVar2.f10230j;
                    if (aVarArr2 != null && Build.VERSION.SDK_INT >= 31) {
                        fileInputStreamA2 = bVar2.a(assetManager, bVar2.f10228h);
                        if (fileInputStreamA2 == null) {
                            if (fileInputStreamA2 != null) {
                                fileInputStreamA2.close();
                            }
                            bVar = null;
                        } else {
                            if (Arrays.equals(gd.d.f76943b, gd.b.b(fileInputStreamA2, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            bVar2.f10230j = gd.d.d(fileInputStreamA2, gd.b.b(fileInputStreamA2, 4), bArr5, aVarArr2);
                            fileInputStreamA2.close();
                            bVar = bVar2;
                        }
                        if (bVar != null) {
                            bVar2 = bVar;
                        }
                    }
                    interfaceC0142c2 = bVar2.f10223c;
                    aVarArr3 = bVar2.f10230j;
                    bArr2 = bVar2.f10224d;
                    if (aVarArr3 != null && bArr2 != null) {
                        if (bVar2.f10229i) {
                            h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr2);
                        if (gd.d.i(byteArrayOutputStream, bArr2, aVarArr3)) {
                            interfaceC0142c2.b(5, null);
                            bVar2.f10230j = null;
                            byteArrayOutputStream.close();
                        } else {
                            bVar2.f10231k = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar2.f10230j = null;
                        }
                    }
                    bArr3 = bVar2.f10231k;
                    if (bArr3 != null) {
                        if (bVar2.f10229i) {
                            h.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            return;
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                        fileOutputStream = new FileOutputStream(bVar2.f10225e);
                        channel = fileOutputStream.getChannel();
                        fileLockTryLock = channel.tryLock();
                        if (fileLockTryLock != null) {
                            if (fileLockTryLock.isValid()) {
                                bArr4 = new byte[512];
                                while (true) {
                                    i15 = byteArrayInputStream.read(bArr4);
                                    if (i15 > 0) {
                                        break;
                                        break;
                                    }
                                    fileOutputStream.write(bArr4, 0, i15);
                                }
                                bVar2.b(1, null);
                                fileLockTryLock.close();
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                bVar2.f10231k = null;
                                bVar2.f10230j = null;
                                z15 = true;
                            }
                        }
                        throw new IOException("Unable to acquire a lock on the underlying file channel.");
                    }
                    z15 = false;
                    if (z15) {
                        a(packageInfo, filesDir);
                    }
                } else {
                    bVar2.b(4, null);
                }
                if (z15 || !z14) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                d.c(context, z16);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z15 = false;
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            d.c(context, z16);
        } catch (PackageManager.NameNotFoundException e36) {
            interfaceC0142c.b(7, e36);
            d.c(context, false);
        }
    }
}
