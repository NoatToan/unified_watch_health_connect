package xm0;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r implements e23.a<h3<Integer, k>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f191459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f191460b;

    public r(p pVar, v vVar) {
        this.f191459a = pVar;
        this.f191460b = vVar;
    }

    @Override // e23.a
    public final h3<Integer, k> invoke() {
        p pVar = this.f191459a;
        return new o(pVar.f191451d, pVar.f191454g, pVar.f191448a, pVar.f191449b, pVar.f191450c, this.f191460b);
    }
}
