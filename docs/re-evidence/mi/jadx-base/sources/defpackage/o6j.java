package defpackage;

import android.view.KeyEvent;
import com.duokan.airkan.common.AirkanException;
import com.duokan.airkan.rc_sdk.airkan.AirkanService;

/* JADX INFO: loaded from: classes4.dex */
public class o6j implements qwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h6j f28794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28795b;
    public AirkanService.d c;

    public o6j(String str) {
        this.f28795b = str;
        h6j h6jVar = new h6j(str);
        this.f28794a = h6jVar;
        h6jVar.u(this);
        this.f28794a.start();
    }

    @Override // defpackage.qwc
    public void a(int i, int i2, String str) {
        jpe.f("RCManagerV2", "onDisconnected：" + str);
        AirkanService.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.a(new ae4(str, i2), null);
    }

    @Override // defpackage.qwc
    public void b(int i, cpq cpqVar) {
        jpe.f("RCManagerV2", "onVersionResponse version:" + cpqVar.b());
        if (cpqVar.b() > 16777984) {
            jpe.f("RCManagerV2", "支持加密0");
        } else {
            jpe.f("RCManagerV2", "不支持加密0");
        }
    }

    @Override // defpackage.qwc
    public void c(int i, byte b2, xsl xslVar) {
        jpe.f("RCManagerV2", "onSendKeyResponse:" + xslVar.c());
        jkk.a aVarB = xzd.c().b(i);
        if (aVarB != null) {
            aVarB.a(xslVar.b(), xslVar.c());
        }
    }

    @Override // defpackage.qwc
    public void d(ae4 ae4Var) {
        AirkanService.d dVar = this.c;
        if (dVar != null) {
            dVar.c(ae4Var);
        }
    }

    @Override // defpackage.qwc
    public void e() {
        jpe.f("RCManagerV2", "onConnecting");
        jpe.a("RCManagerV2", "connecting notify");
        AirkanService.d dVar = this.c;
        if (dVar == null) {
            jpe.b("RCManagerV2", "video event listener is not available, ignore");
        } else {
            dVar.b();
        }
    }

    public void f(String str, int i) {
        this.f28794a.i("", this.f28795b, str, i);
    }

    public void g() {
        jpe.f("RCManagerV2", "disconnect");
        this.f28794a.v();
        this.f28794a.j();
    }

    public String h() {
        h6j h6jVar = this.f28794a;
        if (h6jVar != null) {
            return h6jVar.l();
        }
        return null;
    }

    public boolean i() {
        return this.f28794a.m();
    }

    public boolean j() {
        h6j h6jVar = this.f28794a;
        if (h6jVar == null) {
            return false;
        }
        h6jVar.n();
        return false;
    }

    public void k() {
        h6j h6jVar = this.f28794a;
        if (h6jVar != null) {
            h6jVar.B();
            this.f28794a = null;
        }
    }

    public int l(KeyEvent keyEvent, String str) throws AirkanException {
        jpe.d("RCManagerV2", "sendKey enter");
        if (keyEvent == null) {
            throw new AirkanException("key event can not be null");
        }
        if (this.f28794a == null) {
            jpe.b("RCManagerV2", "sendKey, Service not bounded. call DeviceManager.open() first and wait for onOpened().");
            throw new AirkanException("sendKey, Service not bounded. call DeviceManager.open() first and wait for onOpened().");
        }
        jpe.f("RCManagerV2", "to send key - " + keyEvent.getAction());
        jpe.h("RCManagerV2", "to send extra - " + str);
        int iY = this.f28794a.y(0, keyEvent, str);
        jpe.f("RCManagerV2", "sendkey result:" + iY);
        return iY;
    }

    @Override // defpackage.qwc
    public void onConnected() {
        jpe.h("RCManagerV2", "onConnected");
        AirkanService.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.onConnected();
    }

    public void setRCEventListener(AirkanService.d dVar) {
        this.c = dVar;
    }
}
