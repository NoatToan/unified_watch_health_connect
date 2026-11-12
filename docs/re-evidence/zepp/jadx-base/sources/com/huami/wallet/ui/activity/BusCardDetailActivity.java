package com.huami.wallet.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.BusCardDetailFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/ui/activity/BusCardDetailActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/content/Intent;", "intent", "", "needAddEndButton", "", "f", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onNewIntent", "Lcom/huami/wallet/ui/fragment/BusCardDetailFragment;", "fragment", "Lcom/huami/wallet/ui/fragment/BusCardDetailFragment;", "getFragment", "()Lcom/huami/wallet/ui/fragment/BusCardDetailFragment;", "setFragment", "(Lcom/huami/wallet/ui/fragment/BusCardDetailFragment;)V", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardDetailActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_APPNAME = "EXTRA_APPNAME";

    @NotNull
    public static final String EXTRA_EXPAND_CARD_ID = "EXTRA_EXPAND_CARD_ID";

    @NotNull
    public static final String EXTRA_EXPAND_CARD_IMG_URL = "EXTRA_EXPAND_CARD_IMG_URL";

    @NotNull
    public static final String EXTRA_EXPAND_CARD_NAME = "EXTRA_EXPAND_CARD_NAME";

    @NotNull
    public static final String EXTRA_EXPAND_CARD_SHIFTENABLE = "EXTRA_EXPAND_CARD_SHIFTENABLE";

    @NotNull
    public static final String EXTRA_EXPAND_XIAOMI_CARD_NAME = "EXTRA_EXPAND_XIAOMI_CARD_NAME";

    @NotNull
    public static final String EXTRA_PACKAGENAME = "EXTRA_PACKAGENAME";

    @NotNull
    public static final String EXTRA_REDIRECTTO = "EXTRA_REDIRECTTO";

    @NotNull
    public static final String EXTRA_SERVICECONTACT = "EXTRA_SERVICECONTACT";
    public BusCardDetailFragment fragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(BusCardDetailActivity busCardDetailActivity, View view, int i) {
            busCardDetailActivity.getFragment().navigateToBusCardList();
        }

        public final void b(@NotNull RainbowTitleBar rainbowTitleBar) {
            rainbowTitleBar.setMenuIcon(R.drawable.wl_add_grey);
            final BusCardDetailActivity busCardDetailActivity = BusCardDetailActivity.this;
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: com.huami.wallet.ui.activity.a
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    BusCardDetailActivity.a.c(busCardDetailActivity, view, i);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RainbowTitleBar rainbowTitleBar) {
            b(rainbowTitleBar);
            return Unit.INSTANCE;
        }
    }

    private final void f(Intent intent, boolean needAddEndButton) {
        Bundle extras;
        String string = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            string = extras.getString(EXTRA_EXPAND_CARD_NAME);
        }
        KTExtFunKt.showTitleAndNav(this, string, new a());
    }

    public static /* synthetic */ void g(BusCardDetailActivity busCardDetailActivity, Intent intent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        busCardDetailActivity.f(intent, z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final BusCardDetailFragment getFragment() {
        BusCardDetailFragment busCardDetailFragment = this.fragment;
        Objects.requireNonNull(busCardDetailFragment);
        return busCardDetailFragment;
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragment(new BusCardDetailFragment());
        g(this, getIntent(), false, 2, null);
        getFragment().setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), getFragment()).commit();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        getFragment().parseArguments(intent == null ? null : intent.getExtras(), Boolean.TRUE);
        f(intent, false);
    }

    public final void setFragment(@NotNull BusCardDetailFragment busCardDetailFragment) {
        this.fragment = busCardDetailFragment;
    }
}
