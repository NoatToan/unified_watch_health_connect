package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly8/e0;", "Ly8/b0;", "Ljava/time/Instant;", "time", "Ljava/time/ZoneOffset;", "zoneOffset", "Lc9/d;", "mass", "Lz8/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Lc9/d;Lz8/c;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c9.d f194766e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.d f194769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8.c f194770d;

    static {
        new a(null);
        c9.d.f25972c.getClass();
        f194766e = new c9.d(1000, c9.d.b.f25977b, null);
    }

    public e0(Instant instant, ZoneOffset zoneOffset, c9.d dVar, z8.c cVar) {
        instant.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f194767a = instant;
        this.f194768b = zoneOffset;
        this.f194769c = dVar;
        this.f194770d = cVar;
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
            return;
        }
        b1.d(dVar, (c9.d) p13.u0.c(dVar.f25975b, c9.d.f25973d), "mass");
        b1.e(dVar, f194766e, "mass");
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ZoneOffset getF195074b() {
        return this.f194768b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f194769c.equals(e0Var.f194769c) && this.f194767a.equals(e0Var.f194767a) && p005kotlin.jvm.internal.s.g(this.f194768b, e0Var.f194768b) && this.f194770d.equals(e0Var.f194770d);
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194770d;
    }

    @Override // y8.b0
    /* JADX INFO: renamed from: getTime, reason: from getter */
    public final Instant getF195073a() {
        return this.f194767a;
    }

    public final int hashCode() {
        int iK = wr.g.k(this.f194767a, this.f194769c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.f194768b;
        return this.f194770d.hashCode() + ((iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LeanBodyMassRecord(time=");
        sb3.append(this.f194767a);
        sb3.append(", zoneOffset=");
        sb3.append(this.f194768b);
        sb3.append(", mass=");
        sb3.append(this.f194769c);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194770d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly8/e0$a;", "", "<init>", "()V", "Lc9/d;", "MAX_MASS", "Lc9/d;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
