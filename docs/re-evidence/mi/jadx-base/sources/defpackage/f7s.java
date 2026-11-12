package defpackage;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.push.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class f7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17511a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f17512b = 0;
    public static ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static String a(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb.toString();
                        mgt.b(bufferedReader);
                        return string;
                    }
                    sb.append("\n");
                    sb.append(line);
                }
            } catch (Exception unused) {
                mgt.b(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                mgt.b(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static void b() {
        cqs cqsVarD;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((c.getActiveCount() <= 0 || jCurrentTimeMillis - f17512b >= SyncEngine.SYNC_WEATHER_DURATION) && b.e().k() && (cqsVarD = rds.c().d()) != null && cqsVarD.y() > 0) {
            f17512b = jCurrentTimeMillis;
            c(cqsVarD.o(), true);
        }
    }

    public static void c(List<String> list, boolean z) {
        c.execute(new k7s(list, z));
    }

    public static void e() throws Throwable {
        String strA = a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(strA)) {
            x9s.o("dump tcp for uid = " + Process.myUid());
            x9s.o(strA);
        }
        String strA2 = a("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(strA2)) {
            return;
        }
        x9s.o("dump tcp6 for uid = " + Process.myUid());
        x9s.o(strA2);
    }

    public static boolean f(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            x9s.o("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(rjs.d(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            x9s.o("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            x9s.D("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }
}
