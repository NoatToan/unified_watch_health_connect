package ok2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lok2/a;", "Lok2/b;", "Lok2/a0;", "instance", "<init>", "(Lok2/a0;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f132583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yr1.n f132584b;

    static {
        new C2518a(null);
    }

    public a(a0 a0Var) {
        a0Var.getClass();
        this.f132583a = a0Var;
    }

    @Override // ok2.b
    public final zy2.f a() {
        return new zy2.f();
    }

    @Override // ok2.b
    public final vk2.a b() {
        return null;
    }

    public abstract com.garmin.device.filetransfer.a d(rs2.c cVar, g gVar);

    public void e(String str) {
        str.getClass();
    }

    @Override // ok2.b
    public final d getConfiguration() throws IllegalAccessException {
        yr1.n nVar = this.f132584b;
        if (nVar != null) {
            return nVar;
        }
        com.nimbusds.jose.shaded.gson.internal.a.t("Attempted to access config without initialize call");
        return null;
    }

    /* JADX INFO: renamed from: ok2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lok2/a$a;", "", "<init>", "()V", "", "LOG_PREFIX", "Ljava/lang/String;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2518a {
        public /* synthetic */ C2518a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2518a() {
        }
    }
}
