package defpackage;

import android.content.Context;
import com.huawei.ui.commonui.dialog.AchieveDialogFactory;
import com.huawei.ui.commonui.dialog.BaseAchieveDialog;
import com.huawei.ui.commonui.dialog.DialogResourcesListener;

/* JADX INFO: loaded from: classes16.dex */
public class qkr extends BaseAchieveDialog {
    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public byte generateAllTextViewLayoutFlags() {
        return (byte) 0;
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void onAnimSizeMeasured(int i, int i2) {
    }

    public qkr(Context context, AchieveDialogFactory.DialogType dialogType, DialogResourcesListener dialogResourcesListener) {
        super(context, dialogType, dialogResourcesListener);
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public String toString() {
        return "ThreeLeafAchieveDialog";
    }
}
