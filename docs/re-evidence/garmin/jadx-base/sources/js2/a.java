package js2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljs2/a;", "", "", "didSucceed", "", "responseStatus", "retriesRemaining", "isBlocked", "<init>", "(ZILjava/lang/Integer;Z)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1929a f100646e = new C1929a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f100649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f100650d;

    public /* synthetic */ a(boolean z14, int i14, Integer num, boolean z15, int i15, j jVar) {
        this(z14, i14, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f100647a == aVar.f100647a && this.f100648b == aVar.f100648b && s.g(this.f100649c, aVar.f100649c) && this.f100650d == aVar.f100650d;
    }

    public final int hashCode() {
        int iD = q2.d(this.f100648b, Boolean.hashCode(this.f100647a) * 31, 31);
        Integer num = this.f100649c;
        return Boolean.hashCode(this.f100650d) + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "ChangePasscodeResponse(didSucceed=" + this.f100647a + ", responseStatus=" + this.f100648b + ", retriesRemaining=" + this.f100649c + ", isBlocked=" + this.f100650d + ")";
    }

    /* JADX INFO: renamed from: js2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljs2/a$a;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1929a {
        public /* synthetic */ C1929a(j jVar) {
            this();
        }

        private C1929a() {
        }
    }

    private a(boolean z14, int i14, Integer num, boolean z15) {
        this.f100647a = z14;
        this.f100648b = i14;
        this.f100649c = num;
        this.f100650d = z15;
    }

    public /* synthetic */ a(boolean z14, int i14, Integer num, boolean z15, j jVar) {
        this(z14, i14, num, z15);
    }
}
