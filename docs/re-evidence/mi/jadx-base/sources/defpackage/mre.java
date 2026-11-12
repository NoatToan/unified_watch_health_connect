package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class mre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Double> f27128a = new HashMap();

    public double a(Map<String, Double> map) {
        double dDoubleValue = 0.0d;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            dDoubleValue += (this.f27128a.containsKey(entry.getKey()) ? this.f27128a.get(entry.getKey()).doubleValue() : 0.0d) * entry.getValue().doubleValue();
        }
        return 1.0d / (Math.exp(-dDoubleValue) + 1.0d);
    }

    public void b(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return;
            }
            String strTrim = line.trim();
            if (!strTrim.isEmpty()) {
                String[] strArrSplit = strTrim.split(" ");
                String str = strArrSplit[0];
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException("model file line format error: " + strTrim);
                }
                try {
                    this.f27128a.put(str, Double.valueOf(Double.parseDouble(strArrSplit[1])));
                } catch (NumberFormatException unused) {
                    throw new NumberFormatException("model file line format error: " + strTrim);
                }
            }
        }
    }
}
