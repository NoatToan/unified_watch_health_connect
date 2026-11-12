package cg;

import lc.u0;
import p005kotlin.Metadata;
import wf.i;
import wf.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcg/c;", "Lcg/d;", "Lcg/e;", "target", "Lwf/i;", "result", "<init>", "(Lcg/e;Lwf/i;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f27113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f27114b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcg/c$a;", "Lcg/d$a;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements d.a {
        @Override // cg.d.a
        public final d a(e eVar, i iVar) {
            return new c(eVar, iVar);
        }
    }

    public c(e eVar, i iVar) {
        this.f27113a = eVar;
        this.f27114b = iVar;
    }

    @Override // cg.d
    public final void a() {
        i iVar = this.f27114b;
        boolean z14 = iVar instanceof p;
        e eVar = this.f27113a;
        if (z14) {
            eVar.getClass();
        } else if (iVar instanceof wf.e) {
            eVar.getClass();
        } else {
            u0.r();
        }
    }
}
