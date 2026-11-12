package com.xiaomi.fitness.about.setting;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.about.AboutViewModel;
import com.xiaomi.fitness.about.setting.SportHealthServiceActivity;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import defpackage.av6;
import defpackage.lzi;
import defpackage.ngi;
import defpackage.oy;
import defpackage.vv1;
import defpackage.xii;
import defpackage.yti;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/about/setting/SportHealthServiceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/about/AboutViewModel;", "Loy;", "", "showSportHealthCloudSyncSwitchDialog", "()V", "", "descriptionResId", "showShutDownCloudSynConfirmDialog", "(I)V", "removeSyncView", "", PaiData.LAST_SYNC_TIME, "", "formatLastTime", "(J)Ljava/lang/String;", "syncSportHealthDate", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Landroid/view/animation/Animation;", "mAnimation", "Landroid/view/animation/Animation;", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mCloudSynShutDownConfirmDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "sportHealthCloudSyncSwitchDialog", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportHealthServiceActivity extends Hilt_SportHealthServiceActivity<AboutViewModel, oy> {

    @Nullable
    private Animation mAnimation;

    @Nullable
    private CommonDialog<?> mCloudSynShutDownConfirmDialog;

    @Nullable
    private CommonDialog<?> sportHealthCloudSyncSwitchDialog;

    @NotNull
    private final String TAG = "SportHealthServiceActivity";

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mon
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportHealthServiceActivity.serverSyncer_delegate$lambda$0();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oy access$getMBinding(SportHealthServiceActivity sportHealthServiceActivity) {
        return (oy) sportHealthServiceActivity.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatLastTime(long lastSyncTime) {
        String dateYYYYMMddLocalFormat;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lastSyncTime <= 0) {
            return getString(lzi.R);
        }
        if (jCurrentTimeMillis - lastSyncTime <= TimeUnit.MINUTES.toMillis(1L)) {
            dateYYYYMMddLocalFormat = getString(lzi.p);
        } else if (lastSyncTime <= TimeUtils.getBeginOfToday() || lastSyncTime >= TimeUtils.INSTANCE.getEndOfToday()) {
            dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(lastSyncTime);
        } else {
            dateYYYYMMddLocalFormat = getString(lzi.j0) + " " + TimeUtils.formatDate(getString(lzi.T), Long.valueOf(lastSyncTime));
        }
        return getString(lzi.q, dateYYYYMMddLocalFormat);
    }

    private final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(SportHealthServiceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.syncSportHealthDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$4(final SportHealthServiceActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RegionPreference.INSTANCE.setSyncWeb(z);
        final boolean z2 = false;
        if (!z) {
            if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
                z2 = true;
            }
            ((AboutViewModel) this$0.getMViewModel()).queryProcessPkCountLiveData().observe(this$0, new SportHealthServiceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: non
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportHealthServiceActivity.onCreate$lambda$4$lambda$3(z2, this$0, (Integer) obj);
                }
            }));
            return;
        }
        Logger.d(this$0.TAG, "CHECK is " + z);
        ((oy) this$0.getMBinding()).G.setText(this$0.getString(lzi.O));
        ((oy) this$0.getMBinding()).G.setVisibility(0);
        this$0.syncSportHealthDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4$lambda$3(boolean z, final SportHealthServiceActivity this$0, final Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ((AboutViewModel) this$0.getMViewModel()).hasOngoingRelativeRelationshipLiveData().observe(this$0, new SportHealthServiceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oon
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportHealthServiceActivity.onCreate$lambda$4$lambda$3$lambda$2(num, this$0, (Boolean) obj);
                }
            }));
        } else if (num.intValue() > 0) {
            this$0.showShutDownCloudSynConfirmDialog(lzi.t);
        } else {
            this$0.removeSyncView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4$lambda$3$lambda$2(Integer num, SportHealthServiceActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue() && num.intValue() > 0) {
            this$0.showShutDownCloudSynConfirmDialog(lzi.s);
        } else if (num.intValue() > 0) {
            this$0.showShutDownCloudSynConfirmDialog(lzi.t);
        } else if (bool.booleanValue()) {
            this$0.showShutDownCloudSynConfirmDialog(lzi.G);
        } else {
            this$0.showSportHealthCloudSyncSwitchDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeSyncView() {
        ((oy) getMBinding()).G.setVisibility(8);
        ((oy) getMBinding()).C.setVisibility(8);
        ((oy) getMBinding()).C.clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    private final void showShutDownCloudSynConfirmDialog(int descriptionResId) {
        if (this.mCloudSynShutDownConfirmDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("not_save").setDialogDescription(descriptionResId).setPositiveText(lzi.n).setNegativeText(lzi.N).setCancelable(false).create();
            this.mCloudSynShutDownConfirmDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.setting.SportHealthServiceActivity.showShutDownCloudSynConfirmDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        SportHealthServiceActivity.this.removeSyncView();
                    }
                    if (which == -1) {
                        SportHealthServiceActivity.access$getMBinding(SportHealthServiceActivity.this).B.setSwitch(true);
                        RegionPreference.INSTANCE.setSyncWeb(true);
                    }
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        CommonDialog<?> commonDialog = this.mCloudSynShutDownConfirmDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    private final void showSportHealthCloudSyncSwitchDialog() {
        if (this.sportHealthCloudSyncSwitchDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sportHealthCloudSyncSwitchDialog").setDialogTitle(lzi.b0).setDialogDescription(lzi.a0).setPositiveText(lzi.i).setNegativeText(lzi.d).setCancelable(false).create();
            this.sportHealthCloudSyncSwitchDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.setting.SportHealthServiceActivity.showSportHealthCloudSyncSwitchDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        SportHealthServiceActivity.access$getMBinding(SportHealthServiceActivity.this).B.setSwitch(true);
                        RegionPreference.INSTANCE.setSyncWeb(true);
                    }
                    if (which == -1) {
                        SportHealthServiceActivity.this.removeSyncView();
                    }
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        CommonDialog<?> commonDialog = this.sportHealthCloudSyncSwitchDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncSportHealthDate() {
        if (((oy) getMBinding()).G.getText().equals(getString(lzi.K))) {
            startActivity(new Intent("android.settings.SETTINGS"));
            return;
        }
        ((oy) getMBinding()).G.setVisibility(8);
        ((oy) getMBinding()).C.setVisibility(0);
        ((oy) getMBinding()).C.startAnimation(this.mAnimation);
        ((oy) getMBinding()).H.setText(getString(lzi.Q));
        getServerSyncer().syncWithServer(true, "cloud_sync_switch", new FitnessServerSyncCallback() { // from class: com.xiaomi.fitness.about.setting.SportHealthServiceActivity.syncSportHealthDate.1
            @Override // com.xiaomi.fit.fitness.export.api.FitnessServerSyncCallback
            public void onSyncResult(boolean success) {
                AnyExtKt.main$default(null, new SportHealthServiceActivity$syncSportHealthDate$1$onSyncResult$1(success, SportHealthServiceActivity.this, null), 1, null);
            }
        });
        ElectronicScaleManager.DefaultImpls.syncRecord$default(ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE), null, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return yti.f40524b;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return vv1.f37253a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.about.setting.Hilt_SportHealthServiceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(lzi.u));
        setTitleBackground(xii.f39161b);
        this.mAnimation = AnimationUtils.loadAnimation(this, ngi.f27909a);
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            ((oy) getMBinding()).B.setSwitch(true);
            NetUtil netUtil = NetUtil.INSTANCE;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            if (netUtil.getNetWorkAvailable(application)) {
                ((oy) getMBinding()).G.setText(getString(lzi.O));
            } else {
                ((oy) getMBinding()).G.setText(getString(lzi.K));
            }
            ((oy) getMBinding()).G.setVisibility(0);
        } else {
            ((oy) getMBinding()).B.setSwitch(false);
            ((oy) getMBinding()).G.setVisibility(8);
        }
        ((oy) getMBinding()).H.setText(formatLastTime(FitnessDataPreference.INSTANCE.getSYNC_TIME()));
        ((oy) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: kon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportHealthServiceActivity.onCreate$lambda$1(this.f24059a, view);
            }
        });
        ((oy) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: lon
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SportHealthServiceActivity.onCreate$lambda$4(this.f25281a, z, iSwitchButton);
            }
        });
    }
}
