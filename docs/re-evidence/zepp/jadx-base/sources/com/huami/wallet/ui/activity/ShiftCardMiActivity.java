package com.huami.wallet.ui.activity;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.activity.ShiftCardMiActivity;
import com.huami.wallet.ui.fragment.ShiftCardProgressFragment;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.viewmodel.ShiftCardMiViewModel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010$\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0016\u0010&\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0018\u0010(\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0018\u0010,\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0018\u0010.\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001c¨\u00061"}, d2 = {"Lcom/huami/wallet/ui/activity/ShiftCardMiActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "", hl.k, "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "Lkotlin/Lazy;", "getMNavigationController", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/viewmodel/ShiftCardMiViewModel;", GoogleApiAvailabilityLight.a, "h", "()Lcom/huami/wallet/ui/viewmodel/ShiftCardMiViewModel;", "shiftCardMiViewModel", "", "e", "Z", "isShiftIn", "f", "isShiftInException", "", "g", "Ljava/lang/String;", "orderId", "appCode", "cardName", z.j, "xiaomiCardName", "imgUrl", "l", "isInProgress", "m", "xmActionToken", GoogleApiAvailabilityLight.b, "_packageName", "o", "appName", com.google.android.exoplayer2.text.ttml.b.r, "redirectTo", DTransferConstants.SEARCH_KEY, "serviceContact", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftCardMiActivity extends BaseWalletActivity {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy shiftCardMiViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShiftIn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isShiftInException;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String orderId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String appCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String cardName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String xiaomiCardName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String imgUrl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isInProgress;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String xmActionToken;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String _packageName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private String appName;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String redirectTo;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String serviceContact;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShiftCardMiActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.activity.ShiftCardMiActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.activity.ShiftCardMiActivity$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.shiftCardMiViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<ShiftCardMiViewModel>() { // from class: com.huami.wallet.ui.activity.ShiftCardMiActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ShiftCardMiViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShiftCardMiViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(ShiftCardMiViewModel.class), function0, objArr3);
            }
        });
        this.isShiftIn = true;
    }

    private final NavigationController getMNavigationController() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final ShiftCardMiViewModel h() {
        return (ShiftCardMiViewModel) this.shiftCardMiViewModel.getValue();
    }

    private final void i() {
        h().getShiftInLiveData().observe(this, new Observer() { // from class: et6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ShiftCardMiActivity.j(this.a, (Resource) obj);
            }
        });
        ShiftCardMiViewModel shiftCardMiViewModelH = h();
        String str = this.appCode;
        Objects.requireNonNull(str);
        String str2 = this.orderId;
        Objects.requireNonNull(str2);
        String str3 = this.xmActionToken;
        Objects.requireNonNull(str3);
        shiftCardMiViewModelH.shiftInCard(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ShiftCardMiActivity shiftCardMiActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i == 1) {
            if (shiftCardMiActivity.isInProgress) {
                return;
            }
            shiftCardMiActivity.isInProgress = true;
            shiftCardMiActivity.getMNavigationController().navigateToShiftProgress(shiftCardMiActivity, shiftCardMiActivity.cardName, shiftCardMiActivity.isShiftIn);
            return;
        }
        if (i == 2) {
            shiftCardMiActivity.isInProgress = false;
            NavigationController mNavigationController = shiftCardMiActivity.getMNavigationController();
            String str = shiftCardMiActivity.cardName;
            String str2 = shiftCardMiActivity.xiaomiCardName;
            boolean z = shiftCardMiActivity.isShiftIn;
            String str3 = shiftCardMiActivity.imgUrl;
            String str4 = shiftCardMiActivity.appCode;
            Objects.requireNonNull(str4);
            Boolean boolValueOf = Boolean.valueOf(shiftCardMiActivity.isShiftInException);
            String str5 = shiftCardMiActivity.xmActionToken;
            Objects.requireNonNull(str5);
            mNavigationController.navigateToShiftResult(shiftCardMiActivity, str, str2, true, z, str3, str4, null, boolValueOf, str5, "", "", shiftCardMiActivity._packageName, shiftCardMiActivity.appName, shiftCardMiActivity.redirectTo, shiftCardMiActivity.serviceContact);
            return;
        }
        if (i != 3) {
            return;
        }
        shiftCardMiActivity.isInProgress = false;
        NavigationController mNavigationController2 = shiftCardMiActivity.getMNavigationController();
        String str6 = shiftCardMiActivity.cardName;
        String str7 = shiftCardMiActivity.xiaomiCardName;
        boolean z2 = shiftCardMiActivity.isShiftIn;
        String str8 = shiftCardMiActivity.imgUrl;
        String str9 = shiftCardMiActivity.appCode;
        Objects.requireNonNull(str9);
        String str10 = shiftCardMiActivity.orderId;
        Objects.requireNonNull(str10);
        Boolean boolValueOf2 = Boolean.valueOf(shiftCardMiActivity.isShiftInException);
        String str11 = shiftCardMiActivity.xmActionToken;
        Objects.requireNonNull(str11);
        mNavigationController2.navigateToShiftResult(shiftCardMiActivity, str6, str7, false, z2, str8, str9, str10, boolValueOf2, str11, String.valueOf(resource.code), String.valueOf(resource.message), shiftCardMiActivity._packageName, shiftCardMiActivity.appName, shiftCardMiActivity.redirectTo, shiftCardMiActivity.serviceContact);
    }

    private final void k() {
        h().getShiftOutLiveData().observe(this, new Observer() { // from class: dt6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ShiftCardMiActivity.l(this.a, (Resource) obj);
            }
        });
        ShiftCardMiViewModel shiftCardMiViewModelH = h();
        String str = this.appCode;
        Objects.requireNonNull(str);
        String str2 = this.orderId;
        Objects.requireNonNull(str2);
        String str3 = this.xmActionToken;
        Objects.requireNonNull(str3);
        shiftCardMiViewModelH.shiftOutCard(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ShiftCardMiActivity shiftCardMiActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i == 1) {
            if (shiftCardMiActivity.isInProgress) {
                return;
            }
            shiftCardMiActivity.isInProgress = true;
            shiftCardMiActivity.getMNavigationController().navigateToShiftProgress(shiftCardMiActivity, shiftCardMiActivity.cardName, shiftCardMiActivity.isShiftIn);
            return;
        }
        if (i == 2) {
            shiftCardMiActivity.isInProgress = false;
            NavigationController mNavigationController = shiftCardMiActivity.getMNavigationController();
            String str = shiftCardMiActivity.cardName;
            String str2 = shiftCardMiActivity.xiaomiCardName;
            boolean z = shiftCardMiActivity.isShiftIn;
            String str3 = shiftCardMiActivity.imgUrl;
            String str4 = shiftCardMiActivity.appCode;
            Objects.requireNonNull(str4);
            Boolean boolValueOf = Boolean.valueOf(shiftCardMiActivity.isShiftInException);
            String str5 = shiftCardMiActivity.xmActionToken;
            Objects.requireNonNull(str5);
            mNavigationController.navigateToShiftResult(shiftCardMiActivity, str, str2, true, z, str3, str4, null, boolValueOf, str5, "", "", shiftCardMiActivity._packageName, shiftCardMiActivity.appName, shiftCardMiActivity.redirectTo, shiftCardMiActivity.serviceContact);
            return;
        }
        if (i != 3) {
            return;
        }
        shiftCardMiActivity.isInProgress = false;
        NavigationController mNavigationController2 = shiftCardMiActivity.getMNavigationController();
        String str6 = shiftCardMiActivity.cardName;
        String str7 = shiftCardMiActivity.xiaomiCardName;
        boolean z2 = shiftCardMiActivity.isShiftIn;
        String str8 = shiftCardMiActivity.imgUrl;
        String str9 = shiftCardMiActivity.appCode;
        Objects.requireNonNull(str9);
        String str10 = shiftCardMiActivity.orderId;
        Objects.requireNonNull(str10);
        Boolean boolValueOf2 = Boolean.valueOf(shiftCardMiActivity.isShiftInException);
        String str11 = shiftCardMiActivity.xmActionToken;
        Objects.requireNonNull(str11);
        mNavigationController2.navigateToShiftResult(shiftCardMiActivity, str6, str7, false, z2, str8, str9, str10, boolValueOf2, str11, String.valueOf(resource.code), String.valueOf(resource.message), shiftCardMiActivity._packageName, shiftCardMiActivity.appName, shiftCardMiActivity.redirectTo, shiftCardMiActivity.serviceContact);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentByTag(ShiftCardProgressFragment.TAG) != null) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.huami.wallet.ui.activity.BaseWalletActivity, com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        this.isShiftIn = getIntent().getBooleanExtra(ShiftCardActivity.EXTRA_IS_SHIFT_IN, true);
        this.isShiftInException = getIntent().getBooleanExtra(ShiftCardActivity.EXTRA_IS_SHIFTIN_EXCEPTION, false);
        String stringExtra2 = getIntent().getStringExtra(ShiftCardActivity.EXTRA_BUS_CARD_ID);
        String str = "";
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.appCode = stringExtra2;
        this.cardName = getIntent().getStringExtra(ShiftCardActivity.EXTRA_BUS_CARD_NAME);
        this.xiaomiCardName = getIntent().getStringExtra(ShiftCardActivity.EXTRA_XIAO_MI_CARD_NAME);
        this.imgUrl = getIntent().getStringExtra("EXTRA_EXPAND_CARD_IMG_URL");
        String stringExtra3 = getIntent().getStringExtra(ShiftCardActivity.EXTRA_SHIFT_ORDER_ID);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.orderId = stringExtra3;
        this._packageName = getIntent().getStringExtra("EXTRA_PACKAGENAME");
        this.appName = getIntent().getStringExtra("EXTRA_APPNAME");
        this.redirectTo = getIntent().getStringExtra("EXTRA_REDIRECTTO");
        this.serviceContact = getIntent().getStringExtra("EXTRA_SERVICECONTACT");
        if (getIntent().hasExtra(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN) && getIntent().getStringExtra(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN) != null && (stringExtra = getIntent().getStringExtra(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN)) != null) {
            str = stringExtra;
        }
        this.xmActionToken = str;
        if (this.isShiftIn) {
            i();
        } else {
            k();
        }
    }
}
