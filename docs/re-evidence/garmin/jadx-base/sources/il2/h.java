package il2;

import android.content.Context;
import android.content.IntentFilter;
import com.garmin.device.datatypes.DeviceProfile;
import ds.e0;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;
import wb2.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lil2/h;", "", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f94059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f94060b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends q implements e23.l<String, rs2.c> {
        public a(Object obj) {
            super(1, obj, h.class, "getDevice", "getDevice(Ljava/lang/String;)Lcom/garmin/gfdi/DeviceInfo;", 0);
        }

        @Override // e23.l
        public final rs2.c invoke(String str) {
            String str2 = str;
            str2.getClass();
            il2.a aVarB = ((h) this.receiver).b(str2);
            if (aVarB != null) {
                return aVarB.f94007a;
            }
            return null;
        }
    }

    public h(g gVar, e eVar) {
        this.f94059a = gVar;
        this.f94060b = eVar;
    }

    public final void a(al2.f fVar) {
        fVar.getClass();
        g gVar = this.f94059a;
        if (gVar.f94057e == null) {
            jl2.c cVar = new jl2.c(fVar, gVar.f94056d, new a(this));
            gVar.f94057e = cVar;
            Context contextM = this.f94060b.m();
            if (cVar.f203895c) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            Iterator it = cVar.f203894b.iterator();
            while (it.hasNext()) {
                intentFilter.addAction((String) it.next());
            }
            r.f().getClass();
            a7.b.registerReceiver(contextM, cVar, intentFilter, !r.f184103h.get() ? oa2.b.d(contextM) : null, null, 2);
            cVar.f203895c = true;
        }
    }

    public final il2.a b(String str) {
        g gVar = this.f94059a;
        il2.a aVar = gVar.f94055c.get(str);
        if (aVar != null) {
            return aVar;
        }
        DeviceProfile deviceProfileA = da2.d.b().a(str);
        if (deviceProfileA != null) {
            return g.a(gVar, deviceProfileA);
        }
        e0.v("No connected device ", str, g.f94051h);
        return null;
    }
}
