package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.media3.extractor.AacUtil;
import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;
import com.ultrasoniclibrary.ultrasoundcore.functions.ProductID;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes46.dex */
public class ytk {
    private static volatile ytk s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53859a = "ultrasound" + File.separator + "leftOriginalSignal_1418_pianoBox.txt";
    private static final String m = "ultrasound" + File.separator + "leftOriSigReal_1418_pianoBox.txt";
    private static final String f = "ultrasound" + File.separator + "leftOriSigImag_1418_pianoBox.txt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53861c = "ultrasound" + File.separator + "leftOriginalSignal_1620_piano.txt";
    private static final String l = "ultrasound" + File.separator + "leftOriSigReal_1620_piano.txt";
    private static final String j = "ultrasound" + File.separator + "leftOriSigImag_1620_piano.txt";
    private static final String e = "ultrasound" + File.separator + "leftOriginalSignal_1822_piano.txt";
    private static final String n = "ultrasound" + File.separator + "leftOriSigReal_1822_piano.txt";
    private static final String g = "ultrasound" + File.separator + "leftOriSigImag_1822_piano.txt";
    private static final String d = "ultrasound" + File.separator + "leftOriginalSignal_1418_Tag.txt";
    private static final String o = "ultrasound" + File.separator + "leftOriSigReal_1418_Tag.txt";
    private static final String h = "ultrasound" + File.separator + "leftOriSigImag_1418_Tag.txt";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53860b = "ultrasound" + File.separator + "leftOriginalSignal_611_Tag.txt";
    private static final String k = "ultrasound" + File.separator + "leftOriSigReal_611_Tag.txt";
    private static final String i = "ultrasound" + File.separator + "leftOriSigImag_611_Tag.txt";

    public static ytk d() {
        if (s == null) {
            synchronized (ytk.class) {
                if (s == null) {
                    s = new ytk();
                }
            }
        }
        return s;
    }

    public ysx c(String str, int i2, int i3) {
        boolean z = i3 == 14000;
        if (str.equals(ProductID.HWTAG.getProductID())) {
            if (i2 != 1) {
                return new ysx(2400, 680, 48, 800, 200);
            }
            if (z) {
                return new ysx(2480, 680, 48, 800, 200);
            }
            return new ysx(2400, 680, 48, 800, 200);
        }
        if (str.equals(ProductID.PIANO.getProductID()) || str.equals(ProductID.DOVE.getProductID()) || str.equals(ProductID.PIANOP.getProductID()) || str.equals(ProductID.HARPER.getProductID())) {
            return new ysx(2400, 380, 48, 800, 200);
        }
        return null;
    }

    public FreqParam c(String str, int i2) {
        FreqParam freqParam = new FreqParam();
        boolean z = i2 == 14000;
        if (str.equals(ProductID.HWTAG.getProductID())) {
            if (z) {
                return new FreqParam(14000, 4, 50, 1000, 550, 30, 0);
            }
            return new FreqParam(6000, 5, 50, 1000, 550, 30, 0);
        }
        if (str.equals(ProductID.DOVE.getProductID())) {
            return new FreqParam(14000, 4, 50, 1000, 250, 50, 0);
        }
        if (str.equals(ProductID.HARPER.getProductID())) {
            return new FreqParam(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 4, 50, 1000, 250, 50, 0);
        }
        return (str.equals(ProductID.PIANO.getProductID()) || str.equals(ProductID.PIANOP.getProductID())) ? new FreqParam(18000, 4, 50, 1000, 250, 50, 0) : freqParam;
    }

    public double[] a(Context context, int i2, String str, int i3) {
        return b(context, i2, str, 0, i3);
    }

    public double[] c(Context context, int i2, String str, int i3) {
        return b(context, i2, str, 1, i3);
    }

    public double[] d(Context context, int i2, String str, int i3) {
        return b(context, i2, str, 2, i3);
    }

    public double[] b(Context context, int i2, String str, int i3, int i4) {
        String str2;
        boolean z = i4 == 14000;
        String str3 = null;
        if (str.equals(ProductID.HWTAG.getProductID())) {
            if (i2 == 1) {
                if (i3 == 0) {
                    str2 = z ? d : f53860b;
                } else if (i3 == 1) {
                    str2 = z ? o : k;
                } else if (i3 == 2) {
                    str2 = z ? h : i;
                } else {
                    ytq.c("ProductParam", "can't find signal file");
                }
                str3 = str2;
            } else if (i3 == 0) {
                str3 = z ? f53859a : f53860b;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 1) {
                str3 = z ? m : k;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 2) {
                str3 = z ? f : i;
                Log.i("ProductParam", "audio path: " + str3);
            } else {
                ytq.c("ProductParam", "can't find signal file");
            }
            return d(e(context, str3));
        }
        if (str.equals(ProductID.DOVE.getProductID())) {
            if (i3 == 0) {
                str3 = f53859a;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 1) {
                str3 = m;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 2) {
                str3 = f;
                Log.i("ProductParam", "audio path: " + str3);
            } else {
                ytq.c("ProductParam", "can't find signal file");
            }
            return d(e(context, str3));
        }
        if (str.equals(ProductID.HARPER.getProductID())) {
            if (i3 == 0) {
                str3 = f53861c;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 1) {
                str3 = l;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 2) {
                str3 = j;
                Log.i("ProductParam", "audio path: " + str3);
            } else {
                ytq.c("ProductParam", "can't find signal file");
            }
            return d(e(context, str3));
        }
        if (str.equals(ProductID.PIANO.getProductID()) || str.equals(ProductID.PIANOP.getProductID())) {
            if (i3 == 0) {
                str3 = e;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 1) {
                str3 = n;
                Log.i("ProductParam", "audio path: " + str3);
            } else if (i3 == 2) {
                str3 = g;
                Log.i("ProductParam", "audio path: " + str3);
            } else {
                ytq.c("ProductParam", "can't find signal file");
            }
            return d(e(context, str3));
        }
        double[] dArr = new double[0];
        ytq.c("ProductParam", "Get oriSig failed");
        return dArr;
    }

    public static ArrayList<Double> e(Context context, String str) {
        ArrayList<Double> arrayList = new ArrayList<>();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(str), StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        arrayList.add(Double.valueOf(Double.parseDouble(line.split(",")[0])));
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | NumberFormatException e2) {
            ytq.c("ProductParam", "read source audio txt failed, error message: " + e2.getMessage());
            return arrayList;
        }
    }

    public static double[] d(ArrayList<Double> arrayList) {
        double[] dArr = new double[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            dArr[i2] = arrayList.get(i2).doubleValue();
        }
        return dArr;
    }
}
