package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import com.huami.account.XiaoAiTokenConvertManager;
import com.huami.account.XiaomiTokenMananger;
import com.huami.devicex.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.XiaoAiEntranceHelper$userBindXiaoMiAccountWithXiaoAiAndMiotPermission$1;
import com.xiaomi.hm.health.di.koin.imp.AccountDeviceTokenImplKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/xiaomi/hm/health/device/XiaoAiEntranceHelper$userBindXiaoMiAccountWithXiaoAiAndMiotPermission$1", "Lcom/huami/account/XiaomiTokenMananger$OnBindXiaomiCallback;", "", "onError", "", "xiaomiId", "onSuccess", "onAlreadyBind", "onUserCancel", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class XiaoAiEntranceHelper$userBindXiaoMiAccountWithXiaoAiAndMiotPermission$1 implements XiaomiTokenMananger.OnBindXiaomiCallback {
    public final /* synthetic */ XiaoAiEntranceHelper a;

    public XiaoAiEntranceHelper$userBindXiaoMiAccountWithXiaoAiAndMiotPermission$1(XiaoAiEntranceHelper xiaoAiEntranceHelper) {
        this.a = xiaoAiEntranceHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(XiaoAiEntranceHelper xiaoAiEntranceHelper, DialogInterface dialogInterface, int i) {
        xiaoAiEntranceHelper.n();
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
    public void onAlreadyBind(@NotNull String xiaomiId) {
        XiaoAiEntranceHelper xiaoAiEntranceHelper = this.a;
        String strK = xiaoAiEntranceHelper.k(R.string.speech_account_authorize_no_unique_xiaomi_account_title);
        String strK2 = this.a.k(R.string.speech_account_authorize_unique_wechat_account_login);
        String strK3 = this.a.k(R.string.speech_account_authorize_base_dialog_button_cancel_desc);
        String strK4 = this.a.k(R.string.speech_account_authorize_base_dialog_button_custom_operation_switch_account);
        final XiaoAiEntranceHelper xiaoAiEntranceHelper2 = this.a;
        xiaoAiEntranceHelper.x(strK, strK2, strK3, strK4, new DialogInterface.OnClickListener() { // from class: fz8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                XiaoAiEntranceHelper$userBindXiaoMiAccountWithXiaoAiAndMiotPermission$1.b(xiaoAiEntranceHelper2, dialogInterface, i);
            }
        });
        this.a.w();
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
    public void onError() {
        this.a.getDialogDelegate().hideLoading();
        IconToast.showError(this.a.g(), R.string.speech_account_authorize_result_fail);
        this.a.w();
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
    public void onSuccess(@NotNull String xiaomiId) {
        HMMiLiDevice hMMiLiDeviceH = this.a.h();
        XiaoAiTokenConvertManager.interceptAuth(hMMiLiDeviceH == null ? null : AccountDeviceTokenImplKt.toAuthDevice(hMMiLiDeviceH), null);
        this.a.getDialogDelegate().hideLoading();
        IconToast.showSuccess(this.a.g(), R.string.speech_account_authorize_result_success);
        if (this.a.isUpdateMiJiaAuthorizationFromPlayMiBandFlag) {
            return;
        }
        this.a.v();
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindXiaomiCallback
    public void onUserCancel() {
        this.a.getDialogDelegate().hideLoading();
        this.a.w();
    }
}
