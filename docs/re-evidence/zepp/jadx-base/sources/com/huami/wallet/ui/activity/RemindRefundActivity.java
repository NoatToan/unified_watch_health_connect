package com.huami.wallet.ui.activity;

import android.os.Bundle;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.RemindRefundFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/wallet/ui/activity/RemindRefundActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/wallet/ui/fragment/RemindRefundFragment;", "fragment", "Lcom/huami/wallet/ui/fragment/RemindRefundFragment;", "getFragment", "()Lcom/huami/wallet/ui/fragment/RemindRefundFragment;", "setFragment", "(Lcom/huami/wallet/ui/fragment/RemindRefundFragment;)V", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RemindRefundActivity extends BaseWalletActivity {
    public RemindRefundFragment fragment;

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final RemindRefundFragment getFragment() {
        RemindRefundFragment remindRefundFragment = this.fragment;
        Objects.requireNonNull(remindRefundFragment);
        return remindRefundFragment;
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(new RemindRefundFragment());
        KTExtFunKt.showTitleAndNav$default(this, Integer.valueOf(R.string.wl_return_card), (Function1) null, 2, (Object) null);
        getFragment().setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), getFragment()).commit();
    }

    public final void setFragment(@NotNull RemindRefundFragment remindRefundFragment) {
        this.fragment = remindRefundFragment;
    }
}
