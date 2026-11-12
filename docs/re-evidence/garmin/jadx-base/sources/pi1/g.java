package pi1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpi1/g;", "", "Ljava/io/File;", "outputDir", "<init>", "(Ljava/io/File;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f137863a;

    static {
        new a(null);
    }

    public /* synthetic */ g(File file, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : file);
    }

    public static void a(pi1.a aVar, File file, String str) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                file2.getClass();
                if (a23.g.e(file2).equals("gz")) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file2));
                    try {
                        File fileJ = aVar.j(com.nimbusds.jose.shaded.gson.internal.a.h(str, "/", a23.g.f(file2), ".log"));
                        if (fileJ != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileJ);
                            try {
                                dh.b.p(gZIPInputStream, fileOutputStream, 2048);
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    jg.b.l(fileOutputStream, th3);
                                    throw th4;
                                }
                            }
                        }
                        gZIPInputStream.close();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            jg.b.l(gZIPInputStream, th5);
                            throw th6;
                        }
                    }
                } else if (a23.g.e(file2).equals("log")) {
                    pi1.a.c(aVar, file2, str + "/" + file2.getName());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lpi1/g$a;", "", "<init>", "()V", "", "LOG_FOLDER", "Ljava/lang/String;", "PUBLIC_LOG_FOLDER", "DIAGNOSTICS_FILE", "SYNC_AUDITS_FILE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public g(File file) {
        this.f137863a = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
