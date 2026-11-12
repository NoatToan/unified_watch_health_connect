package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.system.BuildEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes46.dex */
public class ysz {
    private static volatile ysz i;
    private String k;
    private String l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53827c = Build.MANUFACTURER;
    private static final String d = Build.MODEL;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53826b = Build.PRODUCT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53825a = Build.DISPLAY;
    private static final String j = Build.VERSION.INCREMENTAL;
    private static final String e = "ultrasound" + File.separator + "ultrasound-CoreConfig.csv";
    private static final String h = "ultrasound" + File.separator + "ultrasound-TDConfig.csv";
    private static final String f = "ultrasound" + File.separator + "ultrasound-PCConfig.csv";
    private static final String g = "ultrasound" + File.separator + "ultrasound-NCConfig.csv";

    public static ysz d() {
        if (i == null) {
            synchronized (ysz.class) {
                if (i == null) {
                    i = new ysz();
                }
            }
        }
        return i;
    }

    private ysz() {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ytc f53829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53831c;
        boolean d;
        int e;

        public d(boolean z, int i, int i2, ytc ytcVar) {
            this.d = z;
            this.f53830b = i;
            this.e = i2;
            this.f53829a = ytcVar;
        }

        public boolean e() {
            return this.d;
        }

        public void d(boolean z) {
            this.d = z;
        }

        public int b() {
            return this.f53830b;
        }

        public void e(int i) {
            this.f53830b = i;
        }

        public int d() {
            return this.e;
        }

        public void b(int i) {
            this.e = i;
        }

        public int a() {
            return this.f53831c;
        }

        public void a(int i) {
            this.f53831c = i;
        }

        public ytc c() {
            return this.f53829a;
        }

        public void c(ytc ytcVar) {
            this.f53829a = ytcVar;
        }

        public String toString() {
            return "isContain:" + this.d + "\nosIDp = " + this.f53830b + "\nosIDn = " + this.e;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        yte f53828a;
        boolean d;

        public c(boolean z, yte yteVar) {
            this.d = z;
            this.f53828a = yteVar;
        }

        public boolean b() {
            return this.d;
        }

        public void c(boolean z) {
            this.d = z;
        }

        public yte d() {
            return this.f53828a;
        }

        public void c(yte yteVar) {
            this.f53828a = yteVar;
        }
    }

    public d d(Context context) {
        d dVar = new d(false, 0, 0, null);
        String str = f53826b;
        if (str == null) {
            ytq.c("UltrasoundCSVHandler", "current phone model is null.");
            return dVar;
        }
        if (context == null) {
            ytq.c("UltrasoundCSVHandler", "context is null.");
            return dVar;
        }
        Locale locale = new Locale("en", "US");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(e), StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    bufferedReader.readLine();
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        ytq.c("UltrasoundCSVHandler", "unable to get version info of this preset file.");
                    } else {
                        String[] strArrSplit = line.split(",");
                        if (strArrSplit.length != 2) {
                            ytq.c("UltrasoundCSVHandler", "info of version line is incorrect.");
                        } else {
                            String str2 = strArrSplit[1];
                            String line2 = bufferedReader.readLine();
                            new ArrayMap();
                            StringBuilder sb = new StringBuilder();
                            String str3 = f53827c;
                            sb.append(str3);
                            String str4 = d;
                            sb.append(str4);
                            String string = sb.toString();
                            String str5 = str3 + str;
                            ytq.b("UltrasoundCSVHandler", "currentModel: " + str4);
                            ytq.b("UltrasoundCSVHandler", "currentProduct: " + str);
                            while (line2 != null) {
                                String[] strArrSplit2 = line2.split(",");
                                if (strArrSplit2.length != 20) {
                                    line2 = bufferedReader.readLine();
                                } else {
                                    String str6 = strArrSplit2[0] + strArrSplit2[1];
                                    boolean zEquals = string.toUpperCase(locale).equals(str6.toUpperCase(locale));
                                    boolean zEquals2 = str5.toUpperCase(locale).equals(str6.toUpperCase(locale));
                                    if (!zEquals && !zEquals2) {
                                        line2 = bufferedReader.readLine();
                                    }
                                    this.k = zEquals ? d : f53826b;
                                    ytq.b("UltrasoundCSVHandler", "find OEM and Model in CoreCSV file with current phone Model.");
                                    dVar.d(true);
                                    dVar.e(Integer.parseInt(strArrSplit2[17]));
                                    dVar.b(Integer.parseInt(strArrSplit2[18]));
                                    dVar.a(Integer.parseInt(strArrSplit2[19]));
                                    break;
                                }
                            }
                            bufferedReader.close();
                            inputStreamReader.close();
                            return dVar;
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return dVar;
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
            ytq.c("UltrasoundCSVHandler", "checkCSVContainResult error occurs, error message: " + e2.getMessage());
            return dVar;
        }
    }

    public d a(Context context, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3 = 0;
        d dVar = new d(false, 0, 0, null);
        if (f53826b == null) {
            ytq.c("UltrasoundCSVHandler", "current phone model is null.");
            return dVar;
        }
        if (context == null) {
            ytq.c("UltrasoundCSVHandler", "context is null.");
            return dVar;
        }
        new Locale("en", "US");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(e), StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    bufferedReader.readLine();
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        ytq.c("UltrasoundCSVHandler", "unable to get version info of this preset file.");
                    } else {
                        String[] strArrSplit = line.split(",");
                        if (strArrSplit.length != 2) {
                            ytq.c("UltrasoundCSVHandler", "info of version line is incorrect.");
                        } else {
                            String str6 = strArrSplit[1];
                            String line2 = bufferedReader.readLine();
                            ArrayMap arrayMap = new ArrayMap();
                            String str7 = "";
                            while (true) {
                                if (line2 == null) {
                                    str = "0";
                                    str2 = "false";
                                    str3 = "";
                                    str4 = str7;
                                    str5 = str3;
                                    break;
                                }
                                String[] strArrSplit2 = line2.split(",");
                                if (strArrSplit2.length != 20) {
                                    line2 = bufferedReader.readLine();
                                } else {
                                    String str8 = strArrSplit2[3];
                                    if (this.k.equals(strArrSplit2[1]) && i2 == Integer.parseInt(str8)) {
                                        ArrayList arrayList = new ArrayList();
                                        String str9 = strArrSplit2[0];
                                        String str10 = strArrSplit2[1];
                                        String str11 = strArrSplit2[2];
                                        str = strArrSplit2[4];
                                        for (int i4 = 4; i3 < i4; i4 = 4) {
                                            ytf ytfVar = new ytf();
                                            int i5 = i3 * 3;
                                            ytfVar.b(strArrSplit2[i5 + 5]);
                                            ytfVar.e(strArrSplit2[i5 + 6]);
                                            ytfVar.d(strArrSplit2[i5 + 7]);
                                            arrayList.add(i3, ytfVar);
                                            i3++;
                                        }
                                        arrayMap.put(Integer.valueOf(Integer.parseInt(strArrSplit2[3])), arrayList);
                                        ytq.b("UltrasoundCSVHandler", "get target ultrasound property in CoreCSV file with current phone model. currentPhone is " + this.k + "coordinates size is:" + arrayList.size());
                                        dVar.d(true);
                                        dVar.e(Integer.parseInt(strArrSplit2[17]));
                                        dVar.b(Integer.parseInt(strArrSplit2[18]));
                                        dVar.a(Integer.parseInt(strArrSplit2[19]));
                                        str2 = str11;
                                        str4 = str8;
                                        str3 = str10;
                                        str5 = str9;
                                        break;
                                    }
                                    line2 = bufferedReader.readLine();
                                    str7 = str8;
                                }
                            }
                            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str3) && !arrayMap.isEmpty()) {
                                dVar.c(new ytc(str6, str5, str3, str2, str4, str, -1, -1, arrayMap));
                            }
                            bufferedReader.close();
                            inputStreamReader.close();
                            return dVar;
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return dVar;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | NumberFormatException e2) {
            ytq.c("UltrasoundCSVHandler", "getCoreCSVData error occurs, error message: " + e2.getMessage());
            return dVar;
        }
    }

    public c b(Context context, String str, int i2) {
        c cVar = new c(false, null);
        Locale locale = new Locale("en", "US");
        ytq.b("UltrasoundCSVHandler", "Current Phone is: " + f53826b);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(h), StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    bufferedReader.readLine();
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        ytq.c("UltrasoundCSVHandler", "unable to get version info of this ultrasound-TDConfig file.");
                    } else if (line.split(",").length != 2) {
                        ytq.c("UltrasoundCSVHandler", "TDConfig file info of version line is incorrect.");
                    } else {
                        String line2 = bufferedReader.readLine();
                        String str2 = str + Constants.LINK + i2;
                        while (line2 != null) {
                            String[] strArrSplit = line2.split(",");
                            if (strArrSplit.length != 4) {
                                line2 = bufferedReader.readLine();
                            } else {
                                String str3 = strArrSplit[0];
                                String str4 = strArrSplit[1];
                                if (this.k.toUpperCase(locale).equals(str3.toUpperCase(locale)) && str2.equals(str4)) {
                                    yte yteVar = new yte(str3, str4, strArrSplit[2], Double.parseDouble(strArrSplit[3]));
                                    cVar.c(true);
                                    cVar.c(yteVar);
                                    ytq.b("UltrasoundCSVHandler", "find target device property in TD-CSV file with current phone model.");
                                    break;
                                }
                                line2 = bufferedReader.readLine();
                            }
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                        return cVar;
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return cVar;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | NumberFormatException e2) {
            ytq.c("UltrasoundCSVHandler", "checkIsDevicesMatch error occurs, error message: " + e2.getMessage());
            return cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    public boolean b(Context context, int i2) {
        boolean z;
        String strSubstring;
        String str;
        boolean zC = false;
        if (i2 == -1) {
            ytq.c("UltrasoundCSVHandler", "mOSIDp is default value -1.");
            return false;
        }
        boolean zC2 = c(this.k);
        String str2 = f53825a;
        if (zC2) {
            str2 = BuildEx.DISPLAY;
            z = false;
        } else {
            z = true;
        }
        ytq.b("UltrasoundCSVHandler", "CURRENT_PHONE_PRODUCT_AND_VERSION: " + str2);
        ytq.b("UltrasoundCSVHandler", "CURRENT_PHONE_VERSION: " + j);
        StringBuilder sb = new StringBuilder();
        String str3 = f53826b;
        sb.append(str3);
        sb.append(" ");
        String strReplace = str2.replace(sb.toString(), "");
        ytq.b("UltrasoundCSVHandler", "checkOSpVer current PRODUCT: " + str3);
        int iIndexOf = strReplace.indexOf(com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY);
        if (iIndexOf == -1) {
            ytq.c("UltrasoundCSVHandler", "subStringIndex = -1");
            return false;
        }
        String strSubstring2 = strReplace.substring(0, iIndexOf);
        StringBuilder sb2 = new StringBuilder();
        String str4 = d;
        sb2.append(str4);
        sb2.append(" ");
        String strReplace2 = str2.replace(sb2.toString(), "");
        ytq.b("UltrasoundCSVHandler", "checkOSpVer current MODEL: " + str4);
        int iIndexOf2 = strReplace2.indexOf(com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY);
        if (iIndexOf2 == -1) {
            ytq.c("UltrasoundCSVHandler", "subStringIndex = -1");
            return false;
        }
        String strSubstring3 = strReplace2.substring(0, iIndexOf2);
        if (z) {
            int i3 = 0;
            while (true) {
                str = j;
                if (i3 >= str.length()) {
                    i3 = 0;
                    break;
                }
                if (str.charAt(i3) > '9') {
                    break;
                }
                i3++;
            }
            if (i3 < 2) {
                ytq.c("UltrasoundCSVHandler", "subStringIndex invalid ! ");
                return false;
            }
            strSubstring = str.substring(2, i3);
        } else {
            strSubstring = "000.000.000.000";
        }
        ytq.b("UltrasoundCSVHandler", "checkOSpVer current OS version1: " + strSubstring2);
        ytq.b("UltrasoundCSVHandler", "checkOSpVer current OS version2: " + strSubstring3);
        ytq.b("UltrasoundCSVHandler", "checkOSpVer current OS version3: " + strSubstring);
        if (strSubstring2.length() == strSubstring3.length() && strSubstring3.length() == strSubstring.length()) {
            this.l = strSubstring;
        } else {
            if (strSubstring2.length() > strSubstring3.length()) {
                if (strSubstring3.length() > strSubstring.length()) {
                    strSubstring2 = strSubstring;
                } else {
                    strSubstring2 = strSubstring3;
                }
            } else if (strSubstring2.length() > strSubstring.length()) {
                strSubstring2 = strSubstring;
            }
            this.l = strSubstring2;
        }
        ytq.b("UltrasoundCSVHandler", "checkOSpVer current OS version: " + this.l);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(f), StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    bufferedReader.readLine();
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        ytq.c("UltrasoundCSVHandler", "unable to get version info of this ultrasound-PCConfig file.");
                    } else if (line.split(",").length != 2) {
                        ytq.c("UltrasoundCSVHandler", "PCConfig file of version line is incorrect.");
                    } else {
                        String line2 = bufferedReader.readLine();
                        while (line2 != null) {
                            String[] strArrSplit = line2.split(",");
                            if (strArrSplit.length != 2) {
                                line2 = bufferedReader.readLine();
                            } else {
                                String str5 = strArrSplit[0];
                                String str6 = strArrSplit[1];
                                if (i2 == Integer.parseInt(str5)) {
                                    zC = c(this.l, str6);
                                    ytq.b("UltrasoundCSVHandler", "find and check target device OS Ver in PC-CSV file with current phone model and check result:" + zC);
                                    break;
                                }
                                line2 = bufferedReader.readLine();
                            }
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return zC;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | NumberFormatException e2) {
            ytq.c("UltrasoundCSVHandler", "checkOSpVer error occurs, error message: " + e2.getMessage());
            return false;
        }
    }

    public boolean c(Context context, int i2) {
        if (i2 == 0) {
            return true;
        }
        boolean zE = false;
        if (i2 == -1) {
            ytq.c("UltrasoundCSVHandler", "mOSIDn is default value -1.");
            return false;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(g), StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    bufferedReader.readLine();
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        ytq.c("UltrasoundCSVHandler", "unable to get version info of this ultrasound-NCConfig file.");
                    } else if (line.split(",").length != 2) {
                        ytq.c("UltrasoundCSVHandler", "NCConfig file info of version line is incorrect.");
                    } else {
                        String line2 = bufferedReader.readLine();
                        while (line2 != null) {
                            String[] strArrSplit = line2.split(",");
                            if (strArrSplit.length != 3) {
                                line2 = bufferedReader.readLine();
                            } else {
                                String str = strArrSplit[0];
                                String str2 = strArrSplit[1];
                                String str3 = strArrSplit[2];
                                if (i2 == Integer.parseInt(str)) {
                                    zE = e(this.l, str2, str3);
                                    ytq.b("UltrasoundCSVHandler", "find and check target device OS Ver in NC-CSV file with current phone model and check result:" + zE);
                                    break;
                                }
                                line2 = bufferedReader.readLine();
                            }
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return zE;
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
            ytq.c("UltrasoundCSVHandler", "checkOSnVer error occurs, error message: " + e2.getMessage());
            return false;
        }
    }

    boolean c(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = Integer.parseInt(strArrSplit[i2]);
            int i4 = Integer.parseInt(strArrSplit2[i2]);
            if (i3 > i4) {
                return true;
            }
            if (i3 < i4) {
                return false;
            }
        }
        return true;
    }

    boolean e(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        String[] strArrSplit3 = str3.split("\\.");
        if (str.equals(str2) || str.equals(str3)) {
            return false;
        }
        if (str2.equals("XXX") && str3.equals("XXX")) {
            return true;
        }
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int i2 = 0;
        while (true) {
            if (i2 < iMin) {
                int i3 = Integer.parseInt(strArrSplit[i2]);
                int i4 = Integer.parseInt(strArrSplit2[i2]);
                if (i3 < i4) {
                    z = false;
                    break;
                }
                if (i3 <= i4) {
                    i2++;
                }
            }
            z = true;
            break;
        }
        int iMin2 = Math.min(strArrSplit.length, strArrSplit3.length);
        int i5 = 0;
        while (true) {
            if (i5 < iMin2) {
                int i6 = Integer.parseInt(strArrSplit[i5]);
                int i7 = Integer.parseInt(strArrSplit3[i5]);
                if (i6 >= i7) {
                    if (i6 > i7) {
                        z2 = false;
                        break;
                    }
                    i5++;
                }
            }
            z2 = true;
            break;
        }
        return (z && z2) ? false : true;
    }

    boolean c(String str) {
        return str.equals("ELE-AL00") || str.equals("ELE-TL00") || str.equals("VOG-AL00") || str.equals("VOG-AL10") || str.equals("VOG-TL00");
    }
}
