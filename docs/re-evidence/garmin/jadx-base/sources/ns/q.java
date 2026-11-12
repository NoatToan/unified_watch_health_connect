package ns;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lns/q;", "Lns/t;", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "<init>", "(Ll22/b;Z)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l22.b f127731i;

    public /* synthetic */ q(l22.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14);
    }

    @Override // ns.p
    public final String j(double d14, c22.m3 m3Var, boolean z14, boolean z15) {
        m3Var.getClass();
        c22.l3.f23124b.getClass();
        return c22.l3.a.R(this.f127731i, d14, m3Var, c22.l3.f23131i, z14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l22.b bVar, boolean z14) {
        super(bVar, z14);
        bVar.getClass();
        this.f127731i = bVar;
    }
}
