package com.xiaomi.fitness.sport.viewmodel;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.c1j;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018JN\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00120\u001fH\u0086@¢\u0006\u0002\u0010 R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR'\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteDetailViewModel;", "Lcom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel;", "<init>", "()V", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "routeInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "getRouteInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getRouteDetailLiveData", "", "routeId", "", "routeType", "readTrackFile", "path", "", "suffix", "sendToDevice", "name", StepsInfo.KEY_DISTANCE, "", "action", "Lkotlin/Function2;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateRouteDetailViewModel extends RouteBaseViewModel {

    @NotNull
    public static final String TAG = "CreateRouteDetailViewModel";

    @NotNull
    private final MutableLiveData<Pair<RouteInfo, RankInfo>> routeInfoLiveData = new MutableLiveData<>();
    public RouteRepository routeRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$getRouteDetailLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$getRouteDetailLiveData$1", f = "CreateRouteDetailViewModel.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $routeId;
        final /* synthetic */ int $routeType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$routeId = i;
            this.$routeType = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteDetailViewModel.this.new AnonymousClass1(this.$routeId, this.$routeType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RouteInfo first;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRepository routeRepository = CreateRouteDetailViewModel.this.getRouteRepository();
                int i2 = this.$routeId;
                int i3 = this.$routeType;
                this.label = 1;
                obj = routeRepository.getRouteDetail(i2, i3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair<RouteInfo, RankInfo> pair = (Pair) obj;
            Logger.i(CreateRouteDetailViewModel.TAG, "getRouteDetailLiveData,routeId:" + this.$routeId + ",routeType:" + this.$routeType + ",result file:" + ((pair == null || (first = pair.getFirst()) == null) ? null : first.getKmlFile()));
            CreateRouteDetailViewModel.this.getRouteInfoLiveData().postValue(pair);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$readTrackFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$readTrackFile$1", f = "CreateRouteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $fileSuffix;
        final /* synthetic */ String $path;
        int label;
        final /* synthetic */ CreateRouteDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30661(String str, String str2, CreateRouteDetailViewModel createRouteDetailViewModel, Continuation<? super C30661> continuation) {
            super(2, continuation);
            this.$path = str;
            this.$fileSuffix = str2;
            this.this$0 = createRouteDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30661(this.$path, this.$fileSuffix, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CommonTrackData> list = (List) ParserHelper.readTrackFile$default(ParserHelper.INSTANCE, this.$path, null, this.$fileSuffix, 2, null).getFirst();
            Logger.i(RunningRouteDetailViewModel.TAG, "getTraceRawData,filePath = " + this.$path + ",trackList size = " + (list != null ? Boxing.boxInt(list.size()) : null));
            this.this$0.getRouteTrackLiveData().postValue(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$sendToDevice$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$sendToDevice$2", f = "CreateRouteDetailViewModel.kt", i = {}, l = {81, 87}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Integer, Integer, Unit> $action;
        final /* synthetic */ Double $dis;
        final /* synthetic */ String $fileMd5;
        final /* synthetic */ String $name;
        final /* synthetic */ String $path;
        final /* synthetic */ String $suffix;
        int label;
        final /* synthetic */ CreateRouteDetailViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$sendToDevice$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$sendToDevice$2$1", f = "CreateRouteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.showShortToast(c1j.i);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$sendToDevice$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel$sendToDevice$2$2", f = "CreateRouteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07762 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C07762(Continuation<? super C07762> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07762(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastUtil.showShortToast(c1j.common_data_empty);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, String str3, String str4, Double d, CreateRouteDetailViewModel createRouteDetailViewModel, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$path = str2;
            this.$suffix = str3;
            this.$fileMd5 = str4;
            this.$dis = d;
            this.this$0 = createRouteDetailViewModel;
            this.$action = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$name, this.$path, this.$suffix, this.$fileMd5, this.$dis, this.this$0, this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
            String str = this.$name;
            String str2 = this.$path;
            String str3 = this.$suffix;
            String str4 = this.$fileMd5;
            Pair<byte[], Recorder> recorder = trackNetManagerKt.getRecorder(str, str2, str3, str4 == null ? "" : str4, this.$dis);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected()) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (recorder == null) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                C07762 c07762 = new C07762(null);
                this.label = 2;
                if (BuildersKt.withContext(main2, c07762, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ParserHelper parserHelper = ParserHelper.INSTANCE;
            Application app = AppUtil.getApp();
            byte[] first = recorder.getFirst();
            String nameStr = recorder.getSecond().getNameStr();
            File fileWriteByteArrayToDownload = parserHelper.writeByteArrayToDownload(app, first, nameStr != null ? nameStr : "");
            this.this$0.preInstallTrackFile(recorder.getSecond().getMd5Str(), (int) fileWriteByteArrayToDownload.length(), fileWriteByteArrayToDownload, recorder.getSecond().getNameStr(), recorder.getSecond().getDis(), this.$action);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void getRouteDetailLiveData(int routeId, int routeType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(routeId, routeType, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Pair<RouteInfo, RankInfo>> getRouteInfoLiveData() {
        return this.routeInfoLiveData;
    }

    @NotNull
    public final RouteRepository getRouteRepository() {
        RouteRepository routeRepository = this.routeRepository;
        if (routeRepository != null) {
            return routeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRepository");
        return null;
    }

    public final void readTrackFile(@NotNull String path, @Nullable String suffix) {
        Intrinsics.checkNotNullParameter(path, "path");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C30661(path, formatSuffix(path, suffix), this, null), 2, null);
    }

    @Nullable
    public final Object sendToDevice(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable Double d, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        if (str2 == null) {
            return Unit.INSTANCE;
        }
        String fileMD5 = MD5Util.getFileMD5(new File(str2));
        FitnessLogUtils.i(TAG, "sendToDevice file md5 = " + fileMD5 + "，path = " + str2 + ",routeName = " + str + ",dis = " + d);
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, str2, str3, fileMD5, d, this, function2, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }
}
