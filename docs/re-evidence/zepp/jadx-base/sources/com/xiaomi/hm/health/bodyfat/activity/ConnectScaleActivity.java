package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.ConnectScaleActivity;
import com.xiaomi.hm.health.bodyfat.fragment.ConnectScaleFailureFragment;
import com.xiaomi.hm.health.bodyfat.fragment.ConnectScaleFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.viewmodel.ConnectScaleViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/ConnectScaleActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/ConnectScaleViewModel;", "x", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/ConnectScaleViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ConnectScaleActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ConnectScaleViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.bodyfat.activity.ConnectScaleActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.bodyfat.activity.ConnectScaleActivity$special$$inlined$viewModels$default$1
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

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int y = 17;
    private static final int z = 18;
    private static final int A = 19;
    private static final int B = 20;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\b\u001a\u00020\u00048\u0006@\u0007X\u0087D¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0007X\u0087D¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0007X\u0087D¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0007X\u0087D¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/ConnectScaleActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "type", "", WebConstant.QueryParam.LAUNCH, "TYPE_BABY_WEIGHT", LogUtil.I, "getTYPE_BABY_WEIGHT", "()I", "getTYPE_BABY_WEIGHT$annotations", "()V", "TYPE_GUEST", "getTYPE_GUEST", "getTYPE_GUEST$annotations", "TYPE_BALANCE", "getTYPE_BALANCE", "getTYPE_BALANCE$annotations", "TYPE_GUEST_BALANCE", "getTYPE_GUEST_BALANCE", "getTYPE_GUEST_BALANCE$annotations", "<init>", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_BABY_WEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_BALANCE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_GUEST$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_GUEST_BALANCE$annotations() {
        }

        public final int getTYPE_BABY_WEIGHT() {
            return ConnectScaleActivity.y;
        }

        public final int getTYPE_BALANCE() {
            return ConnectScaleActivity.A;
        }

        public final int getTYPE_GUEST() {
            return ConnectScaleActivity.z;
        }

        public final int getTYPE_GUEST_BALANCE() {
            return ConnectScaleActivity.B;
        }

        public final void launch(@NotNull Context context, int type) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            Intent intent = new Intent(context, (Class<?>) ConnectScaleActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.ERROR.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getTYPE_BABY_WEIGHT() {
        return INSTANCE.getTYPE_BABY_WEIGHT();
    }

    public static final int getTYPE_BALANCE() {
        return INSTANCE.getTYPE_BALANCE();
    }

    public static final int getTYPE_GUEST() {
        return INSTANCE.getTYPE_GUEST();
    }

    public static final int getTYPE_GUEST_BALANCE() {
        return INSTANCE.getTYPE_GUEST_BALANCE();
    }

    private final void initView() {
        String string;
        Bundle extras = getIntent().getExtras();
        Integer numValueOf = extras == null ? null : Integer.valueOf(extras.getInt("type"));
        final int iIntValue = numValueOf == null ? y : numValueOf.intValue();
        if (iIntValue == y) {
            string = getString(R.string.hold_baby_weight);
        } else if (iIntValue == z) {
            string = getString(R.string.guest_mode);
        } else {
            boolean z2 = true;
            if (iIntValue != A && iIntValue != B) {
                z2 = false;
            }
            string = z2 ? getString(R.string.bodyfat_title_measure_balance) : "";
        }
        BFTitleStyleKt.setUnifyTitleStyle$default(this, string, null, 2, null);
        getViewModel().setType(iIntValue);
        getViewModel().getConnectPage().observe(this, new Observer() { // from class: ez0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ConnectScaleActivity.n(this.a, (Boolean) obj);
            }
        });
        getViewModel().getEnterModeResult().observe(this, new Observer() { // from class: fz0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ConnectScaleActivity.o(this.a, iIntValue, (Resource) obj);
            }
        });
        if (BFCallback.getHMDeviceManager().isBluetoothEnable()) {
            return;
        }
        CustomToast.makeText(this, getString(R.string.bodyfat_wifi_bluetooth_disable_title), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ConnectScaleActivity connectScaleActivity, Boolean bool) {
        if (bool.booleanValue()) {
            connectScaleActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new ConnectScaleFragment()).commit();
        } else {
            connectScaleActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new ConnectScaleFailureFragment()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ConnectScaleActivity connectScaleActivity, int i, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i2 == 1) {
            connectScaleActivity.getViewModel().getConnectPage().setValue(Boolean.FALSE);
            return;
        }
        if (i2 != 2) {
            return;
        }
        if (i == y) {
            connectScaleActivity.startActivity(new Intent(connectScaleActivity, (Class<?>) BabyWeightActivity.class));
            connectScaleActivity.finish();
            return;
        }
        if (i == z) {
            Intent intent = new Intent(connectScaleActivity, (Class<?>) WeightingActivity.class);
            intent.putExtra("IS_GUEST", true);
            connectScaleActivity.startActivity(intent);
            connectScaleActivity.finish();
            return;
        }
        if (i == A) {
            MeasureBalanceScoreActivity.INSTANCE.startMe(connectScaleActivity, false);
            connectScaleActivity.finish();
        } else if (i == B) {
            MeasureBalanceScoreActivity.INSTANCE.startMe(connectScaleActivity, true);
            connectScaleActivity.finish();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ConnectScaleViewModel getViewModel() {
        return (ConnectScaleViewModel) this.viewModel.getValue();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_scale);
        initView();
    }
}
