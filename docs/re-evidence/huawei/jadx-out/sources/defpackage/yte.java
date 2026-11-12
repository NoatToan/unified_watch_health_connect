package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class yte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map<Integer, Double> f53844c;
    private double d;
    private String e;

    public yte(String str, String str2, String str3, double d) {
        this.f53843b = str;
        this.f53842a = str2;
        this.e = str3;
        this.d = d;
    }

    public String a() {
        return this.f53842a;
    }

    private void c() {
        if (this.f53844c != null) {
            return;
        }
        this.f53844c = new HashMap();
        if (!this.e.contains(":")) {
            Log.i("UltrasoundTDCSV", "CSV file is old version: " + this.e);
            for (int i = 2; i < 13; i++) {
                this.f53844c.put(Integer.valueOf(i), Double.valueOf(Double.parseDouble(this.e)));
            }
            return;
        }
        for (String str : this.e.split(";")) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length >= 2) {
                this.f53844c.put(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Double.valueOf(Double.parseDouble(strArrSplit[1])));
            }
        }
    }

    public Map<Integer, Double> e() {
        c();
        return this.f53844c;
    }

    public double d() {
        return this.d;
    }
}
