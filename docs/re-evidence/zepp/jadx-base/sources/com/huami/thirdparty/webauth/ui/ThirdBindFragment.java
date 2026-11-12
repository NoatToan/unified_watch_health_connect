package com.huami.thirdparty.webauth.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountStatEvent;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.thirdparty.support.ui.WebPageActivity;
import com.huami.thirdparty.support.widget.LoadingView;
import com.huami.thirdparty.webauth.TokenInfo;
import com.huami.thirdparty.webauth.client.AuthUser;
import com.huami.thirdparty.webauth.client.Relive;
import com.huami.thirdparty.webauth.client.RunKeeper;
import com.huami.thirdparty.webauth.client.Strava;
import com.huami.thirdparty.webauth.client.TrainingPeaks;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%¨\u0006*"}, d2 = {"Lcom/huami/thirdparty/webauth/ui/ThirdBindFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "", "a", "g", "e", "showLoading", "hideLoading", "c", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "authType", "", "b", "Ljava/lang/String;", "uid", "clientId", GoogleApiAvailabilityLight.a, AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "countryCode", "region", "name", "Lcom/huami/thirdparty/webauth/ui/AuthViewModel;", "h", "Lkotlin/Lazy;", "()Lcom/huami/thirdparty/webauth/ui/AuthViewModel;", "viewModel", "<init>", "()V", "Companion", "webauth-ui_release"}, k = 1, mv = {1, 4, 1})
public final class ThirdBindFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_AUTH_TYPE = "auth_type";

    @NotNull
    public static final String EXTRA_CLIENT_ID = "client_id";

    @NotNull
    public static final String EXTRA_COUNTRY_CODE = "country_code";

    @NotNull
    public static final String EXTRA_NAME = "name";

    @NotNull
    public static final String EXTRA_REGION = "region";

    @NotNull
    public static final String EXTRA_THIRD_NAME = "third_name";

    @NotNull
    public static final String EXTRA_UID = "uid";

    @NotNull
    public static final String TAG = "ThirdBindFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AuthType authType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String uid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String clientId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String thirdName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String countryCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String region;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy viewModel;
    private HashMap i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/huami/thirdparty/webauth/ui/ThirdBindFragment$Companion;", "", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "authType", "", "uid", "clientId", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "countryCode", "region", "name", "Landroid/os/Bundle;", "buildArguments", "EXTRA_AUTH_TYPE", "Ljava/lang/String;", "EXTRA_CLIENT_ID", "EXTRA_COUNTRY_CODE", "EXTRA_NAME", "EXTRA_REGION", "EXTRA_THIRD_NAME", "EXTRA_UID", "TAG", "<init>", "()V", "webauth-ui_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Bundle buildArguments(@NotNull AuthType authType, @NotNull String uid, @NotNull String clientId, @NotNull String thirdName, @NotNull String countryCode, @NotNull String region, @NotNull String name) {
            return BundleKt.bundleOf(TuplesKt.to("auth_type", authType), TuplesKt.to("uid", uid), TuplesKt.to("client_id", clientId), TuplesKt.to("third_name", thirdName), TuplesKt.to("country_code", countryCode), TuplesKt.to("region", region), TuplesKt.to("name", name));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AuthType.values().length];
            $EnumSwitchMapping$0 = iArr;
            AuthType authType = AuthType.Strava;
            iArr[authType.ordinal()] = 1;
            AuthType authType2 = AuthType.RunKeeper;
            iArr[authType2.ordinal()] = 2;
            AuthType authType3 = AuthType.Relive;
            iArr[authType3.ordinal()] = 3;
            AuthType authType4 = AuthType.TRAINING_PEAKS;
            iArr[authType4.ordinal()] = 4;
            int[] iArr2 = new int[AuthType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[authType.ordinal()] = 1;
            iArr2[authType2.ordinal()] = 2;
            iArr2[authType3.ordinal()] = 3;
            iArr2[authType4.ordinal()] = 4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.huami.thirdparty.webauth.ui.ThirdBindFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0620a extends Lambda implements Function0<String> {
            public static final C0620a a = new C0620a();

            public C0620a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "alipay授权-网络未连接";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "authSuccess", "", "accessToken", "", "a", "(ZLjava/lang/String;)V"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function2<Boolean, String, Unit> {
            public b() {
                super(2);
            }

            public final void a(boolean z, @NotNull String str) {
                if (ThirdBindFragment.this.getContext() == null) {
                    return;
                }
                if (!z) {
                    Toast.makeText(ThirdBindFragment.this.requireContext(), ThirdBindFragment.this.getString(R.string.auth_failed), 0).show();
                    return;
                }
                ThirdBindFragment.b(ThirdBindFragment.this, null, 1, null);
                Toast.makeText(ThirdBindFragment.this.requireContext(), ThirdBindFragment.this.getString(R.string.auth_success), 0).show();
                ThirdBindFragment.this.g();
                ThirdBindFragment.this.d().queryUser(ThirdBindFragment.this.authType, str);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
                a(bool.booleanValue(), str);
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!UtilKt.isNetworkConnected(ThirdBindFragment.this.requireContext())) {
                Toast.makeText(ThirdBindFragment.this.getContext(), ThirdBindFragment.this.getString(R.string.no_network_connection), 0).show();
                HMLog.error$default(ThirdBindFragment.TAG, null, null, C0620a.a, 6, null);
                return;
            }
            if (!ThirdBindFragment.this.d().isAuthorized()) {
                ThirdBindFragment.this.d().auth(ThirdBindFragment.this.requireActivity(), ThirdBindFragment.this.authType, ThirdBindFragment.this.clientId, ThirdBindFragment.this.uid, ThirdBindFragment.this.countryCode, ThirdBindFragment.this.region, ThirdBindFragment.this.name, new b());
                return;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[ThirdBindFragment.this.authType.ordinal()];
            if (i == 1) {
                if (com.huami.thirdparty.support.ExtensionKt.openStravaApp(ThirdBindFragment.this.requireActivity())) {
                    return;
                }
                ThirdBindFragment thirdBindFragment = ThirdBindFragment.this;
                thirdBindFragment.startActivity(WebPageActivity.INSTANCE.getIntent(thirdBindFragment.requireContext(), Strava.INSTANCE.getWebsite(), ThirdBindFragment.this.getString(R.string.strava)));
                return;
            }
            if (i == 2) {
                if (com.huami.thirdparty.support.ExtensionKt.openRunKeeperApp(ThirdBindFragment.this.requireActivity())) {
                    return;
                }
                ThirdBindFragment thirdBindFragment2 = ThirdBindFragment.this;
                thirdBindFragment2.startActivity(WebPageActivity.INSTANCE.getIntent(thirdBindFragment2.requireContext(), RunKeeper.INSTANCE.getWebsite(), ThirdBindFragment.this.getString(R.string.runkeeper)));
                return;
            }
            if (i == 3) {
                if (com.huami.thirdparty.support.ExtensionKt.openReliveApp(ThirdBindFragment.this.requireActivity())) {
                    return;
                }
                ThirdBindFragment thirdBindFragment3 = ThirdBindFragment.this;
                thirdBindFragment3.startActivity(WebPageActivity.INSTANCE.getIntent(thirdBindFragment3.requireContext(), Relive.INSTANCE.getWebsite(), ThirdBindFragment.this.getString(R.string.relive)));
                return;
            }
            if (i == 4 && !com.huami.thirdparty.support.ExtensionKt.openTrainingPeaksApp(ThirdBindFragment.this.requireActivity())) {
                ThirdBindFragment thirdBindFragment4 = ThirdBindFragment.this;
                thirdBindFragment4.startActivity(WebPageActivity.INSTANCE.getIntent(thirdBindFragment4.requireContext(), TrainingPeaks.INSTANCE.getWebsite(), ThirdBindFragment.this.getString(R.string.training_peaks)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements View.OnClickListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "alipay授权-网络未连接";
            }
        }

        /* JADX INFO: renamed from: com.huami.thirdparty.webauth.ui.ThirdBindFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "success", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0621b extends Lambda implements Function1<Boolean, Unit> {
            public C0621b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                ThirdBindFragment thirdBindFragment;
                int i;
                ThirdBindFragment.this.hideLoading();
                Context contextRequireContext = ThirdBindFragment.this.requireContext();
                if (z) {
                    thirdBindFragment = ThirdBindFragment.this;
                    i = R.string.cancel_auth_success;
                } else {
                    thirdBindFragment = ThirdBindFragment.this;
                    i = R.string.cancel_auth_failed;
                }
                Toast.makeText(contextRequireContext, thirdBindFragment.getString(i), 0).show();
                ThirdBindFragment.b(ThirdBindFragment.this, null, 1, null);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (UtilKt.isNetworkConnected(ThirdBindFragment.this.requireContext())) {
                ThirdBindFragment.this.showLoading();
                ThirdBindFragment.this.d().cancelAuth(ThirdBindFragment.this.authType, ThirdBindFragment.this.thirdName, ThirdBindFragment.this.name, ThirdBindFragment.this.uid, ThirdBindFragment.this.countryCode, new C0621b());
            } else {
                Toast.makeText(ThirdBindFragment.this.getContext(), ThirdBindFragment.this.getString(R.string.no_network_connection), 0).show();
                HMLog.error$default(ThirdBindFragment.TAG, null, null, a.a, 6, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/huami/thirdparty/webauth/TokenInfo;", "kotlin.jvm.PlatformType", "tokenInfo", "", "a", "(Lcom/huami/thirdparty/webauth/TokenInfo;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<T> implements Observer<TokenInfo> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(TokenInfo tokenInfo) {
            ThirdBindFragment.this.hideLoading();
            if (tokenInfo != null) {
                ThirdBindFragment.b(ThirdBindFragment.this, null, 1, null);
                if (ThirdBindFragment.this.d().isAuthorized()) {
                    ThirdBindFragment.this.g();
                    ThirdBindFragment.this.d().queryUser(ThirdBindFragment.this.authType, tokenInfo.getAccessToken());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/huami/thirdparty/webauth/client/AuthUser;", "kotlin.jvm.PlatformType", "authUser", "", "a", "(Lcom/huami/thirdparty/webauth/client/AuthUser;)V"}, k = 3, mv = {1, 4, 1})
    public static final class d<T> implements Observer<AuthUser> {
        public d() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(AuthUser authUser) {
            ThirdBindFragment.this.e();
            ThirdBindFragment.this.a((authUser != null ? authUser.getDisplayName() : null) == null ? ThirdBindFragment.this.c() : authUser.getDisplayName());
        }
    }

    public ThirdBindFragment() {
        super(R.layout.fragment_bind);
        this.authType = AuthType.Relive;
        this.uid = "";
        this.clientId = "";
        this.thirdName = "";
        this.countryCode = "";
        this.region = "";
        this.name = "";
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.thirdparty.webauth.ui.ThirdBindFragment$$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AuthViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.thirdparty.webauth.ui.ThirdBindFragment$$special$$inlined$viewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(CharSequence displayName) {
        boolean zIsAuthorized = d().isAuthorized();
        TextView textView = (TextView) _$_findCachedViewById(R.id.tv_account);
        if (zIsAuthorized) {
            if (displayName == null || displayName.length() == 0) {
                displayName = c();
            }
        } else {
            displayName = getString(R.string.unbounded);
        }
        textView.setText(displayName);
        ((Button) _$_findCachedViewById(R.id.tv_unbind)).setVisibility(zIsAuthorized ? 0 : 8);
    }

    public static /* synthetic */ void b(ThirdBindFragment thirdBindFragment, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        thirdBindFragment.a(charSequence);
    }

    @JvmStatic
    @NotNull
    public static final Bundle buildArguments(@NotNull AuthType authType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        return INSTANCE.buildArguments(authType, str, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence c() {
        return getString(R.string.unknown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthViewModel d() {
        return (AuthViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ((LoadingView) _$_findCachedViewById(R.id.loadingview)).setVisibility(8);
        ((TextView) _$_findCachedViewById(R.id.tv_account)).setVisibility(0);
    }

    private final int f() {
        return RainbowUtils.isDarkMode(requireContext()) ? R.drawable.icon_relive_night : R.drawable.icon_relive;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        ((LoadingView) _$_findCachedViewById(R.id.loadingview)).setVisibility(0);
        ((TextView) _$_findCachedViewById(R.id.tv_account)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading() {
        ((LoadingView) _$_findCachedViewById(R.id.loading)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        ((LoadingView) _$_findCachedViewById(R.id.loading)).setVisibility(0);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.i;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.i.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        super.onCreate(savedInstanceState);
        String str = "";
        if (savedInstanceState != null) {
            Serializable serializable = savedInstanceState.getSerializable("auth_type");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.huami.thirdparty.webauth.ui.AuthType");
            this.authType = (AuthType) serializable;
            String string7 = savedInstanceState.getString("uid");
            if (string7 == null) {
                string7 = "";
            }
            this.uid = string7;
            String string8 = savedInstanceState.getString("client_id");
            if (string8 == null) {
                string8 = "";
            }
            this.clientId = string8;
            String string9 = savedInstanceState.getString("third_name");
            if (string9 == null) {
                string9 = "";
            }
            this.thirdName = string9;
            String string10 = savedInstanceState.getString("country_code");
            if (string10 == null) {
                string10 = "";
            }
            this.countryCode = string10;
            String string11 = savedInstanceState.getString("region");
            if (string11 == null) {
                string11 = "";
            }
            this.region = string11;
            String string12 = savedInstanceState.getString("name");
            this.name = string12 != null ? string12 : "";
            return;
        }
        Bundle arguments = getArguments();
        Serializable serializable2 = arguments != null ? arguments.getSerializable("auth_type") : null;
        Objects.requireNonNull(serializable2, "null cannot be cast to non-null type com.huami.thirdparty.webauth.ui.AuthType");
        this.authType = (AuthType) serializable2;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("uid")) == null) {
            string = "";
        }
        this.uid = string;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("client_id")) == null) {
            string2 = "";
        }
        this.clientId = string2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("third_name")) == null) {
            string3 = "";
        }
        this.thirdName = string3;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string4 = arguments5.getString("country_code")) == null) {
            string4 = "";
        }
        this.countryCode = string4;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (string5 = arguments6.getString("region")) == null) {
            string5 = "";
        }
        this.region = string5;
        Bundle arguments7 = getArguments();
        if (arguments7 != null && (string6 = arguments7.getString("name")) != null) {
            str = string6;
        }
        this.name = str;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putAll(INSTANCE.buildArguments(this.authType, this.uid, this.clientId, this.thirdName, this.countryCode, this.region, this.name));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        int iF;
        super.onViewCreated(view, savedInstanceState);
        int i = R.id.bind_state_view;
        com.huami.thirdparty.support.ExtensionKt.backgroundRadius((RelativeLayout) _$_findCachedViewById(i), ContextCompat.getColor(requireContext(), R.color.s38), com.huami.thirdparty.support.ExtensionKt.dp2Px(requireContext(), 5.0f));
        ((RelativeLayout) _$_findCachedViewById(i)).setOnClickListener(new a());
        int i2 = R.id.tv_unbind;
        com.huami.thirdparty.support.ExtensionKt.backgroundRadius$default((Button) _$_findCachedViewById(i2), 0, com.huami.thirdparty.support.ExtensionKt.dp2Px(requireContext(), 5.0f), 1, null);
        ((Button) _$_findCachedViewById(i2)).setVisibility(8);
        ((Button) _$_findCachedViewById(i2)).setOnClickListener(new b());
        int i3 = WhenMappings.$EnumSwitchMapping$1[this.authType.ordinal()];
        if (i3 == 1) {
            iF = R.drawable.icon_strava;
        } else {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iF = f();
        }
        ((ImageView) _$_findCachedViewById(R.id.img_logo)).setImageResource(iF);
        ((TextView) _$_findCachedViewById(R.id.tv_name)).setText(this.authType.getAuthName());
        b(this, null, 1, null);
        showLoading();
        d().checkStatus(this.authType, this.uid, this.thirdName, this.countryCode, this.region, this.name);
        d().getTokenInfoLiveData().observe(getViewLifecycleOwner(), new c());
        d().getAuthUserLiveData().observe(getViewLifecycleOwner(), new d());
    }
}
