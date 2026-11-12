package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.URIUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.IssuerFragment;

/* JADX INFO: loaded from: classes9.dex */
public class sl3 extends dld {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f33751k;
    public final boolean l;
    public final String m;

    public sl3(IssuerFragment issuerFragment, String str, boolean z, String str2) {
        this.f33751k = str;
        this.f15656a = issuerFragment;
        this.l = z;
        this.m = str2;
    }

    @Override // defpackage.itc
    public boolean a(boolean z) {
        return true;
    }

    @Override // defpackage.itc
    public void b(Intent intent) {
    }

    @Override // defpackage.dld
    public void i() {
        dld.b bVar = this.c;
        if (bVar != null) {
            bVar.onStart();
        }
        jz6 jz6Var = this.d;
        if (jz6Var != null && !jz6Var.isDisposed()) {
            this.d.dispose();
        }
        ltg.c().u(5, 0, URIUtils.getBrandID(this.f33751k));
        this.d = s3q.f0().A0(this.f33751k, this.l, this.m).O(new bg4() { // from class: ql3
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f31617a.u((BaseResponse) obj);
            }
        }, new bg4() { // from class: rl3
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f32657a.k((Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void k(Throwable th) throws Exception {
        dld.b bVar = this.c;
        if (bVar != null) {
            bVar.onFinished(new BaseResponse(-2, fmg.c(th), new Object[0]));
        }
    }

    @Override // defpackage.dld
    public void n(boolean z, int i, String str, IssuerResult issuerResult) {
        Pair pair;
        super.n(z, i, str, issuerResult);
        if (z) {
            vqg.d("mailboxId:" + URIUtils.getMailboxID(this.f33751k) + "  shareUrl:" + this.f33751k);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                vqg.d("issue success so clear did and mailboxId");
                NfcPreference.setCarDeviceName("");
                NfcPreference.setCarDeviceId("");
                NfcPreference.setCarMailboxId(wearableDeviceModel.getDid(), "");
            }
            ltg.c().s(5, 1);
            this.f15656a.getHandler().sendEmptyMessage(60);
            return;
        }
        ltg.c().s(5, 2);
        vqg.d("mailboxId:" + URIUtils.getMailboxID(this.f33751k) + "  shareUrl:" + this.f33751k);
        if (this.f15656a.getActivity() == null) {
            return;
        }
        if (i == 2) {
            pair = new Pair(Integer.valueOf(i), AppUtil.getApp().getString(o0j.H0));
        } else if (i != 22022) {
            switch (i) {
                case 22012:
                case 22013:
                case 22014:
                    pair = new Pair(Integer.valueOf(i), AppUtil.getApp().getString(o0j.I0));
                    break;
                default:
                    pair = new Pair(Integer.valueOf(i), AppUtil.getApp().getString(o0j.K0));
                    break;
            }
        } else {
            pair = new Pair(Integer.valueOf(i), AppUtil.getApp().getString(o0j.J0));
        }
        this.f15656a.getHandler().obtainMessage(70, pair).sendToTarget();
    }

    public final /* synthetic */ void u(BaseResponse baseResponse) throws Exception {
        dld.b bVar = this.c;
        if (bVar != null) {
            bVar.onFinished(baseResponse);
        }
    }
}
