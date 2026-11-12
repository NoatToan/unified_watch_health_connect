package defpackage;

import com.typesafe.config.ConfigException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class qlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qlh f31636b;

    public qlh(String str, qlh qlhVar) {
        this.f31635a = str;
        this.f31636b = qlhVar;
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        if (!Character.isLetter(str.charAt(0))) {
            return true;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-' && cCharAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static qlh f(String str) {
        return new qlh(str, null);
    }

    public static qlh g(String str) {
        return wkh.f(str);
    }

    public final void a(StringBuilder sb) {
        if (c(this.f31635a) || this.f31635a.isEmpty()) {
            sb.append(wb4.e(this.f31635a));
        } else {
            sb.append(this.f31635a);
        }
        if (this.f31636b != null) {
            sb.append(".");
            this.f31636b.a(sb);
        }
    }

    public String b() {
        return this.f31635a;
    }

    public String d() {
        qlh qlhVar = this;
        while (true) {
            qlh qlhVar2 = qlhVar.f31636b;
            if (qlhVar2 == null) {
                return qlhVar.f31635a;
            }
            qlhVar = qlhVar2;
        }
    }

    public int e() {
        int i = 1;
        for (qlh qlhVar = this.f31636b; qlhVar != null; qlhVar = qlhVar.f31636b) {
            i++;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qlh)) {
            return false;
        }
        qlh qlhVar = (qlh) obj;
        return this.f31635a.equals(qlhVar.f31635a) && wb4.a(this.f31636b, qlhVar.f31636b);
    }

    public qlh h() {
        if (this.f31636b == null) {
            return null;
        }
        rlh rlhVar = new rlh();
        for (qlh qlhVar = this; qlhVar.f31636b != null; qlhVar = qlhVar.f31636b) {
            rlhVar.a(qlhVar.f31635a);
        }
        return rlhVar.d();
    }

    public int hashCode() {
        int iHashCode = (this.f31635a.hashCode() + 41) * 41;
        qlh qlhVar = this.f31636b;
        return iHashCode + (qlhVar == null ? 0 : qlhVar.hashCode());
    }

    public qlh i(qlh qlhVar) {
        rlh rlhVar = new rlh();
        rlhVar.b(qlhVar);
        rlhVar.b(this);
        return rlhVar.d();
    }

    public qlh j() {
        return this.f31636b;
    }

    public String k() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    public qlh l(int i) {
        qlh qlhVar = this;
        while (qlhVar != null && i > 0) {
            i--;
            qlhVar = qlhVar.f31636b;
        }
        return qlhVar;
    }

    public qlh m(int i, int i2) {
        if (i2 < i) {
            throw new ConfigException.BugOrBroken("bad call to subPath");
        }
        qlh qlhVarL = l(i);
        rlh rlhVar = new rlh();
        int i3 = i2 - i;
        while (i3 > 0) {
            i3--;
            rlhVar.a(qlhVarL.b());
            qlhVarL = qlhVarL.j();
            if (qlhVarL == null) {
                throw new ConfigException.BugOrBroken("subPath lastIndex out of range " + i2);
            }
        }
        return rlhVar.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Path(");
        a(sb);
        sb.append(")");
        return sb.toString();
    }

    public qlh(Iterator<qlh> it) {
        if (it.hasNext()) {
            qlh next = it.next();
            this.f31635a = next.f31635a;
            rlh rlhVar = new rlh();
            qlh qlhVar = next.f31636b;
            if (qlhVar != null) {
                rlhVar.b(qlhVar);
            }
            while (it.hasNext()) {
                rlhVar.b(it.next());
            }
            this.f31636b = rlhVar.d();
            return;
        }
        throw new ConfigException.BugOrBroken("empty path");
    }
}
