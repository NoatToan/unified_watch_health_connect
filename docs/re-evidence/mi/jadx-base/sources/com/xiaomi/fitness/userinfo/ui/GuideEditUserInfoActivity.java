package com.xiaomi.fitness.userinfo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import androidx.annotation.RequiresApi;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.userinfo.adapter.HeightAdapter;
import com.xiaomi.fitness.userinfo.adapter.WeightAdapter;
import com.xiaomi.fitness.userinfo.ui.GuideEditUserInfoActivity;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.hki;
import defpackage.hsi;
import defpackage.ijq;
import defpackage.moi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import defpackage.yaa;
import defpackage.zp5;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import miuix.pickerwidget.widget.DatePicker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(24)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b8\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideEditUserInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lijq;", "Lyaa;", "", "initView", "()V", "setClickListener", "", "height", "setUserHeight", "(I)V", "", "weight", "setUserWeight", "(F)V", "", "birthDay", "setUserBirthDay", "(J)V", "Landroid/os/Bundle;", "savedInstanceState", "initOnCreate", "(Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "kotlin.jvm.PlatformType", "mHeightDialog$delegate", "Lkotlin/Lazy;", "getMHeightDialog", "()Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mHeightDialog", "mWeightDialog$delegate", "getMWeightDialog", "mWeightDialog", "Lzp5;", "mBirthdayDialog", "Lzp5;", "tmpHeight", "F", "tmpWeight", "tmpBirthDay", "J", "", "tmpSex", "Ljava/lang/String;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideEditUserInfoActivity extends Hilt_GuideEditUserInfoActivity<UserGuideViewModel, ijq> implements yaa {
    private zp5 mBirthdayDialog;

    /* JADX INFO: renamed from: mHeightDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHeightDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h5b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuideEditUserInfoActivity.mHeightDialog_delegate$lambda$0(this.f19708a);
        }
    });

    /* JADX INFO: renamed from: mWeightDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWeightDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: i5b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuideEditUserInfoActivity.mWeightDialog_delegate$lambda$1(this.f20799a);
        }
    });
    private long tmpBirthDay;
    private float tmpHeight;

    @NotNull
    private String tmpSex;
    private float tmpWeight;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GuideEditUserInfoFragment";
    private static final int REQ_HEIGHT = 20;
    private static final int REQ_WEIGHT = 40;

    @NotNull
    private static final String HEIGHT_NAME = "height_dialog";

    @NotNull
    private static final String WEIGHT_NAME = "weight_dialog";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideEditUserInfoActivity$Companion;", "", "<init>", "()V", "TAG", "", "REQ_HEIGHT", "", "getREQ_HEIGHT", "()I", "REQ_WEIGHT", "getREQ_WEIGHT", "HEIGHT_NAME", "WEIGHT_NAME", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getREQ_HEIGHT() {
            return GuideEditUserInfoActivity.REQ_HEIGHT;
        }

        public final int getREQ_WEIGHT() {
            return GuideEditUserInfoActivity.REQ_WEIGHT;
        }
    }

    public GuideEditUserInfoActivity() {
        UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
        this.tmpHeight = userInfoConfigUtil.getDefaultHeight();
        this.tmpWeight = userInfoConfigUtil.getDefaultWeight();
        this.tmpBirthDay = 631123200000L;
        this.tmpSex = "male";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserGuideViewModel access$getMViewModel(GuideEditUserInfoActivity guideEditUserInfoActivity) {
        return (UserGuideViewModel) guideEditUserInfoActivity.getMViewModel();
    }

    private final PickerDialog getMHeightDialog() {
        return (PickerDialog) this.mHeightDialog.getValue();
    }

    private final PickerDialog getMWeightDialog() {
        return (PickerDialog) this.mWeightDialog.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setTitle(o1j.A0);
        ((ijq) getMBinding()).C.setEndButtonIcon(moi.f27052k);
        ((ijq) getMBinding()).D.setEndButtonIcon(moi.f27052k);
        ((ijq) getMBinding()).B.setEndButtonIcon(moi.f27052k);
        ((ijq) getMBinding()).I.setText(o1j.t1);
        ((ijq) getMBinding()).G.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: j5b
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                GuideEditUserInfoActivity.initView$lambda$2(this.f22431a, radioGroup, i);
            }
        });
        ((ijq) getMBinding()).G.check(Intrinsics.areEqual(((UserGuideViewModel) getMViewModel()).getUserGender(), "male") ? hsi.Q0 : hsi.P0);
        setUserHeight((int) ((UserGuideViewModel) getMViewModel()).getUserHeight());
        setUserWeight(((UserGuideViewModel) getMViewModel()).getUserWeight());
        setUserBirthDay(((UserGuideViewModel) getMViewModel()).birthStringToMillis());
        LocalDate localDate = new LocalDate(this.tmpBirthDay);
        zp5 zp5Var = new zp5(this, new zp5.d() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditUserInfoActivity.initView.2
            @Override // zp5.d
            public void onDateSet(DatePicker p0, int year, int month, int day) {
                Logger.i(GuideEditUserInfoActivity.TAG, "select BirthDay " + year + "-" + month + "-" + day);
                GuideEditUserInfoActivity.this.setUserBirthDay(TimeDateUtil.changZeroOfTheDay(new LocalDate(year, month + 1, day)) * ((long) 1000));
            }
        }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        this.mBirthdayDialog = zp5Var;
        zp5Var.K(false);
        zp5 zp5Var2 = this.mBirthdayDialog;
        zp5 zp5Var3 = null;
        if (zp5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBirthdayDialog");
            zp5Var2 = null;
        }
        zp5Var2.setTitle(o1j.L0);
        zp5 zp5Var4 = this.mBirthdayDialog;
        if (zp5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBirthdayDialog");
            zp5Var4 = null;
        }
        DatePicker datePickerH = zp5Var4.H();
        UserInformationManager.Companion companion = UserInformationManager.INSTANCE;
        datePickerH.setMinDate(UserInformationManagerExtKt.getInstance(companion).getBirthdaySelectRange()[0]);
        zp5 zp5Var5 = this.mBirthdayDialog;
        if (zp5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBirthdayDialog");
        } else {
            zp5Var3 = zp5Var5;
        }
        zp5Var3.H().setMaxDate(UserInformationManagerExtKt.getInstance(companion).getBirthdaySelectRange()[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2(GuideEditUserInfoActivity this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tmpSex = i == hsi.Q0 ? "male" : "female";
        ((ijq) this$0.getMBinding()).F.setTextColor(this$0.getColor(i == hsi.Q0 ? hki.common_black : hki.i));
        ((ijq) this$0.getMBinding()).E.setTextColor(this$0.getColor(i == hsi.P0 ? hki.common_black : hki.i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PickerDialog mHeightDialog_delegate$lambda$0(GuideEditUserInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PickerDialog pickerDialogCreate = new PickerDialog.b(HEIGHT_NAME).setCustomLayoutId(nvi.f28482a).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setDialogTitle(o1j.E).setCancelable(true).setCanceledOnTouchOutside(true).create();
        pickerDialogCreate.buildUpon().c(new HeightAdapter()).create();
        pickerDialogCreate.setRequestCode(REQ_HEIGHT);
        pickerDialogCreate.setValue((int) this$0.tmpHeight);
        pickerDialogCreate.setPickerHintText(this$0.getString(o1j.z));
        return pickerDialogCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PickerDialog mWeightDialog_delegate$lambda$1(GuideEditUserInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PickerDialog pickerDialogCreate = new PickerDialog.b(WEIGHT_NAME).setCustomLayoutId(nvi.f28482a).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setDialogTitle(o1j.L).setCancelable(true).setCanceledOnTouchOutside(true).create();
        pickerDialogCreate.buildUpon().c(new WeightAdapter()).create();
        pickerDialogCreate.setRequestCode(REQ_WEIGHT);
        pickerDialogCreate.setValue((int) this$0.tmpWeight);
        pickerDialogCreate.setPickerHintText(this$0.getString(o1j.n1));
        return pickerDialogCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setClickListener() {
        ((ijq) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: d5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditUserInfoActivity.setClickListener$lambda$3(this.f15101a, view);
            }
        });
        ((ijq) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: e5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditUserInfoActivity.setClickListener$lambda$4(this.f16277a, view);
            }
        });
        ((ijq) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: f5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditUserInfoActivity.setClickListener$lambda$5(this.f17419a, view);
            }
        });
        ((ijq) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: g5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideEditUserInfoActivity.setClickListener$lambda$6(this.f18613a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$3(GuideEditUserInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMHeightDialog().setValue((int) this$0.tmpHeight);
        this$0.getMHeightDialog().showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$4(GuideEditUserInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMWeightDialog().setValue((int) this$0.tmpWeight);
        this$0.getMWeightDialog().showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$5(GuideEditUserInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalDate localDate = new LocalDate(this$0.tmpBirthDay);
        zp5 zp5Var = this$0.mBirthdayDialog;
        zp5 zp5Var2 = null;
        if (zp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBirthdayDialog");
            zp5Var = null;
        }
        zp5Var.M(localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        zp5 zp5Var3 = this$0.mBirthdayDialog;
        if (zp5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBirthdayDialog");
        } else {
            zp5Var2 = zp5Var3;
        }
        zp5Var2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setClickListener$lambda$6(final GuideEditUserInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((UserGuideViewModel) this$0.getMViewModel()).setHeight(this$0.tmpHeight);
        ((UserGuideViewModel) this$0.getMViewModel()).setWeight(this$0.tmpWeight);
        ((UserGuideViewModel) this$0.getMViewModel()).setBirthday(UserInfoConfigUtil.INSTANCE.getDateToString(this$0.tmpBirthDay, "yyyy-MM-dd"));
        ((UserGuideViewModel) this$0.getMViewModel()).setUserSex(this$0.tmpSex);
        ((UserGuideViewModel) this$0.getMViewModel()).saveAllProfile(new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.ui.GuideEditUserInfoActivity$setClickListener$4$1
            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onProfileToDBSuccess(boolean result) {
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError(int i) {
                SendProfileCallBack.DefaultImpls.onSendError(this, i);
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendSuccess(UserProfile profile) {
                Logger.i(GuideEditUserInfoActivity.TAG, "Save UserInfo Success");
                FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordWeight("xiaomiwear_app_manually", FitnessDateUtils.getCurrentTZOffsetInSec(), new WeightItem(System.currentTimeMillis() / ((long) 1000), this.this$0.tmpWeight, null, null, null, null, null, null, null, null, 1020, null));
                this.this$0.finish();
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError() {
                Logger.i(GuideEditUserInfoActivity.TAG, "Save UserInfo Failure");
                GuideEditUserInfoActivity.access$getMViewModel(this.this$0).revertUserProfile();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setUserBirthDay(long birthDay) {
        ((ijq) getMBinding()).B.setRemindText(UserInfoConfigUtil.INSTANCE.getDateToString(birthDay, "yyyy-MM-dd"));
        this.tmpBirthDay = birthDay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUserHeight(int height) {
        ((ijq) getMBinding()).C.setRemindText(height + getString(o1j.z));
        getMHeightDialog().setValue(height);
        this.tmpHeight = (float) height;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUserWeight(float weight) {
        ((ijq) getMBinding()).D.setRemindText(weight + getString(o1j.n1));
        getMWeightDialog().setValue((int) weight);
        this.tmpWeight = weight;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.f28484k;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity
    public void initOnCreate(@Nullable Bundle savedInstanceState) {
        super.initOnCreate(savedInstanceState);
        ((UserGuideViewModel) getMViewModel()).initUserProfile();
        initView();
        setClickListener();
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == REQ_HEIGHT && resultCode == -1) {
            int i = data.getInt(PickerDialog.KEY_SELECTED_VALUE, 0);
            Logger.i(TAG, "Select Height : " + i);
            if (i > 0) {
                setUserHeight(i);
                return;
            }
            return;
        }
        if (requestCode == REQ_WEIGHT && resultCode == -1) {
            int i2 = data.getInt(PickerDialog.KEY_SELECTED_VALUE, 0);
            Logger.i(TAG, "Select Weight : " + i2);
            if (i2 > 0) {
                setUserWeight(i2);
            }
        }
    }
}
