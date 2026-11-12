package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.electronic.scale.WeightGuideActivity;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper;
import com.xiaomi.fitness.electronic.scale.util.ScalePageUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import defpackage.av1;
import defpackage.av6;
import defpackage.gui;
import defpackage.ld8;
import defpackage.qgi;
import defpackage.u7r;
import defpackage.uno;
import defpackage.vw7;
import defpackage.wc0;
import defpackage.ww7;
import defpackage.zk0;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT_GUIDE)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u0010.\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%R$\u00101\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010 \u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010\"R\u0016\u0010I\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\"R\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010O\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010V¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WeightGuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/WeightGuideViewModel;", "Lzk0;", "", "initView", "()V", "setupAnimation", "initDeviceModel", "checkConnected", "showConnectFailedDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "event", "onEcoPacketEvent", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "", "featureId", "Landroid/view/MenuItem;", "item", "", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onBackPressed", "", "TAG", "Ljava/lang/String;", "isInBackground", "Z", "()Z", "setInBackground", "(Z)V", "mDid", "getMDid", "()Ljava/lang/String;", "setMDid", "(Ljava/lang/String;)V", "mGuideType", "getMGuideType", "setMGuideType", "mFromBind", "getMFromBind", "setMFromBind", "mMac", "getMMac", "setMMac", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "Landroid/view/animation/Animation;", "circleAnimation", "Landroid/view/animation/Animation;", "getCircleAnimation", "()Landroid/view/animation/Animation;", "setCircleAnimation", "(Landroid/view/animation/Animation;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "startTime", "J", "isShowConnectedFailedDialog", "hasShowConnectedFailedDialog", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "mDeviceStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeightGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightGuideActivity.kt\ncom/xiaomi/fitness/electronic/scale/WeightGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,313:1\n1#2:314\n*E\n"})
public final class WeightGuideActivity extends Hilt_WeightGuideActivity<WeightGuideViewModel, zk0> {

    @Nullable
    private Animation circleAnimation;

    @Nullable
    private CommonDialog<DialogParams> dialog;
    private volatile boolean hasShowConnectedFailedDialog;
    private volatile boolean isShowConnectedFailedDialog;

    @Nullable
    private EcoDeviceModel mDeviceModel;

    @Nullable
    private String mDid;
    private boolean mFromBind;

    @Nullable
    private String mGuideType;

    @Nullable
    private String mMac;

    @NotNull
    private final String TAG = "WeightGuideActivity";
    private boolean isInBackground = true;

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());
    private long startTime = -1;

    @Nullable
    private OnEcoDeviceStatusListener mDeviceStatusListener = new OnEcoDeviceStatusListener() { // from class: com.xiaomi.fitness.electronic.scale.WeightGuideActivity$mDeviceStatusListener$1
        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(this.this$0.TAG, "onConnectFailure did  " + did + ", errorCode  " + errorCode + " , retryTimes : " + retryTimes);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectStart(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(this.this$0.TAG, "onConnectStart did  " + did);
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onConnectSuccess(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(this.this$0.TAG, "onConnectSuccess did  " + did);
            CommonDialog<DialogParams> dialog = this.this$0.getDialog();
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            CommonDialog<DialogParams> dialog2 = this.this$0.getDialog();
            Intrinsics.checkNotNull(dialog2);
            dialog2.dismiss();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
        public void onDisconnect(String did, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Logger.e(this.this$0.TAG, "onDisconnect did  " + did);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkConnected() {
        EcoDeviceModel ecoDeviceModel;
        if (this.hasShowConnectedFailedDialog || (ecoDeviceModel = this.mDeviceModel) == null || ecoDeviceModel.isDeviceConnected() || this.isShowConnectedFailedDialog) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        Logger.i("checkConnected disTime : " + jCurrentTimeMillis, new Object[0]);
        if (jCurrentTimeMillis >= SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION) {
            showConnectFailedDialog();
        } else {
            this.handler.postDelayed(new Runnable() { // from class: rfr
                @Override // java.lang.Runnable
                public final void run() {
                    WeightGuideActivity.checkConnected$lambda$4(this.f32508a);
                }
            }, 2100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkConnected$lambda$4(WeightGuideActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkConnected();
    }

    private final void initDeviceModel() {
        String str = this.mDid;
        EcoDeviceModel ecoDeviceModel = str != null ? (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(str) : null;
        this.mDeviceModel = ecoDeviceModel;
        if (ecoDeviceModel != null && ecoDeviceModel.isDeviceConnected()) {
            Logger.i(this.TAG, "initDeviceModel isDeviceConnected");
            return;
        }
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str2 = this.mDid;
        Intrinsics.checkNotNull(str2);
        ecoDeviceManagerExtKt.connectDevice(str2);
        this.startTime = System.currentTimeMillis();
        this.handler.postDelayed(new Runnable() { // from class: sfr
            @Override // java.lang.Runnable
            public final void run() {
                WeightGuideActivity.initDeviceModel$lambda$3(this.f33599a);
            }
        }, 2100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initDeviceModel$lambda$3(WeightGuideActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkConnected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        ((zk0) getMBinding()).D.setVisibility(0);
        this.mGuideType = getIntent().getStringExtra("electronic_weight_type");
        this.mDid = getIntent().getStringExtra("did");
        this.mFromBind = getIntent().getBooleanExtra(ElectronicScaleManagerExtKt.PARAM_FROM_BIND, false);
        this.mMac = getIntent().getStringExtra("mac");
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        ImageView ivWeightGuide = ((zk0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(ivWeightGuide, "ivWeightGuide");
        electronicScaleManagerExtKt.loadImageFromNet(ivWeightGuide, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_WEIGHT_GUIDE, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_WEIGHT_GUIDE_NIGHT);
        WeightGuideViewModel weightGuideViewModel = (WeightGuideViewModel) getMViewModel();
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        weightGuideViewModel.reWeight(str);
        if (Intrinsics.areEqual(WeightActivity.WEIGHT_TYPE_VISITOR, this.mGuideType)) {
            ((WeightGuideViewModel) getMViewModel()).setNickName(getIntent().getStringExtra(WeightActivity.KEY_WEIGHT_NICK_NAME));
            ((WeightGuideViewModel) getMViewModel()).setSex(getIntent().getIntExtra("electronic_weight_sex", 0));
            ((WeightGuideViewModel) getMViewModel()).setBirthday(getIntent().getStringExtra(WeightActivity.KEY_WEIGHT_BIRTHDAY));
            ((WeightGuideViewModel) getMViewModel()).setHeight(getIntent().getIntExtra("electronic_weight_height", 0));
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setTitle(getString(zzi.I5) + "-" + ((WeightGuideViewModel) getMViewModel()).getNickName());
            }
            Logger.i("VisitorMeasure VisitorWeightGuideActivity nickname: " + ((WeightGuideViewModel) getMViewModel()).getNickName() + "  sex: " + ((WeightGuideViewModel) getMViewModel()).getSex() + " birthday: " + ((WeightGuideViewModel) getMViewModel()).getBirthday() + " height: " + ((WeightGuideViewModel) getMViewModel()).getHeight() + " did: " + this.mDid, new Object[0]);
            WeightGuideViewModel weightGuideViewModel2 = (WeightGuideViewModel) getMViewModel();
            String str2 = this.mDid;
            Intrinsics.checkNotNull(str2);
            WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
            String birthday = ((WeightGuideViewModel) getMViewModel()).getBirthday();
            Intrinsics.checkNotNull(birthday);
            int age = weightInfoUtil.getAge(weightInfoUtil.parseDate(birthday));
            int sex = ((WeightGuideViewModel) getMViewModel()).getSex();
            int height = ((WeightGuideViewModel) getMViewModel()).getHeight();
            String nickName = ((WeightGuideViewModel) getMViewModel()).getNickName();
            Intrinsics.checkNotNull(nickName);
            weightGuideViewModel2.sendVisitorData(str2, age, sex, height, nickName);
        } else {
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null) {
                miuiActionBar2.setTitle(getString(zzi.U5));
            }
        }
        OnEcoDeviceStatusListener onEcoDeviceStatusListener = this.mDeviceStatusListener;
        if (onEcoDeviceStatusListener != null) {
            EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(onEcoDeviceStatusListener);
        }
        initDeviceModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupAnimation() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, qgi.f31505a);
        this.circleAnimation = animationLoadAnimation;
        Intrinsics.checkNotNull(animationLoadAnimation);
        animationLoadAnimation.setRepeatCount(-1);
        ((zk0) getMBinding()).E.startAnimation(this.circleAnimation);
    }

    private final void showConnectFailedDialog() {
        this.isShowConnectedFailedDialog = true;
        this.hasShowConnectedFailedDialog = true;
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        ecoDeviceManagerExtKt.disconnectDevice(str);
        EcoApiCallManager ecoApiCallManager = EcoApiCallManager.INSTANCE.get();
        String str2 = this.mDid;
        Intrinsics.checkNotNull(str2);
        ecoApiCallManager.destroyEcoCall(str2);
        if (this.dialog == null) {
            this.dialog = new CommonDialog.c("guide_connected_failed").setDialogTitle(zzi.K0).setDialogDescription(zzi.M0).setNeutralText(zzi.E0).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.WeightGuideActivity.showConnectFailedDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        WeightGuideActivity.this.isShowConnectedFailedDialog = false;
                        WeightGuideActivity.this.startTime = System.currentTimeMillis();
                        EcoDeviceManager ecoDeviceManagerExtKt2 = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
                        String mDid = WeightGuideActivity.this.getMDid();
                        Intrinsics.checkNotNull(mDid);
                        ecoDeviceManagerExtKt2.connectDevice(mDid);
                        WeightGuideActivity.this.checkConnected();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            });
        }
        CommonDialog<DialogParams> commonDialog = this.dialog;
        Intrinsics.checkNotNull(commonDialog);
        if (commonDialog.isShowing()) {
            return;
        }
        CommonDialog<DialogParams> commonDialog2 = this.dialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.show(getSupportFragmentManager(), "");
    }

    @Nullable
    public final Animation getCircleAnimation() {
        return this.circleAnimation;
    }

    @Nullable
    public final CommonDialog<DialogParams> getDialog() {
        return this.dialog;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.y;
    }

    @Nullable
    public final String getMDid() {
        return this.mDid;
    }

    public final boolean getMFromBind() {
        return this.mFromBind;
    }

    @Nullable
    public final String getMGuideType() {
        return this.mGuideType;
    }

    @Nullable
    public final String getMMac() {
        return this.mMac;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    /* JADX INFO: renamed from: isInBackground, reason: from getter */
    public final boolean getIsInBackground() {
        return this.isInBackground;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        super.lambda$onCreate$0();
        if (this.mFromBind) {
            String str = this.mDid;
            Intrinsics.checkNotNull(str);
            String str2 = this.mMac;
            Intrinsics.checkNotNull(str2);
            ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity(this, str, str2, false);
        }
        finish();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_WeightGuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ld8.c().p(this);
        initView();
        setupAnimation();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_WeightGuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ld8.c().r(this);
        this.handler.removeCallbacksAndMessages(null);
        Animation animation = this.circleAnimation;
        if (animation != null) {
            animation.cancel();
        }
        OnEcoDeviceStatusListener onEcoDeviceStatusListener = this.mDeviceStatusListener;
        if (onEcoDeviceStatusListener != null) {
            EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(onEcoDeviceStatusListener);
        }
        this.mDeviceStatusListener = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @uno(threadMode = ThreadMode.MAIN)
    public final void onEcoPacketEvent(@NotNull ScaleEventBusIds.OnEcoPaketEvent event) {
        u7r packet;
        vw7 vw7VarW;
        vw7 vw7VarW2;
        vw7 vw7VarW3;
        vw7 vw7VarW4;
        vw7 vw7VarW5;
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.i(this.TAG, "onEcoPacketEvent");
        if (!Intrinsics.areEqual(this.mDid, event.getDid())) {
            Logger.i(this.TAG, "use scale error mDid : " + this.mDid + " , did : " + event.getDid());
            return;
        }
        if (this.isInBackground || (packet = event.getPacket()) == null || packet.f != 13) {
            return;
        }
        u7r packet2 = event.getPacket();
        Intrinsics.checkNotNull(packet2);
        ww7 ww7VarT = packet2.t();
        Integer numValueOf = null;
        Integer numValueOf2 = (ww7VarT == null || (vw7VarW5 = ww7VarT.w()) == null) ? null : Integer.valueOf(vw7VarW5.c);
        if (numValueOf2 == null || numValueOf2.intValue() <= 0 || this.isInBackground) {
            return;
        }
        ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
        if (scalePageUtil.getWEIGHT_ACTIVITY_IS_START()) {
            return;
        }
        scalePageUtil.setWEIGHT_ACTIVITY_IS_START(true);
        this.isInBackground = true;
        Bundle bundle = new Bundle();
        u7r packet3 = event.getPacket();
        Intrinsics.checkNotNull(packet3);
        ww7 ww7VarT2 = packet3.t();
        Integer numValueOf3 = (ww7VarT2 == null || (vw7VarW4 = ww7VarT2.w()) == null) ? null : Integer.valueOf(vw7VarW4.d);
        Intrinsics.checkNotNull(numValueOf3);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_UNIT_KEY, numValueOf3.intValue());
        u7r packet4 = event.getPacket();
        Intrinsics.checkNotNull(packet4);
        ww7 ww7VarT3 = packet4.t();
        Integer numValueOf4 = (ww7VarT3 == null || (vw7VarW3 = ww7VarT3.w()) == null) ? null : Integer.valueOf(vw7VarW3.c);
        Intrinsics.checkNotNull(numValueOf4);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_WEIGHT_KEY, numValueOf4.intValue());
        u7r packet5 = event.getPacket();
        Intrinsics.checkNotNull(packet5);
        ww7 ww7VarT4 = packet5.t();
        Integer numValueOf5 = (ww7VarT4 == null || (vw7VarW2 = ww7VarT4.w()) == null) ? null : Integer.valueOf(vw7VarW2.e);
        Intrinsics.checkNotNull(numValueOf5);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_LOCK_KEY, numValueOf5.intValue());
        u7r packet6 = event.getPacket();
        Intrinsics.checkNotNull(packet6);
        ww7 ww7VarT5 = packet6.t();
        if (ww7VarT5 != null && (vw7VarW = ww7VarT5.w()) != null) {
            numValueOf = Integer.valueOf(vw7VarW.f);
        }
        Intrinsics.checkNotNull(numValueOf);
        bundle.putInt(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_MATCH_NUM_KEY, numValueOf.intValue());
        bundle.putString(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_DID_KEY, event.getDid());
        if (Intrinsics.areEqual(WeightActivity.WEIGHT_TYPE_VISITOR, this.mGuideType)) {
            bundle.putString("electronic_weight_type", WeightActivity.WEIGHT_TYPE_VISITOR);
            bundle.putString(WeightActivity.KEY_WEIGHT_NICK_NAME, ((WeightGuideViewModel) getMViewModel()).getNickName());
            bundle.putInt("electronic_weight_sex", ((WeightGuideViewModel) getMViewModel()).getSex());
            bundle.putString(WeightActivity.KEY_WEIGHT_BIRTHDAY, ((WeightGuideViewModel) getMViewModel()).getBirthday());
            bundle.putInt("electronic_weight_height", ((WeightGuideViewModel) getMViewModel()).getHeight());
        }
        Logger.i("WeightGuideActivity startWeightActivity", new Object[0]);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ElectronicScaleManagerExtKt.launchToElectronicWeightActivity(applicationContext, bundle, event.getDid());
        if (Intrinsics.areEqual(WeightActivity.WEIGHT_TYPE_VISITOR, this.mGuideType)) {
            finish();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onMenuItemSelected(featureId, item);
        }
        if (this.mFromBind) {
            String str = this.mDid;
            Intrinsics.checkNotNull(str);
            String str2 = this.mMac;
            Intrinsics.checkNotNull(str2);
            ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity(this, str, str2, false);
        }
        finish();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isInBackground = true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.isInBackground = false;
        EcoDataHandlerHelper.INSTANCE.updateDataHandler();
    }

    public final void setCircleAnimation(@Nullable Animation animation) {
        this.circleAnimation = animation;
    }

    public final void setDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.dialog = commonDialog;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setInBackground(boolean z) {
        this.isInBackground = z;
    }

    public final void setMDid(@Nullable String str) {
        this.mDid = str;
    }

    public final void setMFromBind(boolean z) {
        this.mFromBind = z;
    }

    public final void setMGuideType(@Nullable String str) {
        this.mGuideType = str;
    }

    public final void setMMac(@Nullable String str) {
        this.mMac = str;
    }
}
