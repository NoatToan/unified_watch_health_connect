package cl2;

import android.content.Context;
import ca0.d4;
import ds.e0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcl2/h;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f27950a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f27951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f27952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27953d;

    static {
        Logger logger = LoggerFactory.getLogger("CFT#CoreTransferUtil");
        logger.getClass();
        f27951b = logger;
        f27952c = m.b(new d4(16));
        f27953d = "/transfer";
    }

    private h() {
    }

    public static File a(String str, UUID uuid, String str2) {
        String absolutePath;
        File filesDir;
        uuid.getClass();
        str2.getClass();
        Context context = (Context) f27952c.getValue();
        if (context == null || (filesDir = context.getFilesDir()) == null || (absolutePath = filesDir.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        String strConcat = absolutePath.concat(str);
        File file = new File(strConcat);
        if (!file.exists() && !file.mkdirs()) {
            e0.v("Unable to create ", file.getPath(), f27951b);
        }
        return new File(strConcat + "/" + str2 + "--" + uuid + ".tmp");
    }

    public static File b(String str, wk2.f fVar, long j8) {
        return a(str + "/" + j8, fVar.f185842a, fVar.f185843b);
    }

    public static List c(wk2.h hVar, long j8) {
        hVar.getClass();
        File[] fileArrListFiles = new File(f27953d + (hVar == wk2.h.DEVICE_TO_PHONE ? "/sink" : "/source") + "/" + j8).listFiles();
        if (fileArrListFiles == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }
}
