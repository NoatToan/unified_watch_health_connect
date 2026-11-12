package o63;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo63/d0;", "Lo63/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d0 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f129846e;

    public d0(String str) {
        str.getClass();
        this.f129846e = str;
    }

    @Override // o63.a
    public boolean b() {
        int i14 = this.f129815a;
        if (i14 == -1) {
            return false;
        }
        while (true) {
            String str = this.f129846e;
            if (i14 >= str.length()) {
                this.f129815a = i14;
                return false;
            }
            char cCharAt = str.charAt(i14);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f129815a = i14;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i14++;
        }
    }

    @Override // o63.a
    public final String d() {
        String string;
        g(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i14 = this.f129815a;
        String str = this.f129846e;
        int iG = d53.w.G(CoreConstants.DOUBLE_QUOTE_CHAR, i14, 4, str);
        if (iG == -1) {
            j();
            int i15 = this.f129815a;
            a.m(this, am.j.m("Expected quotation mark '\"', but had '", (i15 == str.length() || i15 < 0) ? "EOF" : String.valueOf(str.charAt(i15)), "' instead"), i15, null, 4);
            throw null;
        }
        int i16 = i14;
        while (i16 < iG) {
            if (str.charAt(i16) == '\\') {
                int iS = this.f129815a;
                char cCharAt = str.charAt(i16);
                boolean z14 = false;
                while (true) {
                    StringBuilder sb3 = this.f129818d;
                    if (cCharAt == '\"') {
                        if (z14) {
                            sb3.append((CharSequence) getF129846e(), iS, i16);
                            string = sb3.toString();
                            sb3.setLength(0);
                        } else {
                            string = getF129846e().subSequence(iS, i16).toString();
                        }
                        this.f129815a = i16 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb3.append((CharSequence) getF129846e(), iS, i16);
                        int iS2 = s(i16 + 1);
                        if (iS2 == -1) {
                            a.m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iS2 + 1;
                        char cCharAt2 = str.charAt(iS2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c14 = cCharAt2 < 'u' ? f.f129850b[cCharAt2] : (char) 0;
                            if (c14 == 0) {
                                a.m(this, "Invalid escaped char '" + cCharAt2 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
                                throw null;
                            }
                            sb3.append(c14);
                        }
                        iS = s(iA);
                        if (iS == -1) {
                            a.m(this, "Unexpected EOF", iS, null, 4);
                            throw null;
                        }
                    } else {
                        i16++;
                        if (i16 >= str.length()) {
                            sb3.append((CharSequence) getF129846e(), iS, i16);
                            iS = s(i16);
                            if (iS == -1) {
                                a.m(this, "Unexpected EOF", iS, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i16);
                    }
                    i16 = iS;
                    z14 = true;
                    cCharAt = str.charAt(i16);
                }
            } else {
                i16++;
            }
        }
        this.f129815a = iG + 1;
        return str.substring(i14, iG);
    }

    @Override // o63.a
    public byte e() {
        String str;
        int i14 = this.f129815a;
        while (true) {
            str = this.f129846e;
            if (i14 == -1 || i14 >= str.length()) {
                break;
            }
            int i15 = i14 + 1;
            char cCharAt = str.charAt(i14);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f129815a = i15;
                return ge1.b.l(cCharAt);
            }
            i14 = i15;
        }
        this.f129815a = str.length();
        return (byte) 10;
    }

    @Override // o63.a
    public void g(char c14) {
        int i14 = this.f129815a;
        if (i14 == -1) {
            w(c14);
            throw null;
        }
        while (true) {
            String str = this.f129846e;
            if (i14 >= str.length()) {
                this.f129815a = -1;
                w(c14);
                throw null;
            }
            int i15 = i14 + 1;
            char cCharAt = str.charAt(i14);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f129815a = i15;
                if (cCharAt == c14) {
                    return;
                }
                w(c14);
                throw null;
            }
            i14 = i15;
        }
    }

    @Override // o63.a
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF129846e() {
        return this.f129846e;
    }

    @Override // o63.a
    public final String p(String str, boolean z14) {
        str.getClass();
        int i14 = this.f129815a;
        try {
            if (e() == 6 && p005kotlin.jvm.internal.s.g(r(z14), str)) {
                this.f129817c = null;
                if (e() == 5) {
                    return r(z14);
                }
            }
            return null;
        } finally {
            this.f129815a = i14;
            this.f129817c = null;
        }
    }

    @Override // o63.a
    public final int s(int i14) {
        if (i14 < this.f129846e.length()) {
            return i14;
        }
        return -1;
    }

    @Override // o63.a
    public int t() {
        char cCharAt;
        int i14 = this.f129815a;
        if (i14 == -1) {
            return i14;
        }
        while (true) {
            String str = this.f129846e;
            if (i14 >= str.length() || !((cCharAt = str.charAt(i14)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i14++;
        }
        this.f129815a = i14;
        return i14;
    }
}
