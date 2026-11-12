package com.xiaomi.fitness.sport.view.launch.gym;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport.utils.MijiaHelper;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.utils.WebViewUtilKt;
import com.xiaomi.fitness.sport.view.goal.SportGoalSettingActivity;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.data.GymReport;
import com.xiaomi.fitness.sport.view.launch.gym.setting.GuideWebViewActivity;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalDeviceUpdateFragment;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport.view.widget.SportSubTitleDialog;
import com.xiaomi.fitness.sport_manager_export.listener.DeviceTaskCallBack;
import com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.wearable.home.sport.report.ReceiveSportReportActivity;
import defpackage.av6;
import defpackage.c1j;
import defpackage.dih;
import defpackage.gs9;
import defpackage.gt9;
import defpackage.of4;
import defpackage.s7r;
import defpackage.ur9;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u00105J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\r2\u0016\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0012J)\u0010(\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010'\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b3\u0010\u0012J\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010-\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u00101\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010A\u001a\u0004\bF\u0010C\"\u0004\bG\u0010E¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/GymDeviceModel;", "", "Ls7r;", "wearPacket", "Lgs9$a;", "handleGymSettingRequestResponse", "(Ls7r;)Lgs9$a;", "Lgt9$a;", "handleGymSportReportList", "(Ls7r;)Lgt9$a;", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "list", "", "showReportDialog", "(Landroidx/fragment/app/FragmentActivity;Lgt9$a;)V", "getReportsFromGYM", "showCannotUpdateDialog", "(Landroidx/fragment/app/FragmentActivity;)V", "Lcom/xiaomi/fitness/sport_manager_export/listener/DeviceTaskCallBack;", "", "Lgs9;", "callBack", "isGymUpdating", "(Lcom/xiaomi/fitness/sport_manager_export/listener/DeviceTaskCallBack;)V", "", "callback", "getGymLock", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport_manager_export/listener/DeviceTaskCallBack;)V", "showDialog", "Lkotlin/Function1;", "checkGymOfflineReport", "(Landroidx/fragment/app/FragmentActivity;ZLkotlin/jvm/functions/Function1;)V", "isDeviceLaunch", "isShowAnimation", "preLaunchGym", "(Landroidx/fragment/app/FragmentActivity;ZZ)V", "launchGym", "gotoGoal", "gymSettingsList", "triggerGymLock", "(Landroidx/fragment/app/FragmentActivity;[Lgs9;)Z", "", "title", "detail", "showLockDialog", "(Landroidx/fragment/app/FragmentActivity;II)V", "Lcom/xiaomi/fitness/sport/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "versionInfo", "showUpdateDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;)V", "checkUpdate", "syncGymData", "()V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "curGymDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "GYM_UPDATING", "I", "", "TAG", "Ljava/lang/String;", "", "preLaunchTime", "J", "Z", "getShowLockDialog", "()Z", "setShowLockDialog", "(Z)V", "getShowUpdateDialog", "setShowUpdateDialog", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGymDeviceModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GymDeviceModel.kt\ncom/xiaomi/fitness/sport/view/launch/gym/GymDeviceModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,545:1\n13402#2,2:546\n13402#2,2:549\n1#3:548\n*S KotlinDebug\n*F\n+ 1 GymDeviceModel.kt\ncom/xiaomi/fitness/sport/view/launch/gym/GymDeviceModel\n*L\n283#1:546,2\n378#1:549,2\n*E\n"})
public final class GymDeviceModel {
    public static final int GYM_UPDATING = 5;

    @NotNull
    public static final GymDeviceModel INSTANCE = new GymDeviceModel();

    @NotNull
    public static final String TAG = "GymDeviceModel";
    private static long preLaunchTime;
    private static boolean showLockDialog;
    private static boolean showUpdateDialog;

    private GymDeviceModel() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkGymOfflineReport$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        gymDeviceModel.checkGymOfflineReport(fragmentActivity, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getReportsFromGYM(FragmentActivity activity, gt9.a list) {
        ArrayList arrayList = new ArrayList();
        gt9[] list2 = list.c;
        Intrinsics.checkNotNullExpressionValue(list2, "list");
        for (gt9 gt9Var : list2) {
            GymReport gymReport = new GymReport();
            gymReport.setIds(gt9Var.c);
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(gt9Var.c).order(ByteOrder.LITTLE_ENDIAN);
            int i = byteBufferOrder.getInt();
            byteBufferOrder.get();
            byteBufferOrder.get();
            int i2 = (byteBufferOrder.get() >> 2) & 15;
            gymReport.setStartTime(i);
            gymReport.setSportType(i2);
            gymReport.setDuration(gt9Var.f);
            gymReport.setDistance(gt9Var.g);
            arrayList.add(gymReport);
        }
        final Bundle bundle = new Bundle();
        bundle.putSerializable("GYM_REPORT", arrayList);
        if (activity != null) {
            LaunchExtensionKt.startActivity(activity, (Class<?>) ReceiveSportReportActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: tab
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.getReportsFromGYM$lambda$1(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReportsFromGYM$lambda$1(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoGoal$lambda$4(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("DEVICE_TYPE", 1);
        it.putExtra("KEY_SPORT_TYPE", 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gs9.a handleGymSettingRequestResponse(s7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w("GymDeviceModel", "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w("GymDeviceModel", "not fitness response type");
            return null;
        }
        ur9 ur9VarU = wearPacket.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("GymDeviceModel", "no fitness proto");
            return null;
        }
        gs9.a aVarY = ur9VarU.y();
        if (aVarY != null) {
            return aVarY;
        }
        FitnessLogUtils.w("GymDeviceModel", "no fitness sport response proto");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt9.a handleGymSportReportList(s7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w("GymDeviceModel", "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w("GymDeviceModel", "not fitness response type");
            return null;
        }
        ur9 ur9VarU = wearPacket.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("GymDeviceModel", "no fitness proto");
            return null;
        }
        gt9.a aVarJ = ur9VarU.J();
        if (aVarJ != null) {
            return aVarJ;
        }
        FitnessLogUtils.w("GymDeviceModel", "no fitness sport response proto");
        return null;
    }

    public static /* synthetic */ void launchGym$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        gymDeviceModel.launchGym(fragmentActivity, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGym$lambda$3(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void preLaunchGym$default(GymDeviceModel gymDeviceModel, FragmentActivity fragmentActivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        gymDeviceModel.preLaunchGym(fragmentActivity, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCannotUpdateDialog(FragmentActivity activity) {
        CommonDialog commonDialogCreate = new CommonDialog.c("cannot").setDialogTitle(c1j.r2).setDialogDescription(c1j.q2).setPositiveText(c1j.h).setNegativeText(c1j.f).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.showCannotUpdateDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    MijiaHelper.INSTANCE.goMijia(GymDeviceModel.INSTANCE.curGymDeviceModel());
                }
            }
        });
        FragmentActivity fragmentActivity = (FragmentActivity) new WeakReference(activity).get();
        commonDialogCreate.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showReportDialog(final FragmentActivity activity, final gt9.a list) {
        String string;
        WearableDeviceInfo deviceInfo;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = ResourceExtKt.getString(c1j.t3);
        Object[] objArr = new Object[1];
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null || (string = deviceInfo.getName()) == null) {
            string = ApplicationExtKt.getApplication().getResources().getString(c1j.L1);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        objArr[0] = string;
        String str = String.format(string2, Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format(ResourceExtKt.getString(c1j.u3), Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        SportSubTitleDialog sportSubTitleDialogCreate = SportSubTitleDialog.INSTANCE.defaultBuilder("gym_report").setDialogTitle(c1j.s3).setSubTitle(str + "\n" + str2).setPositiveText(c1j.B0).setNegativeText(c1j.z0).setItems(new String[]{"  " + ApplicationExtKt.getApplication().getResources().getString(c1j.I)}).setItemsChoices(new boolean[]{false}).create();
        if (sportSubTitleDialogCreate != null) {
            sportSubTitleDialogCreate.setCancelable(true);
        }
        if (sportSubTitleDialogCreate != null) {
            sportSubTitleDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.showReportDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        GymDeviceModel.INSTANCE.getReportsFromGYM(activity, list);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                    if (which != -2 || dialog == null) {
                        return;
                    }
                    dialog.dismiss();
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    super.onDialogMultiClick(dialogName, which, isChecked);
                    SportPreference.INSTANCE.setGYM_REPORT_REMIND(!isChecked);
                }
            });
        }
        if (sportSubTitleDialogCreate != null) {
            sportSubTitleDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
        }
    }

    public final void checkGymOfflineReport(@NotNull FragmentActivity activity, final boolean showDialog, @Nullable final Function1<? super Boolean, Unit> callback) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 6;
        final WeakReference weakReference = new WeakReference(activity);
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = curGymDeviceModel();
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.checkGymOfflineReport.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.d("GymDeviceModel", "checkGymOfflineReport onError " + code);
                AnyExtKt.main$default(null, new GymDeviceModel$checkGymOfflineReport$1$onError$1(callback, null), 1, null);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0051  */
            /* JADX WARN: Code duplicated, block: B:22:0x0055  */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                gt9[] gt9VarArr;
                Logger.d("GymDeviceModel", "checkGymOfflineReport onSuccess " + result);
                GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                gt9.a aVarHandleGymSportReportList = gymDeviceModel.handleGymSportReportList(result != null ? result.getPacket() : null);
                if (aVarHandleGymSportReportList != null && (gt9VarArr = aVarHandleGymSportReportList.c) != null) {
                    if (!(gt9VarArr.length == 0)) {
                        if (showDialog) {
                            gymDeviceModel.showReportDialog(weakReference.get(), aVarHandleGymSportReportList);
                        } else {
                            gymDeviceModel.getReportsFromGYM(weakReference.get(), aVarHandleGymSportReportList);
                        }
                    } else if (!showDialog) {
                        ToastUtil.INSTANCE.showToast(c1j.N2);
                    }
                } else if (!showDialog) {
                    ToastUtil.INSTANCE.showToast(c1j.N2);
                }
                AnyExtKt.main$default(null, new GymDeviceModel$checkGymOfflineReport$1$onSuccess$1(callback, null), 1, null);
            }
        }, 0, 16, (Object) null);
    }

    public final void checkUpdate(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Nullable
    public final WearableDeviceModel curGymDeviceModel() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
    }

    public final void getGymLock(@NotNull FragmentActivity activity, @NotNull final DeviceTaskCallBack<Boolean> callback) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 67;
        final WeakReference weakReference = new WeakReference(activity);
        ur9 ur9Var = new ur9();
        gs9.a aVar = new gs9.a();
        aVar.c = gs9.n();
        ur9Var.n0(aVar);
        s7rVar.S(ur9Var);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = curGymDeviceModel();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.getGymLock.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callback.onResult(Boolean.FALSE);
                FitnessLogUtils.i("GymDeviceModel", "get gym lock error , did : " + did + " , code : " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                gs9.a aVarHandleGymSettingRequestResponse = gymDeviceModel.handleGymSettingRequestResponse(result != null ? result.getPacket() : null);
                Intrinsics.checkNotNull(aVarHandleGymSettingRequestResponse);
                callback.onResult(Boolean.valueOf(gymDeviceModel.triggerGymLock(weakReference.get(), aVarHandleGymSettingRequestResponse.c)));
            }
        }, 0, 16, (Object) null);
    }

    public final boolean getShowLockDialog() {
        return showLockDialog;
    }

    public final boolean getShowUpdateDialog() {
        return showUpdateDialog;
    }

    public final void gotoGoal(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(c1j.f1);
        } else {
            LaunchExtensionKt.startActivity(activity, (Class<?>) SportGoalSettingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: vab
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GymDeviceModel.gotoGoal$lambda$4((Intent) obj);
                }
            });
        }
    }

    public final void isGymUpdating(@NotNull final DeviceTaskCallBack<gs9[]> callBack) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 67;
        ur9 ur9Var = new ur9();
        gs9.a aVar = new gs9.a();
        aVar.c = gs9.n();
        ur9Var.n0(aVar);
        s7rVar.S(ur9Var);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = curGymDeviceModel();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.isGymUpdating.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                callBack.onError(code);
                FitnessLogUtils.i("GymDeviceModel", "gym isUpdating error , did : " + did + " , code : " + code);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ur9 ur9VarU;
                gs9.a aVarY;
                ur9 ur9VarU2;
                gs9VarArr = null;
                gs9VarArr = null;
                gs9[] gs9VarArr = null;
                if ((result != null ? result.getPacket() : null) != null) {
                    s7r packet = result.getPacket();
                    if ((packet != null ? packet.u() : null) != null) {
                        s7r packet2 = result.getPacket();
                        if (((packet2 == null || (ur9VarU2 = packet2.u()) == null) ? null : ur9VarU2.y()) != null) {
                            s7r packet3 = result.getPacket();
                            if (packet3 != null && (ur9VarU = packet3.u()) != null && (aVarY = ur9VarU.y()) != null) {
                                gs9VarArr = aVarY.c;
                            }
                            Intrinsics.checkNotNull(gs9VarArr);
                            callBack.onResult(gs9VarArr);
                            String string = Arrays.toString(gs9VarArr);
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            FitnessLogUtils.i("GymDeviceModel", string);
                            return;
                        }
                    }
                }
                FitnessLogUtils.i("GymDeviceModel", "getGYMSettings failure:" + (result != null ? Integer.valueOf(result.getCode()) : null));
                callBack.onError(result != null ? result.getCode() : -1);
            }
        }, 0, 16, (Object) null);
    }

    public final void launchGym(@NotNull FragmentActivity activity, boolean isDeviceLaunch, boolean isShowAnimation) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FitnessLogUtils.i("GymDeviceModel", "launchGym");
        final Bundle bundle = new Bundle();
        bundle.putBoolean("LOCAL_DEVICE_LAUNCH", isDeviceLaunch);
        bundle.putInt("DEVICE_TYPE", 1);
        bundle.putBoolean("IS_SHOW_ANIMATION", isShowAnimation);
        bundle.putInt("KEY_SPORT_TYPE", 3);
        LaunchExtensionKt.startActivity(activity, (Class<?>) IndoorRunningActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: nab
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymDeviceModel.launchGym$lambda$3(bundle, (Intent) obj);
            }
        });
    }

    public final void preLaunchGym(@NotNull FragmentActivity activity, boolean isDeviceLaunch, boolean isShowAnimation) {
        FragmentActivity fragmentActivity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (System.currentTimeMillis() - preLaunchTime < 500) {
            return;
        }
        FitnessLogUtils.i("GymDeviceModel", "preLaunchGym");
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (!sportPreference.getUSE_TREADMILL_BEFORE() && !isDeviceLaunch) {
            String strE = of4.e(LocaleUtil.getCurrentLocale(), "ksmb.treadmill.m1v1", "");
            Intrinsics.checkNotNullExpressionValue(strE, "getUserGuideUrl(...)");
            WebViewUtilKt.startWebView$default(strE, null, false, false, 10, null);
            sportPreference.setUSE_TREADMILL_BEFORE(true);
        } else if (!GuideWebViewActivity.INSTANCE.isWelcome() && (fragmentActivity = (FragmentActivity) new WeakReference(activity).get()) != null) {
            INSTANCE.launchGym(fragmentActivity, isDeviceLaunch, isShowAnimation);
        }
        preLaunchTime = System.currentTimeMillis();
    }

    public final void setShowLockDialog(boolean z) {
        showLockDialog = z;
    }

    public final void setShowUpdateDialog(boolean z) {
        showUpdateDialog = z;
    }

    public final void showLockDialog(@Nullable FragmentActivity activity, int title, int detail) {
        if (showLockDialog) {
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(title).setDialogDescription(detail).setPositiveText(c1j.B0).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.showLockDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        GymDeviceModel.INSTANCE.setShowLockDialog(false);
                    }
                }
            });
        }
        WeakReference weakReference = new WeakReference(activity);
        if (commonDialogCreate != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
            commonDialogCreate.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
        }
        showLockDialog = true;
    }

    public final void showUpdateDialog(@Nullable final FragmentActivity activity, @NotNull final LocalDeviceUpgradeModel.CheckUpgradeRequest versionInfo) {
        Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
        if (showUpdateDialog) {
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(c1j.B3).setDialogDescriptionString(new DialogParams.DialogDescriptionString(c1j.C3, versionInfo.latestVersion)).setNegativeText(c1j.z0).setPositiveText(c1j.B0).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.setCancelable(false);
        }
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.showUpdateDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    WearableDeviceInfo deviceInfo;
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (!versionInfo.isOwner) {
                        GymDeviceModel.INSTANCE.showCannotUpdateDialog(activity);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_param1", versionInfo);
                    GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
                    WearableDeviceModel wearableDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
                    String mac = null;
                    bundle.putString("key_param2", wearableDeviceModelCurGymDeviceModel != null ? wearableDeviceModelCurGymDeviceModel.getDid() : null);
                    WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
                    if (wearableDeviceModelCurGymDeviceModel2 != null && (deviceInfo = wearableDeviceModelCurGymDeviceModel2.getDeviceInfo()) != null) {
                        mac = deviceInfo.getMac();
                    }
                    bundle.putString("mac", mac);
                    FragmentParams fragmentParamsB = new FragmentParams.b().e(LocalDeviceUpdateFragment.class).c(bundle).a(true).b();
                    Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
                    dih.a().e((Context) new WeakReference(activity).get(), fragmentParamsB);
                }
            });
        }
        WeakReference weakReference = new WeakReference(activity);
        if (commonDialogCreate != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
            commonDialogCreate.showIfNeed(fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null);
        }
        showUpdateDialog = true;
    }

    public final void syncGymData() {
        String did;
        WearableDeviceInfo deviceInfo;
        FitnessLogUtils.i("GymDeviceModel", "连接后开始同步");
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
            did = "";
        }
        if (did.length() == 0) {
            FitnessLogUtils.i("GymDeviceModel", "不同步本地设备数据,因did为空");
        } else {
            FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE).syncData(did, new DeviceSyncCallback() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel.syncGymData.1
                @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
                public void onSyncError(String did2, int type, String errorInfo) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    FitnessLogUtils.i("GymDeviceModel", "did= (" + did2 + "),连接后同步失败，errorInfo is ：" + errorInfo);
                }

                @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
                public void onSyncSuccess(String did2, int type, Object result) {
                    Intrinsics.checkNotNullParameter(did2, "did");
                    FitnessLogUtils.i("GymDeviceModel", "did= (" + did2 + "),连接后同步成功");
                }
            });
        }
    }

    public final boolean triggerGymLock(@Nullable FragmentActivity activity, @Nullable gs9[] gymSettingsList) {
        if (gymSettingsList == null) {
            return false;
        }
        for (gs9 gs9Var : gymSettingsList) {
            int i = gs9Var.c;
            if (i != 1) {
                if (i == 2 && gs9Var.d == 1) {
                    INSTANCE.showLockDialog(activity, c1j.A1, c1j.z1);
                    return true;
                }
            } else if (gs9Var.d == 1) {
                INSTANCE.showLockDialog(activity, c1j.w4, c1j.v4);
                return true;
            }
        }
        return false;
    }
}
