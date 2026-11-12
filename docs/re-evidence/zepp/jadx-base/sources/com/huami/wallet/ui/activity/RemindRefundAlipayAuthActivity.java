package com.huami.wallet.ui.activity;

import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.RefundAlipayAuthFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/wallet/ui/activity/RemindRefundAlipayAuthActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment;", "fragment", "Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment;", "getFragment", "()Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment;", "setFragment", "(Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment;)V", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RemindRefundAlipayAuthActivity extends BaseWalletActivity {
    public RefundAlipayAuthFragment fragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RemindRefundAlipayAuthActivity remindRefundAlipayAuthActivity, View view) {
            remindRefundAlipayAuthActivity.onBackPressed();
        }

        public final void b(@NotNull RainbowTitleBar rainbowTitleBar) {
            final RemindRefundAlipayAuthActivity remindRefundAlipayAuthActivity = RemindRefundAlipayAuthActivity.this;
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.huami.wallet.ui.activity.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RemindRefundAlipayAuthActivity.a.c(remindRefundAlipayAuthActivity, view);
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

    @NotNull
    public final RefundAlipayAuthFragment getFragment() {
        RefundAlipayAuthFragment refundAlipayAuthFragment = this.fragment;
        Objects.requireNonNull(refundAlipayAuthFragment);
        return refundAlipayAuthFragment;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (RefundAlipayAuthFragment.INSTANCE.getCanBack()) {
            finish();
        }
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(new RefundAlipayAuthFragment());
        KTExtFunKt.showTitleAndNav(this, Integer.valueOf(R.string.wl_return_card), new a());
        getFragment().setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), getFragment()).commit();
    }

    public final void setFragment(@NotNull RefundAlipayAuthFragment refundAlipayAuthFragment) {
        this.fragment = refundAlipayAuthFragment;
    }
}
