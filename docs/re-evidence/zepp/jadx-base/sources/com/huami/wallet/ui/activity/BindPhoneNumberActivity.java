package com.huami.wallet.ui.activity;

import android.os.Bundle;
import com.huami.wallet.ui.fragment.BindPhoneNumberFragment;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/ui/activity/BindPhoneNumberActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "", "f", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BindPhoneNumberActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_APP_NAME = "ARG_APP_NAME";

    @NotNull
    public static final String EXTRA_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String EXTRA_BUS_CARD_IMAGE_URL = "ARG_BUS_CARD_IMAGE_URL";

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String EXTRA_BUS_XIAOMI_CARD_NAME = "ARG_BUS_XIAOMI_CARD_NAME";

    @NotNull
    public static final String EXTRA_IS_SHIFT_IN = "ARG_IS_SHIFT_IN";

    @NotNull
    public static final String EXTRA_IS_SHIFT_OUT = "ARG_IS_SHIFT_OUT";

    @NotNull
    public static final String EXTRA_PACKAGE_NAME = "ARG_PACKAGE_NAME";

    @NotNull
    public static final String EXTRA_REDIRECT_TO = "ARG_REDIRECT_TO";

    @NotNull
    public static final String EXTRA_SERVICE_CONTACT = "ARG_SERVICE_CONTACT";

    @NotNull
    public static final String EXTRA_SHIFT_IN_ORDER_ID = "ARG_SHIFT_IN_ORDER_ID";

    private final String f() {
        String stringExtra = getIntent().getStringExtra("ARG_BUS_CARD_NAME");
        return stringExtra == null ? "" : stringExtra;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KTExtFunKt.showTitleAndNav$default(this, f(), (Function1) null, 2, (Object) null);
        BindPhoneNumberFragment bindPhoneNumberFragment = new BindPhoneNumberFragment();
        bindPhoneNumberFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), bindPhoneNumberFragment).commit();
    }
}
