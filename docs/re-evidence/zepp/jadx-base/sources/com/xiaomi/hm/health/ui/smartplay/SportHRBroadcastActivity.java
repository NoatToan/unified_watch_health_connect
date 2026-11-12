package com.xiaomi.hm.health.ui.smartplay;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.smartplay.SportHRBroadcastActivity;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/SportHRBroadcastActivity;", "Lcom/xiaomi/hm/health/ui/smartplay/BaseSmartPlayActivity;", "", "w", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "open", "v", "", "msg", "E", "stringId", "z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "F", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/huami/lib/rainbow/ListTile;", "G", "Lcom/huami/lib/rainbow/ListTile;", "enableIv", "Lcom/xiaomi/hm/health/model/account/HMSportHRBroadcastConfig;", "H", "Lcom/xiaomi/hm/health/model/account/HMSportHRBroadcastConfig;", "sportHrBroadcastConfig", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", LogUtil.I, "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/xiaomi/hm/health/ui/smartplay/SportHrBroadcastViewModel;", "J", "Lcom/xiaomi/hm/health/ui/smartplay/SportHrBroadcastViewModel;", "sportHrBroadcastViewModel", "K", "Z", "isDismissByOutside", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportHRBroadcastActivity extends BaseSmartPlayActivity {

    @NotNull
    public static final String TAG = "SportHRBroadcastActivity";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private ListTile enableIv;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private HMSportHRBroadcastConfig sportHrBroadcastConfig;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final HMMiLiProDevice device;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private SportHrBroadcastViewModel sportHrBroadcastViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isDismissByOutside;

    public SportHRBroadcastActivity() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        this.device = (HMMiLiProDevice) device;
    }

    private final void A() {
        this.isDismissByOutside = true;
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.sport_heart_boradcast_alert).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: z97
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportHRBroadcastActivity.B(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.agree, new DialogInterface.OnClickListener() { // from class: aa7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SportHRBroadcastActivity.C(this.a, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ba7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SportHRBroadcastActivity.D(this.a, dialogInterface);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SportHRBroadcastActivity sportHRBroadcastActivity, DialogInterface dialogInterface, int i) {
        sportHRBroadcastActivity.isDismissByOutside = false;
        ListTile listTile = sportHRBroadcastActivity.enableIv;
        Objects.requireNonNull(listTile);
        listTile.setChecked(false);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SportHRBroadcastActivity sportHRBroadcastActivity, DialogInterface dialogInterface, int i) {
        sportHRBroadcastActivity.isDismissByOutside = false;
        sportHRBroadcastActivity.v(true);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SportHRBroadcastActivity sportHRBroadcastActivity, DialogInterface dialogInterface) {
        if (sportHRBroadcastActivity.isDismissByOutside) {
            ListTile listTile = sportHRBroadcastActivity.enableIv;
            Objects.requireNonNull(listTile);
            listTile.setChecked(false);
        }
    }

    private final void E(int msg) {
        if (this.loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(this, getString(msg));
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog3 = this.loadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    private final void v(final boolean open) {
        E(open ? R.string.dialog_starting : R.string.dialog_closing);
        this.device.enableHrBroadcast(open, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.smartplay.SportHRBroadcastActivity$handleOperation$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                if (!result) {
                    SportHRBroadcastActivity sportHRBroadcastActivity = this.a;
                    boolean z = open;
                    sportHRBroadcastActivity.z(z ? R.string.mili_setting_sleep_assist_open_failed : R.string.mili_setting_sleep_assist_close_failed, z);
                    return;
                }
                LoadingDialog loadingDialog = this.a.loadingDialog;
                if (loadingDialog != null) {
                    loadingDialog.dismiss();
                }
                HMSportHRBroadcastConfig hMSportHRBroadcastConfig = this.a.sportHrBroadcastConfig;
                Objects.requireNonNull(hMSportHRBroadcastConfig);
                hMSportHRBroadcastConfig.setEnable(open);
                if (open) {
                    HMSportHRBroadcastConfig hMSportHRBroadcastConfig2 = this.a.sportHrBroadcastConfig;
                    Objects.requireNonNull(hMSportHRBroadcastConfig2);
                    hMSportHRBroadcastConfig2.setTime(System.currentTimeMillis());
                    HMSportHRBroadcastConfig hMSportHRBroadcastConfig3 = this.a.sportHrBroadcastConfig;
                    Objects.requireNonNull(hMSportHRBroadcastConfig3);
                    hMSportHRBroadcastConfig3.setUser(HMPersonInfo.getInstance().getUserInfo().getUserid());
                }
                HMSportHRBroadcastConfig hMSportHRBroadcastConfig4 = this.a.sportHrBroadcastConfig;
                Objects.requireNonNull(hMSportHRBroadcastConfig4);
                hMSportHRBroadcastConfig4.saveAndUpload();
            }
        });
    }

    private final void w() {
        SportHrBroadcastViewModel sportHrBroadcastViewModel = (SportHrBroadcastViewModel) new ViewModelProvider(this).get(SportHrBroadcastViewModel.class);
        this.sportHrBroadcastViewModel = sportHrBroadcastViewModel;
        Objects.requireNonNull(sportHrBroadcastViewModel);
        sportHrBroadcastViewModel.getHrBroadcastLiveData().observe(this, new Observer() { // from class: da7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportHRBroadcastActivity.x(this.a, (Boolean) obj);
            }
        });
        SportHrBroadcastViewModel sportHrBroadcastViewModel2 = this.sportHrBroadcastViewModel;
        Objects.requireNonNull(sportHrBroadcastViewModel2);
        sportHrBroadcastViewModel2.load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final SportHRBroadcastActivity sportHRBroadcastActivity, Boolean bool) {
        ListTile listTile = sportHRBroadcastActivity.enableIv;
        Objects.requireNonNull(listTile);
        listTile.setChecked(bool.booleanValue());
        sportHRBroadcastActivity.sportHrBroadcastConfig = HMSportHRBroadcastConfig.INSTANCE.fromJson();
        ListTile listTile2 = sportHRBroadcastActivity.enableIv;
        Objects.requireNonNull(listTile2);
        listTile2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ca7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportHRBroadcastActivity.y(this.a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(SportHRBroadcastActivity sportHRBroadcastActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                sportHRBroadcastActivity.A();
            } else {
                sportHRBroadcastActivity.v(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int stringId, final boolean open) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(getString(stringId), 1000, new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.ui.smartplay.SportHRBroadcastActivity$setDialogFailed$1
            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(@Nullable LoadingDialog dialog) {
                ListTile listTile = this.a.enableIv;
                Objects.requireNonNull(listTile);
                listTile.setChecked(!open);
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(@Nullable LoadingDialog dialog) {
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_sport_hr_broadcast);
        setRainbowTitleText(R.string.sport_heart_boradcast);
        setSmartImageView(R.drawable.img_sport_hr_broadcast, 0);
        setSmartImageTopMargin(54.0f);
        setSmartTip(getString(R.string.sport_heart_boradcast_tips));
        ListTile listTile = (ListTile) findViewById(R.id.enable_item);
        this.enableIv = listTile;
        Objects.requireNonNull(listTile);
        listTile.setSubtitle(HMDeviceConfig.isWatch() ? R.string.enable_id_broadcast_query_msg_watch : R.string.enable_id_broadcast_query_msg);
        ListTile listTile2 = this.enableIv;
        Objects.requireNonNull(listTile2);
        listTile2.setChecked(HMSportHRBroadcastConfig.INSTANCE.fromJson().getEnable());
        w();
        setStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.smartplay.SportHRBroadcastActivity.onCreate.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                ListTile listTile3 = SportHRBroadcastActivity.this.enableIv;
                Objects.requireNonNull(listTile3);
                listTile3.setEnabled(enable);
            }
        });
    }
}
