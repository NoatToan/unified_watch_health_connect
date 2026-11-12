package x21;

import d53.k;
import d53.u;
import d53.w;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx21/h;", "", "<init>", "()V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f188523a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f188524b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f188525c;

    static {
        new a(null);
    }

    public static String c(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return w.i0(new k("\\s+").f(new k("[^a-z0-9 ]").f(lowerCase, ""), StringUtils.SPACE)).toString();
    }

    public final void a() {
        String string = w.i0(this.f188524b).toString();
        if (string.length() > 0) {
            StringBuilder sb3 = this.f188523a;
            if (sb3.length() > 0) {
                sb3.append(' ');
            }
            sb3.append(string);
        }
        this.f188524b = "";
    }

    public final String b() {
        boolean zJ = w.J(this.f188524b);
        StringBuilder sb3 = this.f188523a;
        if (zJ) {
            return sb3.toString();
        }
        int length = sb3.length();
        String str = this.f188524b;
        if (length == 0) {
            return str;
        }
        return ((Object) sb3) + StringUtils.SPACE + str;
    }

    public final void d(String str) {
        str.getClass();
        String string = w.i0(new k("\\s+").f(str, StringUtils.SPACE)).toString();
        if (w.J(string)) {
            if (w.J(this.f188524b)) {
                return;
            }
            a();
            this.f188525c = false;
            b();
            return;
        }
        this.f188525c = true;
        String strC = c(this.f188524b);
        String strC2 = c(string);
        if (w.J(this.f188524b) || u.y(strC2, strC, false) || !u.y(strC, strC2, false)) {
            this.f188524b = string;
        } else {
            a();
            this.f188524b = string;
        }
        b();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx21/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
