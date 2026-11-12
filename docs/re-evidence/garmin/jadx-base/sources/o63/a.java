package o63;

import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo63/a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129815a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f129817c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f129816b = new p();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f129818d = new StringBuilder();

    public static /* synthetic */ void m(a aVar, String str, int i14, String str2, int i15) {
        if ((i15 & 2) != 0) {
            i14 = aVar.f129815a;
        }
        if ((i15 & 4) != 0) {
            str2 = "";
        }
        aVar.l(i14, str, str2);
        throw null;
    }

    public final int a(int i14, CharSequence charSequence) {
        int i15 = i14 + 4;
        if (i15 < charSequence.length()) {
            this.f129818d.append((char) (n(i14 + 3, charSequence) + (n(i14, charSequence) << 12) + (n(i14 + 1, charSequence) << 8) + (n(i14 + 2, charSequence) << 4)));
            return i15;
        }
        this.f129815a = i14;
        if (i15 < charSequence.length()) {
            return a(this.f129815a, charSequence);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public abstract boolean b();

    public final void c(int i14, String str) {
        if (getF129846e().length() - i14 < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            if (str.charAt(i15) != (getF129846e().charAt(i14 + i15) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
                throw null;
            }
        }
        this.f129815a = str.length() + i14;
    }

    public abstract String d();

    public abstract byte e();

    public final byte f(byte b14) {
        byte bE = e();
        if (bE == b14) {
            return bE;
        }
        String strB0 = ge1.b.b0(b14);
        int i14 = this.f129815a;
        int i15 = i14 - 1;
        m(this, v.e0.g("Expected ", strB0, ", but had '", (i14 == getF129846e().length() || i15 < 0) ? "EOF" : String.valueOf(getF129846e().charAt(i15)), "' instead"), i15, null, 4);
        throw null;
    }

    public abstract void g(char c14);

    public final long h() {
        boolean z14;
        boolean z15;
        double dPow;
        int iS = s(t());
        int i14 = 0;
        if (iS >= getF129846e().length() || iS == -1) {
            m(this, "EOF", 0, null, 6);
            throw null;
        }
        if (getF129846e().charAt(iS) == '\"') {
            iS++;
            if (iS == getF129846e().length()) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            z14 = true;
        } else {
            z14 = false;
        }
        int i15 = iS;
        int i16 = 0;
        boolean z16 = false;
        boolean z17 = false;
        long j8 = 0;
        long j14 = 0;
        while (true) {
            if (i15 == getF129846e().length()) {
                z14 = z14;
                z15 = z16;
                break;
            }
            char cCharAt = getF129846e().charAt(i15);
            if ((cCharAt != 'e' && cCharAt != 'E') || z16) {
                z14 = z14;
                if (cCharAt == '-' && z16) {
                    if (i15 == iS) {
                        m(this, "Unexpected symbol '-' in numeric literal", i14, null, 6);
                        throw null;
                    }
                    i15++;
                    i16 = i14;
                } else if (cCharAt != '+' || !z16) {
                    z15 = z16;
                    if (cCharAt != '-') {
                        if (ge1.b.l(cCharAt) != 0) {
                            break;
                        }
                        i15++;
                        int i17 = cCharAt - '0';
                        if (i17 < 0 || i17 >= 10) {
                            m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i14, null, 6);
                            throw null;
                        }
                        if (z15) {
                            j8 = (j8 * ((long) 10)) + ((long) i17);
                            z16 = z15;
                        } else {
                            j14 = (j14 * ((long) 10)) - ((long) i17);
                            if (j14 > 0) {
                                m(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z14 = z14;
                            z16 = z15;
                            i14 = 0;
                        }
                    } else {
                        if (i15 != iS) {
                            m(this, "Unexpected symbol '-' in numeric literal", i14, null, 6);
                            throw null;
                        }
                        i15++;
                        z14 = z14;
                        z16 = z15;
                        z17 = true;
                    }
                } else {
                    if (i15 == iS) {
                        m(this, "Unexpected symbol '+' in numeric literal", i14, null, 6);
                        throw null;
                    }
                    i15++;
                    z14 = z14;
                    i16 = 1;
                }
            } else {
                if (i15 == iS) {
                    m(this, "Unexpected symbol " + cCharAt + " in numeric literal", i14, null, 6);
                    throw null;
                }
                i15++;
                i16 = 1;
                z16 = true;
            }
        }
        boolean z18 = i15 != iS;
        if (iS == i15 || (z17 && iS == i15 - 1)) {
            m(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z14) {
            if (!z18) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            if (getF129846e().charAt(i15) != '\"') {
                m(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i15++;
        }
        this.f129815a = i15;
        if (z15) {
            double d14 = j14;
            if (i16 == 0) {
                dPow = Math.pow(10.0d, -j8);
            } else {
                if (i16 != 1) {
                    u0.r();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j8);
            }
            double d15 = d14 * dPow;
            if (d15 > 9.223372036854776E18d || d15 < -9.223372036854776E18d) {
                m(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d15) != d15) {
                m(this, "Can't convert " + d15 + " to Long", 0, null, 6);
                throw null;
            }
            j14 = (long) d15;
        }
        if (z17) {
            return j14;
        }
        if (j14 != Long.MIN_VALUE) {
            return -j14;
        }
        m(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String i() {
        String str = this.f129817c;
        if (str == null) {
            return d();
        }
        str.getClass();
        this.f129817c = null;
        return str;
    }

    public final String j() {
        String string;
        String str = this.f129817c;
        if (str != null) {
            str.getClass();
            this.f129817c = null;
            return str;
        }
        int iT = t();
        if (iT >= getF129846e().length() || iT == -1) {
            m(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bL = ge1.b.l(getF129846e().charAt(iT));
        if (bL == 1) {
            return i();
        }
        if (bL != 0) {
            m(this, "Expected beginning of the string, but got " + getF129846e().charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z14 = false;
        while (true) {
            byte bL2 = ge1.b.l(getF129846e().charAt(iT));
            StringBuilder sb3 = this.f129818d;
            if (bL2 != 0) {
                int i14 = this.f129815a;
                if (z14) {
                    sb3.append((CharSequence) getF129846e(), i14, iT);
                    string = sb3.toString();
                    sb3.setLength(0);
                } else {
                    string = getF129846e().subSequence(i14, iT).toString();
                }
                this.f129815a = iT;
                return string;
            }
            iT++;
            if (iT >= getF129846e().length()) {
                sb3.append((CharSequence) getF129846e(), this.f129815a, iT);
                int iS = s(iT);
                if (iS == -1) {
                    this.f129815a = iT;
                    sb3.append((CharSequence) getF129846e(), 0, 0);
                    String string2 = sb3.toString();
                    sb3.setLength(0);
                    return string2;
                }
                iT = iS;
                z14 = true;
            }
        }
    }

    public final String k() {
        String strJ = j();
        if (!p005kotlin.jvm.internal.s.g(strJ, BuildConfig.TRAVIS) || getF129846e().charAt(this.f129815a - 1) == '\"') {
            return strJ;
        }
        m(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void l(int i14, String str, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbI = sn.a.i(str, " at path: ");
        sbI.append(this.f129816b.a());
        sbI.append(strConcat);
        throw gg.b.h(getF129846e(), i14, sbI.toString());
    }

    public final int n(int i14, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i14);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public abstract String getF129846e();

    public abstract String p(String str, boolean z14);

    public byte q() {
        String strO = getF129846e();
        int i14 = this.f129815a;
        while (true) {
            int iS = s(i14);
            if (iS == -1) {
                this.f129815a = iS;
                return (byte) 10;
            }
            char cCharAt = strO.charAt(iS);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f129815a = iS;
                return ge1.b.l(cCharAt);
            }
            i14 = iS + 1;
        }
    }

    public final String r(boolean z14) {
        String strI;
        byte bQ = q();
        if (z14) {
            if (bQ != 1 && bQ != 0) {
                return null;
            }
            strI = j();
        } else {
            if (bQ != 1) {
                return null;
            }
            strI = i();
        }
        this.f129817c = strI;
        return strI;
    }

    public abstract int s(int i14);

    public abstract int t();

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JsonReader(source='");
        sb3.append((Object) getF129846e());
        sb3.append("', currentPosition=");
        return ds.e0.j(sb3, this.f129815a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final boolean u() {
        int iT = t();
        String strO = getF129846e();
        if (iT >= strO.length() || iT == -1 || strO.charAt(iT) != ',') {
            return false;
        }
        this.f129815a++;
        return true;
    }

    public final boolean v(boolean z14) {
        int iS = s(t());
        int length = getF129846e().length() - iS;
        if (length >= 4 && iS != -1) {
            for (int i14 = 0; i14 < 4; i14++) {
                if (BuildConfig.TRAVIS.charAt(i14) == getF129846e().charAt(iS + i14)) {
                }
            }
            if (length <= 4 || ge1.b.l(getF129846e().charAt(iS + 4)) != 0) {
                if (z14) {
                    this.f129815a = iS + 4;
                }
                return true;
            }
        }
        return false;
    }

    public final void w(char c14) {
        int i14 = this.f129815a;
        if (i14 > 0 && c14 == '\"') {
            try {
                this.f129815a = i14 - 1;
                String strJ = j();
                this.f129815a = i14;
                if (p005kotlin.jvm.internal.s.g(strJ, BuildConfig.TRAVIS)) {
                    l(this.f129815a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th3) {
                this.f129815a = i14;
                throw th3;
            }
        }
        String strB0 = ge1.b.b0(ge1.b.l(c14));
        int i15 = this.f129815a;
        int i16 = i15 - 1;
        String str = ((d0) this).f129846e;
        m(this, v.e0.g("Expected ", strB0, ", but had '", (i15 == str.length() || i16 < 0) ? "EOF" : String.valueOf(str.charAt(i16)), "' instead"), i16, null, 4);
        throw null;
    }
}
