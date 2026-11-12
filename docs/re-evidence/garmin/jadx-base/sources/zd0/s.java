package zd0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzd0/s;", "", "Llc0/h;", "isScreenlessDeviceUseCase", "<init>", "(Llc0/h;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc0.h f204126a;

    public s(lc0.h hVar) {
        hVar.getClass();
        this.f204126a = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) throws Throwable {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f204116c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f204116c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE0 = qVar.f204114a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f204116c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            r rVar = new r(null);
            qVar.f204116c = 1;
            objE0 = ge1.b.e0(bVar, rVar, qVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        List<sd2.f> list = (List) objE0;
        if (list == null || !list.isEmpty()) {
            for (sd2.f fVar : list) {
                if (fVar == null ? false : this.f204126a.a(fVar)) {
                }
            }
            z14 = false;
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
