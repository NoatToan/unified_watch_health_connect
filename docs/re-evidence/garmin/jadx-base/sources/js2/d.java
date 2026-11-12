package js2;

import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ljs2/d;", "", "Ljs2/e;", "passcodeState", "Ljs2/b;", "ownerData", "Ljs2/c;", "ownerDataState", "", "retries", "<init>", "(Ljs2/e;Ljs2/b;Ljs2/c;Ljava/lang/Integer;)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f100659h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f100660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js2.b f100661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f100662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f100663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f100664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f100665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f100666g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100667a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.NO_PASSCODE_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.NOT_APPLICABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.PASSCODE_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.BLOCKED_WALLET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.LOCKED_WALLET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f100667a = iArr;
        }
    }

    private d(e eVar, js2.b bVar, c cVar, Integer num) {
        this.f100660a = eVar;
        this.f100661b = bVar;
        this.f100662c = cVar;
        this.f100663d = num;
        Boolean bool = null;
        this.f100664e = bVar != null ? Long.valueOf(bVar.f100652a) : null;
        switch (b.f100667a[eVar.ordinal()]) {
            case 1:
                break;
            case 2:
            case 3:
                bool = Boolean.FALSE;
                break;
            case 4:
            case 5:
            case 6:
                bool = Boolean.TRUE;
                break;
            default:
                u0.r();
                throw null;
        }
        this.f100665f = bool;
        this.f100666g = s.g(bool, Boolean.TRUE) || (eVar == e.NOT_APPLICABLE && bVar != null);
    }

    public static d a(d dVar, js2.b bVar, c cVar) {
        e eVar = dVar.f100660a;
        Integer num = dVar.f100663d;
        dVar.getClass();
        eVar.getClass();
        cVar.getClass();
        return new d(eVar, bVar, cVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f100660a == dVar.f100660a && s.g(this.f100661b, dVar.f100661b) && this.f100662c == dVar.f100662c && s.g(this.f100663d, dVar.f100663d);
    }

    public final int hashCode() {
        int iHashCode = this.f100660a.hashCode() * 31;
        js2.b bVar = this.f100661b;
        int iHashCode2 = (this.f100662c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        Integer num = this.f100663d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PasscodeData(passcodeState=" + this.f100660a + ", ownerData=" + this.f100661b + ", ownerDataState=" + this.f100662c + ", retries=" + this.f100663d + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljs2/d$a;", "", "<init>", "()V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(js2.b bVar, c cVar, int i14, int i15) {
            e eVar;
            cVar.getClass();
            Integer numValueOf = i15 < 0 ? null : Integer.valueOf(i15);
            if (i14 != 12) {
                eVar = i14 != 13 ? e.PASSCODE_SET : e.LOCKED_WALLET;
            } else {
                eVar = e.BLOCKED_WALLET;
            }
            return new d(eVar, bVar, cVar, numValueOf, null);
        }

        public static d b(js2.b bVar, c cVar) {
            cVar.getClass();
            return new d(e.NO_PASSCODE_SET, bVar, cVar, 22, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(e eVar, js2.b bVar, c cVar, Integer num, j jVar) {
        this(eVar, bVar, cVar, num);
    }

    public /* synthetic */ d(e eVar, js2.b bVar, c cVar, Integer num, int i14, j jVar) {
        this(eVar, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? c.UNKNOWN : cVar, (i14 & 8) != 0 ? null : num);
    }
}
