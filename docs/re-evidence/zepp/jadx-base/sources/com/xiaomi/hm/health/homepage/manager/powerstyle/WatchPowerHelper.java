package com.xiaomi.hm.health.homepage.manager.powerstyle;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.battery.BatteryInfoHelper;
import com.huami.watch.companion.battery.bean.BatteryInfo;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.homepage.manager.powerstyle.WatchPowerHelper;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010\u001aJ)\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0003R\u001e\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR3\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/powerstyle/WatchPowerHelper;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.LEVEL, "", "batteryChangeListener", PointCategory.INIT, "release", "getWatchPower", "Lcom/huami/watch/transport/Transporter;", "kotlin.jvm.PlatformType", "a", "Lcom/huami/watch/transport/Transporter;", "transporter", "b", "Lkotlin/jvm/functions/Function1;", "c", LogUtil.I, "power", "Lcom/huami/watch/transport/Transporter$DataListener;", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/transport/Transporter$DataListener;", "getDataListener$annotations", "()V", "dataListener", "Lcom/huami/watch/transport/Transporter$ChannelListener;", "e", "Lcom/huami/watch/transport/Transporter$ChannelListener;", "channelListener", "<init>", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchPowerHelper {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Function1<? super Integer, Unit> batteryChangeListener;

    @NotNull
    public static final WatchPowerHelper INSTANCE = new WatchPowerHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Transporter transporter = Transporter.get(BraceletApp.getContext(), "com.huami.watch.companion");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static int power = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static Transporter.DataListener dataListener = new Transporter.DataListener() { // from class: rg8
        @Override // com.huami.watch.transport.Transporter.DataListener
        public final void onDataReceived(TransportDataItem transportDataItem) {
            WatchPowerHelper.d(transportDataItem);
        }
    };

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static Transporter.ChannelListener channelListener = new Transporter.ChannelListener() { // from class: qg8
        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public final void onChannelChanged(boolean z) {
            WatchPowerHelper.c(z);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.manager.powerstyle.WatchPowerHelper$dataListener$1$1", f = "WatchPowerHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DataBundle b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.homepage.manager.powerstyle.WatchPowerHelper$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0969a extends Lambda implements Function0<String> {
            public final /* synthetic */ BatteryInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0969a(BatteryInfo batteryInfo) {
                super(0);
                this.a = batteryInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "WATCH batteryInfo:" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataBundle dataBundle, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = dataBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BatteryInfo batteryInfo = BatteryInfoHelper.getBatteryInfo(this.b);
            Function1 function1 = WatchPowerHelper.batteryChangeListener;
            if (function1 != null) {
                function1.invoke(Boxing.boxInt(batteryInfo.getBatteryLevel()));
            }
            WatchPowerHelper watchPowerHelper = WatchPowerHelper.INSTANCE;
            WatchPowerHelper.power = batteryInfo.getBatteryLevel();
            HMLog.info("WatchPowerHelper", new C0969a(batteryInfo));
            return Unit.INSTANCE;
        }
    }

    private WatchPowerHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z) {
        if (z) {
            SyncUtil.syncRequestBattery(transporter, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(TransportDataItem transportDataItem) {
        String action = transportDataItem.getAction();
        DataBundle data = transportDataItem.getData();
        if (Intrinsics.areEqual(CompanionModule.ACTION_SYNC_BATTERY, action)) {
            e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(data, null), 2, null);
        }
    }

    private static /* synthetic */ void e() {
    }

    public final int getWatchPower() {
        if (HMDeviceManager.getInstance().isConnected(HMDeviceType.WATCH)) {
            return power;
        }
        return -1;
    }

    public final void init(@NotNull Function1<? super Integer, Unit> batteryChangeListener2) {
        batteryChangeListener = batteryChangeListener2;
        Transporter transporter2 = transporter;
        transporter2.addDataListener(dataListener);
        transporter2.addChannelListener(channelListener);
    }

    public final void release() {
        batteryChangeListener = null;
        Transporter transporter2 = transporter;
        transporter2.removeChannelListener(channelListener);
        transporter2.removeDataListener(dataListener);
    }
}
