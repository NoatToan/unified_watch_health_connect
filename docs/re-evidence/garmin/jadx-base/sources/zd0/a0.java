package zd0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzd0/a0;", "", "Llc0/h;", "isScreenlessDeviceUseCase", "Lf12/l;", "gcmUserSettings", "<init>", "(Llc0/h;Lf12/l;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc0.h f203978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f203979b;

    public a0(lc0.h hVar, f12.l lVar) {
        hVar.getClass();
        lVar.getClass();
        this.f203978a = hVar;
        this.f203979b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) throws Throwable {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f204204c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f204204c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objE0 = yVar.f204202a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f204204c;
        Object obj = null;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            z zVar = new z(null);
            yVar.f204204c = 1;
            objE0 = ge1.b.e0(bVar, zVar, yVar);
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
        for (Object obj2 : (List) objE0) {
            if (((sd2.f) obj2).getUnitID() == this.f203979b.s4()) {
                obj = obj2;
                break;
            }
        }
        sd2.f fVar = (sd2.f) obj;
        return Boolean.valueOf(fVar != null ? this.f203978a.a(fVar) : false);
    }
}
