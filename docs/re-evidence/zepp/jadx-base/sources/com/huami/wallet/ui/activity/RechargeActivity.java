package com.huami.wallet.ui.activity;

import android.os.Bundle;
import com.huami.wallet.ui.fragment.RechargeFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/huami/wallet/ui/activity/RechargeActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RechargeActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String EXTRA_BUS_CARD_NUMBER = "ARG_BUS_CARD_NUMBER";

    @NotNull
    public static final String EXTRA_XIAO_MI_CARD_NAME = "ARG_XIAO_MI_CARDNAME";

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KTExtFunKt.showTitleAndNav$default(this, getIntent().getStringExtra("ARG_BUS_CARD_NAME"), (Function1) null, 2, (Object) null);
        RechargeFragment rechargeFragment = new RechargeFragment();
        rechargeFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), rechargeFragment).commit();
    }
}
