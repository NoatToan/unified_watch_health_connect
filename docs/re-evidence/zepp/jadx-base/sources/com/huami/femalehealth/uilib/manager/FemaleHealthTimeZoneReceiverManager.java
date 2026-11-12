package com.huami.femalehealth.uilib.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.receiver.TimeZoneReceiverKt;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b%\u0010&J0\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022 \u0010\b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R2\u0010\b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR_\u0010$\u001aK\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0014¨\u0006("}, d2 = {"Lcom/huami/femalehealth/uilib/manager/FemaleHealthTimeZoneReceiverManager;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function3;", "Ljava/util/TimeZone;", "", "", "callback", "registerReceiver", "unregisterReceiver", "", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/femalehealth/uilib/manager/FemaleHealthTimeZoneReceiverManager$TimeZoneReceiver;", "b", "Lcom/huami/femalehealth/uilib/manager/FemaleHealthTimeZoneReceiverManager$TimeZoneReceiver;", "RECEIVER_INSTANCE", "c", "Lkotlin/jvm/functions/Function3;", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "e", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "Lkotlin/ParameterName;", "name", "Landroid/content/Intent;", "intent", "bySystem", "f", "receiverCallback", "<init>", "()V", TimeZoneReceiverKt.TAG, "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthTimeZoneReceiverManager implements KoinComponent {

    @NotNull
    public static final FemaleHealthTimeZoneReceiverManager INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TimeZoneReceiverManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final TimeZoneReceiver RECEIVER_INSTANCE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static Function3<? super TimeZone, ? super TimeZone, ? super Boolean, Unit> callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy manager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final SharedPreferencesUtils sp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static Function3<? super Context, ? super Intent, ? super Boolean, Unit> receiverCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016Rm\u0010\u0012\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/femalehealth/uilib/manager/FemaleHealthTimeZoneReceiverManager$TimeZoneReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", "bySystem", "a", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "b", "(Lkotlin/jvm/functions/Function3;)V", "callback", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class TimeZoneReceiver extends BroadcastReceiver {

        @NotNull
        public static final String c = "android.intent.action.TIMEZONE_CHANGED";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Function3<? super Context, ? super Intent, ? super Boolean, Unit> callback;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "timezone onReceive";
            }
        }

        @Nullable
        public final Function3<Context, Intent, Boolean, Unit> a() {
            return this.callback;
        }

        public final void b(@Nullable Function3<? super Context, ? super Intent, ? super Boolean, Unit> function3) {
            this.callback = function3;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual(intent == null ? null : intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
                HMLog.info("xys_TimeZoneReceiverManager", a.a);
                Function3<? super Context, ? super Intent, ? super Boolean, Unit> function3 = this.callback;
                if (function3 == null) {
                    return;
                }
                function3.invoke(context, intent, Boolean.TRUE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "Landroid/content/Intent;", "<anonymous parameter 1>", "", "bySystem", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<Context, Intent, Boolean, Unit> {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public final void a(@Nullable Context context, @Nullable Intent intent, boolean z) {
            String lastTimeZoneId = FemaleHealthTimeZoneReceiverManager.sp.getLastTimeZoneId();
            TimeZone timeZone = lastTimeZoneId == null ? null : TimeZone.getTimeZone(lastTimeZoneId);
            TimeZone timeZone2 = TimeZone.getDefault();
            FemaleHealthTimeZoneReceiverManager.sp.setLastTimeZoneId(timeZone2.getID());
            Function3 function3 = FemaleHealthTimeZoneReceiverManager.callback;
            if (function3 == null) {
                return;
            }
            function3.invoke(timeZone, timeZone2, Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Context context, Intent intent, Boolean bool) {
            a(context, intent, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("初始化时区:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "手动调用时区变换:\n" + ((Object) FemaleHealthTimeZoneReceiverManager.sp.getLastTimeZoneId()) + '\n' + ((Object) this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final FemaleHealthTimeZoneReceiverManager femaleHealthTimeZoneReceiverManager = new FemaleHealthTimeZoneReceiverManager();
        INSTANCE = femaleHealthTimeZoneReceiverManager;
        RECEIVER_INSTANCE = new TimeZoneReceiver();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        manager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MenstruationDataManager>() { // from class: com.huami.femalehealth.uilib.manager.FemaleHealthTimeZoneReceiverManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.femalehealth.logiclib.device.MenstruationDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenstruationDataManager invoke() {
                KoinComponent koinComponent = femaleHealthTimeZoneReceiverManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MenstruationDataManager.class), qualifier, objArr);
            }
        });
        sp = femaleHealthTimeZoneReceiverManager.a().getSp();
        receiverCallback = a.a;
    }

    private FemaleHealthTimeZoneReceiverManager() {
    }

    private final MenstruationDataManager a() {
        return (MenstruationDataManager) manager.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void registerReceiver(@NotNull Context context, @NotNull Function3<? super TimeZone, ? super TimeZone, ? super Boolean, Unit> callback2) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        TimeZoneReceiver timeZoneReceiver = RECEIVER_INSTANCE;
        context.registerReceiver(timeZoneReceiver, intentFilter);
        callback = callback2;
        timeZoneReceiver.b(receiverCallback);
        String id = TimeZone.getDefault().getID();
        SharedPreferencesUtils sharedPreferencesUtils = sp;
        if (sharedPreferencesUtils.getLastTimeZoneId() == null) {
            HMLog.info("xys_TimeZoneReceiverManager", new b(id));
            sharedPreferencesUtils.setLastTimeZoneId(id);
        }
        if (Intrinsics.areEqual(sharedPreferencesUtils.getLastTimeZoneId(), id)) {
            return;
        }
        HMLog.info("xys_TimeZoneReceiverManager", new c(id));
        receiverCallback.invoke(context, new Intent("android.intent.action.TIMEZONE_CHANGED"), Boolean.FALSE);
    }

    public final void unregisterReceiver(@NotNull Context context) {
        TimeZoneReceiver timeZoneReceiver = RECEIVER_INSTANCE;
        context.unregisterReceiver(timeZoneReceiver);
        timeZoneReceiver.b(null);
        callback = null;
    }
}
