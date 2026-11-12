package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.widget.SingleChoiceDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.electronic.scale.UserIndicatorsActivity;
import com.xiaomi.fitness.electronic.scale.adapter.HeightAdapter;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleWebUrlsKt;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleWebViewUtilKt;
import com.xiaomi.fitness.electronic.scale.util.UserInfoConfigUtil;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.av1;
import defpackage.av6;
import defpackage.gui;
import defpackage.ld8;
import defpackage.lni;
import defpackage.rk0;
import defpackage.uno;
import defpackage.yaa;
import defpackage.zp5;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.pickerwidget.widget.DatePicker;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_INFO)
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\n*\u0001e\b\u0007\u0018\u0000 m2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001mB\u0007¢\u0006\u0004\bl\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0007J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010\u001eR$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010@\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010 \"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u001e\u001a\u0004\bL\u0010 \"\u0004\bM\u0010CR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010b\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010F\u001a\u0004\bc\u0010H\"\u0004\bd\u0010JR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010$R\u0014\u0010k\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010$¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/UserIndicatorsActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/UserinfoSelectViewModel;", "Lrk0;", "Lyaa;", "", "saveInfo", "()V", "saveBodyResult", "initView", "setData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "updateInfo", LifecycleConstantKt.ON_RESUME, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;", "event", "onBodyCompositionSDKMeasure", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "REQ_GENDER", "I", "getREQ_GENDER", "()I", "REQ_HEIGHT", "getREQ_HEIGHT", "HEIGHT_NAME", "GENDER_NAME", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "xiaomiCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "setXiaomiCoreInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "Lcom/xiaomi/fitness/baseui/widget/SingleChoiceDialog;", "mGenderDialog", "Lcom/xiaomi/fitness/baseui/widget/SingleChoiceDialog;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mHeightDialog", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "Lzp5;", "mBirthdayDialog", "Lzp5;", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mDeviceDid", "getMDeviceDid", "setMDeviceDid", "(Ljava/lang/String;)V", "", "mFromBind", "Z", "getMFromBind", "()Z", "setMFromBind", "(Z)V", "mMac", "getMMac", "setMMac", "", "userWeight", "F", "getUserWeight", "()F", "setUserWeight", "(F)V", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "getWeightResult", "()Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "setWeightResult", "(Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;)V", "weightUnit", "Ljava/lang/Integer;", "getWeightUnit", "()Ljava/lang/Integer;", "setWeightUnit", "(Ljava/lang/Integer;)V", "showNoBodyFatErrorDialog", "getShowNoBodyFatErrorDialog", "setShowNoBodyFatErrorDialog", "com/xiaomi/fitness/electronic/scale/UserIndicatorsActivity$mUserInfoListner$1", "mUserInfoListner", "Lcom/xiaomi/fitness/electronic/scale/UserIndicatorsActivity$mUserInfoListner$1;", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUserIndicatorsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserIndicatorsActivity.kt\ncom/xiaomi/fitness/electronic/scale/UserIndicatorsActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,425:1\n54#2,3:426\n24#2:429\n59#2,6:430\n*S KotlinDebug\n*F\n+ 1 UserIndicatorsActivity.kt\ncom/xiaomi/fitness/electronic/scale/UserIndicatorsActivity\n*L\n137#1:426,3\n137#1:429\n137#1:430,6\n*E\n"})
public final class UserIndicatorsActivity extends Hilt_UserIndicatorsActivity<UserinfoSelectViewModel, rk0> implements yaa {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_PAGE_UNIT = "KEY_PAGE_UNIT";

    @NotNull
    private static final String KEY_PAGE_WEIGHT = "KEY_PAGE_WEIGHT";

    @NotNull
    private static final String KEY_WEIGHT_RESULT = "KEY_WEIGHT_RESULT";

    @Nullable
    private zp5 mBirthdayDialog;

    @Nullable
    private String mDeviceDid;
    private boolean mFromBind;

    @Nullable
    private SingleChoiceDialog mGenderDialog;

    @Nullable
    private PickerDialog mHeightDialog;

    @Nullable
    private String mMac;
    public UserInfoManager mUserInfoManager;
    private volatile boolean showNoBodyFatErrorDialog;
    private float userWeight;

    @Nullable
    private WeightResult weightResult;

    @Nullable
    private Integer weightUnit;

    @Nullable
    private AccountCoreInfo xiaomiCoreInfo;

    @NotNull
    private final String TAG = "UserIndicatorsActivity";
    private final int REQ_GENDER = 10;
    private final int REQ_HEIGHT = 20;

    @NotNull
    private final String HEIGHT_NAME = "height_dialog";

    @NotNull
    private final String GENDER_NAME = "gender_dialog";

    @NotNull
    private UserIndicatorsActivity$mUserInfoListner$1 mUserInfoListner = new OnUserInfoChange() { // from class: com.xiaomi.fitness.electronic.scale.UserIndicatorsActivity$mUserInfoListner$1
        @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
        public void userInfoChange(UserProfile userProfile) {
            Intrinsics.checkNotNullParameter(userProfile, "userProfile");
            Logger.d(this.this$0.getTAG(), "USER INFO IS " + userProfile.getBirth());
            this.this$0.updateInfo();
        }
    };

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/UserIndicatorsActivity$Companion;", "", "<init>", "()V", "KEY_PAGE_WEIGHT", "", "KEY_WEIGHT_RESULT", "KEY_PAGE_UNIT", StatConstants.PARAM_START, "", "context", "Landroid/content/Context;", "mDid", "mWeight", "", "mUnit", "", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, float f, int i, WeightResult weightResult, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = 1;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                weightResult = null;
            }
            companion.start(context, str, f2, i3, weightResult);
        }

        public final void start(@NotNull Context context, @NotNull String mDid, float mWeight, int mUnit, @Nullable WeightResult weightResult) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mDid, "mDid");
            Intent intent = new Intent(context, (Class<?>) UserIndicatorsActivity.class);
            intent.putExtra("did", mDid);
            intent.putExtra("KEY_PAGE_WEIGHT", mWeight);
            intent.putExtra("KEY_WEIGHT_RESULT", weightResult);
            intent.putExtra("KEY_PAGE_UNIT", mUnit);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserinfoSelectViewModel access$getMViewModel(UserIndicatorsActivity userIndicatorsActivity) {
        return (UserinfoSelectViewModel) userIndicatorsActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ViewGroup.LayoutParams layoutParams = ((rk0) getMBinding()).B.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = DisplayUtil.getStatusBarHeight();
        ((rk0) getMBinding()).B.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(UserIndicatorsActivity this$0, AccountCoreInfo accountCoreInfo) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.xiaomiCoreInfo = accountCoreInfo;
        String avatarAddress = accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null;
        if (avatarAddress != null && avatarAddress.length() != 0) {
            RoundImageView userPhoto = ((rk0) this$0.getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(userPhoto, "userPhoto");
            AccountCoreInfo accountCoreInfo2 = this$0.xiaomiCoreInfo;
            String avatarAddress2 = accountCoreInfo2 != null ? accountCoreInfo2.getAvatarAddress() : null;
            ImageLoader imageLoader = Coil.imageLoader(userPhoto.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(userPhoto.getContext()).data(avatarAddress2).target(userPhoto);
            builderTarget.placeholder(lni.H);
            builderTarget.error(lni.H);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            imageLoader.enqueue(builderTarget.build());
        }
        if (this$0.xiaomiCoreInfo != null) {
            TextView textView = ((rk0) this$0.getMBinding()).J;
            AccountCoreInfo accountCoreInfo3 = this$0.xiaomiCoreInfo;
            Intrinsics.checkNotNull(accountCoreInfo3);
            String userName = accountCoreInfo3.getUserName();
            if (userName == null || userName.length() == 0) {
                string = this$0.getString(zzi.D5);
            } else {
                AccountCoreInfo accountCoreInfo4 = this$0.xiaomiCoreInfo;
                Intrinsics.checkNotNull(accountCoreInfo4);
                string = accountCoreInfo4.getUserName();
            }
            textView.setText(string);
        } else {
            ((rk0) this$0.getMBinding()).J.setText(this$0.getString(zzi.D5));
        }
        AccountCoreInfo accountCoreInfo5 = this$0.xiaomiCoreInfo;
        String nickName = accountCoreInfo5 != null ? accountCoreInfo5.getNickName() : null;
        Logger.d("xiaomiCoreInfo " + accountCoreInfo5 + " xiaomiCoreInfo!!.nickName=  " + nickName + " xiaomiCoreInfo!!.userName = " + this$0.xiaomiCoreInfo + "?.userNamemViewModel.mUserInfoManager is " + UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$2(UserIndicatorsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = 1;
        if (this$0.mGenderDialog == null) {
            SingleChoiceDialog singleChoiceDialogCreate = new SingleChoiceDialog.a(this$0.GENDER_NAME).setCustomLayoutId(gui.z0).setNegativeText(zzi.f41831b).setDialogTitle(zzi.E5).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this$0.mGenderDialog = singleChoiceDialogCreate;
            int[] iArr = {zzi.y5, zzi.w5};
            if (singleChoiceDialogCreate != null) {
                singleChoiceDialogCreate.G(iArr);
            }
            SingleChoiceDialog singleChoiceDialog = this$0.mGenderDialog;
            if (singleChoiceDialog != null) {
                singleChoiceDialog.setRequestCode(this$0.REQ_GENDER);
            }
        }
        SingleChoiceDialog singleChoiceDialog2 = this$0.mGenderDialog;
        if (singleChoiceDialog2 != null) {
            singleChoiceDialog2.showIfNeed(this$0.getSupportFragmentManager());
        }
        String sex = UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null).getSex();
        if (sex != null && Intrinsics.areEqual(sex, "female")) {
            i = 2;
        }
        SingleChoiceDialog singleChoiceDialog3 = this$0.mGenderDialog;
        if (singleChoiceDialog3 != null) {
            singleChoiceDialog3.F(i);
        }
        Logger.d(this$0.TAG, "sex == " + sex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$5(final UserIndicatorsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalDate localDate = new LocalDate(((UserinfoSelectViewModel) this$0.getMViewModel()).birthStringToMillis());
        zp5 zp5Var = new zp5(this$0, new zp5.d() { // from class: fgq
            @Override // zp5.d
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                UserIndicatorsActivity.onCreate$lambda$5$lambda$3(this.f17772a, datePicker, i, i2, i3);
            }
        }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        DatePicker datePickerH = zp5Var.H();
        zp5Var.setTitle(zzi.B5);
        long[] birthdayRange = ((UserinfoSelectViewModel) this$0.getMViewModel()).getBirthdayRange();
        datePickerH.setMinDate(birthdayRange != null ? birthdayRange[0] : 0L);
        long[] birthdayRange2 = ((UserinfoSelectViewModel) this$0.getMViewModel()).getBirthdayRange();
        datePickerH.setMaxDate(birthdayRange2 != null ? birthdayRange2[1] : 0L);
        this$0.mBirthdayDialog = zp5Var;
        zp5Var.K(false);
        zp5 zp5Var2 = this$0.mBirthdayDialog;
        if (zp5Var2 != null) {
            zp5Var2.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$5$lambda$3(UserIndicatorsActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((UserinfoSelectViewModel) this$0.getMViewModel()).sendProfile(8, 0.0f, UserInfoConfigUtil.INSTANCE.getDateToString(DateUtil.INSTANCE.getZeroMills(new LocalDate(i, i2 + 1, i3)), "yyyy-MM-dd"), false, ((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), ((UserinfoSelectViewModel) this$0.getMViewModel()).getMAccountRequest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$6(final UserIndicatorsActivity this$0, View view) {
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mHeightDialog == null) {
            PickerDialog pickerDialogCreate = new PickerDialog.b(this$0.HEIGHT_NAME).setCustomLayoutId(gui.y0).setPositiveText(zzi.A5).setNegativeText(zzi.f41831b).setDialogTitle(zzi.x5).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this$0.mHeightDialog = pickerDialogCreate;
            if (pickerDialogCreate != null && (bVarBuildUpon = pickerDialogCreate.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new HeightAdapter())) != null) {
                bVarC.create();
            }
            PickerDialog pickerDialog = this$0.mHeightDialog;
            if (pickerDialog != null) {
                pickerDialog.setRequestCode(this$0.REQ_HEIGHT);
            }
        }
        PickerDialog pickerDialog2 = this$0.mHeightDialog;
        if (pickerDialog2 != null) {
            pickerDialog2.setFocusDescriptionRes(zzi.C5);
        }
        float height = ((int) UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null).getHeight()) == 0 ? 170.0f : UserInfoManager.getUserProfile$default(((UserinfoSelectViewModel) this$0.getMViewModel()).getMUserInfoManager(), false, 1, null).getHeight();
        PickerDialog pickerDialog3 = this$0.mHeightDialog;
        if (pickerDialog3 != null) {
            pickerDialog3.setValue((int) height);
        }
        PickerDialog pickerDialog4 = this$0.mHeightDialog;
        if (pickerDialog4 != null) {
            pickerDialog4.setPickerHintText(this$0.getString(zzi.w0));
        }
        PickerDialog pickerDialog5 = this$0.mHeightDialog;
        if (pickerDialog5 != null) {
            pickerDialog5.showIfNeed(this$0.getSupportFragmentManager());
        }
        PickerDialog pickerDialog6 = this$0.mHeightDialog;
        Intrinsics.checkNotNull(pickerDialog6 != null ? pickerDialog6.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.UserIndicatorsActivity$onCreate$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                PickerDialog pickerDialog7 = this.this$0.mHeightDialog;
                Float fValueOf = pickerDialog7 != null ? Float.valueOf(pickerDialog7.getValue()) : null;
                Intrinsics.checkNotNull(fValueOf);
                float fFloatValue = fValueOf.floatValue();
                if (which == -1) {
                    UserinfoSelectViewModel.sendProfile$default(UserIndicatorsActivity.access$getMViewModel(this.this$0), 1, fFloatValue, false, null, 8, null);
                }
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(UserIndicatorsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.saveInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveBodyResult() {
        int[] iArr = new int[12];
        WeightResult weightResult = this.weightResult;
        Integer numValueOf = weightResult != null ? Integer.valueOf(weightResult.getMeasuringImpedance1()) : null;
        Intrinsics.checkNotNull(numValueOf);
        iArr[0] = numValueOf.intValue();
        WeightResult weightResult2 = this.weightResult;
        Integer numValueOf2 = weightResult2 != null ? Integer.valueOf(weightResult2.getMeasuringImpedance2()) : null;
        Intrinsics.checkNotNull(numValueOf2);
        iArr[1] = numValueOf2.intValue();
        WeightResult weightResult3 = this.weightResult;
        Integer numValueOf3 = weightResult3 != null ? Integer.valueOf(weightResult3.getMeasuringImpedance3()) : null;
        Intrinsics.checkNotNull(numValueOf3);
        iArr[2] = numValueOf3.intValue();
        WeightResult weightResult4 = this.weightResult;
        Integer numValueOf4 = weightResult4 != null ? Integer.valueOf(weightResult4.getMeasuringImpedance4()) : null;
        Intrinsics.checkNotNull(numValueOf4);
        iArr[3] = numValueOf4.intValue();
        WeightResult weightResult5 = this.weightResult;
        Integer numValueOf5 = weightResult5 != null ? Integer.valueOf(weightResult5.getMeasuringImpedance5()) : null;
        Intrinsics.checkNotNull(numValueOf5);
        iArr[4] = numValueOf5.intValue();
        WeightResult weightResult6 = this.weightResult;
        Integer numValueOf6 = weightResult6 != null ? Integer.valueOf(weightResult6.getMeasuringImpedance6()) : null;
        Intrinsics.checkNotNull(numValueOf6);
        iArr[5] = numValueOf6.intValue();
        WeightResult weightResult7 = this.weightResult;
        Integer numValueOf7 = weightResult7 != null ? Integer.valueOf(weightResult7.getMeasuringImpedance7()) : null;
        Intrinsics.checkNotNull(numValueOf7);
        iArr[6] = numValueOf7.intValue();
        WeightResult weightResult8 = this.weightResult;
        Integer numValueOf8 = weightResult8 != null ? Integer.valueOf(weightResult8.getMeasuringImpedance8()) : null;
        Intrinsics.checkNotNull(numValueOf8);
        iArr[7] = numValueOf8.intValue();
        WeightResult weightResult9 = this.weightResult;
        Integer numValueOf9 = weightResult9 != null ? Integer.valueOf(weightResult9.getMeasuringImpedance9()) : null;
        Intrinsics.checkNotNull(numValueOf9);
        iArr[8] = numValueOf9.intValue();
        WeightResult weightResult10 = this.weightResult;
        Integer numValueOf10 = weightResult10 != null ? Integer.valueOf(weightResult10.getMeasuringImpedance10()) : null;
        Intrinsics.checkNotNull(numValueOf10);
        iArr[9] = numValueOf10.intValue();
        WeightResult weightResult11 = this.weightResult;
        Integer numValueOf11 = weightResult11 != null ? Integer.valueOf(weightResult11.getMeasuringImpedance11()) : null;
        Intrinsics.checkNotNull(numValueOf11);
        iArr[10] = numValueOf11.intValue();
        WeightResult weightResult12 = this.weightResult;
        Integer numValueOf12 = weightResult12 != null ? Integer.valueOf(weightResult12.getMeasuringImpedance12()) : null;
        Intrinsics.checkNotNull(numValueOf12);
        iArr[11] = numValueOf12.intValue();
        UserinfoSelectViewModel userinfoSelectViewModel = (UserinfoSelectViewModel) getMViewModel();
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        String avatarAddress = companion.getInstance().getAvatarAddress();
        String nickName = companion.getInstance().getNickName();
        WeightResult weightResult13 = this.weightResult;
        Integer numValueOf13 = weightResult13 != null ? Integer.valueOf(weightResult13.getHeartRate()) : null;
        Intrinsics.checkNotNull(numValueOf13);
        int iIntValue = numValueOf13.intValue();
        int sex = companion.getInstance().getSex();
        int age = companion.getInstance().getAge();
        float height = companion.getInstance().getHeight();
        WeightManager companion2 = WeightManager.INSTANCE.getInstance();
        float f = this.userWeight;
        Integer num = this.weightUnit;
        Intrinsics.checkNotNull(num);
        userinfoSelectViewModel.addBodyCompositionWeightRecord(str, "yunmai.scales.ms3001", 1, userId, 0L, avatarAddress, nickName, iIntValue, sex, age, height, companion2.convertToKg(f, num.intValue()), iArr, System.currentTimeMillis(), true, null, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.UserIndicatorsActivity.saveBodyResult.1
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() {
                Logger.i(UserIndicatorsActivity.this.getTAG(), "saveBodyResult success " + UserIndicatorsActivity.this.getShowNoBodyFatErrorDialog());
                Bundle bundle = new Bundle();
                bundle.putBoolean("showNoBodyFatErrorDialog", UserIndicatorsActivity.this.getShowNoBodyFatErrorDialog());
                UserIndicatorsActivity.this.startActivity(HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getWeightPageIntent(bundle, true));
                UserIndicatorsActivity.this.finish();
            }
        });
        UserinfoSelectViewModel userinfoSelectViewModel2 = (UserinfoSelectViewModel) getMViewModel();
        String str2 = this.mDeviceDid;
        Intrinsics.checkNotNull(str2);
        float f2 = this.userWeight;
        Integer num2 = this.weightUnit;
        Intrinsics.checkNotNull(num2);
        userinfoSelectViewModel2.updateMainUser(str2, f2, num2.intValue());
    }

    private final void saveInfo() {
        if (this.weightResult != null) {
            saveBodyResult();
            return;
        }
        String userGuideUrl = ElectronicScaleWebUrlsKt.getUserGuideUrl("yunmai.scales.ms3001");
        String string = getString(zzi.H3);
        String str = this.mDeviceDid;
        Intrinsics.checkNotNull(str);
        String str2 = this.mMac;
        Intrinsics.checkNotNull(str2);
        ElectronicScaleWebViewUtilKt.startEcoWebView$default(userGuideUrl, string, true, false, null, str, str2, 24, null);
        finish();
    }

    private final void setData() {
        this.mDeviceDid = getIntent().getStringExtra("did");
        this.mFromBind = getIntent().getBooleanExtra(ElectronicScaleManagerExtKt.PARAM_FROM_BIND, false);
        this.mMac = getIntent().getStringExtra("mac");
        this.userWeight = getIntent().getFloatExtra("KEY_PAGE_WEIGHT", 0.0f);
        this.weightResult = (WeightResult) getIntent().getSerializableExtra("KEY_WEIGHT_RESULT");
        this.weightUnit = Integer.valueOf(getIntent().getIntExtra("KEY_PAGE_UNIT", 1));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.u;
    }

    @Nullable
    public final String getMDeviceDid() {
        return this.mDeviceDid;
    }

    public final boolean getMFromBind() {
        return this.mFromBind;
    }

    @Nullable
    public final String getMMac() {
        return this.mMac;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    public final int getREQ_GENDER() {
        return this.REQ_GENDER;
    }

    public final int getREQ_HEIGHT() {
        return this.REQ_HEIGHT;
    }

    public final boolean getShowNoBodyFatErrorDialog() {
        return this.showNoBodyFatErrorDialog;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final float getUserWeight() {
        return this.userWeight;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Nullable
    public final WeightResult getWeightResult() {
        return this.weightResult;
    }

    @Nullable
    public final Integer getWeightUnit() {
        return this.weightUnit;
    }

    @Nullable
    public final AccountCoreInfo getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onBodyCompositionSDKMeasure(@NotNull ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.showNoBodyFatErrorDialog = !event.getIsSuccess();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.Hilt_UserIndicatorsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ld8.c().p(this);
        setActionBarDisplayable(false);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitle("");
        initView();
        setData();
        ((UserinfoSelectViewModel) getMViewModel()).getAccountCoreInfo();
        ((UserinfoSelectViewModel) getMViewModel()).getUserInfoFromWeb();
        ((UserinfoSelectViewModel) getMViewModel()).getXiaomiCoreInfo().observe(this, new UserIndicatorsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hgq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserIndicatorsActivity.onCreate$lambda$1(this.f20058a, (AccountCoreInfo) obj);
            }
        }));
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).addUserInfoChangeListener(this.mUserInfoListner);
        ((rk0) getMBinding()).I.setText(getString(zzi.F5) + " " + ((UserinfoSelectViewModel) getMViewModel()).getMUserInfoManager().getUserId());
        ((rk0) getMBinding()).F.setTitle(getString(zzi.E5));
        ((rk0) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: jgq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserIndicatorsActivity.onCreate$lambda$2(this.f22778a, view);
            }
        });
        ((rk0) getMBinding()).D.setTitle(getString(zzi.B5));
        ((rk0) getMBinding()).D.getMTvFeatureItemRemind().setMaxWidth(DisplayUtil.dp2px(this, 300.0f));
        ((rk0) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: lgq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserIndicatorsActivity.onCreate$lambda$5(this.f25055a, view);
            }
        });
        ((rk0) getMBinding()).E.setTitle(getString(zzi.x5));
        ((rk0) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: mgq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserIndicatorsActivity.onCreate$lambda$6(this.f26169a, view);
            }
        });
        updateInfo();
        ((rk0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ngq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserIndicatorsActivity.onCreate$lambda$7(this.f27916a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_UserIndicatorsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeUserInfoChangeListener(this.mUserInfoListner);
        ld8.c().r(this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == this.REQ_GENDER) {
            int i = data.getInt("selected_option", 0);
            Logger.d(this.TAG, "option = " + i + " ");
            if (i != 0) {
                UserinfoSelectViewModel.sendProfile$default((UserinfoSelectViewModel) getMViewModel(), 7, i, false, null, 8, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((UserinfoSelectViewModel) getMViewModel()).getAccountCoreInfo();
    }

    public final void setMDeviceDid(@Nullable String str) {
        this.mDeviceDid = str;
    }

    public final void setMFromBind(boolean z) {
        this.mFromBind = z;
    }

    public final void setMMac(@Nullable String str) {
        this.mMac = str;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setShowNoBodyFatErrorDialog(boolean z) {
        this.showNoBodyFatErrorDialog = z;
    }

    public final void setUserWeight(float f) {
        this.userWeight = f;
    }

    public final void setWeightResult(@Nullable WeightResult weightResult) {
        this.weightResult = weightResult;
    }

    public final void setWeightUnit(@Nullable Integer num) {
        this.weightUnit = num;
    }

    public final void setXiaomiCoreInfo(@Nullable AccountCoreInfo accountCoreInfo) {
        this.xiaomiCoreInfo = accountCoreInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateInfo() {
        RightArrowSingleLineTextView rightArrowSingleLineTextView = ((rk0) getMBinding()).F;
        UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
        String string = getString(zzi.E5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        rightArrowSingleLineTextView.setRemindText(userInfoConfigUtil.getUserInfoValue(string, getMUserInfoManager()));
        RightArrowSingleLineTextView rightArrowSingleLineTextView2 = ((rk0) getMBinding()).D;
        String string2 = getString(zzi.B5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        rightArrowSingleLineTextView2.setRemindText(userInfoConfigUtil.getUserInfoValue(string2, getMUserInfoManager()));
        RightArrowSingleLineTextView rightArrowSingleLineTextView3 = ((rk0) getMBinding()).E;
        String string3 = getString(zzi.x5);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        rightArrowSingleLineTextView3.setRemindText(userInfoConfigUtil.getUserInfoValue(string3, getMUserInfoManager()));
    }
}
