package com.xiaomi.fitness.milink.circulate;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.milink.bean.ExtraAudioData;
import com.xiaomi.fitness.milink.util.AudioServiceControllerExtKt;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.yo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J.\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/milink/circulate/SoundDeviceController;", "Lcom/xiaomi/fitness/milink/circulate/AudioDeviceController;", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "<init>", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "onServiceFound", "", "serviceInfo", "Lcom/miui/circulate/api/service/CirculateServiceInfo;", "onSearchConnect", "", "setVolume", "volume", "", "getVolume", "onVolumeChange", "onPlayStateChange", "state", "handleAudioControl", "cmd", "intValue", "strValue", "", "isCirculate", "(IILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TAG", "getTAG", "()Ljava/lang/String;", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SoundDeviceController extends AudioDeviceController {

    /* JADX INFO: renamed from: com.xiaomi.fitness.milink.circulate.SoundDeviceController$handleAudioControl$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.milink.circulate.SoundDeviceController", f = "SoundDeviceController.kt", i = {0, 0, 0, 0, 0}, l = {118, 120}, m = "handleAudioControl", n = {"this", "strValue", "cmd", "intValue", "isCirculate"}, s = {"L$0", "L$1", "I$0", "I$1", "Z$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
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
            return SoundDeviceController.this.handleAudioControl(0, 0, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.milink.circulate.SoundDeviceController$onServiceFound$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.milink.circulate.SoundDeviceController$onServiceFound$1", f = "SoundDeviceController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CirculateServiceInfo $serviceInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26171(CirculateServiceInfo circulateServiceInfo, Continuation<? super C26171> continuation) {
            super(2, continuation);
            this.$serviceInfo = circulateServiceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SoundDeviceController.this.new C26171(this.$serviceInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
            if (milinkHelper.isMiHealthSupportDevice(SoundDeviceController.this.getDeviceInfo())) {
                AudioDeviceController.updateAllInfo$default(SoundDeviceController.this, this.$serviceInfo, false, 2, null);
                return Unit.INSTANCE;
            }
            Logger.i(SoundDeviceController.this.getTAG(), "cannot get " + SoundDeviceController.this.getDeviceInfo().c + " mediaInfo, control by others");
            Object mLock = SoundDeviceController.this.getMLock();
            SoundDeviceController soundDeviceController = SoundDeviceController.this;
            synchronized (mLock) {
                milinkHelper.updateCirculateDeviceWrapperList(soundDeviceController);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundDeviceController(@NotNull CirculateDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController, com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @NotNull
    public String getTAG() {
        return "MilinkHelper_Sound";
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController
    public int getVolume() {
        return AudioServiceControllerExtKt.getLatestVolume(MilinkHelper.INSTANCE.getAudioServiceController(), getDeviceInfo());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @Nullable
    public Object handleAudioControl(int i, int i2, @NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        SoundDeviceController soundDeviceController;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        if (i4 != 0) {
            if (i4 == 1) {
                z = anonymousClass1.Z$0;
                i2 = anonymousClass1.I$1;
                i = anonymousClass1.I$0;
                str = (String) anonymousClass1.L$1;
                soundDeviceController = (SoundDeviceController) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        anonymousClass1.I$0 = i;
        anonymousClass1.I$1 = i2;
        anonymousClass1.Z$0 = z;
        anonymousClass1.label = 1;
        if (super.handleAudioControl(i, i2, str, z, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        soundDeviceController = this;
        int i5 = i;
        int i6 = i2;
        String str2 = str;
        if (z && i5 != 6 && i5 != 3) {
            PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
            if (localDeviceController != null) {
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (localDeviceController.handleAudioControl(i5, i6, str2, true, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i5 == 0) {
            yo1 audioServiceController = MilinkHelper.INSTANCE.getAudioServiceController();
            if (audioServiceController != null) {
                audioServiceController.e(CollectionsKt__CollectionsKt.mutableListOf(soundDeviceController.getDeviceInfo()));
            }
        } else if (i5 == 1) {
            yo1 audioServiceController2 = MilinkHelper.INSTANCE.getAudioServiceController();
            if (audioServiceController2 != null) {
                audioServiceController2.d(CollectionsKt__CollectionsKt.mutableListOf(soundDeviceController.getDeviceInfo()));
            }
        } else if (i5 == 2) {
            yo1 audioServiceController3 = MilinkHelper.INSTANCE.getAudioServiceController();
            if (audioServiceController3 != null) {
                audioServiceController3.u(CollectionsKt__CollectionsKt.mutableListOf(soundDeviceController.getDeviceInfo()), i6 * 1000);
            }
        } else if (i5 == 3) {
            soundDeviceController.setVolume(i6);
        } else if (i5 == 4) {
            yo1 audioServiceController4 = MilinkHelper.INSTANCE.getAudioServiceController();
            if (audioServiceController4 != null) {
                audioServiceController4.s(CollectionsKt__CollectionsKt.mutableListOf(soundDeviceController.getDeviceInfo()));
            }
            soundDeviceController.setChangeMediaEventTime(System.currentTimeMillis());
        } else if (i5 == 5) {
            yo1 audioServiceController5 = MilinkHelper.INSTANCE.getAudioServiceController();
            if (audioServiceController5 != null) {
                audioServiceController5.p(CollectionsKt__CollectionsKt.mutableListOf(soundDeviceController.getDeviceInfo()));
            }
            soundDeviceController.setChangeMediaEventTime(System.currentTimeMillis());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onPlayStateChange(int state) {
        ExtraAudioData extraAudioData;
        super.onPlayStateChange(state);
        MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
        boolean zIsCirculateDevice = milinkHelper.isCirculateDevice(getDeviceInfo());
        Logger.i(getTAG(), "onPlayStateChange so get position: " + zIsCirculateDevice);
        if (!zIsCirculateDevice) {
            synchronized (getMLock()) {
                setPlayState(state);
                Logger.i(getTAG(), "onPlayStateChange, device: " + getDeviceInfo().c + ", playState " + state);
                yo1 audioServiceController = milinkHelper.getAudioServiceController();
                if (audioServiceController != null) {
                    AudioServiceControllerExtKt.getLatestPosition(audioServiceController, getDeviceInfo());
                    Unit unit = Unit.INSTANCE;
                }
            }
            return;
        }
        synchronized (getMLock()) {
            try {
                setPlayState(state);
                Logger.i(getTAG(), "onPlayStateChange, in circulate, update local playState " + getPlayState());
                if (getExtraAudioData() == null) {
                    setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                }
                ExtraAudioData extraAudioData2 = getExtraAudioData();
                if (extraAudioData2 != null) {
                    PhoneDeviceController localDeviceController = milinkHelper.getLocalDeviceController();
                    extraAudioData2.setPosition((localDeviceController == null || (extraAudioData = localDeviceController.getExtraAudioData()) == null) ? 0L : extraAudioData.getPosition());
                }
                milinkHelper.updateCirculateDeviceWrapperList(this);
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public boolean onSearchConnect() {
        for (CirculateServiceInfo circulateServiceInfo : getDeviceInfo().i) {
            if (circulateServiceInfo.c == 65536 && circulateServiceInfo.e()) {
                BaseDeviceController.onConnect$default(this, null, 1, null);
                return true;
            }
        }
        return super.onSearchConnect();
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onServiceFound(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        super.onServiceFound(serviceInfo);
        Logger.i(getTAG(), "onServiceFound");
        if (serviceInfo.c == 65536) {
            AnyExtKt.io$default(null, new C26171(serviceInfo, null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.AudioDeviceController
    public void onVolumeChange(int volume) {
        MediaController currentMediaController;
        PlaybackState playbackState;
        super.onVolumeChange(volume);
        MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
        boolean zIsCirculateDevice = milinkHelper.isCirculateDevice(getDeviceInfo());
        synchronized (getMLock()) {
            try {
                if (zIsCirculateDevice) {
                    if (getExtraAudioData() == null) {
                        setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                    }
                    ExtraAudioData extraAudioData = getExtraAudioData();
                    if (extraAudioData != null) {
                        extraAudioData.setVolume(volume);
                    }
                    ExtraAudioData extraAudioData2 = getExtraAudioData();
                    if (extraAudioData2 != null) {
                        PhoneDeviceController localDeviceController = milinkHelper.getLocalDeviceController();
                        extraAudioData2.setPosition((localDeviceController == null || (currentMediaController = localDeviceController.getCurrentMediaController()) == null || (playbackState = currentMediaController.getPlaybackState()) == null) ? 0L : playbackState.getPosition());
                    }
                    milinkHelper.updateCirculateDeviceWrapperList(this);
                } else {
                    if (getExtraAudioData() == null) {
                        setExtraAudioData(new ExtraAudioData(0, 0L, 3, null));
                    }
                    ExtraAudioData extraAudioData3 = getExtraAudioData();
                    if (extraAudioData3 != null) {
                        extraAudioData3.setVolume(volume);
                    }
                    if (getPlayState() == 2) {
                        AudioServiceControllerExtKt.getLatestPosition(milinkHelper.getAudioServiceController(), getDeviceInfo());
                    } else {
                        milinkHelper.updateCirculateDeviceWrapperList(this);
                    }
                    Logger.i(getTAG(), "onVolumeChange so get position");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void setVolume(int volume) {
        super.setVolume(volume);
        yo1 audioServiceController = MilinkHelper.INSTANCE.getAudioServiceController();
        if (audioServiceController != null) {
            audioServiceController.y(CollectionsKt__CollectionsKt.mutableListOf(getDeviceInfo()), volume);
        }
    }
}
