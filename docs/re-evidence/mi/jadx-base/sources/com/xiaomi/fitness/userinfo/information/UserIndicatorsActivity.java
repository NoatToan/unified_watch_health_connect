package com.xiaomi.fitness.userinfo.information;

import android.app.ActivityOptions;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.widget.SingleChoiceDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import com.xiaomi.fitness.userinfo.adapter.HeightAdapter;
import com.xiaomi.fitness.userinfo.adapter.WeightAdapter;
import com.xiaomi.fitness.userinfo.bean.UserIndicatorsInfo;
import com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import defpackage.aje;
import defpackage.fkq;
import defpackage.hki;
import defpackage.hsi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import defpackage.yaa;
import defpackage.zp5;
import defpackage.zr3;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import miuix.androidbasewidget.widget.ProgressBar;
import miuix.pickerwidget.widget.DatePicker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\n*\u0002TZ\b\u0007\u0018\u0000 b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001bB\u0007¢\u0006\u0004\ba\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0007J'\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010*\u001a\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0014\u0010-\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0014\u0010.\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010\u001fR\u0014\u0010/\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010\u001fR$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bH\u0010\u001f\u001a\u0004\bI\u0010!R\u0014\u0010J\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010\u001fRV\u0010R\u001aB\u0012\u0004\u0012\u00020L\u0012\u0013\u0012\u00110\u0013¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0013\u0012\u00110A¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u00050Kj\b\u0012\u0004\u0012\u00020L`Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010%R\u0014\u0010`\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010%¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/userinfo/information/UserIndicatorsActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectViewModel;", "Lfkq;", "Lyaa;", "", "initParamsFromIntent", "()V", "", "userId", "locale", "getAccountCenterUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "handleAbilityCreatePlan", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lorg/joda/time/LocalDate;", "", "getZeroMills", "(Lorg/joda/time/LocalDate;)J", LifecycleConstantKt.ON_DESTROY, "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "REQ_GENDER", "I", "getREQ_GENDER", "()I", "REQ_HEIGHT", "getREQ_HEIGHT", "REQ_BIRTHDAY", "getREQ_BIRTHDAY", "REQ_WEIGHT", "getREQ_WEIGHT", "HEIGHT_NAME", "GENDER_NAME", "BIRTHDAY_NAME", "WEIGHT_NAME", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "xiaomiCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "setXiaomiCoreInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "Lcom/xiaomi/fitness/baseui/widget/SingleChoiceDialog;", "mGenderDialog", "Lcom/xiaomi/fitness/baseui/widget/SingleChoiceDialog;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mHeightDialog", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "Lzp5;", "mBirthdayDialog", "Lzp5;", "mWeightDialog", "Landroid/view/View;", "medicalIdCardView", "Landroid/view/View;", "getMedicalIdCardView", "()Landroid/view/View;", "setMedicalIdCardView", "(Landroid/view/View;)V", "MI_ACCOUNT_ACTIVITY_ACTION", "getMI_ACCOUNT_ACTIVITY_ACTION", "HOST_ACCOUNT", "Lkotlin/Function3;", "Lcom/xiaomi/fitness/userinfo/bean/UserIndicatorsInfo;", "Lkotlin/ParameterName;", "name", "position", "itemView", "Lcom/xiaomi/fitness/baseui/extension/OnItemListener;", "itemClickListener", "Lkotlin/jvm/functions/Function3;", "com/xiaomi/fitness/userinfo/information/UserIndicatorsActivity$mUserInfoListner$1", "mUserInfoListner", "Lcom/xiaomi/fitness/userinfo/information/UserIndicatorsActivity$mUserInfoListner$1;", "", "hasRegisterFinishReceiver", "Z", "com/xiaomi/fitness/userinfo/information/UserIndicatorsActivity$finishReceiver$1", "finishReceiver", "Lcom/xiaomi/fitness/userinfo/information/UserIndicatorsActivity$finishReceiver$1;", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUserIndicatorsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserIndicatorsActivity.kt\ncom/xiaomi/fitness/userinfo/information/UserIndicatorsActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,552:1\n54#2,3:553\n24#2:556\n59#2,6:557\n*S KotlinDebug\n*F\n+ 1 UserIndicatorsActivity.kt\ncom/xiaomi/fitness/userinfo/information/UserIndicatorsActivity\n*L\n140#1:553,3\n140#1:556\n140#1:557,6\n*E\n"})
public final class UserIndicatorsActivity extends Hilt_UserIndicatorsActivity<UserinfoSelectViewModel, fkq> implements yaa {

    @NotNull
    public static final String FROM_KEY = "from";
    private boolean hasRegisterFinishReceiver;
    private Function3<? super UserIndicatorsInfo, ? super Integer, ? super View, Unit> itemClickListener;

    @Nullable
    private zp5 mBirthdayDialog;

    @Nullable
    private SingleChoiceDialog mGenderDialog;

    @Nullable
    private PickerDialog mHeightDialog;

    @Nullable
    private PickerDialog mWeightDialog;
    public View medicalIdCardView;

    @Nullable
    private AccountCoreInfo xiaomiCoreInfo;

    @NotNull
    private final String TAG = "UserIndicatorsActivity";
    private final int REQ_GENDER = 10;
    private final int REQ_HEIGHT = 20;
    private final int REQ_BIRTHDAY = 30;
    private final int REQ_WEIGHT = 40;

    @NotNull
    private final String HEIGHT_NAME = "height_dialog";

    @NotNull
    private final String GENDER_NAME = "gender_dialog";

    @NotNull
    private final String BIRTHDAY_NAME = "birthday_dialog";

    @NotNull
    private final String WEIGHT_NAME = "weight_dialog";

    @NotNull
    private final String MI_ACCOUNT_ACTIVITY_ACTION = "android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS";

    @NotNull
    private final String HOST_ACCOUNT = "https://account.xiaomi.com";

    @NotNull
    private UserIndicatorsActivity$mUserInfoListner$1 mUserInfoListner = new OnUserInfoChange() { // from class: com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$mUserInfoListner$1
        @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
        public void userInfoChange(UserProfile userProfile) {
            Intrinsics.checkNotNullParameter(userProfile, "userProfile");
            Logger.i(this.this$0.getTAG(), "userInfoChange profile " + userProfile);
            UserIndicatorsActivity.access$getMViewModel(this.this$0).updateIndicatorList(true);
            UserinfoSelectViewModel userinfoSelectViewModelAccess$getMViewModel = UserIndicatorsActivity.access$getMViewModel(this.this$0);
            View medicalIdCardView = this.this$0.getMedicalIdCardView();
            LiveData<Boolean> firstInitStatusLiveData = UserIndicatorsActivity.access$getMViewModel(this.this$0).getFirstInitStatusLiveData();
            userinfoSelectViewModelAccess$getMViewModel.updateSubtitleAndRemindText(medicalIdCardView, firstInitStatusLiveData != null ? Intrinsics.areEqual(firstInitStatusLiveData.getValue(), Boolean.TRUE) : false);
        }
    };

    @NotNull
    private final UserIndicatorsActivity$finishReceiver$1 finishReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$finishReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.finish();
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity$onCreate$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002B\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\r"}, d2 = {"com/xiaomi/fitness/userinfo/information/UserIndicatorsActivity$onCreate$3", "Lcom/xiaomi/fitness/baseui/extension/OnItemListener;", "Lcom/xiaomi/fitness/userinfo/bean/UserIndicatorsInfo;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "itemView", "", "invoke", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 implements Function3<UserIndicatorsInfo, Integer, View, Unit> {
        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(UserIndicatorsActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            UserIndicatorsActivity.access$getMViewModel(this$0).sendProfile(GuidePageUtil.INSTANCE.getTYPE_BIRTHDAY(), 0.0f, UserInfoConfigUtil.INSTANCE.getDateToString(this$0.getZeroMills(new LocalDate(i, i2 + 1, i3)), "yyyy-MM-dd"), false, UserIndicatorsActivity.access$getMViewModel(this$0).getMUserInfoManager(), UserIndicatorsActivity.access$getMViewModel(this$0).getMAccountRequest());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(UserIndicatorsInfo userIndicatorsInfo, Integer num, View view) {
            invoke(userIndicatorsInfo, num.intValue(), view);
            return Unit.INSTANCE;
        }

        public void invoke(UserIndicatorsInfo p1, int position, View itemView) {
            PickerDialog.b bVarBuildUpon;
            PickerDialog.b bVarC;
            PickerDialog.b bVarBuildUpon2;
            PickerDialog.b bVarC2;
            SingleChoiceDialog singleChoiceDialog;
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            int i = 0;
            if (p1.getIndicators().equals(UserIndicatorsActivity.this.getString(o1j.t1))) {
                if (UserIndicatorsActivity.this.mGenderDialog == null) {
                    UserIndicatorsActivity userIndicatorsActivity = UserIndicatorsActivity.this;
                    userIndicatorsActivity.mGenderDialog = new SingleChoiceDialog.a(userIndicatorsActivity.GENDER_NAME).setCustomLayoutId(nvi.f28483b).setNegativeText(o1j.f28645b).setDialogTitle(o1j.t1).setCancelable(true).setCanceledOnTouchOutside(true).create();
                    int[] iArr = {o1j.d0, o1j.c0};
                    if (UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getFrom() == 2 && (singleChoiceDialog = UserIndicatorsActivity.this.mGenderDialog) != null) {
                        singleChoiceDialog.E(false);
                    }
                    SingleChoiceDialog singleChoiceDialog2 = UserIndicatorsActivity.this.mGenderDialog;
                    if (singleChoiceDialog2 != null) {
                        singleChoiceDialog2.G(iArr);
                    }
                    SingleChoiceDialog singleChoiceDialog3 = UserIndicatorsActivity.this.mGenderDialog;
                    if (singleChoiceDialog3 != null) {
                        singleChoiceDialog3.setRequestCode(UserIndicatorsActivity.this.getREQ_GENDER());
                    }
                }
                SingleChoiceDialog singleChoiceDialog4 = UserIndicatorsActivity.this.mGenderDialog;
                if (singleChoiceDialog4 != null) {
                    singleChoiceDialog4.showIfNeed(UserIndicatorsActivity.this.getSupportFragmentManager());
                }
                String sex = UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getMUserInfoManager(), false, 1, null).getSex();
                if (sex != null) {
                    i = TextUtils.equals("female", sex) ? 2 : 1;
                }
                SingleChoiceDialog singleChoiceDialog5 = UserIndicatorsActivity.this.mGenderDialog;
                if (singleChoiceDialog5 != null) {
                    singleChoiceDialog5.F(i);
                }
                Logger.d(UserIndicatorsActivity.this.getTAG(), "sex == " + sex);
                return;
            }
            if (p1.getIndicators().equals(UserIndicatorsActivity.this.getString(o1j.i0))) {
                LocalDate localDate = new LocalDate(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).birthStringToMillis());
                UserIndicatorsActivity userIndicatorsActivity2 = UserIndicatorsActivity.this;
                final UserIndicatorsActivity userIndicatorsActivity3 = UserIndicatorsActivity.this;
                zp5 zp5Var = new zp5(userIndicatorsActivity3, new zp5.d() { // from class: ogq
                    @Override // zp5.d
                    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                        UserIndicatorsActivity.AnonymousClass3.invoke$lambda$0(userIndicatorsActivity3, datePicker, i2, i3, i4);
                    }
                }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
                UserIndicatorsActivity userIndicatorsActivity4 = UserIndicatorsActivity.this;
                DatePicker datePickerH = zp5Var.H();
                zp5Var.setTitle(o1j.i0);
                long[] birthdayRange = UserIndicatorsActivity.access$getMViewModel(userIndicatorsActivity4).getBirthdayRange();
                datePickerH.setMinDate(birthdayRange != null ? birthdayRange[0] : 0L);
                long[] birthdayRange2 = UserIndicatorsActivity.access$getMViewModel(userIndicatorsActivity4).getBirthdayRange();
                datePickerH.setMaxDate(birthdayRange2 != null ? birthdayRange2[1] : 0L);
                userIndicatorsActivity2.mBirthdayDialog = zp5Var;
                zp5 zp5Var2 = UserIndicatorsActivity.this.mBirthdayDialog;
                if (zp5Var2 != null) {
                    zp5Var2.K(false);
                }
                zp5 zp5Var3 = UserIndicatorsActivity.this.mBirthdayDialog;
                if (zp5Var3 != null) {
                    zp5Var3.show();
                    return;
                }
                return;
            }
            if (p1.getIndicators().equals(UserIndicatorsActivity.this.getString(o1j.E))) {
                if (UserIndicatorsActivity.this.mHeightDialog == null) {
                    UserIndicatorsActivity userIndicatorsActivity5 = UserIndicatorsActivity.this;
                    userIndicatorsActivity5.mHeightDialog = new PickerDialog.b(userIndicatorsActivity5.HEIGHT_NAME).setCustomLayoutId(nvi.f28482a).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setDialogTitle(o1j.E).setCancelable(true).setCanceledOnTouchOutside(true).create();
                    PickerDialog pickerDialog = UserIndicatorsActivity.this.mHeightDialog;
                    if (pickerDialog != null && (bVarBuildUpon2 = pickerDialog.buildUpon()) != null && (bVarC2 = bVarBuildUpon2.c(new HeightAdapter())) != null) {
                        bVarC2.create();
                    }
                    PickerDialog pickerDialog2 = UserIndicatorsActivity.this.mHeightDialog;
                    if (pickerDialog2 != null) {
                        pickerDialog2.setRequestCode(UserIndicatorsActivity.this.getREQ_HEIGHT());
                    }
                }
                PickerDialog pickerDialog3 = UserIndicatorsActivity.this.mHeightDialog;
                if (pickerDialog3 != null) {
                    pickerDialog3.setFocusDescriptionRes(o1j.h1);
                }
                float height = ((int) UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getMUserInfoManager(), false, 1, null).getHeight()) == 0 ? 170.0f : UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getMUserInfoManager(), false, 1, null).getHeight();
                PickerDialog pickerDialog4 = UserIndicatorsActivity.this.mHeightDialog;
                if (pickerDialog4 != null) {
                    pickerDialog4.setValue((int) height);
                }
                PickerDialog pickerDialog5 = UserIndicatorsActivity.this.mHeightDialog;
                if (pickerDialog5 != null) {
                    pickerDialog5.setPickerHintText(UserIndicatorsActivity.this.getString(o1j.z));
                }
                PickerDialog pickerDialog6 = UserIndicatorsActivity.this.mHeightDialog;
                if (pickerDialog6 != null) {
                    pickerDialog6.showIfNeed(UserIndicatorsActivity.this.getSupportFragmentManager());
                    return;
                }
                return;
            }
            if (p1.getIndicators().equals(UserIndicatorsActivity.this.getString(o1j.l1))) {
                Intent intent = new Intent();
                UserProfile userProfile$default = UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getMUserInfoManager(), false, 1, null);
                UserProfile.RecordMaxHrm recordMaxHrm = userProfile$default.getRecordMaxHrm();
                intent.putExtra(UserInfoConfigUtil.KEY_HEART_RATE, recordMaxHrm != null ? Integer.valueOf(recordMaxHrm.getHrm()) : null);
                UserProfile.RecordMaxHrm recordMaxHrm2 = userProfile$default.getRecordMaxHrm();
                intent.putExtra(UserInfoConfigUtil.KEY_AUTO_HEART, StringsKt__StringsJVMKt.equals$default(recordMaxHrm2 != null ? recordMaxHrm2.getSource() : null, UserInfoConfigUtil.INSTANCE.getMODE_AUTO(), false, 2, null));
                intent.setClass(UserIndicatorsActivity.this, HeartRateActivity.class);
                UserIndicatorsActivity.this.startActivity(intent);
                return;
            }
            if (Intrinsics.areEqual(p1.getIndicators(), UserIndicatorsActivity.this.getString(o1j.j0)) || Intrinsics.areEqual(p1.getIndicators(), UserIndicatorsActivity.this.getString(o1j.k0))) {
                UserIndicatorsActivity.this.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goHrAndPaceAllRecordPage(null));
                return;
            }
            if (Intrinsics.areEqual(p1.getIndicators(), UserIndicatorsActivity.this.getString(o1j.L))) {
                if (UserIndicatorsActivity.this.mWeightDialog == null) {
                    UserIndicatorsActivity userIndicatorsActivity6 = UserIndicatorsActivity.this;
                    userIndicatorsActivity6.mWeightDialog = new PickerDialog.b(userIndicatorsActivity6.WEIGHT_NAME).setCustomLayoutId(nvi.f28482a).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setDialogTitle(o1j.L).setCancelable(true).setCanceledOnTouchOutside(true).create();
                    PickerDialog pickerDialog7 = UserIndicatorsActivity.this.mWeightDialog;
                    if (pickerDialog7 != null && (bVarBuildUpon = pickerDialog7.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new WeightAdapter())) != null) {
                        bVarC.create();
                    }
                    PickerDialog pickerDialog8 = UserIndicatorsActivity.this.mWeightDialog;
                    if (pickerDialog8 != null) {
                        pickerDialog8.setRequestCode(UserIndicatorsActivity.this.getREQ_WEIGHT());
                    }
                }
                float weight = ((int) UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getMUserInfoManager(), false, 1, null).getWeight()) == 0 ? 60.0f : UserInfoManager.getUserProfile$default(UserIndicatorsActivity.access$getMViewModel(UserIndicatorsActivity.this).getMUserInfoManager(), false, 1, null).getWeight();
                PickerDialog pickerDialog9 = UserIndicatorsActivity.this.mWeightDialog;
                if (pickerDialog9 != null) {
                    pickerDialog9.setValue((int) weight);
                }
                PickerDialog pickerDialog10 = UserIndicatorsActivity.this.mWeightDialog;
                if (pickerDialog10 != null) {
                    pickerDialog10.setPickerHintText(UserIndicatorsActivity.this.getString(o1j.n1));
                }
                PickerDialog pickerDialog11 = UserIndicatorsActivity.this.mWeightDialog;
                if (pickerDialog11 != null) {
                    pickerDialog11.showIfNeed(UserIndicatorsActivity.this.getSupportFragmentManager());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserinfoSelectViewModel access$getMViewModel(UserIndicatorsActivity userIndicatorsActivity) {
        return (UserinfoSelectViewModel) userIndicatorsActivity.getMViewModel();
    }

    private final String getAccountCenterUrl(String userId, String locale) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/pass/auth/security/home?_hideLogout=true&userId=%s&_locale=%s", Arrays.copyOf(new Object[]{this.HOST_ACCOUNT, userId, locale}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleAbilityCreatePlan() {
        DisplayUtil.setTranslucentStatusBar(this);
        ((fkq) getMBinding()).I.setTitle(o1j.f28646k);
        ((fkq) getMBinding()).M.setSpringBackEnable(false);
        LinearLayout commonUserInfo = ((fkq) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(commonUserInfo, "commonUserInfo");
        ViewExtKt.gone(commonUserInfo);
        ((fkq) getMBinding()).getRoot().setBackgroundColor(getColor(hki.c));
        setActionBarDisplayable(false);
        ((fkq) getMBinding()).I.hideMore();
        View view = ((fkq) getMBinding()).G;
        ((ProgressBar) view.findViewById(hsi.O0)).setProgress(25);
        ((TextView) view.findViewById(hsi.n1)).setText(view.getResources().getString(o1j.o));
        ((TextView) view.findViewById(hsi.y)).setText(view.getResources().getString(o1j.p));
        UserIndicatorsSelectListAdapter createAbilityPlanAdapter = ((UserinfoSelectViewModel) getMViewModel()).getCreateAbilityPlanAdapter();
        Function3<? super UserIndicatorsInfo, ? super Integer, ? super View, Unit> function3 = this.itemClickListener;
        if (function3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemClickListener");
            function3 = null;
        }
        createAbilityPlanAdapter.setOnItemClickListener(function3);
        ((fkq) getMBinding()).H.setItemAnimator(null);
        ((fkq) getMBinding()).H.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
        ((fkq) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: kgq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserIndicatorsActivity.handleAbilityCreatePlan$lambda$5(this.f23833a, view2);
            }
        });
        aje.b(this).c(this.finishReceiver, new IntentFilter(TrainingPlanConstantsKt.FINISH_CREATE_ACTION));
        this.hasRegisterFinishReceiver = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAbilityCreatePlan$lambda$5(UserIndicatorsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScopeExtKt.scopeNet$default(null, new UserIndicatorsActivity$handleAbilityCreatePlan$2$1(this$0, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initParamsFromIntent() {
        ((UserinfoSelectViewModel) getMViewModel()).setFrom(getIntent().getIntExtra("from", 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(UserIndicatorsActivity this$0, AccountCoreInfo accountCoreInfo) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.xiaomiCoreInfo = accountCoreInfo;
        String avatarAddress = accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null;
        if (avatarAddress != null && avatarAddress.length() != 0) {
            RoundImageView userPhoto = ((fkq) this$0.getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(userPhoto, "userPhoto");
            AccountCoreInfo accountCoreInfo2 = this$0.xiaomiCoreInfo;
            String avatarAddress2 = accountCoreInfo2 != null ? accountCoreInfo2.getAvatarAddress() : null;
            ImageLoader imageLoader = Coil.imageLoader(userPhoto.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(userPhoto.getContext()).data(avatarAddress2).target(userPhoto);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            imageLoader.enqueue(builderTarget.build());
        }
        if (this$0.xiaomiCoreInfo != null) {
            TextView textView = ((fkq) this$0.getMBinding()).O;
            AccountCoreInfo accountCoreInfo3 = this$0.xiaomiCoreInfo;
            Intrinsics.checkNotNull(accountCoreInfo3);
            String userName = accountCoreInfo3.getUserName();
            if (userName == null || userName.length() == 0) {
                string = this$0.getString(o1j.s1);
            } else {
                AccountCoreInfo accountCoreInfo4 = this$0.xiaomiCoreInfo;
                Intrinsics.checkNotNull(accountCoreInfo4);
                string = accountCoreInfo4.getUserName();
            }
            textView.setText(string);
        } else {
            ((fkq) this$0.getMBinding()).O.setText(this$0.getString(o1j.s1));
        }
        AccountCoreInfo accountCoreInfo5 = this$0.xiaomiCoreInfo;
        String nickName = accountCoreInfo5 != null ? accountCoreInfo5.getNickName() : null;
        Logger.d("xiaomiCoreInfo " + accountCoreInfo5 + " xiaomiCoreInfo!!.nickName=  " + nickName + " xiaomiCoreInfo!!.userName = " + this$0.xiaomiCoreInfo + "?.userNamemViewModel.mUserInfoManager is " + UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$2(UserIndicatorsActivity this$0, View view) {
        String accountCenterUrl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AccountManager.Companion companion = AccountManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).isUseSystem() && AccountManagerExtKt.getInstance(companion).isLogin()) {
            Intent intent = new Intent(this$0.MI_ACCOUNT_ACTIVITY_ACTION);
            intent.setFlags(268435456);
            intent.setPackage("com.xiaomi.account");
            this$0.startActivity(intent);
            return;
        }
        if (AccountManagerExtKt.getInstance(companion).isUseLocal() && AccountManagerExtKt.getInstance(companion).isLogin() && (accountCenterUrl = this$0.getAccountCenterUrl(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager().getUserId(), LocaleUtil.getCurrentLocale())) != null) {
            WebViewUtilKt.startWebView$default(accountCenterUrl, null, false, false, null, false, null, false, 254, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3(UserIndicatorsActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserinfoSelectViewModel userinfoSelectViewModel = (UserinfoSelectViewModel) this$0.getMViewModel();
        View medicalIdCardView = this$0.getMedicalIdCardView();
        Intrinsics.checkNotNull(bool);
        userinfoSelectViewModel.updateSubtitleAndRemindText(medicalIdCardView, bool.booleanValue());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.w;
    }

    @NotNull
    public final String getMI_ACCOUNT_ACTIVITY_ACTION() {
        return this.MI_ACCOUNT_ACTIVITY_ACTION;
    }

    @NotNull
    public final View getMedicalIdCardView() {
        View view = this.medicalIdCardView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medicalIdCardView");
        return null;
    }

    public final int getREQ_BIRTHDAY() {
        return this.REQ_BIRTHDAY;
    }

    public final int getREQ_GENDER() {
        return this.REQ_GENDER;
    }

    public final int getREQ_HEIGHT() {
        return this.REQ_HEIGHT;
    }

    public final int getREQ_WEIGHT() {
        return this.REQ_WEIGHT;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.c;
    }

    @Nullable
    public final AccountCoreInfo getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final long getZeroMills(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return TimeDateUtil.changZeroOfTheDay(localDate) * ((long) 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.information.Hilt_UserIndicatorsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParamsFromIntent();
        ((UserinfoSelectViewModel) getMViewModel()).getAccountCoreInfo();
        ((UserinfoSelectViewModel) getMViewModel()).getUserInfoFromWeb();
        ((UserinfoSelectViewModel) getMViewModel()).getXiaomiCoreInfo().observe(this, new UserIndicatorsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: egq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserIndicatorsActivity.onCreate$lambda$1(this.f16627a, (AccountCoreInfo) obj);
            }
        }));
        ((fkq) getMBinding()).L.setText(getString(o1j.v1) + " " + ((UserinfoSelectViewModel) getMViewModel()).getMUserInfoManager().getUserId());
        Function3<? super UserIndicatorsInfo, ? super Integer, ? super View, Unit> function3 = null;
        ((fkq) getMBinding()).J.setItemAnimator(null);
        ((fkq) getMBinding()).J.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).addUserInfoChangeListener(this.mUserInfoListner);
        ((fkq) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: ggq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserIndicatorsActivity.onCreate$lambda$2(this.f18967a, view);
            }
        });
        this.itemClickListener = new AnonymousClass3();
        UserIndicatorsSelectListAdapter adapter = ((UserinfoSelectViewModel) getMViewModel()).getAdapter();
        Function3<? super UserIndicatorsInfo, ? super Integer, ? super View, Unit> function4 = this.itemClickListener;
        if (function4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemClickListener");
        } else {
            function3 = function4;
        }
        adapter.setOnItemClickListener(function3);
        if (((UserinfoSelectViewModel) getMViewModel()).getFrom() == 2) {
            handleAbilityCreatePlan();
        } else {
            RelativeLayout abilityRoot = ((fkq) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(abilityRoot, "abilityRoot");
            ViewExtKt.gone(abilityRoot);
            setTitle(o1j.A0);
            setTitleBackground(hki.g);
        }
        try {
            setMedicalIdCardView(findViewById(hsi.U));
            final Intent intent = new Intent(this, (Class<?>) MedicalIdHomeActivity.class);
            new zr3(((fkq) getMBinding()).E) { // from class: com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity.onCreate.4
                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    UserIndicatorsActivity.this.startActivity(intent, activityOptions != null ? activityOptions.toBundle() : null);
                }
            }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f))).setTransitionBgColorRes(hki.f);
            LiveData<Boolean> firstInitStatusLiveData = ((UserinfoSelectViewModel) getMViewModel()).getFirstInitStatusLiveData();
            if (firstInitStatusLiveData != null) {
                firstInitStatusLiveData.observe(this, new UserIndicatorsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: igq
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return UserIndicatorsActivity.onCreate$lambda$3(this.f21122a, (Boolean) obj);
                    }
                }));
            }
        } catch (Exception e) {
            Logger.d(this.TAG, "medicalIdCardView failed to start. Error message " + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.information.Hilt_UserIndicatorsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ((fkq) getMBinding()).J.setAdapter(null);
        ((fkq) getMBinding()).H.setAdapter(null);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeUserInfoChangeListener(this.mUserInfoListner);
        if (this.hasRegisterFinishReceiver) {
            aje.b(this).e(this.finishReceiver);
            this.hasRegisterFinishReceiver = false;
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == this.REQ_GENDER) {
            int i = data.getInt("selected_option", 0);
            Logger.i(this.TAG, "onFragmentResult gender option = " + i + " ");
            if (i != 0) {
                UserinfoSelectViewModel.sendProfile$default((UserinfoSelectViewModel) getMViewModel(), GuidePageUtil.INSTANCE.getTYPE_SEX(), i, false, null, 8, null);
                return;
            }
            return;
        }
        if (requestCode == this.REQ_HEIGHT && resultCode == -1) {
            int i2 = data.getInt(PickerDialog.KEY_SELECTED_VALUE, 0);
            Logger.i(this.TAG, "onFragmentResult height " + i2);
            if (i2 > 0) {
                UserinfoSelectViewModel.sendProfile$default((UserinfoSelectViewModel) getMViewModel(), GuidePageUtil.INSTANCE.getTYPE_HEIGHT(), i2, false, null, 8, null);
                return;
            }
            return;
        }
        if (requestCode == this.REQ_WEIGHT && resultCode == -1) {
            int i3 = data.getInt(PickerDialog.KEY_SELECTED_VALUE, 0);
            Logger.i(this.TAG, "onFragmentResult weight " + i3);
            if (i3 > 0) {
                UserinfoSelectViewModel.sendProfile$default((UserinfoSelectViewModel) getMViewModel(), GuidePageUtil.INSTANCE.getTYPE_WEIGHT(), i3, false, null, 8, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((UserinfoSelectViewModel) getMViewModel()).getAccountCoreInfo();
    }

    public final void setMedicalIdCardView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.medicalIdCardView = view;
    }

    public final void setXiaomiCoreInfo(@Nullable AccountCoreInfo accountCoreInfo) {
        this.xiaomiCoreInfo = accountCoreInfo;
    }
}
