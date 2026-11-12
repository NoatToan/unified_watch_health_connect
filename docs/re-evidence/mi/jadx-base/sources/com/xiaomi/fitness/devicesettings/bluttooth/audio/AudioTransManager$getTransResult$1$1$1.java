package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1", f = "AudioTransManager.kt", i = {0}, l = {199, 222}, m = "invokeSuspend", n = {"resultTrans"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nAudioTransManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTransManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager$getTransResult$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1863#2,2:355\n*S KotlinDebug\n*F\n+ 1 AudioTransManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager$getTransResult$1$1$1\n*L\n216#1:355,2\n*E\n"})
public final class AudioTransManager$getTransResult$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $keyTime;
    final /* synthetic */ Ref.ObjectRef<String> $name;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AudioTransManager this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1$1", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $name;
        int label;
        final /* synthetic */ AudioTransManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AudioTransManager audioTransManager, Ref.ObjectRef<String> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = audioTransManager;
            this.$name = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$name, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.removeObjNameList.contains(this.$name.element)) {
                this.this$0.removeObjNameList.add(this.$name.element);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1$2", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $keyTime;
        final /* synthetic */ Ref.ObjectRef<String> $name;
        final /* synthetic */ TransResult $resultTrans;
        int label;
        final /* synthetic */ AudioTransManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AudioTransManager audioTransManager, Ref.LongRef longRef, Ref.ObjectRef<String> objectRef, TransResult transResult, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = audioTransManager;
            this.$keyTime = longRef;
            this.$name = objectRef;
            this.$resultTrans = transResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$keyTime, this.$name, this.$resultTrans, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function4 function4 = this.this$0.mCallBack;
            if (function4 != null) {
                function4.invoke(Boxing.boxInt(1), Boxing.boxLong(this.$keyTime.element), this.$name.element, this.$resultTrans.getSegments());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$getTransResult$1$1$1$3", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $keyTime;
        int label;
        final /* synthetic */ AudioTransManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AudioTransManager audioTransManager, Ref.LongRef longRef, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = audioTransManager;
            this.$keyTime = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$keyTime, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function4 function4 = this.this$0.mCallBack;
            if (function4 != null) {
                function4.invoke(Boxing.boxInt(3), Boxing.boxLong(this.$keyTime.element), null, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTransManager$getTransResult$1$1$1(AudioTransManager audioTransManager, String str, Ref.LongRef longRef, Ref.ObjectRef<String> objectRef, Continuation<? super AudioTransManager$getTransResult$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = audioTransManager;
        this.$url = str;
        this.$keyTime = longRef;
        this.$name = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioTransManager$getTransResult$1$1$1(this.this$0, this.$url, this.$keyTime, this.$name, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransResult transResult;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                transResult = (TransResult) this.L$0;
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
        String strDownLoadUrl = this.this$0.downLoadUrl(this.$url);
        Logger.i("AudioTransManager", "getTransResult result:" + strDownLoadUrl);
        if (strDownLoadUrl == null) {
            return Unit.INSTANCE;
        }
        AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, this.$name, null), 1, null);
        try {
            transResult = (TransResult) new Gson().fromJson(strDownLoadUrl, TransResult.class);
        } catch (Exception e) {
            Logger.e("AudioTransManager", "TransResult gson Exception:" + e);
            transResult = null;
        }
        AudioRecordDao audioRecordDao = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
        long j = this.$keyTime.element;
        this.L$0 = transResult;
        this.label = 1;
        obj = audioRecordDao.get(j, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        TransResult transResult2 = transResult;
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) obj;
        if (transResult2 == null || transResult2.getCode() != 0) {
            if (audioRecordEntity != null) {
                audioRecordEntity.setStatus(3);
            }
            AnyExtKt.main$default(null, new AnonymousClass3(this.this$0, this.$keyTime, null), 1, null);
        } else {
            if (audioRecordEntity != null) {
                audioRecordEntity.setStatus(1);
            }
            if (audioRecordEntity != null) {
                audioRecordEntity.setContentList(transResult2.getSegments());
            }
            Logger.i("AudioTransManager", "update db contentList " + (audioRecordEntity != null ? audioRecordEntity.getContentList() : null));
            AnyExtKt.main$default(null, new AnonymousClass2(this.this$0, this.$keyTime, this.$name, transResult2, null), 1, null);
        }
        if (audioRecordEntity != null) {
            Logger.i("AudioTransManager", "getTransResult success update db " + audioRecordEntity);
            HashMap map = new HashMap();
            List<AsrResultItem> contentList = audioRecordEntity.getContentList();
            if (contentList != null) {
                for (AsrResultItem asrResultItem : contentList) {
                    if (!map.containsKey(Boxing.boxInt(asrResultItem.getSpeakerId()))) {
                        map.put(Boxing.boxInt(asrResultItem.getSpeakerId()), "说话人" + (map.size() + 1));
                    }
                    Object obj2 = map.get(Boxing.boxInt(asrResultItem.getSpeakerId()));
                    Intrinsics.checkNotNull(obj2);
                    asrResultItem.setUserName((String) obj2);
                }
            }
            AudioRecordDao audioRecordDao2 = AudioRecordDataBase.INSTANCE.getInstance().audioRecordDao();
            this.L$0 = null;
            this.label = 2;
            if (audioRecordDao2.update(audioRecordEntity, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioTransManager$getTransResult$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
