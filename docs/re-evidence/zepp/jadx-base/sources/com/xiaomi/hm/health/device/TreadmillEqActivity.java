package com.xiaomi.hm.health.device;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.classic.EqEntity;
import com.xiaomi.hm.health.bt.classic.EqUnit;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.device.TreadmillEqActivity;
import com.xiaomi.hm.health.device.view.TreadmillEqBottomView;
import com.xiaomi.hm.health.device.view.TreadmillEqView;
import com.xiaomi.hm.health.utils.UIStandardUtilKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.base.models.ClickCommon;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010-\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010\"R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010\"R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010\"R\u0016\u00105\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u0010\"R\u0016\u00107\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010\"R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u0010\"R\u0016\u0010;\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010\"R\u001d\u0010A\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/device/TreadmillEqActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "initViews", "t", "Lcom/xiaomi/hm/health/bt/classic/EqEntity;", "eqEntity", SOAP.XMLNS, "", "value", "", "r", "index", DTransferConstants.SEARCH_KEY, "Landroid/widget/TextView;", ClickCommon.CLICK_AREA_BTN, "m", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onClick", "Lcom/xiaomi/hm/health/device/view/TreadmillEqView;", "x", "Lcom/xiaomi/hm/health/device/view/TreadmillEqView;", "eqView", "Lcom/xiaomi/hm/health/device/view/TreadmillEqBottomView;", "y", "Lcom/xiaomi/hm/health/device/view/TreadmillEqBottomView;", "eqBottomView", "z", "Landroid/widget/TextView;", "selectedBtn", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "closeBtn", "B", "diyBtn", "C", "popularBtn", LogUtil.D, "danceBtn", "E", "classicBtn", "F", "blueBtn", "G", "jazzBtn", "H", "slowBtn", LogUtil.I, "electronicBtn", "J", "rockBtn", "K", "countryBtn", "L", "voiceBtn", "Lcom/huami/devicex/manager/DeviceManagerApi;", "M", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "N", "o", "()Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "boltClassicDevice", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "O", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TreadmillEqActivity extends BaseTitleActivity implements KoinComponent {

    @NotNull
    private static final String P = "BoltEqActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private TextView closeBtn;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private TextView diyBtn;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private TextView popularBtn;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private TextView danceBtn;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private TextView classicBtn;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private TextView blueBtn;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private TextView jazzBtn;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private TextView slowBtn;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private TextView electronicBtn;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private TextView rockBtn;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private TextView countryBtn;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private TextView voiceBtn;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final Lazy boltClassicDevice;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private TreadmillEqView eqView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private TreadmillEqBottomView eqBottomView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private TextView selectedBtn;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final int[] Q = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    @NotNull
    private static final int[] R = {5, 2, 0, -3, -6, -6, -3, 0, 1, 3};

    @NotNull
    private static final int[] S = {6, 6, 3, 0, 0, -4, -6, -6, 0, 0};

    @NotNull
    private static final int[] T = {3, 6, 6, 3, -2, 0, 4, 5, 6, 6};

    @NotNull
    private static final int[] U = {0, 0, 0, 0, 0, 0, -5, -5, -6, -6};

    @NotNull
    private static final int[] V = {0, 0, 2, 4, 4, 4, 0, 1, 3, 3};

    @NotNull
    private static final int[] W = {5, 4, 2, 1, -2, 0, 3, 5, 6, 6};

    @NotNull
    private static final int[] X = {6, 5, 0, -5, -4, 0, 5, 6, 6, 6};

    @NotNull
    private static final int[] Y = {6, 4, -4, 6, -2, 1, 5, 6, 6, 6};

    @NotNull
    private static final int[] Z = {4, 5, 2, -5, 1, 1, -4, 3, 6, 5};

    @NotNull
    private static final int[] m0 = {-2, -1, -1, 0, 3, 5, 3, 0, 0, 1};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/TreadmillEqActivity$Companion;", "", "", "GAINS_CLOSE", "[I", "getGAINS_CLOSE", "()[I", "GAINS_POPULAR", "getGAINS_POPULAR", "GAINS_DANCE", "getGAINS_DANCE", "GAINS_BLUE", "getGAINS_BLUE", "GAINS_CLASSIC", "getGAINS_CLASSIC", "GAINS_JAZZ", "getGAINS_JAZZ", "GAINS_SLOW", "getGAINS_SLOW", "GAINS_ELECTRONIC", "getGAINS_ELECTRONIC", "GAINS_ROCK", "getGAINS_ROCK", "GAINS_COUNTRY", "getGAINS_COUNTRY", "GAINS_VOICE", "getGAINS_VOICE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final int[] getGAINS_BLUE() {
            return TreadmillEqActivity.T;
        }

        @NotNull
        public final int[] getGAINS_CLASSIC() {
            return TreadmillEqActivity.U;
        }

        @NotNull
        public final int[] getGAINS_CLOSE() {
            return TreadmillEqActivity.Q;
        }

        @NotNull
        public final int[] getGAINS_COUNTRY() {
            return TreadmillEqActivity.Z;
        }

        @NotNull
        public final int[] getGAINS_DANCE() {
            return TreadmillEqActivity.S;
        }

        @NotNull
        public final int[] getGAINS_ELECTRONIC() {
            return TreadmillEqActivity.X;
        }

        @NotNull
        public final int[] getGAINS_JAZZ() {
            return TreadmillEqActivity.V;
        }

        @NotNull
        public final int[] getGAINS_POPULAR() {
            return TreadmillEqActivity.R;
        }

        @NotNull
        public final int[] getGAINS_ROCK() {
            return TreadmillEqActivity.Y;
        }

        @NotNull
        public final int[] getGAINS_SLOW() {
            return TreadmillEqActivity.W;
        }

        @NotNull
        public final int[] getGAINS_VOICE() {
            return TreadmillEqActivity.m0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMBoltClassicDevice> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMBoltClassicDevice invoke() {
            HMBaseDevice device = TreadmillEqActivity.this.p().getDevice(HMDeviceType.TREADMILL);
            Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMBoltClassicDevice");
            return (HMBoltClassicDevice) device;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "eq_view not find!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TreadmillEqActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.TreadmillEqActivity$special$$inlined$inject$default$1
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
        this.boltClassicDevice = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final void initViews() {
        TreadmillEqView treadmillEqView = (TreadmillEqView) findViewById(R.id.eq_view);
        this.eqView = treadmillEqView;
        Objects.requireNonNull(treadmillEqView);
        treadmillEqView.setValues(Q);
        TreadmillEqBottomView treadmillEqBottomView = (TreadmillEqBottomView) findViewById(R.id.eq_bottom_view);
        this.eqBottomView = treadmillEqBottomView;
        Objects.requireNonNull(treadmillEqBottomView);
        treadmillEqBottomView.post(new Runnable() { // from class: ez7
            @Override // java.lang.Runnable
            public final void run() {
                TreadmillEqActivity.u(this.a);
            }
        });
        int i = 0;
        while (true) {
            int i2 = i + 1;
            TreadmillEqBottomView treadmillEqBottomView2 = this.eqBottomView;
            Objects.requireNonNull(treadmillEqBottomView2);
            ArrayList<String> dbValues = treadmillEqBottomView2.getDbValues();
            int i3 = R.string.eq_gain;
            TreadmillEqView treadmillEqView2 = this.eqView;
            Objects.requireNonNull(treadmillEqView2);
            dbValues.set(i, getString(i3, new Object[]{Integer.valueOf(treadmillEqView2.getValues()[i])}));
            if (i2 >= 10) {
                TreadmillEqView treadmillEqView3 = this.eqView;
                Objects.requireNonNull(treadmillEqView3);
                treadmillEqView3.setDbListener(new TreadmillEqView.OnDBChangeListener() { // from class: com.xiaomi.hm.health.device.TreadmillEqActivity.initViews.2

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.TreadmillEqActivity$initViews$2$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(int i, int i2) {
                            super(0);
                            this.a = i;
                            this.b = i2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "frequency: " + this.a + " , gain raw: " + this.b;
                        }
                    }

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.TreadmillEqActivity$initViews$2$b */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<String> {
                        public final /* synthetic */ byte a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(byte b) {
                            super(0);
                            this.a = b;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "gain: " + GattUtils.bytesToHexString(new byte[]{this.a});
                        }
                    }

                    @Override // com.xiaomi.hm.health.device.view.TreadmillEqView.OnDBChangeListener
                    public void gainChanged(int index, int value) {
                        HMLog.info(TreadmillEqActivity.P, new a(index, value));
                        TreadmillEqActivity treadmillEqActivity = TreadmillEqActivity.this;
                        treadmillEqActivity.m(treadmillEqActivity.selectedBtn);
                        TreadmillEqActivity treadmillEqActivity2 = TreadmillEqActivity.this;
                        TextView textView = treadmillEqActivity2.diyBtn;
                        Objects.requireNonNull(textView);
                        treadmillEqActivity2.selectedBtn = textView;
                        TreadmillEqActivity treadmillEqActivity3 = TreadmillEqActivity.this;
                        TextView textView2 = treadmillEqActivity3.diyBtn;
                        Objects.requireNonNull(textView2);
                        treadmillEqActivity3.n(textView2);
                        if (value < 0) {
                            value = ((byte) (-value)) | (-128);
                        }
                        byte b2 = (byte) value;
                        HMLog.debug(TreadmillEqActivity.P, new b(b2));
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new EqUnit(TreadmillEqActivity.this.q(index), b2));
                        TreadmillEqActivity.this.o().setEq(new EqEntity(arrayList, (byte) 0), new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.TreadmillEqActivity$initViews$2$gainChanged$3

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            public static final class a extends Lambda implements Function0<String> {
                                public final /* synthetic */ boolean a;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public a(boolean z) {
                                    super(0);
                                    this.a = z;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @Nullable
                                public final String invoke() {
                                    return "setEq ret: " + this.a;
                                }
                            }

                            @Override // com.xiaomi.hm.health.bt.device.HMCallback
                            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                                onFinish(bool.booleanValue());
                            }

                            @Override // com.xiaomi.hm.health.bt.device.HMCallback
                            public void onFinish(boolean result) {
                                HMLog.info("BoltEqActivity", new a(result));
                            }
                        });
                    }

                    @Override // com.xiaomi.hm.health.device.view.TreadmillEqView.OnDBChangeListener
                    public void uiChanged(int index, int value) {
                        TreadmillEqBottomView treadmillEqBottomView3 = TreadmillEqActivity.this.eqBottomView;
                        Objects.requireNonNull(treadmillEqBottomView3);
                        treadmillEqBottomView3.getDbValues().set(index, value + "DB");
                        TreadmillEqBottomView treadmillEqBottomView4 = TreadmillEqActivity.this.eqBottomView;
                        Objects.requireNonNull(treadmillEqBottomView4);
                        treadmillEqBottomView4.invalidate();
                    }
                });
                this.closeBtn = (TextView) findViewById(R.id.eq_close);
                this.diyBtn = (TextView) findViewById(R.id.eq_diy);
                this.popularBtn = (TextView) findViewById(R.id.eq_popular);
                this.danceBtn = (TextView) findViewById(R.id.eq_dance);
                this.classicBtn = (TextView) findViewById(R.id.eq_classic);
                this.blueBtn = (TextView) findViewById(R.id.eq_blue);
                this.jazzBtn = (TextView) findViewById(R.id.eq_jazz);
                this.electronicBtn = (TextView) findViewById(R.id.eq_electronic);
                this.slowBtn = (TextView) findViewById(R.id.eq_slow);
                this.rockBtn = (TextView) findViewById(R.id.eq_rock);
                this.countryBtn = (TextView) findViewById(R.id.eq_country);
                this.voiceBtn = (TextView) findViewById(R.id.eq_voice);
                TextView textView = this.closeBtn;
                Objects.requireNonNull(textView);
                this.selectedBtn = textView;
                n(textView);
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(TextView btn) {
        if (btn != null) {
            btn.setTextColor(Color.parseColor("#999999"));
        }
        if (btn == null) {
            return;
        }
        btn.setTextSize(14.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(TextView btn) {
        if (btn != null) {
            btn.setTextColor(Color.parseColor("#FF5353"));
        }
        if (btn == null) {
            return;
        }
        btn.setTextSize(15.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBoltClassicDevice o() {
        return (HMBoltClassicDevice) this.boltClassicDevice.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi p() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q(int index) {
        switch (index) {
            case 0:
            default:
                return 63;
            case 1:
                return 100;
            case 2:
                return 160;
            case 3:
                return 250;
            case 4:
                return 500;
            case 5:
                return 1000;
            case 6:
                return 2000;
            case 7:
                return 4000;
            case 8:
                return 8000;
            case 9:
                return 16000;
        }
    }

    private final int r(byte value) {
        return ((byte) (value & (-128))) == -128 ? -((byte) (value & 127)) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(EqEntity eqEntity) {
        int[] iArr = new int[10];
        int i = 0;
        boolean z = true;
        while (true) {
            int i2 = i + 1;
            iArr[i] = r(eqEntity.getEqUnits().get(i).getGain());
            if (iArr[i] != 0) {
                z = false;
            }
            if (i2 >= 10) {
                break;
            } else {
                i = i2;
            }
        }
        m(this.selectedBtn);
        if (z) {
            TextView textView = this.closeBtn;
            Objects.requireNonNull(textView);
            this.selectedBtn = textView;
        } else {
            byte type = eqEntity.getType();
            if (type == 0) {
                TextView textView2 = this.diyBtn;
                Objects.requireNonNull(textView2);
                this.selectedBtn = textView2;
            } else if (type == 1) {
                iArr = R;
                TextView textView3 = this.popularBtn;
                Objects.requireNonNull(textView3);
                this.selectedBtn = textView3;
            } else if (type == 2) {
                iArr = S;
                TextView textView4 = this.danceBtn;
                Objects.requireNonNull(textView4);
                this.selectedBtn = textView4;
            } else if (type == 3) {
                iArr = T;
                TextView textView5 = this.blueBtn;
                Objects.requireNonNull(textView5);
                this.selectedBtn = textView5;
            } else if (type == 4) {
                iArr = U;
                TextView textView6 = this.classicBtn;
                Objects.requireNonNull(textView6);
                this.selectedBtn = textView6;
            } else if (type == 5) {
                iArr = V;
                TextView textView7 = this.jazzBtn;
                Objects.requireNonNull(textView7);
                this.selectedBtn = textView7;
            } else if (type == 6) {
                iArr = W;
                TextView textView8 = this.slowBtn;
                Objects.requireNonNull(textView8);
                this.selectedBtn = textView8;
            } else if (type == 7) {
                iArr = X;
                TextView textView9 = this.electronicBtn;
                Objects.requireNonNull(textView9);
                this.selectedBtn = textView9;
            } else if (type == 8) {
                iArr = Y;
                TextView textView10 = this.rockBtn;
                Objects.requireNonNull(textView10);
                this.selectedBtn = textView10;
            } else if (type == 9) {
                iArr = Z;
                TextView textView11 = this.countryBtn;
                Objects.requireNonNull(textView11);
                this.selectedBtn = textView11;
            } else if (type == 10) {
                iArr = m0;
                TextView textView12 = this.voiceBtn;
                Objects.requireNonNull(textView12);
                this.selectedBtn = textView12;
            }
        }
        int[] iArr2 = iArr;
        n(this.selectedBtn);
        TreadmillEqView treadmillEqView = this.eqView;
        Objects.requireNonNull(treadmillEqView);
        treadmillEqView.setValues(iArr2);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            TreadmillEqBottomView treadmillEqBottomView = this.eqBottomView;
            Objects.requireNonNull(treadmillEqBottomView);
            treadmillEqBottomView.getDbValues().set(i3, getString(R.string.eq_gain, new Object[]{Integer.valueOf(iArr2[i3])}));
            TreadmillEqBottomView treadmillEqBottomView2 = this.eqBottomView;
            Objects.requireNonNull(treadmillEqBottomView2);
            treadmillEqBottomView2.invalidate();
            if (i4 >= 10) {
                return;
            } else {
                i3 = i4;
            }
        }
    }

    private final void t() {
        this.loadingDialog = LoadingDialog.showDialog(this);
        o().getEq(new HMCallback<EqEntity>() { // from class: com.xiaomi.hm.health.device.TreadmillEqActivity$initEq$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                LoadingDialog loadingDialog = this.a.loadingDialog;
                Objects.requireNonNull(loadingDialog);
                loadingDialog.dismiss();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable EqEntity entity) {
                LoadingDialog loadingDialog = this.a.loadingDialog;
                Objects.requireNonNull(loadingDialog);
                loadingDialog.dismiss();
                if (entity == null) {
                    return;
                }
                this.a.s(entity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(TreadmillEqActivity treadmillEqActivity) {
        TreadmillEqBottomView treadmillEqBottomView = treadmillEqActivity.eqBottomView;
        Objects.requireNonNull(treadmillEqBottomView);
        TreadmillEqView treadmillEqView = treadmillEqActivity.eqView;
        Objects.requireNonNull(treadmillEqView);
        treadmillEqBottomView.setGap(treadmillEqView.getGap());
        TreadmillEqBottomView treadmillEqBottomView2 = treadmillEqActivity.eqBottomView;
        Objects.requireNonNull(treadmillEqBottomView2);
        TreadmillEqView treadmillEqView2 = treadmillEqActivity.eqView;
        Objects.requireNonNull(treadmillEqView2);
        treadmillEqBottomView2.setEdgeGap(treadmillEqView2.getEdgeGap());
        TreadmillEqBottomView treadmillEqBottomView3 = treadmillEqActivity.eqBottomView;
        Objects.requireNonNull(treadmillEqBottomView3);
        treadmillEqBottomView3.invalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x052e  */
    public final void onClick(@NotNull View view) {
        EqEntity eqEntity;
        EqEntity eqEntity2;
        TextView textView = this.selectedBtn;
        if (textView != null) {
            if (textView.getId() == view.getId()) {
                return;
            } else {
                Unit unit = Unit.INSTANCE;
            }
        }
        m(this.selectedBtn);
        TextView textView2 = (TextView) view;
        this.selectedBtn = textView2;
        n(textView2);
        int id = textView2.getId();
        if (id == R.id.eq_close) {
            TreadmillEqView treadmillEqView = this.eqView;
            Objects.requireNonNull(treadmillEqView);
            treadmillEqView.setValues(Q);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new EqUnit(63, (byte) 0));
            arrayList.add(new EqUnit(100, (byte) 0));
            arrayList.add(new EqUnit(160, (byte) 0));
            arrayList.add(new EqUnit(250, (byte) 0));
            arrayList.add(new EqUnit(500, (byte) 0));
            arrayList.add(new EqUnit(1000, (byte) 0));
            arrayList.add(new EqUnit(2000, (byte) 0));
            arrayList.add(new EqUnit(4000, (byte) 0));
            arrayList.add(new EqUnit(8000, (byte) 0));
            arrayList.add(new EqUnit(16000, (byte) 0));
            eqEntity = new EqEntity(arrayList, (byte) 0);
        } else if (id == R.id.eq_diy) {
            eqEntity = null;
        } else if (id == R.id.eq_popular) {
            TreadmillEqView treadmillEqView2 = this.eqView;
            Objects.requireNonNull(treadmillEqView2);
            treadmillEqView2.setValues(R);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new EqUnit(63, (byte) 5));
            arrayList2.add(new EqUnit(100, (byte) 2));
            arrayList2.add(new EqUnit(160, (byte) 0));
            arrayList2.add(new EqUnit(250, (byte) -125));
            arrayList2.add(new EqUnit(500, (byte) -122));
            arrayList2.add(new EqUnit(1000, (byte) -122));
            arrayList2.add(new EqUnit(2000, (byte) -125));
            arrayList2.add(new EqUnit(4000, (byte) 0));
            arrayList2.add(new EqUnit(8000, (byte) 1));
            arrayList2.add(new EqUnit(16000, (byte) 3));
            eqEntity = new EqEntity(arrayList2, (byte) 1);
        } else if (id == R.id.eq_dance) {
            TreadmillEqView treadmillEqView3 = this.eqView;
            Objects.requireNonNull(treadmillEqView3);
            treadmillEqView3.setValues(S);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new EqUnit(63, (byte) 6));
            arrayList3.add(new EqUnit(100, (byte) 6));
            arrayList3.add(new EqUnit(160, (byte) 3));
            arrayList3.add(new EqUnit(250, (byte) 0));
            arrayList3.add(new EqUnit(500, (byte) 0));
            arrayList3.add(new EqUnit(1000, (byte) -124));
            arrayList3.add(new EqUnit(2000, (byte) -122));
            arrayList3.add(new EqUnit(4000, (byte) -122));
            arrayList3.add(new EqUnit(8000, (byte) 0));
            arrayList3.add(new EqUnit(16000, (byte) 0));
            eqEntity = new EqEntity(arrayList3, (byte) 2);
        } else if (id == R.id.eq_blue) {
            TreadmillEqView treadmillEqView4 = this.eqView;
            Objects.requireNonNull(treadmillEqView4);
            treadmillEqView4.setValues(T);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new EqUnit(63, (byte) 3));
            arrayList4.add(new EqUnit(100, (byte) 6));
            arrayList4.add(new EqUnit(160, (byte) 6));
            arrayList4.add(new EqUnit(250, (byte) 3));
            arrayList4.add(new EqUnit(500, (byte) -126));
            arrayList4.add(new EqUnit(1000, (byte) 0));
            arrayList4.add(new EqUnit(2000, (byte) 4));
            arrayList4.add(new EqUnit(4000, (byte) 5));
            arrayList4.add(new EqUnit(8000, (byte) 6));
            arrayList4.add(new EqUnit(16000, (byte) 6));
            eqEntity = new EqEntity(arrayList4, (byte) 3);
        } else if (id == R.id.eq_classic) {
            TreadmillEqView treadmillEqView5 = this.eqView;
            Objects.requireNonNull(treadmillEqView5);
            treadmillEqView5.setValues(U);
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new EqUnit(63, (byte) 0));
            arrayList5.add(new EqUnit(100, (byte) 0));
            arrayList5.add(new EqUnit(160, (byte) 0));
            arrayList5.add(new EqUnit(250, (byte) 0));
            arrayList5.add(new EqUnit(500, (byte) 0));
            arrayList5.add(new EqUnit(1000, (byte) 0));
            arrayList5.add(new EqUnit(2000, (byte) -123));
            arrayList5.add(new EqUnit(4000, (byte) -123));
            arrayList5.add(new EqUnit(8000, (byte) -122));
            arrayList5.add(new EqUnit(16000, (byte) -122));
            eqEntity = new EqEntity(arrayList5, (byte) 4);
        } else if (id == R.id.eq_jazz) {
            TreadmillEqView treadmillEqView6 = this.eqView;
            Objects.requireNonNull(treadmillEqView6);
            treadmillEqView6.setValues(V);
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(new EqUnit(63, (byte) 0));
            arrayList6.add(new EqUnit(100, (byte) 0));
            arrayList6.add(new EqUnit(160, (byte) 2));
            arrayList6.add(new EqUnit(250, (byte) 4));
            arrayList6.add(new EqUnit(500, (byte) 4));
            arrayList6.add(new EqUnit(1000, (byte) 4));
            arrayList6.add(new EqUnit(2000, (byte) 0));
            arrayList6.add(new EqUnit(4000, (byte) 1));
            arrayList6.add(new EqUnit(8000, (byte) 3));
            arrayList6.add(new EqUnit(16000, (byte) 3));
            eqEntity = new EqEntity(arrayList6, (byte) 5);
        } else {
            if (id == R.id.eq_slow) {
                TreadmillEqView treadmillEqView7 = this.eqView;
                Objects.requireNonNull(treadmillEqView7);
                treadmillEqView7.setValues(W);
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new EqUnit(63, (byte) 5));
                arrayList7.add(new EqUnit(100, (byte) 4));
                arrayList7.add(new EqUnit(160, (byte) 2));
                arrayList7.add(new EqUnit(250, (byte) 1));
                arrayList7.add(new EqUnit(500, (byte) -126));
                arrayList7.add(new EqUnit(1000, (byte) 0));
                arrayList7.add(new EqUnit(2000, (byte) 3));
                arrayList7.add(new EqUnit(4000, (byte) 5));
                arrayList7.add(new EqUnit(8000, (byte) 6));
                arrayList7.add(new EqUnit(16000, (byte) 6));
                eqEntity2 = new EqEntity(arrayList7, (byte) 6);
            } else if (id == R.id.eq_electronic) {
                TreadmillEqView treadmillEqView8 = this.eqView;
                Objects.requireNonNull(treadmillEqView8);
                treadmillEqView8.setValues(X);
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(new EqUnit(63, (byte) 6));
                arrayList8.add(new EqUnit(100, (byte) 5));
                arrayList8.add(new EqUnit(160, (byte) 0));
                arrayList8.add(new EqUnit(250, (byte) -123));
                arrayList8.add(new EqUnit(500, (byte) -124));
                arrayList8.add(new EqUnit(1000, (byte) 0));
                arrayList8.add(new EqUnit(2000, (byte) 5));
                arrayList8.add(new EqUnit(4000, (byte) 6));
                arrayList8.add(new EqUnit(8000, (byte) 6));
                arrayList8.add(new EqUnit(16000, (byte) 6));
                eqEntity = new EqEntity(arrayList8, (byte) 7);
            } else if (id == R.id.eq_rock) {
                TreadmillEqView treadmillEqView9 = this.eqView;
                Objects.requireNonNull(treadmillEqView9);
                treadmillEqView9.setValues(Y);
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(new EqUnit(63, (byte) 6));
                arrayList9.add(new EqUnit(100, (byte) 4));
                arrayList9.add(new EqUnit(160, (byte) -124));
                arrayList9.add(new EqUnit(250, (byte) 6));
                arrayList9.add(new EqUnit(500, (byte) -126));
                arrayList9.add(new EqUnit(1000, (byte) 1));
                arrayList9.add(new EqUnit(2000, (byte) 5));
                arrayList9.add(new EqUnit(4000, (byte) 6));
                arrayList9.add(new EqUnit(8000, (byte) 6));
                arrayList9.add(new EqUnit(16000, (byte) 6));
                eqEntity = new EqEntity(arrayList9, (byte) 8);
            } else if (id == R.id.eq_country) {
                TreadmillEqView treadmillEqView10 = this.eqView;
                Objects.requireNonNull(treadmillEqView10);
                treadmillEqView10.setValues(Z);
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(new EqUnit(63, (byte) 4));
                arrayList10.add(new EqUnit(100, (byte) 5));
                arrayList10.add(new EqUnit(160, (byte) 2));
                arrayList10.add(new EqUnit(250, (byte) -123));
                arrayList10.add(new EqUnit(500, (byte) 1));
                arrayList10.add(new EqUnit(1000, (byte) 1));
                arrayList10.add(new EqUnit(2000, (byte) -124));
                arrayList10.add(new EqUnit(4000, (byte) 3));
                arrayList10.add(new EqUnit(8000, (byte) 6));
                arrayList10.add(new EqUnit(16000, (byte) 5));
                eqEntity = new EqEntity(arrayList10, (byte) 9);
            } else if (id == R.id.eq_voice) {
                TreadmillEqView treadmillEqView11 = this.eqView;
                Objects.requireNonNull(treadmillEqView11);
                treadmillEqView11.setValues(m0);
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(new EqUnit(63, (byte) -126));
                arrayList11.add(new EqUnit(100, (byte) -127));
                arrayList11.add(new EqUnit(160, (byte) -127));
                arrayList11.add(new EqUnit(250, (byte) 0));
                arrayList11.add(new EqUnit(500, (byte) 3));
                arrayList11.add(new EqUnit(1000, (byte) 5));
                arrayList11.add(new EqUnit(2000, (byte) 3));
                arrayList11.add(new EqUnit(4000, (byte) 0));
                arrayList11.add(new EqUnit(8000, (byte) 0));
                arrayList11.add(new EqUnit(16000, (byte) 1));
                eqEntity2 = new EqEntity(arrayList11, (byte) 10);
            } else {
                eqEntity = null;
            }
            eqEntity = eqEntity2;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            TreadmillEqBottomView treadmillEqBottomView = this.eqBottomView;
            Objects.requireNonNull(treadmillEqBottomView);
            ArrayList<String> dbValues = treadmillEqBottomView.getDbValues();
            int i3 = R.string.eq_gain;
            TreadmillEqView treadmillEqView12 = this.eqView;
            Objects.requireNonNull(treadmillEqView12);
            dbValues.set(i, getString(i3, new Object[]{Integer.valueOf(treadmillEqView12.getValues()[i])}));
            TreadmillEqBottomView treadmillEqBottomView2 = this.eqBottomView;
            Objects.requireNonNull(treadmillEqBottomView2);
            treadmillEqBottomView2.invalidate();
            if (i2 >= 10) {
                break;
            } else {
                i = i2;
            }
        }
        if (eqEntity == null) {
            return;
        }
        o().setEq(eqEntity, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.TreadmillEqActivity$onClick$2$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "setEq ret from type: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                HMLog.info("BoltEqActivity", new a(result));
            }
        });
        Unit unit2 = Unit.INSTANCE;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treadmill_eq);
        UIStandardUtilKt.setUnifyTitleStyle$default(this, getString(R.string.bolt_eq_title), null, 2, null);
        if (findViewById(R.id.eq_view) == null) {
            HMLog.error$default(P, null, null, b.a, 6, null);
        } else {
            initViews();
            t();
        }
    }
}
