package defpackage;

import com.huawei.operation.utils.Constants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.californium.scandium.util.ServerName;

/* JADX INFO: loaded from: classes20.dex */
public final class aade implements Iterable<ServerName> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<ServerName> f152b;

    private aade() {
        this.f152b = new LinkedHashSet();
    }

    private aade(ServerName serverName) {
        this();
        b(serverName);
    }

    public static aade b() {
        return new aade();
    }

    public static aade c(ServerName serverName) {
        if (serverName == null) {
            throw new NullPointerException("server name must not be null");
        }
        return new aade(serverName);
    }

    public aade b(ServerName serverName) {
        if (serverName == null) {
            throw new NullPointerException("server name must not be null");
        }
        if (b(serverName.c()) != null) {
            throw new IllegalArgumentException("there is already a name of the given type");
        }
        this.f152b.add(serverName);
        return this;
    }

    public int a() {
        return c() + 2;
    }

    public int c() {
        Iterator<ServerName> it = this.f152b.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA = iA + 3 + it.next().a();
        }
        return iA;
    }

    public int d() {
        return this.f152b.size();
    }

    public void b(zzl zzlVar) {
        zzlVar.d(c(), 16);
        for (ServerName serverName : this.f152b) {
            zzlVar.d(serverName.c().getCode());
            zzlVar.b(serverName.e(), 16);
        }
    }

    public void c(zzf zzfVar) {
        zzf zzfVarD = zzfVar.d(zzfVar.a(16));
        while (zzfVarD.d()) {
            ServerName.NameType nameTypeFromCode = ServerName.NameType.fromCode(zzfVarD.e());
            if (AnonymousClass3.f153a[nameTypeFromCode.ordinal()] == 1) {
                b(ServerName.a(nameTypeFromCode, zzfVarD.j(16)));
            } else {
                throw new IllegalArgumentException("ServerNames: unknown name_type!", new IllegalArgumentException(nameTypeFromCode.name()));
            }
        }
    }

    /* JADX INFO: renamed from: aade$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f153a;

        static {
            int[] iArr = new int[ServerName.NameType.values().length];
            f153a = iArr;
            try {
                iArr[ServerName.NameType.HOST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ServerName b(ServerName.NameType nameType) {
        for (ServerName serverName : this.f152b) {
            if (serverName.c().equals(nameType)) {
                return serverName;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<ServerName> iterator() {
        return this.f152b.iterator();
    }

    public String e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzp.d(i + 1));
        sb.append("Server Names[");
        sb.append(d());
        sb.append(" entries");
        for (ServerName serverName : this) {
            sb.append(", '");
            sb.append(serverName.b());
            sb.append("' (");
            sb.append(serverName.c());
            sb.append(Constants.RIGHT_BRACKET_ONLY);
        }
        sb.append("]");
        return sb.toString();
    }

    public String toString() {
        return e(0);
    }

    public int hashCode() {
        Iterator<ServerName> it = this.f152b.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aade aadeVar = (aade) obj;
        if (this.f152b.size() != aadeVar.f152b.size()) {
            return false;
        }
        return this.f152b.containsAll(aadeVar.f152b);
    }

    public static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }
}
