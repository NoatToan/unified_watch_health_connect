package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class prr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static spe f30689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static yoe f30690b;
    public static b9i c;
    public static boolean d;

    public static void a() {
        if (!d) {
            throw new IllegalStateException("Do you forget to initialize XLog?");
        }
    }

    public static void b(yoe yoeVar, b9i... b9iVarArr) {
        if (d) {
            b0i.d().f("XLog is already initialized, do not initialize again");
        }
        d = true;
        if (yoeVar == null) {
            throw new IllegalArgumentException("Please specify a LogConfiguration");
        }
        f30690b = yoeVar;
        d9i d9iVar = new d9i(b9iVarArr);
        c = d9iVar;
        f30689a = new spe(f30690b, d9iVar);
    }

    public static spe.a c(String str) {
        return new spe.a().v(str);
    }

    public static void d(String str, Object... objArr) {
        a();
        f30689a.m(str, objArr);
    }
}
