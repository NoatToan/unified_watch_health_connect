package d22;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ld22/a;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: d22.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld22/a$a;", "", "", "codeVerifier", "codeChallenge", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1227a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f57301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f57302b;

        public C1227a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f57301a = str;
            this.f57302b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1227a)) {
                return false;
            }
            C1227a c1227a = (C1227a) obj;
            return this.f57301a.equals(c1227a.f57301a) && this.f57302b.equals(c1227a.f57302b);
        }

        public final int hashCode() {
            return this.f57302b.hashCode() + (this.f57301a.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("CodeChallengePair(codeVerifier=", this.f57301a, ", codeChallenge=", this.f57302b, ")");
        }
    }
}
