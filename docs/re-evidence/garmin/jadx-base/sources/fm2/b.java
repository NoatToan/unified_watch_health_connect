package fm2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.garmin.android.gfdi.framework.DeviceManager;
import da2.h;
import lc.m0;
import p006l2.w2;
import rs2.i;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f72118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f72119d;

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3) {
        this.f72116a = i14;
        this.f72117b = obj;
        this.f72118c = obj2;
        this.f72119d = obj3;
    }

    @Override // k7.b
    public final void accept(Object obj) {
        switch (this.f72116a) {
            case 0:
                c cVar = (c) this.f72117b;
                bm2.a aVar = (bm2.a) this.f72118c;
                yl2.d dVar = (yl2.d) this.f72119d;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cVar.f72120a.info("Use system bonding:" + zBooleanValue + ", gdi auth enabled:" + aVar.b());
                String str = aVar.f18886a;
                str.getClass();
                da2.d.c(cVar.g()).f58886a.c(c.c(str, dVar.f197845g, dVar.f197843e, dVar.f197844f), zBooleanValue);
                break;
            case 1:
                m0 m0Var = (m0) this.f72117b;
                p51.c cVar2 = (p51.c) this.f72118c;
                Context context = (Context) this.f72119d;
                ((Intent) obj).getClass();
                m0Var.h(new w2(14), n51.b.f.INSTANCE);
                cVar2.x4(context, true);
                break;
            case 2:
                na2.c cVar3 = (na2.c) this.f72117b;
                DeviceManager deviceManager = (DeviceManager) this.f72118c;
                na2.b bVar = (na2.b) this.f72119d;
                cVar3.f125221e.info("Started GFDI device");
                deviceManager.setGfdiDevice((i) obj);
                h.b(deviceManager.getProfile());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                cVar3.f125219c.registerReceiver(bVar, intentFilter);
                break;
            default:
                s0.e eVar = (s0.e) this.f72117b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f72118c;
                Surface surface = (Surface) this.f72119d;
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                surface.release();
                eVar.f155264e--;
                eVar.d();
                break;
        }
    }
}
