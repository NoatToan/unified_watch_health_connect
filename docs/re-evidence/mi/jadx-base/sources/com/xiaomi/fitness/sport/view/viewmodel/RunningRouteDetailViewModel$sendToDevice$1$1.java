package com.xiaomi.fitness.sport.view.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import defpackage.c1j;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$sendToDevice$1$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRunningRouteDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$sendToDevice$1$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,266:1\n39#2,6:267\n*S KotlinDebug\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$sendToDevice$1$1\n*L\n165#1:267,6\n*E\n"})
public final class RunningRouteDetailViewModel$sendToDevice$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Integer, Integer, Unit> $action;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ String $fileMd5;
    final /* synthetic */ String $it;
    final /* synthetic */ String $suffix;
    final /* synthetic */ String $trackName;
    int label;
    final /* synthetic */ RunningRouteDetailViewModel this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$sendToDevice$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$sendToDevice$1$1$1", f = "RunningRouteDetailViewModel.kt", i = {0}, l = {162, 164}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nRunningRouteDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$sendToDevice$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends byte[], ? extends Recorder>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $fileMd5;
        final /* synthetic */ String $it;
        final /* synthetic */ String $suffix;
        final /* synthetic */ String $trackName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$sendToDevice$1$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$sendToDevice$1$1$1$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends byte[], ? extends Recorder>>, Object> {
            final /* synthetic */ String $fileMd5;
            final /* synthetic */ String $it;
            final /* synthetic */ String $suffix;
            final /* synthetic */ String $trackName;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07671(String str, String str2, String str3, String str4, Continuation<? super C07671> continuation) {
                super(2, continuation);
                this.$trackName = str;
                this.$it = str2;
                this.$suffix = str3;
                this.$fileMd5 = str4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07671(this.$trackName, this.$it, this.$suffix, this.$fileMd5, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends byte[], ? extends Recorder>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Pair<byte[], Recorder>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                String str = this.$trackName;
                Intrinsics.checkNotNull(str);
                String str2 = this.$it;
                String str3 = this.$suffix;
                String str4 = this.$fileMd5;
                if (str4 == null) {
                    str4 = "";
                }
                return TrackNet.DefaultImpls.getRecorder$default(trackNetManagerKt, str, str2, str3, str4, null, 16, null);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<byte[], Recorder>> continuation) {
                return ((C07671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$trackName = str;
            this.$it = str2;
            this.$suffix = str3;
            this.$fileMd5 = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$trackName, this.$it, this.$suffix, this.$fileMd5, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends byte[], ? extends Recorder>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Pair<byte[], Recorder>>) flowCollector, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
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
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C07671 c07671 = new C07671(this.$trackName, this.$it, this.$suffix, this.$fileMd5, null);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = BuildersKt.withContext(io2, c07671, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(pair, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ToastUtil.showShortToast(c1j.common_data_empty);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Pair<byte[], Recorder>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RunningRouteDetailViewModel$sendToDevice$1$1(String str, String str2, String str3, String str4, RunningRouteDetailViewModel runningRouteDetailViewModel, Bitmap bitmap, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super RunningRouteDetailViewModel$sendToDevice$1$1> continuation) {
        super(2, continuation);
        this.$trackName = str;
        this.$it = str2;
        this.$suffix = str3;
        this.$fileMd5 = str4;
        this.this$0 = runningRouteDetailViewModel;
        this.$bitmap = bitmap;
        this.$action = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunningRouteDetailViewModel$sendToDevice$1$1(this.$trackName, this.$it, this.$suffix, this.$fileMd5, this.this$0, this.$bitmap, this.$action, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = FlowKt.flow(new RunningRouteDetailViewModel$sendToDevice$1$1$invokeSuspend$$inlined$transform$1(FlowKt.flow(new AnonymousClass1(this.$trackName, this.$it, this.$suffix, this.$fileMd5, null)), null, this.this$0, this.$bitmap));
            final RunningRouteDetailViewModel runningRouteDetailViewModel = this.this$0;
            final Function2<Integer, Integer, Unit> function2 = this.$action;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$sendToDevice$1$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Pair<byte[], Recorder>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Pair<byte[], Recorder> pair, Continuation<? super Unit> continuation) {
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                        ToastUtil.showShortToast(c1j.i);
                        return Unit.INSTANCE;
                    }
                    ParserHelper parserHelper = ParserHelper.INSTANCE;
                    Application app = AppUtil.getApp();
                    byte[] first = pair.getFirst();
                    String nameStr = pair.getSecond().getNameStr();
                    if (nameStr == null) {
                        nameStr = "";
                    }
                    File fileWriteByteArrayToDownload = parserHelper.writeByteArrayToDownload(app, first, nameStr);
                    runningRouteDetailViewModel.preInstallTrackFile(pair.getSecond().getMd5Str(), (int) fileWriteByteArrayToDownload.length(), fileWriteByteArrayToDownload, pair.getSecond().getNameStr(), pair.getSecond().getDis(), function2);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunningRouteDetailViewModel$sendToDevice$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
