package com.xiaomi.hm.health.bodyfat.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.EraseScaleHistoryDataActivity;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceConnectionEvent;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0004H\u0014R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/EraseScaleHistoryDataActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroidx/fragment/app/Fragment;", "fragment", "", com.google.android.exoplayer2.text.ttml.b.r, "o", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bodyfat/event/BFDeviceConnectionEvent;", "event", "onEventMainThread", "onDestroy", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "x", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "disconnectDialog", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class EraseScaleHistoryDataActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment disconnectDialog;

    private final void o() {
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        if (device != null && device.isConnected()) {
            p(new EraseScaleHistoryDataFragment());
        } else {
            p(new WeightConnectingFragment());
            BFCallback.getHMDeviceManager().createDevice(hMDeviceType);
        }
    }

    private final void p(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.erase_container, fragment).commitAllowingStateLoss();
    }

    private final synchronized void q() {
        if (this.disconnectDialog != null) {
            return;
        }
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: po1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EraseScaleHistoryDataActivity.r(this.a, dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: oo1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EraseScaleHistoryDataActivity.s(this.a, dialogInterface, i);
            }
        }).setMessage(R.string.retry_connect_weight).setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qo1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                EraseScaleHistoryDataActivity.t(this.a, dialogInterface);
            }
        }).create();
        alertDialogFragmentCreate.show(getSupportFragmentManager());
        this.disconnectDialog = alertDialogFragmentCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EraseScaleHistoryDataActivity eraseScaleHistoryDataActivity, DialogInterface dialogInterface, int i) {
        eraseScaleHistoryDataActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EraseScaleHistoryDataActivity eraseScaleHistoryDataActivity, DialogInterface dialogInterface, int i) {
        eraseScaleHistoryDataActivity.setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(eraseScaleHistoryDataActivity, R.color.pale_grey_two), true);
        eraseScaleHistoryDataActivity.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EraseScaleHistoryDataActivity eraseScaleHistoryDataActivity, DialogInterface dialogInterface) {
        eraseScaleHistoryDataActivity.disconnectDialog = null;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE);
        setContentView(R.layout.activity_erase_scale_history_data);
        o();
        BFCallback.getInstance().eventBusConnect(true);
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        BFCallback.getInstance().eventBusConnect(false);
    }

    public final void onEventMainThread(@NotNull BFDeviceConnectionEvent event) {
        if (event.getDeviceType() != HMDeviceType.WEIGHT) {
            return;
        }
        if (event.isConnected()) {
            p(new EraseScaleHistoryDataFragment());
        } else if (event.isDisconnected() || event.isConnectingTimeout()) {
            q();
        }
    }
}
