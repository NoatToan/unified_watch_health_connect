package defpackage;

import java.util.Objects;
import org.eclipse.californium.elements.auth.AbstractExtensiblePrincipal;

/* JADX INFO: loaded from: classes20.dex */
public final class zyk extends AbstractExtensiblePrincipal<zyk> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54776c;
    private final boolean e;

    public zyk(String str) {
        this(false, null, str, null);
    }

    public zyk(String str, String str2) {
        this(true, str, str2, null);
    }

    private zyk(boolean z, String str, String str2, zyj zyjVar) {
        super(zyjVar);
        if (str2 == null) {
            throw new NullPointerException("Identity must not be null");
        }
        this.e = z;
        if (z) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                this.f54774a = null;
            } else if (zzp.a(str)) {
                String lowerCase = str.toLowerCase();
                this.f54774a = lowerCase;
                sb.append(lowerCase);
            } else {
                throw new IllegalArgumentException("virtual host is not a valid hostname");
            }
            sb.append(":");
            sb.append(str2);
            this.f54775b = sb.toString();
        } else {
            if (str != null) {
                throw new IllegalArgumentException("virtual host is not supported, if sni is disabled");
            }
            this.f54774a = null;
            this.f54775b = str2;
        }
        this.f54776c = str2;
    }

    private zyk(boolean z, String str, String str2, String str3, zyj zyjVar) {
        super(zyjVar);
        this.e = z;
        this.f54774a = str;
        this.f54776c = str2;
        this.f54775b = str3;
    }

    @Override // org.eclipse.californium.elements.auth.ExtensiblePrincipal
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zyk amend(zyj zyjVar) {
        return new zyk(this.e, this.f54774a, this.f54776c, this.f54775b, zyjVar);
    }

    public boolean a() {
        return this.e;
    }

    public String d() {
        return this.f54774a;
    }

    public String e() {
        return this.f54776c;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.f54775b;
    }

    @Override // java.security.Principal
    public String toString() {
        if (this.e) {
            return "PreSharedKey Identity [virtual host: " + this.f54774a + ", identity: " + this.f54776c + "]";
        }
        return "PreSharedKey Identity [identity: " + this.f54776c + "]";
    }

    @Override // java.security.Principal
    public int hashCode() {
        return this.f54775b.hashCode();
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.f54775b, ((zyk) obj).f54775b);
        }
        return false;
    }
}
