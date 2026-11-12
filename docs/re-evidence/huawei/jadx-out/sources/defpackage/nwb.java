package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.CallbackBetweenIndoorEquipServiceAndActivity;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.ui.commonui.base.BaseActivity;

/* JADX INFO: loaded from: classes11.dex */
public class nwb implements CallbackBetweenIndoorEquipServiceAndActivity {
    private boolean d;
    private Handler e;

    public nwb(BaseActivity baseActivity, Handler handler, boolean z) {
        this.e = handler;
        this.d = z;
    }

    private void e(int i, boolean z) {
        Handler handler = this.e;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = i;
            messageObtainMessage.obj = Boolean.valueOf(z);
            this.e.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.indoorequip.CallbackBetweenIndoorEquipServiceAndActivity
    public void onNewEvent(int i, boolean z) {
        if (this.d) {
            LogUtil.a("Track_IDEQ_ImpForCallbackIndoorEquip", "onNewEvent event = ", Integer.valueOf(i), " isFlag = ", Boolean.valueOf(z));
            e(i, z);
        }
    }

    @Override // com.huawei.indoorequip.CallbackBetweenIndoorEquipServiceAndActivity
    public void onNewEvent(int i, QrCodeOrNfcInfo qrCodeOrNfcInfo) {
        if (this.d) {
            LogUtil.a("Track_IDEQ_ImpForCallbackIndoorEquip", "onNewEvent QRCodeOrNFCInfo ");
            Handler handler = this.e;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = i;
                messageObtainMessage.obj = qrCodeOrNfcInfo;
                this.e.sendMessage(messageObtainMessage);
            }
        }
    }

    @Override // com.huawei.indoorequip.CallbackBetweenIndoorEquipServiceAndActivity
    public void onNewEvent(int i) {
        if (this.d) {
            LogUtil.a("Track_IDEQ_ImpForCallbackIndoorEquip", "onNewEvent newEvent = ", Integer.valueOf(i));
            Handler handler = this.e;
            if (handler != null) {
                handler.sendEmptyMessage(i);
            }
        }
    }

    public void b(boolean z) {
        this.d = z;
    }
}
