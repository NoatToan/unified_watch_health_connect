package com.huami.wallet.ui.activity;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.fragment.RefundResultFragment;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/wallet/ui/activity/RefundResultActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "Lkotlin/Lazy;", "f", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "result", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RefundResultActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String EXTRA_ERROR_MEG = "EXTRA_ERROR_MEG";

    @NotNull
    public static final String EXTRA_ORDER_NUMBER = "EXTRA_ORDER_NUMBER";

    @NotNull
    public static final String EXTRA_RESULT = "EXTRA_RESULT";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Integer result;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RefundResultActivity refundResultActivity, View view) {
            refundResultActivity.onBackPressed();
        }

        public final void b(@NotNull RainbowTitleBar rainbowTitleBar) {
            final RefundResultActivity refundResultActivity = RefundResultActivity.this;
            rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.huami.wallet.ui.activity.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RefundResultActivity.a.c(refundResultActivity, view);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RainbowTitleBar rainbowTitleBar) {
            b(rainbowTitleBar);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefundResultActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = null == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.activity.RefundResultActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        this.result = 0;
    }

    private final NavigationController f() {
        return (NavigationController) this.navigationController.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Integer num = this.result;
        boolean z = false;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            super.onBackPressed();
            return;
        }
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
            z = true;
        }
        if (z) {
            f().closePreviousPages();
        } else {
            f().closePreviousPages();
        }
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KTExtFunKt.showTitleAndNav(this, getIntent().getStringExtra("ARG_BUS_CARD_NAME"), new a());
        RefundResultFragment refundResultFragment = new RefundResultFragment();
        refundResultFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), refundResultFragment).commit();
    }
}
