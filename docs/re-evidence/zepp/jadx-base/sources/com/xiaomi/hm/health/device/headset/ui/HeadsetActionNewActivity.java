package com.xiaomi.hm.health.device.headset.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.HeadsetActionViewModel;
import com.xiaomi.hm.health.device.headset.ui.HeadsetActionNewActivity;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0017H\u0002J \u0010(\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007H\u0002J \u0010)\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0007H\u0002J\u0012\u0010-\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+H\u0014J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020+H\u0014R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010N\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010H0H0G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR+\u0010Q\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010H0H0G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR\u001d\u0010V\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010UR)\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bY\u0010Z¨\u0006_"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetActionNewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "F", "initView", "E", "", "enable", "c0", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Y", "U", "isConnected", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "headsetKnockSetting", LogUtil.D, "Lcom/xiaomi/hm/health/device/headset/ui/HeadsetActionNewType;", "type", "Lcom/huami/lib/rainbow/ListTile;", "item", "Z", "", "selectValue", "a0", "", "value", "V", "x", "", "z", "(Lcom/xiaomi/hm/health/device/headset/ui/HeadsetActionNewType;)[Ljava/lang/String;", "t", "actionName", "u", "isRight", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "v", "d0", "B", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/headset/HeadsetActionViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/HeadsetActionViewModel;", "viewModel", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/databases/model/Device;", "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Landroid/widget/TabWidget;", "e", "Landroid/widget/TabWidget;", "tabs", "Landroid/widget/TabHost;", "f", "Landroid/widget/TabHost;", "tabhost", "", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Ljava/util/List;", "leftCheckBoxList", "h", "C", "rightCheckBoxList", "Lcom/huami/devicex/manager/DeviceManagerApi;", "i", "y", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "", z.j, "w", "()Ljava/util/Map;", "action2str", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetActionNewActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String k = "HeadsetActionNewActivity";

    @NotNull
    private static final String l = "device_address";

    @NotNull
    private static final String m = "left";

    @NotNull
    private static final String n = "right";
    private static final float o = 1.0f;
    private static final float p = 0.6f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HeadsetActionViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TabWidget tabs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TabHost tabhost;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy action2str;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy leftCheckBoxList = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy rightCheckBoxList = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetActionNewActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "", "ALPHA_DISABLE", "F", "ALPHA_ENABLE", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "TAG", "TAG_LEFT", "TAG_RIGHT", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HeadsetActionNewActivity.class);
            intent.putExtra(HeadsetActionNewActivity.l, address);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeadsetActionNewType.values().length];
            iArr[HeadsetActionNewType.LEFT_SHORT_PRESS_SINGLE.ordinal()] = 1;
            iArr[HeadsetActionNewType.LEFT_SHORT_PRESS_DOUBLE.ordinal()] = 2;
            iArr[HeadsetActionNewType.LEFT_SHORT_PRESS_TRIPLE.ordinal()] = 3;
            iArr[HeadsetActionNewType.RIGHT_SHORT_PRESS_SINGLE.ordinal()] = 4;
            iArr[HeadsetActionNewType.RIGHT_SHORT_PRESS_DOUBLE.ordinal()] = 5;
            iArr[HeadsetActionNewType.RIGHT_SHORT_PRESS_TRIPLE.ordinal()] = 6;
            iArr[HeadsetActionNewType.LEFT_LONG_PRESS.ordinal()] = 7;
            iArr[HeadsetActionNewType.RIGHT_LONG_PRESS.ordinal()] = 8;
            iArr[HeadsetActionNewType.LEFT_TAP_DOUBLE.ordinal()] = 9;
            iArr[HeadsetActionNewType.RIGHT_TAP_DOUBLE.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Map<Integer, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Map<Integer, ? extends String> getA() {
            return r.mapOf(TuplesKt.to(0, HeadsetActionNewActivity.this.getResources().getString(R.string.headset_action_none)), TuplesKt.to(1, HeadsetActionNewActivity.this.getResources().getString(R.string.headset_gesture_play_pause)), TuplesKt.to(5, HeadsetActionNewActivity.this.getResources().getString(R.string.headset_gesture_next)), TuplesKt.to(4, HeadsetActionNewActivity.this.getResources().getString(R.string.headset_gesture_previous)), TuplesKt.to(2, HeadsetActionNewActivity.this.getResources().getString(R.string.headset_ambient_sound_monitoring_switch)), TuplesKt.to(3, HeadsetActionNewActivity.this.getResources().getString(R.string.headset_action_wake_assistant)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<CheckBox>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<CheckBox> getA() {
            return CollectionsKt__CollectionsKt.mutableListOf((CheckBox) HeadsetActionNewActivity.this.findViewById(R.id.headset_left_noise_control_mode_close), (CheckBox) HeadsetActionNewActivity.this.findViewById(R.id.headset_left_noise_control_mode_penetrate), (CheckBox) HeadsetActionNewActivity.this.findViewById(R.id.headset_left_noise_control_mode_reduction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<List<CheckBox>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<CheckBox> getA() {
            return CollectionsKt__CollectionsKt.mutableListOf((CheckBox) HeadsetActionNewActivity.this.findViewById(R.id.headset_right_noise_control_mode_close), (CheckBox) HeadsetActionNewActivity.this.findViewById(R.id.headset_right_noise_control_mode_penetrate), (CheckBox) HeadsetActionNewActivity.this.findViewById(R.id.headset_right_noise_control_mode_reduction));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetActionNewActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetActionNewActivity$special$$inlined$inject$default$1
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
        this.action2str = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final List<CheckBox> A() {
        return (List) this.leftCheckBoxList.getValue();
    }

    private final int B(boolean isRight) {
        boolean zIsChecked = (!isRight ? (CheckBox) findViewById(R.id.headset_left_noise_control_mode_close) : (CheckBox) findViewById(R.id.headset_right_noise_control_mode_close)).isChecked();
        boolean zIsChecked2 = (!isRight ? (CheckBox) findViewById(R.id.headset_left_noise_control_mode_penetrate) : (CheckBox) findViewById(R.id.headset_right_noise_control_mode_penetrate)).isChecked();
        boolean zIsChecked3 = (!isRight ? (CheckBox) findViewById(R.id.headset_left_noise_control_mode_reduction) : (CheckBox) findViewById(R.id.headset_right_noise_control_mode_reduction)).isChecked();
        int i = zIsChecked ? 4 : 0;
        if (zIsChecked2) {
            i |= 2;
        }
        return zIsChecked3 ? i | 1 : i;
    }

    private final List<CheckBox> C() {
        return (List) this.rightCheckBoxList.getValue();
    }

    private final void D(HeadsetKnockSetting headsetKnockSetting) {
        Object obj;
        Object next;
        Debug.fi(k, "update select action UI:" + headsetKnockSetting);
        ((ListTile) findViewById(R.id.headset_left_short_press)).setTips(w().get(Integer.valueOf(headsetKnockSetting.getLeftSingleDog())));
        ((ListTile) findViewById(R.id.headset_left_short_press_twice)).setTips(w().get(Integer.valueOf(headsetKnockSetting.getLeftDoubleDog())));
        ((ListTile) findViewById(R.id.headset_left_short_press_three_times)).setTips(w().get(Integer.valueOf(headsetKnockSetting.getLeftTripleDog())));
        ((ListTile) findViewById(R.id.headset_right_short_press)).setTips(w().get(Integer.valueOf(headsetKnockSetting.getRightSingleDog())));
        ((ListTile) findViewById(R.id.headset_right_short_press_twice)).setTips(w().get(Integer.valueOf(headsetKnockSetting.getRightDoubleDog())));
        ((ListTile) findViewById(R.id.headset_right_short_press_three_times)).setTips(w().get(Integer.valueOf(headsetKnockSetting.getRightTripleDog())));
        ((CheckBox) findViewById(R.id.headset_left_noise_control_mode_close)).setChecked((headsetKnockSetting.getLeftLongPress() & 4) != 0);
        ((CheckBox) findViewById(R.id.headset_left_noise_control_mode_penetrate)).setChecked((headsetKnockSetting.getLeftLongPress() & 2) != 0);
        ((CheckBox) findViewById(R.id.headset_left_noise_control_mode_reduction)).setChecked((headsetKnockSetting.getLeftLongPress() & 1) != 0);
        Iterator<T> it2 = A().iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(!((CheckBox) next).isChecked()));
        CheckBox checkBox = (CheckBox) next;
        if (checkBox == null) {
            for (CheckBox checkBox2 : A()) {
                checkBox2.setEnabled(true);
                checkBox2.setClickable(true);
            }
        } else {
            d0(false, checkBox, false);
        }
        ((CheckBox) findViewById(R.id.headset_right_noise_control_mode_close)).setChecked((headsetKnockSetting.getRightLongPress() & 4) != 0);
        ((CheckBox) findViewById(R.id.headset_right_noise_control_mode_penetrate)).setChecked((headsetKnockSetting.getRightLongPress() & 2) != 0);
        ((CheckBox) findViewById(R.id.headset_right_noise_control_mode_reduction)).setChecked((headsetKnockSetting.getRightLongPress() & 1) != 0);
        for (Object obj2 : C()) {
            if (!((CheckBox) obj2).isChecked()) {
                obj = obj2;
                break;
            }
        }
        CheckBox checkBox3 = (CheckBox) obj;
        if (checkBox3 != null) {
            d0(true, checkBox3, false);
            return;
        }
        for (CheckBox checkBox4 : C()) {
            checkBox4.setEnabled(true);
            checkBox4.setClickable(true);
        }
    }

    private final void E() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetActionNewActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.U();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.c0(enable);
                if (enable) {
                    HeadsetActionViewModel headsetActionViewModel = this.a.viewModel;
                    Objects.requireNonNull(headsetActionViewModel);
                    headsetActionViewModel.loadAction();
                }
            }
        });
    }

    private final void F() {
        View childTabViewAt;
        View childTabViewAt2;
        this.tabs = (TabWidget) findViewById(android.R.id.tabs);
        this.tabhost = (TabHost) findViewById(android.R.id.tabhost);
        TabWidget tabWidget = this.tabs;
        if (tabWidget != null) {
            tabWidget.setGravity(1);
        }
        TabWidget tabWidget2 = this.tabs;
        if (tabWidget2 != null) {
            tabWidget2.setWeightSum(2.0f);
        }
        TabHost tabHost = this.tabhost;
        if (tabHost != null) {
            tabHost.setup();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        int i = R.layout.customize_tabspec_view;
        View viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) this.tabs, false);
        View viewInflate2 = LayoutInflater.from(this).inflate(i, (ViewGroup) this.tabs, false);
        TabHost tabHost2 = this.tabhost;
        if (tabHost2 != null) {
            tabHost2.addTab(tabHost2.newTabSpec("left").setIndicator(viewInflate).setContent(R.id.left_ear_setting));
        }
        TabHost tabHost3 = this.tabhost;
        if (tabHost3 != null) {
            tabHost3.addTab(tabHost3.newTabSpec("right").setIndicator(viewInflate2).setContent(R.id.right_ear_setting));
        }
        TabHost tabHost4 = this.tabhost;
        if (tabHost4 != null) {
            tabHost4.setOnTabChangedListener(new TabHost.OnTabChangeListener() { // from class: ss3
                @Override // android.widget.TabHost.OnTabChangeListener
                public final void onTabChanged(String str) {
                    HeadsetActionNewActivity.G(this.a, str);
                }
            });
        }
        TabWidget tabWidget3 = this.tabs;
        if (tabWidget3 != null && (childTabViewAt2 = tabWidget3.getChildTabViewAt(0)) != null) {
            ImageView imageView = (ImageView) childTabViewAt2.findViewById(R.id.headset_ear_large_icon);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.headset_hearing_left_selector);
            }
            ImageView imageView2 = (ImageView) childTabViewAt2.findViewById(R.id.headset_ear_small_icon);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.headset_left_bitmap_selector);
            }
            TextView textView = (TextView) childTabViewAt2.findViewById(R.id.headset_ear_name);
            if (textView != null) {
                textView.setText(getString(R.string.left));
                textView.setTextColor(ContextCompat.getColorStateList(this, R.color.text_black_alpha_selector));
            }
        }
        TabWidget tabWidget4 = this.tabs;
        if (tabWidget4 == null || (childTabViewAt = tabWidget4.getChildTabViewAt(1)) == null) {
            return;
        }
        ImageView imageView3 = (ImageView) childTabViewAt.findViewById(R.id.headset_ear_large_icon);
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.headset_hearing_right_selector);
        }
        ImageView imageView4 = (ImageView) childTabViewAt.findViewById(R.id.headset_ear_small_icon);
        if (imageView4 != null) {
            imageView4.setImageResource(R.drawable.headset_right_bitmap_selector);
        }
        TextView textView2 = (TextView) childTabViewAt.findViewById(R.id.headset_ear_name);
        if (textView2 == null) {
            return;
        }
        textView2.setText(getString(R.string.right));
        textView2.setTextColor(ContextCompat.getColorStateList(this, R.color.text_black_alpha_selector));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HeadsetActionNewActivity headsetActionNewActivity, String str) {
        headsetActionNewActivity.c0(headsetActionNewActivity.U() && headsetActionNewActivity.isConnected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionNewType headsetActionNewType = HeadsetActionNewType.LEFT_SHORT_PRESS_TRIPLE;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.huami.lib.rainbow.ListTile");
        headsetActionNewActivity.Z(headsetActionNewType, (ListTile) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionNewType headsetActionNewType = HeadsetActionNewType.RIGHT_SHORT_PRESS_SINGLE;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.huami.lib.rainbow.ListTile");
        headsetActionNewActivity.Z(headsetActionNewType, (ListTile) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionNewType headsetActionNewType = HeadsetActionNewType.RIGHT_SHORT_PRESS_DOUBLE;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.huami.lib.rainbow.ListTile");
        headsetActionNewActivity.Z(headsetActionNewType, (ListTile) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionNewType headsetActionNewType = HeadsetActionNewType.RIGHT_SHORT_PRESS_TRIPLE;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.huami.lib.rainbow.ListTile");
        headsetActionNewActivity.Z(headsetActionNewType, (ListTile) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionViewModel headsetActionViewModel = headsetActionNewActivity.viewModel;
        Objects.requireNonNull(headsetActionViewModel);
        headsetActionViewModel.setDefaultActionNew();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(HeadsetActionNewActivity headsetActionNewActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetActionNewActivity.v(false, compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(HeadsetActionNewActivity headsetActionNewActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetActionNewActivity.v(false, compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(HeadsetActionNewActivity headsetActionNewActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetActionNewActivity.v(false, compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(HeadsetActionNewActivity headsetActionNewActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetActionNewActivity.v(true, compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(HeadsetActionNewActivity headsetActionNewActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetActionNewActivity.v(true, compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(HeadsetActionNewActivity headsetActionNewActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetActionNewActivity.v(true, compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionNewType headsetActionNewType = HeadsetActionNewType.LEFT_SHORT_PRESS_SINGLE;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.huami.lib.rainbow.ListTile");
        headsetActionNewActivity.Z(headsetActionNewType, (ListTile) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        HeadsetActionNewType headsetActionNewType = HeadsetActionNewType.LEFT_SHORT_PRESS_DOUBLE;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.huami.lib.rainbow.ListTile");
        headsetActionNewActivity.Z(headsetActionNewType, (ListTile) view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U() {
        return y().isActive(this.device);
    }

    private final void V(HeadsetActionNewType type, int value) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Debug.fi(k, "select " + value + " on " + type);
        if (value < 0) {
            Debug.fi(k, "ERROR: wrong action value:" + value);
            return;
        }
        int iT = t((ListTile) findViewById(R.id.headset_left_short_press));
        int iT2 = t((ListTile) findViewById(R.id.headset_left_short_press_twice));
        int iT3 = t((ListTile) findViewById(R.id.headset_left_short_press_three_times));
        int iT4 = t((ListTile) findViewById(R.id.headset_right_short_press));
        int iT5 = t((ListTile) findViewById(R.id.headset_right_short_press_twice));
        int iT6 = t((ListTile) findViewById(R.id.headset_right_short_press_three_times));
        int iB = B(false);
        int iB2 = B(true);
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                i = value;
                i2 = iT2;
                i3 = iT3;
                i4 = iT4;
                i5 = iT5;
                i6 = iT6;
                i7 = iB;
                i8 = iB2;
                break;
            case 2:
                i2 = value;
                i = iT;
                i3 = iT3;
                i4 = iT4;
                i5 = iT5;
                i6 = iT6;
                i7 = iB;
                i8 = iB2;
                break;
            case 3:
                i3 = value;
                i = iT;
                i2 = iT2;
                i4 = iT4;
                i5 = iT5;
                i6 = iT6;
                i7 = iB;
                i8 = iB2;
                break;
            case 4:
                i4 = value;
                i = iT;
                i2 = iT2;
                i3 = iT3;
                i5 = iT5;
                i6 = iT6;
                i7 = iB;
                i8 = iB2;
                break;
            case 5:
                i5 = value;
                i = iT;
                i2 = iT2;
                i3 = iT3;
                i4 = iT4;
                i6 = iT6;
                i7 = iB;
                i8 = iB2;
                break;
            case 6:
                i6 = value;
                i = iT;
                i2 = iT2;
                i3 = iT3;
                i4 = iT4;
                i5 = iT5;
                i7 = iB;
                i8 = iB2;
                break;
            case 7:
                i7 = value;
                i = iT;
                i2 = iT2;
                i3 = iT3;
                i4 = iT4;
                i5 = iT5;
                i6 = iT6;
                i8 = iB2;
                break;
            case 8:
                i8 = value;
                i = iT;
                i2 = iT2;
                i3 = iT3;
                i4 = iT4;
                i5 = iT5;
                i6 = iT6;
                i7 = iB;
                break;
            default:
                i = iT;
                i2 = iT2;
                i3 = iT3;
                i4 = iT4;
                i5 = iT5;
                i6 = iT6;
                i7 = iB;
                i8 = iB2;
                break;
        }
        if (U()) {
            HeadsetActionViewModel headsetActionViewModel = this.viewModel;
            Objects.requireNonNull(headsetActionViewModel);
            headsetActionViewModel.setAction(new HeadsetKnockSetting(0, 0, 0, 0, 0, 0, i, i4, i2, i5, i3, i6, i7, i8, 63, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(HeadsetActionNewActivity headsetActionNewActivity, View view) {
        headsetActionNewActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(HeadsetActionNewActivity headsetActionNewActivity, HeadsetKnockSetting headsetKnockSetting) {
        headsetActionNewActivity.D(headsetKnockSetting);
    }

    private final void Y(View view, boolean enable) {
        view.setEnabled(enable);
        view.setAlpha(!enable ? 0.6f : 1.0f);
    }

    private final void Z(HeadsetActionNewType type, ListTile item) {
        a0(type, item.getTips().toString());
    }

    private final void a0(final HeadsetActionNewType type, String selectValue) {
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        choiceItems.setArrowIcon(R.drawable.red_arrow);
        final String[] strArrZ = z(type);
        int length = strArrZ.length;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < length) {
            int i4 = i2 + 1;
            if (Intrinsics.areEqual(selectValue, strArrZ[i])) {
                i3 = i2;
            }
            i++;
            i2 = i4;
        }
        choiceItems.setItems(strArrZ);
        new AlertDialogFragment.Builder(this).setTitle(x(type)).setSingleChoiceItems(choiceItems.setItemChoice(i3), new DialogInterface.OnClickListener() { // from class: ms3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                HeadsetActionNewActivity.b0(this.a, type, strArrZ, dialogInterface, i5);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(HeadsetActionNewActivity headsetActionNewActivity, HeadsetActionNewType headsetActionNewType, String[] strArr, DialogInterface dialogInterface, int i) {
        headsetActionNewActivity.V(headsetActionNewType, headsetActionNewActivity.u(strArr[i]));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(boolean enable) {
        int childCount;
        int childCount2;
        ListTile listTile = (ListTile) findViewById(R.id.headset_left_short_press);
        TabHost tabHost = this.tabhost;
        if (!Intrinsics.areEqual(tabHost == null ? null : tabHost.getCurrentTabTag(), "left")) {
            listTile = null;
        }
        if (listTile != null) {
            listTile.setEnabled(enable);
        }
        ListTile listTile2 = (ListTile) findViewById(R.id.headset_left_short_press_twice);
        TabHost tabHost2 = this.tabhost;
        if (!Intrinsics.areEqual(tabHost2 == null ? null : tabHost2.getCurrentTabTag(), "left")) {
            listTile2 = null;
        }
        if (listTile2 != null) {
            listTile2.setEnabled(enable);
        }
        ListTile listTile3 = (ListTile) findViewById(R.id.headset_left_short_press_three_times);
        TabHost tabHost3 = this.tabhost;
        if (!Intrinsics.areEqual(tabHost3 == null ? null : tabHost3.getCurrentTabTag(), "left")) {
            listTile3 = null;
        }
        if (listTile3 != null) {
            listTile3.setEnabled(enable);
        }
        ListTile listTile4 = (ListTile) findViewById(R.id.headset_right_short_press);
        TabHost tabHost4 = this.tabhost;
        if (!Intrinsics.areEqual(tabHost4 == null ? null : tabHost4.getCurrentTabTag(), "right")) {
            listTile4 = null;
        }
        if (listTile4 != null) {
            listTile4.setEnabled(enable);
        }
        ListTile listTile5 = (ListTile) findViewById(R.id.headset_right_short_press_twice);
        TabHost tabHost5 = this.tabhost;
        if (!Intrinsics.areEqual(tabHost5 == null ? null : tabHost5.getCurrentTabTag(), "right")) {
            listTile5 = null;
        }
        if (listTile5 != null) {
            listTile5.setEnabled(enable);
        }
        ListTile listTile6 = (ListTile) findViewById(R.id.headset_right_short_press_three_times);
        TabHost tabHost6 = this.tabhost;
        if (!Intrinsics.areEqual(tabHost6 == null ? null : tabHost6.getCurrentTabTag(), "right")) {
            listTile6 = null;
        }
        if (listTile6 != null) {
            listTile6.setEnabled(enable);
        }
        ((Button) findViewById(R.id.headset_action_default_bt)).setEnabled(enable);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.headset_left_ll);
        TabHost tabHost7 = this.tabhost;
        if (!Intrinsics.areEqual(tabHost7 == null ? null : tabHost7.getCurrentTabTag(), "left")) {
            linearLayout = null;
        }
        int i = 0;
        if (linearLayout != null && (childCount2 = linearLayout.getChildCount()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Y(linearLayout.getChildAt(i2), enable);
                if (i3 >= childCount2) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.headset_right_ll);
        TabHost tabHost8 = this.tabhost;
        LinearLayout linearLayout3 = Intrinsics.areEqual(tabHost8 == null ? null : tabHost8.getCurrentTabTag(), "right") ? linearLayout2 : null;
        if (linearLayout3 == null || (childCount = linearLayout3.getChildCount()) <= 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            Y(linearLayout3.getChildAt(i), enable);
            if (i4 >= childCount) {
                return;
            } else {
                i = i4;
            }
        }
    }

    private final void d0(boolean isRight, CompoundButton buttonView, boolean isChecked) {
        CheckBox checkBox = !isRight ? (CheckBox) findViewById(R.id.headset_left_noise_control_mode_close) : (CheckBox) findViewById(R.id.headset_right_noise_control_mode_close);
        if (!(!Intrinsics.areEqual(buttonView, checkBox))) {
            checkBox = null;
        }
        if (checkBox != null) {
            checkBox.setClickable(isChecked);
            checkBox.setEnabled(isChecked);
        }
        CheckBox checkBox2 = !isRight ? (CheckBox) findViewById(R.id.headset_left_noise_control_mode_penetrate) : (CheckBox) findViewById(R.id.headset_right_noise_control_mode_penetrate);
        if (!(!Intrinsics.areEqual(buttonView, checkBox2))) {
            checkBox2 = null;
        }
        if (checkBox2 != null) {
            checkBox2.setClickable(isChecked);
            checkBox2.setEnabled(isChecked);
        }
        CheckBox checkBox3 = !isRight ? (CheckBox) findViewById(R.id.headset_left_noise_control_mode_reduction) : (CheckBox) findViewById(R.id.headset_right_noise_control_mode_reduction);
        CheckBox checkBox4 = Intrinsics.areEqual(buttonView, checkBox3) ^ true ? checkBox3 : null;
        if (checkBox4 == null) {
            return;
        }
        checkBox4.setClickable(isChecked);
        checkBox4.setEnabled(isChecked);
    }

    private final void initView() {
        ((ListTile) findViewById(R.id.headset_left_long_press)).setTrailing((Drawable) null);
        ((ListTile) findViewById(R.id.headset_right_long_press)).setTrailing((Drawable) null);
        ((ListTile) findViewById(R.id.headset_left_short_press)).setOnClickListener(new View.OnClickListener() { // from class: ws3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.S(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_left_short_press_twice)).setOnClickListener(new View.OnClickListener() { // from class: zs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.T(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_left_short_press_three_times)).setOnClickListener(new View.OnClickListener() { // from class: ys3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.H(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_right_short_press)).setOnClickListener(new View.OnClickListener() { // from class: vs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.I(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_right_short_press_twice)).setOnClickListener(new View.OnClickListener() { // from class: at3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.J(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_right_short_press_three_times)).setOnClickListener(new View.OnClickListener() { // from class: xs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.K(this.a, view);
            }
        });
        ((Button) findViewById(R.id.headset_action_default_bt)).setOnClickListener(new View.OnClickListener() { // from class: us3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.L(this.a, view);
            }
        });
        ((CheckBox) findViewById(R.id.headset_left_noise_control_mode_close)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rs3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetActionNewActivity.M(this.a, compoundButton, z);
            }
        });
        ((CheckBox) findViewById(R.id.headset_left_noise_control_mode_reduction)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: os3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetActionNewActivity.N(this.a, compoundButton, z);
            }
        });
        ((CheckBox) findViewById(R.id.headset_left_noise_control_mode_penetrate)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ps3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetActionNewActivity.O(this.a, compoundButton, z);
            }
        });
        ((CheckBox) findViewById(R.id.headset_right_noise_control_mode_close)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ns3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetActionNewActivity.P(this.a, compoundButton, z);
            }
        });
        ((CheckBox) findViewById(R.id.headset_right_noise_control_mode_penetrate)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qs3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetActionNewActivity.Q(this.a, compoundButton, z);
            }
        });
        ((CheckBox) findViewById(R.id.headset_right_noise_control_mode_reduction)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ct3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetActionNewActivity.R(this.a, compoundButton, z);
            }
        });
        c0(U());
        E();
    }

    private final boolean isConnected() {
        return y().isConnected(HMDeviceType.HEADSET);
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    private final int t(ListTile item) {
        return u(item.getTips().toString());
    }

    private final int u(String actionName) {
        int iIntValue = -1;
        for (Map.Entry<Integer, String> entry : w().entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), actionName)) {
                iIntValue = entry.getKey().intValue();
            }
        }
        return iIntValue;
    }

    private final void v(boolean isRight, CompoundButton buttonView, boolean isChecked) {
        d0(isRight, buttonView, isChecked);
        V(isRight ? HeadsetActionNewType.RIGHT_LONG_PRESS : HeadsetActionNewType.LEFT_LONG_PRESS, B(isRight));
    }

    private final Map<Integer, String> w() {
        return (Map) this.action2str.getValue();
    }

    private final String x(HeadsetActionNewType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.left), getString(R.string.headset_short_press)});
            case 2:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.left), getString(R.string.headset_short_press_twice)});
            case 3:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.left), getString(R.string.headset_short_press_three_times)});
            case 4:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.right), getString(R.string.headset_short_press)});
            case 5:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.right), getString(R.string.headset_short_press_twice)});
            case 6:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.right), getString(R.string.headset_short_press_three_times)});
            case 7:
            case 8:
            default:
                return "";
            case 9:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.left), getString(R.string.headset_double_tap)});
            case 10:
                return getString(R.string.headset_gesture_choose_dialog_title, new Object[]{getString(R.string.right), getString(R.string.headset_double_tap)});
        }
    }

    private final DeviceManagerApi y() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final String[] z(HeadsetActionNewType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        Integer[] numArr = (i == 9 || i == 10) ? new Integer[]{2, 0} : new Integer[]{1, 5, 4, 3, 0};
        ArrayList arrayList = new ArrayList(numArr.length);
        for (Integer num : numArr) {
            String str = w().get(Integer.valueOf(num.intValue()));
            if (str == null) {
                throw new IllegalStateException("".toString());
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        Device device = null;
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            savedInstanceState = intent == null ? null : intent.getExtras();
        }
        String string = savedInstanceState == null ? null : savedInstanceState.getString(l);
        if (string == null) {
            finish();
            return;
        }
        this.address = string;
        Device bindDevice = y().getBindDevice(HMDeviceType.HEADSET, string);
        if (bindDevice != null) {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
            device = bindDevice;
        }
        this.device = device;
        setContentView(R.layout.activity_headset_action_new);
        ((RainbowTitleBar) findViewById(R.id.rainbowTitleBar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: bt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetActionNewActivity.W(this.a, view);
            }
        });
        HeadsetActionViewModel headsetActionViewModel = (HeadsetActionViewModel) new ViewModelProvider(this).get(HeadsetActionViewModel.class);
        this.viewModel = headsetActionViewModel;
        Objects.requireNonNull(headsetActionViewModel);
        headsetActionViewModel.getActionSettingLiveData().observe(this, new Observer() { // from class: ts3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetActionNewActivity.X(this.a, (HeadsetKnockSetting) obj);
            }
        });
        F();
        initView();
        HeadsetActionViewModel headsetActionViewModel2 = this.viewModel;
        Objects.requireNonNull(headsetActionViewModel2);
        headsetActionViewModel2.loadAction();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(l, str);
    }
}
