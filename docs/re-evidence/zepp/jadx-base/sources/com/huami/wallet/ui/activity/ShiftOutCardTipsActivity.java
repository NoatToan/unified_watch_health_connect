package com.huami.wallet.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.ShiftOutTipsFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/huami/wallet/ui/activity/ShiftOutCardTipsActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftOutCardTipsActivity extends BaseWalletActivity {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ShiftOutCardTipsActivity shiftOutCardTipsActivity, View view) {
            shiftOutCardTipsActivity.onBackPressed();
        }

        public final void b(@NotNull RainbowTitleBar rainbowTitleBar) {
            final ShiftOutCardTipsActivity shiftOutCardTipsActivity = ShiftOutCardTipsActivity.this;
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.huami.wallet.ui.activity.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShiftOutCardTipsActivity.a.c(shiftOutCardTipsActivity, view);
                }
            });
            rainbowTitleBar.setStatusBarMode(ShiftOutCardTipsActivity.this);
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
        KTExtFunKt.showTitleAndNav(this, Integer.valueOf(R.string.wl_r_shift_out_tile), new a());
        ShiftOutTipsFragment shiftOutTipsFragment = new ShiftOutTipsFragment();
        shiftOutTipsFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(getContentViewId(), shiftOutTipsFragment, ShiftOutTipsFragment.TAG).commitAllowingStateLoss();
    }
}
