package bc2;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import com.garmin.android.lib.connectdevicesync.exception.ServerProcessingTimeoutException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import wb2.g0;
import wb2.r;
import wb2.t0;

/* JADX INFO: loaded from: classes11.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Timer f17416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17417e;

    public class a implements FilenameFilter {
        public a(b bVar) {
        }

        @Override // java.io.FilenameFilter
        @SuppressLint({"DefaultLocale"})
        public final boolean accept(File file, String str) {
            if (str != null) {
                return str.toLowerCase(Locale.US).endsWith(".tmp");
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: bc2.b$b, reason: collision with other inner class name */
    public class C0246b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f17418a;

        public C0246b(File file) {
            this.f17418a = file;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            byte b14;
            b bVar = b.this;
            try {
                if (!((il2.e) ec2.e.b()).p()) {
                    bVar.f17420a.debug(g.b.INVALID_USER_CREDENTIAL.f17464a);
                    return;
                }
                File[] fileArrListFiles = this.f17418a.listFiles(bVar.f17417e);
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return;
                }
                for (File file : fileArrListFiles) {
                    String[] strArr = new String[4];
                    if (file != null) {
                        String name = file.getName();
                        int iIndexOf = name.indexOf("_");
                        int i14 = iIndexOf + 1;
                        int iIndexOf2 = name.indexOf("_", i14);
                        try {
                            int i15 = iIndexOf2 + 3;
                            strArr = new String[]{name.substring(0, iIndexOf), name.substring(i14, iIndexOf2), name.substring(iIndexOf2 + 1, i15), name.substring(i15, iIndexOf2 + 5)};
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    }
                    byte b15 = t0.f184140q;
                    long j8 = -1;
                    byte b16 = -1;
                    try {
                        try {
                            j8 = Long.parseLong(strArr[0]);
                            try {
                                int i16 = Integer.parseInt(strArr[1]);
                                b16 = (byte) Integer.parseInt(strArr[2], 16);
                                try {
                                    byte b17 = (byte) Integer.parseInt(strArr[3], 16);
                                    try {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append(file.getName());
                                        stringBuffer.append(" has been resolved to [");
                                        stringBuffer.append(j8);
                                        stringBuffer.append("/");
                                        stringBuffer.append(i16);
                                        stringBuffer.append("/");
                                        stringBuffer.append((int) b16);
                                        stringBuffer.append("/");
                                        stringBuffer.append((int) b17);
                                        stringBuffer.append("]");
                                        bVar.f17420a.debug(stringBuffer.toString());
                                        g0 g0VarE = r.f().e();
                                        if (g0VarE == null) {
                                            try {
                                                bVar.f17420a.warn("Cannot retry upload when ISyncGdiProxy is unavailable");
                                                return;
                                            } catch (NumberFormatException e4) {
                                                e = e4;
                                                b15 = b17;
                                            }
                                        } else {
                                            byte b18 = b16;
                                            long j14 = j8;
                                            b14 = b17;
                                            try {
                                                try {
                                                    b.this.j(j14, file, e.a(bVar.f17421b).b(g0VarE, j14, b18, b14), b18, b14, false);
                                                } catch (NumberFormatException e14) {
                                                    e = e14;
                                                    j14 = j14;
                                                    b18 = b18;
                                                    b14 = b14;
                                                    j8 = j14;
                                                    b16 = b18;
                                                    b15 = b14;
                                                    bVar.f17420a.error(String.format(g.b.INVALID_FILE_DESCRIPTOR.f17464a, file.getAbsolutePath(), Long.valueOf(j8), Byte.valueOf(b16), Byte.valueOf(b15)), (Throwable) e);
                                                }
                                            } catch (NumberFormatException e15) {
                                                e = e15;
                                            }
                                        }
                                    } catch (NumberFormatException e16) {
                                        e = e16;
                                        b14 = b17;
                                    }
                                    b15 = b14;
                                } catch (NumberFormatException e17) {
                                    e = e17;
                                }
                            } catch (NumberFormatException e18) {
                                e = e18;
                            }
                        } catch (NumberFormatException e19) {
                            e = e19;
                        }
                    } catch (Exception e24) {
                        bVar.f17420a.error(e24.getMessage(), (Throwable) e24);
                    }
                    bVar.f17420a.error(String.format(g.b.INVALID_FILE_DESCRIPTOR.f17464a, file.getAbsolutePath(), Long.valueOf(j8), Byte.valueOf(b16), Byte.valueOf(b15)), (Throwable) e);
                }
            } catch (Throwable th3) {
                bVar.f17420a.error(th3.getMessage());
            }
        }
    }

    public b(Context context) {
        super("GuaranteedUploadStrategy");
        this.f17416d = null;
        this.f17417e = new a(this);
        this.f17421b = context;
        i();
    }

    @Override // bc2.d
    public final String c() {
        return "/uploads/guaranteed";
    }

    @Override // bc2.d
    public final void g() {
        Timer timer = this.f17416d;
        if (timer != null) {
            timer.cancel();
            this.f17416d.purge();
            this.f17416d = null;
            this.f17420a.debug("stopGuaranteedUploadTimer: UploadTimer cancelled");
        }
        super.g();
    }

    public final void i() {
        File file = new File(this.f17421b.getFilesDir(), "/uploads/guaranteed");
        if (!file.exists()) {
            file.mkdirs();
        }
        Timer timer = this.f17416d;
        Logger logger = this.f17420a;
        if (timer != null) {
            timer.cancel();
            this.f17416d.purge();
            this.f17416d = null;
            logger.debug("stopGuaranteedUploadTimer: UploadTimer cancelled");
        }
        Timer timer2 = new Timer("SYNC_GuaranteedServerUploadStrategy_UploadTimer");
        this.f17416d = timer2;
        timer2.schedule(new C0246b(file), 60000L, 3600000L);
        logger.debug("startGuaranteedUploadTimer: UploadTimer created");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00cd, please report this as an issue */
    public final h j(long j8, File file, String str, byte b14, byte b15, boolean z14) throws ServerException {
        hy2.c cVar;
        File file2 = file;
        String str2 = str;
        h(file2, str2);
        if (this.f17416d == null) {
            i();
        }
        byte[] bArrE = e(file2);
        byte b16 = b14;
        byte b17 = b15;
        h hVar = new h(str2, b16, b17);
        boolean z15 = true;
        int i14 = 1;
        while (z15 && i14 <= 3) {
            boolean zP = ((il2.e) ec2.e.b()).p();
            Logger logger = this.f17420a;
            if (!zP) {
                String str3 = g.b.INVALID_USER_CREDENTIAL.f17464a;
                logger.debug(str3);
                throw new ServerException(wb2.h.INVALID_USER_CREDENTIAL, str3);
            }
            logger.debug("uploadFile: (attempt #" + i14 + ")");
            h hVarF = f(file2, str2, b16, b17, z14, j8, bArrE);
            File file3 = file2;
            hVarF.b();
            hy2.c cVar2 = hVarF.f184118e;
            if (cVar2 == null || !cVar2.c()) {
                logger.error(String.format(g.b.GC_EXCEPTION.f17464a, file3.getName(), Integer.valueOf(hVarF.e()), hVarF.c()));
                if (hVarF.f()) {
                    if ((hVarF.c() instanceof IOException) || ((cVar = hVarF.f184118e) != null && cVar.a())) {
                        hVar = hVarF;
                        z15 = true;
                    } else {
                        hVar = hVarF;
                        z15 = false;
                    }
                } else if (hVarF.g()) {
                    a(file3);
                    hVar = hVarF;
                    z15 = false;
                } else {
                    hVar = hVarF;
                    z15 = true;
                }
            } else {
                try {
                    try {
                        hVarF = d(hVarF, this.f17422c, file3.getName(), j8);
                        try {
                            a(file3);
                        } catch (ServerProcessingTimeoutException unused) {
                            a(file3);
                        } catch (Exception unused2) {
                            z15 = true;
                            hVar = hVarF;
                            if (z15) {
                                logger.debug("Trying to upload " + file3.getName() + " again in 5000ms");
                                i14++;
                                try {
                                    Thread.sleep(5000L);
                                } catch (InterruptedException unused3) {
                                }
                            }
                            str2 = str;
                            b16 = b14;
                            b17 = b15;
                            file2 = file3;
                        }
                    } catch (ServerProcessingTimeoutException unused4) {
                        hVarF = hVarF;
                    } catch (Exception unused5) {
                        hVarF = hVarF;
                    }
                } catch (ServerProcessingTimeoutException unused6) {
                } catch (Exception unused7) {
                }
                hVar = hVarF;
                z15 = false;
            }
            if (z15) {
                logger.debug("Trying to upload " + file3.getName() + " again in 5000ms");
                i14++;
                Thread.sleep(5000L);
            }
            str2 = str;
            b16 = b14;
            b17 = b15;
            file2 = file3;
        }
        return hVar;
    }
}
