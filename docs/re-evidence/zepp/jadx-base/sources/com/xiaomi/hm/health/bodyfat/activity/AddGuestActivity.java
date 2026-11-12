package com.xiaomi.hm.health.bodyfat.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.p008lifecycle.ViewModelStore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.StatusBarUtil;
import com.xiaomi.hm.health.baseutil.UnitUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.AddGuestActivity;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityAddGuestBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseTypeOfScaleFragment;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.model.BFUserInfo;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.OnAddGuestChangeListener;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/AddGuestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "", "m", "", "height", "", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "v", "onClick", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "getNewAddGuestInfo", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityAddGuestBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityAddGuestBinding;", "binding", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lkotlin/Lazy;", "getLoadingDialog", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/xiaomi/hm/health/bodyfat/activity/GuestBaseInfoViewModel;", "c", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/bodyfat/activity/GuestBaseInfoViewModel;", "guestBaseInfo", GoogleApiAvailabilityLight.a, LogUtil.I, "measureType", "e", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "guestInfo", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "f", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "settingOfScaleViewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class AddGuestActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int BODY_FAT_MEASURE = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String GUEST_ONE_FOOT_NEED_SAFETY_WARNING = "ONE_FOOT_NEED_SAFETY_WARNING";

    @NotNull
    public static final String MEASURE_TYPE = "measure_type";
    public static final int ONE_FOOT_MEASURE = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivityAddGuestBinding binding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private UserInfos guestInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy guestBaseInfo = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int measureType = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingOfScaleViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingOfScaleViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.bodyfat.activity.AddGuestActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.bodyfat.activity.AddGuestActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/AddGuestActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "measureType", "", "startMe", "BODY_FAT_MEASURE", LogUtil.I, "", "GUEST_ONE_FOOT_NEED_SAFETY_WARNING", "Ljava/lang/String;", "MEASURE_TYPE", "ONE_FOOT_MEASURE", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, int measureType) {
            Intent intent = new Intent(context, (Class<?>) AddGuestActivity.class);
            intent.putExtra(AddGuestActivity.MEASURE_TYPE, measureType);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestBaseInfoViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<GuestBaseInfoViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GuestBaseInfoViewModel invoke() {
            return (GuestBaseInfoViewModel) ViewModelProviders.of(AddGuestActivity.this).get(GuestBaseInfoViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialog> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            AddGuestActivity addGuestActivity = AddGuestActivity.this;
            return LoadingDialog.showDialog(addGuestActivity, addGuestActivity.getString(R.string.tips_connecting));
        }
    }

    private final String l(int height) {
        if (height < 30 || height > 242) {
            return "";
        }
        if (BFCallback.getHMPersonInfo().getUnit() == 0) {
            return getString(R.string.person_info_key_height_unit_metric, new Object[]{String.valueOf(height)});
        }
        int iCm2inch = (int) UnitUtils.cm2inch(height, 0);
        int i = iCm2inch / 12;
        int i2 = iCm2inch % 12;
        return Intrinsics.stringPlus(getResources().getQuantityString(R.plurals.numberFoot, i, Integer.valueOf(i)), getResources().getQuantityString(R.plurals.numberInch, i2, Integer.valueOf(i2)));
    }

    private final void m() {
        if (BFKeeper.readBoolean(GUEST_ONE_FOOT_NEED_SAFETY_WARNING, true)) {
            new AlertDialogFragment.Builder(this).setTitle(R.string.one_foot_safety_warning_title).setMessage(R.string.one_foot_safety_warning_content).setNegativeButton(R.string.never_reminder, new DialogInterface.OnClickListener() { // from class: o8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AddGuestActivity.o(dialogInterface, i);
                }
            }).setPositiveButton(R.string.i_know, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: p8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AddGuestActivity.n(this.a, dialogInterface);
                }
            }).create().show(getSupportFragmentManager());
        } else {
            WeightConnectActivity.startMe(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AddGuestActivity addGuestActivity, DialogInterface dialogInterface) {
        WeightConnectActivity.startMe(addGuestActivity, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DialogInterface dialogInterface, int i) {
        BFKeeper.setBoolean(GUEST_ONE_FOOT_NEED_SAFETY_WARNING, false);
    }

    private final GuestBaseInfoViewModel p() {
        return (GuestBaseInfoViewModel) this.guestBaseInfo.getValue();
    }

    private final SettingOfScaleViewModel q() {
        return (SettingOfScaleViewModel) this.settingOfScaleViewModel.getValue();
    }

    private static final void r(final AddGuestActivity addGuestActivity, final int i) {
        if (i != 4) {
            BFCallback.getInstance().showAddGuest(addGuestActivity, new OnAddGuestChangeListener() { // from class: u8
                @Override // com.xiaomi.hm.health.bodyfat.utils.OnAddGuestChangeListener
                public final void onChange(BFUserInfo bFUserInfo) {
                    AddGuestActivity.s(i, addGuestActivity, bFUserInfo);
                }
            }, i);
        } else {
            addGuestActivity.getSupportFragmentManager().beginTransaction().setTransition(4097).addToBackStack(null).add(R.id.constraintLayout, new ChooseTypeOfScaleFragment()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(int i, AddGuestActivity addGuestActivity, BFUserInfo bFUserInfo) {
        UserInfos userInfos;
        if (i == 1) {
            UserInfos userInfos2 = addGuestActivity.guestInfo;
            if (userInfos2 != null) {
                userInfos2.setGender(Integer.valueOf(bFUserInfo.getGender()));
            }
        } else if (i == 2) {
            UserInfos userInfos3 = addGuestActivity.guestInfo;
            if (userInfos3 != null) {
                userInfos3.setHeight(Integer.valueOf(bFUserInfo.getHeight()));
            }
        } else if (i == 3) {
            UserInfos userInfos4 = addGuestActivity.guestInfo;
            if (userInfos4 != null) {
                userInfos4.setBirthday(bFUserInfo.getBirthday());
            }
        } else if (i == 4 && (userInfos = addGuestActivity.guestInfo) != null) {
            userInfos.setMeasureMode(bFUserInfo.getMeasureMode());
        }
        UserInfos userInfos5 = addGuestActivity.guestInfo;
        if (userInfos5 == null) {
            return;
        }
        addGuestActivity.p().setValue(userInfos5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(AddGuestActivity addGuestActivity, View view) {
        addGuestActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(AddGuestActivity addGuestActivity, UserInfos userInfos) {
        int i;
        int i2;
        if (userInfos == null) {
            return;
        }
        if (addGuestActivity.guestInfo == null) {
            addGuestActivity.guestInfo = userInfos;
        }
        ActivityAddGuestBinding activityAddGuestBinding = addGuestActivity.binding;
        Objects.requireNonNull(activityAddGuestBinding);
        boolean z = false;
        activityAddGuestBinding.ivBirth.setTips(userInfos.getBirthday().length() == 0 ? addGuestActivity.getResources().getString(R.string.user_add_guest_select) : Birthday.fromStr(userInfos.getBirthday()).toString(addGuestActivity));
        ActivityAddGuestBinding activityAddGuestBinding2 = addGuestActivity.binding;
        Objects.requireNonNull(activityAddGuestBinding2);
        activityAddGuestBinding2.ivHeight.setTips(userInfos.getHeight().intValue() < 0 ? addGuestActivity.getResources().getString(R.string.user_add_guest_select) : addGuestActivity.l(userInfos.getHeight().intValue()));
        ActivityAddGuestBinding activityAddGuestBinding3 = addGuestActivity.binding;
        Objects.requireNonNull(activityAddGuestBinding3);
        ListTile listTile = activityAddGuestBinding3.ivGender;
        Integer gender = userInfos.getGender();
        if (gender != null && gender.intValue() == 1) {
            i = R.string.person_info_set_gender_male;
        } else {
            i = (gender != null && gender.intValue() == 0) ? R.string.person_info_set_gender_female : R.string.user_add_guest_select;
        }
        listTile.setTips(addGuestActivity.getString(i));
        ActivityAddGuestBinding activityAddGuestBinding4 = addGuestActivity.binding;
        Objects.requireNonNull(activityAddGuestBinding4);
        ListTile listTile2 = activityAddGuestBinding4.ivMode;
        int measureMode = userInfos.getMeasureMode();
        if (measureMode != 0) {
            i2 = measureMode != 1 ? R.string.user_add_guest_select : R.string.text_sport_mode;
        } else {
            i2 = R.string.text_normal_mode;
        }
        listTile2.setTips(i2);
        ActivityAddGuestBinding activityAddGuestBinding5 = addGuestActivity.binding;
        Objects.requireNonNull(activityAddGuestBinding5);
        TextView textView = activityAddGuestBinding5.txBodyFat;
        if (userInfos.getHeight().intValue() > -1 && userInfos.getGender().intValue() > -1 && !TextUtils.isEmpty(userInfos.getBirthday())) {
            z = true;
        }
        textView.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(final AddGuestActivity addGuestActivity, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        new AlertDialogFragment.Builder(addGuestActivity).setMessage(R.string.guest_private_tips).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: m8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddGuestActivity.w(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.agree, new DialogInterface.OnClickListener() { // from class: n8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddGuestActivity.x(this.a, dialogInterface, i);
            }
        }).create().show(addGuestActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(AddGuestActivity addGuestActivity, DialogInterface dialogInterface, int i) {
        addGuestActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(AddGuestActivity addGuestActivity, DialogInterface dialogInterface, int i) {
        addGuestActivity.p().setNeedPrivateTip(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AddGuestActivity addGuestActivity, Integer num) {
        UserInfos userInfos = addGuestActivity.guestInfo;
        if (userInfos != null) {
            userInfos.setMeasureMode(num.intValue());
        }
        UserInfos userInfos2 = addGuestActivity.guestInfo;
        if (userInfos2 == null) {
            return;
        }
        addGuestActivity.p().setValue(userInfos2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final LoadingDialog getLoadingDialog() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    @Nullable
    public final UserInfos getNewAddGuestInfo() {
        return p().getBaseInfo().getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Integer numValueOf = v == null ? null : Integer.valueOf(v.getId());
        int i = R.id.iv_gender;
        if (numValueOf != null && numValueOf.intValue() == i) {
            r(this, 1);
            return;
        }
        int i2 = R.id.iv_height;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            r(this, 2);
            return;
        }
        int i3 = R.id.iv_birth;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            r(this, 3);
            return;
        }
        int i4 = R.id.iv_mode;
        if (numValueOf != null && numValueOf.intValue() == i4) {
            r(this, 4);
            return;
        }
        int i5 = R.id.tx_body_fat;
        if (numValueOf != null && numValueOf.intValue() == i5) {
            UserInfoManager.getManager().setGuest(p().getBaseInfo().getValue());
            int i6 = this.measureType;
            if (i6 == 1) {
                m();
                return;
            }
            if (i6 != 2) {
                return;
            }
            if (HMWeightUtils.isAmazfitScale()) {
                ConnectScaleActivity.Companion companion = ConnectScaleActivity.INSTANCE;
                companion.launch(this, companion.getTYPE_GUEST());
            } else {
                Intent intent = BFCallback.getInstance().enableMiDongFlavor() ? new Intent(this, (Class<?>) WeightingActivity.class) : new Intent(this, (Class<?>) HMWeightingActivity.class);
                intent.putExtra("IS_GUEST", true);
                startActivity(intent);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"WrongConstant"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        this.measureType = getIntent().getIntExtra(MEASURE_TYPE, 1);
        ActivityAddGuestBinding activityAddGuestBindingInflate = ActivityAddGuestBinding.inflate(getLayoutInflater());
        this.binding = activityAddGuestBindingInflate;
        Objects.requireNonNull(activityAddGuestBindingInflate);
        setContentView(activityAddGuestBindingInflate.getRoot());
        StatusBarUtil.setStatusColor(this, false, !RainbowUtils.isDarkMode(this), getResources().getColor(R.color.s38));
        ActivityAddGuestBinding activityAddGuestBinding = this.binding;
        Objects.requireNonNull(activityAddGuestBinding);
        activityAddGuestBinding.textTitle.setText(getString(this.measureType == 1 ? R.string.one_foot_eye_closure_measure : R.string.add_guest_info));
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(ContextCompat.getColor(this, R.color.s1));
        } else {
            DrawableCompat.setTint(DrawableCompat.wrap(drawable), ContextCompat.getColor(this, R.color.s1));
        }
        ActivityAddGuestBinding activityAddGuestBinding2 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding2);
        activityAddGuestBinding2.ibBack.setImageDrawable(drawable);
        ActivityAddGuestBinding activityAddGuestBinding3 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding3);
        activityAddGuestBinding3.ibBack.setOnClickListener(new View.OnClickListener() { // from class: q8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddGuestActivity.t(this.a, view);
            }
        });
        p().getBaseInfo().observe(this, new Observer() { // from class: r8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddGuestActivity.u(this.a, (UserInfos) obj);
            }
        });
        p().getNeedShowPrivateTip().observe(this, new Observer() { // from class: s8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddGuestActivity.v(this.a, (Boolean) obj);
            }
        });
        ActivityAddGuestBinding activityAddGuestBinding4 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding4);
        activityAddGuestBinding4.ivGender.setOnClickListener(this);
        ActivityAddGuestBinding activityAddGuestBinding5 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding5);
        activityAddGuestBinding5.ivHeight.setOnClickListener(this);
        ActivityAddGuestBinding activityAddGuestBinding6 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding6);
        activityAddGuestBinding6.ivBirth.setOnClickListener(this);
        ActivityAddGuestBinding activityAddGuestBinding7 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding7);
        activityAddGuestBinding7.ivMode.setOnClickListener(this);
        ActivityAddGuestBinding activityAddGuestBinding8 = this.binding;
        Objects.requireNonNull(activityAddGuestBinding8);
        activityAddGuestBinding8.txBodyFat.setOnClickListener(this);
        if (!HMWeightUtils.isAmazfitScale()) {
            ActivityAddGuestBinding activityAddGuestBinding9 = this.binding;
            Objects.requireNonNull(activityAddGuestBinding9);
            activityAddGuestBinding9.ivMode.setVisibility(8);
            ActivityAddGuestBinding activityAddGuestBinding10 = this.binding;
            Objects.requireNonNull(activityAddGuestBinding10);
            activityAddGuestBinding10.ivBirth.setDividerPadding(-1);
        }
        q().getMeasureMode().observe(this, new Observer() { // from class: t8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AddGuestActivity.y(this.a, (Integer) obj);
            }
        });
    }
}
