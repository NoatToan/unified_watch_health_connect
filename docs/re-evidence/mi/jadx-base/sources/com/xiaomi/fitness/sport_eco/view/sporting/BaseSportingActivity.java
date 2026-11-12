package com.xiaomi.fitness.sport_eco.view.sporting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.data.UISportState;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.ftp.utils.DeviceExceptionUtil;
import com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.model.SportModel;
import com.xiaomi.fitness.sport_eco.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport_eco.utils.TransitionUtil;
import com.xiaomi.fitness.sport_eco.view.config.SportRemindConfigFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportDeviceExceptionDialog;
import com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.a8r;
import defpackage.av6;
import defpackage.cki;
import defpackage.e1j;
import defpackage.m0d;
import defpackage.mcn;
import defpackage.oe4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\b\u0001\u0010\u0005*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u00020\u00072\u00020\bB\u0019\u0012\u0006\u0010J\u001a\u00020(\u0012\u0006\u0010N\u001a\u00020(¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0004¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u0016J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\u0016J\r\u00104\u001a\u00020\u000b¢\u0006\u0004\b4\u0010\u0016J\u0011\u00106\u001a\u0004\u0018\u000105H&¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000b¢\u0006\u0004\b8\u0010\u0016J)\u0010=\u001a\u00020\u000b2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\b\u0010<\u001a\u0004\u0018\u00010;H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020(H\u0016¢\u0006\u0004\b@\u0010+J\u001f\u0010C\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020%H\u0016¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u000b¢\u0006\u0004\bH\u0010\u0016J\u000f\u0010I\u001a\u00020\u000bH\u0014¢\u0006\u0004\bI\u0010\u0016R\u001a\u0010J\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010K\u001a\u0004\bP\u0010M\"\u0004\bQ\u0010+R\"\u0010R\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\bS\u0010M\"\u0004\bT\u0010+R\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010K\u001a\u0004\b]\u0010M\"\u0004\b^\u0010+R\"\u0010_\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010K\u001a\u0004\b`\u0010M\"\u0004\ba\u0010+R(\u0010c\u001a\b\u0012\u0002\b\u0003\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010i\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bi\u0010'\"\u0004\bk\u0010GR\"\u0010l\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010j\u001a\u0004\bl\u0010'\"\u0004\bm\u0010GR\u0017\u0010o\u001a\u00020n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\"\u0010s\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010j\u001a\u0004\bs\u0010'\"\u0004\bt\u0010GR*\u0010v\u001a\u00020%2\u0006\u0010u\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010j\u001a\u0004\bw\u0010'\"\u0004\bx\u0010GR(\u0010y\u001a\b\u0012\u0002\b\u0003\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010d\u001a\u0004\bz\u0010f\"\u0004\b{\u0010hR(\u0010|\u001a\b\u0012\u0002\b\u0003\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010d\u001a\u0004\b}\u0010f\"\u0004\b~\u0010hR#\u0010\u007f\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010j\u001a\u0004\b\u007f\u0010'\"\u0005\b\u0080\u0001\u0010GR!\u0010\u0082\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010d¨\u0006\u0085\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/interfaces/ISportStateOnViewCallback;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;", "Loe4;", "it", "", "handleDeviceConnect", "(Loe4;)V", "localDeviceConnectChanged", "wearDeviceConnectChanged", "connectDialog", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "state", "onSportStateChanged", "(Lcom/xiaomi/fitness/sport_eco/data/UISportState;)V", "dismissAllDialog", "()V", "askIfResumeSportDialog", "", "title", "des", "showDeviceExceptionDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/airbnb/lottie/LottieAnimationView;", "lottie", "setCountdownMode", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "", "isNeedRemind", "()Z", "", DailyRecordKey.sportType, "setSportConfig", "(I)V", "Lm0d;", "callback", "onViewRestart", "(Lm0d;)V", "onViewPaused", "onViewFinish", "onBackPressed", "jumpSportDetail", "showShortDistanceDialog", "Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport_eco/view/widget/SportCommandView;", "gotoSportConfig", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "code", "ecoDeviceFault", "isHasLock", "lockCode", "onLock", "(ZI)V", "isDynamicMode", "onModeSwitch", "(Z)V", "finishActivity", LifecycleConstantKt.ON_DESTROY, "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "getSportType", "setSportType", "deviceType", "getDeviceType", "setDeviceType", "", "goalValue", "F", "getGoalValue", "()F", "setGoalValue", "(F)V", "goalType", "getGoalType", "setGoalType", "trainingMode", "getTrainingMode", "setTrainingMode", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "isRecoverySport", "Z", "setRecoverySport", "isRebootSport", "setRebootSport", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isBackgroundProcessAlive", "setBackgroundProcessAlive", "value", "disconnectFinishSport", "getDisconnectFinishSport", "setDisconnectFinishSport", "shortDistanceDialog", "getShortDistanceDialog", "setShortDistanceDialog", "noReportDialog", "getNoReportDialog", "setNoReportDialog", "isShowAskIfResumeSportDialog", "setShowAskIfResumeSportDialog", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "mSportDeviceExceptionDialog", "<init>", "(II)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseSportingActivity<VM extends BaseSportVM<CommonSportModel>, VDB extends ViewDataBinding> extends BaseBindingActivity<VM, VDB> implements ISportStateOnViewCallback, ILockListener {
    private int deviceType;

    @Nullable
    private CommonDialog<?> dialog;
    private boolean disconnectFinishSport;
    private float goalValue;
    private boolean isRebootSport;
    private boolean isRecoverySport;
    private boolean isShowAskIfResumeSportDialog;
    private final int layoutId;

    @Nullable
    private CommonDialog<DialogParams> mSportDeviceExceptionDialog;

    @Nullable
    private CommonDialog<?> noReportDialog;

    @Nullable
    private CommonDialog<?> shortDistanceDialog;
    private int sportType;
    private final int viewModelId;
    private int goalType = -1;
    private int trainingMode = SportModel.INSTANCE.getSPORT_TRAINING();

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean isBackgroundProcessAlive = true;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity$askIfResumeSportDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/sport_eco/view/sporting/BaseSportingActivity$askIfResumeSportDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

        public AnonymousClass1(BaseSportingActivity<VM, VDB> baseSportingActivity) {
            this.this$0 = baseSportingActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDialogClick$lambda$0() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which != -2) {
                if (which != -1) {
                    return;
                }
                BaseSportingActivity.access$getMViewModel(this.this$0).resumeSport(new m0d() { // from class: xd2
                    @Override // defpackage.m0d
                    public final void a() {
                        BaseSportingActivity.AnonymousClass1.onDialogClick$lambda$0();
                    }
                });
            } else {
                this.this$0.setShowAskIfResumeSportDialog(true);
                BaseSportingActivity.access$getMViewModel(this.this$0).finishSport();
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.this$0.finish();
            }
        }
    }

    public BaseSportingActivity(int i, int i2) {
        this.layoutId = i;
        this.viewModelId = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BaseSportVM access$getMViewModel(BaseSportingActivity baseSportingActivity) {
        return (BaseSportVM) baseSportingActivity.getMViewModel();
    }

    private final void askIfResumeSportDialog() {
        CommonDialog<?> commonDialog;
        if (this.noReportDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("askIfResumeSportDialog").setDialogDescription(e1j.B0).setNegativeText(e1j.x1).setPositiveText(e1j.d0).create();
            this.noReportDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.noReportDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new AnonymousClass1(this));
            }
        }
        CommonDialog<?> commonDialog3 = this.noReportDialog;
        if (commonDialog3 == null || commonDialog3.isShowing() || (commonDialog = this.noReportDialog) == null) {
            return;
        }
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void connectDialog(oe4 it) {
        if (it.b()) {
            if (this.sportType == 14) {
                EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
                if (localDeviceModel != null) {
                    String did = localDeviceModel.getDid();
                    if (did == null) {
                        did = "";
                    }
                    EcoDeviceModelExtKt.syncDeviceSportStatus(localDeviceModel, did, new SportStateSyncCallback<a8r>(this) { // from class: com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity.connectDialog.2
                        final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback
                        public void onError(int errorCode) {
                            FitnessLogUtils.i(BaseBindingActivity.TAG, "GYM is not sport , errorCode : " + errorCode);
                        }

                        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportStateSyncCallback
                        public void onResult(a8r result) {
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result.a()) {
                                FitnessLogUtils.i(BaseBindingActivity.TAG, "GYM is sport");
                            } else {
                                FitnessLogUtils.i(BaseBindingActivity.TAG, "GYM is not sport , finishSport");
                                BaseSportingActivity.access$getMViewModel(this.this$0).finishSport();
                            }
                        }
                    });
                }
            } else {
                FitnessLogUtils.i(BaseBindingActivity.TAG, "connectDialog , resartSport");
                getMViewModel().restartSport();
            }
            CommonDialog<?> commonDialog = this.dialog;
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
            this.dialog = null;
        } else if (this.dialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("connectDialog").setDialogTitle(e1j.L).setDialogDescription(e1j.P2).setPositiveText(e1j.y1).create();
            this.dialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.dialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity.connectDialog.1
                    final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            BaseSportingActivity.access$getMViewModel(this.this$0).disconnectOperate();
                            this.this$0.setDisconnectFinishSport(true);
                            this.this$0.finish();
                        }
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.dialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
        if (this.sportType == 14) {
            SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).connectChanged(it.b());
        }
    }

    private final void dismissAllDialog() {
        CommonDialog<?> commonDialog = this.shortDistanceDialog;
        if (commonDialog != null) {
            if (commonDialog != null) {
                commonDialog.dismiss();
            }
            this.shortDistanceDialog = null;
        }
        CommonDialog<?> commonDialog2 = this.noReportDialog;
        if (commonDialog2 != null) {
            if (commonDialog2 != null) {
                commonDialog2.dismiss();
            }
            this.noReportDialog = null;
        }
    }

    private final void handleDeviceConnect(oe4 it) {
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String strA = it.a();
        Intrinsics.checkNotNullExpressionValue(strA, "getDid(...)");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(strA);
        if (this.deviceType != 1) {
            wearDeviceConnectChanged(it);
        } else {
            if (ecoDeviceModel == null || !com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.isLocalDevice(ecoDeviceModel)) {
                return;
            }
            localDeviceConnectChanged(it);
        }
    }

    private final void localDeviceConnectChanged(oe4 it) {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "localDevice connect : " + it.b() + " , did : " + it.a());
        connectDialog(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onActivityResult$lambda$3(BaseSportingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).refreshSportRemind(this$0.sportType, ((BaseSportVM) this$0.getMViewModel()).getGoalRemind());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BaseSportingActivity this$0, UISportState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onSportStateChanged(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(BaseSportingActivity this$0, oe4 oe4Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(oe4Var);
        this$0.handleDeviceConnect(oe4Var);
        return Unit.INSTANCE;
    }

    private final void onSportStateChanged(UISportState state) {
        if (state instanceof UISportState.Finish) {
            SportCommandView sportCommandView = getSportCommandView();
            if (sportCommandView != null) {
                sportCommandView.setSportState(4);
            }
            jumpSportDetail();
            return;
        }
        if (Intrinsics.areEqual(state, UISportState.Pause.INSTANCE)) {
            SportCommandView sportCommandView2 = getSportCommandView();
            if (sportCommandView2 != null) {
                sportCommandView2.setSportState(2);
            }
            SportCommandView sportCommandView3 = getSportCommandView();
            if (sportCommandView3 != null) {
                sportCommandView3.getMStartOrPause();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(state, UISportState.Restart.INSTANCE)) {
            dismissAllDialog();
            SportCommandView sportCommandView4 = getSportCommandView();
            if (sportCommandView4 != null) {
                sportCommandView4.setSportState(3);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(state, UISportState.Start.INSTANCE)) {
            dismissAllDialog();
            SportCommandView sportCommandView5 = getSportCommandView();
            if (sportCommandView5 != null) {
                sportCommandView5.setSportState(1);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(state, UISportState.Rest.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        dismissAllDialog();
        SportCommandView sportCommandView6 = getSportCommandView();
        if (sportCommandView6 != null) {
            sportCommandView6.setSportState(5);
        }
    }

    private final void showDeviceExceptionDialog(String title, String des) {
        CommonDialog<DialogParams> commonDialogAddDialogCallback = new SportDeviceExceptionDialog.Builder(title, des).create().addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity.showDeviceExceptionDialog.1
            final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    BaseSportingActivity.access$getMViewModel(this.this$0).setEcoDeviceFaultCode(-1);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        });
        this.mSportDeviceExceptionDialog = commonDialogAddDialogCallback;
        if (commonDialogAddDialogCallback != null) {
            commonDialogAddDialogCallback.setCancelable(false);
        }
        CommonDialog<DialogParams> commonDialog = this.mSportDeviceExceptionDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void wearDeviceConnectChanged(oe4 it) {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "wearDevice connect : " + it.b() + " , did : " + it.a());
        connectDialog(it);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void ecoDeviceFault(int code) {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "故障处理" + code);
        getMViewModel().setEcoDeviceFaultCode(code);
        showDeviceExceptionDialog(DeviceExceptionUtil.getExceptionTitleByCode(code), DeviceExceptionUtil.getExceptionDesByCode(code));
    }

    public final void finishActivity() {
        getMViewModel().disconnectOperate();
        setDisconnectFinishSport(true);
        finish();
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final CommonDialog<?> getDialog() {
        return this.dialog;
    }

    public final boolean getDisconnectFinishSport() {
        return this.disconnectFinishSport;
    }

    public final int getGoalType() {
        return this.goalType;
    }

    public final float getGoalValue() {
        return this.goalValue;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Nullable
    public final CommonDialog<?> getNoReportDialog() {
        return this.noReportDialog;
    }

    @Nullable
    public final CommonDialog<?> getShortDistanceDialog() {
        return this.shortDistanceDialog;
    }

    @Nullable
    public abstract SportCommandView getSportCommandView();

    public final int getSportType() {
        return this.sportType;
    }

    public final int getTrainingMode() {
        return this.trainingMode;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    public final void gotoSportConfig() {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", this.sportType);
        bundle.putInt("DEVICE_TYPE", this.deviceType);
        TransitionUtil.INSTANCE.gotoActivityResult(this, SportRemindConfigFragment.class, bundle, 0);
    }

    /* JADX INFO: renamed from: isBackgroundProcessAlive, reason: from getter */
    public final boolean getIsBackgroundProcessAlive() {
        return this.isBackgroundProcessAlive;
    }

    public boolean isNeedRemind() {
        return true;
    }

    /* JADX INFO: renamed from: isRebootSport, reason: from getter */
    public final boolean getIsRebootSport() {
        return this.isRebootSport;
    }

    /* JADX INFO: renamed from: isRecoverySport, reason: from getter */
    public final boolean getIsRecoverySport() {
        return this.isRecoverySport;
    }

    /* JADX INFO: renamed from: isShowAskIfResumeSportDialog, reason: from getter */
    public final boolean getIsShowAskIfResumeSportDialog() {
        return this.isShowAskIfResumeSportDialog;
    }

    public void jumpSportDetail() {
        int iConvertSportType = SportUtilsExtKt.convertSportType(this.sportType);
        SportData sportReportData = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).getSportReportData();
        if (sportReportData == null) {
            return;
        }
        FitnessLogUtils.d(BaseBindingActivity.TAG, "sportReportData :" + sportReportData);
        getMViewModel().finishTrack(sportReportData, this.disconnectFinishSport);
        if (sportReportData.distance < 100) {
            FitnessLogUtils.d(IndoorRidingActivity.TAG, "from jumpSportDetail in base");
            showShortDistanceDialog();
            return;
        }
        SportBasicReport sportBasicReport = new SportBasicReport(new FitnessDataId.Builder().timeStampInSec(sportReportData.startTime).timeZoneIn15Min(sportReportData.timezone).sportType(this.sportType).fileType(1).version(1).build());
        sportBasicReport.setSportType(this.sportType);
        sportBasicReport.setSid("xiaomiwear_app");
        sportBasicReport.setDuration(sportReportData.totalTime);
        sportBasicReport.setTimeStamp(sportReportData.startTime);
        sportBasicReport.setAvgHeight(Float.valueOf(sportReportData.aveHeight));
        int i = sportReportData.aveHrRate & 255;
        if (i != 0) {
            sportBasicReport.setAvgHr(Integer.valueOf(i));
        }
        sportBasicReport.setCalories(Integer.valueOf(sportReportData.cal));
        sportBasicReport.setDistance(Integer.valueOf(sportReportData.distance));
        sportBasicReport.setDuration(sportReportData.totalTime);
        sportBasicReport.setEndTime(sportReportData.endTime);
        sportBasicReport.setMaxHr(Integer.valueOf(sportReportData.maxHrRate & 255));
        sportBasicReport.setMaxHeight(Float.valueOf(sportReportData.maxHeight));
        sportBasicReport.setHrAerobicDuration(Integer.valueOf(sportReportData.hrAerobic));
        sportBasicReport.setHrAnaerobicDuration(Integer.valueOf(sportReportData.hrAnaerobic));
        sportBasicReport.setHrFatBurningDuration(Integer.valueOf(sportReportData.hrFat));
        sportBasicReport.setHrExtremeDuration(Integer.valueOf(sportReportData.hrLimit));
        sportBasicReport.setHrWarmUpDuration(Integer.valueOf(sportReportData.hrWarm));
        sportBasicReport.setMaxCadence(Integer.valueOf(sportReportData.maxStepRate));
        sportBasicReport.setMinHr(Integer.valueOf(sportReportData.minHrRate & 255));
        sportBasicReport.setMinHeight(Float.valueOf(sportReportData.minHeight));
        sportBasicReport.setStartTime(sportReportData.startTime);
        sportBasicReport.setSteps(Integer.valueOf(sportReportData.totalStep));
        sportBasicReport.setTimeStamp(sportReportData.startTime);
        Bundle bundle = new Bundle();
        bundle.putInt("sport_type", iConvertSportType);
        bundle.putLong("time_stamp", sportReportData.timeStamp);
        bundle.putSerializable("sport_report", sportBasicReport);
        SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), this, bundle, sportBasicReport, false, 8, null);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Logger.d(BaseBindingActivity.TAG, "onActivityResult requestCode = " + requestCode);
        if (requestCode == 0) {
            if (this.deviceType == 0) {
                mcn sportRemindTable = SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getSportRemindTable(this.sportType);
                Boolean boolValueOf = sportRemindTable != null ? Boolean.valueOf(sportRemindTable.o) : null;
                SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setAutoPase(boolValueOf != null ? boolValueOf.booleanValue() : false);
            }
            setSportConfig(this.sportType);
            getMBinding().getRoot().postDelayed(new Runnable() { // from class: jd2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSportingActivity.onActivityResult$lambda$3(this.f22660a);
                }
            }, 500L);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(null);
        IEcoSportRemoteState.Companion companion = IEcoSportRemoteState.INSTANCE;
        SportEcoManagerExtKt.getInstance(companion).setLocalReceiveListener(this);
        FitnessLogUtils.i(BaseBindingActivity.TAG, "onCreate , background process is alive : " + SportEcoManagerExtKt.getInstance(companion).isBackgroundProcessAlive());
        if (SportEcoManagerExtKt.getInstance(companion).isBackgroundProcessAlive()) {
            SportCommandView sportCommandView = getSportCommandView();
            if (sportCommandView != null) {
                sportCommandView.setOnSportStateOnViewListener(this);
            }
            Intent intent = getIntent();
            SportModel.Companion companion2 = SportModel.INSTANCE;
            this.sportType = intent.getIntExtra("KEY_SPORT_TYPE", companion2.getSPORT_TYPE());
            this.goalType = intent.getIntExtra("GOAL_TYPE", companion2.getGOAL_TYPE());
            this.goalValue = intent.getFloatExtra("GOAL_VALUE", companion2.getGOAL_VALUE());
            this.trainingMode = intent.getIntExtra(SportConstants.TRAINING_MODE, companion2.getSPORT_TRAINING());
            this.isRecoverySport = intent.getBooleanExtra("IS_RECOVER_SPORT", false);
            boolean booleanExtra = intent.getBooleanExtra("IS_REBOOT_SPORT", false);
            this.isRebootSport = booleanExtra;
            if (booleanExtra) {
                getMViewModel().setCurDeviceDid(getMViewModel().getDeviceDid());
            }
            FitnessLogUtils.d(BaseBindingActivity.TAG, "sportType : " + this.sportType + " , sportGoal : " + this.goalType + " , sportGoalValue : " + this.goalValue + " , trainingMode : " + this.trainingMode);
            getMViewModel().setSportType(this.sportType);
            getMViewModel().setSportGoalType(this.goalType);
            getMViewModel().setSportGoalValue(this.goalValue);
            getMViewModel().setTrainingMode(this.trainingMode);
            if (getMViewModel().getIsActivityFirstInit() && isNeedRemind()) {
                getMViewModel().setSportRemind();
            }
            setSportConfig(this.sportType);
            getMViewModel().setUISportStateChange(new Function1() { // from class: md2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseSportingActivity.onCreate$lambda$1(this.f26029a, (UISportState) obj);
                }
            });
            MutableLiveData<oe4> connectState = getMViewModel().getConnectState();
            if (connectState != null) {
                connectState.observe(this, new BaseSportingActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: od2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BaseSportingActivity.onCreate$lambda$2(this.f29027a, (oe4) obj);
                    }
                }));
            }
            getMViewModel().setActivityFirstInit(false);
        } else {
            this.isBackgroundProcessAlive = false;
            finish();
        }
        if (getMViewModel().getEcoDeviceFaultCode() > -1) {
            showDeviceExceptionDialog(DeviceExceptionUtil.getExceptionTitleByCode(getMViewModel().getEcoDeviceFaultCode()), DeviceExceptionUtil.getExceptionDesByCode(getMViewModel().getEcoDeviceFaultCode()));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setLocalReceiveListener(null);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void onLock(boolean isHasLock, int lockCode) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void onModeSwitch(boolean isDynamicMode) {
    }

    @Override // com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback
    public void onViewFinish(@NotNull m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getMViewModel().isValidSport()) {
            getMViewModel().finishSport();
        } else {
            askIfResumeSportDialog();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback
    public void onViewPaused(@NotNull m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getMViewModel().onViewPaused(callback);
    }

    @Override // com.xiaomi.fitness.sport_eco.interfaces.ISportStateOnViewCallback
    public void onViewRestart(@NotNull m0d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        dismissAllDialog();
        getMViewModel().onViewRestart(callback);
    }

    public final void setBackgroundProcessAlive(boolean z) {
        this.isBackgroundProcessAlive = z;
    }

    public final void setCountdownMode(@Nullable LottieAnimationView lottie) {
        if (UIUtils.isNightMode(this)) {
            if (lottie != null) {
                lottie.setBackgroundResource(cki.f5429a);
            }
            if (lottie != null) {
                lottie.setAnimation("countdown_black.json");
                return;
            }
            return;
        }
        if (lottie != null) {
            lottie.setAnimation("countdown_white.json");
        }
        if (lottie != null) {
            lottie.setBackgroundResource(cki.f5432r);
        }
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setDialog(@Nullable CommonDialog<?> commonDialog) {
        this.dialog = commonDialog;
    }

    public final void setDisconnectFinishSport(boolean z) {
        this.disconnectFinishSport = z;
        getMViewModel().setDisconnectFinishSport(z);
    }

    public final void setGoalType(int i) {
        this.goalType = i;
    }

    public final void setGoalValue(float f) {
        this.goalValue = f;
    }

    public final void setNoReportDialog(@Nullable CommonDialog<?> commonDialog) {
        this.noReportDialog = commonDialog;
    }

    public final void setRebootSport(boolean z) {
        this.isRebootSport = z;
    }

    public final void setRecoverySport(boolean z) {
        this.isRecoverySport = z;
    }

    public final void setShortDistanceDialog(@Nullable CommonDialog<?> commonDialog) {
        this.shortDistanceDialog = commonDialog;
    }

    public final void setShowAskIfResumeSportDialog(boolean z) {
        this.isShowAskIfResumeSportDialog = z;
    }

    public final void setSportConfig(int sportType) {
        mcn sportRemindTable = SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getSportRemindTable(sportType);
        if (sportRemindTable == null) {
            sportRemindTable = new mcn();
        }
        boolean z = sportRemindTable.f26019b;
        Logger.d(BaseBindingActivity.TAG, "setSportConfig light = " + Boolean.valueOf(z));
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(128);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(128);
        }
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setTrainingMode(int i) {
        this.trainingMode = i;
    }

    public final void showShortDistanceDialog() {
        CommonDialog<?> commonDialog;
        if (this.isShowAskIfResumeSportDialog) {
            return;
        }
        if (this.shortDistanceDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("finishsport").setDialogDescription(e1j.P4).setPositiveText(e1j.d).create();
            this.shortDistanceDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.shortDistanceDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.sport_eco.view.sporting.BaseSportingActivity.showShortDistanceDialog.1
                    final /* synthetic */ BaseSportingActivity<VM, VDB> this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        this.this$0.finish();
                    }
                });
            }
        }
        CommonDialog<?> commonDialog3 = this.shortDistanceDialog;
        if (commonDialog3 == null || commonDialog3.isShowing() || (commonDialog = this.shortDistanceDialog) == null) {
            return;
        }
        commonDialog.showIfNeed(getSupportFragmentManager());
    }
}
