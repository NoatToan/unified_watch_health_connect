package com.huami.account.legal;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountProperties;
import com.huami.account.HMLoginManager;
import com.huami.account.legal.EdmServiceImpl;
import com.huami.account.service.EdmService;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.utils.TopActivityProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"Lcom/huami/account/legal/EdmServiceImpl;", "Lcom/huami/account/service/EdmService;", "", "isEdmChecked", "isAgree", "", "updateEdmStatus", "checkEdmStatus", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "shouldShowEdm", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class EdmServiceImpl implements EdmService {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface, int i) {
        AccountProperties.INSTANCE.getEdmConfirmed().set(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i) {
        AccountProperties.INSTANCE.getEdmConfirmed().set(Boolean.FALSE);
    }

    @Override // com.huami.account.service.EdmService
    public void checkEdmStatus() {
        if (!HMLoginManager.isUnInit() && shouldShowEdm(SelectAreaHelper.getAreaBySave()) && AccountProperties.INSTANCE.getEdmConfirmed().get() == null) {
            Activity activeActivity = TopActivityProvider.INSTANCE.getActiveActivity();
            FragmentActivity fragmentActivity = activeActivity instanceof FragmentActivity ? (FragmentActivity) activeActivity : null;
            if (fragmentActivity == null) {
                return;
            }
            new AlertDialogFragment.Builder(fragmentActivity).setTitle(R.string.account_ui_audit_title).setMessage(R.string.account_ui_edm_register_content).setPositiveButton(R.string.account_ui_agree, new DialogInterface.OnClickListener() { // from class: bk1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    EdmServiceImpl.c(dialogInterface, i);
                }
            }).setNegativeButton(R.string.account_ui_cancel, new DialogInterface.OnClickListener() { // from class: ak1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    EdmServiceImpl.d(dialogInterface, i);
                }
            }).show(fragmentActivity.getSupportFragmentManager());
        }
    }

    @Override // com.huami.account.service.EdmService
    public boolean isEdmChecked() {
        if (HMLoginManager.isUnInit()) {
            return false;
        }
        return Intrinsics.areEqual(AccountProperties.INSTANCE.getEdmConfirmed().get(), Boolean.TRUE);
    }

    @Override // com.huami.account.service.EdmService
    public boolean shouldShowEdm(@Nullable Area area) {
        return (!AccountExternalsKt.getConfigDelegate().enableEdmFeature() || SelectAreaHelper.isUnknown(area) || SelectAreaHelper.isCN(area) || SelectAreaHelper.isUS(area)) ? false : true;
    }

    @Override // com.huami.account.service.EdmService
    public void updateEdmStatus(boolean isAgree) {
        if (HMLoginManager.isUnInit()) {
            return;
        }
        AccountProperties.INSTANCE.getEdmConfirmed().set(Boolean.valueOf(isAgree));
    }
}
