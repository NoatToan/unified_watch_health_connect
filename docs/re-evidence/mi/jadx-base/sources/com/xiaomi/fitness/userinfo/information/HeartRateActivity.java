package com.xiaomi.fitness.userinfo.information;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.userinfo.adapter.HeartRateAdapter;
import com.xiaomi.fitness.userinfo.information.HeartRateActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.fyi;
import defpackage.hki;
import defpackage.mjq;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001f\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/userinfo/information/HeartRateActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel;", "Lmjq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "showDialog", "()V", "", "recordHr", "I", "", "isAutoMeasure", "Z", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mHeartRateDialog", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "selectHr", "", "HEARTRATE_NAME", "Ljava/lang/String;", "REQ_HEARTRATE", "getREQ_HEARTRATE", "()I", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HeartRateActivity extends Hilt_HeartRateActivity<UserinfoSelectViewModel, mjq> {

    @Nullable
    private PickerDialog mHeartRateDialog;
    private final int selectHr;
    private int recordHr = 192;
    private boolean isAutoMeasure = true;

    @NotNull
    private final String HEARTRATE_NAME = "heartrate_dialog";
    private final int REQ_HEARTRATE = 40;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ mjq access$getMBinding(HeartRateActivity heartRateActivity) {
        return (mjq) heartRateActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserinfoSelectViewModel access$getMViewModel(HeartRateActivity heartRateActivity) {
        return (UserinfoSelectViewModel) heartRateActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$0(HeartRateActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Integer numValueOf = null;
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null);
        if (userProfile$default == null) {
            if (!this$0.isAutoMeasure && ((mjq) this$0.getMBinding()).A.getSwitch()) {
                ((mjq) this$0.getMBinding()).A.setSwitch(false);
            }
            return Unit.INSTANCE;
        }
        if (userProfile$default.getRecordMaxHrm() == null) {
            numValueOf = 0;
        } else {
            UserProfile.RecordMaxHrm recordMaxHrm = userProfile$default.getRecordMaxHrm();
            if (recordMaxHrm != null) {
                numValueOf = Integer.valueOf(recordMaxHrm.getHrm());
            }
        }
        if ((numValueOf == null || numValueOf.intValue() != 0) && numValueOf != null) {
            this$0.recordHr = numValueOf.intValue();
        }
        this$0.isAutoMeasure = ((mjq) this$0.getMBinding()).A.getSwitch();
        ((mjq) this$0.getMBinding()).B.setRemindText(String.format("%d%s", Integer.valueOf(this$0.recordHr), this$0.getResources().getQuantityString(fyi.d, this$0.recordHr)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(HeartRateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((mjq) this$0.getMBinding()).A.getSwitch()) {
            return;
        }
        this$0.showDialog();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.m;
    }

    public final int getREQ_HEARTRATE() {
        return this.REQ_HEARTRATE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.information.Hilt_HeartRateActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.recordHr = getIntent().getIntExtra(UserInfoConfigUtil.KEY_HEART_RATE, 192);
        this.isAutoMeasure = getIntent().getBooleanExtra(UserInfoConfigUtil.KEY_AUTO_HEART, true);
        setTitle(getString(o1j.l1));
        setTitleBackground(hki.g);
        ((mjq) getMBinding()).B.setRemindText(String.format(getResources().getQuantityString(fyi.m, this.recordHr), Integer.valueOf(this.recordHr)));
        if (this.isAutoMeasure) {
            ((mjq) getMBinding()).A.setSwitch(true);
            ((mjq) getMBinding()).B.showMore(false);
        } else {
            ((mjq) getMBinding()).A.setSwitch(false);
            ((mjq) getMBinding()).B.showMore(true);
        }
        ((mjq) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.userinfo.information.HeartRateActivity.onCreate.1
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public void onCheckedChanged(boolean getSwitch, ISwitchButton ISwitchButton) {
                int hrm;
                HeartRateActivity.access$getMBinding(HeartRateActivity.this).A.setSwitch(getSwitch);
                UserProfile userProfile$default = UserInfoManager.getUserProfile$default(HeartRateActivity.access$getMViewModel(HeartRateActivity.this).getMUserInfoManager(), false, 1, null);
                if (HeartRateActivity.access$getMBinding(HeartRateActivity.this).A.getSwitch()) {
                    hrm = userProfile$default.computeAutoMaxHr();
                    HeartRateActivity.access$getMBinding(HeartRateActivity.this).B.showMore(false);
                } else {
                    UserProfile.RecordMaxHrm recordMaxHrm = userProfile$default.getRecordMaxHrm();
                    hrm = recordMaxHrm != null ? recordMaxHrm.getHrm() : userProfile$default.computeAutoMaxHr();
                    HeartRateActivity.access$getMBinding(HeartRateActivity.this).B.showMore(true);
                }
                UserinfoSelectViewModel.sendProfile$default(HeartRateActivity.access$getMViewModel(HeartRateActivity.this), GuidePageUtil.INSTANCE.getTYPE_RECORD_MAX_HEART(), hrm, HeartRateActivity.access$getMBinding(HeartRateActivity.this).A.getSwitch(), null, 8, null);
            }
        });
        ((UserinfoSelectViewModel) getMViewModel()).getMChangeDatabaseUserProfile().observe(this, new HeartRateActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e5c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeartRateActivity.onCreate$lambda$0(this.f16278a, (Boolean) obj);
            }
        }));
        ((mjq) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: f5c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRateActivity.onCreate$lambda$1(this.f17420a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDialog() {
        UserProfile.RecordMaxHrm recordMaxHrm;
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        if (this.mHeartRateDialog == null) {
            PickerDialog pickerDialogCreate = new PickerDialog.b(this.HEARTRATE_NAME).setCustomLayoutId(nvi.f28482a).setPositiveText(o1j.T).setNegativeText(o1j.R).setDialogTitle(o1j.n0).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this.mHeartRateDialog = pickerDialogCreate;
            if (pickerDialogCreate != null && (bVarBuildUpon = pickerDialogCreate.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new HeartRateAdapter())) != null) {
                bVarC.create();
            }
            PickerDialog pickerDialog = this.mHeartRateDialog;
            if (pickerDialog != null) {
                pickerDialog.setRequestCode(this.REQ_HEARTRATE);
            }
        }
        PickerDialog pickerDialog2 = this.mHeartRateDialog;
        if (pickerDialog2 != null) {
            pickerDialog2.setFocusDescriptionRes(o1j.h1);
        }
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) getMViewModel()).getMUserInfoManager(), false, 1, null);
        if (userProfile$default != null && (recordMaxHrm = userProfile$default.getRecordMaxHrm()) != null) {
            int hrm = recordMaxHrm.getHrm();
            PickerDialog pickerDialog3 = this.mHeartRateDialog;
            if (pickerDialog3 != null) {
                pickerDialog3.setValue(hrm);
            }
        }
        PickerDialog pickerDialog4 = this.mHeartRateDialog;
        if (pickerDialog4 != null) {
            pickerDialog4.setPickerHintText(getString(o1j.V));
        }
        PickerDialog pickerDialog5 = this.mHeartRateDialog;
        if (pickerDialog5 != null) {
            pickerDialog5.showIfNeed(getSupportFragmentManager());
        }
        PickerDialog pickerDialog6 = this.mHeartRateDialog;
        Intrinsics.checkNotNull(pickerDialog6 != null ? pickerDialog6.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.information.HeartRateActivity.showDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                PickerDialog pickerDialog7 = HeartRateActivity.this.mHeartRateDialog;
                Float fValueOf = pickerDialog7 != null ? Float.valueOf(pickerDialog7.getValue()) : null;
                Intrinsics.checkNotNull(fValueOf);
                float fFloatValue = fValueOf.floatValue();
                if (which == -1) {
                    UserinfoSelectViewModel.sendProfile$default(HeartRateActivity.access$getMViewModel(HeartRateActivity.this), GuidePageUtil.INSTANCE.getTYPE_RECORD_MAX_HEART(), fFloatValue, HeartRateActivity.access$getMBinding(HeartRateActivity.this).A.getSwitch(), null, 8, null);
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean getSwitch) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, getSwitch);
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
    }
}
