package com.huami.wallet.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.OpenedBusCardsFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/huami/wallet/ui/activity/BusCardStackActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardStackActivity extends BaseWalletActivity {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public final /* synthetic */ OpenedBusCardsFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OpenedBusCardsFragment openedBusCardsFragment) {
            super(1);
            this.a = openedBusCardsFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(OpenedBusCardsFragment openedBusCardsFragment, View view, int i) {
            openedBusCardsFragment.navigateToBusCardList();
        }

        public final void b(@NotNull RainbowTitleBar rainbowTitleBar) {
            rainbowTitleBar.setMenuIcon(R.drawable.wl_add_grey);
            final OpenedBusCardsFragment openedBusCardsFragment = this.a;
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: com.huami.wallet.ui.activity.b
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    BusCardStackActivity.a.c(openedBusCardsFragment, view, i);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RainbowTitleBar rainbowTitleBar) {
            b(rainbowTitleBar);
            return Unit.INSTANCE;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OpenedBusCardsFragment openedBusCardsFragment = new OpenedBusCardsFragment();
        openedBusCardsFragment.setArguments(getIntent().getExtras());
        KTExtFunKt.showTitleAndNav(this, Integer.valueOf(R.string.wl_select_card), new a(openedBusCardsFragment));
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), openedBusCardsFragment).commit();
    }
}
