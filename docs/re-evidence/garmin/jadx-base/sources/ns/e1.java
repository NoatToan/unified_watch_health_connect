package ns;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lns/e1;", "Lns/t;", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "<init>", "(Ll22/b;Z)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l22.b f127639i;

    public /* synthetic */ e1(l22.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14);
    }

    @Override // ns.t, ns.p
    public final String h(String str, boolean z14) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f127639i, str);
        bVar.u();
        return bVar.f132238b;
    }

    @Override // ns.t, ns.p
    public final c22.m3 i() {
        return c22.m3.NAUTICAL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(l22.b bVar, boolean z14) {
        super(bVar, z14);
        bVar.getClass();
        this.f127639i = bVar;
    }
}
