package com.xiaomi.hm.health.device.setting.realtime;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.healthlabel.utils.ext.InputColor;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.network.hmnetwork.httpdns.HMHttpDnsManager;
import com.huami.sync.ADialog;
import com.huami.sync.Config;
import com.huami.sync.HeartRate;
import com.huami.sync.RealTimeTransmission;
import com.huami.sync.RealTimeTransmissionKt;
import com.huami.sync.Spanny;
import com.huami.sync.Step;
import com.huami.sync.TransmissionActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.device.HMMiLiSettingActivity;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.heartrate.HeartRateCenter;
import com.xiaomi.hm.health.thirdbind.ThirdAuthApi;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveTipsActivity;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/setting/realtime/RealTimeTransmissionEntry;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", PointCategory.INIT, "Landroid/app/Activity;", DbUtils.Const.Table.CONTEXT, "open", "Lkotlinx/coroutines/Job;", Command.STOP, "", "isOpen", "checkCanOpenBehaviorTagging", "", GetWatermarkAPI.KEY_NAME_STEPS, "cal", "a", "", Constants.DATA_KEY_HR, "notifyHeartRateReceived", "Lcom/xiaomi/hm/health/device/event/HMDeviceRealtimeStepEvent;", "event", "onEventMainThread", "", "TAG", "Ljava/lang/String;", "HM_OPEN_WEBSITE", "Lcom/xiaomi/hm/health/device/setting/realtime/RealtimeDataHandler;", "b", "Lcom/xiaomi/hm/health/device/setting/realtime/RealtimeDataHandler;", "realtimeDataHandler", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RealTimeTransmissionEntry {

    @NotNull
    public static final RealTimeTransmissionEntry INSTANCE = new RealTimeTransmissionEntry();

    @NotNull
    public static final String TAG = "RealTimeTransmissionEntry";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String HM_OPEN_WEBSITE = "https://dev.huami.com/#/home";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static RealtimeDataHandler realtimeDataHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RealTimeTransmissionEntry 初始化";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "实时数据收到心率：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "实时数据收到步数：step = " + this.a + ", cal = " + this.b;
        }
    }

    private RealTimeTransmissionEntry() {
    }

    private final void a(long steps, long cal) {
        HMLog.info(TAG, new c(steps, cal));
        if (steps > 0 || cal > 0) {
            RealTimeTransmission.INSTANCE.notifyStepReceived(new Step(System.currentTimeMillis(), steps, cal));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.huami.sync.ADialog] */
    @JvmStatic
    public static final boolean checkCanOpenBehaviorTagging(@NotNull final Activity context) {
        if (!isOpen()) {
            return true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? aDialog = new ADialog(context, new Spanny(context.getString(R.string.realtime_need_close_tips, new Object[]{context.getString(R.string.realtime_data_sync)})).findAndSpan(context.getString(R.string.realtime_data_sync), new Spanny.GetSpan() { // from class: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$checkCanOpenBehaviorTagging$msg$1
            @Override // com.huami.sync.Spanny.GetSpan
            @NotNull
            public Object getSpan() {
                final Ref.ObjectRef<ADialog> objectRef2 = objectRef;
                final Activity activity = context;
                return new ClickableSpan() { // from class: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$checkCanOpenBehaviorTagging$msg$1$span$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(@NotNull View widget) {
                        ADialog aDialog2 = objectRef2.element;
                        if (aDialog2 != null) {
                            aDialog2.dismiss();
                        }
                        RealTimeTransmissionEntry.open(activity);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(@NotNull TextPaint ds) {
                        super.updateDrawState(ds);
                        ds.setColor(Color.parseColor(InputColor.BACKGROUND_BLUE_COLOR));
                        ds.setUnderlineText(false);
                    }
                };
            }
        }));
        objectRef.element = aDialog;
        ((ADialog) aDialog).show();
        return false;
    }

    @JvmStatic
    public static final void init(@NotNull Application application) {
        RealTimeTransmissionEntry realTimeTransmissionEntry = INSTANCE;
        HMLog.info(TAG, a.a);
        if (!EventBus.getDefault().isRegistered(realTimeTransmissionEntry)) {
            EventBus.getDefault().register(realTimeTransmissionEntry);
        }
        RealTimeTransmissionKt.realtimeTransmission(application, new Function1<Config, Unit>() { // from class: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry.init.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Integer> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2() {
                    return R.mipmap.ic_launcher;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Integer invoke() {
                    return Integer.valueOf(invoke2());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "Ljava/util/ArrayList;", "Landroid/content/Intent;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<Context, ArrayList<Intent>> {
                public static final b a = new b();

                public b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ArrayList<Intent> invoke(@NotNull Context context) {
                    Intent[] intentArr = new Intent[3];
                    intentArr[0] = Intent.makeRestartActivityTask(new ComponentName(context, MainTabActivity.class.getName()));
                    intentArr[1] = new Intent(context, (Class<?>) HMMiLiSettingActivity.class);
                    TransmissionActivity.Companion companion = TransmissionActivity.INSTANCE;
                    RealtimeDataHandler realtimeDataHandler = RealTimeTransmissionEntry.realtimeDataHandler;
                    int currentHr = realtimeDataHandler == null ? 0 : realtimeDataHandler.getCurrentHr();
                    RealtimeDataHandler realtimeDataHandler2 = RealTimeTransmissionEntry.realtimeDataHandler;
                    int currentSteps = realtimeDataHandler2 == null ? 0 : realtimeDataHandler2.getCurrentSteps();
                    RealtimeDataHandler realtimeDataHandler3 = RealTimeTransmissionEntry.realtimeDataHandler;
                    Intent intent = companion.getIntent(context, currentHr, currentSteps, realtimeDataHandler3 != null ? realtimeDataHandler3.getCurrentCalories() : 0);
                    intent.setAction("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setFlags(270532608);
                    Unit unit = Unit.INSTANCE;
                    intentArr[2] = intent;
                    return CollectionsKt__CollectionsKt.arrayListOf(intentArr);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/Context;", "ctx", "", "isOpen", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Context, Boolean, Unit> {
                public static final c a = new c();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$c$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "实时数据打开设备实时心率监测";
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$c$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public static final b a = new b();

                    public b() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "实时数据关闭设备实时心率监测";
                    }
                }

                public c() {
                    super(2);
                }

                public final void a(@NotNull Context context, boolean z) {
                    if (!z) {
                        HeartRateCenter.INSTANCE.closeRealtimeHr();
                        HMLog.info(RealTimeTransmissionEntry.TAG, b.a);
                        return;
                    }
                    context.startActivity(new Intent(context, (Class<?>) KeepAliveTipsActivity.class));
                    HeartRateCenter.INSTANCE.openRealtimeHr();
                    HMLog.info(RealTimeTransmissionEntry.TAG, a.a);
                    RealTimeTransmissionEntry realTimeTransmissionEntry = RealTimeTransmissionEntry.INSTANCE;
                    RealTimeTransmissionEntry.realtimeDataHandler = new RealtimeDataHandler();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Context context, Boolean bool) {
                    a(context, bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<Unit> {
                public static final d a = new d();

                public d() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RealTimeTransmissionEntry realTimeTransmissionEntry = RealTimeTransmissionEntry.INSTANCE;
                    RealTimeTransmissionEntry.realtimeDataHandler = new RealtimeDataHandler();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry$init$2$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<Unit> {
                public static final e a = new e();

                public e() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    WebHelper.launch(RealTimeTransmissionEntry.HM_OPEN_WEBSITE);
                }
            }

            public final void a(@NotNull final Config config) {
                config.setHost(HMHttpDnsManager.getHttpDnsUrlBySrc(ThirdAuthApi.INSTANCE.getUrl()));
                config.setNotificationIcon(a.a);
                config.setNotificationIntents(b.a);
                config.setOnToggle(c.a);
                config.setOnAutoOpen(d.a);
                config.setOnHmOpenClick(e.a);
                config.setDeviceStateFragment(new Function2<Integer, FragmentManager, Unit>() { // from class: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry.init.2.6
                    {
                        super(2);
                    }

                    public final void a(int i, @NotNull FragmentManager fragmentManager) {
                        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(i, fragmentManager);
                        final Config config2 = config;
                        bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry.init.2.6.1
                            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                            public void onEnableChange(boolean enable) {
                                super.onEnableChange(enable);
                                config2.getOnBLEStateChange().invoke(Boolean.valueOf(enable));
                            }
                        });
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FragmentManager fragmentManager) {
                        a(num.intValue(), fragmentManager);
                        return Unit.INSTANCE;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Config config) {
                a(config);
                return Unit.INSTANCE;
            }
        });
    }

    @JvmStatic
    public static final boolean isOpen() {
        Boolean boolIsOpen = RealTimeTransmission.INSTANCE.isOpen();
        if (boolIsOpen == null) {
            return false;
        }
        return boolIsOpen.booleanValue();
    }

    @JvmStatic
    public static final void open(@NotNull Activity context) {
        RealtimeDataHandler realtimeDataHandler2 = realtimeDataHandler;
        int currentHr = realtimeDataHandler2 == null ? 0 : realtimeDataHandler2.getCurrentHr();
        RealtimeDataHandler realtimeDataHandler3 = realtimeDataHandler;
        int currentSteps = realtimeDataHandler3 == null ? 0 : realtimeDataHandler3.getCurrentSteps();
        RealtimeDataHandler realtimeDataHandler4 = realtimeDataHandler;
        RealTimeTransmission.openTransmissionActivity(context, currentHr, currentSteps, realtimeDataHandler4 != null ? realtimeDataHandler4.getCurrentCalories() : 0);
    }

    @JvmStatic
    @Nullable
    public static final Job stop() {
        return RealTimeTransmission.stop$default(null, 1, null);
    }

    public final void notifyHeartRateReceived(int hr) {
        HMLog.info(TAG, new b(hr));
        RealtimeDataHandler realtimeDataHandler2 = realtimeDataHandler;
        if (realtimeDataHandler2 != null) {
            realtimeDataHandler2.setCurrentHr(hr);
        }
        if (hr > 0) {
            RealTimeTransmission.INSTANCE.notifyHeartRateReceived(new HeartRate(System.currentTimeMillis(), hr));
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceRealtimeStepEvent event) {
        if (isOpen()) {
            RealtimeStep realtimeStep = event.getRealtimeStep();
            RealtimeDataHandler realtimeDataHandler2 = realtimeDataHandler;
            Integer numValueOf = realtimeDataHandler2 == null ? null : Integer.valueOf(realtimeDataHandler2.getStepDelta(realtimeStep.getTotalStep()));
            int totalStep = numValueOf == null ? realtimeStep.getTotalStep() : numValueOf.intValue();
            RealtimeDataHandler realtimeDataHandler3 = realtimeDataHandler;
            Integer numValueOf2 = realtimeDataHandler3 != null ? Integer.valueOf(realtimeDataHandler3.getCaloriesDelta(realtimeStep.getTotalCal())) : null;
            int totalCal = numValueOf2 == null ? realtimeStep.getTotalCal() : numValueOf2.intValue();
            RealtimeDataHandler realtimeDataHandler4 = realtimeDataHandler;
            if (realtimeDataHandler4 != null) {
                realtimeDataHandler4.setCurrentSteps(totalStep);
                realtimeDataHandler4.setCurrentCalories(totalCal);
            }
            a(totalStep, totalCal);
        }
    }
}
