package org.json.alipay;

import com.google.maps.android.BuildConfig;
import i3.e5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.CharUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Reader f133513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f133514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f133515d;

    public c(Reader reader) {
        this.f133513b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f133515d = false;
        this.f133512a = 0;
    }

    private String a(int i14) throws JSONException {
        if (i14 == 0) {
            return "";
        }
        char[] cArr = new char[i14];
        int i15 = 0;
        if (this.f133515d) {
            this.f133515d = false;
            cArr[0] = this.f133514c;
            i15 = 1;
        }
        while (i15 < i14) {
            try {
                int i16 = this.f133513b.read(cArr, i15, i14 - i15);
                if (i16 == -1) {
                    break;
                }
                i15 += i16;
            } catch (IOException e4) {
                throw new JSONException(e4);
            }
        }
        this.f133512a += i15;
        if (i15 < i14) {
            throw a("Substring bounds error");
        }
        this.f133514c = cArr[i14 - 1];
        return new String(cArr);
    }

    public final char b() throws JSONException {
        if (this.f133515d) {
            this.f133515d = false;
            char c14 = this.f133514c;
            if (c14 != 0) {
                this.f133512a++;
            }
            return c14;
        }
        try {
            int i14 = this.f133513b.read();
            if (i14 <= 0) {
                this.f133514c = (char) 0;
                return (char) 0;
            }
            this.f133512a++;
            char c15 = (char) i14;
            this.f133514c = c15;
            return c15;
        } catch (IOException e4) {
            throw new JSONException(e4);
        }
    }

    public final char c() {
        char cB;
        char cB2;
        while (true) {
            char cB3 = b();
            if (cB3 == '/') {
                char cB4 = b();
                if (cB4 == '*') {
                    while (true) {
                        char cB5 = b();
                        if (cB5 == 0) {
                            throw a("Unclosed comment");
                        }
                        if (cB5 == '*') {
                            if (b() == '/') {
                                break;
                            }
                            a();
                        }
                    }
                } else {
                    if (cB4 != '/') {
                        a();
                        return IOUtils.DIR_SEPARATOR_UNIX;
                    }
                    do {
                        cB = b();
                        if (cB == '\n' || cB == '\r') {
                            break;
                        }
                    } while (cB != 0);
                }
            } else if (cB3 == '#') {
                do {
                    cB2 = b();
                    if (cB2 == '\n' || cB2 == '\r') {
                        break;
                    }
                } while (cB2 != 0);
            } else if (cB3 == 0 || cB3 > ' ') {
                return cB3;
            }
        }
    }

    public final Object d() {
        String strA;
        char c14 = c();
        if (c14 != '\"') {
            if (c14 != '[') {
                if (c14 == '{') {
                    a();
                    return new b(this);
                }
                if (c14 != '\'') {
                    if (c14 != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char cB = c14;
                        while (cB >= ' ' && ",:]}/\\\"[{;=#".indexOf(cB) < 0) {
                            stringBuffer.append(cB);
                            cB = b();
                        }
                        a();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw a("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase(BooleanUtils.TRUE)) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase(BooleanUtils.FALSE)) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase(BuildConfig.TRAVIS)) {
                            return b.f133510a;
                        }
                        if ((c14 >= '0' && c14 <= '9') || c14 == '.' || c14 == '-' || c14 == '+') {
                            if (c14 == '0') {
                                try {
                                    return (strTrim.length() <= 2 || !(strTrim.charAt(1) == 'x' || strTrim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(strTrim, 8)) : new Integer(Integer.parseInt(strTrim.substring(2), 16));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        return new Integer(strTrim);
                                    } catch (Exception unused2) {
                                        return new Double(strTrim);
                                    }
                                } catch (Exception unused3) {
                                    return new Long(strTrim);
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        return strTrim;
                    }
                }
            }
            a();
            return new a(this);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            char cB2 = b();
            if (cB2 == 0 || cB2 == '\n' || cB2 == '\r') {
                break;
            }
            if (cB2 == '\\') {
                cB2 = b();
                if (cB2 == 'b') {
                    stringBuffer2.append('\b');
                } else if (cB2 == 'f') {
                    cB2 = '\f';
                } else if (cB2 == 'n') {
                    stringBuffer2.append('\n');
                } else if (cB2 != 'r') {
                    if (cB2 == 'x') {
                        strA = a(2);
                    } else if (cB2 == 't') {
                        cB2 = '\t';
                    } else if (cB2 == 'u') {
                        strA = a(4);
                    }
                    cB2 = (char) Integer.parseInt(strA, 16);
                } else {
                    stringBuffer2.append(CharUtils.CR);
                }
            } else if (cB2 == c14) {
                return stringBuffer2.toString();
            }
            stringBuffer2.append(cB2);
        }
        throw a("Unterminated string");
    }

    public final String toString() {
        return " at character " + this.f133512a;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    public final JSONException a(String str) {
        StringBuilder sbK = e5.k(str);
        sbK.append(toString());
        return new JSONException(sbK.toString());
    }

    public final void a() {
        int i14;
        if (this.f133515d || (i14 = this.f133512a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f133512a = i14 - 1;
        this.f133515d = true;
    }
}
