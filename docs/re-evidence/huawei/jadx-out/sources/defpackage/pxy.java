package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esimhandler.EsimChainHandler;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class pxy extends pxo {
    private EsimChainHandler g = null;

    @Override // defpackage.pxo, com.huawei.sim.strategy.EsimCarrierStrategy
    public void authenticate() {
        this.f45940a.f45947c = 1;
        pxk.f(this.e);
        this.d = new IBaseResponseCallback() { // from class: pxz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.d(i, obj);
            }
        };
        super.authenticate();
    }

    /* synthetic */ void d(int i, Object obj) {
        if (i == 0) {
            a();
        }
    }

    private void a() {
        if (pxk.h(this.e) && !pxk.i(this.e)) {
            b();
        } else {
            pxk.b(BaseApplication.j(), new DialogInterface.OnClickListener() { // from class: pxx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f45950c.c(dialogInterface, i);
                }
            });
        }
    }

    /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        LogUtil.a("ThirdAuthStrategy", "showCuccNetConfirmDialog click confirm");
        if (pxk.h(this.e)) {
            b();
        } else {
            qpx.e(this.e, this.e.getResources().getString(R.string.IDS_plugin_network_unstable));
        }
    }

    private void b() {
        e();
        EsimChainHandler esimChainHandlerB = pwi.b();
        this.g = esimChainHandlerB.getNext();
        this.f45941b = esimChainHandlerB.getTailHandler().getHwMultiDeviceManager();
        esimChainHandlerB.handle(this.f45940a);
    }

    public void a(int i, Intent intent) {
        if (i == 1099) {
            if (intent == null) {
                LogUtil.a("ThirdAuthStrategy", "CuccAgreement intent null");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("cuccAgreementAgree", false);
            LogUtil.a("ThirdAuthStrategy", "isAgreeAgreement = ", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                EsimChainHandler esimChainHandler = this.g;
                if (esimChainHandler == null) {
                    ReleaseLogUtil.a("DEVMGR_ThirdAuthStrategy", "cuccThirdAgreementHandler is null");
                    return;
                }
                EsimChainHandler next = esimChainHandler.getNext();
                if (next == null) {
                    ReleaseLogUtil.a("DEVMGR_ThirdAuthStrategy", "nextHandler is null");
                } else {
                    next.handle(this.f45940a);
                }
            }
        }
    }
}
