package lg;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f112146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f112147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f112148g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f112142a = str;
        this.f112143b = str2;
        this.f112144c = str3;
        this.f112145d = str4;
        this.f112146e = str5;
        this.f112147f = str6;
        this.f112148g = str7;
    }

    public final String toString() {
        String strConcat;
        String strConcat2;
        String strConcat3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f112142a);
        stringBuffer.append("," + this.f112143b);
        stringBuffer.append("," + this.f112144c);
        stringBuffer.append("," + this.f112145d);
        String str = this.f112146e;
        if (oi0.c.g(str) || str.length() < 20) {
            strConcat = "," + str;
        } else {
            strConcat = ",".concat(str.substring(0, 20));
        }
        stringBuffer.append(strConcat);
        String str2 = this.f112147f;
        if (oi0.c.g(str2) || str2.length() < 20) {
            strConcat2 = "," + str2;
        } else {
            strConcat2 = ",".concat(str2.substring(0, 20));
        }
        stringBuffer.append(strConcat2);
        String str3 = this.f112148g;
        if (oi0.c.g(str3) || str3.length() < 20) {
            strConcat3 = "," + str3;
        } else {
            strConcat3 = ",".concat(str3.substring(0, 20));
        }
        stringBuffer.append(strConcat3);
        return stringBuffer.toString();
    }
}
