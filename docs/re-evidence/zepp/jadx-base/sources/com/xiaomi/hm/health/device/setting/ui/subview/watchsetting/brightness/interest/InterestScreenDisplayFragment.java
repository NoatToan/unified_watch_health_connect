package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.mediac.Command;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.ui.dialog.TimeSelectorDialog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.ImageSpanUtil;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import io.netty.util.internal.StringUtil;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 y2\u00020\u0001:\u0001yB\u0007¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002Jg\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u000426\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J&\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010$\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\u0014\u0010(\u001a\u00020\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)J\b\u0010,\u001a\u00020\u0002H\u0016J\u0006\u0010-\u001a\u00020\u0002J \u00101\u001a\u00020\u00022\u0006\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004H\u0004J.\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000406052\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u000102H\u0016J2\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007062\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004J\u000e\u0010=\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010>\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0017J \u0010C\u001a\u00020B2\b\b\u0001\u0010?\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0004R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010'\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0019\u0010]\u001a\u00020X8\u0006@\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010`\u001a\u00020X8\u0006@\u0006¢\u0006\f\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010\\R\u0018\u0010c\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010i\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010nR\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006z"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayFragment;", "Landroidx/fragment/app/Fragment;", "", "m", "", "titleRes", "", "", "items", "choiceIndex", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialog", "which", "onClickListener", "r", "(I[Ljava/lang/String;ILkotlin/jvm/functions/Function2;)V", "u", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;", "enum", "l", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialStyle;", hl.k, "index", z.j, "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "initLifecycles", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "displayAndBrightness", "refreshView", "", "enable", "offOnEnable", "initEvents", "showDescriptionConfirmDialog", "isStart", "defaultHour", "defaultMinutes", "showTimeChooseUI", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "endTime", "beginTime", "", "Lkotlin/Pair;", "getStartEndTime", "startHour", "startMinutes", "endHour", "endMinutes", "getOnOffTime", "getEnableModeString", "getEnableDialString", "strRes", "Lkotlin/Function0;", "clickAction", "Landroid/text/SpannableString;", "getInterestEnableSpan", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "a", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "descriptionDialog", "b", "warningDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "c", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "warningDialogBuilder", "Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/dialog/TimeSelectorDialog;", "timeSelectorDialog", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "getDisplayAndBrightness", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "setDisplayAndBrightness", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "getStart", "()Ljava/util/concurrent/atomic/AtomicInteger;", "start", "g", "getStop", Command.STOP, "h", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialStyle;", "currentDialStyle", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;", "getCurrentEnableMode", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;", "setCurrentEnableMode", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;)V", "currentEnableMode", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "getViewModel", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "setViewModel", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;)V", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class InterestScreenDisplayFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String l = "InterestScreenDisplayFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment descriptionDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment warningDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder warningDialogBuilder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TimeSelectorDialog timeSelectorDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DisplayAndBrightness displayAndBrightness;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger start = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger stop = new AtomicInteger(-1);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private InterestDialStyle currentDialStyle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private InterestEnableMode currentEnableMode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;
    public DisplayBrightnessViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayFragment$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestScreenDisplayFragment;", "newInstance", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestEnableMode;", "enum", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getEnableModeString", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InterestEnableMode.values().length];
                iArr[InterestEnableMode.ALL_DAY.ordinal()] = 1;
                iArr[InterestEnableMode.ENABLE_SCHEDULE.ordinal()] = 2;
                iArr[InterestEnableMode.ENABLE_SMART_ON.ordinal()] = 3;
                iArr[InterestEnableMode.OFF.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getEnableModeString(@NotNull InterestEnableMode interestEnableMode, @NotNull Context context) {
            int i;
            int i2 = WhenMappings.$EnumSwitchMapping$0[interestEnableMode.ordinal()];
            if (i2 == 1) {
                i = R.string.ges_screen_type_all_day;
            } else if (i2 == 2) {
                i = R.string.avoid_enable_time;
            } else if (i2 == 3) {
                i = R.string.avoid_enable_smart;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.ges_screen_type_close;
            }
            return context.getString(i);
        }

        @NotNull
        public final InterestScreenDisplayFragment newInstance() {
            return new InterestScreenDisplayFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InterestEnableMode.values().length];
            iArr[InterestEnableMode.ALL_DAY.ordinal()] = 1;
            iArr[InterestEnableMode.ENABLE_SMART_ON.ordinal()] = 2;
            iArr[InterestEnableMode.OFF.ordinal()] = 3;
            iArr[InterestEnableMode.ENABLE_SCHEDULE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InterestDialStyle.values().length];
            iArr2[InterestDialStyle.FOLLOWDIAL.ordinal()] = 1;
            iArr2[InterestDialStyle.DIGITALDIAL.ordinal()] = 2;
            iArr2[InterestDialStyle.ANALOGDIAL.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "", "which", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0855a extends Lambda implements Function2<DialogInterface, Integer, Unit> {
            public final /* synthetic */ List<InterestEnableMode> a;
            public final /* synthetic */ InterestScreenDisplayFragment b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/DialogInterface;", "dialog", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0856a extends Lambda implements Function2<DialogInterface, Integer, Unit> {
                public final /* synthetic */ InterestScreenDisplayFragment a;
                public final /* synthetic */ EnumData b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0856a(InterestScreenDisplayFragment interestScreenDisplayFragment, EnumData enumData) {
                    super(2);
                    this.a = interestScreenDisplayFragment;
                    this.b = enumData;
                }

                public final void a(@NotNull DialogInterface dialogInterface, int i) {
                    DisplayBrightnessViewModel.pushInterestSetting$default(this.a.getViewModel(), this.b, null, null, null, 14, null);
                    DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(this.a.getViewModel(), true, null, null, null, this.b, null, null, null, null, null, null, null, null, null, null, null, 65518, null);
                    dialogInterface.dismiss();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DialogInterface dialogInterface, Integer num) {
                    a(dialogInterface, num.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0855a(List<? extends InterestEnableMode> list, InterestScreenDisplayFragment interestScreenDisplayFragment) {
                super(2);
                this.a = list;
                this.b = interestScreenDisplayFragment;
            }

            public final void a(@NotNull DialogInterface dialogInterface, int i) {
                InterestEnableMode interestEnableMode = this.a.get(i);
                EnumData enumData = new EnumData(interestEnableMode.ordinal());
                if (interestEnableMode != InterestEnableMode.OFF) {
                    InterestScreenDisplayFragment interestScreenDisplayFragment = this.b;
                    interestScreenDisplayFragment.u(new C0856a(interestScreenDisplayFragment, enumData));
                } else {
                    DisplayBrightnessViewModel.pushInterestSetting$default(this.b.getViewModel(), enumData, null, null, null, 14, null);
                    DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(this.b.getViewModel(), true, null, null, null, enumData, null, null, null, null, null, null, null, null, null, null, null, 65518, null);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(DialogInterface dialogInterface, Integer num) {
                a(dialogInterface, num.intValue());
                return Unit.INSTANCE;
            }
        }

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
            List<InterestEnableMode> interestModeList = InterestScreenDisplayFragment.this.getViewModel().getInterestModeList();
            int choiceIndex = InterestScreenDisplayFragment.this.getViewModel().getChoiceIndex();
            InterestScreenDisplayFragment interestScreenDisplayFragment = InterestScreenDisplayFragment.this;
            interestScreenDisplayFragment.r(R.string.ds_interest_screen_display_enabled, interestScreenDisplayFragment.getViewModel().parseInterestModeDesc(interestModeList), choiceIndex, new C0855a(interestModeList, InterestScreenDisplayFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "", "which", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<DialogInterface, Integer, Unit> {
            public final /* synthetic */ InterestScreenDisplayFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterestScreenDisplayFragment interestScreenDisplayFragment) {
                super(2);
                this.a = interestScreenDisplayFragment;
            }

            public final void a(@NotNull DialogInterface dialogInterface, int i) {
                EnumData enumData = new EnumData(this.a.i(i).ordinal());
                DisplayBrightnessViewModel.pushInterestSetting$default(this.a.getViewModel(), null, null, null, enumData, 7, null);
                DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(this.a.getViewModel(), true, null, null, null, null, null, null, enumData, null, null, null, null, null, null, null, null, 65406, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(DialogInterface dialogInterface, Integer num) {
                a(dialogInterface, num.intValue());
                return Unit.INSTANCE;
            }
        }

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
            InterestScreenDisplayFragment interestScreenDisplayFragment = InterestScreenDisplayFragment.this;
            InterestDialStyle interestDialStyle = interestScreenDisplayFragment.currentDialStyle;
            if (interestDialStyle == null) {
                interestDialStyle = InterestDialStyle.FOLLOWDIAL;
            }
            int iK = interestScreenDisplayFragment.k(interestDialStyle);
            InterestScreenDisplayFragment interestScreenDisplayFragment2 = InterestScreenDisplayFragment.this;
            interestScreenDisplayFragment2.r(R.string.ds_interest_screen_display_dial_style, interestScreenDisplayFragment2.getResources().getStringArray(R.array.ds_interest_dial_style), iK, new a(InterestScreenDisplayFragment.this));
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
            DisplayAndBrightness displayAndBrightness = InterestScreenDisplayFragment.this.getDisplayAndBrightness();
            DisplayAndBrightnessV1 displayAndBrightnessV1 = displayAndBrightness instanceof DisplayAndBrightnessV1 ? (DisplayAndBrightnessV1) displayAndBrightness : null;
            if (displayAndBrightnessV1 == null) {
                return;
            }
            InterestScreenDisplayFragment interestScreenDisplayFragment = InterestScreenDisplayFragment.this;
            List<Pair<Integer, Integer>> startEndTime = interestScreenDisplayFragment.getStartEndTime(displayAndBrightnessV1.getScreenOffDisplayEndTime(), displayAndBrightnessV1.getScreenOffDisplayBeginTime());
            interestScreenDisplayFragment.showTimeChooseUI(true, startEndTime.get(0).getFirst().intValue(), startEndTime.get(0).getSecond().intValue());
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
            DisplayAndBrightness displayAndBrightness = InterestScreenDisplayFragment.this.getDisplayAndBrightness();
            DisplayAndBrightnessV1 displayAndBrightnessV1 = displayAndBrightness instanceof DisplayAndBrightnessV1 ? (DisplayAndBrightnessV1) displayAndBrightness : null;
            if (displayAndBrightnessV1 == null) {
                return;
            }
            InterestScreenDisplayFragment interestScreenDisplayFragment = InterestScreenDisplayFragment.this;
            List<Pair<Integer, Integer>> startEndTime = interestScreenDisplayFragment.getStartEndTime(displayAndBrightnessV1.getScreenOffDisplayEndTime(), displayAndBrightnessV1.getScreenOffDisplayBeginTime());
            interestScreenDisplayFragment.showTimeChooseUI(false, startEndTime.get(1).getFirst().intValue(), startEndTime.get(1).getSecond().intValue());
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
            FragmentKt.findNavController(InterestScreenDisplayFragment.this).popBackStack();
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
            return "refreshView not V1";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
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
            InterestScreenDisplayFragment.this.showDescriptionConfirmDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterestDialStyle i(int index) {
        String str = getResources().getStringArray(R.array.ds_interest_dial_style)[index];
        for (InterestDialStyle interestDialStyle : InterestDialStyle.values()) {
            if (Intrinsics.areEqual(getEnableDialString(interestDialStyle), str)) {
                return interestDialStyle;
            }
        }
        return InterestDialStyle.FOLLOWDIAL;
    }

    private final InterestEnableMode j(int index) {
        String str = getResources().getStringArray(R.array.ds_interest_enable)[index];
        for (InterestEnableMode interestEnableMode : InterestEnableMode.values()) {
            if (Intrinsics.areEqual(getEnableModeString(interestEnableMode), str)) {
                return interestEnableMode;
            }
        }
        return InterestEnableMode.OFF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k(InterestDialStyle interestDialStyle) {
        return ArraysKt___ArraysKt.indexOf(getResources().getStringArray(R.array.ds_interest_dial_style), getEnableDialString(interestDialStyle));
    }

    private final int l(InterestEnableMode interestEnableMode) {
        return ArraysKt___ArraysKt.indexOf(getResources().getStringArray(R.array.ds_interest_enable), getEnableModeString(interestEnableMode));
    }

    private final void m() {
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
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment$initBTStatusFragment$1
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    View view = this.a.getView();
                    if ((view == null ? null : view.findViewById(R.id.mask_view)) != null) {
                        View view2 = this.a.getView();
                        (view2 != null ? view2.findViewById(R.id.mask_view) : null).setVisibility(enable ? 8 : 0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterestScreenDisplayFragment interestScreenDisplayFragment, WatchSettingViewModel watchSettingViewModel, DisplayAndBrightness displayAndBrightness) {
        if (displayAndBrightness == null) {
            return;
        }
        interestScreenDisplayFragment.setDisplayAndBrightness(displayAndBrightness);
        watchSettingViewModel.setDisplayBrightness(displayAndBrightness);
        interestScreenDisplayFragment.refreshView(displayAndBrightness);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(InterestScreenDisplayFragment interestScreenDisplayFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = interestScreenDisplayFragment.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.setSuccess(R.string.save_success);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = interestScreenDisplayFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterestScreenDisplayFragment interestScreenDisplayFragment, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (!bool.booleanValue() || (loadingDialogHelper = interestScreenDisplayFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(@StringRes int titleRes, String[] items, int choiceIndex, final Function2<? super DialogInterface, ? super Integer, Unit> onClickListener) {
        new AlertDialogFragment.Builder(getContext()).setTitle(titleRes).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItemsNew(new AlertDialogFragment.ChoiceItems().setItemChoice(choiceIndex).setItems(items), new DialogInterface.OnClickListener() { // from class: rg4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InterestScreenDisplayFragment.s(onClickListener, dialogInterface, i);
            }
        }).show(getChildFragmentManager(), l);
    }

    public static /* synthetic */ void refreshView$default(InterestScreenDisplayFragment interestScreenDisplayFragment, DisplayAndBrightness displayAndBrightness, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshView");
        }
        if ((i & 1) != 0) {
            displayAndBrightness = null;
        }
        interestScreenDisplayFragment.refreshView(displayAndBrightness);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Function2 function2, DialogInterface dialogInterface, int i) {
        function2.invoke(dialogInterface, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(InterestScreenDisplayFragment interestScreenDisplayFragment, boolean z, View view) {
        int i = interestScreenDisplayFragment.getStart().get();
        int i2 = interestScreenDisplayFragment.getStop().get();
        boolean z2 = true;
        if (z) {
            if (i == -1) {
                return;
            }
            if (i2 != -1 && i >= i2) {
                Toast.makeText(interestScreenDisplayFragment.getContext(), R.string.long_sit_start_gt_stop, 0).show();
                z2 = false;
            }
        } else {
            if (i2 == -1) {
                return;
            }
            if (i != -1 && i2 <= i) {
                Toast.makeText(interestScreenDisplayFragment.getContext(), R.string.long_sit_stop_lt_start, 0).show();
                z2 = false;
            }
        }
        if (z2) {
            Time time = z ? new Time(i / 60, i % 60) : new Time(i2 / 60, i2 % 60);
            if (z) {
                DisplayBrightnessViewModel.pushInterestSetting$default(interestScreenDisplayFragment.getViewModel(), null, time, null, null, 13, null);
                DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(interestScreenDisplayFragment.getViewModel(), true, null, null, null, null, time, null, null, null, null, null, null, null, null, null, null, 65502, null);
            } else {
                DisplayBrightnessViewModel.pushInterestSetting$default(interestScreenDisplayFragment.getViewModel(), null, null, time, null, 11, null);
                DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(interestScreenDisplayFragment.getViewModel(), true, null, null, null, null, null, time, null, null, null, null, null, null, null, null, null, 65470, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(final Function2<? super DialogInterface, ? super Integer, Unit> onClickListener) {
        AlertDialogFragment alertDialogFragment;
        boolean z = false;
        if (this.warningDialog == null || this.warningDialogBuilder == null) {
            AlertDialogFragment.Builder negativeButton = new AlertDialogFragment.Builder(getContext()).setCancelable(false).setMessage(getString(R.string.ds_interest_enable_caveat)).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: tg4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterestScreenDisplayFragment.w(dialogInterface, i);
                }
            });
            this.warningDialogBuilder = negativeButton;
            this.warningDialog = negativeButton == null ? null : negativeButton.create();
        }
        AlertDialogFragment.Builder builder = this.warningDialogBuilder;
        if (builder != null) {
            builder.setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: qg4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterestScreenDisplayFragment.v(onClickListener, dialogInterface, i);
                }
            });
        }
        AlertDialogFragment alertDialogFragment2 = this.warningDialog;
        if (alertDialogFragment2 != null && !alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.warningDialog) == null) {
            return;
        }
        alertDialogFragment.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function2 function2, DialogInterface dialogInterface, int i) {
        function2.invoke(dialogInterface, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final InterestEnableMode getCurrentEnableMode() {
        return this.currentEnableMode;
    }

    @Nullable
    public final DisplayAndBrightness getDisplayAndBrightness() {
        return this.displayAndBrightness;
    }

    @NotNull
    public final String getEnableDialString(@NotNull InterestDialStyle interestDialStyle) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[interestDialStyle.ordinal()];
        if (i2 == 1) {
            i = R.string.dial_style_follow_dial;
        } else if (i2 == 2) {
            i = R.string.dial_style_digital_dial;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.dial_style_analog_dial;
        }
        return getString(i);
    }

    @NotNull
    public final String getEnableModeString(@NotNull InterestEnableMode interestEnableMode) {
        return INSTANCE.getEnableModeString(interestEnableMode, requireContext());
    }

    @NotNull
    public final SpannableString getInterestEnableSpan(@StringRes int strRes, @NotNull Function0<Unit> clickAction) {
        return new ImageSpanUtil(requireContext(), getString(strRes), R.drawable.device_setting_descriptio_smart_on).getSpan(clickAction);
    }

    @NotNull
    public final Pair<String, String> getOnOffTime(int startHour, int startMinutes, int endHour, int endMinutes) {
        int i = (startHour * 60) + startMinutes;
        int i2 = (endHour * 60) + endMinutes;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (i >= i2) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getDeviceXApplication(), i));
        sb2.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getDeviceXApplication(), i2));
        return new Pair<>(sb.toString(), sb2.toString());
    }

    @NotNull
    public final AtomicInteger getStart() {
        return this.start;
    }

    @NotNull
    public List<Pair<Integer, Integer>> getStartEndTime(@Nullable Time endTime, @Nullable Time beginTime) {
        return CollectionsKt__CollectionsKt.mutableListOf(new Pair(Integer.valueOf(beginTime == null ? 8 : beginTime.getHour()), Integer.valueOf(beginTime == null ? 0 : beginTime.getMinute())), new Pair(Integer.valueOf(endTime == null ? 22 : endTime.getHour()), Integer.valueOf(endTime == null ? 0 : endTime.getMinute())));
    }

    @NotNull
    public final AtomicInteger getStop() {
        return this.stop;
    }

    @NotNull
    public final DisplayBrightnessViewModel getViewModel() {
        DisplayBrightnessViewModel displayBrightnessViewModel = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        return displayBrightnessViewModel;
    }

    public void initEvents() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.interest_enable), 0L, new a(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.interest_dial), 0L, new b(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.schedule_start_layout), 0L, new c(), 1, null);
        View view4 = getView();
        ExtKt.smartClick$default(view4 == null ? null : view4.findViewById(R.id.schedule_stop_layout), 0L, new d(), 1, null);
        View view5 = getView();
        ExtKt.smartClick$default(view5 != null ? view5.findViewById(R.id.btn_back) : null, 0L, new e(), 1, null);
    }

    public void initLifecycles() {
        setViewModel((DisplayBrightnessViewModel) new ViewModelProvider(requireActivity()).get(DisplayBrightnessViewModel.class));
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        getViewModel().initJob(HMDeviceType.MILI);
        getViewModel().getDisplayBrightnessSetting().observe(getViewLifecycleOwner(), new Observer() { // from class: xg4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestScreenDisplayFragment.n(this.a, watchSettingViewModel, (DisplayAndBrightness) obj);
            }
        });
        getViewModel().getWritingResult().observe(getViewLifecycleOwner(), new Observer() { // from class: vg4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestScreenDisplayFragment.o(this.a, (Boolean) obj);
            }
        });
        DisplayBrightnessViewModel.querySettings$default(getViewModel(), false, 1, null);
        getViewModel().isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: wg4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                InterestScreenDisplayFragment.p(this.a, (Boolean) obj);
            }
        });
    }

    public final void offOnEnable(boolean enable) {
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.schedule_start_layout))).setEnabled(enable);
        View view2 = getView();
        ((ListTile) (view2 != null ? view2.findViewById(R.id.schedule_stop_layout) : null)).setEnabled(enable);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mLoadingDialogHelper = new LoadingDialogHelper(requireActivity());
        initLifecycles();
        initEvents();
        m();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.interest_screen_display_fragment, container, false);
    }

    public void refreshView(@Nullable DisplayAndBrightness displayAndBrightness) {
        if (!(displayAndBrightness instanceof DisplayAndBrightnessV1)) {
            HMLog.info(l, f.a);
            return;
        }
        InterestDialStyle.Companion companion = InterestDialStyle.INSTANCE;
        DisplayAndBrightnessV1 displayAndBrightnessV1 = (DisplayAndBrightnessV1) displayAndBrightness;
        EnumData screenOffDialPlateType = displayAndBrightnessV1.getScreenOffDialPlateType();
        InterestDialStyle dialMode = companion.parseDialMode(screenOffDialPlateType == null ? 0 : screenOffDialPlateType.getValue());
        this.currentDialStyle = dialMode;
        if (dialMode != null) {
            View view = getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.interest_dial))).setTips(getEnableDialString(dialMode));
        }
        List<Pair<Integer, Integer>> startEndTime = getStartEndTime(displayAndBrightnessV1.getScreenOffDisplayEndTime(), displayAndBrightnessV1.getScreenOffDisplayBeginTime());
        this.start.set((startEndTime.get(0).getFirst().intValue() * 60) + startEndTime.get(0).getSecond().intValue());
        this.stop.set((startEndTime.get(1).getFirst().intValue() * 60) + startEndTime.get(1).getSecond().intValue());
        Pair<String, String> onOffTime = getOnOffTime(startEndTime.get(0).getFirst().intValue(), startEndTime.get(0).getSecond().intValue(), startEndTime.get(1).getFirst().intValue(), startEndTime.get(1).getSecond().intValue());
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.schedule_start_layout))).setTips(onOffTime.getFirst());
        View view3 = getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.schedule_stop_layout))).setTips(onOffTime.getSecond());
        InterestEnableMode.Companion companion2 = InterestEnableMode.INSTANCE;
        EnumData screenOffDisplayMode = displayAndBrightnessV1.getScreenOffDisplayMode();
        InterestEnableMode interestEnableMode = companion2.parseInterestEnableMode(screenOffDisplayMode == null ? 0 : screenOffDisplayMode.getValue());
        this.currentEnableMode = interestEnableMode;
        if (interestEnableMode == null) {
            return;
        }
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.interest_enable))).setTips(getEnableModeString(interestEnableMode));
        View view5 = getView();
        ((ListTile) (view5 == null ? null : view5.findViewById(R.id.interest_enable))).setTitle(getInterestEnableSpan(R.string.ds_interest_screen_display_enabled, new g()));
        View view6 = getView();
        TextView textView = (TextView) ((ListTile) (view6 != null ? view6.findViewById(R.id.interest_enable) : null)).findViewById(R.id.rainbow_tile_title);
        if (textView != null) {
            textView.setHighlightColor(0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[interestEnableMode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            offOnEnable(false);
        } else {
            if (i != 4) {
                return;
            }
            offOnEnable(true);
        }
    }

    public final void setCurrentEnableMode(@Nullable InterestEnableMode interestEnableMode) {
        this.currentEnableMode = interestEnableMode;
    }

    public final void setDisplayAndBrightness(@Nullable DisplayAndBrightness displayAndBrightness) {
        this.displayAndBrightness = displayAndBrightness;
    }

    public final void setViewModel(@NotNull DisplayBrightnessViewModel displayBrightnessViewModel) {
        this.viewModel = displayBrightnessViewModel;
    }

    public final void showDescriptionConfirmDialog() {
        AlertDialogFragment alertDialogFragment;
        boolean z = false;
        if (this.descriptionDialog == null) {
            this.descriptionDialog = new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setMessage(getString(HMDeviceConfig.isWatch(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI)) ? R.string.ds_interest_enable_description : R.string.mili_ds_interest_enable_description)).setNeutralButton(getString(R.string.nfc_lab_known), new DialogInterface.OnClickListener() { // from class: sg4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterestScreenDisplayFragment.q(dialogInterface, i);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.descriptionDialog;
        if (alertDialogFragment2 != null && !alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.descriptionDialog) == null) {
            return;
        }
        alertDialogFragment.show(getChildFragmentManager());
    }

    public final void showTimeChooseUI(final boolean isStart, int defaultHour, int defaultMinutes) {
        TimeSelectorDialog timeSelectorDialog;
        String string = isStart ? getResources().getString(R.string.long_sit_alert_start) : getResources().getString(R.string.long_sit_alert_stop);
        if (this.timeSelectorDialog == null) {
            TimeSelectorDialog timeSelectorDialog2 = new TimeSelectorDialog();
            this.timeSelectorDialog = timeSelectorDialog2;
            timeSelectorDialog2.setCancelable(true);
        }
        TimeSelectorDialog timeSelectorDialog3 = this.timeSelectorDialog;
        if (timeSelectorDialog3 != null) {
            timeSelectorDialog3.setMListener(new TimeSelectorDialog.ITimeChooseListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment.showTimeChooseUI.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment$showTimeChooseUI$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ Integer a;
                    public final /* synthetic */ Integer b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Integer num, Integer num2) {
                        super(0);
                        this.a = num;
                        this.b = num2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "hour:" + this.a + ",minutes:" + this.b;
                    }
                }

                @Override // com.xiaomi.hm.health.device.setting.ui.dialog.TimeSelectorDialog.ITimeChooseListener
                public void onTimeChoose(@Nullable Integer hour, @Nullable Integer minutes) {
                    HMLog.debug(InterestScreenDisplayFragment.l, new a(hour, minutes));
                    if (hour == null && minutes == null) {
                        return;
                    }
                    if (isStart) {
                        this.getStart().set((hour.intValue() * 60) + minutes.intValue());
                    } else {
                        this.getStop().set((hour.intValue() * 60) + minutes.intValue());
                    }
                }
            });
        }
        TimeSelectorDialog timeSelectorDialog4 = this.timeSelectorDialog;
        if (timeSelectorDialog4 != null) {
            timeSelectorDialog4.setSureListener(new View.OnClickListener() { // from class: ug4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterestScreenDisplayFragment.t(this.a, isStart, view);
                }
            });
        }
        TimeSelectorDialog timeSelectorDialog5 = this.timeSelectorDialog;
        if (timeSelectorDialog5 != null) {
            timeSelectorDialog5.setTitle(string);
        }
        if (!this.timeSelectorDialog.isAdded() && !this.timeSelectorDialog.isVisible() && getChildFragmentManager().findFragmentByTag(l) == null && (timeSelectorDialog = this.timeSelectorDialog) != null) {
            timeSelectorDialog.show(getChildFragmentManager(), l);
        }
        TimeSelectorDialog timeSelectorDialog6 = this.timeSelectorDialog;
        if (timeSelectorDialog6 == null) {
            return;
        }
        timeSelectorDialog6.setInitialTime(defaultHour, defaultMinutes);
    }
}
