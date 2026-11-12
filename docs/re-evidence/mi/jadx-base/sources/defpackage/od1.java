package defpackage;

import android.os.FileObserver;
import java.util.Date;
import java.util.regex.Pattern;
import xcrash.XCrash;

/* JADX INFO: loaded from: classes3.dex */
public class od1 {
    public static final od1 g = new od1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f29025a = new Date();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f29026b = Pattern.compile("^-----\\spid\\s(\\d+)\\sat\\s(.*)\\s-----$");
    public final Pattern c = Pattern.compile("^Cmd\\sline:\\s+(.*)$");
    public final long d = 15000;
    public long e = 0;
    public FileObserver f = null;

    public static od1 a() {
        return g;
    }

    public void b() {
        FileObserver fileObserver = this.f;
        if (fileObserver != null) {
            try {
                try {
                    fileObserver.stopWatching();
                } catch (Exception e) {
                    XCrash.f().e("xcrash", "AnrHandler fileObserver stopWatching failed", e);
                }
            } finally {
                this.f = null;
            }
        }
    }
}
