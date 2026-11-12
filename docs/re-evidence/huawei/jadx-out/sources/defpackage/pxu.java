package defpackage;

import android.content.DialogInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esimhandler.EsimHandler;

/* JADX INFO: loaded from: classes15.dex */
public class pxu extends pxo {
    @Override // defpackage.pxo, com.huawei.sim.strategy.EsimCarrierStrategy
    public void authenticate() {
        this.f45940a.f45947c = 2;
        this.d = new IBaseResponseCallback() { // from class: pxv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f45949b.c(i, obj);
            }
        };
        super.authenticate();
    }

    /* synthetic */ void c(int i, Object obj) {
        if (i == 0) {
            a();
        }
    }

    private void a() {
        if (pxk.h(this.e)) {
            c();
        } else {
            pxk.b(BaseApplication.j(), new DialogInterface.OnClickListener() { // from class: pxt
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f45948a.e(dialogInterface, i);
                }
            });
        }
    }

    /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        LogUtil.a("CuccHuaweiAkaStrategy", "showCuccNetConfirmDialog click confirm");
        if (pxk.h(this.e)) {
            c();
        } else {
            qpx.e(this.e, this.e.getResources().getString(R.string.IDS_plugin_network_unstable));
        }
    }

    private void c() {
        e();
        EsimHandler esimHandlerD = pwi.d();
        this.f45941b = esimHandlerD.getHwMultiDeviceManager();
        esimHandlerD.handle(this.f45940a);
    }
}
