package js2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ljs2/b;", "", "", "userId", "Lzi2/a;", "serverEnvironment", "<init>", "(JLzi2/a;)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f100651c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zi2.a f100653b;

    public b(long j8, zi2.a aVar) {
        aVar.getClass();
        this.f100652a = j8;
        this.f100653b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f100652a == bVar.f100652a && this.f100653b == bVar.f100653b;
    }

    public final int hashCode() {
        return this.f100653b.hashCode() + (Long.hashCode(this.f100652a) * 31);
    }

    public final String toString() {
        return "OwnerData(userId=" + this.f100652a + ", serverEnvironment=" + this.f100653b + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljs2/b$a;", "", "<init>", "()V", "", "IOS_SERVER_ENVIRONMENT_RAW_VALUE_PROD_STRING", "Ljava/lang/String;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(com.garmin.device.nfc.e eVar) {
            zi2.a aVarValueOf;
            if ((eVar != null ? eVar.f50863b : null) != null) {
                try {
                    if (s.g(eVar.f50863b, "product")) {
                        aVarValueOf = zi2.a.PROD;
                    } else {
                        String str = eVar.f50863b;
                        str.getClass();
                        aVarValueOf = zi2.a.valueOf(str);
                    }
                } catch (Exception unused) {
                    aVarValueOf = null;
                }
            } else {
                aVarValueOf = null;
            }
            if ((eVar != null ? Long.valueOf(eVar.f50862a) : null) == null || aVarValueOf == null) {
                return null;
            }
            return new b(eVar.f50862a, aVarValueOf);
        }

        private a() {
        }
    }
}
