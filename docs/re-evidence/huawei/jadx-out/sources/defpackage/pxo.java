package defpackage;

import android.content.Context;
import android.os.Handler;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.esimhandler.EsimHandler;
import com.huawei.sim.strategy.EsimCarrierStrategy;

/* JADX INFO: loaded from: classes15.dex */
public class pxo implements EsimCarrierStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected pxp f45940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ocr f45941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Handler f45942c;
    protected IBaseResponseCallback d;
    protected Context e;
    protected Runnable h;

    @Override // com.huawei.sim.strategy.EsimCarrierStrategy
    public void init(Context context, Handler handler) {
        LogUtil.a("EsimBaseStrategy", " init");
        this.f45942c = handler;
        this.e = context;
    }

    @Override // com.huawei.sim.strategy.EsimCarrierStrategy
    public void setRequest(pxp pxpVar) {
        this.f45940a = pxpVar;
        this.h = pxpVar.m;
    }

    public void e() {
        Runnable runnable = this.h;
        if (runnable == null) {
            return;
        }
        HandlerExecutor.b(runnable);
    }

    @Override // com.huawei.sim.strategy.EsimCarrierStrategy
    public void authenticate() {
        this.f45940a.f45946b = this.e;
        this.f45940a.f = this.f45942c;
        this.f45940a.n = pxk.a(this.e);
        this.f45940a.j = npz.b().h();
        if (this.d != null) {
            b();
        }
    }

    private void b() {
        final String[] strArrD = pxk.d();
        if (!lsg.d(this.e, strArrD)) {
            LogUtil.j("EsimBaseStrategy", "no permission, need to request");
            xjt.q("no permission, need to request.");
            lsg.a(BaseApplication.j(), strArrD, new PermissionsResultAction() { // from class: pxo.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("EsimBaseStrategy", "PermissionsResultAction onGranted: ", strArrD[0]);
                    pxo.this.d.a(0, null);
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.j("EsimBaseStrategy", "PermissionsResultAction onDenied: ", str);
                    pxo.this.d.a(-1, null);
                }
            });
        } else {
            LogUtil.a("EsimBaseStrategy", "have permissions: ", strArrD[0]);
            this.d.a(0, null);
        }
    }

    @Override // com.huawei.sim.strategy.EsimCarrierStrategy
    public void getEsimStatus() {
        EsimHandler esimHandlerC = pwi.c();
        esimHandlerC.setHwMultiDeviceManager(this.f45941b);
        e();
        esimHandlerC.handle(this.f45940a);
    }

    @Override // com.huawei.sim.strategy.EsimCarrierStrategy
    public void activateEsim() {
        EsimHandler esimHandlerA = pwi.a();
        esimHandlerA.setHwMultiDeviceManager(this.f45941b);
        e();
        esimHandlerA.handle(this.f45940a);
    }

    @Override // com.huawei.sim.strategy.EsimCarrierStrategy
    public void deactivateEsim() {
        EsimHandler esimHandlerE = pwi.e();
        esimHandlerE.setHwMultiDeviceManager(this.f45941b);
        e();
        esimHandlerE.handle(this.f45940a);
    }
}
