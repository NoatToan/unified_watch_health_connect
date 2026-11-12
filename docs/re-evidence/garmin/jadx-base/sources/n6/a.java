package n6;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import i3.e5;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f123792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f123793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f123794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f123795f;

    public a(a aVar) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123794e = null;
        this.f123790a = aVar.f123790a;
        this.f123791b = aVar.f123791b;
        this.f123792c = aVar.f123792c;
        this.f123793d = aVar.f123793d;
        this.f123794e = aVar.f123794e;
        this.f123795f = aVar.f123795f;
    }

    public static String a(int i14) {
        String str = "00000000" + Integer.toHexString(i14);
        return "#".concat(str.substring(str.length() - 8));
    }

    public final void b(Object obj) {
        switch (this.f123791b) {
            case 900:
            case 906:
                this.f123792c = ((Integer) obj).intValue();
                break;
            case 901:
                this.f123793d = ((Float) obj).floatValue();
                break;
            case 902:
                this.f123792c = ((Integer) obj).intValue();
                break;
            case 903:
                this.f123794e = (String) obj;
                break;
            case 904:
                this.f123795f = ((Boolean) obj).booleanValue();
                break;
            case 905:
                this.f123793d = ((Float) obj).floatValue();
                break;
        }
    }

    public final String toString() {
        String strM = a0.m(new StringBuilder(), this.f123790a, CoreConstants.COLON_CHAR);
        switch (this.f123791b) {
            case 900:
                StringBuilder sbK = e5.k(strM);
                sbK.append(this.f123792c);
                return sbK.toString();
            case 901:
                StringBuilder sbK2 = e5.k(strM);
                sbK2.append(this.f123793d);
                return sbK2.toString();
            case 902:
                return strM.concat(a(this.f123792c));
            case 903:
                StringBuilder sbK3 = e5.k(strM);
                sbK3.append(this.f123794e);
                return sbK3.toString();
            case 904:
                StringBuilder sbK4 = e5.k(strM);
                sbK4.append(Boolean.valueOf(this.f123795f));
                return sbK4.toString();
            case 905:
                StringBuilder sbK5 = e5.k(strM);
                sbK5.append(this.f123793d);
                return sbK5.toString();
            default:
                return strM.concat("????");
        }
    }

    public a(String str, int i14, String str2) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123790a = str;
        this.f123791b = i14;
        this.f123794e = str2;
    }

    public a(String str, int i14, int i15) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123794e = null;
        this.f123790a = str;
        this.f123791b = i14;
        if (i14 == 901) {
            this.f123793d = i15;
        } else {
            this.f123792c = i15;
        }
    }

    public a(String str, int i14, float f14) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123794e = null;
        this.f123790a = str;
        this.f123791b = i14;
        this.f123793d = f14;
    }

    public a(String str, int i14, boolean z14) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123794e = null;
        this.f123790a = str;
        this.f123791b = i14;
        this.f123795f = z14;
    }

    public a(String str, int i14) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123794e = null;
        this.f123790a = str;
        this.f123791b = i14;
    }

    public a(String str, int i14, Object obj) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123794e = null;
        this.f123790a = str;
        this.f123791b = i14;
        b(obj);
    }

    public a(a aVar, Object obj) {
        this.f123792c = Integer.MIN_VALUE;
        this.f123793d = Float.NaN;
        this.f123794e = null;
        this.f123790a = aVar.f123790a;
        this.f123791b = aVar.f123791b;
        b(obj);
    }
}
