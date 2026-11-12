package hx2;

import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.samd.exception.GHSBaseException;
import d53.y;
import java.util.HashMap;
import java.util.List;
import jc2.f;
import kc2.g;
import kx2.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import zk.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhx2/b;", "Lfl/a;", "Lhx2/a;", "event", "<init>", "(Lhx2/a;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends fl.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(aVar.f86311a);
        aVar.getClass();
        this.f71951c.put("LibraryVersion", "5.2.1");
    }

    public final void e(DeviceProfile deviceProfile, kx2.a aVar, kx2.b bVar, Throwable th3, String str) {
        Unit unit;
        aVar.getClass();
        HashMap<String, Object> map = this.f71951c;
        if (deviceProfile != null) {
            map.put("UnitInfo", new g(deviceProfile.getF92746j(), deviceProfile.getF92742f(), String.valueOf(deviceProfile.getF92744h()), String.valueOf(deviceProfile.getF92745i())));
        }
        map.put("AppName", aVar.name());
        if (bVar != null) {
            d(f.FAILURE);
            c(new kc2.b("", bVar.name(), str != null ? y.s0(255, str) : "", th3 != null ? o13.g.b(th3) : "", bVar.f107125a.name()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            d(f.SUCCESS);
        }
        zk.a aVarA = a();
        if (aVarA != null) {
            zk.c cVar = zk.c.f205034a;
            List listC = w.c("OMT");
            cVar.getClass();
            new d(cVar, null, listC).a(aVarA);
        }
    }

    public final void f(e eVar, Throwable th3) {
        Unit unit;
        kx2.g gVar = eVar.f107132a;
        rs2.c cVar = eVar.f107136e;
        g gVar2 = new g(cVar.getF92746j(), cVar.getF92742f(), String.valueOf(cVar.getF92744h()), String.valueOf(cVar.getF92745i()));
        HashMap<String, Object> map = this.f71951c;
        map.put("UnitInfo", gVar2);
        map.put("SaMDFileTransfer", new c(eVar.f107133b.name(), eVar.f107135d.name(), eVar.f107134c, eVar.f107140i, eVar.f107138g, eVar.f107139h));
        if (th3 != null) {
            d(f.FAILURE);
            String ghsErrorId = th3 instanceof GHSBaseException ? ((GHSBaseException) th3).getGhsErrorId() : null;
            if (ghsErrorId == null) {
                ghsErrorId = "";
            }
            String strName = gVar.name();
            String message = th3.getMessage();
            String strS0 = message != null ? y.s0(255, message) : "";
            String strB = o13.g.b(th3);
            jc2.c cVar2 = gVar.f107158a;
            c(new kc2.b(ghsErrorId, strName, strS0, strB, cVar2 != null ? cVar2.name() : null));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            d(f.SUCCESS);
        }
        zk.a aVarA = a();
        if (aVarA != null) {
            zk.c cVar3 = zk.c.f205034a;
            List listC = w.c("OMT");
            cVar3.getClass();
            new d(cVar3, null, listC).a(aVarA);
        }
    }
}
