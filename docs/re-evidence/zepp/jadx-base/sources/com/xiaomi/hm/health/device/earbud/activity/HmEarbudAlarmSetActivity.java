package com.xiaomi.hm.health.device.earbud.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.choice.ChoiceView;
import com.huami.android.design.dialog.choice.ChoiceViewInterface;
import com.huami.android.design.dialog.choice.DialogChoiceView;
import com.huami.devicex.R;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareAnalytics;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.AlarmClockItem;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingType;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001^B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0012\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0014J\u0006\u0010&\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u0004H\u0014J\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200J\u000e\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203R\u001d\u0010:\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001d\u0010C\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010K\u001a\u00020G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00107\u001a\u0004\bI\u0010JR\u001d\u0010P\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\bN\u0010OR\u001d\u0010U\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u0010TR\u001d\u0010X\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010TR\u001d\u0010[\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00107\u001a\u0004\bZ\u0010T¨\u0006_"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudAlarmSetActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "H", "initView", "V", ShareAnalytics.ParamValue.SAVE, "", DTransferConstants.SEARCH_KEY, "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "K", "", "hour", "Y", "amPm", "Z", "a0", "C", "u", "M", "N", ExifInterface.GPS_DIRECTION_TRUE, "P", "t", "mask", SOAP.XMLNS, "", "weekdaysSelected", "r", "L", "E", LogUtil.D, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onLeftClicked", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "type", "onLoadingSuccess", "onLoadingFail", "onStart", "onDestroy", "Lcom/huami/widget/wheelview/event/Event12HourUpdate;", "event12HourUpdate", "onEvent", "Lcom/huami/widget/wheelview/event/EventAmPmUpdate;", "eventAmPmUpdate", "onEventMainThread", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "", "e", "x", "()Ljava/lang/String;", "mAlarmStr", "f", "w", "()Lcom/xiaomi/hm/health/databases/model/Alarm;", "mAlarm", "g", "[Z", "mWeekdaysSelected", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "h", "v", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/huami/widget/wheelview/OnWheelScrollListener;", "i", "B", "()Lcom/huami/widget/wheelview/OnWheelScrollListener;", "mWheelChangeListener", "Lcom/huami/widget/wheelview/adapters/PickAdapter;", z.j, "y", "()Lcom/huami/widget/wheelview/adapters/PickAdapter;", "mAmpmAdapter", hl.k, "z", "mHourAdapter", "l", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "mMinuteAdapter", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudAlarmSetActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> implements KoinComponent {

    @NotNull
    public static final String ARGS_ALARM = "args_alarm";

    @NotNull
    private static final String m = "HmEarbudAlarmSetActivity";
    private static final int n = 1;
    private static final int o = 0;
    private static final int p = 42;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAlarmStr = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAlarm = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final boolean[] mWeekdaysSelected = {false, false, false, false, false, false, false};

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWheelChangeListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAmpmAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHourAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMinuteAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "day : " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Alarm;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Alarm> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Alarm getA() {
            return (Alarm) new Gson().fromJson(HmEarbudAlarmSetActivity.this.x(), Alarm.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HmEarbudAlarmSetActivity.this.getIntent().getStringExtra("args_alarm");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/widget/wheelview/adapters/PickAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<PickAdapter> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PickAdapter getA() {
            HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity = HmEarbudAlarmSetActivity.this;
            return new PickAdapter(hmEarbudAlarmSetActivity, 0, 1, (WheelView) hmEarbudAlarmSetActivity.findViewById(R.id.ampm_wheel), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.p4), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.s2), -2003199591, false, 42, 15, 12, 21, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/widget/wheelview/adapters/PickAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<PickAdapter> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PickAdapter getA() {
            HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity = HmEarbudAlarmSetActivity.this;
            return new PickAdapter(hmEarbudAlarmSetActivity, 0, 23, (WheelView) hmEarbudAlarmSetActivity.findViewById(R.id.hour_wheel), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.p4), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.s2), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.s3), true, 42, 15, 12, 11, 1, 3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/widget/wheelview/adapters/PickAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<PickAdapter> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PickAdapter getA() {
            HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity = HmEarbudAlarmSetActivity.this;
            return new PickAdapter(hmEarbudAlarmSetActivity, 0, 59, (WheelView) hmEarbudAlarmSetActivity.findViewById(R.id.min_wheel), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.p4), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.s2), ContextCompat.getColor(HmEarbudAlarmSetActivity.this, R.color.s3), true, 42, 15, 12, 11, 1, 3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "hour:" + this.a + ", min:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Alarm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Alarm alarm) {
            super(0);
            this.a = alarm;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "save alarm : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "select : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "updateAmPmByHour hour=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "updateHourByAmPm : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "cur hour =" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "after hour =" + this.a.element;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudAlarmSetActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
        this.mWheelChangeListener = LazyKt__LazyJVMKt.lazy(new Function0<HmEarbudAlarmSetActivity$mWheelChangeListener$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$mWheelChangeListener$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$mWheelChangeListener$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 getA() {
                final HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity = this.a;
                return new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$mWheelChangeListener$2.1
                    @Override // com.huami.widget.wheelview.OnWheelScrollListener
                    public void onScrollingFinished(@Nullable WheelView wheel) {
                        hmEarbudAlarmSetActivity.M();
                    }

                    @Override // com.huami.widget.wheelview.OnWheelScrollListener
                    public void onScrollingStarted(@Nullable WheelView wheel) {
                    }
                };
            }
        });
        this.mAmpmAdapter = LazyKt__LazyJVMKt.lazy(new d());
        this.mHourAdapter = LazyKt__LazyJVMKt.lazy(new e());
        this.mMinuteAdapter = LazyKt__LazyJVMKt.lazy(new f());
    }

    private final PickAdapter A() {
        return (PickAdapter) this.mMinuteAdapter.getValue();
    }

    private final OnWheelScrollListener B() {
        return (OnWheelScrollListener) this.mWheelChangeListener.getValue();
    }

    private final int C() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(w().getCalendar().longValue());
        return calendar.get(12);
    }

    private final int D() {
        return ((WheelView) findViewById(R.id.hour_wheel)).getCurrentItem();
    }

    private final int E() {
        return ((WheelView) findViewById(R.id.min_wheel)).getCurrentItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, View view) {
        hmEarbudAlarmSetActivity.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            hmEarbudAlarmSetActivity.w().setIsSmartWakeup(Boolean.valueOf(z));
            hmEarbudAlarmSetActivity.w().setMSmartWakeupDuration(10);
        }
    }

    private final void H() {
        BTStatusFragment.newInstance(R.id.status_content, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmSetActivity$initWheel$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.EARBUD;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                super.onEnableChange(enable);
                this.a.findViewById(R.id.mask_view).setVisibility(enable ? 8 : 0);
            }
        });
        y().setUIStyle("normal");
        y().setMode(17);
        int i2 = R.id.ampm_wheel;
        WheelView visibleItems = ((WheelView) findViewById(i2)).setVisibleItems(2);
        int i3 = R.drawable.wheel_custom_val_white_1;
        visibleItems.setCenterDrawable(i3).setCenterStyle("", 18.0f).setViewAdapter(y());
        ((WheelView) findViewById(i2)).addScrollingListener(B());
        int i4 = R.id.hour_wheel;
        WheelView centerDrawable = ((WheelView) findViewById(i4)).setVisibleItems(5).setCenterDrawable(i3);
        String string = getResources().getString(R.string.unit_hour);
        int i5 = R.color.dark_sky_blue_three;
        centerDrawable.setCenterStyle(string, i5, 8, 10.0f, -1.0f).setViewAdapter(z());
        ((WheelView) findViewById(i4)).addScrollingListener(B());
        int i6 = R.id.min_wheel;
        ((WheelView) findViewById(i6)).setVisibleItems(5).setCenterDrawable(i3).setCenterStyle(getResources().getString(R.string.unit_min), i5, 8, 10.0f, -1.0f).setViewAdapter(A());
        ((WheelView) findViewById(i6)).addScrollingListener(B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, View view) {
        hmEarbudAlarmSetActivity.onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, View view, int i2) {
        hmEarbudAlarmSetActivity.onRightOnClicked(view);
    }

    private final void K(Alarm alarm) {
        int iD = D();
        int iE = E();
        HMLog.debug(getTAG(), new g(iD, iE));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        calendar.set(11, iD);
        calendar.set(12, iE);
        alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
        HMLog.debug(getTAG(), new h(alarm));
    }

    private final void L(boolean[] weekdaysSelected) {
        int compactRepeatForNonCalendar = AlarmClockManager.getCompactRepeatForNonCalendar(w().getMDays().intValue());
        int i2 = 6;
        while (true) {
            int i3 = i2 - 1;
            if (((64 >> (6 - i2)) & compactRepeatForNonCalendar) != 0) {
                weekdaysSelected[i2] = true;
            }
            if (i3 < 0) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        ((TextView) findViewById(R.id.alarm_delay_text)).setText(AlarmClockManager.getInstance().getEarbudTipStr(D(), E(), AlarmClockManager.getCompactRepeatForNonCalendar(w().getMDays().intValue())));
    }

    private final void N() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.cancel_save_tips)).setPositiveButton(getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: x34
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HmEarbudAlarmSetActivity.O(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, DialogInterface dialogInterface, int i2) {
        hmEarbudAlarmSetActivity.onBackPressed();
    }

    private final void P() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_WEEK_SETTING_VIEW_NUM));
        DialogChoiceView dialogChoiceView = new DialogChoiceView(this);
        dialogChoiceView.setTitle(R.string.repeat);
        dialogChoiceView.setChoiceBuilder(ChoiceView.Builder.with(this).setTitles(R.array.weeks).setCheckedItems(this.mWeekdaysSelected).setSmallStyle(true).setOnMultiChoiceClickListener(new ChoiceViewInterface.OnMultiChoiceClickListener() { // from class: e44
            @Override // com.huami.android.design.dialog.choice.ChoiceViewInterface.OnMultiChoiceClickListener
            public final void onClick(ChoiceView choiceView, int i2, boolean z) {
                HmEarbudAlarmSetActivity.R(this.a, choiceView, i2, z);
            }
        }));
        new AlertDialogFragment.Builder(this).setContentView(dialogChoiceView).setCancelable(false).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: w34
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HmEarbudAlarmSetActivity.S(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: y34
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HmEarbudAlarmSetActivity.Q(this.a, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, DialogInterface dialogInterface, int i2) {
        ((ListTile) hmEarbudAlarmSetActivity.findViewById(R.id.repeat_item)).setSubtitle(AlarmClockManager.getInstance().getWeekString(hmEarbudAlarmSetActivity.w()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, ChoiceView choiceView, int i2, boolean z) {
        boolean[] zArr = hmEarbudAlarmSetActivity.mWeekdaysSelected;
        zArr[i2] = z;
        int length = zArr.length;
        int i3 = 0;
        while (i3 < length) {
            boolean z2 = zArr[i3];
            i3++;
            HMLog.debug(hmEarbudAlarmSetActivity.getTAG(), new i(z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, DialogInterface dialogInterface, int i2) {
        hmEarbudAlarmSetActivity.w().setMDays(Integer.valueOf(hmEarbudAlarmSetActivity.t()));
        hmEarbudAlarmSetActivity.M();
        ((ListTile) hmEarbudAlarmSetActivity.findViewById(R.id.repeat_item)).setSubtitle(AlarmClockManager.getInstance().getWeekString(hmEarbudAlarmSetActivity.w()));
    }

    private final void T() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.alarm_clock_repeat).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.alarm_repeat_titles).setItemChoice(s(AlarmClockManager.getCompactRepeatForNonCalendar(w().getMDays().intValue()))), new DialogInterface.OnClickListener() { // from class: u34
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HmEarbudAlarmSetActivity.U(this.a, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, DialogInterface dialogInterface, int i2) {
        if (i2 == 0) {
            hmEarbudAlarmSetActivity.w().setMDays(0);
            hmEarbudAlarmSetActivity.M();
            ((ListTile) hmEarbudAlarmSetActivity.findViewById(R.id.repeat_item)).setSubtitle(AlarmClockManager.getInstance().getWeekString(hmEarbudAlarmSetActivity.w()));
            return;
        }
        if (i2 == 1) {
            hmEarbudAlarmSetActivity.w().setMDays(127);
            hmEarbudAlarmSetActivity.M();
            ((ListTile) hmEarbudAlarmSetActivity.findViewById(R.id.repeat_item)).setSubtitle(AlarmClockManager.getInstance().getWeekString(hmEarbudAlarmSetActivity.w()));
        } else if (i2 == 2) {
            hmEarbudAlarmSetActivity.w().setMDays(31);
            hmEarbudAlarmSetActivity.M();
            ((ListTile) hmEarbudAlarmSetActivity.findViewById(R.id.repeat_item)).setSubtitle(AlarmClockManager.getInstance().getWeekString(hmEarbudAlarmSetActivity.w()));
        } else {
            if (i2 != 3) {
                return;
            }
            hmEarbudAlarmSetActivity.M();
            hmEarbudAlarmSetActivity.r(hmEarbudAlarmSetActivity.mWeekdaysSelected);
            hmEarbudAlarmSetActivity.L(hmEarbudAlarmSetActivity.mWeekdaysSelected);
            hmEarbudAlarmSetActivity.P();
        }
    }

    private final void V() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.earbud_alarm_tip).setNeutralButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: z34
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HmEarbudAlarmSetActivity.W(dialogInterface, i2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: a44
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                HmEarbudAlarmSetActivity.X(this.a, dialogInterface);
            }
        }).show(getSupportFragmentManager(), "Alarm Tip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(HmEarbudAlarmSetActivity hmEarbudAlarmSetActivity, DialogInterface dialogInterface) {
        hmEarbudAlarmSetActivity.v().setShowEarbudAlarmDialog(false);
        hmEarbudAlarmSetActivity.save();
    }

    private final void Y(int hour) {
        HMLog.debug(getTAG(), new j(hour));
        int i2 = R.id.ampm_wheel;
        if (((WheelView) findViewById(i2)) == null || DateFormat.is24HourFormat(this)) {
            return;
        }
        ((WheelView) findViewById(i2)).setCurrentItem(hour >= 12 ? 1 : 0);
    }

    private final void Z(int amPm) {
        HMLog.debug(getTAG(), new k(amPm));
        if (DateFormat.is24HourFormat(this)) {
            return;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        int i2 = R.id.hour_wheel;
        intRef.element = ((WheelView) findViewById(i2)).getCurrentItem();
        HMLog.debug(getTAG(), new l(intRef));
        if (amPm == 0) {
            int i3 = intRef.element;
            if (i3 >= 12) {
                intRef.element = i3 - 12;
            }
        } else {
            int i4 = intRef.element;
            if (i4 < 12) {
                intRef.element = i4 + 12;
            }
        }
        HMLog.debug(getTAG(), new m(intRef));
        ((WheelView) findViewById(i2)).setCurrentItemLooped(intRef.element);
    }

    private final void a0() {
        ((WheelView) findViewById(R.id.min_wheel)).setCurrentItemLooped(C());
        if (DateFormat.is24HourFormat(this)) {
            ((WheelView) findViewById(R.id.ampm_wheel)).setVisibility(8);
            z().setMode(9);
            int i2 = R.id.hour_wheel;
            ((WheelView) findViewById(i2)).setViewAdapter(z());
            ((WheelView) findViewById(i2)).setCurrentItemLooped(u());
            return;
        }
        int i3 = R.id.ampm_wheel;
        ((WheelView) findViewById(i3)).setVisibility(0);
        z().setMode(16);
        int i4 = R.id.hour_wheel;
        ((WheelView) findViewById(i4)).setViewAdapter(z());
        int iU = u();
        if (iU >= 12) {
            ((WheelView) findViewById(i3)).setCurrentItem(1);
            ((WheelView) findViewById(i4)).setCurrentItemLooped(iU - 12);
        } else {
            ((WheelView) findViewById(i3)).setCurrentItem(0);
            ((WheelView) findViewById(i4)).setCurrentItemLooped(iU);
        }
    }

    private final void initView() {
        int i2 = R.id.repeat_item;
        ((ListTile) findViewById(i2)).setSubtitle(AlarmClockManager.getInstance().getWeekString(w()));
        ((ListTile) findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: c44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudAlarmSetActivity.F(this.a, view);
            }
        });
        int i3 = R.id.lazy_item;
        ((ListTile) findViewById(i3)).setChecked(w().getIsSmartWakeup().booleanValue());
        ((ListTile) findViewById(i3)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: d44
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmEarbudAlarmSetActivity.G(this.a, compoundButton, z);
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(w().getCalendar().longValue());
        ((TextView) findViewById(R.id.alarm_delay_text)).setText(AlarmClockManager.getInstance().getEarbudTipStr(calendar.get(11), calendar.get(12), AlarmClockManager.getCompactRepeatForNonCalendar(w().getMDays().intValue())));
    }

    private final boolean q() {
        K(w());
        return !Intrinsics.areEqual(x(), new Gson().toJson(w()));
    }

    private final void r(boolean[] weekdaysSelected) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            weekdaysSelected[i2] = false;
            if (i3 > 6) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    private final int s(int mask) {
        if (mask == 0) {
            return 0;
        }
        if (mask != 31) {
            return mask != 127 ? 3 : 1;
        }
        return 2;
    }

    private final void save() {
        getMViewModel().saveAlarm(w());
    }

    private final int t() {
        int length = this.mWeekdaysSelected.length;
        Ref.IntRef intRef = new Ref.IntRef();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (this.mWeekdaysSelected[i2]) {
                    intRef.element = AlarmClockItem.WEEK_MASK[i2] | intRef.element;
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        HMLog.debug(getTAG(), new a(intRef));
        return intRef.element;
    }

    private final int u() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(w().getCalendar().longValue());
        return calendar.get(11);
    }

    private final KeeperProxyApi v() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    private final Alarm w() {
        return (Alarm) this.mAlarm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String x() {
        return (String) this.mAlarmStr.getValue();
    }

    private final PickAdapter y() {
        return (PickAdapter) this.mAmpmAdapter.getValue();
    }

    private final PickAdapter z() {
        return (PickAdapter) this.mHourAdapter.getValue();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    @NotNull
    public EarbudDeviceViewModel getMViewModel() {
        return (EarbudDeviceViewModel) this.mViewModel.getValue();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_alarm_set);
        int i2 = R.id.tv_title_bar;
        ((RainbowTitleBar) findViewById(i2)).setNavigationOnClickListener(new View.OnClickListener() { // from class: b44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudAlarmSetActivity.I(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(i2)).setMenuText(R.string.save);
        ((RainbowTitleBar) findViewById(i2)).setTitle(R.string.set_alarm);
        ((RainbowTitleBar) findViewById(i2)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: v34
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i3) {
                HmEarbudAlarmSetActivity.J(this.a, view, i3);
            }
        });
        H();
        initView();
        observeData();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull Event12HourUpdate event12HourUpdate) {
        Y(event12HourUpdate.getHour());
    }

    public final void onEventMainThread(@NotNull EventAmPmUpdate eventAmPmUpdate) {
        Z(eventAmPmUpdate.getAmPm());
    }

    public final void onLeftClicked() {
        if (q()) {
            N();
        } else {
            onBackPressed();
        }
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void onLoadingFail(@NotNull EarbudLoadingType type) {
        super.onLoadingFail(type);
        if (type == EarbudLoadingType.SAVE_ALARM) {
            onBackPressed();
        }
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void onLoadingSuccess(@NotNull EarbudLoadingType type) {
        super.onLoadingSuccess(type);
        if (type == EarbudLoadingType.SAVE_ALARM) {
            Intent intent = new Intent();
            intent.putExtra("args_alarm", new Gson().toJson(w()));
            setResult(-1, intent);
            finish();
        }
    }

    public final void onRightOnClicked(@Nullable View view) {
        w().setEnabled(Boolean.TRUE);
        K(w());
        if (v().isShowEarbudAlarmDialog()) {
            V();
        } else {
            save();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        a0();
    }
}
