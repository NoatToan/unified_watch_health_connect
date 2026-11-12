package com.xiaomi.hm.health.device.setting.life.impl;

import com.huami.tools.log.HMLog;
import com.huami.watch.companion.location.Location;
import com.huami.watch.companion.location.LocationListener;
import com.huami.watch.companion.location.LocationManager;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.DeviceGpsHelper;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.GpsInjectImpl$injectToDevice$3", f = "GpsInjectImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class GpsInjectImpl$injectToDevice$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ GpsInjectImpl c;
    public final /* synthetic */ HMBaseDevice d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "绑定启用时收到定位，即将写到设备当中";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/watch/companion/location/Location;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.GpsInjectImpl$injectToDevice$3$result$1", f = "GpsInjectImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Location>, Object> {
        public int a;
        public final /* synthetic */ Channel<Location> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Channel<Location> channel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Location> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<Location> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsInjectImpl$injectToDevice$3(GpsInjectImpl gpsInjectImpl, HMBaseDevice hMBaseDevice, Continuation<? super GpsInjectImpl$injectToDevice$3> continuation) {
        super(2, continuation);
        this.c = gpsInjectImpl;
        this.d = hMBaseDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        GpsInjectImpl$injectToDevice$3 gpsInjectImpl$injectToDevice$3 = new GpsInjectImpl$injectToDevice$3(this.c, this.d, continuation);
        gpsInjectImpl$injectToDevice$3.b = obj;
        return gpsInjectImpl$injectToDevice$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((GpsInjectImpl$injectToDevice$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.b;
            final Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            LocationManager.getManager(this.c.com.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String).requestLocation(LocationManager.SINGLE_SERVICE_SYSTEM, new LocationListener() { // from class: com.xiaomi.hm.health.device.setting.life.impl.GpsInjectImpl$injectToDevice$3.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.life.impl.GpsInjectImpl$injectToDevice$3$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.GpsInjectImpl$injectToDevice$3$1$onLocationReceived$1", f = "GpsInjectImpl.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ Channel<Location> b;
                    public final /* synthetic */ Location c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Channel<Location> channel, Location location, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = channel;
                        this.c = location;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, this.c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Channel<Location> channel = this.b;
                            Location location = this.c;
                            this.a = 1;
                            if (channel.send(location, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.huami.watch.companion.location.LocationListener
                public void onLocationError(int errorCode) {
                }

                @Override // com.huami.watch.companion.location.LocationListener
                public void onLocationReceived(@NotNull Location loc) {
                    e.f(coroutineScope, Dispatchers.getIO(), null, new a(channelChannel$default, loc, null), 2, null);
                }
            });
            b bVar = new b(channelChannel$default, null);
            this.a = 1;
            obj = TimeoutKt.withTimeoutOrNull(30000L, bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Location lastLocation = (Location) obj;
        if (lastLocation == null && (lastLocation = LocationManager.getManager(this.c.com.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String).getLastLocation(LocationManager.SINGLE_SERVICE_SYSTEM)) == null) {
            return Unit.INSTANCE;
        }
        HMLog.info("GpsInjectImpl", a.a);
        MyLocation myLocation = new MyLocation();
        myLocation.setLatitude(lastLocation.getLatitude());
        myLocation.setLongitude(lastLocation.getLongitude());
        if (lastLocation.isHasAltitude()) {
            myLocation.setHasAltitude(true);
            myLocation.setAltitude(lastLocation.getAltitude());
        }
        HMBaseDevice hMBaseDevice = this.d;
        if (hMBaseDevice instanceof HMMiLiProDevice) {
            DeviceGpsHelper.Companion.INSTANCE.sendLocToDevice(myLocation, (HMBaseBleDevice) hMBaseDevice);
        }
        return Unit.INSTANCE;
    }
}
