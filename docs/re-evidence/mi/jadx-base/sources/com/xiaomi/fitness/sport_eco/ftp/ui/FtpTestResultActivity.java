package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.FtpRiderInfoDialog;
import defpackage.av6;
import defpackage.e1j;
import defpackage.fs9;
import defpackage.fvi;
import defpackage.pl0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultViewModel;", "Lpl0;", "", "initBundle", "()V", "initTitleBar", "addButtonListener", "", "ftpResult", "", "readFtpLev", "(I)Ljava/lang/String;", "readEcoSettingConfig", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "mDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "I", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpTestResultActivity extends Hilt_FtpTestResultActivity<FtpTestResultViewModel, pl0> {

    @NotNull
    public static final String TAG = "FtpTestResultActivity";
    private int ftpResult = -1;
    public AccountManager mAccountManager;

    @Nullable
    private SportBasicReport mBasicReport;

    @Nullable
    private CommonDialog<DialogParams> mDialog;

    /* JADX WARN: Multi-variable type inference failed */
    private final void addButtonListener() {
        ((pl0) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: rra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestResultActivity.addButtonListener$lambda$3(this.f32821a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addButtonListener$lambda$3(FtpTestResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FtpTestResultViewModel) this$0.getMViewModel()).goSportReport(this$0, this$0.mBasicReport);
    }

    private final void initBundle() {
        this.mBasicReport = (SportBasicReport) getIntent().getSerializableExtra("sport_report");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitleBar() {
        setActionBarDisplayable(false);
        CommonDialog<DialogParams> commonDialogAddDialogCallback = new FtpRiderInfoDialog.Builder().create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultActivity.initTitleBar.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        this.mDialog = commonDialogAddDialogCallback;
        if (commonDialogAddDialogCallback != null) {
            commonDialogAddDialogCallback.setCancelable(false);
        }
        ((pl0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: sra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestResultActivity.initTitleBar$lambda$1(this.f33908a, view);
            }
        });
        ((pl0) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: tra
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpTestResultActivity.initTitleBar$lambda$2(this.f34960a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleBar$lambda$1(FtpTestResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleBar$lambda$2(FtpTestResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<DialogParams> commonDialog = this$0.mDialog;
        if (commonDialog == null || commonDialog.isShowing()) {
            return;
        }
        CommonDialog<DialogParams> commonDialog2 = this$0.mDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void readEcoSettingConfig() {
        ((FtpTestResultViewModel) getMViewModel()).readEcoSettingConfig(new Function2() { // from class: ura
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FtpTestResultActivity.readEcoSettingConfig$lambda$4(this.f36050a, ((Boolean) obj).booleanValue(), (fs9[]) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit readEcoSettingConfig$lambda$4(FtpTestResultActivity this$0, boolean z, fs9[] fs9VarArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i("FtpTestResultActivity", " readSettingConfig " + z);
        if (z) {
            this$0.ftpResult = ((FtpTestResultViewModel) this$0.getMViewModel()).getConfigValue(7);
            ((pl0) this$0.getMBinding()).B.setText(this$0.ftpResult + "W");
            ((pl0) this$0.getMBinding()).E.setText(this$0.readFtpLev(this$0.ftpResult));
            if (this$0.ftpResult > 0) {
                ((FtpTestResultViewModel) this$0.getMViewModel()).uploadFtpValue(this$0.ftpResult);
            }
        } else {
            ToastUtil.showShortToast(this$0.getString(e1j.u1));
        }
        return Unit.INSTANCE;
    }

    private final String readFtpLev(int ftpResult) {
        if (ftpResult >= 0 && ftpResult < 61) {
            return getString(e1j.b1);
        }
        if (61 <= ftpResult && ftpResult < 91) {
            return getString(e1j.c1);
        }
        if (91 <= ftpResult && ftpResult < 121) {
            return getString(e1j.d1);
        }
        if (121 <= ftpResult && ftpResult < 151) {
            return getString(e1j.e1);
        }
        if (161 <= ftpResult && ftpResult < 181) {
            return getString(e1j.f1);
        }
        if (181 > ftpResult || ftpResult >= 211) {
            return ftpResult > 210 ? getString(e1j.h1) : "N/A";
        }
        return getString(e1j.g1);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.g;
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

    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpTestResultActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        readEcoSettingConfig();
        initBundle();
        initTitleBar();
        addButtonListener();
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }
}
