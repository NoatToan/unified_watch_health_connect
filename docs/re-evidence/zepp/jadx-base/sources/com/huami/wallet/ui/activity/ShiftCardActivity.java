package com.huami.wallet.ui.activity;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.OrderEntity;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.activity.ShiftCardActivity;
import com.huami.wallet.ui.fragment.ShiftCardProgressFragment;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.viewmodel.ShiftCardViewModel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0018\u0010'\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0018\u0010)\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0018\u0010+\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0018\u0010-\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010.\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010/\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0018\u00101\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010!¨\u00065"}, d2 = {"Lcom/huami/wallet/ui/activity/ShiftCardActivity;", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "Lcom/huami/wallet/lib/entity/Resource;", "", "it", "", "m", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/nfc/bus/OrderEntity;", GoogleApiAvailabilityLight.b, "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/huami/wallet/ui/navigation/NavigationController;", "c", "Lkotlin/Lazy;", "getMNavigationController", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/viewmodel/ShiftCardViewModel;", GoogleApiAvailabilityLight.a, "i", "()Lcom/huami/wallet/ui/viewmodel/ShiftCardViewModel;", "shiftCardViewModel", "e", "Z", "isShiftIn", "f", "isShiftInException", "", "g", "Ljava/lang/String;", "orderId", "h", "shiftOrderNo", "appCode", z.j, "cardName", hl.k, "xiaomiCardName", "l", "imgUrl", "isInProgress", "_packageName", "appName", "redirectTo", DTransferConstants.SEARCH_KEY, "serviceContact", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ShiftCardActivity extends BaseWalletActivity {

    @NotNull
    public static final String EXTRA_APPNAME = "EXTRA_APPNAME";

    @NotNull
    public static final String EXTRA_BUS_CARD_ID = "EXTRA_BUS_CARD_ID";

    @NotNull
    public static final String EXTRA_BUS_CARD_NAME = "EXTRA_BUS_CARD_NAME";

    @NotNull
    public static final String EXTRA_ERROR_CODE = "EXTRA_ERROR_CODE";

    @NotNull
    public static final String EXTRA_ERROR_MSG = "EXTRA_ERROR_MSG";

    @NotNull
    public static final String EXTRA_IS_SHIFTIN_EXCEPTION = "EXTRA_IS_SHIFTIN_EXCEPTION";

    @NotNull
    public static final String EXTRA_IS_SHIFT_IN = "EXTRA_IS_SHIFT_IN";

    @NotNull
    public static final String EXTRA_PACKAGENAME = "EXTRA_PACKAGENAME";

    @NotNull
    public static final String EXTRA_REDIRECTTO = "EXTRA_REDIRECTTO";

    @NotNull
    public static final String EXTRA_SERVICECONTACT = "EXTRA_SERVICECONTACT";

    @NotNull
    public static final String EXTRA_SHIFT_ORDER_ID = "EXTRA_SHIFT_ORDER_ID";

    @NotNull
    public static final String EXTRA_XIAO_MI_CARD_NAME = "EXTRA_XIAO_MI_CARD_NAME";

    @NotNull
    public static final String EXTRA_XM_ACTION_TOKEN = "EXTRA_XM_ACTION_TOKEN";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy shiftCardViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShiftIn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isShiftInException;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String orderId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String shiftOrderNo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String appCode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String cardName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String xiaomiCardName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String imgUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isInProgress;

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
    public ShiftCardActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.activity.ShiftCardActivity$special$$inlined$inject$default$1
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
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.activity.ShiftCardActivity$special$$inlined$viewModel$default$1
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
        this.shiftCardViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<ShiftCardViewModel>() { // from class: com.huami.wallet.ui.activity.ShiftCardActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ShiftCardViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShiftCardViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(ShiftCardViewModel.class), function0, objArr3);
            }
        });
        this.isShiftIn = true;
    }

    private final NavigationController getMNavigationController() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final ShiftCardViewModel i() {
        return (ShiftCardViewModel) this.shiftCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ShiftCardActivity shiftCardActivity, Resource resource) {
        shiftCardActivity.m(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ShiftCardActivity shiftCardActivity, Resource resource) {
        shiftCardActivity.p(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ShiftCardActivity shiftCardActivity, Resource resource) {
        shiftCardActivity.n(resource);
    }

    private final void m(Resource<Boolean> it2) {
        if (it2 == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[it2.status.ordinal()];
        if (i == 1) {
            if (this.isInProgress) {
                return;
            }
            this.isInProgress = true;
            getMNavigationController().navigateToShiftProgress(this, this.cardName, this.isShiftIn);
            return;
        }
        if (i == 2 || i == 3) {
            this.isInProgress = false;
            if (this.isShiftInException) {
                getMNavigationController().navigateToShiftResult(this, this.cardName, this.xiaomiCardName, it2.status == Status.SUCCESS, this.isShiftIn, this.imgUrl, this.appCode, this.orderId, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
            } else {
                getMNavigationController().navigateToShiftResult(this, this.cardName, this.xiaomiCardName, it2.status == Status.SUCCESS, this.isShiftIn, this.imgUrl, this.appCode, this.shiftOrderNo, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
            }
        }
    }

    private final void n(Resource<OrderEntity> it2) {
        if (it2 == null) {
            return;
        }
        if (it2.isSuccessful()) {
            o(it2);
            return;
        }
        Status status = it2.status;
        if (status != Status.ERROR) {
            if (status == Status.LOADING) {
                this.isInProgress = true;
                getMNavigationController().navigateToShiftProgress(this, this.cardName, this.isShiftIn);
                return;
            }
            return;
        }
        this.isInProgress = false;
        NavigationController mNavigationController = getMNavigationController();
        String str = this.cardName;
        String str2 = this.xiaomiCardName;
        boolean z = this.isShiftIn;
        String str3 = this.imgUrl;
        String str4 = this.appCode;
        String str5 = this.shiftOrderNo;
        if (str5 == null) {
            str5 = this.orderId;
        }
        mNavigationController.navigateToShiftResult(this, str, str2, false, z, str3, str4, str5, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    private final void o(Resource<OrderEntity> it2) {
        String str;
        ShiftCardActivity shiftCardActivity;
        OrderEntity orderEntity;
        OrderEntity orderEntity2;
        OrderEntity orderEntity3 = it2.data;
        String orderNum = null;
        if (orderEntity3 == null) {
            this.isInProgress = false;
            NavigationController mNavigationController = getMNavigationController();
            String str2 = this.cardName;
            String str3 = this.xiaomiCardName;
            boolean z = this.isShiftIn;
            String str4 = this.imgUrl;
            String str5 = this.appCode;
            str = this.shiftOrderNo;
            if (str == null) {
                str = this.orderId;
            }
            mNavigationController.navigateToShiftResult(this, str2, str3, false, z, str4, str5, str, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
            shiftCardActivity = this;
        } else {
            OrderEntity orderEntity4 = orderEntity3;
            if ((orderEntity4 == null ? null : orderEntity4.getOrderNum()) == null) {
                this.isInProgress = false;
                NavigationController mNavigationController2 = getMNavigationController();
                String str6 = this.cardName;
                String str7 = this.xiaomiCardName;
                boolean z2 = this.isShiftIn;
                String str8 = this.imgUrl;
                String str9 = this.appCode;
                str = this.shiftOrderNo;
                if (str == null) {
                    str = this.orderId;
                }
                mNavigationController2.navigateToShiftResult(this, str6, str7, false, z2, str8, str9, str, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
                shiftCardActivity = this;
            } else {
                shiftCardActivity = this;
            }
        }
        if (shiftCardActivity.isShiftIn) {
            ShiftCardViewModel shiftCardViewModelI = i();
            String str10 = shiftCardActivity.appCode;
            Resource<OrderEntity> value = i().getShiftOrderLiveData().getValue();
            if (value != null && (orderEntity2 = value.data) != null) {
                orderNum = orderEntity2.getOrderNum();
            }
            shiftCardViewModelI.shiftIn(str10, orderNum, shiftCardActivity.shiftOrderNo);
            return;
        }
        ShiftCardViewModel shiftCardViewModelI2 = i();
        String str11 = shiftCardActivity.appCode;
        Resource<OrderEntity> value2 = i().getShiftOrderLiveData().getValue();
        if (value2 != null && (orderEntity = value2.data) != null) {
            orderNum = orderEntity.getOrderNum();
        }
        shiftCardViewModelI2.shiftOut(str11, orderNum, "");
    }

    private final void p(Resource<Boolean> it2) {
        if (it2 == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[it2.status.ordinal()];
        if (i == 1) {
            if (this.isInProgress) {
                return;
            }
            this.isInProgress = true;
            getMNavigationController().navigateToShiftProgress(this, this.cardName, this.isShiftIn);
            return;
        }
        if (i == 2) {
            this.isInProgress = false;
            getMNavigationController().navigateToShiftResult(this, this.cardName, this.xiaomiCardName, true, this.isShiftIn, this.imgUrl, this.appCode, null, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
        } else {
            if (i != 3) {
                return;
            }
            this.isInProgress = false;
            getMNavigationController().navigateToShiftResult(this, this.cardName, this.xiaomiCardName, false, this.isShiftIn, this.imgUrl, this.appCode, this.orderId, Boolean.valueOf(this.isShiftInException), "", "", "", this._packageName, this.appName, this.redirectTo, this.serviceContact);
        }
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
        super.onCreate(savedInstanceState);
        this.isShiftIn = getIntent().getBooleanExtra(EXTRA_IS_SHIFT_IN, true);
        this.isShiftInException = getIntent().getBooleanExtra(EXTRA_IS_SHIFTIN_EXCEPTION, false);
        this.appCode = getIntent().getStringExtra(EXTRA_BUS_CARD_ID);
        this.cardName = getIntent().getStringExtra(EXTRA_BUS_CARD_NAME);
        this.xiaomiCardName = getIntent().getStringExtra(EXTRA_XIAO_MI_CARD_NAME);
        this.imgUrl = getIntent().getStringExtra("EXTRA_EXPAND_CARD_IMG_URL");
        this._packageName = getIntent().getStringExtra("EXTRA_PACKAGENAME");
        this.appName = getIntent().getStringExtra("EXTRA_APPNAME");
        this.redirectTo = getIntent().getStringExtra("EXTRA_REDIRECTTO");
        this.serviceContact = getIntent().getStringExtra("EXTRA_SERVICECONTACT");
        if (!this.isShiftIn || this.isShiftInException) {
            this.orderId = getIntent().getStringExtra(EXTRA_SHIFT_ORDER_ID);
        } else {
            this.shiftOrderNo = getIntent().getStringExtra(EXTRA_SHIFT_ORDER_ID);
        }
        if (this.isShiftIn) {
            i().getShiftInLiveData().observe(this, new Observer() { // from class: at6
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    ShiftCardActivity.j(this.a, (Resource) obj);
                }
            });
            i().shiftIn(this.appCode, this.orderId, this.shiftOrderNo);
        } else {
            i().getShiftOutLiveData().observe(this, new Observer() { // from class: bt6
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    ShiftCardActivity.k(this.a, (Resource) obj);
                }
            });
            i().shiftOut(this.appCode, this.orderId, "");
        }
        i().getShiftOrderLiveData().observe(this, new Observer() { // from class: ct6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ShiftCardActivity.l(this.a, (Resource) obj);
            }
        });
    }
}
