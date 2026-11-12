package com.huami.wallet.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.activity.BusCardOperationResultActivity;
import com.huami.wallet.ui.fragment.OpenBusCardInProgressFragment;
import com.huami.wallet.ui.fragment.ResultFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/activity/BusCardOperationResultActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lcom/huami/wallet/ui/fragment/ResultFragment;", "c", "Lcom/huami/wallet/ui/fragment/ResultFragment;", "mFragment", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardOperationResultActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_BUS_CARD_ID = "ARG_CARD_ID";

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "ARG_CARD_NAME";

    @NotNull
    public static final String EXTRA_EXTRA_MSG = "ARG_EXTRA_MSG";

    @NotNull
    public static final String EXTRA_IS_CHECK_RECORD = "ARG_IS_CHECK_RECORD";

    @NotNull
    public static final String EXTRA_IS_NO_TOKEN = "ARG_IS_NO_TOKEN";

    @NotNull
    public static final String EXTRA_ORDER_ID = "ARG_ORDER_ID";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ResultFragment mFragment;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BusCardOperationResultActivity busCardOperationResultActivity, View view) {
        ResultFragment resultFragment = busCardOperationResultActivity.mFragment;
        if (resultFragment == null) {
            return;
        }
        resultFragment.onBackPressed();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentByTag(OpenBusCardInProgressFragment.TAG) != null) {
            return;
        }
        this.mFragment.onBackPressed();
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("ARG_CARD_NAME");
        RainbowTitleBar rainbowTitleBar = this.mTitleBar;
        rainbowTitleBar.setTitle(stringExtra);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: kd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusCardOperationResultActivity.g(this.a, view);
            }
        });
        ResultFragment resultFragment = new ResultFragment();
        resultFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), resultFragment).commit();
        this.mFragment = resultFragment;
    }
}
