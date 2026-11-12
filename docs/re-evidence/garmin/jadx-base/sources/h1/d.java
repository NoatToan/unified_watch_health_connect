package h1;

import am.j;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.analytics.FirebaseAnalytics;
import d53.w;
import java.io.File;
import java.text.DecimalFormat;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh1/d;", "", "<init>", "()V", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f80738a = 0;

    static {
        new d();
    }

    private d() {
    }

    public static final void a(long j8) {
        if (j8 < 0) {
            h.s("Bytes cannot be negative");
            return;
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d14 = j8;
        int i14 = 0;
        double d15 = d14;
        while (d15 >= 1024.0d && i14 < 4) {
            d15 /= 1024.0d;
            i14++;
        }
        if (i14 == 0) {
            decimalFormat.format(d15);
            String str = strArr[i14];
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        while (-1 < i14) {
            double dPow = Math.pow(1024.0d, i14);
            double dFloor = Math.floor(d14 / dPow);
            if (dFloor > 0.0d) {
                sb3.append(decimalFormat.format(dFloor));
                sb3.append(StringUtils.SPACE);
                sb3.append(strArr[i14]);
                sb3.append(StringUtils.SPACE);
                d14 -= dFloor * dPow;
            }
            i14--;
        }
        w.i0(sb3).toString();
    }

    public static final long b(File file) {
        String path = file.getPath();
        path.getClass();
        return new StatFs(path).getAvailableBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r0.equals("external") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r0.equals("external_primary") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r3 = android.os.Environment.getExternalStorageDirectory();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return b(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(Uri uri) {
        if (!s.g(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
            e0.n(j.j(uri, "Not a content uri: "));
            return 0L;
        }
        String str = uri.getPathSegments().get(0);
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1921573490) {
                if (iHashCode != -1820761141) {
                    if (iHashCode == 570410685 && str.equals("internal")) {
                        File dataDirectory = Environment.getDataDirectory();
                        dataDirectory.getClass();
                        return b(dataDirectory);
                    }
                }
            }
        }
        uri.toString();
        return Long.MAX_VALUE;
    }
}
