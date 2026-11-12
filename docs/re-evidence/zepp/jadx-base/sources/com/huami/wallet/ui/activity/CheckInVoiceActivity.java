package com.huami.wallet.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.CheckInVoiceFragment;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.KTExtFunKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/wallet/ui/activity/CheckInVoiceActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "c", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CheckInVoiceActivity extends BaseWalletActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BusCardDetailData busCardDetailData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/wallet/ui/activity/CheckInVoiceActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceEntity", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "", "open", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void open(@NotNull Context context, @NotNull InVoiceInfo inVoiceEntity, @NotNull BusCardDetailData busCardDetailData) {
            Intent intent = new Intent(context, (Class<?>) CheckInVoiceActivity.class);
            intent.putExtra(BusConstKt.KEY_INVOICE_INFO, inVoiceEntity);
            intent.putExtra(BusConstKt.KEY_BUS_DETAIL_DATA, busCardDetailData);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<RainbowTitleBar, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(CheckInVoiceActivity checkInVoiceActivity, View view, int i) {
            if (checkInVoiceActivity.busCardDetailData.getXMiCardName() == null) {
                checkInVoiceActivity.busCardDetailData.setXMiCardName("");
            }
            checkInVoiceActivity.startActivity(new Intent(checkInVoiceActivity, (Class<?>) TradeRecordActivity.class).setFlags(536870912).setFlags(67108864).putExtra("ARG_BUS_CARD_ID", checkInVoiceActivity.busCardDetailData.getBusCardId()).putExtra("ARG_BUS_CARD_NAME", checkInVoiceActivity.busCardDetailData.getBusCardName()).putExtra("ARG_XIAO_MI_CARDNAME", checkInVoiceActivity.busCardDetailData.getXMiCardName()).putExtra("ARG_BUS_CARD_NUMBER", checkInVoiceActivity.busCardDetailData.getBusCardNumber()));
        }

        public final void b(@NotNull RainbowTitleBar rainbowTitleBar) {
            rainbowTitleBar.setMenuIcon(R.drawable.wl_add_grey);
            final CheckInVoiceActivity checkInVoiceActivity = CheckInVoiceActivity.this;
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: com.huami.wallet.ui.activity.c
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i) {
                    CheckInVoiceActivity.a.c(checkInVoiceActivity, view, i);
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
        setContentView(R.layout.activity_check_in_voice);
        KTExtFunKt.showTitleAndNav(this, Integer.valueOf(R.string.wl_service_invoice), new a());
        this.busCardDetailData = (BusCardDetailData) getIntent().getParcelableExtra(BusConstKt.KEY_BUS_DETAIL_DATA);
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), CheckInVoiceFragment.INSTANCE.newInstance((InVoiceInfo) getIntent().getParcelableExtra(BusConstKt.KEY_INVOICE_INFO))).commit();
    }
}
