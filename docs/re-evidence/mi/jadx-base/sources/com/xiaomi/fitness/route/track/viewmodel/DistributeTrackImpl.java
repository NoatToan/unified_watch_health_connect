package com.xiaomi.fitness.route.track.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.gson.Gson;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fit.fitness.parser.sport.track.parser.WayPointData;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.route.export.track.File;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.track.TrackDataManager;
import com.xiaomi.fitness.route.track.TrackWearReceiver;
import com.xiaomi.fitness.route.track.view.MyTrackLibExtKt;
import com.xiaomi.fitness.route.track.view.RouteResultData;
import com.xiaomi.fitness.route.track.view.UiResultData;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.yxi;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0014J(\u0010\u0016\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u001c\u0010!\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0002\u0010\"J4\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/route/track/viewmodel/DistributeTrackImpl;", "Lcom/xiaomi/fitness/route/track/viewmodel/DistributeTrack;", "<init>", "()V", "downTrackFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "(Lcom/xiaomi/fitness/route/export/track/Route;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchIOThrowable", "", "installPercentage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/route/track/view/UiResultData;", "noInstallCount", "", "parserFile", "Lkotlinx/coroutines/flow/FlowCollector;", "originalRoute", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recorderFile", "distributeToDevice", "Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitDeviceRouteResule", "routeId", "", "(Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchDistributeToDevice", Constants.EXTRA_ERROR_MESSAGE, "distributeComplete", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUI", "installCount", "it", "list", "", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDistributeTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributeTrackImpl.kt\ncom/xiaomi/fitness/route/track/viewmodel/DistributeTrackImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
public final class DistributeTrackImpl implements DistributeTrack {

    @NotNull
    public static final String TAG = "DistributeTrackImpl";

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$distributeComplete$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl", f = "DistributeTrackImpl.kt", i = {0}, l = {SportReportBaseParser.ReportType.exitTime}, m = "distributeComplete", n = {"installPercentage"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DistributeTrackImpl.this.distributeComplete(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$distributeToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl", f = "DistributeTrackImpl.kt", i = {0, 0, 0, 0, 1, 1}, l = {125, 132, 140}, m = "distributeToDevice", n = {"this", "$this$distributeToDevice", "originalRoute", "scope", "$this$distributeToDevice", "installToDevice"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class C29101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C29101(Continuation<? super C29101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DistributeTrackImpl.this.distributeToDevice(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$downTrackFile$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$downTrackFile$2", f = "DistributeTrackImpl.kt", i = {0}, l = {50, 60}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super MyTrackLibraryVM.OriginalRoute>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Route $route;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Route route, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$route = route;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$route, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            String url;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            File mFile = this.$route.getMFile();
            if (mFile == null || (url = mFile.getUrl()) == null) {
                url = "unknown";
            }
            FitnessLogUtils.i(DistributeTrackImpl.TAG, "route url:" + url);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DistributeTrackImpl$downTrackFile$2$byteArray$1 distributeTrackImpl$downTrackFile$2$byteArray$1 = new DistributeTrackImpl$downTrackFile$2$byteArray$1(this.$route, null);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = BuildersKt.withContext(io2, distributeTrackImpl$downTrackFile$2$byteArray$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            byte[] bArr = (byte[]) obj;
            RouteValue routeValue = (RouteValue) new Gson().fromJson(this.$route.getValue(), RouteValue.class);
            Integer numBoxInt = bArr != null ? Boxing.boxInt(bArr.length) : null;
            FitnessLogUtils.i(DistributeTrackImpl.TAG, ">>> 1/5.download file , size : " + numBoxInt + " , route:" + this.$route);
            if (bArr != null) {
                Route route = this.$route;
                Intrinsics.checkNotNull(routeValue);
                MyTrackLibraryVM.OriginalRoute originalRoute = new MyTrackLibraryVM.OriginalRoute(bArr, route, routeValue, null, null, 24, null);
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(originalRoute, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FitnessLogUtils.i(DistributeTrackImpl.TAG, "1/5. file is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super MyTrackLibraryVM.OriginalRoute> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$waitDeviceRouteResule$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$waitDeviceRouteResule$2", f = "DistributeTrackImpl.kt", i = {}, l = {SportSummary.VERSION_103}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDistributeTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributeTrackImpl.kt\ncom/xiaomi/fitness/route/track/viewmodel/DistributeTrackImpl$waitDeviceRouteResule$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,258:1\n314#2,11:259\n*S KotlinDebug\n*F\n+ 1 DistributeTrackImpl.kt\ncom/xiaomi/fitness/route/track/viewmodel/DistributeTrackImpl$waitDeviceRouteResule$2\n*L\n145#1:259,11\n*E\n"})
    public static final class C29112 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $routeId;
        final /* synthetic */ CoroutineScope $scope;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29112(CoroutineScope coroutineScope, String str, Continuation<? super C29112> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$routeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29112(this.$scope, this.$routeId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = this.$scope;
                String str = this.$routeId;
                this.L$0 = coroutineScope;
                this.L$1 = str;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DistributeTrackImpl$waitDeviceRouteResule$2$1$job$1(str, cancellableContinuationImpl, null), 3, null);
                cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$waitDeviceRouteResule$2$1$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        LiveDataBus.INSTANCE.get().with(TrackWearReceiver.ROUTE_RESULE).removeObserver(new Observer() { // from class: com.xiaomi.fitness.route.track.viewmodel.DistributeTrackImpl$waitDeviceRouteResule$2$1$1.1
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                            }
                        });
                        Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                        FitnessLogUtils.i(DistributeTrackImpl.TAG, "job is cancel");
                    }
                });
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C29112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitDeviceRouteResule(String str, CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new C29112(coroutineScope, str, null), continuation);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    public void catchDistributeToDevice(@NotNull MutableLiveData<UiResultData> installPercentage, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(installPercentage, "installPercentage");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        FitnessLogUtils.e(TAG, "catchDistributeToDevice");
        installPercentage.postValue(new UiResultData(0, true, null, errorMsg, 5, null));
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    public void catchIOThrowable(@NotNull MutableLiveData<UiResultData> installPercentage, int noInstallCount) {
        Intrinsics.checkNotNullParameter(installPercentage, "installPercentage");
        FitnessLogUtils.e(TAG, "network error");
        installPercentage.postValue(new UiResultData(0, true, null, AppUtil.getApp().getResources().getQuantityString(yxi.c, noInstallCount, Integer.valueOf(noInstallCount)), 5, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object distributeComplete(@NotNull MutableLiveData<UiResultData> mutableLiveData, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = mutableLiveData;
            anonymousClass1.label = 1;
            if (DelayKt.delay(500L, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableLiveData.postValue(new UiResultData(0, true, null, null, 5, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object distributeToDevice(@NotNull FlowCollector<? super RouteResultData> flowCollector, @NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation) throws Exception {
        C29101 c29101;
        DistributeTrackImpl distributeTrackImpl;
        FlowCollector flowCollector2;
        RouteResultData routeResultData;
        int iIntValue;
        if (continuation instanceof C29101) {
            c29101 = (C29101) continuation;
            int i = c29101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29101.label = i - Integer.MIN_VALUE;
            } else {
                c29101 = new C29101(continuation);
            }
        } else {
            c29101 = new C29101(continuation);
        }
        Object objInstallToDevice = c29101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29101.label;
        if (i2 != 0) {
            if (i2 == 1) {
                coroutineScope = (CoroutineScope) c29101.L$3;
                originalRoute = (MyTrackLibraryVM.OriginalRoute) c29101.L$2;
                flowCollector = (FlowCollector) c29101.L$1;
                distributeTrackImpl = (DistributeTrackImpl) c29101.L$0;
                ResultKt.throwOnFailure(objInstallToDevice);
            } else if (i2 == 2) {
                routeResultData = (RouteResultData) c29101.L$1;
                flowCollector2 = (FlowCollector) c29101.L$0;
                ResultKt.throwOnFailure(objInstallToDevice);
                iIntValue = ((Number) objInstallToDevice).intValue();
                FitnessLogUtils.i(TAG, ">>>>>> device is callback , code: " + iIntValue);
                if (iIntValue != 7) {
                    throw new Exception(routeResultData.getErrorMsg());
                }
                c29101.L$0 = null;
                c29101.L$1 = null;
                c29101.label = 3;
                if (flowCollector2.emit(routeResultData, c29101) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInstallToDevice);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInstallToDevice);
        FitnessLogUtils.i(TAG, ">>> 4/5.install to device");
        Pair<byte[], Recorder> recorderData = originalRoute.getRecorderData();
        if ((recorderData != null ? recorderData.getFirst() : null) == null) {
            throw new Exception("the file is null");
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            throw new Exception("the wear device is disConnected");
        }
        c29101.L$0 = this;
        c29101.L$1 = flowCollector;
        c29101.L$2 = originalRoute;
        c29101.L$3 = coroutineScope;
        c29101.label = 1;
        objInstallToDevice = MyTrackLibExtKt.installToDevice(originalRoute, c29101);
        if (objInstallToDevice == coroutine_suspended) {
            return coroutine_suspended;
        }
        distributeTrackImpl = this;
        RouteResultData routeResultData2 = (RouteResultData) objInstallToDevice;
        if (routeResultData2.getCode() != 0) {
            throw new Exception(routeResultData2.getErrorMsg());
        }
        FitnessLogUtils.i(TAG, ">>>>>> wait device callback , routeId:" + originalRoute.getRoute().getRoute_id());
        String route_id = originalRoute.getRoute().getRoute_id();
        c29101.L$0 = flowCollector;
        c29101.L$1 = routeResultData2;
        c29101.L$2 = null;
        c29101.L$3 = null;
        c29101.label = 2;
        Object objWaitDeviceRouteResule = distributeTrackImpl.waitDeviceRouteResule(route_id, coroutineScope, c29101);
        if (objWaitDeviceRouteResule == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowCollector2 = flowCollector;
        routeResultData = routeResultData2;
        objInstallToDevice = objWaitDeviceRouteResule;
        iIntValue = ((Number) objInstallToDevice).intValue();
        FitnessLogUtils.i(TAG, ">>>>>> device is callback , code: " + iIntValue);
        if (iIntValue != 7) {
            throw new Exception(routeResultData.getErrorMsg());
        }
        c29101.L$0 = null;
        c29101.L$1 = null;
        c29101.label = 3;
        if (flowCollector2.emit(routeResultData, c29101) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object downTrackFile(@NotNull Route route, @NotNull Continuation<? super Flow<MyTrackLibraryVM.OriginalRoute>> continuation) {
        return FlowKt.flow(new AnonymousClass2(route, null));
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object parserFile(@NotNull FlowCollector<? super MyTrackLibraryVM.OriginalRoute> flowCollector, @NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull Continuation<? super Unit> continuation) {
        ParserHelper parserHelper = ParserHelper.INSTANCE;
        byte[] byteArray = originalRoute.getByteArray();
        String suffix = originalRoute.getRouteValue().getSuffix();
        if (suffix == null) {
            suffix = "";
        }
        Triple<? extends List<CommonTrackData>, ? extends List<WayPointData>, Triple<Double, Double, Double>> trackFile$default = ParserHelper.readTrackFile$default(parserHelper, null, byteArray, suffix, 1, null);
        FitnessLogUtils.i(TAG, ">>> 2/5.parser file,size:" + trackFile$default.getFirst().size() + " , route:" + originalRoute.getRoute());
        originalRoute.setParserData(trackFile$default);
        Object objEmit = flowCollector.emit(originalRoute, continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object recorderFile(@NotNull FlowCollector<? super MyTrackLibraryVM.OriginalRoute> flowCollector, @NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull Continuation<? super Unit> continuation) {
        String strSubstring;
        byte[] first;
        String alias = originalRoute.getRouteValue().getAlias();
        Integer numBoxInt = null;
        if (alias != null) {
            String alias2 = originalRoute.getRouteValue().getAlias();
            strSubstring = alias.substring(0, RangesKt___RangesKt.coerceAtMost(20, alias2 != null ? alias2.length() : 0));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
        }
        TrackDataManager trackDataManager = TrackDataManager.INSTANCE;
        Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> parserData = originalRoute.getParserData();
        List<CommonTrackData> first2 = parserData != null ? parserData.getFirst() : null;
        Intrinsics.checkNotNull(first2);
        Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> parserData2 = originalRoute.getParserData();
        List<WayPointData> second = parserData2 != null ? parserData2.getSecond() : null;
        Intrinsics.checkNotNull(second);
        String route_id = originalRoute.getRoute().getRoute_id();
        if (strSubstring == null) {
            strSubstring = "";
        }
        String suffix = originalRoute.getRouteValue().getSuffix();
        String str = suffix == null ? "" : suffix;
        String dis = originalRoute.getRouteValue().getDis();
        Pair<byte[], Recorder> pairRecorder = trackDataManager.recorder(first2, second, route_id, strSubstring, "", str, (384 & 64) != 0 ? null : dis != null ? Boxing.boxDouble(Double.parseDouble(dis)) : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        if (pairRecorder != null && (first = pairRecorder.getFirst()) != null) {
            numBoxInt = Boxing.boxInt(first.length);
        }
        FitnessLogUtils.i(TAG, ">>> 3/5.recorder file , size :" + numBoxInt);
        originalRoute.setRecorderData(pairRecorder);
        Object objEmit = flowCollector.emit(originalRoute, continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    public void updateUI(int installCount, @NotNull RouteResultData it, @NotNull List<Route> list, @NotNull MutableLiveData<UiResultData> installPercentage) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(installPercentage, "installPercentage");
        installPercentage.postValue(new UiResultData(list.isEmpty() ? 0 : (int) ((installCount / list.size()) * 100), false, it.getSuccess() ? it.getRouteId() : "", it.getErrorMsg()));
    }
}
