package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo63/e0;", "Lo63/d0;", "", "source", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 extends d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str) {
        super(str);
        str.getClass();
    }

    @Override // o63.d0, o63.a
    public final boolean b() {
        char cCharAt;
        int iT = t();
        String str = this.f129846e;
        return (iT >= str.length() || iT == -1 || (cCharAt = str.charAt(iT)) == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
    }

    @Override // o63.d0, o63.a
    public final byte e() {
        int iT = t();
        String str = this.f129846e;
        if (iT >= str.length() || iT == -1) {
            return (byte) 10;
        }
        this.f129815a = iT + 1;
        return ge1.b.l(str.charAt(iT));
    }

    @Override // o63.d0, o63.a
    public final void g(char c14) {
        int iT = t();
        String str = this.f129846e;
        if (iT >= str.length() || iT == -1) {
            this.f129815a = -1;
            w(c14);
            throw null;
        }
        char cCharAt = str.charAt(iT);
        this.f129815a = iT + 1;
        if (cCharAt == c14) {
            return;
        }
        w(c14);
        throw null;
    }

    @Override // o63.a
    public final byte q() {
        int iT = t();
        String str = this.f129846e;
        if (iT >= str.length() || iT == -1) {
            return (byte) 10;
        }
        this.f129815a = iT;
        return ge1.b.l(str.charAt(iT));
    }

    @Override // o63.d0, o63.a
    public final int t() {
        int i14;
        int iG = this.f129815a;
        if (iG == -1) {
            return iG;
        }
        while (true) {
            String str = this.f129846e;
            if (iG >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(iG);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i14 = iG + 1) >= str.length()) {
                    break;
                }
                char cCharAt2 = str.charAt(i14);
                if (cCharAt2 == '*') {
                    int iH = d53.w.H(str, "*/", iG + 2, false, 4);
                    if (iH == -1) {
                        this.f129815a = str.length();
                        a.m(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    iG = iH + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iG = d53.w.G('\n', iG + 2, 4, str);
                    if (iG == -1) {
                        iG = str.length();
                    }
                }
            }
            iG++;
        }
        this.f129815a = iG;
        return iG;
    }
}
