package gh2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f77453b = m.a("RemoteConfigCache");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f77454c = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f77455a;

    private g() {
    }

    public static String c(String str) {
        try {
            return new String(Hex.encodeHex(MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(str.getBytes(StandardCharsets.UTF_8))));
        } catch (Exception e4) {
            l2.p(e4);
            return null;
        }
    }

    public final void a() {
        if (this.f77455a.exists() || this.f77455a.mkdirs()) {
            return;
        }
        f77453b.error("Failed to create cache directory: " + this.f77455a.getAbsolutePath());
    }

    public final synchronized l b(String str) {
        if (this.f77455a == null) {
            throw new IllegalStateException("Cache directory is null. Call install() to initialize the cache.");
        }
        File file = new File(this.f77455a, c(str));
        if (!file.exists()) {
            f77453b.debug("Cache not exist for url ".concat(str));
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                l lVar = new l();
                lVar.f77470a = bufferedReader.readLine();
                lVar.f77471b = Integer.parseInt(bufferedReader.readLine());
                lVar.f77472c = bufferedReader.readLine();
                int i14 = Integer.parseInt(bufferedReader.readLine());
                lVar.f77473d = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (int i15 = 0; i15 < i14; i15++) {
                    String[] strArrSplit = bufferedReader.readLine().split(": ");
                    if (strArrSplit.length == 2) {
                        lVar.f77473d.put(strArrSplit[0], Arrays.asList(strArrSplit[1].split(", ")));
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        lVar.f77474e = sb3.toString();
                        bufferedReader.close();
                        bufferedReader.close();
                        return lVar;
                    }
                    sb3.append(line);
                }
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e4) {
            Logger logger = f77453b;
            logger.error("reading cache from file, deleting cache file to avoid further exception", (Throwable) e4);
            if (!file.delete()) {
                logger.warn("failed to delete cache file");
            }
            return null;
        }
    }

    public final synchronized void d(l lVar) {
        a();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f77455a, c(lVar.f77470a))));
            try {
                bufferedWriter.write(lVar.f77470a);
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(lVar.f77471b));
                bufferedWriter.newLine();
                bufferedWriter.write(lVar.f77472c);
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(lVar.f77473d.size()));
                bufferedWriter.newLine();
                for (Map.Entry<String, List<String>> entry : lVar.f77473d.entrySet()) {
                    if (entry.getKey() != null) {
                        bufferedWriter.write(entry.getKey() + ": ");
                        Iterator<String> it = entry.getValue().iterator();
                        if (it.hasNext()) {
                            bufferedWriter.write(it.next());
                            while (it.hasNext()) {
                                bufferedWriter.write(", " + it.next());
                            }
                        }
                        bufferedWriter.newLine();
                    }
                }
                bufferedWriter.newLine();
                bufferedWriter.write(lVar.f77474e);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedWriter.close();
            } catch (Throwable th3) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e4) {
            f77453b.error("writing cache to file", (Throwable) e4);
        }
    }
}
