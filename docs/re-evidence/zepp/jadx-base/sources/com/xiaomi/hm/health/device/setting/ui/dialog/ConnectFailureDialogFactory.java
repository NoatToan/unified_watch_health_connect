package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceHelperActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.dialog.ConnectFailureDialogFactory;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/dialog/ConnectFailureDialogFactory;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "title", "Landroid/view/View;", "e", "Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "viewModel", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "create", "v", "", "onClick", "a", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "dialog", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ConnectFailureDialogFactory implements View.OnClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment dialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/dialog/ConnectFailureDialogFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "getHelpType", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMDeviceType.values().length];
                iArr[HMDeviceType.MILI.ordinal()] = 1;
                iArr[HMDeviceType.SHOES.ordinal()] = 2;
                iArr[HMDeviceType.WEIGHT.ordinal()] = 3;
                iArr[HMDeviceType.HEADSET.ordinal()] = 4;
                iArr[HMDeviceType.OTHER.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int getHelpType(@NotNull HMDeviceType type) {
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return HMDeviceConfig.hasBoundWatch() ? 4 : 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
                if (i == 4) {
                    return 6;
                }
                if (i == 5) {
                    return 5;
                }
            } else if (ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(type) != HMDeviceSource.SHOES_MARS) {
                return 2;
            }
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FeatureViewModel featureViewModel, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        featureViewModel.retryConnect();
    }

    private final View e(Context context, int title) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_device_reconnect, (ViewGroup) null, false);
        ((AppCompatTextView) viewInflate.findViewById(R.id.tv_title)).setText(title);
        ((AppCompatTextView) viewInflate.findViewById(R.id.tv_help)).setOnClickListener(this);
        return viewInflate;
    }

    @JvmStatic
    public static final int getHelpType(@NotNull HMDeviceType hMDeviceType) {
        return INSTANCE.getHelpType(hMDeviceType);
    }

    @NotNull
    public final AlertDialogFragment create(@NotNull Context context, @NotNull final FeatureViewModel viewModel, int title) {
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(context).setCancelable(true).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: yy0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ConnectFailureDialogFactory.c(dialogInterface, i);
            }
        }).setPositiveButton(R.string.retry, new DialogInterface.OnClickListener() { // from class: xy0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ConnectFailureDialogFactory.d(viewModel, dialogInterface, i);
            }
        }).setContentView(e(context, title)).create();
        this.dialog = alertDialogFragmentCreate;
        return alertDialogFragmentCreate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        HMBaseDevice device;
        Integer numValueOf = v == null ? null : Integer.valueOf(v.getId());
        int i = R.id.tv_help;
        if (numValueOf == null || numValueOf.intValue() != i || (device = ManagerFunctionsKt.getDeviceManagerApi().getDevice()) == null) {
            return;
        }
        HMDeviceHelperActivity.show(v.getContext(), INSTANCE.getHelpType(device.getDeviceType()), 1);
        AlertDialogFragment alertDialogFragment = this.dialog;
        if (alertDialogFragment != null && alertDialogFragment.isShowing()) {
            alertDialogFragment.dismiss();
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_CONNECTIONFAILRETRY));
    }
}
