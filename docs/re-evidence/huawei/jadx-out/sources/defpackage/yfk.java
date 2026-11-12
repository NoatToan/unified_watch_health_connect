package defpackage;

import android.content.Context;
import com.huawei.wear.R;
import com.huawei.wear.wallet.ui.dialog.HwDialogInterface;
import com.huawei.wear.wallet.ui.dialog.HwProgressDialogCustom;
import com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface;
import com.huawei.wear.wallet.ui.dialog.WidgetBuilder;

/* JADX INFO: loaded from: classes46.dex */
public class yfk implements WidgetBuilder.IBuilder {
    static {
        WidgetBuilder.d(new yfk());
    }

    @Override // com.huawei.wear.wallet.ui.dialog.WidgetBuilder.IBuilder
    public HwDialogInterface createDialog(Context context) {
        return new yfi(context, R.style.WalletCustomDialogTheme);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.WidgetBuilder.IBuilder
    public HwProgressDialogInterface createProgressDialog(Context context) {
        return new HwProgressDialogCustom(context, R.style.CustomDialogTheme);
    }
}
