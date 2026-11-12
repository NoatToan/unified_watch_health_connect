package ki1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lki1/w;", "", "Lki1/w$a;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lmi1/a;", "primaryButtonType", "<init>", "(Lki1/w$a;Lmi1/a;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f104913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi1.a f104914b;

    public interface a {

        /* JADX INFO: renamed from: ki1.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/w$a$a;", "Lki1/w$a;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2010a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2010a f104915a = new C2010a();

            private C2010a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2010a);
            }

            public final int hashCode() {
                return 2121016102;
            }

            public final String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/w$a$b;", "Lki1/w$a;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f104916a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2646746;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lki1/w$a$c;", "Lki1/w$a;", "Lki1/v;", "requestLocationState", "<init>", "(Lki1/v;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f104917a;

            public c(v vVar) {
                this.f104917a = vVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f104917a, ((c) obj).f104917a);
            }

            public final int hashCode() {
                v vVar = this.f104917a;
                if (vVar == null) {
                    return 0;
                }
                return vVar.hashCode();
            }

            public final String toString() {
                return "LocationRequired(requestLocationState=" + this.f104917a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/w$a$d;", "Lki1/w$a;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f104918a = new d();

            private d() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 2093793697;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public w(a aVar, mi1.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f104913a = aVar;
        this.f104914b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f104913a.equals(wVar.f104913a) && this.f104914b.equals(wVar.f104914b);
    }

    public final int hashCode() {
        return this.f104914b.hashCode() + (this.f104913a.hashCode() * 31);
    }

    public final String toString() {
        return "UiState(state=" + this.f104913a + ", primaryButtonType=" + this.f104914b + ")";
    }
}
