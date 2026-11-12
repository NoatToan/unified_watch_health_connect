package mu2;

import mh1.q;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmu2/a;", "", "Lcz2/a;", "clock", "<init>", "(Lcz2/a;)V", "a", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2294a f121120a = new C2294a(null);

    static {
        m.b(new q(18));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(cz2.a aVar, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            cz2.a.f56879a.getClass();
            aVar = cz2.a.C1219a.f56881b;
        }
        this(aVar);
    }

    /* JADX INFO: renamed from: mu2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmu2/a$a;", "", "<init>", "()V", "selfLock", "Ljava/lang/Object;", "Lmu2/a;", "self", "Lmu2/a;", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2294a {
        public /* synthetic */ C2294a(j jVar) {
            this();
        }

        public static String a(C2294a c2294a, String str) {
            c2294a.getClass();
            return "DSETUP#" + str + "";
        }

        private C2294a() {
        }
    }

    public a(cz2.a aVar) {
        aVar.getClass();
    }

    public a() {
        this(null, 1, null);
    }
}
