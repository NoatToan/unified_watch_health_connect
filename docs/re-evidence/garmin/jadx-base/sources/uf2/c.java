package uf2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.gson.JsonSyntaxException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luf2/c;", "Lxk2/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements xk2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f170306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dz2.e f170307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.j<vf2.p> f170308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f170309e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, dz2.e eVar, o53.j<? super vf2.p> jVar, long j8) {
        this.f170306b = aVar;
        this.f170307c = eVar;
        this.f170308d = jVar;
        this.f170309e = j8;
    }

    @Override // xk2.c
    public final void a(wk2.f fVar, CoreTransferException coreTransferException) {
        fVar.getClass();
        long j8 = this.f170309e;
        o53.j<vf2.p> jVar = this.f170308d;
        a aVar = this.f170306b;
        if (coreTransferException != null) {
            zg2.c.f204692a.getClass();
            zg2.c.a("DeviceWorkoutFileTransfer", "CoreTransferException - " + coreTransferException);
            aVar.f170289a.d(j8, coreTransferException);
            int i14 = o13.q.f128596b;
            jVar.resumeWith(null);
            return;
        }
        int i15 = a.f170288c;
        aVar.getClass();
        byte[] byteArray = this.f170307c.f61807b.toByteArray();
        byteArray.getClass();
        String str = new String(byteArray, d53.c.f57666b);
        zg2.c cVar = zg2.c.f204692a;
        String strConcat = "String - ".concat(str);
        cVar.getClass();
        zg2.c.a("DeviceWorkoutFileTransfer", strConcat);
        try {
            vf2.p pVar = (vf2.p) aVar.f170290b.fromJson(str, vf2.p.class);
            int i16 = o13.q.f128596b;
            jVar.resumeWith(pVar);
        } catch (JsonSyntaxException e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("DeviceWorkoutFileTransfer", "JsonSyntaxException - " + e4);
            aVar.f170289a.d(j8, e4);
            int i17 = o13.q.f128596b;
            jVar.resumeWith(null);
        }
    }
}
