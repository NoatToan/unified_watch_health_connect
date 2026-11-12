package defpackage;

import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class j45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22397a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<l45> f22398b = new ArrayList<>();
    public ArrayList<l45> c = new ArrayList<>();
    public ArrayList<String> d = new ArrayList<>();
    public Map<String, Double> e = new HashMap();

    public double a(k45 k45Var, int i, String str) {
        Iterator<l45> it = this.f22398b.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            String strC = k45Var.c(it.next(), i);
            if (strC != null) {
                String str2 = strC + " " + str;
                if (this.e.containsKey(str2)) {
                    dDoubleValue += this.e.get(str2).doubleValue();
                }
            }
        }
        return dDoubleValue;
    }

    public double b(k45 k45Var, String str, int i, String str2) {
        Iterator<l45> it = this.c.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            String strC = k45Var.c(it.next(), i);
            if (strC != null) {
                String str3 = strC + " " + str + "/" + str2;
                if (this.e.containsKey(str3)) {
                    dDoubleValue += this.e.get(str3).doubleValue();
                }
            }
        }
        return dDoubleValue;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void c(InputStream inputStream) throws IOException {
        byte b2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            new String();
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                if (!line.equals("") && !line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                    if (line.startsWith("[global]:")) {
                        str = "global";
                    } else if (line.startsWith("[y_names]:")) {
                        str = "y_names";
                    } else if (line.startsWith("[template]:")) {
                        str = "template";
                    } else if (line.startsWith("[u_features]:")) {
                        str = "u_features";
                    } else if (line.startsWith("[b_features]:")) {
                        str = "b_features";
                    } else {
                        switch (str.hashCode()) {
                            case -1717385017:
                                if (!str.equals("u_features")) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case -1456849918:
                                if (!str.equals("y_names")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case -1321546630:
                                if (!str.equals("template")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            case -1243020381:
                                if (!str.equals("global")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 2016371578:
                                if (!str.equals("b_features")) {
                                    b2 = -1;
                                } else {
                                    b2 = 4;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            d(line);
                        } else if (b2 == 1) {
                            this.d.add(line);
                        } else if (b2 == 2) {
                            if (line.startsWith("U")) {
                                this.f22398b.add(new l45(line));
                            }
                            if (line.startsWith(c.f13755a)) {
                                this.c.add(new l45(line));
                            }
                        } else if (b2 == 3) {
                            e(line);
                        } else {
                            if (b2 != 4) {
                                throw new IllegalArgumentException("file format error: " + line);
                            }
                            e(line);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    public final void d(String str) {
        if (str.startsWith("xsize:")) {
            try {
                this.f22397a = Integer.parseInt(str.split(":", 2)[1].trim());
            } catch (NumberFormatException unused) {
                throw new NumberFormatException("xsize is not int, error line:" + str);
            }
        }
    }

    public final void e(String str) {
        String[] strArrSplit = str.split("\t");
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("feature's weight cols not equal 2, error line:" + str);
        }
        try {
            this.e.put(strArrSplit[0], Double.valueOf(Double.parseDouble(strArrSplit[1])));
        } catch (NumberFormatException unused) {
            throw new NumberFormatException("feature has invalid weight, error line:" + str);
        }
    }
}
