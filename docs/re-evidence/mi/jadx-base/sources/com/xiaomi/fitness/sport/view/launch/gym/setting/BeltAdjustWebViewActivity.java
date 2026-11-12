package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.utils.Constants;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a6l;
import defpackage.av6;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.eu6;
import defpackage.gs9;
import defpackage.xri;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0006*\u00015\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b8\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0004R\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\nR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0016R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0016R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/BeltAdjustWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "", "setListener", "()V", "initSettingList", "setAdjustMode", "", StatConstants.PARAM_START, "startAdjust", "(Z)V", "", "timeInMilli", "getTZOffsetInMilli", "(J)J", "setAdjustBtnText", "showCountDownDialog", "dismissGymDialog", "initView", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "isBeltAdjust", "Z", "()Z", "setBeltAdjust", "Landroid/widget/Button;", "adjustBtn", "Landroid/widget/Button;", "doingAdjust", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "Lgs9;", "gymSettings", "[Lgs9;", "gymSetting", "Lgs9;", "Landroid/view/View;", "bottomView", "Landroid/view/View;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "gymDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "fromBackDialog", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "sportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "getSportStateCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "setSportStateCaller", "(Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;)V", "isConnect", "com/xiaomi/fitness/sport/view/launch/gym/setting/BeltAdjustWebViewActivity$deviceStateChangedListener$1", "deviceStateChangedListener", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/BeltAdjustWebViewActivity$deviceStateChangedListener$1;", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
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
    private WearableDeviceModel deviceModel;
    private boolean doingAdjust;
    private boolean fromBackDialog;

    @Nullable
    private CommonDialog<?> gymDialog;

    @Nullable
    private gs9 gymSetting;

    @Nullable
    private gs9[] gymSettings;
    private boolean isBeltAdjust;
    private boolean isConnect;

    @NotNull
    private ISportRemoteState sportStateCaller = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);

    @NotNull
    private final BeltAdjustWebViewActivity$deviceStateChangedListener$1 deviceStateChangedListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity$deviceStateChangedListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
            if (TextUtils.equals(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null)) {
                Logger.i("BeltAdjustWebViewActivity", "onConnectSuccess " + did);
                this.this$0.isConnect = true;
            }
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
            if (TextUtils.equals(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null)) {
                Logger.i("BeltAdjustWebViewActivity", "onDisconnect " + did);
                this.this$0.isConnect = false;
                CommonDialog commonDialogCreate = new CommonDialog.c("").setDialogTitle(c1j.p0).setDialogDescription(c1j.o0).setPositiveText(c1j.common_known).create();
                final BeltAdjustWebViewActivity beltAdjustWebViewActivity = this.this$0;
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity$deviceStateChangedListener$1$onDisconnect$1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        if (which == -1) {
                            Intrinsics.checkNotNullExpressionValue(new SportRequestData.a().x(4).o(), "build(...)");
                            beltAdjustWebViewActivity.finish();
                        }
                    }
                });
                commonDialogCreate.showIfNeed(this.this$0.getSupportFragmentManager());
            }
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/BeltAdjustWebViewActivity$Companion;", "", "<init>", "()V", "TAG", "", "DEBUG_ON", "", "DEBUG_OFF", StatConstants.PARAM_START, "", "title", "showTitleBar", "", "model", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissGymDialog() {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2 = this.gymDialog;
        if (commonDialog2 == null || !commonDialog2.isShowing() || (commonDialog = this.gymDialog) == null) {
            return;
        }
        commonDialog.dismissAllowingStateLoss();
    }

    private final long getTZOffsetInMilli(long timeInMilli) {
        return TimeZone.getDefault().getOffset(timeInMilli);
    }

    private final void initSettingList() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            DeviceModelExtKt.getGYMSettings(wearableDeviceModel, new eu6<gs9[]>() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity.initSettingList.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new BeltAdjustWebViewActivity$initSettingList$1$onError$1(BeltAdjustWebViewActivity.this, null));
                }

                @Override // defpackage.eu6
                public void onResult(gs9[] result) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new BeltAdjustWebViewActivity$initSettingList$1$onResult$1(BeltAdjustWebViewActivity.this, result, null));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdjustBtnText() {
        Button button = this.adjustBtn;
        if (button != null) {
            button.setText(this.doingAdjust ? c1j.V4 : c1j.O4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdjustMode() {
        gs9 gs9Var = this.gymSetting;
        if (gs9Var == null) {
            Logger.e(TAG, "gymSetting is null");
            return;
        }
        Intrinsics.checkNotNull(gs9Var);
        gs9[] gs9VarArr = {gs9Var};
        boolean z = this.doingAdjust;
        if (z) {
            startAdjust(!z);
            ToastUtil.INSTANCE.showToast(c1j.W4);
        } else {
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            if (wearableDeviceModel != null) {
                DeviceModelExtKt.setGYMSettings(wearableDeviceModel, gs9VarArr, new eu6<Boolean>() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity.setAdjustMode.1
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        Logger.i(BeltAdjustWebViewActivity.TAG, "setGYMSettings: " + errorCode);
                        ToastUtil.INSTANCE.showToast(c1j.common_hint_device_busy);
                    }

                    @Override // defpackage.eu6
                    public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                        onResult(bool.booleanValue());
                    }

                    public void onResult(boolean result) {
                        Logger.i(BeltAdjustWebViewActivity.TAG, "setGYMSettings: " + result);
                        if (!result) {
                            ToastUtil.INSTANCE.showToast(c1j.common_hint_device_busy);
                            return;
                        }
                        BeltAdjustWebViewActivity beltAdjustWebViewActivity = BeltAdjustWebViewActivity.this;
                        beltAdjustWebViewActivity.startAdjust(!beltAdjustWebViewActivity.doingAdjust);
                        BeltAdjustWebViewActivity.this.showCountDownDialog();
                    }
                });
            }
        }
    }

    private final void setListener() {
        a6l.a(this.adjustBtn, new bg4() { // from class: fi2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BeltAdjustWebViewActivity.setListener$lambda$0(this.f17803a, obj);
            }
        });
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, eoi.j, getString(c1j.c), new View.OnClickListener() { // from class: gi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeltAdjustWebViewActivity.setListener$lambda$1(this.f19016a, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(BeltAdjustWebViewActivity this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = this$0.deviceModel;
        if (wearableDeviceModel == null || !(wearableDeviceModel == null || wearableDeviceModel.isDeviceConnected())) {
            ToastUtil.INSTANCE.showToast(c1j.j);
            return;
        }
        if (GymDeviceModel.INSTANCE.triggerGymLock(this$0, this$0.gymSettings)) {
            return;
        }
        if (this$0.doingAdjust) {
            gs9 gs9Var = this$0.gymSetting;
            if (gs9Var != null) {
                gs9Var.d = 0;
            }
        } else {
            gs9 gs9Var2 = this$0.gymSetting;
            if (gs9Var2 != null) {
                gs9Var2.d = 1;
            }
        }
        this$0.setAdjustMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(BeltAdjustWebViewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCountDownDialog() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (Intrinsics.areEqual((wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel(), "ksmb.treadmill.m1v1")) {
            View viewInflate = LayoutInflater.from(this).inflate(dvi.p, (ViewGroup) null);
            if (this.gymDialog == null) {
                CommonDialog<?> commonDialogCreate = new CommonDialog.c("gym").setCustomView(viewInflate).setCanceledOnTouchOutside(false).create();
                this.gymDialog = commonDialogCreate;
                if (commonDialogCreate != null) {
                    commonDialogCreate.setCancelable(false);
                }
                ((TextView) viewInflate.findViewById(xri.b4)).setOnClickListener(new View.OnClickListener() { // from class: ei2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BeltAdjustWebViewActivity.showCountDownDialog$lambda$2(this.f16666a, view);
                    }
                });
            }
            CommonDialog<?> commonDialog = this.gymDialog;
            if (commonDialog != null) {
                commonDialog.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCountDownDialog$lambda$2(BeltAdjustWebViewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startAdjust(false);
        this$0.dismissGymDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public final void startAdjust(boolean start) {
        final SportRequestData sportRequestDataO;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = getTZOffsetInMilli(jCurrentTimeMillis);
        if (start) {
            SportRequestData.a aVar = new SportRequestData.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            sportRequestDataO = aVar.B(jCurrentTimeMillis, timeUnit).D(tZOffsetInMilli, timeUnit).z(3).u(true).x(1).q(true).o();
            Intrinsics.checkNotNull(sportRequestDataO);
        } else {
            SportRequestData.a aVar2 = new SportRequestData.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            sportRequestDataO = aVar2.B(jCurrentTimeMillis, timeUnit2).D(tZOffsetInMilli, timeUnit2).z(3).u(true).x(4).q(true).o();
            Intrinsics.checkNotNull(sportRequestDataO);
        }
        ISportRemoteState iSportRemoteState = this.sportStateCaller;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        iSportRemoteState.startSport(wearableDeviceModel.getDid(), sportRequestDataO, new RequestCallback() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity.startAdjust.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                boolean z = responseCode == 0;
                if (!z && !BeltAdjustWebViewActivity.this.doingAdjust) {
                    ToastUtil.INSTANCE.showToast(c1j.o);
                }
                Logger.i("BeltAdjustWebViewActivityisSet = " + z, new Object[0]);
                Logger.i("BeltAdjustWebViewActivityorigin doing = " + BeltAdjustWebViewActivity.this.doingAdjust, new Object[0]);
                BeltAdjustWebViewActivity beltAdjustWebViewActivity = BeltAdjustWebViewActivity.this;
                beltAdjustWebViewActivity.doingAdjust = z != beltAdjustWebViewActivity.doingAdjust;
                Logger.i("BeltAdjustWebViewActivityfinal doing = " + BeltAdjustWebViewActivity.this.doingAdjust, new Object[0]);
                BeltAdjustWebViewActivity.this.dismissGymDialog();
                BeltAdjustWebViewActivity.this.setAdjustBtnText();
                if (BeltAdjustWebViewActivity.this.fromBackDialog) {
                    BeltAdjustWebViewActivity.this.fromBackDialog = false;
                    BeltAdjustWebViewActivity.this.finish();
                }
                String str = String.format("BeltAdjustWebViewActivitysportState: %s, sportResponseData: %s", Integer.valueOf(sportRequestDataO.sportState), sportRequestDataO);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Logger.i(str, new Object[0]);
            }
        });
    }

    @NotNull
    public final ISportRemoteState getSportStateCaller() {
        return this.sportStateCaller;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        this.isBeltAdjust = true;
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.deviceStateChangedListener);
        this.sportStateCaller.addSportStateChangedListener(BeltAdjustWebViewActivity.class, new ISportStateChangedListener() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity.initView.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportFinished(boolean validSport, byte[] ids, FinishSportData finishSportData) {
                Logger.i(BeltAdjustWebViewActivity.TAG, "onSportFinished: " + validSport + " " + ids);
                BeltAdjustWebViewActivity.this.doingAdjust = false;
                BeltAdjustWebViewActivity.this.setAdjustBtnText();
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportPaused() {
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportRestarted() {
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportSegment(int i, int i2) {
                ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
                Logger.i(BeltAdjustWebViewActivity.TAG, "onSportStarted: " + sportType + " " + sportLaunchType);
                BeltAdjustWebViewActivity.this.doingAdjust = false;
                BeltAdjustWebViewActivity.this.setAdjustBtnText();
            }

            @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
            public void preSport() {
                ISportStateChangedListener.DefaultImpls.preSport(this);
            }
        });
        this.deviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        View view = null;
        View viewInflate = LayoutInflater.from(this).inflate(dvi.B0, (ViewGroup) null, false);
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
        Button button = (Button) view.findViewById(xri.K);
        this.adjustBtn = button;
        if (button != null) {
            button.setText(c1j.O4);
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
        CommonDialog commonDialogCreate = new CommonDialog.c(BroadcastsKt.SILENT_PUSHING_STOP).setDialogTitle(c1j.V4).setDialogDescription(c1j.q0).setPositiveText(c1j.common_exit).setNegativeText(c1j.f).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity.onBackPressed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    BeltAdjustWebViewActivity.this.setAdjustMode();
                    BeltAdjustWebViewActivity.this.fromBackDialog = true;
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.isBeltAdjust = false;
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.deviceStateChangedListener);
        this.sportStateCaller.removeSportStateChangedListener(BeltAdjustWebViewActivity.class);
    }

    public final void setBeltAdjust(boolean z) {
        this.isBeltAdjust = z;
    }

    public final void setSportStateCaller(@NotNull ISportRemoteState iSportRemoteState) {
        Intrinsics.checkNotNullParameter(iSportRemoteState, "<set-?>");
        this.sportStateCaller = iSportRemoteState;
    }
}
