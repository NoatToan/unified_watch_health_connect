package defpackage;

import android.content.Context;
import com.miui.circulate.api.exception.CirculateException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class vj4 extends a72 {
    public h4q d;

    @Override // defpackage.trc
    public void b(dy6 dy6Var) throws CirculateException {
        try {
            i();
        } catch (Exception e) {
            tpe.d("ControllerService", "stopDiscovery: ", e);
        }
    }

    @Override // defpackage.trc
    public void c(dy6 dy6Var, Executor executor) throws CirculateException {
    }

    @Override // defpackage.b14
    public hyc e(int i) throws CirculateException {
        if (!d()) {
            throw new CirculateException("getServiceController error, client not available, please init first");
        }
        if (i == 327680 || i == 327681) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.b14
    public int f() {
        return 327680;
    }

    @Override // defpackage.d52, defpackage.b14
    public void g(Context context, zw3 zw3Var, String str) {
        tpe.b("ControllerService", true, "clientInstall");
        super.g(context, zw3Var, str);
    }

    public final void i() {
    }

    @Override // defpackage.b14
    public void init() {
        tpe.f("ControllerService", "start init");
        this.d = new h4q(this.f15093a);
        h(true);
        this.f15094b.c(327680);
    }

    @Override // defpackage.b14
    public void release() {
        if (this.d != null && d()) {
            this.d.c();
        }
        h(false);
    }
}
