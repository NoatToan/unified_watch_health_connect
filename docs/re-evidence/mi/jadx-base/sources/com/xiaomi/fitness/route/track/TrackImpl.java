package com.xiaomi.fitness.route.track;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.track.push.TrackPushBleV1Impl;
import com.xiaomi.fitness.route.track.push.TrackPushCallback;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivityKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.ps9;
import defpackage.x0j;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b%\u0010 J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0019\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00170\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/route/track/TrackImpl;", "Lcom/xiaomi/fitness/route/export/api/TrackApi;", "", "Lps9;", "getTracksOnDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getTracksOnDeviceIds", "ids", "", "delTracksOnDevice", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", MediaStoreUtil.MediaInfo.SIZE, "Ljava/io/File;", "file", "name", "distance", "preInstallTrackOnDevice", "(Ljava/lang/String;ILjava/io/File;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "segmentLength", "Lkotlin/Function3;", "", "", "action", "installTrackOnDevice", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "showTrackErrorToast", "(I)V", "showTrackServerErrorToast", "startTrackLibPage", "()V", "routeListNotify", "Lcom/xiaomi/fitness/route/track/push/TrackPushBleV1Impl;", "trackPushController", "Lcom/xiaomi/fitness/route/track/push/TrackPushBleV1Impl;", "<init>", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrackImpl implements TrackApi {

    @NotNull
    public static final String TAG = "TrackImpl";

    @NotNull
    private final TrackPushBleV1Impl trackPushController = new TrackPushBleV1Impl();

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.TrackImpl$delTracksOnDevice$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.TrackImpl$delTracksOnDevice$2", f = "TrackImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$delTracksOnDevice$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,166:1\n314#2,11:167\n*S KotlinDebug\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$delTracksOnDevice$2\n*L\n66#1:167,11\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ String[] $ids;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String[] strArr, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ids = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackImpl.this.new AnonymousClass2(this.$ids, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackImpl trackImpl = TrackImpl.this;
                String[] strArr = this.$ids;
                this.L$0 = trackImpl;
                this.L$1 = strArr;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                trackImpl.trackPushController.deleteTrackOnDevice(strArr, new Function3<Boolean, Integer, Integer, Unit>() { // from class: com.xiaomi.fitness.route.track.TrackImpl$delTracksOnDevice$2$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, Integer num2) {
                        invoke(bool.booleanValue(), num.intValue(), num2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, int i2, Integer num) {
                        int iIntValue = num != null ? num.intValue() : 255;
                        Logger.i(TrackImpl.TAG, "delTracksOnDevices is: " + iIntValue);
                        if (cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                            return;
                        }
                        CancellableContinuation<Integer> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m886constructorimpl(Integer.valueOf(iIntValue)));
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.TrackImpl$getTracksOnDevice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lps9;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlin/Array;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.TrackImpl$getTracksOnDevice$2", f = "TrackImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$getTracksOnDevice$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,166:1\n314#2,11:167\n*S KotlinDebug\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$getTracksOnDevice$2\n*L\n36#1:167,11\n*E\n"})
    public static final class C28892 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ps9[]>, Object> {
        Object L$0;
        int label;

        public C28892(Continuation<? super C28892> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackImpl.this.new C28892(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackImpl trackImpl = TrackImpl.this;
                this.L$0 = trackImpl;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                trackImpl.trackPushController.getTrackOnDevice(new Function3<Boolean, Integer, ps9[], Unit>() { // from class: com.xiaomi.fitness.route.track.TrackImpl$getTracksOnDevice$2$1$1
                    /* JADX WARN: Code duplicated, block: B:13:0x0012  */
                    public final void invoke(boolean z, int i2, ps9[] ps9VarArr) {
                        ps9[] ps9VarArr2;
                        if (ps9VarArr == null) {
                            ps9VarArr2 = new ps9[0];
                        } else {
                            ps9VarArr2 = (ps9VarArr.length == 0) ^ true ? ps9VarArr : null;
                            if (ps9VarArr2 == null) {
                                ps9VarArr2 = new ps9[0];
                            }
                        }
                        Logger.i(TrackImpl.TAG, "getTracksOnDevice routeIds is: " + ps9VarArr);
                        if (cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                            return;
                        }
                        cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(ps9VarArr2));
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, ps9[] ps9VarArr) {
                        invoke(bool.booleanValue(), num.intValue(), ps9VarArr);
                        return Unit.INSTANCE;
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ps9[]> continuation) {
            return ((C28892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.TrackImpl$getTracksOnDeviceIds$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.TrackImpl$getTracksOnDeviceIds$2", f = "TrackImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$getTracksOnDeviceIds$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,166:1\n314#2,11:167\n*S KotlinDebug\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$getTracksOnDeviceIds$2\n*L\n48#1:167,11\n*E\n"})
    public static final class C28902 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String[]>, Object> {
        Object L$0;
        int label;

        public C28902(Continuation<? super C28902> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackImpl.this.new C28902(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackImpl trackImpl = TrackImpl.this;
                this.L$0 = trackImpl;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                trackImpl.trackPushController.getTrackOnDevice(new Function3<Boolean, Integer, ps9[], Unit>() { // from class: com.xiaomi.fitness.route.track.TrackImpl$getTracksOnDeviceIds$2$1$1
                    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
                    public final void invoke(boolean z, int i2, ps9[] ps9VarArr) {
                        String[] strArr;
                        String str;
                        if (ps9VarArr == null) {
                            strArr = new String[0];
                        } else if (!(ps9VarArr.length == 0)) {
                            ArrayList<ps9> arrayList = new ArrayList();
                            for (ps9 ps9Var : ps9VarArr) {
                                if (ps9Var != null) {
                                    String id = ps9Var.c;
                                    Intrinsics.checkNotNullExpressionValue(id, "id");
                                    if (id.length() > 0) {
                                        arrayList.add(ps9Var);
                                    }
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (ps9 ps9Var2 : arrayList) {
                                if (ps9Var2 == null || (str = ps9Var2.c) == null) {
                                    str = "";
                                }
                                arrayList2.add(str);
                            }
                            strArr = (String[]) arrayList2.toArray(new String[0]);
                        } else {
                            strArr = new String[0];
                        }
                        Logger.i(TrackImpl.TAG, "getTracksOnDevice routeIds is: " + strArr);
                        if (cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                            return;
                        }
                        cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(strArr));
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, ps9[] ps9VarArr) {
                        invoke(bool.booleanValue(), num.intValue(), ps9VarArr);
                        return Unit.INSTANCE;
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String[]> continuation) {
            return ((C28902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.TrackImpl$installTrackOnDevice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.TrackImpl$installTrackOnDevice$2", f = "TrackImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$installTrackOnDevice$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,166:1\n314#2,11:167\n*S KotlinDebug\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$installTrackOnDevice$2\n*L\n108#1:167,11\n*E\n"})
    public static final class C28912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $action;
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ Integer $segmentLength;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28912(File file, String str, Integer num, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Continuation<? super C28912> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$id = str;
            this.$segmentLength = num;
            this.$action = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackImpl.this.new C28912(this.$file, this.$id, this.$segmentLength, this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackImpl trackImpl = TrackImpl.this;
                File file = this.$file;
                String str = this.$id;
                Integer num = this.$segmentLength;
                final Function3<Boolean, Integer, Integer, Unit> function3 = this.$action;
                this.L$0 = trackImpl;
                this.L$1 = file;
                this.L$2 = str;
                this.L$3 = num;
                this.L$4 = function3;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                TrackPushBleV1Impl trackPushBleV1Impl = trackImpl.trackPushController;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                trackPushBleV1Impl.doInstall(absolutePath, str, num, new TrackPushCallback() { // from class: com.xiaomi.fitness.route.track.TrackImpl$installTrackOnDevice$2$1$1
                    @Override // com.xiaomi.fitness.route.track.push.TrackPushCallback
                    public void onFinish(boolean success, int code) {
                        Logger.i(TrackImpl.TAG, "doInstallTrack onFinish,success: " + success + "," + code);
                        if (success) {
                            function3.invoke(Boolean.TRUE, 0, 100);
                        } else {
                            function3.invoke(Boolean.FALSE, Integer.valueOf(code), 0);
                        }
                        if (cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                            return;
                        }
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m886constructorimpl(Boolean.valueOf(success)));
                    }

                    @Override // com.xiaomi.fitness.route.track.push.TrackPushCallback
                    public void onProgress(int progress) {
                        Logger.i(TrackImpl.TAG, "doInstallTrack onSend: " + progress);
                        function3.invoke(Boolean.TRUE, 0, Integer.valueOf(Math.min(99, progress)));
                    }

                    @Override // com.xiaomi.fitness.route.track.push.TrackPushCallback
                    public void onStart() {
                        Logger.i(TrackImpl.TAG, "doInstallTrack start");
                        function3.invoke(Boolean.TRUE, 0, 0);
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C28912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.TrackImpl$preInstallTrackOnDevice$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.TrackImpl$preInstallTrackOnDevice$2", f = "TrackImpl.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$preInstallTrackOnDevice$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,166:1\n314#2,11:167\n*S KotlinDebug\n*F\n+ 1 TrackImpl.kt\ncom/xiaomi/fitness/route/track/TrackImpl$preInstallTrackOnDevice$2\n*L\n84#1:167,11\n*E\n"})
    public static final class C28922 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ int $distance;
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ String $name;
        final /* synthetic */ int $size;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28922(String str, int i, File file, String str2, int i2, Continuation<? super C28922> continuation) {
            super(2, continuation);
            this.$id = str;
            this.$size = i;
            this.$file = file;
            this.$name = str2;
            this.$distance = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackImpl.this.new C28922(this.$id, this.$size, this.$file, this.$name, this.$distance, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrackImpl trackImpl = TrackImpl.this;
                final String str = this.$id;
                int i2 = this.$size;
                File file = this.$file;
                String str2 = this.$name;
                int i3 = this.$distance;
                this.L$0 = trackImpl;
                this.L$1 = str;
                this.L$2 = file;
                this.L$3 = str2;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                TrackPushBleV1Impl trackPushBleV1Impl = trackImpl.trackPushController;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                trackPushBleV1Impl.preInstall(str, i2, absolutePath, str2, i3, new Function3<Boolean, Integer, Integer, Unit>() { // from class: com.xiaomi.fitness.route.track.TrackImpl$preInstallTrackOnDevice$2$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, Integer num2) {
                        invoke(bool.booleanValue(), num.intValue(), num2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z, int i4, Integer num) {
                        if (num != null) {
                            i4 = num.intValue();
                        }
                        Logger.i(TrackImpl.TAG, "preInstallTrackOnDevice is: " + i4);
                        if (cancellableContinuationImpl.isCancelled() || cancellableContinuationImpl.isCompleted()) {
                            return;
                        }
                        FitnessLogUtils.d("TrackImpl2", ">>>>>> 3. end , pre:" + str + " , status:" + i4);
                        CancellableContinuation<Integer> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m886constructorimpl(Integer.valueOf(i4)));
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
            return ((C28922) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    @Nullable
    public Object delTracksOnDevice(@NotNull String[] strArr, @NotNull Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(strArr, null), continuation);
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    @Nullable
    public Object getTracksOnDevice(@NotNull Continuation<? super ps9[]> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C28892(null), continuation);
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    @Nullable
    public Object getTracksOnDeviceIds(@NotNull Continuation<? super String[]> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C28902(null), continuation);
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    @Nullable
    public Object installTrackOnDevice(@NotNull String str, @NotNull File file, @Nullable Integer num, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C28912(file, str, num, function3, null), continuation);
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    @Nullable
    public Object preInstallTrackOnDevice(@NotNull String str, int i, @NotNull File file, @NotNull String str2, int i2, @NotNull Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C28922(str, i, file, str2, i2, null), continuation);
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    public void routeListNotify() {
        TrackDataManager.INSTANCE.notifyRouteList();
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    public void showTrackErrorToast(int code) {
        if (code == 1) {
            ToastUtil.INSTANCE.showToast(x0j.common_hint_device_busy);
            return;
        }
        if (code == 2) {
            ToastUtil.INSTANCE.showToast(x0j.f);
            return;
        }
        if (code == 3) {
            ToastUtil.INSTANCE.showToast(x0j.e);
            return;
        }
        if (code == 4) {
            ToastUtil.INSTANCE.showToast(x0j.common_hint_battery_low);
            return;
        }
        if (code == 6) {
            ToastUtil.INSTANCE.showToast(x0j.h);
        } else if (code != 7) {
            ToastUtil.INSTANCE.showToast(x0j.common_save_fail);
        } else {
            ToastUtil.INSTANCE.showToast(x0j.g);
        }
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    public void showTrackServerErrorToast(int code) {
        if (code == -1) {
            ToastUtil.INSTANCE.showToast(x0j.f);
        } else {
            ToastUtil.INSTANCE.showToast(x0j.common_save_fail);
        }
    }

    @Override // com.xiaomi.fitness.route.export.api.TrackApi
    public void startTrackLibPage() {
        MyTrackLibraryActivityKt.startTrackLibraryActivity();
    }
}
