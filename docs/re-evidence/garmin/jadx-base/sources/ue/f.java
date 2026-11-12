package ue;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017¨\u0006\u001b"}, d2 = {"Lue/f;", "", "Lue/v;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Lue/v;ZZZ)V", "requiresDeviceIdle", "(Lue/v;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Lue/f$c;", "contentUriTriggers", "(Lue/v;ZZZZJJLjava/util/Set;)V", "Ldf/m;", "requiredNetworkRequestCompat", "(Ldf/m;Lue/v;ZZZZJJLjava/util/Set;)V", "other", "(Lue/f;)V", "a", "c", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f170042j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f170043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.m f170044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f170045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f170046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f170047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f170048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f170049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f170050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set<c> f170051i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lue/f$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f170061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f170062b;

        public c(Uri uri, boolean z14) {
            uri.getClass();
            this.f170061a = uri;
            this.f170062b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!c.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            c cVar = (c) obj;
            return this.f170061a.equals(cVar.f170061a) && this.f170062b == cVar.f170062b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f170062b) + (this.f170061a.hashCode() * 31);
        }
    }

    static {
        new b(null);
        f170042j = new f(null, false, false, false, 15, null);
    }

    public f(df.m mVar, v vVar, boolean z14, boolean z15, boolean z16, boolean z17, long j8, long j14, Set set, int i14, p005kotlin.jvm.internal.j jVar) {
        this(mVar, (i14 & 2) != 0 ? v.NOT_REQUIRED : vVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) == 0 ? z17 : false, (i14 & 64) != 0 ? -1L : j8, (i14 & 128) == 0 ? j14 : -1L, (i14 & 256) != 0 ? p13.l0.f134950a : set);
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f170044b.f59414a;
    }

    @SuppressLint({"NewApi"})
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f.class.equals(obj.getClass())) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f170045c == fVar.f170045c && this.f170046d == fVar.f170046d && this.f170047e == fVar.f170047e && this.f170048f == fVar.f170048f && this.f170049g == fVar.f170049g && this.f170050h == fVar.f170050h && p005kotlin.jvm.internal.s.g(a(), fVar.a()) && this.f170043a == fVar.f170043a) {
            return p005kotlin.jvm.internal.s.g(this.f170051i, fVar.f170051i);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final int hashCode() {
        int iHashCode = ((((((((this.f170043a.hashCode() * 31) + (this.f170045c ? 1 : 0)) * 31) + (this.f170046d ? 1 : 0)) * 31) + (this.f170047e ? 1 : 0)) * 31) + (this.f170048f ? 1 : 0)) * 31;
        long j8 = this.f170049g;
        int i14 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j14 = this.f170050h;
        int iHashCode2 = (this.f170051i.hashCode() + ((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    @SuppressLint({"NewApi"})
    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f170043a + ", requiresCharging=" + this.f170045c + ", requiresDeviceIdle=" + this.f170046d + ", requiresBatteryNotLow=" + this.f170047e + ", requiresStorageNotLow=" + this.f170048f + ", contentTriggerUpdateDelayMillis=" + this.f170049g + ", contentTriggerMaxDelayMillis=" + this.f170050h + ", contentUriTriggers=" + this.f170051i + ", }";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lue/f$b;", "", "<init>", "()V", "Lue/f;", "NONE", "Lue/f;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lue/f$a;", "", "<init>", "()V", "Lue/f;", "constraints", "(Lue/f;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f170052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f170053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public df.m f170054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v f170055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f170056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f170057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f170058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f170059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Set<c> f170060i;

        public a(f fVar) {
            fVar.getClass();
            p005kotlin.jvm.internal.j jVar = null;
            this.f170054c = new df.m(jVar, 1, jVar);
            this.f170055d = v.NOT_REQUIRED;
            this.f170058g = -1L;
            this.f170059h = -1L;
            this.f170060i = new LinkedHashSet();
            this.f170052a = fVar.f170045c;
            this.f170053b = fVar.f170046d;
            this.f170055d = fVar.f170043a;
            this.f170056e = fVar.f170047e;
            this.f170057f = fVar.f170048f;
            this.f170058g = fVar.f170049g;
            this.f170059h = fVar.f170050h;
            this.f170060i = p13.h0.f1(fVar.f170051i);
        }

        public final f a() {
            return new f(this.f170054c, this.f170055d, this.f170052a, this.f170053b, this.f170056e, this.f170057f, this.f170058g, this.f170059h, p13.h0.g1(this.f170060i));
        }

        public final void b(v vVar) {
            vVar.getClass();
            this.f170055d = vVar;
            p005kotlin.jvm.internal.j jVar = null;
            this.f170054c = new df.m(jVar, 1, jVar);
        }

        public a() {
            p005kotlin.jvm.internal.j jVar = null;
            this.f170054c = new df.m(jVar, 1, jVar);
            this.f170055d = v.NOT_REQUIRED;
            this.f170058g = -1L;
            this.f170059h = -1L;
            this.f170060i = new LinkedHashSet();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public f(v vVar, boolean z14, boolean z15, boolean z16) {
        this(vVar, z14, false, z15, z16);
        vVar.getClass();
    }

    public /* synthetic */ f(v vVar, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? v.NOT_REQUIRED : vVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(v vVar, boolean z14, boolean z15, boolean z16, boolean z17) {
        this(vVar, z14, z15, z16, z17, -1L, 0L, null, 192, null);
        vVar.getClass();
    }

    public f(v vVar, boolean z14, boolean z15, boolean z16, boolean z17, long j8, long j14, Set set, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? v.NOT_REQUIRED : vVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, (i14 & 32) != 0 ? -1L : j8, (i14 & 64) != 0 ? -1L : j14, (i14 & 128) != 0 ? p13.l0.f134950a : set);
    }

    public f(v vVar, boolean z14, boolean z15, boolean z16, boolean z17, long j8, long j14, Set<c> set) {
        vVar.getClass();
        set.getClass();
        p005kotlin.jvm.internal.j jVar = null;
        this.f170044b = new df.m(jVar, 1, jVar);
        this.f170043a = vVar;
        this.f170045c = z14;
        this.f170046d = z15;
        this.f170047e = z16;
        this.f170048f = z17;
        this.f170049g = j8;
        this.f170050h = j14;
        this.f170051i = set;
    }

    public /* synthetic */ f(v vVar, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? v.NOT_REQUIRED : vVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
    }

    public f(df.m mVar, v vVar, boolean z14, boolean z15, boolean z16, boolean z17, long j8, long j14, Set<c> set) {
        mVar.getClass();
        vVar.getClass();
        set.getClass();
        this.f170044b = mVar;
        this.f170043a = vVar;
        this.f170045c = z14;
        this.f170046d = z15;
        this.f170047e = z16;
        this.f170048f = z17;
        this.f170049g = j8;
        this.f170050h = j14;
        this.f170051i = set;
    }

    @SuppressLint({"NewApi"})
    public f(f fVar) {
        fVar.getClass();
        this.f170045c = fVar.f170045c;
        this.f170046d = fVar.f170046d;
        this.f170044b = fVar.f170044b;
        this.f170043a = fVar.f170043a;
        this.f170047e = fVar.f170047e;
        this.f170048f = fVar.f170048f;
        this.f170051i = fVar.f170051i;
        this.f170049g = fVar.f170049g;
        this.f170050h = fVar.f170050h;
    }
}
