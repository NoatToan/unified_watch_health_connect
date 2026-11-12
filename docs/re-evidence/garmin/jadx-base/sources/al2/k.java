package al2;

import p005kotlin.Metadata;
import pk2.x;
import pk2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lal2/k;", "", "", "isComplete", "<init>", "(Ljava/lang/String;IZ)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum k {
    QUEUED(false),
    STARTED(false),
    REJECTED(false),
    FAILURE(true),
    INTERRUPTED(true),
    SKIPPED(true),
    SUCCESS(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3808b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3817a;

    k(boolean z14) {
        this.f3817a = z14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal2/k$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static k a(x xVar, boolean z14) {
            y yVar;
            ok2.e eVar = xVar.f138498c;
            if (eVar == null || (yVar = xVar.f138496a) == y.TREAT_AS_SUCCESS || yVar == y.NO_RETRY_FAILURE) {
                return k.SUCCESS;
            }
            if (eVar == ok2.e.f132641i || eVar == ok2.e.f132648p) {
                return k.SKIPPED;
            }
            if (eVar.a()) {
                return z14 ? k.INTERRUPTED : k.REJECTED;
            }
            return k.FAILURE;
        }

        private a() {
        }
    }
}
