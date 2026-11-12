package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes43.dex */
public class qij {
    private String d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46269a = "";
    private ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    public void a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                String[] strArrSplit = line.split("[ ]+");
                String strTrim = strArrSplit[0].trim();
                if (strTrim.equals("vertex_source_file")) {
                    this.d = strArrSplit[1];
                } else if (strTrim.equals("fragment_source_file")) {
                    this.f46269a = strArrSplit[1];
                } else if (strTrim.equals("attribute") || strTrim.equals("uniform")) {
                    this.e.put(strArrSplit[2], strTrim);
                }
            }
        } catch (Exception e) {
            qid.e("MaterialParser", qid.a() + " load error e=" + e.getMessage());
            e.printStackTrace();
        }
    }

    public ConcurrentHashMap<String, String> b() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public String c() {
        return this.f46269a;
    }

    public void e() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.e = null;
        }
    }
}
