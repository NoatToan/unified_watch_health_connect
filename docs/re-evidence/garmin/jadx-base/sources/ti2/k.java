package ti2;

import o13.m;
import o13.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lti2/k;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public enum k {
    BOOTSTRAP_FAILURE,
    SESSION_EXPIRED,
    DOB_COLLECTED,
    USER_EXIT,
    PAGE_LOAD,
    UNKNOWN_EVENT_TYPE,
    /* JADX INFO: Fake field, exist only in values array */
    COMMUNICATION,
    /* JADX INFO: Fake field, exist only in values array */
    GLOBAL_SIGNOUT,
    /* JADX INFO: Fake field, exist only in values array */
    CHILD_ACCOUNT_REQUEST_COMPLETED,
    /* JADX INFO: Fake field, exist only in values array */
    EXTERNAL_LINK;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f164660a = m.a(n.PUBLICATION, new ta0.g(20));

    /* JADX INFO: renamed from: ti2.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/k$a;", "", "<init>", "()V", "Li63/c;", "Lti2/k;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<k> serializer() {
            return (i63.c) k.f164660a.getValue();
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
