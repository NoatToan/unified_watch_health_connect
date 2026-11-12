package g4;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg4/r;", "", "", "data", "<init>", "(Ljava/lang/String;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75751b;

    public r(String str) {
        this.f75750a = str;
    }

    public final boolean a() {
        return this.f75751b >= this.f75750a.length();
    }

    public final void b() {
        if (c(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            return;
        }
        f("expected )");
        throw null;
    }

    public final boolean c(char c14) {
        int i14 = this.f75751b;
        String str = this.f75750a;
        return i14 < str.length() && str.charAt(this.f75751b) == c14;
    }

    public final int d(String str) {
        Integer numI = d53.t.i(e(str));
        if (numI != null) {
            return numI.intValue();
        }
        f("expected int");
        throw null;
    }

    public final String e(String str) {
        String str2;
        int i14 = this.f75751b;
        while (true) {
            int i15 = this.f75751b;
            str2 = this.f75750a;
            if (i15 >= str2.length() || w.A(str, str2.charAt(this.f75751b))) {
                break;
            }
            this.f75751b++;
        }
        int i16 = this.f75751b;
        return i16 > i14 ? str2.substring(i14, i16) : "";
    }

    public final void f(String str) {
        int i14 = this.f75751b;
        String str2 = this.f75750a;
        int iMin = Math.min(i14, str2.length());
        StringBuilder sbL = hb.a.l("Error while parsing source information: ", str, " at ");
        sbL.append(str2.substring(0, iMin));
        sbL.append('|');
        sbL.append(str2.substring(iMin));
        throw new p(sbL.toString());
    }
}
