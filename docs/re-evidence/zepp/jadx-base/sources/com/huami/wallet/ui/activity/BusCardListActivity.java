package com.huami.wallet.ui.activity;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.BusCardListActivity;
import com.huami.wallet.ui.fragment.BusCardListFragment;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.utils.WalletConst;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/wallet/ui/activity/BusCardListActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "Lkotlin/Lazy;", "g", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardListActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_PARENT_APP_CODE = "EXTRA_PARENT_APP_CODE";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX WARN: Multi-variable type inference failed */
    public BusCardListActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.activity.BusCardListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
    }

    private final NavigationController g() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BusCardListActivity busCardListActivity, View view, int i) {
        busCardListActivity.g().navigateToWeb(WalletConst.XIAO_MI_BUS_CARD_LIST, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString(EXTRA_PARENT_APP_CODE);
        KTExtFunKt.showTitleAndNav$default(this, Integer.valueOf(string == null || string.length() == 0 ? R.string.wl_add_bus_card : R.string.wl_add_bus_card_parent), (Function1) null, 2, (Object) null);
        if (NfcDeviceKt.isXiaomiDevice(NfcDeviceKt.getNfcDevice().getDeviceModel())) {
            RainbowTitleBar rainbowTitleBar = this.mTitleBar;
            rainbowTitleBar.setMenuText(R.string.wl_my_bus_cards_title);
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: tc0
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    BusCardListActivity.h(this.a, view, i);
                }
            });
            TextViewCompat.setAutoSizeTextTypeWithDefaults((TextView) rainbowTitleBar.findViewById(R.id.rainbow_menu_text), 1);
        }
        BusCardListFragment busCardListFragment = new BusCardListFragment();
        busCardListFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), busCardListFragment).commit();
    }
}
