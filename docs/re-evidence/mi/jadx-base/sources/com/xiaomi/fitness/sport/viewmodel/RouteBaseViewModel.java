package com.xiaomi.fitness.sport.viewmodel;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.c1j;
import defpackage.r72;
import java.io.File;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006JB\u0010\u001e\u001a\u001a\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u0080\u0001\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020%2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001a0/H\u0086@¢\u0006\u0002\u00100JL\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020%2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020%2\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u001a0/H\u0007JP\u00108\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00062\u0006\u00109\u001a\u00020%2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020%2 \u0010.\u001a\u001c\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u001a0:JG\u0010<\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00062\u0006\u00104\u001a\u0002052\b\u0010=\u001a\u0004\u0018\u00010%2 \u0010.\u001a\u001c\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u001a0:¢\u0006\u0002\u0010>J\u0012\u0010?\u001a\u00020\u001a2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0006R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "SUFFIX_SUPPORT_ARRAY", "", "", "getSUFFIX_SUPPORT_ARRAY", "()[Ljava/lang/String;", "[Ljava/lang/String;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "routeTrackLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "getRouteTrackLiveData", "()Landroidx/lifecycle/MutableLiveData;", "trackFilePath", "getTrackFilePath", "()Ljava/lang/String;", "setTrackFilePath", "(Ljava/lang/String;)V", "getTraceRawData", "", "kmlFileUrl", "routeName", "suffix", "getTraceRawDataDirectly", "Lkotlin/Pair;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatSuffix", "url", "uploadTrackLibs", "strategyId", "", "filePath", "routeDistance", "bitmap", "Landroid/graphics/Bitmap;", "routeType", "routeStyle", "startPoint", "identify", "action", "Lkotlin/Function2;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preInstallTrackFile", "id", "routerSize", "file", "Ljava/io/File;", "name", "distance", "installTrack", MediaStoreUtil.MediaInfo.SIZE, "Lkotlin/Function3;", "", "doInstallTrack", "segmentLength", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "deleteFiles", "path", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteBaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteBaseViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,340:1\n39#2,6:341\n39#2,6:347\n*S KotlinDebug\n*F\n+ 1 RouteBaseViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel\n*L\n167#1:341,6\n186#1:347,6\n*E\n"})
public class RouteBaseViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "RouteBaseViewModel";

    @NotNull
    private final String[] SUFFIX_SUPPORT_ARRAY = {"gpx", "kml", "tcx"};

    @NotNull
    private final Random random = new SecureRandom();

    @NotNull
    private final MutableLiveData<List<CommonTrackData>> routeTrackLiveData = new MutableLiveData<>();

    @Nullable
    private String trackFilePath;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$doInstallTrack$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$doInstallTrack$1", f = "RouteBaseViewModel.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
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
                Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function4 = new Function3() { // from class: com.xiaomi.fitness.sport.viewmodel.a
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return RouteBaseViewModel.AnonymousClass1.invokeSuspend$lambda$0(function3, ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue(), (Integer) obj4);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$getTraceRawData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$getTraceRawData$1", f = "RouteBaseViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $fileSuffix;
        final /* synthetic */ String $kmlFileUrl;
        final /* synthetic */ String $routeName;
        int label;
        final /* synthetic */ RouteBaseViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30831(String str, RouteBaseViewModel routeBaseViewModel, String str2, String str3, Continuation<? super C30831> continuation) {
            super(2, continuation);
            this.$routeName = str;
            this.this$0 = routeBaseViewModel;
            this.$fileSuffix = str2;
            this.$kmlFileUrl = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30831(this.$routeName, this.this$0, this.$fileSuffix, this.$kmlFileUrl, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$routeName + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + System.currentTimeMillis() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.this$0.getRandom().nextInt() + "." + this.$fileSuffix;
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                String str2 = this.$kmlFileUrl;
                this.label = 1;
                obj = fitnessDataExtKt.getTrackRawData(str2, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                RouteBaseViewModel routeBaseViewModel = this.this$0;
                String str3 = this.$fileSuffix;
                routeBaseViewModel.setTrackFilePath((String) pair.getSecond());
                List<CommonTrackData> first = ParserHelper.INSTANCE.readTrackFile((String) pair.getSecond(), (byte[]) pair.getFirst(), str3).getFirst();
                Logger.i(RunningRouteDetailViewModel.TAG, "getTraceRawData,filePath = " + pair.getSecond() + ",trackList size = " + (first != null ? Boxing.boxInt(first.size()) : null));
                routeBaseViewModel.getRouteTrackLiveData().postValue(first);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$getTraceRawDataDirectly$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel", f = "RouteBaseViewModel.kt", i = {0, 0, 0, 0}, l = {84}, m = "getTraceRawDataDirectly", n = {"this", "trackList", "trackRawData", "fileSuffix"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C30841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C30841(Continuation<? super C30841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteBaseViewModel.this.getTraceRawDataDirectly(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$getTraceRawDataDirectly$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$getTraceRawDataDirectly$2", f = "RouteBaseViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $fileSuffix;
        final /* synthetic */ String $kmlFileUrl;
        final /* synthetic */ String $routeName;
        final /* synthetic */ Ref.ObjectRef<Pair<byte[], String>> $trackRawData;
        Object L$0;
        int label;
        final /* synthetic */ RouteBaseViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, RouteBaseViewModel routeBaseViewModel, String str2, Ref.ObjectRef<Pair<byte[], String>> objectRef, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$routeName = str;
            this.this$0 = routeBaseViewModel;
            this.$fileSuffix = str2;
            this.$trackRawData = objectRef;
            this.$kmlFileUrl = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$routeName, this.this$0, this.$fileSuffix, this.$trackRawData, this.$kmlFileUrl, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<Pair<byte[], String>> objectRef;
            T t;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$routeName + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + System.currentTimeMillis() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + this.this$0.getRandom().nextInt() + "." + this.$fileSuffix;
                Ref.ObjectRef<Pair<byte[], String>> objectRef2 = this.$trackRawData;
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                String str2 = this.$kmlFileUrl;
                this.L$0 = objectRef2;
                this.label = 1;
                Object trackRawData = fitnessDataExtKt.getTrackRawData(str2, str, this);
                if (trackRawData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t = trackRawData;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$installTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$installTrack$1", f = "RouteBaseViewModel.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
        final /* synthetic */ int $distance;
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ String $name;
        final /* synthetic */ int $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30851(String str, int i, File file, String str2, int i2, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super C30851> continuation) {
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
            return new C30851(this.$id, this.$size, this.$file, this.$name, this.$distance, this.$action, continuation);
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
            return ((C30851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$2", f = "RouteBaseViewModel.kt", i = {0}, l = {157, 159}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class C30862 extends SuspendLambda implements Function2<FlowCollector<? super UploadUrl>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Integer, Integer, Unit> $action;
        final /* synthetic */ String $fileMd5;
        final /* synthetic */ int $routeType;
        final /* synthetic */ long $uploadTime;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30862(long j, String str, int i, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super C30862> continuation) {
            super(2, continuation);
            this.$uploadTime = j;
            this.$fileMd5 = str;
            this.$routeType = i;
            this.$action = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30862 c30862 = new C30862(this.$uploadTime, this.$fileMd5, this.$routeType, this.$action, continuation);
            c30862.L$0 = obj;
            return c30862;
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
            TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
            long j = this.$uploadTime;
            String str = this.$fileMd5;
            int i2 = this.$routeType;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = trackNetManagerKt.getRunningRouteUploadUrl(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            UploadUrl uploadUrl = (UploadUrl) obj;
            if (uploadUrl != null && uploadUrl.getCode() == 0) {
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(uploadUrl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (uploadUrl == null || uploadUrl.getCode() != -1) {
                this.$action.invoke(Boxing.boxInt(-2), Boxing.boxInt(0));
            } else {
                this.$action.invoke(Boxing.boxInt(-1), Boxing.boxInt(uploadUrl.getStrategyId()));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super UploadUrl> flowCollector, Continuation<? super Unit> continuation) {
            return ((C30862) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel$uploadTrackLibs$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5<T> implements FlowCollector {
        final /* synthetic */ Function2<Integer, Integer, Unit> $action;
        final /* synthetic */ String $fileMd5;
        final /* synthetic */ String $identify;
        final /* synthetic */ String $routeDistance;
        final /* synthetic */ String $routeName;
        final /* synthetic */ Integer $routeStyle;
        final /* synthetic */ String $startPoint;
        final /* synthetic */ int $strategyId;
        final /* synthetic */ String $suffix;
        final /* synthetic */ long $uploadTime;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(long j, String str, int i, Function2<? super Integer, ? super Integer, Unit> function2, String str2, String str3, String str4, String str5, Integer num, String str6) {
            this.$uploadTime = j;
            this.$fileMd5 = str;
            this.$strategyId = i;
            this.$action = function2;
            this.$routeName = str2;
            this.$suffix = str3;
            this.$routeDistance = str4;
            this.$identify = str5;
            this.$routeStyle = num;
            this.$startPoint = str6;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((String) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            RouteBaseViewModel$uploadTrackLibs$5$emit$1 routeBaseViewModel$uploadTrackLibs$5$emit$1;
            AnonymousClass5<T> anonymousClass5;
            if (continuation instanceof RouteBaseViewModel$uploadTrackLibs$5$emit$1) {
                routeBaseViewModel$uploadTrackLibs$5$emit$1 = (RouteBaseViewModel$uploadTrackLibs$5$emit$1) continuation;
                int i = routeBaseViewModel$uploadTrackLibs$5$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    routeBaseViewModel$uploadTrackLibs$5$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    routeBaseViewModel$uploadTrackLibs$5$emit$1 = new RouteBaseViewModel$uploadTrackLibs$5$emit$1(this, continuation);
                }
            } else {
                routeBaseViewModel$uploadTrackLibs$5$emit$1 = new RouteBaseViewModel$uploadTrackLibs$5$emit$1(this, continuation);
            }
            RouteBaseViewModel$uploadTrackLibs$5$emit$1 routeBaseViewModel$uploadTrackLibs$5$emit$2 = routeBaseViewModel$uploadTrackLibs$5$emit$1;
            Object objUploadUserRoute = routeBaseViewModel$uploadTrackLibs$5$emit$2.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = routeBaseViewModel$uploadTrackLibs$5$emit$2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUploadUserRoute);
                if (str.length() > 0) {
                    HashMap<String, String> map = new HashMap<>();
                    String str2 = this.$routeName;
                    String str3 = this.$suffix;
                    String str4 = this.$routeDistance;
                    long j = this.$uploadTime;
                    String str5 = this.$identify;
                    Integer num = this.$routeStyle;
                    String str6 = this.$startPoint;
                    map.put("alias", str2);
                    map.put("source", "4");
                    map.put("suffix", str3);
                    map.put(StepsInfo.KEY_DISTANCE, str4);
                    map.put("uploadTime", String.valueOf(j));
                    if (str5 != null && str5.length() > 0) {
                        map.put("identify", str5);
                    }
                    if (num == null || num.intValue() != -1) {
                        map.put("route_style", String.valueOf(num));
                    }
                    if (str6 != null && str6.length() > 0) {
                        map.put("start_point", str6);
                    }
                    TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                    long j2 = this.$uploadTime;
                    String str7 = this.$fileMd5;
                    Integer numBoxInt = Boxing.boxInt(this.$strategyId);
                    routeBaseViewModel$uploadTrackLibs$5$emit$2.L$0 = this;
                    routeBaseViewModel$uploadTrackLibs$5$emit$2.label = 1;
                    objUploadUserRoute = trackNetManagerKt.uploadUserRoute(j2, str7, map, numBoxInt, routeBaseViewModel$uploadTrackLibs$5$emit$2);
                    if (objUploadUserRoute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anonymousClass5 = this;
                } else {
                    this.$action.invoke(Boxing.boxInt(-100), Boxing.boxInt(0));
                    FitnessLogUtils.i(RouteBaseViewModel.TAG, "not upload user route");
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass5 = (AnonymousClass5) routeBaseViewModel$uploadTrackLibs$5$emit$2.L$0;
            ResultKt.throwOnFailure(objUploadUserRoute);
            UploadUserRoute uploadUserRoute = (UploadUserRoute) objUploadUserRoute;
            FitnessLogUtils.i(RouteBaseViewModel.TAG, "uploadUserRoute :" + uploadUserRoute);
            if (uploadUserRoute == null) {
                anonymousClass5.$action.invoke(Boxing.boxInt(-100), Boxing.boxInt(0));
            } else {
                anonymousClass5.$action.invoke(Boxing.boxInt(0), Boxing.boxInt(anonymousClass5.$strategyId));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void deleteFiles$default(RouteBaseViewModel routeBaseViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteFiles");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        routeBaseViewModel.deleteFiles(str);
    }

    public static /* synthetic */ Object getTraceRawDataDirectly$default(RouteBaseViewModel routeBaseViewModel, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTraceRawDataDirectly");
        }
        if ((i & 4) != 0) {
            str3 = "gpx";
        }
        return routeBaseViewModel.getTraceRawDataDirectly(str, str2, str3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preInstallTrackFile$lambda$5(final Function2 action, RouteBaseViewModel this$0, String id, File file, boolean z, final int i, Integer num) {
        Intrinsics.checkNotNullParameter(action, "$action");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(id, "$id");
        Intrinsics.checkNotNullParameter(file, "$file");
        FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "installTrack: " + z + " " + i + " " + num);
        if (z) {
            action.invoke(1, -1);
            this$0.doInstallTrack(id, file, num, new Function3() { // from class: dyk
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RouteBaseViewModel.preInstallTrackFile$lambda$5$lambda$4(i, action, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
                }
            });
        } else {
            TrackApiKt.getInstance(TrackApi.INSTANCE).showTrackErrorToast(i);
            FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "code : " + i);
            action.invoke(4, -1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preInstallTrackFile$lambda$5$lambda$4(int i, Function2 action, boolean z, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(action, "$action");
        if (z) {
            FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "result2:" + num);
            action.invoke(2, num);
            if (num != null && num.intValue() == 100) {
                ToastUtil.showShortToast(c1j.S3);
                action.invoke(3, -1);
            }
        } else {
            FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "code : " + i);
            action.invoke(3, -1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object uploadTrackLibs$default(RouteBaseViewModel routeBaseViewModel, int i, String str, String str2, String str3, Bitmap bitmap, int i2, Integer num, String str4, String str5, Function2 function2, Continuation continuation, int i3, Object obj) {
        if (obj == null) {
            return routeBaseViewModel.uploadTrackLibs(i, str, str2, str3, bitmap, (i3 & 32) != 0 ? 1 : i2, (i3 & 64) != 0 ? -1 : num, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? null : str5, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadTrackLibs");
    }

    public final void deleteFiles(@Nullable String path) {
        if (path == null) {
            path = r72.o();
        }
        Logger.i(TAG, "remove file path:" + path);
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                Logger.i(TAG, "remove file success:" + FileUtils.INSTANCE.deleteFile(file));
            }
        }
    }

    public final void doInstallTrack(@NotNull String id, @NotNull File file, @Nullable Integer segmentLength, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(id, file, segmentLength, action, null), 3, null);
    }

    @NotNull
    public final String formatSuffix(@NotNull String url, @Nullable String suffix) {
        Intrinsics.checkNotNullParameter(url, "url");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) url, '?', 0, false, 6, (Object) null);
        if (suffix == null || suffix.length() == 0) {
            if (iIndexOf$default == -1) {
                suffix = url.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, '.', 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(suffix, "substring(...)");
            } else {
                String strSubstring = url.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                suffix = strSubstring.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(suffix, "substring(...)");
            }
        }
        return ArraysKt___ArraysKt.contains(this.SUFFIX_SUPPORT_ARRAY, suffix) ? suffix : "gpx";
    }

    @NotNull
    public final Random getRandom() {
        return this.random;
    }

    @NotNull
    public final MutableLiveData<List<CommonTrackData>> getRouteTrackLiveData() {
        return this.routeTrackLiveData;
    }

    @NotNull
    public final String[] getSUFFIX_SUPPORT_ARRAY() {
        return this.SUFFIX_SUPPORT_ARRAY;
    }

    public final void getTraceRawData(@NotNull String kmlFileUrl, @NotNull String routeName, @Nullable String suffix) {
        Intrinsics.checkNotNullParameter(kmlFileUrl, "kmlFileUrl");
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        if (kmlFileUrl.length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C30831(routeName, this, formatSuffix(kmlFileUrl, suffix), kmlFileUrl, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object] */
    @Nullable
    public final Object getTraceRawDataDirectly(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Continuation<? super Pair<? extends List<CommonTrackData>, String>> continuation) {
        C30841 c30841;
        RouteBaseViewModel routeBaseViewModel;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        String str4;
        if (continuation instanceof C30841) {
            c30841 = (C30841) continuation;
            int i = c30841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30841.label = i - Integer.MIN_VALUE;
            } else {
                c30841 = new C30841(continuation);
            }
        } else {
            c30841 = new C30841(continuation);
        }
        C30841 c30842 = c30841;
        Object obj = c30842.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c30842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            if (str.length() == 0) {
                return null;
            }
            String suffix = formatSuffix(str, str3);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(str2, this, suffix, objectRef4, str, null);
            c30842.L$0 = this;
            c30842.L$1 = objectRef3;
            c30842.L$2 = objectRef4;
            c30842.L$3 = suffix;
            c30842.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass2, c30842) == coroutine_suspended) {
                return coroutine_suspended;
            }
            routeBaseViewModel = this;
            objectRef = objectRef3;
            objectRef2 = objectRef4;
            str4 = suffix;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) c30842.L$3;
            objectRef2 = (Ref.ObjectRef) c30842.L$2;
            objectRef = (Ref.ObjectRef) c30842.L$1;
            routeBaseViewModel = (RouteBaseViewModel) c30842.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) objectRef2.element;
        if (pair != null) {
            routeBaseViewModel.trackFilePath = (String) pair.getSecond();
            objectRef.element = ParserHelper.INSTANCE.readTrackFile((String) pair.getSecond(), (byte[]) pair.getFirst(), str4).getFirst();
        }
        Logger.i(RunningRouteDetailViewModel.TAG, "getTraceRawDataDirectly, trackList = " + objectRef.element + ", trackRawData = " + objectRef2.element);
        T t = objectRef.element;
        Pair pair2 = (Pair) objectRef2.element;
        return new Pair(t, pair2 != null ? (String) pair2.getSecond() : null);
    }

    @Nullable
    public final String getTrackFilePath() {
        return this.trackFilePath;
    }

    public final void installTrack(@NotNull String id, int size, @NotNull File file, @NotNull String name, int distance, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(c1j.i);
            return;
        }
        if (!file.exists()) {
            action.invoke(Boolean.FALSE, 255, null);
            return;
        }
        Logger.i(RunningRouteDetailViewModel.TAG, "installBleTrack: file = " + file + "; routerSize = " + size);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30851(id, size, file, name, distance, action, null), 3, null);
    }

    @SuppressLint({"SetTextI18n"})
    public final void preInstallTrackFile(@NotNull final String id, int routerSize, @NotNull final File file, @NotNull String name, int distance, @NotNull final Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(action, "action");
        installTrack(id, routerSize, file, name, distance, new Function3() { // from class: cyk
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteBaseViewModel.preInstallTrackFile$lambda$5(action, this, id, file, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
            }
        });
    }

    public final void setTrackFilePath(@Nullable String str) {
        this.trackFilePath = str;
    }

    @Nullable
    public final Object uploadTrackLibs(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Bitmap bitmap, int i2, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Logger.i(TAG, "uploadTrackLibs  strategyId:" + i + "  filePath:" + str + "  routeName:" + str2 + "   routeType:{" + i2 + "}  routeStyle:" + num);
        String fileMD5 = MD5Util.getFileMD5(new File(str));
        if (fileMD5 == null) {
            return Unit.INSTANCE;
        }
        String strSubstring = str.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        Object objCollect = FlowKt.flow(new RouteBaseViewModel$uploadTrackLibs$$inlined$transform$2(FlowKt.flow(new RouteBaseViewModel$uploadTrackLibs$$inlined$transform$1(FlowKt.flow(new C30862(seconds, fileMD5, i2, function2, null)), null, function2, str, "")), null, "success", "", bitmap)).collect(new AnonymousClass5(seconds, fileMD5, i, function2, str2, strSubstring, str3, str5, num, str4), continuation);
        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
