package aa0;

import a81.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import c53.c0;
import c53.q;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import d53.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.z;
import y80.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Laa0/g;", "Laa0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "uri", "Ly80/a0;", "deviceStorageHelper", "<init>", "(Landroid/content/Context;Landroid/net/Uri;Ly80/a0;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2208c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f2210b;

    static {
        new a(null);
    }

    public g(Context context, Uri uri, a0 a0Var) {
        context.getClass();
        uri.getClass();
        a0Var.getClass();
        this.f2209a = context;
        this.f2210b = uri;
    }

    public static void b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.getClass();
                b(file2);
            }
        }
        file.delete();
    }

    public static void c(g gVar, File file) throws IOException {
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
            c53.g.a aVar = new c53.g.a(c0.h(c0.o(c0.o(q.b(new z(enumerationEntries)), new f(file2, 0)), new m(11)), new m(12)));
            while (aVar.hasNext()) {
                k kVar = (k) aVar.next();
                ZipEntry zipEntry = kVar.f2216a;
                File file3 = kVar.f2217b;
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

    @Override // aa0.b
    public final Object a(v13.c cVar) {
        File filesDir;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        StringBuilder sb3 = new StringBuilder("getAnimationHolder: Processing ZIP file from URI: ");
        Uri uri = this.f2210b;
        sb3.append(uri);
        String string = sb3.toString();
        aVar.getClass();
        i2.a.b(a2Var, "GetZipAnimationHolderUseCase", string);
        try {
            boolean zEquals = "mounted".equals(Environment.getExternalStorageState());
            Context context = this.f2209a;
            if (zEquals) {
                filesDir = context.getExternalFilesDir(null);
                if (filesDir == null) {
                    filesDir = context.getFilesDir();
                }
                filesDir.getClass();
            } else {
                filesDir = context.getFilesDir();
                filesDir.getClass();
            }
            File file = new File(filesDir, "tutorials");
            b(file);
            file.mkdir();
            File file2 = new File(file, "tutorials.zip");
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            if (inputStreamOpenInputStream != null) {
                dh.b.p(inputStreamOpenInputStream, fileOutputStream, 8192);
            }
            fileOutputStream.close();
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            c(this, file2);
            List<File> listS = c0.s(c0.h(a23.f.c(file, a23.c.TOP_DOWN), new m(10)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = "";
            String strA = null;
            dr1.a aVar2 = null;
            for (File file3 : listS) {
                String name = file3.getName();
                name.getClass();
                if (w.z(name, "lottie.json", true)) {
                    try {
                        strA = a23.e.a(file3, d53.c.f57666b);
                    } catch (Exception e4) {
                        String string2 = e4.toString();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var2, "GetZipAnimationHolderUseCase", string2);
                        str = str + "\n\nError reading text from Lottie .json file " + e4.getMessage();
                    }
                } else {
                    String name2 = file3.getName();
                    name2.getClass();
                    if (w.z(name2, "lottie_tutorials_setup.json", true)) {
                        try {
                            aVar2 = (dr1.a) new Gson().fromJson(a23.e.a(file3, d53.c.f57666b), dr1.a.class);
                        } catch (Exception e14) {
                            String string3 = e14.toString();
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar4.getClass();
                            i2.a.f(a2Var3, "GetZipAnimationHolderUseCase", string3);
                            str = str + "\n\nError parsing lottie_tutorials_setup.json " + e14.getMessage();
                        }
                    } else {
                        String name3 = file3.getName();
                        name3.getClass();
                        if (w.z(name3, ".png", true)) {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(file3));
                            if (bitmapDecodeStream != null) {
                                linkedHashMap.put(file3.getName(), bitmapDecodeStream);
                            } else {
                                str = str + "\n\nError decoding Bitmap from " + file3.getName();
                            }
                        }
                    }
                }
            }
            if (strA == null) {
                str = str + "\n\nCannot find a valid Lottie .json file (name ending in \"lottie.json\")";
            }
            if (aVar2 == null) {
                str = str + "\n\nCannot find a valid lottie_tutorials_setup.json";
            }
            if (linkedHashMap.get("device_frame.png") == null) {
                str = str + "\n\nMissing device_frame.png asset";
            }
            i2.a aVar5 = i2.f36769a;
            aVar5.getClass();
            i2.a.b(a2.GENERAL, "GetZipAnimationHolderUseCase", "processZipFile: errors=" + str);
            if (strA == null || aVar2 == null) {
                return null;
            }
            return a0.a(strA, aVar2, linkedHashMap, new k22.b(context), null);
        } catch (Exception e15) {
            String string4 = e15.toString();
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var4, "GetZipAnimationHolderUseCase", string4);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Laa0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GCM_TUTORIALS_FOLDER", "GCM_TUTORIALS_FILE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
