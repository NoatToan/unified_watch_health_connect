package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import com.huami.account.XiaomiTokenMananger;
import com.huami.devicex.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.device.XiaoAiEntranceHelper$startRequestAccountInfo$1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/hm/health/device/XiaoAiEntranceHelper$startRequestAccountInfo$1", "Lcom/huami/account/XiaomiTokenMananger$OnBindInfoCallback;", "", "onError", "onGetBindStatusError", "", "xiaomiId", "onXiaomiLogin", "onBoundXiaomiLogin", "onUnboundXiaomiLogin", "onNotSupportXiaomiBind", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class XiaoAiEntranceHelper$startRequestAccountInfo$1 implements XiaomiTokenMananger.OnBindInfoCallback {
    public final /* synthetic */ XiaoAiEntranceHelper a;

    public XiaoAiEntranceHelper$startRequestAccountInfo$1(XiaoAiEntranceHelper xiaoAiEntranceHelper) {
        this.a = xiaoAiEntranceHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(XiaoAiEntranceHelper xiaoAiEntranceHelper, DialogInterface dialogInterface, int i) {
        xiaoAiEntranceHelper.n();
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
    public void onBoundXiaomiLogin(@NotNull String xiaomiId) {
        this.a.B(xiaomiId);
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
    public void onError() {
        this.a.getDialogDelegate().hideLoading();
        IconToast.showError(this.a.g(), R.string.speech_account_authorize_result_fail);
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
    public void onGetBindStatusError() {
        this.a.getDialogDelegate().hideLoading();
        IconToast.showError(this.a.g(), R.string.speech_account_authorize_result_fail);
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
    public void onNotSupportXiaomiBind() {
        XiaoAiEntranceHelper xiaoAiEntranceHelper = this.a;
        String strK = xiaoAiEntranceHelper.k(R.string.speech_account_authorize_no_unique_xiaomi_account_title);
        String strK2 = this.a.k(R.string.speech_account_authorize_illegal_account_type_login);
        String strK3 = this.a.k(R.string.speech_account_authorize_base_dialog_button_cancel_desc);
        String strK4 = this.a.k(R.string.speech_account_authorize_base_dialog_button_custom_operation_switch_account);
        final XiaoAiEntranceHelper xiaoAiEntranceHelper2 = this.a;
        xiaoAiEntranceHelper.x(strK, strK2, strK3, strK4, new DialogInterface.OnClickListener() { // from class: ez8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                XiaoAiEntranceHelper$startRequestAccountInfo$1.b(xiaoAiEntranceHelper2, dialogInterface, i);
            }
        });
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
    public void onUnboundXiaomiLogin() {
        this.a.C();
    }

    @Override // com.huami.account.XiaomiTokenMananger.OnBindInfoCallback
    public void onXiaomiLogin(@NotNull String xiaomiId) {
        this.a.B(xiaomiId);
    }
}
