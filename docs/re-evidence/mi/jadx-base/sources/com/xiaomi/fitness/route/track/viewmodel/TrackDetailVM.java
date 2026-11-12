package com.xiaomi.fitness.route.track.viewmodel;

import android.graphics.Bitmap;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import com.xiaomi.fitness.route.track.model.TrackDetailModel;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.x0j;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!JP\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020%2 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u001d0+JG\u0010-\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010%2 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u001d0+¢\u0006\u0002\u0010/R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR8\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0010j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u000eX\u0086.¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/route/track/viewmodel/TrackDetailVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/route/track/model/TrackDetailModel;", "<init>", "()V", "trackRepository", "Lcom/xiaomi/fitness/route/export/track/TrackNet;", "uploadTime", "", "getUploadTime", "()J", "setUploadTime", "(J)V", "valueMap", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "getValueMap", "()Ljava/util/HashMap;", "setValueMap", "(Ljava/util/HashMap;)V", "Ljava/util/HashMap;", "isUpload", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/route/track/viewmodel/Status;", "()Landroidx/lifecycle/MutableLiveData;", "setUpload", "(Landroidx/lifecycle/MutableLiveData;)V", "uploadTrack", "", "recorder", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "bitmap", "Landroid/graphics/Bitmap;", "installTrack", "id", MediaStoreUtil.MediaInfo.SIZE, "", "file", "Ljava/io/File;", "name", "distance", "action", "Lkotlin/Function3;", "", "doInstallTrack", "segmentLength", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackDetailVM extends BaseViewModel<TrackDetailModel> {

    @NotNull
    public static final String TAG = "TrackDetailVM";
    private long uploadTime;
    public HashMap<String, String> valueMap;

    @NotNull
    private final TrackNet trackRepository = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);

    @NotNull
    private MutableLiveData<Status> isUpload = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$doInstallTrack$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$doInstallTrack$1", f = "TrackDetailVM.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ Integer $segmentLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, File file, Integer num, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$file = file;
            this.$segmentLength = num;
            this.$action = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function3 function3, boolean z, int i, Integer num) {
            function3.invoke(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$id, this.$file, this.$segmentLength, this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackApi trackApiKt = TrackApiKt.getInstance(TrackApi.INSTANCE);
                String str = this.$id;
                File file = this.$file;
                Integer num = this.$segmentLength;
                final Function3<Boolean, Integer, Integer, Unit> function3 = this.$action;
                Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function4 = new Function3() { // from class: com.xiaomi.fitness.route.track.viewmodel.a
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return TrackDetailVM.AnonymousClass1.invokeSuspend$lambda$0(function3, ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue(), (Integer) obj4);
                    }
                };
                this.label = 1;
                obj = trackApiKt.installTrackOnDevice(str, file, num, function4, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$action.invoke(Boxing.boxBoolean(true), Boxing.boxInt(0), Boxing.boxInt(100));
            } else {
                this.$action.invoke(Boxing.boxBoolean(false), Boxing.boxInt(255), Boxing.boxInt(0));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$installTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$installTrack$1", f = "TrackDetailVM.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
        final /* synthetic */ int $distance;
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ String $name;
        final /* synthetic */ int $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29161(String str, int i, File file, String str2, int i2, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super C29161> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$size = i;
            this.$file = file;
            this.$name = str2;
            this.$distance = i2;
            this.$action = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29161(this.$id, this.$size, this.$file, this.$name, this.$distance, this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackApi trackApiKt = TrackApiKt.getInstance(TrackApi.INSTANCE);
                String str = this.$id;
                int i2 = this.$size;
                File file = this.$file;
                String str2 = this.$name;
                int i3 = this.$distance;
                this.label = 1;
                obj = trackApiKt.preInstallTrackOnDevice(str, i2, file, str2, i3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            this.$action.invoke(Boxing.boxBoolean(iIntValue == 0), Boxing.boxInt(iIntValue), Boxing.boxInt(iIntValue));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1", f = "TrackDetailVM.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $fail;
        final /* synthetic */ Recorder $recorder;
        final /* synthetic */ String $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1$1", f = "TrackDetailVM.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nTrackDetailVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackDetailVM.kt\ncom/xiaomi/fitness/route/track/viewmodel/TrackDetailVM$uploadTrack$1$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,162:1\n39#2,6:163\n39#2,6:169\n*S KotlinDebug\n*F\n+ 1 TrackDetailVM.kt\ncom/xiaomi/fitness/route/track/viewmodel/TrackDetailVM$uploadTrack$1$1\n*L\n61#1:163,6\n76#1:169,6\n*E\n"})
        public static final class C07301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ String $fail;
            final /* synthetic */ Recorder $recorder;
            final /* synthetic */ String $success;
            int label;
            final /* synthetic */ TrackDetailVM this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1$1$1", f = "TrackDetailVM.kt", i = {0}, l = {56, 58}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
            public static final class C07311 extends SuspendLambda implements Function2<FlowCollector<? super UploadUrl>, Continuation<? super Unit>, Object> {
                final /* synthetic */ Recorder $recorder;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TrackDetailVM this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07311(TrackDetailVM trackDetailVM, Recorder recorder, Continuation<? super C07311> continuation) {
                    super(2, continuation);
                    this.this$0 = trackDetailVM;
                    this.$recorder = recorder;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07311 c07311 = new C07311(this.this$0, this.$recorder, continuation);
                    c07311.L$0 = obj;
                    return c07311;
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
                    TrackNet trackNet = this.this$0.trackRepository;
                    long uploadTime = this.this$0.getUploadTime();
                    String md5Str = this.$recorder.getMd5Str();
                    this.L$0 = flowCollector;
                    this.label = 1;
                    obj = TrackNet.DefaultImpls.getRunningRouteUploadUrl$default(trackNet, uploadTime, md5Str, 0, this, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    UploadUrl uploadUrl = (UploadUrl) obj;
                    FitnessLogUtils.i(this.this$0.getTAG(), "runningRouteUploadUrl , " + uploadUrl);
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(uploadUrl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FlowCollector<? super UploadUrl> flowCollector, Continuation<? super Unit> continuation) {
                    return ((C07311) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM$uploadTrack$1$1$4, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass4<T> implements FlowCollector {
                final /* synthetic */ Recorder $recorder;
                final /* synthetic */ TrackDetailVM this$0;

                public AnonymousClass4(TrackDetailVM trackDetailVM, Recorder recorder) {
                    this.this$0 = trackDetailVM;
                    this.$recorder = recorder;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((String) obj, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0014  */
                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    TrackDetailVM$uploadTrack$1$1$4$emit$1 trackDetailVM$uploadTrack$1$1$4$emit$1;
                    AnonymousClass4<T> anonymousClass4;
                    if (continuation instanceof TrackDetailVM$uploadTrack$1$1$4$emit$1) {
                        trackDetailVM$uploadTrack$1$1$4$emit$1 = (TrackDetailVM$uploadTrack$1$1$4$emit$1) continuation;
                        int i = trackDetailVM$uploadTrack$1$1$4$emit$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            trackDetailVM$uploadTrack$1$1$4$emit$1.label = i - Integer.MIN_VALUE;
                        } else {
                            trackDetailVM$uploadTrack$1$1$4$emit$1 = new TrackDetailVM$uploadTrack$1$1$4$emit$1(this, continuation);
                        }
                    } else {
                        trackDetailVM$uploadTrack$1$1$4$emit$1 = new TrackDetailVM$uploadTrack$1$1$4$emit$1(this, continuation);
                    }
                    TrackDetailVM$uploadTrack$1$1$4$emit$1 trackDetailVM$uploadTrack$1$1$4$emit$2 = trackDetailVM$uploadTrack$1$1$4$emit$1;
                    Object objUploadUserRoute$default = trackDetailVM$uploadTrack$1$1$4$emit$2.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = trackDetailVM$uploadTrack$1$1$4$emit$2.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(objUploadUserRoute$default);
                        if (str.length() > 0) {
                            TrackDetailVM trackDetailVM = this.this$0;
                            HashMap<String, String> map = new HashMap<>();
                            Recorder recorder = this.$recorder;
                            TrackDetailVM trackDetailVM2 = this.this$0;
                            map.put("alias", recorder.getNameStr());
                            map.put("source", "1");
                            map.put("suffix", recorder.getFileExtension());
                            map.put(StepsInfo.KEY_DISTANCE, String.valueOf(recorder.getDis()));
                            map.put("uploadTime", String.valueOf(trackDetailVM2.getUploadTime()));
                            trackDetailVM.setValueMap(map);
                            TrackNet trackNet = this.this$0.trackRepository;
                            long uploadTime = this.this$0.getUploadTime();
                            String md5Str = this.$recorder.getMd5Str();
                            HashMap<String, String> valueMap = this.this$0.getValueMap();
                            trackDetailVM$uploadTrack$1$1$4$emit$2.L$0 = this;
                            trackDetailVM$uploadTrack$1$1$4$emit$2.label = 1;
                            objUploadUserRoute$default = TrackNet.DefaultImpls.uploadUserRoute$default(trackNet, uploadTime, md5Str, valueMap, null, trackDetailVM$uploadTrack$1$1$4$emit$2, 8, null);
                            if (objUploadUserRoute$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            anonymousClass4 = this;
                        } else {
                            this.this$0.isUpload().postValue(new Status(-100, false));
                            FitnessLogUtils.i(this.this$0.getTAG(), "not upload user route");
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anonymousClass4 = (AnonymousClass4) trackDetailVM$uploadTrack$1$1$4$emit$2.L$0;
                    ResultKt.throwOnFailure(objUploadUserRoute$default);
                    UploadUserRoute uploadUserRoute = (UploadUserRoute) objUploadUserRoute$default;
                    if (uploadUserRoute != null && uploadUserRoute.getSuccess()) {
                        anonymousClass4.this$0.isUpload().postValue(new Status(0, true));
                    }
                    FitnessLogUtils.i(anonymousClass4.this$0.getTAG(), "uploadUserRoute :" + uploadUserRoute);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07301(TrackDetailVM trackDetailVM, Recorder recorder, String str, String str2, Bitmap bitmap, Continuation<? super C07301> continuation) {
                super(2, continuation);
                this.this$0 = trackDetailVM;
                this.$recorder = recorder;
                this.$fail = str;
                this.$success = str2;
                this.$bitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07301(this.this$0, this.$recorder, this.$fail, this.$success, this.$bitmap, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flow = FlowKt.flow(new TrackDetailVM$uploadTrack$1$1$invokeSuspend$$inlined$transform$2(FlowKt.flow(new TrackDetailVM$uploadTrack$1$1$invokeSuspend$$inlined$transform$1(FlowKt.flow(new C07311(this.this$0, this.$recorder, null)), null, this.this$0, this.$recorder, this.$fail)), null, this.this$0, this.$success, this.$fail, this.$bitmap));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$recorder);
                    this.label = 1;
                    if (flow.collect(anonymousClass4, this) == coroutine_suspended) {
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
                return ((C07301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29171(Recorder recorder, String str, String str2, Bitmap bitmap, Continuation<? super C29171> continuation) {
            super(2, continuation);
            this.$recorder = recorder;
            this.$fail = str;
            this.$success = str2;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackDetailVM.this.new C29171(this.$recorder, this.$fail, this.$success, this.$bitmap, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07301 c07301 = new C07301(TrackDetailVM.this, this.$recorder, this.$fail, this.$success, this.$bitmap, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07301, this) == coroutine_suspended) {
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
            return ((C29171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void doInstallTrack(@NotNull String id, @NotNull File file, @Nullable Integer segmentLength, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(id, file, segmentLength, action, null), 3, null);
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final HashMap<String, String> getValueMap() {
        HashMap<String, String> map = this.valueMap;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueMap");
        return null;
    }

    public final void installTrack(@NotNull String id, int size, @NotNull File file, @NotNull String name, int distance, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected()) {
            ToastUtil.showShortToast(x0j.d);
            return;
        }
        if (!file.exists()) {
            action.invoke(Boolean.FALSE, 255, null);
            return;
        }
        Logger.i(getTAG(), "installBleTrack: file = " + file + "; routerSize = " + size + ",md5 = " + id);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C29161(id, size, file, name, distance, action, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Status> isUpload() {
        return this.isUpload;
    }

    public final void setUpload(@NotNull MutableLiveData<Status> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isUpload = mutableLiveData;
    }

    public final void setUploadTime(long j) {
        this.uploadTime = j;
    }

    public final void setValueMap(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.valueMap = map;
    }

    public final void uploadTrack(@Nullable Recorder recorder, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        FitnessLogUtils.i(getTAG(), "uploadTrack");
        if (recorder == null) {
            return;
        }
        this.uploadTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C29171(recorder, "", "success", bitmap, null), 3, null);
    }
}
