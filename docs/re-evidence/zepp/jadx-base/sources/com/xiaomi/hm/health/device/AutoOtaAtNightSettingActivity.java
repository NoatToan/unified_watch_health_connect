package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.AutoOtaAtNightSettingActivity;
import com.xiaomi.hm.health.device.firmware.FwCheckKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/AutoOtaAtNightSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "o", "initView", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "x", "Ljava/lang/Boolean;", "support", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AutoOtaAtNightSettingActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private final Boolean support = FwCheckKt.supportAutoOtaAtNight();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/AutoOtaAtNightSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) AutoOtaAtNightSettingActivity.class));
        }
    }

    private final void initView() {
        int i = R.id.auto_ota_at_night_switch;
        ((ListTile) findViewById(i)).setChecked(Intrinsics.areEqual(this.support, Boolean.TRUE));
        ((ListTile) findViewById(i)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AutoOtaAtNightSettingActivity.q(compoundButton, z);
            }
        });
    }

    @JvmStatic
    public static final void launch(@NotNull Context context) {
        INSTANCE.launch(context);
    }

    private final void n() {
        BTStatusFragment.newInstance(R.id.auto_ota_at_night_setting_tips_container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.AutoOtaAtNightSettingActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.MILI;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                ((FrameLayout) this.a.findViewById(R.id.auto_ota_at_night_setting_tips_container)).setVisibility(enable ? 8 : 0);
                ((ListTile) this.a.findViewById(R.id.auto_ota_at_night_switch)).setEnabled(enable);
            }
        });
    }

    private final void o() {
        ((RainbowTitleBar) findViewById(R.id.action_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: tk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoOtaAtNightSettingActivity.p(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(AutoOtaAtNightSettingActivity autoOtaAtNightSettingActivity, View view) {
        autoOtaAtNightSettingActivity.onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            FwCheckKt.setAutoOtaAtNight(z);
            if (z) {
                HMFwOnlineAnalyticsKt.systemupdateOpennightlyupdateC();
            } else {
                HMFwOnlineAnalyticsKt.systemupdateClosenightlyupdateC();
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventReminderExpandKt.setUnifyTitleStyle$default(this, BaseTitleActivity.STYLE.NONE, "", null, 4, null);
        setContentView(R.layout.activity_auto_ota_at_night_setting);
        o();
        n();
        initView();
    }
}
