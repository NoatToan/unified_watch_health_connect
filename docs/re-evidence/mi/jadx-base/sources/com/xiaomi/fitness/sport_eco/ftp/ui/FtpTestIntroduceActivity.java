package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestIntroduceActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.kra;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestIntroduceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestIntroduceViewModel;", "Lkra;", "", "initTitleBar", "()V", "initTips", "addFtpStartButtonListener", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "localSportType", "Ljava/lang/String;", "getLocalSportType", "()Ljava/lang/String;", "setLocalSportType", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpTestIntroduceActivity extends Hilt_FtpTestIntroduceActivity<FtpTestIntroduceViewModel, kra> {

    @NotNull
    public static final String TAG = "FtpTestIntroduceActivity";

    @NotNull
    private String localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
    public AccountManager mAccountManager;

    /* JADX WARN: Multi-variable type inference failed */
    private final void addFtpStartButtonListener() {
        ((kra) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ira
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestIntroduceActivity.addFtpStartButtonListener$lambda$2(this.f22014a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addFtpStartButtonListener$lambda$2(FtpTestIntroduceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "状态1=" + ((FtpTestIntroduceViewModel) this$0.getMViewModel()).getSportState());
        EcoDeviceModel ecoDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (ecoDeviceModelCurGymDeviceModel == null || !ecoDeviceModelCurGymDeviceModel.isDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(e1j.y0);
            return;
        }
        if (((FtpTestIntroduceViewModel) this$0.getMViewModel()).getSportState() == 0) {
            Application app = AppUtil.getApp();
            Intent intent = new Intent(app, (Class<?>) FtpV2Activity.class);
            intent.addFlags(268435456);
            intent.putExtra(FtpTestIntroduceActivityKt.FTP_DEVICE_MODEL, SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
            app.startActivity(intent);
            this$0.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTips() {
        SpannableString spannableString = new SpannableString(getString(e1j.N1));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF612E")), 7, 13, 33);
        ((kra) getMBinding()).E.setText(spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitleBar() {
        setActionBarDisplayable(false);
        ((kra) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: jra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestIntroduceActivity.initTitleBar$lambda$0(this.f23056a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleBar$lambda$0(FtpTestIntroduceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.W;
    }

    @NotNull
    public final String getLocalSportType() {
        return this.localSportType;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpTestIntroduceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTitleBar();
        initTips();
        addFtpStartButtonListener();
    }

    public final void setLocalSportType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localSportType = str;
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }
}
