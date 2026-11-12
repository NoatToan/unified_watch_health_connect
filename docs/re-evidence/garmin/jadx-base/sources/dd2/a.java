package dd2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sc2.j;
import sc2.m;
import sc2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldd2/a;", "", "Lsc2/j;", "oAuth1GCData", "Lsc2/o;", "oAuth2ITData", "Lsc2/m;", "oAuth2DIData", "<init>", "(Lsc2/j;Lsc2/o;Lsc2/m;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f59204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f59205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f59206c;

    static {
        new C1262a(null);
    }

    public /* synthetic */ a(j jVar, o oVar, m mVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : jVar, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f59204a, aVar.f59204a) && s.g(this.f59205b, aVar.f59205b) && s.g(this.f59206c, aVar.f59206c);
    }

    public final int hashCode() {
        j jVar = this.f59204a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        o oVar = this.f59205b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        m mVar = this.f59206c;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "Credentials(oAuth1GCData=" + this.f59204a + ", oAuth2ITData=" + this.f59205b + ", oAuth2DIData=" + this.f59206c + ")";
    }

    /* JADX INFO: renamed from: dd2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldd2/a$a;", "", "<init>", "()V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1262a {

        /* JADX INFO: renamed from: dd2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldd2/a$a$a;", "", "", "keyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC1263a {
            ROOT("credentials");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f59209a;

            EnumC1263a(String str) {
                this.f59209a = str;
            }
        }

        public /* synthetic */ C1262a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1262a() {
        }
    }

    public a(j jVar, o oVar, m mVar) {
        this.f59204a = jVar;
        this.f59205b = oVar;
        this.f59206c = mVar;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
