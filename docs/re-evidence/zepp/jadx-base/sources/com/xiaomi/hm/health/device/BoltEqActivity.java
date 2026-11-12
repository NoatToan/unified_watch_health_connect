package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.bt.classic.EqEntity;
import com.xiaomi.hm.health.bt.classic.EqUnit;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.BoltEqActivity;
import com.xiaomi.hm.health.device.equalizer.EqualizerViewModel;
import com.xiaomi.hm.health.device.equalizer.EqualizerViewModelFactory;
import com.xiaomi.hm.health.device.equalizer.EqualizerViewModelKt;
import com.xiaomi.hm.health.device.view.EqView;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0003N%)B\u0007¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0002J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0002J\u0012\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010!\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001eH\u0014R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00105\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00107R\u0018\u0010K\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010?¨\u0006O"}, d2 = {"Lcom/xiaomi/hm/health/device/BoltEqActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "enable", "", "G", "initViews", "isClose", "E", "", "type", "F", "Lcom/huami/arch/helper/Resource;", "res", "B", "Lcom/xiaomi/hm/health/bt/classic/EqEntity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "eqEntity", DTransferConstants.SEARCH_KEY, "index", com.google.android.exoplayer2.text.ttml.b.r, "m", "z", "u", hl.k, GoogleApiAvailabilityLight.b, "r", "Lkotlin/Function0;", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/view/EqView;", "a", "Lcom/xiaomi/hm/health/device/view/EqView;", "eqView", "Lcom/xiaomi/hm/health/device/BoltEqActivity$b;", "b", "Lcom/xiaomi/hm/health/device/BoltEqActivity$b;", "eqAdapter", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "c", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "o", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "e", "Z", "eqLoaded", "Lcom/xiaomi/hm/health/device/equalizer/EqualizerViewModel;", "f", "Lcom/xiaomi/hm/health/device/equalizer/EqualizerViewModel;", "viewModel", "", "g", "[I", "frequency", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "h", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/databases/model/Device;", "i", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", z.j, "shouldSaveEqualizer", "customGain", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BoltEqActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int EQ_EQ_REQUEST = 10;

    @NotNull
    public static final String RESULT_EQ_VALUE = "EQ_VALUE";

    @NotNull
    private static final String l = "BoltEqActivity";

    @NotNull
    private static final String m = "eq_extra_device_source";

    @NotNull
    private static final String n = "eq_extra_device_address";
    private static final float o = 17.0f;
    private static final long p = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private EqView eqView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private b eqAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean eqLoaded;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private EqualizerViewModel viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int[] frequency;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean shouldSaveEqualizer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private int[] customGain;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/BoltEqActivity$Companion;", "", "Landroid/content/Context;", "ctx", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "startMe", "Landroid/app/Activity;", "activity", "startForResultEq", "", "type", "getEqNameRes", "EQ_EQ_REQUEST", LogUtil.I, "EQ_EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "EQ_EXTRA_DEVICE_SOURCE", "RESULT_EQ_VALUE", "", "SAVE_CLOSE_DELAY", "J", "TAG", "", "TITLE_TEXT_SIZE", "F", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int getEqNameRes(int type) {
            switch (type) {
                case 0:
                    return R.string.eq_diy;
                case 1:
                    return R.string.eq_liuxing;
                case 2:
                    return R.string.eq_wuqu;
                case 3:
                    return R.string.eq_landiao;
                case 4:
                    return R.string.eq_gudian;
                case 5:
                    return R.string.eq_jueshi;
                case 6:
                    return R.string.eq_mange;
                case 7:
                    return R.string.eq_dianziyue;
                case 8:
                    return R.string.eq_yaogun;
                case 9:
                    return R.string.eq_xiangcun;
                case 10:
                    return R.string.eq_rensheng;
                default:
                    return R.string.eq_close;
            }
        }

        @JvmStatic
        public final void startForResultEq(@NotNull Activity activity, @NotNull HMDeviceSource deviceSource, @NotNull String address) {
            Intent intent = new Intent(activity, (Class<?>) BoltEqActivity.class);
            intent.putExtra(BoltEqActivity.m, deviceSource);
            intent.putExtra(BoltEqActivity.n, address);
            activity.startActivityForResult(intent, 10);
        }

        public final void startMe(@NotNull Context ctx, @NotNull HMDeviceSource deviceSource, @NotNull String address) {
            Intent intent = new Intent(ctx, (Class<?>) BoltEqActivity.class);
            intent.putExtra(BoltEqActivity.m, deviceSource);
            intent.putExtra(BoltEqActivity.n, address);
            ctx.startActivity(intent);
        }
    }

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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.BoltEqActivity$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"com/xiaomi/hm/health/device/BoltEqActivity$a", "", "", "a", "b", "value", "name", "Lcom/xiaomi/hm/health/device/BoltEqActivity$a;", "c", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "f", "()I", "e", "<init>", "(II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class EqItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int name;

        public EqItem(int i, @StringRes int i2) {
            this.value = i;
            this.name = i2;
        }

        public static /* synthetic */ EqItem d(EqItem eqItem, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = eqItem.value;
            }
            if ((i3 & 2) != 0) {
                i2 = eqItem.name;
            }
            return eqItem.c(i, i2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getName() {
            return this.name;
        }

        @NotNull
        public final EqItem c(int value, @StringRes int name) {
            return new EqItem(value, name);
        }

        public final int e() {
            return this.name;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EqItem)) {
                return false;
            }
            EqItem eqItem = (EqItem) other;
            return this.value == eqItem.value && this.name == eqItem.name;
        }

        public final int f() {
            return this.value;
        }

        public int hashCode() {
            return (this.value * 31) + this.name;
        }

        @NotNull
        public String toString() {
            return "EqItem(value=" + this.value + ", name=" + this.name + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR*\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"com/xiaomi/hm/health/device/BoltEqActivity$b", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/BoltEqActivity$a;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "helper", "item", "", "b", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "selectedListener", "value", LogUtil.I, "c", "()I", "e", "(I)V", "currentEq", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b extends BaseQuickAdapter<EqItem, BaseViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Function1<Integer, Unit> selectedListener;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int currentEq;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function1<? super Integer, Unit> function1) {
            super(R.layout.item_equalizer);
            this.selectedListener = function1;
            this.currentEq = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(b bVar, BaseViewHolder baseViewHolder, View view) {
            EqItem item = bVar.getItem(baseViewHolder.getAdapterPosition());
            if (item == null || item.f() == bVar.getCurrentEq()) {
                return;
            }
            bVar.selectedListener.invoke(Integer.valueOf(item.f()));
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void convert(@NotNull BaseViewHolder helper, @NotNull EqItem item) {
            TextView textView = (TextView) helper.getView(R.id.tv_eq);
            if (textView == null) {
                return;
            }
            textView.setSelected(item.f() == getCurrentEq());
            textView.setText(item.e());
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentEq() {
            return this.currentEq;
        }

        public final void e(int i) {
            if (i == this.currentEq) {
                return;
            }
            this.currentEq = i;
            notifyDataSetChanged();
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public BaseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            final BaseViewHolder baseViewHolderOnCreateViewHolder = super.onCreateViewHolder(parent, viewType);
            baseViewHolderOnCreateViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoltEqActivity.b.d(this.a, baseViewHolderOnCreateViewHolder, view);
                }
            });
            return baseViewHolderOnCreateViewHolder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Intent intent = new Intent();
            b bVar = BoltEqActivity.this.eqAdapter;
            Objects.requireNonNull(bVar);
            intent.putExtra(BoltEqActivity.RESULT_EQ_VALUE, bVar.getCurrentEq());
            BoltEqActivity.this.setResult(-1, intent);
            BoltEqActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public d(BoltEqActivity boltEqActivity) {
            super(1, boltEqActivity, BoltEqActivity.class, "onEqChanged", "onEqChanged(I)V", 0);
        }

        public final void a(int i) {
            ((BoltEqActivity) this.receiver).z(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoltEqActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.BoltEqActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final void A(Resource<EqEntity> res) {
        int i = WhenMappings.$EnumSwitchMapping$0[res.getStatus().ordinal()];
        if (i == 1) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            loadingDialogShowDialog.setMessage(getString(R.string.loading));
            Unit unit = Unit.INSTANCE;
            this.loadingDialog = loadingDialogShowDialog;
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            LoadingDialog loadingDialog = this.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
                this.loadingDialog = null;
            }
            IconToast.showError(this, R.string.load_fail);
            return;
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.dismiss();
            this.loadingDialog = null;
        }
        if (res.getData() != null) {
            EqEntity data = res.getData();
            Objects.requireNonNull(data, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.classic.EqEntity");
            q(data);
        }
    }

    private final void B(Resource<Boolean> res) {
        int i = WhenMappings.$EnumSwitchMapping$0[res.getStatus().ordinal()];
        if (i == 1) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            loadingDialogShowDialog.setMessage(getString(R.string.saving));
            loadingDialogShowDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.loadingDialog = loadingDialogShowDialog;
            return;
        }
        if (i == 2) {
            LoadingDialog loadingDialog = this.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
                this.loadingDialog = null;
            }
            EqView eqView = this.eqView;
            Objects.requireNonNull(eqView);
            final Function0<Unit> function0L = l();
            eqView.postDelayed(new Runnable() { // from class: q40
                @Override // java.lang.Runnable
                public final void run() {
                    BoltEqActivity.C(function0L);
                }
            }, 100L);
            return;
        }
        if (i != 3) {
            return;
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.dismiss();
            this.loadingDialog = null;
        }
        EqView eqView2 = this.eqView;
        Objects.requireNonNull(eqView2);
        final Function0<Unit> function0L2 = l();
        eqView2.postDelayed(new Runnable() { // from class: p40
            @Override // java.lang.Runnable
            public final void run() {
                BoltEqActivity.D(function0L2);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function0 function0) {
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(Function0 function0) {
        function0.getA();
    }

    private final void E(boolean isClose) {
        findViewById(R.id.enable_view).setVisibility(isClose ? 0 : 8);
        EqualizerViewModel equalizerViewModel = this.viewModel;
        Objects.requireNonNull(equalizerViewModel);
        int[] gain = equalizerViewModel.getGain(isClose ? (byte) -1 : (byte) 0);
        EqualizerViewModel equalizerViewModel2 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel2);
        equalizerViewModel2.setCustomEqType((byte) -1);
        this.customGain = gain;
        F(isClose ? -1 : 0);
        EqView eqView = this.eqView;
        Objects.requireNonNull(eqView);
        ArrayList arrayList = new ArrayList(gain.length);
        for (int i : gain) {
            arrayList.add(Float.valueOf(i));
        }
        eqView.setValues(CollectionsKt___CollectionsKt.toFloatArray(arrayList));
        this.shouldSaveEqualizer = true;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int type) {
        b bVar = this.eqAdapter;
        Objects.requireNonNull(bVar);
        bVar.e(type);
        ((Button) findViewById(R.id.btn_reset)).setVisibility(type == 0 ? 0 : 8);
        ((TextView) findViewById(R.id.tv_current_equalizer)).setText(getString(R.string.current_equalizer, new Object[]{getString(INSTANCE.getEqNameRes(type))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean enable) {
        int i = enable ? 8 : 0;
        int i2 = R.id.mask_view;
        if (findViewById(i2).getVisibility() == i) {
            return;
        }
        if (i == 8) {
            EqualizerViewModel equalizerViewModel = this.viewModel;
            Objects.requireNonNull(equalizerViewModel);
            equalizerViewModel.loadEntity();
        }
        findViewById(i2).setVisibility(i);
    }

    @JvmStatic
    public static final int getEqNameRes(int i) {
        return INSTANCE.getEqNameRes(i);
    }

    private final void initViews() {
        int i = R.id.eq_switch;
        ((SwitchCompat) findViewById(i)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l40
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BoltEqActivity.t(this.a, compoundButton, z);
            }
        });
        SwitchCompat switchCompat = (SwitchCompat) findViewById(i);
        HMDeviceSource hMDeviceSource = this.deviceSource;
        Objects.requireNonNull(hMDeviceSource);
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.OTHER_MOZART;
        switchCompat.setVisibility(hMDeviceSource == hMDeviceSource2 ? 8 : 0);
        TextView textView = (TextView) findViewById(R.id.tv_current_equalizer);
        HMDeviceSource hMDeviceSource3 = this.deviceSource;
        Objects.requireNonNull(hMDeviceSource3);
        textView.setVisibility(hMDeviceSource3 == hMDeviceSource2 ? 0 : 8);
        EqView eqView = (EqView) findViewById(R.id.eq_view);
        this.eqView = eqView;
        Objects.requireNonNull(eqView);
        EqualizerViewModel equalizerViewModel = this.viewModel;
        Objects.requireNonNull(equalizerViewModel);
        int[] gain = equalizerViewModel.getGain((byte) 0);
        ArrayList arrayList = new ArrayList(gain.length);
        for (int i2 : gain) {
            arrayList.add(Float.valueOf(i2));
        }
        eqView.setValues(CollectionsKt___CollectionsKt.toFloatArray(arrayList));
        EqView eqView2 = this.eqView;
        Objects.requireNonNull(eqView2);
        EqualizerViewModel equalizerViewModel2 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel2);
        List<Integer> list = ArraysKt___ArraysKt.toList(equalizerViewModel2.getFrequency());
        EqualizerViewModel equalizerViewModel3 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel3);
        eqView2.setConfig(new EqView.Config(list, equalizerViewModel3.getGainRange(), 0, 4, null));
        EqView eqView3 = this.eqView;
        Objects.requireNonNull(eqView3);
        eqView3.setEqListener(new EqView.EqListener() { // from class: com.xiaomi.hm.health.device.BoltEqActivity.initViews.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.BoltEqActivity$initViews$3$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;
                public final /* synthetic */ float b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i, float f) {
                    super(0);
                    this.a = i;
                    this.b = f;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "frequency: " + this.a + " , gain raw: " + this.b;
                }
            }

            @Override // com.xiaomi.hm.health.device.view.EqView.EqListener
            public void onGainChanged(int index, float gain2) {
                int[] intArray;
                HMLog.info(BoltEqActivity.l, new a(index, gain2));
                b bVar = BoltEqActivity.this.eqAdapter;
                Objects.requireNonNull(bVar);
                if (bVar.getCurrentEq() != 0) {
                    EqualizerViewModel equalizerViewModel4 = BoltEqActivity.this.viewModel;
                    Objects.requireNonNull(equalizerViewModel4);
                    b bVar2 = BoltEqActivity.this.eqAdapter;
                    Objects.requireNonNull(bVar2);
                    equalizerViewModel4.setCustomEqType(Byte.valueOf((byte) bVar2.getCurrentEq()));
                    BoltEqActivity.this.F(0);
                }
                BoltEqActivity.this.shouldSaveEqualizer = true;
                BoltEqActivity boltEqActivity = BoltEqActivity.this;
                EqView eqView4 = boltEqActivity.eqView;
                Objects.requireNonNull(eqView4);
                float[] values = eqView4.getValues();
                if (values == null) {
                    intArray = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(values.length);
                    for (float f : values) {
                        arrayList2.add(Integer.valueOf((int) f));
                    }
                    intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList2);
                }
                boltEqActivity.customGain = intArray;
                BoltEqActivity.this.k();
            }

            @Override // com.xiaomi.hm.health.device.view.EqView.EqListener
            public void onGainUpdate(int index, float gain2) {
            }
        });
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it2 = listListOf.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            arrayList2.add(new EqItem(iIntValue, INSTANCE.getEqNameRes(iIntValue)));
        }
        b bVar = new b(new d(this));
        this.eqAdapter = bVar;
        Objects.requireNonNull(bVar);
        bVar.setNewData(arrayList2);
        F(0);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_eq);
        b bVar2 = this.eqAdapter;
        Objects.requireNonNull(bVar2);
        recyclerView.setAdapter(bVar2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexDirection(0);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(flexboxLayoutManager);
        ((Button) findViewById(R.id.btn_reset)).setOnClickListener(new View.OnClickListener() { // from class: k40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoltEqActivity.s(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (u()) {
            EqualizerViewModel equalizerViewModel = this.viewModel;
            Objects.requireNonNull(equalizerViewModel);
            equalizerViewModel.setEqualizer(n());
        }
    }

    private final Function0<Unit> l() {
        return new c();
    }

    private final EqEntity m() {
        ArrayList arrayList;
        EqView eqView = this.eqView;
        Objects.requireNonNull(eqView);
        float[] values = eqView.getValues();
        if (values == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(values.length);
            int length = values.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                arrayList2.add(new EqUnit(p(i2), EqualizerViewModelKt.toBoltByte((int) values[i])));
                i++;
                i2++;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? new EqEntity(new ArrayList(), (byte) 0) : new EqEntity(new ArrayList(arrayList), (byte) 0);
    }

    private final EqEntity n() {
        b bVar = this.eqAdapter;
        Objects.requireNonNull(bVar);
        int currentEq = bVar.getCurrentEq();
        if (currentEq == 0) {
            return m();
        }
        EqualizerViewModel equalizerViewModel = this.viewModel;
        Objects.requireNonNull(equalizerViewModel);
        return equalizerViewModel.getDefaultEq((byte) currentEq);
    }

    private final DeviceManagerApi o() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final int p(int index) {
        int[] iArr = this.frequency;
        Objects.requireNonNull(iArr);
        return iArr[index];
    }

    private final void q(EqEntity eqEntity) {
        if (this.eqLoaded) {
            return;
        }
        this.eqLoaded = true;
        F(eqEntity.getType());
        int[] iArrGains = EqualizerViewModelKt.gains(eqEntity);
        this.customGain = (int[]) iArrGains.clone();
        if (eqEntity.getType() != 0) {
            EqualizerViewModel equalizerViewModel = this.viewModel;
            Objects.requireNonNull(equalizerViewModel);
            iArrGains = equalizerViewModel.getGain(eqEntity.getType());
        }
        EqView eqView = this.eqView;
        Objects.requireNonNull(eqView);
        ArrayList arrayList = new ArrayList(iArrGains.length);
        for (int i : iArrGains) {
            arrayList.add(Float.valueOf(i));
        }
        eqView.setValues(CollectionsKt___CollectionsKt.toFloatArray(arrayList));
    }

    private final void r() {
        final BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.BoltEqActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                HMDeviceSource hMDeviceSource = this.a.deviceSource;
                Objects.requireNonNull(hMDeviceSource);
                return hMDeviceSource.getType();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.u();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                View viewFindViewById = this.a.findViewById(R.id.divider);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                bTStatusFragmentNewInstance.setBottomAreaVisible(false);
                this.a.G(enable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BoltEqActivity boltEqActivity, View view) {
        EqualizerViewModel equalizerViewModel = boltEqActivity.viewModel;
        Objects.requireNonNull(equalizerViewModel);
        int[] gain = equalizerViewModel.getGain((byte) 0);
        EqualizerViewModel equalizerViewModel2 = boltEqActivity.viewModel;
        Objects.requireNonNull(equalizerViewModel2);
        equalizerViewModel2.setCustomEqType((byte) -1);
        boltEqActivity.customGain = gain;
        boltEqActivity.F(0);
        EqView eqView = boltEqActivity.eqView;
        Objects.requireNonNull(eqView);
        ArrayList arrayList = new ArrayList(gain.length);
        for (int i : gain) {
            arrayList.add(Float.valueOf(i));
        }
        eqView.setValues(CollectionsKt___CollectionsKt.toFloatArray(arrayList));
        boltEqActivity.shouldSaveEqualizer = true;
        boltEqActivity.k();
    }

    @JvmStatic
    public static final void startForResultEq(@NotNull Activity activity, @NotNull HMDeviceSource hMDeviceSource, @NotNull String str) {
        INSTANCE.startForResultEq(activity, hMDeviceSource, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(BoltEqActivity boltEqActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            boltEqActivity.E(!z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u() {
        Device device = this.device;
        if (device == null) {
            return false;
        }
        return o().isActive(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BoltEqActivity boltEqActivity, View view) {
        boltEqActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(BoltEqActivity boltEqActivity, Resource resource) {
        boltEqActivity.B(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BoltEqActivity boltEqActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        boltEqActivity.A(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BoltEqActivity boltEqActivity, Boolean bool) {
        ((SwitchCompat) boltEqActivity.findViewById(R.id.eq_switch)).setChecked(!bool.booleanValue());
        boltEqActivity.findViewById(R.id.enable_view).setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int type) {
        int[] gain;
        F(type);
        boolean z = type == 0;
        if (z) {
            this.shouldSaveEqualizer = true;
            gain = this.customGain;
        } else {
            this.shouldSaveEqualizer = false;
            EqualizerViewModel equalizerViewModel = this.viewModel;
            Objects.requireNonNull(equalizerViewModel);
            gain = equalizerViewModel.getGain((byte) type);
        }
        if (z && gain == null) {
            return;
        }
        if (gain != null) {
            EqView eqView = this.eqView;
            Objects.requireNonNull(eqView);
            ArrayList arrayList = new ArrayList(gain.length);
            for (int i : gain) {
                arrayList.add(Float.valueOf(i));
            }
            eqView.setValues(CollectionsKt___CollectionsKt.toFloatArray(arrayList));
        }
        k();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!u() || !this.shouldSaveEqualizer) {
            l().getA();
            return;
        }
        EqualizerViewModel equalizerViewModel = this.viewModel;
        Objects.requireNonNull(equalizerViewModel);
        equalizerViewModel.saveEqualizer(n());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle extras;
        Serializable serializable;
        String string;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolt_eq);
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: j40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoltEqActivity.v(this.a, view);
            }
        });
        Device bindDevice = null;
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            extras = intent == null ? null : intent.getExtras();
        } else {
            extras = savedInstanceState;
        }
        HMDeviceSource hMDeviceSource = (extras == null || (serializable = extras.getSerializable(m)) == null) ? null : (HMDeviceSource) serializable;
        if (hMDeviceSource == null) {
            hMDeviceSource = HMDeviceSource.VDEVICE;
        }
        this.deviceSource = hMDeviceSource;
        if (savedInstanceState == null) {
            Intent intent2 = getIntent();
            savedInstanceState = intent2 == null ? null : intent2.getExtras();
        }
        if (savedInstanceState != null && (string = savedInstanceState.getString(n)) != null) {
            DeviceManagerApi deviceManagerApiO = o();
            HMDeviceSource hMDeviceSource2 = this.deviceSource;
            Objects.requireNonNull(hMDeviceSource2);
            bindDevice = deviceManagerApiO.getBindDevice(hMDeviceSource2.getType(), string);
        }
        this.device = bindDevice;
        r();
        HMDeviceSource hMDeviceSource3 = this.deviceSource;
        Objects.requireNonNull(hMDeviceSource3);
        EqualizerViewModel equalizerViewModel = (EqualizerViewModel) new ViewModelProvider(this, new EqualizerViewModelFactory(hMDeviceSource3)).get(EqualizerViewModel.class);
        this.viewModel = equalizerViewModel;
        Objects.requireNonNull(equalizerViewModel);
        this.frequency = equalizerViewModel.getFrequency();
        initViews();
        EqualizerViewModel equalizerViewModel2 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel2);
        equalizerViewModel2.getSaveEqualizerLiveData().observe(this, new Observer() { // from class: m40
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BoltEqActivity.w(this.a, (Resource) obj);
            }
        });
        EqualizerViewModel equalizerViewModel3 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel3);
        equalizerViewModel3.getEqualizerEntityLiveData().observe(this, new Observer() { // from class: n40
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BoltEqActivity.x(this.a, (Resource) obj);
            }
        });
        EqualizerViewModel equalizerViewModel4 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel4);
        equalizerViewModel4.isDisableEqualizer().observe(this, new Observer() { // from class: o40
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BoltEqActivity.y(this.a, (Boolean) obj);
            }
        });
        EqualizerViewModel equalizerViewModel5 = this.viewModel;
        Objects.requireNonNull(equalizerViewModel5);
        equalizerViewModel5.loadEntity();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        HMDeviceSource hMDeviceSource = this.deviceSource;
        Objects.requireNonNull(hMDeviceSource);
        outState.putSerializable(m, hMDeviceSource);
        Device device = this.device;
        if (device == null) {
            return;
        }
        outState.putString(n, device.getDevice_address());
    }
}
