package com.xiaomi.hm.health.device.headset;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.HeadSetActionActivity;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001fH\u0014R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R)\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadSetActionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "t", "", "enable", LogUtil.I, "B", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "headsetKnockSetting", SOAP.XMLNS, "Lcom/xiaomi/hm/health/device/headset/HeadsetActionType;", "type", "Lcom/huami/lib/rainbow/ListTile;", "item", "F", "", "selectValue", "G", "", "value", "C", com.google.android.exoplayer2.text.ttml.b.r, "", "r", "(Lcom/xiaomi/hm/health/device/headset/HeadsetActionType;)[Ljava/lang/String;", "m", "actionName", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/headset/HeadsetActionViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/HeadsetActionViewModel;", "viewModel", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/databases/model/Device;", "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/devicex/manager/DeviceManagerApi;", "e", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "", "f", "o", "()Ljava/util/Map;", "action2str", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadSetActionActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "HeadSetActionActivity";

    @NotNull
    private static final String h = "device_address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HeadsetActionViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy action2str;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadSetActionActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HeadSetActionActivity.class);
            intent.putExtra(HeadSetActionActivity.h, address);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeadsetActionType.values().length];
            iArr[HeadsetActionType.LEFT_SINGLE.ordinal()] = 1;
            iArr[HeadsetActionType.LEFT_DOUBLE.ordinal()] = 2;
            iArr[HeadsetActionType.LEFT_TRIPLE.ordinal()] = 3;
            iArr[HeadsetActionType.RIGHT_SINGLE.ordinal()] = 4;
            iArr[HeadsetActionType.RIGHT_DOUBLE.ordinal()] = 5;
            iArr[HeadsetActionType.RIGHT_TRIPLE.ordinal()] = 6;
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
            return r.mapOf(TuplesKt.to(0, HeadSetActionActivity.this.getResources().getString(R.string.headset_action_none)), TuplesKt.to(1, HeadSetActionActivity.this.getResources().getString(R.string.headset_action_music_play_or_stop)), TuplesKt.to(5, HeadSetActionActivity.this.getResources().getString(R.string.headset_action_music_next)), TuplesKt.to(4, HeadSetActionActivity.this.getResources().getString(R.string.headset_action_music_pre)), TuplesKt.to(2, HeadSetActionActivity.this.getResources().getString(R.string.headset_action_side_listening)), TuplesKt.to(3, HeadSetActionActivity.this.getResources().getString(R.string.headset_action_wake_assistant)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HeadsetKnockSetting a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeadsetKnockSetting headsetKnockSetting) {
            super(0);
            this.a = headsetKnockSetting;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "update select action UI:" + HeadsetActionViewModelKt.toPrintString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ HeadsetActionType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, HeadsetActionType headsetActionType) {
            super(0);
            this.a = i;
            this.b = headsetActionType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "select " + this.a + " on " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "ERROR: wrong action value:" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadSetActionActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.HeadSetActionActivity$special$$inlined$inject$default$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(HeadSetActionActivity headSetActionActivity, View view) {
        HeadsetActionViewModel headsetActionViewModel = headSetActionActivity.viewModel;
        Objects.requireNonNull(headsetActionViewModel);
        headsetActionViewModel.setDefaultAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B() {
        return q().isActive(this.device);
    }

    private final void C(HeadsetActionType type, int value) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        HMLog.info(g, new c(value, type));
        if (value < 0) {
            HMLog.info(g, new d(value));
            return;
        }
        int iM = m((ListTile) findViewById(R.id.headset_action_item_left_single_touch));
        int iM2 = m((ListTile) findViewById(R.id.headset_action_item_left_double_touch));
        int iM3 = m((ListTile) findViewById(R.id.headset_action_item_left_triple_touch));
        int iM4 = m((ListTile) findViewById(R.id.headset_action_item_right_single_touch));
        int iM5 = m((ListTile) findViewById(R.id.headset_action_item_right_double_touch));
        int iM6 = m((ListTile) findViewById(R.id.headset_action_item_right_triple_touch));
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                i = value;
                i2 = iM2;
                i3 = iM3;
                i4 = iM4;
                i5 = iM5;
                i6 = iM6;
                break;
            case 2:
                i2 = value;
                i = iM;
                i3 = iM3;
                i4 = iM4;
                i5 = iM5;
                i6 = iM6;
                break;
            case 3:
                i3 = value;
                i = iM;
                i2 = iM2;
                i4 = iM4;
                i5 = iM5;
                i6 = iM6;
                break;
            case 4:
                i4 = value;
                i = iM;
                i2 = iM2;
                i3 = iM3;
                i5 = iM5;
                i6 = iM6;
                break;
            case 5:
                i5 = value;
                i = iM;
                i2 = iM2;
                i3 = iM3;
                i4 = iM4;
                i6 = iM6;
                break;
            case 6:
                i6 = value;
                i = iM;
                i2 = iM2;
                i3 = iM3;
                i4 = iM4;
                i5 = iM5;
                break;
            default:
                i = iM;
                i2 = iM2;
                i3 = iM3;
                i4 = iM4;
                i5 = iM5;
                i6 = iM6;
                break;
        }
        if (B()) {
            HeadsetActionViewModel headsetActionViewModel = this.viewModel;
            Objects.requireNonNull(headsetActionViewModel);
            headsetActionViewModel.setAction(new HeadsetKnockSetting(i, i4, i2, i5, i3, i6, 0, 0, 0, 0, 0, 0, 0, 0, 16320, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HeadSetActionActivity headSetActionActivity, HeadsetKnockSetting headsetKnockSetting) {
        headSetActionActivity.s(headsetKnockSetting);
    }

    private final void F(HeadsetActionType type, ListTile item) {
        G(type, item.getTips().toString());
    }

    private final void G(final HeadsetActionType type, String selectValue) {
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        final String[] strArrR = r(type);
        int length = strArrR.length;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < length) {
            int i4 = i2 + 1;
            if (Intrinsics.areEqual(selectValue, strArrR[i])) {
                i3 = i2;
            }
            i++;
            i2 = i4;
        }
        choiceItems.setItems(strArrR);
        new AlertDialogFragment.Builder(this).setTitle(p(type)).setSingleChoiceItems(choiceItems.setItemChoice(i3), new DialogInterface.OnClickListener() { // from class: yr3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                HeadSetActionActivity.H(this.a, type, strArrR, dialogInterface, i5);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HeadSetActionActivity headSetActionActivity, HeadsetActionType headsetActionType, String[] strArr, DialogInterface dialogInterface, int i) {
        headSetActionActivity.C(headsetActionType, headSetActionActivity.n(strArr[i]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(boolean enable) {
        ((ListTile) findViewById(R.id.headset_action_item_left_single_touch)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_action_item_left_double_touch)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_action_item_left_triple_touch)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_action_item_right_single_touch)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_action_item_right_double_touch)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_action_item_right_triple_touch)).setEnabled(enable);
        ((Button) findViewById(R.id.headset_action_default_bt)).setEnabled(enable);
    }

    private final void initView() {
        int i = R.id.headset_action_item_left_single_touch;
        ((ListTile) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: bs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.u(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_action_item_left_double_touch)).setOnClickListener(new View.OnClickListener() { // from class: gs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.v(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_action_item_left_triple_touch)).setOnClickListener(new View.OnClickListener() { // from class: as3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.w(this.a, view);
            }
        });
        int i2 = R.id.headset_action_item_right_single_touch;
        ((ListTile) findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: es3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.x(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_action_item_right_double_touch)).setOnClickListener(new View.OnClickListener() { // from class: zr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.y(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.headset_action_item_right_triple_touch)).setOnClickListener(new View.OnClickListener() { // from class: ds3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.z(this.a, view);
            }
        });
        ((Button) findViewById(R.id.headset_action_default_bt)).setOnClickListener(new View.OnClickListener() { // from class: cs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.A(this.a, view);
            }
        });
        ((ListTile) findViewById(i)).setVisibility(8);
        ((ListTile) findViewById(i2)).setVisibility(8);
        I(B());
        t();
    }

    private final int m(ListTile item) {
        return n(item.getTips().toString());
    }

    private final int n(String actionName) {
        int iIntValue = -1;
        for (Map.Entry<Integer, String> entry : o().entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), actionName)) {
                iIntValue = entry.getKey().intValue();
            }
        }
        return iIntValue;
    }

    private final Map<Integer, String> o() {
        return (Map) this.action2str.getValue();
    }

    private final String p(HeadsetActionType type) {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                i = R.string.headset_action_left_single_title;
                break;
            case 2:
                i = R.string.headset_action_left_double_title;
                break;
            case 3:
                i = R.string.headset_action_left_triple_title;
                break;
            case 4:
                i = R.string.headset_action_right_single_title;
                break;
            case 5:
                i = R.string.headset_action_right_double_title;
                break;
            case 6:
                i = R.string.headset_action_right_triple_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return getResources().getString(i);
    }

    private final DeviceManagerApi q() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final String[] r(HeadsetActionType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        Integer[] numArr = (i == 1 || i == 4) ? new Integer[]{2, 0} : new Integer[]{1, 5, 4, 2, 3, 0};
        ArrayList arrayList = new ArrayList(numArr.length);
        for (Integer num : numArr) {
            String str = o().get(Integer.valueOf(num.intValue()));
            if (str == null) {
                throw new IllegalStateException("".toString());
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    private final void s(HeadsetKnockSetting headsetKnockSetting) {
        HMLog.info(g, new b(headsetKnockSetting));
        ((ListTile) findViewById(R.id.headset_action_item_left_single_touch)).setTips(o().get(Integer.valueOf(headsetKnockSetting.getLeftSingleKnock())));
        ((ListTile) findViewById(R.id.headset_action_item_left_double_touch)).setTips(o().get(Integer.valueOf(headsetKnockSetting.getLeftDoubleKnock())));
        ((ListTile) findViewById(R.id.headset_action_item_left_triple_touch)).setTips(o().get(Integer.valueOf(headsetKnockSetting.getLeftTripleKnock())));
        ((ListTile) findViewById(R.id.headset_action_item_right_single_touch)).setTips(o().get(Integer.valueOf(headsetKnockSetting.getRightSingleKnock())));
        ((ListTile) findViewById(R.id.headset_action_item_right_double_touch)).setTips(o().get(Integer.valueOf(headsetKnockSetting.getRightDoubleKnock())));
        ((ListTile) findViewById(R.id.headset_action_item_right_triple_touch)).setTips(o().get(Integer.valueOf(headsetKnockSetting.getRightTripleKnock())));
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    private final void t() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.headset.HeadSetActionActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.B();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.I(enable);
                if (enable) {
                    HeadsetActionViewModel headsetActionViewModel = this.a.viewModel;
                    Objects.requireNonNull(headsetActionViewModel);
                    headsetActionViewModel.loadAction();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.F(HeadsetActionType.LEFT_SINGLE, (ListTile) headSetActionActivity.findViewById(R.id.headset_action_item_left_single_touch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.F(HeadsetActionType.LEFT_DOUBLE, (ListTile) headSetActionActivity.findViewById(R.id.headset_action_item_left_double_touch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.F(HeadsetActionType.LEFT_TRIPLE, (ListTile) headSetActionActivity.findViewById(R.id.headset_action_item_left_triple_touch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.F(HeadsetActionType.RIGHT_SINGLE, (ListTile) headSetActionActivity.findViewById(R.id.headset_action_item_right_single_touch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.F(HeadsetActionType.RIGHT_DOUBLE, (ListTile) headSetActionActivity.findViewById(R.id.headset_action_item_right_double_touch));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(HeadSetActionActivity headSetActionActivity, View view) {
        headSetActionActivity.F(HeadsetActionType.RIGHT_TRIPLE, (ListTile) headSetActionActivity.findViewById(R.id.headset_action_item_right_triple_touch));
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
        String string = savedInstanceState == null ? null : savedInstanceState.getString(h);
        if (string == null) {
            finish();
            return;
        }
        this.address = string;
        Device bindDevice = q().getBindDevice(HMDeviceType.HEADSET, string);
        if (bindDevice != null) {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
            device = bindDevice;
        }
        this.device = device;
        setContentView(R.layout.activity_headset_action);
        ((RainbowTitleBar) findViewById(R.id.rainbowTitleBar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: fs3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadSetActionActivity.D(this.a, view);
            }
        });
        HeadsetActionViewModel headsetActionViewModel = (HeadsetActionViewModel) new ViewModelProvider(this).get(HeadsetActionViewModel.class);
        this.viewModel = headsetActionViewModel;
        Objects.requireNonNull(headsetActionViewModel);
        headsetActionViewModel.getActionSettingLiveData().observe(this, new Observer() { // from class: hs3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadSetActionActivity.E(this.a, (HeadsetKnockSetting) obj);
            }
        });
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
        outState.putString(h, str);
    }
}
