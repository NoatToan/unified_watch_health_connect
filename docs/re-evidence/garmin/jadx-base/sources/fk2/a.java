package fk2;

import dk2.h;
import e23.l;
import f2.o0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfk2/a;", "Lfk2/d;", "Lkotlin/Function1;", "Ldk2/h;", "", "shouldAccept", "", "minSecondsElapsed", "", "ruleIdentifier", "<init>", "(Le23/l;JLjava/lang/String;)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1463a f71937e = new C1463a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<h, Boolean> f71938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f71941d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super h, Boolean> lVar, long j8, String str) {
        lVar.getClass();
        this.f71938a = lVar;
        this.f71939b = j8;
        this.f71940c = str;
        this.f71941d = new o0(this, 17);
    }

    @Override // fk2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF71939b() {
        return this.f71939b;
    }

    @Override // fk2.d
    public final l<h, c> b() {
        return this.f71941d;
    }

    @Override // fk2.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF71940c() {
        return this.f71940c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f71938a, aVar.f71938a) && this.f71939b == aVar.f71939b && s.g(this.f71940c, aVar.f71940c);
    }

    public final int hashCode() {
        int iE = f.e(this.f71938a.hashCode() * 31, 31, this.f71939b);
        String str = this.f71940c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BasicAcceptRule(shouldAccept=");
        sb3.append(this.f71938a);
        sb3.append(", minSecondsElapsed=");
        sb3.append(this.f71939b);
        return e0.h(sb3, ", ruleIdentifier=", this.f71940c, ")");
    }

    /* JADX INFO: renamed from: fk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfk2/a$a;", "", "<init>", "()V", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1463a {
        public /* synthetic */ C1463a(j jVar) {
            this();
        }

        private C1463a() {
        }
    }

    public /* synthetic */ a(l lVar, long j8, String str, int i14, j jVar) {
        this(lVar, (i14 & 2) != 0 ? 0L : j8, (i14 & 4) != 0 ? null : str);
    }
}
