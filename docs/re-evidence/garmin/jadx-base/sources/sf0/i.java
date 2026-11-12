package sf0;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lsf0/i;", "", "<init>", "()V", "d", "c", "b", JWKParameterNames.RSA_EXPONENT, "f", "a", "Lsf0/i$a;", "Lsf0/i$b;", "Lsf0/i$c;", "Lsf0/i$d;", "Lsf0/i$e;", "Lsf0/i$f;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf0/i$b;", "Lsf0/i;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f158852a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf0/i$c;", "Lsf0/i;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f158853a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf0/i$d;", "Lsf0/i;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f158854a = new d();

        private d() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsf0/i$f;", "Lsf0/i;", "", "Luf0/a;", "epochDeviceInfoDTOList", "<init>", "(Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<uf0.a> f158857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<uf0.a> list) {
            super(null);
            list.getClass();
            this.f158857a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f158857a, ((f) obj).f158857a);
        }

        public final int hashCode() {
            return this.f158857a.hashCode();
        }

        public final String toString() {
            return tn.k.h("VerifyDevicePopup(epochDeviceInfoDTOList=", ")", this.f158857a);
        }
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf0/i$a;", "Lsf0/i;", "", "triggerRefresh", "<init>", "(Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f158851a;

        public /* synthetic */ a(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f158851a == ((a) obj).f158851a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f158851a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("CompletedEpochReload(triggerRefresh=", ")", this.f158851a);
        }

        public a(boolean z14) {
            super(null);
            this.f158851a = z14;
        }

        public a() {
            this(false, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf0/i$e;", "Lsf0/i;", "Luf0/b;", "epochRequestDTO", "", "triggerRefresh", "<init>", "(Luf0/b;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uf0.b f158855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f158856b;

        public e(uf0.b bVar, boolean z14) {
            super(null);
            this.f158855a = bVar;
            this.f158856b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f158855a, eVar.f158855a) && this.f158856b == eVar.f158856b;
        }

        public final int hashCode() {
            uf0.b bVar = this.f158855a;
            return Boolean.hashCode(this.f158856b) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        public final String toString() {
            return "Success(epochRequestDTO=" + this.f158855a + ", triggerRefresh=" + this.f158856b + ")";
        }

        public /* synthetic */ e(uf0.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, (i14 & 2) != 0 ? false : z14);
        }
    }
}
