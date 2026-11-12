package com.xiaomi.hm.health.nfc;

import android.os.Bundle;
import com.huami.devicex.R;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/nfc/WalletActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WalletActivity extends BaseTitleActivity {
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        BaseTitleBarExtKt.setTitleBar$default(this, getString(R.string.app_sort_card_bag), null, 0, null, 14, null);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).add(R.id.nfc_fragment, NfcDeviceKt.isXiaomiDevice(NfcDeviceKt.getNfcDevice().getDeviceModel()) ? new WalletMiFitFragment() : new WalletFragment(), "WalletFragment").commitNowAllowingStateLoss();
    }
}
