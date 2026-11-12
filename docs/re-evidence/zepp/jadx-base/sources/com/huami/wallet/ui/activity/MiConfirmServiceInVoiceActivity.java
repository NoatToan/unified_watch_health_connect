package com.huami.wallet.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.MiConfirmServiceInVoiceFragment;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/huami/wallet/ui/activity/MiConfirmServiceInVoiceActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiConfirmServiceInVoiceActivity extends BaseWalletActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¨\u0006\u0010"}, d2 = {"Lcom/huami/wallet/ui/activity/MiConfirmServiceInVoiceActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "inVoiceAmount", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceDetailData", "busCardIdConfirm", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "version", "", "open", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void open(@NotNull Context context, @NotNull String inVoiceAmount, @NotNull InVoiceInfo inVoiceDetailData, @NotNull String busCardIdConfirm, @NotNull BusCardDetailData busCardDetailData, @Nullable String version) {
            Intent intent = new Intent(context, (Class<?>) MiConfirmServiceInVoiceActivity.class);
            intent.putExtra(BusConstKt.KEY_INVOICE_AMOUNT, inVoiceAmount);
            intent.putExtra(BusConstKt.KEY_INVOICE_INFO, inVoiceDetailData);
            intent.putExtra(BusConstKt.KEY_BUS_ID, busCardIdConfirm);
            intent.putExtra(BusConstKt.KEY_INVOICE_VERSION, version);
            intent.putExtra(BusConstKt.KEY_BUS_DETAIL_DATA, busCardDetailData);
            context.startActivity(intent);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_confirm_service_in_voice);
        KTExtFunKt.showTitleAndNav$default(this, Integer.valueOf(R.string.wl_invoice_title_confirm), (Function1) null, 2, (Object) null);
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), MiConfirmServiceInVoiceFragment.INSTANCE.newInstance((InVoiceInfo) getIntent().getParcelableExtra(BusConstKt.KEY_INVOICE_INFO), getIntent().getStringExtra(BusConstKt.KEY_INVOICE_AMOUNT), getIntent().getStringExtra(BusConstKt.KEY_BUS_ID), (BusCardDetailData) getIntent().getParcelableExtra(BusConstKt.KEY_BUS_DETAIL_DATA), getIntent().getStringExtra(BusConstKt.KEY_INVOICE_VERSION))).commit();
    }
}
