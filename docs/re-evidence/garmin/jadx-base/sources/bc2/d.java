package bc2;

import android.content.Context;
import android.text.TextUtils;
import bs2.ad;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import com.garmin.android.lib.connectdevicesync.exception.ServerProcessingTimeoutException;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.lang3.BooleanUtils;
import wb2.b0;
import wb2.o0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f17420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17422c = 0;

    public d(String str) {
        String strN = fb1.c.n("SYNC#", str);
        int i14 = gt2.c.f79010a;
        this.f17420a = gt2.b.f79005a.i(strN);
    }

    public static String b(String str) {
        int iIndexOf;
        String strValueOf;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int iIndexOf2 = str.indexOf("_") + 1;
            if (iIndexOf2 <= 0 || iIndexOf2 >= str.length() || (iIndexOf = str.indexOf("_", iIndexOf2)) <= 0 || iIndexOf >= str.length()) {
                return str;
            }
            String strSubstring = str.substring(iIndexOf2, iIndexOf);
            int i14 = iIndexOf + 1;
            int iIndexOf3 = str.indexOf(".", i14);
            if (iIndexOf3 <= 0) {
                return str;
            }
            String strSubstring2 = str.substring(i14, iIndexOf3);
            if (strSubstring2.length() != 4) {
                return str;
            }
            byte b14 = (byte) Integer.parseInt(strSubstring2.substring(0, 2), 16);
            if (b14 == -128) {
                strValueOf = "FIT";
            } else if (b14 == -1) {
                strValueOf = "NON_FIT";
            } else if (b14 == 2) {
                strValueOf = "GRAPHIC";
            } else {
                strValueOf = b14 == -1 ? "INVALID" : String.valueOf((int) b14);
            }
            int i15 = Integer.parseInt(strSubstring2.substring(2, 4), 16);
            int i16 = b0.F;
            short s8 = (short) i15;
            for (ad adVar : ad.values()) {
                if (s8 == adVar.f19675a) {
                    return "fileIdx:" + strSubstring + ", type:" + strValueOf + "-" + adVar.name() + ", " + str;
                }
            }
            adVar = ad.INVALID;
            return "fileIdx:" + strSubstring + ", type:" + strValueOf + "-" + adVar.name() + ", " + str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public final void a(File file) {
        StringBuilder sb3 = new StringBuilder("Deleting ");
        sb3.append(file.getAbsolutePath());
        sb3.append(" from Android device: ");
        if (file.exists()) {
            sb3.append(file.delete() ? "successful." : "failed -- uh oh!");
        } else {
            sb3.append("successful - already gone.");
        }
        this.f17420a.debug(sb3.toString());
    }

    public abstract String c();

    public final h d(h hVar, long j8, String str, long j14) {
        long jC;
        String strB = b(str);
        boolean z14 = false;
        h hVar2 = hVar;
        while (true) {
            int iE = hVar2.e();
            Logger logger = this.f17420a;
            if (iE != 202) {
                if (hVar2.e() == 200) {
                    logger.debug("File (" + str + ") was uploaded successfully!");
                } else if (hVar2.e() == 201) {
                    String strD = hVar2.d();
                    logger.trace("201 response body=" + strD);
                    String strB2 = hy2.b.b(strD);
                    if (strB2 != null) {
                        String str2 = String.format(g.b.SERVER_PROCESS_TIMEOUT.f17464a, str, 408, strB2);
                        logger.warn(str2);
                        throw new ServerProcessingTimeoutException(str2);
                    }
                    logger.debug("File (" + str + ") was uploaded successfully!");
                } else if (hVar2.e() == 204) {
                    logger.debug(String.format(g.b.FILE_SKIPPED_EMPTY.f17464a, strB, Integer.valueOf(hVar2.e())));
                } else if (hVar2.e() == 400) {
                    logger.debug(String.format(g.b.UNABLE_TO_PROCESS_FILE.f17464a, strB, Integer.valueOf(hVar2.e())));
                } else if (hVar2.e() == 409) {
                    logger.debug(String.format(g.b.FILE_SKIPPED_PREVIOUSLY_UPLOADED.f17464a, str, Integer.valueOf(hVar2.e())));
                } else if (hVar2.e() == 406) {
                    logger.debug(String.format(g.b.FILE_UPLOADED_WITH_CAVEAT.f17464a, strB, Integer.valueOf(hVar2.e())));
                } else if (hVar2.e() == 412) {
                    logger.debug(String.format(g.b.UNABLE_TO_PROCESS_FILE.f17464a, strB, Integer.valueOf(hVar2.e())));
                } else if (hVar2.e() == 413 || hVar2.e() == 415 || hVar2.e() == 419) {
                    logger.debug(String.format(g.b.FILE_UPLOADED_WITH_CAVEAT.f17464a, strB, Integer.valueOf(hVar2.e())));
                } else {
                    if (!z14 || hVar2.e() < 500 || hVar2.f17467j != ad.ACTIVITY.f19675a) {
                        g.b bVar = g.b.GC_EXCEPTION;
                        logger.error(String.format(bVar.f17464a, strB, Integer.valueOf(hVar2.e()), hVar2.c()));
                        throw new ServerException(wb2.h.SERVER_FAILURE_RESPONSE_RECEIVED, String.format(bVar.f17464a, hVar2.f17465h, Integer.valueOf(hVar2.e()), hVar2.c()));
                    }
                    logger.debug(String.format(g.b.UNABLE_TO_PROCESS_FILE.f17464a, strB, Integer.valueOf(hVar2.e())));
                }
                if (hVar2.e() >= 300) {
                    logger.warn("******************** SYNC NON-FATAL FAILURE: Upload: GC HTTP Code " + hVar2.e());
                }
                return hVar2;
            }
            if (System.currentTimeMillis() >= j8 + 25000) {
                String str3 = String.format(g.b.SERVER_PROCESS_TOO_LONG.f17464a, strB);
                logger.warn(str3.toString());
                throw new ServerProcessingTimeoutException(str3);
            }
            hy2.c cVar = hVar2.f184118e;
            if (cVar != null) {
                jC = hy2.b.c(cVar);
            } else {
                hVar2.f184116c.warn("No success response. Using default delay [1000] milliseconds.");
                jC = 1000;
            }
            hy2.c cVar2 = hVar2.f184118e;
            String strD2 = cVar2 != null ? cVar2.d(HttpHeaders.LOCATION) : null;
            if (strD2 != null) {
                try {
                    logger.debug(String.format(g.b.STATUS_CHECK_NEEDED.f17464a, str, strD2, Long.valueOf(jC)));
                    Thread.sleep(jC);
                    logger.debug("Checking the upload status of " + str);
                } catch (InterruptedException unused) {
                }
                h hVar3 = new h(hVar2);
                hVar3.f184120g.append(hVar2.f184120g.toString());
                hVar3.h(strD2);
                cc2.g gVar = (cc2.g) ec2.e.c();
                ge1.b.T(gVar.f26753b, null, null, new cc2.e(hVar3, gVar, j14, strD2, null), 3);
                hVar3.b();
                hVar2 = hVar3;
            }
            z14 = true;
        }
    }

    public final byte[] e(File file) {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr, 0, (int) file.length());
                        fileInputStream2.close();
                        return bArr;
                    } catch (IOException unused) {
                        fileInputStream = fileInputStream2;
                        this.f17420a.error("Error reading file " + file.getAbsolutePath());
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return bArr;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        }
    }

    public final h f(File file, String str, byte b14, byte b15, boolean z14, long j8, byte[] bArr) {
        byte[] bArrE = bArr == null ? e(file) : bArr;
        ArrayList arrayListA = o0.a();
        if (z14) {
            com.nimbusds.jose.shaded.gson.internal.a.u("lastFile", BooleanUtils.TRUE, arrayListA);
        }
        e.a(this.f17421b);
        boolean z15 = b14 == -1 && b15 == -11;
        this.f17422c = System.currentTimeMillis();
        StringBuilder sbL = hb.a.l("uploadFile: Uploading to ", str, " from ");
        sbL.append(file.getAbsolutePath());
        this.f17420a.info(sbL.toString());
        h hVar = new h(str, b14, b15);
        hVar.h(str);
        ((cc2.g) ec2.e.c()).a(j8, file.getName(), bArrE, str, arrayListA, z15, hVar);
        return hVar;
    }

    public void g() {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        File file = new File(this.f17421b.getFilesDir(), strC);
        if (file.exists()) {
            for (String str : file.list()) {
                new File(file, str).delete();
            }
        }
    }

    public final void h(File file, String str) throws ServerException {
        boolean zIsFile = file.isFile();
        Logger logger = this.f17420a;
        if (!zIsFile) {
            String str2 = String.format(g.b.INVALID_INPUT_FILE.f17464a, file.getName());
            logger.debug(str2);
            throw new ServerException(wb2.h.TEMP_FILE_READ_FAILED, str2);
        }
        if (TextUtils.isEmpty(str)) {
            String str3 = String.format(g.b.INVALID_SERVER_ENDPOINT.f17464a, str);
            logger.debug(str3);
            throw new ServerException(wb2.h.INVALID_SERVER_ENDPOINT, str3);
        }
    }
}
