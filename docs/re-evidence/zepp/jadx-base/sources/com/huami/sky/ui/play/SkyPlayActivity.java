package com.huami.sky.ui.play;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.statusbar.StatusBarCompat;
import com.huami.mifit.analytics.Analytics;
import com.huami.sky.entry.SkySurveyState;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.lib.entity.AssetInfo;
import com.huami.sky.lib.entity.SkyPromotionExtensions;
import com.huami.sky.lib.entity.SkyPromotionInfo;
import com.huami.sky.service.PlayState;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sky.service.SkySurveyService;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkyReminderEventKt;
import com.huami.sky.ui.analytic.SkyWeekPlanEventKt;
import com.huami.sky.ui.bean.MusicInfo;
import com.huami.sky.ui.databinding.ActivitySkyPlayBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceEditActivity;
import com.huami.sky.ui.navigation.HMAdNavigation;
import com.huami.sky.ui.play.SkyPlayActivity;
import com.huami.sky.ui.play.control.PlaybackManager;
import com.huami.sky.ui.realtime.SkyRealTimeDataActivity;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanEndFragment;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressFragment;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sky.ui.setting.PlaySettingItem;
import com.huami.sky.ui.setting.SkySettingActivity;
import com.huami.sky.ui.utils.Constant;
import com.huami.sky.ui.view.OnConnectFailClickListener;
import com.huami.sky.ui.view.SkyAlertFragment;
import com.huami.sky.ui.view.SkyDeviceStatusFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u0001t\b\u0000\u0018\u0000 z2\u00020\u0001:\u0001zB\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\u001c\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\b\u0010'\u001a\u00020\u0002H\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020\u0002H\u0002J\u0012\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-H\u0014J\u0012\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u000100H\u0014J\b\u00103\u001a\u00020\u0002H\u0014J\b\u00104\u001a\u00020\u0002H\u0014J\b\u00105\u001a\u00020\u0002H\u0014R\u001d\u0010;\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010A\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010F\u001a\b\u0018\u00010BR\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010HR\u0016\u0010V\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010HR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR#\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001c0[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b]\u0010^R\u001d\u0010d\u001a\u00020`8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u00108\u001a\u0004\bb\u0010cR\u001d\u0010i\u001a\u00020e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u00108\u001a\u0004\bg\u0010hR\u001d\u0010n\u001a\u00020j8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u00108\u001a\u0004\bl\u0010mR\u001d\u0010s\u001a\u00020o8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u00108\u001a\u0004\bq\u0010rR\u0016\u0010w\u001a\u00020t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006{"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "H", "x0", "G", "x", "initView", "X", "Lcom/huami/sky/service/PlayState;", "playState", "t0", "state", "u0", "s0", "r0", "p0", "", "y", "y0", "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "deviceStatus", "q0", "L", "v0", "m0", "o0", "P", "", "playAction", "O", "isLike", "N", "", "position", "autoPlay", "Q", "w0", "V", "U", "Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "promotionInfo", "n0", "W", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "onResume", "onPause", "onDestroy", "Lcom/huami/sky/ui/play/SkyPlayViewModel;", "a", "Lkotlin/Lazy;", "C", "()Lcom/huami/sky/ui/play/SkyPlayViewModel;", "skyPlayViewModel", "Lcom/huami/sky/ui/databinding/ActivitySkyPlayBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "z", "()Lcom/huami/sky/ui/databinding/ActivitySkyPlayBinding;", "binding", "Lcom/huami/sky/ui/play/SkyPlayService$SkyPlayBinder;", "Lcom/huami/sky/ui/play/SkyPlayService;", "c", "Lcom/huami/sky/ui/play/SkyPlayService$SkyPlayBinder;", "playService", GoogleApiAvailabilityLight.a, "Z", "isPlayError", "Landroid/view/animation/AlphaAnimation;", "e", "Landroid/view/animation/AlphaAnimation;", "alphaFadeOutAnimation", "f", "alphaFadeInAnimation", "g", "Lcom/huami/sky/service/PlayState;", "playButtonAnimState", "h", "isPauseAnimation", "i", "isAlphaAnimation", "", z.j, "Ljava/lang/String;", "sourceFrom", "", hl.k, "B", "()Ljava/util/List;", "skyBackgroundId", "Lcom/huami/sky/ui/view/SkyDeviceStatusFragment;", "l", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/sky/ui/view/SkyDeviceStatusFragment;", "deviceStatusFragment", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressFragment;", "m", "E", "()Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressFragment;", "weekPlanProgressFragment", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanEndFragment;", GoogleApiAvailabilityLight.b, LogUtil.D, "()Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanEndFragment;", "weekPlanNextFragment", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "o", "F", "()Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "weekPlanViewModel", "com/huami/sky/ui/play/SkyPlayActivity$serviceConnection$1", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/sky/ui/play/SkyPlayActivity$serviceConnection$1;", "serviceConnection", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayActivity extends AppCompatActivity {

    @NotNull
    private static final String A = "type";

    @NotNull
    private static final String B = "0";

    @NotNull
    private static final String C = "1";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String D = "2";
    public static final /* synthetic */ KProperty<Object>[] q;
    private static final float r = 0.3f;

    @NotNull
    private static final String s = "SkyPlayActivity";
    private static final long t = 1000;
    private static final long u = 2000;
    private static final long v = 200;
    private static final int w = 5;
    private static final float x = 16.0f;
    private static final int y = 20;

    @NotNull
    private static final String z = "record_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy skyPlayViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SkyPlayService.SkyPlayBinder playService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isPlayError;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private AlphaAnimation alphaFadeOutAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private AlphaAnimation alphaFadeInAnimation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private PlayState playButtonAnimState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isPauseAnimation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isAlphaAnimation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private String sourceFrom;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy skyBackgroundId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusFragment;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy weekPlanProgressFragment;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy weekPlanNextFragment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy weekPlanViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final SkyPlayActivity$serviceConnection$1 serviceConnection;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/play/SkyPlayActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "from", "", "actionToPlayActivity", "KNOW_AND_JUMP", "Ljava/lang/String;", "KNOW_AND_UPDATE", "", "LOW_DEVICE_POWER", LogUtil.I, "ONLY_KNOW", "RECORD_ID_PARAMS", "RETRY_COUNT", "", "SKY_LIKE_DISABLE_ALPHA", "F", "TAG", "TEXT_SIZE_16", "", "TIME_INTERVAL_1000", "J", "TIME_INTERVAL_2000", "TIME_PERIOD_200", "TYPE_PARAMS", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void actionToPlayActivity(@NotNull Context context, @NotNull String from) {
            Intent intent = new Intent(context, (Class<?>) SkyPlayActivity.class);
            intent.putExtra(Constant.PLAY_FROM_EVENT_KEY, from);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayState.values().length];
            iArr[PlayState.PLAYING.ordinal()] = 1;
            iArr[PlayState.PAUSE.ordinal()] = 2;
            iArr[PlayState.PROGRESSING.ordinal()] = 3;
            iArr[PlayState.PLAY.ordinal()] = 4;
            iArr[PlayState.IDLE.ordinal()] = 5;
            iArr[PlayState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SkyDeviceStatus.values().length];
            iArr2[SkyDeviceStatus.CONNECT_SUCCESS.ordinal()] = 1;
            iArr2[SkyDeviceStatus.CONNECT_FAIL.ordinal()] = 2;
            iArr2[SkyDeviceStatus.CONNECTING.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;
        public final /* synthetic */ SkyPlayService.SkyPlayBinder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, SkyPlayService.SkyPlayBinder skyPlayBinder) {
            super(0);
            this.a = f;
            this.b = skyPlayBinder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "当前播放动画位置：" + this.a + ", " + this.b.isPlaying();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyDeviceStatusFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SkyDeviceStatusFragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SkyDeviceStatusFragment invoke() {
            return new SkyDeviceStatusFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayActivity$initObserve$8", f = "SkyPlayActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ long b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(0);
                this.a = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "连续5分钟任务已完成时间： " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(long j, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = SkyPlayActivity.this.new c(continuation);
            cVar.b = ((Number) obj).longValue();
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
            return a(l.longValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long j = this.b;
            HMLog.info(SkyPlayActivity.s, new a(j));
            if (j > 0) {
                SkyPlayActivity.this.v0();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayState a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PlayState playState) {
            super(0);
            this.a = playState;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放状态改变： " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicInfo a;
        public final /* synthetic */ float b;
        public final /* synthetic */ long c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MusicInfo musicInfo, float f, long j, boolean z) {
            super(0);
            this.a = musicInfo;
            this.b = f;
            this.c = j;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String animUrl = this.a.getAnimUrl();
            float f = this.b;
            long j = this.c;
            return "开始播放动画:" + animUrl + " , " + ((f % j) / j) + ", " + j + ", " + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "入睡通知提醒：接收到通知栏点击传值 " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SkyPlayActivity.this.C().setWeekPlanNeverShowCount(4);
            SkyPlayActivity.this.z().skySevenDayIcon.setVisibility(8);
            SkyPlayActivity.this.z().weekPlanProgress.setVisibility(8);
            SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_NO_C);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<View, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SkyPlayActivity.this.C().openNextWeekPlan();
            SkyPlayActivity.this.z().weekPlanProgress.setVisibility(8);
            SkyPlayActivity.this.z().skySevenDayIcon.setDayNum(1);
            SkyPlayActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.week_plan_progress, SkyPlayActivity.this.E()).commitAllowingStateLoss();
            SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_YES_C);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public final /* synthetic */ SkyPromotionInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SkyPromotionInfo skyPromotionInfo) {
            super(1);
            this.b = skyPromotionInfo;
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkyPlayActivity.this.W(this.b);
            skyAlertFragment.dismissAllowingStateLoss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public final /* synthetic */ AssetInfo a;
        public final /* synthetic */ SkyPlayActivity b;
        public final /* synthetic */ SkyPromotionInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AssetInfo assetInfo, SkyPlayActivity skyPlayActivity, SkyPromotionInfo skyPromotionInfo) {
            super(1);
            this.a = assetInfo;
            this.b = skyPlayActivity;
            this.c = skyPromotionInfo;
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            AssetInfo assetInfo = this.a;
            boolean z = false;
            if (assetInfo != null && assetInfo.getTipType() == 1) {
                z = true;
            }
            if (z) {
                SkyServiceHelperKt.getSkyUpdateManager().updateNow(this.b);
                SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_UPDATE_V, q.mapOf(TuplesKt.to(SkyPlayActivity.z, this.c.getId())));
            } else {
                HMAdNavigation.DefaultImpls.doJumpAction$default(SkyServiceHelperKt.getSkyAdNavigation(), this.b, Integer.valueOf(Integer.parseInt(this.c.getMode())), this.c.getTarget(), SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_DIRECT_V, q.mapOf(TuplesKt.to(SkyPlayActivity.z, this.c.getId())), null, 32, null);
            }
            skyAlertFragment.dismissAllowingStateLoss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<List<Integer>> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<Integer> invoke() {
            return CollectionsKt__CollectionsKt.mutableListOf(Integer.valueOf(R.drawable.sky_star_bk_1), Integer.valueOf(R.drawable.sky_star_bk_2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayState b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(PlayState playState) {
            super(0);
            this.b = playState;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新播放UI：" + SkyPlayActivity.this.playButtonAnimState + ", " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ SkyPlayService.SkyPlayBinder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(SkyPlayService.SkyPlayBinder skyPlayBinder) {
            super(0);
            this.a = skyPlayBinder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "当前正在播放的音乐是否被喜欢: " + this.a.getCurrentMusicLiked();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanEndFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<WeekPlanEndFragment> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeekPlanEndFragment invoke() {
            return WeekPlanEndFragment.INSTANCE.newInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<WeekPlanProgressFragment> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeekPlanProgressFragment invoke() {
            return WeekPlanProgressFragment.INSTANCE.newInstance();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[7];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyPlayActivity.class), "binding", "getBinding()Lcom/huami/sky/ui/databinding/ActivitySkyPlayBinding;"));
        q = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.huami.sky.ui.play.SkyPlayActivity$serviceConnection$1] */
    public SkyPlayActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.play.SkyPlayActivity$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.skyPlayViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlayViewModel>() { // from class: com.huami.sky.ui.play.SkyPlayActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.play.SkyPlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlayViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkyPlayViewModel.class), function0, objArr);
            }
        });
        this.binding = ActivityViewBindingsKt.viewBinding(new SkyPlayActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkyPlayBinding.class)));
        this.playButtonAnimState = PlayState.IDLE;
        this.sourceFrom = SkyPlayFromEvent.FROM_OTHER.getFrom();
        this.skyBackgroundId = LazyKt__LazyJVMKt.lazy(k.a);
        this.deviceStatusFragment = LazyKt__LazyJVMKt.lazy(b.a);
        this.weekPlanProgressFragment = LazyKt__LazyJVMKt.lazy(o.a);
        this.weekPlanNextFragment = LazyKt__LazyJVMKt.lazy(n.a);
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.play.SkyPlayActivity$special$$inlined$viewModel$default$3
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.weekPlanViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WeekPlanProgressViewModel>() { // from class: com.huami.sky.ui.play.SkyPlayActivity$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WeekPlanProgressViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(WeekPlanProgressViewModel.class), function1, objArr3);
            }
        });
        this.serviceConnection = new ServiceConnection() { // from class: com.huami.sky.ui.play.SkyPlayActivity$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
                if (service == null) {
                    return;
                }
                SkyPlayActivity skyPlayActivity = this.a;
                skyPlayActivity.playService = (SkyPlayService.SkyPlayBinder) service;
                skyPlayActivity.x0();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName name) {
            }
        };
    }

    private final SkyDeviceStatusFragment A() {
        return (SkyDeviceStatusFragment) this.deviceStatusFragment.getValue();
    }

    private final List<Integer> B() {
        return (List) this.skyBackgroundId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyPlayViewModel C() {
        return (SkyPlayViewModel) this.skyPlayViewModel.getValue();
    }

    private final WeekPlanEndFragment D() {
        return (WeekPlanEndFragment) this.weekPlanNextFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeekPlanProgressFragment E() {
        return (WeekPlanProgressFragment) this.weekPlanProgressFragment.getValue();
    }

    private final WeekPlanProgressViewModel F() {
        return (WeekPlanProgressViewModel) this.weekPlanViewModel.getValue();
    }

    private final void G() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(2000L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setRepeatCount(0);
        Unit unit = Unit.INSTANCE;
        this.alphaFadeOutAnimation = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(2000L);
        alphaAnimation2.setFillAfter(true);
        alphaAnimation2.setRepeatCount(0);
        this.alphaFadeInAnimation = alphaAnimation2;
        AlphaAnimation alphaAnimation3 = this.alphaFadeOutAnimation;
        Objects.requireNonNull(alphaAnimation3);
        alphaAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.sky.ui.play.SkyPlayActivity$initAlphaAnimation$3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation p0) {
                SkyPlayActivity.R(this.a, 0.0f, SkyServiceHelperKt.getSkyService().isPlaying(), 1, null);
                FrameLayout frameLayout = this.a.z().skyPlayLayout;
                AlphaAnimation alphaAnimation4 = this.a.alphaFadeInAnimation;
                Objects.requireNonNull(alphaAnimation4);
                frameLayout.startAnimation(alphaAnimation4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation p0) {
            }
        });
    }

    private final void H() {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new SkyPlayActivity$initObserve$1(this, null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new SkyPlayActivity$initObserve$2(this, null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new SkyPlayActivity$initObserve$3(this, null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SkyPlayActivity$initObserve$4(this, null), 3, null);
        C().getFeatureUpdateTipsLiveData().observe(this, new Observer() { // from class: ux6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkyPlayActivity.I(this.a, (SkyPromotionInfo) obj);
            }
        });
        C().getDeviceStatusLiveData().observe(this, new Observer() { // from class: tx6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkyPlayActivity.J(this.a, (SkyDeviceStatus) obj);
            }
        });
        C().getWeekPlanCloseLiveData().observe(this, new Observer() { // from class: vx6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkyPlayActivity.K(this.a, (Integer) obj);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(C().getPlayPlanDoneFlow(), new c(null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(SkyPlayActivity skyPlayActivity, SkyPromotionInfo skyPromotionInfo) {
        skyPlayActivity.n0(skyPromotionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(SkyPlayActivity skyPlayActivity, SkyDeviceStatus skyDeviceStatus) {
        skyPlayActivity.z().skySevenDayIcon.updateIconColor(skyDeviceStatus != SkyDeviceStatus.CONNECT_SUCCESS);
        skyPlayActivity.q0(skyDeviceStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(SkyPlayActivity skyPlayActivity, Integer num) {
        skyPlayActivity.z().weekPlanProgress.setVisibility(8);
        if (skyPlayActivity.C().weekPlanNeverShow()) {
            skyPlayActivity.z().skySevenDayIcon.setVisibility(8);
        }
        int weekPlanProgress = skyPlayActivity.C().getWeekPlanProgress();
        boolean z2 = false;
        if (weekPlanProgress >= 0 && weekPlanProgress <= 6) {
            z2 = true;
        }
        if (z2) {
            SkyWeekPlanEventKt.recordWeekPlanEvent$default(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_CLOSE_C, "1", null, null, 12, null);
        }
    }

    private final void L() {
        if (!C().shouldShowSevenDayIcon()) {
            z().skySevenDayIcon.setVisibility(8);
            return;
        }
        int weekPlanProgress = C().getWeekPlanProgress();
        z().skySevenDayIcon.updateIconColor(C().getDeviceConnectStatus() != SkyDeviceStatus.CONNECT_SUCCESS);
        v0();
        z().skySevenDayIcon.setVisibility(0);
        if (weekPlanProgress > 6) {
            getSupportFragmentManager().beginTransaction().replace(R.id.week_plan_progress, D()).commitAllowingStateLoss();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.week_plan_progress, E()).commitAllowingStateLoss();
        }
        z().skySevenDayIcon.post(new Runnable() { // from class: yx6
            @Override // java.lang.Runnable
            public final void run() {
                SkyPlayActivity.M(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(SkyPlayActivity skyPlayActivity) {
        float x2 = skyPlayActivity.z().skySevenDayIcon.getX() + (skyPlayActivity.z().skySevenDayIcon.getWidth() / 2);
        skyPlayActivity.F().setXPosition(x2);
        skyPlayActivity.F().setEndXPosition(x2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean isLike) {
        if (isLike) {
            z().skyMusicLike.playAnimation();
        } else {
            z().skyMusicLike.setProgress(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(int playAction) {
        if (playAction != 5) {
            if (playAction != 7) {
                return;
            }
            this.isAlphaAnimation = true;
        } else {
            FrameLayout frameLayout = z().skyPlayLayout;
            AlphaAnimation alphaAnimation = this.alphaFadeOutAnimation;
            Objects.requireNonNull(alphaAnimation);
            frameLayout.startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(PlayState playState) {
        u0(playState);
        s0(playState);
        r0(playState);
        t0(playState);
        HMLog.info(s, new d(playState));
    }

    private final void Q(final float position, final boolean autoPlay) {
        SkyPlayService.SkyPlayBinder skyPlayBinder = this.playService;
        final MusicInfo currentAnimMusic = skyPlayBinder == null ? null : skyPlayBinder.getCurrentAnimMusic();
        if (currentAnimMusic == null) {
            return;
        }
        LottieCompositionFactory.fromUrl(getApplicationContext(), currentAnimMusic.getAnimUrl(), currentAnimMusic.getAnimUrl()).addListener(new LottieListener() { // from class: wx6
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                SkyPlayActivity.S(this.a, autoPlay, position, currentAnimMusic, (LottieComposition) obj);
            }
        }).addFailureListener(new LottieListener() { // from class: xx6
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                SkyPlayActivity.T((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ void R(SkyPlayActivity skyPlayActivity, float f2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        skyPlayActivity.Q(f2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(SkyPlayActivity skyPlayActivity, boolean z2, float f2, MusicInfo musicInfo, LottieComposition lottieComposition) {
        skyPlayActivity.z().skyPlayAnim.setComposition(lottieComposition);
        skyPlayActivity.w0();
        if (z2) {
            skyPlayActivity.z().skyPlayAnim.playAnimation();
        }
        long duration = skyPlayActivity.z().skyPlayAnim.getDuration() / 1000;
        if (f2 > 0.0f) {
            float f3 = duration;
            skyPlayActivity.z().skyPlayAnim.setProgress((f2 % f3) / f3);
        }
        HMLog.info(s, new e(musicInfo, f2, duration, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Throwable th) {
    }

    private final void U() {
        SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYERCOMEFROM_V, this.sourceFrom, null, null, null, 28, null);
    }

    private final void V() {
        String stringExtra = getIntent().getStringExtra(Constant.SKY_REMINDER_KEY);
        HMLog.info(s, new f(stringExtra));
        if (Intrinsics.areEqual(stringExtra, Constant.SKY_REMINDER_VALUE)) {
            SkyPlayEventKt.recordEvent(SkyReminderEventKt.AIMUSIC_SLEEP_PUSH_C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(SkyPromotionInfo promotionInfo) {
        String str;
        SkyPromotionExtensions extensions = promotionInfo.getExtensions();
        AssetInfo assets = extensions == null ? null : extensions.getAssets();
        if (assets != null && assets.getTipType() == 1) {
            str = "2";
        } else {
            str = TextUtils.isEmpty(assets != null ? assets.getButtonText() : null) ? "0" : "1";
        }
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_OK_V, r.mapOf(TuplesKt.to(z, promotionInfo.getId()), TuplesKt.to("type", str)));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void X() {
        z().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: hy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.j0(this.a, view);
            }
        });
        z().skyPlay.setOnClickListener(new View.OnClickListener() { // from class: fy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.k0(this.a, view);
            }
        });
        z().skyMusicLike.setOnClickListener(new View.OnClickListener() { // from class: cy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.l0(this.a, view);
            }
        });
        z().skyMusicSkip.setOnClickListener(new View.OnClickListener() { // from class: rx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.Y(this.a, view);
            }
        });
        z().skyPlayRetry.setOnClickListener(new View.OnClickListener() { // from class: dy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.Z(this.a, view);
            }
        });
        z().skyStop.setOnClickListener(new View.OnClickListener() { // from class: zx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.a0(this.a, view);
            }
        });
        z().skyRealtime.setOnClickListener(new View.OnClickListener() { // from class: sx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.b0(this.a, view);
            }
        });
        z().skySetting.setOnClickListener(new View.OnClickListener() { // from class: ey6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.c0(this.a, view);
            }
        });
        z().skyMusicPreference.setOnClickListener(new View.OnClickListener() { // from class: px6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.d0(this.a, view);
            }
        });
        z().skyDeviceStatusClose.setOnClickListener(new View.OnClickListener() { // from class: ay6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.e0(this.a, view);
            }
        });
        z().skyDeviceNotConnected.skyDeviceClose.setOnClickListener(new View.OnClickListener() { // from class: by6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.f0(this.a, view);
            }
        });
        A().setConnectFailListener(new OnConnectFailClickListener() { // from class: com.huami.sky.ui.play.SkyPlayActivity$setListener$12
            @Override // com.huami.sky.ui.view.OnConnectFailClickListener
            public void onDeviceConnectFailClick() {
                if (this.a.y0()) {
                    this.a.z().weekPlanProgress.setVisibility(8);
                }
                this.a.z().skyDeviceNotConnectedGroup.setVisibility(0);
            }
        });
        z().skySevenDayIcon.setOnClickListener(new View.OnClickListener() { // from class: qx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.g0(this.a, view);
            }
        });
        E().setOnCloseListener(new View.OnClickListener() { // from class: ox6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.h0(this.a, view);
            }
        });
        D().setOnCloseListener(new View.OnClickListener() { // from class: gy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlayActivity.i0(this.a, view);
            }
        });
        D().setOnButtonClickListener(new g(), new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(SkyPlayActivity skyPlayActivity, View view) {
        SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_DISLIKE_C, "1", PlaybackManager.INSTANCE.getInstance().getPlayingMusicId(), null, skyPlayActivity.C().getEventSessionId().getValue(), 8, null);
        skyPlayActivity.z().skyMusicSkip.playAnimation();
        SkyPlayService.SkyPlayBinder skyPlayBinder = skyPlayActivity.playService;
        if (skyPlayBinder == null) {
            return;
        }
        skyPlayBinder.playNextMusic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(SkyPlayActivity skyPlayActivity, View view) {
        SkyPlayService.SkyPlayBinder skyPlayBinder = skyPlayActivity.playService;
        if (skyPlayBinder == null) {
            return;
        }
        skyPlayBinder.playOrPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(SkyPlayActivity skyPlayActivity, View view) {
        PlaySettingItem.INSTANCE.getNavigation().invoke(skyPlayActivity);
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_TIMING_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.startActivity(new Intent(skyPlayActivity, (Class<?>) SkyRealTimeDataActivity.class));
        SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_DATA_C, null, null, null, skyPlayActivity.C().getEventSessionId().getValue(), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.startActivity(new Intent(skyPlayActivity, (Class<?>) SkySettingActivity.class));
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_SETTING_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.startActivity(new Intent(skyPlayActivity, (Class<?>) SkyMusicPreferenceEditActivity.class));
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_MUSICLIKE_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.z().skyDeviceStatusGroup.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.z().skyDeviceNotConnectedGroup.setVisibility(8);
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_NOTICE_CLOSE_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.z().weekPlanProgress.setVisibility(8);
        skyPlayActivity.C().closeWeekPlanTips();
        SkyWeekPlanEventKt.recordWeekPlanEvent$default(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_CLOSE_C, "0", null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.z().weekPlanProgress.setVisibility(8);
        if (skyPlayActivity.C().weekPlanNeverShow()) {
            skyPlayActivity.z().skySevenDayIcon.setVisibility(8);
        }
    }

    private final void initView() {
        ViewGroup.LayoutParams layoutParams = z().skyDeviceStatusLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = StatusBarCompat.getStatusBarHeight(this);
        z().skyDeviceStatusLayout.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = z().skyDeviceTriangle.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginEnd((layoutParams2.getMarginEnd() + (((ViewGroup.MarginLayoutParams) layoutParams2).width / 2)) - (SkyExtKt.getDp(24) / 2));
        z().skyDeviceTriangle.setLayoutParams(layoutParams4);
        if (C().isSupportSkyFeature()) {
            z().skyDeviceStatusLayout.setVisibility(0);
            getSupportFragmentManager().beginTransaction().add(R.id.sky_device_status_layout, A()).commitAllowingStateLoss();
        } else {
            z().skyDeviceStatusLayout.setVisibility(4);
        }
        if (!kotlin.text.m.endsWith$default(Locale.getDefault().getLanguage(), "zh", false, 2, null)) {
            z().skyPlayTitle.setTextSize(16.0f);
        }
        C().loadDeviceStatusTips();
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(SkyPlayActivity skyPlayActivity, View view) {
        skyPlayActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(SkyPlayActivity skyPlayActivity, View view) {
        if (PlaybackManager.INSTANCE.getInstance().isPlaying()) {
            SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_PAUSE_C, "1", null, null, skyPlayActivity.C().getEventSessionId().getValue(), 12, null);
        } else {
            SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_PLAYER_PLAY_C, "1", null, null, null, 28, null);
        }
        SkyPlayService.SkyPlayBinder skyPlayBinder = skyPlayActivity.playService;
        if (skyPlayBinder == null) {
            return;
        }
        skyPlayBinder.playOrPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(SkyPlayActivity skyPlayActivity, View view) {
        SkyPlayService.SkyPlayBinder skyPlayBinder = skyPlayActivity.playService;
        if (skyPlayBinder != null) {
            skyPlayBinder.updateMusicLike();
        }
        PlaybackManager.Companion companion = PlaybackManager.INSTANCE;
        String playingMusicId = companion.getInstance().getPlayingMusicId();
        boolean currentMusicLiked = companion.getInstance().getCurrentMusicLiked();
        if (currentMusicLiked) {
            skyPlayActivity.o0();
        }
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_LIKE_C, "1", playingMusicId, currentMusicLiked ? "0" : "1", skyPlayActivity.C().getEventSessionId().getValue());
    }

    private final void m0() {
        int i2 = WhenMappings.$EnumSwitchMapping$1[C().getDeviceConnectStatus().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                CustomToast.showShort(this, getResources().getString(R.string.sky_7dayplan_icontoast2));
                SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ICON_C, q.mapOf(TuplesKt.to("status", "1")));
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                CustomToast.showShort(this, getResources().getString(R.string.sky_7dayplan_icontoast1));
                SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ICON_C, q.mapOf(TuplesKt.to("status", "2")));
                return;
            }
        }
        if (!y0()) {
            z().weekPlanProgress.setVisibility(0);
            C().showWeekPlanTips(false);
            int weekPlanProgress = C().getWeekPlanProgress();
            if (weekPlanProgress <= 6) {
                SkyWeekPlanEventKt.recordWeekPlanEvent$default(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_V, "0", String.valueOf(weekPlanProgress + 1), null, 8, null);
            } else {
                SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_CLOSE_V);
            }
        }
        if (y()) {
            z().skyDeviceNotConnectedGroup.setVisibility(8);
        }
        SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ICON_C, q.mapOf(TuplesKt.to("status", "0")));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    private final void n0(SkyPromotionInfo promotionInfo) {
        String buttonText;
        String str;
        String text;
        String str2;
        SkyPromotionExtensions extensions = promotionInfo.getExtensions();
        String label = null;
        AssetInfo assets = extensions == null ? null : extensions.getAssets();
        boolean z2 = false;
        if (assets != null && assets.getTipType() == 1) {
            z2 = true;
        }
        if (!z2) {
            if (assets == null || (buttonText = assets.getButtonText()) == null) {
                str = "";
            }
            SkyAlertFragment skyAlertFragment = new SkyAlertFragment();
            if (TextUtils.isEmpty(promotionInfo.getImage()) && assets != null) {
                label = assets.getLabel();
            }
            String str3 = label;
            if (assets == null && (text = assets.getText()) != null) {
                str2 = text;
            } else {
                str2 = "";
            }
            skyAlertFragment.showDialog(this, str3, str2, GravityCompat.START, promotionInfo.getImage(), Integer.valueOf(R.string.sky_reminder_permission_understand), str, new i(promotionInfo), new j(assets, this, promotionInfo));
            C().saveSkyUpdateIndo(promotionInfo);
            SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_V);
        }
        buttonText = getResources().getString(R.string.sky_update_now);
        str = buttonText;
        SkyAlertFragment skyAlertFragment2 = new SkyAlertFragment();
        if (TextUtils.isEmpty(promotionInfo.getImage())) {
            label = assets.getLabel();
        }
        String str4 = label;
        if (assets == null) {
            str2 = "";
        } else {
            str2 = text;
        }
        skyAlertFragment2.showDialog(this, str4, str2, GravityCompat.START, promotionInfo.getImage(), Integer.valueOf(R.string.sky_reminder_permission_understand), str, new i(promotionInfo), new j(assets, this, promotionInfo));
        C().saveSkyUpdateIndo(promotionInfo);
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_UPDATE_POPUP_V);
    }

    private final void o0() {
        IconToast.showHorizontalIconToast(getApplicationContext(), R.drawable.ic_toast_liked_24_s46, getResources().getString(R.string.sky_play_like_tip), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
        if (playState == PlayState.IDLE || playState == PlayState.ERROR) {
            return;
        }
        z().skyDeviceStatusGroup.setVisibility(8);
        if (!C().isSupportSkyFeature()) {
            if (C().deviceStatusTipsShow()) {
                z().skyDeviceStatusTip.setText(getResources().getString(R.string.sky_guide_notAvailable));
                z().skyDeviceStatusGroup.setVisibility(0);
                C().updateDeviceStatusTipsShow();
                SkyPlayEventKt.recordDeviceStatus(SkyPlayEventKt.AIMUSIC_PLAYER_NOTICE_V, "0");
                return;
            }
            return;
        }
        SkyDeviceStatus deviceConnectStatus = C().getDeviceConnectStatus();
        SkyDeviceStatus skyDeviceStatus = SkyDeviceStatus.CONNECT_SUCCESS;
        if (deviceConnectStatus != skyDeviceStatus) {
            if (y0()) {
                return;
            }
            z().skyDeviceNotConnectedGroup.setVisibility(0);
            SkyPlayEventKt.recordDeviceStatus(SkyPlayEventKt.AIMUSIC_PLAYER_NOTICE_V, "1");
            return;
        }
        if (C().getDeviceConnectStatus() != skyDeviceStatus || y() || y0()) {
            return;
        }
        int weekPlanProgress = C().getWeekPlanProgress();
        if (weekPlanProgress <= 6) {
            if (C().shouldShowSevenDaysTip()) {
                z().weekPlanProgress.setVisibility(0);
                C().showWeekPlanTips(true);
                SkyWeekPlanEventKt.recordWeekPlanEvent$default(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_V, "1", String.valueOf(weekPlanProgress + 1), null, 8, null);
                return;
            }
            return;
        }
        if (C().shouldShowNextSevenDaysTip()) {
            z().weekPlanProgress.setVisibility(0);
            C().showWeekPlanTips(true);
            C().clearWeekPlanCloseCount();
            SkyPlayViewModel.setWeekPlanNeverShowCount$default(C(), 0, 1, null);
            SkyPlayEventKt.recordEvent(SkyWeekPlanEventKt.AIMUSIC_PLAYER_HABIT_ASK_CLOSE_V);
        }
    }

    private final void q0(SkyDeviceStatus deviceStatus) {
        PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
        if (playState == PlayState.IDLE || !C().isSupportSkyFeature() || playState == PlayState.ERROR) {
            return;
        }
        if (deviceStatus == SkyDeviceStatus.CONNECT_SUCCESS) {
            z().skyDeviceNotConnectedGroup.setVisibility(8);
        } else {
            if (y0()) {
                return;
            }
            z().skyDeviceNotConnectedGroup.setVisibility(0);
        }
    }

    private final void r0(PlayState playState) {
        if ((playState == PlayState.IDLE || playState == PlayState.PLAY || playState == PlayState.PROGRESSING) ? false : true) {
            z().skyMusicSkip.setAlpha(1.0f);
            z().skyMusicLike.setAlpha(1.0f);
            z().skyMusicSkip.setClickable(true);
            z().skyMusicLike.setClickable(true);
            return;
        }
        z().skyMusicSkip.setAlpha(0.3f);
        z().skyMusicLike.setAlpha(0.3f);
        z().skyMusicSkip.setClickable(false);
        z().skyMusicLike.setClickable(false);
    }

    private final void s0(PlayState playState) {
        ActivitySkyPlayBinding activitySkyPlayBindingZ = z();
        if (playState != PlayState.ERROR) {
            if (this.isPlayError) {
                activitySkyPlayBindingZ.skyNetworkTip.setVisibility(8);
                activitySkyPlayBindingZ.skyPlayRetry.setVisibility(8);
                activitySkyPlayBindingZ.skyPlayLayout.setVisibility(0);
                activitySkyPlayBindingZ.skyPlay.setVisibility(0);
                activitySkyPlayBindingZ.skyMusicSkip.setVisibility(0);
                activitySkyPlayBindingZ.skyMusicLike.setVisibility(0);
                activitySkyPlayBindingZ.skyFuncButtonGroup.setVisibility(0);
                if (C().isSupportSkyFeature()) {
                    activitySkyPlayBindingZ.skyDeviceStatusLayout.setVisibility(0);
                }
                if (C().shouldShowSevenDayIcon()) {
                    activitySkyPlayBindingZ.skySevenDayIcon.setVisibility(0);
                }
                this.isPlayError = false;
                return;
            }
            return;
        }
        this.isPlayError = true;
        activitySkyPlayBindingZ.skyNetworkTip.setVisibility(0);
        activitySkyPlayBindingZ.skyPlayRetry.setVisibility(0);
        activitySkyPlayBindingZ.skyPlayLayout.setVisibility(8);
        activitySkyPlayBindingZ.skyPlayAnim.cancelAnimation();
        activitySkyPlayBindingZ.skyPlay.setVisibility(8);
        activitySkyPlayBindingZ.skyMusicSkip.setVisibility(8);
        activitySkyPlayBindingZ.skyMusicLike.setVisibility(8);
        activitySkyPlayBindingZ.skyFuncButtonGroup.setVisibility(8);
        activitySkyPlayBindingZ.skyDeviceStatusGroup.setVisibility(8);
        activitySkyPlayBindingZ.skyDeviceNotConnectedGroup.setVisibility(8);
        activitySkyPlayBindingZ.skyDeviceStatusLayout.setVisibility(4);
        activitySkyPlayBindingZ.skySevenDayIcon.setVisibility(8);
        activitySkyPlayBindingZ.weekPlanProgress.setVisibility(8);
        activitySkyPlayBindingZ.skyNetworkTip.setText(!NetUtil.INSTANCE.networkInfo().isNetworkConnect() ? getResources().getString(R.string.sky_play_network_disconnect) : getResources().getString(R.string.sky_play_network_error));
    }

    private final void t0(PlayState playState) {
        if (playState == PlayState.PAUSE || playState == PlayState.IDLE || playState == PlayState.ERROR) {
            z().skyPlayLayout.clearAnimation();
            z().skyPlayAnim.pauseAnimation();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[playState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            this.isPauseAnimation = true;
        } else {
            if (this.isAlphaAnimation) {
                FrameLayout frameLayout = z().skyPlayLayout;
                AlphaAnimation alphaAnimation = this.alphaFadeOutAnimation;
                Objects.requireNonNull(alphaAnimation);
                frameLayout.startAnimation(alphaAnimation);
                this.isAlphaAnimation = false;
                return;
            }
            if (!this.isPauseAnimation) {
                x();
            } else {
                z().skyPlayAnim.resumeAnimation();
                this.isPauseAnimation = false;
            }
        }
    }

    private final void u0(PlayState state) {
        PlayState playState;
        HMLog.info(s, new l(state));
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                z().skyPlay.cancelAnimation();
                z().skyPlay.resumeAnimation();
                z().skyPlay.setRepeatCount(0);
                PlayState playState2 = this.playButtonAnimState;
                if (playState2 == PlayState.PROGRESSING || playState2 == PlayState.PLAY) {
                    z().skyPlay.setAnimation("sky_music_loading_play.json");
                    z().skyPlay.playAnimation();
                } else if (playState2 != PlayState.PLAYING) {
                    z().skyPlay.setAnimation("sky_music_pause_play.json");
                    z().skyPlay.playAnimation();
                } else {
                    z().skyPlay.setAnimation("sky_music_pause_play.json");
                    z().skyPlay.setProgress(1.0f);
                }
                break;
            case 2:
            case 5:
            case 6:
                if (this.playButtonAnimState != PlayState.PLAYING) {
                    z().skyPlay.cancelAnimation();
                    z().skyPlay.setAnimation("sky_music_pause_play.json");
                    z().skyPlay.setProgress(0.0f);
                } else {
                    z().skyPlay.cancelAnimation();
                    z().skyPlay.setAnimation("sky_music_play_pause.json");
                    z().skyPlay.playAnimation();
                }
                break;
            case 3:
            case 4:
                if (state == PlayState.PLAY && ((playState = this.playButtonAnimState) == PlayState.PROGRESSING || playState == PlayState.PAUSE)) {
                    return;
                }
                z().skyPlay.setAnimation("sky_music_loading.json");
                z().skyPlay.setRepeatMode(1);
                z().skyPlay.setRepeatCount(-1);
                z().skyPlay.playAnimation();
                break;
        }
        this.playButtonAnimState = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        int weekPlanProgress = C().getWeekPlanProgress();
        if (SkyPlayViewModel.weekPlayDone$default(C(), null, 1, null)) {
            z().skySevenDayIcon.playDone();
            return;
        }
        boolean z2 = false;
        if (weekPlanProgress >= 0 && weekPlanProgress <= 6) {
            z2 = true;
        }
        if (z2) {
            z().skySevenDayIcon.setDayNum(weekPlanProgress + 1);
            return;
        }
        if (weekPlanProgress == -1) {
            z().skySevenDayIcon.setDayNum(1);
            return;
        }
        Date dateWeekPlanEndDate = C().weekPlanEndDate();
        if (dateWeekPlanEndDate == null) {
            return;
        }
        if (C().weekPlayDone(dateWeekPlanEndDate)) {
            z().skySevenDayIcon.playDone();
        } else {
            z().skySevenDayIcon.setDayNum(7);
        }
    }

    private final void w() {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SkyPlayActivity$autoStartPlay$1(this, null), 3, null);
    }

    private final void w0() {
        z().skyPlayBk.setImageResource(((Number) CollectionsKt.random(B(), Random.Default)).intValue());
    }

    private final void x() {
        SkyPlayService.SkyPlayBinder skyPlayBinder = this.playService;
        if (skyPlayBinder == null) {
            return;
        }
        float currentAnimPosition = skyPlayBinder.getCurrentAnimPosition();
        HMLog.info(s, new a(currentAnimPosition, skyPlayBinder));
        if (skyPlayBinder.isPlaying()) {
            R(this, currentAnimPosition, false, 2, null);
        } else {
            Q(currentAnimPosition, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0() {
        SkyPlayService.SkyPlayBinder skyPlayBinder = this.playService;
        if (skyPlayBinder != null) {
            PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
            this.playButtonAnimState = playState;
            u0(playState);
            r0(SkyServiceHelperKt.getSkyService().getPlayState());
            HMLog.info(s, new m(skyPlayBinder));
            if (skyPlayBinder.getCurrentMusicLiked()) {
                z().skyMusicLike.setProgress(1.0f);
            }
            if (playState == PlayState.IDLE) {
                this.isAlphaAnimation = true;
            }
        }
        x();
    }

    private final boolean y() {
        return z().skyDeviceNotConnectedGroup.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0() {
        return z().weekPlanProgress.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivitySkyPlayBinding z() {
        return (ActivitySkyPlayBinding) this.binding.getValue(this, q[1]);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(Constant.PLAY_FROM_EVENT_KEY);
        if (stringExtra == null) {
            stringExtra = SkyPlayFromEvent.FROM_OTHER.getFrom();
        }
        this.sourceFrom = stringExtra;
        setContentView(z().getRoot());
        Intent intent = new Intent(this, (Class<?>) SkyPlayService.class);
        SkyExtKt.startServiceCatch(this, intent);
        bindService(intent, this.serviceConnection, 1);
        initView();
        X();
        H();
        G();
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_PLAYER_V);
        V();
        U();
        C().getFeatureUpdateTips();
        w();
        C().observeDeviceConnectStatus();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.playService = null;
        unbindService(this.serviceConnection);
        SkySurveyService skySurveyService = (SkySurveyService) org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SkySurveyService.class), null, null);
        if (skySurveyService == null) {
            return;
        }
        skySurveyService.notifyState(new SkySurveyState.ExitPlayerPage(this.sourceFrom));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        V();
        U();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        z().skyPlayLayout.clearAnimation();
        if (z().skyPlayAnim.isAnimating()) {
            z().skyPlayAnim.pauseAnimation();
        }
        Analytics.recordPageEnd(SkyPlayEventKt.AIMUSIC_PLAYER_T);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (SkyServiceHelperKt.getSkyService().isPlaying()) {
            z().skyPlayAnim.resumeAnimation();
        }
        Analytics.recordPageStart(SkyPlayEventKt.AIMUSIC_PLAYER_T);
    }
}
