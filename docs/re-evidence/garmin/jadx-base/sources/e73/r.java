package e73;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class r extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.t f63433a = new h73.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f63434b = new o();

    @Override // j73.d
    public final h73.a c() {
        return this.f63433a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:0: B:6:0x0014->B:99:?, LOOP_END, SYNTHETIC] */
    @Override // j73.a, j73.d
    public final void d(CharSequence charSequence) {
        int iB;
        int i14;
        o oVar = this.f63434b;
        StringBuilder sb3 = oVar.f63407b;
        if (sb3.length() != 0) {
            sb3.append('\n');
        }
        sb3.append(charSequence);
        int iC = 0;
        while (iC < charSequence.length()) {
            switch (o.a.f63415a[oVar.f63406a.ordinal()]) {
                case 1:
                    break;
                case 2:
                    int iC2 = g73.d.c(iC, charSequence.length(), charSequence);
                    if (iC2 >= charSequence.length() || charSequence.charAt(iC2) != '[') {
                        iC = -1;
                    } else {
                        oVar.f63406a = o.b.LABEL;
                        oVar.f63409d = new StringBuilder();
                        iC = iC2 + 1;
                        if (iC >= charSequence.length()) {
                            oVar.f63409d.append('\n');
                        }
                    }
                    if (iC == -1) {
                        oVar.f63406a = o.b.PARAGRAPH;
                    }
                    break;
                case 3:
                    iB = g73.c.b(iC, charSequence);
                    if (iB == -1) {
                        iC = -1;
                    } else {
                        oVar.f63409d.append(charSequence, iC, iB);
                        if (iB >= charSequence.length()) {
                            oVar.f63409d.append('\n');
                            iC = iB;
                        } else if (charSequence.charAt(iB) != ']' || (i14 = iB + 1) >= charSequence.length() || charSequence.charAt(i14) != ':' || oVar.f63409d.length() > 999) {
                            iC = -1;
                        } else {
                            String string = oVar.f63409d.toString();
                            Pattern pattern = g73.a.f76209a;
                            String strReplaceAll = g73.a.f76211c.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(StringUtils.SPACE);
                            if (strReplaceAll.isEmpty()) {
                                iC = -1;
                            } else {
                                oVar.f63410e = strReplaceAll;
                                oVar.f63406a = o.b.DESTINATION;
                                iC = g73.d.c(iB + 2, charSequence.length(), charSequence);
                            }
                        }
                    }
                    if (iC == -1) {
                        oVar.f63406a = o.b.PARAGRAPH;
                    }
                    break;
                case 4:
                    int iC3 = g73.d.c(iC, charSequence.length(), charSequence);
                    int iA = g73.c.a(iC3, charSequence);
                    if (iA != -1) {
                        oVar.f63411f = charSequence.charAt(iC3) == '<' ? charSequence.subSequence(iC3 + 1, iA - 1).toString() : charSequence.subSequence(iC3, iA).toString();
                        iC = g73.d.c(iA, charSequence.length(), charSequence);
                        if (iC >= charSequence.length()) {
                            oVar.f63414i = true;
                            sb3.setLength(0);
                        } else if (iC == iA) {
                            iC = -1;
                        }
                        oVar.f63406a = o.b.START_TITLE;
                    } else {
                        iC = -1;
                    }
                    if (iC == -1) {
                        oVar.f63406a = o.b.PARAGRAPH;
                    }
                    break;
                case 5:
                    iC = g73.d.c(iC, charSequence.length(), charSequence);
                    if (iC >= charSequence.length()) {
                        oVar.f63406a = o.b.START_DEFINITION;
                    } else {
                        oVar.f63412g = (char) 0;
                        char cCharAt = charSequence.charAt(iC);
                        if (cCharAt == '\"' || cCharAt == '\'') {
                            oVar.f63412g = cCharAt;
                        } else if (cCharAt == '(') {
                            oVar.f63412g = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                        }
                        if (oVar.f63412g != 0) {
                            oVar.f63406a = o.b.TITLE;
                            oVar.f63413h = new StringBuilder();
                            iC++;
                            if (iC == charSequence.length()) {
                                oVar.f63413h.append('\n');
                            }
                        } else {
                            oVar.a();
                            oVar.f63406a = o.b.START_DEFINITION;
                        }
                    }
                    if (iC == -1) {
                        oVar.f63406a = o.b.PARAGRAPH;
                    }
                    break;
                case 6:
                    iB = g73.c.c(charSequence, iC, oVar.f63412g);
                    if (iB == -1) {
                        iC = -1;
                    } else {
                        oVar.f63413h.append(charSequence.subSequence(iC, iB));
                        if (iB >= charSequence.length()) {
                            oVar.f63413h.append('\n');
                            iC = iB;
                        } else {
                            iC = g73.d.c(iB + 1, charSequence.length(), charSequence);
                            if (iC != charSequence.length()) {
                                iC = -1;
                            } else {
                                oVar.f63414i = true;
                                oVar.a();
                                sb3.setLength(0);
                                oVar.f63406a = o.b.START_DEFINITION;
                            }
                        }
                    }
                    if (iC == -1) {
                        oVar.f63406a = o.b.PARAGRAPH;
                    }
                    break;
                default:
                    if (iC == -1) {
                        oVar.f63406a = o.b.PARAGRAPH;
                    }
                    break;
            }
            return;
        }
    }

    @Override // j73.a, j73.d
    public final void f(n nVar) {
        StringBuilder sb3 = this.f63434b.f63407b;
        if (sb3.length() > 0) {
            nVar.f(sb3.toString(), this.f63433a);
        }
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        if (hVar.f63360h) {
            return null;
        }
        return j73.c.a(hVar.f63354b);
    }

    @Override // j73.a, j73.d
    public final void h() {
        if (this.f63434b.f63407b.length() == 0) {
            this.f63433a.f();
        }
    }
}
