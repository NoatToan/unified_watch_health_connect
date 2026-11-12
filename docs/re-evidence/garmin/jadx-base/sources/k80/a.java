package k80;

import android.net.Uri;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c53.c0;
import c53.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.z;
import y80.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk80/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f103330g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<m> f103331a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<aa0.d> f103332b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<String> f103333c = new y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<Uri> f103334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f103335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f103336f;

    static {
        new C1982a(null);
    }

    public a() {
        y0<Uri> y0Var = new y0<>(null);
        this.f103334d = y0Var;
        this.f103335e = y0Var;
        this.f103336f = (a0) KoinJavaComponent.get$default(a0.class, null, null, 6, null);
    }

    public static void x4(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.getClass();
                x4(file2);
            }
        }
        file.delete();
    }

    public static void y4(a aVar, File file) {
        File parentFile = file.getParentFile();
        parentFile.getClass();
        File file2 = new File(parentFile.getAbsolutePath());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            enumerationEntries.getClass();
            c53.g.a aVar2 = new c53.g.a(c0.h(c0.o(c0.o(q.b(new z(enumerationEntries)), new aa0.f(file2, 1)), new jy0.b(26)), new jy0.b(27)));
            while (aVar2.hasNext()) {
                n nVar = (n) aVar2.next();
                ZipEntry zipEntry = nVar.f103371a;
                File file3 = nVar.f103372b;
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        inputStream.getClass();
                        dh.b.p(inputStream, fileOutputStream, 8192);
                        Unit unit = Unit.INSTANCE;
                        fileOutputStream.close();
                        inputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        jg.b.l(inputStream, th5);
                        throw th6;
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
            zipFile.close();
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                jg.b.l(zipFile, th7);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: k80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lk80/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GCM_TUTORIALS_FOLDER", "GCM_TUTORIALS_FILE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1982a {
        public /* synthetic */ C1982a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1982a() {
        }
    }
}
