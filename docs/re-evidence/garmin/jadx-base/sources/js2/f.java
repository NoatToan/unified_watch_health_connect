package js2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB1\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljs2/f;", "", "", "passcodeMatches", "", "responseStatus", "retriesRemaining", "isBlocked", "<init>", "(Ljava/lang/Boolean;ILjava/lang/Integer;Z)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f100675e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f100676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f100678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f100679d;

    public /* synthetic */ f(Boolean bool, int i14, Integer num, boolean z14, int i15, j jVar) {
        this(bool, i14, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f100676a, fVar.f100676a) && this.f100677b == fVar.f100677b && s.g(this.f100678c, fVar.f100678c) && this.f100679d == fVar.f100679d;
    }

    public final int hashCode() {
        Boolean bool = this.f100676a;
        int iD = q2.d(this.f100677b, (bool == null ? 0 : bool.hashCode()) * 31, 31);
        Integer num = this.f100678c;
        return Boolean.hashCode(this.f100679d) + ((iD + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VerifyPasscodeResponse(passcodeMatches=" + this.f100676a + ", responseStatus=" + this.f100677b + ", retriesRemaining=" + this.f100678c + ", isBlocked=" + this.f100679d + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljs2/f$a;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private f(Boolean bool, int i14, Integer num, boolean z14) {
        this.f100676a = bool;
        this.f100677b = i14;
        this.f100678c = num;
        this.f100679d = z14;
    }

    public /* synthetic */ f(Boolean bool, int i14, Integer num, boolean z14, j jVar) {
        this(bool, i14, num, z14);
    }
}
