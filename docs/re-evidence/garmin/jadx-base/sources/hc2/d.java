package hc2;

import bc2.g;
import bc2.h;
import ch.qos.logback.classic.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.TimerTask;
import wb2.g0;
import wb2.r;
import wb2.t0;

/* JADX INFO: loaded from: classes11.dex */
public class d extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f83299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f83300b;

    public class a implements FilenameFilter {
        public a(d dVar) {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.toLowerCase().endsWith(".fit");
        }
    }

    public d(e eVar, File file) {
        this.f83300b = eVar;
        this.f83299a = file;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        e eVar = this.f83300b;
        try {
            if (((il2.e) ec2.e.b()).p()) {
                File[] fileArrListFiles = this.f83299a.listFiles(new a(this));
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return;
                }
                for (File file : fileArrListFiles) {
                    eVar.getClass();
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
                    byte b14 = t0.f184140q;
                    long j8 = -1;
                    byte b15 = -1;
                    try {
                        try {
                            j8 = Long.parseLong(strArr[0]);
                            try {
                                int i16 = Integer.parseInt(strArr[1]);
                                b15 = (byte) Integer.parseInt(strArr[2], 16);
                                try {
                                    b14 = (byte) Integer.parseInt(strArr[3], 16);
                                    try {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append(file.getName());
                                        stringBuffer.append(" has been resolved to [");
                                        stringBuffer.append(j8);
                                        stringBuffer.append("/");
                                        stringBuffer.append(i16);
                                        stringBuffer.append("/");
                                        stringBuffer.append((int) b15);
                                        stringBuffer.append("/");
                                        stringBuffer.append((int) b14);
                                        stringBuffer.append("]");
                                        eVar.f17420a.debug(stringBuffer.toString());
                                        g0 g0VarE = r.f().e();
                                        if (g0VarE == null) {
                                            eVar.f17420a.warn("Cannot retry upload when ISyncGdiProxy is unavailable");
                                            return;
                                        }
                                        byte b16 = b14;
                                        byte b17 = b15;
                                        try {
                                            String strB = bc2.e.a(eVar.f17421b).b(g0VarE, j8, b17, b16);
                                            h hVar = new h();
                                            hVar.h(strB);
                                            Logger logger = eVar.f17420a;
                                            if (strB != null) {
                                                logger.debug("Uploading file to " + strB);
                                                try {
                                                    this.f83300b.k(file, strB, b17, b16, hVar);
                                                } catch (NumberFormatException e4) {
                                                    e = e4;
                                                    b17 = b17;
                                                    b16 = b16;
                                                    j8 = j8;
                                                    b15 = b17;
                                                    b14 = b16;
                                                    eVar.f17420a.error(String.format(g.b.INVALID_FILE_DESCRIPTOR.f17464a, file.getAbsolutePath(), Long.valueOf(j8), Byte.valueOf(b15), Byte.valueOf(b14)), (Throwable) e);
                                                }
                                            } else {
                                                logger.debug("Unable to upload file.  Invalid endpoint");
                                            }
                                        } catch (NumberFormatException e14) {
                                            e = e14;
                                        }
                                    } catch (NumberFormatException e15) {
                                        e = e15;
                                        eVar.f17420a.error(String.format(g.b.INVALID_FILE_DESCRIPTOR.f17464a, file.getAbsolutePath(), Long.valueOf(j8), Byte.valueOf(b15), Byte.valueOf(b14)), (Throwable) e);
                                    }
                                } catch (NumberFormatException e16) {
                                    e = e16;
                                }
                            } catch (NumberFormatException e17) {
                                e = e17;
                            }
                        } catch (Exception e18) {
                            eVar.f17420a.error(e18.getMessage(), (Throwable) e18);
                        }
                    } catch (NumberFormatException e19) {
                        e = e19;
                    }
                }
            }
        } catch (Throwable th3) {
            eVar.f17420a.error(th3.getMessage());
        }
    }
}
