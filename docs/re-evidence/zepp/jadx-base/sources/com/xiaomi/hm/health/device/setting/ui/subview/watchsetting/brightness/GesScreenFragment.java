package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.GesScreenFragment;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import io.netty.util.internal.StringUtil;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bH\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/GesScreenFragment;", "Landroidx/fragment/app/Fragment;", "", "initViewModel", "initView", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "displayAndBrightness", com.google.android.exoplayer2.text.ttml.b.r, "", "enable", "y", z.j, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "t", "r", "isStart", "v", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingViewModel;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingViewModel;", "watchSettingViewModel", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "displayBrightnessViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "c", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GesScreenFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "GesScreenFragment";
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;

    @NotNull
    private static final HashMap<Integer, Integer> j;

    @NotNull
    private static final HashMap<Integer, Integer> k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WatchSettingViewModel watchSettingViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DisplayBrightnessViewModel displayBrightnessViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR2\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R2\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/GesScreenFragment$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enum", "", "getSensitivityModeDesc", "getGesModeDesc", "MODE_ALL_DAY", LogUtil.I, "MODE_OFF", "MODE_SMART", "MODE_TIME", "", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "gesScreenModeDescMap", "Ljava/util/HashMap;", "sensitivityModeDescMap", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @StringRes
        public final int getGesModeDesc(@NotNull EnumData enumData) {
            Integer num = (Integer) GesScreenFragment.j.get(Integer.valueOf(enumData.getValue()));
            return num == null ? R.string.unknown : num.intValue();
        }

        @StringRes
        public final int getSensitivityModeDesc(@NotNull EnumData enumData) {
            Integer num = (Integer) GesScreenFragment.k.get(Integer.valueOf(enumData.getValue()));
            return num == null ? R.string.unknown : num.intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(GesScreenFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            GesScreenFragment.this.t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            GesScreenFragment.this.r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            GesScreenFragment.this.v(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            GesScreenFragment.this.v(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshView dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showPickSensitivityDialog return for dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showPickSensitivityDialog return for sensitivity null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showPickerDialog return for dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showTimeChooseUI dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showTimeChooseUI startTime null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showTimeChooseUI endTime null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "updateEnableState return for mode null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "updateTime null";
        }
    }

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, Integer.valueOf(R.string.watch_setting_ges_screen_mode_off));
        map.put(1, Integer.valueOf(R.string.watch_setting_ges_screen_mode_on_time));
        map.put(2, Integer.valueOf(R.string.watch_setting_ges_screen_mode_on_all_day));
        map.put(3, Integer.valueOf(R.string.watch_setting_ges_screen_mode_on_smart));
        j = map;
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(0, Integer.valueOf(R.string.ges_screen_sensitivity_standard));
        map2.put(1, Integer.valueOf(R.string.ges_screen_sensitivity_sensitive));
        k = map2;
    }

    private final void A(DisplayAndBrightnessV2 displayAndBrightness) {
        EnumData screenOnByTurningWristMode = displayAndBrightness.getScreenOnByTurningWristMode();
        if (screenOnByTurningWristMode == null) {
            return;
        }
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.ges_screen_item))).setTips(INSTANCE.getGesModeDesc(screenOnByTurningWristMode));
    }

    private final void B(DisplayAndBrightnessV2 displayAndBrightness) {
        EnumData screenOnByTurningWristActiveSpeed = displayAndBrightness.getScreenOnByTurningWristActiveSpeed();
        if (screenOnByTurningWristActiveSpeed == null) {
            return;
        }
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.sensitivity_item))).setTips(INSTANCE.getSensitivityModeDesc(screenOnByTurningWristActiveSpeed));
    }

    private final void C(DisplayAndBrightnessV2 displayAndBrightness) {
        Time screenOnByTurningWristBeginTime = displayAndBrightness.getScreenOnByTurningWristBeginTime();
        Time screenOnByTurningWristEndTime = displayAndBrightness.getScreenOnByTurningWristEndTime();
        if (screenOnByTurningWristBeginTime == null || screenOnByTurningWristEndTime == null) {
            HMLog.info(e, n.a);
            return;
        }
        int hour = (screenOnByTurningWristBeginTime.getHour() * 60) + screenOnByTurningWristBeginTime.getMinute();
        int hour2 = (screenOnByTurningWristEndTime.getHour() * 60) + screenOnByTurningWristEndTime.getMinute();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (hour >= hour2) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime(getContext(), hour));
        sb2.append(TimeUtils.formatTime(getContext(), hour2));
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.start_time_item))).setTips(sb.toString());
        View view2 = getView();
        ((ListTile) (view2 != null ? view2.findViewById(R.id.end_time_item) : null)).setTips(sb2.toString());
    }

    private final void initView() {
        this.mLoadingDialogHelper = new LoadingDialogHelper(getActivity());
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.ges_screen_item), 0L, new b(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.sensitivity_item), 0L, new c(), 1, null);
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.start_time_item))).setVisibility(0);
        View view5 = getView();
        ExtKt.smartClick$default(view5 == null ? null : view5.findViewById(R.id.start_time_item), 0L, new d(), 1, null);
        View view6 = getView();
        ExtKt.smartClick$default(view6 == null ? null : view6.findViewById(R.id.end_time_item), 0L, new e(), 1, null);
        if (HMDeviceConfig.isWatch(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI))) {
            return;
        }
        View view7 = getView();
        ((ImageView) (view7 != null ? view7.findViewById(R.id.ges_screen_img) : null)).setImageResource(R.drawable.ges_screen_new_mili);
    }

    private final void initViewModel() {
        this.watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        DisplayBrightnessViewModel displayBrightnessViewModel = (DisplayBrightnessViewModel) new ViewModelProvider(requireActivity()).get(DisplayBrightnessViewModel.class);
        this.displayBrightnessViewModel = displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        displayBrightnessViewModel.initJob(HMDeviceType.MILI);
        DisplayBrightnessViewModel displayBrightnessViewModel2 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel2);
        displayBrightnessViewModel2.getDisplayBrightnessSetting().observe(getViewLifecycleOwner(), new Observer() { // from class: ff2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                GesScreenFragment.k(this.a, (DisplayAndBrightness) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel3 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel3);
        displayBrightnessViewModel3.isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: gf2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                GesScreenFragment.l(this.a, (Boolean) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel4 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel4);
        displayBrightnessViewModel4.getScreenOnByTurningWristModeResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: jf2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                GesScreenFragment.m(this.a, (Pair) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel5 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel5);
        displayBrightnessViewModel5.getScreenOnByTurningWristActiveSpeedResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: hf2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                GesScreenFragment.n(this.a, (Pair) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel6 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel6);
        displayBrightnessViewModel6.getScreenOnByTurningWristBeginOrEndTimeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: if2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                GesScreenFragment.o(this.a, (Pair) obj);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel7 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel7);
        displayBrightnessViewModel7.getGesScreenModeVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.GesScreenFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.ges_screen_item), bool.booleanValue(), false, 2, null);
            }
        });
        DisplayBrightnessViewModel displayBrightnessViewModel8 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel8);
        displayBrightnessViewModel8.getSensitivityVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.GesScreenFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.sensitivity_item), bool.booleanValue(), false, 2, null);
            }
        });
    }

    private final void j() {
        if (this.fragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getChildFragmentManager());
            this.fragment = bTStatusFragmentNewInstance;
            if (bTStatusFragmentNewInstance != null) {
                bTStatusFragmentNewInstance.setShowBottomArea(false);
            }
            BTStatusFragment bTStatusFragment = this.fragment;
            if (bTStatusFragment == null) {
                return;
            }
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.GesScreenFragment$initBTStatusFragment$1
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    GesScreenFragment.z(this.a, enable, null, 2, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(GesScreenFragment gesScreenFragment, DisplayAndBrightness displayAndBrightness) {
        gesScreenFragment.p(displayAndBrightness instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) displayAndBrightness : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(GesScreenFragment gesScreenFragment, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (!bool.booleanValue() || (loadingDialogHelper = gesScreenFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(GesScreenFragment gesScreenFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = gesScreenFragment.mLoadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.setSuccess(R.string.save_success);
            }
            q(gesScreenFragment, null, 1, null);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = gesScreenFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(GesScreenFragment gesScreenFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = gesScreenFragment.mLoadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.setSuccess(R.string.save_success);
            }
            q(gesScreenFragment, null, 1, null);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = gesScreenFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(GesScreenFragment gesScreenFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = gesScreenFragment.mLoadingDialogHelper;
            if (loadingDialogHelper != null) {
                loadingDialogHelper.setSuccess(R.string.save_success);
            }
            q(gesScreenFragment, null, 1, null);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = gesScreenFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    private final void p(DisplayAndBrightnessV2 displayAndBrightness) {
        if (displayAndBrightness == null) {
            DisplayBrightnessViewModel displayBrightnessViewModel = this.displayBrightnessViewModel;
            Objects.requireNonNull(displayBrightnessViewModel);
            DisplayAndBrightness value = displayBrightnessViewModel.getDisplayBrightnessSetting().getValue();
            displayAndBrightness = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        }
        if (displayAndBrightness == null) {
            HMLog.info(e, f.a);
            return;
        }
        A(displayAndBrightness);
        B(displayAndBrightness);
        C(displayAndBrightness);
        z(this, false, displayAndBrightness, 1, null);
    }

    public static /* synthetic */ void q(GesScreenFragment gesScreenFragment, DisplayAndBrightnessV2 displayAndBrightnessV2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            displayAndBrightnessV2 = null;
        }
        gesScreenFragment.p(displayAndBrightnessV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        DisplayBrightnessViewModel displayBrightnessViewModel = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        DisplayAndBrightness value = displayBrightnessViewModel.getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        if (displayAndBrightnessV2 == null) {
            HMLog.info(e, g.a);
            return;
        }
        EnumData screenOnByTurningWristActiveSpeed = displayAndBrightnessV2.getScreenOnByTurningWristActiveSpeed();
        Integer numValueOf = screenOnByTurningWristActiveSpeed == null ? null : Integer.valueOf(screenOnByTurningWristActiveSpeed.getValue());
        if (numValueOf == null) {
            HMLog.info(e, h.a);
        } else {
            new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.ges_screen_sensitivity).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(numValueOf.intValue()).setItems(new String[]{getString(R.string.ges_screen_sensitivity_standard), getString(R.string.ges_screen_sensitivity_sensitive)}), new DialogInterface.OnClickListener() { // from class: df2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    GesScreenFragment.s(this.a, dialogInterface, i2);
                }
            }).show(requireActivity().getSupportFragmentManager(), "pickGesScreenModeDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(GesScreenFragment gesScreenFragment, DialogInterface dialogInterface, int i2) {
        DisplayBrightnessViewModel displayBrightnessViewModel = gesScreenFragment.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        displayBrightnessViewModel.pushScreenOnByTurningWristActiveSpeed(new EnumData(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        DisplayBrightnessViewModel displayBrightnessViewModel = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        DisplayAndBrightness value = displayBrightnessViewModel.getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        final EnumData screenOnByTurningWristMode = displayAndBrightnessV2 == null ? null : displayAndBrightnessV2.getScreenOnByTurningWristMode();
        if (screenOnByTurningWristMode == null) {
            HMLog.info(e, i.a);
            return;
        }
        AlertDialogFragment.ChoiceItems itemChoice = new AlertDialogFragment.ChoiceItems().setItemChoice(screenOnByTurningWristMode.index());
        DisplayBrightnessViewModel displayBrightnessViewModel2 = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel2);
        new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.ds_interest_screen_display_enabled).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(itemChoice.setItems(displayBrightnessViewModel2.getGesScreenModeList(requireContext(), screenOnByTurningWristMode.getEnums())), new DialogInterface.OnClickListener() { // from class: cf2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                GesScreenFragment.u(screenOnByTurningWristMode, this, dialogInterface, i2);
            }
        }).show(requireActivity().getSupportFragmentManager(), "pickGesScreenModeDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EnumData enumData, GesScreenFragment gesScreenFragment, DialogInterface dialogInterface, int i2) {
        int iIntValue = enumData.getEnums().get(i2).intValue();
        DisplayBrightnessViewModel displayBrightnessViewModel = gesScreenFragment.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        displayBrightnessViewModel.pushScreenOnByTurningWristModeToDevice(new EnumData(iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(final boolean isStart) {
        String string;
        final int i2;
        final int i3;
        DisplayBrightnessViewModel displayBrightnessViewModel = this.displayBrightnessViewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        DisplayAndBrightness value = displayBrightnessViewModel.getDisplayBrightnessSetting().getValue();
        DisplayAndBrightnessV2 displayAndBrightnessV2 = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        if (displayAndBrightnessV2 == null) {
            HMLog.info(e, j.a);
            return;
        }
        Time screenOnByTurningWristBeginTime = displayAndBrightnessV2.getScreenOnByTurningWristBeginTime();
        Time screenOnByTurningWristEndTime = displayAndBrightnessV2.getScreenOnByTurningWristEndTime();
        if (screenOnByTurningWristBeginTime == null) {
            HMLog.info(e, k.a);
            return;
        }
        if (screenOnByTurningWristEndTime == null) {
            HMLog.info(e, l.a);
            return;
        }
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(requireActivity());
        if (isStart) {
            int hour = screenOnByTurningWristBeginTime.getHour();
            int minute = screenOnByTurningWristBeginTime.getMinute();
            string = getResources().getString(R.string.avoid_disturb_on_time);
            i3 = hour;
            i2 = minute;
        } else {
            int hour2 = screenOnByTurningWristEndTime.getHour();
            int minute2 = screenOnByTurningWristEndTime.getMinute();
            string = getResources().getString(R.string.avoid_disturb_off_time);
            i2 = minute2;
            i3 = hour2;
        }
        hMTimeChooseView.setInitialTime(i3, i2);
        final Time time = new Time(0, 0);
        final Time time2 = new Time(0, 0);
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: kf2
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i4, int i5) {
                GesScreenFragment.w(isStart, time, time2, i4, i5);
            }
        });
        new AlertDialogFragment.Builder(requireActivity()).setTitle(string).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: ef2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                GesScreenFragment.x(isStart, time, i3, i2, time2, this, dialogInterface, i4);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(true).show(requireActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(boolean z, Time time, Time time2, int i2, int i3) {
        if (z) {
            time.setHour(i2);
            time.setMinute(i3);
        } else {
            time2.setHour(i2);
            time2.setMinute(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    public static final void x(boolean z, Time time, int i2, int i3, Time time2, GesScreenFragment gesScreenFragment, DialogInterface dialogInterface, int i4) {
        boolean z2 = true;
        if (z) {
            int minutes = WatchSettingExtsKt.toMinutes(time);
            if (minutes == -1) {
                return;
            }
            if (minutes == (i2 * 60) + i3) {
                z2 = false;
            }
        } else {
            int minutes2 = WatchSettingExtsKt.toMinutes(time2);
            if (minutes2 == -1) {
                return;
            }
            if (minutes2 == (i2 * 60) + i3) {
                z2 = false;
            }
        }
        if (z2) {
            DisplayBrightnessViewModel displayBrightnessViewModel = gesScreenFragment.displayBrightnessViewModel;
            Objects.requireNonNull(displayBrightnessViewModel);
            if (!z) {
                time = time2;
            }
            displayBrightnessViewModel.pushScreenOnByTurningWristBeginOrEndTime(z, time);
        }
    }

    private final void y(boolean enable, DisplayAndBrightnessV2 displayAndBrightness) {
        EnumData screenOnByTurningWristMode;
        if (displayAndBrightness == null) {
            DisplayBrightnessViewModel displayBrightnessViewModel = this.displayBrightnessViewModel;
            Objects.requireNonNull(displayBrightnessViewModel);
            DisplayAndBrightness value = displayBrightnessViewModel.getDisplayBrightnessSetting().getValue();
            displayAndBrightness = value instanceof DisplayAndBrightnessV2 ? (DisplayAndBrightnessV2) value : null;
        }
        Integer numValueOf = (displayAndBrightness == null || (screenOnByTurningWristMode = displayAndBrightness.getScreenOnByTurningWristMode()) == null) ? null : Integer.valueOf(screenOnByTurningWristMode.getValue());
        if (numValueOf == null) {
            HMLog.info(e, m.a);
            return;
        }
        if (!enable) {
            View view = getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.ges_screen_item))).setEnabled(false);
            View view2 = getView();
            ((ListTile) (view2 == null ? null : view2.findViewById(R.id.sensitivity_item))).setEnabled(false);
            View view3 = getView();
            ((ListTile) (view3 == null ? null : view3.findViewById(R.id.start_time_item))).setEnabled(false);
            View view4 = getView();
            ((ListTile) (view4 != null ? view4.findViewById(R.id.end_time_item) : null)).setEnabled(false);
            return;
        }
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.ges_screen_item))).setEnabled(true);
        int iIntValue = numValueOf.intValue();
        if (iIntValue == 0) {
            View view6 = getView();
            ((ListTile) (view6 == null ? null : view6.findViewById(R.id.sensitivity_item))).setEnabled(false);
            View view7 = getView();
            ((ListTile) (view7 == null ? null : view7.findViewById(R.id.start_time_item))).setEnabled(false);
            View view8 = getView();
            ((ListTile) (view8 != null ? view8.findViewById(R.id.end_time_item) : null)).setEnabled(false);
            return;
        }
        if (iIntValue == 1) {
            View view9 = getView();
            ((ListTile) (view9 == null ? null : view9.findViewById(R.id.sensitivity_item))).setEnabled(true);
            View view10 = getView();
            ((ListTile) (view10 == null ? null : view10.findViewById(R.id.start_time_item))).setEnabled(true);
            View view11 = getView();
            ((ListTile) (view11 != null ? view11.findViewById(R.id.end_time_item) : null)).setEnabled(true);
            return;
        }
        if (iIntValue == 2 || iIntValue == 3) {
            View view12 = getView();
            ((ListTile) (view12 == null ? null : view12.findViewById(R.id.sensitivity_item))).setEnabled(true);
            View view13 = getView();
            ((ListTile) (view13 == null ? null : view13.findViewById(R.id.start_time_item))).setEnabled(false);
            View view14 = getView();
            ((ListTile) (view14 != null ? view14.findViewById(R.id.end_time_item) : null)).setEnabled(false);
        }
    }

    public static /* synthetic */ void z(GesScreenFragment gesScreenFragment, boolean z, DisplayAndBrightnessV2 displayAndBrightnessV2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            displayAndBrightnessV2 = null;
        }
        gesScreenFragment.y(z, displayAndBrightnessV2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ges_screen, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initViewModel();
        initView();
        q(this, null, 1, null);
        j();
    }
}
