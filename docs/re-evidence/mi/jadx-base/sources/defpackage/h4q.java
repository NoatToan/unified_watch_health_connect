package defpackage;

import android.content.Context;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;

/* JADX INFO: loaded from: classes.dex */
public class h4q implements hyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19690a;

    public class a implements ikk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f19691a;

        public a(b bVar) {
            this.f19691a = bVar;
        }

        @Override // defpackage.ikk
        public void a(int i) {
            if (i == ae4.e.a()) {
                tpe.f("TvController", "disconnected by user,errorCode = " + i);
                return;
            }
            tpe.f("TvController", "connect fail errorCode =" + i);
            this.f19691a.onFinish(i);
        }

        @Override // defpackage.ikk
        public void isHighVersionCallback(boolean z) {
            tpe.f("TvController", "isHighVersionCallback " + z);
            this.f19691a.isHighVersionCallback(z);
        }

        @Override // defpackage.ikk
        public void onAuthenticationChange(boolean z) {
            tpe.f("TvController", "onAuthenticationChange " + z);
            this.f19691a.onAuthenticationChange(z);
        }

        @Override // defpackage.ikk
        public void onConnectSuccess() {
            tpe.f("TvController", "connect success");
            this.f19691a.onFinish(0);
        }
    }

    public interface b {
        void isHighVersionCallback(boolean z);

        void onAuthenticationChange(boolean z);

        void onFinish(int i);
    }

    public h4q(Context context) {
        this.f19690a = context;
        tpe.a("TvController", "RCSDKManager.init");
        q6j.m().o(context);
        q6j.m().n().j(false);
    }

    public void a() {
        tpe.f("TvController", "back");
        q6j.m().n().a();
    }

    public void b(CirculateDeviceInfo circulateDeviceInfo, String str, b bVar) {
        tpe.f("TvController", "connect ip =" + tpe.e(circulateDeviceInfo.f.get("default")));
        q6j.m().j(circulateDeviceInfo.f.get("default"), circulateDeviceInfo.c, str, new a(bVar));
    }

    public void c() {
        tpe.f("TvController", "destroy");
        q6j.m().k();
    }

    public void d() {
        tpe.f("TvController", "disConnect");
        q6j.m().l();
    }

    public void e(boolean z) {
        tpe.f("TvController", "down");
        q6j.m().n().b(z);
    }

    public void f() {
        tpe.f("TvController", "home");
        q6j.m().n().c();
    }

    public void g(boolean z) {
        tpe.f("TvController", "left");
        q6j.m().n().d(z);
    }

    public void h() {
        tpe.f("TvController", "menu");
        q6j.m().n().e();
    }

    public void i() {
        tpe.f("TvController", SNSAuthProvider.VALUE_SNS_OK);
        q6j.m().n().f();
    }

    public void j() {
        tpe.f("TvController", "power");
        q6j.m().n().g();
    }

    public void k(boolean z) {
        tpe.f("TvController", TSMAuthContants.PARAM_KEY_RIGHT);
        q6j.m().n().h(z);
    }

    public void l(boolean z) {
        tpe.f("TvController", "up");
        q6j.m().n().l(z);
    }

    public void m(boolean z) {
        tpe.f("TvController", "volumeDown");
        q6j.m().n().m(z);
    }

    public void n(boolean z) {
        tpe.f("TvController", "volumeUp");
        q6j.m().n().n(z);
    }
}
