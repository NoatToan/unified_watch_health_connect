package v80;

import da2.i;
import o53.b0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lv80/a;", "Lo53/b0;", "Lda2/i;", "connectedDeviceRegistry", "Lo53/z;", "ioDispatcher", "<init>", "(Lda2/i;Lo53/z;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f176197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f176198b;

    static {
        new C3285a(null);
    }

    public a(i iVar, z zVar) {
        iVar.getClass();
        zVar.getClass();
        this.f176197a = iVar;
        this.f176198b = zVar;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF195311f() {
        return this.f176198b.plus(ge1.b.h());
    }

    /* JADX INFO: renamed from: v80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv80/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3285a {
        public /* synthetic */ C3285a(j jVar) {
            this();
        }

        private C3285a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(i iVar, z zVar, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(iVar, zVar);
    }
}
