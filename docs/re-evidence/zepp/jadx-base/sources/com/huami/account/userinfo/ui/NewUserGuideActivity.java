package com.huami.account.userinfo.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.UserLegalInfoComponents;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.event.EventAccountStatus;
import com.huami.account.event.EventMinorAuthMailSent;
import com.huami.account.keeper.FrozenAccountKeeper;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.legal.DefaultUserInfoLegalCallback;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.account.usecase.CheckThirdPartNicknameUseCase;
import com.huami.account.usecase.DisplayIDToNickname;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.bean.Birthday;
import com.huami.account.userinfo.databinding.UserInfoActivityNewUserGuideBinding;
import com.huami.account.userinfo.di.IUserinfoDelegate;
import com.huami.account.userinfo.goal.GoalFunctionsKt;
import com.huami.account.userinfo.manager.AuditUserInfoManager;
import com.huami.account.userinfo.ui.NewUserGuideActivity;
import com.huami.account.userinfo.usecase.DisplayDefaultFieldUseCase;
import com.huami.account.userinfo.usecase.SetupDefaultFieldsUseCase;
import com.huami.account.userinfo.usecase.SetupDefaultUnitUseCase;
import com.huami.account.userinfo.utils.Utils;
import com.huami.account.userinfo.utils.WeightUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.statusbar.StatusBarCompat;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.passport.AccountManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.web.service.event.EventWebActivityFinish;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import de.greenrobot.event.EventBus;
import io.netty.util.internal.StringUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 T2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u001c\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0002J\u0012\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0014J\b\u0010&\u001a\u00020\u0002H\u0014J\b\u0010'\u001a\u00020\u0002H\u0014J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010>\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020 8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020 8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010N¨\u0006U"}, d2 = {"Lcom/huami/account/userinfo/ui/NewUserGuideActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initTitle", "initView", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "fragment", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "C", "L", "", "name", "M", LogUtil.I, "H", "J", "P", "K", "G", "", "msg", "showLoginDialog", "hideProgressDialog", "y", "N", "B", "", HMAccountWebAPI.PARAM_DEFAULT_FIELDS, "O", "m", LogUtil.D, "", "isAdult", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onDestroy", "Lcom/huami/account/event/EventMinorAuthMailSent;", "event", "onEventMainThread", "Lcom/huami/web/service/event/EventWebActivityFinish;", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "a", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "mHMPersonInfo", "b", "Ljava/lang/String;", "mOriName", "Lcom/huami/account/userinfo/ui/NewUserGuideViewModel;", "c", "Lkotlin/Lazy;", "o", "()Lcom/huami/account/userinfo/ui/NewUserGuideViewModel;", "viewModel", "Lcom/huami/account/userinfo/databinding/UserInfoActivityNewUserGuideBinding;", GoogleApiAvailabilityLight.a, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.b, "()Lcom/huami/account/userinfo/databinding/UserInfoActivityNewUserGuideBinding;", "binding", "e", "Z", "isSkip", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "g", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "onDataChangeListener", "Lcom/huami/account/userinfo/ui/PersonInfoSettingNicknameFragment$OnNicknameChangeListener;", "h", "Lcom/huami/account/userinfo/ui/PersonInfoSettingNicknameFragment$OnNicknameChangeListener;", "onNicknameChangeListener", "x", "()Z", "isUserInfoValid", "w", "isNicknameValidOrInAudit", "<init>", "()V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class NewUserGuideActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] i;

    @NotNull
    private static final String j = "NewUserGuideActivity";
    private static final int k = 30;

    @Nullable
    private static Function0<Unit> l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HMPersonInfo mHMPersonInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String mOriName = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isSkip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final PersonInfoSettingNicknameFragment.OnNicknameChangeListener onNicknameChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/account/userinfo/ui/NewUserGuideActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function0;", "", "finishedCallbacks", "start", "", "FREEZETIME", LogUtil.I, "", "TAG", "Ljava/lang/String;", "callback", "Lkotlin/jvm/functions/Function0;", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @Nullable Function0<Unit> finishedCallbacks) {
            Intent intent = new Intent(context, (Class<?>) NewUserGuideActivity.class);
            NewUserGuideActivity.l = finishedCallbacks;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            HMPersonInfo hMPersonInfo = NewUserGuideActivity.this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo);
            hMPersonInfo.getUserInfo().setWeight(f);
            NewUserGuideActivity.this.onDataChangeListener.onChange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "", HMAccountWebAPI.PARAM_DEFAULT_FIELDS, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@Nullable Map<String, String> map) {
            if (map == null) {
                NewUserGuideActivity.this.m();
                return;
            }
            HMPersonInfo hMPersonInfo = NewUserGuideActivity.this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo);
            hMPersonInfo.getMiliConfig().setGoalStepsCount(8000);
            HMPersonInfo hMPersonInfo2 = NewUserGuideActivity.this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo2);
            HMUserInfo userInfo = hMPersonInfo2.getUserInfo();
            DisplayIDToNickname displayIDToNickname = DisplayIDToNickname.INSTANCE;
            HMPersonInfo hMPersonInfo3 = NewUserGuideActivity.this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo3);
            userInfo.setNickname(displayIDToNickname.execute(hMPersonInfo3.getUserInfo().getUserid()));
            NewUserGuideActivity.this.O(map);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
            a(map);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewUserGuideActivity.class), "binding", "getBinding()Lcom/huami/account/userinfo/databinding/UserInfoActivityNewUserGuideBinding;"));
        i = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewUserGuideActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NewUserGuideViewModel>() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.account.userinfo.ui.NewUserGuideViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NewUserGuideViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(NewUserGuideViewModel.class), function0, objArr);
            }
        });
        this.binding = ActivityViewBindingsKt.viewBinding(new NewUserGuideActivity$special$$inlined$viewBinding$1(new InflateViewBinder(UserInfoActivityNewUserGuideBinding.class)));
        this.onDataChangeListener = new PersonInfoSettingBaseFragment.OnDataChangeListener() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$onDataChangeListener$1
            @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment.OnDataChangeListener
            public void onChange() {
                this.a.I();
                this.a.H();
                this.a.J();
                this.a.P();
                this.a.K();
            }
        };
        this.onNicknameChangeListener = new PersonInfoSettingNicknameFragment.OnNicknameChangeListener() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$onNicknameChangeListener$1
            @Override // com.huami.account.userinfo.ui.PersonInfoSettingNicknameFragment.OnNicknameChangeListener
            public void onChange(@Nullable String nickname) {
                if (!TextUtils.isEmpty(this.a.mOriName) && !Intrinsics.areEqual(this.a.mOriName, nickname)) {
                    Analytics.event(this.a.getApplicationContext(), "SetNewUserInfo_EditName");
                }
                if (nickname != null) {
                    this.a.M(nickname);
                }
                this.a.K();
            }
        };
    }

    private final void A(boolean isAdult) {
        showLoginDialog(R.string.user_info_person_info_set_saving);
        o().getDefaultFields(isAdult, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        showLoginDialog(R.string.user_info_person_info_set_saving);
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        hMPersonInfo.getMiliConfig().setGoalStepsCount(8000);
        HMPersonInfo hMPersonInfo2 = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo2);
        hMPersonInfo2.getUserInfo().setDefaultFields(null);
        O(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(PersonInfoSettingBaseFragment fragment, PersonInfoSettingBaseFragment.OnDataChangeListener listener) {
        PersonInfoSettingBaseFragment.INSTANCE.showSelf(this, fragment, listener, true);
    }

    private final void D() {
        int adultAge = HMLoginManager.getAdultAge();
        String quantityString = getResources().getQuantityString(R.plurals.user_info_confirm_age_title, adultAge, Integer.valueOf(adultAge));
        String quantityString2 = getResources().getQuantityString(R.plurals.user_info_confirm_age_message, adultAge, Integer.valueOf(adultAge));
        String quantityString3 = getResources().getQuantityString(R.plurals.user_info_confirm_age_btn, adultAge, Integer.valueOf(adultAge));
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        builder.setTitle(quantityString);
        builder.setMessage(quantityString2);
        builder.setPositiveButton(R.string.user_info_new_user_confirm, new DialogInterface.OnClickListener() { // from class: me5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                NewUserGuideActivity.F(this.a, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(quantityString3, new DialogInterface.OnClickListener() { // from class: ke5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                NewUserGuideActivity.E(this.a, dialogInterface, i2);
            }
        });
        builder.create();
        builder.show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(NewUserGuideActivity newUserGuideActivity, DialogInterface dialogInterface, int i2) {
        newUserGuideActivity.isSkip = true;
        newUserGuideActivity.o().startMinorAuthorize(true);
        HMAccountKeeper.INSTANCE.setCheckMinorAuthorizationTime(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(NewUserGuideActivity newUserGuideActivity, DialogInterface dialogInterface, int i2) {
        newUserGuideActivity.A(true);
    }

    private final void G() {
        L();
        I();
        H();
        J();
        P();
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        Birthday birthdayFromStr = Birthday.fromStr(hMPersonInfo.getUserInfo().getBirthday());
        if (birthdayFromStr == null || !birthdayFromStr.isValid()) {
            n().settingBirthday.setTips(R.string.user_info_new_user_item_choose_default);
        } else {
            n().settingBirthday.setTips(birthdayFromStr.toString());
            DisplayDefaultFieldUseCase.execute(n().settingBirthday, "birthday");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        int gender = hMPersonInfo.getUserInfo().getGender();
        if (gender == 0) {
            n().settingGender.setTips(R.string.user_info_female);
        } else if (gender == 1) {
            n().settingGender.setTips(R.string.user_info_male);
        }
        DisplayDefaultFieldUseCase.execute(n().settingGender, "gender");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        if (hMPersonInfo.getUserInfo().getHeight() > 0) {
            SelectAreaManager selectAreaManager = SelectAreaManager.INSTANCE;
            Area area = selectAreaManager.getArea();
            int i2 = (selectAreaManager.isGB(area) || selectAreaManager.isUS(area)) ? 1 : 0;
            Utils utils = Utils.INSTANCE;
            HMPersonInfo hMPersonInfo2 = this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo2);
            n().settingHeight.setTips(utils.lengthToString(this, i2, hMPersonInfo2.getUserInfo().getHeight()));
            DisplayDefaultFieldUseCase.execute(n().settingHeight, "height");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        boolean zX = x();
        n().newUserNext.setEnabled(zX);
        if (GlobalConfig.get().isBuildMidong()) {
            n().newUserNext.setTextColor(ContextCompat.getColor(this, zX ? R.color.s5 : R.color.s3));
        } else {
            n().newUserNext.setTextColor(ContextCompat.getColor(this, zX ? R.color.black70 : R.color.black30));
        }
    }

    private final void L() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        String nickname = hMPersonInfo.getUserInfo().getNickname();
        String thirdId = HMLoginManager.getThirdId();
        if (!TextUtils.isEmpty(thirdId) && !Intrinsics.areEqual(thirdId, nickname)) {
            M(nickname);
        }
        AuditUserInfoManager.displayNickname(this, n().settingName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String name) {
        if (!TextUtils.isEmpty(name)) {
            this.mOriName = name;
            n().settingName.setTips(name);
        }
        AuditUserInfoManager.displayNickname(this, n().settingName);
    }

    private final void N() {
        String nickName = AccountManager.getDefault(this).getUserInfo().getNickName();
        if (CheckThirdPartNicknameUseCase.INSTANCE.execute()) {
            B();
        } else {
            UserInfoLegalCheckManager.checkNickNameLegal(this, nickName, new DefaultUserInfoLegalCallback() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$updateProfile$1
                {
                    super(null, 1, null);
                }

                @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
                public void onAudit() {
                    this.b.B();
                }

                @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
                public void onError() {
                    LoadingDialog loadingDialog = this.b.mLoadingDialog;
                    if (loadingDialog == null) {
                        return;
                    }
                    loadingDialog.dismiss();
                }

                @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
                public void onFailed() {
                    this.b.C(PersonInfoSettingNicknameFragment.INSTANCE.newInstanceWithLegalCheck(), this.b.onNicknameChangeListener);
                    LoadingDialog loadingDialog = this.b.mLoadingDialog;
                    if (loadingDialog == null) {
                        return;
                    }
                    loadingDialog.dismiss();
                }

                @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
                public void onSuccess() {
                    this.b.B();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(final Map<String, String> defaultFields) {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        HMAccountWebAPI.updateProfile(hMPersonInfo, defaultFields, false, new IHMSimpleHttpResponseHandler() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$updateProfile$2
            private final void a(int type) {
                if (type == 2) {
                    HMLogoutManager.logout(2);
                    return;
                }
                if (type == 3) {
                    HMLogoutManager.logout(3);
                } else if (type != 5) {
                    this.a.m();
                } else {
                    HMLogoutManager.logout(4);
                }
            }

            private final void b(WebResponse response) {
                LoadingDialog loadingDialog = this.a.mLoadingDialog;
                if (loadingDialog == null) {
                    return;
                }
                String string = this.a.getString(R.string.user_info_person_info_set_saving_success);
                final NewUserGuideActivity newUserGuideActivity = this.a;
                final Map<String, String> map = defaultFields;
                loadingDialog.setSuccess(string, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.userinfo.ui.NewUserGuideActivity$updateProfile$2$goNext$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ long a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(long j) {
                            super(0);
                            this.a = j;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return Intrinsics.stringPlus("createTime:", Long.valueOf(this.a));
                        }
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@NotNull LoadingDialog dialog) {
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@NotNull LoadingDialog dialog) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                        HMAccountKeeper.INSTANCE.saveCreateTime(jCurrentTimeMillis);
                        HMPersonInfo hMPersonInfo2 = newUserGuideActivity.mHMPersonInfo;
                        Objects.requireNonNull(hMPersonInfo2);
                        hMPersonInfo2.getUserInfo().setCreatTime(jCurrentTimeMillis);
                        HMLog.info("NewUserGuideActivity", new a(jCurrentTimeMillis));
                        HMPersonInfo hMPersonInfo3 = newUserGuideActivity.mHMPersonInfo;
                        Objects.requireNonNull(hMPersonInfo3);
                        hMPersonInfo3.saveInfo(0);
                        if (!map.containsKey("birthday")) {
                            UserLegalInfoManager.makeMinorAgeConfirmed();
                        }
                        HMPersonInfo hMPersonInfo4 = newUserGuideActivity.mHMPersonInfo;
                        Objects.requireNonNull(hMPersonInfo4);
                        SetupDefaultFieldsUseCase.execute(hMPersonInfo4, map);
                        GoalFunctionsKt.saveDefaultGoalIfEmpty();
                        UserLegalInfoManager.makeMinorAgeConfirmed();
                        newUserGuideActivity.setResult(-1);
                        EventBus.getDefault().post(new EventAccountStatus(1));
                        Function0 function0 = NewUserGuideActivity.l;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        newUserGuideActivity.finish();
                    }
                });
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                a(type);
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
                this.a.m();
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                this.a.m();
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@Nullable WebResponse response, @Nullable HMHttpResponseData item) {
                if (response == null || item == null) {
                    return;
                }
                if (item.isSuccess() && response.success()) {
                    b(response);
                } else {
                    this.a.m();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        float weight = hMPersonInfo.getUserInfo().getWeight();
        if (weight > 0.0f) {
            HMPersonInfo hMPersonInfo2 = this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo2);
            int weightUnit = hMPersonInfo2.getMiliConfig().getWeightUnit();
            WeightUtil weightUtil = WeightUtil.INSTANCE;
            float fScaleFloat = weightUtil.scaleFloat(weightUtil.convertFromKg(weight, weightUnit), 1);
            StringBuilder sb = new StringBuilder();
            sb.append(weightUtil.scaleFloat(fScaleFloat, 1));
            sb.append(StringUtil.SPACE);
            sb.append((Object) weightUtil.toUnitStr(weightUnit));
            n().settingWeight.setTips(sb.toString());
        }
        DisplayDefaultFieldUseCase.execute(n().settingWeight, "weight");
    }

    private final void hideProgressDialog() {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.mLoadingDialog;
        if (loadingDialog2 != null) {
            boolean z = false;
            if (loadingDialog2 != null && loadingDialog2.isShowing()) {
                z = true;
            }
            if (!z || (loadingDialog = this.mLoadingDialog) == null) {
                return;
            }
            loadingDialog.hide();
        }
    }

    private final void initTitle() {
        StatusBarCompat.transparent(this);
    }

    private final void initView() {
        n().settingName.setOnClickListener(new View.OnClickListener() { // from class: pe5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.p(this.a, view);
            }
        });
        n().settingGender.setOnClickListener(new View.OnClickListener() { // from class: se5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.q(this.a, view);
            }
        });
        n().settingBirthday.setOnClickListener(new View.OnClickListener() { // from class: oe5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.r(this.a, view);
            }
        });
        n().settingHeight.setOnClickListener(new View.OnClickListener() { // from class: te5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.s(this.a, view);
            }
        });
        n().settingWeight.setOnClickListener(new View.OnClickListener() { // from class: re5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.t(this.a, view);
            }
        });
        n().newUserNext.setOnClickListener(new View.OnClickListener() { // from class: qe5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.u(this.a, view);
            }
        });
        n().newUserSkip.setOnClickListener(new View.OnClickListener() { // from class: ne5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewUserGuideActivity.v(this.a, view);
            }
        });
        if (!HMLoginManager.isSimplifiedChineseInMainland()) {
            n().newUserNext.setText(R.string.user_info_complete);
        }
        boolean zIsCN = SelectAreaHelper.isCN(SelectAreaHelper.getAreaBySave());
        if (zIsCN) {
            UserLegalInfoComponents.INSTANCE.showCollectUserInfoTip(this);
        }
        n().newUserSkip.setVisibility(zIsCN ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        hideProgressDialog();
        CustomToast.makeText(this, R.string.user_info_sync_personinfo_failed, 0).show();
    }

    private final UserInfoActivityNewUserGuideBinding n() {
        return (UserInfoActivityNewUserGuideBinding) this.binding.getValue(this, i[1]);
    }

    private final NewUserGuideViewModel o() {
        return (NewUserGuideViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(NewUserGuideActivity newUserGuideActivity, View view) {
        if (AuditUserInfoManager.interceptShowAuditTip(newUserGuideActivity, AuditUserInfoManager.InfoCheckType.Nickname)) {
            return;
        }
        newUserGuideActivity.C(PersonInfoSettingNicknameFragment.INSTANCE.newInstanceWithLegalCheck(), newUserGuideActivity.onNicknameChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(NewUserGuideActivity newUserGuideActivity, View view) {
        newUserGuideActivity.C(new PersonInfoSettingGenderFragment(), newUserGuideActivity.onDataChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(NewUserGuideActivity newUserGuideActivity, View view) {
        newUserGuideActivity.C(new PersonInfoSettingBirthdayForRegisterFragment(), newUserGuideActivity.onDataChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(NewUserGuideActivity newUserGuideActivity, View view) {
        newUserGuideActivity.C(new PersonInfoSettingHeightFragment(), newUserGuideActivity.onDataChangeListener);
    }

    private final void showLoginDialog(int msg) {
        if (this.mLoadingDialog == null) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            this.mLoadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog != null) {
                loadingDialogShowDialog.setCancelable(false);
            }
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            loadingDialog.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog2 = this.mLoadingDialog;
        if (loadingDialog2 == null) {
            return;
        }
        loadingDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(NewUserGuideActivity newUserGuideActivity, View view) {
        IUserinfoDelegate userinfoDelegate = UserinfoExternalsKt.getUserinfoDelegate();
        HMPersonInfo hMPersonInfo = newUserGuideActivity.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        userinfoDelegate.pickWeightValue(newUserGuideActivity, hMPersonInfo.getUserInfo().getWeight(), newUserGuideActivity.new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(NewUserGuideActivity newUserGuideActivity, View view) {
        newUserGuideActivity.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(NewUserGuideActivity newUserGuideActivity, View view) {
        newUserGuideActivity.D();
    }

    private final boolean w() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        return (!TextUtils.isEmpty(hMPersonInfo.getUserInfo().getNickname()) && !TextUtils.isEmpty(this.mOriName)) || (HMAccountKeeper.INSTANCE.getManualAuditNickName() != null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    private final boolean x() {
        HMPersonInfo hMPersonInfo;
        HMPersonInfo hMPersonInfo2;
        HMPersonInfo hMPersonInfo3;
        if (w()) {
            HMPersonInfo hMPersonInfo4 = this.mHMPersonInfo;
            Objects.requireNonNull(hMPersonInfo4);
            if (hMPersonInfo4.getUserInfo().getGender() != 1) {
                HMPersonInfo hMPersonInfo5 = this.mHMPersonInfo;
                Objects.requireNonNull(hMPersonInfo5);
                if (hMPersonInfo5.getUserInfo().getGender() == 0) {
                    hMPersonInfo = this.mHMPersonInfo;
                    Objects.requireNonNull(hMPersonInfo);
                    if (Birthday.fromStr(hMPersonInfo.getUserInfo().getBirthday()).isValid()) {
                        hMPersonInfo2 = this.mHMPersonInfo;
                        Objects.requireNonNull(hMPersonInfo2);
                        if (hMPersonInfo2.getUserInfo().getHeight() > 0) {
                            hMPersonInfo3 = this.mHMPersonInfo;
                            Objects.requireNonNull(hMPersonInfo3);
                            if (hMPersonInfo3.getUserInfo().getWeight() > 0.0f) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                hMPersonInfo = this.mHMPersonInfo;
                Objects.requireNonNull(hMPersonInfo);
                if (Birthday.fromStr(hMPersonInfo.getUserInfo().getBirthday()).isValid()) {
                    hMPersonInfo2 = this.mHMPersonInfo;
                    Objects.requireNonNull(hMPersonInfo2);
                    if (hMPersonInfo2.getUserInfo().getHeight() > 0) {
                        hMPersonInfo3 = this.mHMPersonInfo;
                        Objects.requireNonNull(hMPersonInfo3);
                        if (hMPersonInfo3.getUserInfo().getWeight() > 0.0f) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final void y() {
        HMPersonInfo hMPersonInfo = this.mHMPersonInfo;
        Objects.requireNonNull(hMPersonInfo);
        if (HMLoginManager.isAdultGlobal(hMPersonInfo.getUserInfo().getAge())) {
            showLoginDialog(R.string.user_info_person_info_set_saving);
            N();
            return;
        }
        String quantityString = getResources().getQuantityString(R.plurals.user_info_authorize_message_first_part, HMLoginManager.getAdultAge(), Integer.valueOf(HMLoginManager.getAdultAge()));
        String quantityString2 = getResources().getQuantityString(R.plurals.user_info_authorize_message_second_part, HMLoginManager.getAdultAge(), 30);
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        builder.setTitle(R.string.user_info_authorize_title);
        builder.setMessage(Intrinsics.stringPlus(quantityString, quantityString2)).themed();
        builder.setPositiveButton(R.string.user_info_authorize_btn_positive, new DialogInterface.OnClickListener() { // from class: le5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                NewUserGuideActivity.z(this.a, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(R.string.user_info_authorize_btn_negative, (DialogInterface.OnClickListener) null);
        builder.create();
        builder.show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(NewUserGuideActivity newUserGuideActivity, DialogInterface dialogInterface, int i2) {
        newUserGuideActivity.isSkip = false;
        newUserGuideActivity.o().startMinorAuthorize(newUserGuideActivity.isSkip);
        HMAccountKeeper.INSTANCE.setCheckMinorAuthorizationTime(System.currentTimeMillis());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_App);
        setContentView(n().getRoot());
        initTitle();
        this.mHMPersonInfo = HMPersonInfo.getInstance();
        SetupDefaultUnitUseCase.INSTANCE.execute();
        initView();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l = null;
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventMinorAuthMailSent event) {
        if (this.isSkip) {
            A(false);
        } else {
            showLoginDialog(R.string.user_info_person_info_set_saving);
            N();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        G();
        K();
    }

    public final void onEventMainThread(@NotNull EventWebActivityFinish event) {
        FrozenAccountKeeper.INSTANCE.unfreezeReset();
    }
}
