package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.utils.Constants;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a6l;
import defpackage.av6;
import defpackage.bg4;
import defpackage.e1j;
import defpackage.eu6;
import defpackage.fs9;
import defpackage.fvi;
import defpackage.zri;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0006*\u0001/\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b2\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\nR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0014R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/BeltAdjustWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "", "setListener", "()V", "initSettingList", "setAdjustMode", "", StatConstants.PARAM_START, "startAdjust", "(Z)V", "", "timeInMilli", "getTZOffsetInMilli", "(J)J", "setAdjustBtnText", "initView", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "isBeltAdjust", "Z", "()Z", "setBeltAdjust", "Landroid/widget/Button;", "adjustBtn", "Landroid/widget/Button;", "doingAdjust", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "Lfs9;", "gymSettings", "[Lfs9;", "gymSetting", "Lfs9;", "Landroid/view/View;", "bottomView", "Landroid/view/View;", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteState;)V", "isConnect", "com/xiaomi/fitness/sport_eco/view/launch/gym/setting/BeltAdjustWebViewActivity$deviceStateChangedListener$1", "deviceStateChangedListener", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/BeltAdjustWebViewActivity$deviceStateChangedListener$1;", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BeltAdjustWebViewActivity extends Hilt_BeltAdjustWebViewActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEBUG_OFF = 0;
    private static final int DEBUG_ON = 1;

    @NotNull
    private static final String TAG = "BeltAdjustWebViewActivity";

    @Nullable
    private Button adjustBtn;
    private View bottomView;

    @Nullable
    private EcoDeviceModel deviceModel;
    private boolean doingAdjust;

    @Nullable
    private fs9 gymSetting;

    @Nullable
    private fs9[] gymSettings;
    private boolean isBeltAdjust;
    private boolean isConnect;

    @NotNull
    private IEcoSportRemoteState sportStateCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE);

    @NotNull
    private final BeltAdjustWebViewActivity$deviceStateChangedListener$1 deviceStateChangedListener = new OnEcoDeviceStatusListener() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity$deviceStateChangedListener$1
        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
            Intrinsics.checkNotNullParameter(mac, "mac");
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectStart(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectSuccess(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            EcoDeviceModel ecoDeviceModel = this.this$0.deviceModel;
            if (TextUtils.equals(did, ecoDeviceModel != null ? ecoDeviceModel.getDid() : null)) {
                Logger.i("BeltAdjustWebViewActivity", "onConnectSuccess " + did);
                this.this$0.isConnect = true;
            }
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onDisconnect(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            EcoDeviceModel ecoDeviceModel = this.this$0.deviceModel;
            if (TextUtils.equals(did, ecoDeviceModel != null ? ecoDeviceModel.getDid() : null)) {
                Logger.i("BeltAdjustWebViewActivity", "onDisconnect " + did);
                this.this$0.isConnect = false;
                CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(e1j.I).setDialogDescription(e1j.H).setPositiveText(e1j.common_known).create();
                final BeltAdjustWebViewActivity beltAdjustWebViewActivity = this.this$0;
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity$deviceStateChangedListener$1$onDisconnect$1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        if (which == -1) {
                            Intrinsics.checkNotNullExpressionValue(new SportRequestData.a().p(4).j(), "build(...)");
                            beltAdjustWebViewActivity.finish();
                        }
                    }
                });
                commonDialogCreate.showIfNeed(this.this$0.getSupportFragmentManager());
            }
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/BeltAdjustWebViewActivity$Companion;", "", "<init>", "()V", "TAG", "", "DEBUG_ON", "", "DEBUG_OFF", StatConstants.PARAM_START, "", "title", "showTitleBar", "", "model", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            companion.start(str, z, str2);
        }

        public final void start(@Nullable String title, boolean showTitleBar, @NotNull String model) {
            Intrinsics.checkNotNullParameter(model, "model");
            String beltAdjustUrl = Constants.INSTANCE.getBeltAdjustUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model);
            Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) BeltAdjustWebViewActivity.class);
            intent.putExtra(WebViewActivity.TITLE, title);
            intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, showTitleBar);
            intent.putExtra("URL", beltAdjustUrl);
            intent.setFlags(268435456);
            ApplicationExtKt.getApplication().startActivity(intent);
        }
    }

    private final long getTZOffsetInMilli(long timeInMilli) {
        return TimeZone.getDefault().getOffset(timeInMilli);
    }

    private final void initSettingList() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel != null) {
            EcoDeviceModelExtKt.getGYMSettings(ecoDeviceModel, new eu6<fs9[]>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity.initSettingList.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new BeltAdjustWebViewActivity$initSettingList$1$onError$1(BeltAdjustWebViewActivity.this, null));
                }

                @Override // defpackage.eu6
                public void onResult(fs9[] result) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new BeltAdjustWebViewActivity$initSettingList$1$onResult$1(BeltAdjustWebViewActivity.this, result, null));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdjustBtnText() {
        Button button = this.adjustBtn;
        if (button != null) {
            button.setText(this.doingAdjust ? e1j.w4 : e1j.r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdjustMode() {
        fs9 fs9Var = this.gymSetting;
        Intrinsics.checkNotNull(fs9Var);
        fs9[] fs9VarArr = {fs9Var};
        boolean z = this.doingAdjust;
        if (z) {
            startAdjust(!z);
            ToastUtil.INSTANCE.showToast(e1j.x4);
        } else {
            EcoDeviceModel ecoDeviceModel = this.deviceModel;
            if (ecoDeviceModel != null) {
                EcoDeviceModelExtKt.setGYMSettings(ecoDeviceModel, fs9VarArr, new eu6<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity.setAdjustMode.1
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        Logger.i(BeltAdjustWebViewActivity.TAG, "setGYMSettings: " + errorCode);
                        ToastUtil.INSTANCE.showToast(e1j.common_hint_device_busy);
                    }

                    @Override // defpackage.eu6
                    public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                        onResult(bool.booleanValue());
                    }

                    public void onResult(boolean result) {
                        Logger.i(BeltAdjustWebViewActivity.TAG, "setGYMSettings: " + result);
                        if (!result) {
                            ToastUtil.INSTANCE.showToast(e1j.common_hint_device_busy);
                        } else {
                            BeltAdjustWebViewActivity beltAdjustWebViewActivity = BeltAdjustWebViewActivity.this;
                            beltAdjustWebViewActivity.startAdjust(!beltAdjustWebViewActivity.doingAdjust);
                        }
                    }
                });
            }
        }
    }

    private final void setListener() {
        a6l.a(this.adjustBtn, new bg4() { // from class: di2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BeltAdjustWebViewActivity.setListener$lambda$0(this.f15543a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(BeltAdjustWebViewActivity this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceModel ecoDeviceModel = this$0.deviceModel;
        if (ecoDeviceModel == null || !(ecoDeviceModel == null || ecoDeviceModel.isDeviceConnected())) {
            ToastUtil.INSTANCE.showToast(e1j.f);
            return;
        }
        if (GymDeviceModel.INSTANCE.triggerGymLock(this$0, this$0.gymSettings)) {
            return;
        }
        if (this$0.doingAdjust) {
            fs9 fs9Var = this$0.gymSetting;
            Intrinsics.checkNotNull(fs9Var);
            fs9Var.d = 0;
        } else {
            fs9 fs9Var2 = this$0.gymSetting;
            Intrinsics.checkNotNull(fs9Var2);
            fs9Var2.d = 1;
        }
        this$0.setAdjustMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @SuppressLint({"WrongConstant"})
    public final void startAdjust(boolean start) {
        final SportRequestData sportRequestDataJ;
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        int iHashCode = key_gym_local_sport_type.hashCode();
        int i = 3;
        if (iHashCode != -1798122615) {
            if (iHashCode != -1454035281) {
                if (iHashCode == 1396900280) {
                    key_gym_local_sport_type.equals("ksmb.treadmill.m1v1");
                }
            } else if (key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                i = 7;
            }
        } else if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
            i = 7;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = getTZOffsetInMilli(jCurrentTimeMillis);
        if (start) {
            SportRequestData.a aVar = new SportRequestData.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            sportRequestDataJ = aVar.u(jCurrentTimeMillis, timeUnit).w(tZOffsetInMilli, timeUnit).s(i).n(true).p(1).l(true).j();
            Intrinsics.checkNotNull(sportRequestDataJ);
        } else {
            SportRequestData.a aVar2 = new SportRequestData.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            sportRequestDataJ = aVar2.u(jCurrentTimeMillis, timeUnit2).w(tZOffsetInMilli, timeUnit2).s(i).n(true).p(4).l(true).j();
            Intrinsics.checkNotNull(sportRequestDataJ);
        }
        IEcoSportRemoteState iEcoSportRemoteState = this.sportStateCaller;
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        Intrinsics.checkNotNull(ecoDeviceModel);
        iEcoSportRemoteState.startSport(ecoDeviceModel.getDid(), sportRequestDataJ, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity.startAdjust.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                boolean z = responseCode == 0;
                Logger.i("BeltAdjustWebViewActivityisSet = " + z, new Object[0]);
                Logger.i("BeltAdjustWebViewActivityorigin doing = " + BeltAdjustWebViewActivity.this.doingAdjust, new Object[0]);
                BeltAdjustWebViewActivity beltAdjustWebViewActivity = BeltAdjustWebViewActivity.this;
                beltAdjustWebViewActivity.doingAdjust = z != beltAdjustWebViewActivity.doingAdjust;
                Logger.i("BeltAdjustWebViewActivityfinal doing = " + BeltAdjustWebViewActivity.this.doingAdjust, new Object[0]);
                BeltAdjustWebViewActivity.this.setAdjustBtnText();
                String str = String.format("BeltAdjustWebViewActivitysportState: %s, sportResponseData: %s", Integer.valueOf(sportRequestDataJ.sportState), sportRequestDataJ);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Logger.i(str, new Object[0]);
            }
        });
    }

    @NotNull
    public final IEcoSportRemoteState getSportStateCaller() {
        return this.sportStateCaller;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        this.isBeltAdjust = true;
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(this.deviceStateChangedListener);
        this.sportStateCaller.addSportStateChangedListener(BeltAdjustWebViewActivity.class, new ISportStateChangedListener() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity.initView.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void onSportFinished(boolean validSport, byte[] ids) {
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void onSportPaused() {
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void onSportRestarted() {
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void onSportRested() {
                ISportStateChangedListener.DefaultImpls.onSportRested(this);
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void onSportShutdown() {
                ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
                Logger.i(BeltAdjustWebViewActivity.TAG, "onSportStarted: " + sportType + " " + sportLaunchType);
                BeltAdjustWebViewActivity.this.doingAdjust = false;
                BeltAdjustWebViewActivity.this.setAdjustBtnText();
            }

            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
            public void preSport() {
                ISportStateChangedListener.DefaultImpls.preSport(this);
            }
        });
        this.deviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        View view = null;
        View viewInflate = LayoutInflater.from(this).inflate(fvi.E, (ViewGroup) null, false);
        this.bottomView = viewInflate;
        if (viewInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomView");
            viewInflate = null;
        }
        showBottomView(viewInflate);
        View view2 = this.bottomView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomView");
        } else {
            view = view2;
        }
        Button button = (Button) view.findViewById(zri.q);
        this.adjustBtn = button;
        if (button != null) {
            button.setText(e1j.r4);
        }
        setListener();
        initSettingList();
    }

    /* JADX INFO: renamed from: isBeltAdjust, reason: from getter */
    public final boolean getIsBeltAdjust() {
        return this.isBeltAdjust;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (!this.doingAdjust) {
            finish();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c(BroadcastsKt.SILENT_PUSHING_STOP).setDialogTitle(e1j.w4).setDialogDescription(e1j.J).setPositiveText(e1j.common_exit).setNegativeText(e1j.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    BeltAdjustWebViewActivity.this.setAdjustMode();
                    BeltAdjustWebViewActivity.this.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.isBeltAdjust = false;
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this.deviceStateChangedListener);
        this.sportStateCaller.removeSportStateChangedListener(BeltAdjustWebViewActivity.class);
    }

    public final void setBeltAdjust(boolean z) {
        this.isBeltAdjust = z;
    }

    public final void setSportStateCaller(@NotNull IEcoSportRemoteState iEcoSportRemoteState) {
        Intrinsics.checkNotNullParameter(iEcoSportRemoteState, "<set-?>");
        this.sportStateCaller = iEcoSportRemoteState;
    }
}
