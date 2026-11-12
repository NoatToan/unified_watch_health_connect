package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HmFitbitDeviceActivity;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/HmFitbitDeviceActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "Landroid/widget/TextView;", "subTitleTv", "", "subTitle", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/databases/model/Device;", "x", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/databases/model/Device;", "mDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "y", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mSource", "Lcom/huami/devicex/manager/DeviceManagerApi;", "z", GoogleApiAvailabilityLight.b, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "o", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmFitbitDeviceActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_DB_DEVICE = "db_device";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDevice = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSource = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/HmFitbitDeviceActivity$Companion;", "", "Landroid/app/Activity;", "activity", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", WebConstant.QueryParam.LAUNCH, "", "KEY_DB_DEVICE", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Activity activity, @NotNull Device device) {
            Intent intent = new Intent(activity, (Class<?>) HmFitbitDeviceActivity.class);
            intent.putExtra("db_device", device);
            Unit unit = Unit.INSTANCE;
            activity.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Device> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Device invoke() {
            Serializable serializableExtra = HmFitbitDeviceActivity.this.getIntent().getSerializableExtra("db_device");
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.Device");
            return (Device) serializableExtra;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMDeviceSource> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            return HMDeviceSource.fromValue(HmFitbitDeviceActivity.this.p().getDevice_source().intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmFitbitDeviceActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HmFitbitDeviceActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.HmFitbitDeviceActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    private final void initView() {
        String deviceDescription;
        if (GlobalConfig.get().isBuildMidong() && n().isUseWearCompanionName(p())) {
            deviceDescription = o().getHuamiDeviceDescription(p());
        } else {
            deviceDescription = o().getDeviceDescription(q(), HMBrandType.fromValue(p().getBrandType().intValue()));
            if (deviceDescription == null) {
                deviceDescription = "";
            }
        }
        setTitleText(deviceDescription);
        if (TextUtils.isEmpty(p().getDisplayName())) {
            getSubTitleTextView().setVisibility(8);
        } else {
            String displayName = p().getDisplayName();
            int length = displayName.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) displayName.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (displayName.subSequence(i, length + 1).toString().length() > 0) {
                t(getSubTitleTextView(), p().getDisplayName());
            } else {
                getSubTitleTextView().setVisibility(8);
            }
        }
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: l74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmFitbitDeviceActivity.r(this.a, view);
            }
        });
    }

    private final DeviceManagerApi n() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi o() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Device p() {
        return (Device) this.mDevice.getValue();
    }

    private final HMDeviceSource q() {
        return (HMDeviceSource) this.mSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final HmFitbitDeviceActivity hmFitbitDeviceActivity, View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(hmFitbitDeviceActivity.p(), hmFitbitDeviceActivity.getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: m74
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                HmFitbitDeviceActivity.s(this.a, str);
            }
        });
        if (alertDialogFragmentNewInstance == null) {
            return;
        }
        alertDialogFragmentNewInstance.show(hmFitbitDeviceActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HmFitbitDeviceActivity hmFitbitDeviceActivity, String str) {
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                hmFitbitDeviceActivity.getSubTitleTextView().setVisibility(0);
                hmFitbitDeviceActivity.t(hmFitbitDeviceActivity.getSubTitleTextView(), str);
                return;
            }
        }
        hmFitbitDeviceActivity.getSubTitleTextView().setVisibility(8);
    }

    private final void t(TextView subTitleTv, String subTitle) {
        if (TextUtils.isEmpty(subTitle)) {
            subTitleTv.setVisibility(8);
        } else {
            subTitleTv.setVisibility(0);
            subTitleTv.setText(subTitle);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitbit_device);
        setStyle(BaseTitleActivity.STYLE.BACK_DOUBLE_TITLE_DEVICE, 0, true);
        updateTitleLayout();
        initView();
    }
}
