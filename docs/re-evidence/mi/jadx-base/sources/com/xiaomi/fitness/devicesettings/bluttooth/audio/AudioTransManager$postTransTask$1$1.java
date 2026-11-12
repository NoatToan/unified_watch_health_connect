package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequestExtKt;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AudioTransManager$postTransTask$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $format;
    final /* synthetic */ GetUploadUrl $getUploadUrl;
    final /* synthetic */ AudioRecordEntity $item;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ AudioTransManager this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1$1", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $item;
        int label;
        final /* synthetic */ AudioTransManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AudioTransManager audioTransManager, AudioRecordEntity audioRecordEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = audioTransManager;
            this.$item = audioRecordEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$item, continuation);
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
                function4.invoke(Boxing.boxInt(3), Boxing.boxLong(this.$item.getTimestamp()), null, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1$2", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $item;
        int label;
        final /* synthetic */ AudioTransManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AudioTransManager audioTransManager, AudioRecordEntity audioRecordEntity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = audioTransManager;
            this.$item = audioRecordEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$item, continuation);
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
                function4.invoke(Boxing.boxInt(3), Boxing.boxLong(this.$item.getTimestamp()), null, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$postTransTask$1$1$5", f = "AudioTransManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AudioRecordEntity $item;
        int label;
        final /* synthetic */ AudioTransManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AudioTransManager audioTransManager, AudioRecordEntity audioRecordEntity, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = audioTransManager;
            this.$item = audioRecordEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$item, continuation);
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
                function4.invoke(Boxing.boxInt(3), Boxing.boxLong(this.$item.getTimestamp()), null, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTransManager$postTransTask$1$1(AudioTransManager audioTransManager, AudioRecordEntity audioRecordEntity, String str, GetUploadUrl getUploadUrl, String str2, Continuation<? super AudioTransManager$postTransTask$1$1> continuation) {
        super(2, continuation);
        this.this$0 = audioTransManager;
        this.$item = audioRecordEntity;
        this.$format = str;
        this.$getUploadUrl = getUploadUrl;
        this.$name = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(String str, AudioTransManager audioTransManager, AudioRecordEntity audioRecordEntity, AsrResult asrResult) {
        Logger.i("AudioTransManager", "commitTransTask result:" + asrResult + ",name=" + str);
        if (str == null) {
            return Unit.INSTANCE;
        }
        Function4 function4 = audioTransManager.mCallBack;
        if (function4 != null) {
            function4.invoke(2, Long.valueOf(audioRecordEntity.getTimestamp()), str, null);
        }
        if (!audioTransManager.downLoadMap.containsValue(str) && audioTransManager.canAddData()) {
            audioTransManager.downLoadMap.put(Long.valueOf(audioRecordEntity.getTimestamp()), str);
            Logger.i("AudioTransManager", "downLoadMap put key:" + audioRecordEntity.getTimestamp() + ",name=" + str);
        }
        if (!audioTransManager.isHandlerStarted) {
            audioTransManager.isHandlerStarted = true;
            audioTransManager.getMHandler().postDelayed(audioTransManager.mRunnable, 5000L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AudioTransManager audioTransManager, AudioRecordEntity audioRecordEntity, ApiException apiException) {
        Logger.e("AudioTransManager", "commitTransTask Exception:" + apiException);
        Function4 function4 = audioTransManager.mCallBack;
        if (function4 != null) {
            function4.invoke(3, Long.valueOf(audioRecordEntity.getTimestamp()), null, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioTransManager$postTransTask$1$1(this.this$0, this.$item, this.$format, this.$getUploadUrl, this.$name, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        byte[] audioFile = this.this$0.readAudioFile(this.$item.getDid() + "/" + UtilsKt.simpleRecordFileRawName(this.$item.getTitle()) + "." + this.$format);
        if (audioFile == null || audioFile.length == 0) {
            AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, this.$item, null), 1, null);
            Logger.i("AudioTransManager", "audio invalid");
            return Unit.INSTANCE;
        }
        String secretKey = this.$getUploadUrl.getSecretKey();
        String strEncryptUrlSafe = this.this$0.encryptUrlSafe(audioFile, secretKey);
        if (strEncryptUrlSafe == null || strEncryptUrlSafe.length() == 0) {
            AnyExtKt.main$default(null, new AnonymousClass2(this.this$0, this.$item, null), 1, null);
            Logger.i("AudioTransManager", "audio eccrypt failed");
            return Unit.INSTANCE;
        }
        if (this.this$0.uploadFile(this.$getUploadUrl.getUrl(), this.$getUploadUrl.getMethod(), strEncryptUrlSafe)) {
            DeviceSettingsRequest deviceSettingsRequest = DeviceSettingsRequestExtKt.getDeviceSettingsRequest();
            final String str = this.$name;
            final AudioTransManager audioTransManager = this.this$0;
            final AudioRecordEntity audioRecordEntity = this.$item;
            Function1<? super AsrResult, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AudioTransManager$postTransTask$1$1.invokeSuspend$lambda$0(str, audioTransManager, audioRecordEntity, (AsrResult) obj2);
                }
            };
            final AudioTransManager audioTransManager2 = this.this$0;
            final AudioRecordEntity audioRecordEntity2 = this.$item;
            deviceSettingsRequest.commitTransTask(str, secretKey, function1, new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AudioTransManager$postTransTask$1$1.invokeSuspend$lambda$1(audioTransManager2, audioRecordEntity2, (ApiException) obj2);
                }
            });
        } else {
            AnyExtKt.main$default(null, new AnonymousClass5(this.this$0, this.$item, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioTransManager$postTransTask$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
