package com.huami.account.ui.login.viewmodel;

import androidx.annotation.StringRes;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountExternalContainer;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountStatEvent;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.bean.LoginResult;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.sso.provider.AccountInfoProvider;
import com.huami.account.ui.R;
import com.huami.account.ui.common.state.ResultWrapper;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.ui.login.state.LoginFailed;
import com.huami.account.ui.login.state.LoginSuccess;
import com.huami.account.ui.login.state.PassportOperationState;
import com.huami.account.ui.login.state.ThirdPartAuthState;
import com.huami.account.ui.login.usecase.HandleLoginFailedUseCase;
import com.huami.account.ui.login.usecase.HandleLoginSuccessUseCase;
import com.huami.account.ui.login.usecase.HandleLoginUnknownErrorUseCase;
import com.huami.account.ui.login.usecase.HandleProcessLoginDataSuccessUseCase;
import com.huami.account.ui.login.usecase.LoginPhoneEmailUseCase;
import com.huami.account.ui.login.usecase.LoginThirdAuthUseCase;
import com.huami.account.ui.register.usecase.ThirdAuthRegisterUseCase;
import com.huami.account.utils.AnalyticsExtKt;
import com.huami.account.utils.AppChannel;
import com.huami.account.utils.AppChannelKt;
import com.huami.account.utils.DeprecatedFunc;
import com.huami.account.utils.SingleLiveEvent;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.OperationResult;
import com.huami.passport.entity.LoginToken;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.widget.wheelview.Constant;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001iB?\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020B¢\u0006\u0004\bg\u0010hJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\r\u001a\u00020\b*\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bJ\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J$\u0010 \u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bJ(\u0010'\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016J\"\u0010+\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020)H\u0016R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR)\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b?\u0010KR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR,\u0010Y\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\f0Uj\u0002`W0H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010NR#\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010J\u001a\u0004\b3\u0010[R#\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010J\u001a\u0004\b;\u0010[R\u001f\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030_8F@\u0006¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0019\u0010d\u001a\b\u0012\u0004\u0012\u00020Q0_8F@\u0006¢\u0006\u0006\u001a\u0004\bc\u0010aR)\u0010f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\f0Uj\u0002`W0_8F@\u0006¢\u0006\u0006\u001a\u0004\be\u0010a¨\u0006j"}, d2 = {"Lcom/huami/account/ui/login/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/account/ui/login/viewmodel/LoginViewModelContract;", "", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "b", "Lcom/huami/account/ui/login/state/LoginFailed$AttemptLimit;", "error", "", "username", "", "a", "Lcom/huami/account/ui/login/state/LoginFailed;", "g", "switchLoginTypes", "refreshLoginTypes", "password", "doLogin", "provider", "Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "handleLoginSuccess", "", "isShowLoadingDialog", "handleProcessLoginDataSuccess", "Lcom/huami/passport/IAccount$Callback;", "Lcom/huami/passport/ErrorCode;", "handlePassportCallback", "Lcom/huami/passport/OperationResult;", "operationResult", "handlePassportResult", "specifiedCountryCode", "handleLoginFailed", "thirdAuthLogin", "showLoginError", "", "res", "Lcom/huami/account/bean/LoginResult$Failed;", "result", "handleUnknownFailed", "accessToken", "Lcom/huami/account/service/model/Area;", BaseDeviceStatusActivity.KEY_AREA, "thirdAuthRegister", "Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;", "Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;", "handleLoginFailedUseCase", "Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;", "Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;", "handleLoginSuccessUseCase", "Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "c", "Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;", "handleLoginUnknownErrorUseCase", "Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;", "handleProcessLoginDataSuccessUseCase", "Lcom/huami/account/ui/login/usecase/LoginThirdAuthUseCase;", "e", "Lcom/huami/account/ui/login/usecase/LoginThirdAuthUseCase;", "loginThirdAuthUseCase", "Lcom/huami/account/ui/login/usecase/LoginPhoneEmailUseCase;", "f", "Lcom/huami/account/ui/login/usecase/LoginPhoneEmailUseCase;", "loginPhoneEmailUseCase", "Lcom/huami/account/ui/register/usecase/ThirdAuthRegisterUseCase;", "Lcom/huami/account/ui/register/usecase/ThirdAuthRegisterUseCase;", "thirdAuthRegisterUseCase", "h", "Ljava/util/List;", "excludeFacebookFlavors", "Landroidx/lifecycle/MutableLiveData;", "i", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_availableLoginType", z.j, "Landroidx/lifecycle/MutableLiveData;", "currentProvider", "Lcom/huami/account/utils/SingleLiveEvent;", "Lcom/huami/account/ui/login/state/PassportOperationState;", hl.k, "Lcom/huami/account/utils/SingleLiveEvent;", "_passportOperationEvent", "Lcom/huami/account/ui/common/state/StateWrapper;", "Lcom/huami/account/ui/login/state/LoginSuccess;", "Lcom/huami/account/ui/login/state/LoginUiState;", "l", "_loginUiState", "m", "()Ljava/util/List;", "loginTypeMainLand", GoogleApiAvailabilityLight.b, "loginTypeOversea", "Landroidx/lifecycle/LiveData;", "getAvailableLoginType", "()Landroidx/lifecycle/LiveData;", "availableLoginType", "getPassportOperationState", "passportOperationState", "getLoginUiState", "loginUiState", "<init>", "(Lcom/huami/account/ui/login/usecase/HandleLoginFailedUseCase;Lcom/huami/account/ui/login/usecase/HandleLoginSuccessUseCase;Lcom/huami/account/ui/login/usecase/HandleLoginUnknownErrorUseCase;Lcom/huami/account/ui/login/usecase/HandleProcessLoginDataSuccessUseCase;Lcom/huami/account/ui/login/usecase/LoginThirdAuthUseCase;Lcom/huami/account/ui/login/usecase/LoginPhoneEmailUseCase;Lcom/huami/account/ui/register/usecase/ThirdAuthRegisterUseCase;)V", AccountInfoProvider.Companion.Columns.LOGIN_TYPE, "accountui_release"}, k = 1, mv = {1, 5, 1})
public class LoginViewModel extends ViewModel implements LoginViewModelContract {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginFailedUseCase handleLoginFailedUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginSuccessUseCase handleLoginSuccessUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HandleLoginUnknownErrorUseCase handleLoginUnknownErrorUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HandleProcessLoginDataSuccessUseCase handleProcessLoginDataSuccessUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LoginThirdAuthUseCase loginThirdAuthUseCase;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LoginPhoneEmailUseCase loginPhoneEmailUseCase;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ThirdAuthRegisterUseCase thirdAuthRegisterUseCase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<String> excludeFacebookFlavors = kotlin.collections.e.listOf("a100900101005");

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy _availableLoginType = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> currentProvider = new MutableLiveData<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final SingleLiveEvent<PassportOperationState> _passportOperationEvent = new SingleLiveEvent<>();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<StateWrapper<LoginSuccess, LoginFailed>> _loginUiState = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy loginTypeMainLand = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy loginTypeOversea = LazyKt__LazyJVMKt.lazy(new Function0<List<LoginType>>() { // from class: com.huami.account.ui.login.viewmodel.LoginViewModel$loginTypeOversea$2

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AppChannel.values().length];
                iArr[AppChannel.Zepp.ordinal()] = 1;
                iArr[AppChannel.Amazfit.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<LoginViewModel.LoginType> invoke() {
            ArrayList arrayList = new ArrayList();
            if (!this.a.excludeFacebookFlavors.contains(AccountExternalsKt.getCommonDelegate().getChannelName())) {
                arrayList.add(new LoginViewModel.LoginType("facebook", R.drawable.account_ui_logo_facebook));
            }
            arrayList.add(new LoginViewModel.LoginType("google", R.drawable.account_ui_logo_google));
            arrayList.add(new LoginViewModel.LoginType("xiaomi", R.drawable.account_ui_logo_mi));
            int i = WhenMappings.$EnumSwitchMapping$0[AppChannelKt.getAppChannel(AccountExternalContainer.INSTANCE.getAppContext()).ordinal()];
            if (i == 1 || i == 2) {
                arrayList.add(new LoginViewModel.LoginType("line", R.drawable.account_ui_logo_line));
            }
            arrayList.add(new LoginViewModel.LoginType("wechat", R.drawable.account_ui_logo_wechat));
            return arrayList;
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00048G@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "", "", "component1", "", "component2", "provider", "logoRes", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "b", LogUtil.I, "getLogoRes", "()I", "getDisplayNameRes", "()Ljava/lang/Integer;", "displayNameRes", "<init>", "(Ljava/lang/String;I)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class LoginType {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String provider;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int logoRes;

        public LoginType(@NotNull String str, int i) {
            this.provider = str;
            this.logoRes = i;
        }

        public static /* synthetic */ LoginType copy$default(LoginType loginType, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loginType.provider;
            }
            if ((i2 & 2) != 0) {
                i = loginType.logoRes;
            }
            return loginType.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProvider() {
            return this.provider;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLogoRes() {
            return this.logoRes;
        }

        @NotNull
        public final LoginType copy(@NotNull String provider, int logoRes) {
            return new LoginType(provider, logoRes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginType)) {
                return false;
            }
            LoginType loginType = (LoginType) other;
            return Intrinsics.areEqual(this.provider, loginType.provider) && this.logoRes == loginType.logoRes;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @StringRes
        @Nullable
        public final Integer getDisplayNameRes() {
            String str = this.provider;
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        return Integer.valueOf(R.string.account_ui_login_list_google);
                    }
                    return null;
                case -791770330:
                    if (str.equals("wechat")) {
                        return Integer.valueOf(R.string.account_ui_login_list_wechat);
                    }
                    return null;
                case -759499589:
                    if (str.equals("xiaomi")) {
                        return Integer.valueOf(R.string.account_ui_login_list_xiaomi);
                    }
                    return null;
                case 3321844:
                    if (str.equals("line")) {
                        return Integer.valueOf(R.string.account_ui_login_list_line);
                    }
                    return null;
                case 497130182:
                    if (str.equals("facebook")) {
                        return Integer.valueOf(R.string.account_ui_login_list_facebook);
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final int getLogoRes() {
            return this.logoRes;
        }

        @NotNull
        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return (this.provider.hashCode() * 31) + this.logoRes;
        }

        @NotNull
        public String toString() {
            return "LoginType(provider=" + this.provider + ", logoRes=" + this.logoRes + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<List<? extends LoginType>>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<LoginType>> invoke() {
            MutableLiveData<List<LoginType>> mutableLiveData = new MutableLiveData<>();
            mutableLiveData.setValue(LoginViewModel.this.b());
            return mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.login.viewmodel.LoginViewModel$doLogin$1", f = "LoginViewModel.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginViewModel.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LoginPhoneEmailUseCase loginPhoneEmailUseCase = LoginViewModel.this.loginPhoneEmailUseCase;
                String str = this.c;
                String str2 = this.d;
                this.a = 1;
                obj = loginPhoneEmailUseCase.invoke(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof StateWrapper.Failed) {
                StateWrapper.Failed failed = (StateWrapper.Failed) resultWrapper;
                if (failed.getError() instanceof LoginFailed.AttemptLimit) {
                    LoginViewModel.this.a((LoginFailed.AttemptLimit) failed.getError(), this.c);
                    return Unit.INSTANCE;
                }
            }
            LoginViewModel.this._loginUiState.postValue(resultWrapper.asState());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "三方登录错误信息为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.login.viewmodel.LoginViewModel$handleLoginSuccess$1", f = "LoginViewModel.kt", i = {}, l = {Constant.WEIGHT_DEFAULT_IMPERIAL}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ LoginToken d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, LoginToken loginToken, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = loginToken;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginViewModel.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HandleLoginSuccessUseCase handleLoginSuccessUseCase = LoginViewModel.this.handleLoginSuccessUseCase;
                String str = this.c;
                LoginToken loginToken = this.d;
                this.a = 1;
                obj = handleLoginSuccessUseCase.invoke(str, loginToken, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LoginViewModel.this._loginUiState.postValue(((ResultWrapper) obj).asState());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/account/ui/login/viewmodel/LoginViewModel$LoginType;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<List<? extends LoginType>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends LoginType> invoke() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new LoginType[]{new LoginType("xiaomi", R.drawable.account_ui_logo_mi), new LoginType("wechat", R.drawable.account_ui_logo_wechat)});
        }
    }

    public LoginViewModel(@NotNull HandleLoginFailedUseCase handleLoginFailedUseCase, @NotNull HandleLoginSuccessUseCase handleLoginSuccessUseCase, @NotNull HandleLoginUnknownErrorUseCase handleLoginUnknownErrorUseCase, @NotNull HandleProcessLoginDataSuccessUseCase handleProcessLoginDataSuccessUseCase, @NotNull LoginThirdAuthUseCase loginThirdAuthUseCase, @NotNull LoginPhoneEmailUseCase loginPhoneEmailUseCase, @NotNull ThirdAuthRegisterUseCase thirdAuthRegisterUseCase) {
        this.handleLoginFailedUseCase = handleLoginFailedUseCase;
        this.handleLoginSuccessUseCase = handleLoginSuccessUseCase;
        this.handleLoginUnknownErrorUseCase = handleLoginUnknownErrorUseCase;
        this.handleProcessLoginDataSuccessUseCase = handleProcessLoginDataSuccessUseCase;
        this.loginThirdAuthUseCase = loginThirdAuthUseCase;
        this.loginPhoneEmailUseCase = loginPhoneEmailUseCase;
        this.thirdAuthRegisterUseCase = thirdAuthRegisterUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LoginFailed.AttemptLimit error, String username) {
        this._loginUiState.postValue(StateWrapper.INSTANCE.failed(new LoginFailed.AttemptLimit(error.getProvider(), username, error.getBlockTime())).asState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LoginType> b() {
        return DeprecatedFunc.INSTANCE.isSimplifiedChinese() ? c() : e();
    }

    private final List<LoginType> c() {
        return (List) this.loginTypeMainLand.getValue();
    }

    private final List<LoginType> e() {
        return (List) this.loginTypeOversea.getValue();
    }

    private final MutableLiveData<List<LoginType>> f() {
        return (MutableLiveData) this._availableLoginType.getValue();
    }

    private final String g(LoginFailed loginFailed) {
        if (!Intrinsics.areEqual(loginFailed, LoginFailed.AccountAlreadyRegister.INSTANCE) && !Intrinsics.areEqual(loginFailed, LoginFailed.CommonLoginError.INSTANCE) && !(loginFailed instanceof LoginFailed.AccountException) && !(loginFailed instanceof LoginFailed.AccountFrozen) && !(loginFailed instanceof LoginFailed.AccountOrPasswordIncorrect) && !(loginFailed instanceof LoginFailed.CustomMessageTip) && !(loginFailed instanceof LoginFailed.NormalMessageError) && !(loginFailed instanceof LoginFailed.IgnoredError) && !(loginFailed instanceof LoginFailed.RegionLimit) && !(loginFailed instanceof LoginFailed.RegisterErrorUrl) && !(loginFailed instanceof LoginFailed.AttemptLimit)) {
            if (loginFailed instanceof LoginFailed.ThirdPartNotRegister ? true : loginFailed instanceof LoginFailed.AccountV2NotRegister) {
                return AccountStatEvent.VALUE_SIGN_THIRD_STATUS_SINGUP;
            }
        }
        return AccountStatEvent.VALUE_SIGN_THIRD_STATUS_UNKNOW;
    }

    public final void doLogin(@NotNull String username, @NotNull String password) {
        this._loginUiState.postValue(StateWrapper.INSTANCE.loading(R.string.account_ui_logining));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new b(username, password, null), 3, null);
    }

    @NotNull
    public final LiveData<List<LoginType>> getAvailableLoginType() {
        return AccountExternalsKt.getAccountDelegate().isChineseOnly() ? new MutableLiveData(c()) : f();
    }

    @NotNull
    public final LiveData<StateWrapper<LoginSuccess, LoginFailed>> getLoginUiState() {
        return this._loginUiState;
    }

    @NotNull
    public final LiveData<PassportOperationState> getPassportOperationState() {
        return this._passportOperationEvent;
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleLoginFailed(@NotNull String provider, @Nullable ErrorCode error, @Nullable String specifiedCountryCode) {
        if (error == null) {
            HMLog.info$default(null, c.a, 1, null);
            return;
        }
        MutableLiveData<StateWrapper<LoginSuccess, LoginFailed>> mutableLiveData = this._loginUiState;
        StateWrapper.Failed failed = ResultWrapper.INSTANCE.failed(HandleLoginFailedUseCase.invoke$default(this.handleLoginFailedUseCase, provider, error, specifiedCountryCode, false, 8, null));
        if (Intrinsics.areEqual(error.getErrorCode(), HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_NOT_REGISTER)) {
            Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_LOGIN_THIRD_AUTH_STATUS).addExtra("Status", g((LoginFailed) failed.getError())));
        }
        Unit unit = Unit.INSTANCE;
        mutableLiveData.postValue(failed);
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleLoginSuccess(@NotNull String provider, @Nullable LoginToken loginToken) {
        this._loginUiState.postValue(StateWrapper.INSTANCE.loading(R.string.account_ui_logining));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new d(provider, loginToken, null), 3, null);
        AnalyticsExtKt.analyticsLoginResult(provider, true, "200");
    }

    @NotNull
    public final IAccount.Callback<LoginToken, ErrorCode> handlePassportCallback(@NotNull final String provider) {
        return new IAccount.Callback<LoginToken, ErrorCode>() { // from class: com.huami.account.ui.login.viewmodel.LoginViewModel.handlePassportCallback.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@NotNull ErrorCode errorCode) {
                LoginViewModelContract.DefaultImpls.handleLoginFailed$default(LoginViewModel.this, provider, errorCode, null, 4, null);
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@NotNull LoginToken loginToken) {
                LoginViewModel.this.handleLoginSuccess(provider, loginToken);
            }
        };
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handlePassportResult(@NotNull String provider, @NotNull OperationResult<? extends LoginToken> operationResult) {
        if (operationResult.isSuccess()) {
            handleLoginSuccess(provider, operationResult.getResult());
        } else {
            LoginViewModelContract.DefaultImpls.handleLoginFailed$default(this, provider, operationResult.getErrorCode(), null, 4, null);
        }
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleProcessLoginDataSuccess(boolean isShowLoadingDialog) {
        String value = this.currentProvider.getValue();
        if (value == null) {
            value = IAccount.PROVIDER_UNKOWN;
        }
        this._loginUiState.setValue(this.handleProcessLoginDataSuccessUseCase.invoke(value, isShowLoadingDialog).asState());
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void handleUnknownFailed(@NotNull String provider, boolean showLoginError, int res, @NotNull LoginResult.Failed result) {
        this._loginUiState.postValue(ResultWrapper.INSTANCE.failed(this.handleLoginUnknownErrorUseCase.invoke(provider, showLoginError, res, result)));
    }

    public final void refreshLoginTypes() {
        f().setValue(b());
    }

    public final void switchLoginTypes() {
        if (Intrinsics.areEqual(f().getValue(), c())) {
            f().setValue(e());
        } else {
            f().setValue(c());
        }
    }

    public final void thirdAuthLogin(@NotNull String provider) {
        this.currentProvider.setValue(provider);
        this._loginUiState.postValue(ResultWrapper.INSTANCE.failed(new LoginFailed.CustomMessageTip(R.string.account_ui_logining)));
        ResultWrapper<ThirdPartAuthState, LoginFailed> resultWrapperInvoke = this.loginThirdAuthUseCase.invoke(provider);
        if (resultWrapperInvoke instanceof StateWrapper.Failed) {
            this._loginUiState.postValue(resultWrapperInvoke);
        } else if (resultWrapperInvoke instanceof StateWrapper.Success) {
            this._passportOperationEvent.postValue((PassportOperationState) ((StateWrapper.Success) resultWrapperInvoke).getData());
        }
    }

    @Override // com.huami.account.ui.login.viewmodel.LoginViewModelContract
    public void thirdAuthRegister(@NotNull String provider, @Nullable String accessToken, @NotNull Area area) {
        this._loginUiState.postValue(ResultWrapper.INSTANCE.failed(new LoginFailed.CustomMessageTip(R.string.account_ui_logining)));
        ResultWrapper<PassportOperationState, LoginFailed> resultWrapperInvoke = this.thirdAuthRegisterUseCase.invoke(provider, accessToken, area);
        if (resultWrapperInvoke instanceof StateWrapper.Failed) {
            this._loginUiState.postValue(resultWrapperInvoke);
        } else if (resultWrapperInvoke instanceof StateWrapper.Success) {
            this._passportOperationEvent.postValue((PassportOperationState) ((StateWrapper.Success) resultWrapperInvoke).getData());
        }
    }
}
