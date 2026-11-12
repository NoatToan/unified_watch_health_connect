package hc2;

import android.content.Context;
import android.text.TextUtils;
import bc2.g;
import bc2.h;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import wb2.o0;

/* JADX INFO: loaded from: classes11.dex */
public class e extends bc2.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timer f83302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Timer f83303f;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: hc2.e$a$a, reason: collision with other inner class name */
        public class C1641a implements FileFilter {
            public C1641a(a aVar) {
            }

            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file.getAbsolutePath().toLowerCase().endsWith(".pending");
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C1641a c1641a = new C1641a(this);
            StringBuilder sb3 = new StringBuilder();
            e eVar = e.this;
            sb3.append(eVar.f17421b.getFilesDir());
            sb3.append("/upload/truswing");
            File[] fileArrListFiles = new File(sb3.toString()).listFiles(c1641a);
            for (File file : fileArrListFiles) {
                if (file.lastModified() < System.currentTimeMillis() - 30000) {
                    File file2 = new File(file.getAbsolutePath().replace(".pending", ".fit"));
                    file.renameTo(file2);
                    eVar.f17420a.debug("Triggering upload for pending file " + file2.getName());
                }
            }
            eVar.l();
        }
    }

    public e(Context context) {
        super("GolfSwingServerUploadStrategy");
        this.f83301d = 0L;
        this.f83302e = null;
        this.f83303f = null;
        this.f17421b = context;
        l();
        this.f83303f = new Timer("SYNC_GolfSwingServerUploadStrategy_PendingTimer");
        m();
    }

    @Override // bc2.d
    public final String c() {
        return null;
    }

    @Override // bc2.d
    public final void g() {
        c.c().a();
        for (File file : new File(this.f17421b.getFilesDir() + "/upload/truswing").listFiles()) {
            file.delete();
        }
        Timer timer = this.f83302e;
        Logger logger = this.f17420a;
        if (timer != null) {
            timer.cancel();
            this.f83302e.purge();
            this.f83302e = null;
            logger.debug("stopGuaranteedUploadTimer: UploadTimer cancelled");
        }
        Timer timer2 = this.f83303f;
        if (timer2 != null) {
            timer2.cancel();
            this.f83303f.purge();
            this.f83303f = null;
            logger.debug("stopPendingTimer: pendingTimer cancelled");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.FileOutputStream] */
    public final h i(File file, File file2, File file3, String str, byte b14, byte b15, h hVar) throws Throwable {
        ?? fileOutputStream;
        String lowerCase = file.getAbsolutePath().toLowerCase();
        if (lowerCase.endsWith(".fit")) {
            File file4 = new File(lowerCase.replace(".fit", ".pending"));
            if (file4.exists()) {
                file4.delete();
            }
        }
        boolean zA = dz2.d.a(file, file3);
        Logger logger = this.f17420a;
        if (!zA) {
            logger.error("Failed to copy file to upload folder");
            return hVar;
        }
        ?? r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    fileOutputStream = new FileOutputStream(file3, true);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            r14 = fileInputStream.read(bArr);
                            if (r14 < 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, r14);
                        }
                        fileOutputStream.flush();
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (FileNotFoundException unused2) {
                        r14 = fileInputStream;
                        fileOutputStream = fileOutputStream;
                        logger.error("Swing Sensor Remote file not found!");
                        if (r14 != 0) {
                            try {
                                r14.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (fileOutputStream != 0) {
                        }
                        return k(file3, str, b14, b15, hVar);
                    } catch (IOException unused4) {
                        r14 = fileInputStream;
                        fileOutputStream = fileOutputStream;
                        logger.error("IOException appending remote swing to file.");
                        if (r14 != 0) {
                            try {
                                r14.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != 0) {
                        }
                        return k(file3, str, b14, b15, hVar);
                    } catch (Throwable th3) {
                        th = th3;
                        r14 = fileInputStream;
                        if (r14 != 0) {
                            try {
                                r14.close();
                            } catch (IOException unused6) {
                            }
                        }
                        if (fileOutputStream == 0) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused7) {
                            throw th;
                        }
                    }
                } catch (FileNotFoundException unused8) {
                    fileOutputStream = 0;
                } catch (IOException unused9) {
                    fileOutputStream = 0;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = 0;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (FileNotFoundException unused10) {
            fileOutputStream = 0;
        } catch (IOException unused11) {
            fileOutputStream = 0;
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = 0;
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused12) {
        }
        return k(file3, str, b14, b15, hVar);
    }

    public final h j(hc2.a aVar, b bVar, String str, byte b14, byte b15, h hVar) {
        String str2 = "Handling file upload " + aVar.getName();
        Logger logger = this.f17420a;
        logger.debug(str2);
        boolean z14 = aVar.f83280a;
        if (z14) {
            logger.debug("This is a swing sensor file " + aVar.getName());
            String str3 = this.f17421b.getFilesDir() + "/upload/truswing";
            String lowerCase = aVar.getName().toLowerCase();
            File file = new File(str3, lowerCase);
            b bVarD = c.c().d(bVar.f83281a);
            if (bVarD != null && bVarD.f83283c != null) {
                logger.debug("Found remote swing sensor data, appending and initiating upload " + aVar.getName());
                return i(aVar, new File(bVarD.f83283c), file, str, b14, b15, hVar);
            }
            if (dz2.d.a(aVar, new File(str3, lowerCase.replace(".fit", ".pending")))) {
                logger.debug("Pending this file upload waiting for S6 data " + aVar.getName());
                m();
                return hVar;
            }
        } else if (!z14) {
            logger.debug("This is a remote swing sensor file " + aVar.getName());
            b bVarD2 = c.c().d(bVar.f83281a);
            if (bVarD2 != null && bVarD2.f83282b != null) {
                logger.debug("Found associated swing sensor file, appending and initiating upload " + aVar.getName());
                return i(new File(bVarD2.f83282b), aVar, new File(this.f17421b.getFilesDir() + "/upload/truswing", aVar.getName().toLowerCase()), str, b14, b15, hVar);
            }
            logger.debug("No associated swing sensor file found, so not uploading " + aVar.getName());
        }
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce A[PHI: r1 r10
      0x00ce: PHI (r1v16 bc2.h) = (r1v13 bc2.h), (r1v13 bc2.h), (r1v13 bc2.h), (r1v13 bc2.h), (r1v13 bc2.h), (r1v13 bc2.h), (r1v19 bc2.h) binds: [B:47:0x010d, B:40:0x00fc, B:44:0x0106, B:35:0x00cd, B:34:0x00cb, B:33:0x00c9, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v6 int), (r10v7 int), (r10v8 int), (r10v9 int) binds: [B:47:0x010d, B:40:0x00fc, B:44:0x0106, B:35:0x00cd, B:34:0x00cb, B:33:0x00c9, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    public final h k(File file, String str, byte b14, byte b15, h hVar) throws ServerException {
        int i14;
        hy2.c cVar;
        Logger logger = this.f17420a;
        logger.debug("Performing upload");
        if (!file.isFile()) {
            String str2 = String.format(g.b.INVALID_INPUT_FILE.f17464a, file.getName());
            logger.debug(str2);
            throw new ServerException(wb2.h.TEMP_FILE_READ_FAILED, str2);
        }
        if (TextUtils.isEmpty(str)) {
            String str3 = String.format(g.b.INVALID_SERVER_ENDPOINT.f17464a, str);
            logger.debug(str3);
            throw new ServerException(wb2.h.INVALID_SERVER_ENDPOINT, str3);
        }
        if (this.f83302e == null) {
            logger.debug("Guaranteed upload timer not started.   Starting now.");
            l();
        }
        bc2.e.a(this.f17421b);
        boolean z14 = b14 == -1 && b15 == -11;
        byte[] bArrE = e(file);
        ArrayList arrayListA = o0.a();
        h hVarD = hVar;
        boolean z15 = true;
        int i15 = 1;
        while (z15 && i15 <= 3) {
            if (!((il2.e) ec2.e.b()).p()) {
                String str4 = g.b.INVALID_USER_CREDENTIAL.f17464a;
                logger.debug(str4);
                throw new ServerException(wb2.h.INVALID_USER_CREDENTIAL, str4);
            }
            this.f83301d = System.currentTimeMillis();
            logger.debug("uploadFile: Uploading " + file.getAbsolutePath() + " to " + str + " (attempt #" + i15 + ")");
            ((cc2.g) ec2.e.c()).a(0L, file.getName(), bArrE, str, arrayListA, z14, hVarD);
            hVarD.b();
            hy2.c cVar2 = hVarD.f184118e;
            if (cVar2 == null || !cVar2.c()) {
                i14 = i15;
                logger.error(String.format(g.b.GC_EXCEPTION.f17464a, file.getName(), Integer.valueOf(hVarD.e()), hVarD.c()));
                if (hVarD.f()) {
                    if ((hVarD.c() instanceof IOException) || ((cVar = hVarD.f184118e) != null && cVar.a())) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else if (hVarD.g()) {
                    a(file);
                    z15 = false;
                } else {
                    z15 = true;
                }
            } else {
                try {
                    logger.debug("Handling upload result");
                    int i16 = i15;
                    try {
                        try {
                            i14 = i16;
                            try {
                                hVarD = d(hVarD, this.f83301d, file.getName(), -1L);
                                a(file);
                                oa2.b.a(this.f17421b, "com.garmin.android.lib.connectdevicesync.ACTION_GOLF_SWING_UPLOAD_STRATEGY_SUCCESS", "GolfSwingServerUploadStrategy", null);
                                z15 = false;
                            } catch (Exception unused) {
                                z15 = true;
                            }
                        } catch (Exception unused2) {
                            i14 = i16;
                        }
                    } catch (Exception unused3) {
                        i14 = i16;
                    }
                } catch (Exception unused4) {
                    i14 = i15;
                }
            }
            if (z15) {
                logger.debug("Trying to upload " + file.getName() + " again in 5000ms");
                i15 = i14 + 1;
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException unused5) {
                }
            } else {
                i15 = i14;
            }
        }
        return hVarD;
    }

    public final void l() {
        File file = new File(this.f17421b.getFilesDir(), "/upload/truswing");
        if (!file.exists()) {
            file.mkdirs();
        }
        Timer timer = this.f83302e;
        if (timer != null) {
            timer.cancel();
            this.f83302e.purge();
            this.f83302e = null;
            this.f17420a.debug("stopGuaranteedUploadTimer: UploadTimer cancelled");
        }
        Timer timer2 = new Timer("SYNC_GolfSwingServerUploadStrategy_UploadTimer");
        this.f83302e = timer2;
        timer2.schedule(new d(this, file), 0L, 3600000L);
    }

    public final void m() {
        File file = new File(this.f17421b.getFilesDir(), "/upload/truswing");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.f83303f == null) {
            this.f83303f = new Timer("SYNC_GolfSwingServerUploadStrategy_PendingTimer");
        }
        this.f83303f.schedule(new a(), 30000L);
    }
}
