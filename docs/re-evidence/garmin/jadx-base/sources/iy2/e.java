package iy2;

import android.content.Context;
import com.garmin.sync.gc.exception.ServerException;
import d53.w;
import ds.e0;
import gy2.f;
import gy2.h;
import gy2.i;
import java.io.File;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy2/e;", "", "", "loggingPrefix", "<init>", "(Ljava/lang/String;)V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f95856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f95857b;

    public e(String str) {
        str.getClass();
        Logger logger = LoggerFactory.getLogger(str.concat("SwDownloadStrategy"));
        logger.getClass();
        this.f95856a = logger;
        this.f95857b = new f(str);
    }

    public final gy2.e a(long j8, String str, long j14, File file, Context context, boolean z14, HashMap map) {
        Logger logger = this.f95856a;
        file.getClass();
        try {
            f.f80309b.getClass();
            String strA = f.a.a(str);
            if (strA == null) {
                throw new IllegalArgumentException("Invalid server path [$ serverPath ] or filename in server [$ fileNameInServer ]");
            }
            boolean z15 = file.exists() && file.length() > 0 && j14 == file.length();
            StringBuilder sb3 = new StringBuilder();
            if (z15) {
                sb3.append("Loading Software Update for deviceId=");
                sb3.append(j8);
                sb3.append(" from ");
                sb3.append(file.getAbsolutePath());
                logger.debug(sb3.toString());
            } else {
                sb3.append("Downloading Software Update for deviceId=");
                sb3.append(j8);
                sb3.append(" from ");
                id2.f.f93041c.getClass();
                sb3.append(id2.f.a.a(strA));
                sb3.append(" to ");
                sb3.append(file.getAbsolutePath());
                logger.debug(sb3.toString());
                this.f95857b.b(strA, file, context, z14, map);
            }
            String parent = file.getParent();
            parent.getClass();
            String name = file.getName();
            name.getClass();
            return new gy2.e(parent, name, file.length(), null, 8, null);
        } catch (Exception e4) {
            StringBuilder sbK = e0.k(j8, "Unable to download Software Update for deviceId=", ". ");
            sbK.append(e4.getMessage());
            logger.error(sbK.toString(), (Throwable) e4);
            if (!(e4 instanceof ServerException)) {
                throw new ServerException(i.SOFTWARE_UPDATE_FILE_DOWNLOAD_FAILED, sbK.toString(), null, null, 12, null);
            }
            ServerException serverException = (ServerException) e4;
            throw new ServerException(serverException.getFailure(), sbK.toString(), serverException.getUrl(), serverException.getHttpCode());
        }
    }

    public final gy2.e b(gy2.c cVar, File file, Context context, boolean z14) {
        cVar.getClass();
        file.getClass();
        long jA = cVar.a();
        String strG = cVar.g();
        String string = strG != null ? w.i0(strG).toString() : null;
        String strB = cVar.b();
        String string2 = strB != null ? w.i0(strB).toString() : null;
        this.f95857b.getClass();
        String strA = f.a(string, string2);
        Long lValueOf = Long.valueOf(cVar.a());
        String str = cVar.f80292c;
        h hVar = cVar.f80294e;
        return a(jA, strA, cVar.c(), file, context, z14, nd2.a.a(lValueOf, str, hVar != null ? hVar.f80327a : null));
    }
}
