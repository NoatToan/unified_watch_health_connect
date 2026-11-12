package pi1;

import am.j;
import com.garmin.android.apps.connectmobile.z1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import o13.t;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;
import tn.k;
import wb2.l0;
import wb2.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpi1/h;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f137864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f137865b;

    static {
        new a(null);
    }

    public static void a(i iVar, File file, String str) throws IOException {
        t tVar = iVar.f137866a;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                file2.getClass();
                if (a23.g.e(file2).equals("gz")) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file2));
                    String strH = com.nimbusds.jose.shaded.gson.internal.a.h(str, "/", a23.g.f(file2), ".log");
                    ZipOutputStream zipOutputStream = iVar.f137867b;
                    ZipEntry zipEntryJ = iVar.j(strH);
                    zipEntryJ.setTime(file2.lastModified());
                    Unit unit = Unit.INSTANCE;
                    zipOutputStream.putNextEntry(zipEntryJ);
                    while (true) {
                        try {
                            int i14 = gZIPInputStream.read((byte[]) tVar.getValue());
                            if (i14 == -1) {
                                break;
                            } else {
                                zipOutputStream.write((byte[]) tVar.getValue(), 0, i14);
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                jg.b.l(gZIPInputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    gZIPInputStream.close();
                } else if (a23.g.e(file2).equals("log")) {
                    i.a(iVar, file2, str + "/" + file2.getName());
                }
            }
        }
    }

    public final File b(z1 z1Var) throws IOException {
        z1Var.getClass();
        File file = this.f137864a;
        if (file == null) {
            file = new File(b.a(z1Var, null), "logs");
        }
        try {
            FileUtils.deleteQuietly(file);
            y.a aVar = y.f136664a;
            String str = "Successfully deleted any existing directory at " + file.getCanonicalPath();
            aVar.getClass();
            y.a.a("LogZipBuilder", str);
        } catch (NoSuchMethodError unused) {
            y.f136664a.getClass();
            y.a.c("LogZipBuilder", "Caught exception deleting quietly");
        }
        file.mkdirs();
        String string = DateTime.now().toString("yyyyMMdd-HHmmss");
        String str2 = this.f137865b;
        File file2 = new File(file, (str2 == null || str2.length() == 0) ? j.m("gcm-", string, ".zip") : k.g(this.f137865b, ".zip"));
        i iVar = new i(file2);
        try {
            String strC = new f(z1Var).c();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = strC.getBytes(charset);
            bytes.getClass();
            i.c(iVar, bytes, "diagnostics.html");
            b.f137854a.getClass();
            File fileB = b.b(z1Var);
            if (fileB.exists()) {
                i.a(iVar, fileB, "logs");
            }
            File file3 = new File(z1Var.getFilesDir(), "logs");
            if (file3.exists()) {
                a(iVar, file3, "logs");
            }
            File fileA = b.a(z1Var, null);
            if (fileA.exists()) {
                a(iVar, new File(fileA, "gcm_logs"), "public-logs");
            }
            ArrayList<m> arrayListA = new l0(z1Var).a();
            if (arrayListA != null && (!arrayListA.isEmpty())) {
                StringBuilder sb3 = new StringBuilder(arrayListA.size() * 1000);
                for (m mVar : arrayListA) {
                    sb3.append(new DateTime(mVar.f184064e).toString());
                    sb3.append("\n");
                    sb3.append(mVar.f184062c);
                    sb3.append("\n");
                    sb3.append(mVar.f184060a);
                    sb3.append("\n");
                    sb3.append(mVar.f184061b);
                    sb3.append("\n\n");
                }
                String string2 = sb3.toString();
                Charset charset2 = StandardCharsets.UTF_8;
                charset2.getClass();
                byte[] bytes2 = string2.getBytes(charset2);
                bytes2.getClass();
                i.c(iVar, bytes2, "sync-audits.txt");
            }
            Unit unit = Unit.INSTANCE;
            iVar.close();
            return file2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(iVar, th3);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lpi1/h$a;", "", "<init>", "()V", "", "LOG_FOLDER", "Ljava/lang/String;", "PUBLIC_LOG_FOLDER", "DIAGNOSTICS_FILE", "SYNC_AUDITS_FILE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
