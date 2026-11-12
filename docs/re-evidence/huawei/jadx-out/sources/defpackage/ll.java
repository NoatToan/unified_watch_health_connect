package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40402c;
    public String d;
    public String e;
    public String f;
    public String i;

    public String toString() {
        StringBuilder sb;
        String strSubstring;
        StringBuilder sb2;
        String strSubstring2;
        StringBuilder sb3;
        String strSubstring3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.e);
        stringBuffer.append("," + this.d);
        stringBuffer.append("," + this.f40402c);
        stringBuffer.append("," + this.f40400a);
        if (kj.c(this.f40401b) || this.f40401b.length() < 20) {
            sb = new StringBuilder(",");
            strSubstring = this.f40401b;
        } else {
            sb = new StringBuilder(",");
            strSubstring = this.f40401b.substring(0, 20);
        }
        sb.append(strSubstring);
        stringBuffer.append(sb.toString());
        if (kj.c(this.i) || this.i.length() < 20) {
            sb2 = new StringBuilder(",");
            strSubstring2 = this.i;
        } else {
            sb2 = new StringBuilder(",");
            strSubstring2 = this.i.substring(0, 20);
        }
        sb2.append(strSubstring2);
        stringBuffer.append(sb2.toString());
        if (kj.c(this.f) || this.f.length() < 20) {
            sb3 = new StringBuilder(",");
            strSubstring3 = this.f;
        } else {
            sb3 = new StringBuilder(",");
            strSubstring3 = this.f.substring(0, 20);
        }
        sb3.append(strSubstring3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }

    public ll(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.e = str;
        this.d = str2;
        this.f40402c = str3;
        this.f40400a = str4;
        this.f40401b = str5;
        this.i = str6;
        this.f = str7;
    }
}
