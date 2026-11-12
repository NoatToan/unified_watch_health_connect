package bd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class t implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.c f17610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f17611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f17612c;

    public class a implements d80.b {
        public a() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.DEVICES;
            StringBuilder sb3 = new StringBuilder("Error setting device status to [");
            t tVar = t.this;
            sb3.append(tVar.f17610a);
            sb3.append("]: ");
            sb3.append(bVar.f112957a.name());
            sb3.append(", ");
            sb3.append(bVar.f112958b);
            i2.f(a2Var, "DevicePreferredActivityTrackerStatusUpdater", sb3.toString());
            if (tVar.f17612c.f17615b != null) {
                tVar.f17612c.f17615b.b(u.a.f17616a[bVar.f112957a.ordinal()] != 1 ? yl2.e.OTHER_FATAL : yl2.e.NO_INTERNET_CONNECTION);
            }
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            t tVar = t.this;
            u.c cVar = tVar.f17610a;
            u uVar = tVar.f17612c;
            if (cVar == u.c.ACTIVE) {
                ((l80.a) KoinJavaComponent.get(l80.a.class)).k(uVar.f17614a);
                u.b bVar = uVar.f17615b;
                if (bVar != null) {
                    bVar.c();
                }
            }
        }
    }

    public t(u uVar, u.c cVar, Object[] objArr) {
        this.f17612c = uVar;
        this.f17610a = cVar;
        this.f17611b = objArr;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        i2.f(a2.DEVICES, "DevicePreferredActivityTrackerStatusUpdater", "Error setting device status to [" + this.f17610a + "]: " + bVar.f112957a.name() + ", " + bVar.f112958b);
        u uVar = this.f17612c;
        if (uVar.f17615b != null) {
            uVar.f17615b.b(u.a.f17616a[bVar.f112957a.ordinal()] != 1 ? yl2.e.OTHER_FATAL : yl2.e.NO_INTERNET_CONNECTION);
        }
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        try {
            lj0.f fVar = lj0.f.f112994v;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceStatus", this.f17610a.f17619a);
            fVar.f113007i = jSONObject.toString();
            d80.f.b bVar = new d80.f.b(this.f17611b, fVar);
            bVar.f58274d = new a();
            bVar.f58275e = d80.g.NO_PARSING;
            bVar.a().b();
        } catch (Exception unused) {
            u.b bVar2 = this.f17612c.f17615b;
            if (bVar2 != null) {
                bVar2.b(yl2.e.OTHER_FATAL);
            }
        }
    }
}
