package com.huami.wallet.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.huami.wallet.ui.fragment.OpenBusCardFragment;
import com.huami.wallet.ui.fragment.OpenBusCardInProgressFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/wallet/ui/activity/OpenBusCardActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "onBackPressed", "Lcom/huami/wallet/ui/fragment/OpenBusCardFragment;", "c", "Lcom/huami/wallet/ui/fragment/OpenBusCardFragment;", "mFragment", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class OpenBusCardActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_BOUND_PHONE = "ARG_BOUND_PHONE";

    @NotNull
    public static final String EXTRA_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String EXTRA_BUS_CARD_IMAGE_URL = "ARG_BUS_CARD_IMAGE_URL";

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String EXTRA_XIAO_MI_CARD_NAME = "ARG_XIAO_MI_CARDNAME";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OpenBusCardFragment mFragment;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentByTag(OpenBusCardInProgressFragment.TAG) != null) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KTExtFunKt.showTitleAndNav$default(this, getIntent().getStringExtra("ARG_BUS_CARD_NAME"), (Function1) null, 2, (Object) null);
        OpenBusCardFragment openBusCardFragment = new OpenBusCardFragment();
        openBusCardFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), openBusCardFragment, OpenBusCardFragment.TAG).commit();
        this.mFragment = openBusCardFragment;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        super.onNewIntent(intent);
        this.mFragment.refreshArguments(intent.getExtras());
    }
}
