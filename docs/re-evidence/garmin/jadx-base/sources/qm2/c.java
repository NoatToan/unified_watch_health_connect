package qm2;

import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqm2/c;", "Llm2/i$b;", "Lbm2/f;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements lm2.i.b<bm2.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f145693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.d f145694b;

    public c(b bVar, bm2.d dVar) {
        this.f145693a = bVar;
        this.f145694b = dVar;
    }

    @Override // lm2.i.b
    public final void a(bm2.f fVar) {
        bm2.f fVar2 = fVar;
        bm2.d dVar = this.f145694b;
        b bVar = this.f145693a;
        if (fVar2 != null) {
            bVar.f145672q = fVar2;
            fVar2.b(dVar.getF92746j());
            b.B.debug("Looked up device dto for " + fVar2.getPartNumberPartial() + StringUtils.SPACE + fVar2.getApplicationKey());
        }
        bVar.f145657b.W(dVar, bVar.f145672q);
    }

    @Override // lm2.i.b
    public final void onFailure(Throwable th3) {
        th3.getClass();
        b.B.warn("Failed to lookup correct DeviceDTO", th3);
        b bVar = this.f145693a;
        bVar.f145657b.W(this.f145694b, bVar.f145672q);
    }
}
